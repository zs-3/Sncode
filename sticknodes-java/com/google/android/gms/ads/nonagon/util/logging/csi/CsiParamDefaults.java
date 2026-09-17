package com.google.android.gms.ads.nonagon.util.logging.csi;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class CsiParamDefaults {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public CsiParamDefaults(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.String r1 = r1.getPackageName()
            r0.zzb = r1
            java.lang.String r1 = r2.afmaVersion
            r0.zzc = r1
            return
    }

    public void set(java.util.Map<java.lang.String, java.lang.String> r7) {
            r6 = this;
            java.lang.String r0 = "s"
            java.lang.String r1 = "gmob_sdk"
            r7.put(r0, r1)
            java.lang.String r0 = "v"
            java.lang.String r1 = "3"
            r7.put(r0, r1)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "os"
            r7.put(r1, r0)
            java.lang.String r0 = android.os.Build.VERSION.SDK
            java.lang.String r1 = "api_v"
            r7.put(r1, r0)
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzr()
            java.lang.String r1 = "device"
            r7.put(r1, r0)
            java.lang.String r0 = r6.zzb
            java.lang.String r1 = "app"
            r7.put(r1, r0)
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r6.zza
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzE(r0)
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            r3 = 1
            if (r3 == r0) goto L41
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            java.lang.String r4 = "is_lite_sdk"
            r7.put(r4, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zza
            com.google.android.gms.internal.ads.zzbcn r0 = com.google.android.gms.ads.internal.client.zzbe.zza()
            java.util.List r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzgF
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L76
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r4 = r4.zzi()
            com.google.android.gms.internal.ads.zzbzx r4 = r4.zzh()
            java.util.List r4 = r4.zzd()
            r0.addAll(r4)
        L76:
            java.lang.String r4 = ","
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)
            java.lang.String r4 = "e"
            r7.put(r4, r0)
            java.lang.String r0 = r6.zzc
            java.lang.String r4 = "sdkVersion"
            r7.put(r4, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkW
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r4.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lac
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r6.zza
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzB(r0)
            if (r3 == r0) goto La6
            goto La7
        La6:
            r1 = r2
        La7:
            java.lang.String r0 = "is_bstar"
            r7.put(r0, r1)
        Lac:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le1
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcp
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le1
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = r0.zzn()
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfyo.zzc(r0)
            java.lang.String r1 = "plugin"
            r7.put(r1, r0)
        Le1:
            return
    }
}
