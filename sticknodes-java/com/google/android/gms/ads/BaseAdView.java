package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends android.view.ViewGroup {
    protected final com.google.android.gms.ads.internal.client.zzel zza;

    protected BaseAdView(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.gms.ads.internal.client.zzel r1 = new com.google.android.gms.ads.internal.client.zzel
            r1.<init>(r0, r2)
            r0.zza = r1
            return
    }

    protected BaseAdView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3)
            com.google.android.gms.ads.internal.client.zzel r2 = new com.google.android.gms.ads.internal.client.zzel
            r0 = 0
            r2.<init>(r1, r3, r0, r4)
            r1.zza = r2
            return
    }

    protected BaseAdView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.google.android.gms.ads.internal.client.zzel r1 = new com.google.android.gms.ads.internal.client.zzel
            r3 = 0
            r1.<init>(r0, r2, r3, r4)
            r0.zza = r1
            return
    }

    protected BaseAdView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.google.android.gms.ads.internal.client.zzel r1 = new com.google.android.gms.ads.internal.client.zzel
            r1.<init>(r0, r2, r5, r4)
            r0.zza = r1
            return
    }

    protected BaseAdView(android.content.Context r1, android.util.AttributeSet r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.android.gms.ads.internal.client.zzel r1 = new com.google.android.gms.ads.internal.client.zzel
            r1.<init>(r0, r2, r3)
            r0.zza = r1
            return
    }

    public void destroy() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkL
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.zzd r1 = new com.google.android.gms.ads.zzd
            r1.<init>(r2)
            r0.execute(r1)
            return
        L32:
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            r0.zzk()
            return
    }

    public com.google.android.gms.ads.AdListener getAdListener() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.AdListener r0 = r0.zza()
            return r0
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.AdSize r0 = r0.zzb()
            return r0
    }

    public java.lang.String getAdUnitId() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            java.lang.String r0 = r0.zzj()
            return r0
    }

    public com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.OnPaidEventListener r0 = r0.zzc()
            return r0
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.ResponseInfo r0 = r0.zzd()
            return r0
    }

    public boolean isCollapsible() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            boolean r0 = r0.zzA()
            return r0
    }

    public boolean isLoading() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            boolean r0 = r0.zzB()
            return r0
    }

    public void loadAd(com.google.android.gms.ads.AdRequest r3) {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L37
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.zzf r1 = new com.google.android.gms.ads.zzf
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L37:
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzei r3 = r3.zza
            r0.zzm(r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r3 = 0
            android.view.View r3 = r2.getChildAt(r3)
            if (r3 == 0) goto L24
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L24
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            int r6 = r6 - r4
            int r6 = r6 - r0
            int r7 = r7 - r5
            int r7 = r7 - r1
            int r6 = r6 / 2
            int r7 = r7 / 2
            int r0 = r0 + r6
            int r1 = r1 + r7
            r3.layout(r6, r7, r0, r1)
        L24:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.getChildAt(r0)
            if (r1 == 0) goto L1b
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1b
            r4.measureChild(r1, r5, r6)
            int r0 = r1.getMeasuredWidth()
            int r1 = r1.getMeasuredHeight()
            goto L39
        L1b:
            com.google.android.gms.ads.AdSize r1 = r4.getAdSize()     // Catch: java.lang.NullPointerException -> L20
            goto L27
        L20:
            r1 = move-exception
            java.lang.String r2 = "Unable to retrieve ad size."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
            r1 = 0
        L27:
            if (r1 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            int r2 = r1.getWidthInPixels(r0)
            int r0 = r1.getHeightInPixels(r0)
            r1 = r0
            r0 = r2
            goto L39
        L38:
            r1 = 0
        L39:
            int r2 = r4.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r4.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = android.view.View.resolveSize(r0, r5)
            int r6 = android.view.View.resolveSize(r1, r6)
            r4.setMeasuredDimension(r5, r6)
            return
    }

    public void pause() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzg
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.zze r1 = new com.google.android.gms.ads.zze
            r1.<init>(r2)
            r0.execute(r1)
            return
        L32:
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            r0.zzn()
            return
    }

    public void resume() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzh
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.zzc r1 = new com.google.android.gms.ads.zzc
            r1.<init>(r2)
            r0.execute(r1)
            return
        L32:
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            r0.zzp()
            return
    }

    public void setAdListener(com.google.android.gms.ads.AdListener r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            r0.zzr(r3)
            if (r3 != 0) goto Le
            com.google.android.gms.ads.internal.client.zzel r3 = r2.zza
            r0 = 0
            r3.zzq(r0)
            return
        Le:
            boolean r0 = r3 instanceof com.google.android.gms.ads.internal.client.zza
            if (r0 == 0) goto L1a
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            r1 = r3
            com.google.android.gms.ads.internal.client.zza r1 = (com.google.android.gms.ads.internal.client.zza) r1
            r0.zzq(r1)
        L1a:
            boolean r0 = r3 instanceof com.google.android.gms.ads.admanager.AppEventListener
            if (r0 == 0) goto L25
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            com.google.android.gms.ads.admanager.AppEventListener r3 = (com.google.android.gms.ads.admanager.AppEventListener) r3
            r0.zzv(r3)
        L25:
            return
    }

    public void setAdSize(com.google.android.gms.ads.AdSize r3) {
            r2 = this;
            r0 = 1
            com.google.android.gms.ads.AdSize[] r0 = new com.google.android.gms.ads.AdSize[r0]
            r1 = 0
            r0[r1] = r3
            com.google.android.gms.ads.internal.client.zzel r3 = r2.zza
            r3.zzs(r0)
            return
    }

    public void setAdUnitId(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzu(r2)
            return
    }

    public void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzx(r2)
            return
    }
}
