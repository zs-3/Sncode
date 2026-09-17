package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhdd extends com.google.android.gms.internal.ads.zzgzl {
    final com.google.android.gms.internal.ads.zzhdh zza;
    com.google.android.gms.internal.ads.zzgzn zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzhdj zzc;

    zzhdd(com.google.android.gms.internal.ads.zzhdj r3) {
            r2 = this;
            r2.zzc = r3
            r2.<init>()
            com.google.android.gms.internal.ads.zzhdh r0 = new com.google.android.gms.internal.ads.zzhdh
            r1 = 0
            r0.<init>(r3, r1)
            r2.zza = r0
            com.google.android.gms.internal.ads.zzgzn r3 = r2.zzb()
            r2.zzb = r3
            return
    }

    private final com.google.android.gms.internal.ads.zzgzn zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhdh r0 = r2.zza
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzgzp r0 = r0.zza()
            com.google.android.gms.internal.ads.zzgzn r0 = r0.zzs()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzn r0 = r1.zzb
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final byte zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgzn r0 = r2.zzb
            if (r0 == 0) goto L17
            byte r0 = r0.zza()
            com.google.android.gms.internal.ads.zzgzn r1 = r2.zzb
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L16
            com.google.android.gms.internal.ads.zzgzn r1 = r2.zzb()
            r2.zzb = r1
        L16:
            return r0
        L17:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
