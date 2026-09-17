package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfzg extends com.google.android.gms.internal.ads.zzgbr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zza;

    zzfzg(com.google.android.gms.internal.ads.zzfzq r1, java.util.Map r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgbr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            com.google.android.gms.internal.ads.zzgbh.zzb(r0)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.Set r0 = r0.keySet()
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L11
            java.util.Map r0 = r1.zzd
            java.util.Set r0 = r0.keySet()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.Set r0 = r0.keySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            java.util.Map r0 = r2.zzd
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.ads.zzfzf r1 = new com.google.android.gms.internal.ads.zzfzf
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgbr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            java.util.Map r0 = r2.zzd
            java.lang.Object r3 = r0.remove(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L1f
            int r0 = r3.size()
            r3.clear()
            com.google.android.gms.internal.ads.zzfzq r3 = r2.zza
            int r1 = com.google.android.gms.internal.ads.zzfzq.zzd(r3)
            int r1 = r1 - r0
            com.google.android.gms.internal.ads.zzfzq.zzn(r3, r1)
            if (r0 <= 0) goto L1f
            r3 = 1
            return r3
        L1f:
            r3 = 0
            return r3
    }
}
