package com.google.android.gms.ads.identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class AdvertisingIdClient {
    com.google.android.gms.common.BlockingServiceConnection zza;
    com.google.android.gms.internal.ads_identifier.zzf zzb;
    boolean zzc;
    final java.lang.Object zzd;
    com.google.android.gms.ads.identifier.zzb zze;
    final long zzf;
    private final android.content.Context zzg;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    @com.google.android.gms.common.annotation.KeepForSdkWithMembers
    public static final class Info {
        private final java.lang.String zza;
        private final boolean zzb;

        @java.lang.Deprecated
        public Info(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        public java.lang.String getId() {
                r1 = this;
                java.lang.String r0 = r1.zza
                return r0
        }

        public boolean isLimitAdTrackingEnabled() {
                r1 = this;
                boolean r0 = r1.zzb
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = r4.zza
                boolean r1 = r4.zzb
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                int r2 = r2 + 7
                r3.<init>(r2)
                java.lang.String r2 = "{"
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = "}"
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                return r0
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public AdvertisingIdClient(android.content.Context r7) {
            r6 = this;
            r2 = 30000(0x7530, double:1.4822E-319)
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4, r5)
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public AdvertisingIdClient(android.content.Context r1, long r2, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r0.zzd = r5
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            if (r4 == 0) goto L16
            android.content.Context r4 = r1.getApplicationContext()
            if (r4 == 0) goto L16
            r1 = r4
        L16:
            r0.zzg = r1
            r1 = 0
            r0.zzc = r1
            r0.zzf = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context r9) throws java.io.IOException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
            com.google.android.gms.ads.identifier.AdvertisingIdClient r8 = new com.google.android.gms.ads.identifier.AdvertisingIdClient
            r2 = -1
            r4 = 1
            r5 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r4, r5)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2c
            r9 = 0
            r8.zzb(r9)     // Catch: java.lang.Throwable -> L2c
            r9 = -1
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = r8.zzd(r9)     // Catch: java.lang.Throwable -> L2c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2c
            long r4 = r2 - r0
            r2 = 1
            r3 = 0
            java.lang.String r6 = ""
            r7 = 0
            r0 = r8
            r1 = r9
            r0.zzc(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L2c
            r8.zza()
            return r9
        L2c:
            r9 = move-exception
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = -1
            java.lang.String r6 = ""
            r0 = r8
            r7 = r9
            r0.zzc(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L3a
            throw r9     // Catch: java.lang.Throwable -> L3a
        L3a:
            r9 = move-exception
            r8.zza()
            throw r9
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context r7) throws java.io.IOException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
            com.google.android.gms.ads.identifier.AdvertisingIdClient r6 = new com.google.android.gms.ads.identifier.AdvertisingIdClient
            r2 = -1
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4, r5)
            r7 = 0
            r6.zzb(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)     // Catch: java.lang.Throwable -> L74
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L74
            boolean r0 = r6.zzc     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L49
            java.lang.Object r0 = r6.zzd     // Catch: java.lang.Throwable -> L71
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.identifier.zzb r1 = r6.zze     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L3e
            boolean r1 = r1.zzb     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            r6.zzb(r7)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L71
            boolean r7 = r6.zzc     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L2d
            goto L49
        L2d:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L71
        L35:
            r7 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Throwable -> L71
        L3e:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L46
            throw r7     // Catch: java.lang.Throwable -> L46
        L46:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r7     // Catch: java.lang.Throwable -> L71
        L49:
            com.google.android.gms.common.BlockingServiceConnection r7 = r6.zza     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads_identifier.zzf r7 = r6.zzb     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads_identifier.zzf r7 = r6.zzb     // Catch: android.os.RemoteException -> L61 java.lang.Throwable -> L71
            boolean r7 = r7.zzd()     // Catch: android.os.RemoteException -> L61 java.lang.Throwable -> L71
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L71
            r6.zze()     // Catch: java.lang.Throwable -> L74
            r6.zza()
            return r7
        L61:
            r7 = move-exception
            java.lang.String r0 = "AdvertisingIdClient"
            java.lang.String r1 = "GMS remote exception "
            android.util.Log.i(r0, r1, r7)     // Catch: java.lang.Throwable -> L71
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "Remote exception"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L74
        L74:
            r7 = move-exception
            r6.zza()
            throw r7
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean r0) {
            return
    }

    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzd(int r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r4 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r4)
            monitor-enter(r3)
            boolean r4 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L3b
            java.lang.Object r4 = r3.zzd     // Catch: java.lang.Throwable -> L6c
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.ads.identifier.zzb r0 = r3.zze     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L30
            boolean r0 = r0.zzb     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            r4 = 0
            r3.zzb(r4)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L6c
            boolean r4 = r3.zzc     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L1f
            goto L3b
        L1f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            throw r4     // Catch: java.lang.Throwable -> L6c
        L27:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L30:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L6c
        L3b:
            com.google.android.gms.common.BlockingServiceConnection r4 = r3.zza     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads_identifier.zzf r4 = r3.zzb     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads_identifier.zzf r0 = r3.zzb     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L6c
            java.lang.String r0 = r0.zzc()     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads_identifier.zzf r1 = r3.zzb     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L6c
            r2 = 1
            boolean r1 = r1.zze(r2)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L6c
            r4.<init>(r0, r1)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L6c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            r3.zze()
            return r4
        L5c:
            r4 = move-exception
            java.lang.String r0 = "AdvertisingIdClient"
            java.lang.String r1 = "GMS remote exception "
            android.util.Log.i(r0, r1, r4)     // Catch: java.lang.Throwable -> L6c
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "Remote exception"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            throw r4     // Catch: java.lang.Throwable -> L6c
        L6c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r4
    }

    private final void zze() {
            r6 = this;
            java.lang.Object r0 = r6.zzd
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r6.zze     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L11
            java.util.concurrent.CountDownLatch r1 = r1.zza     // Catch: java.lang.Throwable -> L22
            r1.countDown()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.ads.identifier.zzb r1 = r6.zze     // Catch: java.lang.InterruptedException -> L11 java.lang.Throwable -> L22
            r1.join()     // Catch: java.lang.InterruptedException -> L11 java.lang.Throwable -> L22
        L11:
            long r1 = r6.zzf     // Catch: java.lang.Throwable -> L22
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L20
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch: java.lang.Throwable -> L22
            r3.<init>(r6, r1)     // Catch: java.lang.Throwable -> L22
            r6.zze = r3     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    protected final void finalize() throws java.lang.Throwable {
            r0 = this;
            r0.zza()
            super.finalize()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() throws java.io.IOException {
            r1 = this;
            r0 = -1
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r1.zzd(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void start() throws java.io.IOException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
            r1 = this;
            r0 = 1
            r1.zzb(r0)
            return
    }

    public final void zza() {
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.zzg     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            com.google.android.gms.common.BlockingServiceConnection r0 = r3.zza     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto Lf
            goto L31
        Lf:
            boolean r0 = r3.zzc     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L27
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = r3.zzg     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.BlockingServiceConnection r2 = r3.zza     // Catch: java.lang.Throwable -> L1f
            r0.unbindService(r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L27
        L1f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch: java.lang.Throwable -> L33
        L27:
            r0 = 0
            r3.zzc = r0     // Catch: java.lang.Throwable -> L33
            r0 = 0
            r3.zzb = r0     // Catch: java.lang.Throwable -> L33
            r3.zza = r0     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    @com.google.android.gms.common.util.VisibleForTesting
    protected final void zzb(boolean r6) throws java.io.IOException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
            r5 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            monitor-enter(r5)
            boolean r0 = r5.zzc     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto Ld
            r5.zza()     // Catch: java.lang.Throwable -> L8d
        Ld:
            android.content.Context r0 = r5.zzg     // Catch: java.lang.Throwable -> L8d
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L85 java.lang.Throwable -> L8d
            java.lang.String r2 = "com.android.vending"
            r3 = 0
            r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L85 java.lang.Throwable -> L8d
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch: java.lang.Throwable -> L8d
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r1.isGooglePlayServicesAvailable(r0, r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L32
            r2 = 2
            if (r1 != r2) goto L2a
            goto L32
        L2a:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "Google Play services not available"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            throw r6     // Catch: java.lang.Throwable -> L8d
        L32:
            com.google.android.gms.common.BlockingServiceConnection r1 = new com.google.android.gms.common.BlockingServiceConnection     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "com.google.android.gms.ads.identifier.service.START"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.stats.ConnectionTracker r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            boolean r0 = r3.bindService(r0, r2, r1, r4)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L76
            r5.zza = r1     // Catch: java.lang.Throwable -> L8d
            r2 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L6e
            android.os.IBinder r0 = r1.getServiceWithTimeout(r2, r0)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L6e
            com.google.android.gms.internal.ads_identifier.zzf r0 = com.google.android.gms.internal.ads_identifier.zze.zza(r0)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L6e
            r5.zzb = r0     // Catch: java.lang.Throwable -> L8d
            r5.zzc = r4     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L65
            r5.zze()     // Catch: java.lang.Throwable -> L8d
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8d
            return
        L67:
            r6 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L6e:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "Interrupted exception"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            throw r6     // Catch: java.lang.Throwable -> L8d
        L76:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "Connection failure"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            throw r6     // Catch: java.lang.Throwable -> L8d
        L7e:
            r6 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L85:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r6 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L8d
            r0 = 9
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            throw r6     // Catch: java.lang.Throwable -> L8d
        L8d:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8d
            throw r6
    }

    @com.google.android.gms.common.util.VisibleForTesting
    final boolean zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r3, boolean r4, float r5, long r6, java.lang.String r8, java.lang.Throwable r9) {
            r2 = this;
            double r4 = java.lang.Math.random()
            r0 = 0
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 > 0) goto L61
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "app_context"
            java.lang.String r8 = "1"
            r4.put(r5, r8)
            r5 = 1
            if (r3 == 0) goto L39
            boolean r0 = r3.isLimitAdTrackingEnabled()
            if (r5 == r0) goto L21
            java.lang.String r8 = "0"
        L21:
            java.lang.String r0 = "limit_ad_tracking"
            r4.put(r0, r8)
            java.lang.String r3 = r3.getId()
            if (r3 == 0) goto L39
            int r3 = r3.length()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r8 = "ad_id_size"
            r4.put(r8, r3)
        L39:
            if (r9 == 0) goto L48
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r8 = "error"
            r4.put(r8, r3)
        L48:
            java.lang.String r3 = "tag"
            java.lang.String r8 = "AdvertisingIdClient"
            r4.put(r3, r8)
            java.lang.String r3 = java.lang.Long.toString(r6)
            java.lang.String r6 = "time_spent"
            r4.put(r6, r3)
            com.google.android.gms.ads.identifier.zza r3 = new com.google.android.gms.ads.identifier.zza
            r3.<init>(r2, r4)
            r3.start()
            return r5
        L61:
            r3 = 0
            return r3
    }
}
