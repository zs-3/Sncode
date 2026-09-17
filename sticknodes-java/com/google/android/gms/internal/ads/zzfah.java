package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfah implements com.google.android.gms.internal.ads.zzexg {
    private final android.os.Bundle zza;

    public zzfah(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            android.os.Bundle r0 = r3.zza
            if (r0 == 0) goto L27
            java.lang.String r0 = "device"
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbs.zzg(r4, r0)     // Catch: org.json.JSONException -> L22
            java.lang.String r0 = "play_store"
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbs.zzg(r4, r0)     // Catch: org.json.JSONException -> L22
            java.lang.String r0 = "parental_controls"
            com.google.android.gms.ads.internal.util.client.zzf r1 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L22
            android.os.Bundle r2 = r3.zza     // Catch: org.json.JSONException -> L22
            org.json.JSONObject r1 = r1.zzi(r2)     // Catch: org.json.JSONException -> L22
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L22
            return
        L22:
            java.lang.String r4 = "Failed putting parental controls bundle."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
        L27:
            return
    }
}
