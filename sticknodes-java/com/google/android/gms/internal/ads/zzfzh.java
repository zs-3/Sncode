package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfzh extends com.google.android.gms.internal.ads.zzfzk implements java.util.NavigableMap {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zzc;

    zzfzh(com.google.android.gms.internal.ads.zzfzq r1, java.util.NavigableMap r2) {
            r0 = this;
            r0.zzc = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.Map$Entry r2 = r0.ceilingEntry(r2)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.Map$Entry r2 = r1.zza(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.ceilingKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.descendingMap()
            com.google.android.gms.internal.ads.zzfzk r0 = (com.google.android.gms.internal.ads.zzfzk) r0
            java.util.SortedSet r0 = super.zzh()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
            r3 = this;
            java.util.Map r0 = r3.zza
            com.google.android.gms.internal.ads.zzfzh r1 = new com.google.android.gms.internal.ads.zzfzh
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.NavigableMap r0 = r0.descendingMap()
            com.google.android.gms.internal.ads.zzfzq r2 = r3.zzc
            r1.<init>(r2, r0)
            return r1
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.Map$Entry r0 = r0.firstEntry()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.Map$Entry r0 = r1.zza(r0)
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.Map$Entry r2 = r0.floorEntry(r2)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.Map$Entry r2 = r1.zza(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.floorKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object r3, boolean r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            com.google.android.gms.internal.ads.zzfzh r1 = new com.google.android.gms.internal.ads.zzfzh
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.NavigableMap r3 = r0.headMap(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzc
            r1.<init>(r4, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfzk, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.Map$Entry r2 = r0.higherEntry(r2)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.Map$Entry r2 = r1.zza(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.higherKey(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfzk, com.google.android.gms.internal.ads.zzfzd, com.google.android.gms.internal.ads.zzgbt, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
            r1 = this;
            java.util.SortedSet r0 = super.zzh()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.Map$Entry r0 = r0.lastEntry()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.Map$Entry r0 = r1.zza(r0)
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.Map$Entry r2 = r0.lowerEntry(r2)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.Map$Entry r2 = r1.zza(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.lang.Object r2 = r0.lowerKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
            r1 = this;
            java.util.SortedSet r0 = super.zzh()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollFirstEntry() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.Map$Entry r0 = r1.zzc(r0)
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollLastEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.descendingMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.Map$Entry r0 = r1.zzc(r0)
            return r0
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object r3, boolean r4, java.lang.Object r5, boolean r6) {
            r2 = this;
            java.util.Map r0 = r2.zza
            com.google.android.gms.internal.ads.zzfzh r1 = new com.google.android.gms.internal.ads.zzfzh
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.NavigableMap r3 = r0.subMap(r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzc
            r1.<init>(r4, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfzk, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
            return r3
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object r3, boolean r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            com.google.android.gms.internal.ads.zzfzh r1 = new com.google.android.gms.internal.ads.zzfzh
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            java.util.NavigableMap r3 = r0.tailMap(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzc
            r1.<init>(r4, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfzk, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            return r2
    }

    final java.util.Map.Entry zzc(java.util.Iterator r4) {
            r3 = this;
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.android.gms.internal.ads.zzfzq r1 = r3.zzc
            java.util.Collection r1 = r1.zza()
            java.lang.Object r2 = r0.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            r4.remove()
            java.lang.Object r4 = r0.getKey()
            com.google.android.gms.internal.ads.zzfzq r0 = r3.zzc
            java.util.Collection r0 = r0.zzb(r1)
            com.google.android.gms.internal.ads.zzgat r1 = new com.google.android.gms.internal.ads.zzgat
            r1.<init>(r4, r0)
            return r1
    }

    final java.util.NavigableSet zzd() {
            r3 = this;
            java.util.Map r0 = r3.zza
            com.google.android.gms.internal.ads.zzfzi r1 = new com.google.android.gms.internal.ads.zzfzi
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            com.google.android.gms.internal.ads.zzfzq r2 = r3.zzc
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfzk, com.google.android.gms.internal.ads.zzgbt
    final /* bridge */ /* synthetic */ java.util.Set zze() {
            r1 = this;
            java.util.NavigableSet r0 = r1.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    final /* synthetic */ java.util.SortedMap zzf() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    final /* bridge */ /* synthetic */ java.util.SortedSet zzg() {
            r1 = this;
            java.util.NavigableSet r0 = r1.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final /* synthetic */ java.util.SortedSet zzh() {
            r1 = this;
            java.util.SortedSet r0 = super.zzh()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }
}
