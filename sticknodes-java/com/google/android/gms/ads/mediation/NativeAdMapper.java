package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class NativeAdMapper {
    private java.lang.String zza;
    private java.util.List zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.nativead.NativeAd.Image zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.lang.Double zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private boolean zzj;
    private android.view.View zzk;
    private android.view.View zzl;
    private android.os.Bundle zzm;
    private boolean zzn;
    private boolean zzo;
    private float zzp;

    public NativeAdMapper() {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.zzm = r0
            return
    }

    public android.view.View getAdChoicesContent() {
            r1 = this;
            android.view.View r0 = r1.zzk
            return r0
    }

    public final java.lang.String getAdvertiser() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String getBody() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final java.lang.String getCallToAction() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public float getCurrentTime() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getDuration() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.zzm
            return r0
    }

    public final java.lang.String getHeadline() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.ads.nativead.NativeAd.Image getIcon() {
            r1 = this;
            com.google.android.gms.ads.nativead.NativeAd$Image r0 = r1.zzd
            return r0
    }

    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    public float getMediaContentAspectRatio() {
            r1 = this;
            float r0 = r1.zzp
            return r0
    }

    public final boolean getOverrideClickHandling() {
            r1 = this;
            boolean r0 = r1.zzo
            return r0
    }

    public final boolean getOverrideImpressionRecording() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    public final java.lang.String getPrice() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    public final java.lang.Double getStarRating() {
            r1 = this;
            java.lang.Double r0 = r1.zzg
            return r0
    }

    public final java.lang.String getStore() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    public void handleClick(android.view.View r1) {
            r0 = this;
            return
    }

    public boolean hasVideoContent() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    public void recordImpression() {
            r0 = this;
            return
    }

    public void setAdChoicesContent(android.view.View r1) {
            r0 = this;
            r0.zzk = r1
            return
    }

    public final void setAdvertiser(java.lang.String r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public final void setBody(java.lang.String r1) {
            r0 = this;
            r0.zzc = r1
            return
    }

    public final void setCallToAction(java.lang.String r1) {
            r0 = this;
            r0.zze = r1
            return
    }

    public final void setExtras(android.os.Bundle r1) {
            r0 = this;
            r0.zzm = r1
            return
    }

    public void setHasVideoContent(boolean r1) {
            r0 = this;
            r0.zzj = r1
            return
    }

    public final void setHeadline(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return
    }

    public final void setIcon(com.google.android.gms.ads.nativead.NativeAd.Image r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final void setImages(java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    public void setMediaContentAspectRatio(float r1) {
            r0 = this;
            r0.zzp = r1
            return
    }

    public void setMediaView(android.view.View r1) {
            r0 = this;
            r0.zzl = r1
            return
    }

    public final void setOverrideClickHandling(boolean r1) {
            r0 = this;
            r0.zzo = r1
            return
    }

    public final void setOverrideImpressionRecording(boolean r1) {
            r0 = this;
            r0.zzn = r1
            return
    }

    public final void setPrice(java.lang.String r1) {
            r0 = this;
            r0.zzi = r1
            return
    }

    public final void setStarRating(java.lang.Double r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    public final void setStore(java.lang.String r1) {
            r0 = this;
            r0.zzh = r1
            return
    }

    public void trackViews(android.view.View r1, java.util.Map<java.lang.String, android.view.View> r2, java.util.Map<java.lang.String, android.view.View> r3) {
            r0 = this;
            return
    }

    public void untrackView(android.view.View r1) {
            r0 = this;
            return
    }

    public final android.view.View zza() {
            r1 = this;
            android.view.View r0 = r1.zzl
            return r0
    }
}
