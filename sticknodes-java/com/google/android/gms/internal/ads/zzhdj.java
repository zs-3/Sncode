package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhdj extends com.google.android.gms.internal.ads.zzgzs {
    static final int[] zza = null;
    private final int zzc;
    private final com.google.android.gms.internal.ads.zzgzs zzd;
    private final com.google.android.gms.internal.ads.zzgzs zze;
    private final int zzf;
    private final int zzg;

    static {
            r0 = 47
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, 2147483647} // fill-array
            com.google.android.gms.internal.ads.zzhdj.zza = r0
            return
    }

    private zzhdj(com.google.android.gms.internal.ads.zzgzs r3, com.google.android.gms.internal.ads.zzgzs r4) {
            r2 = this;
            r2.<init>()
            r2.zzd = r3
            r2.zze = r4
            int r0 = r3.zzd()
            r2.zzf = r0
            int r1 = r4.zzd()
            int r0 = r0 + r1
            r2.zzc = r0
            int r3 = r3.zzf()
            int r4 = r4.zzf()
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + 1
            r2.zzg = r3
            return
    }

    /* synthetic */ zzhdj(com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzgzs r2, com.google.android.gms.internal.ads.zzhdi r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzs zzB(com.google.android.gms.internal.ads.zzhdj r0) {
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zze
            return r0
    }

    static com.google.android.gms.internal.ads.zzgzs zzC(com.google.android.gms.internal.ads.zzgzs r5, com.google.android.gms.internal.ads.zzgzs r6) {
            int r0 = r6.zzd()
            if (r0 != 0) goto L7
            return r5
        L7:
            int r0 = r5.zzd()
            if (r0 != 0) goto Le
            return r6
        Le:
            int r0 = r5.zzd()
            int r1 = r6.zzd()
            int r0 = r0 + r1
            r1 = 128(0x80, float:1.794E-43)
            if (r0 >= r1) goto L20
            com.google.android.gms.internal.ads.zzgzs r5 = zzD(r5, r6)
            return r5
        L20:
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzhdj
            if (r2 == 0) goto L68
            r2 = r5
            com.google.android.gms.internal.ads.zzhdj r2 = (com.google.android.gms.internal.ads.zzhdj) r2
            com.google.android.gms.internal.ads.zzgzs r3 = r2.zze
            int r3 = r3.zzd()
            int r4 = r6.zzd()
            int r3 = r3 + r4
            if (r3 >= r1) goto L42
            com.google.android.gms.internal.ads.zzgzs r5 = r2.zze
            com.google.android.gms.internal.ads.zzgzs r5 = zzD(r5, r6)
            com.google.android.gms.internal.ads.zzgzs r6 = r2.zzd
            com.google.android.gms.internal.ads.zzhdj r0 = new com.google.android.gms.internal.ads.zzhdj
            r0.<init>(r6, r5)
            return r0
        L42:
            com.google.android.gms.internal.ads.zzgzs r1 = r2.zzd
            com.google.android.gms.internal.ads.zzgzs r3 = r2.zze
            int r1 = r1.zzf()
            int r3 = r3.zzf()
            if (r1 <= r3) goto L68
            int r1 = r2.zzg
            int r3 = r6.zzf()
            if (r1 > r3) goto L59
            goto L68
        L59:
            com.google.android.gms.internal.ads.zzgzs r5 = r2.zze
            com.google.android.gms.internal.ads.zzhdj r0 = new com.google.android.gms.internal.ads.zzhdj
            r0.<init>(r5, r6)
            com.google.android.gms.internal.ads.zzgzs r5 = r2.zzd
            com.google.android.gms.internal.ads.zzhdj r6 = new com.google.android.gms.internal.ads.zzhdj
            r6.<init>(r5, r0)
            return r6
        L68:
            int r1 = r5.zzf()
            int r2 = r6.zzf()
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = r1 + 1
            int r1 = zzc(r1)
            if (r0 < r1) goto L82
            com.google.android.gms.internal.ads.zzhdj r0 = new com.google.android.gms.internal.ads.zzhdj
            r0.<init>(r5, r6)
            return r0
        L82:
            com.google.android.gms.internal.ads.zzhdf r0 = new com.google.android.gms.internal.ads.zzhdf
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgzs r5 = com.google.android.gms.internal.ads.zzhdf.zza(r0, r5, r6)
            return r5
    }

    private static com.google.android.gms.internal.ads.zzgzs zzD(com.google.android.gms.internal.ads.zzgzs r4, com.google.android.gms.internal.ads.zzgzs r5) {
            int r0 = r4.zzd()
            int r1 = r5.zzd()
            int r2 = r0 + r1
            byte[] r2 = new byte[r2]
            r3 = 0
            r4.zzz(r2, r3, r3, r0)
            r5.zzz(r2, r3, r0, r1)
            com.google.android.gms.internal.ads.zzgzq r4 = new com.google.android.gms.internal.ads.zzgzq
            r4.<init>(r2)
            return r4
    }

    static int zzc(int r2) {
            int[] r0 = com.google.android.gms.internal.ads.zzhdj.zza
            int r1 = r0.length
            r1 = 47
            if (r2 < r1) goto Lb
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        Lb:
            r2 = r0[r2]
            return r2
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzs zzg(com.google.android.gms.internal.ads.zzhdj r0) {
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean equals(java.lang.Object r13) {
            r12 = this;
            r0 = 1
            if (r13 != r12) goto L4
            return r0
        L4:
            boolean r1 = r13 instanceof com.google.android.gms.internal.ads.zzgzs
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzgzs r13 = (com.google.android.gms.internal.ads.zzgzs) r13
            int r1 = r12.zzc
            int r3 = r13.zzd()
            if (r1 == r3) goto L15
            return r2
        L15:
            int r1 = r12.zzc
            if (r1 != 0) goto L1a
            return r0
        L1a:
            int r1 = r12.zzr()
            int r3 = r13.zzr()
            if (r1 == 0) goto L2a
            if (r3 == 0) goto L2a
            if (r1 != r3) goto L29
            goto L2a
        L29:
            return r2
        L2a:
            com.google.android.gms.internal.ads.zzhdh r1 = new com.google.android.gms.internal.ads.zzhdh
            r3 = 0
            r1.<init>(r12, r3)
            com.google.android.gms.internal.ads.zzgzp r4 = r1.zza()
            com.google.android.gms.internal.ads.zzhdh r5 = new com.google.android.gms.internal.ads.zzhdh
            r5.<init>(r13, r3)
            com.google.android.gms.internal.ads.zzgzp r13 = r5.zza()
            r3 = 0
            r6 = 0
            r7 = 0
        L40:
            int r8 = r4.zzd()
            int r8 = r8 - r3
            int r9 = r13.zzd()
            int r9 = r9 - r6
            int r10 = java.lang.Math.min(r8, r9)
            if (r3 != 0) goto L55
            boolean r11 = r4.zzg(r13, r6, r10)
            goto L59
        L55:
            boolean r11 = r13.zzg(r4, r3, r10)
        L59:
            if (r11 != 0) goto L5d
            r0 = 0
            goto L64
        L5d:
            int r7 = r7 + r10
            int r11 = r12.zzc
            if (r7 < r11) goto L6b
            if (r7 != r11) goto L65
        L64:
            return r0
        L65:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            throw r13
        L6b:
            if (r10 != r8) goto L74
            com.google.android.gms.internal.ads.zzgzp r3 = r1.zza()
            r4 = r3
            r3 = 0
            goto L75
        L74:
            int r3 = r3 + r10
        L75:
            if (r10 != r9) goto L7d
            com.google.android.gms.internal.ads.zzgzp r13 = r5.zza()
            r6 = 0
            goto L40
        L7d:
            int r6 = r6 + r10
            goto L40
    }

    @Override // com.google.android.gms.internal.ads.zzgzs, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdd r0 = new com.google.android.gms.internal.ads.zzhdd
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final byte zza(int r2) {
            r1 = this;
            int r0 = r1.zzc
            com.google.android.gms.internal.ads.zzgzs.zzy(r2, r0)
            byte r2 = r1.zzb(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    final byte zzb(int r3) {
            r2 = this;
            int r0 = r2.zzf
            if (r3 >= r0) goto Lb
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            byte r3 = r0.zzb(r3)
            return r3
        Lb:
            com.google.android.gms.internal.ads.zzgzs r1 = r2.zze
            int r3 = r3 - r0
            byte r3 = r1.zzb(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final void zze(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r2.zzf
            if (r0 > r1) goto Lc
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            r0.zze(r3, r4, r5, r6)
            return
        Lc:
            if (r4 < r1) goto L15
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zze
            int r4 = r4 - r1
            r0.zze(r3, r4, r5, r6)
            return
        L15:
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            int r1 = r1 - r4
            r0.zze(r3, r4, r5, r1)
            com.google.android.gms.internal.ads.zzgzs r4 = r2.zze
            r0 = 0
            int r5 = r5 + r1
            int r6 = r6 - r1
            r4.zze(r3, r0, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final int zzf() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final boolean zzh() {
            r2 = this;
            int r0 = r2.zzg
            int r1 = r2.zzc
            int r0 = zzc(r0)
            if (r1 < r0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final int zzi(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.zzf
            if (r0 > r1) goto Ld
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            int r3 = r0.zzi(r3, r4, r5)
            return r3
        Ld:
            if (r4 < r1) goto L17
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zze
            int r4 = r4 - r1
            int r3 = r0.zzi(r3, r4, r5)
            return r3
        L17:
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            int r1 = r1 - r4
            int r3 = r0.zzi(r3, r4, r1)
            com.google.android.gms.internal.ads.zzgzs r4 = r2.zze
            r0 = 0
            int r5 = r5 - r1
            int r3 = r4.zzi(r3, r0, r5)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final int zzj(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.zzf
            if (r0 > r1) goto Ld
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            int r3 = r0.zzj(r3, r4, r5)
            return r3
        Ld:
            if (r4 < r1) goto L17
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zze
            int r4 = r4 - r1
            int r3 = r0.zzj(r3, r4, r5)
            return r3
        L17:
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzd
            int r1 = r1 - r4
            int r3 = r0.zzj(r3, r4, r1)
            com.google.android.gms.internal.ads.zzgzs r4 = r2.zze
            r0 = 0
            int r5 = r5 - r1
            int r3 = r4.zzj(r3, r0, r5)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final com.google.android.gms.internal.ads.zzgzs zzk(int r4, int r5) {
            r3 = this;
            int r0 = r3.zzc
            int r0 = com.google.android.gms.internal.ads.zzgzs.zzq(r4, r5, r0)
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.ads.zzgzs r4 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r4
        Lb:
            int r1 = r3.zzc
            if (r0 != r1) goto L10
            return r3
        L10:
            int r0 = r3.zzf
            if (r5 > r0) goto L1b
            com.google.android.gms.internal.ads.zzgzs r0 = r3.zzd
            com.google.android.gms.internal.ads.zzgzs r4 = r0.zzk(r4, r5)
            return r4
        L1b:
            if (r4 < r0) goto L26
            com.google.android.gms.internal.ads.zzgzs r1 = r3.zze
            int r5 = r5 - r0
            int r4 = r4 - r0
            com.google.android.gms.internal.ads.zzgzs r4 = r1.zzk(r4, r5)
            return r4
        L26:
            com.google.android.gms.internal.ads.zzgzs r0 = r3.zzd
            int r1 = r0.zzd()
            com.google.android.gms.internal.ads.zzgzs r4 = r0.zzk(r4, r1)
            com.google.android.gms.internal.ads.zzgzs r0 = r3.zze
            r1 = 0
            int r2 = r3.zzf
            int r5 = r5 - r2
            com.google.android.gms.internal.ads.zzgzs r5 = r0.zzk(r1, r5)
            com.google.android.gms.internal.ads.zzhdj r0 = new com.google.android.gms.internal.ads.zzhdj
            r0.<init>(r4, r5)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final com.google.android.gms.internal.ads.zzhac zzl() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzhdh r1 = new com.google.android.gms.internal.ads.zzhdh
            r2 = 0
            r1.<init>(r7, r2)
        Lb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1d
            com.google.android.gms.internal.ads.zzgzp r3 = r1.zza()
            java.nio.ByteBuffer r3 = r3.zzn()
            r0.add(r3)
            goto Lb
        L1d:
            int r1 = com.google.android.gms.internal.ads.zzhac.zzd
            java.util.Iterator r1 = r0.iterator()
            r3 = 0
            r4 = 0
        L25:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r1.next()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r6 = r5.remaining()
            int r4 = r4 + r6
            boolean r6 = r5.hasArray()
            if (r6 == 0) goto L3f
            r3 = r3 | 1
            goto L25
        L3f:
            boolean r5 = r5.isDirect()
            if (r5 == 0) goto L48
            r3 = r3 | 2
            goto L25
        L48:
            r3 = r3 | 4
            goto L25
        L4b:
            r1 = 2
            if (r3 != r1) goto L55
            com.google.android.gms.internal.ads.zzgzw r1 = new com.google.android.gms.internal.ads.zzgzw
            r3 = 1
            r1.<init>(r0, r4, r3, r2)
            goto L60
        L55:
            com.google.android.gms.internal.ads.zzhbu r1 = new com.google.android.gms.internal.ads.zzhbu
            r1.<init>(r0)
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzhac r1 = com.google.android.gms.internal.ads.zzhac.zzG(r1, r0)
        L60:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    protected final java.lang.String zzm(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.zzA()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final java.nio.ByteBuffer zzn() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    final void zzo(com.google.android.gms.internal.ads.zzgzj r2) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzd
            r0.zzo(r2)
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zze
            r0.zzo(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean zzp() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r4.zzd
            com.google.android.gms.internal.ads.zzgzs r1 = r4.zze
            int r2 = r4.zzf
            r3 = 0
            int r0 = r0.zzj(r3, r3, r2)
            int r2 = r1.zzd()
            int r0 = r1.zzj(r0, r3, r2)
            if (r0 != 0) goto L17
            r0 = 1
            return r0
        L17:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final com.google.android.gms.internal.ads.zzgzn zzs() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdd r0 = new com.google.android.gms.internal.ads.zzhdd
            r0.<init>(r1)
            return r0
    }
}
