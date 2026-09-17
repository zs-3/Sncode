package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class LoadAdError extends com.google.android.gms.ads.AdError {
    private final com.google.android.gms.ads.ResponseInfo zza;

    public LoadAdError(int r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.AdError r4, com.google.android.gms.ads.ResponseInfo r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.zza = r5
            return
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
            r1 = this;
            com.google.android.gms.ads.ResponseInfo r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.AdError
    public java.lang.String toString() {
            r2 = this;
            org.json.JSONObject r0 = r2.zzb()     // Catch: org.json.JSONException -> La
            r1 = 2
            java.lang.String r0 = r0.toString(r1)     // Catch: org.json.JSONException -> La
            goto Lc
        La:
            java.lang.String r0 = "Error forming toString output."
        Lc:
            return r0
    }

    @Override // com.google.android.gms.ads.AdError
    public final org.json.JSONObject zzb() throws org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = super.zzb()
            com.google.android.gms.ads.ResponseInfo r1 = r3.getResponseInfo()
            java.lang.String r2 = "Response Info"
            if (r1 != 0) goto L12
            java.lang.String r1 = "null"
            r0.put(r2, r1)
            goto L19
        L12:
            org.json.JSONObject r1 = r1.zzd()
            r0.put(r2, r1)
        L19:
            return r0
    }
}
