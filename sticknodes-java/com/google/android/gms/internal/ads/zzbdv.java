package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbdv extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbdw zzb;

    zzbdv(com.google.android.gms.internal.ads.zzbdw r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Failed to generate query info for Custom Tab error: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzbdw r0 = r3.zzb     // Catch: org.json.JSONException -> L22
            androidx.browser.customtabs.CustomTabsSession r1 = com.google.android.gms.internal.ads.zzbdw.zza(r0)     // Catch: org.json.JSONException -> L22
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L22
            org.json.JSONObject r4 = r0.zzc(r2, r4)     // Catch: org.json.JSONException -> L22
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L22
            r0 = 0
            r1.postMessage(r4, r0)     // Catch: org.json.JSONException -> L22
            return
        L22:
            r4 = move-exception
            java.lang.String r0 = "Error creating PACT Error Response JSON: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo r4) {
            r3 = this;
            java.lang.String r4 = r4.getQuery()
            com.google.android.gms.internal.ads.zzbdw r0 = r3.zzb     // Catch: org.json.JSONException -> L19
            androidx.browser.customtabs.CustomTabsSession r1 = com.google.android.gms.internal.ads.zzbdw.zza(r0)     // Catch: org.json.JSONException -> L19
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L19
            org.json.JSONObject r4 = r0.zzd(r2, r4)     // Catch: org.json.JSONException -> L19
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L19
            r0 = 0
            r1.postMessage(r4, r0)     // Catch: org.json.JSONException -> L19
            return
        L19:
            r4 = move-exception
            java.lang.String r0 = "Error creating PACT Signal Response JSON: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }
}
