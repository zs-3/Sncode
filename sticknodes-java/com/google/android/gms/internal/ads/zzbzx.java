package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbzx {
    private final java.util.List zza;
    private final java.util.List zzb;
    private final java.util.Map zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private org.json.JSONObject zzg;
    private boolean zzh;
    private final java.util.List zzi;
    private boolean zzj;

    public zzbzx(java.lang.String r5, long r6) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.zzc = r0
            java.lang.String r0 = ""
            r4.zzd = r0
            r0 = 0
            r4.zzh = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.zzi = r1
            r4.zzj = r0
            r4.zze = r5
            r4.zzf = r6
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L34
            goto L14e
        L34:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L14f
            r6.<init>(r5)     // Catch: org.json.JSONException -> L14f
            r4.zzg = r6     // Catch: org.json.JSONException -> L14f
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzlo     // Catch: org.json.JSONException -> L14f
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L14f
            java.lang.Object r5 = r6.zza(r5)     // Catch: org.json.JSONException -> L14f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: org.json.JSONException -> L14f
            boolean r5 = r5.booleanValue()     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto L53
            boolean r5 = r4.zzj()     // Catch: org.json.JSONException -> L14f
            if (r5 != 0) goto L14e
        L53:
            org.json.JSONObject r5 = r4.zzg     // Catch: org.json.JSONException -> L14f
            java.lang.String r6 = "status"
            r7 = -1
            int r5 = r5.optInt(r6, r7)     // Catch: org.json.JSONException -> L14f
            r6 = 1
            if (r5 == r6) goto L67
            r4.zzh = r0     // Catch: org.json.JSONException -> L14f
            java.lang.String r5 = "App settings could not be fetched successfully."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)     // Catch: org.json.JSONException -> L14f
            return
        L67:
            r4.zzh = r6     // Catch: org.json.JSONException -> L14f
            org.json.JSONObject r5 = r4.zzg     // Catch: org.json.JSONException -> L14f
            java.lang.String r6 = "app_id"
            java.lang.String r5 = r5.optString(r6)     // Catch: org.json.JSONException -> L14f
            r4.zzd = r5     // Catch: org.json.JSONException -> L14f
            org.json.JSONObject r5 = r4.zzg     // Catch: org.json.JSONException -> L14f
            java.lang.String r6 = "ad_unit_id_settings"
            org.json.JSONArray r5 = r5.optJSONArray(r6)     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto Ld4
            r6 = 0
        L7e:
            int r7 = r5.length()     // Catch: org.json.JSONException -> L14f
            if (r6 >= r7) goto Ld4
            org.json.JSONObject r7 = r5.getJSONObject(r6)     // Catch: org.json.JSONException -> L14f
            java.lang.String r1 = "format"
            java.lang.String r1 = r7.optString(r1)     // Catch: org.json.JSONException -> L14f
            java.lang.String r2 = "ad_unit_id"
            java.lang.String r2 = r7.optString(r2)     // Catch: org.json.JSONException -> L14f
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L14f
            if (r3 != 0) goto Ld1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L14f
            if (r3 == 0) goto La1
            goto Ld1
        La1:
            java.lang.String r3 = "interstitial"
            boolean r3 = r3.equalsIgnoreCase(r1)     // Catch: org.json.JSONException -> L14f
            if (r3 == 0) goto Laf
            java.util.List r7 = r4.zzb     // Catch: org.json.JSONException -> L14f
            r7.add(r2)     // Catch: org.json.JSONException -> L14f
            goto Ld1
        Laf:
            java.lang.String r3 = "rewarded"
            boolean r3 = r3.equalsIgnoreCase(r1)     // Catch: org.json.JSONException -> L14f
            if (r3 != 0) goto Lbf
            java.lang.String r3 = "rewarded_interstitial"
            boolean r1 = r3.equals(r1)     // Catch: org.json.JSONException -> L14f
            if (r1 == 0) goto Ld1
        Lbf:
            java.lang.String r1 = "mediation_config"
            org.json.JSONObject r7 = r7.optJSONObject(r1)     // Catch: org.json.JSONException -> L14f
            if (r7 == 0) goto Ld1
            com.google.android.gms.internal.ads.zzbpf r1 = new com.google.android.gms.internal.ads.zzbpf     // Catch: org.json.JSONException -> L14f
            r1.<init>(r7)     // Catch: org.json.JSONException -> L14f
            java.util.Map r7 = r4.zzc     // Catch: org.json.JSONException -> L14f
            r7.put(r2, r1)     // Catch: org.json.JSONException -> L14f
        Ld1:
            int r6 = r6 + 1
            goto L7e
        Ld4:
            org.json.JSONObject r5 = r4.zzg     // Catch: org.json.JSONException -> L14f
            java.lang.String r6 = "persistable_banner_ad_unit_ids"
            org.json.JSONArray r5 = r5.optJSONArray(r6)     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto Lf1
            r6 = 0
        Ldf:
            int r7 = r5.length()     // Catch: org.json.JSONException -> L14f
            if (r6 >= r7) goto Lf1
            java.lang.String r7 = r5.optString(r6)     // Catch: org.json.JSONException -> L14f
            java.util.List r1 = r4.zza     // Catch: org.json.JSONException -> L14f
            r1.add(r7)     // Catch: org.json.JSONException -> L14f
            int r6 = r6 + 1
            goto Ldf
        Lf1:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzgF     // Catch: org.json.JSONException -> L14f
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L14f
            java.lang.Object r5 = r6.zza(r5)     // Catch: org.json.JSONException -> L14f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: org.json.JSONException -> L14f
            boolean r5 = r5.booleanValue()     // Catch: org.json.JSONException -> L14f
            java.lang.String r6 = "common_settings"
            if (r5 == 0) goto L12c
            org.json.JSONObject r5 = r4.zzg     // Catch: org.json.JSONException -> L14f
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto L12c
            java.lang.String r7 = "loeid"
            org.json.JSONArray r5 = r5.optJSONArray(r7)     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto L12c
            r7 = 0
        L116:
            int r1 = r5.length()     // Catch: org.json.JSONException -> L14f
            if (r7 >= r1) goto L12c
            java.util.List r1 = r4.zzi     // Catch: org.json.JSONException -> L14f
            java.lang.Object r2 = r5.get(r7)     // Catch: org.json.JSONException -> L14f
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L14f
            r1.add(r2)     // Catch: org.json.JSONException -> L14f
            int r7 = r7 + 1
            goto L116
        L12c:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzga     // Catch: org.json.JSONException -> L14f
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L14f
            java.lang.Object r5 = r7.zza(r5)     // Catch: org.json.JSONException -> L14f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: org.json.JSONException -> L14f
            boolean r5 = r5.booleanValue()     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto L14e
            org.json.JSONObject r5 = r4.zzg     // Catch: org.json.JSONException -> L14f
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: org.json.JSONException -> L14f
            if (r5 == 0) goto L14e
            java.lang.String r6 = "is_prefetching_enabled"
            boolean r5 = r5.optBoolean(r6, r0)     // Catch: org.json.JSONException -> L14f
            r4.zzj = r5     // Catch: org.json.JSONException -> L14f
        L14e:
            return
        L14f:
            r5 = move-exception
            java.lang.String r6 = "Exception occurred while processing app setting json"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r5)
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r7 = "AppSettings.parseAppSettingsJson"
            r6.zzw(r5, r7)
            return
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final java.util.List zzd() {
            r1 = this;
            java.util.List r0 = r1.zzi
            return r0
    }

    public final java.util.Map zze() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            return r0
    }

    public final org.json.JSONObject zzf() {
            r1 = this;
            org.json.JSONObject r0 = r1.zzg
            return r0
    }

    public final void zzg(long r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public final boolean zzh() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    public final boolean zzi() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }

    public final boolean zzj() {
            r8 = this;
            java.lang.String r0 = r8.zze
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L91
            org.json.JSONObject r0 = r8.zzg
            if (r0 != 0) goto Lf
            goto L91
        Lf:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlr
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzlq
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4f
            java.lang.String r4 = r8.zze
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L4f
            org.json.JSONObject r2 = r8.zzg
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            java.lang.String r0 = "cache_ttl_sec"
            long r2 = r2.optLong(r0, r3)
        L4f:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r0.currentTimeMillis()
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L91
            long r6 = r8.zzf
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L6e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r4 - r6
            long r4 = r0.toSeconds(r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L91
        L6e:
            java.util.List r0 = r8.zza
            r0.clear()
            java.util.List r0 = r8.zzb
            r0.clear()
            java.util.Map r0 = r8.zzc
            r0.clear()
            java.lang.String r0 = ""
            r8.zzd = r0
            r8.zze = r0
            r0 = 0
            r8.zzg = r0
            r8.zzh = r1
            java.util.List r0 = r8.zzi
            r0.clear()
            r8.zzj = r1
            r0 = 1
            return r0
        L91:
            return r1
    }
}
