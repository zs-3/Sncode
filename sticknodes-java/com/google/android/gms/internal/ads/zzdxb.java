package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdxb implements com.google.android.gms.internal.ads.zzdyc, com.google.android.gms.internal.ads.zzdwm {
    private final com.google.android.gms.internal.ads.zzdxm zza;
    private final com.google.android.gms.internal.ads.zzdyd zzb;
    private final com.google.android.gms.internal.ads.zzdwn zzc;
    private final com.google.android.gms.internal.ads.zzdww zzd;
    private final com.google.android.gms.internal.ads.zzdwl zze;
    private final com.google.android.gms.internal.ads.zzdxy zzf;
    private final com.google.android.gms.internal.ads.zzdxi zzg;
    private final com.google.android.gms.internal.ads.zzdxi zzh;
    private final java.lang.String zzi;
    private final android.content.Context zzj;
    private final java.lang.String zzk;
    private final java.util.Map zzl;
    private final java.util.Map zzm;
    private final java.util.Map zzn;
    private java.lang.String zzo;
    private org.json.JSONObject zzp;
    private long zzq;
    private com.google.android.gms.internal.ads.zzdwx zzr;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private com.google.android.gms.internal.ads.zzdxa zzv;
    private long zzw;
    private java.lang.String zzx;

    zzdxb(com.google.android.gms.internal.ads.zzdxm r3, com.google.android.gms.internal.ads.zzdyd r4, com.google.android.gms.internal.ads.zzdwn r5, android.content.Context r6, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7, com.google.android.gms.internal.ads.zzdww r8, com.google.android.gms.internal.ads.zzdxy r9, com.google.android.gms.internal.ads.zzdxi r10, com.google.android.gms.internal.ads.zzdxi r11, java.lang.String r12) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzl = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzm = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzn = r0
            java.lang.String r0 = "{}"
            r2.zzo = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.zzq = r0
            com.google.android.gms.internal.ads.zzdwx r0 = com.google.android.gms.internal.ads.zzdwx.zza
            r2.zzr = r0
            com.google.android.gms.internal.ads.zzdxa r0 = com.google.android.gms.internal.ads.zzdxa.zza
            r2.zzv = r0
            r0 = 0
            r2.zzw = r0
            java.lang.String r0 = ""
            r2.zzx = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            com.google.android.gms.internal.ads.zzdwl r3 = new com.google.android.gms.internal.ads.zzdwl
            r3.<init>(r6)
            r2.zze = r3
            java.lang.String r3 = r7.afmaVersion
            r2.zzi = r3
            r2.zzk = r12
            r2.zzd = r8
            r2.zzf = r9
            r2.zzg = r10
            r2.zzh = r11
            r2.zzj = r6
            com.google.android.gms.ads.internal.util.zzay r3 = com.google.android.gms.ads.internal.zzu.zzs()
            r3.zzg(r2)
            return
    }

    private final synchronized void zzA(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L9
            monitor-exit(r3)
            return
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            r0.<init>(r4)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            java.lang.String r4 = "isTestMode"
            r1 = 0
            boolean r4 = r0.optBoolean(r4, r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            r3.zzx(r4, r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            java.lang.String r4 = "gesture"
            java.lang.String r2 = "NONE"
            java.lang.String r4 = r0.optString(r4, r2)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            java.lang.Class<com.google.android.gms.internal.ads.zzdwx> r2 = com.google.android.gms.internal.ads.zzdwx.class
            java.lang.Enum r4 = java.lang.Enum.valueOf(r2, r4)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzdwx r4 = (com.google.android.gms.internal.ads.zzdwx) r4     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            r3.zzw(r4, r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            java.lang.String r4 = "networkExtras"
            java.lang.String r1 = "{}"
            java.lang.String r4 = r0.optString(r4, r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            r3.zzo = r4     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            java.lang.String r4 = "networkExtrasExpirationSecs"
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0.optLong(r4, r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            r3.zzq = r0     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L46
            monitor-exit(r3)
            return
        L44:
            monitor-exit(r3)
            return
        L46:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private final synchronized org.json.JSONObject zzt() throws org.json.JSONException {
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            java.util.Map r1 = r7.zzl     // Catch: java.lang.Throwable -> L57
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L57
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L57
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L57
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r2.getValue()     // Catch: java.lang.Throwable -> L57
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L57
        L2b:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L45
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzdwp r5 = (com.google.android.gms.internal.ads.zzdwp) r5     // Catch: java.lang.Throwable -> L57
            boolean r6 = r5.zzg()     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L2b
            org.json.JSONObject r5 = r5.zzd()     // Catch: java.lang.Throwable -> L57
            r3.put(r5)     // Catch: java.lang.Throwable -> L57
            goto L2b
        L45:
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L57
            if (r4 <= 0) goto L10
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L57
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L57
            goto L10
        L55:
            monitor-exit(r7)
            return r0
        L57:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    private final void zzu() {
            r5 = this;
            r0 = 1
            r5.zzu = r0
            com.google.android.gms.internal.ads.zzdww r0 = r5.zzd
            r0.zzc()
            com.google.android.gms.internal.ads.zzdxm r0 = r5.zza
            r0.zzh(r5)
            com.google.android.gms.internal.ads.zzdyd r0 = r5.zzb
            r0.zzd(r5)
            com.google.android.gms.internal.ads.zzdwn r0 = r5.zzc
            r0.zzd(r5)
            com.google.android.gms.internal.ads.zzdxy r0 = r5.zzf
            r0.zzf(r5)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzja
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = ","
            if (r1 != 0) goto L4d
            android.content.Context r1 = r5.zzj
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.android.gms.internal.ads.zzdxi r3 = r5.zzg
            r3.zzb(r1, r0)
        L4d:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjb
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L7f
            android.content.Context r1 = r5.zzj
            r3 = 0
            java.lang.String r4 = "admob"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r4, r3)
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.android.gms.internal.ads.zzdxi r2 = r5.zzh
            r2.zzb(r1, r0)
        L7f:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            java.lang.String r0 = r0.zzn()
            r5.zzA(r0)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            java.lang.String r0 = r0.zzo()
            r5.zzx = r0
            return
    }

    private final void zzv() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            java.lang.String r1 = r2.zzd()
            r0.zzG(r1)
            return
    }

    private final synchronized void zzw(com.google.android.gms.internal.ads.zzdwx r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdwx r0 = r1.zzr     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L6
            goto L21
        L6:
            boolean r0 = r1.zzq()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lf
            r1.zzy()     // Catch: java.lang.Throwable -> L23
        Lf:
            r1.zzr = r2     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L1a
            r1.zzz()     // Catch: java.lang.Throwable -> L23
        L1a:
            if (r3 == 0) goto L21
            r1.zzv()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            return
        L21:
            monitor-exit(r1)
            return
        L23:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final synchronized void zzx(boolean r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L6
            goto L3a
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziM     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L26
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2a
        L26:
            r1.zzz()     // Catch: java.lang.Throwable -> L3c
            goto L33
        L2a:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L33
            r1.zzy()     // Catch: java.lang.Throwable -> L3c
        L33:
            if (r3 == 0) goto L3a
            r1.zzv()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final synchronized void zzy() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdwx r0 = r2.zzr     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto Lf
            monitor-exit(r2)
            return
        Lf:
            com.google.android.gms.internal.ads.zzdwn r0 = r2.zzc     // Catch: java.lang.Throwable -> L1d
            r0.zzb()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L16:
            com.google.android.gms.internal.ads.zzdyd r0 = r2.zzb     // Catch: java.lang.Throwable -> L1d
            r0.zzb()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final synchronized void zzz() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdwx r0 = r2.zzr     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto Lf
            monitor-exit(r2)
            return
        Lf:
            com.google.android.gms.internal.ads.zzdwn r0 = r2.zzc     // Catch: java.lang.Throwable -> L1d
            r0.zzc()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L16:
            com.google.android.gms.internal.ads.zzdyd r0 = r2.zzb     // Catch: java.lang.Throwable -> L1d
            r0.zzc()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzdwx zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdwx r0 = r1.zzr
            return r0
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Map r1 = r3.zzm     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L1a
            java.util.Map r1 = r3.zzm     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzdwp r4 = (com.google.android.gms.internal.ads.zzdwp) r4     // Catch: java.lang.Throwable -> L39
            r0.zzc(r4)     // Catch: java.lang.Throwable -> L39
            goto L37
        L1a:
            java.util.Map r1 = r3.zzn     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L2c
            java.util.Map r1 = r3.zzn     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L39
        L2c:
            java.util.Map r1 = r3.zzn     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L39
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L39
            r4.add(r0)     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r3)
            return r0
        L39:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized java.lang.String zzc() {
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L48
            boolean r0 = r6.zzq()     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L1a
            goto L48
        L1a:
            long r0 = r6.zzq     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L4c
            long r2 = r2.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3a
            java.lang.String r0 = "{}"
            r6.zzo = r0     // Catch: java.lang.Throwable -> L4c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.zzq = r0     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = ""
            monitor-exit(r6)
            return r0
        L3a:
            java.lang.String r0 = r6.zzo     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "{}"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L48
            java.lang.String r0 = r6.zzo     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r6)
            return r0
        L48:
            java.lang.String r0 = ""
            monitor-exit(r6)
            return r0
        L4c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public final synchronized java.lang.String zzd() {
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.zzs     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.zzdwx r2 = r7.zzr     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            long r1 = r7.zzq     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            long r3 = r3.currentTimeMillis()     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L33
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.zzo     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.zzq     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L33 java.lang.Throwable -> L39
        L33:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L39
            monitor-exit(r7)
            return r0
        L39:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final synchronized org.json.JSONObject zze() {
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L196
            r0.<init>()     // Catch: java.lang.Throwable -> L196
            java.lang.String r1 = "platform"
            java.lang.String r2 = "ANDROID"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = r7.zzk     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 != 0) goto L2d
            java.lang.String r1 = "sdkVersion"
            java.lang.String r2 = r7.zzk     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r3.<init>()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r4 = "afma-sdk-a-v"
            r3.append(r4)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r3.append(r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r2 = r3.toString()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        L2d:
            java.lang.String r1 = "internalSdkVersion"
            java.lang.String r2 = r7.zzi     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "osVersion"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "adapters"
            com.google.android.gms.internal.ads.zzdww r2 = r7.zzd     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            org.json.JSONArray r2 = r2.zza()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziX     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = r1.booleanValue()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 == 0) goto L6b
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = r1.zzn()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r2 != 0) goto L6b
            java.lang.String r2 = "plugin"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        L6b:
            long r1 = r7.zzq     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            long r3 = r3.currentTimeMillis()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L80
            java.lang.String r1 = "{}"
            r7.zzo = r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        L80:
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.zzo     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "adSlots"
            org.json.JSONObject r2 = r7.zzt()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "appInfo"
            com.google.android.gms.internal.ads.zzdwl r2 = r7.zze     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            org.json.JSONObject r2 = r2.zza()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbzx r1 = r1.zzh()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = r1.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r2 != 0) goto Lbb
            java.lang.String r2 = "cld"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r3.<init>(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        Lbb:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziN     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = r1.booleanValue()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 == 0) goto Lf0
            org.json.JSONObject r1 = r7.zzp     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 == 0) goto Lf0
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r2.<init>()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r3 = "Server data: "
            r2.append(r3)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r2.append(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = r2.toString()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "serverData"
            org.json.JSONObject r2 = r7.zzp     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        Lf0:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziM     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = r1.booleanValue()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 == 0) goto L110
            java.lang.String r1 = "openAction"
            com.google.android.gms.internal.ads.zzdxa r2 = r7.zzv     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.zzdwx r2 = r7.zzr     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        L110:
            java.lang.String r1 = "isGamRegisteredTestDevice"
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r2 = r2.zzl()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r1 = "isSimulator"
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzf.zzs()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziZ     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = r1.booleanValue()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 == 0) goto L14a
            java.lang.String r1 = "uiStorage"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.String r3 = r7.zzx     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r2.<init>(r3)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        L14a:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjb     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 != 0) goto L167
            java.lang.String r1 = "gmaDisk"
            com.google.android.gms.internal.ads.zzdxi r2 = r7.zzh     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            org.json.JSONObject r2 = r2.zza()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
        L167:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzja     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.Object r1 = r2.zza(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            if (r1 != 0) goto L194
            java.lang.String r1 = "userDisk"
            com.google.android.gms.internal.ads.zzdxi r2 = r7.zzg     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            org.json.JSONObject r2 = r2.zza()     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L185 java.lang.Throwable -> L196
            goto L194
        L185:
            r1 = move-exception
            java.lang.String r2 = "Inspector.toJson"
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L196
            r3.zzv(r1, r2)     // Catch: java.lang.Throwable -> L196
            java.lang.String r2 = "Ad inspector encountered an error"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r1)     // Catch: java.lang.Throwable -> L196
        L194:
            monitor-exit(r7)
            return r0
        L196:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final synchronized void zzf(java.lang.String r4, com.google.android.gms.internal.ads.zzdwp r5) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L9d
            boolean r0 = r3.zzq()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L1b
            goto L9d
        L1b:
            int r0 = r3.zzt     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziz     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L9f
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L9f
            if (r0 < r1) goto L36
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r3)
            return
        L36:
            java.util.Map r0 = r3.zzl     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L48
            java.util.Map r0 = r3.zzl     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r1.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L9f
        L48:
            int r0 = r3.zzt     // Catch: java.lang.Throwable -> L9f
            int r0 = r0 + 1
            r3.zzt = r0     // Catch: java.lang.Throwable -> L9f
            java.util.Map r0 = r3.zzl     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L9f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L9f
            r4.add(r5)     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zziV     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r0.zza(r4)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L9f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto L9d
            java.lang.String r4 = r5.zzc()     // Catch: java.lang.Throwable -> L9f
            java.util.Map r0 = r3.zzm     // Catch: java.lang.Throwable -> L9f
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L9f
            java.util.Map r0 = r3.zzn     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L9d
            java.util.Map r0 = r3.zzn     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L9f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L9f
        L88:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.internal.ads.zzcas r1 = (com.google.android.gms.internal.ads.zzcas) r1     // Catch: java.lang.Throwable -> L9f
            r1.zzc(r5)     // Catch: java.lang.Throwable -> L9f
            goto L88
        L98:
            r4.clear()     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r3)
            return
        L9d:
            monitor-exit(r3)
            return
        L9f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final void zzg() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto L5b
        L13:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            boolean r0 = r0.zzR()
            if (r0 != 0) goto L34
            goto L38
        L34:
            r3.zzu()
            return
        L38:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            java.lang.String r0 = r0.zzn()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L5b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r1.<init>(r0)     // Catch: org.json.JSONException -> L5b
            java.lang.String r0 = "isTestMode"
            r2 = 0
            boolean r0 = r1.optBoolean(r0, r2)     // Catch: org.json.JSONException -> L5b
            if (r0 == 0) goto L5b
            r3.zzu()     // Catch: org.json.JSONException -> L5b
        L5b:
            return
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdl r4, com.google.android.gms.internal.ads.zzdxa r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq()     // Catch: java.lang.Throwable -> L57
            r1 = 0
            if (r0 != 0) goto L1a
            r5 = 18
            com.google.android.gms.ads.internal.client.zze r5 = com.google.android.gms.internal.ads.zzfie.zzd(r5, r1, r1)     // Catch: android.os.RemoteException -> L13 java.lang.Throwable -> L57
            r4.zze(r5)     // Catch: android.os.RemoteException -> L13 java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L13:
            java.lang.String r4 = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L1a:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L3d
            r5 = 1
            com.google.android.gms.ads.internal.client.zze r5 = com.google.android.gms.internal.ads.zzfie.zzd(r5, r1, r1)     // Catch: android.os.RemoteException -> L36 java.lang.Throwable -> L57
            r4.zze(r5)     // Catch: android.os.RemoteException -> L36 java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L36:
            java.lang.String r4 = "Ad inspector had an internal error."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L3d:
            r3.zzv = r5     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzdxm r5 = r3.zza     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbkq r0 = new com.google.android.gms.internal.ads.zzbkq     // Catch: java.lang.Throwable -> L57
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzdxy r1 = r3.zzf     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbkj r2 = new com.google.android.gms.internal.ads.zzbkj     // Catch: java.lang.Throwable -> L57
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbjx r1 = new com.google.android.gms.internal.ads.zzbjx     // Catch: java.lang.Throwable -> L57
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L57
            r5.zzj(r4, r0, r2, r1)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L57:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzi(java.lang.String r1, long r2) {
            r0 = this;
            monitor-enter(r0)
            r0.zzo = r1     // Catch: java.lang.Throwable -> La
            r0.zzq = r2     // Catch: java.lang.Throwable -> La
            r0.zzv()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzj(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            r1.zzx = r2     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.zzx     // Catch: java.lang.Throwable -> L12
            r2.zzH(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzk(long r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.zzw     // Catch: java.lang.Throwable -> L8
            long r0 = r0 + r3
            r2.zzw = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void zzl(boolean r2) {
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
    }

    public final void zzm(com.google.android.gms.internal.ads.zzdwx r2) {
            r1 = this;
            r0 = 1
            r1.zzw(r2, r0)
            return
    }

    public final synchronized void zzn(org.json.JSONObject r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzp = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void zzo(boolean r2) {
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto L9
            if (r2 == 0) goto L9
            r1.zzu()
        L9:
            r0 = 1
            r1.zzx(r2, r0)
            return
    }

    public final boolean zzp() {
            r1 = this;
            org.json.JSONObject r0 = r1.zzp
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final synchronized boolean zzq() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziM     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L27
            boolean r0 = r2.zzs     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L25
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.zzl()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L22
            goto L25
        L22:
            r0 = 0
        L23:
            monitor-exit(r2)
            return r0
        L25:
            r0 = 1
            goto L23
        L27:
            boolean r0 = r2.zzs     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return r0
        L2b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized boolean zzr() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean zzs() {
            r5 = this;
            long r0 = r5.zzw
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziS
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }
}
