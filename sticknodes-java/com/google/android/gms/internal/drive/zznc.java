package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zznc implements java.util.Iterator<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzna zzvw;
    private java.util.Iterator<java.lang.String> zzvx;

    zznc(com.google.android.gms.internal.drive.zzna r1) {
            r0 = this;
            r0.zzvw = r1
            r0.<init>()
            com.google.android.gms.internal.drive.zzkz r1 = com.google.android.gms.internal.drive.zzna.zza(r1)
            java.util.Iterator r1 = r1.iterator()
            r0.zzvx = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<java.lang.String> r0 = r1.zzvx
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
            r1 = this;
            java.util.Iterator<java.lang.String> r0 = r1.zzvx
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
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
