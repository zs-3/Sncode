package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.TargetApi(28)
/* loaded from: classes.dex */
public class zzy extends com.google.android.gms.ads.internal.util.zzw {
    public zzy() {
            r0 = this;
            r0.<init>()
            return
    }

    static final /* synthetic */ android.view.WindowInsets zzl(android.app.Activity r9, android.view.View r10, android.view.WindowInsets r11) {
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            java.lang.String r0 = r0.zzm()
            r1 = 0
            if (r0 != 0) goto L85
            android.view.DisplayCutout r0 = r11.getDisplayCutout()
            java.lang.String r2 = ""
            if (r0 == 0) goto L7a
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r3 = r3.zzi()
            java.util.List r0 = r0.getBoundingRects()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r0.next()
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            java.util.Locale r5 = java.util.Locale.US
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r7 = r4.left
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            r7 = 1
            int r8 = r4.top
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 2
            int r8 = r4.right
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 3
            int r4 = r4.bottom
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            java.lang.String r4 = "%d,%d,%d,%d"
            java.lang.String r4 = java.lang.String.format(r5, r4, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L6d
            java.lang.String r5 = "|"
            java.lang.String r2 = r2.concat(r5)
        L6d:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.concat(r4)
            goto L27
        L76:
            r3.zzD(r2)
            goto L85
        L7a:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            r0.zzD(r2)
        L85:
            zzn(r1, r9)
            android.view.WindowInsets r9 = r10.onApplyWindowInsets(r11)
            return r9
    }

    private static final void zzn(boolean r3, android.app.Activity r4) {
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager$LayoutParams r0 = r4.getAttributes()
            int r1 = r0.layoutInDisplayCutoutMode
            r2 = 1
            if (r2 == r3) goto Le
            r2 = 2
        Le:
            if (r2 == r1) goto L15
            r0.layoutInDisplayCutoutMode = r2
            r4.setAttributes(r0)
        L15:
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzj(android.media.AudioManager r2) {
            r1 = this;
            r0 = 3
            int r2 = r2.getStreamMinVolume(r0)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzk(android.app.Activity r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbj
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            java.lang.String r0 = r0.zzm()
            if (r0 != 0) goto L3a
            boolean r0 = r3.isInMultiWindowMode()
            if (r0 != 0) goto L3a
            r0 = 1
            zzn(r0, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            com.google.android.gms.ads.internal.util.zzx r1 = new com.google.android.gms.ads.internal.util.zzx
            r1.<init>(r2, r3)
            r0.setOnApplyWindowInsetsListener(r1)
        L3a:
            return
    }
}
