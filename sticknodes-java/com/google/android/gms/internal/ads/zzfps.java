package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfps extends com.google.android.gms.internal.ads.zzfpr {
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    public zzfps(java.lang.String r2, android.webkit.WebView r3) {
            r1 = this;
            r1.<init>(r2)
            android.webkit.WebSettings r2 = r3.getSettings()
            boolean r2 = r2.getJavaScriptEnabled()
            if (r2 != 0) goto L15
            android.webkit.WebSettings r2 = r3.getSettings()
            r0 = 1
            r2.setJavaScriptEnabled(r0)
        L15:
            r1.zzm(r3)
            return
    }
}
