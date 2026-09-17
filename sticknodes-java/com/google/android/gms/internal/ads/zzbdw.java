package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbdw {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzc;
    private final com.google.android.gms.internal.ads.zzdui zzd;
    private java.lang.Runnable zze;
    private com.google.android.gms.internal.ads.zzbdt zzf;
    private androidx.browser.customtabs.CustomTabsSession zzg;
    private java.lang.String zzh;
    private long zzi;
    private long zzj;
    private org.json.JSONArray zzk;
    private android.content.Context zzl;

    public zzbdw(java.util.concurrent.ScheduledExecutorService r3, com.google.android.gms.ads.nonagon.signalgeneration.zzj r4, com.google.android.gms.ads.nonagon.signalgeneration.zza r5, com.google.android.gms.internal.ads.zzdui r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzi = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            return
    }

    static /* bridge */ /* synthetic */ androidx.browser.customtabs.CustomTabsSession zza(com.google.android.gms.internal.ads.zzbdw r0) {
            androidx.browser.customtabs.CustomTabsSession r0 = r0.zzg
            return r0
    }

    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbdw r0) {
            r0.zzj()
            return
    }

    private final void zzj() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbdt r0 = r5.zzf
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.zzh
            if (r0 == 0) goto L70
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L70
            long r0 = r5.zzi
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            long r2 = r5.zzi
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjt
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            java.lang.String r1 = r5.zzh
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.requestPostMessageChannel(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            java.lang.Runnable r1 = r5.zze
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzju
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
    }

    private final void zzk(org.json.JSONObject r4) {
            r3 = this;
            org.json.JSONArray r0 = r3.zzk     // Catch: org.json.JSONException -> L1f
            if (r0 != 0) goto L17
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L1f
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjw     // Catch: org.json.JSONException -> L1f
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1f
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L1f
            r0.<init>(r1)     // Catch: org.json.JSONException -> L1f
            r3.zzk = r0     // Catch: org.json.JSONException -> L1f
        L17:
            java.lang.String r0 = "eids"
            org.json.JSONArray r1 = r3.zzk     // Catch: org.json.JSONException -> L1f
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L1f
            return
        L1f:
            r4 = move-exception
            java.lang.String r0 = "Error fetching the PACT active eids JSON: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }

    public final androidx.browser.customtabs.CustomTabsSession zzb() {
            r1 = this;
            androidx.browser.customtabs.CustomTabsSession r0 = r1.zzg
            return r0
    }

    final org.json.JSONObject zzc(java.lang.String r3, java.lang.String r4) throws org.json.JSONException {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "paw_id"
            r0.put(r1, r3)
            java.lang.String r3 = "error"
            r0.put(r3, r4)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2e
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjx
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            goto L30
        L2e:
            r3 = 0
        L30:
            java.lang.String r1 = "sdk_ttl_ms"
            r0.put(r1, r3)
            r2.zzk(r0)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            com.google.android.gms.ads.nonagon.signalgeneration.zza r3 = r2.zzc
            org.json.JSONObject r3 = r3.zza()
            java.lang.String r4 = "appLevelSignals"
            r0.put(r4, r3)
        L51:
            return r0
    }

    final org.json.JSONObject zzd(java.lang.String r3, java.lang.String r4) throws org.json.JSONException {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "paw_id"
            r0.put(r1, r3)
            java.lang.String r3 = "signal"
            r0.put(r3, r4)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zzb
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2e
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjx
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            goto L30
        L2e:
            r3 = 0
        L30:
            java.lang.String r1 = "sdk_ttl_ms"
            r0.put(r1, r3)
            r2.zzk(r0)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbew.zza
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            com.google.android.gms.ads.nonagon.signalgeneration.zza r3 = r2.zzc
            org.json.JSONObject r3 = r3.zza()
            java.lang.String r4 = "appLevelSignals"
            r0.put(r4, r3)
        L51:
            return r0
    }

    final void zzf() {
            r4 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjs
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.zzi = r0
            java.lang.Runnable r0 = r4.zze
            if (r0 != 0) goto L27
            com.google.android.gms.internal.ads.zzbdu r0 = new com.google.android.gms.internal.ads.zzbdu
            r0.<init>(r4)
            r4.zze = r0
        L27:
            r4.zzj()
            return
    }

    public final void zzg(android.content.Context r3, androidx.browser.customtabs.CustomTabsClient r4, java.lang.String r5, androidx.browser.customtabs.CustomTabsCallback r6) {
            r2 = this;
            if (r3 == 0) goto L4c
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L44
            if (r4 == 0) goto L3c
            r2.zzl = r3
            r2.zzh = r5
            com.google.android.gms.internal.ads.zzdui r3 = r2.zzd
            com.google.android.gms.internal.ads.zzbdt r5 = new com.google.android.gms.internal.ads.zzbdt
            r5.<init>(r2, r6, r3)
            r2.zzf = r5
            androidx.browser.customtabs.CustomTabsSession r3 = r4.newSession(r5)
            r2.zzg = r3
            if (r3 != 0) goto L24
            java.lang.String r3 = "CustomTabsClient failed to create new session."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
        L24:
            com.google.android.gms.internal.ads.zzdui r3 = r2.zzd
            r4 = 1
            android.util.Pair[] r4 = new android.util.Pair[r4]
            r5 = 0
            android.util.Pair r6 = new android.util.Pair
            java.lang.String r0 = "pe"
            java.lang.String r1 = "pact_init"
            r6.<init>(r0, r1)
            r4[r5] = r6
            r5 = 0
            java.lang.String r6 = "pact_action"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r3, r5, r6, r4)
            return
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "CustomTabsClient parameter is null"
            r3.<init>(r4)
            throw r3
        L44:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Origin parameter is empty or null"
            r3.<init>(r4)
            throw r3
        L4c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "App Context parameter is null"
            r3.<init>(r4)
            throw r3
    }

    final void zzh(java.lang.String r7) {
            r6 = this;
            androidx.browser.customtabs.CustomTabsSession r0 = r6.zzg     // Catch: org.json.JSONException -> L81
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L81
            r1.<init>()     // Catch: org.json.JSONException -> L81
            java.lang.String r2 = "gsppack"
            r3 = 1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L81
            java.lang.String r2 = "fpt"
            java.util.Date r3 = new java.util.Date     // Catch: org.json.JSONException -> L81
            long r4 = r6.zzj     // Catch: org.json.JSONException -> L81
            r3.<init>(r4)     // Catch: org.json.JSONException -> L81
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L81
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L81
            r6.zzk(r1)     // Catch: org.json.JSONException -> L81
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbew.zza     // Catch: org.json.JSONException -> L81
            java.lang.Object r2 = r2.zze()     // Catch: org.json.JSONException -> L81
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: org.json.JSONException -> L81
            boolean r2 = r2.booleanValue()     // Catch: org.json.JSONException -> L81
            if (r2 == 0) goto L39
            java.lang.String r2 = "appLevelSignals"
            com.google.android.gms.ads.nonagon.signalgeneration.zza r3 = r6.zzc     // Catch: org.json.JSONException -> L81
            org.json.JSONObject r3 = r3.zza()     // Catch: org.json.JSONException -> L81
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L81
        L39:
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L81
            r2 = 0
            r0.postMessage(r1, r2)     // Catch: org.json.JSONException -> L81
            com.google.android.gms.internal.ads.zzbdv r0 = new com.google.android.gms.internal.ads.zzbdv     // Catch: org.json.JSONException -> L81
            r0.<init>(r6, r7)     // Catch: org.json.JSONException -> L81
            com.google.android.gms.internal.ads.zzbeb r7 = com.google.android.gms.internal.ads.zzbew.zzb     // Catch: org.json.JSONException -> L81
            java.lang.Object r7 = r7.zze()     // Catch: org.json.JSONException -> L81
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: org.json.JSONException -> L81
            boolean r7 = r7.booleanValue()     // Catch: org.json.JSONException -> L81
            if (r7 == 0) goto L5c
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r7 = r6.zzb     // Catch: org.json.JSONException -> L81
            androidx.browser.customtabs.CustomTabsSession r1 = r6.zzg     // Catch: org.json.JSONException -> L81
            r7.zzg(r1, r0)     // Catch: org.json.JSONException -> L81
            return
        L5c:
            android.os.Bundle r7 = new android.os.Bundle     // Catch: org.json.JSONException -> L81
            r7.<init>()     // Catch: org.json.JSONException -> L81
            java.lang.String r1 = "query_info_type"
            java.lang.String r2 = "requester_type_6"
            r7.putString(r1, r2)     // Catch: org.json.JSONException -> L81
            android.content.Context r1 = r6.zzl     // Catch: org.json.JSONException -> L81
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: org.json.JSONException -> L81
            com.google.android.gms.ads.AdRequest$Builder r3 = new com.google.android.gms.ads.AdRequest$Builder     // Catch: org.json.JSONException -> L81
            r3.<init>()     // Catch: org.json.JSONException -> L81
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r4 = com.google.ads.mediation.admob.AdMobAdapter.class
            com.google.android.gms.ads.AbstractAdRequestBuilder r7 = r3.addNetworkExtrasBundle(r4, r7)     // Catch: org.json.JSONException -> L81
            com.google.android.gms.ads.AdRequest$Builder r7 = (com.google.android.gms.ads.AdRequest.Builder) r7     // Catch: org.json.JSONException -> L81
            com.google.android.gms.ads.AdRequest r7 = r7.build()     // Catch: org.json.JSONException -> L81
            com.google.android.gms.ads.query.QueryInfo.generate(r1, r2, r7, r0)     // Catch: org.json.JSONException -> L81
            return
        L81:
            r7 = move-exception
            java.lang.String r0 = "Error creating JSON: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r7)
            return
    }

    public final void zzi(long r1) {
            r0 = this;
            r0.zzj = r1
            return
    }
}
