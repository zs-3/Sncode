package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final com.google.android.gms.ads.internal.client.zzdy zza;
    private final java.util.List zzb;
    private com.google.android.gms.ads.AdapterResponseInfo zzc;

    private ResponseInfo(com.google.android.gms.ads.internal.client.zzdy r3) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzb = r0
            if (r3 != 0) goto Lf
            goto L37
        Lf:
            java.util.List r3 = r3.zzj()     // Catch: android.os.RemoteException -> L31
            if (r3 == 0) goto L37
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            com.google.android.gms.ads.internal.client.zzw r0 = (com.google.android.gms.ads.internal.client.zzw) r0
            com.google.android.gms.ads.AdapterResponseInfo r0 = com.google.android.gms.ads.AdapterResponseInfo.zza(r0)
            if (r0 == 0) goto L19
            java.util.List r1 = r2.zzb
            r1.add(r0)
            goto L19
        L31:
            r3 = move-exception
            java.lang.String r0 = "Could not forward getAdapterResponseInfo to ResponseInfo."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
        L37:
            com.google.android.gms.ads.internal.client.zzdy r3 = r2.zza
            if (r3 != 0) goto L3c
            goto L48
        L3c:
            com.google.android.gms.ads.internal.client.zzw r3 = r3.zzf()     // Catch: android.os.RemoteException -> L49
            if (r3 == 0) goto L48
            com.google.android.gms.ads.AdapterResponseInfo r3 = com.google.android.gms.ads.AdapterResponseInfo.zza(r3)
            r2.zzc = r3
        L48:
            return
        L49:
            r3 = move-exception
            java.lang.String r0 = "Could not forward getLoadedAdapterResponse to ResponseInfo."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    public static com.google.android.gms.ads.ResponseInfo zza(com.google.android.gms.ads.internal.client.zzdy r1) {
            if (r1 == 0) goto L8
            com.google.android.gms.ads.ResponseInfo r0 = new com.google.android.gms.ads.ResponseInfo
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    public static com.google.android.gms.ads.ResponseInfo zzb(com.google.android.gms.ads.internal.client.zzdy r1) {
            com.google.android.gms.ads.ResponseInfo r0 = new com.google.android.gms.ads.ResponseInfo
            r0.<init>(r1)
            return r0
    }

    public java.util.List<com.google.android.gms.ads.AdapterResponseInfo> getAdapterResponses() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.ads.AdapterResponseInfo getLoadedAdapterResponseInfo() {
            r1 = this;
            com.google.android.gms.ads.AdapterResponseInfo r0 = r1.zzc
            return r0
    }

    public java.lang.String getMediationAdapterClassName() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzdy r0 = r2.zza     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zzg()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "Could not forward getMediationAdapterClassName to ResponseInfo."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Lf:
            r0 = 0
            return r0
    }

    public android.os.Bundle getResponseExtras() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzdy r0 = r2.zza     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            android.os.Bundle r0 = r0.zze()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "Could not forward getResponseExtras to ResponseInfo."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Lf:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    public java.lang.String getResponseId() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzdy r0 = r2.zza     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zzi()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "Could not forward getResponseId to ResponseInfo."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.json.JSONObject r0 = r2.zzd()     // Catch: org.json.JSONException -> La
            r1 = 2
            java.lang.String r0 = r0.toString(r1)     // Catch: org.json.JSONException -> La
            goto Lc
        La:
            java.lang.String r0 = "Error forming toString output."
        Lc:
            return r0
    }

    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzdy r0 = r1.zza
            return r0
    }

    public final org.json.JSONObject zzd() throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r4.getResponseId()
            java.lang.String r2 = "null"
            java.lang.String r3 = "Response ID"
            if (r1 != 0) goto L13
            r0.put(r3, r2)
            goto L16
        L13:
            r0.put(r3, r1)
        L16:
            java.lang.String r1 = r4.getMediationAdapterClassName()
            java.lang.String r3 = "Mediation Adapter Class Name"
            if (r1 != 0) goto L22
            r0.put(r3, r2)
            goto L25
        L22:
            r0.put(r3, r1)
        L25:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r4.zzb
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            com.google.android.gms.ads.AdapterResponseInfo r3 = (com.google.android.gms.ads.AdapterResponseInfo) r3
            org.json.JSONObject r3 = r3.zzb()
            r1.put(r3)
            goto L30
        L44:
            java.lang.String r2 = "Adapter Responses"
            r0.put(r2, r1)
            com.google.android.gms.ads.AdapterResponseInfo r1 = r4.zzc
            if (r1 == 0) goto L56
            org.json.JSONObject r1 = r1.zzb()
            java.lang.String r2 = "Loaded Adapter Response"
            r0.put(r2, r1)
        L56:
            android.os.Bundle r1 = r4.getResponseExtras()
            if (r1 == 0) goto L69
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            org.json.JSONObject r1 = r2.zzi(r1)
            java.lang.String r2 = "Response Extras"
            r0.put(r2, r1)
        L69:
            return r0
    }
}
