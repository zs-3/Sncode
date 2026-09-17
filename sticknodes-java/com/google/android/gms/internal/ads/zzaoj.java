package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaoj implements com.google.android.gms.internal.ads.zzadb {
    private final int zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final android.util.SparseIntArray zzd;
    private final com.google.android.gms.internal.ads.zzaom zze;
    private final com.google.android.gms.internal.ads.zzakt zzf;
    private final android.util.SparseArray zzg;
    private final android.util.SparseBooleanArray zzh;
    private final android.util.SparseBooleanArray zzi;
    private final com.google.android.gms.internal.ads.zzaog zzj;
    private com.google.android.gms.internal.ads.zzaof zzk;
    private com.google.android.gms.internal.ads.zzade zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @java.lang.Deprecated
    public zzaoj() {
            r7 = this;
            com.google.android.gms.internal.ads.zzakt r3 = com.google.android.gms.internal.ads.zzakt.zza
            com.google.android.gms.internal.ads.zzer r4 = new com.google.android.gms.internal.ads.zzer
            r0 = 0
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzamw r5 = new com.google.android.gms.internal.ads.zzamw
            r0 = 0
            r5.<init>(r0)
            r1 = 1
            r2 = 1
            r6 = 112800(0x1b8a0, float:1.58066E-40)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public zzaoj(int r2, int r3, com.google.android.gms.internal.ads.zzakt r4, com.google.android.gms.internal.ads.zzer r5, com.google.android.gms.internal.ads.zzaom r6, int r7) {
            r1 = this;
            r1.<init>()
            r1.zze = r6
            r1.zza = r3
            r1.zzf = r4
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r3 = 9400(0x24b8, float:1.3172E-41)
            byte[] r3 = new byte[r3]
            r4 = 0
            r2.<init>(r3, r4)
            r1.zzc = r2
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r1.zzh = r2
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r1.zzi = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.zzg = r3
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r1.zzd = r5
            com.google.android.gms.internal.ads.zzaog r5 = new com.google.android.gms.internal.ads.zzaog
            r7 = 112800(0x1b8a0, float:1.58066E-40)
            r5.<init>(r7)
            r1.zzj = r5
            com.google.android.gms.internal.ads.zzade r5 = com.google.android.gms.internal.ads.zzade.zza
            r1.zzl = r5
            r5 = -1
            r1.zzr = r5
            r2.clear()
            r3.clear()
            android.util.SparseArray r2 = r6.zza()
            int r3 = r2.size()
            r5 = 0
        L57:
            if (r5 >= r3) goto L6b
            android.util.SparseArray r6 = r1.zzg
            int r7 = r2.keyAt(r5)
            java.lang.Object r0 = r2.valueAt(r5)
            com.google.android.gms.internal.ads.zzaoo r0 = (com.google.android.gms.internal.ads.zzaoo) r0
            r6.put(r7, r0)
            int r5 = r5 + 1
            goto L57
        L6b:
            android.util.SparseArray r2 = r1.zzg
            com.google.android.gms.internal.ads.zzaob r3 = new com.google.android.gms.internal.ads.zzaob
            com.google.android.gms.internal.ads.zzaoh r5 = new com.google.android.gms.internal.ads.zzaoh
            r5.<init>(r1)
            r3.<init>(r5)
            r2.put(r4, r3)
            return
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.internal.ads.zzaoj r0) {
            int r0 = r0.zzm
            return r0
    }

    static /* bridge */ /* synthetic */ android.util.SparseArray zzg(com.google.android.gms.internal.ads.zzaoj r0) {
            android.util.SparseArray r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ android.util.SparseBooleanArray zzh(com.google.android.gms.internal.ads.zzaoj r0) {
            android.util.SparseBooleanArray r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ android.util.SparseBooleanArray zzj(com.google.android.gms.internal.ads.zzaoj r0) {
            android.util.SparseBooleanArray r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzade zzk(com.google.android.gms.internal.ads.zzaoj r0) {
            com.google.android.gms.internal.ads.zzade r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaom zzl(com.google.android.gms.internal.ads.zzaoj r0) {
            com.google.android.gms.internal.ads.zzaom r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zzm(com.google.android.gms.internal.ads.zzaoj r0) {
            java.util.List r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzaoj r0, int r1) {
            r0.zzr = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzaoj r0, int r1) {
            r0.zzm = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzaoj r0, boolean r1) {
            r1 = 1
            r0.zzn = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r19, com.google.android.gms.internal.ads.zzadx r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.zzd()
            boolean r3 = r0.zzn
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L9e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L26
            com.google.android.gms.internal.ads.zzaog r3 = r0.zzj
            boolean r4 = r3.zzd()
            if (r4 == 0) goto L1f
            goto L26
        L1f:
            int r4 = r0.zzr
            int r1 = r3.zza(r1, r2, r4)
            return r1
        L26:
            boolean r3 = r0.zzo
            r7 = 0
            if (r3 != 0) goto L75
            r0.zzo = r15
            com.google.android.gms.internal.ads.zzaog r3 = r0.zzj
            long r4 = r3.zzb()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L65
            com.google.android.gms.internal.ads.zzaof r9 = new com.google.android.gms.internal.ads.zzaof
            com.google.android.gms.internal.ads.zzer r4 = r3.zzc()
            long r5 = r3.zzb()
            int r3 = r0.zzr
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.zzk = r15
            com.google.android.gms.internal.ads.zzade r3 = r0.zzl
            com.google.android.gms.internal.ads.zzaea r4 = r15.zzb()
            r3.zzO(r4)
            goto L76
        L65:
            r13 = r7
            com.google.android.gms.internal.ads.zzade r4 = r0.zzl
            com.google.android.gms.internal.ads.zzadz r5 = new com.google.android.gms.internal.ads.zzadz
            long r6 = r3.zzb()
            r5.<init>(r6, r13)
            r4.zzO(r5)
            goto L76
        L75:
            r13 = r7
        L76:
            boolean r3 = r0.zzp
            if (r3 == 0) goto L8d
            r3 = 0
            r0.zzp = r3
            r0.zzf(r13, r13)
            long r4 = r19.zzf()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L89
            goto L8e
        L89:
            r2.zza = r13
            r1 = 1
            return r1
        L8d:
            r3 = 0
        L8e:
            com.google.android.gms.internal.ads.zzaof r4 = r0.zzk
            if (r4 == 0) goto L9f
            boolean r5 = r4.zze()
            if (r5 != 0) goto L99
            goto L9f
        L99:
            int r1 = r4.zza(r1, r2)
            return r1
        L9e:
            r3 = 0
        L9f:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            byte[] r4 = r2.zzN()
            int r5 = r2.zzd()
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 < r6) goto Lb0
            goto Lc2
        Lb0:
            int r5 = r2.zzb()
            if (r5 <= 0) goto Lbd
            int r2 = r2.zzd()
            java.lang.System.arraycopy(r4, r2, r4, r3, r5)
        Lbd:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            r2.zzJ(r4, r5)
        Lc2:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            int r5 = r2.zzb()
            r7 = -1
            if (r5 >= r6) goto L108
            int r2 = r2.zze()
            int r5 = 9400 - r2
            int r5 = r1.zza(r4, r2, r5)
            if (r5 != r7) goto L101
            r10 = 0
        Ld8:
            android.util.SparseArray r1 = r0.zzg
            int r1 = r1.size()
            if (r10 >= r1) goto L100
            android.util.SparseArray r1 = r0.zzg
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.zzaoo r1 = (com.google.android.gms.internal.ads.zzaoo) r1
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzant
            if (r2 == 0) goto Lfd
            com.google.android.gms.internal.ads.zzant r1 = (com.google.android.gms.internal.ads.zzant) r1
            boolean r2 = r1.zzd(r3)
            if (r2 == 0) goto Lfd
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>()
            r4 = 1
            r1.zza(r2, r4)
        Lfd:
            int r10 = r10 + 1
            goto Ld8
        L100:
            return r7
        L101:
            com.google.android.gms.internal.ads.zzek r7 = r0.zzc
            int r2 = r2 + r5
            r7.zzK(r2)
            goto Lc2
        L108:
            int r1 = r2.zzd()
            int r4 = r2.zze()
            byte[] r2 = r2.zzN()
            int r2 = com.google.android.gms.internal.ads.zzaop.zza(r2, r1, r4)
            com.google.android.gms.internal.ads.zzek r5 = r0.zzc
            r5.zzL(r2)
            int r5 = r2 + 188
            if (r5 <= r4) goto L128
            int r4 = r0.zzq
            int r2 = r2 - r1
            int r4 = r4 + r2
            r0.zzq = r4
            goto L12a
        L128:
            r0.zzq = r3
        L12a:
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            int r2 = r1.zze()
            if (r5 <= r2) goto L133
            return r3
        L133:
            int r1 = r1.zzg()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L142
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            r1.zzL(r5)
            return r3
        L142:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L149
            r10 = 1
            goto L14a
        L149:
            r10 = 0
        L14a:
            int r4 = r1 >> 8
            r6 = r1 & 32
            r8 = r1 & 16
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            if (r8 == 0) goto L15d
            android.util.SparseArray r8 = r0.zzg
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzaoo r8 = (com.google.android.gms.internal.ads.zzaoo) r8
            goto L15e
        L15d:
            r8 = 0
        L15e:
            if (r8 != 0) goto L166
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            r1.zzL(r5)
            return r3
        L166:
            r1 = r1 & 15
            android.util.SparseIntArray r9 = r0.zzd
            int r13 = r1 + (-1)
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.zzd
            r13.put(r4, r1)
            if (r9 != r1) goto L17d
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            r1.zzL(r5)
            return r3
        L17d:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r1 == r9) goto L186
            r8.zzc()
        L186:
            if (r6 == 0) goto L1a0
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            int r6 = r1.zzm()
            int r1 = r1.zzm()
            r1 = r1 & 64
            if (r1 == 0) goto L198
            r1 = 2
            goto L199
        L198:
            r1 = 0
        L199:
            r10 = r10 | r1
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            int r6 = r6 + r7
            r1.zzM(r6)
        L1a0:
            boolean r1 = r0.zzn
            if (r1 != 0) goto L1ac
            android.util.SparseBooleanArray r6 = r0.zzi
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L1bd
        L1ac:
            com.google.android.gms.internal.ads.zzek r4 = r0.zzc
            r4.zzK(r5)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzc
            r8.zza(r4, r10)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzc
            r4.zzK(r2)
            if (r1 != 0) goto L1ca
        L1bd:
            boolean r1 = r0.zzn
            if (r1 == 0) goto L1ca
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L1ca
            r1 = 1
            r0.zzp = r1
        L1ca:
            com.google.android.gms.internal.ads.zzek r1 = r0.zzc
            r1.zzL(r5)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ com.google.android.gms.internal.ads.zzadb zzc() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r3) {
            r2 = this;
            int r0 = r2.zza
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzakt r0 = r2.zzf
            com.google.android.gms.internal.ads.zzakw r1 = new com.google.android.gms.internal.ads.zzakw
            r1.<init>(r3, r0)
            r3 = r1
        Lc:
            r2.zzl = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r10, long r12) {
            r9 = this;
            java.util.List r10 = r9.zzb
            int r10 = r10.size()
            r11 = 0
            r0 = 0
        L8:
            r1 = 0
            if (r0 >= r10) goto L37
            java.util.List r3 = r9.zzb
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.zzer r3 = (com.google.android.gms.internal.ads.zzer) r3
            long r4 = r3.zzf()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L31
            long r4 = r3.zzd()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L34
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.zzi(r12)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L42
            com.google.android.gms.internal.ads.zzaof r10 = r9.zzk
            if (r10 == 0) goto L42
            r10.zzd(r12)
        L42:
            com.google.android.gms.internal.ads.zzek r10 = r9.zzc
            r10.zzI(r11)
            android.util.SparseIntArray r10 = r9.zzd
            r10.clear()
            r10 = 0
        L4d:
            android.util.SparseArray r12 = r9.zzg
            int r12 = r12.size()
            if (r10 >= r12) goto L63
            android.util.SparseArray r12 = r9.zzg
            java.lang.Object r12 = r12.valueAt(r10)
            com.google.android.gms.internal.ads.zzaoo r12 = (com.google.android.gms.internal.ads.zzaoo) r12
            r12.zzc()
            int r10 = r10 + 1
            goto L4d
        L63:
            r9.zzq = r11
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r7) throws java.io.IOException {
            r6 = this;
            com.google.android.gms.internal.ads.zzek r0 = r6.zzc
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacq r7 = (com.google.android.gms.internal.ads.zzacq) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzm(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
    }
}
