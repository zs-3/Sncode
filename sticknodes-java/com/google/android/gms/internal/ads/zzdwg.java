package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdwg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private final long zzd;
    private final com.google.android.gms.internal.ads.zzcas zze;
    private final android.content.Context zzf;
    private final java.lang.ref.WeakReference zzg;
    private final com.google.android.gms.internal.ads.zzdru zzh;
    private final java.util.concurrent.Executor zzi;
    private final java.util.concurrent.Executor zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final com.google.android.gms.internal.ads.zzdun zzl;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;
    private final java.util.Map zzn;
    private final com.google.android.gms.internal.ads.zzdez zzo;
    private final com.google.android.gms.internal.ads.zzfmd zzp;
    private boolean zzq;

    public zzdwg(java.util.concurrent.Executor r3, android.content.Context r4, java.lang.ref.WeakReference r5, java.util.concurrent.Executor r6, com.google.android.gms.internal.ads.zzdru r7, java.util.concurrent.ScheduledExecutorService r8, com.google.android.gms.internal.ads.zzdun r9, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10, com.google.android.gms.internal.ads.zzdez r11, com.google.android.gms.internal.ads.zzfmd r12) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r2.zzb = r0
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzcas r1 = new com.google.android.gms.internal.ads.zzcas
            r1.<init>()
            r2.zze = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r2.zzn = r1
            r1 = 1
            r2.zzq = r1
            r2.zzh = r7
            r2.zzf = r4
            r2.zzg = r5
            r2.zzi = r6
            r2.zzk = r8
            r2.zzj = r3
            r2.zzl = r9
            r2.zzm = r10
            r2.zzo = r11
            r2.zzp = r12
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.elapsedRealtime()
            r2.zzd = r3
            java.lang.String r3 = "com.google.android.gms.ads.MobileAds"
            java.lang.String r4 = ""
            r2.zzv(r3, r0, r4, r0)
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzdwg r2) {
            long r0 = r2.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcas zzb(com.google.android.gms.internal.ads.zzdwg r0) {
            com.google.android.gms.internal.ads.zzcas r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdez zzc(com.google.android.gms.internal.ads.zzdwg r0) {
            com.google.android.gms.internal.ads.zzdez r0 = r0.zzo
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdun zzd(com.google.android.gms.internal.ads.zzdwg r0) {
            com.google.android.gms.internal.ads.zzdun r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zze(com.google.android.gms.internal.ads.zzdwg r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zzp
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzh(com.google.android.gms.internal.ads.zzdwg r0) {
            java.util.concurrent.Executor r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzdwg r0, boolean r1) {
            r1 = 1
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzdwg r22, java.lang.String r23) {
            r9 = r22
            java.lang.String r10 = "data"
            android.content.Context r0 = r9.zzf
            r11 = 5
            com.google.android.gms.internal.ads.zzflp r12 = com.google.android.gms.internal.ads.zzflo.zza(r0, r11)
            r12.zzi()
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: org.json.JSONException -> L136
            r14.<init>()     // Catch: org.json.JSONException -> L136
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L136
            r1 = r23
            r0.<init>(r1)     // Catch: org.json.JSONException -> L136
            java.lang.String r1 = "initializer_settings"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L136
            java.lang.String r1 = "config"
            org.json.JSONObject r15 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L136
            java.util.Iterator r16 = r15.keys()     // Catch: org.json.JSONException -> L136
        L2a:
            boolean r0 = r16.hasNext()     // Catch: org.json.JSONException -> L136
            if (r0 == 0) goto L127
            java.lang.Object r0 = r16.next()     // Catch: org.json.JSONException -> L136
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> L136
            android.content.Context r1 = r9.zzf     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzflp r8 = com.google.android.gms.internal.ads.zzflo.zza(r1, r11)     // Catch: org.json.JSONException -> L136
            r8.zzi()     // Catch: org.json.JSONException -> L136
            r8.zzd(r0)     // Catch: org.json.JSONException -> L136
            java.lang.Object r17 = new java.lang.Object     // Catch: org.json.JSONException -> L136
            r17.<init>()     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzcas r6 = new com.google.android.gms.internal.ads.zzcas     // Catch: org.json.JSONException -> L136
            r6.<init>()     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbR     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L136
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L136
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: org.json.JSONException -> L136
            long r1 = r1.longValue()     // Catch: org.json.JSONException -> L136
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: org.json.JSONException -> L136
            java.util.concurrent.ScheduledExecutorService r4 = r9.zzk     // Catch: org.json.JSONException -> L136
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzo(r6, r1, r3, r4)     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdun r1 = r9.zzl     // Catch: org.json.JSONException -> L136
            r1.zzc(r0)     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdez r1 = r9.zzo     // Catch: org.json.JSONException -> L136
            r1.zzc(r0)     // Catch: org.json.JSONException -> L136
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: org.json.JSONException -> L136
            long r18 = r1.elapsedRealtime()     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdvx r5 = new com.google.android.gms.internal.ads.zzdvx     // Catch: org.json.JSONException -> L136
            r1 = r5
            r2 = r22
            r3 = r17
            r4 = r6
            r11 = r5
            r5 = r0
            r20 = r6
            r13 = r7
            r6 = r18
            r21 = r8
            r1.<init>(r2, r3, r4, r5, r6, r8)     // Catch: org.json.JSONException -> L136
            java.util.concurrent.Executor r1 = r9.zzi     // Catch: org.json.JSONException -> L136
            r13.addListener(r11, r1)     // Catch: org.json.JSONException -> L136
            r14.add(r13)     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdwf r11 = new com.google.android.gms.internal.ads.zzdwf     // Catch: org.json.JSONException -> L136
            r1 = r11
            r2 = r22
            r3 = r17
            r4 = r0
            r5 = r18
            r7 = r21
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r7, r8)     // Catch: org.json.JSONException -> L136
            org.json.JSONObject r1 = r15.optJSONObject(r0)     // Catch: org.json.JSONException -> L136
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: org.json.JSONException -> L136
            r6.<init>()     // Catch: org.json.JSONException -> L136
            java.lang.String r7 = ""
            if (r1 == 0) goto Lfb
            org.json.JSONArray r1 = r1.getJSONArray(r10)     // Catch: org.json.JSONException -> Lfb
            r2 = 0
        Lb5:
            int r3 = r1.length()     // Catch: org.json.JSONException -> Lfb
            if (r2 >= r3) goto Lfb
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> Lfb
            java.lang.String r4 = "format"
            java.lang.String r4 = r3.optString(r4, r7)     // Catch: org.json.JSONException -> Lfb
            org.json.JSONObject r3 = r3.optJSONObject(r10)     // Catch: org.json.JSONException -> Lfb
            android.os.Bundle r5 = new android.os.Bundle     // Catch: org.json.JSONException -> Lfb
            r5.<init>()     // Catch: org.json.JSONException -> Lfb
            if (r3 == 0) goto Lec
            java.util.Iterator r8 = r3.keys()     // Catch: org.json.JSONException -> Lfb
        Ld4:
            boolean r13 = r8.hasNext()     // Catch: org.json.JSONException -> Lfb
            if (r13 == 0) goto Lec
            java.lang.Object r13 = r8.next()     // Catch: org.json.JSONException -> Lfb
            java.lang.String r13 = (java.lang.String) r13     // Catch: org.json.JSONException -> Lfb
            r23 = r1
            java.lang.String r1 = r3.optString(r13, r7)     // Catch: org.json.JSONException -> Lfb
            r5.putString(r13, r1)     // Catch: org.json.JSONException -> Lfb
            r1 = r23
            goto Ld4
        Lec:
            r23 = r1
            com.google.android.gms.internal.ads.zzbme r1 = new com.google.android.gms.internal.ads.zzbme     // Catch: org.json.JSONException -> Lfb
            r1.<init>(r4, r5)     // Catch: org.json.JSONException -> Lfb
            r6.add(r1)     // Catch: org.json.JSONException -> Lfb
            int r2 = r2 + 1
            r1 = r23
            goto Lb5
        Lfb:
            r1 = 0
            r9.zzv(r0, r1, r7, r1)     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdru r1 = r9.zzh     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            r2.<init>()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzfia r5 = r1.zzc(r0, r2)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            java.util.concurrent.Executor r8 = r9.zzj     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdwb r13 = new com.google.android.gms.internal.ads.zzdwb     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            r1 = r13
            r2 = r22
            r3 = r0
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            r8.execute(r13)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L11a org.json.JSONException -> L136
            goto L11f
        L11a:
            java.lang.String r0 = "Failed to create Adapter."
            r11.zze(r0)     // Catch: android.os.RemoteException -> L122 org.json.JSONException -> L136
        L11f:
            r11 = 5
            goto L2a
        L122:
            r0 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r7, r0)     // Catch: org.json.JSONException -> L136
            goto L11f
        L127:
            com.google.android.gms.internal.ads.zzgfn r0 = com.google.android.gms.internal.ads.zzgfo.zza(r14)     // Catch: org.json.JSONException -> L136
            com.google.android.gms.internal.ads.zzdvy r1 = new com.google.android.gms.internal.ads.zzdvy     // Catch: org.json.JSONException -> L136
            r1.<init>(r9, r12)     // Catch: org.json.JSONException -> L136
            java.util.concurrent.Executor r2 = r9.zzi     // Catch: org.json.JSONException -> L136
            r0.zza(r1, r2)     // Catch: org.json.JSONException -> L136
            return
        L136:
            r0 = move-exception
            java.lang.String r1 = "Malformed CLD response"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzdez r1 = r9.zzo
            java.lang.String r2 = "MalformedJson"
            r1.zza(r2)
            com.google.android.gms.internal.ads.zzdun r1 = r9.zzl
            r1.zza(r2)
            com.google.android.gms.internal.ads.zzcas r1 = r9.zze
            r1.zzd(r0)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdapterInitializer.updateAdapterStatus"
            r1.zzw(r0, r2)
            com.google.android.gms.internal.ads.zzfmd r1 = r9.zzp
            r12.zzh(r0)
            r2 = 0
            r12.zzg(r2)
            com.google.android.gms.internal.ads.zzflt r0 = r12.zzm()
            r1.zzb(r0)
            return
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzdwg r0, java.lang.String r1, boolean r2, java.lang.String r3, int r4) {
            r0.zzv(r1, r2, r3, r4)
            return
    }

    private final synchronized com.google.common.util.concurrent.ListenableFuture zzu() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.zzc()     // Catch: java.lang.Throwable -> L34
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L1d
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return r0
        L1d:
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzdvz r2 = new com.google.android.gms.internal.ads.zzdvz     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L34
            r1.zzr(r2)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return r0
        L34:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    private final void zzv(java.lang.String r2, boolean r3, java.lang.String r4, int r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzblu r0 = new com.google.android.gms.internal.ads.zzblu
            r0.<init>(r2, r3, r5, r4)
            java.util.Map r3 = r1.zzn
            r3.put(r2, r0)
            return
    }

    final /* synthetic */ java.lang.Object zzf(com.google.android.gms.internal.ads.zzflp r3) throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.internal.ads.zzcas r0 = r2.zze
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.zzc(r1)
            r0 = 1
            r3.zzg(r0)
            com.google.android.gms.internal.ads.zzfmd r0 = r2.zzp
            com.google.android.gms.internal.ads.zzflt r3 = r3.zzm()
            r0.zzb(r3)
            r3 = 0
            return r3
    }

    public final java.util.List zzg() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r1 = r7.zzn
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r3 = r7.zzn
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzblu r3 = (com.google.android.gms.internal.ads.zzblu) r3
            com.google.android.gms.internal.ads.zzblu r4 = new com.google.android.gms.internal.ads.zzblu
            boolean r5 = r3.zzb
            int r6 = r3.zzc
            java.lang.String r3 = r3.zzd
            r4.<init>(r2, r5, r6, r3)
            r0.add(r4)
            goto Lf
        L32:
            return r0
    }

    public final void zzl() {
            r1 = this;
            r0 = 0
            r1.zzq = r0
            return
    }

    final /* synthetic */ void zzm() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zzc     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L7
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L39
            return
        L7:
            java.lang.String r0 = "com.google.android.gms.ads.MobileAds"
            r1 = 0
            java.lang.String r2 = "Timeout."
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L39
            long r3 = r3.elapsedRealtime()     // Catch: java.lang.Throwable -> L39
            long r5 = r7.zzd     // Catch: java.lang.Throwable -> L39
            long r3 = r3 - r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L39
            r7.zzv(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzdun r0 = r7.zzl     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "com.google.android.gms.ads.MobileAds"
            java.lang.String r2 = "timeout"
            r0.zzb(r1, r2)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzdez r0 = r7.zzo     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "com.google.android.gms.ads.MobileAds"
            java.lang.String r2 = "timeout"
            r0.zzb(r1, r2)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzcas r0 = r7.zze     // Catch: java.lang.Throwable -> L39
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L39
            throw r0
    }

    final /* synthetic */ void zzn(java.lang.String r2, com.google.android.gms.internal.ads.zzbly r3, com.google.android.gms.internal.ads.zzfia r4, java.util.List r5) {
            r1 = this;
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r0 = java.util.Objects.equals(r2, r0)     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
            if (r0 == 0) goto Lc
            r3.zzf()     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
            return
        Lc:
            java.lang.ref.WeakReference r0 = r1.zzg     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
            android.content.Context r0 = (android.content.Context) r0     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
            if (r0 == 0) goto L17
            goto L19
        L17:
            android.content.Context r0 = r1.zzf     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
        L19:
            r4.zzi(r0, r3, r5)     // Catch: android.os.RemoteException -> L1d com.google.android.gms.internal.ads.zzfhj -> L24
            return
        L1d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfyv r3 = new com.google.android.gms.internal.ads.zzfyv
            r3.<init>(r2)
            throw r3
        L24:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L3e
            r4.<init>()     // Catch: android.os.RemoteException -> L3e
            java.lang.String r5 = "Failed to initialize adapter. "
            r4.append(r5)     // Catch: android.os.RemoteException -> L3e
            r4.append(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r2 = r4.toString()     // Catch: android.os.RemoteException -> L3e
            r3.zze(r2)     // Catch: android.os.RemoteException -> L3e
            return
        L3e:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r2)
            return
    }

    final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzcas r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdvw r0 = new com.google.android.gms.internal.ads.zzdvw
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r2 = r1.zzi
            r2.execute(r0)
            return
    }

    final /* synthetic */ void zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdun r0 = r1.zzl
            r0.zze()
            com.google.android.gms.internal.ads.zzdez r0 = r1.zzo
            r0.zze()
            r0 = 1
            r1.zzb = r0
            return
    }

    final /* synthetic */ void zzq(java.lang.Object r4, com.google.android.gms.internal.ads.zzcas r5, java.lang.String r6, long r7, com.google.android.gms.internal.ads.zzflp r9) {
            r3 = this;
            monitor-enter(r4)
            boolean r0 = r5.isDone()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L3b
            java.lang.String r0 = "Timeout."
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L3d
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L3d
            long r1 = r1 - r7
            int r7 = (int) r1     // Catch: java.lang.Throwable -> L3d
            r8 = 0
            r3.zzv(r6, r8, r0, r7)     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzdun r7 = r3.zzl     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "timeout"
            r7.zzb(r6, r0)     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzdez r7 = r3.zzo     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "timeout"
            r7.zzb(r6, r0)     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzfmd r6 = r3.zzp     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "Timeout"
            r9.zzc(r7)     // Catch: java.lang.Throwable -> L3d
            r9.zzg(r8)     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzflt r7 = r9.zzm()     // Catch: java.lang.Throwable -> L3d
            r6.zzb(r7)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3d
            r5.zzc(r6)     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            throw r5
    }

    public final void zzr() {
            r6 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbex.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L7c
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r6.zzm
            int r0 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzbQ
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 < r2) goto L7c
            boolean r0 = r6.zzq
            if (r0 != 0) goto L2a
            goto L7c
        L2a:
            boolean r0 = r6.zza
            if (r0 != 0) goto L93
            monitor-enter(r6)
            boolean r0 = r6.zza     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L35
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L79
            return
        L35:
            com.google.android.gms.internal.ads.zzdun r0 = r6.zzl     // Catch: java.lang.Throwable -> L79
            r0.zzf()     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzdez r0 = r6.zzo     // Catch: java.lang.Throwable -> L79
            r0.zzf()     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzcas r0 = r6.zze     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzdwc r2 = new com.google.android.gms.internal.ads.zzdwc     // Catch: java.lang.Throwable -> L79
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.Executor r3 = r6.zzi     // Catch: java.lang.Throwable -> L79
            r0.addListener(r2, r3)     // Catch: java.lang.Throwable -> L79
            r6.zza = r1     // Catch: java.lang.Throwable -> L79
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zzu()     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.ScheduledExecutorService r1 = r6.zzk     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzdvv r2 = new com.google.android.gms.internal.ads.zzdvv     // Catch: java.lang.Throwable -> L79
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbS     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L79
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L79
            r1.schedule(r2, r3, r5)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzdwe r1 = new com.google.android.gms.internal.ads.zzdwe     // Catch: java.lang.Throwable -> L79
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.Executor r2 = r6.zzi     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            boolean r0 = r6.zza
            if (r0 != 0) goto L93
            java.lang.String r0 = ""
            java.lang.String r2 = "com.google.android.gms.ads.MobileAds"
            r3 = 0
            r6.zzv(r2, r1, r0, r3)
            com.google.android.gms.internal.ads.zzcas r0 = r6.zze
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.zzc(r2)
            r6.zza = r1
            r6.zzb = r1
        L93:
            return
    }

    public final void zzs(com.google.android.gms.internal.ads.zzbmb r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdwa r0 = new com.google.android.gms.internal.ads.zzdwa
            r0.<init>(r2, r3)
            java.util.concurrent.Executor r3 = r2.zzj
            com.google.android.gms.internal.ads.zzcas r1 = r2.zze
            r1.addListener(r0, r3)
            return
    }

    public final boolean zzt() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
