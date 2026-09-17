package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzc extends com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;

    public zzc(com.google.ads.mediation.AbstractAdViewAdapter r1, com.google.android.gms.ads.mediation.MediationInterstitialListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd r4) {
            r3 = this;
            com.google.ads.mediation.AbstractAdViewAdapter r0 = r3.zza
            com.google.android.gms.ads.interstitial.InterstitialAd r4 = (com.google.android.gms.ads.interstitial.InterstitialAd) r4
            r0.mInterstitialAd = r4
            com.google.android.gms.ads.mediation.MediationInterstitialListener r1 = r3.zzb
            com.google.ads.mediation.zzd r2 = new com.google.ads.mediation.zzd
            r2.<init>(r0, r1)
            r4.setFullScreenContentCallback(r2)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r4 = r3.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r0 = r3.zza
            r4.onAdLoaded(r0)
            return
    }
}
