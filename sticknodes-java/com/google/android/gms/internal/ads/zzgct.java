package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgct extends com.google.android.gms.internal.ads.zzgcy {
    final /* synthetic */ java.util.Set zza;
    final /* synthetic */ java.util.Set zzb;

    zzgct(java.util.Set r1, java.util.Set r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.Set r0 = r1.zza
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L12
            java.util.Set r0 = r1.zzb
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.util.Set r0 = r1.zza
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L12
            java.util.Set r0 = r1.zzb
            boolean r2 = r0.containsAll(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r2 = this;
            java.util.Set r0 = r2.zzb
            java.util.Set r1 = r2.zza
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgcs r0 = new com.google.android.gms.internal.ads.zzgcs
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r4 = this;
            java.util.Set r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            java.util.Set r3 = r4.zzb
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1c:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final com.google.android.gms.internal.ads.zzgdd zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgcs r0 = new com.google.android.gms.internal.ads.zzgcs
            r0.<init>(r1)
            return r0
    }
}
