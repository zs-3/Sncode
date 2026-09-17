package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzie extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzie zzb = null;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzmi zzf;

    static {
            com.google.android.gms.internal.measurement.zzie r0 = new com.google.android.gms.internal.measurement.zzie
            r0.<init>()
            com.google.android.gms.internal.measurement.zzie.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzie> r1 = com.google.android.gms.internal.measurement.zzie.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzie() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzmi r0 = com.google.android.gms.internal.measurement.zzmd.zzcl()
            r1.zzf = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zzid zzd() {
            com.google.android.gms.internal.measurement.zzie r0 = com.google.android.gms.internal.measurement.zzie.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzid r0 = (com.google.android.gms.internal.measurement.zzid) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzie zze() {
            com.google.android.gms.internal.measurement.zzie r0 = com.google.android.gms.internal.measurement.zzie.zzb
            return r0
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.measurement.zzie r2, java.lang.Iterable r3) {
            com.google.android.gms.internal.measurement.zzmi r0 = r2.zzf
            boolean r1 = r0.zzc()
            if (r1 != 0) goto Le
            com.google.android.gms.internal.measurement.zzmi r0 = com.google.android.gms.internal.measurement.zzmd.zzcm(r0)
            r2.zzf = r0
        Le:
            com.google.android.gms.internal.measurement.zzmi r2 = r2.zzf
            com.google.android.gms.internal.measurement.zzko.zzcc(r3, r2)
            return
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzie r1, int r2) {
            int r0 = r1.zzd
            r0 = r0 | 1
            r1.zzd = r0
            r1.zze = r2
            return
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmi r0 = r1.zzf
            int r0 = r0.size()
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final long zzc(int r3) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzmi r0 = r2.zzf
            long r0 = r0.zza(r3)
            return r0
    }

    public final java.util.List zzf() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmi r0 = r1.zzf
            return r0
    }

    public final boolean zzi() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 == 0) goto L3a
            r5 = 3
            r0 = 2
            if (r3 == r0) goto L22
            if (r3 == r5) goto L1c
            r4 = 4
            r5 = 0
            if (r3 == r4) goto L16
            r4 = 5
            if (r3 != r4) goto L15
            com.google.android.gms.internal.measurement.zzie r3 = com.google.android.gms.internal.measurement.zzie.zzb
            return r3
        L15:
            throw r5
        L16:
            com.google.android.gms.internal.measurement.zzid r3 = new com.google.android.gms.internal.measurement.zzid
            r3.<init>(r5)
            return r3
        L1c:
            com.google.android.gms.internal.measurement.zzie r3 = new com.google.android.gms.internal.measurement.zzie
            r3.<init>()
            return r3
        L22:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r5 = 0
            java.lang.String r1 = "zzd"
            r3[r5] = r1
            java.lang.String r5 = "zze"
            r3[r4] = r5
            java.lang.String r4 = "zzf"
            r3[r0] = r4
            com.google.android.gms.internal.measurement.zzie r4 = com.google.android.gms.internal.measurement.zzie.zzb
            java.lang.String r5 = "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmd.zzcq(r4, r5, r3)
            return r3
        L3a:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }
}
