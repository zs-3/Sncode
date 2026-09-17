package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbaj extends com.google.android.gms.internal.ads.zzbaq {
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback zza;
    private final java.lang.String zzb;

    public zzbaj(com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzb(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzc(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback r0 = r1.zza
            if (r0 == 0) goto Ld
            com.google.android.gms.ads.LoadAdError r2 = r2.zzb()
            com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback r0 = r1.zza
            r0.onAdFailedToLoad(r2)
        Ld:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(com.google.android.gms.internal.ads.zzbao r3) {
            r2 = this;
            com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback r0 = r2.zza
            if (r0 == 0) goto L10
            java.lang.String r0 = r2.zzb
            com.google.android.gms.internal.ads.zzbak r1 = new com.google.android.gms.internal.ads.zzbak
            r1.<init>(r3, r0)
            com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback r3 = r2.zza
            r3.onAdLoaded(r1)
        L10:
            return
    }
}
