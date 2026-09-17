package com.google.android.gms.ads.admanager;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class AdManagerAdView extends com.google.android.gms.ads.BaseAdView {
    public AdManagerAdView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            java.lang.String r0 = "Context cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            return
    }

    public AdManagerAdView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            java.lang.String r3 = "Context cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)
            return
    }

    public AdManagerAdView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r8 = "Context cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r8)
            return
    }

    public com.google.android.gms.ads.AdSize[] getAdSizes() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.AdSize[] r0 = r0.zzC()
            return r0
    }

    public com.google.android.gms.ads.admanager.AppEventListener getAppEventListener() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.admanager.AppEventListener r0 = r0.zzh()
            return r0
    }

    public com.google.android.gms.ads.VideoController getVideoController() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.VideoController r0 = r0.zzf()
            return r0
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.VideoOptions r0 = r0.zzg()
            return r0
    }

    public void loadAd(com.google.android.gms.ads.admanager.AdManagerAdRequest r3) {
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
            com.google.android.gms.ads.admanager.zzb r1 = new com.google.android.gms.ads.admanager.zzb
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L37:
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzei r3 = r3.zza()
            r0.zzm(r3)
            return
    }

    public void recordManualImpression() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzo()
            return
    }

    public void setAdSizes(com.google.android.gms.ads.AdSize... r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            int r0 = r2.length
            if (r0 <= 0) goto Lb
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzt(r2)
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The supported ad sizes must contain at least one valid ad size."
            r2.<init>(r0)
            throw r2
    }

    public void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzv(r2)
            return
    }

    public void setManualImpressionsEnabled(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzw(r2)
            return
    }

    public void setVideoOptions(com.google.android.gms.ads.VideoOptions r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            r0.zzy(r2)
            return
    }

    final /* synthetic */ void zza(com.google.android.gms.ads.admanager.AdManagerAdRequest r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r2.zza     // Catch: java.lang.IllegalStateException -> La
            com.google.android.gms.ads.internal.client.zzei r3 = r3.zza()     // Catch: java.lang.IllegalStateException -> La
            r0.zzm(r3)     // Catch: java.lang.IllegalStateException -> La
            return
        La:
            r3 = move-exception
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.internal.ads.zzbur r0 = com.google.android.gms.internal.ads.zzbup.zza(r0)
            java.lang.String r1 = "AdManagerAdView.loadAd"
            r0.zzh(r3, r1)
            return
    }

    public final boolean zzb(com.google.android.gms.ads.internal.client.zzby r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            boolean r2 = r0.zzz(r2)
            return r2
    }
}
