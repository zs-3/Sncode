package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzemx {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final java.util.Map zze;
    private final java.util.concurrent.Executor zzf;
    private org.json.JSONObject zzg;

    zzemx(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzd = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zze = r0
            r1.zzf = r2
            return
    }

    public static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzemx r0) {
            r0.zzj()
            return
    }

    private final synchronized com.google.android.gms.internal.ads.zzgba zzh(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L57
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.zzc()     // Catch: java.lang.Throwable -> L5d
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L1e
            goto L57
        L1e:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdg     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5d
            boolean r0 = java.util.regex.Pattern.matches(r0, r4)     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdh     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5d
            boolean r4 = java.util.regex.Pattern.matches(r1, r4)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L48
            java.util.Map r4 = r3.zze     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            goto L51
        L48:
            if (r4 == 0) goto L57
            java.util.Map r4 = r3.zzd     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5d
        L51:
            com.google.android.gms.internal.ads.zzgba r4 = com.google.android.gms.internal.ads.zzgba.zzc(r0)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r3)
            return r4
        L57:
            com.google.android.gms.internal.ads.zzgba r4 = com.google.android.gms.internal.ads.zzgba.zzd()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r3)
            return r4
        L5d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private final synchronized java.util.List zzi(org.json.JSONObject r8, java.lang.String r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto L9
            goto L5e
        L9:
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch: java.lang.Throwable -> L60
            android.os.Bundle r1 = zzo(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "rtb_adapters"
            org.json.JSONArray r8 = r8.optJSONArray(r2)     // Catch: java.lang.Throwable -> L60
            if (r8 == 0) goto L5e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            r3 = 0
            r4 = 0
        L22:
            int r5 = r8.length()     // Catch: java.lang.Throwable -> L60
            if (r4 >= r5) goto L3a
            java.lang.String r5 = ""
            java.lang.String r5 = r8.optString(r4, r5)     // Catch: java.lang.Throwable -> L60
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L37
            r2.add(r5)     // Catch: java.lang.Throwable -> L60
        L37:
            int r4 = r4 + 1
            goto L22
        L3a:
            int r8 = r2.size()     // Catch: java.lang.Throwable -> L60
        L3e:
            if (r3 >= r8) goto L5e
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L60
            r7.zzg(r4)     // Catch: java.lang.Throwable -> L60
            java.util.Map r5 = r7.zza     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzemz r5 = (com.google.android.gms.internal.ads.zzemz) r5     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L5b
            com.google.android.gms.internal.ads.zzemz r5 = new com.google.android.gms.internal.ads.zzemz     // Catch: java.lang.Throwable -> L60
            r5.<init>(r4, r9, r1)     // Catch: java.lang.Throwable -> L60
            r0.add(r5)     // Catch: java.lang.Throwable -> L60
        L5b:
            int r3 = r3 + 1
            goto L3e
        L5e:
            monitor-exit(r7)
            return r0
        L60:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    private final synchronized void zzj() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L20
            r0.clear()     // Catch: java.lang.Throwable -> L20
            java.util.Map r0 = r1.zza     // Catch: java.lang.Throwable -> L20
            r0.clear()     // Catch: java.lang.Throwable -> L20
            java.util.Map r0 = r1.zze     // Catch: java.lang.Throwable -> L20
            r0.clear()     // Catch: java.lang.Throwable -> L20
            java.util.Map r0 = r1.zzd     // Catch: java.lang.Throwable -> L20
            r0.clear()     // Catch: java.lang.Throwable -> L20
            r1.zzm()     // Catch: java.lang.Throwable -> L20
            r1.zzn()     // Catch: java.lang.Throwable -> L20
            r1.zzk()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)
            return
        L20:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final synchronized void zzk() {
            r14 = this;
            monitor-enter(r14)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbex.zzb     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto Lb1
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbP     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L23
            goto Lb1
        L23:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> Lb3
            org.json.JSONObject r0 = r0.zzf()     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto Lb1
            java.lang.String r1 = "adapter_settings"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            r1 = 0
            r2 = 0
        L3d:
            int r3 = r0.length()     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            if (r2 >= r3) goto Lb1
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r4 = "adapter_class_name"
            java.lang.String r4 = r3.optString(r4)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r5 = "permission_set"
            org.json.JSONArray r3 = r3.optJSONArray(r5)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            if (r5 != 0) goto La6
            r11 = 0
        L5a:
            int r5 = r3.length()     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            if (r11 >= r5) goto La6
            org.json.JSONObject r5 = r3.getJSONObject(r11)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r6 = "enable_rendering"
            boolean r8 = r5.optBoolean(r6, r1)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r6 = "collect_secure_signals"
            boolean r7 = r5.optBoolean(r6, r1)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r6 = "collect_secure_signals_on_full_app"
            boolean r9 = r5.optBoolean(r6, r1)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r6 = "platform"
            java.lang.String r12 = r5.optString(r6)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            com.google.android.gms.internal.ads.zzenb r13 = new com.google.android.gms.internal.ads.zzenb     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            android.os.Bundle r10 = new android.os.Bundle     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            r10.<init>()     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            r5 = r13
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            java.lang.String r5 = "ADMOB"
            boolean r5 = r12.equals(r5)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            if (r5 == 0) goto L96
            java.util.Map r5 = r14.zzd     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            r5.put(r4, r13)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            goto La3
        L96:
            java.lang.String r5 = "AD_MANAGER"
            boolean r5 = r12.equals(r5)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            if (r5 == 0) goto La3
            java.util.Map r5 = r14.zze     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
            r5.put(r4, r13)     // Catch: org.json.JSONException -> La9 java.lang.Throwable -> Lb3
        La3:
            int r11 = r11 + 1
            goto L5a
        La6:
            int r2 = r2 + 1
            goto L3d
        La9:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r14)
            return
        Lb1:
            monitor-exit(r14)
            return
        Lb3:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
    }

    private final synchronized void zzl(java.lang.String r3, java.lang.String r4, java.util.List r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L36
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L36
            java.util.Map r0 = r2.zzc     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L38
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L1c
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
        L1c:
            java.util.Map r1 = r2.zzc     // Catch: java.lang.Throwable -> L38
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r0.get(r4)     // Catch: java.lang.Throwable -> L38
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L2e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
        L2e:
            r3.addAll(r5)     // Catch: java.lang.Throwable -> L38
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r2)
            return
        L36:
            monitor-exit(r2)
            return
        L38:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private final synchronized void zzm() {
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L9d
            org.json.JSONObject r0 = r0.zzf()     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L15
            goto L93
        L15:
            java.lang.String r1 = "ad_unit_id_settings"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.lang.String r2 = "ad_unit_patterns"
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            r9.zzg = r0     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            if (r1 == 0) goto L93
            r0 = 0
            r2 = 0
        L27:
            int r3 = r1.length()     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            if (r2 >= r3) goto L93
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzkz     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.lang.Object r4 = r5.zza(r4)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            boolean r4 = r4.booleanValue()     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            if (r4 == 0) goto L52
            java.lang.String r4 = "ad_unit_id"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            goto L5a
        L52:
            java.lang.String r4 = "ad_unit_id"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
        L5a:
            java.lang.String r5 = "format"
            java.lang.String r6 = ""
            java.lang.String r5 = r3.optString(r5, r6)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            r6.<init>()     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.lang.String r7 = "mediation_config"
            org.json.JSONObject r3 = r3.optJSONObject(r7)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            if (r3 != 0) goto L70
            goto L8d
        L70:
            java.lang.String r7 = "ad_networks"
            org.json.JSONArray r3 = r3.optJSONArray(r7)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            if (r3 == 0) goto L8d
            r7 = 0
        L79:
            int r8 = r3.length()     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            if (r7 >= r8) goto L8d
            org.json.JSONObject r8 = r3.getJSONObject(r7)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            java.util.List r8 = r9.zzi(r8, r5)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            r6.addAll(r8)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            int r7 = r7 + 1
            goto L79
        L8d:
            r9.zzl(r5, r4, r6)     // Catch: org.json.JSONException -> L95 java.lang.Throwable -> L9d
            int r2 = r2 + 1
            goto L27
        L93:
            monitor-exit(r9)
            return
        L95:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r9)
            return
        L9d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    private final synchronized void zzn() {
            r12 = this;
            monitor-enter(r12)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbex.zzf     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L80
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbO     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L22
            goto L80
        L22:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L82
            org.json.JSONObject r0 = r0.zzf()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L80
            java.lang.String r1 = "signal_adapters"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            r1 = 0
            r2 = 0
        L3c:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            if (r2 >= r3) goto L80
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            android.os.Bundle r10 = zzo(r4)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            java.lang.String r4 = "adapter_class_name"
            java.lang.String r4 = r3.optString(r4)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            java.lang.String r5 = "render"
            boolean r8 = r3.optBoolean(r5, r1)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            java.lang.String r5 = "collect_signals"
            boolean r7 = r3.optBoolean(r5, r1)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            if (r3 != 0) goto L75
            java.util.Map r3 = r12.zzb     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            com.google.android.gms.internal.ads.zzenb r11 = new com.google.android.gms.internal.ads.zzenb     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            r9 = 1
            r5 = r11
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
            r3.put(r4, r11)     // Catch: org.json.JSONException -> L78 java.lang.Throwable -> L82
        L75:
            int r2 = r2 + 1
            goto L3c
        L78:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r12)
            return
        L80:
            monitor-exit(r12)
            return
        L82:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    private static final android.os.Bundle zzo(org.json.JSONObject r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r4 == 0) goto L21
            java.util.Iterator r1 = r4.keys()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            java.lang.String r3 = r4.optString(r2, r3)
            r0.putString(r2, r3)
            goto Lb
        L21:
            return r0
    }

    public final synchronized java.util.Map zza(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            monitor-enter(r10)
            java.util.Map r11 = r10.zzb(r11, r12)     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzgba r12 = r10.zzh(r12)     // Catch: java.lang.Throwable -> L99
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L99
            r0.<init>()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzgba r11 = (com.google.android.gms.internal.ads.zzgba) r11     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzgbc r11 = r11.zzh()     // Catch: java.lang.Throwable -> L99
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L99
        L18:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L63
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L99
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L99
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L99
            boolean r3 = r12.containsKey(r2)     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto L18
            java.lang.Object r3 = r12.get(r2)     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzenb r3 = (com.google.android.gms.internal.ads.zzenb) r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L99
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzenb r9 = new com.google.android.gms.internal.ads.zzenb     // Catch: java.lang.Throwable -> L99
            boolean r5 = r3.zzb     // Catch: java.lang.Throwable -> L99
            boolean r6 = r3.zzc     // Catch: java.lang.Throwable -> L99
            boolean r7 = r3.zzd     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L54
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L99
            if (r3 != 0) goto L54
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L99
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Throwable -> L99
            goto L59
        L54:
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L99
            r1.<init>()     // Catch: java.lang.Throwable -> L99
        L59:
            r8 = r1
            r3 = r9
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L99
            r0.put(r2, r9)     // Catch: java.lang.Throwable -> L99
            goto L18
        L63:
            com.google.android.gms.internal.ads.zzgbc r11 = r12.zzh()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzgdd r11 = r11.zze()     // Catch: java.lang.Throwable -> L99
        L6b:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L99
            if (r12 == 0) goto L97
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L99
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r12.getKey()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L99
            boolean r2 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L6b
            java.lang.Object r2 = r12.getValue()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzenb r2 = (com.google.android.gms.internal.ads.zzenb) r2     // Catch: java.lang.Throwable -> L99
            boolean r2 = r2.zzd     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L6b
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.internal.ads.zzenb r12 = (com.google.android.gms.internal.ads.zzenb) r12     // Catch: java.lang.Throwable -> L99
            r0.put(r1, r12)     // Catch: java.lang.Throwable -> L99
            goto L6b
        L97:
            monitor-exit(r10)
            return r0
        L99:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public final synchronized java.util.Map zzb(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L94
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L94
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r0.zzc()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L24
            goto L94
        L24:
            java.util.Map r0 = r3.zzc     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L9a
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L94
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L9a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto L5b
            org.json.JSONObject r1 = r3.zzg     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = com.google.android.gms.internal.ads.zzdsb.zza(r1, r5, r4)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzkz     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r5 = r1.zza(r5)     // Catch: java.lang.Throwable -> L9a
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L54
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.Throwable -> L9a
        L54:
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L9a
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L9a
        L5b:
            if (r1 == 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Throwable -> L9a
        L66:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzemz r0 = (com.google.android.gms.internal.ads.zzemz) r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r0.zza     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r4.containsKey(r1)     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L82
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            r2.<init>()     // Catch: java.lang.Throwable -> L9a
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L9a
        L82:
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Throwable -> L9a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L9a
            android.os.Bundle r0 = r0.zzb     // Catch: java.lang.Throwable -> L9a
            r1.add(r0)     // Catch: java.lang.Throwable -> L9a
            goto L66
        L8e:
            com.google.android.gms.internal.ads.zzgba r4 = com.google.android.gms.internal.ads.zzgba.zzc(r4)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r3)
            return r4
        L94:
            com.google.android.gms.internal.ads.zzgba r4 = com.google.android.gms.internal.ads.zzgba.zzd()     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r3)
            return r4
        L9a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized java.util.Map zzc() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.zzc()     // Catch: java.lang.Throwable -> L25
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzgba r0 = com.google.android.gms.internal.ads.zzgba.zzd()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return r0
        L1d:
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgba r0 = com.google.android.gms.internal.ads.zzgba.zzc(r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return r0
        L25:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzemw r1 = new com.google.android.gms.internal.ads.zzemw
            r1.<init>(r2)
            r0.zzr(r1)
            com.google.android.gms.internal.ads.zzemv r0 = new com.google.android.gms.internal.ads.zzemv
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzf
            r1.execute(r0)
            return
    }

    final /* synthetic */ void zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzemv r0 = new com.google.android.gms.internal.ads.zzemv
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzf
            r1.execute(r0)
            return
    }

    public final synchronized void zzg(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L8
            goto L23
        L8:
            java.util.Map r0 = r4.zza     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L23
            java.util.Map r0 = r4.zza     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzemz r1 = new com.google.android.gms.internal.ads.zzemz     // Catch: java.lang.Throwable -> L25
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = ""
            r1.<init>(r5, r3, r2)     // Catch: java.lang.Throwable -> L25
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            return
        L23:
            monitor-exit(r4)
            return
        L25:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
