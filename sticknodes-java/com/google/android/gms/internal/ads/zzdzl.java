package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzl {
    private final com.google.android.gms.internal.ads.zzcho zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final java.util.concurrent.Executor zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzfma zzg;
    private final com.google.android.gms.internal.ads.zzdty zzh;
    private final java.lang.Object zzi;

    public zzdzl(com.google.android.gms.internal.ads.zzcho r2, android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4, com.google.android.gms.internal.ads.zzfhc r5, java.util.concurrent.Executor r6, java.lang.String r7, com.google.android.gms.internal.ads.zzfma r8, com.google.android.gms.internal.ads.zzdty r9) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzi = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r6
            r1.zzf = r7
            r1.zzg = r8
            r2.zzx()
            r1.zzh = r9
            return
    }

    private final com.google.common.util.concurrent.ListenableFuture zzc(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            android.content.Context r0 = r5.zzb
            r1 = 11
            com.google.android.gms.internal.ads.zzflp r0 = com.google.android.gms.internal.ads.zzflo.zza(r0, r1)
            r0.zzi()
            com.google.android.gms.internal.ads.zzboe r1 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.internal.ads.zzcho r2 = r5.zza
            android.content.Context r3 = r5.zzb
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r5.zzc
            com.google.android.gms.internal.ads.zzfmd r2 = r2.zzz()
            com.google.android.gms.internal.ads.zzbon r1 = r1.zza(r3, r4, r2)
            com.google.android.gms.internal.ads.zzboh r2 = com.google.android.gms.internal.ads.zzbok.zza
            java.lang.String r3 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbod r1 = r1.zza(r3, r2, r2)
            java.lang.String r2 = ""
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            com.google.android.gms.internal.ads.zzdzi r3 = new com.google.android.gms.internal.ads.zzdzi
            r3.<init>(r5, r6, r7)
            java.util.concurrent.Executor r6 = r5.zze
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r2, r3, r6)
            com.google.android.gms.internal.ads.zzdzj r7 = new com.google.android.gms.internal.ads.zzdzj
            r7.<init>(r1)
            java.util.concurrent.Executor r1 = r5.zze
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r6, r7, r1)
            com.google.android.gms.internal.ads.zzdzk r7 = new com.google.android.gms.internal.ads.zzdzk
            r7.<init>(r5)
            java.util.concurrent.Executor r1 = r5.zze
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r6, r7, r1)
            com.google.android.gms.internal.ads.zzfma r7 = r5.zzg
            com.google.android.gms.internal.ads.zzflz.zza(r6, r7, r0)
            return r6
    }

    private final java.lang.String zzd(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "ad_types"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r1.<init>(r6)     // Catch: org.json.JSONException -> L2d
            org.json.JSONArray r2 = r1.getJSONArray(r0)     // Catch: org.json.JSONException -> L2d
            if (r2 == 0) goto L28
            java.lang.String r3 = "unknown"
            r4 = 0
            java.lang.String r2 = r2.getString(r4)     // Catch: org.json.JSONException -> L2d
            boolean r2 = r3.equals(r2)     // Catch: org.json.JSONException -> L2d
            if (r2 == 0) goto L28
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2d
            r2.<init>()     // Catch: org.json.JSONException -> L2d
            java.lang.String r3 = r5.zzf     // Catch: org.json.JSONException -> L2d
            org.json.JSONArray r2 = r2.put(r3)     // Catch: org.json.JSONException -> L2d
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L2d
        L28:
            java.lang.String r6 = r1.toString()     // Catch: org.json.JSONException -> L2d
            return r6
        L2d:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Failed to update the ad types for rendering. "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return r6
    }

    private static final java.lang.String zze(java.lang.String r2) {
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r1.<init>(r2)     // Catch: org.json.JSONException -> Le
            java.lang.String r2 = "request_id"
            java.lang.String r2 = r1.optString(r2, r0)
            return r2
        Le:
            return r0
    }

    private static final java.lang.String zzf(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.google.android.gms.internal.ads.zzdty r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L87
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r0.<init>(r6)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "is_gbid"
            java.lang.String r0 = r0.optString(r1)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L1c
            if (r0 == 0) goto L1c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: org.json.JSONException -> L1c
            goto L1e
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L1e:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
            goto L87
        L25:
            java.lang.String r0 = "&"
            int r0 = r4.lastIndexOf(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L35
            r1 = 0
            java.lang.String r0 = r4.substring(r1, r0)
            goto L36
        L35:
            r0 = r2
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L87
            r1 = 11
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            r1.<init>(r6)     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            java.lang.String r6 = "arek"
            java.lang.String r2 = r1.getString(r6)     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            goto L6b
        L54:
            r6 = move-exception
            java.lang.String r1 = r6.toString()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = "Failed to get key from QueryJSONMap"
            java.lang.String r1 = r3.concat(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = "CryptoUtils.getKeyFromQueryJsonMap"
            r1.zzw(r6, r3)     // Catch: java.io.UnsupportedEncodingException -> L70
        L6b:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzfhr.zzb(r0, r5, r2, r7)     // Catch: java.io.UnsupportedEncodingException -> L70
            return r4
        L70:
            r5 = move-exception
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = "Failed to decode the adResponse. "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.ads.internal.util.zze.zza(r6)
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r7 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r6.zzw(r5, r7)
        L87:
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
            r12 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r12.zzd
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            java.lang.String r0 = r0.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16a
            java.lang.String r1 = zze(r0)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzgR
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r3.zza(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3a
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3a
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            r3 = -1
            if (r1 == r3) goto L38
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L3a
        L38:
            java.lang.String r1 = ""
        L3a:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4e
            com.google.android.gms.internal.ads.zzeki r0 = new com.google.android.gms.internal.ads.zzeki
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            return r0
        L4e:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhh
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L138
            java.lang.Object r3 = r12.zzi
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcho r4 = r12.zza     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r4 = r4.zzo()     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.internal.ads.zzdty r5 = r12.zzh     // Catch: java.lang.Throwable -> L135
            java.lang.String r5 = r4.zzb(r1, r5)     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L135
            java.lang.Object r2 = r6.zza(r2)     // Catch: java.lang.Throwable -> L135
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L135
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L135
            if (r2 == 0) goto L85
            com.google.android.gms.internal.ads.zzdty r2 = r12.zzh     // Catch: java.lang.Throwable -> L135
            java.lang.String r0 = zzf(r0, r1, r5, r2)     // Catch: java.lang.Throwable -> L135
        L85:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L93 java.lang.Throwable -> L135
            r2.<init>(r0)     // Catch: org.json.JSONException -> L93 java.lang.Throwable -> L135
            java.lang.String r6 = "render_id"
            java.lang.String r7 = ""
            java.lang.String r2 = r2.optString(r6, r7)     // Catch: java.lang.Throwable -> L135
            goto L95
        L93:
            java.lang.String r2 = ""
        L95:
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L135
            r7 = 0
            r8 = 0
            if (r6 != 0) goto Lf8
            java.lang.String r6 = ""
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> Lac java.lang.Throwable -> L135
            byte[] r10 = android.util.Base64.decode(r2, r8)     // Catch: java.lang.IllegalArgumentException -> Lac java.lang.Throwable -> L135
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.IllegalArgumentException -> Lac java.lang.Throwable -> L135
            r9.<init>(r10, r11)     // Catch: java.lang.IllegalArgumentException -> Lac java.lang.Throwable -> L135
            r6 = r9
            goto Lc3
        Lac:
            r9 = move-exception
            java.lang.String r10 = "Ad grouping: Has render_id, but not base64 encoded: "
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L135
            java.lang.String r10 = r10.concat(r11)     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.ads.internal.util.zze.zza(r10)     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.internal.ads.zzcad r10 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L135
            java.lang.String r11 = "PreloadedLoader.decodeRenderId"
            r10.zzw(r9, r11)     // Catch: java.lang.Throwable -> L135
        Lc3:
            r9 = 58
            com.google.android.gms.internal.ads.zzfxn r9 = com.google.android.gms.internal.ads.zzfxn.zzc(r9)     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.internal.ads.zzfym r9 = com.google.android.gms.internal.ads.zzfym.zzb(r9)     // Catch: java.lang.Throwable -> L135
            java.util.List r6 = r9.zze(r6)     // Catch: java.lang.Throwable -> L135
            int r9 = r6.size()     // Catch: java.lang.Throwable -> L135
            r10 = 2
            if (r9 != r10) goto Leb
            java.lang.Object r2 = r6.get(r8)     // Catch: java.lang.Throwable -> L135
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L135
            r2 = 1
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Throwable -> L135
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L135
            int r8 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L135
            goto Lf8
        Leb:
            java.lang.String r6 = "Ad grouping: Has render_id, but invalid format: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L135
            java.lang.String r2 = r6.concat(r2)     // Catch: java.lang.Throwable -> L135
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch: java.lang.Throwable -> L135
        Lf8:
            android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L135
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L135
            r2.<init>(r7, r6)     // Catch: java.lang.Throwable -> L135
            java.lang.Object r6 = r2.first     // Catch: java.lang.Throwable -> L135
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L135
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L135
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L135
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L135
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L135
            if (r7 != 0) goto L130
            if (r2 <= 0) goto L130
            boolean r7 = r4.zzh(r1, r6)     // Catch: java.lang.Throwable -> L135
            if (r7 == 0) goto L12a
            com.google.android.gms.internal.ads.zzeki r0 = new com.google.android.gms.internal.ads.zzeki     // Catch: java.lang.Throwable -> L135
            r1 = 10
            java.lang.String r2 = "The ad has already been shown."
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L135
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)     // Catch: java.lang.Throwable -> L135
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L135
            return r0
        L12a:
            boolean r2 = r4.zzg(r1, r6, r2)     // Catch: java.lang.Throwable -> L135
            if (r2 != 0) goto L133
        L130:
            r4.zzf(r1)     // Catch: java.lang.Throwable -> L135
        L133:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L135
            goto L15a
        L135:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L135
            throw r0
        L138:
            com.google.android.gms.internal.ads.zzcho r3 = r12.zza
            com.google.android.gms.internal.ads.zzdty r4 = r12.zzh
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r3 = r3.zzo()
            java.lang.String r5 = r3.zzb(r1, r4)
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L15a
            com.google.android.gms.internal.ads.zzdty r2 = r12.zzh
            java.lang.String r0 = zzf(r0, r1, r5, r2)
        L15a:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L161
            goto L16a
        L161:
            java.lang.String r1 = r12.zzd(r5)
            com.google.common.util.concurrent.ListenableFuture r0 = r12.zzc(r0, r1)
            return r0
        L16a:
            com.google.android.gms.internal.ads.zzfhc r0 = r12.zzd
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L1cb
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgG
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L185
            goto L1b1
        L185:
            java.lang.String r1 = r0.zza
            java.lang.String r2 = r0.zzb
            java.lang.String r1 = zze(r1)
            java.lang.String r2 = zze(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1be
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1be
            com.google.android.gms.internal.ads.zzcho r2 = r12.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r2 = r2.zzo()
            r2.zzf(r1)
            com.google.android.gms.internal.ads.zzdty r2 = r12.zzh
            java.util.Map r2 = r2.zzb()
            java.lang.String r3 = "request_id"
            r2.put(r3, r1)
        L1b1:
            java.lang.String r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r0 = r12.zzd(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r12.zzc(r1, r0)
            return r0
        L1be:
            com.google.android.gms.internal.ads.zzdty r0 = r12.zzh
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = "ridmm"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
        L1cb:
            com.google.android.gms.internal.ads.zzeki r0 = new com.google.android.gms.internal.ads.zzeki
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(org.json.JSONObject r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgt r0 = new com.google.android.gms.internal.ads.zzfgt
            com.google.android.gms.internal.ads.zzfgq r1 = new com.google.android.gms.internal.ads.zzfgq
            com.google.android.gms.internal.ads.zzfhc r2 = r3.zzd
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            java.io.StringReader r2 = new java.io.StringReader
            r2.<init>(r4)
            r4 = 0
            com.google.android.gms.internal.ads.zzfgs r4 = com.google.android.gms.internal.ads.zzfgs.zza(r2, r4)
            r0.<init>(r1, r4)
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r4
    }
}
