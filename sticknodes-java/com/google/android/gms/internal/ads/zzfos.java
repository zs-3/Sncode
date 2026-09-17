package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfos implements androidx.webkit.WebViewCompat.WebMessageListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfot zza;

    zzfos(com.google.android.gms.internal.ads.zzfot r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(android.webkit.WebView r1, androidx.webkit.WebMessageCompat r2, android.net.Uri r3, boolean r4, androidx.webkit.JavaScriptReplyProxy r5) {
            r0 = this;
            java.lang.String r1 = r2.getData()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r2.<init>(r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r1 = "method"
            java.lang.String r1 = r2.getString(r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r3 = "data"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r3 = "adSessionId"
            java.lang.String r2 = r2.getString(r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r3 = "startSession"
            boolean r3 = r1.equals(r3)     // Catch: org.json.JSONException -> L3d
            if (r3 != 0) goto L37
            java.lang.String r3 = "finishSession"
            boolean r1 = r1.equals(r3)     // Catch: org.json.JSONException -> L3d
            if (r1 != 0) goto L31
            java.lang.Boolean r1 = com.google.android.gms.internal.ads.zzfof.zza     // Catch: org.json.JSONException -> L3d
            r1.booleanValue()     // Catch: org.json.JSONException -> L3d
            return
        L31:
            com.google.android.gms.internal.ads.zzfot r1 = r0.zza     // Catch: org.json.JSONException -> L3d
            com.google.android.gms.internal.ads.zzfot.zzb(r1, r2)     // Catch: org.json.JSONException -> L3d
            return
        L37:
            com.google.android.gms.internal.ads.zzfot r1 = r0.zza     // Catch: org.json.JSONException -> L3d
            com.google.android.gms.internal.ads.zzfot.zzd(r1, r2)     // Catch: org.json.JSONException -> L3d
            return
        L3d:
            r1 = move-exception
            java.lang.String r2 = "Error parsing JS message in JavaScriptSessionService."
            com.google.android.gms.internal.ads.zzfpy.zza(r2, r1)
            return
    }
}
