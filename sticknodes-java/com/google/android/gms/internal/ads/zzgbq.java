package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgbq extends com.google.android.gms.internal.ads.zzgcw {
    zzgbq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            java.util.Map r0 = r1.zza()
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.util.Map r2 = r4.zza()
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzgbu.zza(r2, r0)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r5)
            r3 = 1
            if (r5 == 0) goto L2d
            if (r2 != 0) goto L2c
            java.util.Map r5 = r4.zza()
            boolean r5 = r5.containsKey(r0)
            if (r5 != 0) goto L2b
            goto L2d
        L2b:
            return r3
        L2c:
            r1 = 1
        L2d:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.zza()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L1d
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 == 0) goto L1d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r0 = r1.zza()
            java.util.Set r0 = r0.keySet()
            java.lang.Object r2 = r2.getKey()
            boolean r2 = r0.remove(r2)
            return r2
        L1d:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgcw, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            boolean r1 = com.google.android.gms.internal.ads.zzgcz.zze(r0, r1)     // Catch: java.lang.UnsupportedOperationException -> L8
            return r1
        L8:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = com.google.android.gms.internal.ads.zzgcz.zzf(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgcw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r7) {
            r6 = this;
            java.util.Objects.requireNonNull(r7)
            boolean r7 = super.retainAll(r7)     // Catch: java.lang.UnsupportedOperationException -> L8
            return r7
        L8:
            int r0 = r7.size()
            java.util.HashSet r1 = new java.util.HashSet
            r2 = 3
            if (r0 >= r2) goto L19
            java.lang.String r2 = "expectedSize"
            com.google.android.gms.internal.ads.zzfzu.zza(r0, r2)
            int r0 = r0 + 1
            goto L2a
        L19:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r2) goto L27
            double r2 = (double) r0
            r4 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            goto L2a
        L27:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L2a:
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L31:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r7.next()
            boolean r2 = r6.contains(r0)
            if (r2 == 0) goto L31
            boolean r2 = r0 instanceof java.util.Map.Entry
            if (r2 == 0) goto L31
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            r1.add(r0)
            goto L31
        L4f:
            java.util.Map r7 = r6.zza()
            java.util.Set r7 = r7.keySet()
            boolean r7 = r7.retainAll(r1)
            return r7
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zza()
            int r0 = r0.size()
            return r0
    }

    abstract java.util.Map zza();
}
