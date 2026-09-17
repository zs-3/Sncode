package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzb extends com.google.android.gms.ads.AdListener implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.ads.internal.client.zza {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationBannerListener zzb;

    public zzb(com.google.ads.mediation.AbstractAdViewAdapter r1, com.google.android.gms.ads.mediation.MediationBannerListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdClicked(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdClosed(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdLoaded(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdOpened(r1)
            return
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.zzb(r1, r3, r4)
            return
    }
}
