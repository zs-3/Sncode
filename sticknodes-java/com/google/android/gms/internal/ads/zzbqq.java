package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbqq extends com.google.android.gms.internal.ads.zzbpz {
    private final com.google.android.gms.ads.mediation.NativeAdMapper zza;

    public zzbqq(com.google.android.gms.ads.mediation.NativeAdMapper r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean zzA() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            boolean r0 = r0.getOverrideClickHandling()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean zzB() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            boolean r0 = r0.getOverrideImpressionRecording()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final double zze() {
            r2 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r2.zza
            java.lang.Double r0 = r0.getStarRating()
            if (r0 == 0) goto L13
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r2.zza
            java.lang.Double r0 = r0.getStarRating()
            double r0 = r0.doubleValue()
            return r0
        L13:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float zzf() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            float r0 = r0.getMediaContentAspectRatio()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float zzg() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            float r0 = r0.getCurrentTime()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float zzh() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            float r0 = r0.getDuration()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final android.os.Bundle zzi() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.ads.internal.client.zzeb zzj() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.internal.ads.zzbfv zzk() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.internal.ads.zzbgc zzl() {
            r9 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r9.zza
            com.google.android.gms.ads.nativead.NativeAd$Image r0 = r0.getIcon()
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzbfp r8 = new com.google.android.gms.internal.ads.zzbfp
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            android.net.Uri r3 = r0.getUri()
            double r4 = r0.getScale()
            int r6 = r0.zzb()
            int r7 = r0.zza()
            r1 = r8
            r1.<init>(r2, r3, r4, r6, r7)
            return r8
        L23:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            android.view.View r0 = r0.getAdChoicesContent()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            android.view.View r0 = r0.zza()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.dynamic.IObjectWrapper zzo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.lang.String zzp() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            java.lang.String r0 = r0.getAdvertiser()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.lang.String zzq() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            java.lang.String r0 = r0.getBody()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.lang.String zzr() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            java.lang.String r0 = r0.getCallToAction()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.lang.String zzs() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            java.lang.String r0 = r0.getHeadline()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.lang.String zzt() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            java.lang.String r0 = r0.getPrice()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.lang.String zzu() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            java.lang.String r0 = r0.getStore()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final java.util.List zzv() {
            r11 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r11.zza
            java.util.List r0 = r0.getImages()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 != 0) goto Le
            goto L3c
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            com.google.android.gms.ads.nativead.NativeAd$Image r2 = (com.google.android.gms.ads.nativead.NativeAd.Image) r2
            com.google.android.gms.internal.ads.zzbfp r10 = new com.google.android.gms.internal.ads.zzbfp
            android.graphics.drawable.Drawable r4 = r2.getDrawable()
            android.net.Uri r5 = r2.getUri()
            double r6 = r2.getScale()
            int r8 = r2.zzb()
            int r9 = r2.zza()
            r3 = r10
            r3.<init>(r4, r5, r6, r8, r9)
            r1.add(r10)
            goto L12
        L3c:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            r0.handleClick(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void zzx() {
            r1 = this;
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            r0.recordImpression()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4) {
            r1 = this;
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            r0.trackViews(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            com.google.android.gms.ads.mediation.NativeAdMapper r0 = r1.zza
            r0.untrackView(r2)
            return
    }
}
