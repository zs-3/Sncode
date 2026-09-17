package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzayw implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {
    private static final long zzc = 0;
    android.content.BroadcastReceiver zza;
    final java.lang.ref.WeakReference zzb;
    private final android.content.Context zzd;
    private android.app.Application zze;
    private final android.view.WindowManager zzf;
    private final android.os.PowerManager zzg;
    private final android.app.KeyguardManager zzh;
    private java.lang.ref.WeakReference zzi;
    private com.google.android.gms.internal.ads.zzazi zzj;
    private final com.google.android.gms.ads.internal.util.zzbx zzk;
    private boolean zzl;
    private int zzm;
    private final java.util.HashSet zzn;
    private final android.util.DisplayMetrics zzo;
    private final android.graphics.Rect zzp;

    static {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbq
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.ads.zzayw.zzc = r0
            return
    }

    public zzayw(android.content.Context r4, android.view.View r5) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.ads.internal.util.zzbx r0 = new com.google.android.gms.ads.internal.util.zzbx
            long r1 = com.google.android.gms.internal.ads.zzayw.zzc
            r0.<init>(r1)
            r3.zzk = r0
            r0 = 0
            r3.zzl = r0
            r0 = -1
            r3.zzm = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zzn = r0
            android.content.Context r0 = r4.getApplicationContext()
            r3.zzd = r0
            java.lang.String r1 = "window"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r3.zzf = r1
            java.lang.String r2 = "power"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r3.zzg = r2
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r4.getSystemService(r2)
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2
            r3.zzh = r2
            boolean r2 = r0 instanceof android.app.Application
            if (r2 == 0) goto L4c
            android.app.Application r0 = (android.app.Application) r0
            r3.zze = r0
            com.google.android.gms.internal.ads.zzazi r2 = new com.google.android.gms.internal.ads.zzazi
            r2.<init>(r0, r3)
            r3.zzj = r2
        L4c:
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r3.zzo = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r3.zzp = r4
            android.view.Display r0 = r1.getDefaultDisplay()
            int r0 = r0.getWidth()
            r4.right = r0
            android.view.Display r0 = r1.getDefaultDisplay()
            int r0 = r0.getHeight()
            r4.bottom = r0
            java.lang.ref.WeakReference r4 = r3.zzb
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            goto L7d
        L7c:
            r4 = 0
        L7d:
            if (r4 == 0) goto L85
            r4.removeOnAttachStateChangeListener(r3)
            r3.zzm(r4)
        L85:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            r3.zzb = r4
            if (r5 == 0) goto L9a
            boolean r4 = r5.isAttachedToWindow()
            if (r4 == 0) goto L97
            r3.zzl(r5)
        L97:
            r5.addOnAttachStateChangeListener(r3)
        L9a:
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzayw r0, int r1) {
            r1 = 3
            r0.zzj(r1)
            return
    }

    private final int zzh(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.util.DisplayMetrics r0 = r1.zzo
            float r0 = r0.density
            float r2 = r2 / r0
            int r2 = (int) r2
            return r2
    }

    private final void zzi(android.app.Activity r2, int r3) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzb
            if (r0 != 0) goto L5
            goto L27
        L5:
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L27
            java.lang.ref.WeakReference r0 = r1.zzb
            android.view.View r2 = r2.peekDecorView()
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L27
            if (r2 == 0) goto L27
            android.view.View r0 = r0.getRootView()
            android.view.View r2 = r2.getRootView()
            if (r0 != r2) goto L27
            r1.zzm = r3
        L27:
            return
    }

    private final void zzj(int r35) {
            r34 = this;
            r1 = r34
            r2 = r35
            java.util.HashSet r0 = r1.zzn
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            goto L236
        Le:
            java.lang.ref.WeakReference r0 = r1.zzb
            if (r0 == 0) goto L236
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r9 = new int[r0]
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L85
            boolean r13 = r3.getGlobalVisibleRect(r5)
            boolean r14 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch: java.lang.Exception -> L48
            r3.getLocationInWindow(r9)     // Catch: java.lang.Exception -> L48
            goto L4e
        L48:
            r0 = move-exception
            java.lang.String r15 = "Failure getting view location."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r15, r0)
        L4e:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeM
            com.google.android.gms.internal.ads.zzbct r15 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r15.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            r0 = r9[r12]
            r4.left = r0
            r0 = r9[r11]
            r4.top = r0
            goto L71
        L69:
            r0 = r8[r12]
            r4.left = r0
            r0 = r8[r11]
            r4.top = r0
        L71:
            int r0 = r4.left
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L88
        L85:
            r8 = 0
            r13 = 0
            r14 = 0
        L88:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbt
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r9.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld9
            if (r8 == 0) goto Ld9
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lca
            r0.<init>()     // Catch: java.lang.Exception -> Lca
            android.view.ViewParent r9 = r8.getParent()     // Catch: java.lang.Exception -> Lca
        La5:
            boolean r15 = r9 instanceof android.view.View     // Catch: java.lang.Exception -> Lca
            if (r15 == 0) goto Ldd
            r15 = r9
            android.view.View r15 = (android.view.View) r15     // Catch: java.lang.Exception -> Lca
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lca
            r12.<init>()     // Catch: java.lang.Exception -> Lca
            boolean r16 = r15.isScrollContainer()     // Catch: java.lang.Exception -> Lca
            if (r16 == 0) goto Lc4
            boolean r15 = r15.getGlobalVisibleRect(r12)     // Catch: java.lang.Exception -> Lca
            if (r15 == 0) goto Lc4
            android.graphics.Rect r12 = r1.zza(r12)     // Catch: java.lang.Exception -> Lca
            r0.add(r12)     // Catch: java.lang.Exception -> Lca
        Lc4:
            android.view.ViewParent r9 = r9.getParent()     // Catch: java.lang.Exception -> Lca
            r12 = 0
            goto La5
        Lca:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r9 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r12 = "PositionWatcher.getParentScrollViewRects"
            r9.zzw(r0, r12)
            java.util.List r0 = java.util.Collections.emptyList()
            goto Ldd
        Ld9:
            java.util.List r0 = java.util.Collections.emptyList()
        Ldd:
            r33 = r0
            if (r8 == 0) goto Le6
            int r9 = r8.getWindowVisibility()
            goto Le8
        Le6:
            r9 = 8
        Le8:
            int r12 = r1.zzm
            r15 = -1
            if (r12 == r15) goto Lee
            r9 = r12
        Lee:
            com.google.android.gms.ads.internal.zzu.zzp()
            long r28 = com.google.android.gms.ads.internal.util.zzt.zzw(r8)
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzkh
            com.google.android.gms.internal.ads.zzbct r15 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r15.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L132
            if (r3 == 0) goto L155
            android.os.PowerManager r3 = r1.zzg
            android.app.KeyguardManager r12 = r1.zzh
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzS(r8, r3, r12)
            if (r3 == 0) goto L155
            if (r13 == 0) goto L152
            if (r14 == 0) goto L14e
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkk
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r12.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r12 = (long) r3
            int r3 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r3 < 0) goto L14a
            if (r9 != 0) goto L14a
            goto L147
        L132:
            if (r3 == 0) goto L155
            android.os.PowerManager r3 = r1.zzg
            android.app.KeyguardManager r12 = r1.zzh
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzS(r8, r3, r12)
            if (r3 == 0) goto L155
            if (r13 == 0) goto L152
            if (r14 == 0) goto L14e
            if (r9 != 0) goto L14a
        L147:
            r3 = 1
            r9 = 0
            goto L14b
        L14a:
            r3 = 0
        L14b:
            r13 = 1
            r14 = 1
            goto L156
        L14e:
            r3 = 0
            r13 = 1
            r14 = 0
            goto L156
        L152:
            r3 = 0
            r13 = 0
            goto L156
        L155:
            r3 = 0
        L156:
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzkm
            com.google.android.gms.internal.ads.zzbct r15 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r15.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L1b3
            android.os.PowerManager r12 = r1.zzg
            android.app.KeyguardManager r15 = r1.zzh
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r12 = com.google.android.gms.ads.internal.util.zzt.zzS(r8, r12, r15)
            if (r11 == r12) goto L177
            r12 = 0
            goto L179
        L177:
            r12 = 64
        L179:
            if (r11 == r13) goto L17d
            r15 = 0
            goto L17f
        L17d:
            r15 = 8
        L17f:
            if (r11 == r14) goto L184
            r16 = 0
            goto L186
        L184:
            r16 = 16
        L186:
            if (r9 != 0) goto L18b
            r9 = 128(0x80, float:1.794E-43)
            goto L18c
        L18b:
            r9 = 0
        L18c:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkk
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r11.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r10 = (long) r0
            int r0 = (r28 > r10 ? 1 : (r28 == r10 ? 0 : -1))
            if (r0 < 0) goto L1a4
            r0 = 32
            goto L1a5
        L1a4:
            r0 = 0
        L1a5:
            r10 = r12 | r15
            r10 = r10 | r16
            r9 = r9 | r10
            r0 = r0 | r9
            r0 = r0 | r3
            com.google.android.gms.ads.internal.zzu.zzp()
            r9 = 0
            com.google.android.gms.ads.internal.util.zzt.zzJ(r8, r0, r9)
        L1b3:
            r9 = 1
            if (r2 != r9) goto L1c2
            com.google.android.gms.ads.internal.util.zzbx r0 = r1.zzk
            boolean r0 = r0.zzb()
            if (r0 != 0) goto L1c2
            boolean r0 = r1.zzl
            if (r3 == r0) goto L236
        L1c2:
            if (r3 != 0) goto L1cc
            boolean r0 = r1.zzl
            if (r0 != 0) goto L1cc
            r9 = 1
            if (r2 == r9) goto L236
            goto L1cd
        L1cc:
            r9 = 1
        L1cd:
            com.google.android.gms.internal.ads.zzayu r0 = new com.google.android.gms.internal.ads.zzayu
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r10 = r2.elapsedRealtime()
            android.os.PowerManager r2 = r1.zzg
            boolean r19 = r2.isScreenOn()
            if (r8 == 0) goto L1e8
            boolean r2 = r8.isAttachedToWindow()
            if (r2 == 0) goto L1e8
            r20 = 1
            goto L1ea
        L1e8:
            r20 = 0
        L1ea:
            if (r8 == 0) goto L1f3
            int r2 = r8.getWindowVisibility()
            r21 = r2
            goto L1f5
        L1f3:
            r21 = 8
        L1f5:
            android.graphics.Rect r2 = r1.zzp
            android.graphics.Rect r22 = r1.zza(r2)
            android.graphics.Rect r23 = r1.zza(r4)
            android.graphics.Rect r24 = r1.zza(r5)
            android.graphics.Rect r26 = r1.zza(r6)
            android.graphics.Rect r30 = r1.zza(r7)
            android.util.DisplayMetrics r2 = r1.zzo
            float r2 = r2.density
            r31 = r2
            r16 = r0
            r17 = r10
            r25 = r13
            r27 = r14
            r32 = r3
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33)
            java.util.HashSet r2 = r1.zzn
            java.util.Iterator r2 = r2.iterator()
        L224:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L234
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.zzayv r4 = (com.google.android.gms.internal.ads.zzayv) r4
            r4.zzdp(r0)
            goto L224
        L234:
            r1.zzl = r3
        L236:
            return
    }

    private final void zzk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzays r1 = new com.google.android.gms.internal.ads.zzays
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    private final void zzl(android.view.View r4) {
            r3 = this;
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            boolean r0 = r4.isAlive()
            if (r0 == 0) goto L17
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.zzi = r0
            r4.addOnScrollChangedListener(r3)
            r4.addOnGlobalLayoutListener(r3)
        L17:
            android.content.BroadcastReceiver r4 = r3.zza
            if (r4 != 0) goto L41
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>()
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            r4.addAction(r0)
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            r4.addAction(r0)
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            r4.addAction(r0)
            com.google.android.gms.internal.ads.zzayt r0 = new com.google.android.gms.internal.ads.zzayt
            r0.<init>(r3)
            r3.zza = r0
            android.content.Context r0 = r3.zzd
            com.google.android.gms.ads.internal.util.zzci r1 = com.google.android.gms.ads.internal.zzu.zzv()
            android.content.BroadcastReceiver r2 = r3.zza
            r1.zzc(r0, r2, r4)
        L41:
            android.app.Application r4 = r3.zze
            if (r4 == 0) goto L51
            com.google.android.gms.internal.ads.zzazi r0 = r3.zzj     // Catch: java.lang.Exception -> L4b
            r4.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Exception -> L4b
            return
        L4b:
            r4 = move-exception
            java.lang.String r0 = "Error registering activity lifecycle callbacks."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
        L51:
            return
    }

    private final void zzm(android.view.View r4) {
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference r1 = r3.zzi     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L22
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L1c
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L19
            boolean r2 = r1.isAlive()     // Catch: java.lang.Exception -> L1c
            if (r2 == 0) goto L19
            r1.removeOnScrollChangedListener(r3)     // Catch: java.lang.Exception -> L1c
            r1.removeGlobalOnLayoutListener(r3)     // Catch: java.lang.Exception -> L1c
        L19:
            r3.zzi = r0     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r1 = move-exception
            java.lang.String r2 = "Error while unregistering listeners from the last ViewTreeObserver."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        L22:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch: java.lang.Exception -> L33
            boolean r1 = r4.isAlive()     // Catch: java.lang.Exception -> L33
            if (r1 == 0) goto L39
            r4.removeOnScrollChangedListener(r3)     // Catch: java.lang.Exception -> L33
            r4.removeGlobalOnLayoutListener(r3)     // Catch: java.lang.Exception -> L33
            goto L39
        L33:
            r4 = move-exception
            java.lang.String r1 = "Error while unregistering listeners from the ViewTreeObserver."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)
        L39:
            android.content.BroadcastReceiver r4 = r3.zza
            if (r4 == 0) goto L5c
            com.google.android.gms.ads.internal.util.zzci r4 = com.google.android.gms.ads.internal.zzu.zzv()     // Catch: java.lang.Exception -> L49 java.lang.IllegalStateException -> L54
            android.content.Context r1 = r3.zzd     // Catch: java.lang.Exception -> L49 java.lang.IllegalStateException -> L54
            android.content.BroadcastReceiver r2 = r3.zza     // Catch: java.lang.Exception -> L49 java.lang.IllegalStateException -> L54
            r4.zzd(r1, r2)     // Catch: java.lang.Exception -> L49 java.lang.IllegalStateException -> L54
            goto L5a
        L49:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "ActiveViewUnit.stopScreenStatusMonitoring"
            r1.zzw(r4, r2)
            goto L5a
        L54:
            r4 = move-exception
            java.lang.String r1 = "Failed trying to unregister the receiver"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)
        L5a:
            r3.zza = r0
        L5c:
            android.app.Application r4 = r3.zze
            if (r4 == 0) goto L6c
            com.google.android.gms.internal.ads.zzazi r0 = r3.zzj     // Catch: java.lang.Exception -> L66
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch: java.lang.Exception -> L66
            return
        L66:
            r4 = move-exception
            java.lang.String r0 = "Error registering activity lifecycle callbacks."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
        L6c:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r2 = 0
            r0.zzi(r1, r2)
            r1 = 3
            r0.zzj(r1)
            r0.zzk()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            r1 = 3
            r0.zzj(r1)
            r0.zzk()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            r0 = 4
            r1.zzi(r2, r0)
            r2 = 3
            r1.zzj(r2)
            r1.zzk()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.zzi(r2, r0)
            r2 = 3
            r1.zzj(r2)
            r1.zzk()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1 = 3
            r0.zzj(r1)
            r0.zzk()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.zzi(r2, r0)
            r2 = 3
            r1.zzj(r2)
            r1.zzk()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            r1 = 3
            r0.zzj(r1)
            r0.zzk()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r1 = this;
            r0 = 2
            r1.zzj(r0)
            r1.zzk()
            return
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r1 = this;
            r0 = 1
            r1.zzj(r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.zzm = r0
            r1.zzl(r2)
            r2 = 3
            r1.zzj(r2)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.zzm = r0
            r0 = 3
            r1.zzj(r0)
            r1.zzk()
            r1.zzm(r2)
            return
    }

    final android.graphics.Rect zza(android.graphics.Rect r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r5.left
            int r1 = r4.zzh(r1)
            int r2 = r5.top
            int r2 = r4.zzh(r2)
            int r3 = r5.right
            int r3 = r4.zzh(r3)
            int r5 = r5.bottom
            int r5 = r4.zzh(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public final void zzc(com.google.android.gms.internal.ads.zzayv r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zzn
            r0.add(r2)
            r2 = 3
            r1.zzj(r2)
            return
    }

    final /* synthetic */ void zzd() {
            r1 = this;
            r0 = 3
            r1.zzj(r0)
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzayv r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zzn
            r0.remove(r2)
            return
    }

    public final void zzf() {
            r3 = this;
            com.google.android.gms.ads.internal.util.zzbx r0 = r3.zzk
            long r1 = com.google.android.gms.internal.ads.zzayw.zzc
            r0.zza(r1)
            return
    }

    public final void zzg(long r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzbx r0 = r1.zzk
            r0.zza(r2)
            return
    }
}
