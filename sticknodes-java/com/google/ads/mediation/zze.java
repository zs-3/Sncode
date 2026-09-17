package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zze extends com.google.android.gms.ads.AdListener implements com.google.android.gms.ads.formats.zzi, com.google.android.gms.ads.formats.zzg, com.google.android.gms.ads.formats.zzf {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationNativeListener zzb;

    public zze(com.google.ads.mediation.AbstractAdViewAdapter r1, com.google.android.gms.ads.mediation.MediationNativeListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdClicked(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdClosed(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdFailedToLoad(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdImpression(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.onAdOpened(r1)
            return
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(com.google.android.gms.ads.formats.UnifiedNativeAd r3) {
            r2 = this;
            com.google.ads.mediation.zza r0 = new com.google.ads.mediation.zza
            r0.<init>(r3)
            com.google.android.gms.ads.mediation.MediationNativeListener r3 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r3.onAdLoaded(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(com.google.android.gms.internal.ads.zzbgx r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.zze(r1, r3, r4)
            return
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(com.google.android.gms.internal.ads.zzbgx r3) {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationNativeListener r0 = r2.zzb
            com.google.ads.mediation.AbstractAdViewAdapter r1 = r2.zza
            r0.zzd(r1, r3)
            return
    }
}
