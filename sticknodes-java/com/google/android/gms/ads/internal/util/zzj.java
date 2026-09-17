package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzj implements com.google.android.gms.ads.internal.util.zzg {
    private java.lang.String zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private final java.lang.Object zza;
    private boolean zzb;
    private final java.util.List zzc;
    private com.google.common.util.concurrent.ListenableFuture zzd;
    private com.google.android.gms.internal.ads.zzazu zze;
    private android.content.SharedPreferences zzf;
    private android.content.SharedPreferences.Editor zzg;
    private boolean zzh;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private boolean zzk;
    private java.lang.String zzl;
    private int zzm;
    private com.google.android.gms.internal.ads.zzbzx zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private java.util.Set zzs;
    private org.json.JSONObject zzt;
    private boolean zzu;
    private boolean zzv;
    private java.lang.String zzw;
    private java.lang.String zzx;
    private boolean zzy;
    private java.lang.String zzz;

    public zzj() {
            r8 = this;
            r8.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r8.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.zzc = r0
            r0 = 0
            r8.zze = r0
            r1 = 1
            r8.zzh = r1
            r8.zzk = r1
            java.lang.String r2 = "-1"
            r8.zzl = r2
            r2 = -1
            r8.zzm = r2
            com.google.android.gms.internal.ads.zzbzx r3 = new com.google.android.gms.internal.ads.zzbzx
            java.lang.String r4 = ""
            r5 = 0
            r3.<init>(r4, r5)
            r8.zzn = r3
            r8.zzo = r5
            r8.zzp = r5
            r8.zzq = r2
            r3 = 0
            r8.zzr = r3
            java.util.Set r7 = java.util.Collections.emptySet()
            r8.zzs = r7
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r8.zzt = r7
            r8.zzu = r1
            r8.zzv = r1
            r8.zzw = r0
            r8.zzx = r4
            r8.zzy = r3
            r8.zzz = r4
            java.lang.String r0 = "{}"
            r8.zzA = r0
            r8.zzB = r2
            r8.zzC = r2
            r8.zzD = r5
            return
    }

    private final void zzV() {
            r4 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzd
            if (r0 != 0) goto L5
            goto L2d
        L5:
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L2d
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzd     // Catch: java.util.concurrent.TimeoutException -> L15 java.util.concurrent.ExecutionException -> L17 java.util.concurrent.CancellationException -> L19 java.lang.InterruptedException -> L20
            r1 = 1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L15 java.util.concurrent.ExecutionException -> L17 java.util.concurrent.CancellationException -> L19 java.lang.InterruptedException -> L20
            r0.get(r1, r3)     // Catch: java.util.concurrent.TimeoutException -> L15 java.util.concurrent.ExecutionException -> L17 java.util.concurrent.CancellationException -> L19 java.lang.InterruptedException -> L20
            return
        L15:
            r0 = move-exception
            goto L1a
        L17:
            r0 = move-exception
            goto L1a
        L19:
            r0 = move-exception
        L1a:
            java.lang.String r1 = "Fail to initialize AdSharedPreferenceManager."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
        L20:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.String r1 = "Interrupted while waiting for preferences loaded."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
        L2d:
            return
    }

    private final void zzW() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.internal.util.zzh r1 = new com.google.android.gms.ads.internal.util.zzh
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(boolean r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzv     // Catch: java.lang.Throwable -> L21
            if (r1 != r4) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lc:
            r3.zzv = r4     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.String r2 = "content_vertical_opted_out"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L21
            r4.apply()     // Catch: java.lang.Throwable -> L21
        L1c:
            r3.zzW()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = r3.zzz     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L23:
            r3.zzz = r4     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L33
            java.lang.String r2 = "linked_ad_unit"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L38
            r4.apply()     // Catch: java.lang.Throwable -> L38
        L33:
            r3.zzW()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(boolean r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzy     // Catch: java.lang.Throwable -> L34
            if (r1 != r4) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L1f:
            r3.zzy = r4     // Catch: java.lang.Throwable -> L34
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L2f
            java.lang.String r2 = "linked_device"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L34
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L34
            r4.apply()     // Catch: java.lang.Throwable -> L34
        L2f:
            r3.zzW()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(java.lang.String r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = r3.zzw     // Catch: java.lang.Throwable -> L25
            boolean r1 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L10:
            r3.zzw = r4     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L20
            java.lang.String r2 = "display_cutout"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L25
            r4.apply()     // Catch: java.lang.Throwable -> L25
        L20:
            r3.zzW()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(long r5) {
            r4 = this;
            r4.zzV()
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            long r1 = r4.zzp     // Catch: java.lang.Throwable -> L23
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        Le:
            r4.zzp = r5     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences$Editor r1 = r4.zzg     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1e
            java.lang.String r2 = "first_ad_req_time_ms"
            r1.putLong(r2, r5)     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences$Editor r5 = r4.zzg     // Catch: java.lang.Throwable -> L23
            r5.apply()     // Catch: java.lang.Throwable -> L23
        L1e:
            r4.zzW()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(int r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zzm = r4     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1f
            r2 = -1
            if (r4 != r2) goto L15
            java.lang.String r4 = "gad_has_consent_for_cookies"
            r1.remove(r4)     // Catch: java.lang.Throwable -> L24
            goto L1a
        L15:
            java.lang.String r2 = "gad_has_consent_for_cookies"
            r1.putInt(r2, r4)     // Catch: java.lang.Throwable -> L24
        L1a:
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L24
            r4.apply()     // Catch: java.lang.Throwable -> L24
        L1f:
            r3.zzW()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = r3.zzx     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L23:
            r3.zzx = r4     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L33
            java.lang.String r2 = "inspector_info"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L38
            r4.apply()     // Catch: java.lang.Throwable -> L38
        L33:
            r3.zzW()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = r3.zzA     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L23:
            r3.zzA = r4     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L33
            java.lang.String r2 = "inspector_ui_storage"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L38
            r4.apply()     // Catch: java.lang.Throwable -> L38
        L33:
            r3.zzW()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(boolean r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzk     // Catch: java.lang.Throwable -> L21
            if (r4 != r1) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lc:
            r3.zzk = r4     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.String r2 = "gad_idless"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L21
            r4.apply()     // Catch: java.lang.Throwable -> L21
        L1c:
            r3.zzW()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(boolean r6) {
            r5 = this;
            r5.zzV()
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkc     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L35
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L35
            long r1 = r1 + r3
            android.content.SharedPreferences$Editor r3 = r5.zzg     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L30
            java.lang.String r4 = "is_topics_ad_personalization_allowed"
            r3.putBoolean(r4, r6)     // Catch: java.lang.Throwable -> L35
            android.content.SharedPreferences$Editor r6 = r5.zzg     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "topics_consent_expiry_time_ms"
            r6.putLong(r3, r1)     // Catch: java.lang.Throwable -> L35
            android.content.SharedPreferences$Editor r6 = r5.zzg     // Catch: java.lang.Throwable -> L35
            r6.apply()     // Catch: java.lang.Throwable -> L35
        L30:
            r5.zzW()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r6
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(java.lang.String r8, java.lang.String r9, boolean r10) {
            r7 = this;
            r7.zzV()
            java.lang.Object r0 = r7.zza
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.zzt     // Catch: java.lang.Throwable -> L88
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L88
            if (r1 != 0) goto L13
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L88
            r1.<init>()     // Catch: java.lang.Throwable -> L88
        L13:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = 0
        L19:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L88
            if (r4 >= r5) goto L44
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L88
            if (r5 != 0) goto L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            return
        L27:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L88
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L41
            if (r10 == 0) goto L3f
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            return
        L3f:
            r2 = r4
            goto L44
        L41:
            int r4 = r4 + 1
            goto L19
        L44:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            r3.<init>()     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            java.lang.String r9 = "timestamp_ms"
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            long r4 = r10.currentTimeMillis()     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            r3.put(r9, r4)     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            org.json.JSONObject r9 = r7.zzt     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            r9.put(r8, r1)     // Catch: org.json.JSONException -> L69 java.lang.Throwable -> L88
            goto L6f
        L69:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r9, r8)     // Catch: java.lang.Throwable -> L88
        L6f:
            android.content.SharedPreferences$Editor r8 = r7.zzg     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L83
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.zzt     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L88
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L88
            android.content.SharedPreferences$Editor r8 = r7.zzg     // Catch: java.lang.Throwable -> L88
            r8.apply()     // Catch: java.lang.Throwable -> L88
        L83:
            r7.zzW()     // Catch: java.lang.Throwable -> L88
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            return
        L88:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            throw r8
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(int r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r3.zzq     // Catch: java.lang.Throwable -> L21
            if (r1 != r4) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lc:
            r3.zzq = r4     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.String r2 = "request_in_session_count"
            r1.putInt(r2, r4)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L21
            r4.apply()     // Catch: java.lang.Throwable -> L21
        L1c:
            r3.zzW()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(int r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r3.zzC     // Catch: java.lang.Throwable -> L21
            if (r1 != r4) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lc:
            r3.zzC = r4     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.String r2 = "sd_app_measure_npa"
            r1.putInt(r2, r4)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L21
            r4.apply()     // Catch: java.lang.Throwable -> L21
        L1c:
            r3.zzW()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzN(long r5) {
            r4 = this;
            r4.zzV()
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            long r1 = r4.zzD     // Catch: java.lang.Throwable -> L23
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        Le:
            r4.zzD = r5     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences$Editor r1 = r4.zzg     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1e
            java.lang.String r2 = "sd_app_measure_npa_ts"
            r1.putLong(r2, r5)     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences$Editor r5 = r4.zzg     // Catch: java.lang.Throwable -> L23
            r5.apply()     // Catch: java.lang.Throwable -> L23
        L1e:
            r4.zzW()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(java.lang.String r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zzl = r4     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L28
            java.lang.String r1 = "-1"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L1c
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "IABTCF_TCString"
            r4.remove(r1)     // Catch: java.lang.Throwable -> L2d
            goto L23
        L1c:
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "IABTCF_TCString"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L2d
        L23:
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L2d
            r4.apply()     // Catch: java.lang.Throwable -> L2d
        L28:
            r3.zzW()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzu     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzQ() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzv     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzR() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzy     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzS() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaB
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzk     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzT() {
            r7 = this;
            r7.zzV()
            java.lang.Object r0 = r7.zza
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r7.zzf     // Catch: java.lang.Throwable -> L30
            r2 = 0
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return r2
        Ld:
            java.lang.String r3 = "topics_consent_expiry_time_ms"
            r4 = 0
            long r3 = r1.getLong(r3, r4)     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return r2
        L1f:
            android.content.SharedPreferences r1 = r7.zzf     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "is_topics_ad_personalization_allowed"
            boolean r1 = r1.getBoolean(r3, r2)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2e
            boolean r1 = r7.zzk     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L2e
            r2 = 1
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return r2
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }

    final /* synthetic */ void zzU(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r6 = "admob"
            r0 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r0)
            android.content.SharedPreferences$Editor r6 = r5.edit()
            java.lang.Object r0 = r4.zza     // Catch: java.lang.Throwable -> L182
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L182
            r4.zzf = r5     // Catch: java.lang.Throwable -> L17f
            r4.zzg = r6     // Catch: java.lang.Throwable -> L17f
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastM()     // Catch: java.lang.Throwable -> L17f
            if (r5 == 0) goto L1f
            android.security.NetworkSecurityPolicy r5 = android.security.NetworkSecurityPolicy.getInstance()     // Catch: java.lang.Throwable -> L17f
            r5.isCleartextTrafficPermitted()     // Catch: java.lang.Throwable -> L17f
        L1f:
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "use_https"
            boolean r1 = r4.zzh     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.getBoolean(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzh = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "content_url_opted_out"
            boolean r1 = r4.zzu     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.getBoolean(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzu = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "content_url_hashes"
            java.lang.String r1 = r4.zzi     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzi = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "gad_idless"
            boolean r1 = r4.zzk     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.getBoolean(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzk = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "content_vertical_opted_out"
            boolean r1 = r4.zzv     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.getBoolean(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzv = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "content_vertical_hashes"
            java.lang.String r1 = r4.zzj     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzj = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "version_code"
            int r1 = r4.zzr     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.getInt(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzr = r5     // Catch: java.lang.Throwable -> L17f
            com.google.android.gms.internal.ads.zzbeb r5 = com.google.android.gms.internal.ads.zzbej.zzg     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r5.zze()     // Catch: java.lang.Throwable -> L17f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L17f
            if (r5 == 0) goto L97
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.zze()     // Catch: java.lang.Throwable -> L17f
            if (r5 == 0) goto L97
            com.google.android.gms.internal.ads.zzbzx r5 = new com.google.android.gms.internal.ads.zzbzx     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = ""
            r1 = 0
            r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzn = r5     // Catch: java.lang.Throwable -> L17f
            goto Lba
        L97:
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "app_settings_json"
            com.google.android.gms.internal.ads.zzbzx r1 = r4.zzn     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.zzc()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r6 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "app_settings_last_update_ms"
            com.google.android.gms.internal.ads.zzbzx r2 = r4.zzn     // Catch: java.lang.Throwable -> L17f
            long r2 = r2.zza()     // Catch: java.lang.Throwable -> L17f
            long r1 = r6.getLong(r1, r2)     // Catch: java.lang.Throwable -> L17f
            com.google.android.gms.internal.ads.zzbzx r6 = new com.google.android.gms.internal.ads.zzbzx     // Catch: java.lang.Throwable -> L17f
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzn = r6     // Catch: java.lang.Throwable -> L17f
        Lba:
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "app_last_background_time_ms"
            long r1 = r4.zzo     // Catch: java.lang.Throwable -> L17f
            long r5 = r5.getLong(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzo = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "request_in_session_count"
            int r1 = r4.zzq     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.getInt(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzq = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "first_ad_req_time_ms"
            long r1 = r4.zzp     // Catch: java.lang.Throwable -> L17f
            long r5 = r5.getLong(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzp = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "never_pool_slots"
            java.util.Set r1 = r4.zzs     // Catch: java.lang.Throwable -> L17f
            java.util.Set r5 = r5.getStringSet(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzs = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "display_cutout"
            java.lang.String r1 = r4.zzw     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzw = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "app_measurement_npa"
            int r1 = r4.zzB     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.getInt(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzB = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "sd_app_measure_npa"
            int r1 = r4.zzC     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.getInt(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzC = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "sd_app_measure_npa_ts"
            long r1 = r4.zzD     // Catch: java.lang.Throwable -> L17f
            long r5 = r5.getLong(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzD = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "inspector_info"
            java.lang.String r1 = r4.zzx     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzx = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "linked_device"
            boolean r1 = r4.zzy     // Catch: java.lang.Throwable -> L17f
            boolean r5 = r5.getBoolean(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzy = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "linked_ad_unit"
            java.lang.String r1 = r4.zzz     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzz = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "inspector_ui_storage"
            java.lang.String r1 = r4.zzA     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzA = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "IABTCF_TCString"
            java.lang.String r1 = r4.zzl     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzl = r5     // Catch: java.lang.Throwable -> L17f
            android.content.SharedPreferences r5 = r4.zzf     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "gad_has_consent_for_cookies"
            int r1 = r4.zzm     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.getInt(r6, r1)     // Catch: java.lang.Throwable -> L17f
            r4.zzm = r5     // Catch: java.lang.Throwable -> L17f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L174 java.lang.Throwable -> L17f
            android.content.SharedPreferences r6 = r4.zzf     // Catch: org.json.JSONException -> L174 java.lang.Throwable -> L17f
            java.lang.String r1 = "native_advanced_settings"
            java.lang.String r2 = "{}"
            java.lang.String r6 = r6.getString(r1, r2)     // Catch: org.json.JSONException -> L174 java.lang.Throwable -> L17f
            r5.<init>(r6)     // Catch: org.json.JSONException -> L174 java.lang.Throwable -> L17f
            r4.zzt = r5     // Catch: org.json.JSONException -> L174 java.lang.Throwable -> L17f
            goto L17a
        L174:
            r5 = move-exception
            java.lang.String r6 = "Could not convert native advanced settings to json object"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r5)     // Catch: java.lang.Throwable -> L17f
        L17a:
            r4.zzW()     // Catch: java.lang.Throwable -> L17f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17f
            return
        L17f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17f
            throw r5     // Catch: java.lang.Throwable -> L182
        L182:
            r5 = move-exception
            java.lang.String r6 = "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread"
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzw(r5, r6)
            java.lang.String r6 = "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r6, r5)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            int r1 = r2.zzr     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
            r1 = this;
            r1.zzV()
            int r0 = r1.zzm
            return r0
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            int r1 = r2.zzq     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            long r1 = r3.zzo     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            long r1 = r3.zzp     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            long r1 = r3.zzD     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzazu zzg() {
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r3.zzP()
            if (r0 == 0) goto L14
            boolean r0 = r3.zzQ()
            if (r0 != 0) goto L13
            goto L14
        L13:
            return r1
        L14:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbei.zzb
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L23
            return r1
        L23:
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r1
        L2e:
            com.google.android.gms.internal.ads.zzazu r1 = r3.zze     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.zzazu r1 = new com.google.android.gms.internal.ads.zzazu     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            r3.zze = r1     // Catch: java.lang.Throwable -> L47
        L39:
            com.google.android.gms.internal.ads.zzazu r1 = r3.zze     // Catch: java.lang.Throwable -> L47
            r1.zze()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "start fetching content..."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzazu r1 = r3.zze     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r1
        L47:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzbzx zzh() {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzlp     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.zzbzx r1 = r3.zzn     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.zzj()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L36
            java.util.List r1 = r3.zzc     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L26:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L3a
            r2.run()     // Catch: java.lang.Throwable -> L3a
            goto L26
        L36:
            com.google.android.gms.internal.ads.zzbzx r1 = r3.zzn     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzbzx zzi() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbzx r1 = r2.zzn     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzj() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = r2.zzi     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzk() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = r2.zzj     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzl() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = r2.zzz     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzm() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = r2.zzw     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzn() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = r2.zzx     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzo() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = r2.zzA     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzp() {
            r1 = this;
            r1.zzV()
            java.lang.String r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final org.json.JSONObject zzq() {
            r2 = this;
            r2.zzV()
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            org.json.JSONObject r1 = r2.zzt     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(java.lang.Runnable r2) {
            r1 = this;
            java.util.List r0 = r1.zzc
            r0.add(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(android.content.Context r4) {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r3.zzf     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.internal.util.zzi r1 = new com.google.android.gms.ads.internal.util.zzi
            java.lang.String r2 = "admob"
            r1.<init>(r3, r4, r2)
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zza(r1)
            r3.zzd = r4
            r4 = 1
            r3.zzb = r4
            return
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            r3.zzt = r1     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1b
            java.lang.String r2 = "native_advanced_settings"
            r1.remove(r2)     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L20
            r1.apply()     // Catch: java.lang.Throwable -> L20
        L1b:
            r3.zzW()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(long r5) {
            r4 = this;
            r4.zzV()
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            long r1 = r4.zzo     // Catch: java.lang.Throwable -> L23
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        Le:
            r4.zzo = r5     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences$Editor r1 = r4.zzg     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1e
            java.lang.String r2 = "app_last_background_time_ms"
            r1.putLong(r2, r5)     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences$Editor r5 = r4.zzg     // Catch: java.lang.Throwable -> L23
            r5.apply()     // Catch: java.lang.Throwable -> L23
        L1e:
            r4.zzW()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(java.lang.String r6) {
            r5 = this;
            r5.zzV()
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L5b
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L54
            com.google.android.gms.internal.ads.zzbzx r3 = r5.zzn     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r3.zzc()     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L1d
            goto L54
        L1d:
            com.google.android.gms.internal.ads.zzbzx r3 = new com.google.android.gms.internal.ads.zzbzx     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r6, r1)     // Catch: java.lang.Throwable -> L5b
            r5.zzn = r3     // Catch: java.lang.Throwable -> L5b
            android.content.SharedPreferences$Editor r3 = r5.zzg     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L39
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch: java.lang.Throwable -> L5b
            android.content.SharedPreferences$Editor r6 = r5.zzg     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "app_settings_last_update_ms"
            r6.putLong(r3, r1)     // Catch: java.lang.Throwable -> L5b
            android.content.SharedPreferences$Editor r6 = r5.zzg     // Catch: java.lang.Throwable -> L5b
            r6.apply()     // Catch: java.lang.Throwable -> L5b
        L39:
            r5.zzW()     // Catch: java.lang.Throwable -> L5b
            java.util.List r6 = r5.zzc     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L5b
        L42:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L52
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L5b
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L5b
            r1.run()     // Catch: java.lang.Throwable -> L5b
            goto L42
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return
        L54:
            com.google.android.gms.internal.ads.zzbzx r6 = r5.zzn     // Catch: java.lang.Throwable -> L5b
            r6.zzg(r1)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r6
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(int r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r3.zzr     // Catch: java.lang.Throwable -> L21
            if (r1 != r4) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lc:
            r3.zzr = r4     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.String r2 = "version_code"
            r1.putInt(r2, r4)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L21
            r4.apply()     // Catch: java.lang.Throwable -> L21
        L1c:
            r3.zzW()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(java.lang.String r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = r3.zzi     // Catch: java.lang.Throwable -> L25
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L10:
            r3.zzi = r4     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L20
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L25
            r4.apply()     // Catch: java.lang.Throwable -> L25
        L20:
            r3.zzW()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzu     // Catch: java.lang.Throwable -> L21
            if (r1 != r4) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lc:
            r3.zzu = r4     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.String r2 = "content_url_opted_out"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L21
            r4.apply()     // Catch: java.lang.Throwable -> L21
        L1c:
            r3.zzW()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(java.lang.String r4) {
            r3 = this;
            r3.zzV()
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = r3.zzj     // Catch: java.lang.Throwable -> L25
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L10:
            r3.zzj = r4     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences$Editor r1 = r3.zzg     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L20
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences$Editor r4 = r3.zzg     // Catch: java.lang.Throwable -> L25
            r4.apply()     // Catch: java.lang.Throwable -> L25
        L20:
            r3.zzW()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }
}
