package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepi implements com.google.android.gms.internal.ads.zzexg {
    final com.google.android.gms.internal.ads.zzfhc zza;
    private final long zzb;

    public zzepi(com.google.android.gms.internal.ads.zzfhc r2, long r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "the targeting must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r15) {
            r14 = this;
            android.os.Bundle r15 = (android.os.Bundle) r15
            com.google.android.gms.internal.ads.zzfhc r0 = r14.zza
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            int r1 = r0.zzw
            java.lang.String r2 = "http_timeout_millis"
            r15.putInt(r2, r1)
            com.google.android.gms.internal.ads.zzfhc r1 = r14.zza
            java.lang.String r1 = r1.zzf
            java.lang.String r2 = "slotname"
            r15.putString(r2, r1)
            com.google.android.gms.internal.ads.zzfhc r1 = r14.zza
            com.google.android.gms.internal.ads.zzfgp r1 = r1.zzo
            int r1 = r1.zza
            if (r1 == 0) goto L158
            r2 = -1
            int r1 = r1 + r2
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L27
            goto L32
        L27:
            java.lang.String r1 = "is_rewarded_interstitial"
            r15.putBoolean(r1, r4)
            goto L32
        L2d:
            java.lang.String r1 = "is_new_rewarded"
            r15.putBoolean(r1, r4)
        L32:
            long r5 = r14.zzb
            java.lang.String r1 = "start_signals_timestamp"
            r15.putLong(r1, r5)
            boolean r1 = r0.zzb()
            java.lang.String r5 = "is_sdk_preload"
            com.google.android.gms.internal.ads.zzfhq.zzg(r15, r5, r4, r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = "yyyyMMdd"
            r1.<init>(r6, r5)
            long r5 = r0.zzb
            java.util.Date r7 = new java.util.Date
            r7.<init>(r5)
            java.lang.String r1 = r1.format(r7)
            long r5 = r0.zzb
            r7 = -1
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L61
            r5 = 1
            goto L62
        L61:
            r5 = 0
        L62:
            java.lang.String r6 = "cust_age"
            com.google.android.gms.internal.ads.zzfhq.zzf(r15, r6, r1, r5)
            android.os.Bundle r1 = r0.zzc
            java.lang.String r5 = "extras"
            com.google.android.gms.internal.ads.zzfhq.zzb(r15, r5, r1)
            int r1 = r0.zzd
            if (r1 == r2) goto L74
            r5 = 1
            goto L75
        L74:
            r5 = 0
        L75:
            java.lang.String r6 = "cust_gender"
            com.google.android.gms.internal.ads.zzfhq.zze(r15, r6, r1, r5)
            java.util.List r1 = r0.zze
            java.lang.String r5 = "kw"
            com.google.android.gms.internal.ads.zzfhq.zzd(r15, r5, r1)
            int r1 = r0.zzg
            if (r1 == r2) goto L87
            r5 = 1
            goto L88
        L87:
            r5 = 0
        L88:
            java.lang.String r6 = "tag_for_child_directed_treatment"
            com.google.android.gms.internal.ads.zzfhq.zze(r15, r6, r1, r5)
            boolean r1 = r0.zzf
            if (r1 == 0) goto L96
            java.lang.String r1 = "test_request"
            r15.putBoolean(r1, r4)
        L96:
            int r1 = r0.zzy
            java.lang.String r5 = "ppt_p13n"
            r15.putInt(r5, r1)
            int r1 = r0.zza
            if (r1 < r3) goto La7
            boolean r1 = r0.zzh
            if (r1 == 0) goto La7
            r1 = 1
            goto La8
        La7:
            r1 = 0
        La8:
            java.lang.String r5 = "d_imp_hdr"
            com.google.android.gms.internal.ads.zzfhq.zze(r15, r5, r4, r1)
            java.lang.String r1 = r0.zzi
            int r5 = r0.zza
            if (r5 < r3) goto Lbb
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto Lbb
            r3 = 1
            goto Lbc
        Lbb:
            r3 = 0
        Lbc:
            java.lang.String r5 = "ppid"
            com.google.android.gms.internal.ads.zzfhq.zzf(r15, r5, r1, r3)
            android.location.Location r1 = r0.zzk
            if (r1 == 0) goto L106
            float r3 = r1.getAccuracy()
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r5
            long r5 = r1.getTime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            double r7 = r1.getLatitude()
            r10 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r7 = r7 * r10
            double r12 = r1.getLongitude()
            double r12 = r12 * r10
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r10 = "radius"
            r1.putFloat(r10, r3)
            long r7 = (long) r7
            java.lang.String r3 = "lat"
            r1.putLong(r3, r7)
            long r7 = (long) r12
            java.lang.String r3 = "long"
            r1.putLong(r3, r7)
            java.lang.String r3 = "time"
            r1.putLong(r3, r5)
            java.lang.String r3 = "uule"
            r15.putBundle(r3, r1)
        L106:
            java.lang.String r1 = r0.zzl
            java.lang.String r3 = "url"
            com.google.android.gms.internal.ads.zzfhq.zzc(r15, r3, r1)
            java.util.List r1 = r0.zzv
            java.lang.String r3 = "neighboring_content_urls"
            com.google.android.gms.internal.ads.zzfhq.zzd(r15, r3, r1)
            android.os.Bundle r1 = r0.zzn
            java.lang.String r3 = "custom_targeting"
            com.google.android.gms.internal.ads.zzfhq.zzb(r15, r3, r1)
            java.util.List r1 = r0.zzo
            java.lang.String r3 = "category_exclusions"
            com.google.android.gms.internal.ads.zzfhq.zzd(r15, r3, r1)
            java.lang.String r1 = r0.zzp
            java.lang.String r3 = "request_agent"
            com.google.android.gms.internal.ads.zzfhq.zzc(r15, r3, r1)
            java.lang.String r1 = r0.zzq
            java.lang.String r3 = "request_pkg"
            com.google.android.gms.internal.ads.zzfhq.zzc(r15, r3, r1)
            boolean r1 = r0.zzr
            int r3 = r0.zza
            r5 = 7
            if (r3 < r5) goto L139
            r3 = 1
            goto L13a
        L139:
            r3 = 0
        L13a:
            java.lang.String r5 = "is_designed_for_families"
            com.google.android.gms.internal.ads.zzfhq.zzg(r15, r5, r1, r3)
            int r1 = r0.zza
            r3 = 8
            if (r1 < r3) goto L157
            int r1 = r0.zzt
            if (r1 == r2) goto L14a
            goto L14b
        L14a:
            r4 = 0
        L14b:
            java.lang.String r2 = "tag_for_under_age_of_consent"
            com.google.android.gms.internal.ads.zzfhq.zze(r15, r2, r1, r4)
            java.lang.String r0 = r0.zzu
            java.lang.String r1 = "max_ad_content_rating"
            com.google.android.gms.internal.ads.zzfhq.zzc(r15, r1, r0)
        L157:
            return
        L158:
            r15 = 0
            throw r15
    }
}
