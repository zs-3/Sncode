package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerg implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.Integer zza;

    private zzerg(java.lang.Integer r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzerg zzb(com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L76
            com.google.android.gms.ads.internal.zzu.zzp()
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L62
            r2 = 30
            if (r1 < r2) goto L2b
            int r2 = android.os.ext.SdkExtensions.getExtensionVersion(r2)     // Catch: java.lang.Exception -> L62
            r3 = 3
            if (r2 <= r3) goto L2b
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r4)     // Catch: java.lang.Exception -> L62
            goto L6c
        L2b:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjJ     // Catch: java.lang.Exception -> L62
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L62
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L62
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L62
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L62
            if (r2 == 0) goto L6c
            int r4 = r4.clientJarVersion     // Catch: java.lang.Exception -> L62
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjI     // Catch: java.lang.Exception -> L62
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L62
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L62
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L62
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L62
            if (r4 < r2) goto L6c
            r4 = 31
            if (r1 < r4) goto L6c
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r4)     // Catch: java.lang.Exception -> L62
            r2 = 9
            if (r1 < r2) goto L6c
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r4)     // Catch: java.lang.Exception -> L62
            goto L6c
        L62:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdUtil.getAdServicesExtensionVersion"
            r1.zzw(r4, r2)
        L6c:
            com.google.android.gms.internal.ads.zzerg r4 = new com.google.android.gms.internal.ads.zzerg
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0)
            goto L7c
        L76:
            com.google.android.gms.internal.ads.zzerg r4 = new com.google.android.gms.internal.ads.zzerg
            r0 = 0
            r4.<init>(r0)
        L7c:
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.Integer r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r0 == 0) goto Lf
            int r0 = r0.intValue()
            java.lang.String r1 = "aos"
            r3.putInt(r1, r0)
        Lf:
            return
    }
}
