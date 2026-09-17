package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeww implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final java.lang.String zzd;

    zzeww(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3, java.lang.String r4) {
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
            r0 = 35
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzewv r0 = new com.google.android.gms.internal.ads.zzewv
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzewx zzc() throws java.lang.Exception {
            r11 = this;
            com.google.android.gms.internal.ads.zzewx r9 = new com.google.android.gms.internal.ads.zzewx
            android.content.Context r0 = r11.zzb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            boolean r1 = r0.isCallerInstantApp()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r11.zzb
            boolean r2 = com.google.android.gms.ads.internal.util.zzt.zzE(r0)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r11.zzc
            java.lang.String r3 = r0.afmaVersion
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzt.zzF()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r11.zzb
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            if (r0 != 0) goto L2e
            r0 = 0
            r5 = 0
            goto L31
        L2e:
            int r0 = r0.targetSdkVersion
            r5 = r0
        L31:
            android.content.Context r0 = r11.zzb
            java.lang.String r8 = r11.zzd
            java.lang.String r6 = "com.google.android.gms.ads.dynamite"
            int r7 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r0, r6)
            int r10 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r0, r6)
            r0 = r9
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }
}
