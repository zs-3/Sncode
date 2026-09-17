package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdxq extends com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdxy zzc;

    zzdxq(com.google.android.gms.internal.ads.zzdxy r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdxy r0 = r2.zzc
            java.lang.String r3 = com.google.android.gms.internal.ads.zzdxy.zzc(r3)
            java.lang.String r1 = r2.zzb
            com.google.android.gms.internal.ads.zzdxy.zzd(r0, r3, r1)
            return
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(com.google.android.gms.ads.appopen.AppOpenAd r4) {
            r3 = this;
            com.google.android.gms.ads.appopen.AppOpenAd r4 = (com.google.android.gms.ads.appopen.AppOpenAd) r4
            java.lang.String r0 = r3.zzb
            com.google.android.gms.internal.ads.zzdxy r1 = r3.zzc
            java.lang.String r2 = r3.zza
            r1.zzg(r2, r4, r0)
            return
    }
}
