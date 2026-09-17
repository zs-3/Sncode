package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zznb implements java.util.ListIterator<java.lang.String> {
    private java.util.ListIterator<java.lang.String> zzvu;
    private final /* synthetic */ int zzvv;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzna zzvw;

    zznb(com.google.android.gms.internal.drive.zzna r1, int r2) {
            r0 = this;
            r0.zzvw = r1
            r0.zzvv = r2
            r0.<init>()
            com.google.android.gms.internal.drive.zzkz r1 = com.google.android.gms.internal.drive.zzna.zza(r1)
            java.util.ListIterator r1 = r1.listIterator(r2)
            r0.zzvu = r1
            return
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.zzvu
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.zzvu
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.zzvu
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.zzvu
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ java.lang.String previous() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.zzvu
            java.lang.Object r0 = r0.previous()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.zzvu
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
