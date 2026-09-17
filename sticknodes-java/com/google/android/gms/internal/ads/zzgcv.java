package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcv extends com.google.android.gms.internal.ads.zzgcu implements java.util.SortedSet {
    zzgcv(java.util.SortedSet r1, com.google.android.gms.internal.ads.zzfya r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
            r1 = this;
            java.util.Collection r0 = r1.zza
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
            r4 = this;
            java.util.Collection r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzfya r1 = r4.zzb
            java.util.Objects.requireNonNull(r1)
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            boolean r3 = r1.zza(r2)
            if (r3 == 0) goto Le
            return r2
        L1f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object r3) {
            r2 = this;
            java.util.Collection r0 = r2.zza
            com.google.android.gms.internal.ads.zzgcv r1 = new com.google.android.gms.internal.ads.zzgcv
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.util.SortedSet r3 = r0.headSet(r3)
            com.google.android.gms.internal.ads.zzfya r0 = r2.zzb
            r1.<init>(r3, r0)
            return r1
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
            r3 = this;
            java.util.Collection r0 = r3.zza
            java.util.SortedSet r0 = (java.util.SortedSet) r0
        L4:
            com.google.android.gms.internal.ads.zzfya r1 = r3.zzb
            java.lang.Object r2 = r0.last()
            boolean r1 = r1.zza(r2)
            if (r1 == 0) goto L11
            return r2
        L11:
            java.util.SortedSet r0 = r0.headSet(r2)
            goto L4
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.util.Collection r0 = r2.zza
            com.google.android.gms.internal.ads.zzgcv r1 = new com.google.android.gms.internal.ads.zzgcv
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.util.SortedSet r3 = r0.subSet(r3, r4)
            com.google.android.gms.internal.ads.zzfya r4 = r2.zzb
            r1.<init>(r3, r4)
            return r1
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object r3) {
            r2 = this;
            java.util.Collection r0 = r2.zza
            com.google.android.gms.internal.ads.zzgcv r1 = new com.google.android.gms.internal.ads.zzgcv
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.util.SortedSet r3 = r0.tailSet(r3)
            com.google.android.gms.internal.ads.zzfya r0 = r2.zzb
            r1.<init>(r3, r0)
            return r1
    }
}
