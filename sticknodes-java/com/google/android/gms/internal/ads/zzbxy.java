package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxy extends com.google.android.gms.internal.ads.zzbxl {
    private final com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback zza;
    private final com.google.android.gms.internal.ads.zzbxz zzb;

    public zzbxy(com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback r1, com.google.android.gms.internal.ads.zzbxz r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zze(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zzf(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback r0 = r1.zza
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.LoadAdError r2 = r2.zzb()
            r0.onAdFailedToLoad(r2)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zzg() {
            r2 = this;
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback r0 = r2.zza
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzbxz r1 = r2.zzb
            if (r1 == 0) goto Lb
            r0.onAdLoaded(r1)
        Lb:
            return
    }
}
