package com.google.android.gms.common.internal;

import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private static final com.google.android.gms.common.Feature[] zze = null;
    private volatile java.lang.String zzA;
    private volatile com.google.android.gms.common.wrappers.AttributionSourceWrapper zzB;
    private com.google.android.gms.common.ConnectionResult zzC;
    private boolean zzD;
    private volatile com.google.android.gms.common.internal.zzk zzE;
    com.google.android.gms.common.internal.zzv zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface BaseConnectionCallbacks {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @com.google.android.gms.common.annotation.KeepForSdk
        void onConnected(android.os.Bundle r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        void onConnectionSuspended(int r1);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r1);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    protected class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

        @com.google.android.gms.common.annotation.KeepForSdk
        public LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient r1) {
                r0 = this;
                r0.zza = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r3) {
                r2 = this;
                boolean r0 = r3.isSuccess()
                if (r0 == 0) goto L11
                r3 = 0
                com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
                java.util.Set r1 = r0.getScopes()
                r0.getRemoteService(r3, r1)
                return
            L11:
                com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
                if (r0 == 0) goto L22
                com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
                r0.onConnectionFailed(r3)
            L22:
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface SignOutCallbacks {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onSignOutComplete();
    }

    static {
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.internal.BaseGmsClient.zze = r0
            java.lang.String r0 = "service_esmobile"
            java.lang.String r1 = "service_googleme"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.common.internal.BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected BaseGmsClient(android.content.Context r4, android.os.Handler r5, com.google.android.gms.common.internal.GmsClientSupervisor r6, com.google.android.gms.common.GoogleApiAvailabilityLight r7, int r8, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r9, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r10) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.zzt = r1
            r1 = 1
            r3.zzv = r1
            r3.zzC = r0
            r1 = 0
            r3.zzD = r1
            r3.zzE = r0
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r1)
            r3.zzd = r2
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r1)
            r3.zzl = r4
            java.lang.String r4 = "Handler must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r4)
            r3.zzb = r5
            android.os.Looper r4 = r5.getLooper()
            r3.zzm = r4
            java.lang.String r4 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r4)
            r3.zzn = r6
            java.lang.String r4 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r4)
            r3.zzo = r7
            r3.zzy = r8
            r3.zzw = r9
            r3.zzx = r10
            r3.zzz = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected BaseGmsClient(android.content.Context r3, android.os.Looper r4, com.google.android.gms.common.internal.GmsClientSupervisor r5, com.google.android.gms.common.GoogleApiAvailabilityLight r6, int r7, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r8, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r9, java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzt = r1
            r1 = 1
            r2.zzv = r1
            r2.zzC = r0
            r1 = 0
            r2.zzD = r1
            r2.zzE = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.zzd = r0
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zzl = r3
            java.lang.String r3 = "Looper must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r3)
            r2.zzm = r4
            java.lang.String r3 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r3)
            r2.zzn = r5
            java.lang.String r3 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r3)
            r2.zzo = r6
            com.google.android.gms.common.internal.zzb r3 = new com.google.android.gms.common.internal.zzb
            r3.<init>(r2, r4)
            r2.zzb = r3
            r2.zzy = r7
            r2.zzw = r8
            r2.zzx = r9
            r2.zzz = r10
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.ConnectionResult r0 = r0.zzC
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzb(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzw
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzc(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = r0.zzx
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.common.internal.BaseGmsClient r0) {
            java.lang.Object r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.ArrayList zzf(com.google.android.gms.common.internal.BaseGmsClient r0) {
            java.util.ArrayList r0 = r0.zzt
            return r0
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zzC = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.internal.IGmsServiceBroker r1) {
            r0.zzr = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.common.internal.BaseGmsClient r0, int r1, android.os.IInterface r2) {
            r2 = 0
            r0.zzp(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.internal.zzk r1) {
            r0.zzE = r1
            boolean r0 = r0.usesClientTelemetry()
            if (r0 == 0) goto L19
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r1.zzd
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.zza()
        L16:
            r1.zza(r0)
        L19:
            return
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.internal.BaseGmsClient r2, int r3) {
            java.lang.Object r3 = r2.zzp
            monitor-enter(r3)
            int r0 = r2.zzv     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 3
            if (r0 != r3) goto Le
            r3 = 1
            r2.zzD = r3
            r3 = 5
            goto Lf
        Le:
            r3 = 4
        Lf:
            android.os.Handler r0 = r2.zzb
            java.util.concurrent.atomic.AtomicInteger r2 = r2.zzd
            int r2 = r2.get()
            r1 = 16
            android.os.Message r2 = r0.obtainMessage(r3, r2, r1)
            r0.sendMessage(r2)
            return
        L21:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r2
    }

    static /* bridge */ /* synthetic */ boolean zzm(com.google.android.gms.common.internal.BaseGmsClient r0) {
            boolean r0 = r0.zzD
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.common.internal.BaseGmsClient r2, int r3, int r4, android.os.IInterface r5) {
            java.lang.Object r0 = r2.zzp
            monitor-enter(r0)
            int r1 = r2.zzv     // Catch: java.lang.Throwable -> L10
            if (r1 == r3) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r2 = 0
            goto Lf
        La:
            r2.zzp(r4, r5)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r2 = 1
        Lf:
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient r2) {
            boolean r0 = r2.zzD
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
    }

    private final void zzp(int r13, android.os.IInterface r14) {
            r12 = this;
            r0 = 4
            r1 = 0
            r2 = 1
            if (r13 == r0) goto L7
            r3 = 0
            goto L8
        L7:
            r3 = 1
        L8:
            if (r14 != 0) goto Lc
            r4 = 0
            goto Ld
        Lc:
            r4 = 1
        Ld:
            if (r3 != r4) goto L10
            r1 = 1
        L10:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            java.lang.Object r1 = r12.zzp
            monitor-enter(r1)
            r12.zzv = r13     // Catch: java.lang.Throwable -> L19b
            r12.zzs = r14     // Catch: java.lang.Throwable -> L19b
            r3 = 0
            if (r13 == r2) goto L173
            r2 = 2
            r4 = 3
            if (r13 == r2) goto L2f
            if (r13 == r4) goto L2f
            if (r13 == r0) goto L27
            goto L199
        L27:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch: java.lang.Throwable -> L19b
            r12.onConnectedLocked(r14)     // Catch: java.lang.Throwable -> L19b
            goto L199
        L2f:
            com.google.android.gms.common.internal.zze r9 = r12.zzu     // Catch: java.lang.Throwable -> L19b
            if (r9 == 0) goto L82
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            if (r13 == 0) goto L82
            java.lang.String r14 = "GmsClient"
            java.lang.String r0 = r13.zzb()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r13 = r13.zza()     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19b
            r2.<init>()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r5 = "Calling connect() while still connected, missing disconnect() for "
            r2.append(r5)     // Catch: java.lang.Throwable -> L19b
            r2.append(r0)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = " on "
            r2.append(r0)     // Catch: java.lang.Throwable -> L19b
            r2.append(r13)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Throwable -> L19b
            android.util.Log.e(r14, r13)     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.GmsClientSupervisor r5 = r12.zzn     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r6 = r13.zzb()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r7 = r13.zza()     // Catch: java.lang.Throwable -> L19b
            r8 = 4225(0x1081, float:5.92E-42)
            java.lang.String r10 = r12.zze()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            boolean r11 = r13.zzc()     // Catch: java.lang.Throwable -> L19b
            r5.zzc(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L19b
            java.util.concurrent.atomic.AtomicInteger r13 = r12.zzd     // Catch: java.lang.Throwable -> L19b
            r13.incrementAndGet()     // Catch: java.lang.Throwable -> L19b
        L82:
            com.google.android.gms.common.internal.zze r13 = new com.google.android.gms.common.internal.zze     // Catch: java.lang.Throwable -> L19b
            java.util.concurrent.atomic.AtomicInteger r14 = r12.zzd     // Catch: java.lang.Throwable -> L19b
            int r14 = r14.get()     // Catch: java.lang.Throwable -> L19b
            r13.<init>(r12, r14)     // Catch: java.lang.Throwable -> L19b
            r12.zzu = r13     // Catch: java.lang.Throwable -> L19b
            int r14 = r12.zzv     // Catch: java.lang.Throwable -> L19b
            if (r14 != r4) goto Lb0
            java.lang.String r14 = r12.getLocalStartServiceAction()     // Catch: java.lang.Throwable -> L19b
            if (r14 == 0) goto Lb0
            com.google.android.gms.common.internal.zzv r14 = new com.google.android.gms.common.internal.zzv     // Catch: java.lang.Throwable -> L19b
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r6 = r12.getLocalStartServiceAction()     // Catch: java.lang.Throwable -> L19b
            r7 = 1
            r8 = 4225(0x1081, float:5.92E-42)
            r9 = 0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L19b
            goto Lc5
        Lb0:
            com.google.android.gms.common.internal.zzv r14 = new com.google.android.gms.common.internal.zzv     // Catch: java.lang.Throwable -> L19b
            java.lang.String r5 = r12.getStartServicePackage()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r6 = r12.getStartServiceAction()     // Catch: java.lang.Throwable -> L19b
            r7 = 0
            r8 = 4225(0x1081, float:5.92E-42)
            boolean r9 = r12.getUseDynamicLookup()     // Catch: java.lang.Throwable -> L19b
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L19b
        Lc5:
            r12.zza = r14     // Catch: java.lang.Throwable -> L19b
            boolean r14 = r14.zzc()     // Catch: java.lang.Throwable -> L19b
            if (r14 == 0) goto Led
            int r14 = r12.getMinApkVersion()     // Catch: java.lang.Throwable -> L19b
            r0 = 17895000(0x1110e58, float:2.6642585E-38)
            if (r14 < r0) goto Ld7
            goto Led
        Ld7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r14 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r14 = r14.zzb()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r14 = r0.concat(r14)     // Catch: java.lang.Throwable -> L19b
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L19b
            throw r13     // Catch: java.lang.Throwable -> L19b
        Led:
            com.google.android.gms.common.internal.GmsClientSupervisor r14 = r12.zzn     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r0 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = r0.zzb()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r2 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r2 = r2.zza()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r4 = r12.zze()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r5 = r12.zza     // Catch: java.lang.Throwable -> L19b
            boolean r5 = r5.zzc()     // Catch: java.lang.Throwable -> L19b
            java.util.concurrent.Executor r6 = r12.getBindServiceExecutor()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzo r7 = new com.google.android.gms.common.internal.zzo     // Catch: java.lang.Throwable -> L19b
            r8 = 4225(0x1081, float:5.92E-42)
            r7.<init>(r0, r2, r8, r5)     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.ConnectionResult r13 = r14.zza(r7, r13, r4, r6)     // Catch: java.lang.Throwable -> L19b
            boolean r14 = r13.isSuccess()     // Catch: java.lang.Throwable -> L19b
            if (r14 != 0) goto L199
            java.lang.String r14 = "GmsClient"
            com.google.android.gms.common.internal.zzv r0 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = r0.zzb()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r2 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r2 = r2.zza()     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19b
            r4.<init>()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r5 = "unable to connect to service: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L19b
            r4.append(r0)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = " on "
            r4.append(r0)     // Catch: java.lang.Throwable -> L19b
            r4.append(r2)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L19b
            android.util.Log.w(r14, r0)     // Catch: java.lang.Throwable -> L19b
            int r14 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L19b
            r0 = -1
            if (r14 != r0) goto L151
            r14 = 16
            goto L155
        L151:
            int r14 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L19b
        L155:
            android.app.PendingIntent r0 = r13.getResolution()     // Catch: java.lang.Throwable -> L19b
            if (r0 == 0) goto L169
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L19b
            r3.<init>()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r0 = "pendingIntent"
            android.app.PendingIntent r13 = r13.getResolution()     // Catch: java.lang.Throwable -> L19b
            r3.putParcelable(r0, r13)     // Catch: java.lang.Throwable -> L19b
        L169:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.zzd     // Catch: java.lang.Throwable -> L19b
            int r13 = r13.get()     // Catch: java.lang.Throwable -> L19b
            r12.zzl(r14, r3, r13)     // Catch: java.lang.Throwable -> L19b
            goto L199
        L173:
            com.google.android.gms.common.internal.zze r8 = r12.zzu     // Catch: java.lang.Throwable -> L19b
            if (r8 == 0) goto L199
            com.google.android.gms.common.internal.GmsClientSupervisor r4 = r12.zzn     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r5 = r13.zzb()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            java.lang.String r6 = r13.zza()     // Catch: java.lang.Throwable -> L19b
            r7 = 4225(0x1081, float:5.92E-42)
            java.lang.String r9 = r12.zze()     // Catch: java.lang.Throwable -> L19b
            com.google.android.gms.common.internal.zzv r13 = r12.zza     // Catch: java.lang.Throwable -> L19b
            boolean r10 = r13.zzc()     // Catch: java.lang.Throwable -> L19b
            r4.zzc(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L19b
            r12.zzu = r3     // Catch: java.lang.Throwable -> L19b
        L199:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19b
            return
        L19b:
            r13 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19b
            throw r13
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void checkAvailabilityAndConnect() {
            r3 = this;
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r3.zzo
            android.content.Context r1 = r3.zzl
            int r2 = r3.getMinApkVersion()
            int r0 = r0.isGooglePlayServicesAvailable(r1, r2)
            if (r0 == 0) goto L1c
            r1 = 1
            r2 = 0
            r3.zzp(r1, r2)
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r1 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r1.<init>(r3)
            r3.triggerNotAvailable(r1, r0, r2)
            return
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r0 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r0.<init>(r3)
            r3.connect(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected final void checkConnected() {
            r2 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not connected. Call connect() and wait for onConnected() to be called."
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r2) {
            r1 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zzc = r2
            r2 = 2
            r0 = 0
            r1.zzp(r2, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract T createServiceInterface(android.os.IBinder r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public void disconnect() {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzd
            r0.incrementAndGet()
            java.util.ArrayList r0 = r4.zzt
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.zzt     // Catch: java.lang.Throwable -> L34
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L34
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1f
            java.util.ArrayList r3 = r4.zzt     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.common.internal.zzc r3 = (com.google.android.gms.common.internal.zzc) r3     // Catch: java.lang.Throwable -> L34
            r3.zzf()     // Catch: java.lang.Throwable -> L34
            int r2 = r2 + 1
            goto Lf
        L1f:
            java.util.ArrayList r1 = r4.zzt     // Catch: java.lang.Throwable -> L34
            r1.clear()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r4.zzq
            monitor-enter(r1)
            r0 = 0
            r4.zzr = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            r1 = 1
            r4.zzp(r1, r0)
            return
        L31:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r0
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void disconnect(java.lang.String r1) {
            r0 = this;
            r0.zzk = r1
            r0.disconnect()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void dump(java.lang.String r10, java.io.FileDescriptor r11, java.io.PrintWriter r12, java.lang.String[] r13) {
            r9 = this;
            java.lang.Object r11 = r9.zzp
            monitor-enter(r11)
            int r13 = r9.zzv     // Catch: java.lang.Throwable -> L16f
            android.os.IInterface r0 = r9.zzs     // Catch: java.lang.Throwable -> L16f
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L16f
            java.lang.Object r1 = r9.zzq
            monitor-enter(r1)
            com.google.android.gms.common.internal.IGmsServiceBroker r11 = r9.zzr     // Catch: java.lang.Throwable -> L16c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16c
            java.io.PrintWriter r1 = r12.append(r10)
            java.lang.String r2 = "mConnectState="
            r1.append(r2)
            r1 = 3
            r2 = 2
            r3 = 1
            if (r13 == r3) goto L44
            if (r13 == r2) goto L3e
            if (r13 == r1) goto L38
            r4 = 4
            if (r13 == r4) goto L32
            r4 = 5
            if (r13 == r4) goto L2c
            java.lang.String r13 = "UNKNOWN"
            r12.print(r13)
            goto L49
        L2c:
            java.lang.String r13 = "DISCONNECTING"
            r12.print(r13)
            goto L49
        L32:
            java.lang.String r13 = "CONNECTED"
            r12.print(r13)
            goto L49
        L38:
            java.lang.String r13 = "LOCAL_CONNECTING"
            r12.print(r13)
            goto L49
        L3e:
            java.lang.String r13 = "REMOTE_CONNECTING"
            r12.print(r13)
            goto L49
        L44:
            java.lang.String r13 = "DISCONNECTED"
            r12.print(r13)
        L49:
            java.lang.String r13 = " mService="
            r12.append(r13)
            if (r0 != 0) goto L56
            java.lang.String r13 = "null"
            r12.append(r13)
            goto L73
        L56:
            java.lang.String r13 = r9.getServiceDescriptor()
            java.io.PrintWriter r13 = r12.append(r13)
            java.lang.String r4 = "@"
            java.io.PrintWriter r13 = r13.append(r4)
            android.os.IBinder r0 = r0.asBinder()
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r13.append(r0)
        L73:
            java.lang.String r13 = " mServiceBroker="
            r12.append(r13)
            if (r11 != 0) goto L80
            java.lang.String r11 = "null"
            r12.println(r11)
            goto L95
        L80:
            java.lang.String r13 = "IGmsServiceBroker@"
            java.io.PrintWriter r13 = r12.append(r13)
            android.os.IBinder r11 = r11.asBinder()
            int r11 = java.lang.System.identityHashCode(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r13.println(r11)
        L95:
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r13 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r0 = java.util.Locale.US
            r11.<init>(r13, r0)
            long r4 = r9.zzh
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto Ld2
            java.io.PrintWriter r13 = r12.append(r10)
            java.lang.String r0 = "lastConnectedTime="
            java.io.PrintWriter r13 = r13.append(r0)
            long r4 = r9.zzh
            java.util.Date r0 = new java.util.Date
            r0.<init>(r4)
            java.lang.String r0 = r11.format(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = " "
            r8.append(r4)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r13.println(r0)
        Ld2:
            long r4 = r9.zzg
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto L12a
            java.io.PrintWriter r13 = r12.append(r10)
            java.lang.String r0 = "lastSuspendedCause="
            r13.append(r0)
            int r13 = r9.zzf
            if (r13 == r3) goto Lfd
            if (r13 == r2) goto Lf7
            if (r13 == r1) goto Lf1
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.append(r13)
            goto L102
        Lf1:
            java.lang.String r13 = "CAUSE_DEAD_OBJECT_EXCEPTION"
            r12.append(r13)
            goto L102
        Lf7:
            java.lang.String r13 = "CAUSE_NETWORK_LOST"
            r12.append(r13)
            goto L102
        Lfd:
            java.lang.String r13 = "CAUSE_SERVICE_DISCONNECTED"
            r12.append(r13)
        L102:
            java.lang.String r13 = " lastSuspendedTime="
            java.io.PrintWriter r13 = r12.append(r13)
            long r0 = r9.zzg
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r2 = r11.format(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r13.println(r0)
        L12a:
            long r0 = r9.zzj
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 <= 0) goto L16b
            java.io.PrintWriter r10 = r12.append(r10)
            java.lang.String r13 = "lastFailedStatus="
            java.io.PrintWriter r10 = r10.append(r13)
            int r13 = r9.zzi
            java.lang.String r13 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r13)
            r10.append(r13)
            java.lang.String r10 = " lastFailedTime="
            java.io.PrintWriter r10 = r12.append(r10)
            long r12 = r9.zzj
            java.util.Date r0 = new java.util.Date
            r0.<init>(r12)
            java.lang.String r11 = r11.format(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = " "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.println(r11)
        L16b:
            return
        L16c:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16c
            throw r10
        L16f:
            r10 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L16f
            throw r10
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected boolean enableLocalFallback() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.accounts.Account getAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.wrappers.AttributionSourceWrapper getAttributionSourceWrapper() {
            r1 = this;
            com.google.android.gms.common.wrappers.AttributionSourceWrapper r0 = r1.zzB
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
            r1 = this;
            com.google.android.gms.common.internal.zzk r0 = r1.zzE
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.Feature[] r0 = r0.zzb
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.util.concurrent.Executor getBindServiceExecutor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getConnectionHint() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zzl
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getEndpointPackageName() {
            r2 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Lf
            com.google.android.gms.common.internal.zzv r0 = r2.zza
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zza()
            return r0
        Lf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to connect when checking package"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getGCoreServiceId() {
            r1 = this;
            int r0 = r1.zzy
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getLastDisconnectMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzk
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.lang.String getLocalStartServiceAction() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.zzm
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMinApkVersion() {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor r21, java.util.Set<com.google.android.gms.common.api.Scope> r22) {
            r20 = this;
            r1 = r20
            r0 = r22
            android.os.Bundle r2 = r20.getGetServiceRequestExtraArgs()
            com.google.android.gms.common.internal.GetServiceRequest r15 = new com.google.android.gms.common.internal.GetServiceRequest
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 >= r4) goto L15
            java.lang.String r3 = r1.zzA
        L12:
            r17 = r3
            goto L35
        L15:
            com.google.android.gms.common.wrappers.AttributionSourceWrapper r3 = r1.zzB
            if (r3 != 0) goto L1c
            java.lang.String r3 = r1.zzA
            goto L12
        L1c:
            com.google.android.gms.common.wrappers.AttributionSourceWrapper r3 = r1.zzB
            android.content.AttributionSource r3 = r3.getAttributionSource()
            if (r3 != 0) goto L27
            java.lang.String r3 = r1.zzA
            goto L12
        L27:
            java.lang.String r4 = r3.getAttributionTag()
            if (r4 != 0) goto L30
            java.lang.String r3 = r1.zzA
            goto L12
        L30:
            java.lang.String r3 = r3.getAttributionTag()
            goto L12
        L35:
            r4 = 6
            int r5 = r1.zzy
            int r6 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r7 = 0
            r8 = 0
            com.google.android.gms.common.api.Scope[] r9 = com.google.android.gms.common.internal.GetServiceRequest.zza
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r11 = 0
            com.google.android.gms.common.Feature[] r13 = com.google.android.gms.common.internal.GetServiceRequest.zzb
            r14 = 1
            r16 = 0
            r18 = 0
            r3 = r15
            r12 = r13
            r19 = r15
            r15 = r16
            r16 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.content.Context r3 = r1.zzl
            java.lang.String r3 = r3.getPackageName()
            r4 = r19
            r4.zzf = r3
            r4.zzi = r2
            if (r0 == 0) goto L6f
            r2 = 0
            com.google.android.gms.common.api.Scope[] r2 = new com.google.android.gms.common.api.Scope[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.common.api.Scope[] r0 = (com.google.android.gms.common.api.Scope[]) r0
            r4.zzh = r0
        L6f:
            boolean r0 = r20.requiresSignIn()
            if (r0 == 0) goto L8f
            android.accounts.Account r0 = r20.getAccount()
            if (r0 != 0) goto L84
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r2 = "<<default account>>"
            java.lang.String r3 = "com.google"
            r0.<init>(r2, r3)
        L84:
            r4.zzj = r0
            if (r21 == 0) goto L9b
            android.os.IBinder r0 = r21.asBinder()
            r4.zzg = r0
            goto L9b
        L8f:
            boolean r0 = r20.requiresAccount()
            if (r0 == 0) goto L9b
            android.accounts.Account r0 = r20.getAccount()
            r4.zzj = r0
        L9b:
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            r4.zzk = r0
            com.google.android.gms.common.Feature[] r0 = r20.getApiFeatures()
            r4.zzl = r0
            boolean r0 = r20.usesClientTelemetry()
            if (r0 == 0) goto Lae
            r0 = 1
            r4.zzo = r0
        Lae:
            java.lang.Object r2 = r1.zzq     // Catch: java.lang.RuntimeException -> Ld0 android.os.RemoteException -> Ld2 java.lang.SecurityException -> Le7 android.os.DeadObjectException -> Le9
            monitor-enter(r2)     // Catch: java.lang.RuntimeException -> Ld0 android.os.RemoteException -> Ld2 java.lang.SecurityException -> Le7 android.os.DeadObjectException -> Le9
            com.google.android.gms.common.internal.IGmsServiceBroker r0 = r1.zzr     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto Lc4
            com.google.android.gms.common.internal.zzd r3 = new com.google.android.gms.common.internal.zzd     // Catch: java.lang.Throwable -> Lcd
            java.util.concurrent.atomic.AtomicInteger r5 = r1.zzd     // Catch: java.lang.Throwable -> Lcd
            int r5 = r5.get()     // Catch: java.lang.Throwable -> Lcd
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> Lcd
            r0.getService(r3, r4)     // Catch: java.lang.Throwable -> Lcd
            goto Lcb
        Lc4:
            java.lang.String r0 = "GmsClient"
            java.lang.String r3 = "mServiceBroker is null, client disconnected"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> Lcd
        Lcb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            return
        Lcd:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            throw r0     // Catch: java.lang.RuntimeException -> Ld0 android.os.RemoteException -> Ld2 java.lang.SecurityException -> Le7 android.os.DeadObjectException -> Le9
        Ld0:
            r0 = move-exception
            goto Ld3
        Ld2:
            r0 = move-exception
        Ld3:
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r2, r3, r0)
            r0 = 8
            java.util.concurrent.atomic.AtomicInteger r2 = r1.zzd
            int r2 = r2.get()
            r3 = 0
            r1.onPostInitHandler(r0, r3, r3, r2)
            return
        Le7:
            r0 = move-exception
            throw r0
        Le9:
            r0 = move-exception
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r2, r3, r0)
            r0 = 3
            r1.triggerConnectionSuspended(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final T getService() throws android.os.DeadObjectException {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> L1a
            r2 = 5
            if (r1 == r2) goto L14
            r3.checkConnected()     // Catch: java.lang.Throwable -> L1a
            android.os.IInterface r1 = r3.zzs     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "Client is connected but service is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L14:
            android.os.DeadObjectException r1 = new android.os.DeadObjectException     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder getServiceBrokerBinder() {
            r2 = this;
            java.lang.Object r0 = r2.zzq
            monitor-enter(r0)
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = r2.zzr     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            return r0
        La:
            android.os.IBinder r1 = r1.asBinder()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract java.lang.String getServiceDescriptor();

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getSignInIntent() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not a sign in API"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract java.lang.String getStartServiceAction();

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.lang.String getStartServicePackage() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms"
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
            r1 = this;
            com.google.android.gms.common.internal.zzk r0 = r1.zzE
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r0.zzd
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected boolean getUseDynamicLookup() {
            r2 = this;
            int r0 = r2.getMinApkVersion()
            r1 = 211700000(0xc9e4920, float:2.4387765E-31)
            if (r0 < r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasConnectionInfo() {
            r1 = this;
            com.google.android.gms.common.internal.zzk r0 = r1.zzE
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isConnected() {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isConnecting() {
            r4 = this;
            java.lang.Object r0 = r4.zzp
            monitor-enter(r0)
            int r1 = r4.zzv     // Catch: java.lang.Throwable -> L10
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Le
            r2 = 3
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r3 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r3
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void onConnectedLocked(T r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzh = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            int r3 = r3.getErrorCode()
            r2.zzi = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzj = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void onConnectionSuspended(int r3) {
            r2 = this;
            r2.zzf = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzg = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void onPostInitHandler(int r2, android.os.IBinder r3, android.os.Bundle r4, int r5) {
            r1 = this;
            com.google.android.gms.common.internal.zzf r0 = new com.google.android.gms.common.internal.zzf
            r0.<init>(r1, r2, r3, r4)
            android.os.Handler r2 = r1.zzb
            r3 = 1
            r4 = -1
            android.os.Message r2 = r2.obtainMessage(r3, r5, r4, r0)
            android.os.Handler r3 = r1.zzb
            r3.sendMessage(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            r1.onSignOutComplete()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean providesSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean requiresAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean requiresGooglePlayServices() {
            r1 = this;
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean requiresSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setAttributionSourceWrapper(com.google.android.gms.common.wrappers.AttributionSourceWrapper r1) {
            r0 = this;
            r0.zzB = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setAttributionTag(java.lang.String r1) {
            r0 = this;
            r0.zzA = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void triggerConnectionSuspended(int r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzd
            int r0 = r0.get()
            android.os.Handler r1 = r3.zzb
            r2 = 6
            android.os.Message r4 = r1.obtainMessage(r2, r0, r4)
            android.os.Handler r0 = r3.zzb
            r0.sendMessage(r4)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r3, int r4, android.app.PendingIntent r5) {
            r2 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zzc = r3
            java.util.concurrent.atomic.AtomicInteger r3 = r2.zzd
            int r3 = r3.get()
            android.os.Handler r0 = r2.zzb
            r1 = 3
            android.os.Message r3 = r0.obtainMessage(r1, r3, r4, r5)
            android.os.Handler r4 = r2.zzb
            r4.sendMessage(r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean usesClientTelemetry() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzz
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.zzl
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
        Le:
            return r0
    }

    protected final void zzl(int r3, android.os.Bundle r4, int r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzg r0 = new com.google.android.gms.common.internal.zzg
            r0.<init>(r2, r3, r4)
            android.os.Handler r3 = r2.zzb
            r4 = 7
            r1 = -1
            android.os.Message r3 = r3.obtainMessage(r4, r5, r1, r0)
            android.os.Handler r4 = r2.zzb
            r4.sendMessage(r3)
            return
    }
}
