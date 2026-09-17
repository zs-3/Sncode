package org.jcodec.codecs.h264.decode;

/* loaded from: classes2.dex */
public class CoeffTransformer {
    static int[][] dequantCoef;
    static int[][] dequantCoef8x8;
    private static int[] fieldScan4x4;
    private static int[] fieldScan8x8;
    static int[][] initDequantCoeff8x8;
    private static final int[][] quantCoeff = null;
    public static int[] zigzag4x4;
    public static int[] zigzag8x8;

    static {
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x0194: FILL_ARRAY_DATA , data: [0, 4, 1, 8, 12, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15} // fill-array
            org.jcodec.codecs.h264.decode.CoeffTransformer.fieldScan4x4 = r1
            r1 = 64
            int[] r2 = new int[r1]
            r2 = {x01b8: FILL_ARRAY_DATA , data: [0, 8, 16, 1, 9, 24, 32, 17, 2, 25, 40, 48, 56, 33, 10, 3, 18, 41, 49, 57, 26, 11, 4, 19, 34, 42, 50, 58, 27, 12, 5, 20, 35, 43, 51, 58, 28, 13, 6, 21, 36, 44, 52, 60, 29, 14, 22, 37, 45, 53, 61, 30, 7, 15, 38, 46, 54, 62, 23, 31, 39, 47, 55, 63} // fill-array
            org.jcodec.codecs.h264.decode.CoeffTransformer.fieldScan8x8 = r2
            int[] r2 = new int[r0]
            r2 = {x023c: FILL_ARRAY_DATA , data: [0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 13, 10, 7, 11, 14, 15} // fill-array
            org.jcodec.codecs.h264.decode.CoeffTransformer.zigzag4x4 = r2
            r2 = 6
            int[][] r3 = new int[r2][]
            int[] r4 = new int[r0]
            r4 = {x0260: FILL_ARRAY_DATA , data: [10, 13, 10, 13, 13, 16, 13, 16, 10, 13, 10, 13, 13, 16, 13, 16} // fill-array
            r5 = 0
            r3[r5] = r4
            int[] r4 = new int[r0]
            r4 = {x0284: FILL_ARRAY_DATA , data: [11, 14, 11, 14, 14, 18, 14, 18, 11, 14, 11, 14, 14, 18, 14, 18} // fill-array
            r6 = 1
            r3[r6] = r4
            int[] r4 = new int[r0]
            r4 = {x02a8: FILL_ARRAY_DATA , data: [13, 16, 13, 16, 16, 20, 16, 20, 13, 16, 13, 16, 16, 20, 16, 20} // fill-array
            r7 = 2
            r3[r7] = r4
            int[] r4 = new int[r0]
            r4 = {x02cc: FILL_ARRAY_DATA , data: [14, 18, 14, 18, 18, 23, 18, 23, 14, 18, 14, 18, 18, 23, 18, 23} // fill-array
            r8 = 3
            r3[r8] = r4
            int[] r4 = new int[r0]
            r4 = {x02f0: FILL_ARRAY_DATA , data: [16, 20, 16, 20, 20, 25, 20, 25, 16, 20, 16, 20, 20, 25, 20, 25} // fill-array
            r9 = 4
            r3[r9] = r4
            int[] r4 = new int[r0]
            r4 = {x0314: FILL_ARRAY_DATA , data: [18, 23, 18, 23, 23, 29, 23, 29, 18, 23, 18, 23, 23, 29, 23, 29} // fill-array
            r10 = 5
            r3[r10] = r4
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef = r3
            int[] r3 = new int[r7]
            r3 = {x0338: FILL_ARRAY_DATA , data: [6, 64} // fill-array
            java.lang.Class<int> r4 = int.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            int[][] r3 = (int[][]) r3
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8 = r3
            int[][] r3 = new int[r2][]
            int[] r4 = new int[r2]
            r4 = {x0340: FILL_ARRAY_DATA , data: [20, 18, 32, 19, 25, 24} // fill-array
            r3[r5] = r4
            int[] r4 = new int[r2]
            r4 = {x0350: FILL_ARRAY_DATA , data: [22, 19, 35, 21, 28, 26} // fill-array
            r3[r6] = r4
            int[] r4 = new int[r2]
            r4 = {x0360: FILL_ARRAY_DATA , data: [26, 23, 42, 24, 33, 31} // fill-array
            r3[r7] = r4
            int[] r4 = new int[r2]
            r4 = {x0370: FILL_ARRAY_DATA , data: [28, 25, 45, 26, 35, 33} // fill-array
            r3[r8] = r4
            int[] r4 = new int[r2]
            r4 = {x0380: FILL_ARRAY_DATA , data: [32, 28, 51, 30, 40, 38} // fill-array
            r3[r9] = r4
            int[] r4 = new int[r2]
            r4 = {x0390: FILL_ARRAY_DATA , data: [36, 32, 58, 34, 46, 43} // fill-array
            r3[r10] = r4
            org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8 = r3
            int[] r1 = new int[r1]
            r1 = {x03a0: FILL_ARRAY_DATA , data: [0, 1, 8, 16, 9, 2, 3, 10, 17, 24, 32, 25, 18, 11, 4, 5, 12, 19, 26, 33, 40, 48, 41, 34, 27, 20, 13, 6, 7, 14, 21, 28, 35, 42, 49, 56, 57, 50, 43, 36, 29, 22, 15, 23, 30, 37, 44, 51, 58, 59, 52, 45, 38, 31, 39, 46, 53, 60, 61, 54, 47, 55, 62, 63} // fill-array
            org.jcodec.codecs.h264.decode.CoeffTransformer.zigzag8x8 = r1
            int[][] r1 = new int[r2][]
            int[] r3 = new int[r0]
            r3 = {x0424: FILL_ARRAY_DATA , data: [13107, 8066, 13107, 8066, 8066, 5243, 8066, 5243, 13107, 8066, 13107, 8066, 8066, 5243, 8066, 5243} // fill-array
            r1[r5] = r3
            int[] r3 = new int[r0]
            r3 = {x0448: FILL_ARRAY_DATA , data: [11916, 7490, 11916, 7490, 7490, 4660, 7490, 4660, 11916, 7490, 11916, 7490, 7490, 4660, 7490, 4660} // fill-array
            r1[r6] = r3
            int[] r3 = new int[r0]
            r3 = {x046c: FILL_ARRAY_DATA , data: [10082, 6554, 10082, 6554, 6554, 4194, 6554, 4194, 10082, 6554, 10082, 6554, 6554, 4194, 6554, 4194} // fill-array
            r1[r7] = r3
            int[] r3 = new int[r0]
            r3 = {x0490: FILL_ARRAY_DATA , data: [9362, 5825, 9362, 5825, 5825, 3647, 5825, 3647, 9362, 5825, 9362, 5825, 5825, 3647, 5825, 3647} // fill-array
            r1[r8] = r3
            int[] r3 = new int[r0]
            r3 = {x04b4: FILL_ARRAY_DATA , data: [8192, 5243, 8192, 5243, 5243, 3355, 5243, 3355, 8192, 5243, 8192, 5243, 5243, 3355, 5243, 3355} // fill-array
            r1[r9] = r3
            int[] r0 = new int[r0]
            r0 = {x04d8: FILL_ARRAY_DATA , data: [7282, 4559, 7282, 4559, 4559, 2893, 4559, 2893, 7282, 4559, 7282, 4559, 4559, 2893, 4559, 2893} // fill-array
            r1[r10] = r0
            org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff = r1
            r0 = 0
        Lc1:
            if (r0 >= r2) goto L193
            int[][] r1 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r1 = r1[r0]
            int[][] r3 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r3 = r3[r0]
            r3 = r3[r10]
            java.util.Arrays.fill(r1, r3)
            r1 = 0
        Ld1:
            r3 = 8
            if (r1 >= r3) goto Led
            r4 = 0
        Ld6:
            if (r4 >= r3) goto Lea
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r5]
            r11[r12] = r13
            int r4 = r4 + 4
            goto Ld6
        Lea:
            int r1 = r1 + 4
            goto Ld1
        Led:
            r1 = 1
        Lee:
            if (r1 >= r3) goto L108
            r4 = 1
        Lf1:
            if (r4 >= r3) goto L105
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r6]
            r11[r12] = r13
            int r4 = r4 + 2
            goto Lf1
        L105:
            int r1 = r1 + 2
            goto Lee
        L108:
            r1 = 2
        L109:
            if (r1 >= r3) goto L123
            r4 = 2
        L10c:
            if (r4 >= r3) goto L120
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r7]
            r11[r12] = r13
            int r4 = r4 + 4
            goto L10c
        L120:
            int r1 = r1 + 4
            goto L109
        L123:
            r1 = 0
        L124:
            if (r1 >= r3) goto L13e
            r4 = 1
        L127:
            if (r4 >= r3) goto L13b
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r8]
            r11[r12] = r13
            int r4 = r4 + 2
            goto L127
        L13b:
            int r1 = r1 + 4
            goto L124
        L13e:
            r1 = 1
        L13f:
            if (r1 >= r3) goto L159
            r4 = 0
        L142:
            if (r4 >= r3) goto L156
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r8]
            r11[r12] = r13
            int r4 = r4 + 4
            goto L142
        L156:
            int r1 = r1 + 2
            goto L13f
        L159:
            r1 = 0
        L15a:
            if (r1 >= r3) goto L174
            r4 = 2
        L15d:
            if (r4 >= r3) goto L171
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r9]
            r11[r12] = r13
            int r4 = r4 + 4
            goto L15d
        L171:
            int r1 = r1 + 4
            goto L15a
        L174:
            r1 = 2
        L175:
            if (r1 >= r3) goto L18f
            r4 = 0
        L178:
            if (r4 >= r3) goto L18c
            int[][] r11 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef8x8
            r11 = r11[r0]
            int r12 = r1 << 3
            int r12 = r12 + r4
            int[][] r13 = org.jcodec.codecs.h264.decode.CoeffTransformer.initDequantCoeff8x8
            r13 = r13[r0]
            r13 = r13[r9]
            r11[r12] = r13
            int r4 = r4 + 4
            goto L178
        L18c:
            int r1 = r1 + 4
            goto L175
        L18f:
            int r0 = r0 + 1
            goto Lc1
        L193:
            return
    }

    public static final void _idct4x4(int[] r10, int[] r11) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 16
            if (r1 >= r2) goto L35
            r2 = r10[r1]
            int r3 = r1 + 2
            r4 = r10[r3]
            int r2 = r2 + r4
            r4 = r10[r1]
            r5 = r10[r3]
            int r4 = r4 - r5
            int r5 = r1 + 1
            r6 = r10[r5]
            int r6 = r6 >> 1
            int r7 = r1 + 3
            r8 = r10[r7]
            int r6 = r6 - r8
            r8 = r10[r5]
            r9 = r10[r7]
            int r9 = r9 >> 1
            int r8 = r8 + r9
            int r9 = r2 + r8
            r11[r1] = r9
            int r9 = r4 + r6
            r11[r5] = r9
            int r4 = r4 - r6
            r11[r3] = r4
            int r2 = r2 - r8
            r11[r7] = r2
            int r1 = r1 + 4
            goto L2
        L35:
            r10 = 0
        L36:
            r1 = 4
            if (r10 >= r1) goto L68
            r1 = r11[r10]
            int r3 = r10 + 8
            r4 = r11[r3]
            int r1 = r1 + r4
            r4 = r11[r10]
            r5 = r11[r3]
            int r4 = r4 - r5
            int r5 = r10 + 4
            r6 = r11[r5]
            int r6 = r6 >> 1
            int r7 = r10 + 12
            r8 = r11[r7]
            int r6 = r6 - r8
            r8 = r11[r5]
            r9 = r11[r7]
            int r9 = r9 >> 1
            int r8 = r8 + r9
            int r9 = r1 + r8
            r11[r10] = r9
            int r9 = r4 + r6
            r11[r5] = r9
            int r4 = r4 - r6
            r11[r3] = r4
            int r1 = r1 - r8
            r11[r7] = r1
            int r10 = r10 + 1
            goto L36
        L68:
            if (r0 >= r2) goto L75
            r10 = r11[r0]
            int r10 = r10 + 32
            int r10 = r10 >> 6
            r11[r0] = r10
            int r0 = r0 + 1
            goto L68
        L75:
            return
    }

    public static void dequantizeAC(int[] r6, int r7) {
            int r0 = r7 % 6
            r1 = 16
            r2 = 0
            r3 = 24
            if (r7 < r3) goto L1d
            int r7 = r7 / 6
        Lb:
            if (r2 >= r1) goto L3b
            r3 = r6[r2]
            int[][] r4 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef
            r4 = r4[r0]
            r4 = r4[r2]
            int r3 = r3 * r4
            int r3 = r3 << r7
            r6[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L1d:
            int r7 = r7 / 6
            int r3 = 4 - r7
            int r7 = 3 - r7
            r4 = 1
            int r7 = r4 << r7
        L26:
            if (r2 >= r1) goto L3b
            r4 = r6[r2]
            int[][] r5 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef
            r5 = r5[r0]
            r5 = r5[r2]
            int r5 = r5 << 4
            int r4 = r4 * r5
            int r4 = r4 + r7
            int r4 = r4 >> r3
            r6[r2] = r4
            int r2 = r2 + 1
            goto L26
        L3b:
            return
    }

    public static void dequantizeDC2x2(int[] r5, int r6) {
            int r0 = r6 % 6
            int r6 = r6 / 6
            r1 = 0
            r2 = 0
        L6:
            r3 = 4
            if (r2 >= r3) goto L1b
            r3 = r5[r2]
            int[][] r4 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef
            r4 = r4[r0]
            r4 = r4[r1]
            int r3 = r3 * r4
            int r3 = r3 << r6
            int r3 = r3 >> 1
            r5[r2] = r3
            int r2 = r2 + 1
            goto L6
        L1b:
            return
    }

    public static void dequantizeDC4x2(int[] r0, int r1) {
            return
    }

    public static void dequantizeDC4x4(int[] r7, int r8) {
            int r0 = r8 % 6
            r1 = 16
            r2 = 0
            r3 = 36
            if (r8 < r3) goto L20
            int r8 = r8 / 6
            int r8 = r8 + (-2)
            r3 = 0
        Le:
            if (r3 >= r1) goto L3f
            r4 = r7[r3]
            int[][] r5 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef
            r5 = r5[r0]
            r5 = r5[r2]
            int r4 = r4 * r5
            int r4 = r4 << r8
            r7[r3] = r4
            int r3 = r3 + 1
            goto Le
        L20:
            int r8 = r8 / 6
            int r3 = 6 - r8
            int r8 = 5 - r8
            r4 = 1
            int r8 = r4 << r8
            r4 = 0
        L2a:
            if (r4 >= r1) goto L3f
            r5 = r7[r4]
            int[][] r6 = org.jcodec.codecs.h264.decode.CoeffTransformer.dequantCoef
            r6 = r6[r0]
            r6 = r6[r2]
            int r6 = r6 << 4
            int r5 = r5 * r6
            int r5 = r5 + r8
            int r5 = r5 >> r3
            r7[r4] = r5
            int r4 = r4 + 1
            goto L2a
        L3f:
            return
    }

    public static void fdct4x4(int[] r10) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 16
            if (r1 >= r2) goto L34
            r2 = r10[r1]
            int r3 = r1 + 3
            r4 = r10[r3]
            int r2 = r2 + r4
            int r4 = r1 + 1
            r5 = r10[r4]
            int r6 = r1 + 2
            r7 = r10[r6]
            int r5 = r5 + r7
            r7 = r10[r4]
            r8 = r10[r6]
            int r7 = r7 - r8
            r8 = r10[r1]
            r9 = r10[r3]
            int r8 = r8 - r9
            int r9 = r2 + r5
            r10[r1] = r9
            int r9 = r8 << 1
            int r9 = r9 + r7
            r10[r4] = r9
            int r2 = r2 - r5
            r10[r6] = r2
            int r2 = r7 << 1
            int r8 = r8 - r2
            r10[r3] = r8
            int r1 = r1 + 4
            goto L2
        L34:
            r1 = 4
            if (r0 >= r1) goto L65
            r1 = r10[r0]
            int r2 = r0 + 12
            r3 = r10[r2]
            int r1 = r1 + r3
            int r3 = r0 + 4
            r4 = r10[r3]
            int r5 = r0 + 8
            r6 = r10[r5]
            int r4 = r4 + r6
            r6 = r10[r3]
            r7 = r10[r5]
            int r6 = r6 - r7
            r7 = r10[r0]
            r8 = r10[r2]
            int r7 = r7 - r8
            int r8 = r1 + r4
            r10[r0] = r8
            int r8 = r7 << 1
            int r8 = r8 + r6
            r10[r3] = r8
            int r1 = r1 - r4
            r10[r5] = r1
            int r1 = r6 << 1
            int r7 = r7 - r1
            r10[r2] = r7
            int r0 = r0 + 1
            goto L34
        L65:
            return
    }

    public static void fvdDC2x2(int[] r0) {
            invDC2x2(r0)
            return
    }

    public static void fvdDC4x2(int[] r0) {
            return
    }

    public static void fvdDC4x4(int[] r10) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 16
            if (r1 >= r2) goto L31
            r2 = r10[r1]
            int r3 = r1 + 3
            r4 = r10[r3]
            int r2 = r2 + r4
            int r4 = r1 + 1
            r5 = r10[r4]
            int r6 = r1 + 2
            r7 = r10[r6]
            int r5 = r5 + r7
            r7 = r10[r4]
            r8 = r10[r6]
            int r7 = r7 - r8
            r8 = r10[r1]
            r9 = r10[r3]
            int r8 = r8 - r9
            int r9 = r2 + r5
            r10[r1] = r9
            int r9 = r8 + r7
            r10[r4] = r9
            int r2 = r2 - r5
            r10[r6] = r2
            int r8 = r8 - r7
            r10[r3] = r8
            int r1 = r1 + 4
            goto L2
        L31:
            r1 = 4
            if (r0 >= r1) goto L67
            r1 = r10[r0]
            int r2 = r0 + 12
            r3 = r10[r2]
            int r1 = r1 + r3
            int r3 = r0 + 4
            r4 = r10[r3]
            int r5 = r0 + 8
            r6 = r10[r5]
            int r4 = r4 + r6
            r6 = r10[r3]
            r7 = r10[r5]
            int r6 = r6 - r7
            r7 = r10[r0]
            r8 = r10[r2]
            int r7 = r7 - r8
            int r8 = r1 + r4
            int r8 = r8 >> 1
            r10[r0] = r8
            int r8 = r6 + r7
            int r8 = r8 >> 1
            r10[r3] = r8
            int r1 = r1 - r4
            int r1 = r1 >> 1
            r10[r5] = r1
            int r7 = r7 - r6
            int r1 = r7 >> 1
            r10[r2] = r1
            int r0 = r0 + 1
            goto L31
        L67:
            return
    }

    public static final void idct4x4(int[] r0) {
            _idct4x4(r0, r0)
            return
    }

    public static void invDC2x2(int[] r9) {
            r0 = 0
            r1 = r9[r0]
            r2 = 1
            r3 = r9[r2]
            int r1 = r1 + r3
            r3 = r9[r0]
            r4 = r9[r2]
            int r3 = r3 - r4
            r4 = 2
            r5 = r9[r4]
            r6 = 3
            r7 = r9[r6]
            int r5 = r5 + r7
            r7 = r9[r4]
            r8 = r9[r6]
            int r7 = r7 - r8
            int r8 = r1 + r5
            r9[r0] = r8
            int r0 = r3 + r7
            r9[r2] = r0
            int r1 = r1 - r5
            r9[r4] = r1
            int r3 = r3 - r7
            r9[r6] = r3
            return
    }

    public static void invDC4x2(int[] r0) {
            return
    }

    public static void invDC4x4(int[] r10) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 16
            if (r1 >= r2) goto L31
            r2 = r10[r1]
            int r3 = r1 + 2
            r4 = r10[r3]
            int r2 = r2 + r4
            r4 = r10[r1]
            r5 = r10[r3]
            int r4 = r4 - r5
            int r5 = r1 + 1
            r6 = r10[r5]
            int r7 = r1 + 3
            r8 = r10[r7]
            int r6 = r6 - r8
            r8 = r10[r5]
            r9 = r10[r7]
            int r8 = r8 + r9
            int r9 = r2 + r8
            r10[r1] = r9
            int r9 = r4 + r6
            r10[r5] = r9
            int r4 = r4 - r6
            r10[r3] = r4
            int r2 = r2 - r8
            r10[r7] = r2
            int r1 = r1 + 4
            goto L2
        L31:
            r1 = 4
            if (r0 >= r1) goto L5f
            r1 = r10[r0]
            int r2 = r0 + 8
            r3 = r10[r2]
            int r1 = r1 + r3
            r3 = r10[r0]
            r4 = r10[r2]
            int r3 = r3 - r4
            int r4 = r0 + 4
            r5 = r10[r4]
            int r6 = r0 + 12
            r7 = r10[r6]
            int r5 = r5 - r7
            r7 = r10[r4]
            r8 = r10[r6]
            int r7 = r7 + r8
            int r8 = r1 + r7
            r10[r0] = r8
            int r8 = r3 + r5
            r10[r4] = r8
            int r3 = r3 - r5
            r10[r2] = r3
            int r1 = r1 - r7
            r10[r6] = r1
            int r0 = r0 + 1
            goto L31
        L5f:
            return
    }

    public static void quantizeAC(int[] r7, int r8) {
            int r0 = r8 / 6
            int r1 = r8 % 6
            int r2 = r0 + 4
            r3 = 682(0x2aa, float:9.56E-43)
            int r2 = r3 << r2
            int r0 = r0 + 15
            r3 = 16
            r4 = 0
            r5 = 10
            if (r8 >= r5) goto L34
        L13:
            if (r4 >= r3) goto L4f
            r8 = r7[r4]
            int r8 = r8 >> 31
            r5 = r7[r4]
            r5 = r5 ^ r8
            int r5 = r5 - r8
            int[][] r6 = org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff
            r6 = r6[r1]
            r6 = r6[r4]
            int r5 = r5 * r6
            int r5 = r5 + r2
            int r5 = r5 >> r0
            r6 = 2063(0x80f, float:2.891E-42)
            int r5 = java.lang.Math.min(r5, r6)
            r5 = r5 ^ r8
            int r5 = r5 - r8
            r7[r4] = r5
            int r4 = r4 + 1
            goto L13
        L34:
            if (r4 >= r3) goto L4f
            r8 = r7[r4]
            int r8 = r8 >> 31
            r5 = r7[r4]
            r5 = r5 ^ r8
            int r5 = r5 - r8
            int[][] r6 = org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff
            r6 = r6[r1]
            r6 = r6[r4]
            int r5 = r5 * r6
            int r5 = r5 + r2
            int r5 = r5 >> r0
            r5 = r5 ^ r8
            int r5 = r5 - r8
            r7[r4] = r5
            int r4 = r4 + 1
            goto L34
        L4f:
            return
    }

    public static void quantizeDC2x2(int[] r8, int r9) {
            int r0 = r9 / 6
            int r1 = r9 % 6
            int r2 = r0 + 5
            r3 = 682(0x2aa, float:9.56E-43)
            int r2 = r3 << r2
            int r0 = r0 + 16
            r3 = 4
            r4 = 0
            if (r9 >= r3) goto L32
            r9 = 0
        L11:
            if (r9 >= r3) goto L4e
            r5 = r8[r9]
            int r5 = r5 >> 31
            r6 = r8[r9]
            r6 = r6 ^ r5
            int r6 = r6 - r5
            int[][] r7 = org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff
            r7 = r7[r1]
            r7 = r7[r4]
            int r6 = r6 * r7
            int r6 = r6 + r2
            int r6 = r6 >> r0
            r7 = 2063(0x80f, float:2.891E-42)
            int r6 = java.lang.Math.min(r6, r7)
            r6 = r6 ^ r5
            int r6 = r6 - r5
            r8[r9] = r6
            int r9 = r9 + 1
            goto L11
        L32:
            r9 = 0
        L33:
            if (r9 >= r3) goto L4e
            r5 = r8[r9]
            int r5 = r5 >> 31
            r6 = r8[r9]
            r6 = r6 ^ r5
            int r6 = r6 - r5
            int[][] r7 = org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff
            r7 = r7[r1]
            r7 = r7[r4]
            int r6 = r6 * r7
            int r6 = r6 + r2
            int r6 = r6 >> r0
            r6 = r6 ^ r5
            int r6 = r6 - r5
            r8[r9] = r6
            int r9 = r9 + 1
            goto L33
        L4e:
            return
    }

    public static void quantizeDC4x2(int[] r0, int r1) {
            return
    }

    public static void quantizeDC4x4(int[] r8, int r9) {
            int r0 = r9 / 6
            int r1 = r9 % 6
            int r2 = r0 + 5
            r3 = 682(0x2aa, float:9.56E-43)
            int r2 = r3 << r2
            r3 = 16
            int r0 = r0 + r3
            r4 = 0
            r5 = 10
            if (r9 >= r5) goto L34
            r9 = 0
        L13:
            if (r9 >= r3) goto L50
            r5 = r8[r9]
            int r5 = r5 >> 31
            r6 = r8[r9]
            r6 = r6 ^ r5
            int r6 = r6 - r5
            int[][] r7 = org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff
            r7 = r7[r1]
            r7 = r7[r4]
            int r6 = r6 * r7
            int r6 = r6 + r2
            int r6 = r6 >> r0
            r7 = 2063(0x80f, float:2.891E-42)
            int r6 = java.lang.Math.min(r6, r7)
            r6 = r6 ^ r5
            int r6 = r6 - r5
            r8[r9] = r6
            int r9 = r9 + 1
            goto L13
        L34:
            r9 = 0
        L35:
            if (r9 >= r3) goto L50
            r5 = r8[r9]
            int r5 = r5 >> 31
            r6 = r8[r9]
            r6 = r6 ^ r5
            int r6 = r6 - r5
            int[][] r7 = org.jcodec.codecs.h264.decode.CoeffTransformer.quantCoeff
            r7 = r7[r1]
            r7 = r7[r4]
            int r6 = r6 * r7
            int r6 = r6 + r2
            int r6 = r6 >> r0
            r6 = r6 ^ r5
            int r6 = r6 - r5
            r8[r9] = r6
            int r9 = r9 + 1
            goto L35
        L50:
            return
    }

    public static void reorderDC4x4(int[] r2) {
            r0 = 2
            r1 = 4
            org.jcodec.common.ArrayUtil.swap(r2, r0, r1)
            r0 = 3
            r1 = 5
            org.jcodec.common.ArrayUtil.swap(r2, r0, r1)
            r0 = 10
            r1 = 12
            org.jcodec.common.ArrayUtil.swap(r2, r0, r1)
            r0 = 11
            r1 = 13
            org.jcodec.common.ArrayUtil.swap(r2, r0, r1)
            return
    }
}
