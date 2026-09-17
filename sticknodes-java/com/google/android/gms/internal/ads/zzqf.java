package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqf {
    public static com.google.android.gms.internal.ads.zzpd zza(android.media.AudioFormat r4, android.media.AudioAttributes r5, boolean r6) {
            int r4 = android.media.AudioManager.getPlaybackOffloadSupport(r4, r5)
            if (r4 != 0) goto L9
            com.google.android.gms.internal.ads.zzpd r4 = com.google.android.gms.internal.ads.zzpd.zza
            return r4
        L9:
            com.google.android.gms.internal.ads.zzpb r5 = new com.google.android.gms.internal.ads.zzpb
            r5.<init>()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 32
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L1a
            r0 = 2
            if (r4 != r0) goto L1a
            r3 = 1
        L1a:
            r5.zza(r2)
            r5.zzb(r3)
            r5.zzc(r6)
            com.google.android.gms.internal.ads.zzpd r4 = r5.zzd()
            return r4
    }
}
