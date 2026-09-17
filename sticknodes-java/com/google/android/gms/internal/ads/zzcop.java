package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcop {
    com.google.android.gms.internal.ads.zzbur zza;
    com.google.android.gms.internal.ads.zzbur zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final com.google.android.gms.internal.ads.zzegg zze;
    private final com.google.android.gms.internal.ads.zzdrj zzf;
    private final com.google.android.gms.internal.ads.zzgfz zzg;
    private final java.util.concurrent.Executor zzh;
    private final java.util.concurrent.ScheduledExecutorService zzi;

    zzcop(android.content.Context r1, com.google.android.gms.ads.internal.util.zzg r2, com.google.android.gms.internal.ads.zzegg r3, com.google.android.gms.internal.ads.zzdrj r4, com.google.android.gms.internal.ads.zzgfz r5, com.google.android.gms.internal.ads.zzgfz r6, java.util.concurrent.ScheduledExecutorService r7) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            r0.zzf = r4
            r0.zzg = r5
            r0.zzh = r6
            r0.zzi = r7
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzcop r0) {
            android.content.Context r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgfz zzf(com.google.android.gms.internal.ads.zzcop r0) {
            com.google.android.gms.internal.ads.zzgfz r0 = r0.zzg
            return r0
    }

    public static boolean zzj(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r2 = r2.contains(r0)
            return r2
    }

    private final com.google.common.util.concurrent.ListenableFuture zzk(java.lang.String r5, android.view.InputEvent r6, java.util.Random r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjN     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L85
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Exception -> L85
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Exception -> L85
            boolean r0 = r5.contains(r0)     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L80
            com.google.android.gms.ads.internal.util.zzg r0 = r4.zzd     // Catch: java.lang.Exception -> L85
            boolean r0 = r0.zzS()     // Catch: java.lang.Exception -> L85
            if (r0 != 0) goto L80
            android.net.Uri r0 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L85
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch: java.lang.Exception -> L85
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r7.nextInt(r1)     // Catch: java.lang.Exception -> L85
            long r1 = (long) r7     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzjO     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L85
            java.lang.Object r7 = r3.zza(r7)     // Catch: java.lang.Exception -> L85
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L85
            r0.appendQueryParameter(r7, r1)     // Catch: java.lang.Exception -> L85
            if (r6 != 0) goto L59
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzjP     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L85
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = "11"
            r0.appendQueryParameter(r5, r6)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L85
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)     // Catch: java.lang.Exception -> L85
            return r5
        L59:
            com.google.android.gms.internal.ads.zzegg r7 = r4.zze     // Catch: java.lang.Exception -> L85
            com.google.common.util.concurrent.ListenableFuture r7 = r7.zza()     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzgff r7 = com.google.android.gms.internal.ads.zzgff.zzu(r7)     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzcoj r1 = new com.google.android.gms.internal.ads.zzcoj     // Catch: java.lang.Exception -> L85
            r1.<init>(r4, r0, r5, r6)     // Catch: java.lang.Exception -> L85
            java.util.concurrent.Executor r5 = r4.zzh     // Catch: java.lang.Exception -> L85
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzn(r7, r1, r5)     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5     // Catch: java.lang.Exception -> L85
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzcok r7 = new com.google.android.gms.internal.ads.zzcok     // Catch: java.lang.Exception -> L85
            r7.<init>(r4, r0)     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzgfz r0 = r4.zzg     // Catch: java.lang.Exception -> L85
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzf(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L85
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5     // Catch: java.lang.Exception -> L85
            return r5
        L80:
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)     // Catch: java.lang.Exception -> L85
            return r5
        L85:
            r5 = move-exception
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzg(r5)
            return r5
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String r3, java.util.Random r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lb
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
            return r3
        Lb:
            com.google.android.gms.internal.ads.zzdrj r0 = r2.zzf
            android.view.InputEvent r0 = r0.zza()
            com.google.common.util.concurrent.ListenableFuture r4 = r2.zzk(r3, r0, r4)
            com.google.android.gms.internal.ads.zzcog r0 = new com.google.android.gms.internal.ads.zzcog
            r0.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r2.zzg
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzf(r4, r1, r0, r3)
            return r3
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.String r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzcoi r0 = new com.google.android.gms.internal.ads.zzcoi
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r1.zzg
            r3.zza(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            return r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(android.net.Uri.Builder r3, java.lang.String r4, android.view.InputEvent r5, java.lang.Integer r6) throws java.lang.Exception {
            r2 = this;
            int r6 = r6.intValue()
            r0 = 1
            if (r6 != r0) goto L6e
            android.net.Uri r6 = r3.build()
            android.net.Uri$Builder r6 = r6.buildUpon()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjQ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "1"
            r6.appendQueryParameter(r0, r1)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjP
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "12"
            r6.appendQueryParameter(r0, r1)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjR
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L52
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzjS
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
            r6.authority(r4)
        L52:
            com.google.android.gms.internal.ads.zzegg r4 = r2.zze
            android.net.Uri r6 = r6.build()
            com.google.common.util.concurrent.ListenableFuture r4 = r4.zzb(r6, r5)
            com.google.android.gms.internal.ads.zzgff r4 = com.google.android.gms.internal.ads.zzgff.zzu(r4)
            com.google.android.gms.internal.ads.zzcol r5 = new com.google.android.gms.internal.ads.zzcol
            r5.<init>(r3)
            java.util.concurrent.Executor r3 = r2.zzh
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r4, r5, r3)
            com.google.android.gms.internal.ads.zzgff r3 = (com.google.android.gms.internal.ads.zzgff) r3
            goto L87
        L6e:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzjP
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "10"
            r3.appendQueryParameter(r4, r5)
            java.lang.String r3 = r3.toString()
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
        L87:
            return r3
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(android.net.Uri.Builder r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzcoh r0 = new com.google.android.gms.internal.ads.zzcoh
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r1.zzg
            r3.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjP
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "9"
            r2.appendQueryParameter(r3, r0)
            java.lang.String r2 = r2.toString()
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            return r2
    }

    final /* synthetic */ void zzg(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            android.content.Context r0 = r2.zzc
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zzc(r0)
            r2.zzb = r0
            java.lang.String r1 = "AttributionReporting.getUpdatedUrlAndRegisterSource"
            r0.zzh(r3, r1)
            return
        L20:
            android.content.Context r0 = r2.zzc
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zza(r0)
            r2.zza = r0
            java.lang.String r1 = "AttributionReportingSampled.getUpdatedUrlAndRegisterSource"
            r0.zzh(r3, r1)
            return
    }

    final /* synthetic */ void zzh(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            android.content.Context r0 = r2.zzc
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zzc(r0)
            r2.zzb = r0
            java.lang.String r1 = "AttributionReporting"
            r0.zzh(r3, r1)
            return
        L20:
            android.content.Context r0 = r2.zzc
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zza(r0)
            r2.zza = r0
            java.lang.String r1 = "AttributionReportingSampled"
            r0.zzh(r3, r1)
            return
    }

    public final void zzi(java.lang.String r5, com.google.android.gms.internal.ads.zzfng r6, java.util.Random r7) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.gms.internal.ads.zzdrj r0 = r4.zzf
            android.view.InputEvent r0 = r0.zza()
            com.google.common.util.concurrent.ListenableFuture r7 = r4.zzk(r5, r0, r7)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjT
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.ScheduledExecutorService r2 = r4.zzi
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzo(r7, r0, r3, r2)
            com.google.android.gms.internal.ads.zzcoo r0 = new com.google.android.gms.internal.ads.zzcoo
            r0.<init>(r4, r6, r5)
            com.google.android.gms.internal.ads.zzgfz r5 = r4.zzg
            com.google.android.gms.internal.ads.zzgfo.zzr(r7, r0, r5)
            return
    }
}
