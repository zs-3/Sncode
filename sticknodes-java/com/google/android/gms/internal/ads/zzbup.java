package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbup implements com.google.android.gms.internal.ads.zzbur {
    public static com.google.android.gms.internal.ads.zzbur zza;
    static com.google.android.gms.internal.ads.zzbur zzb;
    static com.google.android.gms.internal.ads.zzbur zzc;
    static java.lang.Boolean zzd;
    private static final java.lang.Object zze = null;
    private final java.lang.Object zzf;
    private final android.content.Context zzg;
    private final java.util.WeakHashMap zzh;
    private final java.util.concurrent.ExecutorService zzi;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzj;
    private final android.content.pm.PackageInfo zzk;
    private final java.lang.String zzl;
    private final java.lang.String zzm;
    private final java.util.concurrent.atomic.AtomicBoolean zzn;
    private boolean zzo;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzbup.zze = r0
            return
    }

    protected zzbup(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfum.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzht
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L61
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L61
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L51
            goto L61
        L51:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L62
        L61:
            r3 = r0
        L62:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhr
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L81
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L82
        L81:
            r4 = r1
        L82:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb1
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9b
            goto Lb2
        L9b:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            if (r3 != 0) goto Laa
            goto Lb2
        Laa:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            goto Lb2
        Lb1:
            r0 = r1
        Lb2:
            r2.zzm = r0
            return
    }

    protected zzbup(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.zzo = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzbur zza(android.content.Context r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbup.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.internal.ads.zzbup.zza     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L20
            boolean r1 = zzl(r3)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L19
            com.google.android.gms.internal.ads.zzbup r1 = new com.google.android.gms.internal.ads.zzbup     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzbup.zza = r1     // Catch: java.lang.Throwable -> L24
            goto L20
        L19:
            com.google.android.gms.internal.ads.zzbuq r3 = new com.google.android.gms.internal.ads.zzbuq     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzbup.zza = r3     // Catch: java.lang.Throwable -> L24
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzbur r3 = com.google.android.gms.internal.ads.zzbup.zza
            return r3
        L24:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    public static com.google.android.gms.internal.ads.zzbur zzb(android.content.Context r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbup.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.internal.ads.zzbup.zzc     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L65
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbej.zzc     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhm     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r4.zza(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbej.zza     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L38
        L37:
            r2 = 1
        L38:
            boolean r1 = zzl(r5)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L4c
            com.google.android.gms.internal.ads.zzbup r1 = new com.google.android.gms.internal.ads.zzbup     // Catch: java.lang.Throwable -> L69
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L69
            r1.zzk()     // Catch: java.lang.Throwable -> L69
            r1.zzj()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbup.zzc = r1     // Catch: java.lang.Throwable -> L69
            goto L65
        L4c:
            if (r2 == 0) goto L5e
            if (r5 == 0) goto L5e
            com.google.android.gms.internal.ads.zzbup r1 = new com.google.android.gms.internal.ads.zzbup     // Catch: java.lang.Throwable -> L69
            r1.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L69
            r1.zzk()     // Catch: java.lang.Throwable -> L69
            r1.zzj()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbup.zzc = r1     // Catch: java.lang.Throwable -> L69
            goto L65
        L5e:
            com.google.android.gms.internal.ads.zzbuq r5 = new com.google.android.gms.internal.ads.zzbuq     // Catch: java.lang.Throwable -> L69
            r5.<init>()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbup.zzc = r5     // Catch: java.lang.Throwable -> L69
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbur r5 = com.google.android.gms.internal.ads.zzbup.zzc
            return r5
        L69:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r5
    }

    public static com.google.android.gms.internal.ads.zzbur zzc(android.content.Context r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbup.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.internal.ads.zzbup.zzb     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L3e
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhn     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhm     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L37
            com.google.android.gms.internal.ads.zzbup r1 = new com.google.android.gms.internal.ads.zzbup     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L42
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbup.zzb = r1     // Catch: java.lang.Throwable -> L42
            goto L3e
        L37:
            com.google.android.gms.internal.ads.zzbuq r3 = new com.google.android.gms.internal.ads.zzbuq     // Catch: java.lang.Throwable -> L42
            r3.<init>()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbup.zzb = r3     // Catch: java.lang.Throwable -> L42
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbur r3 = com.google.android.gms.internal.ads.zzbup.zzb
            return r3
        L42:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r3
    }

    public static com.google.android.gms.internal.ads.zzbur zzd(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbup.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.internal.ads.zzbup.zzb     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhn     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhm     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzbup r1 = new com.google.android.gms.internal.ads.zzbup     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbup.zzb = r1     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L33:
            com.google.android.gms.internal.ads.zzbuq r3 = new com.google.android.gms.internal.ads.zzbuq     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbup.zzb = r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbur r3 = com.google.android.gms.internal.ads.zzbup.zzb
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
    }

    public static java.lang.String zze(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String zzf(java.lang.Throwable r0) {
            java.lang.String r0 = zze(r0)
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzg(r0)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfyo.zzc(r0)
            return r0
    }

    private final void zzj() {
            r2 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            com.google.android.gms.internal.ads.zzbun r1 = new com.google.android.gms.internal.ads.zzbun
            r1.<init>(r2, r0)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            return
    }

    private final void zzk() {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Object r1 = r4.zzf
            monitor-enter(r1)
            java.util.WeakHashMap r2 = r4.zzh     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L23
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            com.google.android.gms.internal.ads.zzbuo r2 = new com.google.android.gms.internal.ads.zzbuo
            r2.<init>(r4, r1)
            r0.setUncaughtExceptionHandler(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    private static boolean zzl(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzmq
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r1.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1 = 1
            if (r5 != 0) goto L39
            com.google.android.gms.internal.ads.zzbeb r5 = com.google.android.gms.internal.ads.zzbfa.zze
            java.lang.Object r5 = r5.zze()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L38
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzhm
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r2.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            return r1
        L38:
            return r0
        L39:
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbup.zze
            monitor-enter(r5)
            java.lang.Boolean r2 = com.google.android.gms.internal.ads.zzbup.zzd     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L65
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzbc.zze()     // Catch: java.lang.Throwable -> L82
            r3 = 100
            int r2 = r2.nextInt(r3)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzmn     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L82
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L82
            if (r2 >= r3) goto L5e
            r2 = 1
            goto L5f
        L5e:
            r2 = 0
        L5f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.ads.zzbup.zzd = r2     // Catch: java.lang.Throwable -> L82
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r5 = com.google.android.gms.internal.ads.zzbup.zzd
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L81
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzhm
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r2.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L81
            return r1
        L81:
            return r0
        L82:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            throw r0
    }

    protected final void zzg(java.lang.Thread r9, java.lang.Throwable r10) {
            r8 = this;
            if (r10 == 0) goto L5b
            r9 = 0
            r0 = r10
            r1 = 0
            r2 = 0
        L6:
            if (r0 == 0) goto L32
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r4 = r3.length
            r5 = 0
        Le:
            if (r5 >= r4) goto L2d
            r6 = r3[r5]
            java.lang.String r7 = r6.getClassName()
            boolean r7 = com.google.android.gms.ads.internal.util.client.zzf.zzp(r7)
            r1 = r1 | r7
            java.lang.Class<com.google.android.gms.internal.ads.zzbup> r7 = com.google.android.gms.internal.ads.zzbup.class
            java.lang.String r7 = r7.getName()
            java.lang.String r6 = r6.getClassName()
            boolean r6 = r7.equals(r6)
            r2 = r2 | r6
            int r5 = r5 + 1
            goto Le
        L2d:
            java.lang.Throwable r0 = r0.getCause()
            goto L6
        L32:
            if (r1 == 0) goto L5b
            if (r2 != 0) goto L5b
            boolean r9 = r8.zzo
            if (r9 != 0) goto L3f
            java.lang.String r9 = ""
            r8.zzh(r10, r9)
        L3f:
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.zzn
            r10 = 1
            boolean r9 = r9.getAndSet(r10)
            if (r9 != 0) goto L5b
            com.google.android.gms.internal.ads.zzbeb r9 = com.google.android.gms.internal.ads.zzbej.zzc
            java.lang.Object r9 = r9.zze()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5b
            android.content.Context r9 = r8.zzg
            com.google.android.gms.internal.ads.zzbcf.zzc(r9)
        L5b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void zzh(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.zzo
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zzi(r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void zzi(java.lang.Throwable r18, java.lang.String r19, float r20) {
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r1.zzo
            if (r2 == 0) goto La
            goto L317
        La:
            android.os.Handler r2 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbfa.zzf
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L20
            r6 = r18
            goto Le6
        L20:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r6 = r18
        L27:
            if (r6 == 0) goto L31
            r2.push(r6)
            java.lang.Throwable r6 = r6.getCause()
            goto L27
        L31:
            r6 = 0
        L32:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto Le6
            java.lang.Object r7 = r2.pop()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.StackTraceElement[] r8 = r7.getStackTrace()
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzco
            com.google.android.gms.internal.ads.zzbct r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r10.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L69
            if (r8 == 0) goto L69
            int r9 = r8.length
            if (r9 != 0) goto L69
            java.lang.Class r9 = r7.getClass()
            java.lang.String r9 = r9.getName()
            boolean r9 = com.google.android.gms.ads.internal.util.client.zzf.zzp(r9)
            if (r9 == 0) goto L69
            r9 = 1
            goto L6a
        L69:
            r9 = 0
        L6a:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.StackTraceElement r11 = new java.lang.StackTraceElement
            java.lang.Class r12 = r7.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "<filtered>"
            r11.<init>(r12, r13, r13, r5)
            r10.add(r11)
            int r11 = r8.length
            r12 = 0
        L83:
            if (r12 >= r11) goto Lc1
            r14 = r8[r12]
            java.lang.String r15 = r14.getClassName()
            boolean r15 = com.google.android.gms.ads.internal.util.client.zzf.zzp(r15)
            if (r15 == 0) goto L96
            r10.add(r14)
            r9 = 1
            goto Lbe
        L96:
            java.lang.String r15 = r14.getClassName()
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 == 0) goto La1
            goto Lb2
        La1:
            java.lang.String r3 = "android."
            boolean r3 = r15.startsWith(r3)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "java."
            boolean r3 = r15.startsWith(r3)
            if (r3 == 0) goto Lb2
            goto Lbb
        Lb2:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            r3.<init>(r13, r13, r13, r5)
            r10.add(r3)
            goto Lbe
        Lbb:
            r10.add(r14)
        Lbe:
            int r12 = r12 + 1
            goto L83
        Lc1:
            if (r9 == 0) goto L32
            if (r6 != 0) goto Lcf
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r6 = r7.getMessage()
            r3.<init>(r6)
            goto Ld8
        Lcf:
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r7 = r7.getMessage()
            r3.<init>(r7, r6)
        Ld8:
            r6 = r3
            java.lang.StackTraceElement[] r3 = new java.lang.StackTraceElement[r4]
            java.lang.Object[] r3 = r10.toArray(r3)
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3
            r6.setStackTrace(r3)
            goto L32
        Le6:
            if (r6 == 0) goto L317
            java.lang.Class r2 = r18.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = zze(r18)
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzis
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r7.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L10b
            java.lang.String r6 = zzf(r18)
            goto L10d
        L10b:
            java.lang.String r6 = ""
        L10d:
            double r7 = (double) r0
            r9 = 0
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            double r10 = java.lang.Math.random()
            if (r9 <= 0) goto L11d
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 / r0
            int r0 = (int) r9
            r9 = r0
            goto L11e
        L11d:
            r9 = 1
        L11e:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 >= 0) goto L317
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.content.Context r0 = r1.zzg     // Catch: java.lang.Throwable -> L132
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: java.lang.Throwable -> L132
            boolean r4 = r0.isCallerInstantApp()     // Catch: java.lang.Throwable -> L132
            goto L138
        L132:
            r0 = move-exception
            java.lang.String r8 = "Error fetching instant app info"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r8, r0)
        L138:
            android.content.Context r0 = r1.zzg     // Catch: java.lang.Throwable -> L13f
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L13f
            goto L146
        L13f:
            java.lang.String r0 = "Cannot obtain package name, proceeding."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            java.lang.String r0 = "unknown"
        L146:
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            java.lang.String r10 = "https"
            android.net.Uri$Builder r8 = r8.scheme(r10)
            java.lang.String r10 = "//pagead2.googlesyndication.com/pagead/gen_204"
            android.net.Uri$Builder r8 = r8.path(r10)
            java.lang.String r4 = java.lang.Boolean.toString(r4)
            java.lang.String r10 = "is_aia"
            android.net.Uri$Builder r4 = r8.appendQueryParameter(r10, r4)
            java.lang.String r8 = "id"
            java.lang.String r10 = "gmob-apps-report-exception"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r8, r10)
            java.lang.String r8 = android.os.Build.VERSION.RELEASE
            java.lang.String r10 = "os"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r10, r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.String r10 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "api"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r11, r10)
            java.lang.String r10 = android.os.Build.MANUFACTURER
            java.lang.String r11 = android.os.Build.MODEL
            boolean r12 = r11.startsWith(r10)
            if (r12 == 0) goto L188
            goto L19c
        L188:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = " "
            r12.append(r10)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
        L19c:
            java.lang.String r10 = "device"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r10, r11)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = r1.zzj
            java.lang.String r10 = r10.afmaVersion
            java.lang.String r11 = "js"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r11, r10)
            java.lang.String r10 = "appid"
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r10, r0)
            java.lang.String r4 = "exceptiontype"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r4, r2)
            java.lang.String r2 = "stacktrace"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            com.google.android.gms.internal.ads.zzbcn r2 = com.google.android.gms.ads.internal.client.zzbe.zza()
            java.util.List r2 = r2.zza()
            java.lang.String r3 = ","
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)
            java.lang.String r3 = "eids"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r2)
            java.lang.String r2 = "exceptionkey"
            r3 = r19
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            java.lang.String r2 = "cl"
            java.lang.String r3 = "679313570"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            java.lang.String r2 = "rc"
            java.lang.String r3 = "dev"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            java.lang.String r2 = java.lang.Integer.toString(r9)
            java.lang.String r3 = "sampling_rate"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r2)
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbfa.zzc
            java.lang.Object r2 = r2.zze()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "pb_tm"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r2)
            android.content.Context r2 = r1.zzg
            com.google.android.gms.common.GoogleApiAvailabilityLight r3 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r2 = r3.getApkVersion(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "gmscv"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r2)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r1.zzj
            boolean r2 = r2.isLiteSdk
            java.lang.String r3 = "0"
            java.lang.String r4 = "1"
            if (r5 == r2) goto L224
            r2 = r3
            goto L225
        L224:
            r2 = r4
        L225:
            java.lang.String r9 = "lite"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r9, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L236
            java.lang.String r2 = "hash"
            r0.appendQueryParameter(r2, r6)
        L236:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhs
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r6.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L271
            android.content.Context r2 = r1.zzg
            android.app.ActivityManager$MemoryInfo r2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(r2)
            if (r2 == 0) goto L271
            long r9 = r2.availMem
            java.lang.String r6 = java.lang.Long.toString(r9)
            java.lang.String r9 = "available_memory"
            r0.appendQueryParameter(r9, r6)
            long r9 = r2.totalMem
            java.lang.String r6 = java.lang.Long.toString(r9)
            java.lang.String r9 = "total_memory"
            r0.appendQueryParameter(r9, r6)
            boolean r2 = r2.lowMemory
            if (r5 == r2) goto L26b
            goto L26c
        L26b:
            r3 = r4
        L26c:
            java.lang.String r2 = "is_low_memory"
            r0.appendQueryParameter(r2, r3)
        L271:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhr
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d7
            java.lang.String r2 = r1.zzl
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L292
            java.lang.String r2 = r1.zzl
            java.lang.String r3 = "countrycode"
            r0.appendQueryParameter(r3, r2)
        L292:
            java.lang.String r2 = r1.zzm
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2a1
            java.lang.String r2 = r1.zzm
            java.lang.String r3 = "psv"
            r0.appendQueryParameter(r3, r2)
        L2a1:
            android.content.Context r2 = r1.zzg
            r3 = 26
            if (r8 < r3) goto L2ac
            android.content.pm.PackageInfo r2 = android.webkit.WebView.getCurrentWebViewPackage()
            goto L2bc
        L2ac:
            if (r2 != 0) goto L2b0
        L2ae:
            r2 = 0
            goto L2bc
        L2b0:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2ae
            java.lang.String r3 = "com.android.webview"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2ae
        L2bc:
            if (r2 == 0) goto L2d7
            int r3 = r2.versionCode
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "wvvc"
            r0.appendQueryParameter(r4, r3)
            java.lang.String r3 = r2.versionName
            java.lang.String r4 = "wvvn"
            r0.appendQueryParameter(r4, r3)
            java.lang.String r2 = r2.packageName
            java.lang.String r3 = "wvpn"
            r0.appendQueryParameter(r3, r2)
        L2d7:
            android.content.pm.PackageInfo r2 = r1.zzk
            if (r2 == 0) goto L2ef
            int r2 = r2.versionCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "appvc"
            r0.appendQueryParameter(r3, r2)
            android.content.pm.PackageInfo r2 = r1.zzk
            java.lang.String r2 = r2.versionName
            java.lang.String r3 = "appvn"
            r0.appendQueryParameter(r3, r2)
        L2ef:
            java.lang.String r0 = r0.toString()
            r7.add(r0)
            java.util.Iterator r0 = r7.iterator()
        L2fa:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L317
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.ads.internal.util.client.zzr r3 = new com.google.android.gms.ads.internal.util.client.zzr
            r4 = 0
            r3.<init>(r4)
            java.util.concurrent.ExecutorService r5 = r1.zzi
            com.google.android.gms.internal.ads.zzbum r6 = new com.google.android.gms.internal.ads.zzbum
            r6.<init>(r3, r2)
            r5.execute(r6)
            goto L2fa
        L317:
            return
    }
}
