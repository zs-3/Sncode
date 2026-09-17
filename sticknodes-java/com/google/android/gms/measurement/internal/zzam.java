package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzam extends com.google.android.gms.measurement.internal.zzjq {
    private java.lang.Boolean zza;
    private java.lang.String zzb;
    private com.google.android.gms.measurement.internal.zzal zzc;
    private java.lang.Boolean zzd;

    zzam(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzak r1 = new com.google.android.gms.measurement.internal.zzak
            r1.<init>()
            r0.zzc = r1
            return
    }

    public static final long zzF() {
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzd
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    public static final int zzG() {
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzi
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static final long zzH() {
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzk
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            return r0
    }

    public static final long zzI() {
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzQ
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    public static final long zzJ() {
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzL
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private final java.lang.String zzK(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r0 = ""
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            r5 = 0
            r4[r5] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            r6 = 1
            r4[r6] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            java.lang.reflect.Method r9 = r1.getMethod(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            r2[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            r2[r6] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            java.lang.Object r8 = r9.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L3b java.lang.NoSuchMethodException -> L4c java.lang.ClassNotFoundException -> L5d
            return r8
        L2a:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r1 = "SystemProperties.get() threw an exception"
            r9.zzb(r1, r8)
            goto L6d
        L3b:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r1 = "Could not access SystemProperties.get()"
            r9.zzb(r1, r8)
            goto L6d
        L4c:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r1 = "Could not find SystemProperties.get() method"
            r9.zzb(r1, r8)
            goto L6d
        L5d:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r1 = "Could not find SystemProperties class"
            r9.zzb(r1, r8)
        L6d:
            return r0
    }

    public final boolean zzA() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            r0.zzaV()
            java.lang.String r0 = "firebase_analytics_collection_deactivated"
            java.lang.Boolean r0 = r1.zzn(r0)
            if (r0 == 0) goto L15
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final boolean zzB(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzal r0 = r2.zzc
            java.lang.String r1 = "measurement.event_sampling_enabled"
            java.lang.String r3 = r0.zza(r3, r1)
            java.lang.String r0 = "1"
            boolean r3 = r0.equals(r3)
            return r3
    }

    final boolean zzC() {
            r1 = this;
            java.lang.Boolean r0 = r1.zza
            if (r0 != 0) goto L12
            java.lang.String r0 = "app_measurement_lite"
            java.lang.Boolean r0 = r1.zzn(r0)
            r1.zza = r0
            if (r0 != 0) goto L12
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.zza = r0
        L12:
            java.lang.Boolean r0 = r1.zza
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            boolean r0 = r0.zzN()
            if (r0 != 0) goto L23
            goto L25
        L23:
            r0 = 0
            return r0
        L25:
            r0 = 1
            return r0
    }

    public final boolean zzD() {
            r4 = this;
            java.lang.Boolean r0 = r4.zzd
            if (r0 != 0) goto L45
            monitor-enter(r4)
            java.lang.Boolean r0 = r4.zzd     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L40
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu     // Catch: java.lang.Throwable -> L42
            android.content.Context r1 = r0.zzaT()     // Catch: java.lang.Throwable -> L42
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2b
            java.lang.String r1 = r1.processName     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r1 == 0) goto L25
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L25
            r3 = 1
        L25:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L42
            r4.zzd = r1     // Catch: java.lang.Throwable -> L42
        L2b:
            java.lang.Boolean r1 = r4.zzd     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L40
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42
            r4.zzd = r1     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "My process not in the list of running processes"
            r0.zza(r1)     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r0
        L45:
            java.lang.Boolean r0 = r4.zzd
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final boolean zzE() {
            r1 = this;
            java.lang.String r0 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r0 = r1.zzn(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final double zza(java.lang.String r5, com.google.android.gms.measurement.internal.zzgg r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r5 = r6.zza(r1)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            return r5
        L12:
            com.google.android.gms.measurement.internal.zzal r0 = r4.zzc
            java.lang.String r2 = r6.zzb()
            java.lang.String r5 = r0.zza(r5, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L2d
            java.lang.Object r5 = r6.zza(r1)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            return r5
        L2d:
            double r2 = java.lang.Double.parseDouble(r5)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Double r5 = java.lang.Double.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Double r5 = (java.lang.Double) r5     // Catch: java.lang.NumberFormatException -> L40
            double r5 = r5.doubleValue()     // Catch: java.lang.NumberFormatException -> L40
            return r5
        L40:
            java.lang.Object r5 = r6.zza(r1)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            return r5
    }

    final int zzb(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzV
            r1 = 500(0x1f4, float:7.0E-43)
            r2 = 2000(0x7d0, float:2.803E-42)
            int r4 = r3.zzi(r4, r0, r1, r2)
            return r4
    }

    final int zzc(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r4 == 0) goto Ld
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzag
            r1 = 100
            int r3 = r2.zzi(r3, r4, r1, r0)
            return r3
        Ld:
            return r0
    }

    final int zzd(java.lang.String r1, boolean r2) {
            r0 = this;
            int r1 = r0.zzc(r1, r2)
            r2 = 256(0x100, float:3.59E-43)
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public final int zze() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            r2 = 1
            boolean r0 = r0.zzao(r1, r2)
            if (r0 == 0) goto L13
            r0 = 100
            return r0
        L13:
            r0 = 25
            return r0
    }

    public final int zzf(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzW
            r1 = 25
            r2 = 100
            int r4 = r3.zzi(r4, r0, r1, r2)
            return r4
    }

    public final int zzh(java.lang.String r4, com.google.android.gms.measurement.internal.zzgg r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r4 = r5.zza(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        L12:
            com.google.android.gms.measurement.internal.zzal r0 = r3.zzc
            java.lang.String r2 = r5.zzb()
            java.lang.String r4 = r0.zza(r4, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L2d
            java.lang.Object r4 = r5.zza(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        L2d:
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.NumberFormatException -> L40
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L40
            return r4
        L40:
            java.lang.Object r4 = r5.zza(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
    }

    public final int zzi(java.lang.String r1, com.google.android.gms.measurement.internal.zzgg r2, int r3, int r4) {
            r0 = this;
            int r1 = r0.zzh(r1, r2)
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = java.lang.Math.max(r1, r3)
            return r1
    }

    public final long zzj() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            r0.zzaV()
            r0 = 119002(0x1d0da, double:5.8795E-319)
            return r0
    }

    public final long zzk(java.lang.String r5, com.google.android.gms.measurement.internal.zzgg r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r5 = r6.zza(r1)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            return r5
        L12:
            com.google.android.gms.measurement.internal.zzal r0 = r4.zzc
            java.lang.String r2 = r6.zzb()
            java.lang.String r5 = r0.zza(r5, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L2d
            java.lang.Object r5 = r6.zza(r1)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            return r5
        L2d:
            long r2 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.NumberFormatException -> L40
            long r5 = r5.longValue()     // Catch: java.lang.NumberFormatException -> L40
            return r5
        L40:
            java.lang.Object r5 = r6.zza(r1)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            return r5
    }

    final android.os.Bundle zzl() {
            r5 = this;
            r0 = 0
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            android.content.Context r2 = r1.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            if (r2 != 0) goto L1b
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            java.lang.String r2 = "Failed to load metadata: PackageManager is null"
            r1.zza(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            return r0
        L1b:
            android.content.Context r2 = r1.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            android.content.Context r3 = r1.zzaT()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            if (r2 != 0) goto L41
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            java.lang.String r2 = "Failed to load metadata: ApplicationInfo is null"
            r1.zza(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            return r0
        L41:
            android.os.Bundle r0 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            return r0
        L44:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Failed to load metadata: Package name not found"
            r2.zzb(r3, r1)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzju zzm(java.lang.String r4, boolean r5) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            android.os.Bundle r1 = r3.zzl()
            if (r1 != 0) goto L1a
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to load metadata: Metadata bundle is null"
            r1.zza(r2)
            r1 = 0
            goto L1e
        L1a:
            java.lang.Object r1 = r1.get(r4)
        L1e:
            if (r1 != 0) goto L23
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zza
            return r4
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2e
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zzd
            return r4
        L2e:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zzc
            return r4
        L39:
            if (r5 == 0) goto L46
            java.lang.String r5 = "eu_consent_policy"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L46
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zzb
            return r4
        L46:
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()
            java.lang.String r0 = "Invalid manifest metadata for"
            r5.zzb(r0, r4)
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zza
            return r4
    }

    final java.lang.Boolean zzn(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzl()
            r1 = 0
            if (r0 != 0) goto L1a
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
            return r1
        L1a:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L21
            return r1
        L21:
            boolean r4 = r0.getBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }

    public final java.lang.String zzo() {
            r2 = this;
            java.lang.String r0 = "debug.firebase.analytics.app"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.zzK(r0, r1)
            return r0
    }

    public final java.lang.String zzp() {
            r2 = this;
            java.lang.String r0 = "debug.deferred.deeplink"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.zzK(r0, r1)
            return r0
    }

    final java.lang.String zzq() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            r0.zzaV()
            java.lang.String r0 = "FA"
            return r0
    }

    public final java.lang.String zzr(java.lang.String r3, com.google.android.gms.measurement.internal.zzgg r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            r3 = 0
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        Le:
            com.google.android.gms.measurement.internal.zzal r0 = r2.zzc
            java.lang.String r1 = r4.zzb()
            java.lang.String r3 = r0.zza(r3, r1)
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public final java.lang.String zzs() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    final java.util.List zzt(java.lang.String r4) {
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzl()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L58:
            return r1
    }

    final void zzu(com.google.android.gms.measurement.internal.zzal r1) {
            r0 = this;
            r0.zzc = r1
            return
    }

    public final void zzv(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    public final boolean zzw() {
            r1 = this;
            java.lang.String r0 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r0 = r1.zzn(r0)
            if (r0 == 0) goto L11
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public final boolean zzx(java.lang.String r4, com.google.android.gms.measurement.internal.zzgg r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r4 = r5.zza(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L12:
            com.google.android.gms.measurement.internal.zzal r0 = r3.zzc
            java.lang.String r2 = r5.zzb()
            java.lang.String r4 = r0.zza(r4, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L2d
            java.lang.Object r4 = r5.zza(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L2d:
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    public final boolean zzy(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzal r0 = r2.zzc
            java.lang.String r1 = "gaia_collection_enabled"
            java.lang.String r3 = r0.zza(r3, r1)
            java.lang.String r0 = "1"
            boolean r3 = r0.equals(r3)
            return r3
    }

    public final boolean zzz() {
            r1 = this;
            java.lang.String r0 = "google_analytics_automatic_screen_reporting_enabled"
            java.lang.Boolean r0 = r1.zzn(r0)
            if (r0 == 0) goto L11
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }
}
