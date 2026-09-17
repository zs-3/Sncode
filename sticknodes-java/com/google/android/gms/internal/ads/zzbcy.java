package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbcy {
    private final java.lang.String zza;
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final java.lang.String zzd;

    public zzbcy(android.content.Context r7, java.lang.String r8) {
            r6 = this;
            r6.<init>()
            r6.zzc = r7
            r6.zzd = r8
            com.google.android.gms.internal.ads.zzbeb r8 = com.google.android.gms.internal.ads.zzbel.zza
            java.lang.Object r8 = r8.zze()
            java.lang.String r8 = (java.lang.String) r8
            r6.zza = r8
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r6.zzb = r8
            java.lang.String r0 = "s"
            java.lang.String r1 = "gmob_sdk"
            r8.put(r0, r1)
            java.lang.String r0 = "v"
            java.lang.String r1 = "3"
            r8.put(r0, r1)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "os"
            r8.put(r1, r0)
            java.lang.String r0 = android.os.Build.VERSION.SDK
            java.lang.String r1 = "api_v"
            r8.put(r1, r0)
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzr()
            java.lang.String r1 = "device"
            r8.put(r1, r0)
            android.content.Context r0 = r7.getApplicationContext()
            if (r0 == 0) goto L4f
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            goto L53
        L4f:
            java.lang.String r0 = r7.getPackageName()
        L53:
            java.lang.String r1 = "app"
            r8.put(r1, r0)
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzE(r7)
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            r3 = 1
            if (r3 == r0) goto L68
            r0 = r1
            goto L69
        L68:
            r0 = r2
        L69:
            java.lang.String r4 = "is_lite_sdk"
            r8.put(r4, r0)
            com.google.android.gms.internal.ads.zzbwh r0 = com.google.android.gms.ads.internal.zzu.zzm()
            java.util.concurrent.Future r0 = r0.zzb(r7)
            java.lang.String r4 = "network_coarse"
            java.lang.Object r5 = r0.get()     // Catch: java.lang.Exception -> L99
            com.google.android.gms.internal.ads.zzbwe r5 = (com.google.android.gms.internal.ads.zzbwe) r5     // Catch: java.lang.Exception -> L99
            int r5 = r5.zzj     // Catch: java.lang.Exception -> L99
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Exception -> L99
            r8.put(r4, r5)     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = "network_fine"
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L99
            com.google.android.gms.internal.ads.zzbwe r0 = (com.google.android.gms.internal.ads.zzbwe) r0     // Catch: java.lang.Exception -> L99
            int r0 = r0.zzk     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch: java.lang.Exception -> L99
            r8.put(r4, r0)     // Catch: java.lang.Exception -> L99
            goto La3
        L99:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r4 = "CsiConfiguration.CsiConfiguration"
            r0.zzw(r8, r4)
        La3:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzkW
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r0.zza(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc7
            java.util.Map r8 = r6.zzb
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r7 = com.google.android.gms.ads.internal.util.zzt.zzB(r7)
            if (r3 == r7) goto Lc1
            goto Lc2
        Lc1:
            r1 = r2
        Lc2:
            java.lang.String r7 = "is_bstar"
            r8.put(r7, r1)
        Lc7:
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zziX
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r8.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L108
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzcp
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r8.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L108
            com.google.android.gms.internal.ads.zzcad r7 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r7 = r7.zzn()
            boolean r7 = com.google.android.gms.internal.ads.zzfyo.zzd(r7)
            if (r7 != 0) goto L108
            java.util.Map r7 = r6.zzb
            com.google.android.gms.internal.ads.zzcad r8 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r8 = r8.zzn()
            java.lang.String r0 = "plugin"
            r7.put(r0, r8)
        L108:
            return
    }

    final android.content.Context zza() {
            r1 = this;
            android.content.Context r0 = r1.zzc
            return r0
    }

    final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    final java.util.Map zzd() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            return r0
    }
}
