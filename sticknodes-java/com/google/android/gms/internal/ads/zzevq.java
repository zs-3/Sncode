package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzevq implements com.google.android.gms.internal.ads.zzexh, com.google.android.gms.internal.ads.zzexg {
    private final android.content.pm.ApplicationInfo zza;
    private final android.content.pm.PackageInfo zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdty zzd;

    zzevq(android.content.pm.ApplicationInfo r1, android.content.pm.PackageInfo r2, android.content.Context r3, com.google.android.gms.internal.ads.zzdty r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 29
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r7) {
            r6 = this;
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.content.pm.ApplicationInfo r0 = r6.zza
            java.lang.String r0 = r0.packageName
            android.content.pm.PackageInfo r1 = r6.zzb
            r2 = 0
            if (r1 != 0) goto Ld
            r1 = r2
            goto L13
        Ld:
            int r1 = r1.versionCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L13:
            java.lang.String r3 = "pn"
            r7.putString(r3, r0)
            if (r1 == 0) goto L3e
            int r3 = r1.intValue()
            java.lang.String r4 = "vc"
            r7.putInt(r4, r3)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzcl
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r5.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3e
            com.google.android.gms.internal.ads.zzdty r3 = r6.zzd
            java.lang.String r1 = r1.toString()
            r3.zzc(r4, r1)
        L3e:
            android.content.pm.PackageInfo r1 = r6.zzb
            if (r1 != 0) goto L43
            goto L45
        L43:
            java.lang.String r2 = r1.versionName
        L45:
            if (r2 == 0) goto L65
            java.lang.String r1 = "vnm"
            r7.putString(r1, r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzcl
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzdty r1 = r6.zzd
            java.lang.String r3 = "vn"
            r1.zzc(r3, r2)
        L65:
            android.content.Context r1 = r6.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.content.pm.ApplicationInfo r2 = r6.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            java.lang.String r2 = r2.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            com.google.android.gms.internal.ads.zzfun r3 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            java.lang.CharSequence r1 = r1.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            java.lang.String r2 = "dl"
            r7.putString(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            goto L80
        L7f:
        L80:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto Lda
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzmp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lda
            android.content.Context r1 = r6.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            android.content.pm.InstallSourceInfo r0 = r1.getInstallSourceInfo(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            if (r0 != 0) goto La5
            goto Lda
        La5:
            java.lang.String r1 = r0.getInstallingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            if (r2 != 0) goto Lb5
            java.lang.String r2 = "ins_pn"
            r7.putString(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            goto Lba
        Lb5:
            java.lang.String r1 = "No installing package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
        Lba:
            java.lang.String r0 = r0.getInitiatingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            if (r1 != 0) goto Lca
            java.lang.String r1 = "ini_pn"
            r7.putString(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            return
        Lca:
            java.lang.String r7 = "No initiating package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld0
            return
        Ld0:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "PackageInfoSignalsource.compose"
            r0.zzw(r7, r1)
        Lda:
            return
    }
}
