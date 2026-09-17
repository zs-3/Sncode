package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
final class zzcgn extends android.webkit.WebView implements android.webkit.DownloadListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, com.google.android.gms.internal.ads.zzcfo {
    public static final /* synthetic */ int zza = 0;
    private final java.lang.String zzA;
    private com.google.android.gms.internal.ads.zzcgq zzB;
    private boolean zzC;
    private boolean zzD;
    private com.google.android.gms.internal.ads.zzbfq zzE;
    private com.google.android.gms.internal.ads.zzbfo zzF;
    private com.google.android.gms.internal.ads.zzbai zzG;
    private int zzH;
    private int zzI;
    private com.google.android.gms.internal.ads.zzbdh zzJ;
    private final com.google.android.gms.internal.ads.zzbdh zzK;
    private com.google.android.gms.internal.ads.zzbdh zzL;
    private final com.google.android.gms.internal.ads.zzbdi zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private java.util.Map zzV;
    private final android.view.WindowManager zzW;
    private final com.google.android.gms.internal.ads.zzbbu zzX;
    private boolean zzY;
    private final com.google.android.gms.internal.ads.zzchh zzb;
    private final com.google.android.gms.internal.ads.zzavn zzc;
    private final com.google.android.gms.internal.ads.zzfhg zzd;
    private final com.google.android.gms.internal.ads.zzbdy zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final android.util.DisplayMetrics zzi;
    private final float zzj;
    private com.google.android.gms.internal.ads.zzfgh zzk;
    private com.google.android.gms.internal.ads.zzfgk zzl;
    private boolean zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzcfw zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private com.google.android.gms.internal.ads.zzegf zzq;
    private com.google.android.gms.internal.ads.zzegd zzr;
    private com.google.android.gms.internal.ads.zzchi zzs;
    private final java.lang.String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private java.lang.Boolean zzy;
    private boolean zzz;

    protected zzcgn(com.google.android.gms.internal.ads.zzchh r10, com.google.android.gms.internal.ads.zzchi r11, java.lang.String r12, boolean r13, boolean r14, com.google.android.gms.internal.ads.zzavn r15, com.google.android.gms.internal.ads.zzbdy r16, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r17, com.google.android.gms.internal.ads.zzbdk r18, com.google.android.gms.ads.internal.zzm r19, com.google.android.gms.ads.internal.zza r20, com.google.android.gms.internal.ads.zzbbu r21, com.google.android.gms.internal.ads.zzfgh r22, com.google.android.gms.internal.ads.zzfgk r23, com.google.android.gms.internal.ads.zzfhg r24) {
            r9 = this;
            r1 = r9
            r2 = r10
            r3 = r17
            r9.<init>(r10)
            r4 = 0
            r1.zzm = r4
            r1.zzn = r4
            r5 = 1
            r1.zzz = r5
            java.lang.String r0 = ""
            r1.zzA = r0
            r0 = -1
            r1.zzR = r0
            r1.zzS = r0
            r1.zzT = r0
            r1.zzU = r0
            r1.zzb = r2
            r0 = r11
            r1.zzs = r0
            r0 = r12
            r1.zzt = r0
            r0 = r13
            r1.zzw = r0
            r0 = r15
            r1.zzc = r0
            r0 = r24
            r1.zzd = r0
            r0 = r16
            r1.zze = r0
            r1.zzf = r3
            r0 = r19
            r1.zzg = r0
            r0 = r20
            r1.zzh = r0
            android.content.Context r0 = r9.getContext()
            java.lang.String r6 = "window"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1.zzW = r0
            com.google.android.gms.ads.internal.zzu.zzp()
            android.util.DisplayMetrics r0 = com.google.android.gms.ads.internal.util.zzt.zzt(r0)
            r1.zzi = r0
            float r0 = r0.density
            r1.zzj = r0
            r0 = r21
            r1.zzX = r0
            r0 = r22
            r1.zzk = r0
            r0 = r23
            r1.zzl = r0
            com.google.android.gms.ads.internal.util.zzck r0 = new com.google.android.gms.ads.internal.util.zzck
            android.app.Activity r6 = r10.zza()
            r7 = 0
            r0.<init>(r6, r9, r9, r7)
            r1.zzQ = r0
            r1.zzY = r4
            r9.setBackgroundColor(r4)
            android.webkit.WebSettings r6 = r9.getSettings()
            r6.setAllowFileAccess(r4)
            r6.setJavaScriptEnabled(r5)     // Catch: java.lang.NullPointerException -> L7f
            goto L86
        L7f:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Unable to enable Javascript."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r8)
        L86:
            r6.setSavePassword(r4)
            r6.setSupportMultipleWindows(r5)
            r6.setJavaScriptCanOpenWindowsAutomatically(r5)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzll
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r8.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La5
            r6.setMixedContentMode(r5)
            goto La9
        La5:
            r0 = 2
            r6.setMixedContentMode(r0)
        La9:
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r3 = r3.afmaVersion
            java.lang.String r0 = r0.zzc(r10, r3)
            r6.setUserAgentString(r0)
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r9.getContext()
            com.google.android.gms.ads.internal.util.zzk r3 = new com.google.android.gms.ads.internal.util.zzk
            r3.<init>(r6, r0)
            com.google.android.gms.ads.internal.util.zzcd.zza(r0, r3)
            r6.setAllowFileAccessFromFileURLs(r4)
            r6.setAllowUniversalAccessFromFileURLs(r4)
            r6.setMediaPlaybackRequiresUserGesture(r4)
            r9.setDownloadListener(r9)
            r9.zzba()
            com.google.android.gms.internal.ads.zzcgu r0 = new com.google.android.gms.internal.ads.zzcgu
            com.google.android.gms.internal.ads.zzcgt r3 = new com.google.android.gms.internal.ads.zzcgt
            r3.<init>(r9)
            r0.<init>(r9, r3)
            java.lang.String r3 = "googleAdsJsInterface"
            r9.addJavascriptInterface(r0, r3)
            java.lang.String r0 = "accessibility"
            r9.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibilityTraversal"
            r9.removeJavascriptInterface(r0)
            r9.zzbi()
            com.google.android.gms.internal.ads.zzbdi r0 = new com.google.android.gms.internal.ads.zzbdi
            com.google.android.gms.internal.ads.zzbdk r3 = new com.google.android.gms.internal.ads.zzbdk
            java.lang.String r4 = r1.zzt
            java.lang.String r6 = "make_wv"
            r3.<init>(r5, r6, r4)
            r0.<init>(r3)
            r1.zzM = r0
            com.google.android.gms.internal.ads.zzbdk r3 = r0.zza()
            r3.zzc(r7)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L12e
            com.google.android.gms.internal.ads.zzfgk r3 = r1.zzl
            if (r3 == 0) goto L12e
            java.lang.String r3 = r3.zzb
            if (r3 == 0) goto L12e
            com.google.android.gms.internal.ads.zzbdk r3 = r0.zza()
            com.google.android.gms.internal.ads.zzfgk r4 = r1.zzl
            java.lang.String r4 = r4.zzb
            java.lang.String r5 = "gqi"
            r3.zzd(r5, r4)
        L12e:
            r0.zza()
            com.google.android.gms.internal.ads.zzbdh r3 = com.google.android.gms.internal.ads.zzbdk.zzf()
            r1.zzK = r3
            java.lang.String r4 = "native:view_create"
            r0.zzb(r4, r3)
            r1.zzL = r7
            r1.zzJ = r7
            com.google.android.gms.ads.internal.util.zzcg r0 = com.google.android.gms.ads.internal.util.zzcg.zza()
            r0.zzb(r10)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzt()
            return
    }

    static /* bridge */ /* synthetic */ int zzaI(com.google.android.gms.internal.ads.zzcgn r0) {
            int r0 = r0.zzI
            return r0
    }

    static /* bridge */ /* synthetic */ void zzaQ(com.google.android.gms.internal.ads.zzcgn r0, int r1) {
            r0.zzI = r1
            return
    }

    static /* synthetic */ void zzaR(com.google.android.gms.internal.ads.zzcgn r0) {
            super.destroy()
            return
    }

    private final synchronized void zzba() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zzk     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L14
            boolean r0 = r0.zzam     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto La
            goto L14
        La:
            java.lang.String r0 = "Disabling hardware acceleration on an overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L35
            r1.zzbc()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return
        L14:
            boolean r0 = r1.zzw     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L2b
            com.google.android.gms.internal.ads.zzchi r0 = r1.zzs     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.zzi()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L21
            goto L2b
        L21:
            java.lang.String r0 = "Enabling hardware acceleration on an AdView."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L35
            r1.zzbe()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return
        L2b:
            java.lang.String r0 = "Enabling hardware acceleration on an overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L35
            r1.zzbe()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return
        L35:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final synchronized void zzbb() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzP     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L11
            r0 = 1
            r1.zzP = r0     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L13
            r0.zzr()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L11:
            monitor-exit(r1)
            return
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final synchronized void zzbc() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzx     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 != 0) goto La
            r0 = 0
            r2.setLayerType(r1, r0)     // Catch: java.lang.Throwable -> Le
        La:
            r2.zzx = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final void zzbd(boolean r3) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 1
            if (r1 == r3) goto Lb
            java.lang.String r3 = "0"
            goto Ld
        Lb:
            java.lang.String r3 = "1"
        Ld:
            java.lang.String r1 = "isVisible"
            r0.put(r1, r3)
            java.lang.String r3 = "onAdVisibilityChanged"
            r2.zzd(r3, r0)
            return
    }

    private final synchronized void zzbe() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzx     // Catch: java.lang.Throwable -> Le
            r1 = 0
            if (r0 == 0) goto La
            r0 = 0
            r2.setLayerType(r1, r0)     // Catch: java.lang.Throwable -> Le
        La:
            r2.zzx = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final synchronized void zzbf(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r3 = "about:blank"
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.ads.zzcgi r1 = new com.google.android.gms.internal.ads.zzcgi     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            r0.post(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "AdWebViewImpl.loadUrlUnsafe"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L20
            r1.zzw(r3, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "Could not call loadUrl in destroy(). "
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L20:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private final void zzbg() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            com.google.android.gms.internal.ads.zzbdk r0 = r0.zza()
            java.lang.String r1 = "aeh2"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.google.android.gms.internal.ads.zzbdh r2 = r3.zzK
            com.google.android.gms.internal.ads.zzbdc.zza(r0, r2, r1)
            return
    }

    private final synchronized void zzbh() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zzV     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        Ld:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzcdv r1 = (com.google.android.gms.internal.ads.zzcdv) r1     // Catch: java.lang.Throwable -> L22
            r1.release()     // Catch: java.lang.Throwable -> L22
            goto Ld
        L1d:
            r0 = 0
            r2.zzV = r0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return
        L22:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final void zzbi() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbdi r0 = r2.zzM
            if (r0 != 0) goto L5
            goto L16
        L5:
            com.google.android.gms.internal.ads.zzbdk r0 = r0.zza()
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.internal.ads.zzbda r1 = r1.zzg()
            if (r1 == 0) goto L16
            r1.zzf(r0)
        L16:
            return
    }

    private final synchronized void zzbj() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r0 = r0.zzl()     // Catch: java.lang.Throwable -> L23
            r2.zzy = r0     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch: java.lang.IllegalStateException -> L1a java.lang.Throwable -> L23
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.IllegalStateException -> L1a java.lang.Throwable -> L23
            r2.zzaY(r0)     // Catch: java.lang.IllegalStateException -> L1a java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L23
            r2.zzaY(r0)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void destroy() {
            r2 = this;
            monitor-enter(r2)
            r2.zzbi()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.ads.internal.util.zzck r0 = r2.zzQ     // Catch: java.lang.Throwable -> L6b
            r0.zza()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.ads.internal.overlay.zzm r0 = r2.zzp     // Catch: java.lang.Throwable -> L6b
            r1 = 0
            if (r0 == 0) goto L18
            r0.zzb()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.ads.internal.overlay.zzm r0 = r2.zzp     // Catch: java.lang.Throwable -> L6b
            r0.zzm()     // Catch: java.lang.Throwable -> L6b
            r2.zzp = r1     // Catch: java.lang.Throwable -> L6b
        L18:
            r2.zzq = r1     // Catch: java.lang.Throwable -> L6b
            r2.zzr = r1     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzcfw r0 = r2.zzo     // Catch: java.lang.Throwable -> L6b
            r0.zzh()     // Catch: java.lang.Throwable -> L6b
            r2.zzG = r1     // Catch: java.lang.Throwable -> L6b
            r2.zzg = r1     // Catch: java.lang.Throwable -> L6b
            r2.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L6b
            r2.setOnTouchListener(r1)     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r2.zzv     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L31
            monitor-exit(r2)
            return
        L31:
            com.google.android.gms.internal.ads.zzcdo r0 = com.google.android.gms.ads.internal.zzu.zzy()     // Catch: java.lang.Throwable -> L6b
            r0.zzd(r2)     // Catch: java.lang.Throwable -> L6b
            r2.zzbh()     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            r2.zzv = r0     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzks     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L61
            java.lang.String r0 = "Initiating WebView self destruct sequence in 3..."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "Loading blank page in WebView, 2..."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "about:blank"
            r2.zzbf(r0)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)
            return
        L61:
            java.lang.String r0 = "Destroying the WebView immediately..."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L6b
            r2.zzX()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)
            return
        L6b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzaE()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L16
            java.lang.String r3 = "#004 The webview is destroyed. Ignoring action."
            r0 = 0
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L14
            r4.onReceiveValue(r0)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)
            return
        L14:
            monitor-exit(r2)
            return
        L16:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkt     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L42
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L47
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L47
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L47
            if (r0 == r1) goto L42
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzcgh r1 = new com.google.android.gms.internal.ads.zzcgh     // Catch: java.lang.Throwable -> L47
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L47
            r0.zza(r1)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)
            return
        L42:
            super.evaluateJavascript(r3, r4)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)
            return
        L47:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    protected final void finalize() throws java.lang.Throwable {
            r1 = this;
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r1.zzv     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L17
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo     // Catch: java.lang.Throwable -> L1c
            r0.zzh()     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzcdo r0 = com.google.android.gms.ads.internal.zzu.zzy()     // Catch: java.lang.Throwable -> L1c
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L1c
            r1.zzbh()     // Catch: java.lang.Throwable -> L1c
            r1.zzbb()     // Catch: java.lang.Throwable -> L1c
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            super.finalize()
            return
        L1c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void loadData(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzaE()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lc
            super.loadData(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        Lc:
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void loadDataWithBaseURL(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzaE()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lc
            super.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        Lc:
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void loadUrl(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzaE()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L24
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzcgk r1 = new com.google.android.gms.internal.ads.zzcgk     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L13
            r0.post(r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "AdWebViewImpl.loadUrl"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L2b
            r1.zzw(r3, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "Could not call loadUrl. "
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return
        L24:
            java.lang.String r3 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return
        L2b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
            r3 = this;
            monitor-enter(r3)
            super.onAttachedToWindow()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r3.zzaE()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto Lf
            com.google.android.gms.ads.internal.util.zzck r0 = r3.zzQ     // Catch: java.lang.Throwable -> L3f
            r0.zzc()     // Catch: java.lang.Throwable -> L3f
        Lf:
            boolean r0 = r3.zzY     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L19
            r3.onResume()     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            r3.zzY = r0     // Catch: java.lang.Throwable -> L3f
        L19:
            boolean r0 = r3.zzC     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzcfw r1 = r3.zzo     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            if (r1 == 0) goto L3a
            boolean r1 = r1.zzR()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3a
            boolean r0 = r3.zzD     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.zzcfw r0 = r3.zzo     // Catch: java.lang.Throwable -> L3f
            r0.zza()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzcfw r0 = r3.zzo     // Catch: java.lang.Throwable -> L3f
            r0.zzb()     // Catch: java.lang.Throwable -> L3f
            r3.zzD = r2     // Catch: java.lang.Throwable -> L3f
        L36:
            r3.zzaZ()     // Catch: java.lang.Throwable -> L3f
            r0 = 1
        L3a:
            r3.zzbd(r0)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r3)
            return
        L3f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzaE()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto Lc
            com.google.android.gms.ads.internal.util.zzck r0 = r2.zzQ     // Catch: java.lang.Throwable -> L3f
            r0.zzd()     // Catch: java.lang.Throwable -> L3f
        Lc:
            super.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r2.zzD     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcfw r0 = r2.zzo     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3a
            boolean r0 = r0.zzR()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3a
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3a
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcfw r0 = r2.zzo     // Catch: java.lang.Throwable -> L3f
            r0.zza()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzcfw r0 = r2.zzo     // Catch: java.lang.Throwable -> L3f
            r0.zzb()     // Catch: java.lang.Throwable -> L3f
            r2.zzD = r1     // Catch: java.lang.Throwable -> L3f
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            r2.zzbd(r1)
            return
        L3f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = this;
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch: android.content.ActivityNotFoundException -> L3c
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch: android.content.ActivityNotFoundException -> L3c
            r2.setDataAndType(r3, r4)     // Catch: android.content.ActivityNotFoundException -> L3c
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkH     // Catch: android.content.ActivityNotFoundException -> L3c
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.Object r3 = r5.zza(r3)     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: android.content.ActivityNotFoundException -> L3c
            boolean r3 = r3.booleanValue()     // Catch: android.content.ActivityNotFoundException -> L3c
            if (r3 == 0) goto L31
            android.content.Context r3 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L3c
            if (r3 == 0) goto L31
            android.content.Context r3 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.ActivityNotFoundException -> L3c
            r2.setPackage(r3)     // Catch: android.content.ActivityNotFoundException -> L3c
        L31:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.content.ActivityNotFoundException -> L3c
            android.content.Context r3 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L3c
            com.google.android.gms.ads.internal.util.zzt.zzT(r3, r2)     // Catch: android.content.ActivityNotFoundException -> L3c
            return
        L3c:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Couldn't find an Activity to view url/mimetype: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = " / "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "AdWebViewImpl.onDownloadStart: "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            r3.zzw(r2, r1)
            return
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            boolean r0 = r2.zzaE()
            if (r0 == 0) goto L7
            goto L1a
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto L1b
            boolean r0 = r3.isHardwareAccelerated()
            if (r0 == 0) goto L1b
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            super.onDraw(r3)
            return
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
            r5 = this;
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            r1 = 10
            float r1 = r6.getAxisValue(r1)
            int r2 = r6.getActionMasked()
            r3 = 8
            if (r2 != r3) goto L41
            r2 = -1
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L20
            boolean r4 = r5.canScrollVertically(r2)
            if (r4 == 0) goto L3f
        L20:
            r4 = 1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2b
            boolean r0 = r5.canScrollVertically(r4)
            if (r0 == 0) goto L3f
        L2b:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L35
            boolean r0 = r5.canScrollHorizontally(r2)
            if (r0 == 0) goto L3f
        L35:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
            boolean r0 = r5.canScrollHorizontally(r4)
            if (r0 != 0) goto L41
        L3f:
            r6 = 0
            return r6
        L41:
            boolean r6 = super.onGenericMotionEvent(r6)
            return r6
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r2 = this;
            boolean r0 = r2.zzaZ()
            com.google.android.gms.ads.internal.overlay.zzm r1 = r2.zzL()
            if (r1 == 0) goto Lf
            if (r0 == 0) goto Lf
            r1.zzn()
        Lf:
            return
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int r9, int r10) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzaE()     // Catch: java.lang.Throwable -> L1e5
            r1 = 0
            if (r0 == 0) goto Ld
            r8.setMeasuredDimension(r1, r1)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        Ld:
            boolean r0 = r8.isInEditMode()     // Catch: java.lang.Throwable -> L1e5
            if (r0 != 0) goto L1e0
            boolean r0 = r8.zzw     // Catch: java.lang.Throwable -> L1e5
            if (r0 != 0) goto L1e0
            com.google.android.gms.internal.ads.zzchi r0 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.zzf()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto L21
            goto L1e0
        L21:
            com.google.android.gms.internal.ads.zzchi r0 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.zzh()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto L2e
            super.onMeasure(r9, r10)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L2e:
            com.google.android.gms.internal.ads.zzchi r0 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.zzj()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto L99
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdN     // Catch: java.lang.Throwable -> L1e5
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1e5
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L1e5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto L4d
            super.onMeasure(r9, r10)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L4d:
            com.google.android.gms.internal.ads.zzcgq r0 = r8.zzq()     // Catch: java.lang.Throwable -> L1e5
            r2 = 0
            if (r0 == 0) goto L59
            float r0 = r0.zze()     // Catch: java.lang.Throwable -> L1e5
            goto L5a
        L59:
            r0 = 0
        L5a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L63
            super.onMeasure(r9, r10)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L63:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch: java.lang.Throwable -> L1e5
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch: java.lang.Throwable -> L1e5
            float r2 = (float) r10     // Catch: java.lang.Throwable -> L1e5
            float r2 = r2 * r0
            float r3 = (float) r9     // Catch: java.lang.Throwable -> L1e5
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L1e5
            if (r10 != 0) goto L7d
            if (r3 == 0) goto L7c
            float r10 = (float) r3     // Catch: java.lang.Throwable -> L1e5
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L1e5
            r1 = r9
            r9 = r3
            goto L8c
        L7c:
            r10 = 0
        L7d:
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L1e5
            if (r9 != 0) goto L89
            if (r2 == 0) goto L8a
            float r9 = (float) r2     // Catch: java.lang.Throwable -> L1e5
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch: java.lang.Throwable -> L1e5
            r9 = r10
            r10 = r2
            r1 = r10
            goto L8c
        L89:
            r1 = r9
        L8a:
            r9 = r10
            r10 = r2
        L8c:
            int r10 = java.lang.Math.min(r10, r1)     // Catch: java.lang.Throwable -> L1e5
            int r9 = java.lang.Math.min(r3, r9)     // Catch: java.lang.Throwable -> L1e5
            r8.setMeasuredDimension(r10, r9)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L99:
            com.google.android.gms.internal.ads.zzchi r0 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.zzg()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto Le2
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdS     // Catch: java.lang.Throwable -> L1e5
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1e5
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L1e5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto Lb8
            super.onMeasure(r9, r10)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        Lb8:
            com.google.android.gms.internal.ads.zzcgl r0 = new com.google.android.gms.internal.ads.zzcgl     // Catch: java.lang.Throwable -> L1e5
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r1 = "/contentHeight"
            r8.zzag(r1, r0)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.zzaT(r0)     // Catch: java.lang.Throwable -> L1e5
            android.util.DisplayMetrics r0 = r8.zzi     // Catch: java.lang.Throwable -> L1e5
            float r0 = r0.density     // Catch: java.lang.Throwable -> L1e5
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch: java.lang.Throwable -> L1e5
            int r1 = r8.zzI     // Catch: java.lang.Throwable -> L1e5
            r2 = -1
            if (r1 == r2) goto Ld9
            float r10 = (float) r1     // Catch: java.lang.Throwable -> L1e5
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L1e5
            goto Ldd
        Ld9:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch: java.lang.Throwable -> L1e5
        Ldd:
            r8.setMeasuredDimension(r9, r10)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        Le2:
            com.google.android.gms.internal.ads.zzchi r0 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            boolean r0 = r0.zzi()     // Catch: java.lang.Throwable -> L1e5
            if (r0 == 0) goto Lf5
            android.util.DisplayMetrics r9 = r8.zzi     // Catch: java.lang.Throwable -> L1e5
            int r10 = r9.widthPixels     // Catch: java.lang.Throwable -> L1e5
            int r9 = r9.heightPixels     // Catch: java.lang.Throwable -> L1e5
            r8.setMeasuredDimension(r10, r9)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        Lf5:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch: java.lang.Throwable -> L1e5
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch: java.lang.Throwable -> L1e5
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch: java.lang.Throwable -> L1e5
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch: java.lang.Throwable -> L1e5
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L115
            if (r0 != r4) goto L111
            goto L115
        L111:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L116
        L115:
            r0 = r9
        L116:
            if (r2 == r5) goto L11a
            if (r2 != r4) goto L11b
        L11a:
            r3 = r10
        L11b:
            com.google.android.gms.internal.ads.zzchi r2 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            int r4 = r2.zzb     // Catch: java.lang.Throwable -> L1e5
            r5 = 1
            if (r4 > r0) goto L129
            int r2 = r2.zza     // Catch: java.lang.Throwable -> L1e5
            if (r2 <= r3) goto L127
            goto L129
        L127:
            r2 = 0
            goto L12a
        L129:
            r2 = 1
        L12a:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfk     // Catch: java.lang.Throwable -> L1e5
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1e5
            java.lang.Object r4 = r6.zza(r4)     // Catch: java.lang.Throwable -> L1e5
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L1e5
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L1e5
            if (r4 == 0) goto L158
            com.google.android.gms.internal.ads.zzchi r4 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            int r6 = r4.zzb     // Catch: java.lang.Throwable -> L1e5
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L1e5
            float r7 = r8.zzj     // Catch: java.lang.Throwable -> L1e5
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1e5
            float r6 = r6 / r7
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L156
            int r0 = r4.zza     // Catch: java.lang.Throwable -> L1e5
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1e5
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L1e5
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L156
            r0 = 1
            goto L157
        L156:
            r0 = 0
        L157:
            r2 = r2 & r0
        L158:
            r0 = 8
            if (r2 == 0) goto L1bf
            com.google.android.gms.internal.ads.zzchi r2 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            int r3 = r2.zzb     // Catch: java.lang.Throwable -> L1e5
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L1e5
            float r4 = r8.zzj     // Catch: java.lang.Throwable -> L1e5
            int r2 = r2.zza     // Catch: java.lang.Throwable -> L1e5
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L1e5
            float r9 = (float) r9     // Catch: java.lang.Throwable -> L1e5
            float r10 = (float) r10     // Catch: java.lang.Throwable -> L1e5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e5
            r6.<init>()     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch: java.lang.Throwable -> L1e5
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L1e5
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e5
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L1e5
            r6.append(r2)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch: java.lang.Throwable -> L1e5
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L1e5
            r6.append(r9)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch: java.lang.Throwable -> L1e5
            float r10 = r10 / r4
            int r9 = (int) r10     // Catch: java.lang.Throwable -> L1e5
            r6.append(r9)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L1e5
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)     // Catch: java.lang.Throwable -> L1e5
            int r9 = r8.getVisibility()     // Catch: java.lang.Throwable -> L1e5
            if (r9 == r0) goto L1ab
            r9 = 4
            r8.setVisibility(r9)     // Catch: java.lang.Throwable -> L1e5
        L1ab:
            r8.setMeasuredDimension(r1, r1)     // Catch: java.lang.Throwable -> L1e5
            boolean r9 = r8.zzm     // Catch: java.lang.Throwable -> L1e5
            if (r9 != 0) goto L1bd
            com.google.android.gms.internal.ads.zzbbu r9 = r8.zzX     // Catch: java.lang.Throwable -> L1e5
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.zzc(r10)     // Catch: java.lang.Throwable -> L1e5
            r8.zzm = r5     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L1bd:
            monitor-exit(r8)
            return
        L1bf:
            int r9 = r8.getVisibility()     // Catch: java.lang.Throwable -> L1e5
            if (r9 == r0) goto L1c8
            r8.setVisibility(r1)     // Catch: java.lang.Throwable -> L1e5
        L1c8:
            boolean r9 = r8.zzn     // Catch: java.lang.Throwable -> L1e5
            if (r9 != 0) goto L1d5
            com.google.android.gms.internal.ads.zzbbu r9 = r8.zzX     // Catch: java.lang.Throwable -> L1e5
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.zzc(r10)     // Catch: java.lang.Throwable -> L1e5
            r8.zzn = r5     // Catch: java.lang.Throwable -> L1e5
        L1d5:
            com.google.android.gms.internal.ads.zzchi r9 = r8.zzs     // Catch: java.lang.Throwable -> L1e5
            int r10 = r9.zzb     // Catch: java.lang.Throwable -> L1e5
            int r9 = r9.zza     // Catch: java.lang.Throwable -> L1e5
            r8.setMeasuredDimension(r10, r9)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L1e0:
            super.onMeasure(r9, r10)     // Catch: java.lang.Throwable -> L1e5
            monitor-exit(r8)
            return
        L1e5:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final void onPause() {
            r3 = this;
            boolean r0 = r3.zzaE()
            if (r0 == 0) goto L7
            goto L4f
        L7:
            super.onPause()     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmg     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L2e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L4f
            java.lang.String r0 = "MUTE_AUDIO"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L4f
            java.lang.String r0 = "Muting webview"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Exception -> L2e
            r0 = 1
            androidx.webkit.WebViewCompat.setAudioMuted(r3, r0)     // Catch: java.lang.Exception -> L2e
            return
        L2e:
            r0 = move-exception
            java.lang.String r1 = "Could not pause webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzmj
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4f
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdWebViewImpl.onPause"
            r1.zzw(r0, r2)
        L4f:
            return
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final void onResume() {
            r3 = this;
            boolean r0 = r3.zzaE()
            if (r0 == 0) goto L7
            goto L4f
        L7:
            super.onResume()     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmg     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L2e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L4f
            java.lang.String r0 = "MUTE_AUDIO"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L4f
            java.lang.String r0 = "Unmuting webview"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Exception -> L2e
            r0 = 0
            androidx.webkit.WebViewCompat.setAudioMuted(r3, r0)     // Catch: java.lang.Exception -> L2e
            return
        L2e:
            r0 = move-exception
            java.lang.String r1 = "Could not resume webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzmj
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4f
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdWebViewImpl.onResume"
            r1.zzw(r0, r2)
        L4f:
            return
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            boolean r0 = r0.zzR()
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            boolean r0 = r0.zzP()
            if (r0 != 0) goto L1d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbfq r0 = r1.zzE     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            r0.zzd(r2)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L2b
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
        L1d:
            com.google.android.gms.internal.ads.zzavn r0 = r1.zzc
            if (r0 == 0) goto L24
            r0.zzd(r2)
        L24:
            com.google.android.gms.internal.ads.zzbdy r0 = r1.zze
            if (r0 == 0) goto L2b
            r0.zzb(r2)
        L2b:
            boolean r0 = r1.zzaE()
            if (r0 == 0) goto L33
            r2 = 0
            return r2
        L33:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final void setWebViewClient(android.webkit.WebViewClient r2) {
            r1 = this;
            super.setWebViewClient(r2)
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzcfw
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzcfw r2 = (com.google.android.gms.internal.ads.zzcfw) r2
            r1.zzo = r2
        Lb:
            return
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
            r2 = this;
            boolean r0 = r2.zzaE()
            if (r0 == 0) goto L7
            return
        L7:
            super.stopLoading()     // Catch: java.lang.Exception -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "Could not stop loading webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzA(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzN = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzC(com.google.android.gms.internal.ads.zzcgq r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcgq r0 = r1.zzB     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Lc
            java.lang.String r2 = "Attempt to create multiple AdWebViewVideoControllers."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        Lc:
            r1.zzB = r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcff
    public final com.google.android.gms.internal.ads.zzfgh zzD() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final android.content.Context zzE() {
            r1 = this;
            com.google.android.gms.internal.ads.zzchh r0 = r1.zzb
            android.content.Context r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchd
    public final android.view.View zzF() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final android.webkit.WebView zzG() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final android.webkit.WebViewClient zzH() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchb
    public final com.google.android.gms.internal.ads.zzavn zzI() {
            r1 = this;
            com.google.android.gms.internal.ads.zzavn r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.internal.ads.zzbai zzJ() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbai r0 = r1.zzG     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.internal.ads.zzbfq zzK() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbfq r0 = r1.zzE     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzp     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzO     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final /* synthetic */ com.google.android.gms.internal.ads.zzchg zzN() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcha
    public final synchronized com.google.android.gms.internal.ads.zzchi zzO() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzchi r0 = r1.zzs     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.internal.ads.zzegd zzP() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzegd r0 = r1.zzr     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.internal.ads.zzegf zzQ() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzegf r0 = r1.zzq     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgr
    public final com.google.android.gms.internal.ads.zzfgk zzR() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgk r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzfhg zzS() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhg r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.common.util.concurrent.ListenableFuture zzT() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdy r0 = r1.zze
            if (r0 != 0) goto La
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        La:
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized java.lang.String zzU() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzt     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final java.util.List zzV() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzW(com.google.android.gms.internal.ads.zzfgh r1, com.google.android.gms.internal.ads.zzfgk r2) {
            r0 = this;
            r0.zzk = r1
            r0.zzl = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzX() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "Destroying WebView!"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L15
            r2.zzbb()     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzcgm r1 = new com.google.android.gms.internal.ads.zzcgm     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            r0.post(r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzY() {
            r3 = this;
            r3.zzbg()
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r3.zzf
            java.lang.String r1 = r1.afmaVersion
            java.lang.String r2 = "version"
            r0.put(r2, r1)
            java.lang.String r1 = "onhide"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzZ(int r4) {
            r3 = this;
            if (r4 != 0) goto L13
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            com.google.android.gms.internal.ads.zzbdh r1 = r3.zzK
            com.google.android.gms.internal.ads.zzbdk r0 = r0.zza()
            java.lang.String r2 = "aebb2"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.google.android.gms.internal.ads.zzbdc.zza(r0, r1, r2)
        L13:
            r3.zzbg()
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            r0.zza()
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            com.google.android.gms.internal.ads.zzbdk r0 = r0.zza()
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "close_type"
            r0.zzd(r2, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "closetype"
            r0.put(r1, r4)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r3.zzf
            java.lang.String r4 = r4.afmaVersion
            java.lang.String r1 = "version"
            r0.put(r1, r4)
            java.lang.String r4 = "onhide"
            r3.zzd(r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zza(java.lang.String r1) {
            r0 = this;
            r0.zzaT(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaA(java.lang.String r2, com.google.android.gms.common.util.Predicate r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.zzO(r2, r3)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaB() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzu     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaC() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzH     // Catch: java.lang.Throwable -> La
            if (r0 <= 0) goto L8
            r0 = 1
        L6:
            monitor-exit(r1)
            return r0
        L8:
            r0 = 0
            goto L6
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaD(boolean r2, int r3) {
            r1 = this;
            r1.destroy()
            com.google.android.gms.internal.ads.zzcgj r0 = new com.google.android.gms.internal.ads.zzcgj
            r0.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zzX
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zzX
            r3 = 10003(0x2713, float:1.4017E-41)
            r2.zzc(r3)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaE() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzv     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaF() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzw     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaG() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaH() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzz     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc r2, boolean r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            r0.zzu(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaK(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r4 = r1.zzo
            r0 = 14
            r4.zzv(r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaL(boolean r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            r0.zzw(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaM(boolean r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r6.zzo
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zzy(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaN(boolean r7, int r8, java.lang.String r9, boolean r10, boolean r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r6.zzo
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zzz(r1, r2, r3, r4, r5)
            return
    }

    public final com.google.android.gms.internal.ads.zzcfw zzaO() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            return r0
    }

    final synchronized java.lang.Boolean zzaP() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Boolean r0 = r1.zzy     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    protected final synchronized void zzaS(java.lang.String r1, android.webkit.ValueCallback r2) {
            r0 = this;
            monitor-enter(r0)
            boolean r2 = r0.zzaE()     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Ld
            r2 = 0
            r0.evaluateJavascript(r1, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        Ld:
            java.lang.String r1 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    protected final void zzaT(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            java.lang.String r1 = "javascript:"
            if (r0 == 0) goto L28
            java.lang.Boolean r0 = r2.zzaP()
            if (r0 != 0) goto L11
            r2.zzbj()
        L11:
            java.lang.Boolean r0 = r2.zzaP()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            r0 = 0
            r2.zzaS(r3, r0)
            return
        L20:
            java.lang.String r3 = r1.concat(r3)
            r2.zzaX(r3)
            return
        L28:
            java.lang.String r3 = r1.concat(r3)
            r2.zzaX(r3)
            return
    }

    final /* synthetic */ void zzaU(java.lang.String r1, android.webkit.ValueCallback r2) {
            r0 = this;
            super.evaluateJavascript(r1, r2)
            return
    }

    final /* synthetic */ void zzaV(java.lang.String r1) {
            r0 = this;
            super.loadUrl(r1)
            return
    }

    final /* synthetic */ void zzaW(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "about:blank"
            super.loadUrl(r1)
            return
    }

    protected final synchronized void zzaX(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzaE()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lc
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        Lc:
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    final void zzaY(java.lang.Boolean r2) {
            r1 = this;
            monitor-enter(r1)
            r1.zzy = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzy(r2)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public final boolean zzaZ() {
            r10 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r10.zzo
            boolean r0 = r0.zzQ()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcfw r0 = r10.zzo
            boolean r0 = r0.zzR()
            if (r0 == 0) goto L6a
        L11:
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r0, r2)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r0, r2)
            com.google.android.gms.internal.ads.zzchh r0 = r10.zzb
            android.app.Activity r0 = r0.zza()
            r2 = 1
            if (r0 == 0) goto L57
            android.view.Window r3 = r0.getWindow()
            if (r3 != 0) goto L37
            goto L57
        L37:
            com.google.android.gms.ads.internal.zzu.zzp()
            int[] r0 = com.google.android.gms.ads.internal.util.zzt.zzQ(r0)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r3 = r10.zzi
            r6 = r0[r1]
            int r3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r3, r6)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r6 = r10.zzi
            r0 = r0[r2]
            int r0 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r6, r0)
            r7 = r0
            r6 = r3
            goto L59
        L57:
            r6 = r4
            r7 = r5
        L59:
            int r0 = r10.zzS
            if (r0 != r4) goto L6b
            int r3 = r10.zzR
            if (r3 != r5) goto L6b
            int r3 = r10.zzT
            if (r3 != r6) goto L6b
            int r3 = r10.zzU
            if (r3 == r7) goto L6a
            goto L6b
        L6a:
            return r1
        L6b:
            if (r0 != r4) goto L71
            int r0 = r10.zzR
            if (r0 == r5) goto L72
        L71:
            r1 = 1
        L72:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            com.google.android.gms.internal.ads.zzbsp r3 = new com.google.android.gms.internal.ads.zzbsp
            java.lang.String r0 = ""
            r3.<init>(r10, r0)
            android.util.DisplayMetrics r0 = r10.zzi
            android.view.WindowManager r2 = r10.zzW
            float r8 = r0.density
            android.view.Display r0 = r2.getDefaultDisplay()
            int r9 = r0.getRotation()
            r3.zzj(r4, r5, r6, r7, r8, r9)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaa() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbdh r0 = r3.zzJ
            if (r0 != 0) goto L27
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            com.google.android.gms.internal.ads.zzbdh r1 = r3.zzK
            com.google.android.gms.internal.ads.zzbdk r0 = r0.zza()
            java.lang.String r2 = "aes2"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.google.android.gms.internal.ads.zzbdc.zza(r0, r1, r2)
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            r0.zza()
            com.google.android.gms.internal.ads.zzbdh r0 = com.google.android.gms.internal.ads.zzbdk.zzf()
            r3.zzJ = r0
            com.google.android.gms.internal.ads.zzbdi r1 = r3.zzM
            java.lang.String r2 = "native:view_show"
            r1.zzb(r2, r0)
        L27:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r3.zzf
            java.lang.String r1 = r1.afmaVersion
            java.lang.String r2 = "version"
            r0.put(r2, r1)
            java.lang.String r1 = "onshow"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzab() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 3
            r0.<init>(r1)
            com.google.android.gms.ads.internal.util.zzac r1 = com.google.android.gms.ads.internal.zzu.zzr()
            boolean r1 = r1.zze()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "app_muted"
            r0.put(r2, r1)
            com.google.android.gms.ads.internal.util.zzac r1 = com.google.android.gms.ads.internal.zzu.zzr()
            float r1 = r1.zza()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "app_volume"
            r0.put(r2, r1)
            android.content.Context r1 = r3.getContext()
            float r1 = com.google.android.gms.ads.internal.util.zzac.zzb(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "device_volume"
            r0.put(r2, r1)
            java.lang.String r1 = "volume"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzac(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            r0.zzi(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzad() {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzck r0 = r1.zzQ
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzae(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            monitor-enter(r8)
            boolean r11 = r8.zzaE()     // Catch: java.lang.Throwable -> L6a
            if (r11 != 0) goto L63
            r11 = 1
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzV     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "12.4.51-000"
            java.lang.String r3 = "version"
            r1.put(r3, r0)     // Catch: org.json.JSONException -> L49 java.lang.Throwable -> L6a
            java.lang.String r0 = "sdk"
            java.lang.String r3 = "Google Mobile Ads"
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L49 java.lang.Throwable -> L6a
            java.lang.String r0 = "sdkVersion"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L49 java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return "
            r0.append(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "}});</script>"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6a
            goto L50
        L49:
            r0 = move-exception
            java.lang.String r1 = "Unable to build MRAID_ENV"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 0
        L50:
            r1 = 0
            r11[r1] = r0     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = com.google.android.gms.internal.ads.zzcgz.zzb(r10, r11)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "UTF-8"
            r7 = 0
            r2 = r8
            r3 = r9
            super.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r8)
            return
        L63:
            java.lang.String r9 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r8)
            return
        L6a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaf() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbdh r0 = r3.zzL
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzbdi r0 = r3.zzM
            r0.zza()
            com.google.android.gms.internal.ads.zzbdh r0 = com.google.android.gms.internal.ads.zzbdk.zzf()
            r3.zzL = r0
            com.google.android.gms.internal.ads.zzbdi r1 = r3.zzM
            java.lang.String r2 = "native:view_load"
            r1.zzb(r2, r0)
        L16:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzag(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.zzA(r2, r3)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzah() {
            r1 = this;
            java.lang.String r0 = "Cannot add text view to inner AdWebView"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzp = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzaj(com.google.android.gms.internal.ads.zzchi r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzs = r1     // Catch: java.lang.Throwable -> L8
            r0.requestLayout()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzak(com.google.android.gms.internal.ads.zzbai r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzG = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzal(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzz = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzam() {
            r1 = this;
            r0 = 0
            r1.setBackgroundColor(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzan(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzchh r0 = r1.zzb
            r0.setBaseContext(r2)
            com.google.android.gms.ads.internal.util.zzck r2 = r1.zzQ
            com.google.android.gms.internal.ads.zzchh r0 = r1.zzb
            android.app.Activity r0 = r0.zza()
            r2.zze(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzao(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.overlay.zzm r0 = r2.zzp     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzcfw r1 = r2.zzo     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.zzQ()     // Catch: java.lang.Throwable -> L14
            r0.zzy(r1, r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L10:
            r2.zzu = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzap(com.google.android.gms.internal.ads.zzbfo r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzF = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzaq(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzw     // Catch: java.lang.Throwable -> L3a
            r2.zzw = r3     // Catch: java.lang.Throwable -> L3a
            r2.zzba()     // Catch: java.lang.Throwable -> L3a
            if (r3 == r0) goto L38
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzW     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzchi r0 = r2.zzs     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.zzi()     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L38
        L24:
            java.lang.String r0 = ""
            com.google.android.gms.internal.ads.zzbsp r1 = new com.google.android.gms.internal.ads.zzbsp     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L3a
            r0 = 1
            if (r0 == r3) goto L31
            java.lang.String r3 = "default"
            goto L33
        L31:
            java.lang.String r3 = "expanded"
        L33:
            r1.zzl(r3)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r2)
            return
        L38:
            monitor-exit(r2)
            return
        L3a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzar(com.google.android.gms.internal.ads.zzbfq r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzE = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzas(com.google.android.gms.internal.ads.zzegd r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzr = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzat(com.google.android.gms.internal.ads.zzegf r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzq = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzau(int r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzp     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzA(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzav(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzY = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzO = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzax(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzH     // Catch: java.lang.Throwable -> L17
            r1 = 1
            if (r1 == r3) goto L7
            r1 = -1
        L7:
            int r0 = r0 + r1
            r2.zzH = r0     // Catch: java.lang.Throwable -> L17
            if (r0 > 0) goto L15
            com.google.android.gms.ads.internal.overlay.zzm r3 = r2.zzp     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L15
            r3.zzE()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return
        L15:
            monitor-exit(r2)
            return
        L17:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzay(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L7
            r0 = 0
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L12
        L7:
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzp     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0.zzB(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaz(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.zzN(r2, r3)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzb(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ");"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.zzaT(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzd(java.lang.String r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> Lc
            org.json.JSONObject r3 = r0.zzj(r3)     // Catch: org.json.JSONException -> Lc
            r1.zze(r2, r3)
            return
        Lc:
            java.lang.String r2 = "Could not convert parameters to JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.zzdG()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r0 = r1.zzo
            if (r0 == 0) goto L7
            r0.zzdf()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdg() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.zzm r0 = r1.zzg     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzdg()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdh() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.zzm r0 = r1.zzg     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzdh()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized java.lang.String zzdi() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzA     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r1) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r1.zzj     // Catch: java.lang.Throwable -> La
            r0.zzC = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r0.zzbd(r1)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zze(java.lang.String r3, org.json.JSONObject r4) {
            r2 = this;
            if (r4 != 0) goto L7
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L7:
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(window.AFMA_ReceiveMessage || function() {})('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "',"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ");"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "Dispatching AFMA event: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            java.lang.String r3 = r0.toString()
            r2.zzaT(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized int zzf() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzN     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
            r1 = this;
            int r0 = r1.getMeasuredHeight()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
            r1 = this;
            int r0 = r1.getMeasuredWidth()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzccj
    public final android.app.Activity zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzchh r0 = r1.zzb
            android.app.Activity r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
            r1 = this;
            com.google.android.gms.ads.internal.zza r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzbdh zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdh r0 = r1.zzK
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzl(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            java.lang.String r2 = r2.toString()
            r0.zzb(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzbdi zzm() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdi r0 = r1.zzM
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn() {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzcby zzo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized com.google.android.gms.internal.ads.zzcdv zzp(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzV     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L8
            r2 = 0
            monitor-exit(r1)
            return r2
        L8:
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzcdv r2 = (com.google.android.gms.internal.ads.zzcdv) r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final synchronized com.google.android.gms.internal.ads.zzcgq zzq() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcgq r0 = r1.zzB     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized java.lang.String zzr() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfgk r0 = r1.zzl     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        L9:
            r0 = 0
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzt(java.lang.String r2, com.google.android.gms.internal.ads.zzcdv r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzV     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lc
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            r1.zzV = r0     // Catch: java.lang.Throwable -> L13
        Lc:
            java.util.Map r0 = r1.zzV     // Catch: java.lang.Throwable -> L13
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzL()
            if (r0 == 0) goto L9
            r0.zzd()
        L9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean r3, long r4) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            r1 = 1
            if (r1 == r3) goto Lc
            java.lang.String r3 = "0"
            goto Le
        Lc:
            java.lang.String r3 = "1"
        Le:
            java.lang.String r1 = "success"
            r0.put(r1, r3)
            java.lang.String r3 = java.lang.Long.toString(r4)
            java.lang.String r4 = "duration"
            r0.put(r4, r3)
            java.lang.String r3 = "onCacheAccessComplete"
            r2.zzd(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzw() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbfo r0 = r3.zzF     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzdos r2 = new com.google.android.gms.internal.ads.zzdos     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzdou r0 = (com.google.android.gms.internal.ads.zzdou) r0     // Catch: java.lang.Throwable -> L15
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r1.post(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        L13:
            monitor-exit(r3)
            return
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfw r2 = r1.zzo
            r0 = 0
            r2.zzD(r0)
            return
    }
}
