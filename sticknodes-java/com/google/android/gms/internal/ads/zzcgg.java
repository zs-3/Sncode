package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcgg extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.zzcfo {
    private final com.google.android.gms.internal.ads.zzcfo zza;
    private final com.google.android.gms.internal.ads.zzcby zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    public zzcgg(com.google.android.gms.internal.ads.zzcfo r3) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            r2.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzc = r0
            r2.zza = r3
            com.google.android.gms.internal.ads.zzcby r0 = new com.google.android.gms.internal.ads.zzcby
            android.content.Context r1 = r3.zzE()
            r0.<init>(r1, r2, r2)
            r2.zzb = r0
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean canGoBack() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.canGoBack()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void destroy() {
            r5 = this;
            com.google.android.gms.internal.ads.zzegf r0 = r5.zzQ()
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcge r2 = new com.google.android.gms.internal.ads.zzcge
            r2.<init>(r0)
            r1.post(r2)
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zza
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcgc r2 = new com.google.android.gms.internal.ads.zzcgc
            r2.<init>(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeV
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r3 = (long) r0
            r1.postDelayed(r2, r3)
            return
        L2f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.zzegd r0 = r5.zzP()
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcgf r2 = new com.google.android.gms.internal.ads.zzcgf
            r2.<init>(r5, r0)
            r1.post(r2)
            return
        L52:
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zza
            r0.destroy()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void goBack() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.goBack()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void loadData(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zza
            java.lang.String r0 = "text/html"
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void loadDataWithBaseURL(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r6.zza
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "UTF-8"
            r5 = 0
            r1 = r7
            r2 = r8
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void loadUrl(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void onPause() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcby r0 = r1.zzb
            r0.zzf()
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.onPause()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void onResume() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.onResume()
            return
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfo
    public final void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.setOnClickListener(r2)
            return
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfo
    public final void setOnTouchListener(android.view.View.OnTouchListener r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.setOnTouchListener(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void setWebChromeClient(android.webkit.WebChromeClient r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.setWebChromeClient(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void setWebViewClient(android.webkit.WebViewClient r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.setWebViewClient(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzA(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzA(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcby r0 = r1.zzb
            r0.zzg(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final void zzC(com.google.android.gms.internal.ads.zzcgq r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzC(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcff
    public final com.google.android.gms.internal.ads.zzfgh zzD() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzfgh r0 = r0.zzD()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final android.content.Context zzE() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            android.content.Context r0 = r0.zzE()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchd
    public final android.view.View zzF() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final android.webkit.WebView zzG() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final android.webkit.WebViewClient zzH() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            android.webkit.WebViewClient r0 = r0.zzH()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchb
    public final com.google.android.gms.internal.ads.zzavn zzI() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzavn r0 = r0.zzI()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzbai zzJ() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzbai r0 = r0.zzJ()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzbfq zzK() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzbfq r0 = r0.zzK()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzM()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzchg zzN() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzcgn r0 = (com.google.android.gms.internal.ads.zzcgn) r0
            com.google.android.gms.internal.ads.zzcfw r0 = r0.zzaO()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcha
    public final com.google.android.gms.internal.ads.zzchi zzO() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzchi r0 = r0.zzO()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzegd zzP() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzegd r0 = r0.zzP()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzegf zzQ() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzQ()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgr
    public final com.google.android.gms.internal.ads.zzfgk zzR() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzR()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.internal.ads.zzfhg zzS() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzfhg r0 = r0.zzS()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.common.util.concurrent.ListenableFuture zzT() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzT()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final java.lang.String zzU() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            java.lang.String r0 = r0.zzU()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final java.util.List zzV() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            com.google.android.gms.internal.ads.zzcfo r3 = r4.zza
            if (r2 == r3) goto L17
            r0.add(r2)
        L17:
            int r1 = r1 + 1
            goto L6
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzW(com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzfgk r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzW(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzX() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcby r0 = r1.zzb
            r0.zze()
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzX()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzY() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzY()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzZ(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzZ(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzcgn r0 = (com.google.android.gms.internal.ads.zzcgn) r0
            r0.zzaT(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaA(java.lang.String r2, com.google.android.gms.common.util.Predicate r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaA(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaB() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.zzaB()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaC() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.zzaC()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaD(boolean r5, int r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzc
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            return r2
        Lb:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaQ
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1e
            return r1
        L1e:
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zza
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zza
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.zzcfo r1 = r4.zza
            android.view.View r1 = (android.view.View) r1
            r0.removeView(r1)
        L37:
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zza
            r0.zzaD(r5, r6)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaE() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.zzaE()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaF() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.zzaF()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaG() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzc
            boolean r0 = r0.get()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaH() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.zzaH()
            return r0
    }

    final /* synthetic */ void zzaI(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r3 = r2.zza
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzcgc r1 = new com.google.android.gms.internal.ads.zzcgc
            r1.<init>(r3)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc r2, boolean r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaJ(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaK(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r4 = r1.zza
            r0 = 14
            r4.zzaK(r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaL(boolean r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaL(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaM(boolean r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r6.zza
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zzaM(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaN(boolean r7, int r8, java.lang.String r9, boolean r10, boolean r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r6.zza
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zzaN(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaa() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaa()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzab() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzab()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzac(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzac(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzad() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzad()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzae(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r4 = r1.zza
            r0 = 0
            r4.zzae(r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzag(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzag(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzah() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r1 = com.google.android.gms.ads.internal.util.zzt.zzy()
            r0.setText(r1)
            r1 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r1)
            r1 = -1
            r0.setTextColor(r1)
            r1 = 5
            r2 = 0
            r0.setPadding(r1, r2, r1, r2)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r2)
            r2 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setColor(r2)
            r2 = 1090519040(0x41000000, float:8.0)
            r1.setCornerRadius(r2)
            r0.setBackground(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r3 = 49
            r1.<init>(r2, r2, r3)
            r4.addView(r0, r1)
            r4.bringChildToFront(r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L62
            com.google.android.gms.internal.ads.zzegd r1 = r4.zzP()
            if (r1 != 0) goto L5e
            goto L62
        L5e:
            r1.zza(r0)
            return
        L62:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzeW
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8b
            com.google.android.gms.internal.ads.zzegf r1 = r4.zzQ()
            if (r1 == 0) goto L8b
            boolean r2 = r1.zzb()
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.zzega r2 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r1 = r1.zza()
            r2.zzg(r1, r0)
        L8b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzai(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaj(com.google.android.gms.internal.ads.zzchi r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaj(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzak(com.google.android.gms.internal.ads.zzbai r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzak(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzal(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzal(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzam() {
            r2 = this;
            r0 = 0
            r2.setBackgroundColor(r0)
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zza
            r1.setBackgroundColor(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzan(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzan(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzao(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzao(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzap(com.google.android.gms.internal.ads.zzbfo r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzap(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaq(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaq(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzar(com.google.android.gms.internal.ads.zzbfq r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzar(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzas(com.google.android.gms.internal.ads.zzegd r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzas(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzat(com.google.android.gms.internal.ads.zzegf r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzat(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzau(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzau(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzav(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zza
            r0 = 1
            r2.zzav(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaw(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzax(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzax(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzay(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzay(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaz(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaz(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzb(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zza
            java.lang.String r0 = "window.inspectorInfo"
            r2.zzb(r0, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzd(java.lang.String r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzd(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            if (r0 == 0) goto L7
            r0.zzdG()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            if (r0 == 0) goto L7
            r0.zzdf()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzdg()
            return
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzdh()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final java.lang.String zzdi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            java.lang.String r0 = r0.zzdi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzdp(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zze(java.lang.String r2, org.json.JSONObject r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zze(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            int r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza
            int r0 = r0.getMeasuredHeight()
            return r0
        L19:
            int r0 = r2.getMeasuredHeight()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza
            int r0 = r0.getMeasuredWidth()
            return r0
        L19:
            int r0 = r2.getMeasuredWidth()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzccj
    public final android.app.Activity zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            android.app.Activity r0 = r0.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.ads.internal.zza r0 = r0.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzbdh zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzbdh r0 = r0.zzk()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzl(java.lang.String r2, org.json.JSONObject r3) {
            r1 = this;
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzcgn r0 = (com.google.android.gms.internal.ads.zzcgn) r0
            r0.zzb(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzbdi zzm() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzbdi r0 = r0.zzm()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzcby zzo() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcby r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzcdv zzp(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzcdv r2 = r0.zzp(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.internal.ads.zzcgq zzq() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            com.google.android.gms.internal.ads.zzcgq r0 = r0.zzq()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final java.lang.String zzr() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            java.lang.String r0 = r0.zzr()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final void zzt(java.lang.String r2, com.google.android.gms.internal.ads.zzcdv r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzt(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzu()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzv(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzw() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzw()
            return
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
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zza
            r0 = 0
            r2.zzz(r0)
            return
    }
}
