package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqm {
    public static void zza(android.media.AudioTrack r1, com.google.android.gms.internal.ads.zzom r2) {
            android.media.metrics.LogSessionId r2 = r2.zza()
            android.media.metrics.LogSessionId r0 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lf
            r1.setLogSessionId(r2)
        Lf:
            return
    }
}
