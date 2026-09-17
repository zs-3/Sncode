package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class TaggingLibraryJsInterface {
    private final android.content.Context zza;
    private final android.webkit.WebView zzb;
    private final com.google.android.gms.internal.ads.zzavn zzc;
    private final com.google.android.gms.internal.ads.zzfhg zzd;
    private final int zze;
    private final com.google.android.gms.internal.ads.zzdui zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.ads.zzgfz zzh;
    private final com.google.android.gms.internal.ads.zzfng zzi;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzj;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzk;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zze zzl;

    TaggingLibraryJsInterface(android.webkit.WebView r2, com.google.android.gms.internal.ads.zzavn r3, com.google.android.gms.internal.ads.zzdui r4, com.google.android.gms.internal.ads.zzfng r5, com.google.android.gms.internal.ads.zzfhg r6, com.google.android.gms.ads.nonagon.signalgeneration.zzj r7, com.google.android.gms.ads.nonagon.signalgeneration.zza r8, com.google.android.gms.ads.nonagon.signalgeneration.zze r9) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            r1.zzh = r0
            r1.zzb = r2
            android.content.Context r2 = r2.getContext()
            r1.zza = r2
            r1.zzc = r3
            r1.zzf = r4
            com.google.android.gms.internal.ads.zzbcv.zza(r2)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjf
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.zze = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjg
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.zzg = r2
            r1.zzi = r5
            r1.zzd = r6
            r1.zzj = r7
            r1.zzk = r8
            r1.zzl = r9
            return
    }

    static /* bridge */ /* synthetic */ android.webkit.WebView zza(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0) {
            android.webkit.WebView r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zza zzb(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0) {
            com.google.android.gms.ads.nonagon.signalgeneration.zza r0 = r0.zzk
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zze zzc(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0) {
            com.google.android.gms.ads.nonagon.signalgeneration.zze r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgfz zzd(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0) {
            com.google.android.gms.internal.ads.zzgfz r0 = r0.zzh
            return r0
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public java.lang.String getClickSignals(java.lang.String r10) {
            r9 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.RuntimeException -> L3d
            long r0 = r0.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L3d
            com.google.android.gms.internal.ads.zzavn r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L3d
            com.google.android.gms.internal.ads.zzavi r2 = r2.zzc()     // Catch: java.lang.RuntimeException -> L3d
            android.content.Context r3 = r9.zza     // Catch: java.lang.RuntimeException -> L3d
            android.webkit.WebView r4 = r9.zzb     // Catch: java.lang.RuntimeException -> L3d
            java.lang.String r10 = r2.zze(r3, r10, r4)     // Catch: java.lang.RuntimeException -> L3d
            boolean r2 = r9.zzg     // Catch: java.lang.RuntimeException -> L3d
            if (r2 == 0) goto L3c
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.RuntimeException -> L3d
            long r2 = r2.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L3d
            long r2 = r2 - r0
            com.google.android.gms.internal.ads.zzdui r0 = r9.zzf     // Catch: java.lang.RuntimeException -> L3d
            r1 = 0
            java.lang.String r4 = "csg"
            r5 = 1
            android.util.Pair[] r5 = new android.util.Pair[r5]     // Catch: java.lang.RuntimeException -> L3d
            r6 = 0
            android.util.Pair r7 = new android.util.Pair     // Catch: java.lang.RuntimeException -> L3d
            java.lang.String r8 = "clat"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.RuntimeException -> L3d
            r7.<init>(r8, r2)     // Catch: java.lang.RuntimeException -> L3d
            r5[r6] = r7     // Catch: java.lang.RuntimeException -> L3d
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r0, r1, r4, r5)     // Catch: java.lang.RuntimeException -> L3d
        L3c:
            return r10
        L3d:
            r10 = move-exception
            java.lang.String r0 = "Exception getting click signals. "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r10)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "TaggingLibraryJsInterface.getClickSignals"
            r0.zzw(r10, r1)
            java.lang.String r10 = ""
            return r10
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public java.lang.String getClickSignalsWithTimeout(java.lang.String r4, int r5) {
            r3 = this;
            java.lang.String r0 = ""
            if (r5 > 0) goto L19
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Invalid timeout for getting click signals. Timeout="
            r4.append(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return r0
        L19:
            int r1 = r3.zze
            int r5 = java.lang.Math.min(r5, r1)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzbg r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbg
            r2.<init>(r3, r4)
            com.google.common.util.concurrent.ListenableFuture r4 = r1.zzb(r2)
            long r1 = (long) r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L34 java.util.concurrent.TimeoutException -> L36 java.lang.InterruptedException -> L38
            java.lang.Object r4 = r4.get(r1, r5)     // Catch: java.util.concurrent.ExecutionException -> L34 java.util.concurrent.TimeoutException -> L36 java.lang.InterruptedException -> L38
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.util.concurrent.ExecutionException -> L34 java.util.concurrent.TimeoutException -> L36 java.lang.InterruptedException -> L38
            return r4
        L34:
            r4 = move-exception
            goto L39
        L36:
            r4 = move-exception
            goto L39
        L38:
            r4 = move-exception
        L39:
            java.lang.String r5 = "Exception getting click signals with timeout. "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r4)
            com.google.android.gms.internal.ads.zzcad r5 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "TaggingLibraryJsInterface.getClickSignalsWithTimeout"
            r5.zzw(r4, r1)
            boolean r4 = r4 instanceof java.util.concurrent.TimeoutException
            if (r4 == 0) goto L4e
            java.lang.String r4 = "17"
            return r4
        L4e:
            return r0
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public java.lang.String getQueryInfo() {
            r7 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "query_info_type"
            java.lang.String r3 = "requester_type_6"
            r1.putString(r2, r3)
            com.google.android.gms.ads.nonagon.signalgeneration.zzbk r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbk
            r2.<init>(r7, r0)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L32
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r1 = r7.zzj
            android.webkit.WebView r3 = r7.zzb
            r1.zzg(r3, r2)
            goto L67
        L32:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzji
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4f
            com.google.android.gms.internal.ads.zzgfz r3 = r7.zzh
            com.google.android.gms.ads.nonagon.signalgeneration.zzbh r4 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            r4.<init>(r7, r1, r2)
            r3.execute(r4)
            goto L67
        L4f:
            android.content.Context r3 = r7.zza
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.BANNER
            com.google.android.gms.ads.AdRequest$Builder r5 = new com.google.android.gms.ads.AdRequest$Builder
            r5.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r6 = com.google.ads.mediation.admob.AdMobAdapter.class
            com.google.android.gms.ads.AbstractAdRequestBuilder r1 = r5.addNetworkExtrasBundle(r6, r1)
            com.google.android.gms.ads.AdRequest$Builder r1 = (com.google.android.gms.ads.AdRequest.Builder) r1
            com.google.android.gms.ads.AdRequest r1 = r1.build()
            com.google.android.gms.ads.query.QueryInfo.generate(r3, r4, r1, r2)
        L67:
            return r0
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public java.lang.String getViewSignals() {
            r10 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.RuntimeException -> L3d
            long r0 = r0.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L3d
            com.google.android.gms.internal.ads.zzavn r2 = r10.zzc     // Catch: java.lang.RuntimeException -> L3d
            com.google.android.gms.internal.ads.zzavi r2 = r2.zzc()     // Catch: java.lang.RuntimeException -> L3d
            android.content.Context r3 = r10.zza     // Catch: java.lang.RuntimeException -> L3d
            android.webkit.WebView r4 = r10.zzb     // Catch: java.lang.RuntimeException -> L3d
            r5 = 0
            java.lang.String r2 = r2.zzh(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L3d
            boolean r3 = r10.zzg     // Catch: java.lang.RuntimeException -> L3d
            if (r3 == 0) goto L3c
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.RuntimeException -> L3d
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.RuntimeException -> L3d
            long r3 = r3 - r0
            com.google.android.gms.internal.ads.zzdui r0 = r10.zzf     // Catch: java.lang.RuntimeException -> L3d
            java.lang.String r1 = "vsg"
            r6 = 1
            android.util.Pair[] r6 = new android.util.Pair[r6]     // Catch: java.lang.RuntimeException -> L3d
            r7 = 0
            android.util.Pair r8 = new android.util.Pair     // Catch: java.lang.RuntimeException -> L3d
            java.lang.String r9 = "vlat"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.RuntimeException -> L3d
            r8.<init>(r9, r3)     // Catch: java.lang.RuntimeException -> L3d
            r6[r7] = r8     // Catch: java.lang.RuntimeException -> L3d
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r0, r5, r1, r6)     // Catch: java.lang.RuntimeException -> L3d
        L3c:
            return r2
        L3d:
            r0 = move-exception
            java.lang.String r1 = "Exception getting view signals. "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "TaggingLibraryJsInterface.getViewSignals"
            r1.zzw(r0, r2)
            java.lang.String r0 = ""
            return r0
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public java.lang.String getViewSignalsWithTimeout(int r5) {
            r4 = this;
            java.lang.String r0 = ""
            if (r5 > 0) goto L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid timeout for getting view signals. Timeout="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r5)
            return r0
        L19:
            int r1 = r4.zze
            int r5 = java.lang.Math.min(r5, r1)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzbe r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbe
            r2.<init>(r4)
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb(r2)
            long r2 = (long) r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L34 java.util.concurrent.TimeoutException -> L36 java.lang.InterruptedException -> L38
            java.lang.Object r5 = r1.get(r2, r5)     // Catch: java.util.concurrent.ExecutionException -> L34 java.util.concurrent.TimeoutException -> L36 java.lang.InterruptedException -> L38
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.util.concurrent.ExecutionException -> L34 java.util.concurrent.TimeoutException -> L36 java.lang.InterruptedException -> L38
            return r5
        L34:
            r5 = move-exception
            goto L39
        L36:
            r5 = move-exception
            goto L39
        L38:
            r5 = move-exception
        L39:
            java.lang.String r1 = "Exception getting view signals with timeout. "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r5)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "TaggingLibraryJsInterface.getViewSignalsWithTimeout"
            r1.zzw(r5, r2)
            boolean r5 = r5 instanceof java.util.concurrent.TimeoutException
            if (r5 == 0) goto L4e
            java.lang.String r5 = "17"
            return r5
        L4e:
            return r0
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public void recordClick(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L19
            goto L23
        L19:
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzbf r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbf
            r1.<init>(r2, r3)
            r0.execute(r1)
        L23:
            return
    }

    @android.webkit.JavascriptInterface
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public void reportTouchEvent(java.lang.String r21) {
            r20 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            r1 = r21
            r0.<init>(r1)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            java.lang.String r1 = "x"
            int r1 = r0.getInt(r1)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            java.lang.String r2 = "y"
            int r2 = r0.getInt(r2)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            java.lang.String r3 = "duration_ms"
            int r3 = r0.getInt(r3)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            java.lang.String r4 = "force"
            double r4 = r0.getDouble(r4)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            float r13 = (float) r4     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            java.lang.String r4 = "type"
            int r0 = r0.getInt(r4)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L3a
            if (r0 == r6) goto L38
            if (r0 == r5) goto L36
            if (r0 == r4) goto L34
            r0 = -1
            r10 = -1
            goto L3c
        L34:
            r10 = 3
            goto L3c
        L36:
            r10 = 2
            goto L3c
        L38:
            r10 = 1
            goto L3c
        L3a:
            r0 = 0
            r10 = 0
        L3c:
            r6 = 0
            long r8 = (long) r3     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            float r11 = (float) r1     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            float r12 = (float) r2     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: org.json.JSONException -> L5c java.lang.RuntimeException -> L5e
            r1 = r20
            com.google.android.gms.internal.ads.zzavn r2 = r1.zzc     // Catch: org.json.JSONException -> L58 java.lang.RuntimeException -> L5a
            r2.zzd(r0)     // Catch: org.json.JSONException -> L58 java.lang.RuntimeException -> L5a
            return
        L58:
            r0 = move-exception
            goto L61
        L5a:
            r0 = move-exception
            goto L61
        L5c:
            r0 = move-exception
            goto L5f
        L5e:
            r0 = move-exception
        L5f:
            r1 = r20
        L61:
            java.lang.String r2 = "Failed to parse the touch string. "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r3 = "TaggingLibraryJsInterface.reportTouchEvent"
            r2.zzw(r0, r3)
            return
    }

    final /* synthetic */ void zze(android.os.Bundle r5, com.google.android.gms.ads.query.QueryInfoGenerationCallback r6) {
            r4 = this;
            com.google.android.gms.ads.internal.util.zzab r0 = com.google.android.gms.ads.internal.zzu.zzq()
            android.content.Context r1 = r4.zza
            android.webkit.CookieManager r0 = r0.zza(r1)
            if (r0 == 0) goto L13
            android.webkit.WebView r1 = r4.zzb
            boolean r0 = r0.acceptThirdPartyCookies(r1)
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = "accept_3p_cookie"
            r5.putBoolean(r1, r0)
            android.content.Context r0 = r4.zza
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.BANNER
            com.google.android.gms.ads.AdRequest$Builder r2 = new com.google.android.gms.ads.AdRequest$Builder
            r2.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r3 = com.google.ads.mediation.admob.AdMobAdapter.class
            com.google.android.gms.ads.AbstractAdRequestBuilder r5 = r2.addNetworkExtrasBundle(r3, r5)
            com.google.android.gms.ads.AdRequest$Builder r5 = (com.google.android.gms.ads.AdRequest.Builder) r5
            com.google.android.gms.ads.AdRequest r5 = r5.build()
            com.google.android.gms.ads.query.QueryInfo.generate(r0, r1, r5, r6)
            return
    }

    final /* synthetic */ void zzf(java.lang.String r5) {
            r4 = this;
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r0 = 0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzlC     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            java.lang.Object r1 = r2.zza(r1)     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            boolean r1 = r1.booleanValue()     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            if (r1 == 0) goto L24
            com.google.android.gms.internal.ads.zzfhg r1 = r4.zzd     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            if (r1 == 0) goto L24
            android.content.Context r2 = r4.zza     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            android.webkit.WebView r3 = r4.zzb     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            android.net.Uri r5 = r1.zza(r5, r2, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            goto L3e
        L24:
            com.google.android.gms.internal.ads.zzavn r1 = r4.zzc     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            android.content.Context r2 = r4.zza     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            android.webkit.WebView r3 = r4.zzb     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            android.net.Uri r5 = r1.zza(r5, r2, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzavo -> L2f
            goto L3e
        L2f:
            r1 = move-exception
            java.lang.String r2 = "Failed to append the click signal to URL: "
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r2, r1)
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r3 = "TaggingLibraryJsInterface.recordClick"
            r2.zzw(r1, r3)
        L3e:
            com.google.android.gms.internal.ads.zzfng r1 = r4.zzi
            java.lang.String r5 = r5.toString()
            r1.zzc(r5, r0)
            return
    }
}
