package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzfh extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfh zzb = null;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzmj zzf;
    private com.google.android.gms.internal.measurement.zzmj zzg;
    private boolean zzh;
    private boolean zzi;

    static {
            com.google.android.gms.internal.measurement.zzfh r0 = new com.google.android.gms.internal.measurement.zzfh
            r0.<init>()
            com.google.android.gms.internal.measurement.zzfh.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzfh> r1 = com.google.android.gms.internal.measurement.zzfh.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzfh() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzf = r0
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzg = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfh zzd() {
            com.google.android.gms.internal.measurement.zzfh r0 = com.google.android.gms.internal.measurement.zzfh.zzb
            return r0
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzfh r2, int r3, com.google.android.gms.internal.measurement.zzfj r4) {
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

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzfh r2, int r3, com.google.android.gms.internal.measurement.zzfr r4) {
            r4.getClass()
            com.google.android.gms.internal.measurement.zzmj r0 = r2.zzf
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzco(r0)
            r2.zzf = r0
        L11:
            com.google.android.gms.internal.measurement.zzmj r2 = r2.zzf
            r2.set(r3, r4)
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final int zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzg
            int r0 = r0.size()
            return r0
    }

    public final int zzc() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzf
            int r0 = r0.size()
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzfj zze(int r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzg
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzfj r2 = (com.google.android.gms.internal.measurement.zzfj) r2
            return r2
    }

    public final com.google.android.gms.internal.measurement.zzfr zzf(int r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzf
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2
            return r2
    }

    public final java.util.List zzg() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzg
            return r0
    }

    public final java.util.List zzh() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzf
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
            com.google.android.gms.internal.measurement.zzfh r6 = com.google.android.gms.internal.measurement.zzfh.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzfg r6 = new com.google.android.gms.internal.measurement.zzfg
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzfh r6 = new com.google.android.gms.internal.measurement.zzfh
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
            java.lang.Class<com.google.android.gms.internal.measurement.zzfr> r7 = com.google.android.gms.internal.measurement.zzfr.class
            r6[r1] = r7
            java.lang.String r7 = "zzg"
            r6[r0] = r7
            java.lang.Class<com.google.android.gms.internal.measurement.zzfj> r7 = com.google.android.gms.internal.measurement.zzfj.class
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzh"
            r6[r7] = r8
            r7 = 7
            java.lang.String r8 = "zzi"
            r6[r7] = r8
            com.google.android.gms.internal.measurement.zzfh r7 = com.google.android.gms.internal.measurement.zzfh.zzb
            java.lang.String r8 = "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L52:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }
}
