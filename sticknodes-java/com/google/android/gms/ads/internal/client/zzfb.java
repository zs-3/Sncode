package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfb {
    private final java.lang.String zza;
    private final android.os.Bundle zzb;
    private final java.lang.String zzc;

    public zzfb(java.lang.String r1, android.os.Bundle r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final android.os.Bundle zza() {
            r1 = this;
            android.os.Bundle r0 = r1.zzb
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.lang.String zzc() {
            r3 = this;
            java.lang.String r0 = r3.zzc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto Lb
            goto L19
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L19
            java.lang.String r2 = r3.zzc     // Catch: org.json.JSONException -> L19
            r0.<init>(r2)     // Catch: org.json.JSONException -> L19
            java.lang.String r2 = "request_id"
            java.lang.String r0 = r0.optString(r2, r1)     // Catch: org.json.JSONException -> L19
            return r0
        L19:
            return r1
    }
}
