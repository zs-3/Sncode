package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfgm {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final org.json.JSONObject zzc;
    public final org.json.JSONObject zzd;

    zzfgm(android.util.JsonReader r3) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
            r2 = this;
            r2.<init>()
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzi(r3)
            r2.zzd = r3
            java.lang.String r0 = "ad_html"
            r1 = 0
            java.lang.String r0 = r3.optString(r0, r1)
            r2.zza = r0
            java.lang.String r0 = "ad_base_url"
            java.lang.String r0 = r3.optString(r0, r1)
            r2.zzb = r0
            java.lang.String r0 = "ad_json"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            r2.zzc = r3
            return
    }
}
