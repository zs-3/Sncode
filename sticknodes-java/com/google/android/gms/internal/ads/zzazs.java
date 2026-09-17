package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazs implements java.lang.Runnable {
    final android.webkit.ValueCallback zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzazk zzb;
    final /* synthetic */ android.webkit.WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzazu zze;

    zzazs(com.google.android.gms.internal.ads.zzazu r1, com.google.android.gms.internal.ads.zzazk r2, android.webkit.WebView r3, boolean r4) {
            r0 = this;
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r1
            r0.<init>()
            com.google.android.gms.internal.ads.zzazr r1 = new com.google.android.gms.internal.ads.zzazr
            r1.<init>(r0)
            r0.zza = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            android.webkit.WebView r0 = r3.zzc
            android.webkit.WebSettings r0 = r0.getSettings()
            boolean r0 = r0.getJavaScriptEnabled()
            if (r0 == 0) goto L1d
            android.webkit.WebView r0 = r3.zzc     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "(function() { return  {text:document.body.innerText}})();"
            android.webkit.ValueCallback r2 = r3.zza     // Catch: java.lang.Throwable -> L16
            r0.evaluateJavascript(r1, r2)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            android.webkit.ValueCallback r0 = r3.zza
            java.lang.String r1 = ""
            r0.onReceiveValue(r1)
        L1d:
            return
    }
}
