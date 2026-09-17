package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgdc extends com.google.android.gms.internal.ads.zzgdb implements java.util.ListIterator {
    zzgdc(java.util.ListIterator r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.previous()
            java.lang.Object r0 = r1.zza(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
