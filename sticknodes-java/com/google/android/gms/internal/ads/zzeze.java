package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeze implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzcad zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzgfz zzc;

    zzeze(java.lang.String r1, com.google.android.gms.internal.ads.zzbax r2, com.google.android.gms.internal.ads.zzcad r3, java.util.concurrent.ScheduledExecutorService r4, com.google.android.gms.internal.ads.zzgfz r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 43
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L68
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcS
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L68
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzfuy.zza(r0, r1)
            com.google.android.gms.internal.ads.zzezc r1 = new com.google.android.gms.internal.ads.zzezc
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbee.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5a
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbee.zzb
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzb
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r4, r3)
        L5a:
            com.google.android.gms.internal.ads.zzezd r1 = new com.google.android.gms.internal.ads.zzezd
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzc
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r3, r1, r2)
            return r0
        L68:
            com.google.android.gms.internal.ads.zzezf r0 = new com.google.android.gms.internal.ads.zzezf
            r2 = -1
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzezf zzc(java.lang.Exception r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = r2.zza
            java.lang.String r1 = "AppSetIdInfoGmscoreSignal"
            r0.zzw(r3, r1)
            com.google.android.gms.internal.ads.zzezf r3 = new com.google.android.gms.internal.ads.zzezf
            r0 = 0
            r1 = -1
            r3.<init>(r0, r1)
            return r3
    }
}
