package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbja implements com.google.android.gms.internal.ads.zzbjw {
    zzbja() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r6, java.util.Map r7) {
            r5 = this;
            com.google.android.gms.internal.ads.zzcfo r6 = (com.google.android.gms.internal.ads.zzcfo) r6
            android.content.Context r7 = r6.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            com.google.android.gms.ads.internal.zzu.zzp()
            r0 = r6
            android.view.View r0 = (android.view.View) r0
            android.util.DisplayMetrics r7 = com.google.android.gms.ads.internal.util.zzt.zzt(r7)
            int r1 = r7.widthPixels
            int r7 = r7.heightPixels
            r2 = 2
            int[] r2 = new int[r2]
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.getLocationInWindow(r2)
            r0 = 0
            r0 = r2[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "xInPixels"
            r3.put(r4, r0)
            r0 = 1
            r0 = r2[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "yInPixels"
            r3.put(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "windowWidthInPixels"
            r3.put(r1, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "windowHeightInPixels"
            r3.put(r0, r7)
            java.lang.String r7 = "locationReady"
            r6.zzd(r7, r3)
            java.lang.String r6 = "GET LOCATION COMPILED"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return
    }
}
