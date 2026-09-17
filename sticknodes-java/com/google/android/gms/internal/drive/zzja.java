package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzja extends com.google.android.gms.internal.drive.zziw<java.lang.Boolean> implements com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzja zzno = null;
    private int size;
    private boolean[] zznp;

    static {
            com.google.android.gms.internal.drive.zzja r0 = new com.google.android.gms.internal.drive.zzja
            r1 = 0
            boolean[] r2 = new boolean[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.drive.zzja.zzno = r0
            r0.zzbp()
            return
    }

    zzja() {
            r2 = this;
            r0 = 10
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private zzja(boolean[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zznp = r1
            r0.size = r2
            return
    }

    private final void zza(int r5, boolean r6) {
            r4 = this;
            r4.zzbq()
            if (r5 < 0) goto L3e
            int r0 = r4.size
            if (r5 > r0) goto L3e
            boolean[] r1 = r4.zznp
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r2, r0)
            goto L2d
        L15:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            boolean[] r0 = new boolean[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            boolean[] r1 = r4.zznp
            int r2 = r5 + 1
            int r3 = r4.size
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r0, r2, r3)
            r4.zznp = r0
        L2d:
            boolean[] r0 = r4.zznp
            r0[r5] = r6
            int r5 = r4.size
            int r5 = r5 + 1
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L3e:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.zzq(r5)
            r6.<init>(r5)
            throw r6
    }

    private final void zzp(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.size
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.zzq(r2)
            r0.<init>(r2)
            throw r0
    }

    private final java.lang.String zzq(int r4) {
            r3 = this;
            int r0 = r3.size
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 35
            r1.<init>(r2)
            java.lang.String r2 = "Index:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.zza(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> r6) {
            r5 = this;
            r5.zzbq()
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.drive.zzja
            if (r0 != 0) goto Lf
            boolean r6 = super.addAll(r6)
            return r6
        Lf:
            com.google.android.gms.internal.drive.zzja r6 = (com.google.android.gms.internal.drive.zzja) r6
            int r0 = r6.size
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r5.size
            int r2 = r2 - r3
            if (r2 < r0) goto L3f
            int r3 = r3 + r0
            boolean[] r0 = r5.zznp
            int r2 = r0.length
            if (r3 <= r2) goto L2b
            boolean[] r0 = java.util.Arrays.copyOf(r0, r3)
            r5.zznp = r0
        L2b:
            boolean[] r0 = r6.zznp
            boolean[] r2 = r5.zznp
            int r4 = r5.size
            int r6 = r6.size
            java.lang.System.arraycopy(r0, r1, r2, r4, r6)
            r5.size = r3
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L3f:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    public final void addBoolean(boolean r2) {
            r1 = this;
            int r0 = r1.size
            r1.zza(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.drive.zzja
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            com.google.android.gms.internal.drive.zzja r6 = (com.google.android.gms.internal.drive.zzja) r6
            int r1 = r5.size
            int r2 = r6.size
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            boolean[] r6 = r6.zznp
            r1 = 0
        L1a:
            int r2 = r5.size
            if (r1 >= r2) goto L2a
            boolean[] r2 = r5.zznp
            boolean r2 = r2[r1]
            boolean r4 = r6[r1]
            if (r2 == r4) goto L27
            return r3
        L27:
            int r1 = r1 + 1
            goto L1a
        L2a:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            r1.zzp(r2)
            boolean[] r0 = r1.zznp
            boolean r2 = r0[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.size
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            boolean[] r2 = r3.zznp
            boolean r2 = r2[r1]
            int r2 = com.google.android.gms.internal.drive.zzkm.zze(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.zzbq()
            r4.zzp(r5)
            boolean[] r0 = r4.zznp
            boolean r1 = r0[r5]
            int r2 = r4.size
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.size
            int r5 = r5 + (-1)
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r5) {
            r4 = this;
            r4.zzbq()
            r0 = 0
            r1 = 0
        L5:
            int r2 = r4.size
            if (r1 >= r2) goto L31
            boolean[] r2 = r4.zznp
            boolean r2 = r2[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L2e
            boolean[] r5 = r4.zznp
            int r0 = r1 + 1
            int r2 = r4.size
            int r2 = r2 - r1
            r3 = 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r5, r0, r5, r1, r2)
            int r5 = r4.size
            int r5 = r5 - r3
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            return r0
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zzbq()
            if (r4 < r3) goto L1a
            boolean[] r0 = r2.zznp
            int r1 = r2.size
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.size
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.size = r0
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

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.zzbq()
            r2.zzp(r3)
            boolean[] r0 = r2.zznp
            boolean r1 = r0[r3]
            r0[r3] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp zzr(int r3) {
            r2 = this;
            int r0 = r2.size
            if (r3 < r0) goto L12
            com.google.android.gms.internal.drive.zzja r0 = new com.google.android.gms.internal.drive.zzja
            boolean[] r1 = r2.zznp
            boolean[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.size
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }
}
