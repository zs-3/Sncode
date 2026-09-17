package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private java.lang.Object zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            int r0 = r4.zab
            int r0 = r0 + 1
            r4.zab = r0
            if (r0 != 0) goto L44
            com.google.android.gms.common.data.DataBuffer r0 = r4.zaa
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r4.zac = r0
            boolean r1 = r0 instanceof com.google.android.gms.common.data.DataBufferRef
            if (r1 == 0) goto L20
            goto L51
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DataBuffer reference of type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is not movable"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L44:
            java.lang.Object r0 = r4.zac
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.data.DataBufferRef r0 = (com.google.android.gms.common.data.DataBufferRef) r0
            int r1 = r4.zab
            r0.zaa(r1)
        L51:
            java.lang.Object r0 = r4.zac
            return r0
        L54:
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
}
