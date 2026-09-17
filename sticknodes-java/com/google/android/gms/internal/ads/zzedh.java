package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzedh {
    private final com.google.android.gms.internal.ads.zzbvu zza;

    zzedh(com.google.android.gms.internal.ads.zzbvu r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static void zza(java.util.Map r3, org.json.JSONObject r4) {
            if (r4 != 0) goto L3
            goto L37
        L3:
            java.lang.String r0 = "pii"
            org.json.JSONObject r4 = r4.optJSONObject(r0)
            if (r4 == 0) goto L38
            java.lang.String r0 = "doritos"
            java.lang.String r1 = ""
            java.lang.String r2 = r4.optString(r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L22
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r2 = "x-afma-drt-cookie"
            r3.put(r2, r0)
        L22:
            java.lang.String r0 = "doritos_v2"
            java.lang.String r2 = r4.optString(r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L37
            java.lang.String r4 = r4.optString(r0, r1)
            java.lang.String r0 = "x-afma-drt-v2-cookie"
            r3.put(r0, r4)
        L37:
            return
        L38:
            java.lang.String r3 = "DSID signal does not exist."
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
    }

    public final void zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbvu r0 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "persistFlags"
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.ads.zzcaq.zzb(r0, r2)
            return
        L1e:
            com.google.android.gms.internal.ads.zzcaq.zza(r0, r2)
            return
    }
}
