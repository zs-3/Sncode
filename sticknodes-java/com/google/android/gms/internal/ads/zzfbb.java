package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfbb implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;

    public zzfbb(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r0 = r2.zza     // Catch: org.json.JSONException -> L18
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L18
            if (r0 != 0) goto L17
            java.lang.String r0 = "pii"
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzg(r3, r0)     // Catch: org.json.JSONException -> L18
            java.lang.String r0 = "adsid"
            java.lang.String r1 = r2.zza     // Catch: org.json.JSONException -> L18
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L18
        L17:
            return
        L18:
            r3 = move-exception
            java.lang.String r0 = "Failed putting trustless token."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            return
    }
}
