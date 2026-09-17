package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzecn implements com.google.android.gms.internal.ads.zzbog {
    zzecn() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* bridge */ /* synthetic */ org.json.JSONObject zzb(java.lang.Object r7) throws org.json.JSONException {
            r6 = this;
            com.google.android.gms.internal.ads.zzeco r7 = (com.google.android.gms.internal.ads.zzeco) r7
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zziQ
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L39
            com.google.android.gms.internal.ads.zzbwc r3 = r7.zzd
            java.lang.String r3 = r3.zzg()
            java.lang.String r4 = "ad_request_url"
            r1.put(r4, r3)
            com.google.android.gms.internal.ads.zzbwc r3 = r7.zzd
            java.lang.String r3 = r3.zzf()
            java.lang.String r4 = "ad_request_post_body"
            r1.put(r4, r3)
        L39:
            com.google.android.gms.internal.ads.zzbwc r3 = r7.zzd
            java.lang.String r3 = r3.zzd()
            java.lang.String r4 = "base_url"
            r1.put(r4, r3)
            org.json.JSONObject r3 = r7.zzc
            java.lang.String r4 = "signals"
            r1.put(r4, r3)
            com.google.android.gms.internal.ads.zzedc r3 = r7.zzb
            java.lang.String r3 = r3.zzc
            java.lang.String r4 = "body"
            r2.put(r4, r3)
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            com.google.android.gms.internal.ads.zzedc r4 = r7.zzb
            java.util.Map r4 = r4.zzb
            org.json.JSONObject r3 = r3.zzj(r4)
            java.lang.String r4 = "headers"
            r2.put(r4, r3)
            com.google.android.gms.internal.ads.zzedc r3 = r7.zzb
            int r3 = r3.zza
            java.lang.String r4 = "response_code"
            r2.put(r4, r3)
            com.google.android.gms.internal.ads.zzedc r3 = r7.zzb
            long r3 = r3.zzd
            java.lang.String r5 = "latency"
            r2.put(r5, r3)
            java.lang.String r3 = "request"
            r0.put(r3, r1)
            java.lang.String r1 = "response"
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzbwc r7 = r7.zzd
            org.json.JSONObject r7 = r7.zzi()
            java.lang.String r1 = "flags"
            r0.put(r1, r7)
            return r0
    }
}
