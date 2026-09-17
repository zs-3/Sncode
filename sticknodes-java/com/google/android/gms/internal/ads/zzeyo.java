package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyo implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;

    public zzeyo(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r0 = "ms"
            java.lang.String r1 = r2.zza     // Catch: org.json.JSONException -> La
            r3.put(r0, r1)     // Catch: org.json.JSONException -> La
            return
        La:
            r3 = move-exception
            java.lang.String r0 = "Failed putting Ad ID."
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r3)
            return
    }
}
