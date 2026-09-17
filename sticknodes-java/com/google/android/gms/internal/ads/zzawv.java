package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawv implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {
    private static final android.os.Handler zza = null;
    private final android.content.Context zzb;
    private android.app.Application zzc;
    private final android.os.PowerManager zzd;
    private final android.app.KeyguardManager zze;
    private android.content.BroadcastReceiver zzf;
    private final com.google.android.gms.internal.ads.zzawh zzg;
    private java.lang.ref.WeakReference zzh;
    private java.lang.ref.WeakReference zzi;
    private com.google.android.gms.internal.ads.zzawd zzj;
    private byte zzk;
    private int zzl;
    private long zzm;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzawv.zza = r0
            return
    }

    public zzawv(android.content.Context r3, com.google.android.gms.internal.ads.zzawh r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zzk = r0
            r2.zzl = r0
            r0 = -3
            r2.zzm = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.zzb = r3
            r2.zzg = r4
            java.lang.String r4 = "power"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            r2.zzd = r4
            java.lang.String r4 = "keyguard"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.app.KeyguardManager r4 = (android.app.KeyguardManager) r4
            r2.zze = r4
            boolean r4 = r3 instanceof android.app.Application
            if (r4 == 0) goto L37
            android.app.Application r3 = (android.app.Application) r3
            r2.zzc = r3
            com.google.android.gms.internal.ads.zzawd r4 = new com.google.android.gms.internal.ads.zzawd
            r4.<init>(r3, r2)
            r2.zzj = r4
        L37:
            r3 = 0
            r2.zzd(r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzawv r0) {
            r0.zzf()
            return
    }

    private final void zze(android.app.Activity r2, int r3) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzi
            if (r0 != 0) goto L5
            goto L23
        L5:
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L23
            android.view.View r2 = r2.peekDecorView()
            android.view.View r0 = r1.zzb()
            if (r0 == 0) goto L23
            if (r2 == 0) goto L23
            android.view.View r0 = r0.getRootView()
            android.view.View r2 = r2.getRootView()
            if (r0 != r2) goto L23
            r1.zzl = r3
        L23:
            return
    }

    private final void zzf() {
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.zzi
            if (r0 != 0) goto L6
            goto Lbe
        L6:
            android.view.View r0 = r9.zzb()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L14
            r9.zzm = r2
            r9.zzk = r1
            return
        L14:
            int r4 = r0.getVisibility()
            r5 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            boolean r6 = r0.isShown()
            if (r6 != 0) goto L26
            r4 = r4 | 2
        L26:
            android.os.PowerManager r6 = r9.zzd
            if (r6 == 0) goto L32
            boolean r6 = r6.isScreenOn()
            if (r6 != 0) goto L32
            r4 = r4 | 4
        L32:
            com.google.android.gms.internal.ads.zzawh r6 = r9.zzg
            boolean r6 = r6.zza()
            if (r6 != 0) goto L84
            android.app.KeyguardManager r6 = r9.zze
            if (r6 == 0) goto L82
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            if (r6 == 0) goto L82
            int r6 = com.google.android.gms.internal.ads.zzawr.zza
            android.view.View r6 = r0.getRootView()
            if (r6 != 0) goto L4d
            r6 = r0
        L4d:
            android.content.Context r6 = r6.getContext()
        L51:
            boolean r7 = r6 instanceof android.content.ContextWrapper
            r8 = 0
            if (r7 == 0) goto L6a
            r7 = 10
            if (r5 >= r7) goto L6a
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L61
            android.app.Activity r6 = (android.app.Activity) r6
            goto L6b
        L61:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            int r5 = r5 + 1
            goto L51
        L6a:
            r6 = r8
        L6b:
            if (r6 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r5 = r6.getWindow()
            if (r5 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r8 = r5.getAttributes()
        L79:
            if (r8 == 0) goto L82
            int r5 = r8.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L84
        L82:
            r4 = r4 | 8
        L84:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L91
            r4 = r4 | 16
        L91:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L9e
            r4 = r4 | 32
        L9e:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.zzl
            if (r5 == r1) goto La7
            r0 = r5
        La7:
            if (r0 == 0) goto Lab
            r4 = r4 | 64
        Lab:
            byte r0 = r9.zzk
            if (r0 == r4) goto Lbe
            byte r0 = (byte) r4
            r9.zzk = r0
            if (r4 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r4
            long r0 = r2 - r0
        Lbc:
            r9.zzm = r0
        Lbe:
            return
    }

    private final void zzg() {
            r2 = this;
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzawv.zza
            com.google.android.gms.internal.ads.zzawt r1 = new com.google.android.gms.internal.ads.zzawt
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    private final void zzh(android.view.View r3) {
            r2 = this;
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            boolean r0 = r3.isAlive()
            if (r0 == 0) goto L17
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.zzh = r0
            r3.addOnScrollChangedListener(r2)
            r3.addOnGlobalLayoutListener(r2)
        L17:
            android.content.BroadcastReceiver r3 = r2.zzf
            if (r3 != 0) goto L3b
            android.content.IntentFilter r3 = new android.content.IntentFilter
            r3.<init>()
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            r3.addAction(r0)
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            r3.addAction(r0)
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            r3.addAction(r0)
            com.google.android.gms.internal.ads.zzawu r0 = new com.google.android.gms.internal.ads.zzawu
            r0.<init>(r2)
            r2.zzf = r0
            android.content.Context r1 = r2.zzb
            r1.registerReceiver(r0, r3)
        L3b:
            android.app.Application r3 = r2.zzc
            if (r3 == 0) goto L44
            com.google.android.gms.internal.ads.zzawd r0 = r2.zzj     // Catch: java.lang.Exception -> L44
            r3.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Exception -> L44
        L44:
            return
    }

    private final void zzi(android.view.View r4) {
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference r1 = r3.zzh     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L1b
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L19
            boolean r2 = r1.isAlive()     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L19
            r1.removeOnScrollChangedListener(r3)     // Catch: java.lang.Exception -> L1b
            r1.removeGlobalOnLayoutListener(r3)     // Catch: java.lang.Exception -> L1b
        L19:
            r3.zzh = r0     // Catch: java.lang.Exception -> L1b
        L1b:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch: java.lang.Exception -> L2c
            boolean r1 = r4.isAlive()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L2d
            r4.removeOnScrollChangedListener(r3)     // Catch: java.lang.Exception -> L2c
            r4.removeGlobalOnLayoutListener(r3)     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
        L2d:
            android.content.BroadcastReceiver r4 = r3.zzf
            if (r4 == 0) goto L38
            android.content.Context r1 = r3.zzb     // Catch: java.lang.Exception -> L36
            r1.unregisterReceiver(r4)     // Catch: java.lang.Exception -> L36
        L36:
            r3.zzf = r0
        L38:
            android.app.Application r4 = r3.zzc
            if (r4 == 0) goto L41
            com.google.android.gms.internal.ads.zzawd r0 = r3.zzj     // Catch: java.lang.Exception -> L41
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch: java.lang.Exception -> L41
        L41:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r2 = 0
            r0.zze(r1, r2)
            r0.zzf()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            r0.zzf()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            r0 = 4
            r1.zze(r2, r0)
            r1.zzf()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.zze(r2, r0)
            r1.zzf()
            r1.zzg()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r0.zzf()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.zze(r2, r0)
            r1.zzf()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            r0.zzf()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r0 = this;
            r0.zzf()
            return
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r0 = this;
            r0.zzf()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.zzl = r0
            r1.zzh(r2)
            r1.zzf()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.zzl = r0
            r1.zzf()
            r1.zzg()
            r1.zzi(r2)
            return
    }

    public final long zza() {
            r5 = this;
            long r0 = r5.zzm
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L12
            android.view.View r0 = r5.zzb()
            if (r0 != 0) goto L12
            r0 = -3
            r5.zzm = r0
        L12:
            long r0 = r5.zzm
            return r0
    }

    final android.view.View zzb() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzi
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    final void zzd(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.zzb()
            if (r0 == 0) goto Lc
            r0.removeOnAttachStateChangeListener(r2)
            r2.zzi(r0)
        Lc:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.zzi = r0
            if (r3 == 0) goto L2e
            android.os.IBinder r0 = r3.getWindowToken()
            if (r0 != 0) goto L23
            int r0 = r3.getWindowVisibility()
            r1 = 8
            if (r0 == r1) goto L26
        L23:
            r2.zzh(r3)
        L26:
            r3.addOnAttachStateChangeListener(r2)
            r0 = -2
        L2b:
            r2.zzm = r0
            return
        L2e:
            r0 = -3
            goto L2b
    }
}
