package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzehp implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcrv zzb;
    private final java.util.concurrent.Executor zzc;

    public zzehp(android.content.Context r1, com.google.android.gms.internal.ads.zzcrv r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
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
            if (r0 == 0) goto L77
            boolean r0 = r8.zzag
            if (r0 == 0) goto L77
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0
            com.google.android.gms.internal.ads.zzbpu r0 = r0.zzc()
            if (r0 == 0) goto L67
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch: android.os.RemoteException -> L60
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: android.os.RemoteException -> L60
            android.view.View r2 = (android.view.View) r2     // Catch: android.os.RemoteException -> L60
            boolean r0 = r0.zzf()     // Catch: android.os.RemoteException -> L60
            if (r2 == 0) goto L53
            if (r0 == 0) goto L7f
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            com.google.android.gms.internal.ads.zzehn r3 = new com.google.android.gms.internal.ads.zzehn
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L4a java.lang.InterruptedException -> L4c
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch: java.util.concurrent.ExecutionException -> L4a java.lang.InterruptedException -> L4c
            goto L7f
        L4a:
            r7 = move-exception
            goto L4d
        L4c:
            r7 = move-exception
        L4d:
            com.google.android.gms.internal.ads.zzfhj r8 = new com.google.android.gms.internal.ads.zzfhj
            r8.<init>(r7)
            throw r8
        L53:
            com.google.android.gms.internal.ads.zzfhj r7 = new com.google.android.gms.internal.ads.zzfhj
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L60:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfhj r8 = new com.google.android.gms.internal.ads.zzfhj
            r8.<init>(r7)
            throw r8
        L67:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r7)
            com.google.android.gms.internal.ads.zzfhj r8 = new com.google.android.gms.internal.ads.zzfhj
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L77:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0
            android.view.View r2 = r0.zza()
        L7f:
            com.google.android.gms.internal.ads.zzcrv r0 = r6.zzb
            java.lang.String r3 = r9.zza
            com.google.android.gms.internal.ads.zzctu r4 = new com.google.android.gms.internal.ads.zzctu
            r4.<init>(r7, r8, r3)
            java.lang.Object r7 = r9.zzb
            com.google.android.gms.internal.ads.zzcqy r3 = new com.google.android.gms.internal.ads.zzcqy
            com.google.android.gms.internal.ads.zzfia r7 = (com.google.android.gms.internal.ads.zzfia) r7
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzeho r5 = new com.google.android.gms.internal.ads.zzeho
            r5.<init>(r7)
            java.util.List r7 = r8.zzu
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.zzfgi r7 = (com.google.android.gms.internal.ads.zzfgi) r7
            r3.<init>(r2, r1, r5, r7)
            com.google.android.gms.internal.ads.zzcqs r7 = r0.zza(r4, r3)
            com.google.android.gms.internal.ads.zzdfu r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzcyz r8 = r7.zzd()
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzcof r1 = new com.google.android.gms.internal.ads.zzcof
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = r6.zzc
            r8.zzo(r1, r0)
            com.google.android.gms.internal.ads.zzczk r8 = r9.zzc
            com.google.android.gms.internal.ads.zzeig r8 = (com.google.android.gms.internal.ads.zzeig) r8
            com.google.android.gms.internal.ads.zzely r9 = r7.zzk()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcqr r7 = r7.zza()
            return r7
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r11, com.google.android.gms.internal.ads.zzfgh r12, com.google.android.gms.internal.ads.zzegn r13) throws com.google.android.gms.internal.ads.zzfhj {
            r10 = this;
            com.google.android.gms.internal.ads.zzfgq r0 = r11.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza
            com.google.android.gms.ads.internal.client.zzs r0 = r0.zze
            boolean r1 = r0.zzn
            if (r1 == 0) goto L1b
            android.content.Context r1 = r10.zza
            com.google.android.gms.ads.internal.client.zzs r2 = new com.google.android.gms.ads.internal.client.zzs
            int r3 = r0.zze
            int r0 = r0.zzb
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.zzb.zzd(r3, r0)
            r2.<init>(r1, r0)
        L19:
            r5 = r2
            goto L4a
        L1b:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhw
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L41
            boolean r1 = r12.zzag
            if (r1 == 0) goto L41
            android.content.Context r1 = r10.zza
            com.google.android.gms.ads.internal.client.zzs r2 = new com.google.android.gms.ads.internal.client.zzs
            int r3 = r0.zze
            int r0 = r0.zzb
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.zzb.zze(r3, r0)
            r2.<init>(r1, r0)
            goto L19
        L41:
            android.content.Context r0 = r10.zza
            java.util.List r1 = r12.zzu
            com.google.android.gms.ads.internal.client.zzs r2 = com.google.android.gms.internal.ads.zzfhi.zza(r0, r1)
            goto L19
        L4a:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhw
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
            boolean r0 = r12.zzag
            if (r0 == 0) goto L82
            java.lang.Object r0 = r13.zzb
            android.content.Context r4 = r10.zza
            r3 = r0
            com.google.android.gms.internal.ads.zzfia r3 = (com.google.android.gms.internal.ads.zzfia) r3
            com.google.android.gms.internal.ads.zzfgq r11 = r11.zza
            com.google.android.gms.internal.ads.zzfhc r11 = r11.zza
            org.json.JSONObject r0 = r12.zzv
            java.lang.String r7 = r0.toString()
            com.google.android.gms.internal.ads.zzfgm r12 = r12.zzs
            java.lang.String r8 = com.google.android.gms.ads.internal.util.zzbs.zzm(r12)
            com.google.android.gms.internal.ads.zzczk r12 = r13.zzc
            r9 = r12
            com.google.android.gms.internal.ads.zzbpr r9 = (com.google.android.gms.internal.ads.zzbpr) r9
            com.google.android.gms.ads.internal.client.zzm r6 = r11.zzd
            r3.zzn(r4, r5, r6, r7, r8, r9)
            return
        L82:
            java.lang.Object r0 = r13.zzb
            android.content.Context r4 = r10.zza
            r3 = r0
            com.google.android.gms.internal.ads.zzfia r3 = (com.google.android.gms.internal.ads.zzfia) r3
            com.google.android.gms.internal.ads.zzfgq r11 = r11.zza
            com.google.android.gms.internal.ads.zzfhc r11 = r11.zza
            org.json.JSONObject r0 = r12.zzv
            java.lang.String r7 = r0.toString()
            com.google.android.gms.internal.ads.zzfgm r12 = r12.zzs
            java.lang.String r8 = com.google.android.gms.ads.internal.util.zzbs.zzm(r12)
            com.google.android.gms.internal.ads.zzczk r12 = r13.zzc
            r9 = r12
            com.google.android.gms.internal.ads.zzbpr r9 = (com.google.android.gms.internal.ads.zzbpr) r9
            com.google.android.gms.ads.internal.client.zzm r6 = r11.zzd
            r3.zzm(r4, r5, r6, r7, r8, r9)
            return
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.view.View r1, com.google.android.gms.internal.ads.zzfgh r2, java.lang.Object r3) throws java.lang.Exception {
            r0 = this;
            android.content.Context r3 = r0.zza
            com.google.android.gms.internal.ads.zzcsq r1 = com.google.android.gms.internal.ads.zzcsq.zza(r3, r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r1
    }
}
