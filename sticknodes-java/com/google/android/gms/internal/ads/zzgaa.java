package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgaa extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgag zza;

    zzgaa(com.google.android.gms.internal.ads.zzgag r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r3.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r0 = r0.entrySet()
            boolean r4 = r0.contains(r4)
            return r4
        L11:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L37
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.google.android.gms.internal.ads.zzgag r0 = r3.zza
            java.lang.Object r2 = r4.getKey()
            int r0 = com.google.android.gms.internal.ads.zzgag.zzd(r0, r2)
            r2 = -1
            if (r0 == r2) goto L37
            com.google.android.gms.internal.ads.zzgag r2 = r3.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgag.zzj(r2, r0)
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.android.gms.internal.ads.zzfxw.zza(r0, r4)
            if (r4 == 0) goto L37
            r4 = 1
            return r4
        L37:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r2.zza
            java.util.Map r1 = r0.zzl()
            if (r1 == 0) goto L11
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            goto L17
        L11:
            com.google.android.gms.internal.ads.zzfzy r1 = new com.google.android.gms.internal.ads.zzfzy
            r1.<init>(r0)
            r0 = r1
        L17:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r9.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r0 = r0.entrySet()
            boolean r10 = r0.remove(r10)
            return r10
        L11:
            boolean r0 = r10 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.android.gms.internal.ads.zzgag r0 = r9.zza
            boolean r1 = r0.zzr()
            if (r1 == 0) goto L20
            goto L5c
        L20:
            int r0 = com.google.android.gms.internal.ads.zzgag.zzc(r0)
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            com.google.android.gms.internal.ads.zzgag r10 = r9.zza
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgag.zzi(r10)
            int[] r6 = com.google.android.gms.internal.ads.zzgag.zzs(r10)
            java.lang.Object[] r7 = com.google.android.gms.internal.ads.zzgag.zzt(r10)
            java.lang.Object[] r8 = com.google.android.gms.internal.ads.zzgag.zzu(r10)
            r4 = r0
            int r10 = com.google.android.gms.internal.ads.zzgah.zzb(r2, r3, r4, r5, r6, r7, r8)
            r1 = -1
            if (r10 == r1) goto L5c
            com.google.android.gms.internal.ads.zzgag r2 = r9.zza
            r2.zzq(r10, r0)
            com.google.android.gms.internal.ads.zzgag r10 = r9.zza
            int r0 = com.google.android.gms.internal.ads.zzgag.zzb(r10)
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzgag.zzm(r10, r0)
            com.google.android.gms.internal.ads.zzgag r10 = r9.zza
            r10.zzo()
            r10 = 1
            return r10
        L5c:
            r10 = 0
            return r10
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
