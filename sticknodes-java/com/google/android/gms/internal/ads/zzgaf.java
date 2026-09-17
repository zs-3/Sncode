package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgaf extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgag zza;

    zzgaf(com.google.android.gms.internal.ads.zzgag r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r2.zza
            java.util.Map r1 = r0.zzl()
            if (r1 == 0) goto L11
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
            goto L17
        L11:
            com.google.android.gms.internal.ads.zzfzz r1 = new com.google.android.gms.internal.ads.zzfzz
            r1.<init>(r0)
            r0 = r1
        L17:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
