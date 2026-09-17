package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzexs implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final android.content.Context zzb;

    public zzexs(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    private static android.content.pm.ResolveInfo zzd(android.content.pm.PackageManager r2, java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r2.resolveActivity(r0, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 38
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzexr r0 = new com.google.android.gms.internal.ads.zzexr
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzexq zzc() throws java.lang.Exception {
            r25 = this;
            r0 = r25
            java.lang.String r1 = "com.google.unity.ads.UNITY_VERSION"
            android.content.Context r2 = r0.zzb
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r4 = zzd(r2, r4)
            java.lang.String r5 = "http://www.google.com"
            android.content.pm.ResolveInfo r5 = zzd(r2, r5)
            java.lang.String r9 = r3.getCountry()
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r10 = com.google.android.gms.ads.internal.util.client.zzf.zzs()
            android.content.Context r6 = r0.zzb
            boolean r11 = com.google.android.gms.common.util.DeviceProperties.isLatchsky(r6)
            boolean r12 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r6)
            java.lang.String r13 = r3.getLanguage()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 0
            r7 = 24
            if (r3 < r7) goto L5b
            android.os.LocaleList r3 = android.os.LocaleList.getDefault()
            r7 = 0
        L47:
            int r8 = r3.size()
            if (r7 >= r8) goto L5b
            java.util.Locale r8 = r3.get(r7)
            java.lang.String r8 = r8.getLanguage()
            r14.add(r8)
            int r7 = r7 + 1
            goto L47
        L5b:
            android.content.Context r3 = r0.zzb
            java.lang.String r7 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r7 = zzd(r2, r7)
            java.lang.String r8 = "."
            if (r7 != 0) goto L69
        L67:
            r15 = 0
            goto L91
        L69:
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            if (r7 != 0) goto L6e
            goto L67
        L6e:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r15 = r7.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r15, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r3 == 0) goto L67
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r7 = r7.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r15.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r15.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r15.append(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r15.append(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r3 = r15.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r15 = r3
        L91:
            android.content.Context r3 = r0.zzb
            r7 = 128(0x80, float:1.794E-43)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = "com.android.vending"
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r6, r7)     // Catch: java.lang.Exception -> Lb8
            if (r3 == 0) goto Lb8
            int r6 = r3.versionCode     // Catch: java.lang.Exception -> Lb8
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Exception -> Lb8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb8
            r7.<init>()     // Catch: java.lang.Exception -> Lb8
            r7.append(r6)     // Catch: java.lang.Exception -> Lb8
            r7.append(r8)     // Catch: java.lang.Exception -> Lb8
            r7.append(r3)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> Lb8
            goto Lb9
        Lb8:
            r3 = 0
        Lb9:
            android.content.Context r6 = r0.zzb
            java.lang.String r20 = android.os.Build.FINGERPRINT
            if (r2 != 0) goto Lc3
            r21 = r3
        Lc1:
            r2 = 0
            goto L110
        Lc3:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "http://www.example.com"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r21 = r3
            java.lang.String r3 = "android.intent.action.VIEW"
            r7.<init>(r3, r8)
            r3 = 0
            android.content.pm.ResolveInfo r8 = r2.resolveActivity(r7, r3)
            r3 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r2.queryIntentActivities(r7, r3)
            if (r2 == 0) goto Lc1
            if (r8 == 0) goto Lc1
            r3 = 0
        Le2:
            int r7 = r2.size()
            if (r3 >= r7) goto Lc1
            java.lang.Object r7 = r2.get(r3)
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            r19 = r2
            android.content.pm.ActivityInfo r2 = r8.activityInfo
            java.lang.String r2 = r2.name
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.name
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L10b
            android.content.pm.ActivityInfo r2 = r8.activityInfo
            java.lang.String r2 = r2.packageName
            java.lang.String r3 = com.google.android.gms.internal.ads.zzhjb.zza(r6)
            boolean r2 = r2.equals(r3)
            goto L110
        L10b:
            int r3 = r3 + 1
            r2 = r19
            goto Le2
        L110:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.os.StatFs r3 = new android.os.StatFs
            java.io.File r6 = android.os.Environment.getDataDirectory()
            java.lang.String r6 = r6.getAbsolutePath()
            r3.<init>(r6)
            long r6 = r3.getAvailableBytes()
            r22 = 1024(0x400, double:5.06E-321)
            long r22 = r6 / r22
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkX
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r6.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L147
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r3 = r0.zzb
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzB(r3)
            if (r3 == 0) goto L147
            r3 = 1
            goto L148
        L147:
            r3 = 0
        L148:
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzlb
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r8.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L17b
            android.content.Context r7 = r0.zzb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r8 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L179
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L179
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r6 = r8.getApplicationInfo(r7, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L179
            android.os.Bundle r6 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L179
            if (r6 == 0) goto L179
            boolean r7 = r6.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L179
            if (r7 == 0) goto L179
            java.lang.String r1 = r6.getString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L179
            goto L17d
        L179:
            r1 = 0
            goto L17d
        L17b:
            java.lang.String r1 = ""
        L17d:
            if (r5 == 0) goto L181
            r8 = 1
            goto L182
        L181:
            r8 = 0
        L182:
            if (r4 == 0) goto L186
            r7 = 1
            goto L187
        L186:
            r7 = 0
        L187:
            com.google.android.gms.internal.ads.zzexq r4 = new com.google.android.gms.internal.ads.zzexq
            r6 = r4
            java.lang.String r19 = android.os.Build.MODEL
            int r24 = android.os.Build.VERSION.SDK_INT
            r16 = r21
            r17 = r20
            r18 = r2
            r20 = r22
            r22 = r3
            r23 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24)
            return r4
    }
}
