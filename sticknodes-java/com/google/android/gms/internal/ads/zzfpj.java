package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfpj implements java.lang.Runnable {
    final /* synthetic */ android.webkit.WebView zza;
    final /* synthetic */ java.lang.String zzb;

    zzfpj(com.google.android.gms.internal.ads.zzfpk r1, android.webkit.WebView r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            android.webkit.WebView r0 = r2.zza
            java.lang.String r1 = r2.zzb
            com.google.android.gms.internal.ads.zzfpk.zzj(r0, r1)
            return
    }
}
