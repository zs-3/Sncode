package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeay {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzebt zzc;
    private final com.google.android.gms.internal.ads.zzhic zzd;

    zzeay(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzebt r3, com.google.android.gms.internal.ads.zzhic r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvf r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlj
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.ads.zzebt r2 = r3.zzc
            com.google.common.util.concurrent.ListenableFuture r4 = r2.zza(r4, r0)
            return r4
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbvf r1, int r2, com.google.android.gms.internal.ads.zzeag r3) throws java.lang.Exception {
            r0 = this;
            com.google.android.gms.internal.ads.zzhic r3 = r0.zzd
            java.lang.Object r3 = r3.zzb()
            com.google.android.gms.internal.ads.zzecz r3 = (com.google.android.gms.internal.ads.zzecz) r3
            com.google.common.util.concurrent.ListenableFuture r1 = r3.zzb(r1, r2)
            return r1
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbvf r5) {
            r4 = this;
            java.lang.String r0 = r5.zzf
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzC(r0)
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzeag r0 = new com.google.android.gms.internal.ads.zzeag
            r1 = 1
            java.lang.String r2 = "Ads service proxy force local"
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            goto L30
        L18:
            com.google.android.gms.internal.ads.zzeav r0 = new com.google.android.gms.internal.ads.zzeav
            r0.<init>(r4, r5)
            com.google.android.gms.internal.ads.zzgfz r1 = r4.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r1)
            com.google.android.gms.internal.ads.zzeaw r1 = new com.google.android.gms.internal.ads.zzeaw
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = r4.zzb
            java.lang.Class<java.util.concurrent.ExecutionException> r3 = java.util.concurrent.ExecutionException.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r3, r1, r2)
        L30:
            int r1 = android.os.Binder.getCallingUid()
            com.google.android.gms.internal.ads.zzeax r2 = new com.google.android.gms.internal.ads.zzeax
            r2.<init>(r4, r5, r1)
            com.google.android.gms.internal.ads.zzgfz r5 = r4.zzb
            java.lang.Class<com.google.android.gms.internal.ads.zzeag> r1 = com.google.android.gms.internal.ads.zzeag.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r1, r2, r5)
            return r5
    }
}
