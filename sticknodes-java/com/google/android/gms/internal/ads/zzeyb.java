package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyb implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzgfz zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzegi zze;
    private final com.google.android.gms.internal.ads.zzfhc zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;

    zzeyb(com.google.android.gms.ads.internal.util.zzg r1, android.content.Context r2, com.google.android.gms.internal.ads.zzgfz r3, java.util.concurrent.ScheduledExecutorService r4, com.google.android.gms.internal.ads.zzegi r5, com.google.android.gms.internal.ads.zzfhc r6, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 56
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L100
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzT()
            if (r0 == 0) goto L100
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkd
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfhc r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto L100
        L3a:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r5.zzg
            int r0 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjX
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto L100
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjY
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto L100
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjV
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjW
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto L100
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.zzb
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L100
        La0:
            com.google.android.gms.internal.ads.zzegi r0 = r5.zze     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkb     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzd     // Catch: java.lang.Exception -> Lc1
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
        Lc6:
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzexz r1 = new com.google.android.gms.internal.ads.zzexz
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzeya r1 = new com.google.android.gms.internal.ads.zzeya
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzc
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkb
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r4, r3)
            return r0
        L100:
            com.google.android.gms.internal.ads.zzeyd r0 = new com.google.android.gms.internal.ads.zzeyd
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzexy r0 = new com.google.android.gms.internal.ads.zzexy
            r0.<init>(r4)
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zzc
            r1.zza(r0)
            boolean r0 = r4 instanceof java.lang.SecurityException
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzeyd r4 = new com.google.android.gms.internal.ads.zzeyd
            r0 = 2
            r4.<init>(r2, r0, r1)
            goto L3f
        L18:
            boolean r0 = r4 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzeyd r4 = new com.google.android.gms.internal.ads.zzeyd
            r0 = 3
            r4.<init>(r2, r0, r1)
            goto L3f
        L23:
            boolean r0 = r4 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzeyd r4 = new com.google.android.gms.internal.ads.zzeyd
            r0 = 4
            r4.<init>(r2, r0, r1)
            goto L3f
        L2e:
            boolean r4 = r4 instanceof java.util.concurrent.TimeoutException
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.zzeyd r4 = new com.google.android.gms.internal.ads.zzeyd
            r0 = 5
            r4.<init>(r2, r0, r1)
            goto L3f
        L39:
            com.google.android.gms.internal.ads.zzeyd r4 = new com.google.android.gms.internal.ads.zzeyd
            r0 = 0
            r4.<init>(r2, r0, r1)
        L3f:
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzh(r4)
            return r4
    }
}
