package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzehv implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcrv zzb;
    private android.view.View zzc;
    private com.google.android.gms.internal.ads.zzbpu zzd;

    public zzehv(android.content.Context r1, com.google.android.gms.internal.ads.zzcrv r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzehv r0, com.google.android.gms.internal.ads.zzbpu r1) {
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzehv r0, android.view.View r1) {
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r7, com.google.android.gms.internal.ads.zzfgh r8, com.google.android.gms.internal.ads.zzegn r9) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r6 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhw
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L60
            boolean r0 = r8.zzag
            if (r0 == 0) goto L60
            com.google.android.gms.internal.ads.zzbpu r0 = r6.zzd     // Catch: android.os.RemoteException -> L59
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zze()     // Catch: android.os.RemoteException -> L59
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: android.os.RemoteException -> L59
            android.view.View r0 = (android.view.View) r0     // Catch: android.os.RemoteException -> L59
            com.google.android.gms.internal.ads.zzbpu r2 = r6.zzd     // Catch: android.os.RemoteException -> L59
            boolean r2 = r2.zzf()     // Catch: android.os.RemoteException -> L59
            if (r0 == 0) goto L4c
            if (r2 == 0) goto L62
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            com.google.android.gms.internal.ads.zzehs r3 = new com.google.android.gms.internal.ads.zzehs
            r3.<init>(r6, r0, r8)
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r2, r3, r0)
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L43 java.lang.InterruptedException -> L45
            android.view.View r0 = (android.view.View) r0     // Catch: java.util.concurrent.ExecutionException -> L43 java.lang.InterruptedException -> L45
            goto L62
        L43:
            r7 = move-exception
            goto L46
        L45:
            r7 = move-exception
        L46:
            com.google.android.gms.internal.ads.zzfhj r8 = new com.google.android.gms.internal.ads.zzfhj
            r8.<init>(r7)
            throw r8
        L4c:
            com.google.android.gms.internal.ads.zzfhj r7 = new com.google.android.gms.internal.ads.zzfhj
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerRtbAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L59:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfhj r8 = new com.google.android.gms.internal.ads.zzfhj
            r8.<init>(r7)
            throw r8
        L60:
            android.view.View r0 = r6.zzc
        L62:
            com.google.android.gms.internal.ads.zzcrv r2 = r6.zzb
            java.lang.String r3 = r9.zza
            com.google.android.gms.internal.ads.zzctu r4 = new com.google.android.gms.internal.ads.zzctu
            r4.<init>(r7, r8, r3)
            com.google.android.gms.internal.ads.zzcqy r7 = new com.google.android.gms.internal.ads.zzcqy
            com.google.android.gms.internal.ads.zzehr r3 = new com.google.android.gms.internal.ads.zzehr
            r3.<init>(r9)
            java.util.List r8 = r8.zzu
            r5 = 0
            java.lang.Object r8 = r8.get(r5)
            com.google.android.gms.internal.ads.zzfgi r8 = (com.google.android.gms.internal.ads.zzfgi) r8
            r7.<init>(r0, r1, r3, r8)
            com.google.android.gms.internal.ads.zzcqs r7 = r2.zza(r4, r7)
            com.google.android.gms.internal.ads.zzdfu r8 = r7.zzg()
            r8.zza(r0)
            com.google.android.gms.internal.ads.zzczk r8 = r9.zzc
            com.google.android.gms.internal.ads.zzeig r8 = (com.google.android.gms.internal.ads.zzeig) r8
            com.google.android.gms.internal.ads.zzels r9 = r7.zzj()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcqr r7 = r7.zza()
            return r7
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r11, com.google.android.gms.internal.ads.zzfgh r12, com.google.android.gms.internal.ads.zzegn r13) throws com.google.android.gms.internal.ads.zzfhj {
            r10 = this;
            java.lang.Object r0 = r13.zzb     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0     // Catch: android.os.RemoteException -> L7a
            java.lang.String r1 = r12.zzZ     // Catch: android.os.RemoteException -> L7a
            r0.zzq(r1)     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhw     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L7a
            java.lang.Object r0 = r1.zza(r0)     // Catch: android.os.RemoteException -> L7a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: android.os.RemoteException -> L7a
            boolean r0 = r0.booleanValue()     // Catch: android.os.RemoteException -> L7a
            r1 = 0
            if (r0 == 0) goto L4d
            boolean r0 = r12.zzag     // Catch: android.os.RemoteException -> L7a
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r13.zzb     // Catch: android.os.RemoteException -> L7a
            r2 = r0
            com.google.android.gms.internal.ads.zzbrk r2 = (com.google.android.gms.internal.ads.zzbrk) r2     // Catch: android.os.RemoteException -> L7a
            java.lang.String r3 = r12.zzU     // Catch: android.os.RemoteException -> L7a
            org.json.JSONObject r12 = r12.zzv     // Catch: android.os.RemoteException -> L7a
            java.lang.String r4 = r12.toString()     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfgq r12 = r11.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfhc r12 = r12.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.ads.internal.client.zzm r5 = r12.zzd     // Catch: android.os.RemoteException -> L7a
            android.content.Context r12 = r10.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzehu r7 = new com.google.android.gms.internal.ads.zzehu     // Catch: android.os.RemoteException -> L7a
            r7.<init>(r10, r13, r1)     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzczk r12 = r13.zzc     // Catch: android.os.RemoteException -> L7a
            r8 = r12
            com.google.android.gms.internal.ads.zzbpr r8 = (com.google.android.gms.internal.ads.zzbpr) r8     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfgq r11 = r11.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfhc r11 = r11.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.ads.internal.client.zzs r9 = r11.zze     // Catch: android.os.RemoteException -> L7a
            r2.zzk(r3, r4, r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L7a
            return
        L4d:
            java.lang.Object r0 = r13.zzb     // Catch: android.os.RemoteException -> L7a
            r2 = r0
            com.google.android.gms.internal.ads.zzbrk r2 = (com.google.android.gms.internal.ads.zzbrk) r2     // Catch: android.os.RemoteException -> L7a
            java.lang.String r3 = r12.zzU     // Catch: android.os.RemoteException -> L7a
            org.json.JSONObject r12 = r12.zzv     // Catch: android.os.RemoteException -> L7a
            java.lang.String r4 = r12.toString()     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfgq r12 = r11.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfhc r12 = r12.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.ads.internal.client.zzm r5 = r12.zzd     // Catch: android.os.RemoteException -> L7a
            android.content.Context r12 = r10.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzehu r7 = new com.google.android.gms.internal.ads.zzehu     // Catch: android.os.RemoteException -> L7a
            r7.<init>(r10, r13, r1)     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzczk r12 = r13.zzc     // Catch: android.os.RemoteException -> L7a
            r8 = r12
            com.google.android.gms.internal.ads.zzbpr r8 = (com.google.android.gms.internal.ads.zzbpr) r8     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfgq r11 = r11.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.internal.ads.zzfhc r11 = r11.zza     // Catch: android.os.RemoteException -> L7a
            com.google.android.gms.ads.internal.client.zzs r9 = r11.zze     // Catch: android.os.RemoteException -> L7a
            r2.zzj(r3, r4, r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L7a
            return
        L7a:
            r11 = move-exception
            com.google.android.gms.internal.ads.zzfhj r12 = new com.google.android.gms.internal.ads.zzfhj
            r12.<init>(r11)
            throw r12
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.view.View r1, com.google.android.gms.internal.ads.zzfgh r2, java.lang.Object r3) throws java.lang.Exception {
            r0 = this;
            android.content.Context r3 = r0.zza
            com.google.android.gms.internal.ads.zzcsq r1 = com.google.android.gms.internal.ads.zzcsq.zza(r3, r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r1
    }
}
