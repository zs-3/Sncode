package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgac implements java.util.Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgag zze;

    /* synthetic */ zzgac(com.google.android.gms.internal.ads.zzgag r1, com.google.android.gms.internal.ads.zzgab r2) {
            r0 = this;
            r0.zze = r1
            r0.<init>()
            int r2 = com.google.android.gms.internal.ads.zzgag.zza(r1)
            r0.zzb = r2
            int r1 = r1.zze()
            r0.zzc = r1
            r1 = -1
            r0.zzd = r1
            return
    }

    private final void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r2.zze
            int r0 = com.google.android.gms.internal.ads.zzgag.zza(r0)
            int r1 = r2.zzb
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.zzc
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            r3.zzb()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1c
            int r0 = r3.zzc
            r3.zzd = r0
            java.lang.Object r0 = r3.zza(r0)
            com.google.android.gms.internal.ads.zzgag r1 = r3.zze
            int r2 = r3.zzc
            int r1 = r1.zzf(r2)
            r3.zzc = r1
            return r0
        L1c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            r2.zzb()
            int r0 = r2.zzd
            if (r0 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "no calls to next() since the last call to remove()"
            com.google.android.gms.internal.ads.zzfxz.zzk(r0, r1)
            int r0 = r2.zzb
            int r0 = r0 + 32
            r2.zzb = r0
            int r0 = r2.zzd
            com.google.android.gms.internal.ads.zzgag r1 = r2.zze
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgag.zzg(r1, r0)
            r1.remove(r0)
            int r0 = r2.zzc
            r1 = -1
            int r0 = r0 + r1
            r2.zzc = r0
            r2.zzd = r1
            return
    }

    abstract java.lang.Object zza(int r1);
}
