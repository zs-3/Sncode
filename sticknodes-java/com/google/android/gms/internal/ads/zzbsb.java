package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbsb implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsd zza;

    zzbsb(com.google.android.gms.internal.ads.zzbsd r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
            r1 = this;
            java.lang.String r0 = "AdMobCustomTabsAdapter overlay is resumed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
            r1 = this;
            java.lang.String r0 = "AdMobCustomTabsAdapter overlay is paused."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r1 = this;
            java.lang.String r0 = "Delay close AdMobCustomTabsAdapter overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
            r2 = this;
            java.lang.String r0 = "Opening AdMobCustomTabsAdapter overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbsd r0 = r2.zza
            com.google.android.gms.ads.mediation.MediationInterstitialListener r1 = com.google.android.gms.internal.ads.zzbsd.zzb(r0)
            r1.onAdOpened(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r2) {
            r1 = this;
            java.lang.String r2 = "AdMobCustomTabsAdapter overlay is closed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbsd r2 = r1.zza
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = com.google.android.gms.internal.ads.zzbsd.zzb(r2)
            r0.onAdClosed(r2)
            return
    }
}
