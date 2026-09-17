package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfzi extends com.google.android.gms.internal.ads.zzfzl implements java.util.NavigableSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zzb;

    zzfzi(com.google.android.gms.internal.ads.zzfzq r1, java.util.NavigableMap r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.ceilingKey(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
            r1 = this;
            java.util.NavigableSet r0 = r1.descendingSet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfzi r0 = new com.google.android.gms.internal.ads.zzfzi
            java.util.Map r1 = r3.zzd
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            java.util.NavigableMap r1 = r1.descendingMap()
            com.google.android.gms.internal.ads.zzfzq r2 = r3.zzb
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.floorKey(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object r3, boolean r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzi r0 = new com.google.android.gms.internal.ads.zzfzi
            java.util.Map r1 = r2.zzd
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            java.util.NavigableMap r3 = r1.headMap(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzb
            r0.<init>(r4, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzl, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableSet r2 = r1.headSet(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.higherKey(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.lowerKey(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgbh.zza(r0)
            return r0
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
            r1 = this;
            java.util.Iterator r0 = r1.descendingIterator()
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgbh.zza(r0)
            return r0
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object r3, boolean r4, java.lang.Object r5, boolean r6) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzi r0 = new com.google.android.gms.internal.ads.zzfzi
            java.util.Map r1 = r2.zzd
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            java.util.NavigableMap r3 = r1.subMap(r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzb
            r0.<init>(r4, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzl, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
            return r3
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object r3, boolean r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzi r0 = new com.google.android.gms.internal.ads.zzfzi
            java.util.Map r1 = r2.zzd
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            java.util.NavigableMap r3 = r1.tailMap(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzb
            r0.<init>(r4, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzl, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableSet r2 = r1.tailSet(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfzl
    final /* synthetic */ java.util.SortedMap zza() {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            return r0
    }
}
