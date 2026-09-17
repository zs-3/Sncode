package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zza {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean zza(android.content.Context r2, android.content.Intent r3, com.google.android.gms.ads.internal.overlay.zzac r4, com.google.android.gms.ads.internal.overlay.zzaa r5, boolean r6) {
            if (r6 == 0) goto Lb
            android.net.Uri r3 = r3.getData()
            boolean r2 = zzc(r2, r3, r4, r5)
            return r2
        Lb:
            java.lang.String r6 = r3.toURI()     // Catch: android.content.ActivityNotFoundException -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L35
            r0.<init>()     // Catch: android.content.ActivityNotFoundException -> L35
            java.lang.String r1 = "Launching an intent: "
            r0.append(r1)     // Catch: android.content.ActivityNotFoundException -> L35
            r0.append(r6)     // Catch: android.content.ActivityNotFoundException -> L35
            java.lang.String r6 = r0.toString()     // Catch: android.content.ActivityNotFoundException -> L35
            com.google.android.gms.ads.internal.util.zze.zza(r6)     // Catch: android.content.ActivityNotFoundException -> L35
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.content.ActivityNotFoundException -> L35
            com.google.android.gms.ads.internal.util.zzt.zzT(r2, r3)     // Catch: android.content.ActivityNotFoundException -> L35
            if (r4 == 0) goto L2e
            r4.zzg()     // Catch: android.content.ActivityNotFoundException -> L35
        L2e:
            r2 = 1
            if (r5 == 0) goto L34
            r5.zza(r2)     // Catch: android.content.ActivityNotFoundException -> L35
        L34:
            return r2
        L35:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            r2 = 0
            if (r5 == 0) goto L43
            r5.zza(r2)
        L43:
            return r2
    }

    public static final boolean zzb(android.content.Context r6, com.google.android.gms.ads.internal.overlay.zzc r7, com.google.android.gms.ads.internal.overlay.zzac r8, com.google.android.gms.ads.internal.overlay.zzaa r9) {
            r0 = 0
            if (r7 != 0) goto L9
            java.lang.String r6 = "No intent data for launcher overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return r0
        L9:
            com.google.android.gms.internal.ads.zzbcv.zza(r6)
            android.content.Intent r1 = r7.zzh
            if (r1 == 0) goto L17
            boolean r7 = r7.zzj
            boolean r6 = zza(r6, r1, r8, r9, r7)
            return r6
        L17:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = r7.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2a
            java.lang.String r6 = "Open GMSG did not contain a URL."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return r0
        L2a:
            java.lang.String r2 = r7.zzc
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3e
            java.lang.String r2 = r7.zzb
            java.lang.String r3 = r7.zzc
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setDataAndType(r2, r3)
            goto L47
        L3e:
            java.lang.String r2 = r7.zzb
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setData(r2)
        L47:
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)
            java.lang.String r2 = r7.zzd
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L59
            java.lang.String r2 = r7.zzd
            r1.setPackage(r2)
        L59:
            java.lang.String r2 = r7.zze
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L85
            java.lang.String r2 = r7.zze
            java.lang.String r4 = "/"
            r5 = 2
            java.lang.String[] r2 = r2.split(r4, r5)
            int r4 = r2.length
            if (r4 >= r5) goto L7e
            java.lang.String r6 = r7.zze
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Could not parse component name from open GMSG: "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return r0
        L7e:
            r4 = r2[r0]
            r2 = r2[r3]
            r1.setClassName(r4, r2)
        L85:
            java.lang.String r2 = r7.zzf
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L9a
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L92
            goto L97
        L92:
            java.lang.String r2 = "Could not parse intent flags."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
        L97:
            r1.addFlags(r0)
        L9a:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzev
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb7
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            java.lang.String r0 = "android.support.customtabs.extra.user_opt_out"
            r1.putExtra(r0, r3)
            goto Lcf
        Lb7:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeu
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcf
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzo(r6, r1)
        Lcf:
            boolean r7 = r7.zzj
            boolean r6 = zza(r6, r1, r8, r9, r7)
            return r6
    }

    private static final boolean zzc(android.content.Context r1, android.net.Uri r2, com.google.android.gms.ads.internal.overlay.zzac r3, com.google.android.gms.ads.internal.overlay.zzaa r4) {
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.content.ActivityNotFoundException -> Le
            int r1 = r0.zzm(r1, r2)     // Catch: android.content.ActivityNotFoundException -> Le
            if (r3 == 0) goto L17
            r3.zzg()     // Catch: android.content.ActivityNotFoundException -> Le
            goto L17
        Le:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            r1 = 6
        L17:
            if (r4 == 0) goto L1c
            r4.zzb(r1)
        L1c:
            r2 = 5
            if (r1 == r2) goto L21
            r1 = 0
            return r1
        L21:
            r1 = 1
            return r1
    }
}
