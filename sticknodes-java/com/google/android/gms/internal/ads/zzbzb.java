package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbzb {
    static android.net.Uri zza(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "&adurl"
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto Lf
            java.lang.String r0 = "?adurl"
            int r0 = r3.indexOf(r0)
        Lf:
            if (r0 == r1) goto L3d
            int r0 = r0 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r0)
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "&"
            r1.append(r4)
            java.lang.String r3 = r3.substring(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            return r3
        L3d:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r5)
            android.net.Uri r3 = r3.build()
            return r3
    }

    public static java.lang.String zzb(android.net.Uri r5, android.content.Context r6, java.util.Map r7) {
            com.google.android.gms.internal.ads.zzbyz r0 = com.google.android.gms.ads.internal.zzu.zzn()
            boolean r0 = r0.zzp(r6)
            if (r0 != 0) goto Lf
            java.lang.String r5 = r5.toString()
            return r5
        Lf:
            com.google.android.gms.internal.ads.zzbyz r0 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.String r0 = r0.zza(r6)
            if (r0 != 0) goto L1e
            java.lang.String r5 = r5.toString()
            return r5
        L1e:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzam
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r5.toString()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzal
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r4 = "_ac"
            if (r3 == 0) goto L5e
            boolean r3 = r2.contains(r1)
            if (r3 == 0) goto L5e
            com.google.android.gms.internal.ads.zzbyz r5 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.Object r7 = r7.get(r4)
            java.util.Map r7 = (java.util.Map) r7
            r5.zzj(r6, r0, r7)
            java.lang.String r5 = zzd(r2, r6)
            java.lang.String r2 = r5.replace(r1, r0)
            goto L97
        L5e:
            java.lang.String r1 = "fbs_aeid"
            java.lang.String r5 = r5.getQueryParameter(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L97
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzak
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r3.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L7d
            goto L97
        L7d:
            java.lang.String r5 = zzd(r2, r6)
            android.net.Uri r5 = zza(r5, r1, r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.Object r7 = r7.get(r4)
            java.util.Map r7 = (java.util.Map) r7
            r1.zzj(r6, r0, r7)
            return r5
        L97:
            return r2
    }

    public static java.lang.String zzc(java.lang.String r5, android.content.Context r6, boolean r7, java.util.Map r8) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzat
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            if (r7 == 0) goto Lf9
        L14:
            com.google.android.gms.internal.ads.zzbyz r7 = com.google.android.gms.ads.internal.zzu.zzn()
            boolean r7 = r7.zzp(r6)
            if (r7 == 0) goto Lf9
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L26
            goto Lf9
        L26:
            com.google.android.gms.internal.ads.zzbyz r7 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.String r7 = r7.zza(r6)
            if (r7 == 0) goto Lf9
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzam
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzal
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "_ai"
            java.lang.String r3 = "_ac"
            if (r1 == 0) goto L98
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L98
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            boolean r1 = r1.zzi(r5)
            if (r1 == 0) goto L78
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.Object r8 = r8.get(r3)
            java.util.Map r8 = (java.util.Map) r8
            r1.zzj(r6, r7, r8)
            java.lang.String r5 = zzd(r5, r6)
            java.lang.String r5 = r5.replace(r0, r7)
            return r5
        L78:
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            boolean r1 = r1.zzj(r5)
            if (r1 == 0) goto Lf9
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.Object r8 = r8.get(r2)
            java.util.Map r8 = (java.util.Map) r8
            r1.zzk(r6, r7, r8)
            java.lang.String r5 = zzd(r5, r6)
            java.lang.String r5 = r5.replace(r0, r7)
            return r5
        L98:
            java.lang.String r0 = "fbs_aeid"
            boolean r1 = r5.contains(r0)
            if (r1 != 0) goto Lf9
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzak
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r4.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lf9
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            boolean r1 = r1.zzi(r5)
            if (r1 == 0) goto Ld6
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.Object r8 = r8.get(r3)
            java.util.Map r8 = (java.util.Map) r8
            r1.zzj(r6, r7, r8)
            java.lang.String r5 = zzd(r5, r6)
            android.net.Uri r5 = zza(r5, r0, r7)
            java.lang.String r5 = r5.toString()
            return r5
        Ld6:
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            boolean r1 = r1.zzj(r5)
            if (r1 == 0) goto Lf9
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.Object r8 = r8.get(r2)
            java.util.Map r8 = (java.util.Map) r8
            r1.zzk(r6, r7, r8)
            java.lang.String r5 = zzd(r5, r6)
            android.net.Uri r5 = zza(r5, r0, r7)
            java.lang.String r5 = r5.toString()
        Lf9:
            return r5
    }

    private static java.lang.String zzd(java.lang.String r3, android.content.Context r4) {
            com.google.android.gms.internal.ads.zzbyz r0 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.String r0 = r0.zzd(r4)
            com.google.android.gms.internal.ads.zzbyz r1 = com.google.android.gms.ads.internal.zzu.zzn()
            java.lang.String r4 = r1.zzb(r4)
            java.lang.String r1 = "gmp_app_id"
            boolean r2 = r3.contains(r1)
            if (r2 != 0) goto L26
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L26
            android.net.Uri r3 = zza(r3, r1, r0)
            java.lang.String r3 = r3.toString()
        L26:
            java.lang.String r0 = "fbs_aiid"
            boolean r1 = r3.contains(r0)
            if (r1 != 0) goto L3c
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L3c
            android.net.Uri r3 = zza(r3, r0, r4)
            java.lang.String r3 = r3.toString()
        L3c:
            return r3
    }
}
