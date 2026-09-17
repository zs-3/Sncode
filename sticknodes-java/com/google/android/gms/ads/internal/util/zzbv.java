package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbv {
    public static android.graphics.Point zza(android.view.MotionEvent r2, android.view.View r3) {
            int[] r3 = zzj(r3)
            float r0 = r2.getRawX()
            int r0 = (int) r0
            r1 = 0
            r1 = r3[r1]
            int r0 = r0 - r1
            float r2 = r2.getRawY()
            int r2 = (int) r2
            r1 = 1
            r3 = r3[r1]
            int r2 = r2 - r3
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r0, r2)
            return r3
    }

    public static android.view.WindowManager.LayoutParams zzb() {
            android.view.WindowManager$LayoutParams r6 = new android.view.WindowManager$LayoutParams
            r5 = -2
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r5
            r2 = r5
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.flags = r0
            r0 = 2
            r6.type = r0
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r6.gravity = r0
            return r6
    }

    public static org.json.JSONObject zzc(java.lang.String r7, android.content.Context r8, android.graphics.Point r9, android.graphics.Point r10) {
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5d
            r1.<init>()     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "click_point"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5a
            r3.<init>()     // Catch: java.lang.Exception -> L5a
            java.lang.String r4 = "x"
            int r5 = r10.x     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            com.google.android.gms.ads.internal.util.client.zzf r6 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            int r5 = r6.zzb(r8, r5)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            java.lang.String r4 = "y"
            int r10 = r10.y     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            int r10 = r5.zzb(r8, r10)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            r3.put(r4, r10)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            java.lang.String r10 = "start_x"
            int r4 = r9.x     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            int r4 = r5.zzb(r8, r4)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            r3.put(r10, r4)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            java.lang.String r10 = "start_y"
            int r9 = r9.y     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            int r8 = r4.zzb(r8, r9)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            r3.put(r10, r8)     // Catch: org.json.JSONException -> L4b java.lang.Exception -> L5a
            r0 = r3
            goto L51
        L4b:
            r8 = move-exception
            java.lang.String r9 = "Error occurred while putting signals into JSON object."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r9, r8)     // Catch: java.lang.Exception -> L5a
        L51:
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L5a
            java.lang.String r8 = "asset_id"
            r1.put(r8, r7)     // Catch: java.lang.Exception -> L5a
            goto L64
        L5a:
            r7 = move-exception
            r0 = r1
            goto L5e
        L5d:
            r7 = move-exception
        L5e:
            java.lang.String r8 = "Error occurred while grabbing click signals."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r8, r7)
            r1 = r0
        L64:
            return r1
    }

    public static org.json.JSONObject zzd(android.content.Context r19, java.util.Map r20, java.util.Map r21, android.view.View r22, android.widget.ImageView.ScaleType r23) {
            r0 = r19
            r1 = r21
            java.lang.String r2 = "ad_view"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r20 == 0) goto L1fb
            if (r22 != 0) goto L1b
            goto L1fb
        L1b:
            int[] r9 = zzj(r22)
            java.util.Set r10 = r20.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L27:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1fb
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getValue()
            java.lang.ref.WeakReference r12 = (java.lang.ref.WeakReference) r12
            java.lang.Object r12 = r12.get()
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L27
            int[] r13 = zzj(r12)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            r20 = r10
            int r10 = r12.getMeasuredWidth()     // Catch: org.json.JSONException -> L1ea
            r16 = r8
            com.google.android.gms.ads.internal.util.client.zzf r8 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L1e4
            int r8 = r8.zzb(r0, r10)     // Catch: org.json.JSONException -> L1e4
            r15.put(r7, r8)     // Catch: org.json.JSONException -> L1e4
            int r8 = r12.getMeasuredHeight()     // Catch: org.json.JSONException -> L1e4
            com.google.android.gms.ads.internal.util.client.zzf r10 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L1e4
            int r8 = r10.zzb(r0, r8)     // Catch: org.json.JSONException -> L1e4
            r15.put(r6, r8)     // Catch: org.json.JSONException -> L1e4
            r8 = 0
            r10 = r13[r8]     // Catch: org.json.JSONException -> L1e4
            r17 = r9[r8]     // Catch: org.json.JSONException -> L1e4
            int r10 = r10 - r17
            com.google.android.gms.ads.internal.util.client.zzf r8 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L1e4
            int r8 = r8.zzb(r0, r10)     // Catch: org.json.JSONException -> L1e4
            r15.put(r5, r8)     // Catch: org.json.JSONException -> L1e4
            r8 = 1
            r10 = r13[r8]     // Catch: org.json.JSONException -> L1e4
            r17 = r9[r8]     // Catch: org.json.JSONException -> L1e4
            int r10 = r10 - r17
            com.google.android.gms.ads.internal.util.client.zzf r8 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L1e4
            int r8 = r8.zzb(r0, r10)     // Catch: org.json.JSONException -> L1e4
            r15.put(r4, r8)     // Catch: org.json.JSONException -> L1e4
            r15.put(r3, r2)     // Catch: org.json.JSONException -> L1e4
            java.lang.String r8 = "frame"
            r14.put(r8, r15)     // Catch: org.json.JSONException -> L1e4
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch: org.json.JSONException -> L1e4
            r8.<init>()     // Catch: org.json.JSONException -> L1e4
            boolean r10 = r12.getLocalVisibleRect(r8)     // Catch: org.json.JSONException -> L1e4
            if (r10 == 0) goto Lae
            org.json.JSONObject r8 = zzk(r0, r8)     // Catch: org.json.JSONException -> L1e4
            r10 = 1
            goto Ldf
        Lae:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e4
            r8.<init>()     // Catch: org.json.JSONException -> L1e4
            r10 = 0
            r8.put(r7, r10)     // Catch: org.json.JSONException -> L1e4
            r8.put(r6, r10)     // Catch: org.json.JSONException -> L1e4
            r15 = r13[r10]     // Catch: org.json.JSONException -> L1e4
            r18 = r9[r10]     // Catch: org.json.JSONException -> L1e4
            int r15 = r15 - r18
            com.google.android.gms.ads.internal.util.client.zzf r10 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L1e4
            int r10 = r10.zzb(r0, r15)     // Catch: org.json.JSONException -> L1e4
            r8.put(r5, r10)     // Catch: org.json.JSONException -> L1e4
            r10 = 1
            r13 = r13[r10]     // Catch: org.json.JSONException -> L1e4
            r15 = r9[r10]     // Catch: org.json.JSONException -> L1e4
            int r13 = r13 - r15
            com.google.android.gms.ads.internal.util.client.zzf r15 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L1e4
            int r13 = r15.zzb(r0, r13)     // Catch: org.json.JSONException -> L1e4
            r8.put(r4, r13)     // Catch: org.json.JSONException -> L1e4
            r8.put(r3, r2)     // Catch: org.json.JSONException -> L1e4
        Ldf:
            java.lang.String r13 = "visible_bounds"
            r14.put(r13, r8)     // Catch: org.json.JSONException -> L1e4
            java.lang.Object r8 = r11.getKey()     // Catch: org.json.JSONException -> L1e4
            java.lang.String r8 = (java.lang.String) r8     // Catch: org.json.JSONException -> L1e4
            java.lang.String r13 = "3010"
            boolean r8 = r8.equals(r13)     // Catch: org.json.JSONException -> L1e4
            if (r8 == 0) goto L194
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzhB     // Catch: org.json.JSONException -> L1e4
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1e4
            java.lang.Object r8 = r13.zza(r8)     // Catch: org.json.JSONException -> L1e4
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: org.json.JSONException -> L1e4
            boolean r8 = r8.booleanValue()     // Catch: org.json.JSONException -> L1e4
            if (r8 == 0) goto L111
            java.lang.String r8 = "mediaview_graphics_matrix"
            android.graphics.Matrix r13 = r12.getMatrix()     // Catch: org.json.JSONException -> L1e4
            java.lang.String r13 = r13.toShortString()     // Catch: org.json.JSONException -> L1e4
            r14.put(r8, r13)     // Catch: org.json.JSONException -> L1e4
        L111:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzhC     // Catch: org.json.JSONException -> L1e4
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1e4
            java.lang.Object r8 = r13.zza(r8)     // Catch: org.json.JSONException -> L1e4
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: org.json.JSONException -> L1e4
            boolean r8 = r8.booleanValue()     // Catch: org.json.JSONException -> L1e4
            if (r8 == 0) goto L141
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()     // Catch: org.json.JSONException -> L1e4
            java.lang.String r13 = "view_width_layout_type"
            int r15 = r8.width     // Catch: org.json.JSONException -> L1e4
            int r15 = zzl(r15)     // Catch: org.json.JSONException -> L1e4
            int r15 = r15 + (-1)
            r14.put(r13, r15)     // Catch: org.json.JSONException -> L1e4
            java.lang.String r13 = "view_height_layout_type"
            int r8 = r8.height     // Catch: org.json.JSONException -> L1e4
            int r8 = zzl(r8)     // Catch: org.json.JSONException -> L1e4
            int r8 = r8 + (-1)
            r14.put(r13, r8)     // Catch: org.json.JSONException -> L1e4
        L141:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzhD     // Catch: org.json.JSONException -> L1e4
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1e4
            java.lang.Object r8 = r13.zza(r8)     // Catch: org.json.JSONException -> L1e4
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: org.json.JSONException -> L1e4
            boolean r8 = r8.booleanValue()     // Catch: org.json.JSONException -> L1e4
            if (r8 == 0) goto L189
            java.lang.String r8 = "view_path"
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: org.json.JSONException -> L1e4
            r13.<init>()     // Catch: org.json.JSONException -> L1e4
            int r15 = r12.getId()     // Catch: org.json.JSONException -> L1e4
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: org.json.JSONException -> L1e4
            r13.add(r15)     // Catch: org.json.JSONException -> L1e4
            android.view.ViewParent r15 = r12.getParent()     // Catch: org.json.JSONException -> L1e4
        L169:
            boolean r10 = r15 instanceof android.view.View     // Catch: org.json.JSONException -> L1e4
            if (r10 == 0) goto L180
            r10 = r15
            android.view.View r10 = (android.view.View) r10     // Catch: org.json.JSONException -> L1e4
            int r10 = r10.getId()     // Catch: org.json.JSONException -> L1e4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: org.json.JSONException -> L1e4
            r13.add(r10)     // Catch: org.json.JSONException -> L1e4
            android.view.ViewParent r15 = r15.getParent()     // Catch: org.json.JSONException -> L1e4
            goto L169
        L180:
            java.lang.String r10 = "/"
            java.lang.String r10 = android.text.TextUtils.join(r10, r13)     // Catch: org.json.JSONException -> L1e4
            r14.put(r8, r10)     // Catch: org.json.JSONException -> L1e4
        L189:
            if (r23 == 0) goto L194
            java.lang.String r8 = "mediaview_scale_type"
            int r10 = r23.ordinal()     // Catch: org.json.JSONException -> L1e4
            r14.put(r8, r10)     // Catch: org.json.JSONException -> L1e4
        L194:
            boolean r8 = r12 instanceof android.widget.TextView     // Catch: org.json.JSONException -> L1e4
            if (r8 == 0) goto L1bb
            r8 = r12
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: org.json.JSONException -> L1e4
            java.lang.String r10 = "text_color"
            int r13 = r8.getCurrentTextColor()     // Catch: org.json.JSONException -> L1e4
            r14.put(r10, r13)     // Catch: org.json.JSONException -> L1e4
            java.lang.String r10 = "font_size"
            float r13 = r8.getTextSize()     // Catch: org.json.JSONException -> L1e4
            r15 = r2
            r18 = r3
            double r2 = (double) r13
            r14.put(r10, r2)     // Catch: org.json.JSONException -> L1e7
            java.lang.String r2 = "text"
            java.lang.CharSequence r3 = r8.getText()     // Catch: org.json.JSONException -> L1e7
            r14.put(r2, r3)     // Catch: org.json.JSONException -> L1e7
            goto L1be
        L1bb:
            r15 = r2
            r18 = r3
        L1be:
            java.lang.String r2 = "is_clickable"
            if (r1 == 0) goto L1d4
            java.lang.Object r3 = r11.getKey()     // Catch: org.json.JSONException -> L1e7
            boolean r3 = r1.containsKey(r3)     // Catch: org.json.JSONException -> L1e7
            if (r3 == 0) goto L1d4
            boolean r3 = r12.isClickable()     // Catch: org.json.JSONException -> L1e7
            if (r3 == 0) goto L1d4
            r8 = 1
            goto L1d5
        L1d4:
            r8 = 0
        L1d5:
            r14.put(r2, r8)     // Catch: org.json.JSONException -> L1e7
            java.lang.Object r2 = r11.getKey()     // Catch: org.json.JSONException -> L1e7
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L1e7
            r3 = r16
            r3.put(r2, r14)     // Catch: org.json.JSONException -> L1ee
            goto L1f3
        L1e4:
            r15 = r2
            r18 = r3
        L1e7:
            r3 = r16
            goto L1ee
        L1ea:
            r15 = r2
            r18 = r3
            r3 = r8
        L1ee:
            java.lang.String r2 = "Unable to get asset views information"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
        L1f3:
            r10 = r20
            r8 = r3
            r2 = r15
            r3 = r18
            goto L27
        L1fb:
            r3 = r8
            return r3
    }

    public static org.json.JSONObject zze(android.content.Context r2, android.view.View r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r3 == 0) goto L25
            java.lang.String r1 = "can_show_on_lock_screen"
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: org.json.JSONException -> L20
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzn(r3)     // Catch: org.json.JSONException -> L20
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L20
            java.lang.String r3 = "is_keyguard_locked"
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: org.json.JSONException -> L20
            boolean r2 = com.google.android.gms.ads.internal.util.zzt.zzD(r2)     // Catch: org.json.JSONException -> L20
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L20
            goto L25
        L20:
            java.lang.String r2 = "Unable to get lock screen information"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
        L25:
            return r0
    }

    public static org.json.JSONObject zzf(android.view.View r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L8
            goto L5b
        L8:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhA     // Catch: java.lang.Exception -> L5b
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L5b
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L5b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L5b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L5b
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L38
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Exception -> L5b
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L5b
        L25:
            if (r6 == 0) goto L30
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L5b
            if (r1 != 0) goto L30
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L5b
            goto L25
        L30:
            if (r6 != 0) goto L33
            goto L34
        L33:
            r2 = 1
        L34:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L5b
            goto L5b
        L38:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Exception -> L5b
            android.view.ViewParent r1 = r6.getParent()     // Catch: java.lang.Exception -> L5b
        L3f:
            if (r1 == 0) goto L4a
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch: java.lang.Exception -> L5b
            if (r5 != 0) goto L4a
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L5b
            goto L3f
        L4a:
            r5 = -1
            if (r1 != 0) goto L4f
            r6 = -1
            goto L55
        L4f:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch: java.lang.Exception -> L5b
            int r6 = r1.getPositionForView(r6)     // Catch: java.lang.Exception -> L5b
        L55:
            if (r6 == r5) goto L58
            r2 = 1
        L58:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L5b
        L5b:
            return r0
    }

    public static org.json.JSONObject zzg(android.content.Context r16, android.view.View r17) {
            r0 = r16
            r1 = r17
            java.lang.String r2 = "window"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r1 != 0) goto L19
            goto L19e
        L19:
            r9 = 2
            r10 = 1
            r11 = 0
            int[] r12 = zzj(r17)     // Catch: java.lang.Exception -> Lfe
            int[] r13 = new int[r9]     // Catch: java.lang.Exception -> Lfe
            int r14 = r17.getMeasuredWidth()     // Catch: java.lang.Exception -> Lfe
            r13[r11] = r14     // Catch: java.lang.Exception -> Lfe
            int r14 = r17.getMeasuredHeight()     // Catch: java.lang.Exception -> Lfe
            r13[r10] = r14     // Catch: java.lang.Exception -> Lfe
            android.view.ViewParent r14 = r17.getParent()     // Catch: java.lang.Exception -> Lfe
        L32:
            boolean r15 = r14 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> Lfe
            if (r15 == 0) goto L59
            r15 = r14
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch: java.lang.Exception -> Lfe
            int r9 = r15.getMeasuredWidth()     // Catch: java.lang.Exception -> Lfe
            r10 = r13[r11]     // Catch: java.lang.Exception -> Lfe
            int r9 = java.lang.Math.min(r9, r10)     // Catch: java.lang.Exception -> Lfe
            r13[r11] = r9     // Catch: java.lang.Exception -> Lfe
            int r9 = r15.getMeasuredHeight()     // Catch: java.lang.Exception -> Lfe
            r10 = 1
            r15 = r13[r10]     // Catch: java.lang.Exception -> Lfe
            int r9 = java.lang.Math.min(r9, r15)     // Catch: java.lang.Exception -> Lfe
            r13[r10] = r9     // Catch: java.lang.Exception -> Lfe
            android.view.ViewParent r14 = r14.getParent()     // Catch: java.lang.Exception -> Lfe
            r9 = 2
            r10 = 1
            goto L32
        L59:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lfe
            r9.<init>()     // Catch: java.lang.Exception -> Lfe
            int r10 = r17.getMeasuredWidth()     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r10 = r14.zzb(r0, r10)     // Catch: java.lang.Exception -> Lfe
            r9.put(r7, r10)     // Catch: java.lang.Exception -> Lfe
            int r10 = r17.getMeasuredHeight()     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r10 = r14.zzb(r0, r10)     // Catch: java.lang.Exception -> Lfe
            r9.put(r6, r10)     // Catch: java.lang.Exception -> Lfe
            r10 = r12[r11]     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r10 = r14.zzb(r0, r10)     // Catch: java.lang.Exception -> Lfe
            r9.put(r5, r10)     // Catch: java.lang.Exception -> Lfe
            r10 = 1
            r14 = r12[r10]     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r10 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r10 = r10.zzb(r0, r14)     // Catch: java.lang.Exception -> Lfe
            r9.put(r4, r10)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r10 = "maximum_visible_width"
            r14 = r13[r11]     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r15 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r14 = r15.zzb(r0, r14)     // Catch: java.lang.Exception -> Lfe
            r9.put(r10, r14)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r10 = "maximum_visible_height"
            r14 = 1
            r13 = r13[r14]     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r13 = r14.zzb(r0, r13)     // Catch: java.lang.Exception -> Lfe
            r9.put(r10, r13)     // Catch: java.lang.Exception -> Lfe
            r9.put(r3, r2)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r10 = "frame"
            r8.put(r10, r9)     // Catch: java.lang.Exception -> Lfe
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lfe
            r9.<init>()     // Catch: java.lang.Exception -> Lfe
            boolean r10 = r1.getGlobalVisibleRect(r9)     // Catch: java.lang.Exception -> Lfe
            if (r10 == 0) goto Lce
            org.json.JSONObject r0 = zzk(r0, r9)     // Catch: java.lang.Exception -> Lfe
            goto Lf8
        Lce:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lfe
            r9.<init>()     // Catch: java.lang.Exception -> Lfe
            r9.put(r7, r11)     // Catch: java.lang.Exception -> Lfe
            r9.put(r6, r11)     // Catch: java.lang.Exception -> Lfe
            r6 = r12[r11]     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r7 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r6 = r7.zzb(r0, r6)     // Catch: java.lang.Exception -> Lfe
            r9.put(r5, r6)     // Catch: java.lang.Exception -> Lfe
            r5 = 1
            r6 = r12[r5]     // Catch: java.lang.Exception -> Lfe
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Exception -> Lfe
            int r0 = r5.zzb(r0, r6)     // Catch: java.lang.Exception -> Lfe
            r9.put(r4, r0)     // Catch: java.lang.Exception -> Lfe
            r9.put(r3, r2)     // Catch: java.lang.Exception -> Lfe
            r0 = r9
        Lf8:
            java.lang.String r2 = "visible_bounds"
            r8.put(r2, r0)     // Catch: java.lang.Exception -> Lfe
            goto L103
        Lfe:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L103:
            android.view.ViewParent r0 = r17.getParent()
            if (r0 == 0) goto L128
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L11e java.lang.IllegalAccessException -> L120 java.lang.SecurityException -> L122 java.lang.NoSuchMethodException -> L128
            java.lang.String r3 = "getTemplateTypeName"
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch: java.lang.reflect.InvocationTargetException -> L11e java.lang.IllegalAccessException -> L120 java.lang.SecurityException -> L122 java.lang.NoSuchMethodException -> L128
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L11e java.lang.IllegalAccessException -> L120 java.lang.SecurityException -> L122 java.lang.NoSuchMethodException -> L128
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch: java.lang.reflect.InvocationTargetException -> L11e java.lang.IllegalAccessException -> L120 java.lang.SecurityException -> L122 java.lang.NoSuchMethodException -> L128
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L11e java.lang.IllegalAccessException -> L120 java.lang.SecurityException -> L122 java.lang.NoSuchMethodException -> L128
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.reflect.InvocationTargetException -> L11e java.lang.IllegalAccessException -> L120 java.lang.SecurityException -> L122 java.lang.NoSuchMethodException -> L128
            goto L12a
        L11e:
            r0 = move-exception
            goto L123
        L120:
            r0 = move-exception
            goto L123
        L122:
            r0 = move-exception
        L123:
            java.lang.String r2 = "Cannot access method getTemplateTypeName: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L128:
            java.lang.String r0 = ""
        L12a:
            r2 = -1
            int r3 = r0.hashCode()     // Catch: org.json.JSONException -> L164
            r4 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r3 == r4) goto L144
            r4 = 2019754500(0x78630204, float:1.8417067E34)
            if (r3 == r4) goto L13a
            goto L14e
        L13a:
            java.lang.String r3 = "medium_template"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L14e
            r0 = 1
            goto L14f
        L144:
            java.lang.String r3 = "small_template"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L14e
            r0 = 0
            goto L14f
        L14e:
            r0 = -1
        L14f:
            java.lang.String r3 = "native_template_type"
            if (r0 == 0) goto L15f
            r4 = 1
            if (r0 == r4) goto L15a
            r8.put(r3, r11)     // Catch: org.json.JSONException -> L164
            goto L16a
        L15a:
            r4 = 2
            r8.put(r3, r4)     // Catch: org.json.JSONException -> L164
            goto L16a
        L15f:
            r4 = 1
            r8.put(r3, r4)     // Catch: org.json.JSONException -> L164
            goto L16a
        L164:
            r0 = move-exception
            java.lang.String r3 = "Could not log native template signal to JSON"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r0)
        L16a:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhC
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19e
            android.view.ViewGroup$LayoutParams r0 = r17.getLayoutParams()     // Catch: java.lang.Exception -> L199
            java.lang.String r1 = "view_width_layout_type"
            int r3 = r0.width     // Catch: java.lang.Exception -> L199
            int r3 = zzl(r3)     // Catch: java.lang.Exception -> L199
            int r3 = r3 + r2
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L199
            java.lang.String r1 = "view_height_layout_type"
            int r0 = r0.height     // Catch: java.lang.Exception -> L199
            int r0 = zzl(r0)     // Catch: java.lang.Exception -> L199
            int r0 = r0 + r2
            r8.put(r1, r0)     // Catch: java.lang.Exception -> L199
            goto L19e
        L199:
            java.lang.String r0 = "Unable to get native ad view layout types"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L19e:
            return r8
    }

    public static boolean zzh(android.content.Context r2, com.google.android.gms.internal.ads.zzfgh r3) {
            boolean r3 = r3.zzN
            r0 = 0
            if (r3 != 0) goto L6
            return r0
        L6:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhE
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r1.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L29
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhH
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L29:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhF
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r1.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L68
            if (r2 != 0) goto L3e
            goto L68
        L3e:
            java.lang.String r2 = r2.getPackageName()
            r1 = 59
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzc(r1)
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.internal.ads.zzfym.zzb(r1)
            java.lang.Iterable r3 = r1.zzc(r3)
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L54
            r2 = 1
            return r2
        L68:
            return r0
    }

    public static boolean zzi(int r2) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdu
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2c
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdv
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2c
            r0 = 15299999(0xe9759f, float:2.1439865E-38)
            if (r2 > r0) goto L2a
            goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public static int[] zzj(android.view.View r1) {
            r0 = 2
            int[] r0 = new int[r0]
            if (r1 == 0) goto L8
            r1.getLocationOnScreen(r0)
        L8:
            return r0
    }

    private static org.json.JSONObject zzk(android.content.Context r3, android.graphics.Rect r4) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r4.right
            int r2 = r4.left
            int r1 = r1 - r2
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r2.zzb(r3, r1)
            java.lang.String r2 = "width"
            r0.put(r2, r1)
            int r1 = r4.bottom
            int r2 = r4.top
            int r1 = r1 - r2
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r2.zzb(r3, r1)
            java.lang.String r2 = "height"
            r0.put(r2, r1)
            int r1 = r4.left
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r2.zzb(r3, r1)
            java.lang.String r2 = "x"
            r0.put(r2, r1)
            int r4 = r4.top
            com.google.android.gms.ads.internal.util.client.zzf r1 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r3 = r1.zzb(r3, r4)
            java.lang.String r4 = "y"
            r0.put(r4, r3)
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "self"
            r0.put(r3, r4)
            return r0
    }

    private static int zzl(int r1) {
            r0 = -2
            if (r1 == r0) goto La
            r0 = -1
            if (r1 == r0) goto L8
            r1 = 2
            return r1
        L8:
            r1 = 3
            return r1
        La:
            r1 = 4
            return r1
    }
}
