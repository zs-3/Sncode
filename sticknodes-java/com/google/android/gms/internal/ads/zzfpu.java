package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfpu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpv zza;
    private final android.webkit.WebView zzb;

    zzfpu(com.google.android.gms.internal.ads.zzfpv r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            android.webkit.WebView r1 = com.google.android.gms.internal.ads.zzfpv.zzo(r1)
            r0.zzb = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            android.webkit.WebView r0 = r1.zzb
            r0.destroy()
            return
    }
}
