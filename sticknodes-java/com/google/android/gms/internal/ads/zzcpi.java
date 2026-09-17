package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpi implements com.google.android.gms.internal.ads.zzbog {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzayr zzb;
    private final android.os.PowerManager zzc;

    public zzcpi(android.content.Context r1, com.google.android.gms.internal.ads.zzayr r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            java.lang.String r2 = "power"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            r0.zzc = r1
            return
    }

    public final org.json.JSONObject zza(com.google.android.gms.internal.ads.zzcpl r13) throws org.json.JSONException {
            r12 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.google.android.gms.internal.ads.zzayu r2 = r13.zzf
            if (r2 != 0) goto L15
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            goto L24c
        L15:
            com.google.android.gms.internal.ads.zzayr r3 = r12.zzb
            org.json.JSONObject r3 = r3.zzd()
            if (r3 == 0) goto L255
            boolean r3 = r2.zza
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.google.android.gms.internal.ads.zzayr r5 = r12.zzb
            java.lang.String r5 = r5.zzb()
            java.lang.String r6 = "afmaVersion"
            org.json.JSONObject r5 = r4.put(r6, r5)
            com.google.android.gms.internal.ads.zzayr r6 = r12.zzb
            org.json.JSONObject r6 = r6.zzd()
            java.lang.String r7 = "activeViewJSON"
            org.json.JSONObject r5 = r5.put(r7, r6)
            long r6 = r13.zzd
            java.lang.String r8 = "timestamp"
            org.json.JSONObject r5 = r5.put(r8, r6)
            com.google.android.gms.internal.ads.zzayr r6 = r12.zzb
            java.lang.String r6 = r6.zza()
            java.lang.String r7 = "adFormat"
            org.json.JSONObject r5 = r5.put(r7, r6)
            com.google.android.gms.internal.ads.zzayr r6 = r12.zzb
            java.lang.String r6 = r6.zzc()
            java.lang.String r7 = "hashCode"
            org.json.JSONObject r5 = r5.put(r7, r6)
            java.lang.String r6 = "isMraid"
            r7 = 0
            org.json.JSONObject r5 = r5.put(r6, r7)
            java.lang.String r6 = "isStopped"
            org.json.JSONObject r5 = r5.put(r6, r7)
            boolean r6 = r13.zzb
            java.lang.String r7 = "isPaused"
            org.json.JSONObject r5 = r5.put(r7, r6)
            com.google.android.gms.internal.ads.zzayr r6 = r12.zzb
            boolean r6 = r6.zze()
            java.lang.String r7 = "isNative"
            org.json.JSONObject r5 = r5.put(r7, r6)
            android.os.PowerManager r6 = r12.zzc
            boolean r6 = r6.isInteractive()
            java.lang.String r7 = "isScreenOn"
            org.json.JSONObject r5 = r5.put(r7, r6)
            com.google.android.gms.ads.internal.util.zzac r6 = com.google.android.gms.ads.internal.zzu.zzr()
            boolean r6 = r6.zze()
            java.lang.String r7 = "appMuted"
            org.json.JSONObject r5 = r5.put(r7, r6)
            com.google.android.gms.ads.internal.util.zzac r6 = com.google.android.gms.ads.internal.zzu.zzr()
            float r6 = r6.zza()
            double r6 = (double) r6
            java.lang.String r8 = "appVolume"
            org.json.JSONObject r5 = r5.put(r8, r6)
            android.content.Context r6 = r12.zza
            android.content.Context r6 = r6.getApplicationContext()
            float r6 = com.google.android.gms.ads.internal.util.zzac.zzb(r6)
            double r6 = (double) r6
            java.lang.String r8 = "deviceVolume"
            r5.put(r8, r6)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.content.Context r6 = r12.zza
            java.lang.String r7 = "window"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            int r7 = r6.getWidth()
            r5.right = r7
            int r6 = r6.getHeight()
            r5.bottom = r6
            android.content.Context r5 = r12.zza
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = r2.zzb
            java.lang.String r7 = "windowVisibility"
            org.json.JSONObject r6 = r4.put(r7, r6)
            java.lang.String r7 = "isAttachedToWindow"
            org.json.JSONObject r3 = r6.put(r7, r3)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            android.graphics.Rect r7 = r2.zzc
            int r7 = r7.top
            java.lang.String r8 = "top"
            org.json.JSONObject r6 = r6.put(r8, r7)
            android.graphics.Rect r7 = r2.zzc
            int r7 = r7.bottom
            java.lang.String r9 = "bottom"
            org.json.JSONObject r6 = r6.put(r9, r7)
            android.graphics.Rect r7 = r2.zzc
            int r7 = r7.left
            java.lang.String r10 = "left"
            org.json.JSONObject r6 = r6.put(r10, r7)
            android.graphics.Rect r7 = r2.zzc
            int r7 = r7.right
            java.lang.String r11 = "right"
            org.json.JSONObject r6 = r6.put(r11, r7)
            java.lang.String r7 = "viewBox"
            org.json.JSONObject r3 = r3.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            android.graphics.Rect r7 = r2.zzd
            int r7 = r7.top
            org.json.JSONObject r6 = r6.put(r8, r7)
            android.graphics.Rect r7 = r2.zzd
            int r7 = r7.bottom
            org.json.JSONObject r6 = r6.put(r9, r7)
            android.graphics.Rect r7 = r2.zzd
            int r7 = r7.left
            org.json.JSONObject r6 = r6.put(r10, r7)
            android.graphics.Rect r7 = r2.zzd
            int r7 = r7.right
            org.json.JSONObject r6 = r6.put(r11, r7)
            java.lang.String r7 = "adBox"
            org.json.JSONObject r3 = r3.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            android.graphics.Rect r7 = r2.zze
            int r7 = r7.top
            org.json.JSONObject r6 = r6.put(r8, r7)
            android.graphics.Rect r7 = r2.zze
            int r7 = r7.bottom
            org.json.JSONObject r6 = r6.put(r9, r7)
            android.graphics.Rect r7 = r2.zze
            int r7 = r7.left
            org.json.JSONObject r6 = r6.put(r10, r7)
            android.graphics.Rect r7 = r2.zze
            int r7 = r7.right
            org.json.JSONObject r6 = r6.put(r11, r7)
            java.lang.String r7 = "globalVisibleBox"
            org.json.JSONObject r3 = r3.put(r7, r6)
            boolean r6 = r2.zzf
            java.lang.String r7 = "globalVisibleBoxVisible"
            org.json.JSONObject r3 = r3.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            android.graphics.Rect r7 = r2.zzg
            int r7 = r7.top
            org.json.JSONObject r6 = r6.put(r8, r7)
            android.graphics.Rect r7 = r2.zzg
            int r7 = r7.bottom
            org.json.JSONObject r6 = r6.put(r9, r7)
            android.graphics.Rect r7 = r2.zzg
            int r7 = r7.left
            org.json.JSONObject r6 = r6.put(r10, r7)
            android.graphics.Rect r7 = r2.zzg
            int r7 = r7.right
            org.json.JSONObject r6 = r6.put(r11, r7)
            java.lang.String r7 = "localVisibleBox"
            org.json.JSONObject r3 = r3.put(r7, r6)
            boolean r6 = r2.zzh
            java.lang.String r7 = "localVisibleBoxVisible"
            org.json.JSONObject r3 = r3.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            android.graphics.Rect r7 = r2.zzi
            int r7 = r7.top
            org.json.JSONObject r6 = r6.put(r8, r7)
            android.graphics.Rect r7 = r2.zzi
            int r7 = r7.bottom
            org.json.JSONObject r6 = r6.put(r9, r7)
            android.graphics.Rect r7 = r2.zzi
            int r7 = r7.left
            org.json.JSONObject r6 = r6.put(r10, r7)
            android.graphics.Rect r7 = r2.zzi
            int r7 = r7.right
            org.json.JSONObject r6 = r6.put(r11, r7)
            java.lang.String r7 = "hitBox"
            org.json.JSONObject r3 = r3.put(r7, r6)
            float r5 = r5.density
            double r5 = (double) r5
            java.lang.String r7 = "screenDensity"
            r3.put(r7, r5)
            boolean r3 = r13.zza
            java.lang.String r5 = "isVisible"
            r4.put(r5, r3)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbt
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r5.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L23c
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.List r2 = r2.zzk
            if (r2 == 0) goto L237
            java.util.Iterator r2 = r2.iterator()
        L20a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L237
            java.lang.Object r5 = r2.next()
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            int r7 = r5.top
            org.json.JSONObject r6 = r6.put(r8, r7)
            int r7 = r5.bottom
            org.json.JSONObject r6 = r6.put(r9, r7)
            int r7 = r5.left
            org.json.JSONObject r6 = r6.put(r10, r7)
            int r5 = r5.right
            org.json.JSONObject r5 = r6.put(r11, r5)
            r3.put(r5)
            goto L20a
        L237:
            java.lang.String r2 = "scrollableContainerBoxes"
            r4.put(r2, r3)
        L23c:
            java.lang.String r13 = r13.zze
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L24b
            java.lang.String r13 = "doneReasonCode"
            java.lang.String r2 = "u"
            r4.put(r13, r2)
        L24b:
            r13 = r4
        L24c:
            r0.put(r13)
            java.lang.String r13 = "units"
            r1.put(r13, r0)
            return r1
        L255:
            org.json.JSONException r13 = new org.json.JSONException
            java.lang.String r0 = "Active view Info cannot be null."
            r13.<init>(r0)
            throw r13
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* bridge */ /* synthetic */ org.json.JSONObject zzb(java.lang.Object r1) throws org.json.JSONException {
            r0 = this;
            com.google.android.gms.internal.ads.zzcpl r1 = (com.google.android.gms.internal.ads.zzcpl) r1
            org.json.JSONObject r1 = r0.zza(r1)
            return r1
    }
}
