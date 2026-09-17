package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmk implements java.util.Iterator {
    private int pos;
    private java.util.Iterator zzvj;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    private zzmk(com.google.android.gms.internal.drive.zzmi r1) {
            r0 = this;
            r0.zzvk = r1
            r0.<init>()
            java.util.List r1 = com.google.android.gms.internal.drive.zzmi.zzb(r1)
            int r1 = r1.size()
            r0.pos = r1
            return
    }

    /* synthetic */ zzmk(com.google.android.gms.internal.drive.zzmi r1, com.google.android.gms.internal.drive.zzmj r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final java.util.Iterator zzew() {
            r1 = this;
            java.util.Iterator r0 = r1.zzvj
            if (r0 != 0) goto L14
            com.google.android.gms.internal.drive.zzmi r0 = r1.zzvk
            java.util.Map r0 = com.google.android.gms.internal.drive.zzmi.zzd(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.zzvj = r0
        L14:
            java.util.Iterator r0 = r1.zzvj
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.pos
            if (r0 <= 0) goto L10
            com.google.android.gms.internal.drive.zzmi r1 = r2.zzvk
            java.util.List r1 = com.google.android.gms.internal.drive.zzmi.zzb(r1)
            int r1 = r1.size()
            if (r0 <= r1) goto L1a
        L10:
            java.util.Iterator r0 = r2.zzew()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
            r2 = this;
            java.util.Iterator r0 = r2.zzew()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L15
            java.util.Iterator r0 = r2.zzew()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L15:
            com.google.android.gms.internal.drive.zzmi r0 = r2.zzvk
            java.util.List r0 = com.google.android.gms.internal.drive.zzmi.zzb(r0)
            int r1 = r2.pos
            int r1 = r1 + (-1)
            r2.pos = r1
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
