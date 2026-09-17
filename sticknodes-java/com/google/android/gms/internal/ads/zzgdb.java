package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgdb implements java.util.Iterator {
    final java.util.Iterator zzb;

    zzgdb(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zzb = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = r1.zza(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            r0.remove()
            return
    }

    abstract java.lang.Object zza(java.lang.Object r1);
}
