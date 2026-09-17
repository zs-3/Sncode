package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzapj {
    public static long zza(java.nio.ByteBuffer r2) {
            zzg(r2)
            int r0 = r2.position()
            int r0 = r0 + 16
            long r0 = zze(r2, r0)
            return r0
    }

    public static long zzb(java.nio.ByteBuffer r2) {
            zzg(r2)
            int r0 = r2.position()
            int r0 = r0 + 12
            long r0 = zze(r2, r0)
            return r0
    }

    static android.util.Pair zzc(java.io.RandomAccessFile r5) throws java.io.IOException {
            long r0 = r5.length()
            r2 = 22
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r5 = 0
            return r5
        Lc:
            r0 = 0
            android.util.Pair r0 = zzf(r5, r0)
            if (r0 == 0) goto L14
            return r0
        L14:
            r0 = 65535(0xffff, float:9.1834E-41)
            android.util.Pair r5 = zzf(r5, r0)
            return r5
    }

    public static void zzd(java.nio.ByteBuffer r4, long r5) {
            zzg(r4)
            int r0 = r4.position()
            int r0 = r0 + 16
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L22
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L22
            int r1 = r4.position()
            int r1 = r1 + r0
            int r6 = (int) r5
            r4.putInt(r1, r6)
            return
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "uint32 value of out range: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private static long zze(java.nio.ByteBuffer r2, int r3) {
            int r2 = r2.getInt(r3)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    private static android.util.Pair zzf(java.io.RandomAccessFile r8, int r9) throws java.io.IOException {
            long r0 = r8.length()
            r2 = 22
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            goto L82
        Lc:
            long r2 = (long) r9
            r4 = -22
            long r4 = r4 + r0
            long r2 = java.lang.Math.min(r2, r4)
            int r9 = (int) r2
            r2 = 22
            int r9 = r9 + r2
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r9.order(r3)
            int r3 = r9.capacity()
            long r3 = (long) r3
            long r0 = r0 - r3
            r8.seek(r0)
            byte[] r3 = r9.array()
            int r4 = r9.arrayOffset()
            int r5 = r9.capacity()
            r8.readFully(r3, r4, r5)
            zzg(r9)
            int r8 = r9.capacity()
            r3 = -1
            if (r8 >= r2) goto L45
        L43:
            r5 = -1
            goto L69
        L45:
            int r8 = r8 + (-22)
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = java.lang.Math.min(r8, r2)
            r4 = 0
        L4f:
            if (r4 >= r2) goto L43
            int r5 = r8 - r4
            int r6 = r9.getInt(r5)
            r7 = 101010256(0x6054b50, float:2.506985E-35)
            if (r6 != r7) goto L66
            int r6 = r5 + 20
            short r6 = r9.getShort(r6)
            char r6 = (char) r6
            if (r6 != r4) goto L66
            goto L69
        L66:
            int r4 = r4 + 1
            goto L4f
        L69:
            if (r5 == r3) goto L82
            r9.position(r5)
            java.nio.ByteBuffer r8 = r9.slice()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            r8.order(r9)
            long r2 = (long) r5
            long r0 = r0 + r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r8, r9)
            return r8
        L82:
            r8 = 0
            return r8
    }

    private static void zzg(java.nio.ByteBuffer r1) {
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r1 != r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ByteBuffer byte order must be little endian"
            r1.<init>(r0)
            throw r1
    }
}
