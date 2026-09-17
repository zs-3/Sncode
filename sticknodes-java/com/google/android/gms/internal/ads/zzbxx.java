package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxx extends com.google.android.gms.internal.ads.zzbxh {
    private com.google.android.gms.ads.FullScreenContentCallback zza;
    private com.google.android.gms.ads.OnUserEarnedRewardListener zzb;

    public zzbxx() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void zzb(com.google.android.gms.ads.FullScreenContentCallback r1) {
            r0 = this;
            r0.zza = r1
            return
    }

    public final void zzc(com.google.android.gms.ads.OnUserEarnedRewardListener r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzf() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdImpression()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzg() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdDismissedFullScreenContent()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzh(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzi(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto Lb
            com.google.android.gms.ads.AdError r2 = r2.zza()
            r0.onAdFailedToShowFullScreenContent(r2)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzj() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdShowedFullScreenContent()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzk(com.google.android.gms.internal.ads.zzbxc r3) {
            r2 = this;
            com.google.android.gms.ads.OnUserEarnedRewardListener r0 = r2.zzb
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzbxp r1 = new com.google.android.gms.internal.ads.zzbxp
            r1.<init>(r3)
            r0.onUserEarnedReward(r1)
        Lc:
            return
    }
}
