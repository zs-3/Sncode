package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhe extends com.google.android.gms.measurement.internal.zzjr {
    private char zza;
    private long zzb;
    private java.lang.String zzc;
    private final com.google.android.gms.measurement.internal.zzhc zzd;
    private final com.google.android.gms.measurement.internal.zzhc zze;
    private final com.google.android.gms.measurement.internal.zzhc zzf;
    private final com.google.android.gms.measurement.internal.zzhc zzg;
    private final com.google.android.gms.measurement.internal.zzhc zzh;
    private final com.google.android.gms.measurement.internal.zzhc zzi;
    private final com.google.android.gms.measurement.internal.zzhc zzj;
    private final com.google.android.gms.measurement.internal.zzhc zzk;
    private final com.google.android.gms.measurement.internal.zzhc zzl;

    zzhe(com.google.android.gms.measurement.internal.zzio r4) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.zza = r4
            r0 = -1
            r3.zzb = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r1 = 6
            r0.<init>(r3, r1, r4, r4)
            r3.zzd = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r2 = 1
            r0.<init>(r3, r1, r2, r4)
            r3.zze = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r0.<init>(r3, r1, r4, r2)
            r3.zzf = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r1 = 5
            r0.<init>(r3, r1, r4, r4)
            r3.zzg = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r0.<init>(r3, r1, r2, r4)
            r3.zzh = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r0.<init>(r3, r1, r4, r2)
            r3.zzi = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r1 = 4
            r0.<init>(r3, r1, r4, r4)
            r3.zzj = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r1 = 3
            r0.<init>(r3, r1, r4, r4)
            r3.zzk = r0
            com.google.android.gms.measurement.internal.zzhc r0 = new com.google.android.gms.measurement.internal.zzhc
            r1 = 2
            r0.<init>(r3, r1, r4, r4)
            r3.zzl = r0
            return
    }

    static /* bridge */ /* synthetic */ char zza(com.google.android.gms.measurement.internal.zzhe r0) {
            char r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ long zzb(com.google.android.gms.measurement.internal.zzhe r2) {
            long r0 = r2.zzb
            return r0
    }

    protected static java.lang.Object zzn(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.google.android.gms.measurement.internal.zzhd r0 = new com.google.android.gms.measurement.internal.zzhd
            r0.<init>(r1)
            return r0
    }

    static java.lang.String zzo(boolean r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            java.lang.String r4 = zzp(r2, r4)
            java.lang.String r5 = zzp(r2, r5)
            java.lang.String r2 = zzp(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = ""
            if (r3 != 0) goto L16
            r3 = r0
        L16:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L21
            r6.append(r3)
            java.lang.String r0 = ": "
        L21:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ", "
            if (r3 != 0) goto L30
            r6.append(r0)
            r6.append(r4)
            r0 = r1
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L3d
            r6.append(r0)
            r6.append(r5)
            goto L3e
        L3d:
            r1 = r0
        L3e:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L4a
            r6.append(r1)
            r6.append(r2)
        L4a:
            java.lang.String r2 = r6.toString()
            return r2
    }

    static java.lang.String zzp(boolean r9, java.lang.Object r10) {
            java.lang.String r0 = ""
            if (r10 != 0) goto L5
            return r0
        L5:
            boolean r1 = r10 instanceof java.lang.Integer
            if (r1 == 0) goto L14
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            long r1 = (long) r10
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
        L14:
            boolean r1 = r10 instanceof java.lang.Long
            java.lang.String r2 = "-"
            r3 = 0
            if (r1 == 0) goto L8d
            if (r9 != 0) goto L22
            java.lang.String r9 = r10.toString()
            return r9
        L22:
            r9 = r10
            java.lang.Long r9 = (java.lang.Long) r9
            long r4 = r9.longValue()
            long r4 = java.lang.Math.abs(r4)
            r6 = 100
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L38
            java.lang.String r9 = r10.toString()
            return r9
        L38:
            java.lang.String r10 = r10.toString()
            char r10 = r10.charAt(r3)
            long r3 = r9.longValue()
            long r3 = java.lang.Math.abs(r3)
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r1 = r9.length()
            int r1 = r1 + (-1)
            double r3 = (double) r1
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r3 = java.lang.Math.pow(r5, r3)
            long r3 = java.lang.Math.round(r3)
            int r9 = r9.length()
            double r7 = (double) r9
            double r5 = java.lang.Math.pow(r5, r7)
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r5 = r5 + r7
            long r5 = java.lang.Math.round(r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r1 = 45
            if (r10 != r1) goto L77
            r0 = r2
        L77:
            r9.append(r0)
            r9.append(r3)
            java.lang.String r10 = "..."
            r9.append(r10)
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            return r9
        L8d:
            boolean r0 = r10 instanceof java.lang.Boolean
            if (r0 == 0) goto L96
            java.lang.String r9 = r10.toString()
            return r9
        L96:
            boolean r0 = r10 instanceof java.lang.Throwable
            if (r0 == 0) goto Leb
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r9 == 0) goto La9
            java.lang.Class r9 = r10.getClass()
            java.lang.String r9 = r9.getName()
            goto Lad
        La9:
            java.lang.String r9 = r10.toString()
        Lad:
            r0.<init>(r9)
            java.lang.Class<com.google.android.gms.measurement.internal.zzio> r9 = com.google.android.gms.measurement.internal.zzio.class
            java.lang.String r9 = r9.getCanonicalName()
            java.lang.String r9 = zzq(r9)
            java.lang.StackTraceElement[] r10 = r10.getStackTrace()
            int r1 = r10.length
        Lbf:
            if (r3 >= r1) goto Le6
            r2 = r10[r3]
            boolean r4 = r2.isNativeMethod()
            if (r4 == 0) goto Lca
            goto Le3
        Lca:
            java.lang.String r4 = r2.getClassName()
            if (r4 == 0) goto Le3
            java.lang.String r4 = zzq(r4)
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto Le3
            java.lang.String r9 = ": "
            r0.append(r9)
            r0.append(r2)
            goto Le6
        Le3:
            int r3 = r3 + 1
            goto Lbf
        Le6:
            java.lang.String r9 = r0.toString()
            return r9
        Leb:
            boolean r0 = r10 instanceof com.google.android.gms.measurement.internal.zzhd
            if (r0 == 0) goto Lf6
            com.google.android.gms.measurement.internal.zzhd r10 = (com.google.android.gms.measurement.internal.zzhd) r10
            java.lang.String r9 = com.google.android.gms.measurement.internal.zzhd.zza(r10)
            return r9
        Lf6:
            if (r9 == 0) goto Lf9
            return r2
        Lf9:
            java.lang.String r9 = r10.toString()
            return r9
    }

    static java.lang.String zzq(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            r2 = -1
            if (r0 != r2) goto L13
            goto L18
        L13:
            r1 = 0
            java.lang.String r1 = r3.substring(r1, r0)
        L18:
            return r1
    }

    static /* bridge */ /* synthetic */ void zzs(com.google.android.gms.measurement.internal.zzhe r0, long r1) {
            r1 = 119002(0x1d0da, double:5.8795E-319)
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzt(com.google.android.gms.measurement.internal.zzhe r0, char r1) {
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzd() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzk
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zze() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzf() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzh() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzi() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzj
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzj() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzl
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzk() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzg
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzl() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzi
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhc zzm() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzh
            return r0
    }

    protected final java.lang.String zzr() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.zzc     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L20
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r0.zzz()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L14
            java.lang.String r0 = r0.zzz()     // Catch: java.lang.Throwable -> L29
            r2.zzc = r0     // Catch: java.lang.Throwable -> L29
            goto L20
        L14:
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r0.zzq()     // Catch: java.lang.Throwable -> L29
            r2.zzc = r0     // Catch: java.lang.Throwable -> L29
        L20:
            java.lang.String r0 = r2.zzc     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r2.zzc     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            return r0
        L29:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    protected final void zzu(int r8, boolean r9, boolean r10, java.lang.String r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r7 = this;
            if (r9 != 0) goto L18
            java.lang.String r9 = r7.zzr()
            boolean r9 = android.util.Log.isLoggable(r9, r8)
            if (r9 == 0) goto L18
            r9 = 0
            java.lang.String r9 = zzo(r9, r11, r12, r13, r14)
            java.lang.String r0 = r7.zzr()
            android.util.Log.println(r8, r0, r9)
        L18:
            if (r10 != 0) goto L5b
            r9 = 5
            if (r8 < r9) goto L5b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            com.google.android.gms.measurement.internal.zzio r9 = r7.zzu
            com.google.android.gms.measurement.internal.zzil r9 = r9.zzo()
            r10 = 6
            if (r9 != 0) goto L33
            java.lang.String r8 = r7.zzr()
            java.lang.String r9 = "Scheduler not set. Not logging error/warn"
            android.util.Log.println(r10, r8, r9)
            return
        L33:
            boolean r0 = r9.zzy()
            if (r0 != 0) goto L43
            java.lang.String r8 = r7.zzr()
            java.lang.String r9 = "Scheduler not initialized. Not logging error/warn"
            android.util.Log.println(r10, r8, r9)
            return
        L43:
            r10 = 9
            if (r8 < r10) goto L4c
            r8 = 8
            r2 = 8
            goto L4d
        L4c:
            r2 = r8
        L4d:
            com.google.android.gms.measurement.internal.zzhb r8 = new com.google.android.gms.measurement.internal.zzhb
            r0 = r8
            r1 = r7
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zzq(r8)
        L5b:
            return
    }
}
