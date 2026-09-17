package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zziw<E> extends java.util.AbstractList<E> implements com.google.android.gms.internal.drive.zzkp<E> {
    private boolean zznh;

    zziw() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zznh = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            r0.zzbq()
            super.add(r1, r2)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r1) {
            r0 = this;
            r0.zzbq()
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            r0.zzbq()
            boolean r1 = super.addAll(r1, r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            r0.zzbq()
            boolean r1 = super.addAll(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r0 = this;
            r0.zzbq()
            super.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r7 instanceof java.util.RandomAccess
            if (r1 != 0) goto L13
            boolean r7 = super.equals(r7)
            return r7
        L13:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L20
            return r2
        L20:
            r3 = 0
        L21:
            if (r3 >= r1) goto L35
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L32
            return r2
        L32:
            int r3 = r3 + 1
            goto L21
        L35:
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
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

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r1) {
            r0 = this;
            r0.zzbq()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.zzbq()
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            r0.zzbq()
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            r0.zzbq()
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r1, E r2) {
            r0 = this;
            r0.zzbq()
            java.lang.Object r1 = super.set(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public boolean zzbo() {
            r1 = this;
            boolean r0 = r1.zznh
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final void zzbp() {
            r1 = this;
            r0 = 0
            r1.zznh = r0
            return
    }

    protected final void zzbq() {
            r1 = this;
            boolean r0 = r1.zznh
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
