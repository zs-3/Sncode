package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdyj {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzdzo zzc;
    private final com.google.android.gms.internal.ads.zzhic zzd;

    public zzdyj(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzdzo r3, com.google.android.gms.internal.ads.zzhic r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeah zza(com.google.android.gms.internal.ads.zzbwa r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzdzo r0 = r3.zzc
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zza(r4)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfq
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Object r4 = r4.get(r0, r2)
            com.google.android.gms.internal.ads.zzeah r4 = (com.google.android.gms.internal.ads.zzeah) r4
            return r4
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbwa r3, int r4, com.google.android.gms.internal.ads.zzeag r5) throws java.lang.Exception {
            r2 = this;
            if (r3 == 0) goto Lc
            android.os.Bundle r5 = r3.zzm
            if (r5 == 0) goto Lc
            r0 = 1
            java.lang.String r1 = "ls"
            r5.putBoolean(r1, r0)
        Lc:
            com.google.android.gms.internal.ads.zzhic r5 = r2.zzd
            java.lang.Object r5 = r5.zzb()
            com.google.android.gms.internal.ads.zzecp r5 = (com.google.android.gms.internal.ads.zzecp) r5
            com.google.common.util.concurrent.ListenableFuture r4 = r5.zzc(r3, r4)
            com.google.android.gms.internal.ads.zzdyf r5 = new com.google.android.gms.internal.ads.zzdyf
            r5.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r4, r5, r3)
            return r3
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbwa r5) {
            r4 = this;
            java.lang.String r0 = r5.zzd
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzC(r0)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzeag r0 = new com.google.android.gms.internal.ads.zzeag
            r1 = 1
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            goto L2e
        L16:
            com.google.android.gms.internal.ads.zzgfz r0 = r4.zza
            com.google.android.gms.internal.ads.zzdyg r1 = new com.google.android.gms.internal.ads.zzdyg
            r1.<init>(r4, r5)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            com.google.android.gms.internal.ads.zzdyh r1 = new com.google.android.gms.internal.ads.zzdyh
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = r4.zzb
            java.lang.Class<java.util.concurrent.ExecutionException> r3 = java.util.concurrent.ExecutionException.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r3, r1, r2)
        L2e:
            int r1 = android.os.Binder.getCallingUid()
            com.google.android.gms.internal.ads.zzdyi r2 = new com.google.android.gms.internal.ads.zzdyi
            r2.<init>(r4, r5, r1)
            com.google.android.gms.internal.ads.zzgfz r5 = r4.zzb
            java.lang.Class<com.google.android.gms.internal.ads.zzeag> r1 = com.google.android.gms.internal.ads.zzeag.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r1, r2, r5)
            return r5
    }
}
