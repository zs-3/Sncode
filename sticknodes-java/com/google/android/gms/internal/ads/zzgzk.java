package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzgzk extends com.google.android.gms.internal.ads.zzgzl {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgzs zza;
    private int zzb;
    private final int zzc;

    zzgzk(com.google.android.gms.internal.ads.zzgzs r2) {
            r1 = this;
            r1.zza = r2
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            int r2 = r2.zzd()
            r1.zzc = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final byte zza() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.zzb = r1
            com.google.android.gms.internal.ads.zzgzs r1 = r2.zza
            byte r0 = r1.zzb(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
