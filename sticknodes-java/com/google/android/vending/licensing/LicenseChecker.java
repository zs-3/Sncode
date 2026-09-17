package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class LicenseChecker implements android.content.ServiceConnection {
    private static final boolean DEBUG_LICENSE_ERROR = false;
    private static final java.lang.String KEY_FACTORY_ALGORITHM = "RSA";
    private static final java.security.SecureRandom RANDOM = null;
    private static final java.lang.String TAG = "LicenseChecker";
    private static final int TIMEOUT_MS = 10000;
    private final java.util.Set<com.google.android.vending.licensing.LicenseValidator> mChecksInProgress;
    private final android.content.Context mContext;
    private android.os.Handler mHandler;
    private final java.lang.String mPackageName;
    private final java.util.Queue<com.google.android.vending.licensing.LicenseValidator> mPendingChecks;
    private final com.google.android.vending.licensing.Policy mPolicy;
    private java.security.PublicKey mPublicKey;
    private com.google.android.vending.licensing.ILicensingService mService;
    private final java.lang.String mVersionCode;

    private class ResultListener extends com.google.android.vending.licensing.ILicenseResultListener.Stub {
        private static final int ERROR_CONTACTING_SERVER = 257;
        private static final int ERROR_INVALID_PACKAGE_NAME = 258;
        private static final int ERROR_NON_MATCHING_UID = 259;
        private java.lang.Runnable mOnTimeout;
        private final com.google.android.vending.licensing.LicenseValidator mValidator;
        final /* synthetic */ com.google.android.vending.licensing.LicenseChecker this$0;



        public ResultListener(com.google.android.vending.licensing.LicenseChecker r1, com.google.android.vending.licensing.LicenseValidator r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mValidator = r2
                com.google.android.vending.licensing.LicenseChecker$ResultListener$1 r2 = new com.google.android.vending.licensing.LicenseChecker$ResultListener$1
                r2.<init>(r0, r1)
                r0.mOnTimeout = r2
                r0.startTimeout()
                return
        }

        static /* synthetic */ com.google.android.vending.licensing.LicenseValidator access$000(com.google.android.vending.licensing.LicenseChecker.ResultListener r0) {
                com.google.android.vending.licensing.LicenseValidator r0 = r0.mValidator
                return r0
        }

        static /* synthetic */ void access$400(com.google.android.vending.licensing.LicenseChecker.ResultListener r0) {
                r0.clearTimeout()
                return
        }

        private void clearTimeout() {
                r2 = this;
                java.lang.String r0 = "LicenseChecker"
                java.lang.String r1 = "Clearing timeout."
                android.util.Log.i(r0, r1)
                com.google.android.vending.licensing.LicenseChecker r0 = r2.this$0
                android.os.Handler r0 = com.google.android.vending.licensing.LicenseChecker.access$600(r0)
                java.lang.Runnable r1 = r2.mOnTimeout
                r0.removeCallbacks(r1)
                return
        }

        private void startTimeout() {
                r4 = this;
                java.lang.String r0 = "LicenseChecker"
                java.lang.String r1 = "Start monitoring timeout."
                android.util.Log.i(r0, r1)
                com.google.android.vending.licensing.LicenseChecker r0 = r4.this$0
                android.os.Handler r0 = com.google.android.vending.licensing.LicenseChecker.access$600(r0)
                java.lang.Runnable r1 = r4.mOnTimeout
                r2 = 10000(0x2710, double:4.9407E-320)
                r0.postDelayed(r1, r2)
                return
        }

        @Override // com.google.android.vending.licensing.ILicenseResultListener
        public void verifyLicense(int r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                com.google.android.vending.licensing.LicenseChecker r0 = r2.this$0
                android.os.Handler r0 = com.google.android.vending.licensing.LicenseChecker.access$600(r0)
                com.google.android.vending.licensing.LicenseChecker$ResultListener$2 r1 = new com.google.android.vending.licensing.LicenseChecker$ResultListener$2
                r1.<init>(r2, r3, r4, r5)
                r0.post(r1)
                return
        }
    }

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            com.google.android.vending.licensing.LicenseChecker.RANDOM = r0
            return
    }

    public LicenseChecker(android.content.Context r2, com.google.android.vending.licensing.Policy r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mChecksInProgress = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.mPendingChecks = r0
            r1.mContext = r2
            r1.mPolicy = r3
            java.security.PublicKey r3 = generatePublicKey(r4)
            r1.mPublicKey = r3
            java.lang.String r3 = r2.getPackageName()
            r1.mPackageName = r3
            java.lang.String r2 = getVersionCode(r2, r3)
            r1.mVersionCode = r2
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r3 = "background thread"
            r2.<init>(r3)
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r2 = r2.getLooper()
            r3.<init>(r2)
            r1.mHandler = r3
            return
    }

    static /* synthetic */ void access$100(com.google.android.vending.licensing.LicenseChecker r0, com.google.android.vending.licensing.LicenseValidator r1) {
            r0.handleServiceConnectionError(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.android.vending.licensing.LicenseChecker r0, com.google.android.vending.licensing.LicenseValidator r1) {
            r0.finishCheck(r1)
            return
    }

    static /* synthetic */ java.util.Set access$300(com.google.android.vending.licensing.LicenseChecker r0) {
            java.util.Set<com.google.android.vending.licensing.LicenseValidator> r0 = r0.mChecksInProgress
            return r0
    }

    static /* synthetic */ java.security.PublicKey access$500(com.google.android.vending.licensing.LicenseChecker r0) {
            java.security.PublicKey r0 = r0.mPublicKey
            return r0
    }

    static /* synthetic */ android.os.Handler access$600(com.google.android.vending.licensing.LicenseChecker r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    private void cleanupService() {
            r2 = this;
            com.google.android.vending.licensing.ILicensingService r0 = r2.mService
            if (r0 == 0) goto L14
            android.content.Context r0 = r2.mContext     // Catch: java.lang.IllegalArgumentException -> La
            r0.unbindService(r2)     // Catch: java.lang.IllegalArgumentException -> La
            goto L11
        La:
            java.lang.String r0 = "LicenseChecker"
            java.lang.String r1 = "Unable to unbind from licensing service (already unbound)"
            android.util.Log.e(r0, r1)
        L11:
            r0 = 0
            r2.mService = r0
        L14:
            return
    }

    private synchronized void finishCheck(com.google.android.vending.licensing.LicenseValidator r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<com.google.android.vending.licensing.LicenseValidator> r0 = r1.mChecksInProgress     // Catch: java.lang.Throwable -> L13
            r0.remove(r2)     // Catch: java.lang.Throwable -> L13
            java.util.Set<com.google.android.vending.licensing.LicenseValidator> r2 = r1.mChecksInProgress     // Catch: java.lang.Throwable -> L13
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L11
            r1.cleanupService()     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private int generateNonce() {
            r1 = this;
            java.security.SecureRandom r0 = com.google.android.vending.licensing.LicenseChecker.RANDOM
            int r0 = r0.nextInt()
            return r0
    }

    private static java.security.PublicKey generatePublicKey(java.lang.String r3) {
            java.lang.String r0 = "LicenseChecker"
            byte[] r3 = com.google.android.vending.licensing.util.Base64.decode(r3)     // Catch: java.security.spec.InvalidKeySpecException -> L16 com.google.android.vending.licensing.util.Base64DecoderException -> L22 java.security.NoSuchAlgorithmException -> L2e
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L16 com.google.android.vending.licensing.util.Base64DecoderException -> L22 java.security.NoSuchAlgorithmException -> L2e
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.spec.InvalidKeySpecException -> L16 com.google.android.vending.licensing.util.Base64DecoderException -> L22 java.security.NoSuchAlgorithmException -> L2e
            r2.<init>(r3)     // Catch: java.security.spec.InvalidKeySpecException -> L16 com.google.android.vending.licensing.util.Base64DecoderException -> L22 java.security.NoSuchAlgorithmException -> L2e
            java.security.PublicKey r3 = r1.generatePublic(r2)     // Catch: java.security.spec.InvalidKeySpecException -> L16 com.google.android.vending.licensing.util.Base64DecoderException -> L22 java.security.NoSuchAlgorithmException -> L2e
            return r3
        L16:
            r3 = move-exception
            java.lang.String r1 = "Invalid key specification."
            android.util.Log.e(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L22:
            r3 = move-exception
            java.lang.String r1 = "Could not decode from Base64."
            android.util.Log.e(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L2e:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.String getVersionCode(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            return r1
        L10:
            java.lang.String r1 = "LicenseChecker"
            java.lang.String r2 = "Package not found. could not get version code."
            android.util.Log.e(r1, r2)
            java.lang.String r1 = ""
            return r1
    }

    private synchronized void handleServiceConnectionError(com.google.android.vending.licensing.LicenseValidator r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.vending.licensing.Policy r0 = r3.mPolicy     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r2 = 291(0x123, float:4.08E-43)
            r0.processServerResponse(r2, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.vending.licensing.Policy r0 = r3.mPolicy     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.allowAccess()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            com.google.android.vending.licensing.LicenseCheckerCallback r4 = r4.getCallback()     // Catch: java.lang.Throwable -> L22
            r4.allow(r2)     // Catch: java.lang.Throwable -> L22
            goto L20
        L19:
            com.google.android.vending.licensing.LicenseCheckerCallback r4 = r4.getCallback()     // Catch: java.lang.Throwable -> L22
            r4.dontAllow(r2)     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private void runChecks() {
            r7 = this;
            java.lang.String r0 = "LicenseChecker"
        L2:
            java.util.Queue<com.google.android.vending.licensing.LicenseValidator> r1 = r7.mPendingChecks
            java.lang.Object r1 = r1.poll()
            com.google.android.vending.licensing.LicenseValidator r1 = (com.google.android.vending.licensing.LicenseValidator) r1
            if (r1 == 0) goto L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L3d
            r2.<init>()     // Catch: android.os.RemoteException -> L3d
            java.lang.String r3 = "Calling checkLicense on service for "
            r2.append(r3)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r3 = r1.getPackageName()     // Catch: android.os.RemoteException -> L3d
            r2.append(r3)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r2 = r2.toString()     // Catch: android.os.RemoteException -> L3d
            android.util.Log.i(r0, r2)     // Catch: android.os.RemoteException -> L3d
            com.google.android.vending.licensing.ILicensingService r2 = r7.mService     // Catch: android.os.RemoteException -> L3d
            int r3 = r1.getNonce()     // Catch: android.os.RemoteException -> L3d
            long r3 = (long) r3     // Catch: android.os.RemoteException -> L3d
            java.lang.String r5 = r1.getPackageName()     // Catch: android.os.RemoteException -> L3d
            com.google.android.vending.licensing.LicenseChecker$ResultListener r6 = new com.google.android.vending.licensing.LicenseChecker$ResultListener     // Catch: android.os.RemoteException -> L3d
            r6.<init>(r7, r1)     // Catch: android.os.RemoteException -> L3d
            r2.checkLicense(r3, r5, r6)     // Catch: android.os.RemoteException -> L3d
            java.util.Set<com.google.android.vending.licensing.LicenseValidator> r2 = r7.mChecksInProgress     // Catch: android.os.RemoteException -> L3d
            r2.add(r1)     // Catch: android.os.RemoteException -> L3d
            goto L2
        L3d:
            r2 = move-exception
            java.lang.String r3 = "RemoteException in checkLicense call."
            android.util.Log.w(r0, r3, r2)
            r7.handleServiceConnectionError(r1)
            goto L2
        L47:
            return
    }

    public synchronized void checkAccess(com.google.android.vending.licensing.LicenseCheckerCallback r9) {
            r8 = this;
            r0 = 256(0x100, float:3.59E-43)
            r9.allow(r0)
            return
    }

    public synchronized void onDestroy() {
            r1 = this;
            monitor-enter(r1)
            r1.cleanupService()     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> Lf
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> Lf
            r0.quit()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            monitor-enter(r0)
            com.google.android.vending.licensing.ILicensingService r1 = com.google.android.vending.licensing.ILicensingService.Stub.asInterface(r2)     // Catch: java.lang.Throwable -> Lc
            r0.mService = r1     // Catch: java.lang.Throwable -> Lc
            r0.runChecks()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r2 = "LicenseChecker"
            java.lang.String r0 = "Service unexpectedly disconnected."
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            r1.mService = r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
