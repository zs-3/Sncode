package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdll extends com.google.android.gms.internal.ads.zzbgf implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzdml {
    public static final com.google.android.gms.internal.ads.zzgax zza = null;
    private final java.lang.String zzb;
    private java.util.Map zzc;
    private android.widget.FrameLayout zzd;
    private android.widget.FrameLayout zze;
    private final com.google.android.gms.internal.ads.zzgfz zzf;
    private android.view.View zzg;
    private final int zzh;
    private com.google.android.gms.internal.ads.zzdkk zzi;
    private com.google.android.gms.internal.ads.zzayw zzj;
    private com.google.android.gms.dynamic.IObjectWrapper zzk;
    private com.google.android.gms.internal.ads.zzbfz zzl;
    private boolean zzm;
    private boolean zzn;
    private android.view.GestureDetector zzo;

    static {
            java.lang.String r0 = "2011"
            java.lang.String r1 = "1009"
            java.lang.String r2 = "3010"
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzq(r0, r1, r2)
            com.google.android.gms.internal.ads.zzdll.zza = r0
            return
    }

    public zzdll(android.widget.FrameLayout r2, android.widget.FrameLayout r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1.zzc = r4
            r4 = 0
            r1.zzk = r4
            r4 = 0
            r1.zzn = r4
            r1.zzd = r2
            r1.zze = r3
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r1.zzh = r3
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r4 = "com.google.android.gms.ads.formats.NativeContentAdView"
            boolean r4 = r4.equals(r3)
            java.lang.String r0 = "3012"
            if (r4 == 0) goto L2e
            java.lang.String r0 = "1007"
            goto L3e
        L2e:
            java.lang.String r4 = "com.google.android.gms.ads.formats.NativeAppInstallAdView"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L39
            java.lang.String r0 = "2009"
            goto L3e
        L39:
            java.lang.String r4 = "com.google.android.gms.ads.formats.UnifiedNativeAdView"
            r4.equals(r3)
        L3e:
            r1.zzb = r0
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zza(r2, r1)
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zze
            r1.zzf = r3
            com.google.android.gms.internal.ads.zzayw r3 = new com.google.android.gms.internal.ads.zzayw
            android.widget.FrameLayout r4 = r1.zzd
            android.content.Context r4 = r4.getContext()
            android.widget.FrameLayout r0 = r1.zzd
            r3.<init>(r4, r0)
            r1.zzj = r3
            r2.setOnTouchListener(r1)
            r2.setOnClickListener(r1)
            return
    }

    private final synchronized void zzt(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L68
            android.widget.FrameLayout r1 = r4.zze     // Catch: java.lang.Throwable -> L68
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L68
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L68
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L68
            r2 = -1
            r1.<init>(r2, r2)     // Catch: java.lang.Throwable -> L68
            r0.setLayoutParams(r1)     // Catch: java.lang.Throwable -> L68
            android.widget.FrameLayout r1 = r4.zze     // Catch: java.lang.Throwable -> L68
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L68
            r2 = 0
            r0.setClickable(r2)     // Catch: java.lang.Throwable -> L68
            r0.setFocusable(r2)     // Catch: java.lang.Throwable -> L68
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L29
            goto L61
        L29:
            android.content.Context r3 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L33
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L68
        L33:
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L61
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L61
            byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.IllegalArgumentException -> L5b java.lang.Throwable -> L68
            int r3 = r5.length     // Catch: java.lang.Throwable -> L68
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r2, r3)     // Catch: java.lang.Throwable -> L68
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L68
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L68
            int r5 = r1.densityDpi     // Catch: java.lang.Throwable -> L68
            r2.setTargetDensity(r5)     // Catch: java.lang.Throwable -> L68
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.REPEAT     // Catch: java.lang.Throwable -> L68
            r2.setTileModeXY(r5, r5)     // Catch: java.lang.Throwable -> L68
            r0.setBackground(r2)     // Catch: java.lang.Throwable -> L68
            goto L61
        L5b:
            r5 = move-exception
            java.lang.String r1 = "Encountered invalid base64 watermark."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r5)     // Catch: java.lang.Throwable -> L68
        L61:
            android.widget.FrameLayout r5 = r4.zze     // Catch: java.lang.Throwable -> L68
            r5.addView(r0)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)
            return
        L68:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final synchronized void zzu() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdlk r0 = new com.google.android.gms.internal.ads.zzdlk     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzf     // Catch: java.lang.Throwable -> Ld
            r1.execute(r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final synchronized void zzv() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlg     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            com.google.android.gms.internal.ads.zzdkk r0 = r4.zzi     // Catch: java.lang.Throwable -> L33
            int r0 = r0.zza()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            android.view.GestureDetector r0 = new android.view.GestureDetector     // Catch: java.lang.Throwable -> L33
            android.widget.FrameLayout r1 = r4.zzd     // Catch: java.lang.Throwable -> L33
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzdlr r2 = new com.google.android.gms.internal.ads.zzdlr     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzdkk r3 = r4.zzi     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33
            r4.zzo = r0     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)
            return
        L31:
            monitor-exit(r4)
            return
        L33:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View r8) {
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzdkk r0 = r7.zzi     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            boolean r0 = r0.zzV()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzdkk r0 = r7.zzi     // Catch: java.lang.Throwable -> L25
            r0.zzv()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzdkk r1 = r7.zzi     // Catch: java.lang.Throwable -> L25
            android.widget.FrameLayout r3 = r7.zzd     // Catch: java.lang.Throwable -> L25
            java.util.Map r4 = r7.zzl()     // Catch: java.lang.Throwable -> L25
            java.util.Map r5 = r7.zzm()     // Catch: java.lang.Throwable -> L25
            r6 = 0
            r2 = r8
            r1.zzD(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r7)
            return
        L23:
            monitor-exit(r7)
            return
        L25:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdkk r0 = r5.zzi     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            android.widget.FrameLayout r1 = r5.zzd     // Catch: java.lang.Throwable -> L1a
            java.util.Map r2 = r5.zzl()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r3 = r5.zzm()     // Catch: java.lang.Throwable -> L1a
            boolean r4 = com.google.android.gms.internal.ads.zzdkk.zzY(r1)     // Catch: java.lang.Throwable -> L1a
            r0.zzB(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)
            return
        L18:
            monitor-exit(r5)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdkk r0 = r5.zzi     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            android.widget.FrameLayout r1 = r5.zzd     // Catch: java.lang.Throwable -> L1a
            java.util.Map r2 = r5.zzl()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r3 = r5.zzm()     // Catch: java.lang.Throwable -> L1a
            boolean r4 = com.google.android.gms.internal.ads.zzdkk.zzY(r1)     // Catch: java.lang.Throwable -> L1a
            r0.zzB(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)
            return
        L18:
            monitor-exit(r5)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzi     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L6
            goto L2e
        L6:
            android.widget.FrameLayout r1 = r2.zzd     // Catch: java.lang.Throwable -> L31
            r0.zzL(r3, r4, r1)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzlg     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r0.zza(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L31
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L2e
            android.view.GestureDetector r3 = r2.zzo     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L2e
            com.google.android.gms.internal.ads.zzdkk r3 = r2.zzi     // Catch: java.lang.Throwable -> L31
            int r3 = r3.zza()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L2e
            android.view.GestureDetector r3 = r2.zzo     // Catch: java.lang.Throwable -> L31
            r3.onTouchEvent(r4)     // Catch: java.lang.Throwable -> L31
        L2e:
            r3 = 0
            monitor-exit(r2)
            return r3
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzb(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            android.view.View r1 = r0.zzg(r1)     // Catch: java.lang.Throwable -> Lb
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzc() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzn     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzi     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 == 0) goto L11
            r0.zzT(r2)     // Catch: java.lang.Throwable -> L2f
            r2.zzi = r1     // Catch: java.lang.Throwable -> L2f
        L11:
            java.util.Map r0 = r2.zzc     // Catch: java.lang.Throwable -> L2f
            r0.clear()     // Catch: java.lang.Throwable -> L2f
            android.widget.FrameLayout r0 = r2.zzd     // Catch: java.lang.Throwable -> L2f
            r0.removeAllViews()     // Catch: java.lang.Throwable -> L2f
            android.widget.FrameLayout r0 = r2.zze     // Catch: java.lang.Throwable -> L2f
            r0.removeAllViews()     // Catch: java.lang.Throwable -> L2f
            r2.zzc = r1     // Catch: java.lang.Throwable -> L2f
            r2.zzd = r1     // Catch: java.lang.Throwable -> L2f
            r2.zze = r1     // Catch: java.lang.Throwable -> L2f
            r2.zzg = r1     // Catch: java.lang.Throwable -> L2f
            r2.zzj = r1     // Catch: java.lang.Throwable -> L2f
            r0 = 1
            r2.zzn = r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return
        L2f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final void zzd(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            android.widget.FrameLayout r0 = r1.zzd
            r1.onTouch(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzdv(java.lang.String r2, com.google.android.gms.dynamic.IObjectWrapper r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> Ld
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            r1.zzq(r2, r3, r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzdw(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzi     // Catch: java.lang.Throwable -> Le
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> Le
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> Le
            r0.zzN(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzdx(com.google.android.gms.internal.ads.zzbfz r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzn     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L6
            goto L18
        L6:
            r0 = 1
            r1.zzm = r0     // Catch: java.lang.Throwable -> L1a
            r1.zzl = r2     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzi     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzdkm r0 = r0.zzc()     // Catch: java.lang.Throwable -> L1a
            r0.zzb(r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)
            return
        L1a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzdy(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzn     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.zzk = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzdz(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzn     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L70
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzdkk     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L16
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            return
        L16:
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzi     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L1d
            r0.zzT(r1)     // Catch: java.lang.Throwable -> L70
        L1d:
            r1.zzu()     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzdkk r2 = (com.google.android.gms.internal.ads.zzdkk) r2     // Catch: java.lang.Throwable -> L70
            r1.zzi = r2     // Catch: java.lang.Throwable -> L70
            r2.zzS(r1)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzdkk r2 = r1.zzi     // Catch: java.lang.Throwable -> L70
            android.widget.FrameLayout r0 = r1.zzd     // Catch: java.lang.Throwable -> L70
            r2.zzK(r0)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzdkk r2 = r1.zzi     // Catch: java.lang.Throwable -> L70
            android.widget.FrameLayout r0 = r1.zze     // Catch: java.lang.Throwable -> L70
            r2.zzu(r0)     // Catch: java.lang.Throwable -> L70
            boolean r2 = r1.zzm     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L44
            com.google.android.gms.internal.ads.zzdkk r2 = r1.zzi     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzdkm r2 = r2.zzc()     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzbfz r0 = r1.zzl     // Catch: java.lang.Throwable -> L70
            r2.zzb(r0)     // Catch: java.lang.Throwable -> L70
        L44:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdQ     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L70
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L6b
            com.google.android.gms.internal.ads.zzdkk r2 = r1.zzi     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.zzg()     // Catch: java.lang.Throwable -> L70
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6b
            com.google.android.gms.internal.ads.zzdkk r2 = r1.zzi     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.zzg()     // Catch: java.lang.Throwable -> L70
            r1.zzt(r2)     // Catch: java.lang.Throwable -> L70
        L6b:
            r1.zzv()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            return
        L70:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zze(com.google.android.gms.dynamic.IObjectWrapper r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final /* synthetic */ android.view.View zzf() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized android.view.View zzg(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzn     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L6
            goto L18
        L6:
            java.util.Map r0 = r1.zzc     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L18
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1b
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)
            return r2
        L18:
            r2 = 0
            monitor-exit(r1)
            return r2
        L1b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final android.widget.FrameLayout zzh() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final com.google.android.gms.internal.ads.zzayw zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzayw r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final com.google.android.gms.dynamic.IObjectWrapper zzj() {
            r1 = this;
            com.google.android.gms.dynamic.IObjectWrapper r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.lang.String zzk() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.util.Map zzl() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.util.Map zzm() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.util.Map zzn() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized org.json.JSONObject zzo() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzdkk r0 = r4.zzi     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L15
            android.widget.FrameLayout r1 = r4.zzd     // Catch: java.lang.Throwable -> L18
            java.util.Map r2 = r4.zzl()     // Catch: java.lang.Throwable -> L18
            java.util.Map r3 = r4.zzm()     // Catch: java.lang.Throwable -> L18
            org.json.JSONObject r0 = r0.zzi(r1, r2, r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return r0
        L15:
            r0 = 0
            monitor-exit(r4)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized org.json.JSONObject zzp() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzdkk r0 = r4.zzi     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L15
            android.widget.FrameLayout r1 = r4.zzd     // Catch: java.lang.Throwable -> L18
            java.util.Map r2 = r4.zzl()     // Catch: java.lang.Throwable -> L18
            java.util.Map r3 = r4.zzm()     // Catch: java.lang.Throwable -> L18
            org.json.JSONObject r0 = r0.zzj(r1, r2, r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return r0
        L15:
            r0 = 0
            monitor-exit(r4)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized void zzq(java.lang.String r2, android.view.View r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.zzn     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L6
            goto L3d
        L6:
            if (r3 != 0) goto Lf
            java.util.Map r3 = r1.zzc     // Catch: java.lang.Throwable -> L3f
            r3.remove(r2)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)
            return
        Lf:
            java.util.Map r4 = r1.zzc     // Catch: java.lang.Throwable -> L3f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3f
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L3d
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L3d
            int r2 = r1.zzh     // Catch: java.lang.Throwable -> L3f
            boolean r2 = com.google.android.gms.ads.internal.util.zzbv.zzi(r2)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L34
            r3.setOnTouchListener(r1)     // Catch: java.lang.Throwable -> L3f
        L34:
            r2 = 1
            r3.setClickable(r2)     // Catch: java.lang.Throwable -> L3f
            r3.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final android.widget.FrameLayout zzr() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.zzd
            return r0
    }

    final /* synthetic */ void zzs() {
            r4 = this;
            android.view.View r0 = r4.zzg
            if (r0 != 0) goto L1b
            android.view.View r0 = new android.view.View
            android.widget.FrameLayout r1 = r4.zzd
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r4.zzg = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = 0
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
        L1b:
            android.widget.FrameLayout r0 = r4.zzd
            android.view.View r1 = r4.zzg
            android.view.ViewParent r1 = r1.getParent()
            if (r0 == r1) goto L2c
            android.widget.FrameLayout r0 = r4.zzd
            android.view.View r1 = r4.zzg
            r0.addView(r1)
        L2c:
            return
    }
}
