package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zza extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper {
    public zza(com.google.android.gms.ads.formats.UnifiedNativeAd r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.zzh()
            r1.setHeadline(r0)
            java.util.List r0 = r2.zzk()
            r1.setImages(r0)
            java.lang.String r0 = r2.zzf()
            r1.setBody(r0)
            com.google.android.gms.ads.formats.NativeAd$Image r0 = r2.zzb()
            r1.setIcon(r0)
            java.lang.String r0 = r2.zzg()
            r1.setCallToAction(r0)
            java.lang.String r0 = r2.zze()
            r1.setAdvertiser(r0)
            java.lang.Double r0 = r2.zzc()
            r1.setStarRating(r0)
            java.lang.String r0 = r2.zzj()
            r1.setStore(r0)
            java.lang.String r0 = r2.zzi()
            r1.setPrice(r0)
            java.lang.Object r0 = r2.zzd()
            r1.zzd(r0)
            r0 = 1
            r1.setOverrideImpressionRecording(r0)
            r1.setOverrideClickHandling(r0)
            com.google.android.gms.ads.VideoController r2 = r2.zza()
            r1.zze(r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(android.view.View r1, java.util.Map<java.lang.String, android.view.View> r2, java.util.Map<java.lang.String, android.view.View> r3) {
            r0 = this;
            boolean r2 = r1 instanceof com.google.android.gms.ads.formats.zzj
            r3 = 0
            if (r2 != 0) goto L11
            java.util.WeakHashMap r2 = com.google.android.gms.ads.formats.zze.zza
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.ads.formats.zze r1 = (com.google.android.gms.ads.formats.zze) r1
            if (r1 != 0) goto L10
            return
        L10:
            throw r3
        L11:
            com.google.android.gms.ads.formats.zzj r1 = (com.google.android.gms.ads.formats.zzj) r1
            throw r3
    }
}
