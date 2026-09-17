package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class OpenSimplexNoise {
    private static byte[] gradients2D;
    private static byte[] gradients3D;
    private static byte[] gradients4D;
    private short[] perm;
    private short[] permGradIndex3D;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [5, 2, 2, 5, -5, 2, -2, 5, 5, -2, 2, -5, -5, -2, -2, -5} // fill-array
            org.fortheloss.framework.OpenSimplexNoise.gradients2D = r0
            r0 = 72
            byte[] r0 = new byte[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [-11, 4, 4, -4, 11, 4, -4, 4, 11, 11, 4, 4, 4, 11, 4, 4, 4, 11, -11, -4, 4, -4, -11, 4, -4, -4, 11, 11, -4, 4, 4, -11, 4, 4, -4, 11, -11, 4, -4, -4, 11, -4, -4, 4, -11, 11, 4, -4, 4, 11, -4, 4, 4, -11, -11, -4, -4, -4, -11, -4, -4, -4, -11, 11, -4, -4, 4, -11, -4, 4, -4, -11} // fill-array
            org.fortheloss.framework.OpenSimplexNoise.gradients3D = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [3, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, -3, 1, 1, 1, -1, 3, 1, 1, -1, 1, 3, 1, -1, 1, 1, 3, 3, -1, 1, 1, 1, -3, 1, 1, 1, -1, 3, 1, 1, -1, 1, 3, -3, -1, 1, 1, -1, -3, 1, 1, -1, -1, 3, 1, -1, -1, 1, 3, 3, 1, -1, 1, 1, 3, -1, 1, 1, 1, -3, 1, 1, 1, -1, 3, -3, 1, -1, 1, -1, 3, -1, 1, -1, 1, -3, 1, -1, 1, -1, 3, 3, -1, -1, 1, 1, -3, -1, 1, 1, -1, -3, 1, 1, -1, -1, 3, -3, -1, -1, 1, -1, -3, -1, 1, -1, -1, -3, 1, -1, -1, -1, 3, 3, 1, 1, -1, 1, 3, 1, -1, 1, 1, 3, -1, 1, 1, 1, -3, -3, 1, 1, -1, -1, 3, 1, -1, -1, 1, 3, -1, -1, 1, 1, -3, 3, -1, 1, -1, 1, -3, 1, -1, 1, -1, 3, -1, 1, -1, 1, -3, -3, -1, 1, -1, -1, -3, 1, -1, -1, -1, 3, -1, -1, -1, 1, -3, 3, 1, -1, -1, 1, 3, -1, -1, 1, 1, -3, -1, 1, 1, -1, -3, -3, 1, -1, -1, -1, 3, -1, -1, -1, 1, -3, -1, -1, 1, -1, -3, 3, -1, -1, -1, 1, -3, -1, -1, 1, -1, -3, -1, 1, -1, -1, -3, -3, -1, -1, -1, -1, -3, -1, -1, -1, -1, -3, -1, -1, -1, -1, -3} // fill-array
            org.fortheloss.framework.OpenSimplexNoise.gradients4D = r0
            return
    }

    public OpenSimplexNoise(long r12) {
            r11 = this;
            r11.<init>()
            r0 = 256(0x100, float:3.59E-43)
            short[] r1 = new short[r0]
            r11.perm = r1
            short[] r1 = new short[r0]
            r11.permGradIndex3D = r1
            short[] r1 = new short[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L18
            r1[r2] = r2
            int r2 = r2 + 1
            short r2 = (short) r2
            goto L10
        L18:
            r2 = 6364136223846793005(0x5851f42d4c957f2d, double:2.8296655102636685E117)
            long r12 = r12 * r2
            r4 = 1442695040888963407(0x14057b7ef767814f, double:3.190626645921225E-212)
            long r12 = r12 + r4
            long r12 = r12 * r2
            long r12 = r12 + r4
            long r12 = r12 * r2
            long r12 = r12 + r4
            r0 = 255(0xff, float:3.57E-43)
        L2d:
            if (r0 < 0) goto L59
            long r12 = r12 * r2
            long r12 = r12 + r4
            r6 = 31
            long r6 = r6 + r12
            int r8 = r0 + 1
            long r9 = (long) r8
            long r6 = r6 % r9
            int r7 = (int) r6
            if (r7 >= 0) goto L3d
            int r7 = r7 + r8
        L3d:
            short[] r6 = r11.perm
            short r8 = r1[r7]
            r6[r0] = r8
            short[] r8 = r11.permGradIndex3D
            short r6 = r6[r0]
            byte[] r9 = org.fortheloss.framework.OpenSimplexNoise.gradients3D
            int r9 = r9.length
            int r9 = r9 / 3
            int r6 = r6 % r9
            int r6 = r6 * 3
            short r6 = (short) r6
            r8[r0] = r6
            short r6 = r1[r0]
            r1[r7] = r6
            int r0 = r0 + (-1)
            goto L2d
        L59:
            return
    }

    private double extrapolate(int r3, int r4, double r5, double r7) {
            r2 = this;
            short[] r0 = r2.perm
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = r0[r3]
            int r3 = r3 + r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = r0[r3]
            r3 = r3 & 14
            byte[] r4 = org.fortheloss.framework.OpenSimplexNoise.gradients2D
            r0 = r4[r3]
            double r0 = (double) r0
            double r0 = r0 * r5
            int r3 = r3 + 1
            r3 = r4[r3]
            double r3 = (double) r3
            double r3 = r3 * r7
            double r0 = r0 + r3
            return r0
    }

    private static int fastFloor(double r4) {
            int r0 = (int) r4
            double r1 = (double) r0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L8
            int r0 = r0 + (-1)
        L8:
            return r0
    }

    public double eval(double r39, double r41) {
            r38 = this;
            double r0 = r39 + r41
            r2 = -4626590235883497021(0xbfcb0cb174df99c3, double:-0.211324865405187)
            double r0 = r0 * r2
            double r2 = r39 + r0
            double r0 = r41 + r0
            int r4 = fastFloor(r2)
            int r5 = fastFloor(r0)
            int r6 = r4 + r5
            double r6 = (double) r6
            r8 = 4600265347406272859(0x3fd76cf5d0b0995b, double:0.366025403784439)
            double r6 = r6 * r8
            double r10 = (double) r4
            double r12 = r10 + r6
            double r14 = (double) r5
            double r6 = r6 + r14
            double r2 = r2 - r10
            double r0 = r0 - r14
            double r10 = r2 + r0
            double r12 = r39 - r12
            double r6 = r41 - r6
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r12 - r14
            double r21 = r16 - r8
            r25 = 0
            double r18 = r6 - r25
            double r23 = r18 - r8
            double r18 = r21 * r21
            r27 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r27 - r18
            double r29 = r23 * r23
            double r18 = r18 - r29
            int r20 = (r18 > r25 ? 1 : (r18 == r25 ? 0 : -1))
            if (r20 <= 0) goto L59
            double r18 = r18 * r18
            double r29 = r18 * r18
            int r19 = r4 + 1
            int r20 = r5 + 0
            r18 = r38
            double r18 = r18.extrapolate(r19, r20, r21, r23)
            double r29 = r29 * r18
            double r29 = r29 + r25
            goto L5b
        L59:
            r29 = r25
        L5b:
            double r18 = r12 - r25
            double r34 = r18 - r8
            double r18 = r6 - r14
            double r36 = r18 - r8
            double r8 = r34 * r34
            double r8 = r27 - r8
            double r20 = r36 * r36
            double r8 = r8 - r20
            int r20 = (r8 > r25 ? 1 : (r8 == r25 ? 0 : -1))
            if (r20 <= 0) goto L81
            double r8 = r8 * r8
            double r8 = r8 * r8
            int r32 = r4 + 0
            int r33 = r5 + 1
            r31 = r38
            double r20 = r31.extrapolate(r32, r33, r34, r36)
            double r8 = r8 * r20
            double r29 = r29 + r8
        L81:
            r8 = 4604768947033643355(0x3fe76cf5d0b0995b, double:0.732050807568878)
            int r20 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r20 > 0) goto Lbb
            double r10 = r14 - r10
            int r20 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r20 > 0) goto L9e
            int r20 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r20 <= 0) goto L95
            goto L9e
        L95:
            int r0 = r4 + 1
            int r1 = r5 + 1
            double r16 = r16 - r8
            double r18 = r18 - r8
            goto Laf
        L9e:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto La9
            int r0 = r4 + 1
            int r1 = r5 + (-1)
            double r18 = r6 + r14
            goto Laf
        La9:
            int r0 = r4 + (-1)
            int r1 = r5 + 1
            double r16 = r12 + r14
        Laf:
            r15 = r0
            r2 = r5
            r5 = r6
            r19 = r18
            r17 = r16
            r16 = r1
            r1 = r4
            r3 = r12
            goto Lf4
        Lbb:
            double r10 = r27 - r10
            int r14 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r14 < 0) goto Lc9
            int r14 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r14 >= 0) goto Lc6
            goto Lc9
        Lc6:
            r0 = r4
            r1 = r5
            goto Le1
        Lc9:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto Ld7
            int r0 = r4 + 2
            int r1 = r5 + 0
            double r12 = r12 - r27
            double r12 = r12 - r8
            double r6 = r6 + r25
            goto Le0
        Ld7:
            int r0 = r4 + 0
            int r1 = r5 + 2
            double r12 = r12 + r25
            double r12 = r12 - r8
            double r6 = r6 - r27
        Le0:
            double r6 = r6 - r8
        Le1:
            int r4 = r4 + 1
            int r5 = r5 + 1
            double r2 = r16 - r8
            double r8 = r18 - r8
            r15 = r0
            r16 = r1
            r1 = r4
            r19 = r6
            r17 = r12
            r3 = r2
            r2 = r5
            r5 = r8
        Lf4:
            double r7 = r3 * r3
            double r7 = r27 - r7
            double r9 = r5 * r5
            double r7 = r7 - r9
            int r0 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r0 <= 0) goto L10d
            double r7 = r7 * r7
            double r7 = r7 * r7
            r0 = r38
            double r0 = r0.extrapolate(r1, r2, r3, r5)
            double r7 = r7 * r0
            double r29 = r29 + r7
        L10d:
            double r0 = r17 * r17
            double r27 = r27 - r0
            double r0 = r19 * r19
            double r27 = r27 - r0
            int r0 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r0 <= 0) goto L127
            double r27 = r27 * r27
            double r27 = r27 * r27
            r14 = r38
            double r0 = r14.extrapolate(r15, r16, r17, r19)
            double r27 = r27 * r0
            double r29 = r29 + r27
        L127:
            r0 = 4631811479262199808(0x4047800000000000, double:47.0)
            double r29 = r29 / r0
            return r29
    }
}
