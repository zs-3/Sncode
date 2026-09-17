package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfzs extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzt zza;

    zzfzs(com.google.android.gms.internal.ads.zzfzt r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzt r0 = r1.zza
            r0.zzp()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzt r0 = r2.zza
            java.util.Map r0 = r0.zzs()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto Le
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzt r0 = r1.zza
            java.util.Iterator r0 = r0.zzg()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzt r0 = r1.zza
            int r0 = r0.zze()
            return r0
    }
}
