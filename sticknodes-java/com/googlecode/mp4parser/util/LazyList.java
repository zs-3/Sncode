package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class LazyList<E> extends java.util.AbstractList<E> {
    private static final com.googlecode.mp4parser.util.Logger LOG = null;
    java.util.Iterator<E> elementSource;
    java.util.List<E> underlying;


    static {
            java.lang.Class<com.googlecode.mp4parser.util.LazyList> r0 = com.googlecode.mp4parser.util.LazyList.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.googlecode.mp4parser.util.LazyList.LOG = r0
            return
    }

    public LazyList(java.util.List<E> r1, java.util.Iterator<E> r2) {
            r0 = this;
            r0.<init>()
            r0.underlying = r1
            r0.elementSource = r2
            return
    }

    private void blowup() {
            r2 = this;
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.LazyList.LOG
            java.lang.String r1 = "blowup running"
            r0.logDebug(r1)
        L7:
            java.util.Iterator<E> r0 = r2.elementSource
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
            return
        L10:
            java.util.List<E> r0 = r2.underlying
            java.util.Iterator<E> r1 = r2.elementSource
            java.lang.Object r1 = r1.next()
            r0.add(r1)
            goto L7
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            java.util.List<E> r0 = r2.underlying
            int r0 = r0.size()
            if (r0 <= r3) goto Lf
            java.util.List<E> r0 = r2.underlying
            java.lang.Object r3 = r0.get(r3)
            return r3
        Lf:
            java.util.Iterator<E> r0 = r2.elementSource
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            java.util.List<E> r0 = r2.underlying
            java.util.Iterator<E> r1 = r2.elementSource
            java.lang.Object r1 = r1.next()
            r0.add(r1)
            java.lang.Object r3 = r2.get(r3)
            return r3
        L27:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    public java.util.List<E> getUnderlying() {
            r1 = this;
            java.util.List<E> r0 = r1.underlying
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
            r1 = this;
            com.googlecode.mp4parser.util.LazyList$1 r0 = new com.googlecode.mp4parser.util.LazyList$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r2 = this;
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.LazyList.LOG
            java.lang.String r1 = "potentially expensive size() call"
            r0.logDebug(r1)
            r2.blowup()
            java.util.List<E> r0 = r2.underlying
            int r0 = r0.size()
            return r0
    }
}
