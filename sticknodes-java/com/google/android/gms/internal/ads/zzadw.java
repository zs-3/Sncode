package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadw {
    public static int zza(byte[] r2) {
            r0 = 11
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 10
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = r2 | r0
            return r2
    }

    public static int zzb(java.nio.ByteBuffer r6) {
            r0 = 5
            byte r0 = r6.get(r0)
            r0 = r0 & 2
            r1 = 0
            if (r0 != 0) goto Lc
            r4 = 0
            goto L38
        Lc:
            r0 = 26
            byte r0 = r6.get(r0)
            r2 = 28
            r3 = 0
            r4 = 28
        L17:
            if (r3 >= r0) goto L23
            int r5 = r3 + 27
            byte r5 = r6.get(r5)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L17
        L23:
            int r0 = r4 + 26
            byte r0 = r6.get(r0)
            r3 = 0
        L2a:
            if (r3 >= r0) goto L37
            int r5 = r4 + 27
            int r5 = r5 + r3
            byte r5 = r6.get(r5)
            int r2 = r2 + r5
            int r3 = r3 + 1
            goto L2a
        L37:
            int r4 = r4 + r2
        L38:
            int r0 = r4 + 26
            byte r0 = r6.get(r0)
            int r0 = r0 + 27
            int r0 = r0 + r4
            byte r2 = r6.get(r0)
            int r3 = r6.limit()
            int r3 = r3 - r0
            r4 = 1
            if (r3 <= r4) goto L52
            int r0 = r0 + r4
            byte r1 = r6.get(r0)
        L52:
            long r0 = zzg(r2, r1)
            r2 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            int r6 = (int) r0
            return r6
    }

    public static int zzc(java.nio.ByteBuffer r4) {
            r0 = 0
            byte r1 = r4.get(r0)
            int r2 = r4.limit()
            r3 = 1
            if (r2 <= r3) goto L10
            byte r0 = r4.get(r3)
        L10:
            long r0 = zzg(r1, r0)
            r2 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            int r4 = (int) r0
            return r4
    }

    public static long zzd(byte[] r4) {
            r0 = 0
            r1 = r4[r0]
            int r2 = r4.length
            r3 = 1
            if (r2 <= r3) goto L9
            r0 = r4[r3]
        L9:
            long r0 = zzg(r1, r0)
            return r0
    }

    public static java.util.List zze(byte[] r4) {
            int r0 = zza(r4)
            long r0 = (long) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 3
            r2.<init>(r3)
            r2.add(r4)
            long r0 = zzh(r0)
            byte[] r4 = zzi(r0)
            r2.add(r4)
            r0 = 3840(0xf00, double:1.897E-320)
            long r0 = zzh(r0)
            byte[] r4 = zzi(r0)
            r2.add(r4)
            return r2
    }

    public static boolean zzf(long r2, long r4) {
            r0 = 3840(0xf00, double:1.897E-320)
            long r0 = zzh(r0)
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private static long zzg(byte r5, byte r6) {
            r5 = r5 & 255(0xff, float:3.57E-43)
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto Lf
            if (r0 == r2) goto L10
            if (r0 == r1) goto L10
            r1 = r6 & 63
            goto L10
        Lf:
            r1 = 1
        L10:
            r6 = 3
            int r5 = r5 >> r6
            r0 = r5 & 3
            r3 = 16
            if (r5 < r3) goto L1c
            r5 = 2500(0x9c4, float:3.503E-42)
            int r5 = r5 << r0
            goto L2f
        L1c:
            r3 = 12
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r5 < r3) goto L27
            r5 = r0 & 1
            int r5 = r4 << r5
            goto L2f
        L27:
            if (r0 != r6) goto L2d
            r5 = 60000(0xea60, float:8.4078E-41)
            goto L2f
        L2d:
            int r5 = r4 << r0
        L2f:
            long r0 = (long) r1
            long r5 = (long) r5
            long r0 = r0 * r5
            return r0
    }

    private static long zzh(long r2) {
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 * r0
            r0 = 48000(0xbb80, double:2.3715E-319)
            long r2 = r2 / r0
            return r2
    }

    private static byte[] zzi(long r2) {
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.ByteBuffer r2 = r0.putLong(r2)
            byte[] r2 = r2.array()
            return r2
    }
}
