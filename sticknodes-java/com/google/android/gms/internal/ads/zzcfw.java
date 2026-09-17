package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzcfw extends android.webkit.WebViewClient implements com.google.android.gms.internal.ads.zzchg {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final java.util.HashSet zzD;
    private final com.google.android.gms.internal.ads.zzefj zzE;
    private android.view.View.OnAttachStateChangeListener zzF;
    protected com.google.android.gms.internal.ads.zzbyk zza;
    private final com.google.android.gms.internal.ads.zzcfo zzc;
    private final com.google.android.gms.internal.ads.zzbbu zzd;
    private final java.util.HashMap zze;
    private final java.lang.Object zzf;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private com.google.android.gms.internal.ads.zzche zzi;
    private com.google.android.gms.internal.ads.zzchf zzj;
    private com.google.android.gms.internal.ads.zzbim zzk;
    private com.google.android.gms.internal.ads.zzbio zzl;
    private com.google.android.gms.internal.ads.zzdga zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private java.lang.String zzq;
    private java.lang.String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzac zzv;
    private com.google.android.gms.internal.ads.zzbso zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private com.google.android.gms.internal.ads.zzbsj zzy;
    private boolean zzz;

    public zzcfw(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzbbu r2, boolean r3, com.google.android.gms.internal.ads.zzbso r4, com.google.android.gms.internal.ads.zzbsj r5, com.google.android.gms.internal.ads.zzefj r6) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.zze = r5
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r0.zzf = r5
            r5 = 0
            r0.zzp = r5
            java.lang.String r5 = ""
            r0.zzq = r5
            r0.zzr = r5
            r0.zzd = r2
            r0.zzc = r1
            r0.zzs = r3
            r0.zzw = r4
            r1 = 0
            r0.zzy = r1
            java.util.HashSet r1 = new java.util.HashSet
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzfx
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r0.zzD = r1
            r0.zzE = r6
            return
    }

    private static android.webkit.WebResourceResponse zzT() {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r2 = 0
            byte[] r2 = new byte[r2]
            r1.<init>(r2)
            java.lang.String r2 = ""
            r0.<init>(r2, r2, r1)
            return r0
        L22:
            r0 = 0
            return r0
    }

    private final android.webkit.WebResourceResponse zzU(java.lang.String r13, java.util.Map r14) throws java.io.IOException {
            r12 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r13)
            r13 = 264(0x108, float:3.7E-43)
            android.net.TrafficStats.setThreadStatsTag(r13)     // Catch: java.lang.Throwable -> L1cc
            r13 = 0
            r1 = 0
        Lc:
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            if (r1 > r3) goto L1c1
            java.net.URLConnection r3 = r0.openConnection()     // Catch: java.lang.Throwable -> L1cc
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L1cc
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L1cc
            java.util.Set r4 = r14.entrySet()     // Catch: java.lang.Throwable -> L1cc
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L1cc
        L26:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L1cc
            if (r5 == 0) goto L42
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L1cc
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1cc
            r3.addRequestProperty(r6, r5)     // Catch: java.lang.Throwable -> L1cc
            goto L26
        L42:
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L1cc
            if (r4 == 0) goto L1b9
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.ads.internal.util.zzt r5 = com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.internal.ads.zzcfo r4 = r12.zzc     // Catch: java.lang.Throwable -> L1cc
            android.content.Context r6 = r4.getContext()     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.internal.ads.zzcfo r4 = r12.zzc     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r4.zzn()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r7 = r4.afmaVersion     // Catch: java.lang.Throwable -> L1cc
            r8 = 0
            r10 = 0
            r11 = 60000(0xea60, float:8.4078E-41)
            r9 = r3
            r5.zzf(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.ads.internal.util.client.zzl r4 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch: java.lang.Throwable -> L1cc
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1cc
            r4.zzc(r3, r5)     // Catch: java.lang.Throwable -> L1cc
            int r6 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L1cc
            r4.zze(r3, r6)     // Catch: java.lang.Throwable -> L1cc
            r4 = 300(0x12c, float:4.2E-43)
            if (r6 < r4) goto Lef
            r4 = 400(0x190, float:5.6E-43)
            if (r6 >= r4) goto Lef
            java.lang.String r2 = "Location"
            java.lang.String r2 = r3.getHeaderField(r2)     // Catch: java.lang.Throwable -> L1cc
            if (r2 == 0) goto Le7
            java.lang.String r4 = "tel:"
            boolean r4 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L1cc
            if (r4 == 0) goto L8d
            goto L1b5
        L8d:
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L1cc
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = r4.getProtocol()     // Catch: java.lang.Throwable -> L1cc
            if (r0 != 0) goto La3
            java.lang.String r13 = "Protocol is null"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r13)     // Catch: java.lang.Throwable -> L1cc
            android.webkit.WebResourceResponse r5 = zzT()     // Catch: java.lang.Throwable -> L1cc
            goto L1b5
        La3:
            java.lang.String r5 = "http"
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L1cc
            if (r5 != 0) goto Lcd
            java.lang.String r5 = "https"
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L1cc
            if (r5 != 0) goto Lcd
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cc
            r13.<init>()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r14 = "Unsupported scheme: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L1cc
            r13.append(r0)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r13)     // Catch: java.lang.Throwable -> L1cc
            android.webkit.WebResourceResponse r5 = zzT()     // Catch: java.lang.Throwable -> L1cc
            goto L1b5
        Lcd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cc
            r0.<init>()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r5 = "Redirecting to "
            r0.append(r5)     // Catch: java.lang.Throwable -> L1cc
            r0.append(r2)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L1cc
            r3.disconnect()     // Catch: java.lang.Throwable -> L1cc
            r0 = r4
            goto Lc
        Le7:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r14 = "Missing Location header in redirect"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L1cc
            throw r13     // Catch: java.lang.Throwable -> L1cc
        Lef:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L1cc
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r14 = r3.getContentType()     // Catch: java.lang.Throwable -> L1cc
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r1 = ";"
            java.lang.String r4 = ""
            if (r0 == 0) goto L105
            r6 = r4
            goto L110
        L105:
            java.lang.String[] r14 = r14.split(r1)     // Catch: java.lang.Throwable -> L1cc
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r14 = r14.trim()     // Catch: java.lang.Throwable -> L1cc
            r6 = r14
        L110:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r14 = r3.getContentType()     // Catch: java.lang.Throwable -> L1cc
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L1cc
            if (r0 == 0) goto L11f
        L11d:
            r7 = r4
            goto L152
        L11f:
            java.lang.String[] r14 = r14.split(r1)     // Catch: java.lang.Throwable -> L1cc
            int r0 = r14.length     // Catch: java.lang.Throwable -> L1cc
            if (r0 != r2) goto L127
            goto L11d
        L127:
            r0 = 1
        L128:
            int r1 = r14.length     // Catch: java.lang.Throwable -> L1cc
            if (r0 >= r1) goto L11d
            r1 = r14[r0]     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r5 = "charset"
            boolean r1 = r1.startsWith(r5)     // Catch: java.lang.Throwable -> L1cc
            if (r1 == 0) goto L14f
            r1 = r14[r0]     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L1cc
            int r5 = r1.length     // Catch: java.lang.Throwable -> L1cc
            if (r5 <= r2) goto L14f
            r14 = r1[r2]     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r4 = r14.trim()     // Catch: java.lang.Throwable -> L1cc
            goto L11d
        L14f:
            int r0 = r0 + 1
            goto L128
        L152:
            java.util.Map r14 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L1cc
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1cc
            int r0 = r14.size()     // Catch: java.lang.Throwable -> L1cc
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L1cc
            java.util.Set r14 = r14.entrySet()     // Catch: java.lang.Throwable -> L1cc
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L1cc
        L167:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L1cc
            if (r0 == 0) goto L1a1
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L1cc
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L1cc
            if (r1 == 0) goto L167
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L1cc
            if (r1 == 0) goto L167
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L1cc
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1cc
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1cc
            if (r1 != 0) goto L167
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L1cc
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r0 = r0.get(r13)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1cc
            r10.put(r1, r0)     // Catch: java.lang.Throwable -> L1cc
            goto L167
        L1a1:
            com.google.android.gms.ads.internal.util.zzab r5 = com.google.android.gms.ads.internal.zzu.zzq()     // Catch: java.lang.Throwable -> L1cc
            int r8 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r9 = r3.getResponseMessage()     // Catch: java.lang.Throwable -> L1cc
            java.io.InputStream r11 = r3.getInputStream()     // Catch: java.lang.Throwable -> L1cc
            android.webkit.WebResourceResponse r5 = r5.zzb(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1cc
        L1b5:
            android.net.TrafficStats.clearThreadStatsTag()
            return r5
        L1b9:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r14 = "Invalid protocol."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L1cc
            throw r13     // Catch: java.lang.Throwable -> L1cc
        L1c1:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Too many redirects (20)"
            r13.<init>(r14)
            throw r13
        L1cc:
            r13 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r13
    }

    private final void zzV(java.util.Map r5, java.util.List r6, java.lang.String r7) {
            r4 = this;
            boolean r0 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r0 == 0) goto L46
            java.lang.String r0 = "Received GMSG: "
            java.lang.String r7 = r0.concat(r7)
            com.google.android.gms.ads.internal.util.zze.zza(r7)
            java.util.Set r7 = r5.keySet()
            java.util.Iterator r7 = r7.iterator()
        L17:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto L17
        L46:
            java.util.Iterator r6 = r6.iterator()
        L4a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.ads.zzbjw r7 = (com.google.android.gms.internal.ads.zzbjw) r7
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zzc
            r7.zza(r0, r5)
            goto L4a
        L5c:
            return
    }

    private final void zzW() {
            r2 = this;
            android.view.View$OnAttachStateChangeListener r0 = r2.zzF
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzc
            android.view.View r1 = (android.view.View) r1
            r1.removeOnAttachStateChangeListener(r0)
            return
    }

    private final void zzX(android.view.View r3, com.google.android.gms.internal.ads.zzbyk r4, int r5) {
            r2 = this;
            boolean r0 = r4.zzi()
            if (r0 == 0) goto L1d
            if (r5 <= 0) goto L1d
            r4.zzg(r3)
            boolean r0 = r4.zzi()
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcfp r1 = new com.google.android.gms.internal.ads.zzcfp
            r1.<init>(r2, r3, r4, r5)
            r3 = 100
            r0.postDelayed(r1, r3)
        L1d:
            return
    }

    private static final boolean zzY(com.google.android.gms.internal.ads.zzcfo r1) {
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zzD()
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzfgh r1 = r1.zzD()
            boolean r1 = r1.zzai
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private static final boolean zzZ(boolean r0, com.google.android.gms.internal.ads.zzcfo r1) {
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzchi r0 = r1.zzO()
            boolean r0 = r0.zzi()
            if (r0 != 0) goto L1a
            java.lang.String r0 = r1.zzU()
            java.lang.String r1 = "interstitial_mb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcfw r0, java.util.Map r1, java.util.List r2, java.lang.String r3) {
            r0.zzV(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcfw r0, android.view.View r1, com.google.android.gms.internal.ads.zzbyk r2, int r3) {
            r3 = 10
            r0.zzX(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zza r0 = r1.zzg
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Loading resource: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            android.net.Uri r2 = android.net.Uri.parse(r3)
            java.lang.String r3 = r2.getScheme()
            java.lang.String r0 = "gmsg"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L2c
            java.lang.String r3 = r2.getHost()
            java.lang.String r0 = "mobileads.google.com"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L2c
            r1.zzj(r2)
        L2c:
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r2 = r1.zzf
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.zzaE()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L17
            java.lang.String r3 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r3)     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzc     // Catch: java.lang.Throwable -> L4c
            r3.zzX()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            return
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = 1
            r1.zzz = r2
            com.google.android.gms.internal.ads.zzchf r2 = r1.zzj
            if (r2 == 0) goto L25
            r2.zza()
            r2 = 0
            r1.zzj = r2
        L25:
            r1.zzg()
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzm r2 = r2.zzL()
            if (r2 == 0) goto L4b
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzlx
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzm r2 = r2.zzL()
            r2.zzG(r3)
        L4b:
            return
        L4c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r3
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r1 = 1
            r0.zzo = r1
            r0.zzp = r2
            r0.zzq = r3
            r0.zzr = r4
            return
    }

    @Override // android.webkit.WebViewClient
    @android.annotation.TargetApi(26)
    public final boolean onRenderProcessGone(android.webkit.WebView r2, android.webkit.RenderProcessGoneDetail r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zzc
            boolean r0 = r3.didCrash()
            int r3 = r3.rendererPriorityAtExit()
            boolean r2 = r2.zzaD(r0, r3)
            return r2
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            java.util.Map r1 = java.util.Collections.emptyMap()
            android.webkit.WebResourceResponse r1 = r0.zzc(r2, r1)
            return r1
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView r1, android.view.KeyEvent r2) {
            r0 = this;
            int r1 = r2.getKeyCode()
            r2 = 79
            if (r1 == r2) goto L14
            r2 = 222(0xde, float:3.11E-43)
            if (r1 == r2) goto L14
            switch(r1) {
                case 85: goto L14;
                case 86: goto L14;
                case 87: goto L14;
                case 88: goto L14;
                case 89: goto L14;
                case 90: goto L14;
                case 91: goto L14;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 126: goto L14;
                case 127: goto L14;
                case 128: goto L14;
                case 129: goto L14;
                case 130: goto L14;
                default: goto L12;
            }
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r13, java.lang.String r14) {
            r12 = this;
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "AdWebView shouldOverrideUrlLoading: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.net.Uri r0 = android.net.Uri.parse(r14)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "gmsg"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 == 0) goto L2f
            java.lang.String r1 = r0.getHost()
            java.lang.String r3 = "mobileads.google.com"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L2f
            r12.zzj(r0)
            goto L110
        L2f:
            boolean r1 = r12.zzn
            if (r1 == 0) goto L6e
            com.google.android.gms.internal.ads.zzcfo r1 = r12.zzc
            android.webkit.WebView r1 = r1.zzG()
            if (r13 != r1) goto L6e
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "http"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L4f
            java.lang.String r3 = "https"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L6e
        L4f:
            com.google.android.gms.ads.internal.client.zza r0 = r12.zzg
            r1 = 0
            if (r0 == 0) goto L60
            r0.onAdClicked()
            com.google.android.gms.internal.ads.zzbyk r0 = r12.zza
            if (r0 == 0) goto L5e
            r0.zzh(r14)
        L5e:
            r12.zzg = r1
        L60:
            com.google.android.gms.internal.ads.zzdga r0 = r12.zzm
            if (r0 == 0) goto L69
            r0.zzdG()
            r12.zzm = r1
        L69:
            boolean r13 = super.shouldOverrideUrlLoading(r13, r14)
            return r13
        L6e:
            com.google.android.gms.internal.ads.zzcfo r13 = r12.zzc
            android.webkit.WebView r13 = r13.zzG()
            boolean r13 = r13.willNotDraw()
            if (r13 != 0) goto L103
            com.google.android.gms.internal.ads.zzcfo r13 = r12.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzavn r13 = r13.zzI()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzcfo r1 = r12.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzfhg r1 = r1.zzS()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzlC     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            java.lang.Object r3 = r4.zza(r3)     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            boolean r3 = r3.booleanValue()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            if (r3 == 0) goto Lb5
            if (r1 == 0) goto Lb5
            if (r13 == 0) goto Ldd
            boolean r13 = r13.zzf(r0)     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            if (r13 == 0) goto Ldd
            com.google.android.gms.internal.ads.zzcfo r13 = r12.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.content.Context r13 = r13.getContext()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzcfo r3 = r12.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.app.Activity r4 = r3.zzi()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.view.View r3 = (android.view.View) r3     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.net.Uri r0 = r1.zza(r0, r13, r3, r4)     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            goto Ldd
        Lb5:
            if (r13 == 0) goto Ldd
            boolean r1 = r13.zzf(r0)     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            if (r1 == 0) goto Ldd
            com.google.android.gms.internal.ads.zzcfo r1 = r12.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.content.Context r1 = r1.getContext()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            com.google.android.gms.internal.ads.zzcfo r3 = r12.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.app.Activity r4 = r3.zzi()     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.view.View r3 = (android.view.View) r3     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            android.net.Uri r0 = r13.zza(r0, r1, r3, r4)     // Catch: com.google.android.gms.internal.ads.zzavo -> Ld0
            goto Ldd
        Ld0:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Unable to append parameter to URL: "
            java.lang.String r13 = r1.concat(r13)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r13)
        Ldd:
            com.google.android.gms.ads.internal.zzb r13 = r12.zzx
            if (r13 == 0) goto Lec
            boolean r1 = r13.zzc()
            if (r1 == 0) goto Le8
            goto Lec
        Le8:
            r13.zzb(r14)
            goto L110
        Lec:
            com.google.android.gms.ads.internal.overlay.zzc r13 = new com.google.android.gms.ads.internal.overlay.zzc
            java.lang.String r5 = r0.toString()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r4 = "android.intent.action.VIEW"
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r14 = 0
            r12.zzu(r13, r2, r14)
            goto L110
        L103:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r14 = "AdWebView unable to handle URL: "
            java.lang.String r13 = r14.concat(r13)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r13)
        L110:
            return r2
    }

    public final void zzA(java.lang.String r4, com.google.android.gms.internal.ads.zzbjw r5) {
            r3 = this;
            java.lang.Object r0 = r3.zzf
            monitor-enter(r0)
            java.util.HashMap r1 = r3.zze     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1c
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L17
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r2 = r3.zze     // Catch: java.lang.Throwable -> L1c
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L1c
        L17:
            r1.add(r5)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzB(com.google.android.gms.internal.ads.zzche r1) {
            r0 = this;
            r0.zzi = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzC(int r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbsj r0 = r1.zzy
            if (r0 == 0) goto L7
            r0.zze(r2, r3)
        L7:
            return
    }

    public final void zzD(boolean r1) {
            r0 = this;
            r1 = 0
            r0.zzn = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzE(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzf
            monitor-enter(r0)
            r1.zzu = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzF() {
            r3 = this;
            java.lang.Object r0 = r3.zzf
            monitor-enter(r0)
            r1 = 0
            r3.zzn = r1     // Catch: java.lang.Throwable -> L15
            r1 = 1
            r3.zzs = r1     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzcfq r2 = new com.google.android.gms.internal.ads.zzcfq     // Catch: java.lang.Throwable -> L15
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L15
            r1.execute(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzG(boolean r2) {
            r1 = this;
            java.lang.Object r2 = r1.zzf
            monitor-enter(r2)
            r0 = 1
            r1.zzt = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzH(com.google.android.gms.internal.ads.zzchf r1) {
            r0 = this;
            r0.zzj = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzI(com.google.android.gms.internal.ads.zzcop r4, com.google.android.gms.internal.ads.zzeey r5, com.google.android.gms.internal.ads.zzfng r6) {
            r3 = this;
            java.lang.String r0 = "/click"
            r3.zzM(r0)
            if (r5 == 0) goto L14
            if (r6 == 0) goto L14
            com.google.android.gms.internal.ads.zzdga r1 = r3.zzm
            com.google.android.gms.internal.ads.zzfhk r2 = new com.google.android.gms.internal.ads.zzfhk
            r2.<init>(r1, r4, r6, r5)
            r3.zzA(r0, r2)
            return
        L14:
            com.google.android.gms.internal.ads.zzdga r5 = r3.zzm
            com.google.android.gms.internal.ads.zzbiu r6 = new com.google.android.gms.internal.ads.zzbiu
            r6.<init>(r5, r4)
            r3.zzA(r0, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzJ(com.google.android.gms.internal.ads.zzcop r4) {
            r3 = this;
            java.lang.String r0 = "/click"
            r3.zzM(r0)
            com.google.android.gms.internal.ads.zzdga r1 = r3.zzm
            com.google.android.gms.internal.ads.zzbiu r2 = new com.google.android.gms.internal.ads.zzbiu
            r2.<init>(r1, r4)
            r3.zzA(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzK(com.google.android.gms.internal.ads.zzcop r9, com.google.android.gms.internal.ads.zzeey r10, com.google.android.gms.internal.ads.zzdud r11) {
            r8 = this;
            java.lang.String r0 = "/open"
            r8.zzM(r0)
            com.google.android.gms.internal.ads.zzbki r7 = new com.google.android.gms.internal.ads.zzbki
            com.google.android.gms.ads.internal.zzb r2 = r8.zzx
            com.google.android.gms.internal.ads.zzbsj r3 = r8.zzy
            r1 = r7
            r4 = r10
            r5 = r11
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8.zzA(r0, r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzL(com.google.android.gms.internal.ads.zzfgh r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzc
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            android.content.Context r0 = r0.getContext()
            boolean r0 = r1.zzp(r0)
            if (r0 == 0) goto L2a
            java.lang.String r0 = "/logScionEvent"
            r3.zzM(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r4 = r4.zzaw
            com.google.android.gms.internal.ads.zzcfo r1 = r3.zzc
            com.google.android.gms.internal.ads.zzbkc r2 = new com.google.android.gms.internal.ads.zzbkc
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1, r4)
            r3.zzA(r0, r2)
        L2a:
            return
    }

    public final void zzM(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            java.util.HashMap r1 = r2.zze     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L14
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        Lf:
            r3.clear()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public final void zzN(java.lang.String r3, com.google.android.gms.internal.ads.zzbjw r4) {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            java.util.HashMap r1 = r2.zze     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L14
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        Lf:
            r3.remove(r4)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public final void zzO(java.lang.String r6, com.google.android.gms.common.util.Predicate r7) {
            r5 = this;
            java.lang.Object r0 = r5.zzf
            monitor-enter(r0)
            java.util.HashMap r1 = r5.zze     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L33
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L33
            if (r6 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        Lf:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L33
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbjw r3 = (com.google.android.gms.internal.ads.zzbjw) r3     // Catch: java.lang.Throwable -> L33
            boolean r4 = r7.apply(r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L18
            r1.add(r3)     // Catch: java.lang.Throwable -> L33
            goto L18
        L2e:
            r6.removeAll(r1)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r6
    }

    public final boolean zzP() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            boolean r1 = r2.zzu     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final boolean zzQ() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            boolean r1 = r2.zzs     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final boolean zzR() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            boolean r1 = r2.zzt     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzS(com.google.android.gms.ads.internal.client.zza r18, com.google.android.gms.internal.ads.zzbim r19, com.google.android.gms.ads.internal.overlay.zzr r20, com.google.android.gms.internal.ads.zzbio r21, com.google.android.gms.ads.internal.overlay.zzac r22, boolean r23, com.google.android.gms.internal.ads.zzbjz r24, com.google.android.gms.ads.internal.zzb r25, com.google.android.gms.internal.ads.zzbsq r26, com.google.android.gms.internal.ads.zzbyk r27, com.google.android.gms.internal.ads.zzeey r28, com.google.android.gms.internal.ads.zzfng r29, com.google.android.gms.internal.ads.zzdud r30, com.google.android.gms.internal.ads.zzbkq r31, com.google.android.gms.internal.ads.zzdga r32, com.google.android.gms.internal.ads.zzbkp r33, com.google.android.gms.internal.ads.zzbkj r34, com.google.android.gms.internal.ads.zzbjx r35, com.google.android.gms.internal.ads.zzcop r36) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r24
            r4 = r26
            r5 = r27
            r10 = r28
            r11 = r29
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r9 = r35
            r8 = r36
            if (r25 != 0) goto L2c
            com.google.android.gms.internal.ads.zzcfo r6 = r0.zzc
            com.google.android.gms.ads.internal.zzb r7 = new com.google.android.gms.ads.internal.zzb
            android.content.Context r6 = r6.getContext()
            r8 = 0
            r7.<init>(r6, r5, r8)
            r8 = r7
            goto L2e
        L2c:
            r8 = r25
        L2e:
            com.google.android.gms.internal.ads.zzcfo r6 = r0.zzc
            com.google.android.gms.internal.ads.zzbsj r7 = new com.google.android.gms.internal.ads.zzbsj
            r7.<init>(r6, r4)
            r0.zzy = r7
            r0.zza = r5
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaV
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L55
            com.google.android.gms.internal.ads.zzbil r5 = new com.google.android.gms.internal.ads.zzbil
            r5.<init>(r1)
            java.lang.String r6 = "/adMetadata"
            r0.zzA(r6, r5)
        L55:
            if (r2 == 0) goto L61
            com.google.android.gms.internal.ads.zzbin r5 = new com.google.android.gms.internal.ads.zzbin
            r5.<init>(r2)
            java.lang.String r6 = "/appEvent"
            r0.zzA(r6, r5)
        L61:
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzj
            java.lang.String r6 = "/backButton"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzk
            java.lang.String r6 = "/refresh"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzb
            java.lang.String r6 = "/canOpenApp"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zza
            java.lang.String r6 = "/canOpenURLs"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzc
            java.lang.String r6 = "/canOpenIntents"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzd
            java.lang.String r6 = "/close"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zze
            java.lang.String r6 = "/customClose"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzn
            java.lang.String r6 = "/instrument"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzp
            java.lang.String r6 = "/delayPageLoaded"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzq
            java.lang.String r6 = "/delayPageClosed"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzr
            java.lang.String r6 = "/getLocationInfo"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbjw r5 = com.google.android.gms.internal.ads.zzbjv.zzg
            java.lang.String r6 = "/log"
            r0.zzA(r6, r5)
            com.google.android.gms.internal.ads.zzbkd r5 = new com.google.android.gms.internal.ads.zzbkd
            com.google.android.gms.internal.ads.zzbsj r6 = r0.zzy
            r5.<init>(r8, r6, r4)
            java.lang.String r4 = "/mraid"
            r0.zzA(r4, r5)
            com.google.android.gms.internal.ads.zzbso r4 = r0.zzw
            if (r4 == 0) goto Lca
            java.lang.String r5 = "/mraidLoaded"
            r0.zzA(r5, r4)
        Lca:
            com.google.android.gms.internal.ads.zzbki r7 = new com.google.android.gms.internal.ads.zzbki
            com.google.android.gms.internal.ads.zzbsj r6 = r0.zzy
            r4 = r7
            r5 = r8
            r2 = r7
            r7 = r28
            r1 = r36
            r16 = r8
            r8 = r30
            r9 = r36
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r4 = "/open"
            r0.zzA(r4, r2)
            com.google.android.gms.internal.ads.zzcdw r2 = new com.google.android.gms.internal.ads.zzcdw
            r2.<init>()
            java.lang.String r4 = "/precache"
            r0.zzA(r4, r2)
            com.google.android.gms.internal.ads.zzbjw r2 = com.google.android.gms.internal.ads.zzbjv.zzi
            java.lang.String r4 = "/touch"
            r0.zzA(r4, r2)
            com.google.android.gms.internal.ads.zzbjw r2 = com.google.android.gms.internal.ads.zzbjv.zzl
            java.lang.String r4 = "/video"
            r0.zzA(r4, r2)
            com.google.android.gms.internal.ads.zzbjw r2 = com.google.android.gms.internal.ads.zzbjv.zzm
            java.lang.String r4 = "/videoMeta"
            r0.zzA(r4, r2)
            java.lang.String r2 = "/httpTrack"
            java.lang.String r4 = "/click"
            if (r10 == 0) goto L11b
            if (r11 == 0) goto L11b
            com.google.android.gms.internal.ads.zzfhk r5 = new com.google.android.gms.internal.ads.zzfhk
            r5.<init>(r13, r1, r11, r10)
            r0.zzA(r4, r5)
            com.google.android.gms.internal.ads.zzfhl r1 = new com.google.android.gms.internal.ads.zzfhl
            r1.<init>(r11, r10)
            r0.zzA(r2, r1)
            goto L128
        L11b:
            com.google.android.gms.internal.ads.zzbiu r5 = new com.google.android.gms.internal.ads.zzbiu
            r5.<init>(r13, r1)
            r0.zzA(r4, r5)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzf
            r0.zzA(r2, r1)
        L128:
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            com.google.android.gms.internal.ads.zzbyz r2 = com.google.android.gms.ads.internal.zzu.zzn()
            android.content.Context r1 = r1.getContext()
            boolean r1 = r2.zzp(r1)
            if (r1 == 0) goto L15d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzcfo r2 = r0.zzc
            com.google.android.gms.internal.ads.zzfgh r2 = r2.zzD()
            if (r2 == 0) goto L14d
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            com.google.android.gms.internal.ads.zzfgh r1 = r1.zzD()
            java.util.Map r1 = r1.zzaw
        L14d:
            com.google.android.gms.internal.ads.zzcfo r2 = r0.zzc
            com.google.android.gms.internal.ads.zzbkc r4 = new com.google.android.gms.internal.ads.zzbkc
            android.content.Context r2 = r2.getContext()
            r4.<init>(r2, r1)
            java.lang.String r1 = "/logScionEvent"
            r0.zzA(r1, r4)
        L15d:
            if (r3 == 0) goto L169
            com.google.android.gms.internal.ads.zzbjy r1 = new com.google.android.gms.internal.ads.zzbjy
            r1.<init>(r3)
            java.lang.String r2 = "/setInterstitialProperties"
            r0.zzA(r2, r1)
        L169:
            if (r12 == 0) goto L182
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L182
            java.lang.String r1 = "/inspectorNetworkExtras"
            r0.zzA(r1, r12)
        L182:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziQ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L19b
            if (r14 == 0) goto L19b
            java.lang.String r1 = "/shareSheet"
            r0.zzA(r1, r14)
        L19b:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziV
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1b4
            if (r15 == 0) goto L1b4
            java.lang.String r1 = "/inspectorOutOfContextTest"
            r0.zzA(r1, r15)
        L1b4:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziZ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1cf
            r1 = r35
            if (r1 == 0) goto L1cf
            java.lang.String r2 = "/inspectorStorage"
            r0.zzA(r2, r1)
        L1cf:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzlf
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L204
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzu
            java.lang.String r2 = "/bindPlayStoreOverlay"
            r0.zzA(r2, r1)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzv
            java.lang.String r2 = "/presentPlayStoreOverlay"
            r0.zzA(r2, r1)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzw
            java.lang.String r2 = "/expandPlayStoreOverlay"
            r0.zzA(r2, r1)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzx
            java.lang.String r2 = "/collapsePlayStoreOverlay"
            r0.zzA(r2, r1)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzy
            java.lang.String r2 = "/closePlayStoreOverlay"
            r0.zzA(r2, r1)
        L204:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdk
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L224
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzA
            java.lang.String r2 = "/setPAIDPersonalizationEnabled"
            r0.zzA(r2, r1)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzz
            java.lang.String r2 = "/resetPAID"
            r0.zzA(r2, r1)
        L224:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzlw
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L254
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            com.google.android.gms.internal.ads.zzfgh r2 = r1.zzD()
            if (r2 == 0) goto L254
            com.google.android.gms.internal.ads.zzfgh r1 = r1.zzD()
            boolean r1 = r1.zzar
            if (r1 == 0) goto L254
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzB
            java.lang.String r2 = "/writeToLocalStorage"
            r0.zzA(r2, r1)
            com.google.android.gms.internal.ads.zzbjw r1 = com.google.android.gms.internal.ads.zzbjv.zzC
            java.lang.String r2 = "/clearLocalStorageKeys"
            r0.zzA(r2, r1)
        L254:
            r1 = r18
            r0.zzg = r1
            r1 = r20
            r0.zzh = r1
            r1 = r19
            r0.zzk = r1
            r1 = r21
            r0.zzl = r1
            r1 = r22
            r0.zzv = r1
            r7 = r16
            r0.zzx = r7
            r0.zzm = r13
            r1 = r23
            r0.zzn = r1
            return
    }

    public final android.view.ViewTreeObserver.OnGlobalLayoutListener zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            r0 = 0
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    public final android.view.ViewTreeObserver.OnScrollChangedListener zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            r0 = 0
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    protected final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "AdWebViewClient.interceptRequest.gcache"
            java.lang.String r0 = "range"
            java.lang.String r4 = "ms"
            java.lang.String r5 = "Cache connection took "
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.<init>()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfo r7 = r1.zzc     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzfgh r7 = r7.zzD()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r7 == 0) goto L21
            com.google.android.gms.internal.ads.zzcfo r6 = r1.zzc     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzfgh r6 = r6.zzD()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.util.Map r6 = r6.zzaw     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
        L21:
            com.google.android.gms.internal.ads.zzcfo r7 = r1.zzc     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r8 = r1.zzC     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbzb.zzc(r2, r7, r8, r6)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r7 = r6.equals(r2)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r7 != 0) goto L3a
            r7 = r20
            android.webkit.WebResourceResponse r0 = r1.zzU(r6, r7)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            return r0
        L3a:
            r7 = r20
            android.net.Uri r6 = android.net.Uri.parse(r19)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzbbg r6 = com.google.android.gms.internal.ads.zzbbg.zza(r6)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r6 == 0) goto L2a4
            java.util.HashMap r14 = new java.util.HashMap     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r14.<init>()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r9 = "Access-Control-Allow-Origin"
            java.lang.String r10 = "*"
            r14.put(r9, r10)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            android.net.Uri r9 = android.net.Uri.parse(r19)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.util.Set r10 = r9.getQueryParameterNames()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r10 = r10.contains(r0)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L97
            r10 = 45
            com.google.android.gms.internal.ads.zzfxn r10 = com.google.android.gms.internal.ads.zzfxn.zzc(r10)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzfym r10 = com.google.android.gms.internal.ads.zzfym.zzb(r10)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r0 = r9.getQueryParameter(r0)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.util.List r0 = r10.zze(r0)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            int r9 = r0.size()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r10 = 2
            if (r9 != r10) goto L97
            java.lang.Object r9 = r0.get(r11)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Object r0 = r0.get(r13)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            int r0 = r0 + r13
            if (r9 <= 0) goto L95
            long r11 = (long) r9     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.zzh = r11     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
        L95:
            int r0 = r0 - r9
            goto L98
        L97:
            r0 = -1
        L98:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzei     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Object r9 = r11.zza(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r9 = r9.booleanValue()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r11 = "X-Afma-Gcache-CachedBytes"
            java.lang.String r12 = "X-Afma-Gcache-IsDownloaded"
            java.lang.String r10 = "X-Afma-Gcache-IsGcacheHit"
            java.lang.String r15 = "X-Afma-Gcache-HasAdditionalMetadataFromReadV2"
            if (r9 == 0) goto L246
            com.google.android.gms.internal.ads.zzcfo r9 = r1.zzc     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r9 = r9.zzr()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfyo.zzc(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.zzi = r9     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfo r9 = r1.zzc     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            int r9 = r9.zzf()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.zzj = r9     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r9 = r6.zzg     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r9 == 0) goto Ld7
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzek     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Object r8 = r8.zza(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            goto Le3
        Ld7:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzej     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Object r8 = r9.zza(r8)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
        Le3:
            long r8 = r8.longValue()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r16 = r16.elapsedRealtime()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.ads.internal.zzu.zzd()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfo r13 = r1.zzc     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            android.content.Context r13 = r13.getContext()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzbbr.zza(r13, r6)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L179 java.lang.InterruptedException -> L17d java.util.concurrent.TimeoutException -> L1d0 java.util.concurrent.ExecutionException -> L1d2
            java.lang.Object r8 = r6.get(r8, r13)     // Catch: java.lang.Throwable -> L179 java.lang.InterruptedException -> L17d java.util.concurrent.TimeoutException -> L1d0 java.util.concurrent.ExecutionException -> L1d2
            com.google.android.gms.internal.ads.zzbbs r8 = (com.google.android.gms.internal.ads.zzbbs) r8     // Catch: java.lang.Throwable -> L179 java.lang.InterruptedException -> L17d java.util.concurrent.TimeoutException -> L1d0 java.util.concurrent.ExecutionException -> L1d2
            boolean r9 = r8.zzd()     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            r14.put(r15, r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            boolean r9 = r8.zzf()     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            r14.put(r10, r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            boolean r9 = r8.zze()     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            r14.put(r12, r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            long r9 = r8.zza()     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            r14.put(r11, r9)     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            java.io.InputStream r8 = r8.zzc()     // Catch: java.lang.Throwable -> L16b java.lang.InterruptedException -> L16f java.util.concurrent.TimeoutException -> L173 java.util.concurrent.ExecutionException -> L175
            r9 = -1
            if (r0 == r9) goto L143
            long r9 = (long) r0
            java.io.InputStream r8 = com.google.android.gms.internal.ads.zzgdh.zza(r8, r9)     // Catch: java.lang.InterruptedException -> L13d java.util.concurrent.TimeoutException -> L13f java.util.concurrent.ExecutionException -> L141 java.lang.Throwable -> L16b
            goto L143
        L13d:
            r0 = move-exception
            goto L171
        L13f:
            r0 = move-exception
            goto L177
        L141:
            r0 = move-exception
            goto L177
        L143:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r9 = r0.elapsedRealtime()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r9 = r9 - r16
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfs r3 = new com.google.android.gms.internal.ads.zzcfs     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6 = 1
            r3.<init>(r1, r6, r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.post(r3)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.<init>()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r4)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            goto L1ca
        L16b:
            r0 = move-exception
            r11 = 1
            goto L21c
        L16f:
            r0 = move-exception
            r8 = 0
        L171:
            r11 = 1
            goto L180
        L173:
            r0 = move-exception
            goto L176
        L175:
            r0 = move-exception
        L176:
            r8 = 0
        L177:
            r11 = 1
            goto L1d5
        L179:
            r0 = move-exception
            r11 = 0
            goto L21c
        L17d:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L180:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzen     // Catch: java.lang.Throwable -> L1ce
            com.google.android.gms.internal.ads.zzbct r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1ce
            java.lang.Object r9 = r10.zza(r9)     // Catch: java.lang.Throwable -> L1ce
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1ce
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1ce
            if (r9 == 0) goto L199
            com.google.android.gms.internal.ads.zzcad r9 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L1ce
            r9.zzw(r0, r3)     // Catch: java.lang.Throwable -> L1ce
        L199:
            r3 = 1
            r6.cancel(r3)     // Catch: java.lang.Throwable -> L1ce
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1ce
            r0.interrupt()     // Catch: java.lang.Throwable -> L1ce
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r9 = r0.elapsedRealtime()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r9 = r9 - r16
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfs r3 = new com.google.android.gms.internal.ads.zzcfs     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r3.<init>(r1, r11, r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.post(r3)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.<init>()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r4)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
        L1ca:
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            goto L219
        L1ce:
            r0 = move-exception
            goto L21c
        L1d0:
            r0 = move-exception
            goto L1d3
        L1d2:
            r0 = move-exception
        L1d3:
            r8 = 0
            r11 = 0
        L1d5:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzen     // Catch: java.lang.Throwable -> L1ce
            com.google.android.gms.internal.ads.zzbct r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1ce
            java.lang.Object r9 = r10.zza(r9)     // Catch: java.lang.Throwable -> L1ce
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1ce
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1ce
            if (r9 == 0) goto L1ee
            com.google.android.gms.internal.ads.zzcad r9 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L1ce
            r9.zzw(r0, r3)     // Catch: java.lang.Throwable -> L1ce
        L1ee:
            r3 = 1
            r6.cancel(r3)     // Catch: java.lang.Throwable -> L1ce
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r9 = r0.elapsedRealtime()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r9 = r9 - r16
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfs r3 = new com.google.android.gms.internal.ads.zzcfs     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r3.<init>(r1, r11, r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.post(r3)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.<init>()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r9)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r0.append(r4)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            goto L1ca
        L219:
            r15 = r8
            goto L293
        L21c:
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r2 = r2.elapsedRealtime()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r2 = r2 - r16
            com.google.android.gms.internal.ads.zzfun r6 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzcfs r7 = new com.google.android.gms.internal.ads.zzcfs     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r7.<init>(r1, r11, r2)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.post(r7)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.<init>()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.append(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.append(r2)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r6.append(r4)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r2 = r6.toString()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            throw r0     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
        L246:
            com.google.android.gms.internal.ads.zzbbc r4 = com.google.android.gms.ads.internal.zzu.zzc()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            com.google.android.gms.internal.ads.zzbbd r4 = r4.zzb(r6)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r4 == 0) goto L292
            boolean r5 = r4.zze()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r5 == 0) goto L292
            boolean r5 = r4.zzd()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r14.put(r15, r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r5 = r4.zzg()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r14.put(r10, r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r5 = r4.zzf()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r14.put(r12, r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            long r5 = r4.zza()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r14.put(r11, r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.io.InputStream r4 = r4.zzc()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r3 = -1
            if (r0 == r3) goto L290
            long r5 = (long) r0     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.io.InputStream r0 = com.google.android.gms.internal.ads.zzgdh.zza(r4, r5)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            r15 = r0
            goto L293
        L290:
            r15 = r4
            goto L293
        L292:
            r15 = 0
        L293:
            if (r15 == 0) goto L2a4
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r12 = 200(0xc8, float:2.8E-43)
            java.lang.String r13 = "OK"
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            return r0
        L2a4:
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzk()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r0 == 0) goto L2bd
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzben.zzb     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            boolean r0 = r0.booleanValue()     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            if (r0 == 0) goto L2bd
            android.webkit.WebResourceResponse r0 = r18.zzU(r19, r20)     // Catch: java.lang.NoClassDefFoundError -> L2bf java.lang.Exception -> L2c1
            return r0
        L2bd:
            r2 = 0
            return r2
        L2bf:
            r0 = move-exception
            goto L2c2
        L2c1:
            r0 = move-exception
        L2c2:
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r3 = "AdWebViewClient.interceptRequest"
            r2.zzw(r0, r3)
            android.webkit.WebResourceResponse r0 = zzT()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final com.google.android.gms.ads.internal.zzb zzd() {
            r1 = this;
            com.google.android.gms.ads.internal.zzb r0 = r1.zzx
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdga r0 = r1.zzm
            if (r0 == 0) goto L7
            r0.zzdG()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdga r0 = r1.zzm
            if (r0 == 0) goto L7
            r0.zzdf()
        L7:
            return
    }

    public final void zzg() {
            r5 = this;
            com.google.android.gms.internal.ads.zzche r0 = r5.zzi
            if (r0 == 0) goto L5f
            boolean r0 = r5.zzz
            if (r0 == 0) goto Lc
            int r0 = r5.zzB
            if (r0 <= 0) goto L14
        Lc:
            boolean r0 = r5.zzA
            if (r0 != 0) goto L14
            boolean r0 = r5.zzo
            if (r0 == 0) goto L5f
        L14:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzc
            com.google.android.gms.internal.ads.zzbdi r0 = r0.zzm()
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzc
            com.google.android.gms.internal.ads.zzbdi r0 = r0.zzm()
            com.google.android.gms.internal.ads.zzbdk r0 = r0.zza()
            com.google.android.gms.internal.ads.zzcfo r1 = r5.zzc
            com.google.android.gms.internal.ads.zzbdh r1 = r1.zzk()
            java.lang.String r2 = "awfllc"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.google.android.gms.internal.ads.zzbdc.zza(r0, r1, r2)
        L47:
            com.google.android.gms.internal.ads.zzche r0 = r5.zzi
            boolean r1 = r5.zzA
            r2 = 0
            if (r1 != 0) goto L53
            boolean r1 = r5.zzo
            if (r1 != 0) goto L53
            r2 = 1
        L53:
            int r1 = r5.zzp
            java.lang.String r3 = r5.zzq
            java.lang.String r4 = r5.zzr
            r0.zza(r2, r1, r3, r4)
            r0 = 0
            r5.zzi = r0
        L5f:
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zzc
            r0.zzaf()
            return
    }

    public final void zzh() {
            r4 = this;
            com.google.android.gms.internal.ads.zzbyk r0 = r4.zza
            r1 = 0
            if (r0 == 0) goto La
            r0.zze()
            r4.zza = r1
        La:
            r4.zzW()
            java.lang.Object r0 = r4.zzf
            monitor-enter(r0)
            java.util.HashMap r2 = r4.zze     // Catch: java.lang.Throwable -> L3a
            r2.clear()     // Catch: java.lang.Throwable -> L3a
            r4.zzg = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzh = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzi = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzj = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzk = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzl = r1     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            r4.zzn = r2     // Catch: java.lang.Throwable -> L3a
            r4.zzs = r2     // Catch: java.lang.Throwable -> L3a
            r4.zzt = r2     // Catch: java.lang.Throwable -> L3a
            r4.zzv = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzx = r1     // Catch: java.lang.Throwable -> L3a
            r4.zzw = r1     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzbsj r2 = r4.zzy     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L38
            r3 = 1
            r2.zza(r3)     // Catch: java.lang.Throwable -> L3a
            r4.zzy = r1     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    public final void zzi(boolean r1) {
            r0 = this;
            r0.zzC = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzj(android.net.Uri r6) {
            r5 = this;
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Received GMSG: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.util.HashMap r0 = r5.zze
            java.lang.String r1 = r6.getPath()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r1 == 0) goto L7b
            if (r0 != 0) goto L1e
            goto L7b
        L1e:
            java.lang.String r2 = r6.getEncodedQuery()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzfw
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L70
            java.util.HashSet r3 = r5.zzD
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L70
            if (r2 == 0) goto L70
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzfy
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = r2.length()
            if (r2 < r3) goto L70
            java.lang.String r2 = "Parsing gmsg query params on BG thread: "
            java.lang.String r2 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            com.google.android.gms.ads.internal.util.zzt r2 = com.google.android.gms.ads.internal.zzu.zzp()
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzb(r6)
            com.google.android.gms.internal.ads.zzcfu r3 = new com.google.android.gms.internal.ads.zzcfu
            r3.<init>(r5, r0, r1, r6)
            com.google.android.gms.internal.ads.zzgfz r6 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzgfo.zzr(r2, r3, r6)
            return
        L70:
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.Map r6 = com.google.android.gms.ads.internal.util.zzt.zzP(r6)
            r5.zzV(r6, r0, r1)
            return
        L7b:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "No GMSG handler found for GMSG: "
            java.lang.String r6 = r0.concat(r6)
            com.google.android.gms.ads.internal.util.zze.zza(r6)
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzgx
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lc1
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.internal.ads.zzbda r6 = r6.zzg()
            if (r6 != 0) goto La5
            goto Lc1
        La5:
            if (r1 == 0) goto Lb5
            int r6 = r1.length()
            r0 = 2
            if (r6 >= r0) goto Laf
            goto Lb5
        Laf:
            r6 = 1
            java.lang.String r6 = r1.substring(r6)
            goto Lb7
        Lb5:
            java.lang.String r6 = "null"
        Lb7:
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzcfr r1 = new com.google.android.gms.internal.ads.zzcfr
            r1.<init>(r6)
            r0.execute(r1)
        Lc1:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbbu r0 = r2.zzd
            if (r0 == 0) goto L9
            r1 = 10005(0x2715, float:1.402E-41)
            r0.zzc(r1)
        L9:
            r0 = 1
            r2.zzA = r0
            r0 = 10004(0x2714, float:1.4019E-41)
            r2.zzp = r0
            java.lang.String r0 = "Page loaded delay cancel."
            r2.zzq = r0
            r2.zzg()
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzc
            r0.destroy()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzl() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            int r0 = r2.zzB
            int r0 = r0 + 1
            r2.zzB = r0
            r2.zzg()
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzm() {
            r1 = this;
            int r0 = r1.zzB
            int r0 = r0 + (-1)
            r1.zzB = r0
            r1.zzg()
            return
    }

    final /* synthetic */ void zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc
            r0.zzad()
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()
            if (r0 == 0) goto L10
            r0.zzz()
        L10:
            return
    }

    final /* synthetic */ void zzo(boolean r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc
            r0.zzv(r2, r3)
            return
    }

    final /* synthetic */ void zzp(android.view.View r1, com.google.android.gms.internal.ads.zzbyk r2, int r3) {
            r0 = this;
            int r3 = r3 + (-1)
            r0.zzX(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzq(int r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbso r4 = r1.zzw
            if (r4 == 0) goto L7
            r4.zzb(r2, r3)
        L7:
            com.google.android.gms.internal.ads.zzbsj r4 = r1.zzy
            if (r4 == 0) goto Lf
            r0 = 0
            r4.zzd(r2, r3, r0)
        Lf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzr() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbyk r0 = r3.zza
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzcfo r1 = r3.zzc
            android.webkit.WebView r1 = r1.zzG()
            boolean r2 = androidx.core.view.ViewCompat.isAttachedToWindow(r1)
            if (r2 == 0) goto L16
            r2 = 10
            r3.zzX(r1, r0, r2)
            return
        L16:
            r3.zzW()
            com.google.android.gms.internal.ads.zzcft r1 = new com.google.android.gms.internal.ads.zzcft
            r1.<init>(r3, r0)
            r3.zzF = r1
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzc
            android.view.View r0 = (android.view.View) r0
            r0.addOnAttachStateChangeListener(r1)
        L27:
            return
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc r12, boolean r13, boolean r14) {
            r11 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r11.zzc
            boolean r1 = r0.zzaF()
            boolean r0 = zzZ(r1, r0)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L13
            if (r14 == 0) goto L11
            goto L13
        L11:
            r14 = 0
            goto L14
        L13:
            r14 = 1
        L14:
            if (r14 != 0) goto L18
            if (r13 != 0) goto L19
        L18:
            r2 = 1
        L19:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r13 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r0 = 0
            if (r14 == 0) goto L20
            r5 = r0
            goto L23
        L20:
            com.google.android.gms.ads.internal.client.zza r14 = r11.zzg
            r5 = r14
        L23:
            if (r1 == 0) goto L27
            r6 = r0
            goto L2a
        L27:
            com.google.android.gms.ads.internal.overlay.zzr r14 = r11.zzh
            r6 = r14
        L2a:
            com.google.android.gms.ads.internal.overlay.zzac r7 = r11.zzv
            com.google.android.gms.internal.ads.zzcfo r9 = r11.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = r9.zzn()
            if (r2 == 0) goto L36
            r10 = r0
            goto L39
        L36:
            com.google.android.gms.internal.ads.zzdga r14 = r11.zzm
            r10 = r14
        L39:
            r3 = r13
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.zzx(r13)
            return
    }

    public final void zzv(java.lang.String r8, java.lang.String r9, int r10) {
            r7 = this;
            com.google.android.gms.internal.ads.zzefj r6 = r7.zzE
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r10 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzcfo r1 = r7.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r1.zzn()
            r5 = 14
            r0 = r10
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzx(r10)
            return
    }

    public final void zzw(boolean r13, int r14, boolean r15) {
            r12 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            boolean r1 = r0.zzaF()
            boolean r0 = zzZ(r1, r0)
            r1 = 1
            if (r0 != 0) goto L11
            if (r15 != 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r2 = 0
            if (r0 == 0) goto L18
            r3 = r2
            goto L1b
        L18:
            com.google.android.gms.ads.internal.client.zza r0 = r12.zzg
            r3 = r0
        L1b:
            com.google.android.gms.ads.internal.overlay.zzr r4 = r12.zzh
            com.google.android.gms.ads.internal.overlay.zzac r5 = r12.zzv
            com.google.android.gms.internal.ads.zzcfo r6 = r12.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r9 = r6.zzn()
            if (r1 == 0) goto L29
            r10 = r2
            goto L2c
        L29:
            com.google.android.gms.internal.ads.zzdga r0 = r12.zzm
            r10 = r0
        L2c:
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            boolean r0 = zzY(r0)
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzefj r0 = r12.zzE
            r11 = r0
            goto L39
        L38:
            r11 = r2
        L39:
            r2 = r15
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.zzx(r15)
            return
    }

    public final void zzx(com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbsj r0 = r2.zzy
            if (r0 == 0) goto L9
            boolean r0 = r0.zzf()
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.gms.ads.internal.zzu.zzi()
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzc
            android.content.Context r1 = r1.getContext()
            r0 = r0 ^ 1
            com.google.android.gms.ads.internal.overlay.zzn.zza(r1, r3, r0)
            com.google.android.gms.internal.ads.zzbyk r0 = r2.zza
            if (r0 == 0) goto L29
            java.lang.String r1 = r3.zzl
            if (r1 != 0) goto L26
            com.google.android.gms.ads.internal.overlay.zzc r3 = r3.zza
            if (r3 == 0) goto L26
            java.lang.String r1 = r3.zzb
        L26:
            r0.zzh(r1)
        L29:
            return
    }

    public final void zzy(boolean r19, int r20, java.lang.String r21, java.lang.String r22, boolean r23) {
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            boolean r2 = r1.zzaF()
            boolean r1 = zzZ(r2, r1)
            r3 = 1
            if (r1 != 0) goto L13
            if (r23 != 0) goto L12
            goto L13
        L12:
            r3 = 0
        L13:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r4 = 0
            if (r1 == 0) goto L1a
            r5 = r4
            goto L1d
        L1a:
            com.google.android.gms.ads.internal.client.zza r1 = r0.zzg
            r5 = r1
        L1d:
            if (r2 == 0) goto L21
            r6 = r4
            goto L2b
        L21:
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            com.google.android.gms.internal.ads.zzcfv r2 = new com.google.android.gms.internal.ads.zzcfv
            com.google.android.gms.ads.internal.overlay.zzr r6 = r0.zzh
            r2.<init>(r1, r6)
            r6 = r2
        L2b:
            com.google.android.gms.internal.ads.zzbim r7 = r0.zzk
            com.google.android.gms.internal.ads.zzbio r8 = r0.zzl
            com.google.android.gms.ads.internal.overlay.zzac r9 = r0.zzv
            com.google.android.gms.internal.ads.zzcfo r10 = r0.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r10.zzn()
            if (r3 == 0) goto L3c
            r16 = r4
            goto L40
        L3c:
            com.google.android.gms.internal.ads.zzdga r2 = r0.zzm
            r16 = r2
        L40:
            com.google.android.gms.internal.ads.zzcfo r2 = r0.zzc
            boolean r2 = zzY(r2)
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zzefj r2 = r0.zzE
            r17 = r2
            goto L4f
        L4d:
            r17 = r4
        L4f:
            r4 = r15
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r2 = r15
            r15 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.zzx(r2)
            return
    }

    public final void zzz(boolean r19, int r20, java.lang.String r21, boolean r22, boolean r23) {
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            boolean r2 = r1.zzaF()
            boolean r1 = zzZ(r2, r1)
            r3 = 1
            if (r1 != 0) goto L13
            if (r22 != 0) goto L12
            goto L13
        L12:
            r3 = 0
        L13:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r4 = 0
            if (r1 == 0) goto L1a
            r5 = r4
            goto L1d
        L1a:
            com.google.android.gms.ads.internal.client.zza r1 = r0.zzg
            r5 = r1
        L1d:
            if (r2 == 0) goto L21
            r6 = r4
            goto L2b
        L21:
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzc
            com.google.android.gms.internal.ads.zzcfv r2 = new com.google.android.gms.internal.ads.zzcfv
            com.google.android.gms.ads.internal.overlay.zzr r6 = r0.zzh
            r2.<init>(r1, r6)
            r6 = r2
        L2b:
            com.google.android.gms.internal.ads.zzbim r7 = r0.zzk
            com.google.android.gms.internal.ads.zzbio r8 = r0.zzl
            com.google.android.gms.ads.internal.overlay.zzac r9 = r0.zzv
            com.google.android.gms.internal.ads.zzcfo r10 = r0.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r14 = r10.zzn()
            if (r3 == 0) goto L3b
            r1 = r4
            goto L3d
        L3b:
            com.google.android.gms.internal.ads.zzdga r1 = r0.zzm
        L3d:
            com.google.android.gms.internal.ads.zzcfo r2 = r0.zzc
            boolean r2 = zzY(r2)
            if (r2 == 0) goto L4a
            com.google.android.gms.internal.ads.zzefj r2 = r0.zzE
            r16 = r2
            goto L4c
        L4a:
            r16 = r4
        L4c:
            r4 = r15
            r11 = r19
            r12 = r20
            r13 = r21
            r2 = r15
            r15 = r1
            r17 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.zzx(r2)
            return
    }
}
