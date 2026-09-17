package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzezx implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzezx(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r0 = "pii"
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzg(r3, r0)     // Catch: org.json.JSONException -> L17
            java.lang.String r0 = "doritos"
            java.lang.String r1 = r2.zza     // Catch: org.json.JSONException -> L17
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L17
            java.lang.String r0 = "doritos_v2"
            java.lang.String r1 = r2.zzb     // Catch: org.json.JSONException -> L17
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L17
            return
        L17:
            java.lang.String r3 = "Failed putting doritos string."
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
    }
}
