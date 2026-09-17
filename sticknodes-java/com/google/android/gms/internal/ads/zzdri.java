package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdri {
    private android.content.Context zza;
    private android.widget.PopupWindow zzb;

    public zzdri() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void zza(android.content.Context r7, android.view.View r8) {
            r6 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            if (r0 == 0) goto L61
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r0 == 0) goto Ld
            goto L61
        Ld:
            boolean r0 = r7 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L59
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L24
            goto L59
        L24:
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L2e
            goto L59
        L2e:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r7)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            r2.addView(r8, r4, r4)
            android.widget.PopupWindow r8 = new android.widget.PopupWindow
            r3 = 1
            r5 = 0
            r8.<init>(r2, r3, r3, r5)
            r8.setOutsideTouchable(r3)
            r8.setClippingEnabled(r5)
            java.lang.String r2 = "Displaying the 1x1 popup off the screen."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L59
            r8.showAtLocation(r0, r5, r4, r4)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r8 = r1
        L5a:
            r6.zzb = r8
            if (r8 != 0) goto L5f
            r7 = r1
        L5f:
            r6.zza = r7
        L61:
            return
    }

    public final void zzb() {
            r2 = this;
            android.content.Context r0 = r2.zza
            if (r0 == 0) goto L27
            android.widget.PopupWindow r1 = r2.zzb
            if (r1 != 0) goto L9
            goto L27
        L9:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L15
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L22
        L15:
            android.widget.PopupWindow r0 = r2.zzb
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L22
            android.widget.PopupWindow r0 = r2.zzb
            r0.dismiss()
        L22:
            r0 = 0
            r2.zza = r0
            r2.zzb = r0
        L27:
            return
    }
}
