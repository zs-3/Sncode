package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgax<E> extends com.google.android.gms.internal.ads.zzgas<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.ads.zzgde zza = null;
    public static final /* synthetic */ int zzd = 0;

    static {
            com.google.android.gms.internal.ads.zzgav r0 = new com.google.android.gms.internal.ads.zzgav
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgcj.zza
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzgax.zza = r0
            return
    }

    zzgax() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzgau zzi(int r1) {
            java.lang.String r0 = "expectedSize"
            com.google.android.gms.internal.ads.zzfzu.zza(r1, r0)
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.ads.zzgax zzj(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L5
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgcj.zza
            return r1
        L5:
            com.google.android.gms.internal.ads.zzgcj r0 = new com.google.android.gms.internal.ads.zzgcj
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgax zzk(java.lang.Iterable r0) {
            java.util.Objects.requireNonNull(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            com.google.android.gms.internal.ads.zzgax r0 = zzl(r0)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgax zzl(java.util.Collection r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzgas
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzgas r1 = (com.google.android.gms.internal.ads.zzgas) r1
            com.google.android.gms.internal.ads.zzgax r1 = r1.zzd()
            boolean r0 = r1.zzf()
            if (r0 == 0) goto L19
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.android.gms.internal.ads.zzgax r1 = zzj(r1, r0)
        L19:
            return r1
        L1a:
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r1 = zzj(r1, r0)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzgax zzm(java.lang.Object[] r1) {
            int r0 = r1.length
            if (r0 != 0) goto L6
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgcj.zza
            goto L14
        L6:
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r1 = zzj(r1, r0)
        L14:
            return r1
    }

    public static com.google.android.gms.internal.ads.zzgax zzn() {
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgcj.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgax zzo(java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r3 = zzj(r1, r0)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgax zzp(java.lang.Object r3, java.lang.Object r4) {
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r3 = zzj(r1, r0)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgax zzq(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r3 = zzj(r1, r0)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgax zzr(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
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
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r3 = zzj(r1, r0)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgax zzs(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = 6
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "3010"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "3008"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "1005"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "1009"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "2011"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "2007"
            r1[r2] = r3
            com.google.android.gms.internal.ads.zzgch.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r0 = zzj(r1, r0)
            return r0
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzgax zzt(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object... r18) {
            r0 = r18
            int r1 = r0.length
            int r2 = r1 + 12
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r6
            r5 = 1
            r3[r5] = r7
            r5 = 2
            r3[r5] = r8
            r5 = 3
            r3[r5] = r9
            r5 = 4
            r3[r5] = r10
            r5 = 5
            r3[r5] = r11
            r5 = 6
            r3[r5] = r12
            r5 = 7
            r3[r5] = r13
            r5 = 8
            r3[r5] = r14
            r5 = 9
            r3[r5] = r15
            r5 = 10
            r3[r5] = r16
            r5 = 11
            r3[r5] = r17
            r5 = 12
            java.lang.System.arraycopy(r0, r4, r3, r5, r1)
            com.google.android.gms.internal.ads.zzgch.zzb(r3, r2)
            com.google.android.gms.internal.ads.zzgax r0 = zzj(r3, r2)
            return r0
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != r6) goto L5
            goto L5b
        L5:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
        L9:
            r0 = 0
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L9
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L5b
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.android.gms.internal.ads.zzfxw.zza(r4, r5)
            if (r4 != 0) goto L2e
            goto L9
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L9
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.google.android.gms.internal.ads.zzfxw.zza(r3, r4)
            if (r3 != 0) goto L39
            goto L9
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L9
        L5b:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L16
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L6
        L16:
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r0 = r2
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r1.zzu(r0)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            r0 = r1
            goto L1a
        L17:
            int r1 = r1 + (-1)
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r1.zzu(r0)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzgde r1 = r0.zzu(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzgax r1 = r0.zzh(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    int zza(java.lang.Object[] r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            int r2 = r6 + r1
            java.lang.Object r3 = r4.get(r1)
            r5[r2] = r3
            int r1 = r1 + 1
            goto L5
        L12:
            int r6 = r6 + r0
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzgax zzd() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgdd zze() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r1.zzu(r0)
            return r0
    }

    public com.google.android.gms.internal.ads.zzgax zzh(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            com.google.android.gms.internal.ads.zzfxz.zzi(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            com.google.android.gms.internal.ads.zzgax r2 = com.google.android.gms.internal.ads.zzgcj.zza
            return r2
        L14:
            com.google.android.gms.internal.ads.zzgaw r0 = new com.google.android.gms.internal.ads.zzgaw
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgde zzu(int r3) {
            r2 = this;
            int r0 = r2.size()
            java.lang.String r1 = "index"
            com.google.android.gms.internal.ads.zzfxz.zzb(r3, r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzgde r3 = com.google.android.gms.internal.ads.zzgax.zza
            return r3
        L12:
            com.google.android.gms.internal.ads.zzgav r0 = new com.google.android.gms.internal.ads.zzgav
            r0.<init>(r2, r3)
            return r0
    }
}
