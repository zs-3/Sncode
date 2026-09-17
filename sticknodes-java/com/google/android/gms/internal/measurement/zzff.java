package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzff {
    private static volatile com.google.android.gms.internal.measurement.zzff zzc;
    protected final com.google.android.gms.common.util.Clock zza;
    protected final java.util.concurrent.ExecutorService zzb;
    private final java.lang.String zzd;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zze;
    private final java.util.List zzf;
    private int zzg;
    private boolean zzh;
    private final java.lang.String zzi;
    private volatile com.google.android.gms.internal.measurement.zzcv zzj;

    protected zzff(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
            r8 = this;
            r8.<init>()
            if (r10 == 0) goto Lf
            boolean r0 = r8.zzX(r11, r12)
            if (r0 != 0) goto Lc
            goto Lf
        Lc:
            r8.zzd = r10
            goto L13
        Lf:
            java.lang.String r10 = "FA"
            r8.zzd = r10
        L13:
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.common.util.DefaultClock.getInstance()
            r8.zza = r10
            com.google.android.gms.internal.measurement.zzcq.zza()
            com.google.android.gms.internal.measurement.zzeg r7 = new com.google.android.gms.internal.measurement.zzeg
            r7.<init>(r8)
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            r1 = 1
            r2 = 1
            r3 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r0 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r10.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.unconfigurableExecutorService(r10)
            r8.zzb = r10
            com.google.android.gms.measurement.api.AppMeasurementSdk r10 = new com.google.android.gms.measurement.api.AppMeasurementSdk
            r10.<init>(r8)
            r8.zze = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r8.zzf = r10
            java.lang.String r10 = com.google.android.gms.measurement.internal.zzig.zza(r9)     // Catch: java.lang.IllegalStateException -> L6a
            java.lang.String r1 = "google_app_id"
            java.lang.String r10 = com.google.android.gms.measurement.internal.zzmg.zzc(r9, r1, r10)     // Catch: java.lang.IllegalStateException -> L6a
            if (r10 == 0) goto L6b
            boolean r10 = r8.zzT()
            if (r10 == 0) goto L5d
            goto L6b
        L5d:
            r9 = 0
            r8.zzi = r9
            r8.zzh = r0
            java.lang.String r9 = r8.zzd
            java.lang.String r10 = "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection."
            android.util.Log.w(r9, r10)
            return
        L6a:
        L6b:
            boolean r10 = r8.zzX(r11, r12)
            if (r10 != 0) goto L97
            java.lang.String r10 = "fa"
            r8.zzi = r10
            if (r11 == 0) goto L81
            if (r12 == 0) goto L81
            java.lang.String r10 = r8.zzd
            java.lang.String r0 = "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics"
            android.util.Log.v(r10, r0)
            goto L99
        L81:
            r10 = 0
            if (r11 != 0) goto L86
            r1 = 1
            goto L87
        L86:
            r1 = 0
        L87:
            if (r12 != 0) goto L8a
            goto L8b
        L8a:
            r0 = 0
        L8b:
            r10 = r1 ^ r0
            if (r10 == 0) goto L99
            java.lang.String r10 = r8.zzd
            java.lang.String r0 = "Specified origin or custom app id is null. Both parameters will be ignored."
            android.util.Log.w(r10, r0)
            goto L99
        L97:
            r8.zzi = r11
        L99:
            com.google.android.gms.internal.measurement.zzdu r10 = new com.google.android.gms.internal.measurement.zzdu
            r1 = r10
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r8.zzW(r10)
            android.content.Context r9 = r9.getApplicationContext()
            android.app.Application r9 = (android.app.Application) r9
            if (r9 != 0) goto Lb7
            java.lang.String r9 = r8.zzd
            java.lang.String r10 = "Unable to register lifecycle notifications. Application null."
            android.util.Log.w(r9, r10)
            return
        Lb7:
            com.google.android.gms.internal.measurement.zzfe r10 = new com.google.android.gms.internal.measurement.zzfe
            r10.<init>(r8)
            r9.registerActivityLifecycleCallbacks(r10)
            return
    }

    static /* bridge */ /* synthetic */ boolean zzR(com.google.android.gms.internal.measurement.zzff r0) {
            boolean r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzS(com.google.android.gms.internal.measurement.zzff r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = r0.zzX(r1, r2)
            return r0
    }

    private final void zzU(java.lang.Exception r7, boolean r8, boolean r9) {
            r6 = this;
            boolean r0 = r6.zzh
            r0 = r0 | r8
            r6.zzh = r0
            if (r8 == 0) goto Lf
            java.lang.String r8 = r6.zzd
            java.lang.String r9 = "Data collection startup failed. No data will be collected."
            android.util.Log.w(r8, r9, r7)
            return
        Lf:
            java.lang.String r8 = "Error with data collection. Data lost."
            if (r9 == 0) goto L1c
            r1 = 5
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r8
            r3 = r7
            r0.zzB(r1, r2, r3, r4, r5)
        L1c:
            java.lang.String r9 = r6.zzd
            android.util.Log.w(r9, r8, r7)
            return
    }

    private final void zzV(java.lang.String r10, java.lang.String r11, android.os.Bundle r12, boolean r13, boolean r14, java.lang.Long r15) {
            r9 = this;
            com.google.android.gms.internal.measurement.zzet r8 = new com.google.android.gms.internal.measurement.zzet
            r0 = r8
            r1 = r9
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.zzW(r8)
            return
    }

    private final void zzW(com.google.android.gms.internal.measurement.zzeu r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb
            r0.execute(r2)
            return
    }

    private final boolean zzX(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r2 == 0) goto Lc
            if (r1 == 0) goto Lc
            boolean r1 = r0.zzT()
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzcv zze(com.google.android.gms.internal.measurement.zzff r0) {
            com.google.android.gms.internal.measurement.zzcv r0 = r0.zzj
            return r0
    }

    public static com.google.android.gms.internal.measurement.zzff zzg(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.internal.measurement.zzff r0 = com.google.android.gms.internal.measurement.zzff.zzc
            if (r0 != 0) goto L20
            java.lang.Class<com.google.android.gms.internal.measurement.zzff> r0 = com.google.android.gms.internal.measurement.zzff.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzff r1 = com.google.android.gms.internal.measurement.zzff.zzc     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.measurement.zzff r1 = new com.google.android.gms.internal.measurement.zzff     // Catch: java.lang.Throwable -> L1d
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.measurement.zzff.zzc = r1     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r8
        L20:
            com.google.android.gms.internal.measurement.zzff r8 = com.google.android.gms.internal.measurement.zzff.zzc
            return r8
    }

    static /* bridge */ /* synthetic */ java.lang.String zzj(com.google.android.gms.internal.measurement.zzff r0) {
            java.lang.String r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.measurement.zzff r0, com.google.android.gms.internal.measurement.zzcv r1) {
            r0.zzj = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzt(com.google.android.gms.internal.measurement.zzff r0, java.lang.Exception r1, boolean r2, boolean r3) {
            r0.zzU(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzu(com.google.android.gms.internal.measurement.zzff r0, com.google.android.gms.internal.measurement.zzeu r1) {
            r0.zzW(r1)
            return
    }

    public final void zzA(java.lang.String r8, java.lang.String r9, android.os.Bundle r10, long r11) {
            r7 = this;
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r4 = 1
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.zzV(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void zzB(int r9, java.lang.String r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r8 = this;
            com.google.android.gms.internal.measurement.zzeh r9 = new com.google.android.gms.internal.measurement.zzeh
            r2 = 0
            r3 = 5
            r6 = 0
            r7 = 0
            r0 = r9
            r1 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.zzW(r9)
            return
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzkc r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.List r0 = r3.zzf
            monitor-enter(r0)
            r1 = 0
        L7:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L4f
            if (r1 >= r2) goto L27
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L4f
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r2.first     // Catch: java.lang.Throwable -> L4f
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L24
            java.lang.String r4 = r3.zzd     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r4, r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L24:
            int r1 = r1 + 1
            goto L7
        L27:
            com.google.android.gms.internal.measurement.zzew r1 = new com.google.android.gms.internal.measurement.zzew     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L4f
            r0.add(r2)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.measurement.zzcv r4 = r3.zzj
            if (r4 == 0) goto L46
            com.google.android.gms.internal.measurement.zzcv r4 = r3.zzj     // Catch: java.lang.Throwable -> L3f
            r4.registerOnMeasurementEventListener(r1)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            java.lang.String r4 = r3.zzd
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r4, r0)
        L46:
            com.google.android.gms.internal.measurement.zzer r4 = new com.google.android.gms.internal.measurement.zzer
            r4.<init>(r3, r1)
            r3.zzW(r4)
            return
        L4f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r4
    }

    public final void zzD() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdt r0 = new com.google.android.gms.internal.measurement.zzdt
            r0.<init>(r1)
            r1.zzW(r0)
            return
    }

    public final void zzE(java.lang.Runnable r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdz r0 = new com.google.android.gms.internal.measurement.zzdz
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzF(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdm r0 = new com.google.android.gms.internal.measurement.zzdm
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzG(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzds r0 = new com.google.android.gms.internal.measurement.zzds
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzH(com.google.android.gms.internal.measurement.zzdj r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdq r0 = new com.google.android.gms.internal.measurement.zzdq
            r0.<init>(r1, r2, r3, r4)
            r1.zzW(r0)
            return
    }

    public final void zzI(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzen r0 = new com.google.android.gms.internal.measurement.zzen
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzJ(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzeo r0 = new com.google.android.gms.internal.measurement.zzeo
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzK(com.google.android.gms.measurement.internal.zzkb r3) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzev r0 = new com.google.android.gms.internal.measurement.zzev
            r0.<init>(r3)
            com.google.android.gms.internal.measurement.zzcv r3 = r2.zzj
            if (r3 == 0) goto L16
            com.google.android.gms.internal.measurement.zzcv r3 = r2.zzj     // Catch: java.lang.Throwable -> Lf
            r3.setEventInterceptor(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            java.lang.String r3 = r2.zzd
            java.lang.String r1 = "Failed to set event interceptor on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r3, r1)
        L16:
            com.google.android.gms.internal.measurement.zzep r3 = new com.google.android.gms.internal.measurement.zzep
            r3.<init>(r2, r0)
            r2.zzW(r3)
            return
    }

    public final void zzL(java.lang.Boolean r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdr r0 = new com.google.android.gms.internal.measurement.zzdr
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzM(long r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdv r0 = new com.google.android.gms.internal.measurement.zzdv
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzN(android.content.Intent r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzeq r0 = new com.google.android.gms.internal.measurement.zzeq
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzO(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdp r0 = new com.google.android.gms.internal.measurement.zzdp
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzP(java.lang.String r8, java.lang.String r9, java.lang.Object r10, boolean r11) {
            r7 = this;
            com.google.android.gms.internal.measurement.zzdl r6 = new com.google.android.gms.internal.measurement.zzdl
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.zzW(r6)
            return
    }

    public final void zzQ(com.google.android.gms.measurement.internal.zzkc r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.List r0 = r3.zzf
            monitor-enter(r0)
            r1 = 0
        L7:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L53
            if (r1 >= r2) goto L25
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L53
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r2 = r2.first     // Catch: java.lang.Throwable -> L53
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L22
            java.lang.Object r4 = r0.get(r1)     // Catch: java.lang.Throwable -> L53
            android.util.Pair r4 = (android.util.Pair) r4     // Catch: java.lang.Throwable -> L53
            goto L26
        L22:
            int r1 = r1 + 1
            goto L7
        L25:
            r4 = 0
        L26:
            if (r4 != 0) goto L31
            java.lang.String r4 = r3.zzd     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "OnEventListener had not been registered."
            android.util.Log.w(r4, r1)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return
        L31:
            r0.remove(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r4.second     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzew r4 = (com.google.android.gms.internal.measurement.zzew) r4     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzcv r0 = r3.zzj
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.measurement.zzcv r0 = r3.zzj     // Catch: java.lang.Throwable -> L43
            r0.unregisterOnMeasurementEventListener(r4)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            java.lang.String r0 = r3.zzd
            java.lang.String r1 = "Failed to unregister event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r0, r1)
        L4a:
            com.google.android.gms.internal.measurement.zzes r0 = new com.google.android.gms.internal.measurement.zzes
            r0.<init>(r3, r4)
            r3.zzW(r0)
            return
        L53:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r4
    }

    protected final boolean zzT() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class<com.google.android.gms.internal.measurement.zzff> r2 = com.google.android.gms.internal.measurement.zzff.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ld
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> Ld
            r0 = 1
        Ld:
            return r0
    }

    public final int zza(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzej r1 = new com.google.android.gms.internal.measurement.zzej
            r1.<init>(r3, r4, r0)
            r3.zzW(r1)
            r1 = 10000(0x2710, double:4.9407E-320)
            android.os.Bundle r4 = r0.zzb(r1)
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzcs.zzf(r4, r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L20
            r4 = 25
            return r4
        L20:
            int r4 = r4.intValue()
            return r4
    }

    public final long zzb() {
            r6 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzec r1 = new com.google.android.gms.internal.measurement.zzec
            r1.<init>(r6, r0)
            r6.zzW(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Long r0 = r0.zzc(r1)
            if (r0 != 0) goto L32
            com.google.android.gms.common.util.Clock r0 = r6.zza
            java.util.Random r1 = new java.util.Random
            long r2 = java.lang.System.nanoTime()
            long r4 = r0.currentTimeMillis()
            long r2 = r2 ^ r4
            r1.<init>(r2)
            long r0 = r1.nextLong()
            int r2 = r6.zzg
            int r2 = r2 + 1
            r6.zzg = r2
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L36
        L32:
            long r0 = r0.longValue()
        L36:
            return r0
    }

    public final android.os.Bundle zzc(android.os.Bundle r3, boolean r4) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzei r1 = new com.google.android.gms.internal.measurement.zzei
            r1.<init>(r2, r3, r0)
            r2.zzW(r1)
            if (r4 == 0) goto L16
            r3 = 5000(0x1388, double:2.4703E-320)
            android.os.Bundle r3 = r0.zzb(r3)
            return r3
        L16:
            r3 = 0
            return r3
    }

    public final com.google.android.gms.measurement.api.AppMeasurementSdk zzd() {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zze
            return r0
    }

    protected final com.google.android.gms.internal.measurement.zzcv zzf(android.content.Context r2, boolean r3) {
            r1 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L13
            java.lang.String r0 = "com.google.android.gms.measurement.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r2 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L13
            java.lang.String r3 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r2 = r2.instantiate(r3)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L13
            com.google.android.gms.internal.measurement.zzcv r2 = com.google.android.gms.internal.measurement.zzcu.asInterface(r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L13
            return r2
        L13:
            r2 = move-exception
            r3 = 1
            r0 = 0
            r1.zzU(r2, r3, r0)
            r2 = 0
            return r2
    }

    public final java.lang.Long zzh() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzel r1 = new com.google.android.gms.internal.measurement.zzel
            r1.<init>(r3, r0)
            r3.zzW(r1)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Long r0 = r0.zzc(r1)
            return r0
    }

    public final java.lang.Object zzi(int r4) {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzem r1 = new com.google.android.gms.internal.measurement.zzem
            r1.<init>(r3, r0, r4)
            r3.zzW(r1)
            r1 = 15000(0x3a98, double:7.411E-320)
            android.os.Bundle r4 = r0.zzb(r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzcs.zzf(r4, r0)
            return r4
    }

    public final java.lang.String zzk() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    public final java.lang.String zzl() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzek r1 = new com.google.android.gms.internal.measurement.zzek
            r1.<init>(r3, r0)
            r3.zzW(r1)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r0 = r0.zzd(r1)
            return r0
    }

    public final java.lang.String zzm() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzeb r1 = new com.google.android.gms.internal.measurement.zzeb
            r1.<init>(r3, r0)
            r3.zzW(r1)
            r1 = 50
            java.lang.String r0 = r0.zzd(r1)
            return r0
    }

    public final java.lang.String zzn() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzee r1 = new com.google.android.gms.internal.measurement.zzee
            r1.<init>(r3, r0)
            r3.zzW(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.String r0 = r0.zzd(r1)
            return r0
    }

    public final java.lang.String zzo() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzed r1 = new com.google.android.gms.internal.measurement.zzed
            r1.<init>(r3, r0)
            r3.zzW(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.String r0 = r0.zzd(r1)
            return r0
    }

    public final java.lang.String zzp() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzea r1 = new com.google.android.gms.internal.measurement.zzea
            r1.<init>(r3, r0)
            r3.zzW(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.String r0 = r0.zzd(r1)
            return r0
    }

    public final java.util.List zzq(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzdo r1 = new com.google.android.gms.internal.measurement.zzdo
            r1.<init>(r2, r3, r4, r0)
            r2.zzW(r1)
            r3 = 5000(0x1388, double:2.4703E-320)
            android.os.Bundle r3 = r0.zzb(r3)
            java.lang.Class<java.util.List> r4 = java.util.List.class
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzcs.zzf(r3, r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L21
            java.util.List r3 = java.util.Collections.emptyList()
        L21:
            return r3
    }

    public final java.util.Map zzr(java.lang.String r9, java.lang.String r10, boolean r11) {
            r8 = this;
            com.google.android.gms.internal.measurement.zzcs r6 = new com.google.android.gms.internal.measurement.zzcs
            r6.<init>()
            com.google.android.gms.internal.measurement.zzef r7 = new com.google.android.gms.internal.measurement.zzef
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r8.zzW(r7)
            r9 = 5000(0x1388, double:2.4703E-320)
            android.os.Bundle r9 = r6.zzb(r9)
            if (r9 == 0) goto L54
            int r10 = r9.size()
            if (r10 != 0) goto L22
            goto L54
        L22:
            java.util.HashMap r10 = new java.util.HashMap
            int r11 = r9.size()
            r10.<init>(r11)
            java.util.Set r11 = r9.keySet()
            java.util.Iterator r11 = r11.iterator()
        L33:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.get(r0)
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 != 0) goto L4f
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 != 0) goto L4f
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L33
        L4f:
            r10.put(r0, r1)
            goto L33
        L53:
            return r10
        L54:
            java.util.Map r9 = java.util.Collections.emptyMap()
            return r9
    }

    public final void zzv(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdw r0 = new com.google.android.gms.internal.measurement.zzdw
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzw(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdn r0 = new com.google.android.gms.internal.measurement.zzdn
            r0.<init>(r1, r2, r3, r4)
            r1.zzW(r0)
            return
    }

    public final void zzx(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzdx r0 = new com.google.android.gms.internal.measurement.zzdx
            r0.<init>(r1, r2)
            r1.zzW(r0)
            return
    }

    public final void zzy(java.lang.String r8, android.os.Bundle r9) {
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r0.zzV(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void zzz(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r7 = this;
            r4 = 1
            r5 = 1
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.zzV(r1, r2, r3, r4, r5, r6)
            return
    }
}
