package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzvn extends com.google.android.gms.internal.ads.zzug {
    private static final com.google.android.gms.internal.ads.zzbc zza = null;
    private final com.google.android.gms.internal.ads.zzva[] zzb;
    private final com.google.android.gms.internal.ads.zzcc[] zzc;
    private final java.util.ArrayList zzd;
    private int zze;
    private long[][] zzf;
    private com.google.android.gms.internal.ads.zzvm zzg;
    private final com.google.android.gms.internal.ads.zzuj zzh;

    static {
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>()
            java.lang.String r1 = "MergingMediaSource"
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzbc r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzvn.zza = r0
            return
    }

    public zzvn(boolean r1, boolean r2, com.google.android.gms.internal.ads.zzuj r3, com.google.android.gms.internal.ads.zzva... r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r4
            r0.zzh = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = java.util.Arrays.asList(r4)
            r1.<init>(r2)
            r0.zzd = r1
            r1 = -1
            r0.zze = r1
            int r1 = r4.length
            com.google.android.gms.internal.ads.zzcc[] r1 = new com.google.android.gms.internal.ads.zzcc[r1]
            r0.zzc = r1
            r1 = 0
            long[][] r1 = new long[r1][]
            r0.zzf = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1 = 8
            com.google.android.gms.internal.ads.zzgcb r1 = com.google.android.gms.internal.ads.zzgcd.zzb(r1)
            r2 = 2
            com.google.android.gms.internal.ads.zzgbz r1 = r1.zzb(r2)
            r1.zza()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzug
    protected final /* bridge */ /* synthetic */ void zzA(java.lang.Object r6, com.google.android.gms.internal.ads.zzva r7, com.google.android.gms.internal.ads.zzcc r8) {
            r5 = this;
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.google.android.gms.internal.ads.zzvm r0 = r5.zzg
            if (r0 == 0) goto L7
            goto L5b
        L7:
            int r0 = r5.zze
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L14
            int r0 = r8.zzb()
            r5.zze = r0
            goto L25
        L14:
            int r0 = r8.zzb()
            int r1 = r5.zze
            if (r0 == r1) goto L24
            com.google.android.gms.internal.ads.zzvm r6 = new com.google.android.gms.internal.ads.zzvm
            r6.<init>(r2)
            r5.zzg = r6
            return
        L24:
            r0 = r1
        L25:
            long[][] r1 = r5.zzf
            int r1 = r1.length
            if (r1 != 0) goto L3f
            com.google.android.gms.internal.ads.zzcc[] r1 = r5.zzc
            int r1 = r1.length
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 1
            r3[r4] = r1
            r3[r2] = r0
            java.lang.Class<long> r0 = long.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            long[][] r0 = (long[][]) r0
            r5.zzf = r0
        L3f:
            java.util.ArrayList r0 = r5.zzd
            r0.remove(r7)
            com.google.android.gms.internal.ads.zzcc[] r7 = r5.zzc
            int r6 = r6.intValue()
            r7[r6] = r8
            java.util.ArrayList r6 = r5.zzd
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5b
            com.google.android.gms.internal.ads.zzcc[] r6 = r5.zzc
            r6 = r6[r2]
            r5.zzo(r6)
        L5b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzG(com.google.android.gms.internal.ads.zzuw r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzvl r4 = (com.google.android.gms.internal.ads.zzvl) r4
            r0 = 0
        L3:
            com.google.android.gms.internal.ads.zzva[] r1 = r3.zzb
            int r2 = r1.length
            if (r0 >= r2) goto L14
            r1 = r1[r0]
            com.google.android.gms.internal.ads.zzuw r2 = r4.zzn(r0)
            r1.zzG(r2)
            int r0 = r0 + 1
            goto L3
        L14:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final com.google.android.gms.internal.ads.zzuw zzI(com.google.android.gms.internal.ads.zzuy r10, com.google.android.gms.internal.ads.zzza r11, long r12) {
            r9 = this;
            com.google.android.gms.internal.ads.zzcc[] r0 = r9.zzc
            com.google.android.gms.internal.ads.zzva[] r1 = r9.zzb
            int r1 = r1.length
            com.google.android.gms.internal.ads.zzuw[] r2 = new com.google.android.gms.internal.ads.zzuw[r1]
            r3 = 0
            r0 = r0[r3]
            java.lang.Object r4 = r10.zza
            int r0 = r0.zza(r4)
        L10:
            if (r3 >= r1) goto L33
            com.google.android.gms.internal.ads.zzcc[] r4 = r9.zzc
            r4 = r4[r3]
            java.lang.Object r4 = r4.zzf(r0)
            com.google.android.gms.internal.ads.zzuy r4 = r10.zza(r4)
            com.google.android.gms.internal.ads.zzva[] r5 = r9.zzb
            r5 = r5[r3]
            long[][] r6 = r9.zzf
            r6 = r6[r0]
            r7 = r6[r3]
            long r6 = r12 - r7
            com.google.android.gms.internal.ads.zzuw r4 = r5.zzI(r4, r11, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L10
        L33:
            com.google.android.gms.internal.ads.zzuj r10 = r9.zzh
            com.google.android.gms.internal.ads.zzvl r11 = new com.google.android.gms.internal.ads.zzvl
            long[][] r12 = r9.zzf
            r12 = r12[r0]
            r11.<init>(r10, r12, r2)
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final com.google.android.gms.internal.ads.zzbc zzJ() {
            r2 = this;
            com.google.android.gms.internal.ads.zzva[] r0 = r2.zzb
            int r1 = r0.length
            if (r1 <= 0) goto Ld
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzbc r0 = r0.zzJ()
            goto Lf
        Ld:
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzvn.zza
        Lf:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zztx
    protected final void zzn(com.google.android.gms.internal.ads.zzhh r3) {
            r2 = this;
            super.zzn(r3)
            r3 = 0
        L4:
            com.google.android.gms.internal.ads.zzva[] r0 = r2.zzb
            int r1 = r0.length
            if (r3 >= r1) goto L15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = r0[r3]
            r2.zzB(r1, r0)
            int r3 = r3 + 1
            goto L4
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zztx
    protected final void zzq() {
            r2 = this;
            super.zzq()
            com.google.android.gms.internal.ads.zzcc[] r0 = r2.zzc
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = -1
            r2.zze = r0
            r2.zzg = r1
            java.util.ArrayList r0 = r2.zzd
            r0.clear()
            java.util.ArrayList r0 = r2.zzd
            com.google.android.gms.internal.ads.zzva[] r1 = r2.zzb
            java.util.Collections.addAll(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzva
    public final void zzt(com.google.android.gms.internal.ads.zzbc r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzva[] r0 = r2.zzb
            r1 = 0
            r0 = r0[r1]
            r0.zzt(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzug
    protected final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzuy zzy(java.lang.Object r1, com.google.android.gms.internal.ads.zzuy r2) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L9
            return r2
        L9:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzva
    public final void zzz() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzvm r0 = r1.zzg
            if (r0 != 0) goto L8
            super.zzz()
            return
        L8:
            throw r0
    }
}
