package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzebe {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzebw zzc;

    zzebe(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzebw r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvb r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzli
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.ads.zzebw r2 = r3.zzc
            com.google.common.util.concurrent.ListenableFuture r4 = r2.zza(r4, r0)
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbvb r4) {
            r3 = this;
            java.lang.String r0 = r4.zzb
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzC(r0)
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzeag r4 = new com.google.android.gms.internal.ads.zzeag
            r0 = 1
            java.lang.String r1 = "Ads signal service force local"
            r4.<init>(r0, r1)
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzg(r4)
            goto L30
        L18:
            com.google.android.gms.internal.ads.zzeba r0 = new com.google.android.gms.internal.ads.zzeba
            r0.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzgfz r4 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r4)
            com.google.android.gms.internal.ads.zzebb r0 = new com.google.android.gms.internal.ads.zzebb
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zzb
            java.lang.Class<java.util.concurrent.ExecutionException> r2 = java.util.concurrent.ExecutionException.class
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzf(r4, r2, r0, r1)
        L30:
            com.google.android.gms.internal.ads.zzgff r4 = com.google.android.gms.internal.ads.zzgff.zzu(r4)
            com.google.android.gms.internal.ads.zzebc r0 = new com.google.android.gms.internal.ads.zzebc
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zzb
            java.lang.Class<com.google.android.gms.internal.ads.zzeag> r2 = com.google.android.gms.internal.ads.zzeag.class
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzf(r4, r2, r0, r1)
            com.google.android.gms.internal.ads.zzgff r4 = (com.google.android.gms.internal.ads.zzgff) r4
            com.google.android.gms.internal.ads.zzebd r0 = new com.google.android.gms.internal.ads.zzebd
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r4, r0, r1)
            com.google.android.gms.internal.ads.zzgff r4 = (com.google.android.gms.internal.ads.zzgff) r4
            return r4
    }
}
