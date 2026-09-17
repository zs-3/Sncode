package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzd extends com.google.android.gms.ads.FullScreenContentCallback {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;

    public zzd(com.google.ads.mediation.AbstractAdViewAdapter r1, com.google.android.gms.ads.mediation.MediationInterstitialListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdClosed(r1)
            return
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdOpened(r1)
            return
    }
}
