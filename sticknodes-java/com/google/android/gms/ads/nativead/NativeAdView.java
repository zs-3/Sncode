package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class NativeAdView extends android.widget.FrameLayout {
    private final android.widget.FrameLayout zza;
    private final com.google.android.gms.internal.ads.zzbgg zzb;

    public NativeAdView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            android.widget.FrameLayout r1 = r0.zzd(r1)
            r0.zza = r1
            com.google.android.gms.internal.ads.zzbgg r1 = r0.zze()
            r0.zzb = r1
            return
    }

    public NativeAdView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.widget.FrameLayout r1 = r0.zzd(r1)
            r0.zza = r1
            com.google.android.gms.internal.ads.zzbgg r1 = r0.zze()
            r0.zzb = r1
            return
    }

    public NativeAdView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.widget.FrameLayout r1 = r0.zzd(r1)
            r0.zza = r1
            com.google.android.gms.internal.ads.zzbgg r1 = r0.zze()
            r0.zzb = r1
            return
    }

    @android.annotation.TargetApi(21)
    public NativeAdView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            android.widget.FrameLayout r1 = r0.zzd(r1)
            r0.zza = r1
            com.google.android.gms.internal.ads.zzbgg r1 = r0.zze()
            r0.zzb = r1
            return
    }

    private final android.widget.FrameLayout zzd(android.content.Context r3) {
            r2 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r3.<init>(r1, r1)
            r0.setLayoutParams(r3)
            r2.addView(r0)
            return r0
    }

    private final com.google.android.gms.internal.ads.zzbgg zze() {
            r3 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            android.widget.FrameLayout r0 = r3.zza
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()
            android.content.Context r2 = r0.getContext()
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzj(r2, r3, r0)
            return r0
    }

    private final void zzf(java.lang.String r2, android.view.View r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzb
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> Ld
            r0.zzdv(r2, r3)     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r2 = move-exception
            java.lang.String r3 = "Unable to call setAssetView on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            android.widget.FrameLayout r1 = r0.zza
            super.bringChildToFront(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(android.view.View r2) {
            r1 = this;
            super.bringChildToFront(r2)
            android.widget.FrameLayout r0 = r1.zza
            if (r0 == r2) goto La
            super.bringChildToFront(r0)
        La:
            return
    }

    public void destroy() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r2.zzb
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzc()     // Catch: android.os.RemoteException -> L9
            return
        L9:
            r0 = move-exception
            java.lang.String r1 = "Unable to destroy native ad view"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r2.zzb
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlg
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzbgg r0 = r2.zzb     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L20
            r0.zzd(r1)     // Catch: android.os.RemoteException -> L20
            goto L26
        L20:
            r0 = move-exception
            java.lang.String r1 = "Unable to call handleTouchEvent on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L26:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
    }

    public com.google.android.gms.ads.nativead.AdChoicesView getAdChoicesView() {
            r2 = this;
            java.lang.String r0 = "3011"
            android.view.View r0 = r2.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.nativead.AdChoicesView
            if (r1 == 0) goto Ld
            com.google.android.gms.ads.nativead.AdChoicesView r0 = (com.google.android.gms.ads.nativead.AdChoicesView) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final android.view.View getAdvertiserView() {
            r1 = this;
            java.lang.String r0 = "3005"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getBodyView() {
            r1 = this;
            java.lang.String r0 = "3004"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getCallToActionView() {
            r1 = this;
            java.lang.String r0 = "3002"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getHeadlineView() {
            r1 = this;
            java.lang.String r0 = "3001"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getIconView() {
            r1 = this;
            java.lang.String r0 = "3003"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getImageView() {
            r1 = this;
            java.lang.String r0 = "3008"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final com.google.android.gms.ads.nativead.MediaView getMediaView() {
            r2 = this;
            java.lang.String r0 = "3010"
            android.view.View r0 = r2.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.nativead.MediaView
            if (r1 == 0) goto Ld
            com.google.android.gms.ads.nativead.MediaView r0 = (com.google.android.gms.ads.nativead.MediaView) r0
            return r0
        Ld:
            if (r0 == 0) goto L14
            java.lang.String r0 = "View is not an instance of MediaView"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
        L14:
            r0 = 0
            return r0
    }

    public final android.view.View getPriceView() {
            r1 = this;
            java.lang.String r0 = "3007"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getStarRatingView() {
            r1 = this;
            java.lang.String r0 = "3009"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    public final android.view.View getStoreView() {
            r1 = this;
            java.lang.String r0 = "3006"
            android.view.View r0 = r1.zza(r0)
            return r0
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View r2, int r3) {
            r1 = this;
            super.onVisibilityChanged(r2, r3)
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzb
            if (r0 != 0) goto L8
            return
        L8:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L10
            r0.zze(r2, r3)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r3 = "Unable to call onVisibilityChanged on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
            r1 = this;
            super.removeAllViews()
            android.widget.FrameLayout r0 = r1.zza
            super.addView(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View r2) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.zza
            if (r0 != r2) goto L5
            return
        L5:
            super.removeView(r2)
            return
    }

    public void setAdChoicesView(com.google.android.gms.ads.nativead.AdChoicesView r2) {
            r1 = this;
            java.lang.String r0 = "3011"
            r1.zzf(r0, r2)
            return
    }

    public final void setAdvertiserView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3005"
            r1.zzf(r0, r2)
            return
    }

    public final void setBodyView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3004"
            r1.zzf(r0, r2)
            return
    }

    public final void setCallToActionView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3002"
            r1.zzf(r0, r2)
            return
    }

    public final void setClickConfirmingView(android.view.View r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzb
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> Ld
            r0.zzdw(r2)     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r2 = move-exception
            java.lang.String r0 = "Unable to call setClickConfirmingView on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    public final void setHeadlineView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3001"
            r1.zzf(r0, r2)
            return
    }

    public final void setIconView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3003"
            r1.zzf(r0, r2)
            return
    }

    public final void setImageView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3008"
            r1.zzf(r0, r2)
            return
    }

    public final void setMediaView(com.google.android.gms.ads.nativead.MediaView r2) {
            r1 = this;
            java.lang.String r0 = "3010"
            r1.zzf(r0, r2)
            if (r2 != 0) goto L8
            return
        L8:
            com.google.android.gms.ads.nativead.zzb r0 = new com.google.android.gms.ads.nativead.zzb
            r0.<init>(r1)
            r2.zza(r0)
            com.google.android.gms.ads.nativead.zzc r0 = new com.google.android.gms.ads.nativead.zzc
            r0.<init>(r1)
            r2.zzb(r0)
            return
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzb
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r2 = r2.zza()     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.dynamic.IObjectWrapper r2 = (com.google.android.gms.dynamic.IObjectWrapper) r2     // Catch: android.os.RemoteException -> Lf
            r0.zzdz(r2)     // Catch: android.os.RemoteException -> Lf
            return
        Lf:
            r2 = move-exception
            java.lang.String r0 = "Unable to call setNativeAd on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    public final void setPriceView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3007"
            r1.zzf(r0, r2)
            return
    }

    public final void setStarRatingView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3009"
            r1.zzf(r0, r2)
            return
    }

    public final void setStoreView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "3006"
            r1.zzf(r0, r2)
            return
    }

    protected final android.view.View zza(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r2.zzb
            r1 = 0
            if (r0 == 0) goto L18
            com.google.android.gms.dynamic.IObjectWrapper r3 = r0.zzb(r3)     // Catch: android.os.RemoteException -> L12
            if (r3 == 0) goto L18
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: android.os.RemoteException -> L12
            android.view.View r3 = (android.view.View) r3     // Catch: android.os.RemoteException -> L12
            return r3
        L12:
            r3 = move-exception
            java.lang.String r0 = "Unable to call getAssetView on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
        L18:
            return r1
    }

    final /* synthetic */ void zzb(com.google.android.gms.ads.MediaContent r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r2.zzb
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r3 instanceof com.google.android.gms.ads.internal.client.zzfe     // Catch: android.os.RemoteException -> L20
            if (r1 == 0) goto L13
            com.google.android.gms.ads.internal.client.zzfe r3 = (com.google.android.gms.ads.internal.client.zzfe) r3     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.zzbfz r3 = r3.zzc()     // Catch: android.os.RemoteException -> L20
            r0.zzdx(r3)     // Catch: android.os.RemoteException -> L20
            return
        L13:
            if (r3 != 0) goto L1a
            r3 = 0
            r0.zzdx(r3)     // Catch: android.os.RemoteException -> L20
            return
        L1a:
            java.lang.String r3 = "Use MediaContent provided by NativeAd.getMediaContent"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)     // Catch: android.os.RemoteException -> L20
            return
        L20:
            r3 = move-exception
            java.lang.String r0 = "Unable to call setMediaContent on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    final /* synthetic */ void zzc(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzb
            if (r0 != 0) goto L5
            goto L15
        L5:
            if (r2 == 0) goto L15
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> Lf
            r0.zzdy(r2)     // Catch: android.os.RemoteException -> Lf
            return
        Lf:
            r2 = move-exception
            java.lang.String r0 = "Unable to call setMediaViewImageScaleType on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
        L15:
            return
    }
}
