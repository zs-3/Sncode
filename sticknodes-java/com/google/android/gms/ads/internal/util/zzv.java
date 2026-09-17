package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.TargetApi(24)
/* loaded from: classes.dex */
public class zzv extends com.google.android.gms.ads.internal.util.zzu {
    public zzv() {
            r0 = this;
            r0.<init>()
            return
    }

    static final boolean zze(int r0, int r1, int r2) {
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            if (r0 > r2) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzd(android.app.Activity r10, android.content.res.Configuration r11) {
            r9 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeJ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeL
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            boolean r10 = r10.isInMultiWindowMode()
            return r10
        L2b:
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r0 = r11.screenHeightDp
            int r0 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r10, r0)
            int r11 = r11.screenWidthDp
            int r11 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r10, r11)
            android.content.Context r2 = r10.getApplicationContext()
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            com.google.android.gms.ads.internal.zzu.zzp()
            android.util.DisplayMetrics r2 = com.google.android.gms.ads.internal.util.zzt.zzt(r2)
            int r3 = r2.heightPixels
            int r2 = r2.widthPixels
            android.content.res.Resources r4 = r10.getResources()
            java.lang.String r5 = "status_bar_height"
            java.lang.String r6 = "dimen"
            java.lang.String r7 = "android"
            int r4 = r4.getIdentifier(r5, r6, r7)
            if (r4 <= 0) goto L6a
            android.content.res.Resources r5 = r10.getResources()
            int r4 = r5.getDimensionPixelSize(r4)
            goto L6b
        L6a:
            r4 = 0
        L6b:
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            double r5 = (double) r10
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r5 = r5 + r7
            long r5 = java.lang.Math.round(r5)
            int r10 = (int) r5
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzeH
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r10 = r10 * r5
            int r0 = r0 + r4
            boolean r0 = zze(r3, r0, r10)
            r3 = 1
            if (r0 == 0) goto La0
            boolean r10 = zze(r2, r11, r10)
            if (r10 == 0) goto L9f
            goto La1
        L9f:
            return r3
        La0:
            r1 = 1
        La1:
            return r1
    }
}
