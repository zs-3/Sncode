package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgnf {
    private static final int[] zza = null;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107} // fill-array
            int[] r0 = zze(r0)
            com.google.android.gms.internal.ads.zzgnf.zza = r0
            return
    }

    static void zza(int[] r2, int r3, int r4, int r5, int r6) {
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r1 = r2[r6]
            r0 = r0 ^ r1
            int r1 = r0 << 16
            int r0 = r0 >>> (-16)
            r0 = r0 | r1
            r2[r6] = r0
            r1 = r2[r5]
            int r1 = r1 + r0
            r2[r5] = r1
            r0 = r2[r4]
            r0 = r0 ^ r1
            int r1 = r0 << 12
            int r0 = r0 >>> (-12)
            r0 = r0 | r1
            r2[r4] = r0
            r1 = r2[r3]
            int r1 = r1 + r0
            r2[r3] = r1
            r3 = r2[r6]
            r3 = r3 ^ r1
            int r0 = r3 << 8
            int r3 = r3 >>> (-8)
            r3 = r3 | r0
            r2[r6] = r3
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            r3 = r2[r4]
            r3 = r3 ^ r6
            int r5 = r3 << 7
            int r3 = r3 >>> (-7)
            r3 = r3 | r5
            r2[r4] = r3
            return
    }

    static void zzb(int[] r3, int[] r4) {
            int[] r0 = com.google.android.gms.internal.ads.zzgnf.zza
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            int r0 = r0.length
            r1 = 8
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return
    }

    static void zzc(int[] r16) {
            r0 = r16
            r1 = 0
            r2 = 0
        L4:
            r3 = 10
            if (r2 >= r3) goto L3b
            r4 = 4
            r5 = 8
            r6 = 12
            zza(r0, r1, r4, r5, r6)
            r7 = 1
            r8 = 5
            r9 = 9
            r10 = 13
            zza(r0, r7, r8, r9, r10)
            r11 = 2
            r12 = 6
            r13 = 14
            zza(r0, r11, r12, r3, r13)
            r14 = 3
            r15 = 7
            r4 = 11
            r9 = 15
            zza(r0, r14, r15, r4, r9)
            zza(r0, r1, r8, r3, r9)
            zza(r0, r7, r12, r4, r6)
            zza(r0, r11, r15, r5, r10)
            r3 = 9
            r4 = 4
            zza(r0, r14, r4, r3, r13)
            int r2 = r2 + 1
            goto L4
        L3b:
            return
    }

    static int[] zzd(int[] r4, int[] r5) {
            r0 = 16
            int[] r0 = new int[r0]
            zzb(r0, r4)
            r4 = 0
            r4 = r5[r4]
            r1 = 12
            r0[r1] = r4
            r4 = 1
            r4 = r5[r4]
            r2 = 13
            r0[r2] = r4
            r4 = 2
            r4 = r5[r4]
            r3 = 14
            r0[r3] = r4
            r4 = 3
            r4 = r5[r4]
            r5 = 15
            r0[r5] = r4
            zzc(r0)
            r4 = r0[r1]
            r1 = 4
            r0[r1] = r4
            r4 = r0[r2]
            r1 = 5
            r0[r1] = r4
            r4 = r0[r3]
            r1 = 6
            r0[r1] = r4
            r4 = r0[r5]
            r5 = 7
            r0[r5] = r4
            r4 = 8
            int[] r4 = java.util.Arrays.copyOf(r0, r4)
            return r4
    }

    static int[] zze(byte[] r1) {
            int r0 = r1.length
            r0 = r0 & 3
            if (r0 != 0) goto L1d
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            int r0 = r1.remaining()
            int[] r0 = new int[r0]
            r1.get(r0)
            return r0
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid input length"
            r1.<init>(r0)
            throw r1
    }
}
