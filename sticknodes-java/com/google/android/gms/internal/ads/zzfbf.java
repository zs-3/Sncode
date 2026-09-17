package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfbf implements com.google.android.gms.internal.ads.zzexg {
    private final java.util.Map zza;

    public zzfbf(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r0 = "video_decoders"
            com.google.android.gms.ads.internal.util.client.zzf r1 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L12
            java.util.Map r2 = r3.zza     // Catch: org.json.JSONException -> L12
            org.json.JSONObject r1 = r1.zzj(r2)     // Catch: org.json.JSONException -> L12
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L12
            return
        L12:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Could not encode video decoder properties: "
            java.lang.String r4 = r0.concat(r4)
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            return
    }
}
