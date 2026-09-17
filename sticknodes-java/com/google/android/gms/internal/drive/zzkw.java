package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzkw<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zztg;

    public zzkw(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> r1) {
            r0 = this;
            r0.<init>()
            r0.zztg = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.zztg
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
            r3 = this;
            java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r3.zztg
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof com.google.android.gms.internal.drive.zzkt
            if (r1 == 0) goto L17
            com.google.android.gms.internal.drive.zzkv r1 = new com.google.android.gms.internal.drive.zzkv
            r2 = 0
            r1.<init>(r0, r2)
            return r1
        L17:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.zztg
            r0.remove()
            return
    }
}
