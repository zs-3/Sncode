package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfzv extends java.util.AbstractCollection {
    final java.util.Collection zza;
    final com.google.android.gms.internal.ads.zzfya zzb;

    zzfzv(java.util.Collection r1, com.google.android.gms.internal.ads.zzfya r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfya r0 = r1.zzb
            boolean r0 = r0.zza(r2)
            com.google.android.gms.internal.ads.zzfxz.zze(r0)
            java.util.Collection r0 = r1.zza
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfya r2 = r3.zzb
            boolean r1 = r2.zza(r1)
            com.google.android.gms.internal.ads.zzfxz.zze(r1)
            goto L4
        L18:
            java.util.Collection r0 = r3.zza
            boolean r4 = r0.addAll(r4)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r2 = this;
            java.util.Collection r0 = r2.zza
            com.google.android.gms.internal.ads.zzfya r1 = r2.zzb
            com.google.android.gms.internal.ads.zzgbd.zzb(r0, r1)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.Collection r0 = r1.zza
            boolean r0 = com.google.android.gms.internal.ads.zzfzw.zza(r0, r2)
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzfya r0 = r1.zzb
            boolean r2 = r0.zza(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
            r5 = this;
            com.google.android.gms.internal.ads.zzfya r0 = r5.zzb
            java.util.Collection r1 = r5.zza
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r2 = "predicate"
            com.google.android.gms.internal.ads.zzfxz.zzc(r0, r2)
            r2 = 0
            r3 = 0
        Lf:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L26
            java.lang.Object r4 = r1.next()
            boolean r4 = r0.zza(r4)
            if (r4 == 0) goto L23
            r0 = -1
            if (r3 == r0) goto L26
            return r2
        L23:
            int r3 = r3 + 1
            goto Lf
        L26:
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            java.util.Collection r0 = r3.zza
            java.util.Iterator r0 = r0.iterator()
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzfya r1 = r3.zzb
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzgbe r2 = new com.google.android.gms.internal.ads.zzgbe
            r2.<init>(r0, r1)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L10
            java.util.Collection r0 = r1.zza
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r5) {
            r4 = this;
            java.util.Collection r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.ads.zzfya r3 = r4.zzb
            boolean r3 = r3.zza(r2)
            if (r3 == 0) goto L7
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L7
            r0.remove()
            r1 = 1
            goto L7
        L24:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r5) {
            r4 = this;
            java.util.Collection r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.ads.zzfya r3 = r4.zzb
            boolean r3 = r3.zza(r2)
            if (r3 == 0) goto L7
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L7
            r0.remove()
            r1 = 1
            goto L7
        L24:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r4 = this;
            java.util.Collection r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.ads.zzfya r3 = r4.zzb
            boolean r2 = r3.zza(r2)
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1c:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.gms.internal.ads.zzgbh.zzc(r1, r0)
            java.lang.Object[] r0 = r1.toArray()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.gms.internal.ads.zzgbh.zzc(r1, r0)
            java.lang.Object[] r3 = r1.toArray(r3)
            return r3
    }
}
