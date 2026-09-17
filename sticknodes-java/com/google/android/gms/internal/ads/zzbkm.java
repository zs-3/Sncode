package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkm implements com.google.android.gms.internal.ads.zzbjw {
    private final java.lang.Object zza;
    private final java.util.Map zzb;

    public zzbkm() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r6, java.util.Map r7) {
            r5 = this;
            java.lang.String r6 = "id"
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "fail"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "fail_reason"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "fail_stack"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "result"
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            if (r4 != r3) goto L31
            java.lang.String r1 = "Unknown Fail Reason."
        L31:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L3a
            java.lang.String r2 = ""
            goto L44
        L3a:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "\n"
            java.lang.String r2 = r3.concat(r2)
        L44:
            java.lang.Object r3 = r5.zza
            monitor-enter(r3)
            java.util.Map r4 = r5.zzb     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r4 = r4.remove(r6)     // Catch: java.lang.Throwable -> Lbb
            com.google.android.gms.internal.ads.zzbkl r4 = (com.google.android.gms.internal.ads.zzbkl) r4     // Catch: java.lang.Throwable -> Lbb
            if (r4 != 0) goto L67
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r7.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "Received result for unexpected method invocation: "
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Lbb
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbb
            return
        L67:
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r6 != 0) goto L81
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r6.<init>()     // Catch: java.lang.Throwable -> Lbb
            r6.append(r1)     // Catch: java.lang.Throwable -> Lbb
            r6.append(r2)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbb
            r4.zza(r6)     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbb
            return
        L81:
            if (r7 != 0) goto L89
            r6 = 0
            r4.zzb(r6)     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbb
            return
        L89:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            r6.<init>(r7)     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            boolean r7 = com.google.android.gms.ads.internal.util.zze.zzc()     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            if (r7 == 0) goto Lad
            r7 = 2
            java.lang.String r7 = r6.toString(r7)     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            r0.<init>()     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            java.lang.String r1 = "Result GMSG: "
            r0.append(r1)     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            r0.append(r7)     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            java.lang.String r7 = r0.toString()     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            com.google.android.gms.ads.internal.util.zze.zza(r7)     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
        Lad:
            r4.zzb(r6)     // Catch: org.json.JSONException -> Lb1 java.lang.Throwable -> Lbb
            goto Lb9
        Lb1:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> Lbb
            r4.zza(r6)     // Catch: java.lang.Throwable -> Lbb
        Lb9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbb
            return
        Lbb:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbb
            throw r6
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbnd r5, java.lang.String r6, org.json.JSONObject r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbkk r2 = new com.google.android.gms.internal.ads.zzbkk
            r2.<init>(r4, r0)
            r4.zzc(r1, r2)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = "id"
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "args"
            r2.put(r1, r7)     // Catch: java.lang.Exception -> L2b
            r5.zzl(r6, r2)     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r5 = move-exception
            r0.zzd(r5)
        L2f:
            return r0
    }

    public final void zzc(java.lang.String r3, com.google.android.gms.internal.ads.zzbkl r4) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Map r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
