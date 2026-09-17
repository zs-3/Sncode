package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbpe {
    public final java.util.List zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    public zzbpe(org.json.JSONObject r5) throws org.json.JSONException {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "id"
            r5.optString(r0)
            java.lang.String r0 = "adapters"
            org.json.JSONArray r0 = r5.getJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length()
            r1.<init>(r2)
            r2 = 0
        L18:
            int r3 = r0.length()
            if (r2 >= r3) goto L28
            java.lang.String r3 = r0.getString(r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto L18
        L28:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r4.zza = r0
            java.lang.String r0 = "allocation_id"
            r1 = 0
            r5.optString(r0, r1)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "clickurl"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "imp_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "downloaded_imp_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "fill_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "video_start_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "video_complete_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "video_reward_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            java.lang.String r0 = "transaction_id"
            r5.optString(r0)
            java.lang.String r0 = "valid_from_timestamp"
            r5.optString(r0)
            java.lang.String r0 = "ad"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            if (r0 == 0) goto L86
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r2 = "manual_impression_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r0, r2)
        L86:
            if (r0 == 0) goto L8b
            r0.toString()
        L8b:
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            if (r0 == 0) goto L98
            java.lang.String r2 = r0.toString()
            goto L99
        L98:
            r2 = r1
        L99:
            r4.zzb = r2
            if (r0 == 0) goto La2
            java.lang.String r2 = "class_name"
            r0.optString(r2)
        La2:
            java.lang.String r0 = "html_template"
            r5.optString(r0, r1)
            java.lang.String r0 = "ad_base_url"
            r5.optString(r0, r1)
            java.lang.String r0 = "assets"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            if (r0 == 0) goto Lb7
            r0.toString()
        Lb7:
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "template_ids"
            com.google.android.gms.internal.ads.zzbpg.zza(r5, r0)
            java.lang.String r0 = "ad_loader_options"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            if (r0 == 0) goto Lca
            r0.toString()
        Lca:
            java.lang.String r0 = "response_type"
            java.lang.String r0 = r5.optString(r0, r1)
            r4.zzc = r0
            r0 = -1
            java.lang.String r2 = "ad_network_timeout_millis"
            r5.optLong(r2, r0)
            return
    }
}
