package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjm implements com.google.android.gms.internal.ads.zzbjw {
    zzbjm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3
            java.lang.String r0 = "args"
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L30
            r0.<init>(r4)     // Catch: org.json.JSONException -> L30
            android.content.Context r3 = r3.getContext()     // Catch: org.json.JSONException -> L30
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r3)     // Catch: org.json.JSONException -> L30
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: org.json.JSONException -> L30
            r4 = 0
        L1c:
            int r1 = r0.length()     // Catch: org.json.JSONException -> L30
            if (r4 >= r1) goto L2c
            java.lang.String r1 = r0.getString(r4)     // Catch: org.json.JSONException -> L30
            r3.remove(r1)     // Catch: org.json.JSONException -> L30
            int r4 = r4 + 1
            goto L1c
        L2c:
            r3.apply()     // Catch: org.json.JSONException -> L30
            return
        L30:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "GMSG clear local storage keys handler"
            r4.zzw(r3, r0)
            return
    }
}
