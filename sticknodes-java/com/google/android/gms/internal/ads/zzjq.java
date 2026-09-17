package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzjq {
    public static com.google.android.gms.internal.ads.zzom zza(android.content.Context r0, com.google.android.gms.internal.ads.zzjz r1, boolean r2, java.lang.String r3) {
            com.google.android.gms.internal.ads.zzoi r0 = com.google.android.gms.internal.ads.zzoi.zzb(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "ExoPlayerImpl"
            java.lang.String r1 = "MediaMetricsService unavailable."
            com.google.android.gms.internal.ads.zzea.zzf(r0, r1)
            com.google.android.gms.internal.ads.zzom r0 = new com.google.android.gms.internal.ads.zzom
            android.media.metrics.LogSessionId r1 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
            r0.<init>(r1, r3)
            return r0
        L15:
            if (r2 == 0) goto L1a
            r1.zzy(r0)
        L1a:
            com.google.android.gms.internal.ads.zzom r1 = new com.google.android.gms.internal.ads.zzom
            android.media.metrics.LogSessionId r0 = r0.zza()
            r1.<init>(r0, r3)
            return r1
    }
}
