package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqe {
    public static com.google.android.gms.internal.ads.zzpd zza(android.media.AudioFormat r0, android.media.AudioAttributes r1, boolean r2) {
            boolean r0 = android.media.AudioManager.isOffloadedPlaybackSupported(r0, r1)
            if (r0 != 0) goto L9
            com.google.android.gms.internal.ads.zzpd r0 = com.google.android.gms.internal.ads.zzpd.zza
            return r0
        L9:
            com.google.android.gms.internal.ads.zzpb r0 = new com.google.android.gms.internal.ads.zzpb
            r0.<init>()
            r1 = 1
            r0.zza(r1)
            r0.zzc(r2)
            com.google.android.gms.internal.ads.zzpd r0 = r0.zzd()
            return r0
    }
}
