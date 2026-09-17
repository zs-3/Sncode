package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdj implements com.google.android.gms.internal.ads.zzbjw {
    private boolean zza;

    public zzcdj() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int zzb(android.content.Context r1, java.util.Map r2, java.lang.String r3, int r4) {
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L30
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.NumberFormatException -> L14
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L14
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r1, r0)     // Catch: java.lang.NumberFormatException -> L14
            goto L30
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not parse "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " in a video GMSG: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
        L30:
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r1 == 0) goto L5f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Parse pixels for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ", got string "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", int "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r1)
        L5f:
            return r4
    }

    private static void zzc(com.google.android.gms.internal.ads.zzcbx r5, java.util.Map r6) {
            java.lang.String r0 = "minBufferMs"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "maxBufferMs"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "bufferForPlaybackMs"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "bufferForPlaybackAfterRebufferMs"
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "socketReceiveBufferSize"
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            if (r0 == 0) goto L31
            int r4 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L56
            r5.zzB(r4)     // Catch: java.lang.NumberFormatException -> L56
        L31:
            if (r1 == 0) goto L3a
            int r4 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L56
            r5.zzA(r4)     // Catch: java.lang.NumberFormatException -> L56
        L3a:
            if (r2 == 0) goto L43
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L56
            r5.zzy(r2)     // Catch: java.lang.NumberFormatException -> L56
        L43:
            if (r3 == 0) goto L4c
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L56
            r5.zzz(r2)     // Catch: java.lang.NumberFormatException -> L56
        L4c:
            if (r6 == 0) goto L68
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L56
            r5.zzD(r6)     // Catch: java.lang.NumberFormatException -> L56
            return
        L56:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            r6 = 1
            r5[r6] = r1
            java.lang.String r6 = "Could not parse buffer parameters in loadControl video GMSG: (%s, %s)"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
        L68:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r22, java.util.Map r23) {
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r22
            com.google.android.gms.internal.ads.zzccj r2 = (com.google.android.gms.internal.ads.zzccj) r2
            java.lang.String r3 = "action"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L18
            java.lang.String r1 = "Action missing from video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L18:
            java.lang.String r4 = "playerId"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L2f
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L30
        L2f:
            r4 = 0
        L30:
            com.google.android.gms.internal.ads.zzcby r5 = r2.zzo()
            if (r5 == 0) goto L3f
            com.google.android.gms.internal.ads.zzcby r5 = r2.zzo()
            java.lang.Integer r5 = r5.zzb()
            goto L40
        L3f:
            r5 = 0
        L40:
            java.lang.String r7 = "load"
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L68
            if (r5 == 0) goto L68
            boolean r10 = r4.equals(r5)
            if (r10 != 0) goto L68
            boolean r10 = r3.equals(r7)
            if (r10 == 0) goto L55
            goto L68
        L55:
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r9] = r4
            r2[r8] = r5
            java.lang.String r3 = "Event intended for player %s, but sent to player %d - event ignored"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
        L68:
            r5 = 3
            boolean r5 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r5)
            if (r5 == 0) goto L99
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r1)
            java.lang.String r10 = "google.afma.Notify_dt"
            r5.remove(r10)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Video GMSG: "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = " "
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
        L99:
            java.lang.String r5 = "background"
            boolean r5 = r3.equals(r5)
            java.lang.String r10 = "color"
            if (r5 == 0) goto Lc3
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto Lb5
            java.lang.String r1 = "Color parameter missing from background video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        Lb5:
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.IllegalArgumentException -> Lbd
            r2.setBackgroundColor(r1)     // Catch: java.lang.IllegalArgumentException -> Lbd
            return
        Lbd:
            java.lang.String r1 = "Invalid color parameter in background video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        Lc3:
            java.lang.String r5 = "playerBackground"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto Leb
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto Ldd
            java.lang.String r1 = "Color parameter missing from playerBackground video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        Ldd:
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.IllegalArgumentException -> Le5
            r2.zzB(r1)     // Catch: java.lang.IllegalArgumentException -> Le5
            return
        Le5:
            java.lang.String r1 = "Invalid color parameter in playerBackground video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        Leb:
            java.lang.String r5 = "decoderProps"
            boolean r10 = r3.equals(r5)
            java.lang.String r11 = "onVideoEvent"
            java.lang.String r12 = "event"
            if (r10 == 0) goto L146
            java.lang.String r3 = "mimeTypes"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L119
            java.lang.String r1 = "No MIME types specified for decoder properties inspection."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r12, r5)
            java.lang.String r3 = "error"
            java.lang.String r4 = "missingMimeTypes"
            r1.put(r3, r4)
            r2.zzd(r11, r1)
            return
        L119:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r6 = ","
            java.lang.String[] r1 = r1.split(r6)
            int r6 = r1.length
        L125:
            if (r9 >= r6) goto L137
            r7 = r1[r9]
            java.lang.String r8 = r7.trim()
            java.util.List r8 = com.google.android.gms.ads.internal.util.zzcj.zza(r8)
            r4.put(r7, r8)
            int r9 = r9 + 1
            goto L125
        L137:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r12, r5)
            r1.put(r3, r4)
            r2.zzd(r11, r1)
            return
        L146:
            com.google.android.gms.internal.ads.zzcby r5 = r2.zzo()
            if (r5 != 0) goto L152
            java.lang.String r1 = "Could not get underlay container for a video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L152:
            java.lang.String r10 = "new"
            boolean r10 = r3.equals(r10)
            java.lang.String r13 = "position"
            boolean r13 = r3.equals(r13)
            java.lang.String r14 = "y"
            java.lang.String r15 = "x"
            if (r10 != 0) goto L364
            if (r13 == 0) goto L168
            goto L364
        L168:
            com.google.android.gms.internal.ads.zzcgq r10 = r2.zzq()
            java.lang.String r13 = "currentTime"
            if (r10 == 0) goto L1a5
            java.lang.String r6 = "timeupdate"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L198
            java.lang.Object r1 = r1.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L186
            java.lang.String r1 = "currentTime parameter missing from timeupdate video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L186:
            float r2 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L18e
            r10.zzt(r2)     // Catch: java.lang.NumberFormatException -> L18e
            return
        L18e:
            java.lang.String r2 = "Could not parse currentTime parameter from timeupdate video GMSG: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L198:
            java.lang.String r6 = "skip"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L1a1
            goto L1a5
        L1a1:
            r10.zzu()
            return
        L1a5:
            com.google.android.gms.internal.ads.zzcbx r5 = r5.zza()
            if (r5 != 0) goto L1b9
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r3 = "no_video_view"
            r1.put(r12, r3)
            r2.zzd(r11, r1)
            return
        L1b9:
            java.lang.String r6 = "click"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L1e1
            android.content.Context r2 = r2.getContext()
            int r3 = zzb(r2, r1, r15, r9)
            int r1 = zzb(r2, r1, r14, r9)
            float r11 = (float) r3
            float r12 = (float) r1
            long r8 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r13 = 0
            r6 = r8
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
            r5.zzx(r1)
            r1.recycle()
            return
        L1e1:
            boolean r6 = r3.equals(r13)
            if (r6 == 0) goto L20e
            java.lang.String r2 = "time"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1f7
            java.lang.String r1 = "Time parameter missing from currentTime video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L1f7:
            float r2 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L204
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch: java.lang.NumberFormatException -> L204
            r5.zzw(r2)     // Catch: java.lang.NumberFormatException -> L204
            return
        L204:
            java.lang.String r2 = "Could not parse time parameter from currentTime video GMSG: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L20e:
            java.lang.String r6 = "hide"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L21b
            r1 = 4
            r5.setVisibility(r1)
            return
        L21b:
            java.lang.String r6 = "remove"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L229
            r1 = 8
            r5.setVisibility(r1)
            return
        L229:
            boolean r6 = r3.equals(r7)
            if (r6 == 0) goto L233
            r5.zzr(r4)
            return
        L233:
            java.lang.String r4 = "loadControl"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L23f
            zzc(r5, r1)
            return
        L23f:
            java.lang.String r4 = "muted"
            boolean r6 = r3.equals(r4)
            if (r6 == 0) goto L25b
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L257
            r5.zzs()
            return
        L257:
            r5.zzI()
            return
        L25b:
            java.lang.String r4 = "pause"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L267
            r5.zzu()
            return
        L267:
            java.lang.String r4 = "play"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L273
            r5.zzv()
            return
        L273:
            java.lang.String r4 = "show"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L27f
            r5.setVisibility(r9)
            return
        L27f:
            java.lang.String r4 = "src"
            boolean r6 = r3.equals(r4)
            if (r6 == 0) goto L2ff
            java.lang.Object r3 = r1.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "periodicReportIntervalMs"
            boolean r6 = r1.containsKey(r4)
            if (r6 != 0) goto L297
        L295:
            r6 = 0
            goto L2ba
        L297:
            java.lang.Object r6 = r1.get(r4)     // Catch: java.lang.NumberFormatException -> L2a6
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L2a6
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L2a6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L2a6
            goto L2ba
        L2a6:
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Video gmsg invalid numeric parameter 'periodicReportIntervalMs': "
            java.lang.String r4 = r6.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            goto L295
        L2ba:
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r9] = r3
            java.lang.String r7 = "demuxed"
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L2f2
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2e5
            r4.<init>(r1)     // Catch: org.json.JSONException -> L2e5
            int r7 = r4.length()     // Catch: org.json.JSONException -> L2e5
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: org.json.JSONException -> L2e5
            r10 = 0
        L2d4:
            int r11 = r4.length()     // Catch: org.json.JSONException -> L2e5
            if (r10 >= r11) goto L2e3
            java.lang.String r11 = r4.getString(r10)     // Catch: org.json.JSONException -> L2e5
            r7[r10] = r11     // Catch: org.json.JSONException -> L2e5
            int r10 = r10 + 1
            goto L2d4
        L2e3:
            r4 = r7
            goto L2f2
        L2e5:
            java.lang.String r4 = "Malformed demuxed URL list for playback: "
            java.lang.String r1 = r4.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r9] = r3
        L2f2:
            if (r6 == 0) goto L2fb
            int r1 = r6.intValue()
            r2.zzA(r1)
        L2fb:
            r5.zzE(r3, r4)
            return
        L2ff:
            java.lang.String r4 = "touchMove"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L326
            android.content.Context r3 = r2.getContext()
            java.lang.String r4 = "dx"
            int r4 = zzb(r3, r1, r4, r9)
            java.lang.String r6 = "dy"
            int r1 = zzb(r3, r1, r6, r9)
            float r3 = (float) r4
            float r1 = (float) r1
            r5.zzH(r3, r1)
            boolean r1 = r0.zza
            if (r1 != 0) goto L47b
            r2.zzu()
            r0.zza = r8
            return
        L326:
            java.lang.String r2 = "volume"
            boolean r4 = r3.equals(r2)
            if (r4 == 0) goto L34e
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L33c
            java.lang.String r1 = "Level parameter missing from volume video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L33c:
            float r2 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L344
            r5.zzG(r2)     // Catch: java.lang.NumberFormatException -> L344
            return
        L344:
            java.lang.String r2 = "Could not parse volume parameter from volume video GMSG: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L34e:
            java.lang.String r1 = "watermark"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L35a
            r5.zzn()
            return
        L35a:
            java.lang.String r1 = "Unknown video action: "
            java.lang.String r1 = r1.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L364:
            android.content.Context r3 = r2.getContext()
            int r4 = zzb(r3, r1, r15, r9)
            int r15 = zzb(r3, r1, r14, r9)
            java.lang.String r6 = "w"
            r7 = -1
            int r6 = zzb(r3, r1, r6, r7)
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzdO
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r11.zza(r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.String r12 = "."
            if (r11 == 0) goto L39b
            if (r6 != r7) goto L392
            int r6 = r2.zzh()
            goto L3d5
        L392:
            int r11 = r2.zzh()
            int r6 = java.lang.Math.min(r6, r11)
            goto L3d5
        L39b:
            boolean r11 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r11 == 0) goto L3cc
            int r11 = r2.zzh()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Calculate width with original width "
            r13.append(r14)
            r13.append(r6)
            java.lang.String r14 = ", videoHost.getVideoBoundingWidth() "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = ", x "
            r13.append(r11)
            r13.append(r4)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r11)
        L3cc:
            int r11 = r2.zzh()
            int r11 = r11 - r4
            int r6 = java.lang.Math.min(r6, r11)
        L3d5:
            java.lang.String r11 = "h"
            int r3 = zzb(r3, r1, r11, r7)
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r11.zza(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3fb
            if (r3 != r7) goto L3f2
            int r2 = r2.zzg()
            goto L435
        L3f2:
            int r2 = r2.zzg()
            int r2 = java.lang.Math.min(r3, r2)
            goto L435
        L3fb:
            boolean r7 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r7 == 0) goto L42c
            int r7 = r2.zzg()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Calculate height with original height "
            r8.append(r11)
            r8.append(r3)
            java.lang.String r11 = ", videoHost.getVideoBoundingHeight() "
            r8.append(r11)
            r8.append(r7)
            java.lang.String r7 = ", y "
            r8.append(r7)
            r8.append(r15)
            r8.append(r12)
            java.lang.String r7 = r8.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r7)
        L42c:
            int r2 = r2.zzg()
            int r2 = r2 - r15
            int r2 = java.lang.Math.min(r3, r2)
        L435:
            java.lang.String r3 = "player"
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.NumberFormatException -> L444
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L444
            int r9 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L444
            r18 = r9
            goto L446
        L444:
            r18 = 0
        L446:
            java.lang.String r3 = "spherical"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r19 = java.lang.Boolean.parseBoolean(r3)
            if (r10 == 0) goto L47c
            com.google.android.gms.internal.ads.zzcbx r3 = r5.zza()
            if (r3 != 0) goto L47c
            com.google.android.gms.internal.ads.zzcci r3 = new com.google.android.gms.internal.ads.zzcci
            java.lang.String r7 = "flags"
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r7)
            r13 = r5
            r14 = r4
            r16 = r6
            r17 = r2
            r20 = r3
            r13.zzd(r14, r15, r16, r17, r18, r19, r20)
            com.google.android.gms.internal.ads.zzcbx r2 = r5.zza()
            if (r2 == 0) goto L47b
            zzc(r2, r1)
        L47b:
            return
        L47c:
            r5.zzc(r4, r15, r6, r2)
            return
    }
}
