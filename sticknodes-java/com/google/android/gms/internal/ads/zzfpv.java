package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpv extends com.google.android.gms.internal.ads.zzfpr {
    private android.webkit.WebView zza;
    private java.lang.Long zzb;
    private final java.util.Map zzc;

    public zzfpv(java.lang.String r1, java.util.Map r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    static /* bridge */ /* synthetic */ android.webkit.WebView zzo(com.google.android.gms.internal.ads.zzfpv r0) {
            android.webkit.WebView r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final void zzc() {
            r7 = this;
            super.zzc()
            java.lang.Long r0 = r7.zzb
            r1 = 4000(0xfa0, double:1.9763E-320)
            if (r0 != 0) goto Lb
            r3 = r1
            goto L1e
        Lb:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = java.lang.System.nanoTime()
            java.lang.Long r5 = r7.zzb
            long r5 = r5.longValue()
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r0.convert(r3, r5)
        L1e:
            long r1 = r1 - r3
            r3 = 2000(0x7d0, double:9.88E-321)
            long r0 = java.lang.Math.max(r1, r3)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            com.google.android.gms.internal.ads.zzfpu r3 = new com.google.android.gms.internal.ads.zzfpu
            r3.<init>(r7)
            r2.postDelayed(r3, r0)
            r0 = 0
            r7.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final void zzi(com.google.android.gms.internal.ads.zzfom r5, com.google.android.gms.internal.ads.zzfok r6) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Map r1 = r6.zzi()
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L1b
            r4.zzj(r5, r6, r0)
            return
        L1b:
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r1.get(r5)
            com.google.android.gms.internal.ads.zzfow r5 = (com.google.android.gms.internal.ads.zzfow) r5
            r5 = 0
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final void zzn() {
            r3 = this;
            android.webkit.WebView r0 = new android.webkit.WebView
            com.google.android.gms.internal.ads.zzfpi r1 = com.google.android.gms.internal.ads.zzfpi.zzb()
            android.content.Context r1 = r1.zza()
            r0.<init>(r1)
            r3.zza = r0
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebView r0 = r3.zza
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 0
            r0.setAllowContentAccess(r1)
            android.webkit.WebView r0 = r3.zza
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setAllowFileAccess(r1)
            android.webkit.WebView r0 = r3.zza
            com.google.android.gms.internal.ads.zzfpt r1 = new com.google.android.gms.internal.ads.zzfpt
            r1.<init>(r3)
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r3.zza
            r3.zzm(r0)
            android.webkit.WebView r0 = r3.zza
            r1 = 0
            com.google.android.gms.internal.ads.zzfpk.zzj(r0, r1)
            java.util.Map r0 = r3.zzc
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L5a
            long r0 = java.lang.System.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.zzb = r0
            return
        L5a:
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r2 = r3.zzc
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.ads.zzfow r0 = (com.google.android.gms.internal.ads.zzfow) r0
            throw r1
    }
}
