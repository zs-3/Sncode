package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class MBDeblocker {
    private static int[][] BS_I;
    static int[][] LOOKUP_IDX_P_H;
    static int[][] LOOKUP_IDX_P_V;
    static int[][] LOOKUP_IDX_Q_H;
    static int[][] LOOKUP_IDX_Q_V;
    private static int[][] P_POS_H;
    private static int[][] P_POS_H_CHR;
    private static int[][] P_POS_V;
    private static int[][] P_POS_V_CHR;
    private static int[][] Q_POS_H;
    private static int[][] Q_POS_H_CHR;
    private static int[][] Q_POS_V;
    private static int[][] Q_POS_V_CHR;

    static {
            int[][] r0 = buildPPosV()
            org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V = r0
            int[][] r0 = buildQPosV()
            org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V = r0
            int[][] r0 = buildPPosH()
            org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H = r0
            int[][] r0 = buildQPosH()
            org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H = r0
            int[][] r0 = buildPPosVChr()
            org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V_CHR = r0
            int[][] r0 = buildQPosVChr()
            org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V_CHR = r0
            int[][] r0 = buildPPosHChr()
            org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H_CHR = r0
            int[][] r0 = buildQPosHChr()
            org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H_CHR = r0
            r0 = 4
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x00d6: FILL_ARRAY_DATA , data: [3, 7, 11, 15} // fill-array
            r3 = 0
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x00e2: FILL_ARRAY_DATA , data: [0, 4, 8, 12} // fill-array
            r4 = 1
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x00ee: FILL_ARRAY_DATA , data: [1, 5, 9, 13} // fill-array
            r5 = 2
            r1[r5] = r2
            int[] r2 = new int[r0]
            r2 = {x00fa: FILL_ARRAY_DATA , data: [2, 6, 10, 14} // fill-array
            r6 = 3
            r1[r6] = r2
            org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_P_V = r1
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x0106: FILL_ARRAY_DATA , data: [0, 4, 8, 12} // fill-array
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x0112: FILL_ARRAY_DATA , data: [1, 5, 9, 13} // fill-array
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x011e: FILL_ARRAY_DATA , data: [2, 6, 10, 14} // fill-array
            r1[r5] = r2
            int[] r2 = new int[r0]
            r2 = {x012a: FILL_ARRAY_DATA , data: [3, 7, 11, 15} // fill-array
            r1[r6] = r2
            org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_Q_V = r1
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x0136: FILL_ARRAY_DATA , data: [12, 13, 14, 15} // fill-array
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x0142: FILL_ARRAY_DATA , data: [0, 1, 2, 3} // fill-array
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x014e: FILL_ARRAY_DATA , data: [4, 5, 6, 7} // fill-array
            r1[r5] = r2
            int[] r2 = new int[r0]
            r2 = {x015a: FILL_ARRAY_DATA , data: [8, 9, 10, 11} // fill-array
            r1[r6] = r2
            org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_P_H = r1
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x0166: FILL_ARRAY_DATA , data: [0, 1, 2, 3} // fill-array
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x0172: FILL_ARRAY_DATA , data: [4, 5, 6, 7} // fill-array
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x017e: FILL_ARRAY_DATA , data: [8, 9, 10, 11} // fill-array
            r1[r5] = r2
            int[] r2 = new int[r0]
            r2 = {x018a: FILL_ARRAY_DATA , data: [12, 13, 14, 15} // fill-array
            r1[r6] = r2
            org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_Q_H = r1
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x0196: FILL_ARRAY_DATA , data: [4, 4, 4, 4} // fill-array
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x01a2: FILL_ARRAY_DATA , data: [3, 3, 3, 3} // fill-array
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x01ae: FILL_ARRAY_DATA , data: [3, 3, 3, 3} // fill-array
            r1[r5] = r2
            int[] r0 = new int[r0]
            r0 = {x01ba: FILL_ARRAY_DATA , data: [3, 3, 3, 3} // fill-array
            r1[r6] = r0
            org.jcodec.codecs.h264.encode.MBDeblocker.BS_I = r1
            return
    }

    public MBDeblocker() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[][] buildPPosH() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [4, 16} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L27
            r3 = 0
        L14:
            r4 = 16
            if (r3 >= r4) goto L24
            r4 = r0[r2]
            int r5 = r2 << 6
            int r5 = r5 + r3
            int r5 = r5 + 48
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r0
    }

    private static int[][] buildPPosHChr() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [4, 8} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L26
            r3 = 0
        L14:
            r4 = 8
            if (r3 >= r4) goto L23
            r5 = r0[r2]
            int r6 = r2 << 4
            int r6 = r6 + r3
            int r6 = r6 + r4
            r5[r3] = r6
            int r3 = r3 + 1
            goto L14
        L23:
            int r2 = r2 + 1
            goto L10
        L26:
            return r0
    }

    private static int[][] buildPPosV() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [4, 16} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L29
            r3 = 0
        L14:
            r4 = 16
            if (r3 >= r4) goto L26
            r4 = r0[r2]
            int r5 = r3 << 4
            int r6 = r2 << 2
            int r5 = r5 + r6
            int r5 = r5 + 3
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L26:
            int r2 = r2 + 1
            goto L10
        L29:
            return r0
    }

    private static int[][] buildPPosVChr() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [4, 8} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L29
            r3 = 0
        L14:
            r4 = 8
            if (r3 >= r4) goto L26
            r4 = r0[r2]
            int r5 = r3 << 3
            int r6 = r2 << 1
            int r5 = r5 + r6
            int r5 = r5 + 1
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L26:
            int r2 = r2 + 1
            goto L10
        L29:
            return r0
    }

    private static int[][] buildQPosH() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [4, 16} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L25
            r3 = 0
        L14:
            r4 = 16
            if (r3 >= r4) goto L22
            r4 = r0[r2]
            int r5 = r2 << 6
            int r5 = r5 + r3
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L22:
            int r2 = r2 + 1
            goto L10
        L25:
            return r0
    }

    private static int[][] buildQPosHChr() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [4, 8} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L25
            r3 = 0
        L14:
            r4 = 8
            if (r3 >= r4) goto L22
            r4 = r0[r2]
            int r5 = r2 << 4
            int r5 = r5 + r3
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L22:
            int r2 = r2 + 1
            goto L10
        L25:
            return r0
    }

    private static int[][] buildQPosV() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [4, 16} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L27
            r3 = 0
        L14:
            r4 = 16
            if (r3 >= r4) goto L24
            r4 = r0[r2]
            int r5 = r3 << 4
            int r6 = r2 << 2
            int r5 = r5 + r6
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r0
    }

    private static int[][] buildQPosVChr() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [4, 8} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = 0
        L10:
            r3 = 4
            if (r2 >= r3) goto L27
            r3 = 0
        L14:
            r4 = 8
            if (r3 >= r4) goto L24
            r4 = r0[r2]
            int r5 = r3 << 3
            int r6 = r2 << 1
            int r5 = r5 + r6
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r0
    }

    static void calcStrengthForBlocks(org.jcodec.codecs.h264.encode.EncodedMB r9, org.jcodec.codecs.h264.encode.EncodedMB r10, int[][] r11, int[][] r12, int[][] r13) {
            r0 = 4
            r1 = 0
            if (r10 == 0) goto L66
            r2 = 0
        L5:
            if (r2 >= r0) goto L66
            r3 = r11[r1]
            org.jcodec.codecs.h264.io.model.MBType r4 = r10.getType()
            boolean r4 = r4.isIntra()
            if (r4 == 0) goto L15
            r4 = 4
            goto L61
        L15:
            int[] r4 = r10.getMx()
            r5 = r12[r1]
            r5 = r5[r2]
            r4 = r4[r5]
            int[] r5 = r9.getMx()
            r6 = r13[r1]
            r6 = r6[r2]
            r5 = r5[r6]
            int r4 = strengthMv(r4, r5)
            int[] r5 = r10.getMy()
            r6 = r12[r1]
            r6 = r6[r2]
            r5 = r5[r6]
            int[] r6 = r9.getMy()
            r7 = r13[r1]
            r7 = r7[r2]
            r6 = r6[r7]
            int r5 = strengthMv(r5, r6)
            int[] r6 = r10.getNc()
            r7 = r12[r1]
            r7 = r7[r2]
            r6 = r6[r7]
            int[] r7 = r9.getNc()
            r8 = r13[r1]
            r8 = r8[r2]
            r7 = r7[r8]
            int r6 = strengthNc(r6, r7)
            int r4 = org.jcodec.common.tools.MathUtil.max3(r4, r5, r6)
        L61:
            r3[r2] = r4
            int r2 = r2 + 1
            goto L5
        L66:
            r10 = 1
        L67:
            if (r10 >= r0) goto Lc2
            r2 = 0
        L6a:
            if (r2 >= r0) goto Lbf
            r3 = r11[r10]
            int[] r4 = r9.getMx()
            r5 = r12[r10]
            r5 = r5[r2]
            r4 = r4[r5]
            int[] r5 = r9.getMx()
            r6 = r13[r10]
            r6 = r6[r2]
            r5 = r5[r6]
            int r4 = strengthMv(r4, r5)
            int[] r5 = r9.getMy()
            r6 = r12[r10]
            r6 = r6[r2]
            r5 = r5[r6]
            int[] r6 = r9.getMy()
            r7 = r13[r10]
            r7 = r7[r2]
            r6 = r6[r7]
            int r5 = strengthMv(r5, r6)
            int[] r6 = r9.getNc()
            r7 = r12[r10]
            r7 = r7[r2]
            r6 = r6[r7]
            int[] r7 = r9.getNc()
            r8 = r13[r10]
            r8 = r8[r2]
            r7 = r7[r8]
            int r6 = strengthNc(r6, r7)
            int r4 = org.jcodec.common.tools.MathUtil.max3(r4, r5, r6)
            r3[r2] = r4
            int r2 = r2 + 1
            goto L6a
        Lbf:
            int r10 = r10 + 1
            goto L67
        Lc2:
            return
    }

    private void deblockBorder(int[] r24, int r25, byte[] r26, int r27, byte[] r28, int r29, int[][] r30, int[][] r31, boolean r32) {
            r23 = this;
            r0 = 1
            if (r32 == 0) goto L6
            r1 = 16
            goto L7
        L6:
            r1 = 1
        L7:
            int r2 = r1 * 2
            int r3 = r1 * 3
            r4 = 0
            r5 = 0
        Ld:
            r6 = 4
            if (r5 >= r6) goto L96
            r7 = r24[r5]
            if (r7 != r6) goto L56
            int r7 = r5 << 2
            r8 = 0
        L17:
            if (r8 >= r6) goto L92
            r9 = r30[r27]
            r9 = r9[r7]
            int r15 = r9 - r3
            r9 = r30[r27]
            r9 = r9[r7]
            int r16 = r9 - r2
            r9 = r30[r27]
            r9 = r9[r7]
            int r17 = r9 - r1
            r9 = r30[r27]
            r18 = r9[r7]
            r9 = r31[r29]
            r19 = r9[r7]
            r9 = r31[r29]
            r9 = r9[r7]
            int r20 = r9 + r1
            r9 = r31[r29]
            r9 = r9[r7]
            int r21 = r9 + r2
            r9 = r31[r29]
            r9 = r9[r7]
            int r22 = r9 + r3
            r10 = r23
            r11 = r25
            r12 = r25
            r13 = r26
            r14 = r28
            r10.filterBs4(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r8 = r8 + 1
            int r7 = r7 + r0
            goto L17
        L56:
            r7 = r24[r5]
            if (r7 <= 0) goto L92
            int r7 = r5 << 2
            r8 = 0
        L5d:
            if (r8 >= r6) goto L92
            r10 = r24[r5]
            r9 = r30[r27]
            r9 = r9[r7]
            int r15 = r9 - r2
            r9 = r30[r27]
            r9 = r9[r7]
            int r16 = r9 - r1
            r9 = r30[r27]
            r17 = r9[r7]
            r9 = r31[r29]
            r18 = r9[r7]
            r9 = r31[r29]
            r9 = r9[r7]
            int r19 = r9 + r1
            r9 = r31[r29]
            r9 = r9[r7]
            int r20 = r9 + r2
            r9 = r23
            r11 = r25
            r12 = r25
            r13 = r26
            r14 = r28
            r9.filterBs(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r8 = r8 + 1
            int r7 = r7 + r0
            goto L5d
        L92:
            int r5 = r5 + 1
            goto Ld
        L96:
            return
    }

    private void deblockBorderChroma(int[] r18, int r19, byte[] r20, int r21, byte[] r22, int r23, int[][] r24, int[][] r25, boolean r26) {
            r17 = this;
            r0 = 1
            if (r26 == 0) goto L6
            r1 = 8
            goto L7
        L6:
            r1 = 1
        L7:
            r2 = 0
            r3 = 0
        L9:
            r4 = 4
            if (r3 >= r4) goto L6e
            r5 = r18[r3]
            r6 = 2
            if (r5 != r4) goto L3b
            int r4 = r3 << 1
            r5 = 0
        L14:
            if (r5 >= r6) goto L6b
            r7 = r24[r21]
            r7 = r7[r4]
            int r13 = r7 - r1
            r7 = r24[r21]
            r14 = r7[r4]
            r7 = r25[r23]
            r15 = r7[r4]
            r7 = r25[r23]
            r7 = r7[r4]
            int r16 = r7 + r1
            r8 = r17
            r9 = r19
            r10 = r19
            r11 = r20
            r12 = r22
            r8.filterBs4Chr(r9, r10, r11, r12, r13, r14, r15, r16)
            int r5 = r5 + 1
            int r4 = r4 + r0
            goto L14
        L3b:
            r4 = r18[r3]
            if (r4 <= 0) goto L6b
            int r4 = r3 << 1
            r5 = 0
        L42:
            if (r5 >= r6) goto L6b
            r8 = r18[r3]
            r7 = r24[r21]
            r7 = r7[r4]
            int r13 = r7 - r1
            r7 = r24[r21]
            r14 = r7[r4]
            r7 = r25[r23]
            r15 = r7[r4]
            r7 = r25[r23]
            r7 = r7[r4]
            int r16 = r7 + r1
            r7 = r17
            r9 = r19
            r10 = r19
            r11 = r20
            r12 = r22
            r7.filterBsChr(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r5 = r5 + 1
            int r4 = r4 + r0
            goto L42
        L6b:
            int r3 = r3 + 1
            goto L9
        L6e:
            return
    }

    private static int strengthMv(int r0, int r1) {
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            r1 = 4
            if (r0 < r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private static int strengthNc(int r0, int r1) {
            if (r0 > 0) goto L7
            if (r1 <= 0) goto L5
            goto L7
        L5:
            r0 = 0
            goto L8
        L7:
            r0 = 2
        L8:
            return r0
    }

    protected void _filterBs(int r14, int r15, int r16, byte[] r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, boolean r25) {
            r13 = this;
            r0 = r17[r20]
            r1 = r17[r21]
            r2 = r18[r22]
            r3 = r18[r23]
            int[] r4 = org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.alphaTab
            r4 = r4[r15]
            int[] r5 = org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.betaTab
            r5 = r5[r16]
            int r6 = r1 - r2
            int r6 = java.lang.Math.abs(r6)
            r7 = 0
            r8 = 1
            if (r6 >= r4) goto L2c
            int r4 = r0 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r4 >= r5) goto L2c
            int r4 = r3 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 >= r5) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            int[][] r4 = org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.tcs
            int r6 = r14 + (-1)
            r4 = r4[r6]
            r4 = r4[r15]
            if (r25 != 0) goto L5f
            r6 = r17[r19]
            int r6 = r6 - r1
            int r6 = java.lang.Math.abs(r6)
            r9 = r18[r24]
            int r9 = r9 - r2
            int r9 = java.lang.Math.abs(r9)
            if (r6 >= r5) goto L4c
            r10 = 1
            goto L4d
        L4c:
            r10 = 0
        L4d:
            int r10 = r10 + r4
            if (r9 >= r5) goto L52
            r11 = 1
            goto L53
        L52:
            r11 = 0
        L53:
            int r10 = r10 + r11
            if (r6 >= r5) goto L58
            r6 = 1
            goto L59
        L58:
            r6 = 0
        L59:
            if (r9 >= r5) goto L5c
            r7 = 1
        L5c:
            r5 = r7
            r7 = r6
            goto L62
        L5f:
            int r10 = r4 + 1
            r5 = 0
        L62:
            int r6 = r2 - r1
            int r6 = r6 << 2
            int r9 = r0 - r3
            int r6 = r6 + r9
            int r6 = r6 + 4
            int r6 = r6 >> 3
            int r9 = -r10
            if (r6 >= r9) goto L72
            r10 = r9
            goto L76
        L72:
            if (r6 <= r10) goto L75
            goto L76
        L75:
            r10 = r6
        L76:
            int r6 = r1 + r10
            r9 = -128(0xffffffffffffff80, float:NaN)
            if (r6 >= r9) goto L7e
            r6 = -128(0xffffffffffffff80, float:NaN)
        L7e:
            int r10 = r2 - r10
            if (r10 >= r9) goto L84
            r10 = -128(0xffffffffffffff80, float:NaN)
        L84:
            r11 = 127(0x7f, float:1.78E-43)
            if (r7 == 0) goto La3
            r7 = r17[r19]
            int r12 = r1 + r2
            int r12 = r12 + r8
            int r12 = r12 >> r8
            int r7 = r7 + r12
            int r12 = r0 << 1
            int r7 = r7 - r12
            int r7 = r7 >> r8
            int r12 = -r4
            if (r7 >= r12) goto L98
            r7 = r12
            goto L9b
        L98:
            if (r7 <= r4) goto L9b
            r7 = r4
        L9b:
            int r0 = r0 + r7
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r9, r11)
            byte r0 = (byte) r0
            r17[r20] = r0
        La3:
            if (r5 == 0) goto Lc0
            r0 = r18[r24]
            int r1 = r1 + r2
            int r1 = r1 + r8
            int r1 = r1 >> r8
            int r0 = r0 + r1
            int r1 = r3 << 1
            int r0 = r0 - r1
            int r0 = r0 >> r8
            int r1 = -r4
            if (r0 >= r1) goto Lb4
            r4 = r1
            goto Lb8
        Lb4:
            if (r0 <= r4) goto Lb7
            goto Lb8
        Lb7:
            r4 = r0
        Lb8:
            int r3 = r3 + r4
            int r0 = org.jcodec.common.tools.MathUtil.clip(r3, r9, r11)
            byte r0 = (byte) r0
            r18[r23] = r0
        Lc0:
            int r0 = org.jcodec.common.tools.MathUtil.clip(r10, r9, r11)
            byte r0 = (byte) r0
            r18[r22] = r0
            int r0 = org.jcodec.common.tools.MathUtil.clip(r6, r9, r11)
            byte r0 = (byte) r0
            r17[r21] = r0
            return
    }

    protected void _filterBs4(int r13, int r14, byte[] r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, boolean r25) {
            r12 = this;
            r0 = r15[r20]
            r1 = r16[r21]
            r2 = r15[r19]
            r3 = r16[r22]
            int[] r4 = org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.alphaTab
            r4 = r4[r13]
            int[] r5 = org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.betaTab
            r5 = r5[r14]
            int r6 = r0 - r1
            int r7 = java.lang.Math.abs(r6)
            r8 = 1
            r9 = 0
            if (r7 >= r4) goto L2c
            int r7 = r2 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r7 >= r5) goto L2c
            int r7 = r3 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 >= r5) goto L2c
            r7 = 1
            goto L2d
        L2c:
            r7 = 0
        L2d:
            if (r7 != 0) goto L30
            return
        L30:
            if (r25 == 0) goto L34
            r8 = 0
            goto L60
        L34:
            r7 = r15[r18]
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            r10 = r16[r23]
            int r10 = r10 - r1
            int r10 = java.lang.Math.abs(r10)
            if (r7 >= r5) goto L50
            int r7 = java.lang.Math.abs(r6)
            int r11 = r4 >> 2
            int r11 = r11 + 2
            if (r7 >= r11) goto L50
            r7 = 1
            goto L51
        L50:
            r7 = 0
        L51:
            if (r10 >= r5) goto L5e
            int r5 = java.lang.Math.abs(r6)
            int r4 = r4 >> 2
            int r4 = r4 + 2
            if (r5 >= r4) goto L5e
            goto L5f
        L5e:
            r8 = 0
        L5f:
            r9 = r7
        L60:
            r4 = 127(0x7f, float:1.78E-43)
            r5 = -128(0xffffffffffffff80, float:NaN)
            if (r9 == 0) goto La2
            r6 = r15[r17]
            r7 = r15[r18]
            int r9 = r2 * 2
            int r9 = r9 + r7
            int r10 = r0 * 2
            int r9 = r9 + r10
            int r10 = r1 * 2
            int r9 = r9 + r10
            int r9 = r9 + r3
            int r9 = r9 + 4
            int r9 = r9 >> 3
            int r10 = r7 + r2
            int r10 = r10 + r0
            int r10 = r10 + r1
            int r10 = r10 + 2
            int r10 = r10 >> 2
            int r6 = r6 * 2
            int r7 = r7 * 3
            int r6 = r6 + r7
            int r6 = r6 + r2
            int r6 = r6 + r0
            int r6 = r6 + r1
            int r6 = r6 + 4
            int r6 = r6 >> 3
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r5, r4)
            byte r7 = (byte) r7
            r15[r20] = r7
            int r7 = org.jcodec.common.tools.MathUtil.clip(r10, r5, r4)
            byte r7 = (byte) r7
            r15[r19] = r7
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r5, r4)
            byte r6 = (byte) r6
            r15[r18] = r6
            goto Lb1
        La2:
            int r6 = r2 * 2
            int r6 = r6 + r0
            int r6 = r6 + r3
            int r6 = r6 + 2
            int r6 = r6 >> 2
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r5, r4)
            byte r6 = (byte) r6
            r15[r20] = r6
        Lb1:
            if (r8 == 0) goto Lf1
            if (r25 != 0) goto Lf1
            r6 = r16[r23]
            r7 = r16[r24]
            int r8 = r0 * 2
            int r2 = r2 + r8
            int r8 = r1 * 2
            int r2 = r2 + r8
            int r8 = r3 * 2
            int r2 = r2 + r8
            int r2 = r2 + r6
            int r2 = r2 + 4
            int r2 = r2 >> 3
            int r8 = r0 + r1
            int r8 = r8 + r3
            int r8 = r8 + r6
            int r8 = r8 + 2
            int r8 = r8 >> 2
            int r7 = r7 * 2
            int r6 = r6 * 3
            int r7 = r7 + r6
            int r7 = r7 + r3
            int r7 = r7 + r1
            int r7 = r7 + r0
            int r7 = r7 + 4
            int r0 = r7 >> 3
            int r1 = org.jcodec.common.tools.MathUtil.clip(r2, r5, r4)
            byte r1 = (byte) r1
            r16[r21] = r1
            int r1 = org.jcodec.common.tools.MathUtil.clip(r8, r5, r4)
            byte r1 = (byte) r1
            r16[r22] = r1
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r5, r4)
            byte r0 = (byte) r0
            r16[r23] = r0
            goto L100
        Lf1:
            int r3 = r3 * 2
            int r3 = r3 + r1
            int r3 = r3 + r2
            int r3 = r3 + 2
            int r0 = r3 >> 2
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r5, r4)
            byte r0 = (byte) r0
            r16[r21] = r0
        L100:
            return
    }

    public void deblockMBGeneric(org.jcodec.codecs.h264.encode.EncodedMB r29, org.jcodec.codecs.h264.encode.EncodedMB r30, org.jcodec.codecs.h264.encode.EncodedMB r31, int[][] r32, int[][] r33) {
            r28 = this;
            org.jcodec.common.model.Picture8Bit r0 = r29.getPixels()
            r1 = 51
            r2 = 2
            r3 = 1
            r4 = 0
            if (r30 == 0) goto L58
            org.jcodec.common.model.Picture8Bit r5 = r30.getPixels()
            int r6 = r30.getQp()
            int r7 = r29.getQp()
            int r6 = r6 + r7
            int r6 = r6 + r3
            int r6 = r6 >> r3
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r4, r1)
            r8 = r32[r4]
            byte[] r10 = r5.getPlaneData(r4)
            r11 = 3
            byte[] r12 = r0.getPlaneData(r4)
            r13 = 0
            int[][] r14 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V
            int[][] r15 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V
            r16 = 0
            r7 = r28
            r9 = r6
            r7.deblockBorder(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r8 = r32[r4]
            byte[] r10 = r5.getPlaneData(r3)
            byte[] r12 = r0.getPlaneData(r3)
            int[][] r14 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V_CHR
            int[][] r15 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V_CHR
            r7.deblockBorderChroma(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r8 = r32[r4]
            byte[] r10 = r5.getPlaneData(r2)
            byte[] r12 = r0.getPlaneData(r2)
            int[][] r14 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V_CHR
            int[][] r15 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V_CHR
            r7.deblockBorderChroma(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L58:
            r5 = 0
        L59:
            r6 = 3
            if (r5 >= r6) goto La7
            int r6 = r5 + 1
            r18 = r32[r6]
            int r19 = r29.getQp()
            byte[] r20 = r0.getPlaneData(r4)
            byte[] r22 = r0.getPlaneData(r4)
            int[][] r24 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V
            int[][] r25 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V
            r26 = 0
            r17 = r28
            r21 = r5
            r23 = r6
            r17.deblockBorder(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r18 = r32[r6]
            int r19 = r29.getQp()
            byte[] r20 = r0.getPlaneData(r3)
            byte[] r22 = r0.getPlaneData(r3)
            int[][] r24 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V_CHR
            int[][] r25 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V_CHR
            r17.deblockBorderChroma(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r18 = r32[r6]
            int r19 = r29.getQp()
            byte[] r20 = r0.getPlaneData(r2)
            byte[] r22 = r0.getPlaneData(r2)
            int[][] r24 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_V_CHR
            int[][] r25 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_V_CHR
            r17.deblockBorderChroma(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = r6
            goto L59
        La7:
            if (r31 == 0) goto Lf6
            org.jcodec.common.model.Picture8Bit r5 = r31.getPixels()
            int r7 = r31.getQp()
            int r8 = r29.getQp()
            int r7 = r7 + r8
            int r7 = r7 + r3
            int r7 = r7 >> r3
            int r1 = org.jcodec.common.tools.MathUtil.clip(r7, r4, r1)
            r9 = r33[r4]
            byte[] r11 = r5.getPlaneData(r4)
            r12 = 3
            byte[] r13 = r0.getPlaneData(r4)
            r14 = 0
            int[][] r15 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H
            int[][] r16 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H
            r17 = 1
            r8 = r28
            r10 = r1
            r8.deblockBorder(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = r33[r4]
            byte[] r11 = r5.getPlaneData(r3)
            byte[] r13 = r0.getPlaneData(r3)
            int[][] r15 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H_CHR
            int[][] r16 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H_CHR
            r8.deblockBorderChroma(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = r33[r4]
            byte[] r11 = r5.getPlaneData(r2)
            byte[] r13 = r0.getPlaneData(r2)
            int[][] r15 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H_CHR
            int[][] r16 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H_CHR
            r8.deblockBorderChroma(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        Lf6:
            r1 = 0
        Lf7:
            if (r1 >= r6) goto L144
            int r5 = r1 + 1
            r19 = r33[r5]
            int r20 = r29.getQp()
            byte[] r21 = r0.getPlaneData(r4)
            byte[] r23 = r0.getPlaneData(r4)
            int[][] r25 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H
            int[][] r26 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H
            r27 = 1
            r18 = r28
            r22 = r1
            r24 = r5
            r18.deblockBorder(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r19 = r33[r5]
            int r20 = r29.getQp()
            byte[] r21 = r0.getPlaneData(r3)
            byte[] r23 = r0.getPlaneData(r3)
            int[][] r25 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H_CHR
            int[][] r26 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H_CHR
            r18.deblockBorderChroma(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r19 = r33[r5]
            int r20 = r29.getQp()
            byte[] r21 = r0.getPlaneData(r2)
            byte[] r23 = r0.getPlaneData(r2)
            int[][] r25 = org.jcodec.codecs.h264.encode.MBDeblocker.P_POS_H_CHR
            int[][] r26 = org.jcodec.codecs.h264.encode.MBDeblocker.Q_POS_H_CHR
            r18.deblockBorderChroma(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r5
            goto Lf7
        L144:
            return
    }

    public void deblockMBI(org.jcodec.codecs.h264.encode.EncodedMB r7, org.jcodec.codecs.h264.encode.EncodedMB r8, org.jcodec.codecs.h264.encode.EncodedMB r9) {
            r6 = this;
            int[][] r5 = org.jcodec.codecs.h264.encode.MBDeblocker.BS_I
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r5
            r0.deblockMBGeneric(r1, r2, r3, r4, r5)
            return
    }

    public void deblockMBP(org.jcodec.codecs.h264.encode.EncodedMB r10, org.jcodec.codecs.h264.encode.EncodedMB r11, org.jcodec.codecs.h264.encode.EncodedMB r12) {
            r9 = this;
            java.lang.Class<int> r0 = int.class
            r1 = 2
            int[] r2 = new int[r1]
            r2 = {x0032: FILL_ARRAY_DATA , data: [4, 4} // fill-array
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r0, r2)
            r7 = r2
            int[][] r7 = (int[][]) r7
            int[] r1 = new int[r1]
            r1 = {x003a: FILL_ARRAY_DATA , data: [4, 4} // fill-array
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r8 = r0
            int[][] r8 = (int[][]) r8
            int[][] r0 = org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_P_V
            int[][] r1 = org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_Q_V
            calcStrengthForBlocks(r10, r11, r7, r0, r1)
            int[][] r0 = org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_P_H
            int[][] r1 = org.jcodec.codecs.h264.encode.MBDeblocker.LOOKUP_IDX_Q_H
            calcStrengthForBlocks(r10, r12, r8, r0, r1)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r3.deblockMBGeneric(r4, r5, r6, r7, r8)
            return
    }

    protected void filterBs(int r14, int r15, int r16, byte[] r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r13 = this;
            r12 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r0._filterBs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    protected void filterBs4(int r15, int r16, byte[] r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
            r14 = this;
            r13 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r0._filterBs4(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    protected void filterBs4Chr(int r15, int r16, byte[] r17, byte[] r18, int r19, int r20, int r21, int r22) {
            r14 = this;
            r5 = -1
            r6 = -1
            r11 = -1
            r12 = -1
            r13 = 1
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0._filterBs4(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    protected void filterBsChr(int r14, int r15, int r16, byte[] r17, byte[] r18, int r19, int r20, int r21, int r22) {
            r13 = this;
            r6 = -1
            r11 = -1
            r12 = 1
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0._filterBs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }
}
