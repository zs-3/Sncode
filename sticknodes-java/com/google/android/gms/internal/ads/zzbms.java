package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbms {
    public static void zza(com.google.android.gms.internal.ads.zzbmt r1, java.lang.String r2, java.util.Map r3) {
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> Lc
            org.json.JSONObject r3 = r0.zzj(r3)     // Catch: org.json.JSONException -> Lc
            r1.zze(r2, r3)
            return
        Lc:
            java.lang.String r1 = "Could not convert parameters to JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
    }

    public static void zzb(com.google.android.gms.internal.ads.zzbmt r2, java.lang.String r3, org.json.JSONObject r4) {
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(window.AFMA_ReceiveMessage || function() {})('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "',"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ");"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "Dispatching AFMA event: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            java.lang.String r3 = r0.toString()
            r2.zza(r3)
            return
    }

    public static void zzc(com.google.android.gms.internal.ads.zzbmt r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ");"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.zza(r2)
            return
    }

    public static void zzd(com.google.android.gms.internal.ads.zzbmt r0, java.lang.String r1, org.json.JSONObject r2) {
            java.lang.String r2 = r2.toString()
            r0.zzb(r1, r2)
            return
    }
}
