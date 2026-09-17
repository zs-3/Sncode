package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zza implements com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener {
    private final com.google.android.gms.ads.mediation.customevent.CustomEventAdapter zza;
    private final com.google.android.gms.ads.mediation.MediationBannerListener zzb;

    public zza(com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1, com.google.android.gms.ads.mediation.MediationBannerListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdClicked(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdClosed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdClosed(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int r3) {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdFailedToLoad."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.AdError r3) {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdFailedToLoad."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdLeftApplication."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdLeftApplication(r1)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "Custom event adapter called onAdLoaded."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r0 = r1.zza
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza(r0, r2)
            com.google.android.gms.ads.mediation.MediationBannerListener r2 = r1.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r0 = r1.zza
            r2.onAdLoaded(r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
            r2 = this;
            java.lang.String r0 = "Custom event adapter called onAdOpened."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.ads.mediation.MediationBannerListener r0 = r2.zzb
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = r2.zza
            r0.onAdOpened(r1)
            return
    }
}
