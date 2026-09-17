package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbyf implements com.google.android.gms.internal.ads.zzbyk {
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.List zzc = null;
    boolean zza;
    private final com.google.android.gms.internal.ads.zzhff zzd;
    private final java.util.LinkedHashMap zze;
    private final java.util.List zzf;
    private final java.util.List zzg;
    private final android.content.Context zzh;
    private final com.google.android.gms.internal.ads.zzbyh zzi;
    private final java.lang.Object zzj;
    private java.util.HashSet zzk;
    private boolean zzl;
    private boolean zzm;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            com.google.android.gms.internal.ads.zzbyf.zzc = r0
            return
    }

    public zzbyf(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4, com.google.android.gms.internal.ads.zzbyh r5, java.lang.String r6, com.google.android.gms.internal.ads.zzbyg r7) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2.zzf = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2.zzg = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r2.zzj = r7
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r2.zzk = r7
            r7 = 0
            r2.zzl = r7
            r2.zzm = r7
            java.lang.String r7 = "SafeBrowsing config is not present."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r7)
            android.content.Context r7 = r3.getApplicationContext()
            if (r7 == 0) goto L33
            android.content.Context r3 = r3.getApplicationContext()
        L33:
            r2.zzh = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.zze = r3
            r2.zzi = r5
            java.util.List r3 = r5.zze
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashSet r7 = r2.zzk
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r0)
            r7.add(r5)
            goto L44
        L5c:
            java.util.HashSet r3 = r2.zzk
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r7 = "cookie"
            java.lang.String r5 = r7.toLowerCase(r5)
            r3.remove(r5)
            com.google.android.gms.internal.ads.zzhff r3 = com.google.android.gms.internal.ads.zzhhe.zzc()
            r5 = 9
            r3.zzn(r5)
            r3.zzj(r6)
            r3.zzh(r6)
            com.google.android.gms.internal.ads.zzhfg r5 = com.google.android.gms.internal.ads.zzhfh.zzc()
            com.google.android.gms.internal.ads.zzbyh r6 = r2.zzi
            java.lang.String r6 = r6.zza
            if (r6 == 0) goto L85
            r5.zza(r6)
        L85:
            com.google.android.gms.internal.ads.zzhbe r5 = r5.zzbn()
            com.google.android.gms.internal.ads.zzhfh r5 = (com.google.android.gms.internal.ads.zzhfh) r5
            r3.zzg(r5)
            com.google.android.gms.internal.ads.zzhgv r5 = com.google.android.gms.internal.ads.zzhgw.zzc()
            android.content.Context r6 = r2.zzh
            com.google.android.gms.common.wrappers.PackageManagerWrapper r6 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r6)
            boolean r6 = r6.isCallerInstantApp()
            r5.zzc(r6)
            java.lang.String r4 = r4.afmaVersion
            if (r4 == 0) goto La6
            r5.zza(r4)
        La6:
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.content.Context r6 = r2.zzh
            int r4 = r4.getApkVersion(r6)
            long r6 = (long) r4
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto Lba
            r5.zzb(r6)
        Lba:
            com.google.android.gms.internal.ads.zzhbe r4 = r5.zzbn()
            com.google.android.gms.internal.ads.zzhgw r4 = (com.google.android.gms.internal.ads.zzhgw) r4
            r3.zzf(r4)
            r2.zzd = r3
            return
    }

    static /* bridge */ /* synthetic */ java.util.List zzc() {
            java.util.List r0 = com.google.android.gms.internal.ads.zzbyf.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final com.google.android.gms.internal.ads.zzbyh zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbyh r0 = r1.zzi
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(java.util.Map r11) throws java.lang.Exception {
            r10 = this;
            r0 = 1
            if (r11 != 0) goto L5
            goto L7b
        L5:
            java.util.Set r1 = r11.keySet()     // Catch: org.json.JSONException -> L189
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L189
        Ld:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L189
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L189
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L189
            java.lang.Object r3 = r11.get(r2)     // Catch: org.json.JSONException -> L189
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L189
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L189
            r4.<init>(r3)     // Catch: org.json.JSONException -> L189
            java.lang.String r3 = "matches"
            org.json.JSONArray r3 = r4.optJSONArray(r3)     // Catch: org.json.JSONException -> L189
            if (r3 == 0) goto Ld
            java.lang.Object r4 = r10.zzj     // Catch: org.json.JSONException -> L189
            monitor-enter(r4)     // Catch: org.json.JSONException -> L189
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r10.zzj     // Catch: java.lang.Throwable -> L78
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L78
            java.util.LinkedHashMap r7 = r10.zze     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.zzhgt r7 = (com.google.android.gms.internal.ads.zzhgt) r7     // Catch: java.lang.Throwable -> L75
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L75
            if (r7 != 0) goto L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = "Cannot find the corresponding resource object for "
            r3.append(r5)     // Catch: java.lang.Throwable -> L78
            r3.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzbyj.zza(r2)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            goto Ld
        L57:
            r2 = 0
            r6 = 0
        L59:
            if (r6 >= r5) goto L6b
            org.json.JSONObject r8 = r3.getJSONObject(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.String r9 = "threat_type"
            java.lang.String r8 = r8.getString(r9)     // Catch: java.lang.Throwable -> L78
            r7.zza(r8)     // Catch: java.lang.Throwable -> L78
            int r6 = r6 + 1
            goto L59
        L6b:
            boolean r3 = r10.zza     // Catch: java.lang.Throwable -> L78
            if (r5 <= 0) goto L70
            r2 = 1
        L70:
            r2 = r2 | r3
            r10.zza = r2     // Catch: java.lang.Throwable -> L78
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            goto Ld
        L75:
            r11 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L78
        L78:
            r11 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            throw r11     // Catch: org.json.JSONException -> L189
        L7b:
            boolean r11 = r10.zza     // Catch: org.json.JSONException -> L189
            if (r11 == 0) goto L8e
            java.lang.Object r11 = r10.zzj     // Catch: org.json.JSONException -> L189
            monitor-enter(r11)     // Catch: org.json.JSONException -> L189
            com.google.android.gms.internal.ads.zzhff r1 = r10.zzd     // Catch: java.lang.Throwable -> L8b
            r2 = 10
            r1.zzn(r2)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8b
            goto L8e
        L8b:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8b
            throw r0     // Catch: org.json.JSONException -> L189
        L8e:
            boolean r11 = r10.zza     // Catch: org.json.JSONException -> L189
            r1 = 0
            if (r11 == 0) goto L99
            com.google.android.gms.internal.ads.zzbyh r2 = r10.zzi     // Catch: org.json.JSONException -> L189
            boolean r2 = r2.zzg     // Catch: org.json.JSONException -> L189
            if (r2 != 0) goto Lab
        L99:
            boolean r2 = r10.zzm     // Catch: org.json.JSONException -> L189
            if (r2 == 0) goto La3
            com.google.android.gms.internal.ads.zzbyh r2 = r10.zzi     // Catch: org.json.JSONException -> L189
            boolean r2 = r2.zzf     // Catch: org.json.JSONException -> L189
            if (r2 != 0) goto Lab
        La3:
            if (r11 != 0) goto L184
            com.google.android.gms.internal.ads.zzbyh r11 = r10.zzi     // Catch: org.json.JSONException -> L189
            boolean r11 = r11.zzd     // Catch: org.json.JSONException -> L189
            if (r11 == 0) goto L184
        Lab:
            java.lang.Object r11 = r10.zzj     // Catch: org.json.JSONException -> L189
            monitor-enter(r11)     // Catch: org.json.JSONException -> L189
            java.util.LinkedHashMap r2 = r10.zze     // Catch: java.lang.Throwable -> L181
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L181
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L181
        Lb8:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L181
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhgt r3 = (com.google.android.gms.internal.ads.zzhgt) r3     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhff r4 = r10.zzd     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhbe r3 = r3.zzbn()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhgu r3 = (com.google.android.gms.internal.ads.zzhgu) r3     // Catch: java.lang.Throwable -> L181
            r4.zzc(r3)     // Catch: java.lang.Throwable -> L181
            goto Lb8
        Ld0:
            com.google.android.gms.internal.ads.zzhff r2 = r10.zzd     // Catch: java.lang.Throwable -> L181
            java.util.List r3 = r10.zzf     // Catch: java.lang.Throwable -> L181
            r2.zza(r3)     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhff r2 = r10.zzd     // Catch: java.lang.Throwable -> L181
            java.util.List r3 = r10.zzg     // Catch: java.lang.Throwable -> L181
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L181
            boolean r2 = com.google.android.gms.internal.ads.zzbyj.zzb()     // Catch: java.lang.Throwable -> L181
            if (r2 == 0) goto L149
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhff r3 = r10.zzd     // Catch: java.lang.Throwable -> L181
            java.lang.String r3 = r3.zzl()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhff r4 = r10.zzd     // Catch: java.lang.Throwable -> L181
            java.lang.String r4 = r4.zzk()     // Catch: java.lang.Throwable -> L181
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L181
            r5.<init>()     // Catch: java.lang.Throwable -> L181
            java.lang.String r6 = "Sending SB report\n  url: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L181
            r5.append(r3)     // Catch: java.lang.Throwable -> L181
            java.lang.String r3 = "\n  clickUrl: "
            r5.append(r3)     // Catch: java.lang.Throwable -> L181
            r5.append(r4)     // Catch: java.lang.Throwable -> L181
            java.lang.String r3 = "\n  resources: \n"
            r5.append(r3)     // Catch: java.lang.Throwable -> L181
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L181
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhff r3 = r10.zzd     // Catch: java.lang.Throwable -> L181
            java.util.List r3 = r3.zzm()     // Catch: java.lang.Throwable -> L181
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L181
        L11d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L181
            if (r4 == 0) goto L142
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhgu r4 = (com.google.android.gms.internal.ads.zzhgu) r4     // Catch: java.lang.Throwable -> L181
            java.lang.String r5 = "    ["
            r2.append(r5)     // Catch: java.lang.Throwable -> L181
            int r5 = r4.zzc()     // Catch: java.lang.Throwable -> L181
            r2.append(r5)     // Catch: java.lang.Throwable -> L181
            java.lang.String r5 = "] "
            r2.append(r5)     // Catch: java.lang.Throwable -> L181
            java.lang.String r4 = r4.zzf()     // Catch: java.lang.Throwable -> L181
            r2.append(r4)     // Catch: java.lang.Throwable -> L181
            goto L11d
        L142:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzbyj.zza(r2)     // Catch: java.lang.Throwable -> L181
        L149:
            com.google.android.gms.internal.ads.zzhff r2 = r10.zzd     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhbe r2 = r2.zzbn()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzhhe r2 = (com.google.android.gms.internal.ads.zzhhe) r2     // Catch: java.lang.Throwable -> L181
            byte[] r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzbyh r3 = r10.zzi     // Catch: java.lang.Throwable -> L181
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.ads.internal.util.zzbo r4 = new com.google.android.gms.ads.internal.util.zzbo     // Catch: java.lang.Throwable -> L181
            android.content.Context r5 = r10.zzh     // Catch: java.lang.Throwable -> L181
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L181
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzb(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L181
            boolean r1 = com.google.android.gms.internal.ads.zzbyj.zzb()     // Catch: java.lang.Throwable -> L181
            if (r1 == 0) goto L174
            com.google.android.gms.internal.ads.zzbyc r1 = new com.google.android.gms.internal.ads.zzbyc     // Catch: java.lang.Throwable -> L181
            r1.<init>()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.lang.Throwable -> L181
            r0.addListener(r1, r2)     // Catch: java.lang.Throwable -> L181
        L174:
            com.google.android.gms.internal.ads.zzbyd r1 = new com.google.android.gms.internal.ads.zzbyd     // Catch: java.lang.Throwable -> L181
            r1.<init>()     // Catch: java.lang.Throwable -> L181
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L181
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)     // Catch: java.lang.Throwable -> L181
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L181
            goto L188
        L181:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L181
            throw r0     // Catch: org.json.JSONException -> L189
        L184:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)     // Catch: org.json.JSONException -> L189
        L188:
            return r0
        L189:
            r11 = move-exception
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbez.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19d
            java.lang.String r0 = "Failed to get SafeBrowsing metadata"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r0, r11)
        L19d:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r0 = "Safebrowsing report transmission failed."
            r11.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r11 = com.google.android.gms.internal.ads.zzgfo.zzg(r11)
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzd(java.lang.String r7, java.util.Map r8, int r9) {
            r6 = this;
            java.lang.Object r0 = r6.zzj
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L9
            r2 = 1
            r6.zzm = r2     // Catch: java.lang.Throwable -> Lb4
        L9:
            java.util.LinkedHashMap r2 = r6.zze     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = r2.containsKey(r7)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L21
            if (r9 != r1) goto L1f
            java.util.LinkedHashMap r8 = r6.zze     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzhgt r7 = (com.google.android.gms.internal.ads.zzhgt) r7     // Catch: java.lang.Throwable -> Lb4
            r8 = 4
            r7.zze(r8)     // Catch: java.lang.Throwable -> Lb4
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            return
        L21:
            com.google.android.gms.internal.ads.zzhgt r1 = com.google.android.gms.internal.ads.zzhgu.zzd()     // Catch: java.lang.Throwable -> Lb4
            int r9 = com.google.android.gms.internal.ads.zzhgs.zza(r9)     // Catch: java.lang.Throwable -> Lb4
            if (r9 == 0) goto L2e
            r1.zze(r9)     // Catch: java.lang.Throwable -> Lb4
        L2e:
            java.util.LinkedHashMap r9 = r6.zze     // Catch: java.lang.Throwable -> Lb4
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lb4
            r1.zzb(r9)     // Catch: java.lang.Throwable -> Lb4
            r1.zzd(r7)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzhfs r9 = com.google.android.gms.internal.ads.zzhfv.zzc()     // Catch: java.lang.Throwable -> Lb4
            java.util.HashSet r2 = r6.zzk     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto La4
            if (r8 == 0) goto La4
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lb4
        L50:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto La4
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lb4
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb4
            goto L6b
        L69:
            java.lang.String r3 = ""
        L6b:
            java.lang.Object r4 = r2.getValue()     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto L78
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb4
            goto L7a
        L78:
            java.lang.String r2 = ""
        L7a:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch: java.lang.Throwable -> Lb4
            java.util.HashSet r5 = r6.zzk     // Catch: java.lang.Throwable -> Lb4
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto L50
            com.google.android.gms.internal.ads.zzhfq r4 = com.google.android.gms.internal.ads.zzhfr.zzc()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzgzs r3 = com.google.android.gms.internal.ads.zzgzs.zzw(r3)     // Catch: java.lang.Throwable -> Lb4
            r4.zza(r3)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzgzs r2 = com.google.android.gms.internal.ads.zzgzs.zzw(r2)     // Catch: java.lang.Throwable -> Lb4
            r4.zzb(r2)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzhbe r2 = r4.zzbn()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzhfr r2 = (com.google.android.gms.internal.ads.zzhfr) r2     // Catch: java.lang.Throwable -> Lb4
            r9.zza(r2)     // Catch: java.lang.Throwable -> Lb4
            goto L50
        La4:
            com.google.android.gms.internal.ads.zzhbe r8 = r9.zzbn()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzhfv r8 = (com.google.android.gms.internal.ads.zzhfv) r8     // Catch: java.lang.Throwable -> Lb4
            r1.zzc(r8)     // Catch: java.lang.Throwable -> Lb4
            java.util.LinkedHashMap r8 = r6.zze     // Catch: java.lang.Throwable -> Lb4
            r8.put(r7, r1)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            return
        Lb4:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze() {
            r7 = this;
            java.lang.Object r0 = r7.zzj
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r7.zze     // Catch: java.lang.Throwable -> L34
            r1.keySet()     // Catch: java.lang.Throwable -> L34
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L34
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzbya r2 = new com.google.android.gms.internal.ads.zzbya     // Catch: java.lang.Throwable -> L34
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L34
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.ScheduledExecutorService r6 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L34
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzo(r1, r4, r2, r6)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzbye r4 = new com.google.android.gms.internal.ads.zzbye     // Catch: java.lang.Throwable -> L34
            r4.<init>(r7, r2)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzgfo.zzr(r1, r4, r3)     // Catch: java.lang.Throwable -> L34
            java.util.List r1 = com.google.android.gms.internal.ads.zzbyf.zzc     // Catch: java.lang.Throwable -> L34
            r1.add(r2)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
    }

    final /* synthetic */ void zzf(android.graphics.Bitmap r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgzr r0 = com.google.android.gms.internal.ads.zzgzs.zzt()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 0
            r4.compress(r1, r2, r0)
            java.lang.Object r4 = r3.zzj
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzhff r1 = r3.zzd     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzhgn r2 = com.google.android.gms.internal.ads.zzhgp.zzc()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzb()     // Catch: java.lang.Throwable -> L2e
            r2.zza(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "image/png"
            r2.zzb(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = 2
            r2.zzc(r0)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zzbn()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzhgp r0 = (com.google.android.gms.internal.ads.zzhgp) r0     // Catch: java.lang.Throwable -> L2e
            r1.zzi(r0)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzg(android.view.View r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzbyh r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L93
            com.google.android.gms.ads.internal.zzu.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbyj.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbyb r8 = new com.google.android.gms.internal.ads.zzbyb
            r8.<init>(r7, r1)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            r0.execute(r8)
        L93:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzh(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            if (r3 != 0) goto Lb
            com.google.android.gms.internal.ads.zzhff r3 = r2.zzd     // Catch: java.lang.Throwable -> L12
            r3.zzd()     // Catch: java.lang.Throwable -> L12
            goto L10
        Lb:
            com.google.android.gms.internal.ads.zzhff r1 = r2.zzd     // Catch: java.lang.Throwable -> L12
            r1.zze(r3)     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final boolean zzi() {
            r1 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzbyh r0 = r1.zzi
            boolean r0 = r0.zzc
            if (r0 == 0) goto L12
            boolean r0 = r1.zzl
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
