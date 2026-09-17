package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqy implements com.google.android.gms.internal.ads.zzexh {
    final com.google.android.gms.internal.ads.zzcad zza;
    com.google.android.gms.appset.AppSetIdClient zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzgfz zzd;
    private final android.content.Context zze;

    zzeqy(android.content.Context r3, com.google.android.gms.internal.ads.zzcad r4, java.util.concurrent.ScheduledExecutorService r5, com.google.android.gms.internal.ads.zzgfz r6) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcR
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            com.google.android.gms.appset.AppSetIdClient r0 = com.google.android.gms.appset.AppSet.getClient(r3)
            r2.zzb = r0
        L1b:
            r2.zze = r3
            r2.zza = r4
            r2.zzc = r5
            r2.zzd = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 11
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
            r1 = -1
            r2 = 0
            if (r0 == 0) goto Lc0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcS
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lc0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcO
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4e
            com.google.android.gms.appset.AppSetIdClient r0 = r5.zzb
            com.google.android.gms.tasks.Task r0 = r0.getAppSetIdInfo()
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzfuy.zza(r0, r2)
            com.google.android.gms.internal.ads.zzeqv r1 = new com.google.android.gms.internal.ads.zzeqv
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            goto Lbf
        L4e:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcR
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            android.content.Context r0 = r5.zze
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.internal.ads.zzfih.zza(r0)
            goto L6d
        L67:
            com.google.android.gms.appset.AppSetIdClient r0 = r5.zzb
            com.google.android.gms.tasks.Task r0 = r0.getAppSetIdInfo()
        L6d:
            if (r0 != 0) goto L79
            com.google.android.gms.internal.ads.zzeqz r0 = new com.google.android.gms.internal.ads.zzeqz
            r0.<init>(r2, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            goto Lbf
        L79:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzfuy.zza(r0, r2)
            com.google.android.gms.internal.ads.zzeqw r1 = new com.google.android.gms.internal.ads.zzeqw
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzcP
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzcQ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzc
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r4, r3)
        Lb2:
            com.google.android.gms.internal.ads.zzeqx r1 = new com.google.android.gms.internal.ads.zzeqx
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzd
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r3, r1, r2)
        Lbf:
            return r0
        Lc0:
            com.google.android.gms.internal.ads.zzeqz r0 = new com.google.android.gms.internal.ads.zzeqz
            r0.<init>(r2, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }
}
