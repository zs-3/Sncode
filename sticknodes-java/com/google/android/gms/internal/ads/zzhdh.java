package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhdh implements java.util.Iterator {
    private final java.util.ArrayDeque zza;
    private com.google.android.gms.internal.ads.zzgzp zzb;

    /* synthetic */ zzhdh(com.google.android.gms.internal.ads.zzgzs r2, com.google.android.gms.internal.ads.zzhdg r3) {
            r1 = this;
            r1.<init>()
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzhdj
            if (r3 == 0) goto L22
            com.google.android.gms.internal.ads.zzhdj r2 = (com.google.android.gms.internal.ads.zzhdj) r2
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            int r0 = r2.zzf()
            r3.<init>(r0)
            r1.zza = r3
            r3.push(r2)
            com.google.android.gms.internal.ads.zzgzs r2 = com.google.android.gms.internal.ads.zzhdj.zzg(r2)
            com.google.android.gms.internal.ads.zzgzp r2 = r1.zzb(r2)
            r1.zzb = r2
            return
        L22:
            r3 = 0
            r1.zza = r3
            com.google.android.gms.internal.ads.zzgzp r2 = (com.google.android.gms.internal.ads.zzgzp) r2
            r1.zzb = r2
            return
    }

    private final com.google.android.gms.internal.ads.zzgzp zzb(com.google.android.gms.internal.ads.zzgzs r2) {
            r1 = this;
        L0:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzhdj
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzhdj r2 = (com.google.android.gms.internal.ads.zzhdj) r2
            java.util.ArrayDeque r0 = r1.zza
            r0.push(r2)
            com.google.android.gms.internal.ads.zzgzs r2 = com.google.android.gms.internal.ads.zzhdj.zzg(r2)
            goto L0
        L10:
            com.google.android.gms.internal.ads.zzgzp r2 = (com.google.android.gms.internal.ads.zzgzp) r2
            return r2
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzp r0 = r1.zzb
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzp r0 = r1.zza()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgzp zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgzp r0 = r3.zzb
            if (r0 == 0) goto L29
        L4:
            java.util.ArrayDeque r1 = r3.zza
            r2 = 0
            if (r1 == 0) goto L26
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L26
        L10:
            java.util.ArrayDeque r1 = r3.zza
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.zzhdj r1 = (com.google.android.gms.internal.ads.zzhdj) r1
            com.google.android.gms.internal.ads.zzgzs r1 = com.google.android.gms.internal.ads.zzhdj.zzB(r1)
            com.google.android.gms.internal.ads.zzgzp r2 = r3.zzb(r1)
            int r1 = r2.zzd()
            if (r1 == 0) goto L4
        L26:
            r3.zzb = r2
            return r0
        L29:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
