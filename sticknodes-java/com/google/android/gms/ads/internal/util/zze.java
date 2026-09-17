package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzm {
    public static void zza(java.lang.String r4) {
            boolean r0 = zzc()
            if (r0 == 0) goto L3b
            java.lang.String r0 = "Ads"
            if (r4 == 0) goto L38
            int r1 = r4.length()
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r2) goto L13
            goto L38
        L13:
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.ads.internal.util.client.zzm.zza
            java.lang.Iterable r4 = r1.zzc(r4)
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
            r2 = 0
        L1f:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L31
            android.util.Log.v(r0, r3)
            goto L36
        L31:
            java.lang.String r1 = "Ads-cont"
            android.util.Log.v(r1, r3)
        L36:
            r1 = 0
            goto L1f
        L38:
            android.util.Log.v(r0, r4)
        L3b:
            return
    }

    public static void zzb(java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = zzc()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Ads"
            android.util.Log.v(r0, r1, r2)
        Lb:
            return
    }

    public static boolean zzc() {
            r0 = 2
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r0)
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbet.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }
}
