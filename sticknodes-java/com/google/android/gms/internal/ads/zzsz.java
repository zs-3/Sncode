package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsz {
    public static void zza(com.google.android.gms.internal.ads.zzsq r1, com.google.android.gms.internal.ads.zzom r2) {
            android.media.metrics.LogSessionId r2 = r2.zza()
            android.media.metrics.LogSessionId r0 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L17
            android.media.MediaFormat r1 = r1.zzb
            java.lang.String r2 = r2.getStringId()
            java.lang.String r0 = "log-session-id"
            r1.setString(r0, r2)
        L17:
            return
    }
}
