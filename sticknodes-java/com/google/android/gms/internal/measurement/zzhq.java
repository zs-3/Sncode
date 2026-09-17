package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhq extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhq zzb = null;
    private int zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private long zzg;
    private float zzh;
    private double zzi;
    private com.google.android.gms.internal.measurement.zzmj zzj;

    static {
            com.google.android.gms.internal.measurement.zzhq r0 = new com.google.android.gms.internal.measurement.zzhq
            r0.<init>()
            com.google.android.gms.internal.measurement.zzhq.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzhq> r1 = com.google.android.gms.internal.measurement.zzhq.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzhq() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            r1.zzf = r0
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzj = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zzhp zze() {
            com.google.android.gms.internal.measurement.zzhq r0 = com.google.android.gms.internal.measurement.zzhq.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzhp r0 = (com.google.android.gms.internal.measurement.zzhp) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhq zzf() {
            com.google.android.gms.internal.measurement.zzhq r0 = com.google.android.gms.internal.measurement.zzhq.zzb
            return r0
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhq r0, java.lang.Iterable r1) {
            r0.zzz()
            com.google.android.gms.internal.measurement.zzmj r0 = r0.zzj
            com.google.android.gms.internal.measurement.zzko.zzcc(r1, r0)
            return
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzhq r0, com.google.android.gms.internal.measurement.zzhq r1) {
            r1.getClass()
            r0.zzz()
            com.google.android.gms.internal.measurement.zzmj r0 = r0.zzj
            r0.add(r1)
            return
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzhq r2) {
            int r0 = r2.zzd
            r0 = r0 & (-17)
            r2.zzd = r0
            r0 = 0
            r2.zzi = r0
            return
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhq r2) {
            int r0 = r2.zzd
            r0 = r0 & (-5)
            r2.zzd = r0
            r0 = 0
            r2.zzg = r0
            return
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzhq r1) {
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzj = r0
            return
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzhq r1) {
            int r0 = r1.zzd
            r0 = r0 & (-3)
            r1.zzd = r0
            com.google.android.gms.internal.measurement.zzhq r0 = com.google.android.gms.internal.measurement.zzhq.zzb
            java.lang.String r0 = r0.zzf
            r1.zzf = r0
            return
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.measurement.zzhq r1, double r2) {
            int r0 = r1.zzd
            r0 = r0 | 16
            r1.zzd = r0
            r1.zzi = r2
            return
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.measurement.zzhq r1, long r2) {
            int r0 = r1.zzd
            r0 = r0 | 4
            r1.zzd = r0
            r1.zzg = r2
            return
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.measurement.zzhq r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzd
            r0 = r0 | 1
            r1.zzd = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzt(com.google.android.gms.internal.measurement.zzhq r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzd
            r0 = r0 | 2
            r1.zzd = r0
            r1.zzf = r2
            return
    }

    private final void zzz() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r2.zzj
            boolean r1 = r0.zzc()
            if (r1 != 0) goto Le
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzco(r0)
            r2.zzj = r0
        Le:
            return
    }

    public final double zza() {
            r2 = this;
            double r0 = r2.zzi
            return r0
    }

    public final float zzb() {
            r1 = this;
            float r0 = r1.zzh
            return r0
    }

    public final int zzc() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzj
            int r0 = r0.size()
            return r0
    }

    public final long zzd() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.util.List zzi() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L52
            r8 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r2) goto L22
            if (r6 == r1) goto L1c
            r7 = 0
            if (r6 == r0) goto L16
            if (r6 != r8) goto L15
            com.google.android.gms.internal.measurement.zzhq r6 = com.google.android.gms.internal.measurement.zzhq.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzhp r6 = new com.google.android.gms.internal.measurement.zzhp
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzhq r6 = new com.google.android.gms.internal.measurement.zzhq
            r6.<init>()
            return r6
        L22:
            r6 = 8
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
            r7 = 7
            java.lang.Class<com.google.android.gms.internal.measurement.zzhq> r8 = com.google.android.gms.internal.measurement.zzhq.class
            r6[r7] = r8
            com.google.android.gms.internal.measurement.zzhq r7 = com.google.android.gms.internal.measurement.zzhq.zzb
            java.lang.String r8 = "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L52:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    public final boolean zzu() {
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

    public final boolean zzv() {
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

    public final boolean zzw() {
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

    public final boolean zzx() {
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

    public final boolean zzy() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
