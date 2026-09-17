package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcob implements com.google.android.gms.internal.ads.zzcnf {
    private final android.webkit.CookieManager zza;

    public zzcob(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.ads.internal.util.zzab r0 = com.google.android.gms.ads.internal.zzu.zzq()
            android.webkit.CookieManager r2 = r0.zza(r2)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r8) {
            r7 = this;
            android.webkit.CookieManager r0 = r7.zza
            if (r0 != 0) goto L6
            goto Lab
        L6:
            java.lang.String r0 = "clear"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L9d
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzaS
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r0.zza(r8)
            java.lang.String r8 = (java.lang.String) r8
            android.webkit.CookieManager r0 = r7.zza
            java.lang.String r0 = r0.getCookie(r8)
            if (r0 == 0) goto Lab
            r1 = 59
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzc(r1)
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.internal.ads.zzfym.zzb(r1)
            java.util.List r0 = r1.zze(r0)
            r1 = 0
            r2 = 0
        L34:
            int r3 = r0.size()
            if (r2 >= r3) goto Lab
            android.webkit.CookieManager r3 = r7.zza
            java.lang.Object r4 = r0.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 61
            com.google.android.gms.internal.ads.zzfxn r5 = com.google.android.gms.internal.ads.zzfxn.zzc(r5)
            com.google.android.gms.internal.ads.zzfym r5 = com.google.android.gms.internal.ads.zzfym.zzb(r5)
            java.lang.Iterable r4 = r5.zzc(r4)
            java.util.Iterator r4 = r4.iterator()
            java.util.Objects.requireNonNull(r4)
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaE
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            r3.setCookie(r8, r4)
            int r2 = r2 + 1
            goto L34
        L81:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "position (0) must be less than the number of elements that remained ("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L9d:
            java.lang.String r0 = "cookie"
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Lac
        Lab:
            return
        Lac:
            android.webkit.CookieManager r0 = r7.zza
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzaS
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.setCookie(r1, r8)
            return
    }
}
