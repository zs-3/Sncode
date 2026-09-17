package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzhhy implements java.util.Iterator {
    int zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzhhz zzb;

    zzhhy(com.google.android.gms.internal.ads.zzhhz r1) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r1 = 0
            r0.zza = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.zza
            com.google.android.gms.internal.ads.zzhhz r1 = r2.zzb
            java.util.List r1 = r1.zza
            int r1 = r1.size()
            if (r0 < r1) goto L19
            com.google.android.gms.internal.ads.zzhhz r0 = r2.zzb
            java.util.Iterator r0 = r0.zzb
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            return r0
        L19:
            r0 = 1
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.zza
            com.google.android.gms.internal.ads.zzhhz r1 = r3.zzb
            java.util.List r1 = r1.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            com.google.android.gms.internal.ads.zzhhz r0 = r3.zzb
            int r1 = r3.zza
            int r2 = r1 + 1
            r3.zza = r2
            java.util.List r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            return r0
        L1b:
            com.google.android.gms.internal.ads.zzhhz r0 = r3.zzb
            java.util.List r1 = r0.zza
            java.util.Iterator r0 = r0.zzb
            java.lang.Object r0 = r0.next()
            r1.add(r0)
            java.lang.Object r0 = r3.next()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
