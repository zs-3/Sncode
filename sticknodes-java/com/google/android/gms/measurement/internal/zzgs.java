package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgs extends com.google.android.gms.measurement.internal.zzg {
    private java.lang.String zza;
    private java.lang.String zzb;
    private int zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private java.util.List zzi;
    private java.lang.String zzj;
    private int zzk;
    private java.lang.String zzl;
    private java.lang.String zzm;
    private java.lang.String zzn;
    private long zzo;
    private java.lang.String zzp;

    zzgs(com.google.android.gms.measurement.internal.zzio r3, long r4, long r6) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.zzo = r0
            r3 = 0
            r2.zzp = r3
            r2.zzg = r4
            r2.zzh = r6
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzd() {
            r12 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            long r2 = r12.zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r12.zzg
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "sdkVersion bundled with app, dynamiteVersion"
            r1.zzc(r4, r2, r3)
            android.content.Context r1 = r0.zzaT()
            java.lang.String r1 = r1.getPackageName()
            android.content.Context r2 = r0.zzaT()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r7 = "unknown"
            if (r2 != 0) goto L4a
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r0.zzb(r9, r8)
        L47:
            r8 = r3
            goto Lb1
        L4a:
            java.lang.String r7 = r2.getInstallerPackageName(r1)     // Catch: java.lang.IllegalArgumentException -> L4f
            goto L62
        L4f:
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r0.zzb(r9, r8)
        L62:
            if (r7 != 0) goto L68
            java.lang.String r0 = "manual_install"
            r7 = r0
            goto L71
        L68:
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L71
            r7 = r5
        L71:
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r0 == 0) goto L47
            android.content.pm.ApplicationInfo r8 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            java.lang.CharSequence r8 = r2.getApplicationLabel(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r9 != 0) goto L92
            java.lang.String r8 = r8.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            goto L93
        L92:
            r8 = r3
        L93:
            java.lang.String r3 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            int r4 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            goto Lb1
        L98:
            r0 = r3
            r3 = r8
            goto L9c
        L9b:
            r0 = r3
        L9c:
            com.google.android.gms.measurement.internal.zzio r8 = r12.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.zzc(r10, r9, r3)
            r8 = r3
            r3 = r0
        Lb1:
            r12.zza = r1
            r12.zzd = r7
            r12.zzb = r3
            r12.zzc = r4
            r12.zze = r8
            r3 = 0
            r12.zzf = r3
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzam r3 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzbp
            r7 = 0
            boolean r3 = r3.zzx(r7, r4)
            r8 = 1
            if (r3 != 0) goto Le9
            com.google.android.gms.measurement.internal.zzio r3 = r12.zzu
            java.lang.String r9 = r3.zzx()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto Le9
            java.lang.String r3 = r3.zzy()
            java.lang.String r9 = "am"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto Le9
            r3 = 1
            goto Lea
        Le9:
            r3 = 0
        Lea:
            com.google.android.gms.measurement.internal.zzio r9 = r12.zzu
            int r10 = r9.zza()
            if (r10 == 0) goto L173
            if (r10 == r8) goto L165
            r8 = 3
            if (r10 == r8) goto L157
            r8 = 4
            if (r10 == r8) goto L149
            r8 = 6
            if (r10 == r8) goto L13b
            r8 = 7
            if (r10 == r8) goto L12d
            r8 = 8
            if (r10 == r8) goto L11f
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r11 = "App measurement disabled"
            r8.zza(r11)
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzh()
            java.lang.String r11 = "Invalid scion state in identity"
            r8.zza(r11)
            goto L180
        L11f:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r11 = "App measurement disabled due to denied storage consent"
            r8.zza(r11)
            goto L180
        L12d:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r11 = "App measurement disabled via the global data collection setting"
            r8.zza(r11)
            goto L180
        L13b:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            java.lang.String r11 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r8.zza(r11)
            goto L180
        L149:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r11 = "App measurement disabled via the manifest"
            r8.zza(r11)
            goto L180
        L157:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r11 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r8.zza(r11)
            goto L180
        L165:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r11 = "App measurement deactivated via the manifest"
            r8.zza(r11)
            goto L180
        L173:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
            java.lang.String r11 = "App measurement collection enabled"
            r8.zza(r11)
        L180:
            r12.zzl = r5
            r12.zzm = r5
            r0.zzaV()
            if (r3 == 0) goto L18f
            java.lang.String r3 = r9.zzx()
            r12.zzm = r3
        L18f:
            android.content.Context r3 = r0.zzaT()     // Catch: java.lang.IllegalStateException -> L1f8
            java.lang.String r8 = r9.zzA()     // Catch: java.lang.IllegalStateException -> L1f8
            java.lang.String r11 = "google_app_id"
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzmg.zzc(r3, r11, r8)     // Catch: java.lang.IllegalStateException -> L1f8
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.IllegalStateException -> L1f8
            if (r8 == 0) goto L1a4
            goto L1a5
        L1a4:
            r5 = r3
        L1a5:
            r12.zzl = r5     // Catch: java.lang.IllegalStateException -> L1f8
            com.google.android.gms.measurement.internal.zzam r5 = r0.zzf()     // Catch: java.lang.IllegalStateException -> L1f8
            boolean r4 = r5.zzx(r7, r4)     // Catch: java.lang.IllegalStateException -> L1f8
            if (r4 != 0) goto L1d9
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.IllegalStateException -> L1f8
            if (r3 != 0) goto L1d9
            android.content.Context r3 = r0.zzaT()     // Catch: java.lang.IllegalStateException -> L1f8
            java.lang.String r4 = r9.zzA()     // Catch: java.lang.IllegalStateException -> L1f8
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.IllegalStateException -> L1f8
            android.content.res.Resources r5 = r3.getResources()     // Catch: java.lang.IllegalStateException -> L1f8
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.IllegalStateException -> L1f8
            if (r8 != 0) goto L1cd
            goto L1d1
        L1cd:
            java.lang.String r4 = com.google.android.gms.measurement.internal.zzig.zza(r3)     // Catch: java.lang.IllegalStateException -> L1f8
        L1d1:
            java.lang.String r3 = "admob_app_id"
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzig.zzb(r3, r5, r4)     // Catch: java.lang.IllegalStateException -> L1f8
            r12.zzm = r3     // Catch: java.lang.IllegalStateException -> L1f8
        L1d9:
            if (r10 != 0) goto L20c
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.IllegalStateException -> L1f8
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.IllegalStateException -> L1f8
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r12.zza     // Catch: java.lang.IllegalStateException -> L1f8
            java.lang.String r5 = r12.zzl     // Catch: java.lang.IllegalStateException -> L1f8
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.IllegalStateException -> L1f8
            if (r5 == 0) goto L1f2
            java.lang.String r5 = r12.zzm     // Catch: java.lang.IllegalStateException -> L1f8
            goto L1f4
        L1f2:
            java.lang.String r5 = r12.zzl     // Catch: java.lang.IllegalStateException -> L1f8
        L1f4:
            r0.zzc(r3, r4, r5)     // Catch: java.lang.IllegalStateException -> L1f8
            goto L20c
        L1f8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r12.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.zzc(r4, r1, r0)
        L20c:
            r12.zzi = r7
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            java.lang.String r3 = "analytics.safelisted_events"
            java.util.List r1 = r1.zzt(r3)
            if (r1 != 0) goto L220
            goto L251
        L220:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L234
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r1.zza(r3)
            goto L253
        L234:
            java.util.Iterator r3 = r1.iterator()
        L238:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L251
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            java.lang.String r7 = "safelisted event"
            boolean r4 = r5.zzag(r7, r4)
            if (r4 != 0) goto L238
            goto L253
        L251:
            r12.zzi = r1
        L253:
            if (r2 == 0) goto L260
            android.content.Context r0 = r0.zzaT()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r12.zzk = r0
            return
        L260:
            r12.zzk = r6
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 1
            return r0
    }

    final int zzh() {
            r1 = this;
            r1.zza()
            int r0 = r1.zzk
            return r0
    }

    final int zzi() {
            r1 = this;
            r1.zza()
            int r0 = r1.zzc
            return r0
    }

    final long zzj() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    final com.google.android.gms.measurement.internal.zzr zzk(java.lang.String r53) {
            r52 = this;
            r1 = r52
            r52.zzg()
            com.google.android.gms.measurement.internal.zzr r44 = new com.google.android.gms.measurement.internal.zzr
            java.lang.String r3 = r52.zzm()
            java.lang.String r4 = r52.zzo()
            r52.zza()
            java.lang.String r5 = r1.zzb
            r52.zza()
            int r0 = r1.zzc
            long r6 = (long) r0
            r52.zza()
            java.lang.String r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r8 = r1.zzd
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzf()
            r2.zzj()
            r52.zza()
            r52.zzg()
            long r9 = r1.zzf
            r11 = 0
            r2 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto Lcc
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu
            com.google.android.gms.measurement.internal.zzqf r9 = r9.zzw()
            android.content.Context r10 = r0.zzaT()
            android.content.Context r0 = r0.zzaT()
            java.lang.String r0 = r0.getPackageName()
            r9.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            android.content.pm.PackageManager r13 = r10.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.zzqf.zzI()
            if (r14 != 0) goto L73
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.zza(r9)
            r9 = -1
            goto Lca
        L73:
            if (r13 == 0) goto Lc9
            boolean r0 = r9.zzam(r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            if (r0 != 0) goto Lb6
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            android.content.Context r13 = r10.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            java.lang.String r13 = r13.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            r15 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r13, r15)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            if (r0 == 0) goto La6
            int r13 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            if (r13 <= 0) goto La6
            r0 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            byte[] r0 = r14.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            long r9 = com.google.android.gms.measurement.internal.zzqf.zzr(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            r15 = r9
            goto Lb7
        La6:
            com.google.android.gms.measurement.internal.zzhe r0 = r10.zzaW()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            java.lang.String r10 = "Could not get signatures"
            r0.zza(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            r15 = -1
            goto Lb7
        Lb6:
            r15 = r11
        Lb7:
            r9 = r15
            goto Lca
        Lb9:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r10 = "Package name not found"
            r9.zzb(r10, r0)
        Lc9:
            r9 = r11
        Lca:
            r1.zzf = r9
        Lcc:
            r13 = r9
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            boolean r15 = r0.zzJ()
            com.google.android.gms.measurement.internal.zzht r9 = r0.zzm()
            boolean r9 = r9.zzm
            r10 = 1
            r16 = r9 ^ 1
            r52.zzg()
            boolean r9 = r0.zzJ()
            r11 = 0
            if (r9 != 0) goto Le9
        Le6:
            r0 = r11
            goto L168
        Le9:
            com.google.android.gms.internal.measurement.zzrp.zzb()
            com.google.android.gms.measurement.internal.zzam r9 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r12 = com.google.android.gms.measurement.internal.zzgi.zzaG
            boolean r9 = r9.zzx(r11, r12)
            if (r9 == 0) goto L108
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r9 = "Disabled IID for tests."
            r0.zza(r9)
            goto Le6
        L108:
            android.content.Context r0 = r0.zzaT()     // Catch: java.lang.ClassNotFoundException -> Le6
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Le6
            java.lang.String r9 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r9)     // Catch: java.lang.ClassNotFoundException -> Le6
            if (r0 != 0) goto L119
            goto Le6
        L119:
            java.lang.String r9 = "getInstance"
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L157
            java.lang.Class<android.content.Context> r19 = android.content.Context.class
            r12[r2] = r19     // Catch: java.lang.Exception -> L157
            java.lang.reflect.Method r9 = r0.getDeclaredMethod(r9, r12)     // Catch: java.lang.Exception -> L157
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L157
            com.google.android.gms.measurement.internal.zzio r10 = r1.zzu     // Catch: java.lang.Exception -> L157
            android.content.Context r10 = r10.zzaT()     // Catch: java.lang.Exception -> L157
            r12[r2] = r10     // Catch: java.lang.Exception -> L157
            java.lang.Object r9 = r9.invoke(r11, r12)     // Catch: java.lang.Exception -> L157
            if (r9 != 0) goto L136
            goto Le6
        L136:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L147
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r10, r12)     // Catch: java.lang.Exception -> L147
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L147
            java.lang.Object r0 = r0.invoke(r9, r10)     // Catch: java.lang.Exception -> L147
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L147
            goto L168
        L147:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzl()
            java.lang.String r9 = "Failed to retrieve Firebase Instance Id"
            r0.zza(r9)
            goto Le6
        L157:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzm()
            java.lang.String r9 = "Failed to obtain Firebase Analytics instance"
            r0.zza(r9)
            goto Le6
        L168:
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu
            com.google.android.gms.measurement.internal.zzht r10 = r9.zzm()
            com.google.android.gms.measurement.internal.zzhp r10 = r10.zzc
            long r11 = r10.zza()
            r17 = 0
            int r10 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r10 != 0) goto L17d
            long r9 = r9.zza
            goto L183
        L17d:
            long r9 = r9.zza
            long r9 = java.lang.Math.min(r9, r11)
        L183:
            r21 = r9
            r52.zza()
            int r11 = r1.zzk
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r10 = r9.zzf()
            boolean r23 = r10.zzw()
            com.google.android.gms.measurement.internal.zzht r10 = r9.zzm()
            r10.zzg()
            android.content.SharedPreferences r10 = r10.zzb()
            java.lang.String r12 = "deferred_analytics_collection"
            boolean r24 = r10.getBoolean(r12, r2)
            java.lang.String r25 = r52.zzl()
            com.google.android.gms.measurement.internal.zzam r10 = r9.zzf()
            java.lang.String r12 = "google_analytics_default_allow_ad_personalization_signals"
            r2 = 1
            com.google.android.gms.measurement.internal.zzju r10 = r10.zzm(r12, r2)
            com.google.android.gms.measurement.internal.zzju r2 = com.google.android.gms.measurement.internal.zzju.zzd
            if (r10 == r2) goto L1bc
            r28 = r11
            r2 = 1
            goto L1bf
        L1bc:
            r28 = r11
            r2 = 0
        L1bf:
            long r10 = r1.zzg
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r2)
            java.util.List r2 = r1.zzi
            com.google.android.gms.measurement.internal.zzht r27 = r9.zzm()
            com.google.android.gms.measurement.internal.zzjx r27 = r27.zzh()
            java.lang.String r30 = r27.zzq()
            r31 = r2
            java.lang.String r2 = r1.zzj
            if (r2 != 0) goto L1e3
            com.google.android.gms.measurement.internal.zzqf r2 = r9.zzw()
            java.lang.String r2 = r2.zzF()
            r1.zzj = r2
        L1e3:
            java.lang.String r2 = r1.zzj
            com.google.android.gms.measurement.internal.zzht r27 = r9.zzm()
            r32 = r2
            com.google.android.gms.measurement.internal.zzjx r2 = r27.zzh()
            r33 = r10
            com.google.android.gms.measurement.internal.zzjw r10 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r2 = r2.zzr(r10)
            if (r2 != 0) goto L200
            r35 = r13
            r17 = 0
            r37 = 0
            goto L238
        L200:
            r52.zzg()
            long r10 = r1.zzo
            r17 = 0
            int r2 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r2 != 0) goto L20e
            r35 = r13
            goto L22d
        L20e:
            com.google.android.gms.common.util.Clock r2 = r9.zzaU()
            long r10 = r2.currentTimeMillis()
            r35 = r13
            long r13 = r1.zzo
            long r10 = r10 - r13
            java.lang.String r2 = r1.zzn
            if (r2 == 0) goto L22d
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 <= 0) goto L22d
            java.lang.String r2 = r1.zzp
            if (r2 != 0) goto L22d
            r52.zzq()
        L22d:
            java.lang.String r2 = r1.zzn
            if (r2 != 0) goto L234
            r52.zzq()
        L234:
            java.lang.String r2 = r1.zzn
            r37 = r2
        L238:
            com.google.android.gms.measurement.internal.zzam r2 = r9.zzf()
            boolean r38 = r2.zzE()
            com.google.android.gms.measurement.internal.zzqf r2 = r9.zzw()
            java.lang.String r9 = r52.zzm()
            com.google.android.gms.measurement.internal.zzio r10 = r2.zzu
            android.content.Context r11 = r10.zzaT()
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            if (r11 != 0) goto L258
            r39 = r17
            r11 = 0
            goto L281
        L258:
            android.content.Context r10 = r10.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r10 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26a
            r11 = 0
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo(r9, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26b
            if (r10 == 0) goto L27d
            int r2 = r10.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26b
            goto L27e
        L26a:
            r11 = 0
        L26b:
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            r2.zzaV()
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzi()
            java.lang.String r10 = "PackageManager failed to find running app: app_id"
            r2.zzb(r10, r9)
        L27d:
            r2 = 0
        L27e:
            long r9 = (long) r2
            r39 = r9
        L281:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzht r9 = r2.zzm()
            com.google.android.gms.measurement.internal.zzjx r9 = r9.zzh()
            int r41 = r9.zzb()
            com.google.android.gms.measurement.internal.zzht r9 = r2.zzm()
            com.google.android.gms.measurement.internal.zzba r9 = r9.zzf()
            java.lang.String r42 = r9.zzj()
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzam r9 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzaW
            r13 = 0
            boolean r9 = r9.zzx(r13, r10)
            if (r9 == 0) goto L2b6
            com.google.android.gms.measurement.internal.zzqf r9 = r2.zzw()
            int r9 = r9.zzl()
            r43 = r9
            goto L2b8
        L2b6:
            r43 = 0
        L2b8:
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzam r9 = r2.zzf()
            boolean r9 = r9.zzx(r13, r10)
            if (r9 == 0) goto L2d0
            com.google.android.gms.measurement.internal.zzqf r9 = r2.zzw()
            long r9 = r9.zzq()
            r45 = r9
            goto L2d2
        L2d0:
            r45 = r17
        L2d2:
            com.google.android.gms.measurement.internal.zzam r9 = r2.zzf()
            java.lang.String r47 = r9.zzs()
            com.google.android.gms.measurement.internal.zzam r9 = r2.zzf()
            r10 = 1
            com.google.android.gms.measurement.internal.zzju r9 = r9.zzm(r12, r10)
            com.google.android.gms.measurement.internal.zze r10 = new com.google.android.gms.measurement.internal.zze
            r10.<init>(r9)
            java.lang.String r48 = r10.zzc()
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu
            long r13 = r9.zza
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzaR
            r10 = 0
            boolean r2 = r2.zzx(r10, r9)
            if (r2 == 0) goto L30e
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzmd r2 = r2.zzs()
            com.google.android.gms.internal.measurement.zzih r2 = r2.zzi()
            int r2 = r2.zza()
            r49 = r2
            goto L310
        L30e:
            r49 = 0
        L310:
            r9 = 119002(0x1d0da, double:5.8795E-319)
            r27 = 0
            r26 = r31
            r31 = r32
            r2 = r44
            r19 = r28
            r11 = r35
            r50 = r13
            r13 = r53
            r14 = r15
            r15 = r16
            r16 = r0
            r17 = r21
            r20 = r23
            r21 = r24
            r22 = r25
            r23 = r29
            r24 = r33
            r28 = r30
            r29 = r31
            r30 = r37
            r31 = r38
            r32 = r39
            r34 = r41
            r35 = r42
            r36 = r43
            r37 = r45
            r39 = r47
            r40 = r48
            r41 = r50
            r43 = r49
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r40, r41, r43)
            return r44
    }

    final java.lang.String zzl() {
            r3 = this;
            r3.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzbp
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            if (r0 == 0) goto L13
            return r2
        L13:
            java.lang.String r0 = r3.zzm
            return r0
    }

    final java.lang.String zzm() {
            r1 = this;
            r1.zza()
            java.lang.String r0 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r1.zza
            return r0
    }

    final java.lang.String zzn() {
            r1 = this;
            r1.zza()
            java.lang.String r0 = r1.zze
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r1.zze
            return r0
    }

    final java.lang.String zzo() {
            r1 = this;
            r1.zzg()
            r1.zza()
            java.lang.String r0 = r1.zzl
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r1.zzl
            return r0
    }

    final java.util.List zzp() {
            r1 = this;
            java.util.List r0 = r1.zzi
            return r0
    }

    final void zzq() {
            r7 = this;
            r7.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzjx r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r1 = r1.zzr(r2)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L26
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r4 = "Analytics Storage consent is not granted"
            r1.zza(r4)
            r1 = 0
            goto L46
        L26:
            r1 = 16
            byte[] r1 = new byte[r1]
            com.google.android.gms.measurement.internal.zzqf r4 = r0.zzw()
            java.security.SecureRandom r4 = r4.zzJ()
            r4.nextBytes(r1)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r3, r1)
            r5[r2] = r6
            java.lang.String r1 = "%032x"
            java.lang.String r1 = java.lang.String.format(r4, r1, r5)
        L46:
            com.google.android.gms.measurement.internal.zzhe r4 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzd()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r1 != 0) goto L55
            java.lang.String r5 = "null"
            goto L57
        L55:
            java.lang.String r5 = "not null"
        L57:
            r3[r2] = r5
            java.lang.String r2 = "Resetting session stitching token to %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r4.zza(r2)
            r7.zzn = r1
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r0 = r0.currentTimeMillis()
            r7.zzo = r0
            return
    }

    final boolean zzr(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.zzp
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Lc
            r1 = 1
        Lc:
            r2.zzp = r3
            return r1
    }
}
