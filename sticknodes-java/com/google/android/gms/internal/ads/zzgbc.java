package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgbc<E> extends com.google.android.gms.internal.ads.zzgas<E> implements java.util.Set<E> {
    private transient com.google.android.gms.internal.ads.zzgax zza;

    zzgbc() {
            r0 = this;
            r0.<init>()
            return
    }

    static int zzh(int r6) {
            r0 = 2
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r6 >= r0) goto L20
            int r0 = r6 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
        L10:
            int r0 = r0 + r0
            double r1 = (double) r0
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1f
            goto L10
        L1f:
            return r0
        L20:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            java.lang.String r1 = "collection too large"
            com.google.android.gms.internal.ads.zzfxz.zzf(r6, r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgbb zzj(int r1) {
            com.google.android.gms.internal.ads.zzgbb r0 = new com.google.android.gms.internal.ads.zzgbb
            r0.<init>(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgbc zzk(int r0, java.lang.Object[] r1) {
            com.google.android.gms.internal.ads.zzgbc r0 = zzv(r0, r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgbc zzl(java.util.Collection r2) {
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzgbc
            if (r0 == 0) goto L12
            boolean r0 = r2 instanceof java.util.SortedSet
            if (r0 != 0) goto L12
            r0 = r2
            com.google.android.gms.internal.ads.zzgbc r0 = (com.google.android.gms.internal.ads.zzgbc) r0
            boolean r1 = r0.zzf()
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.Object[] r2 = r2.toArray()
            int r0 = r2.length
            com.google.android.gms.internal.ads.zzgbc r2 = zzv(r0, r2)
            return r2
    }

    public static com.google.android.gms.internal.ads.zzgbc zzm(java.lang.Object[] r2) {
            int r0 = r2.length
            if (r0 == 0) goto L1a
            r1 = 1
            if (r0 == r1) goto L11
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            com.google.android.gms.internal.ads.zzgbc r2 = zzv(r0, r2)
            return r2
        L11:
            r0 = 0
            r2 = r2[r0]
            com.google.android.gms.internal.ads.zzgda r0 = new com.google.android.gms.internal.ads.zzgda
            r0.<init>(r2)
            return r0
        L1a:
            com.google.android.gms.internal.ads.zzgcp r2 = com.google.android.gms.internal.ads.zzgcp.zza
            return r2
    }

    public static com.google.android.gms.internal.ads.zzgbc zzn() {
            com.google.android.gms.internal.ads.zzgcp r0 = com.google.android.gms.internal.ads.zzgcp.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgbc zzo(java.lang.Object r1) {
            com.google.android.gms.internal.ads.zzgda r0 = new com.google.android.gms.internal.ads.zzgda
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgbc zzp(java.lang.Object r3, java.lang.Object r4) {
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            com.google.android.gms.internal.ads.zzgbc r3 = zzv(r0, r1)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgbc zzq(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            com.google.android.gms.internal.ads.zzgbc r3 = zzv(r0, r1)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgbc zzr(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            com.google.android.gms.internal.ads.zzgbc r3 = zzv(r0, r1)
            return r3
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzgbc zzs(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object... r9) {
            r0 = 11
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r4 = 6
            java.lang.System.arraycopy(r9, r2, r1, r4, r3)
            com.google.android.gms.internal.ads.zzgbc r3 = zzv(r0, r1)
            return r3
    }

    static /* bridge */ /* synthetic */ boolean zzt(int r0, int r1) {
            boolean r0 = zzw(r0, r1)
            return r0
    }

    private static com.google.android.gms.internal.ads.zzgbc zzv(int r13, java.lang.Object... r14) {
            if (r13 == 0) goto L77
            r0 = 0
            r1 = 1
            if (r13 == r1) goto L6c
            int r2 = zzh(r13)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r7 = r2 + (-1)
            r3 = 0
            r5 = 0
            r8 = 0
        L11:
            if (r3 >= r13) goto L3b
            r4 = r14[r3]
            com.google.android.gms.internal.ads.zzgch.zza(r4, r3)
            int r9 = r4.hashCode()
            int r10 = com.google.android.gms.internal.ads.zzgap.zza(r9)
        L20:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L2f
            int r10 = r8 + 1
            r14[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L38
        L2f:
            boolean r11 = r12.equals(r4)
            if (r11 != 0) goto L38
            int r10 = r10 + 1
            goto L20
        L38:
            int r3 = r3 + 1
            goto L11
        L3b:
            r3 = 0
            java.util.Arrays.fill(r14, r8, r13, r3)
            if (r8 != r1) goto L4c
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.ads.zzgda r14 = new com.google.android.gms.internal.ads.zzgda
            r14.<init>(r13)
            return r14
        L4c:
            int r2 = r2 / 2
            int r13 = zzh(r8)
            if (r13 >= r2) goto L59
            com.google.android.gms.internal.ads.zzgbc r13 = zzv(r8, r14)
            return r13
        L59:
            int r13 = r14.length
            boolean r13 = zzw(r8, r13)
            if (r13 == 0) goto L64
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r8)
        L64:
            r4 = r14
            com.google.android.gms.internal.ads.zzgcp r13 = new com.google.android.gms.internal.ads.zzgcp
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L6c:
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.ads.zzgda r14 = new com.google.android.gms.internal.ads.zzgda
            r14.<init>(r13)
            return r14
        L77:
            com.google.android.gms.internal.ads.zzgcp r13 = com.google.android.gms.internal.ads.zzgcp.zza
            return r13
    }

    private static boolean zzw(int r1, int r2) {
            int r0 = r2 >> 1
            int r2 = r2 >> 2
            int r0 = r0 + r2
            if (r1 >= r0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgbc
            if (r0 == 0) goto L23
            boolean r0 = r2.zzu()
            if (r0 == 0) goto L23
            r0 = r3
            com.google.android.gms.internal.ads.zzgbc r0 = (com.google.android.gms.internal.ads.zzgbc) r0
            boolean r0 = r0.zzu()
            if (r0 == 0) goto L23
            int r0 = r2.hashCode()
            int r1 = r3.hashCode()
            if (r0 == r1) goto L23
            r3 = 0
            return r3
        L23:
            boolean r3 = com.google.android.gms.internal.ads.zzgcz.zzd(r2, r3)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzgcz.zza(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgdd r0 = r1.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public com.google.android.gms.internal.ads.zzgax zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zza
            if (r0 != 0) goto La
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzi()
            r1.zza = r0
        La:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public abstract com.google.android.gms.internal.ads.zzgdd zze();

    com.google.android.gms.internal.ads.zzgax zzi() {
            r2 = this;
            java.lang.Object[] r0 = r2.toArray()
            int r1 = com.google.android.gms.internal.ads.zzgax.zzd
            int r1 = r0.length
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzj(r0, r1)
            return r0
    }

    boolean zzu() {
            r1 = this;
            r0 = 0
            return r0
    }
}
