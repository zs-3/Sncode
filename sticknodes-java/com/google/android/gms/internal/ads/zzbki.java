package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbki implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final com.google.android.gms.internal.ads.zzdud zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final com.google.android.gms.internal.ads.zzbsj zzd;
    private final com.google.android.gms.internal.ads.zzeey zze;
    private final com.google.android.gms.internal.ads.zzcop zzf;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg;
    private final com.google.android.gms.internal.ads.zzgfz zzh;

    public zzbki(com.google.android.gms.ads.internal.zzb r3, com.google.android.gms.internal.ads.zzbsj r4, com.google.android.gms.internal.ads.zzeey r5, com.google.android.gms.internal.ads.zzdud r6, com.google.android.gms.internal.ads.zzcop r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzg = r0
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zzf
            r2.zzh = r1
            r2.zza = r3
            r2.zzd = r4
            r2.zze = r5
            r2.zzb = r6
            com.google.android.gms.ads.internal.util.client.zzr r3 = new com.google.android.gms.ads.internal.util.client.zzr
            r3.<init>(r0)
            r2.zzc = r3
            r2.zzf = r7
            return
    }

    public static int zzb(java.util.Map r1) {
            java.lang.String r0 = "o"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L29
            java.lang.String r0 = "p"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L14
            r1 = 7
            return r1
        L14:
            java.lang.String r0 = "l"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1e
            r1 = 6
            return r1
        L1e:
            java.lang.String r0 = "c"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L29
            r1 = 14
            return r1
        L29:
            r1 = -1
            return r1
    }

    static android.net.Uri zzc(android.content.Context r2, com.google.android.gms.internal.ads.zzavn r3, android.net.Uri r4, android.view.View r5, android.app.Activity r6, com.google.android.gms.internal.ads.zzfhg r7) {
            if (r3 != 0) goto L3
            return r4
        L3:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlC     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            if (r0 == 0) goto L22
            if (r7 == 0) goto L22
            boolean r3 = r3.zze(r4)     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            if (r3 == 0) goto L37
            android.net.Uri r4 = r7.zza(r4, r2, r5, r6)     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            goto L37
        L22:
            boolean r7 = r3.zze(r4)     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            if (r7 == 0) goto L37
            android.net.Uri r4 = r3.zza(r4, r2, r5, r6)     // Catch: java.lang.Exception -> L2d com.google.android.gms.internal.ads.zzavo -> L37
            goto L37
        L2d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r5 = "OpenGmsgHandler.maybeAddClickSignalsToUri"
            r3.zzw(r2, r5)
        L37:
            return r4
    }

    static android.net.Uri zzd(android.net.Uri r3) {
            java.lang.String r0 = "aclk_ms"
            java.lang.String r0 = r3.getQueryParameter(r0)     // Catch: java.lang.UnsupportedOperationException -> L1f
            if (r0 == 0) goto L31
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.UnsupportedOperationException -> L1f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.UnsupportedOperationException -> L1f
            android.net.Uri$Builder r1 = r3.buildUpon()     // Catch: java.lang.UnsupportedOperationException -> L1f
            java.lang.String r2 = "aclk_upms"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)     // Catch: java.lang.UnsupportedOperationException -> L1f
            android.net.Uri r3 = r0.build()     // Catch: java.lang.UnsupportedOperationException -> L1f
            return r3
        L1f:
            r0 = move-exception
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Error adding click uptime parameter to url: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L31:
            return r3
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbki r0, java.lang.String r1, com.google.android.gms.ads.internal.client.zza r2, java.util.Map r3, java.lang.String r4) {
            r0.zzh(r1, r2, r3, r4)
            return
    }

    public static boolean zzf(java.util.Map r1) {
            java.lang.String r0 = "custom_close"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "1"
            boolean r1 = r0.equals(r1)
            return r1
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzbki r0, int r1) {
            r0.zzm(r1)
            return
    }

    private final void zzh(java.lang.String r29, com.google.android.gms.ads.internal.client.zza r30, java.util.Map r31, java.lang.String r32) {
            r28 = this;
            r8 = r28
            r7 = r30
            r9 = r31
            r1 = r32
            r10 = r7
            com.google.android.gms.internal.ads.zzcfo r10 = (com.google.android.gms.internal.ads.zzcfo) r10
            com.google.android.gms.internal.ads.zzfgh r0 = r10.zzD()
            com.google.android.gms.internal.ads.zzfgk r2 = r10.zzR()
            r11 = 0
            java.lang.String r3 = ""
            if (r0 == 0) goto L21
            if (r2 == 0) goto L21
            java.lang.String r2 = r2.zzb
            boolean r0 = r0.zzai
            r12 = r0
            r13 = r2
            goto L23
        L21:
            r13 = r3
            r12 = 0
        L23:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L4e
            java.lang.String r0 = "sc"
            boolean r3 = r9.containsKey(r0)
            if (r3 == 0) goto L4e
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "0"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4e
            r6 = 0
            goto L4f
        L4e:
            r6 = 1
        L4f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmo
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r3 = "true"
            if (r0 == 0) goto L79
            java.lang.String r0 = "ig_cl"
            boolean r4 = r9.containsKey(r0)
            if (r4 == 0) goto L79
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L79
            r14 = 1
            goto L7a
        L79:
            r14 = 0
        L7a:
            java.lang.String r0 = "expand"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto La0
            boolean r0 = r10.zzaF()
            if (r0 == 0) goto L8e
            java.lang.String r0 = "Cannot expand WebView that is already expanded."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L8e:
            r8.zzk(r11)
            r0 = r7
            com.google.android.gms.internal.ads.zzcgy r0 = (com.google.android.gms.internal.ads.zzcgy) r0
            boolean r1 = zzf(r31)
            int r2 = zzb(r31)
            r0.zzaL(r1, r2, r6)
            return
        La0:
            java.lang.String r0 = "webapp"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L10a
            r8.zzk(r11)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlx
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lce
            java.lang.String r0 = "is_allowed_for_lock_screen"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r1 = "1"
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto Lce
            r19 = 1
            goto Ld0
        Lce:
            r19 = 0
        Ld0:
            if (r29 == 0) goto Le5
            r14 = r7
            com.google.android.gms.internal.ads.zzcgy r14 = (com.google.android.gms.internal.ads.zzcgy) r14
            boolean r15 = zzf(r31)
            int r16 = zzb(r31)
            r17 = r29
            r18 = r6
            r14.zzaN(r15, r16, r17, r18, r19)
            return
        Le5:
            r14 = r7
            com.google.android.gms.internal.ads.zzcgy r14 = (com.google.android.gms.internal.ads.zzcgy) r14
            boolean r15 = zzf(r31)
            int r16 = zzb(r31)
            java.lang.String r0 = "html"
            java.lang.Object r0 = r9.get(r0)
            r17 = r0
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r0 = "baseurl"
            java.lang.Object r0 = r9.get(r0)
            r18 = r0
            java.lang.String r18 = (java.lang.String) r18
            r19 = r6
            r14.zzaM(r15, r16, r17, r18, r19)
            return
        L10a:
            java.lang.String r0 = "chrome_custom_tab"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1e5
            r10.getContext()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzew
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L128
            goto L141
        L128:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeA
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L140
            java.lang.String r0 = "User opt out chrome custom tab."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto L141
        L140:
            r11 = 1
        L141:
            android.content.Context r0 = r10.getContext()
            boolean r0 = com.google.android.gms.internal.ads.zzbds.zzg(r0)
            if (r11 == 0) goto L1ce
            if (r0 != 0) goto L153
            r0 = 4
            r8.zzm(r0)
            goto L1ce
        L153:
            r8.zzk(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            if (r0 == 0) goto L166
            java.lang.String r0 = "Cannot open browser with null or empty url"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            r0 = 7
            r8.zzm(r0)
            return
        L166:
            android.net.Uri r17 = android.net.Uri.parse(r29)
            android.content.Context r15 = r10.getContext()
            com.google.android.gms.internal.ads.zzavn r16 = r10.zzI()
            android.view.View r18 = r10.zzF()
            android.app.Activity r19 = r10.zzi()
            com.google.android.gms.internal.ads.zzfhg r20 = r10.zzS()
            android.net.Uri r0 = zzc(r15, r16, r17, r18, r19, r20)
            android.net.Uri r0 = zzd(r0)
            if (r12 == 0) goto L19c
            com.google.android.gms.internal.ads.zzeey r1 = r8.zze
            if (r1 == 0) goto L19c
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = r0.toString()
            boolean r1 = r8.zzl(r7, r1, r2, r13)
            if (r1 == 0) goto L19c
            goto L3cc
        L19c:
            com.google.android.gms.internal.ads.zzbkf r1 = new com.google.android.gms.internal.ads.zzbkf
            r1.<init>(r8)
            r8.zzg = r1
            r1 = r7
            com.google.android.gms.internal.ads.zzcgy r1 = (com.google.android.gms.internal.ads.zzcgy) r1
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc
            r16 = 0
            java.lang.String r17 = r0.toString()
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            com.google.android.gms.ads.internal.overlay.zzaa r0 = r8.zzg
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            android.os.IBinder r24 = r0.asBinder()
            r25 = 1
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.zzaJ(r2, r6, r14)
            return
        L1ce:
            java.lang.String r0 = "use_first_package"
            r9.put(r0, r3)
            java.lang.String r0 = "use_running_process"
            r9.put(r0, r3)
            r1 = r28
            r2 = r30
            r3 = r31
            r4 = r12
            r5 = r13
            r7 = r14
            r1.zzj(r2, r3, r4, r5, r6, r7)
            return
        L1e5:
            java.lang.String r0 = "app"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L209
            java.lang.String r0 = "system_browser"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L1fc
            goto L209
        L1fc:
            r1 = r28
            r2 = r30
            r3 = r31
            r4 = r12
            r5 = r13
            r7 = r14
            r1.zzj(r2, r3, r4, r5, r6, r7)
            return
        L209:
            java.lang.String r0 = "open_app"
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.String r15 = "p"
            if (r0 == 0) goto L26a
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhQ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3cc
            r8.zzk(r2)
            java.lang.Object r0 = r9.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L236
            java.lang.String r0 = "Package name missing from open app action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L236:
            if (r12 == 0) goto L246
            com.google.android.gms.internal.ads.zzeey r1 = r8.zze
            if (r1 == 0) goto L246
            android.content.Context r1 = r10.getContext()
            boolean r1 = r8.zzl(r7, r1, r0, r13)
            if (r1 != 0) goto L3cc
        L246:
            android.content.Context r1 = r10.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            if (r1 != 0) goto L256
            java.lang.String r0 = "Cannot get package manager from open app action."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L256:
            android.content.Intent r0 = r1.getLaunchIntentForPackage(r0)
            if (r0 == 0) goto L3cc
            r1 = r7
            com.google.android.gms.internal.ads.zzcgy r1 = (com.google.android.gms.internal.ads.zzcgy) r1
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc
            com.google.android.gms.ads.internal.overlay.zzaa r3 = r8.zzg
            r2.<init>(r0, r3)
            r1.zzaJ(r2, r6, r14)
            return
        L26a:
            r8.zzk(r2)
            java.lang.String r0 = "intent_url"
            java.lang.Object r0 = r9.get(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r0 != 0) goto L291
            android.content.Intent r4 = android.content.Intent.parseUri(r3, r11)     // Catch: java.net.URISyntaxException -> L282
            goto L291
        L282:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Error parsing the url: "
            java.lang.String r0 = r3.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
        L291:
            r0 = r4
            if (r0 == 0) goto L2eb
            android.net.Uri r3 = r0.getData()
            if (r3 == 0) goto L2eb
            android.net.Uri r3 = r0.getData()
            android.net.Uri r4 = android.net.Uri.EMPTY
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2eb
            android.content.Context r16 = r10.getContext()
            com.google.android.gms.internal.ads.zzavn r17 = r10.zzI()
            android.view.View r19 = r10.zzF()
            android.app.Activity r20 = r10.zzi()
            com.google.android.gms.internal.ads.zzfhg r21 = r10.zzS()
            r18 = r3
            android.net.Uri r3 = zzc(r16, r17, r18, r19, r20, r21)
            android.net.Uri r3 = zzd(r3)
            java.lang.String r4 = r0.getType()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2e8
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzhR
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2e8
            java.lang.String r4 = r0.getType()
            r0.setDataAndType(r3, r4)
            goto L2eb
        L2e8:
            r0.setData(r3)
        L2eb:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzij
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r5 = "event_id"
            if (r3 == 0) goto L310
            java.lang.String r3 = "intent_async"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L310
            boolean r1 = r9.containsKey(r5)
            if (r1 == 0) goto L310
            r16 = 1
            goto L312
        L310:
            r16 = 0
        L312:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r16 == 0) goto L333
            com.google.android.gms.internal.ads.zzbkg r3 = new com.google.android.gms.internal.ads.zzbkg
            r1 = r3
            r2 = r28
            r11 = r3
            r3 = r6
            r6 = r4
            r4 = r30
            r18 = r15
            r15 = r5
            r5 = r6
            r19 = r14
            r14 = r6
            r6 = r31
            r1.<init>(r2, r3, r4, r5, r6)
            r8.zzg = r11
            r11 = 0
            goto L33a
        L333:
            r19 = r14
            r18 = r15
            r14 = r4
            r15 = r5
            r11 = r6
        L33a:
            java.lang.String r1 = "openIntentAsync"
            if (r0 == 0) goto L37a
            if (r12 == 0) goto L36a
            com.google.android.gms.internal.ads.zzeey r2 = r8.zze
            if (r2 == 0) goto L36a
            android.content.Context r2 = r10.getContext()
            android.net.Uri r3 = r0.getData()
            java.lang.String r3 = r3.toString()
            boolean r2 = r8.zzl(r7, r2, r3, r13)
            if (r2 == 0) goto L36a
            if (r16 == 0) goto L3cc
            java.lang.Object r0 = r9.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r14.put(r0, r2)
            r0 = r7
            com.google.android.gms.internal.ads.zzbmr r0 = (com.google.android.gms.internal.ads.zzbmr) r0
            r0.zzd(r1, r14)
            return
        L36a:
            r1 = r7
            com.google.android.gms.internal.ads.zzcgy r1 = (com.google.android.gms.internal.ads.zzcgy) r1
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc
            com.google.android.gms.ads.internal.overlay.zzaa r3 = r8.zzg
            r2.<init>(r0, r3)
            r3 = r19
            r1.zzaJ(r2, r11, r3)
            return
        L37a:
            r3 = r19
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            if (r0 != 0) goto L3a7
            android.net.Uri r21 = android.net.Uri.parse(r29)
            android.content.Context r19 = r10.getContext()
            com.google.android.gms.internal.ads.zzavn r20 = r10.zzI()
            android.view.View r22 = r10.zzF()
            android.app.Activity r23 = r10.zzi()
            com.google.android.gms.internal.ads.zzfhg r24 = r10.zzS()
            android.net.Uri r0 = zzc(r19, r20, r21, r22, r23, r24)
            android.net.Uri r0 = zzd(r0)
            java.lang.String r0 = r0.toString()
            goto L3a9
        L3a7:
            r0 = r29
        L3a9:
            if (r12 == 0) goto L3cd
            com.google.android.gms.internal.ads.zzeey r2 = r8.zze
            if (r2 == 0) goto L3cd
            android.content.Context r2 = r10.getContext()
            boolean r2 = r8.zzl(r7, r2, r0, r13)
            if (r2 == 0) goto L3cd
            if (r16 == 0) goto L3cc
            java.lang.Object r0 = r9.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r14.put(r0, r2)
            r0 = r7
            com.google.android.gms.internal.ads.zzbmr r0 = (com.google.android.gms.internal.ads.zzbmr) r0
            r0.zzd(r1, r14)
        L3cc:
            return
        L3cd:
            r1 = r7
            com.google.android.gms.internal.ads.zzcgy r1 = (com.google.android.gms.internal.ads.zzcgy) r1
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc
            java.lang.String r4 = "i"
            java.lang.Object r4 = r9.get(r4)
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            java.lang.String r4 = "m"
            java.lang.Object r4 = r9.get(r4)
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22
            r4 = r18
            java.lang.Object r4 = r9.get(r4)
            r23 = r4
            java.lang.String r23 = (java.lang.String) r23
            java.lang.String r4 = "c"
            java.lang.Object r4 = r9.get(r4)
            r24 = r4
            java.lang.String r24 = (java.lang.String) r24
            java.lang.String r4 = "f"
            java.lang.Object r4 = r9.get(r4)
            r25 = r4
            java.lang.String r25 = (java.lang.String) r25
            java.lang.String r4 = "e"
            java.lang.Object r4 = r9.get(r4)
            r26 = r4
            java.lang.String r26 = (java.lang.String) r26
            com.google.android.gms.ads.internal.overlay.zzaa r4 = r8.zzg
            r19 = r2
            r21 = r0
            r27 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r1.zzaJ(r2, r11, r3)
            return
    }

    private final void zzi(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            com.google.android.gms.internal.ads.zzeey r0 = r7.zze
            r0.zzc(r9)
            com.google.android.gms.internal.ads.zzdud r2 = r7.zzb
            if (r2 == 0) goto L18
            com.google.android.gms.internal.ads.zzeey r3 = r7.zze
            java.lang.String r0 = "dialog_not_shown_reason"
            com.google.android.gms.internal.ads.zzgba r6 = com.google.android.gms.internal.ads.zzgba.zze(r0, r10)
            java.lang.String r5 = "dialog_not_shown"
            r1 = r8
            r4 = r9
            com.google.android.gms.internal.ads.zzefj.zzd(r1, r2, r3, r4, r5, r6)
        L18:
            return
    }

    private final void zzj(com.google.android.gms.ads.internal.client.zza r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24, boolean r25) {
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = 1
            r1.zzk(r3)
            r4 = r0
            com.google.android.gms.internal.ads.zzcfo r4 = (com.google.android.gms.internal.ads.zzcfo) r4
            android.content.Context r11 = r4.getContext()
            com.google.android.gms.internal.ads.zzavn r12 = r4.zzI()
            android.view.View r13 = r4.zzF()
            com.google.android.gms.internal.ads.zzfhg r14 = r4.zzS()
            java.lang.String r5 = "activity"
            java.lang.Object r5 = r11.getSystemService(r5)
            r15 = r5
            android.app.ActivityManager r15 = (android.app.ActivityManager) r15
            java.lang.String r5 = "u"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r16 = 0
            if (r6 == 0) goto L3a
        L36:
            r2 = r16
            goto L16d
        L3a:
            android.net.Uri r7 = android.net.Uri.parse(r5)
            r9 = 0
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r14
            android.net.Uri r5 = zzc(r5, r6, r7, r8, r9, r10)
            android.net.Uri r5 = zzd(r5)
            java.lang.String r6 = "use_first_package"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r17 = java.lang.Boolean.parseBoolean(r6)
            java.lang.String r6 = "use_running_process"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r18 = java.lang.Boolean.parseBoolean(r6)
            java.lang.String r6 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r10 = 0
            if (r2 != 0) goto L86
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzeu
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r6.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L85
            goto L86
        L85:
            r3 = 0
        L86:
            java.lang.String r2 = r5.getScheme()
            java.lang.String r6 = "http"
            boolean r2 = r6.equalsIgnoreCase(r2)
            java.lang.String r7 = "https"
            if (r2 == 0) goto La3
            android.net.Uri$Builder r2 = r5.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r7)
            android.net.Uri r16 = r2.build()
        La0:
            r2 = r16
            goto Lba
        La3:
            java.lang.String r2 = r5.getScheme()
            boolean r2 = r7.equalsIgnoreCase(r2)
            if (r2 == 0) goto La0
            android.net.Uri$Builder r2 = r5.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r6)
            android.net.Uri r16 = r2.build()
            goto La0
        Lba:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.content.Intent r8 = com.google.android.gms.internal.ads.zzbkh.zza(r5, r11, r12, r13, r14)
            android.content.Intent r2 = com.google.android.gms.internal.ads.zzbkh.zza(r2, r11, r12, r13, r14)
            if (r3 == 0) goto Ld5
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzo(r11, r8)
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzo(r11, r2)
        Ld5:
            r5 = r8
            r6 = r9
            r7 = r11
            r3 = r8
            r8 = r12
            r21 = r9
            r9 = r13
            r0 = 0
            r10 = r14
            android.content.pm.ResolveInfo r6 = com.google.android.gms.internal.ads.zzbkh.zzd(r5, r6, r7, r8, r9, r10)
            if (r6 == 0) goto Lf0
            r5 = r3
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            android.content.Intent r16 = com.google.android.gms.internal.ads.zzbkh.zzb(r5, r6, r7, r8, r9, r10)
            goto L36
        Lf0:
            if (r2 == 0) goto L107
            android.content.pm.ResolveInfo r6 = com.google.android.gms.internal.ads.zzbkh.zzc(r2, r11, r12, r13, r14)
            if (r6 == 0) goto L107
            r5 = r3
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            android.content.Intent r2 = com.google.android.gms.internal.ads.zzbkh.zzb(r5, r6, r7, r8, r9, r10)
            android.content.pm.ResolveInfo r5 = com.google.android.gms.internal.ads.zzbkh.zzc(r2, r11, r12, r13, r14)
            if (r5 != 0) goto L16d
        L107:
            boolean r2 = r21.isEmpty()
            if (r2 == 0) goto L10f
            goto L16c
        L10f:
            if (r18 == 0) goto L156
            if (r15 == 0) goto L156
            java.util.List r2 = r15.getRunningAppProcesses()
            if (r2 == 0) goto L156
            int r5 = r21.size()
            r10 = 0
        L11e:
            if (r10 >= r5) goto L156
            r6 = r21
            java.lang.Object r7 = r6.get(r10)
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            java.util.Iterator r8 = r2.iterator()
        L12c:
            boolean r9 = r8.hasNext()
            int r15 = r10 + 1
            if (r9 == 0) goto L152
            java.lang.Object r9 = r8.next()
            android.app.ActivityManager$RunningAppProcessInfo r9 = (android.app.ActivityManager.RunningAppProcessInfo) r9
            java.lang.String r9 = r9.processName
            android.content.pm.ActivityInfo r15 = r7.activityInfo
            java.lang.String r15 = r15.packageName
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L12c
            r5 = r3
            r6 = r7
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            android.content.Intent r16 = com.google.android.gms.internal.ads.zzbkh.zzb(r5, r6, r7, r8, r9, r10)
            goto L36
        L152:
            r21 = r6
            r10 = r15
            goto L11e
        L156:
            r6 = r21
            if (r17 == 0) goto L16c
            java.lang.Object r0 = r6.get(r0)
            r6 = r0
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            r5 = r3
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            android.content.Intent r16 = com.google.android.gms.internal.ads.zzbkh.zzb(r5, r6, r7, r8, r9, r10)
            goto L36
        L16c:
            r2 = r3
        L16d:
            if (r22 == 0) goto L18d
            com.google.android.gms.internal.ads.zzeey r0 = r1.zze
            if (r0 == 0) goto L18d
            if (r2 == 0) goto L18d
            android.content.Context r0 = r4.getContext()
            android.net.Uri r3 = r2.getData()
            java.lang.String r3 = r3.toString()
            r4 = r20
            r5 = r23
            boolean r0 = r1.zzl(r4, r0, r3, r5)
            if (r0 != 0) goto L18c
            goto L18f
        L18c:
            return
        L18d:
            r4 = r20
        L18f:
            r0 = r4
            com.google.android.gms.internal.ads.zzcgy r0 = (com.google.android.gms.internal.ads.zzcgy) r0     // Catch: android.content.ActivityNotFoundException -> L1a1
            com.google.android.gms.ads.internal.overlay.zzc r3 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch: android.content.ActivityNotFoundException -> L1a1
            com.google.android.gms.ads.internal.overlay.zzaa r4 = r1.zzg     // Catch: android.content.ActivityNotFoundException -> L1a1
            r3.<init>(r2, r4)     // Catch: android.content.ActivityNotFoundException -> L1a1
            r2 = r24
            r4 = r25
            r0.zzaJ(r3, r2, r4)     // Catch: android.content.ActivityNotFoundException -> L1a1
            return
        L1a1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }

    private final void zzk(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbsj r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.zza(r2)
        L7:
            return
    }

    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r8.zzb
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzeey r1 = r8.zze
            java.lang.String r2 = "offline_open"
            com.google.android.gms.internal.ads.zzefj.zzc(r10, r0, r1, r12, r2)
        Lb:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            boolean r0 = r0.zzA(r10)
            r1 = 0
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzeey r9 = r8.zze
            com.google.android.gms.ads.internal.util.client.zzr r10 = r8.zzc
            r9.zzh(r10, r12)
            return r1
        L1e:
            r0 = r9
            com.google.android.gms.internal.ads.zzcfo r0 = (com.google.android.gms.internal.ads.zzcfo) r0
            com.google.android.gms.internal.ads.zzfgh r2 = r0.zzD()
            r3 = 1
            if (r2 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbts r2 = r2.zzad
            if (r2 == 0) goto L3a
            boolean r4 = r2.zza
            if (r4 == 0) goto L3a
            java.lang.String r4 = r2.zzb
            if (r4 == 0) goto L3a
            boolean r2 = r2.zzc
            if (r2 == 0) goto L3a
            r2 = 1
            goto L3b
        L3a:
            r2 = 0
        L3b:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzig
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L5b
            if (r2 == 0) goto L5b
            com.google.android.gms.internal.ads.zzdud r9 = r8.zzb
            if (r9 == 0) goto L5a
            com.google.android.gms.internal.ads.zzeey r11 = r8.zze
            java.lang.String r0 = "onfs"
            com.google.android.gms.internal.ads.zzefj.zzc(r10, r9, r11, r12, r0)
        L5a:
            return r1
        L5b:
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzbr r2 = com.google.android.gms.ads.internal.util.zzt.zzz(r10)
            com.google.android.gms.ads.internal.zzu.zzp()
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r10)
            boolean r4 = r4.areNotificationsEnabled()
            com.google.android.gms.ads.internal.util.zzab r5 = com.google.android.gms.ads.internal.zzu.zzq()
            java.lang.String r6 = "offline_notification_channel"
            boolean r5 = r5.zzi(r10, r6)
            com.google.android.gms.internal.ads.zzchi r6 = r0.zzO()
            boolean r6 = r6.zzi()
            if (r6 == 0) goto L89
            android.app.Activity r6 = r0.zzi()
            if (r6 != 0) goto L89
            r6 = 1
            goto L8a
        L89:
            r6 = 0
        L8a:
            if (r4 != 0) goto Lca
            com.google.android.gms.ads.internal.zzu.zzp()
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r10)
            boolean r4 = r4.areNotificationsEnabled()
            if (r4 == 0) goto L9a
            goto Lc4
        L9a:
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r4 >= r7) goto Lb1
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzib
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r7.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto Lc1
        Lb1:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzia
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r7.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
        Lc1:
            if (r4 == 0) goto Lc4
            goto Lca
        Lc4:
            java.lang.String r9 = "notifications_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        Lca:
            if (r5 == 0) goto Ld2
            java.lang.String r9 = "notification_channel_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        Ld2:
            if (r2 != 0) goto Lda
            java.lang.String r9 = "work_manager_unavailable"
            r8.zzi(r10, r12, r9)
            return r1
        Lda:
            if (r6 == 0) goto Le2
            java.lang.String r9 = "ad_no_activity"
            r8.zzi(r10, r12, r9)
            return r1
        Le2:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhY
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lfa
            java.lang.String r9 = "notification_flow_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        Lfa:
            com.google.android.gms.ads.internal.overlay.zzm r2 = r0.zzL()
            if (r2 == 0) goto L130
            android.app.Activity r2 = r0.zzi()
            if (r2 == 0) goto L130
            com.google.android.gms.internal.ads.zzefk r2 = com.google.android.gms.internal.ads.zzefl.zze()
            android.app.Activity r4 = r0.zzi()
            r2.zza(r4)
            r4 = 0
            r2.zzb(r4)
            r2.zzc(r12)
            r2.zzd(r11)
            com.google.android.gms.internal.ads.zzefl r11 = r2.zze()
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()     // Catch: java.lang.Exception -> L127
            r0.zzf(r11)     // Catch: java.lang.Exception -> L127
            goto L138
        L127:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            r8.zzi(r10, r12, r9)
            return r1
        L130:
            r10 = r9
            com.google.android.gms.internal.ads.zzcgy r10 = (com.google.android.gms.internal.ads.zzcgy) r10
            r0 = 14
            r10.zzaK(r12, r11, r0)
        L138:
            r9.onAdClicked()
            return r3
    }

    private final void zzm(int r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r3.zzb
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzduc r0 = r0.zza()
            java.lang.String r1 = "action"
            java.lang.String r2 = "cct_action"
            r0.zzb(r1, r2)
            switch(r4) {
                case 2: goto L28;
                case 3: goto L25;
                case 4: goto L22;
                case 5: goto L1f;
                case 6: goto L1c;
                case 7: goto L19;
                case 8: goto L16;
                default: goto L13;
            }
        L13:
            java.lang.String r4 = "WRONG_EXP_SETUP"
            goto L2a
        L16:
            java.lang.String r4 = "UNKNOWN"
            goto L2a
        L19:
            java.lang.String r4 = "EMPTY_URL"
            goto L2a
        L1c:
            java.lang.String r4 = "ACTIVITY_NOT_FOUND"
            goto L2a
        L1f:
            java.lang.String r4 = "CCT_READY_TO_OPEN"
            goto L2a
        L22:
            java.lang.String r4 = "CCT_NOT_SUPPORTED"
            goto L2a
        L25:
            java.lang.String r4 = "CONTEXT_NULL"
            goto L2a
        L28:
            java.lang.String r4 = "CONTEXT_NOT_AN_ACTIVITY"
        L2a:
            java.lang.String r1 = "cct_open_status"
            r0.zzb(r1, r4)
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r5, java.util.Map r6) {
            r4 = this;
            com.google.android.gms.ads.internal.client.zza r5 = (com.google.android.gms.ads.internal.client.zza) r5
            java.lang.String r0 = "u"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = r5
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2
            com.google.android.gms.internal.ads.zzfgh r3 = r2.zzD()
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.ads.zzfgh r1 = r2.zzD()
            java.util.Map r1 = r1.zzaw
        L1e:
            android.content.Context r2 = r2.getContext()
            r3 = 1
            java.lang.String r0 = com.google.android.gms.internal.ads.zzbzb.zzc(r0, r2, r3, r1)
            java.lang.String r1 = "a"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L37
            java.lang.String r5 = "Action missing from an open GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            return
        L37:
            com.google.android.gms.ads.internal.zzb r2 = r4.zza
            if (r2 == 0) goto L46
            boolean r3 = r2.zzc()
            if (r3 == 0) goto L42
            goto L46
        L42:
            r2.zzb(r0)
            return
        L46:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjG
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            com.google.android.gms.internal.ads.zzcop r2 = r4.zzf
            if (r2 == 0) goto L6d
            boolean r2 = com.google.android.gms.internal.ads.zzcop.zzj(r0)
            if (r2 == 0) goto L6d
            com.google.android.gms.internal.ads.zzcop r2 = r4.zzf
            java.util.Random r3 = com.google.android.gms.ads.internal.client.zzbc.zze()
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzb(r0, r3)
            goto L71
        L6d:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
        L71:
            com.google.android.gms.internal.ads.zzbke r2 = new com.google.android.gms.internal.ads.zzbke
            r2.<init>(r4, r6, r5, r1)
            com.google.android.gms.internal.ads.zzgfz r5 = r4.zzh
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r2, r5)
            return
    }
}
