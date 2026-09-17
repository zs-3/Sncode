package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver.Observable {
    private final java.util.HashSet zaa;

    public DataBufferObserverSet() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(com.google.android.gms.common.data.DataBufferObserver r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zaa
            r0.add(r2)
            return
    }

    public void clear() {
            r1 = this;
            java.util.HashSet r0 = r1.zaa
            r0.clear()
            return
    }

    public boolean hasObservers() {
            r1 = this;
            java.util.HashSet r0 = r1.zaa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
            r2 = this;
            java.util.HashSet r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.data.DataBufferObserver r1 = (com.google.android.gms.common.data.DataBufferObserver) r1
            r1.onDataChanged()
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int r3, int r4) {
            r2 = this;
            java.util.HashSet r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.data.DataBufferObserver r1 = (com.google.android.gms.common.data.DataBufferObserver) r1
            r1.onDataRangeChanged(r3, r4)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int r3, int r4) {
            r2 = this;
            java.util.HashSet r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.data.DataBufferObserver r1 = (com.google.android.gms.common.data.DataBufferObserver) r1
            r1.onDataRangeInserted(r3, r4)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int r3, int r4, int r5) {
            r2 = this;
            java.util.HashSet r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.data.DataBufferObserver r1 = (com.google.android.gms.common.data.DataBufferObserver) r1
            r1.onDataRangeMoved(r3, r4, r5)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int r3, int r4) {
            r2 = this;
            java.util.HashSet r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.data.DataBufferObserver r1 = (com.google.android.gms.common.data.DataBufferObserver) r1
            r1.onDataRangeRemoved(r3, r4)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(com.google.android.gms.common.data.DataBufferObserver r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zaa
            r0.remove(r2)
            return
    }
}
