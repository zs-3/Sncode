package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdtk implements com.google.android.gms.internal.ads.zzday, com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyd, com.google.android.gms.internal.ads.zzdgm {
    private final com.google.android.gms.internal.ads.zzdty zza;
    private final com.google.android.gms.internal.ads.zzdui zzb;

    public zzdtk(com.google.android.gms.internal.ads.zzdty r1, com.google.android.gms.internal.ads.zzdui r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    private final void zzc(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L3
            goto L2b
        L3:
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            long r2 = r8.getLong(r1)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto Lb
            com.google.android.gms.internal.ads.zzdty r4 = r7.zza
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.zzc(r1, r2)
            goto Lb
        L2b:
            return
    }

    private final void zzd(android.os.Bundle r11, com.google.android.gms.internal.ads.zzgax r12) {
            r10 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8e
            if (r11 != 0) goto L16
            goto L8e
        L16:
            com.google.android.gms.internal.ads.zzdtm r0 = com.google.android.gms.internal.ads.zzdtm.zzr
            java.lang.String r0 = r0.zza()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            r11.putLong(r0, r1)
            com.google.android.gms.internal.ads.zzdty r0 = r10.zza
            java.lang.String r1 = "ls"
            boolean r2 = r11.getBoolean(r1)
            r3 = 1
            if (r3 == r2) goto L35
            java.lang.String r2 = "0"
            goto L37
        L35:
            java.lang.String r2 = "1"
        L37:
            r0.zzc(r1, r2)
            int r0 = r12.size()
            r1 = 0
        L3f:
            if (r1 >= r0) goto L7c
            java.lang.Object r2 = r12.get(r1)
            com.google.android.gms.internal.ads.zzdtn r2 = (com.google.android.gms.internal.ads.zzdtn) r2
            com.google.android.gms.internal.ads.zzdtm r3 = r2.zza()
            java.lang.String r3 = r3.zza()
            r4 = -1
            long r6 = r11.getLong(r3, r4)
            com.google.android.gms.internal.ads.zzdtm r3 = r2.zzb()
            java.lang.String r3 = r3.zza()
            long r3 = r11.getLong(r3, r4)
            r8 = 0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L79
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L79
            com.google.android.gms.internal.ads.zzdty r5 = r10.zza
            java.lang.String r2 = r2.zzc()
            long r3 = r3 - r6
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.zzc(r2, r3)
        L79:
            int r1 = r1 + 1
            goto L3f
        L7c:
            java.lang.String r12 = "client_sig_latency_key"
            android.os.Bundle r12 = r11.getBundle(r12)
            r10.zzc(r12)
            java.lang.String r12 = "gms_sig_latency_key"
            android.os.Bundle r11 = r11.getBundle(r12)
            r10.zzc(r11)
        L8e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = "action"
            java.lang.String r2 = "ftl"
            r0.put(r1, r2)
            int r0 = r4.zza
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.android.gms.internal.ads.zzdty r1 = r3.zza
            r1.zzc(r2, r0)
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            java.lang.String r4 = r4.zzc
            java.lang.String r1 = "ed"
            r0.zzc(r1, r4)
            com.google.android.gms.internal.ads.zzdty r4 = r3.zza
            com.google.android.gms.internal.ads.zzdui r0 = r3.zzb
            java.util.Map r4 = r4.zzb()
            r0.zzf(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdty r0 = r1.zza
            android.os.Bundle r2 = r2.zza
            r0.zze(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdty r0 = r1.zza
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbd r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r5 != 0) goto L3b
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdui r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbwa r2 = r5.zzc
            if (r2 == 0) goto L46
            android.os.Bundle r2 = r2.zzm
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzdtn.zza
            r4.zzd(r2, r3)
        L46:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> La7
            java.lang.String r3 = r5.zzb     // Catch: org.json.JSONException -> La7
            r2.<init>(r3)     // Catch: org.json.JSONException -> La7
            com.google.android.gms.internal.ads.zzdty r3 = r4.zza
            java.util.Map r3 = r3.zzb()
            r3.put(r1, r0)
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjj
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6f
            goto L89
        L6f:
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> L83
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> L83
            if (r1 == 0) goto L80
            java.lang.String r1 = "1"
            goto L8b
        L80:
            java.lang.String r1 = "0"
            goto L8b
        L83:
            r1 = move-exception
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        L89:
            java.lang.String r1 = "na"
        L8b:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbwa r5 = r5.zzc
            if (r5 == 0) goto L9b
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            android.os.Bundle r5 = r5.zza
            r0.zze(r5)
        L9b:
            com.google.android.gms.internal.ads.zzdui r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        La7:
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf"
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdui r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zzf(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = "action"
            java.lang.String r2 = "sgf"
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            java.lang.String r1 = "sgf_reason"
            r0.zzc(r1, r4)
            com.google.android.gms.internal.ads.zzdui r4 = r3.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            java.util.Map r0 = r0.zzb()
            r4.zzf(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r3 = this;
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = "action"
            java.lang.String r2 = "loaded"
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            android.os.Bundle r0 = r0.zza()
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzdtn.zzb
            r3.zzd(r0, r1)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmi
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            com.google.android.gms.internal.ads.zzdty r0 = r3.zza
            r1 = 1
            java.lang.String r2 = "MUTE_AUDIO"
            boolean r2 = androidx.webkit.WebViewFeature.isFeatureSupported(r2)
            if (r1 == r2) goto L38
            java.lang.String r1 = "0"
            goto L3a
        L38:
            java.lang.String r1 = "1"
        L3a:
            java.util.Map r0 = r0.zzb()
            java.lang.String r2 = "mafe"
            r0.put(r2, r1)
        L43:
            com.google.android.gms.internal.ads.zzdui r0 = r3.zzb
            com.google.android.gms.internal.ads.zzdty r1 = r3.zza
            java.util.Map r1 = r1.zzb()
            r0.zzf(r1)
            return
    }
}
