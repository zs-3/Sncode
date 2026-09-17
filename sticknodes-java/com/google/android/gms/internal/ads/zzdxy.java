package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdxy extends com.google.android.gms.ads.internal.client.zzdt {
    final java.util.Map zza;
    private final android.content.Context zzb;
    private final java.lang.ref.WeakReference zzc;
    private final com.google.android.gms.internal.ads.zzdxm zzd;
    private final com.google.android.gms.internal.ads.zzgfz zze;
    private com.google.android.gms.internal.ads.zzdxb zzf;

    zzdxy(android.content.Context r1, java.lang.ref.WeakReference r2, com.google.android.gms.internal.ads.zzdxm r3, com.google.android.gms.internal.ads.zzdxz r4, com.google.android.gms.internal.ads.zzgfz r5) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.zza = r4
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r5
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdxm zzb(com.google.android.gms.internal.ads.zzdxy r0) {
            com.google.android.gms.internal.ads.zzdxm r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzc(java.lang.Object r0) {
            java.lang.String r0 = zzl(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzdxy r0, java.lang.String r1, java.lang.String r2) {
            r0.zzm(r1, r2)
            return
    }

    private final android.content.Context zzj() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzc
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.zzb
        Lc:
            return r0
    }

    private static com.google.android.gms.ads.AdRequest zzk() {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "request_origin"
            java.lang.String r2 = "inspector_ooct"
            r0.putString(r1, r2)
            com.google.android.gms.ads.AdRequest$Builder r1 = new com.google.android.gms.ads.AdRequest$Builder
            r1.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            com.google.android.gms.ads.AbstractAdRequestBuilder r0 = r1.addNetworkExtrasBundle(r2, r0)
            com.google.android.gms.ads.AdRequest$Builder r0 = (com.google.android.gms.ads.AdRequest.Builder) r0
            com.google.android.gms.ads.AdRequest r0 = r0.build()
            return r0
    }

    private static java.lang.String zzl(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.android.gms.ads.LoadAdError
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.LoadAdError r1 = (com.google.android.gms.ads.LoadAdError) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
            goto L4c
        Lb:
            boolean r0 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd
            if (r0 == 0) goto L16
            com.google.android.gms.ads.appopen.AppOpenAd r1 = (com.google.android.gms.ads.appopen.AppOpenAd) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
            goto L4c
        L16:
            boolean r0 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd
            if (r0 == 0) goto L21
            com.google.android.gms.ads.interstitial.InterstitialAd r1 = (com.google.android.gms.ads.interstitial.InterstitialAd) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
            goto L4c
        L21:
            boolean r0 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd
            if (r0 == 0) goto L2c
            com.google.android.gms.ads.rewarded.RewardedAd r1 = (com.google.android.gms.ads.rewarded.RewardedAd) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
            goto L4c
        L2c:
            boolean r0 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
            if (r0 == 0) goto L37
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd r1 = (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
            goto L4c
        L37:
            boolean r0 = r1 instanceof com.google.android.gms.ads.AdView
            if (r0 == 0) goto L42
            com.google.android.gms.ads.AdView r1 = (com.google.android.gms.ads.AdView) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
            goto L4c
        L42:
            boolean r0 = r1 instanceof com.google.android.gms.ads.nativead.NativeAd
            if (r0 == 0) goto L5a
            com.google.android.gms.ads.nativead.NativeAd r1 = (com.google.android.gms.ads.nativead.NativeAd) r1
            com.google.android.gms.ads.ResponseInfo r1 = r1.getResponseInfo()
        L4c:
            if (r1 != 0) goto L4f
            goto L5a
        L4f:
            com.google.android.gms.ads.internal.client.zzdy r1 = r1.zzc()
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.zzh()     // Catch: android.os.RemoteException -> L5a
            return r1
        L5a:
            java.lang.String r1 = ""
            return r1
    }

    private final synchronized void zzm(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdxb r0 = r2.zzf     // Catch: java.lang.Throwable -> L13 java.lang.NullPointerException -> L15
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb(r3)     // Catch: java.lang.Throwable -> L13 java.lang.NullPointerException -> L15
            com.google.android.gms.internal.ads.zzdxw r0 = new com.google.android.gms.internal.ads.zzdxw     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfz r4 = r2.zze     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r0, r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            goto L26
        L15:
            r3 = move-exception
            java.lang.String r0 = "OutOfContextTester.setAdAsOutOfContext"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L13
            r1.zzw(r3, r0)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzdxm r3 = r2.zzd     // Catch: java.lang.Throwable -> L13
            r3.zzk(r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L26:
            monitor-exit(r2)
            throw r3
    }

    private final synchronized void zzn(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdxb r0 = r2.zzf     // Catch: java.lang.Throwable -> L13 java.lang.NullPointerException -> L15
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb(r3)     // Catch: java.lang.Throwable -> L13 java.lang.NullPointerException -> L15
            com.google.android.gms.internal.ads.zzdxx r0 = new com.google.android.gms.internal.ads.zzdxx     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfz r4 = r2.zze     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r0, r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            goto L26
        L15:
            r3 = move-exception
            java.lang.String r0 = "OutOfContextTester.setAdAsShown"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L13
            r1.zzw(r3, r0)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzdxm r3 = r2.zzd     // Catch: java.lang.Throwable -> L13
            r3.zzk(r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L26:
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(java.lang.String r3, com.google.android.gms.dynamic.IObjectWrapper r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
            r2 = this;
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L31
            if (r5 != 0) goto L11
            goto L31
        L11:
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L1e
            java.util.Map r1 = r2.zza
            r1.remove(r3)
        L1e:
            boolean r3 = r0 instanceof com.google.android.gms.ads.AdView
            if (r3 == 0) goto L28
            com.google.android.gms.ads.AdView r0 = (com.google.android.gms.ads.AdView) r0
            com.google.android.gms.internal.ads.zzdxz.zza(r4, r5, r0)
            return
        L28:
            boolean r3 = r0 instanceof com.google.android.gms.ads.nativead.NativeAd
            if (r3 == 0) goto L31
            com.google.android.gms.ads.nativead.NativeAd r0 = (com.google.android.gms.ads.nativead.NativeAd) r0
            com.google.android.gms.internal.ads.zzdxz.zzb(r4, r5, r0)
        L31:
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzdxb r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    protected final synchronized void zzg(java.lang.String r2, java.lang.Object r3, java.lang.String r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zza     // Catch: java.lang.Throwable -> Lf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = zzl(r3)     // Catch: java.lang.Throwable -> Lf
            r1.zzm(r2, r4)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzh(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r8.hashCode()     // Catch: java.lang.Throwable -> Le9
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1999289321: goto L40;
                case -1372958932: goto L36;
                case -428325382: goto L2c;
                case 543046670: goto L22;
                case 1854800829: goto L18;
                case 1951953708: goto Le;
                default: goto Ld;
            }     // Catch: java.lang.Throwable -> Le9
        Ld:
            goto L4a
        Le:
            java.lang.String r0 = "BANNER"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto L4a
            r8 = 1
            goto L4b
        L18:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto L4a
            r8 = 5
            goto L4b
        L22:
            java.lang.String r0 = "REWARDED"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto L4a
            r8 = 4
            goto L4b
        L2c:
            java.lang.String r0 = "APP_OPEN_AD"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto L4a
            r8 = 0
            goto L4b
        L36:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto L4a
            r8 = 2
            goto L4b
        L40:
            java.lang.String r0 = "NATIVE"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto L4a
            r8 = 3
            goto L4b
        L4a:
            r8 = -1
        L4b:
            if (r8 == 0) goto Ld7
            if (r8 == r5) goto Lb5
            if (r8 == r4) goto La3
            if (r8 == r3) goto L7d
            if (r8 == r2) goto L6b
            if (r8 == r1) goto L59
            monitor-exit(r6)
            return
        L59:
            android.content.Context r8 = r6.zzj()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdRequest r0 = zzk()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxu r1 = new com.google.android.gms.internal.ads.zzdxu     // Catch: java.lang.Throwable -> Le9
            r1.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        L6b:
            android.content.Context r8 = r6.zzj()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdRequest r0 = zzk()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxt r1 = new com.google.android.gms.internal.ads.zzdxt     // Catch: java.lang.Throwable -> Le9
            r1.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        L7d:
            com.google.android.gms.ads.AdLoader$Builder r8 = new com.google.android.gms.ads.AdLoader$Builder     // Catch: java.lang.Throwable -> Le9
            android.content.Context r0 = r6.zzj()     // Catch: java.lang.Throwable -> Le9
            r8.<init>(r0, r7)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxn r0 = new com.google.android.gms.internal.ads.zzdxn     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> Le9
            r8.forNativeAd(r0)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxv r7 = new com.google.android.gms.internal.ads.zzdxv     // Catch: java.lang.Throwable -> Le9
            r7.<init>(r6, r9)     // Catch: java.lang.Throwable -> Le9
            r8.withAdListener(r7)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdLoader r7 = r8.build()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdRequest r8 = zzk()     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        La3:
            android.content.Context r8 = r6.zzj()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdRequest r0 = zzk()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxs r1 = new com.google.android.gms.internal.ads.zzdxs     // Catch: java.lang.Throwable -> Le9
            r1.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        Lb5:
            com.google.android.gms.ads.AdView r8 = new com.google.android.gms.ads.AdView     // Catch: java.lang.Throwable -> Le9
            android.content.Context r0 = r6.zzj()     // Catch: java.lang.Throwable -> Le9
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.BANNER     // Catch: java.lang.Throwable -> Le9
            r8.setAdSize(r0)     // Catch: java.lang.Throwable -> Le9
            r8.setAdUnitId(r7)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxr r0 = new com.google.android.gms.internal.ads.zzdxr     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Le9
            r8.setAdListener(r0)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdRequest r7 = zzk()     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        Ld7:
            android.content.Context r8 = r6.zzj()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.AdRequest r0 = zzk()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzdxq r1 = new com.google.android.gms.internal.ads.zzdxq     // Catch: java.lang.Throwable -> Le9
            r1.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        Le9:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final synchronized void zzi(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzdxm r0 = r4.zzd     // Catch: java.lang.Throwable -> Lac
            android.app.Activity r0 = r0.zzg()     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto Lb
            goto Laa
        Lb:
            java.util.Map r1 = r4.zza     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto Laa
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziW     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r3 = r3.zza(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lac
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto L35
            boolean r3 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L35
            boolean r3 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L35
            boolean r3 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L35
            boolean r3 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto L3a
        L35:
            java.util.Map r3 = r4.zza     // Catch: java.lang.Throwable -> Lac
            r3.remove(r5)     // Catch: java.lang.Throwable -> Lac
        L3a:
            java.lang.String r3 = zzl(r1)     // Catch: java.lang.Throwable -> Lac
            r4.zzn(r3, r6)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto L4c
            com.google.android.gms.ads.appopen.AppOpenAd r1 = (com.google.android.gms.ads.appopen.AppOpenAd) r1     // Catch: java.lang.Throwable -> Lac
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r4)
            return
        L4c:
            boolean r6 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto L57
            com.google.android.gms.ads.interstitial.InterstitialAd r1 = (com.google.android.gms.ads.interstitial.InterstitialAd) r1     // Catch: java.lang.Throwable -> Lac
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r4)
            return
        L57:
            boolean r6 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto L67
            com.google.android.gms.ads.rewarded.RewardedAd r1 = (com.google.android.gms.ads.rewarded.RewardedAd) r1     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.zzdxo r5 = new com.google.android.gms.internal.ads.zzdxo     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r4)
            return
        L67:
            boolean r6 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto L77
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd r1 = (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) r1     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.zzdxp r5 = new com.google.android.gms.internal.ads.zzdxp     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r4)
            return
        L77:
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r6 = r6.zza(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto Laa
            boolean r6 = r1 instanceof com.google.android.gms.ads.AdView     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L8f
            boolean r6 = r1 instanceof com.google.android.gms.ads.nativead.NativeAd     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto Laa
        L8f:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> Lac
            r6.<init>()     // Catch: java.lang.Throwable -> Lac
            android.content.Context r0 = r4.zzj()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r6.setClassName(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "adUnit"
            r6.putExtra(r1, r5)     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.ads.internal.util.zzt.zzT(r0, r6)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r4)
            return
        Laa:
            monitor-exit(r4)
            return
        Lac:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
