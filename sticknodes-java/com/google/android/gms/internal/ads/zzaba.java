package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaba {
    public static void zza(android.view.Surface r1, float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            r0 = 0
            goto L8
        L7:
            r0 = 1
        L8:
            r1.setFrameRate(r2, r0)     // Catch: java.lang.IllegalStateException -> Lc
            return
        Lc:
            r1 = move-exception
            java.lang.String r2 = "VideoFrameReleaseHelper"
            java.lang.String r0 = "Failed to call Surface.setFrameRate"
            com.google.android.gms.internal.ads.zzea.zzd(r2, r0, r1)
            return
    }
}
