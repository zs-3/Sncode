package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhi extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhi zzb = null;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzic zzf;
    private com.google.android.gms.internal.measurement.zzic zzg;
    private boolean zzh;

    static {
            com.google.android.gms.internal.measurement.zzhi r0 = new com.google.android.gms.internal.measurement.zzhi
            r0.<init>()
            com.google.android.gms.internal.measurement.zzhi.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzhi> r1 = com.google.android.gms.internal.measurement.zzhi.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzhi() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.measurement.zzhh zzb() {
            com.google.android.gms.internal.measurement.zzhi r0 = com.google.android.gms.internal.measurement.zzhi.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzhh r0 = (com.google.android.gms.internal.measurement.zzhh) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhi zzc() {
            com.google.android.gms.internal.measurement.zzhi r0 = com.google.android.gms.internal.measurement.zzhi.zzb
            return r0
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzhi r1, int r2) {
            int r0 = r1.zzd
            r0 = r0 | 1
            r1.zzd = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.measurement.zzhi r0, com.google.android.gms.internal.measurement.zzic r1) {
            r1.getClass()
            r0.zzf = r1
            int r1 = r0.zzd
            r1 = r1 | 2
            r0.zzd = r1
            return
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzhi r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 8
            r1.zzd = r0
            r1.zzh = r2
            return
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzhi r0, com.google.android.gms.internal.measurement.zzic r1) {
            r0.zzg = r1
            int r1 = r0.zzd
            r1 = r1 | 4
            r0.zzd = r1
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzic zzd() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzic r0 = r1.zzf
            if (r0 != 0) goto L8
            com.google.android.gms.internal.measurement.zzic r0 = com.google.android.gms.internal.measurement.zzic.zzg()
        L8:
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzic zze() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzic r0 = r1.zzg
            if (r0 != 0) goto L8
            com.google.android.gms.internal.measurement.zzic r0 = com.google.android.gms.internal.measurement.zzic.zzg()
        L8:
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }

    public final boolean zzk() {
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
    protected final java.lang.Object zzl(int r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r5 = r5 + (-1)
            r6 = 1
            if (r5 == 0) goto L42
            r7 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r5 == r2) goto L22
            if (r5 == r1) goto L1c
            r6 = 0
            if (r5 == r0) goto L16
            if (r5 != r7) goto L15
            com.google.android.gms.internal.measurement.zzhi r5 = com.google.android.gms.internal.measurement.zzhi.zzb
            return r5
        L15:
            throw r6
        L16:
            com.google.android.gms.internal.measurement.zzhh r5 = new com.google.android.gms.internal.measurement.zzhh
            r5.<init>(r6)
            return r5
        L1c:
            com.google.android.gms.internal.measurement.zzhi r5 = new com.google.android.gms.internal.measurement.zzhi
            r5.<init>()
            return r5
        L22:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            java.lang.String r3 = "zzd"
            r5[r7] = r3
            java.lang.String r7 = "zze"
            r5[r6] = r7
            java.lang.String r6 = "zzf"
            r5[r2] = r6
            java.lang.String r6 = "zzg"
            r5[r1] = r6
            java.lang.String r6 = "zzh"
            r5[r0] = r6
            com.google.android.gms.internal.measurement.zzhi r6 = com.google.android.gms.internal.measurement.zzhi.zzb
            java.lang.String r7 = "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmd.zzcq(r6, r7, r5)
            return r5
        L42:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r6)
            return r5
    }

    public final boolean zzm() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean zzn() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
