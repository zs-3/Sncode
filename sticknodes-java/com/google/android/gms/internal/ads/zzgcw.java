package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgcw extends java.util.AbstractSet {
    zzgcw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.internal.ads.zzgcz.zze(r0, r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            boolean r1 = super.retainAll(r1)
            return r1
    }
}
