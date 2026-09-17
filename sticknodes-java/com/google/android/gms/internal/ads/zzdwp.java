package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdwp implements com.google.android.gms.internal.ads.zzcyd, com.google.android.gms.internal.ads.zzday, com.google.android.gms.internal.ads.zzczs {
    private final com.google.android.gms.internal.ads.zzdxb zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzdwo zze;
    private com.google.android.gms.internal.ads.zzcxt zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private org.json.JSONObject zzk;
    private org.json.JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    zzdwp(com.google.android.gms.internal.ads.zzdxb r2, com.google.android.gms.internal.ads.zzfhc r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzh = r0
            r1.zzi = r0
            r1.zzj = r0
            r1.zza = r2
            r1.zzc = r4
            java.lang.String r2 = r3.zzf
            r1.zzb = r2
            r2 = 0
            r1.zzd = r2
            com.google.android.gms.internal.ads.zzdwo r2 = com.google.android.gms.internal.ads.zzdwo.zza
            r1.zze = r2
            return
    }

    private static org.json.JSONObject zzh(com.google.android.gms.ads.internal.client.zze r3) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.zzc
            java.lang.String r2 = "errorDomain"
            r0.put(r2, r1)
            int r1 = r3.zza
            java.lang.String r2 = "errorCode"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "errorDescription"
            r0.put(r2, r1)
            com.google.android.gms.ads.internal.client.zze r3 = r3.zzd
            if (r3 != 0) goto L20
            r3 = 0
            goto L24
        L20:
            org.json.JSONObject r3 = zzh(r3)
        L24:
            java.lang.String r1 = "underlyingError"
            r0.put(r1, r3)
            return r0
    }

    private final org.json.JSONObject zzi(com.google.android.gms.internal.ads.zzcxt r8) throws org.json.JSONException {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r8.zzg()
            java.lang.String r2 = "winningAdapterClassName"
            r0.put(r2, r1)
            long r1 = r8.zzc()
            java.lang.String r3 = "responseSecsSinceEpoch"
            r0.put(r3, r1)
            java.lang.String r1 = r8.zzi()
            java.lang.String r2 = "responseId"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziO
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L53
            java.lang.String r1 = r8.zzd()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L53
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Bidding data: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "biddingData"
            r0.put(r1, r2)
        L53:
            java.lang.String r1 = r7.zzh
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L62
            java.lang.String r1 = r7.zzh
            java.lang.String r2 = "adRequestUrl"
            r0.put(r2, r1)
        L62:
            java.lang.String r1 = r7.zzi
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = r7.zzi
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L71:
            java.lang.String r1 = r7.zzj
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L80
            java.lang.String r1 = r7.zzj
            java.lang.String r2 = "adResponseBody"
            r0.put(r2, r1)
        L80:
            org.json.JSONObject r1 = r7.zzk
            if (r1 == 0) goto L89
            java.lang.String r2 = "adResponseHeaders"
            r0.put(r2, r1)
        L89:
            org.json.JSONObject r1 = r7.zzl
            if (r1 == 0) goto L92
            java.lang.String r2 = "transactionExtras"
            r0.put(r2, r1)
        L92:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziR
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lab
            boolean r1 = r7.zzo
            java.lang.String r2 = "hasExceededMemoryLimit"
            r0.put(r2, r1)
        Lab:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r8 = r8.zzj()
            java.util.Iterator r8 = r8.iterator()
        Lb8:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L10b
            java.lang.Object r2 = r8.next()
            com.google.android.gms.ads.internal.client.zzw r2 = (com.google.android.gms.ads.internal.client.zzw) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = r2.zza
            java.lang.String r5 = "adapterClassName"
            r3.put(r5, r4)
            long r4 = r2.zzb
            java.lang.String r6 = "latencyMillis"
            r3.put(r6, r4)
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zziP
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lf8
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.os.Bundle r5 = r2.zzd
            org.json.JSONObject r4 = r4.zzi(r5)
            java.lang.String r5 = "credentials"
            r3.put(r5, r4)
        Lf8:
            com.google.android.gms.ads.internal.client.zze r2 = r2.zzc
            if (r2 != 0) goto Lfe
            r2 = 0
            goto L102
        Lfe:
            org.json.JSONObject r2 = zzh(r2)
        L102:
            java.lang.String r4 = "error"
            r3.put(r4, r2)
            r1.put(r3)
            goto Lb8
        L10b:
            java.lang.String r8 = "adNetworks"
            r0.put(r8, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzczs
    public final void zza(com.google.android.gms.internal.ads.zzcte r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdxb r0 = r1.zza
            boolean r0 = r0.zzq()
            if (r0 != 0) goto L9
            goto L2c
        L9:
            com.google.android.gms.internal.ads.zzcxt r2 = r2.zzm()
            r1.zzf = r2
            com.google.android.gms.internal.ads.zzdwo r2 = com.google.android.gms.internal.ads.zzdwo.zzb
            r1.zze = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziV
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2c
            com.google.android.gms.internal.ads.zzdxb r2 = r1.zza
            java.lang.String r0 = r1.zzb
            r2.zzf(r0, r1)
        L2c:
            return
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final org.json.JSONObject zzd() throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.google.android.gms.internal.ads.zzdwo r1 = r4.zze
            java.lang.String r2 = "state"
            r0.put(r2, r1)
            int r1 = r4.zzd
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfgh.zza(r1)
            java.lang.String r2 = "format"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziV
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3b
            boolean r1 = r4.zzm
            java.lang.String r2 = "isOutOfContext"
            r0.put(r2, r1)
            boolean r1 = r4.zzm
            if (r1 == 0) goto L3b
            boolean r1 = r4.zzn
            java.lang.String r2 = "shown"
            r0.put(r2, r1)
        L3b:
            com.google.android.gms.internal.ads.zzcxt r1 = r4.zzf
            r2 = 0
            if (r1 == 0) goto L45
            org.json.JSONObject r2 = r4.zzi(r1)
            goto L70
        L45:
            com.google.android.gms.ads.internal.client.zze r1 = r4.zzg
            if (r1 == 0) goto L70
            android.os.IBinder r1 = r1.zze
            if (r1 == 0) goto L70
            com.google.android.gms.internal.ads.zzcxt r1 = (com.google.android.gms.internal.ads.zzcxt) r1
            org.json.JSONObject r2 = r4.zzi(r1)
            java.util.List r1 = r1.zzj()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L70
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            com.google.android.gms.ads.internal.client.zze r3 = r4.zzg
            org.json.JSONObject r3 = zzh(r3)
            r1.put(r3)
            java.lang.String r3 = "errors"
            r2.put(r3, r1)
        L70:
            java.lang.String r1 = "responseInfo"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdxb r0 = r1.zza
            boolean r0 = r0.zzq()
            if (r0 != 0) goto L9
            goto L28
        L9:
            com.google.android.gms.internal.ads.zzdwo r0 = com.google.android.gms.internal.ads.zzdwo.zzc
            r1.zze = r0
            r1.zzg = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziV
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L28
            com.google.android.gms.internal.ads.zzdxb r2 = r1.zza
            java.lang.String r0 = r1.zzb
            r2.zzf(r0, r1)
        L28:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziV
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L21
            com.google.android.gms.internal.ads.zzdxb r2 = r1.zza
            boolean r2 = r2.zzq()
            if (r2 == 0) goto L21
            com.google.android.gms.internal.ads.zzdxb r2 = r1.zza
            java.lang.String r0 = r1.zzb
            r2.zzf(r0, r1)
        L21:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdxb r0 = r3.zza
            boolean r0 = r0.zzq()
            if (r0 != 0) goto La
            goto Lc6
        La:
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            java.util.List r0 = r0.zza
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L23
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            java.util.List r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzfgh r0 = (com.google.android.gms.internal.ads.zzfgh) r0
            int r0 = r0.zzb
            r3.zzd = r0
        L23:
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zzl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zzl
            r3.zzh = r0
        L37:
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zzm
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4b
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zzm
            r3.zzi = r0
        L4b:
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            org.json.JSONObject r0 = r0.zzp
            int r0 = r0.length()
            if (r0 <= 0) goto L5f
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            org.json.JSONObject r0 = r0.zzp
            r3.zzl = r0
        L5f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziR
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc6
            com.google.android.gms.internal.ads.zzdxb r0 = r3.zza
            boolean r0 = r0.zzs()
            if (r0 != 0) goto L7d
            r4 = 1
            r3.zzo = r4
            return
        L7d:
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zzn
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L91
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zzn
            r3.zzj = r0
        L91:
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            org.json.JSONObject r0 = r0.zzo
            int r0 = r0.length()
            if (r0 <= 0) goto La5
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            org.json.JSONObject r4 = r4.zzo
            r3.zzk = r4
        La5:
            com.google.android.gms.internal.ads.zzdxb r4 = r3.zza
            org.json.JSONObject r0 = r3.zzk
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
        Lb3:
            java.lang.String r0 = r3.zzj
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc2
            java.lang.String r0 = r3.zzj
            int r0 = r0.length()
            int r1 = r1 + r0
        Lc2:
            long r0 = (long) r1
            r4.zzk(r0)
        Lc6:
            return
    }

    public final void zze() {
            r1 = this;
            r0 = 1
            r1.zzm = r0
            return
    }

    public final void zzf() {
            r1 = this;
            r0 = 1
            r1.zzn = r0
            return
    }

    public final boolean zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdwo r0 = r2.zze
            com.google.android.gms.internal.ads.zzdwo r1 = com.google.android.gms.internal.ads.zzdwo.zza
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
