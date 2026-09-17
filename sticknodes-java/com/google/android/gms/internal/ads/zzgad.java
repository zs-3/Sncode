package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgad extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgag zza;

    zzgad(com.google.android.gms.internal.ads.zzgag r1) {
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
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r2.zza
            java.util.Map r1 = r0.zzl()
            if (r1 == 0) goto L11
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
            goto L17
        L11:
            com.google.android.gms.internal.ads.zzfzx r1 = new com.google.android.gms.internal.ads.zzfzx
            r1.<init>(r0)
            r0 = r1
        L17:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r0 = r0.keySet()
            boolean r2 = r0.remove(r2)
            goto L1e
        L11:
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzgag.zzh(r0, r2)
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgag.zzk()
            if (r2 != r0) goto L1f
            r2 = 0
        L1e:
            return r2
        L1f:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
