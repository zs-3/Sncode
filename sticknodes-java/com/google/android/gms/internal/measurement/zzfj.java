package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzfj extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfj zzb = null;
    private int zzd;
    private int zze;
    private java.lang.String zzf;
    private com.google.android.gms.internal.measurement.zzmj zzg;
    private boolean zzh;
    private com.google.android.gms.internal.measurement.zzfp zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
            com.google.android.gms.internal.measurement.zzfj r0 = new com.google.android.gms.internal.measurement.zzfj
            r0.<init>()
            com.google.android.gms.internal.measurement.zzfj.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzfj> r1 = com.google.android.gms.internal.measurement.zzfj.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzfj() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzf = r0
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zzfi zzc() {
            com.google.android.gms.internal.measurement.zzfj r0 = com.google.android.gms.internal.measurement.zzfj.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzfi r0 = (com.google.android.gms.internal.measurement.zzfi) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfj zzd() {
            com.google.android.gms.internal.measurement.zzfj r0 = com.google.android.gms.internal.measurement.zzfj.zzb
            return r0
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzfj r1, java.lang.String r2) {
            int r0 = r1.zzd
            r0 = r0 | 2
            r1.zzd = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzfj r2, int r3, com.google.android.gms.internal.measurement.zzfl r4) {
            r4.getClass()
            com.google.android.gms.internal.measurement.zzmj r0 = r2.zzg
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzco(r0)
            r2.zzg = r0
        L11:
            com.google.android.gms.internal.measurement.zzmj r2 = r2.zzg
            r2.set(r3, r4)
            return
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzg
            int r0 = r0.size()
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzfl zze(int r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzg
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzfl r2 = (com.google.android.gms.internal.measurement.zzfl) r2
            return r2
    }

    public final com.google.android.gms.internal.measurement.zzfp zzf() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfp r0 = r1.zzi
            if (r0 != 0) goto L8
            com.google.android.gms.internal.measurement.zzfp r0 = com.google.android.gms.internal.measurement.zzfp.zzb()
        L8:
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.util.List zzh() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzg
            return r0
    }

    public final boolean zzk() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L5e
            r8 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r2) goto L22
            if (r6 == r1) goto L1c
            r7 = 0
            if (r6 == r0) goto L16
            if (r6 != r8) goto L15
            com.google.android.gms.internal.measurement.zzfj r6 = com.google.android.gms.internal.measurement.zzfj.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzfi r6 = new com.google.android.gms.internal.measurement.zzfi
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzfj r6 = new com.google.android.gms.internal.measurement.zzfj
            r6.<init>()
            return r6
        L22:
            r6 = 10
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
            java.lang.Class<com.google.android.gms.internal.measurement.zzfl> r7 = com.google.android.gms.internal.measurement.zzfl.class
            r6[r0] = r7
            java.lang.String r7 = "zzh"
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzi"
            r6[r7] = r8
            r7 = 7
            java.lang.String r8 = "zzj"
            r6[r7] = r8
            r7 = 8
            java.lang.String r8 = "zzk"
            r6[r7] = r8
            r7 = 9
            java.lang.String r8 = "zzl"
            r6[r7] = r8
            com.google.android.gms.internal.measurement.zzfj r7 = com.google.android.gms.internal.measurement.zzfj.zzb
            java.lang.String r8 = "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L5e:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    public final boolean zzm() {
            r1 = this;
            boolean r0 = r1.zzk
            return r0
    }

    public final boolean zzn() {
            r1 = this;
            boolean r0 = r1.zzl
            return r0
    }

    public final boolean zzo() {
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

    public final boolean zzp() {
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

    public final boolean zzq() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 64
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
