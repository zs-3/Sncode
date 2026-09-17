package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhv extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhv zzb = null;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmj zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private int zzh;

    static {
            com.google.android.gms.internal.measurement.zzhv r0 = new com.google.android.gms.internal.measurement.zzhv
            r0.<init>()
            com.google.android.gms.internal.measurement.zzhv.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzhv> r1 = com.google.android.gms.internal.measurement.zzhv.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzhv() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zze = r0
            java.lang.String r0 = ""
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zzht zzb() {
            com.google.android.gms.internal.measurement.zzhv r0 = com.google.android.gms.internal.measurement.zzhv.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzht r0 = (com.google.android.gms.internal.measurement.zzht) r0
            return r0
    }

    public static com.google.android.gms.internal.measurement.zzht zzc(com.google.android.gms.internal.measurement.zzhv r1) {
            com.google.android.gms.internal.measurement.zzhv r0 = com.google.android.gms.internal.measurement.zzhv.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            r0.zzaY(r1)
            com.google.android.gms.internal.measurement.zzht r0 = (com.google.android.gms.internal.measurement.zzht) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhv zzd() {
            com.google.android.gms.internal.measurement.zzhv r0 = com.google.android.gms.internal.measurement.zzhv.zzb
            return r0
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzhv r0, java.lang.Iterable r1) {
            r0.zzr()
            com.google.android.gms.internal.measurement.zzmj r0 = r0.zze
            com.google.android.gms.internal.measurement.zzko.zzcc(r1, r0)
            return
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhv r0, com.google.android.gms.internal.measurement.zzhx r1) {
            r1.getClass()
            r0.zzr()
            com.google.android.gms.internal.measurement.zzmj r0 = r0.zze
            r0.add(r1)
            return
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzhv r1) {
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zze = r0
            return
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzhv r0, int r1, com.google.android.gms.internal.measurement.zzhx r2) {
            r2.getClass()
            r0.zzr()
            com.google.android.gms.internal.measurement.zzmj r0 = r0.zze
            r0.set(r1, r2)
            return
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhv r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzd
            r0 = r0 | 1
            r1.zzd = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzhv r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzd
            r0 = r0 | 2
            r1.zzd = r0
            r1.zzg = r2
            return
    }

    private final void zzr() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r2.zze
            boolean r1 = r0.zzc()
            if (r1 != 0) goto Le
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzco(r0)
            r2.zze = r0
        Le:
            return
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zze
            int r0 = r0.size()
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzhx zze(int r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zze
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2
            return r2
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    public final java.util.List zzh() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zze
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
            com.google.android.gms.internal.measurement.zzhv r6 = com.google.android.gms.internal.measurement.zzhv.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzht r6 = new com.google.android.gms.internal.measurement.zzht
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzhv r6 = new com.google.android.gms.internal.measurement.zzhv
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
            java.lang.Class<com.google.android.gms.internal.measurement.zzhx> r7 = com.google.android.gms.internal.measurement.zzhx.class
            r6[r2] = r7
            java.lang.String r7 = "zzf"
            r6[r1] = r7
            java.lang.String r7 = "zzg"
            r6[r0] = r7
            java.lang.String r7 = "zzh"
            r6[r8] = r7
            r7 = 6
            com.google.android.gms.internal.measurement.zzmg r8 = com.google.android.gms.internal.measurement.zzhu.zza
            r6[r7] = r8
            com.google.android.gms.internal.measurement.zzhv r7 = com.google.android.gms.internal.measurement.zzhv.zzb
            java.lang.String r8 = "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L4c:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
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
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
