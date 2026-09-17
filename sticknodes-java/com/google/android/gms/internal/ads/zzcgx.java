package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.TargetApi(21)
/* loaded from: classes.dex */
public final class zzcgx extends com.google.android.gms.internal.ads.zzcgw {
    public zzcgx(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzbbu r2, boolean r3, com.google.android.gms.internal.ads.zzefj r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
            r1 = this;
            if (r3 == 0) goto L1a
            android.net.Uri r0 = r3.getUrl()
            if (r0 != 0) goto L9
            goto L1a
        L9:
            android.net.Uri r0 = r3.getUrl()
            java.lang.String r0 = r0.toString()
            java.util.Map r3 = r3.getRequestHeaders()
            android.webkit.WebResourceResponse r2 = r1.zzT(r2, r0, r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
