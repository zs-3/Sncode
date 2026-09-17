package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class DataBufferIterator<T> implements java.util.Iterator<T> {
    protected final com.google.android.gms.common.data.DataBuffer zaa;
    protected int zab;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.data.DataBuffer r1 = (com.google.android.gms.common.data.DataBuffer) r1
            r0.zaa = r1
            r1 = -1
            r0.zab = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            com.google.android.gms.common.data.DataBuffer r0 = r2.zaa
            int r1 = r2.zab
            int r0 = r0.getCount()
            int r0 = r0 + (-1)
            if (r1 >= r0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r4 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L13
            com.google.android.gms.common.data.DataBuffer r0 = r4.zaa
            int r1 = r4.zab
            int r1 = r1 + 1
            r4.zab = r1
            java.lang.Object r0 = r0.get(r1)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            int r1 = r4.zab
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot advance the iterator beyond "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Cannot remove elements from a DataBufferIterator"
            r0.<init>(r1)
            throw r0
    }
}
