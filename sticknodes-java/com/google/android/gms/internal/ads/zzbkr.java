package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbkr extends android.webkit.WebViewClient {
    public zzbkr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(android.webkit.WebView r2, java.lang.String r3, boolean r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.doUpdateVisitedHistory(r2, r3, r4)
            return
    }

    protected abstract android.webkit.WebViewClient getDelegate();

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(android.webkit.WebView r2, android.os.Message r3, android.os.Message r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onFormResubmission(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onLoadResource(r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onPageCommitVisible(r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onPageFinished(r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView r2, java.lang.String r3, android.graphics.Bitmap r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onPageStarted(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(android.webkit.WebView r2, android.webkit.ClientCertRequest r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedClientCertRequest(r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedError(r2, r3, r4, r5)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedError(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(android.webkit.WebView r2, android.webkit.HttpAuthHandler r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedHttpAuthRequest(r2, r3, r4, r5)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceResponse r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedHttpError(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(android.webkit.WebView r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedLoginRequest(r2, r3, r4, r5)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView r2, android.webkit.SslErrorHandler r3, android.net.http.SslError r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onReceivedSslError(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView r2, android.webkit.RenderProcessGoneDetail r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.onRenderProcessGone(r2, r3)
            return r2
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, int r4, android.webkit.SafeBrowsingResponse r5) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onSafeBrowsingHit(r2, r3, r4, r5)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(android.webkit.WebView r2, float r3, float r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onScaleChanged(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(android.webkit.WebView r2, android.os.Message r3, android.os.Message r4) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onTooManyRedirects(r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(android.webkit.WebView r2, android.view.KeyEvent r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L7
            return
        L7:
            r0.onUnhandledKeyEvent(r2, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.webkit.WebResourceResponse r2 = r0.shouldInterceptRequest(r2, r3)
            return r2
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.webkit.WebResourceResponse r2 = r0.shouldInterceptRequest(r2, r3)
            return r2
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView r2, android.view.KeyEvent r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.shouldOverrideKeyEvent(r2, r3)
            return r2
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.shouldOverrideUrlLoading(r2, r3)
            return r2
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getDelegate()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.shouldOverrideUrlLoading(r2, r3)
            return r2
    }
}
