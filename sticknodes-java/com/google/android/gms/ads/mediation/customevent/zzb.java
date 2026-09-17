package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzb implements com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener {
    final /* synthetic */ com.google.android.gms.ads.mediation.customevent.CustomEventAdapter zza;
    private final com.google.android.gms.ads.mediation.customevent.CustomEventAdapter zzb;
    private final com.google.android.gms.ads.mediation.MediationInterstitialListener zzc;

    public zzb(com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1, com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r2, com.google.android.gms.ads.mediation.MediationInterstitialListener r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zzb
            r0.onAdClicked(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdClosed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zzb
            r0.onAdClosed(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int r3) {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onFailedToReceiveAd."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zzb
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.AdError r3) {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onFailedToReceiveAd."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zzb
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdLeftApplication."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zzb
            r0.onAdLeftApplication(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onReceivedAd."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdLoaded(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdOpened."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r2.zzc
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zzb
            r0.onAdOpened(r1)
            return
    }
}
