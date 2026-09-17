package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhhz extends java.util.AbstractList {
    private static final com.google.android.gms.internal.ads.zzhia zzc = null;
    final java.util.List zza;
    final java.util.Iterator zzb;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzhhz> r0 = com.google.android.gms.internal.ads.zzhhz.class
            com.google.android.gms.internal.ads.zzhia r0 = com.google.android.gms.internal.ads.zzhia.zzb(r0)
            com.google.android.gms.internal.ads.zzhhz.zzc = r0
            return
    }

    public zzhhz(java.util.List r1, java.util.Iterator r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            int r0 = r0.size()
            if (r0 <= r3) goto Lf
            java.util.List r0 = r2.zza
            java.lang.Object r3 = r0.get(r3)
            return r3
        Lf:
            java.util.Iterator r0 = r2.zzb
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            java.util.List r0 = r2.zza
            java.util.Iterator r1 = r2.zzb
            java.lang.Object r1 = r1.next()
            r0.add(r1)
            java.lang.Object r3 = r2.get(r3)
            return r3
        L27:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhhy r0 = new com.google.android.gms.internal.ads.zzhhy
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhia r0 = com.google.android.gms.internal.ads.zzhhz.zzc
            java.lang.String r1 = "potentially expensive size() call"
            r0.zza(r1)
            java.lang.String r1 = "blowup running"
            r0.zza(r1)
        Lc:
            java.util.Iterator r0 = r2.zzb
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L20
            java.util.List r0 = r2.zza
            java.util.Iterator r1 = r2.zzb
            java.lang.Object r1 = r1.next()
            r0.add(r1)
            goto Lc
        L20:
            java.util.List r0 = r2.zza
            int r0 = r0.size()
            return r0
    }
}
