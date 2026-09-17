package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzay {
    protected java.lang.String zza;
    private final java.lang.Object zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private boolean zze;
    private boolean zzf;
    private com.google.android.gms.internal.ads.zzdxb zzg;

    public zzay() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzb = r0
            java.lang.String r0 = ""
            r2.zzc = r0
            r2.zzd = r0
            r1 = 0
            r2.zze = r1
            r2.zzf = r1
            r2.zza = r0
            return
    }

    protected static final java.lang.String zzo(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r6 = r1.zzc(r4, r6)
            java.lang.String r1 = "User-Agent"
            r0.put(r1, r6)
            com.google.android.gms.ads.internal.util.zzbo r6 = new com.google.android.gms.ads.internal.util.zzbo
            r6.<init>(r4)
            r4 = 0
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r4 = r6.zzb(r4, r5, r0, r1)
            r6 = 1
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeG     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            long r2 = (long) r0     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            java.lang.Object r0 = r4.get(r2, r0)     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L38 java.lang.InterruptedException -> L47 java.util.concurrent.TimeoutException -> L59
            return r0
        L38:
            r4 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Error retrieving a response from: "
            java.lang.String r5 = r6.concat(r5)
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r4)
            goto L6a
        L47:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Interrupted while retrieving a response from: "
            java.lang.String r5 = r2.concat(r5)
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r0)
            r4.cancel(r6)
            goto L6a
        L59:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Timeout while retrieving a response from: "
            java.lang.String r5 = r2.concat(r5)
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r0)
            r4.cancel(r6)
        L6a:
            return r1
    }

    private final android.net.Uri zzp(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            r3 = 1
            byte[] r1 = com.google.android.gms.common.util.IOUtils.readInputStreamFully(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            goto L30
        L29:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = ""
        L30:
            r4.zzc = r2     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L7b
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r4.zzc = r1     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.write(r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.close()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            goto L64
        L5e:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r5)     // Catch: java.lang.Throwable -> L7b
        L64:
            java.lang.String r5 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r5
    }

    public final com.google.android.gms.internal.ads.zzdxb zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdxb r0 = r1.zzg
            return r0
    }

    public final java.lang.String zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            java.lang.String r1 = r2.zzd     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final void zzc(android.content.Context r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzdxb r0 = r2.zzg
            if (r0 != 0) goto L17
            goto L21
        L17:
            com.google.android.gms.ads.internal.util.zzav r1 = new com.google.android.gms.ads.internal.util.zzav
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzdxa r3 = com.google.android.gms.internal.ads.zzdxa.zzd
            r0.zzh(r1, r3)
        L21:
            return
    }

    public final void zzd(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeC
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r4 = r2.zzp(r3, r0, r4, r5)
            com.google.android.gms.ads.internal.util.zzt.zzU(r3, r4)
            return
    }

    public final void zze(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeF
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r6 = r2.zzp(r3, r0, r6, r4)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r0 = "debugData"
            r6.appendQueryParameter(r0, r5)
            com.google.android.gms.ads.internal.zzu.zzp()
            android.net.Uri r5 = r6.build()
            java.lang.String r5 = r5.toString()
            com.google.android.gms.ads.internal.util.zzt.zzL(r3, r4, r5)
            return
    }

    public final void zzf(boolean r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            r3.zzf = r4     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziM     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L29
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: java.lang.Throwable -> L2b
            r1.zzC(r4)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzdxb r1 = r3.zzg     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L29
            r1.zzl(r4)     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    public final void zzg(com.google.android.gms.internal.ads.zzdxb r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    public final void zzh(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            monitor-enter(r0)
            r1.zze = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    protected final void zzi(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) {
            r8 = this;
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 != 0) goto La
            java.lang.String r9 = "Can not create dialog without Activity Context"
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r9)
            return
        La:
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.ads.internal.util.zzax r7 = new com.google.android.gms.ads.internal.util.zzax
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r7)
            return
    }

    public final boolean zzj(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeE
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r2.zzp(r3, r0, r4, r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = zzo(r3, r0, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r0 = 0
            if (r5 == 0) goto L25
            java.lang.String r3 = "Not linked for debug signals."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            return r0
        L25:
            java.lang.String r3 = r3.trim()
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L60
            r5.<init>(r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r3 = "debug_mode"
            java.lang.String r3 = r5.optString(r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r5 = "1"
            boolean r3 = r5.equals(r3)
            r2.zzf(r3)
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zziM
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r0.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5f
            com.google.android.gms.internal.ads.zzcad r5 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r5 = r5.zzi()
            r0 = 1
            if (r0 == r3) goto L5c
            java.lang.String r4 = ""
        L5c:
            r5.zzB(r4)
        L5f:
            return r3
        L60:
            r3 = move-exception
            java.lang.String r4 = "Fail to get debug mode response json."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r4, r3)
            return r0
    }

    final boolean zzk(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeD
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.zzp(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = zzo(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r6.<init>(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L83
            r3.zza = r6     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zziM     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.zza(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = 0
            goto L67
        L66:
            r6 = 1
        L67:
            r3.zzf(r6)     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: org.json.JSONException -> L83
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r2.zzB(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.zzb
            monitor-enter(r5)
            r3.zzd = r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r1
        L80:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
            return r0
    }

    public final boolean zzl() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            boolean r1 = r2.zzf     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final boolean zzm() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            boolean r1 = r2.zze     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final boolean zzn(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L17
            boolean r0 = r1.zzm()
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            java.lang.String r0 = "Sending troubleshooting signals to the server."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            r1.zze(r2, r3, r4, r5)
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }
}
