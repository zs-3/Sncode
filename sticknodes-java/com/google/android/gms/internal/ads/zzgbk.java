package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgbk extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    final java.util.List zza;
    final com.google.android.gms.internal.ads.zzfxq zzb;

    zzgbk(java.util.List r1, com.google.android.gms.internal.ads.zzfxq r2) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.ads.zzfxq r1 = r2.zzb
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object r3 = r1.apply(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r1 = this;
            java.util.List r0 = r1.zza
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.ListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.ads.zzgbj r1 = new com.google.android.gms.internal.ads.zzgbj
            java.util.ListIterator r3 = r0.listIterator(r3)
            r1.<init>(r2, r3)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.ads.zzfxq r1 = r2.zzb
            java.lang.Object r3 = r0.remove(r3)
            java.lang.Object r3 = r1.apply(r3)
            return r3
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r2, int r3) {
            r1 = this;
            java.util.List r0 = r1.zza
            java.util.List r2 = r0.subList(r2, r3)
            r2.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
