package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class AdapterResponseInfo {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final com.google.android.gms.ads.AdError zzb;

    private AdapterResponseInfo(com.google.android.gms.ads.internal.client.zzw r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.ads.internal.client.zze r1 = r1.zzc
            if (r1 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            com.google.android.gms.ads.AdError r1 = r1.zza()
        Lf:
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.ads.AdapterResponseInfo zza(com.google.android.gms.ads.internal.client.zzw r1) {
            if (r1 == 0) goto L8
            com.google.android.gms.ads.AdapterResponseInfo r0 = new com.google.android.gms.ads.AdapterResponseInfo
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    public com.google.android.gms.ads.AdError getAdError() {
            r1 = this;
            com.google.android.gms.ads.AdError r0 = r1.zzb
            return r0
    }

    public java.lang.String getAdSourceId() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zza
            java.lang.String r0 = r0.zzf
            return r0
    }

    public java.lang.String getAdSourceInstanceId() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zza
            java.lang.String r0 = r0.zzh
            return r0
    }

    public java.lang.String getAdSourceInstanceName() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zza
            java.lang.String r0 = r0.zzg
            return r0
    }

    public java.lang.String getAdSourceName() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zza
            java.lang.String r0 = r0.zze
            return r0
    }

    public java.lang.String getAdapterClassName() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zza
            java.lang.String r0 = r0.zza
            return r0
    }

    public android.os.Bundle getCredentials() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zza
            android.os.Bundle r0 = r0.zzd
            return r0
    }

    public long getLatencyMillis() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r2.zza
            long r0 = r0.zzb
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.json.JSONObject r0 = r2.zzb()     // Catch: org.json.JSONException -> La
            r1 = 2
            java.lang.String r0 = r0.toString(r1)     // Catch: org.json.JSONException -> La
            goto Lc
        La:
            java.lang.String r0 = "Error forming toString output."
        Lc:
            return r0
    }

    public final org.json.JSONObject zzb() throws org.json.JSONException {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzw r1 = r6.zza
            java.lang.String r1 = r1.zza
            java.lang.String r2 = "Adapter"
            r0.put(r2, r1)
            com.google.android.gms.ads.internal.client.zzw r1 = r6.zza
            long r1 = r1.zzb
            java.lang.String r3 = "Latency"
            r0.put(r3, r1)
            java.lang.String r1 = r6.getAdSourceName()
            java.lang.String r2 = "Ad Source Name"
            java.lang.String r3 = "null"
            if (r1 != 0) goto L25
            r0.put(r2, r3)
            goto L28
        L25:
            r0.put(r2, r1)
        L28:
            java.lang.String r1 = r6.getAdSourceId()
            java.lang.String r2 = "Ad Source ID"
            if (r1 != 0) goto L34
            r0.put(r2, r3)
            goto L37
        L34:
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r6.getAdSourceInstanceName()
            java.lang.String r2 = "Ad Source Instance Name"
            if (r1 != 0) goto L43
            r0.put(r2, r3)
            goto L46
        L43:
            r0.put(r2, r1)
        L46:
            java.lang.String r1 = r6.getAdSourceInstanceId()
            java.lang.String r2 = "Ad Source Instance ID"
            if (r1 != 0) goto L52
            r0.put(r2, r3)
            goto L55
        L52:
            r0.put(r2, r1)
        L55:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.google.android.gms.ads.internal.client.zzw r2 = r6.zza
            android.os.Bundle r2 = r2.zzd
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L66:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.ads.internal.client.zzw r5 = r6.zza
            android.os.Bundle r5 = r5.zzd
            java.lang.Object r5 = r5.get(r4)
            r1.put(r4, r5)
            goto L66
        L7e:
            java.lang.String r2 = "Credentials"
            r0.put(r2, r1)
            com.google.android.gms.ads.AdError r1 = r6.zzb
            java.lang.String r2 = "Ad Error"
            if (r1 != 0) goto L8d
            r0.put(r2, r3)
            goto L94
        L8d:
            org.json.JSONObject r1 = r1.zzb()
            r0.put(r2, r1)
        L94:
            return r0
    }
}
