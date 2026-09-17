package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcgu {
    private final com.google.android.gms.internal.ads.zzcgv zza;
    private final com.google.android.gms.internal.ads.zzcgt zzb;

    public zzcgu(com.google.android.gms.internal.ads.zzcgv r1, com.google.android.gms.internal.ads.zzcgt r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zza = r1
            return
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignals(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            java.lang.String r5 = "Click string is empty, not proceeding."
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return r1
        Le:
            com.google.android.gms.internal.ads.zzcgv r0 = r4.zza
            com.google.android.gms.internal.ads.zzchb r0 = (com.google.android.gms.internal.ads.zzchb) r0
            com.google.android.gms.internal.ads.zzavn r0 = r0.zzI()
            if (r0 != 0) goto L1e
            java.lang.String r5 = "Signal utils is empty, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return r1
        L1e:
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()
            if (r0 != 0) goto L2a
            java.lang.String r5 = "Signals object is empty, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return r1
        L2a:
            com.google.android.gms.internal.ads.zzcgv r2 = r4.zza
            android.content.Context r2 = r2.getContext()
            if (r2 != 0) goto L38
            java.lang.String r5 = "Context is null, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return r1
        L38:
            com.google.android.gms.internal.ads.zzcgv r1 = r4.zza
            android.content.Context r2 = r1.getContext()
            com.google.android.gms.internal.ads.zzchd r1 = (com.google.android.gms.internal.ads.zzchd) r1
            android.view.View r1 = r1.zzF()
            com.google.android.gms.internal.ads.zzcgv r3 = r4.zza
            android.app.Activity r3 = r3.zzi()
            java.lang.String r5 = r0.zzf(r2, r5, r1, r3)
            return r5
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignals() {
            r4 = this;
            com.google.android.gms.internal.ads.zzcgv r0 = r4.zza
            com.google.android.gms.internal.ads.zzchb r0 = (com.google.android.gms.internal.ads.zzchb) r0
            com.google.android.gms.internal.ads.zzavn r0 = r0.zzI()
            java.lang.String r1 = ""
            if (r0 != 0) goto L12
            java.lang.String r0 = "Signal utils is empty, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return r1
        L12:
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()
            if (r0 != 0) goto L1e
            java.lang.String r0 = "Signals object is empty, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return r1
        L1e:
            com.google.android.gms.internal.ads.zzcgv r2 = r4.zza
            android.content.Context r2 = r2.getContext()
            if (r2 != 0) goto L2c
            java.lang.String r0 = "Context is null, ignoring."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return r1
        L2c:
            com.google.android.gms.internal.ads.zzcgv r1 = r4.zza
            android.content.Context r2 = r1.getContext()
            com.google.android.gms.internal.ads.zzchd r1 = (com.google.android.gms.internal.ads.zzchd) r1
            android.view.View r1 = r1.zzF()
            com.google.android.gms.internal.ads.zzcgv r3 = r4.zza
            android.app.Activity r3 = r3.zzi()
            java.lang.String r0 = r0.zzh(r2, r1, r3)
            return r0
    }

    @android.webkit.JavascriptInterface
    public void notify(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lc
            java.lang.String r3 = "URL is empty, ignoring message"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            return
        Lc:
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcgs r1 = new com.google.android.gms.internal.ads.zzcgs
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    final /* synthetic */ void zza(java.lang.String r2) {
            r1 = this;
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.google.android.gms.internal.ads.zzcgt r0 = r1.zzb
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zza
            com.google.android.gms.internal.ads.zzcgn r0 = (com.google.android.gms.internal.ads.zzcgn) r0
            com.google.android.gms.internal.ads.zzcfw r0 = r0.zzaO()
            if (r0 != 0) goto L16
            java.lang.String r2 = "Unable to pass GMSG, no AdWebViewClient for AdWebView!"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            return
        L16:
            r0.zzj(r2)
            return
    }
}
