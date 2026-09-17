package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzcf implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final com.google.android.gms.games.internal.zzbz zza;
    private final com.google.android.gms.internal.games.zzfq zzb;
    private java.lang.ref.WeakReference zzc;
    private boolean zzd;

    private zzcf(com.google.android.gms.games.internal.zzbz r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r1.zza = r2
            com.google.android.gms.internal.games.zzfq r2 = new com.google.android.gms.internal.games.zzfq
            r0 = 0
            r2.<init>(r3, r0)
            r1.zzb = r2
            return
    }

    public static com.google.android.gms.games.internal.zzcf zzc(com.google.android.gms.games.internal.zzbz r1, int r2) {
            com.google.android.gms.games.internal.zzcf r0 = new com.google.android.gms.games.internal.zzcf
            r0.<init>(r1, r2)
            return r0
    }

    @android.annotation.TargetApi(17)
    private final void zzh(android.view.View r6) {
            r5 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1()
            r1 = -1
            if (r0 == 0) goto L11
            android.view.Display r0 = r6.getDisplay()
            if (r0 == 0) goto L11
            int r1 = r0.getDisplayId()
        L11:
            android.os.IBinder r0 = r6.getWindowToken()
            r2 = 2
            int[] r2 = new int[r2]
            r6.getLocationInWindow(r2)
            int r3 = r6.getWidth()
            int r6 = r6.getHeight()
            com.google.android.gms.internal.games.zzfq r4 = r5.zzb
            r4.zzc = r1
            r4.zza = r0
            r0 = 0
            r0 = r2[r0]
            r4.zzd = r0
            r1 = 1
            r1 = r2[r1]
            r4.zze = r1
            int r0 = r0 + r3
            r4.zzf = r0
            int r1 = r1 + r6
            r4.zzg = r1
            boolean r6 = r5.zzd
            if (r6 == 0) goto L40
            r5.zzg()
        L40:
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzc
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            return
        Le:
            r1.zzh(r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            r0.zzh(r1)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            com.google.android.gms.games.internal.zzbz r0 = r1.zza
            r0.zzN()
            r2.removeOnAttachStateChangeListener(r1)
            return
    }

    public final android.os.Bundle zza() {
            r1 = this;
            com.google.android.gms.internal.games.zzfq r0 = r1.zzb
            android.os.Bundle r0 = r0.zza()
            return r0
    }

    public final android.os.IBinder zzb() {
            r1 = this;
            com.google.android.gms.internal.games.zzfq r0 = r1.zzb
            android.os.IBinder r0 = r0.zza
            return r0
    }

    public final com.google.android.gms.internal.games.zzfq zzd() {
            r1 = this;
            com.google.android.gms.internal.games.zzfq r0 = r1.zzb
            return r0
    }

    @android.annotation.TargetApi(16)
    public final void zze(android.view.View r4) {
            r3 = this;
            com.google.android.gms.games.internal.zzbz r0 = r3.zza
            r0.zzN()
            java.lang.ref.WeakReference r0 = r3.zzc
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            com.google.android.gms.games.internal.zzbz r1 = r3.zza
            android.content.Context r1 = r1.getContext()
            if (r0 != 0) goto L25
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L25
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
        L25:
            if (r0 == 0) goto L3b
            r0.removeOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBean()
            if (r1 == 0) goto L38
            r0.removeOnGlobalLayoutListener(r3)
            goto L3b
        L38:
            r0.removeGlobalOnLayoutListener(r3)
        L3b:
            r0 = 0
            r3.zzc = r0
            com.google.android.gms.games.internal.zzbz r0 = r3.zza
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "PopupManager"
            if (r4 != 0) goto L66
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L66
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r0.findViewById(r2)     // Catch: java.lang.IllegalStateException -> L56
            goto L57
        L56:
        L57:
            if (r4 != 0) goto L61
            android.view.Window r4 = r0.getWindow()
            android.view.View r4 = r4.getDecorView()
        L61:
            java.lang.String r0 = "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments"
            com.google.android.gms.internal.games.zzft.zzd(r1, r0)
        L66:
            if (r4 == 0) goto L7d
            r3.zzh(r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.zzc = r0
            r4.addOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            r4.addOnGlobalLayoutListener(r3)
            return
        L7d:
            java.lang.String r4 = "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view."
            com.google.android.gms.internal.games.zzft.zza(r1, r4)
            return
    }

    public final void zzf(int r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzfq r0 = r1.zzb
            r0.zzb = r2
            return
    }

    public final void zzg() {
            r3 = this;
            com.google.android.gms.internal.games.zzfq r0 = r3.zzb
            android.os.IBinder r1 = r0.zza
            if (r1 == 0) goto L13
            com.google.android.gms.games.internal.zzbz r2 = r3.zza
            android.os.Bundle r0 = r0.zza()
            r2.zzaU(r1, r0)
            r0 = 0
        L10:
            r3.zzd = r0
            return
        L13:
            r0 = 1
            goto L10
    }
}
