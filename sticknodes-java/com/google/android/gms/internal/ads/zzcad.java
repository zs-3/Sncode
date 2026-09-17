package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcad {
    private final java.lang.Object zza;
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final com.google.android.gms.internal.ads.zzcah zzc;
    private boolean zzd;
    private android.content.Context zze;
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzbda zzh;
    private java.lang.Boolean zzi;
    private final java.util.concurrent.atomic.AtomicInteger zzj;
    private final java.util.concurrent.atomic.AtomicInteger zzk;
    private final com.google.android.gms.internal.ads.zzcac zzl;
    private final java.lang.Object zzm;
    private com.google.common.util.concurrent.ListenableFuture zzn;
    private final java.util.concurrent.atomic.AtomicBoolean zzo;

    public zzcad() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zza = r0
            com.google.android.gms.ads.internal.util.zzj r0 = new com.google.android.gms.ads.internal.util.zzj
            r0.<init>()
            r3.zzb = r0
            com.google.android.gms.internal.ads.zzcah r1 = new com.google.android.gms.internal.ads.zzcah
            java.lang.String r2 = com.google.android.gms.ads.internal.client.zzbc.zzd()
            r1.<init>(r2, r0)
            r3.zzc = r1
            r0 = 0
            r3.zzd = r0
            r1 = 0
            r3.zzh = r1
            r3.zzi = r1
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r0)
            r3.zzj = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r0)
            r3.zzk = r2
            com.google.android.gms.internal.ads.zzcac r0 = new com.google.android.gms.internal.ads.zzcac
            r0.<init>(r1)
            r3.zzl = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzm = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.zzo = r0
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zzc(com.google.android.gms.internal.ads.zzcad r0) {
            android.content.Context r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbda zzf(com.google.android.gms.internal.ads.zzcad r0) {
            com.google.android.gms.internal.ads.zzbda r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzj(com.google.android.gms.internal.ads.zzcad r0) {
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzm(com.google.android.gms.internal.ads.zzcad r0) {
            java.lang.Object r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzp(com.google.android.gms.internal.ads.zzcad r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zzo
            return r0
    }

    public final boolean zzA(android.content.Context r3) {
            r2 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L19
            goto L20
        L19:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzo
            boolean r3 = r3.get()
            return r3
        L20:
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            if (r3 == 0) goto L36
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L36
            r3 = 1
            return r3
        L36:
            r3 = 0
            return r3
    }

    public final int zza() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzk
            int r0 = r0.get()
            return r0
    }

    public final int zzb() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzj
            int r0 = r0.get()
            return r0
    }

    public final android.content.Context zzd() {
            r1 = this;
            android.content.Context r0 = r1.zze
            return r0
    }

    public final android.content.res.Resources zze() {
            r3 = this;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzf
            boolean r0 = r0.isClientJar
            if (r0 == 0) goto Ld
            android.content.Context r0 = r3.zze
            android.content.res.Resources r0 = r0.getResources()
            return r0
        Ld:
            r0 = 0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzky     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            java.lang.Object r1 = r2.zza(r1)     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            boolean r1 = r1.booleanValue()     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            if (r1 == 0) goto L2b
            android.content.Context r1 = r3.zze     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            android.content.Context r1 = com.google.android.gms.ads.internal.util.client.zzq.zza(r1)     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            android.content.res.Resources r0 = r1.getResources()     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            return r0
        L2b:
            android.content.Context r1 = r3.zze     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            android.content.Context r1 = com.google.android.gms.ads.internal.util.client.zzq.zza(r1)     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            r1.getResources()     // Catch: com.google.android.gms.ads.internal.util.client.zzp -> L35
            return r0
        L35:
            r1 = move-exception
            java.lang.String r2 = "Cannot load resource from dynamite apk or local jar"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbda zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbda r1 = r2.zzh     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final com.google.android.gms.internal.ads.zzcah zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcah r0 = r1.zzc
            return r0
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzj r1 = r2.zzb     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final com.google.common.util.concurrent.ListenableFuture zzk() {
            r3 = this;
            android.content.Context r0 = r3.zze
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            goto L32
        L17:
            java.lang.Object r0 = r3.zzm
            monitor-enter(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r3.zzn     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L20:
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzbzy r2 = new com.google.android.gms.internal.ads.zzbzy     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb(r2)     // Catch: java.lang.Throwable -> L2f
            r3.zzn = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
        L32:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }

    public final java.lang.Boolean zzl() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.Boolean r1 = r2.zzi     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final java.lang.String zzn() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    final /* synthetic */ java.util.ArrayList zzo() throws java.lang.Exception {
            r5 = this;
            android.content.Context r0 = r5.zze
            android.content.Context r0 = com.google.android.gms.internal.ads.zzbwk.zza(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            java.lang.String[] r2 = r0.requestedPermissions
            if (r2 == 0) goto L39
            int[] r2 = r0.requestedPermissionsFlags
            if (r2 == 0) goto L39
            r2 = 0
        L24:
            java.lang.String[] r3 = r0.requestedPermissions
            int r4 = r3.length
            if (r2 >= r4) goto L39
            int[] r4 = r0.requestedPermissionsFlags
            r4 = r4[r2]
            r4 = r4 & 2
            if (r4 == 0) goto L36
            r3 = r3[r2]
            r1.add(r3)
        L36:
            int r2 = r2 + 1
            goto L24
        L39:
            return r1
    }

    public final void zzq() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcac r0 = r1.zzl
            r0.zza()
            return
    }

    public final void zzr() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzj
            r0.decrementAndGet()
            return
    }

    public final void zzs() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzk
            r0.incrementAndGet()
            return
    }

    public final void zzt() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzj
            r0.incrementAndGet()
            return
    }

    @android.annotation.TargetApi(23)
    public final void zzu(android.content.Context r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6) {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            boolean r1 = r4.zzd     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L93
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            r4.zze = r1     // Catch: java.lang.Throwable -> L9e
            r4.zzf = r6     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzazp r1 = com.google.android.gms.ads.internal.zzu.zzb()     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzcah r2 = r4.zzc     // Catch: java.lang.Throwable -> L9e
            r1.zzc(r2)     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.ads.internal.util.zzj r1 = r4.zzb     // Catch: java.lang.Throwable -> L9e
            android.content.Context r2 = r4.zze     // Catch: java.lang.Throwable -> L9e
            r1.zzs(r2)     // Catch: java.lang.Throwable -> L9e
            android.content.Context r1 = r4.zze     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r4.zzf     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzbup.zzb(r1, r2)     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.ads.internal.zzu.zze()     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzca     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L42
            java.lang.String r1 = "CsiReporterFactory: CSI is not enabled. No CSI reporter created."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L9e
            r1 = 0
            goto L47
        L42:
            com.google.android.gms.internal.ads.zzbda r1 = new com.google.android.gms.internal.ads.zzbda     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
        L47:
            r4.zzh = r1     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L59
            com.google.android.gms.internal.ads.zzbzz r1 = new com.google.android.gms.internal.ads.zzbzz     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L9e
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "AppState.registerCsiReporter"
            com.google.android.gms.internal.ads.zzcaq.zza(r1, r2)     // Catch: java.lang.Throwable -> L9e
        L59:
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L9e
            r2 = 1
            if (r1 == 0) goto L8e
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhZ     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r3.zza(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L8e
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch: java.lang.Throwable -> L9e
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.ads.zzcaa r3 = new com.google.android.gms.internal.ads.zzcaa     // Catch: java.lang.RuntimeException -> L83 java.lang.Throwable -> L9e
            r3.<init>(r4)     // Catch: java.lang.RuntimeException -> L83 java.lang.Throwable -> L9e
            r1.registerDefaultNetworkCallback(r3)     // Catch: java.lang.RuntimeException -> L83 java.lang.Throwable -> L9e
            goto L8e
        L83:
            r1 = move-exception
            java.lang.String r3 = "Failed to register network callback"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r1)     // Catch: java.lang.Throwable -> L9e
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.zzo     // Catch: java.lang.Throwable -> L9e
            r1.set(r2)     // Catch: java.lang.Throwable -> L9e
        L8e:
            r4.zzd = r2     // Catch: java.lang.Throwable -> L9e
            r4.zzk()     // Catch: java.lang.Throwable -> L9e
        L93:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r6 = r6.afmaVersion
            r0.zzc(r5, r6)
            return
        L9e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            throw r5
    }

    public final void zzv(java.lang.Throwable r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.zze
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r2.zzf
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zzb(r0, r1)
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbfa.zzg
            java.lang.Object r1 = r1.zze()
            java.lang.Double r1 = (java.lang.Double) r1
            float r1 = r1.floatValue()
            r0.zzi(r3, r4, r1)
            return
    }

    public final void zzw(java.lang.Throwable r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.zze
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r2.zzf
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zzb(r0, r1)
            r0.zzh(r3, r4)
            return
    }

    public final void zzx(java.lang.Throwable r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.zze
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r2.zzf
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zzd(r0, r1)
            r0.zzh(r3, r4)
            return
    }

    public final void zzy(java.lang.Boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            monitor-enter(r0)
            r1.zzi = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final void zzz(java.lang.String r1) {
            r0 = this;
            r0.zzg = r1
            return
    }
}
