package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzio extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzio zzb = null;
    private int zzd;
    private long zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
            com.google.android.gms.internal.measurement.zzio r0 = new com.google.android.gms.internal.measurement.zzio
            r0.<init>()
            com.google.android.gms.internal.measurement.zzio.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzio> r1 = com.google.android.gms.internal.measurement.zzio.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzio() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zzin zze() {
            com.google.android.gms.internal.measurement.zzio r0 = com.google.android.gms.internal.measurement.zzio.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzin r0 = (com.google.android.gms.internal.measurement.zzin) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzio zzf() {
            com.google.android.gms.internal.measurement.zzio r0 = com.google.android.gms.internal.measurement.zzio.zzb
            return r0
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzio r2) {
            int r0 = r2.zzd
            r0 = r0 & (-33)
            r2.zzd = r0
            r0 = 0
            r2.zzj = r0
            return
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzio r2) {
            int r0 = r2.zzd
            r0 = r0 & (-9)
            r2.zzd = r0
            r0 = 0
            r2.zzh = r0
            return
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzio r1) {
            int r0 = r1.zzd
            r0 = r0 & (-5)
            r1.zzd = r0
            com.google.android.gms.internal.measurement.zzio r0 = com.google.android.gms.internal.measurement.zzio.zzb
            java.lang.String r0 = r0.zzg
            r1.zzg = r0
            return
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzio r1, double r2) {
            int r0 = r1.zzd
            r0 = r0 | 32
            r1.zzd = r0
            r1.zzj = r2
            return
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzio r1, long r2) {
            int r0 = r1.zzd
            r0 = r0 | 8
            r1.zzd = r0
            r1.zzh = r2
            return
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzio r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzd
            r0 = r0 | 2
            r1.zzd = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzio r1, long r2) {
            int r0 = r1.zzd
            r0 = r0 | 1
            r1.zzd = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.measurement.zzio r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzd
            r0 = r0 | 4
            r1.zzd = r0
            r1.zzg = r2
            return
    }

    public final double zza() {
            r2 = this;
            double r0 = r2.zzj
            return r0
    }

    public final float zzb() {
            r1 = this;
            float r0 = r1.zzi
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    public final long zzd() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L4c
            r8 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r2) goto L22
            if (r6 == r1) goto L1c
            r7 = 0
            if (r6 == r0) goto L16
            if (r6 != r8) goto L15
            com.google.android.gms.internal.measurement.zzio r6 = com.google.android.gms.internal.measurement.zzio.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzin r6 = new com.google.android.gms.internal.measurement.zzin
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzio r6 = new com.google.android.gms.internal.measurement.zzio
            r6.<init>()
            return r6
        L22:
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            java.lang.String r4 = "zzd"
            r6[r3] = r4
            java.lang.String r3 = "zze"
            r6[r7] = r3
            java.lang.String r7 = "zzf"
            r6[r2] = r7
            java.lang.String r7 = "zzg"
            r6[r1] = r7
            java.lang.String r7 = "zzh"
            r6[r0] = r7
            java.lang.String r7 = "zzi"
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzj"
            r6[r7] = r8
            com.google.android.gms.internal.measurement.zzio r7 = com.google.android.gms.internal.measurement.zzio.zzb
            java.lang.String r8 = "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L4c:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    public final boolean zzr() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean zzs() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean zzt() {
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

    public final boolean zzu() {
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

    public final boolean zzv() {
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
