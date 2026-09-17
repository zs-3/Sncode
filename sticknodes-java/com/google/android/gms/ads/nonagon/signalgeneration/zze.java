package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zze extends com.google.android.gms.internal.ads.zzbkr {
    private final android.webkit.WebView zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzb;
    private final java.util.concurrent.Executor zzc;
    private android.webkit.WebViewClient zzd;

    public zze(android.webkit.WebView r1, com.google.android.gms.ads.nonagon.signalgeneration.zza r2, com.google.android.gms.internal.ads.zzgfz r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    private final void zzc() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.android.gms.ads.nonagon.signalgeneration.zza r3 = r5.zzb
            org.json.JSONObject r3 = r3.zza()
            r4 = 0
            r2[r4] = r3
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            android.webkit.WebView r1 = r5.zza
            r2 = 0
            r1.evaluateJavascript(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    protected final android.webkit.WebViewClient getDelegate() {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            r0.zzc()
            super.onPageFinished(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView r1, java.lang.String r2, android.graphics.Bitmap r3) {
            r0 = this;
            r0.zzc()
            super.onPageStarted(r1, r2, r3)
            return
    }

    final /* synthetic */ void zza() {
            r3 = this;
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.IllegalStateException -> L3e
            android.webkit.WebView r0 = r3.zza     // Catch: java.lang.IllegalStateException -> L3e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalStateException -> L3e
            r2 = 26
            if (r1 < r2) goto L10
            android.webkit.WebViewClient r0 = r0.getWebViewClient()     // Catch: java.lang.IllegalStateException -> L3e
            goto L1c
        L10:
            java.lang.String r1 = "GET_WEB_VIEW_CLIENT"
            boolean r1 = androidx.webkit.WebViewFeature.isFeatureSupported(r1)     // Catch: java.lang.IllegalStateException -> L3e
            if (r1 == 0) goto L36
            android.webkit.WebViewClient r0 = androidx.webkit.WebViewCompat.getWebViewClient(r0)     // Catch: java.lang.RuntimeException -> L2c
        L1c:
            if (r0 != r3) goto L1f
            return
        L1f:
            if (r0 == 0) goto L23
            r3.zzd = r0
        L23:
            android.webkit.WebView r0 = r3.zza
            r0.setWebViewClient(r3)
            r3.zzc()
            return
        L2c:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.IllegalStateException -> L3e
            java.lang.String r2 = "AdUtil.getWebViewClient"
            r1.zzw(r0, r2)     // Catch: java.lang.IllegalStateException -> L3e
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L3e
            java.lang.String r1 = "getWebViewClient not supported"
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L3e
            throw r0     // Catch: java.lang.IllegalStateException -> L3e
        L3e:
            return
    }

    public final void zzb() {
            r2 = this;
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzc
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzc
            r1.execute(r0)
            return
    }
}
