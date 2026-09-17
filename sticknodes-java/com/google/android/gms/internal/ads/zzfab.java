package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfab implements com.google.android.gms.internal.ads.zzexg {
    private final java.util.List zza;

    public zzfab(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r0 = "eid"
            java.lang.String r1 = ","
            java.util.List r2 = r3.zza     // Catch: org.json.JSONException -> L10
            java.lang.String r1 = android.text.TextUtils.join(r1, r2)     // Catch: org.json.JSONException -> L10
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L10
            return
        L10:
            java.lang.String r4 = "Failed putting experiment ids."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            return
    }
}
