package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfzl extends com.google.android.gms.internal.ads.zzfzg implements java.util.SortedSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zzc;

    zzfzl(com.google.android.gms.internal.ads.zzfzq r1, java.util.SortedMap r2) {
            r0 = this;
            r0.zzc = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza()
            java.lang.Object r0 = r0.firstKey()
            return r0
    }

    public java.util.SortedSet headSet(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzl r0 = new com.google.android.gms.internal.ads.zzfzl
            java.util.SortedMap r1 = r2.zza()
            java.util.SortedMap r3 = r1.headMap(r3)
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zzc
            r0.<init>(r1, r3)
            return r0
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza()
            java.lang.Object r0 = r0.lastKey()
            return r0
    }

    public java.util.SortedSet subSet(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzl r0 = new com.google.android.gms.internal.ads.zzfzl
            java.util.SortedMap r1 = r2.zza()
            java.util.SortedMap r3 = r1.subMap(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r4 = r2.zzc
            r0.<init>(r4, r3)
            return r0
    }

    public java.util.SortedSet tailSet(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzl r0 = new com.google.android.gms.internal.ads.zzfzl
            java.util.SortedMap r1 = r2.zza()
            java.util.SortedMap r3 = r1.tailMap(r3)
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zzc
            r0.<init>(r1, r3)
            return r0
    }

    java.util.SortedMap zza() {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }
}
