package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyi implements com.google.android.gms.internal.ads.zzexg {
    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzfur zzc;

    public zzeyi(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r1, java.lang.String r2, com.google.android.gms.internal.ads.zzfur r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r0 = "pii"
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbs.zzg(r4, r0)     // Catch: org.json.JSONException -> L67
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r3.zza     // Catch: org.json.JSONException -> L67
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.getId()     // Catch: org.json.JSONException -> L67
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L67
            if (r0 != 0) goto L56
            java.lang.String r0 = "rdid"
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r1 = r3.zza     // Catch: org.json.JSONException -> L67
            java.lang.String r1 = r1.getId()     // Catch: org.json.JSONException -> L67
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L67
            java.lang.String r0 = "is_lat"
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r1 = r3.zza     // Catch: org.json.JSONException -> L67
            boolean r1 = r1.isLimitAdTrackingEnabled()     // Catch: org.json.JSONException -> L67
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L67
            java.lang.String r0 = "idtype"
            java.lang.String r1 = "adid"
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L67
            com.google.android.gms.internal.ads.zzfur r0 = r3.zzc     // Catch: org.json.JSONException -> L67
            boolean r0 = r0.zzc()     // Catch: org.json.JSONException -> L67
            if (r0 == 0) goto L66
            java.lang.String r0 = "paidv1_id_android_3p"
            com.google.android.gms.internal.ads.zzfur r1 = r3.zzc     // Catch: org.json.JSONException -> L67
            java.lang.String r1 = r1.zza()     // Catch: org.json.JSONException -> L67
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L67
            java.lang.String r0 = "paidv1_creation_time_android_3p"
            com.google.android.gms.internal.ads.zzfur r1 = r3.zzc     // Catch: org.json.JSONException -> L67
            java.time.Instant r1 = r1.zzb()     // Catch: org.json.JSONException -> L67
            long r1 = r1.toEpochMilli()     // Catch: org.json.JSONException -> L67
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L67
            return
        L56:
            java.lang.String r0 = r3.zzb     // Catch: org.json.JSONException -> L67
            if (r0 == 0) goto L66
            java.lang.String r1 = "pdid"
            r4.put(r1, r0)     // Catch: org.json.JSONException -> L67
            java.lang.String r0 = "pdidtype"
            java.lang.String r1 = "ssaid"
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L67
        L66:
            return
        L67:
            r4 = move-exception
            java.lang.String r0 = "Failed putting Ad ID."
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r4)
            return
    }
}
