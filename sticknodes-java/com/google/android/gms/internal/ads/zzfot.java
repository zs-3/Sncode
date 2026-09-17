package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfot {
    private final com.google.android.gms.internal.ads.zzfov zza;
    private final android.webkit.WebView zzb;
    private final java.util.HashMap zzc;
    private final com.google.android.gms.internal.ads.zzfph zzd;

    private zzfot(com.google.android.gms.internal.ads.zzfov r2, android.webkit.WebView r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1.zzc = r4
            com.google.android.gms.internal.ads.zzfph r4 = new com.google.android.gms.internal.ads.zzfph
            r4.<init>()
            r1.zzd = r4
            com.google.android.gms.internal.ads.zzfqb.zza()
            r1.zza = r2
            r1.zzb = r3
            java.lang.String r2 = "WEB_MESSAGE_LISTENER"
            boolean r2 = androidx.webkit.WebViewFeature.isFeatureSupported(r2)
            if (r2 == 0) goto L3d
            r1.zzg()
            com.google.android.gms.internal.ads.zzfos r2 = new com.google.android.gms.internal.ads.zzfos
            r2.<init>(r1)
            java.util.HashSet r4 = new java.util.HashSet
            java.lang.String r0 = "*"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.<init>(r0)
            java.lang.String r0 = "omidJsSessionService"
            androidx.webkit.WebViewCompat.addWebMessageListener(r3, r0, r4, r2)
            return
        L3d:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "The JavaScriptSessionService cannot be supported in this WebView version."
            r2.<init>(r3)
            throw r2
    }

    public static com.google.android.gms.internal.ads.zzfot zza(com.google.android.gms.internal.ads.zzfov r1, android.webkit.WebView r2, boolean r3) {
            com.google.android.gms.internal.ads.zzfot r3 = new com.google.android.gms.internal.ads.zzfot
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzfot r1, java.lang.String r2) {
            java.util.HashMap r0 = r1.zzc
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzfoi r0 = (com.google.android.gms.internal.ads.zzfoi) r0
            if (r0 == 0) goto L12
            r0.zzc()
            java.util.HashMap r1 = r1.zzc
            r1.remove(r2)
        L12:
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfot r0) {
            r0.zzg()
            return
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfot r5, java.lang.String r6) {
            com.google.android.gms.internal.ads.zzfom r0 = new com.google.android.gms.internal.ads.zzfom
            com.google.android.gms.internal.ads.zzfon r1 = com.google.android.gms.internal.ads.zzfon.zza
            com.google.android.gms.internal.ads.zzfoq r2 = com.google.android.gms.internal.ads.zzfoq.zza
            com.google.android.gms.internal.ads.zzfou r3 = com.google.android.gms.internal.ads.zzfou.zzb
            r4 = 0
            com.google.android.gms.internal.ads.zzfoj r1 = com.google.android.gms.internal.ads.zzfoj.zza(r1, r2, r3, r3, r4)
            com.google.android.gms.internal.ads.zzfov r2 = r5.zza
            android.webkit.WebView r3 = r5.zzb
            r4 = 0
            com.google.android.gms.internal.ads.zzfok r2 = com.google.android.gms.internal.ads.zzfok.zzb(r2, r3, r4, r4)
            r0.<init>(r1, r2, r6)
            java.util.HashMap r1 = r5.zzc
            r1.put(r6, r0)
            android.webkit.WebView r6 = r5.zzb
            r0.zzd(r6)
            com.google.android.gms.internal.ads.zzfph r5 = r5.zzd
            java.util.List r5 = r5.zza()
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r6 = r5.next()
            com.google.android.gms.internal.ads.zzfpg r6 = (com.google.android.gms.internal.ads.zzfpg) r6
            com.google.android.gms.internal.ads.zzfqs r1 = r6.zzb()
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            com.google.android.gms.internal.ads.zzfop r2 = r6.zza()
            java.lang.String r6 = r6.zzc()
            r0.zzb(r1, r2, r6)
            goto L2d
        L4f:
            r0.zze()
            return
    }

    private final void zzg() {
            r2 = this;
            android.webkit.WebView r0 = r2.zzb
            java.lang.String r1 = "omidJsSessionService"
            androidx.webkit.WebViewCompat.removeWebMessageListener(r0, r1)
            return
    }

    public final void zze(android.view.View r3, com.google.android.gms.internal.ads.zzfop r4, java.lang.String r5) {
            r2 = this;
            java.util.HashMap r5 = r2.zzc
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        La:
            boolean r0 = r5.hasNext()
            java.lang.String r1 = "Ad overlay"
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.ads.zzfoi r0 = (com.google.android.gms.internal.ads.zzfoi) r0
            r0.zzb(r3, r4, r1)
            goto La
        L1c:
            com.google.android.gms.internal.ads.zzfph r5 = r2.zzd
            r5.zzb(r3, r4, r1)
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcgd r5) {
            r4 = this;
            java.util.HashMap r0 = r4.zzc
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfoi r1 = (com.google.android.gms.internal.ads.zzfoi) r1
            r1.zzc()
            goto La
        L1a:
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.google.android.gms.internal.ads.zzfor r1 = new com.google.android.gms.internal.ads.zzfor
            r1.<init>(r4, r5, r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.schedule(r1, r2)
            return
    }
}
