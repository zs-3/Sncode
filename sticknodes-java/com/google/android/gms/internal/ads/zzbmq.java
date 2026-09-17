package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbmq extends com.google.android.gms.ads.admanager.AdManagerInterstitialAd {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzr zzb;
    private final com.google.android.gms.ads.internal.client.zzby zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzbph zze;
    private final long zzf;
    private com.google.android.gms.ads.admanager.AppEventListener zzg;
    private com.google.android.gms.ads.FullScreenContentCallback zzh;
    private com.google.android.gms.ads.OnPaidEventListener zzi;

    public zzbmq(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph
            r0.<init>()
            r3.zze = r0
            long r1 = java.lang.System.currentTimeMillis()
            r3.zzf = r1
            r3.zza = r4
            r3.zzd = r5
            com.google.android.gms.ads.internal.client.zzr r1 = com.google.android.gms.ads.internal.client.zzr.zza
            r3.zzb = r1
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.ads.internal.client.zzs r2 = new com.google.android.gms.ads.internal.client.zzs
            r2.<init>()
            com.google.android.gms.ads.internal.client.zzby r4 = r1.zzf(r4, r2, r5, r0)
            r3.zzc = r4
            return
    }

    public zzbmq(android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.internal.client.zzby r5) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph
            r0.<init>()
            r2.zze = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzf = r0
            r2.zza = r3
            r2.zzd = r4
            com.google.android.gms.ads.internal.client.zzr r3 = com.google.android.gms.ads.internal.client.zzr.zza
            r2.zzb = r3
            r2.zzc = r5
            return
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final java.lang.String getAdUnitId() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final com.google.android.gms.ads.admanager.AppEventListener getAppEventListener() {
            r1 = this;
            com.google.android.gms.ads.admanager.AppEventListener r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
            r1 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
            r3 = this;
            r0 = 0
            com.google.android.gms.ads.internal.client.zzby r1 = r3.zzc     // Catch: android.os.RemoteException -> La
            if (r1 == 0) goto L10
            com.google.android.gms.ads.internal.client.zzdy r0 = r1.zzk()     // Catch: android.os.RemoteException -> La
            goto L10
        La:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)
        L10:
            com.google.android.gms.ads.ResponseInfo r0 = com.google.android.gms.ads.ResponseInfo.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener r3) {
            r2 = this;
            r2.zzg = r3     // Catch: android.os.RemoteException -> L13
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzc     // Catch: android.os.RemoteException -> L13
            if (r0 == 0) goto L12
            if (r3 == 0) goto Le
            com.google.android.gms.internal.ads.zzazj r1 = new com.google.android.gms.internal.ads.zzazj     // Catch: android.os.RemoteException -> L13
            r1.<init>(r3)     // Catch: android.os.RemoteException -> L13
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.zzG(r1)     // Catch: android.os.RemoteException -> L13
        L12:
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback r3) {
            r2 = this;
            r2.zzh = r3     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzc     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Le
            com.google.android.gms.ads.internal.client.zzbf r1 = new com.google.android.gms.ads.internal.client.zzbf     // Catch: android.os.RemoteException -> Lf
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lf
            r0.zzJ(r1)     // Catch: android.os.RemoteException -> Lf
        Le:
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r1.zzc     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zzL(r2)     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r3) {
            r2 = this;
            r2.zzi = r3     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.ads.internal.client.zzby r0 = r2.zzc     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Le
            com.google.android.gms.ads.internal.client.zzft r1 = new com.google.android.gms.ads.internal.client.zzft     // Catch: android.os.RemoteException -> Lf
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lf
            r0.zzP(r1)     // Catch: android.os.RemoteException -> Lf
        Le:
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(android.app.Activity r2) {
            r1 = this;
            if (r2 != 0) goto L7
            java.lang.String r0 = "The activity for show is null, will proceed with show using the context provided when loading the ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L7:
            com.google.android.gms.ads.internal.client.zzby r0 = r1.zzc     // Catch: android.os.RemoteException -> L13
            if (r0 == 0) goto L12
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L13
            r0.zzW(r2)     // Catch: android.os.RemoteException -> L13
        L12:
            return
        L13:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzei r8, com.google.android.gms.ads.AdLoadCallback r9) {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r7.zzc     // Catch: android.os.RemoteException -> L1c
            if (r0 == 0) goto L1b
            long r0 = r7.zzf     // Catch: android.os.RemoteException -> L1c
            r8.zzq(r0)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzby r0 = r7.zzc     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzr r1 = r7.zzb     // Catch: android.os.RemoteException -> L1c
            android.content.Context r2 = r7.zza     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzm r8 = r1.zza(r2, r8)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzh r1 = new com.google.android.gms.ads.internal.client.zzh     // Catch: android.os.RemoteException -> L1c
            r1.<init>(r9, r7)     // Catch: android.os.RemoteException -> L1c
            r0.zzy(r8, r1)     // Catch: android.os.RemoteException -> L1c
        L1b:
            return
        L1c:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r8)
            com.google.android.gms.ads.LoadAdError r8 = new com.google.android.gms.ads.LoadAdError
            r2 = 0
            r5 = 0
            r6 = 0
            java.lang.String r3 = "Internal Error."
            java.lang.String r4 = "com.google.android.gms.ads"
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9.onAdFailedToLoad(r8)
            return
    }
}
