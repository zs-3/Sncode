package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfpt extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpv zza;

    zzfpt(com.google.android.gms.internal.ads.zzfpv r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView r4, android.webkit.RenderProcessGoneDetail r5) {
            r3 = this;
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "WebView renderer gone: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "for WebView: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r0 = "NativeBridge"
            android.util.Log.w(r0, r5)
            com.google.android.gms.internal.ads.zzfpv r5 = r3.zza
            android.webkit.WebView r5 = r5.zza()
            if (r5 != r4) goto L39
            java.lang.String r5 = "Deallocating the Native bridge as it is unusable. No further events will be generated for this session."
            android.util.Log.w(r0, r5)
            com.google.android.gms.internal.ads.zzfpv r5 = r3.zza
            r0 = 0
            r5.zzm(r0)
        L39:
            r4.destroy()
            r4 = 1
            return r4
    }
}
