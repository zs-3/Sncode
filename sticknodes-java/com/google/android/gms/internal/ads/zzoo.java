package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzoo {
    public static int zza(int r3, int r4, com.google.android.gms.internal.ads.zzh r5) {
            r0 = 10
        L2:
            if (r0 <= 0) goto L30
            int r1 = com.google.android.gms.internal.ads.zzeu.zzh(r0)
            if (r1 != 0) goto Lb
            goto L2d
        Lb:
            android.media.AudioFormat$Builder r2 = new android.media.AudioFormat$Builder
            r2.<init>()
            android.media.AudioFormat$Builder r2 = r2.setEncoding(r3)
            android.media.AudioFormat$Builder r2 = r2.setSampleRate(r4)
            android.media.AudioFormat$Builder r1 = r2.setChannelMask(r1)
            android.media.AudioFormat r1 = r1.build()
            com.google.android.gms.internal.ads.zzf r2 = r5.zza()
            android.media.AudioAttributes r2 = r2.zza
            boolean r1 = android.media.AudioTrack.isDirectPlaybackSupported(r1, r2)
            if (r1 == 0) goto L2d
            return r0
        L2d:
            int r0 = r0 + (-1)
            goto L2
        L30:
            r3 = 0
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgax<java.lang.Integer> zzb(com.google.android.gms.internal.ads.zzh r5) {
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>()
            com.google.android.gms.internal.ads.zzgba r1 = com.google.android.gms.internal.ads.zzos.zzb
            com.google.android.gms.internal.ads.zzgbc r1 = r1.zzi()
            com.google.android.gms.internal.ads.zzgdd r1 = r1.zze()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = com.google.android.gms.internal.ads.zzeu.zzg(r2)
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            if (r4 < r3) goto Lf
            android.media.AudioFormat$Builder r3 = new android.media.AudioFormat$Builder
            r3.<init>()
            r4 = 12
            android.media.AudioFormat$Builder r3 = r3.setChannelMask(r4)
            android.media.AudioFormat$Builder r3 = r3.setEncoding(r2)
            r4 = 48000(0xbb80, float:6.7262E-41)
            android.media.AudioFormat$Builder r3 = r3.setSampleRate(r4)
            android.media.AudioFormat r3 = r3.build()
            com.google.android.gms.internal.ads.zzf r4 = r5.zza()
            android.media.AudioAttributes r4 = r4.zza
            boolean r3 = android.media.AudioTrack.isDirectPlaybackSupported(r3, r4)
            if (r3 == 0) goto Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.zzf(r2)
            goto Lf
        L55:
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.zzf(r5)
            com.google.android.gms.internal.ads.zzgax r5 = r0.zzi()
            return r5
    }
}
