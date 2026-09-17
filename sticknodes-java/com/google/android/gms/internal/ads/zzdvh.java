package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdvh {
    private java.lang.Long zza;
    private final java.lang.String zzb;
    private java.lang.String zzc;
    private java.lang.Integer zzd;
    private java.lang.String zze;
    private java.lang.Integer zzf;

    /* synthetic */ zzdvh(java.lang.String r1, com.google.android.gms.internal.ads.zzdvg r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String zza(com.google.android.gms.internal.ads.zzdvh r4) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjD
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "objectId"
            java.lang.Long r3 = r4.zza     // Catch: org.json.JSONException -> L3c
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L3c
            java.lang.String r2 = "eventCategory"
            java.lang.String r3 = r4.zzb     // Catch: org.json.JSONException -> L3c
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3c
            java.lang.String r2 = "event"
            java.lang.String r3 = r4.zzc     // Catch: org.json.JSONException -> L3c
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L3c
            java.lang.String r2 = "errorCode"
            java.lang.Integer r3 = r4.zzd     // Catch: org.json.JSONException -> L3c
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L3c
            java.lang.String r2 = "rewardType"
            java.lang.String r3 = r4.zze     // Catch: org.json.JSONException -> L3c
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L3c
            java.lang.String r2 = "rewardAmount"
            java.lang.Integer r4 = r4.zzf     // Catch: org.json.JSONException -> L3c
            r1.putOpt(r2, r4)     // Catch: org.json.JSONException -> L3c
            goto L41
        L3c:
            java.lang.String r4 = "Could not convert parameters to JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
        L41:
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "(\"h5adsEvent\","
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = ");"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdvh r0, java.lang.Integer r1) {
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzdvh r0, java.lang.String r1) {
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzdvh r0, java.lang.Long r1) {
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzdvh r0, java.lang.Integer r1) {
            r0.zzf = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdvh r0, java.lang.String r1) {
            r0.zze = r1
            return
    }
}
