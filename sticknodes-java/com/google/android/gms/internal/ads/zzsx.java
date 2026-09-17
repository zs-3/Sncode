package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsx {
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
            java.util.List r3 = r3.getSupportedPerformancePoints()
            r0 = 0
            if (r3 == 0) goto La2
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto La2
        Lf:
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r7 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            r7.<init>(r4, r5, r6)
            int r3 = zzb(r3, r7)
            r4 = 1
            if (r3 != r4) goto La1
            java.lang.Boolean r5 = com.google.android.gms.internal.ads.zzsy.zzb()
            if (r5 != 0) goto La1
            int r5 = com.google.android.gms.internal.ads.zzeu.zza
            r6 = 35
            if (r5 < r6) goto L2a
        L28:
            r4 = 0
            goto L8f
        L2a:
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            r5.<init>()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            java.lang.String r6 = "video/avc"
            r5.zzZ(r6)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            com.google.android.gms.internal.ads.zzaf r5 = r5.zzaf()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            java.lang.String r6 = r5.zzn     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r6 == 0) goto L8f
            com.google.android.gms.internal.ads.zztg r6 = com.google.android.gms.internal.ads.zztg.zza     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            java.util.List r5 = com.google.android.gms.internal.ads.zzts.zzg(r6, r5, r0, r0)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            r6 = 0
        L43:
            int r7 = r5.size()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r6 >= r7) goto L8f
            java.lang.Object r7 = r5.get(r6)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            com.google.android.gms.internal.ads.zzsw r7 = (com.google.android.gms.internal.ads.zzsw) r7     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.zzd     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r5.get(r6)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            com.google.android.gms.internal.ads.zzsw r7 = (com.google.android.gms.internal.ads.zzsw) r7     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.zzd     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r5.get(r6)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            com.google.android.gms.internal.ads.zzsw r7 = (com.google.android.gms.internal.ads.zzsw) r7     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.zzd     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            java.util.List r7 = r7.getSupportedPerformancePoints()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r7 == 0) goto L8b
            boolean r1 = r7.isEmpty()     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r1 != 0) goto L8b
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            r6 = 1280(0x500, float:1.794E-42)
            r1 = 720(0x2d0, float:1.009E-42)
            r2 = 60
            r5.<init>(r6, r1, r2)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            int r5 = zzb(r7, r5)     // Catch: com.google.android.gms.internal.ads.zztm -> L8e
            if (r5 != r4) goto L28
            goto L8f
        L8b:
            int r6 = r6 + 1
            goto L43
        L8e:
        L8f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.internal.ads.zzsy.zzc(r4)
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zzsy.zzb()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La1
            return r0
        La1:
            return r3
        La2:
            return r0
    }

    private static int zzb(java.util.List r2, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint r3) {
            r0 = 0
        L1:
            int r1 = r2.size()
            if (r0 >= r1) goto L18
            java.lang.Object r1 = r2.get(r0)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r1
            boolean r1 = r1.covers(r3)
            if (r1 == 0) goto L15
            r2 = 2
            return r2
        L15:
            int r0 = r0 + 1
            goto L1
        L18:
            r2 = 1
            return r2
    }
}
