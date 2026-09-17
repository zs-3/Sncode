package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbk extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface zzb;

    zzbk(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "Failed to generate query info for the tagging library, error: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L30
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0 = r6.zzb
            com.google.android.gms.ads.nonagon.signalgeneration.zza r0 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzb(r0)
            org.json.JSONObject r0 = r0.zza()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ",\"appLevelSignals\":"
            java.lang.String r0 = r1.concat(r0)
            goto L32
        L30:
            java.lang.String r0 = ""
        L32:
            java.lang.String r1 = r6.zza
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r7
            com.google.android.gms.internal.ads.zzbeb r7 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r1 = r7.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjx
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r4.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            goto L62
        L60:
            r4 = 0
        L62:
            r1 = 2
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r1] = r4
            r1 = 3
            r3[r1] = r0
            java.lang.String r0 = "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            java.lang.Object r7 = r7.zze()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L98
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r7 = r6.zzb     // Catch: java.lang.RuntimeException -> L8d
            com.google.android.gms.internal.ads.zzgfz r7 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzd(r7)     // Catch: java.lang.RuntimeException -> L8d
            com.google.android.gms.ads.nonagon.signalgeneration.zzbi r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbi     // Catch: java.lang.RuntimeException -> L8d
            r1.<init>(r6, r0)     // Catch: java.lang.RuntimeException -> L8d
            r7.execute(r1)     // Catch: java.lang.RuntimeException -> L8d
            goto La2
        L8d:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "TaggingLibraryJsInterface.getQueryInfo.onFailure"
            r0.zzv(r7, r1)
            goto La2
        L98:
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r7 = r6.zzb
            android.webkit.WebView r7 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zza(r7)
            r1 = 0
            r7.evaluateJavascript(r0, r1)
        La2:
            com.google.android.gms.internal.ads.zzbeb r7 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r7 = r7.zze()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb9
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r7 = r6.zzb
            com.google.android.gms.ads.nonagon.signalgeneration.zze r7 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzc(r7)
            r7.zzb()
        Lb9:
            return
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo r9) {
            r8 = this;
            java.lang.String r0 = r9.getQuery()
            r1 = 0
            r3 = 1
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6a
            r5.<init>()     // Catch: org.json.JSONException -> L6a
            java.lang.String r6 = "paw_id"
            java.lang.String r7 = r8.zza     // Catch: org.json.JSONException -> L6a
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L6a
            java.lang.String r6 = "signal"
            r5.put(r6, r0)     // Catch: org.json.JSONException -> L6a
            java.lang.String r0 = "sdk_ttl_ms"
            com.google.android.gms.internal.ads.zzbeb r6 = com.google.android.gms.internal.ads.zzbew.zzb     // Catch: org.json.JSONException -> L6a
            java.lang.Object r6 = r6.zze()     // Catch: org.json.JSONException -> L6a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L6a
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L6a
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzjx     // Catch: org.json.JSONException -> L6a
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L6a
            java.lang.Object r6 = r7.zza(r6)     // Catch: org.json.JSONException -> L6a
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: org.json.JSONException -> L6a
            long r6 = r6.longValue()     // Catch: org.json.JSONException -> L6a
            goto L3b
        L3a:
            r6 = r1
        L3b:
            r5.put(r0, r6)     // Catch: org.json.JSONException -> L6a
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbew.zza     // Catch: org.json.JSONException -> L6a
            java.lang.Object r0 = r0.zze()     // Catch: org.json.JSONException -> L6a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: org.json.JSONException -> L6a
            boolean r0 = r0.booleanValue()     // Catch: org.json.JSONException -> L6a
            if (r0 == 0) goto L5b
            java.lang.String r0 = "appLevelSignals"
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r6 = r8.zzb     // Catch: org.json.JSONException -> L6a
            com.google.android.gms.ads.nonagon.signalgeneration.zza r6 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzb(r6)     // Catch: org.json.JSONException -> L6a
            org.json.JSONObject r6 = r6.zza()     // Catch: org.json.JSONException -> L6a
            r5.put(r0, r6)     // Catch: org.json.JSONException -> L6a
        L5b:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: org.json.JSONException -> L6a
            java.lang.String r6 = "window.postMessage(%1$s, '*');"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: org.json.JSONException -> L6a
            r7[r4] = r5     // Catch: org.json.JSONException -> L6a
            java.lang.String r9 = java.lang.String.format(r0, r6, r7)     // Catch: org.json.JSONException -> L6a
            goto Lcf
        L6a:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8e
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0 = r8.zzb
            com.google.android.gms.ads.nonagon.signalgeneration.zza r0 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzb(r0)
            org.json.JSONObject r0 = r0.zza()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = ",\"appLevelSignals\":"
            java.lang.String r0 = r5.concat(r0)
            goto L90
        L8e:
            java.lang.String r0 = ""
        L90:
            java.lang.String r5 = r8.zza
            java.util.Locale r6 = java.util.Locale.getDefault()
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r5
            java.lang.String r9 = r9.getQuery()
            r7[r3] = r9
            com.google.android.gms.internal.ads.zzbeb r9 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r9 = r9.zze()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lbf
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzjx
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r1.zza(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            long r1 = r9.longValue()
        Lbf:
            r9 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7[r9] = r1
            r9 = 3
            r7[r9] = r0
            java.lang.String r9 = "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');"
            java.lang.String r9 = java.lang.String.format(r6, r9, r7)
        Lcf:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf7
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0 = r8.zzb     // Catch: java.lang.RuntimeException -> Lec
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzd(r0)     // Catch: java.lang.RuntimeException -> Lec
            com.google.android.gms.ads.nonagon.signalgeneration.zzbj r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbj     // Catch: java.lang.RuntimeException -> Lec
            r1.<init>(r8, r9)     // Catch: java.lang.RuntimeException -> Lec
            r0.execute(r1)     // Catch: java.lang.RuntimeException -> Lec
            goto L101
        Lec:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "TaggingLibraryJsInterface.getQueryInfo.onSuccess"
            r0.zzv(r9, r1)
            goto L101
        Lf7:
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r0 = r8.zzb
            android.webkit.WebView r0 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zza(r0)
            r1 = 0
            r0.evaluateJavascript(r9, r1)
        L101:
            com.google.android.gms.internal.ads.zzbeb r9 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r9 = r9.zze()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L118
            com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface r9 = r8.zzb
            com.google.android.gms.ads.nonagon.signalgeneration.zze r9 = com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.zzc(r9)
            r9.zzb()
        L118:
            return
    }
}
