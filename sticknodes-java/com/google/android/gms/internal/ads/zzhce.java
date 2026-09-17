package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhce extends com.google.android.gms.internal.ads.zzgze implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzhbp, com.google.android.gms.internal.ads.zzhcy {
    private static final com.google.android.gms.internal.ads.zzhce zza = null;
    private long[] zzb;
    private int zzc;

    static {
            com.google.android.gms.internal.ads.zzhce r0 = new com.google.android.gms.internal.ads.zzhce
            r1 = 0
            long[] r2 = new long[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.ads.zzhce.zza = r0
            return
    }

    zzhce() {
            r3 = this;
            r0 = 10
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zzhce(long[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzhce zzh() {
            com.google.android.gms.internal.ads.zzhce r0 = com.google.android.gms.internal.ads.zzhce.zza
            return r0
    }

    private final java.lang.String zzi(int r4) {
            r3 = this;
            int r0 = r3.zzc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            return r4
    }

    private final void zzj(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zzc
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.zzi(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r5.zzdJ()
            if (r6 < 0) goto L42
            int r7 = r5.zzc
            if (r6 > r7) goto L42
            int r2 = r6 + 1
            long[] r3 = r5.zzb
            int r4 = r3.length
            if (r7 >= r4) goto L1b
            int r7 = r7 - r6
            java.lang.System.arraycopy(r3, r6, r3, r2, r7)
            goto L31
        L1b:
            int r7 = r7 * 3
            int r7 = r7 / 2
            int r7 = r7 + 1
            long[] r7 = new long[r7]
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r7, r4, r6)
            long[] r3 = r5.zzb
            int r4 = r5.zzc
            int r4 = r4 - r6
            java.lang.System.arraycopy(r3, r6, r7, r2, r4)
            r5.zzb = r7
        L31:
            long[] r7 = r5.zzb
            r7[r6] = r0
            int r6 = r5.zzc
            int r6 = r6 + 1
            r5.zzc = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L42:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.zzi(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            r2.zzg(r0)
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zzdJ()
            byte[] r0 = com.google.android.gms.internal.ads.zzhbr.zzb
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhce
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            com.google.android.gms.internal.ads.zzhce r6 = (com.google.android.gms.internal.ads.zzhce) r6
            int r0 = r6.zzc
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.zzc
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            long[] r0 = r5.zzb
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zzb = r0
        L2d:
            long[] r0 = r6.zzb
            long[] r3 = r5.zzb
            int r4 = r5.zzc
            int r6 = r6.zzc
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.zzc = r2
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L41:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzhce
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            com.google.android.gms.internal.ads.zzhce r9 = (com.google.android.gms.internal.ads.zzhce) r9
            int r1 = r8.zzc
            int r2 = r9.zzc
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            long[] r9 = r9.zzb
            r1 = 0
        L1a:
            int r2 = r8.zzc
            if (r1 >= r2) goto L2c
            long[] r2 = r8.zzb
            r4 = r2[r1]
            r6 = r9[r1]
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L29
            return r3
        L29:
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r4) {
            r3 = this;
            r3.zzj(r4)
            long[] r0 = r3.zzb
            r1 = r0[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r7 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r7.zzc
            if (r1 >= r2) goto L19
            int r0 = r0 * 31
            long[] r2 = r7.zzb
            r3 = r2[r1]
            byte[] r2 = com.google.android.gms.internal.ads.zzhbr.zzb
            r2 = 32
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r3 = (int) r2
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto L2
        L19:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Long
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Long r8 = (java.lang.Long) r8
            long r2 = r8.longValue()
            int r8 = r7.zzc
            r0 = 0
        Lf:
            if (r0 >= r8) goto L1d
            long[] r4 = r7.zzb
            r5 = r4[r0]
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto Lf
        L1d:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r6) {
            r5 = this;
            r5.zzdJ()
            r5.zzj(r6)
            long[] r0 = r5.zzb
            r1 = r0[r6]
            int r3 = r5.zzc
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.zzc
            int r6 = r6 + (-1)
            r5.zzc = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            return r6
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zzdJ()
            if (r4 < r3) goto L1a
            long[] r0 = r2.zzb
            int r1 = r2.zzc
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.zzc
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.zzc = r0
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return
        L1a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "toIndex < fromIndex"
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            long r3 = r2.zzd(r3, r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final long zza(int r4) {
            r3 = this;
            r3.zzj(r4)
            long[] r0 = r3.zzb
            r1 = r0[r4]
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final long zzd(int r4, long r5) {
            r3 = this;
            r3.zzdJ()
            r3.zzj(r4)
            long[] r0 = r3.zzb
            r1 = r0[r4]
            r0[r4] = r5
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final com.google.android.gms.internal.ads.zzhbp zze(int r4) {
            r3 = this;
            int r0 = r3.zzc
            if (r4 < r0) goto L13
            com.google.android.gms.internal.ads.zzhce r0 = new com.google.android.gms.internal.ads.zzhce
            long[] r1 = r3.zzb
            long[] r4 = java.util.Arrays.copyOf(r1, r4)
            int r1 = r3.zzc
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhbq zzf(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzhbp r1 = r0.zze(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final void zzg(long r5) {
            r4 = this;
            r4.zzdJ()
            int r0 = r4.zzc
            long[] r1 = r4.zzb
            int r2 = r1.length
            if (r0 != r2) goto L18
            int r2 = r0 * 3
            int r2 = r2 / 2
            int r2 = r2 + 1
            long[] r2 = new long[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.zzb = r2
        L18:
            long[] r0 = r4.zzb
            int r1 = r4.zzc
            int r2 = r1 + 1
            r4.zzc = r2
            r0[r1] = r5
            return
    }
}
