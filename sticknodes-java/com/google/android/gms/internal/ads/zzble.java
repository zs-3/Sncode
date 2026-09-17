package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzble extends com.google.android.gms.internal.ads.zzbkr {
    public static final /* synthetic */ int zza = 0;
    private android.webkit.WebViewClient zzb;
    private final com.google.android.gms.ads.h5.H5AdsRequestHandler zzc;
    private final android.webkit.WebView zzd;

    public zzble(android.content.Context r3, android.webkit.WebView r4) {
            r2 = this;
            r2.<init>()
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r4)
            android.webkit.WebSettings r0 = r4.getSettings()
            boolean r0 = r0.getJavaScriptEnabled()
            java.lang.String r1 = "JavaScript must be enabled on the WebView."
            com.google.android.gms.internal.ads.zzfxz.zzf(r0, r1)
            r2.zzd = r4
            com.google.android.gms.internal.ads.zzbld r0 = new com.google.android.gms.internal.ads.zzbld
            r0.<init>(r4)
            com.google.android.gms.ads.h5.H5AdsRequestHandler r4 = new com.google.android.gms.ads.h5.H5AdsRequestHandler
            r4.<init>(r3, r0)
            r2.zzc = r4
            return
    }

    private final boolean zzc(android.webkit.WebView r2) {
            r1 = this;
            android.webkit.WebView r0 = r1.zzd
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            java.lang.String r2 = "H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final android.webkit.WebViewClient getDelegate() {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.zzc(r2)
            if (r0 != 0) goto L7
            goto L12
        L7:
            com.google.android.gms.ads.h5.H5AdsRequestHandler r0 = r1.zzc
            boolean r0 = r0.handleH5AdsRequest(r3)
            if (r0 != 0) goto L12
            super.onLoadResource(r2, r3)
        L12:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
            r2 = this;
            android.webkit.WebView r0 = r2.zzd
            boolean r0 = r2.zzc(r0)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            android.net.Uri r0 = r4.getUrl()
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.h5.H5AdsRequestHandler r1 = r2.zzc
            boolean r0 = r1.handleH5AdsRequest(r0)
            if (r0 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            boolean r3 = super.shouldOverrideUrlLoading(r3, r4)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.zzc(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.google.android.gms.ads.h5.H5AdsRequestHandler r0 = r1.zzc
            boolean r0 = r0.handleH5AdsRequest(r3)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.shouldOverrideUrlLoading(r2, r3)
            return r2
    }

    public final void zza() {
            r1 = this;
            com.google.android.gms.ads.h5.H5AdsRequestHandler r0 = r1.zzc
            r0.clearAdObjects()
            return
    }

    public final void zzb(android.webkit.WebViewClient r3) {
            r2 = this;
            if (r3 == r2) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Delegate cannot be itself."
            com.google.android.gms.internal.ads.zzfxz.zzf(r0, r1)
            r2.zzb = r3
            return
    }
}
