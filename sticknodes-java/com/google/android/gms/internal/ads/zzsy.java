package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsy {
    private static java.lang.Boolean zza;

    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto L16
            java.lang.Boolean r0 = com.google.android.gms.internal.ads.zzsy.zza
            if (r0 == 0) goto L11
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            goto L16
        L11:
            int r2 = com.google.android.gms.internal.ads.zzsx.zza(r2, r3, r4, r5)
            return r2
        L16:
            r2 = 0
            return r2
    }

    static /* bridge */ /* synthetic */ java.lang.Boolean zzb() {
            java.lang.Boolean r0 = com.google.android.gms.internal.ads.zzsy.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzc(java.lang.Boolean r0) {
            com.google.android.gms.internal.ads.zzsy.zza = r0
            return
    }
}
