package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfzk extends com.google.android.gms.internal.ads.zzfzd implements java.util.SortedMap {
    java.util.SortedSet zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zze;

    zzfzk(com.google.android.gms.internal.ads.zzfzq r1, java.util.SortedMap r2) {
            r0 = this;
            r0.zze = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
            r1 = this;
            java.util.SortedMap r0 = r1.zzf()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
            r1 = this;
            java.util.SortedMap r0 = r1.zzf()
            java.lang.Object r0 = r0.firstKey()
            return r0
    }

    public java.util.SortedMap headMap(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzk r0 = new com.google.android.gms.internal.ads.zzfzk
            java.util.SortedMap r1 = r2.zzf()
            java.util.SortedMap r3 = r1.headMap(r3)
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zze
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzd, com.google.android.gms.internal.ads.zzgbt, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            java.util.SortedSet r0 = r1.zzh()
            return r0
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
            r1 = this;
            java.util.SortedMap r0 = r1.zzf()
            java.lang.Object r0 = r0.lastKey()
            return r0
    }

    public java.util.SortedMap subMap(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzk r0 = new com.google.android.gms.internal.ads.zzfzk
            java.util.SortedMap r1 = r2.zzf()
            java.util.SortedMap r3 = r1.subMap(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zze
            r0.<init>(r4, r3)
            return r0
    }

    public java.util.SortedMap tailMap(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzk r0 = new com.google.android.gms.internal.ads.zzfzk
            java.util.SortedMap r1 = r2.zzf()
            java.util.SortedMap r3 = r1.tailMap(r3)
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zze
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    /* bridge */ /* synthetic */ java.util.Set zze() {
            r1 = this;
            java.util.SortedSet r0 = r1.zzg()
            return r0
    }

    java.util.SortedMap zzf() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    java.util.SortedSet zzg() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfzl r0 = new com.google.android.gms.internal.ads.zzfzl
            com.google.android.gms.internal.ads.zzfzq r1 = r3.zze
            java.util.SortedMap r2 = r3.zzf()
            r0.<init>(r1, r2)
            return r0
    }

    public java.util.SortedSet zzh() {
            r1 = this;
            java.util.SortedSet r0 = r1.zzd
            if (r0 != 0) goto La
            java.util.SortedSet r0 = r1.zzg()
            r1.zzd = r0
        La:
            return r0
    }
}
