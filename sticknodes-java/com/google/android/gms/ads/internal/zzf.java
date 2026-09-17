package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzf {
    private android.content.Context zza;
    private long zzb;

    public zzf() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzb = r0
            return
    }

    static final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.Long r5, com.google.android.gms.internal.ads.zzdud r6, com.google.android.gms.internal.ads.zzfmd r7, com.google.android.gms.internal.ads.zzflp r8, org.json.JSONObject r9) throws java.lang.Exception {
            java.lang.String r0 = "isSuccessful"
            r1 = 0
            boolean r0 = r9.optBoolean(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.String r1 = "appSettingsJson"
            java.lang.String r9 = r9.getString(r1)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()
            r1.zzv(r9)
            if (r5 == 0) goto L2e
            com.google.android.gms.common.util.Clock r9 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r9.elapsedRealtime()
            long r3 = r5.longValue()
            long r1 = r1 - r3
            java.lang.String r5 = "cld_s"
            zzf(r6, r5, r1)
        L2e:
            r8.zzg(r0)
            com.google.android.gms.internal.ads.zzflt r5 = r8.zzm()
            r7.zzb(r5)
            r5 = 0
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)
            return r5
    }

    static final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzdud r4, java.lang.Long r5) {
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            long r2 = r5.longValue()
            long r0 = r0 - r2
            java.lang.String r5 = "cld_r"
            zzf(r4, r5, r0)
            return
    }

    private static final void zzf(com.google.android.gms.internal.ads.zzdud r2, java.lang.String r3, long r4) {
            if (r2 == 0) goto L29
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzduc r2 = r2.zza()
            java.lang.String r0 = "action"
            java.lang.String r1 = "lat_init"
            r2.zzb(r0, r1)
            java.lang.String r4 = java.lang.Long.toString(r4)
            r2.zzb(r3, r4)
            r2.zzf()
        L29:
            return
    }

    public final void zza(android.content.Context r12, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r13, java.lang.String r14, java.lang.Runnable r15, com.google.android.gms.internal.ads.zzfmd r16, com.google.android.gms.internal.ads.zzdud r17, java.lang.Long r18) {
            r11 = this;
            r3 = 1
            r4 = 0
            r6 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r0.zzb(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    final void zzb(android.content.Context r14, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r15, boolean r16, com.google.android.gms.internal.ads.zzbzx r17, java.lang.String r18, java.lang.String r19, java.lang.Runnable r20, com.google.android.gms.internal.ads.zzfmd r21, com.google.android.gms.internal.ads.zzdud r22, java.lang.Long r23) {
            r13 = this;
            r1 = r13
            r0 = r14
            r2 = r15
            r3 = r20
            r4 = r21
            r5 = r23
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r6 = r6.elapsedRealtime()
            long r8 = r1.zzb
            long r6 = r6 - r8
            r8 = 5000(0x1388, double:2.4703E-320)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L20
            java.lang.String r0 = "Not retrying to fetch app settings"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L20:
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r6 = r6.elapsedRealtime()
            r1.zzb = r6
            if (r17 == 0) goto L5f
            java.lang.String r6 = r17.zzc()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L37
            goto L5f
        L37:
            long r6 = r17.zza()
            com.google.android.gms.common.util.Clock r8 = com.google.android.gms.ads.internal.zzu.zzB()
            long r8 = r8.currentTimeMillis()
            long r8 = r8 - r6
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzeb
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r7.zza(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 > 0) goto L5f
            boolean r6 = r17.zzi()
            if (r6 == 0) goto L5f
            return
        L5f:
            if (r0 != 0) goto L67
            java.lang.String r0 = "Context not provided to fetch application settings"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L67:
            boolean r6 = android.text.TextUtils.isEmpty(r18)
            if (r6 == 0) goto L7a
            boolean r6 = android.text.TextUtils.isEmpty(r19)
            if (r6 != 0) goto L74
            goto L7a
        L74:
            java.lang.String r0 = "App settings could not be fetched. Required parameters missing"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L7a:
            android.content.Context r6 = r14.getApplicationContext()
            if (r6 != 0) goto L81
            r6 = r0
        L81:
            r1.zza = r6
            r6 = 4
            com.google.android.gms.internal.ads.zzflp r6 = com.google.android.gms.internal.ads.zzflo.zza(r14, r6)
            r6.zzi()
            com.google.android.gms.internal.ads.zzboe r7 = com.google.android.gms.ads.internal.zzu.zzf()
            android.content.Context r8 = r1.zza
            com.google.android.gms.internal.ads.zzbon r7 = r7.zza(r8, r15, r4)
            com.google.android.gms.internal.ads.zzboh r8 = com.google.android.gms.internal.ads.zzbok.zza
            java.lang.String r9 = "google.afma.config.fetchAppSettings"
            com.google.android.gms.internal.ads.zzbod r7 = r7.zza(r9, r8, r8)
            r8 = 0
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L151
            r9.<init>()     // Catch: java.lang.Exception -> L151
            boolean r10 = android.text.TextUtils.isEmpty(r18)     // Catch: java.lang.Exception -> L151
            if (r10 != 0) goto Lb1
            java.lang.String r10 = "app_id"
            r11 = r18
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L151
            goto Lbe
        Lb1:
            boolean r10 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Exception -> L151
            if (r10 != 0) goto Lbe
            java.lang.String r10 = "ad_unit_id"
            r11 = r19
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L151
        Lbe:
            java.lang.String r10 = "is_init"
            r11 = r16
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L151
            java.lang.String r10 = "pn"
            java.lang.String r11 = r14.getPackageName()     // Catch: java.lang.Exception -> L151
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L151
            java.lang.String r10 = "experiment_ids"
            java.lang.String r11 = ","
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zza     // Catch: java.lang.Exception -> L151
            com.google.android.gms.internal.ads.zzbcn r12 = com.google.android.gms.ads.internal.client.zzbe.zza()     // Catch: java.lang.Exception -> L151
            java.util.List r12 = r12.zza()     // Catch: java.lang.Exception -> L151
            java.lang.String r11 = android.text.TextUtils.join(r11, r12)     // Catch: java.lang.Exception -> L151
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L151
            java.lang.String r10 = "js"
            java.lang.String r2 = r2.afmaVersion     // Catch: java.lang.Exception -> L151
            r9.put(r10, r2)     // Catch: java.lang.Exception -> L151
            android.content.Context r2 = r1.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            if (r2 == 0) goto L10b
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r14)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            java.lang.String r2 = r2.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            if (r0 == 0) goto L10b
            java.lang.String r2 = "version"
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            r9.put(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L106 java.lang.Exception -> L151
            goto L10b
        L106:
            java.lang.String r0 = "Error fetching PackageInfo."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Exception -> L151
        L10b:
            com.google.common.util.concurrent.ListenableFuture r0 = r7.zzb(r9)     // Catch: java.lang.Exception -> L151
            com.google.android.gms.ads.internal.zzd r2 = new com.google.android.gms.ads.internal.zzd     // Catch: java.lang.Exception -> L151
            r14 = r2
            r15 = r13
            r16 = r23
            r17 = r22
            r18 = r21
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L151
            com.google.android.gms.internal.ads.zzgfz r7 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Exception -> L151
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r2, r7)     // Catch: java.lang.Exception -> L151
            if (r3 == 0) goto L129
            r0.addListener(r3, r7)     // Catch: java.lang.Exception -> L151
        L129:
            if (r5 == 0) goto L135
            com.google.android.gms.ads.internal.zze r3 = new com.google.android.gms.ads.internal.zze     // Catch: java.lang.Exception -> L151
            r9 = r22
            r3.<init>(r13, r9, r5)     // Catch: java.lang.Exception -> L151
            r0.addListener(r3, r7)     // Catch: java.lang.Exception -> L151
        L135:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhp     // Catch: java.lang.Exception -> L151
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L151
            java.lang.Object r0 = r3.zza(r0)     // Catch: java.lang.Exception -> L151
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L151
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L151
            java.lang.String r3 = "ConfigLoader.maybeFetchNewAppSettings"
            if (r0 == 0) goto L14d
            com.google.android.gms.internal.ads.zzcaq.zzb(r2, r3)     // Catch: java.lang.Exception -> L151
            return
        L14d:
            com.google.android.gms.internal.ads.zzcaq.zza(r2, r3)     // Catch: java.lang.Exception -> L151
            return
        L151:
            r0 = move-exception
            java.lang.String r2 = "Error requesting application settings"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            r6.zzh(r0)
            r6.zzg(r8)
            com.google.android.gms.internal.ads.zzflt r0 = r6.zzm()
            r4.zzb(r0)
            return
    }

    public final void zzc(android.content.Context r12, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r13, java.lang.String r14, com.google.android.gms.internal.ads.zzbzx r15, com.google.android.gms.internal.ads.zzfmd r16) {
            r11 = this;
            if (r15 == 0) goto L7
            java.lang.String r0 = r15.zzb()
            goto L8
        L7:
            r0 = 0
        L8:
            r5 = r0
            r3 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r14
            r8 = r16
            r0.zzb(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }
}
