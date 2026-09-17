package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhg extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhg zzb = null;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
            com.google.android.gms.internal.measurement.zzhg r0 = new com.google.android.gms.internal.measurement.zzhg
            r0.<init>()
            com.google.android.gms.internal.measurement.zzhg.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzhg> r1 = com.google.android.gms.internal.measurement.zzhg.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzhg() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.measurement.zzhf zza() {
            com.google.android.gms.internal.measurement.zzhg r0 = com.google.android.gms.internal.measurement.zzhg.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzhf r0 = (com.google.android.gms.internal.measurement.zzhf) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhg zzb() {
            com.google.android.gms.internal.measurement.zzhg r0 = com.google.android.gms.internal.measurement.zzhg.zzb
            return r0
    }

    public static com.google.android.gms.internal.measurement.zzhg zzc() {
            com.google.android.gms.internal.measurement.zzhg r0 = com.google.android.gms.internal.measurement.zzhg.zzb
            return r0
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 32
            r1.zzd = r0
            r1.zzj = r2
            return
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 16
            r1.zzd = r0
            r1.zzi = r2
            return
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 1
            r1.zzd = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 64
            r1.zzd = r0
            r1.zzk = r2
            return
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 2
            r1.zzd = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 4
            r1.zzd = r0
            r1.zzg = r2
            return
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhg r1, boolean r2) {
            int r0 = r1.zzd
            r0 = r0 | 8
            r1.zzd = r0
            r1.zzh = r2
            return
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
            com.google.android.gms.internal.measurement.zzhg r6 = com.google.android.gms.internal.measurement.zzhg.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzhf r6 = new com.google.android.gms.internal.measurement.zzhf
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzhg r6 = new com.google.android.gms.internal.measurement.zzhg
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
            java.lang.String r8 = "zzk"
            r6[r7] = r8
            com.google.android.gms.internal.measurement.zzhg r7 = com.google.android.gms.internal.measurement.zzhg.zzb
            java.lang.String r8 = "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L52:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    public final boolean zzm() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }

    public final boolean zzn() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public final boolean zzo() {
            r1 = this;
            boolean r0 = r1.zzk
            return r0
    }

    public final boolean zzp() {
            r1 = this;
            boolean r0 = r1.zzf
            return r0
    }

    public final boolean zzq() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    public final boolean zzr() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }
}
