package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpz {
    private final com.google.android.gms.internal.ads.zzdud zza;
    private final com.google.android.gms.internal.ads.zzfgt zzb;

    zzcpz(com.google.android.gms.internal.ads.zzdud r1, com.google.android.gms.internal.ads.zzfgt r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final void zza(long r4, int r6) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r3.zza
            com.google.android.gms.internal.ads.zzduc r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfgt r1 = r3.zzb
            com.google.android.gms.internal.ads.zzfgs r1 = r1.zzb
            com.google.android.gms.internal.ads.zzfgk r1 = r1.zzb
            r0.zzd(r1)
            java.lang.String r1 = "action"
            java.lang.String r2 = "ad_closed"
            r0.zzb(r1, r2)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "show_time"
            r0.zzb(r5, r4)
            java.lang.String r4 = "ad_format"
            java.lang.String r5 = "app_open_ad"
            r0.zzb(r4, r5)
            int r6 = r6 + (-1)
            if (r6 == 0) goto L45
            r4 = 1
            if (r6 == r4) goto L42
            r4 = 2
            if (r6 == r4) goto L3f
            r4 = 3
            if (r6 == r4) goto L3c
            r4 = 4
            if (r6 == r4) goto L39
            java.lang.String r4 = "u"
            goto L47
        L39:
            java.lang.String r4 = "ac"
            goto L47
        L3c:
            java.lang.String r4 = "cb"
            goto L47
        L3f:
            java.lang.String r4 = "cc"
            goto L47
        L42:
            java.lang.String r4 = "bb"
            goto L47
        L45:
            java.lang.String r4 = "h"
        L47:
            java.lang.String r5 = "acr"
            r0.zzb(r5, r4)
            r0.zzf()
            return
    }
}
