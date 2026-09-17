package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbpf {
    public final java.util.List zza;

    public zzbpf(org.json.JSONObject r10) throws org.json.JSONException {
            r9 = this;
            r9.<init>()
            r0 = 2
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r0)
            if (r1 == 0) goto L1b
            java.lang.String r0 = r10.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Mediation Response JSON: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L1b:
            java.lang.String r0 = "ad_networks"
            org.json.JSONArray r0 = r10.getJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length()
            r1.<init>(r2)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
        L2e:
            int r6 = r0.length()
            if (r4 >= r6) goto L67
            com.google.android.gms.internal.ads.zzbpe r6 = new com.google.android.gms.internal.ads.zzbpe     // Catch: org.json.JSONException -> L64
            org.json.JSONObject r7 = r0.getJSONObject(r4)     // Catch: org.json.JSONException -> L64
            r6.<init>(r7)     // Catch: org.json.JSONException -> L64
            java.lang.String r7 = r6.zzc
            java.lang.String r8 = "banner"
            r8.equalsIgnoreCase(r7)
            r1.add(r6)
            if (r5 >= 0) goto L64
            java.util.List r6 = r6.zza
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L64
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L4f
            r5 = r4
        L64:
            int r4 = r4 + 1
            goto L2e
        L67:
            r0.length()
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r9.zza = r0
            java.lang.String r0 = "qdata"
            r10.optString(r0)
            java.lang.String r0 = "fs_model_type"
            r10.optInt(r0, r2)
            java.lang.String r0 = "timeout_ms"
            r1 = -1
            r10.optLong(r0, r1)
            java.lang.String r0 = "settings"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto Ldd
            java.lang.String r0 = "ad_network_timeout_millis"
            r10.optLong(r0, r1)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "click_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r10, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "imp_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r10, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "downloaded_imp_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r10, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "nofill_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r10, r0)
            com.google.android.gms.ads.internal.zzu.zzg()
            java.lang.String r0 = "remote_ping_urls"
            com.google.android.gms.internal.ads.zzbpg.zza(r10, r0)
            java.lang.String r0 = "render_in_browser"
            r10.optBoolean(r0, r3)
            java.lang.String r0 = "refresh"
            r10.optLong(r0, r1)
            java.lang.String r0 = "rewards"
            org.json.JSONArray r0 = r10.optJSONArray(r0)
            com.google.android.gms.internal.ads.zzbwy.zza(r0)
            java.lang.String r0 = "use_displayed_impression"
            r10.optBoolean(r0, r3)
            java.lang.String r0 = "allow_pub_rendered_attribution"
            r10.optBoolean(r0, r3)
            java.lang.String r0 = "allow_pub_owned_ad_view"
            r10.optBoolean(r0, r3)
            java.lang.String r0 = "allow_custom_click_gesture"
            r10.optBoolean(r0, r3)
        Ldd:
            return
    }
}
