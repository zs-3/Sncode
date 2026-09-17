package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbje implements com.google.android.gms.internal.ads.zzbjw {
    zzbje() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r5, java.util.Map r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzcfo r5 = (com.google.android.gms.internal.ads.zzcfo) r5
            java.lang.String r0 = "appId"
            java.lang.Object r1 = r6.get(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L16
            java.lang.String r5 = "Missing App Id, cannot show LMD Overlay without it"
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return
        L16:
            com.google.android.gms.internal.ads.zzfwm r1 = com.google.android.gms.internal.ads.zzfwn.zzl()
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.zzb(r0)
            int r0 = r5.getWidth()
            r1.zzh(r0)
            android.view.View r0 = r5.zzF()
            android.os.IBinder r0 = r0.getWindowToken()
            r1.zzg(r0)
            java.lang.String r0 = "gravityX"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L5e
            java.lang.String r2 = "gravityY"
            boolean r3 = r6.containsKey(r2)
            if (r3 == 0) goto L5e
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            r0 = r0 | r2
            r1.zzd(r0)
            goto L63
        L5e:
            r0 = 81
            r1.zzd(r0)
        L63:
            java.lang.String r0 = "verticalMargin"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L79
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            float r0 = java.lang.Float.parseFloat(r0)
            r1.zze(r0)
            goto L7f
        L79:
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            r1.zze(r0)
        L7f:
            java.lang.String r0 = "enifd"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L90
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            r1.zza(r6)
        L90:
            com.google.android.gms.ads.internal.overlay.zzz r6 = com.google.android.gms.ads.internal.zzu.zzj()     // Catch: java.lang.NullPointerException -> L9c
            com.google.android.gms.internal.ads.zzfwn r0 = r1.zzi()     // Catch: java.lang.NullPointerException -> L9c
            r6.zzj(r5, r0)     // Catch: java.lang.NullPointerException -> L9c
            return
        L9c:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "DefaultGmsgHandlers.ShowLMDOverlay"
            r6.zzw(r5, r0)
            java.lang.String r5 = "Missing parameters for LMD Overlay show request"
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return
    }
}
