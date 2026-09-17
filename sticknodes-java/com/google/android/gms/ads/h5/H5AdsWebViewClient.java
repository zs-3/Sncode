package com.google.android.gms.ads.h5;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends com.google.android.gms.internal.ads.zzbkr {
    private final com.google.android.gms.internal.ads.zzble zza;

    public H5AdsWebViewClient(android.content.Context r2, android.webkit.WebView r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzble r0 = new com.google.android.gms.internal.ads.zzble
            r0.<init>(r2, r3)
            r1.zza = r0
            return
    }

    public void clearAdObjects() {
            r1 = this;
            com.google.android.gms.internal.ads.zzble r0 = r1.zza
            r0.zza()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    protected android.webkit.WebViewClient getDelegate() {
            r1 = this;
            com.google.android.gms.internal.ads.zzble r0 = r1.zza
            return r0
    }

    public android.webkit.WebViewClient getDelegateWebViewClient() {
            r1 = this;
            com.google.android.gms.internal.ads.zzble r0 = r1.zza
            android.webkit.WebViewClient r0 = r0.getDelegate()
            return r0
    }

    public void setDelegateWebViewClient(android.webkit.WebViewClient r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzble r0 = r1.zza
            r0.zzb(r2)
            return
    }
}
