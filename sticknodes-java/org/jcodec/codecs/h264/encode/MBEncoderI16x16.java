package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class MBEncoderI16x16 {
    private static int[] DUMMY;
    private org.jcodec.codecs.h264.io.CAVLC[] cavlc;
    private byte[][] leftRow;
    private byte[][] topLine;

    static {
            r0 = 16
            int[] r0 = new int[r0]
            org.jcodec.codecs.h264.encode.MBEncoderI16x16.DUMMY = r0
            return
    }

    public MBEncoderI16x16(org.jcodec.codecs.h264.io.CAVLC[] r1, byte[][] r2, byte[][] r3) {
            r0 = this;
            r0.<init>()
            r0.cavlc = r1
            r0.leftRow = r2
            r0.topLine = r3
            return
    }

    private void chroma(org.jcodec.common.model.Picture8Bit r30, int r31, int r32, org.jcodec.common.io.BitWriter r33, int r34, org.jcodec.common.model.Picture8Bit r35) {
            r29 = this;
            java.lang.Class<byte> r0 = byte.class
            java.lang.Class<int> r1 = int.class
            org.jcodec.common.model.ColorSpace r2 = r30.getColor()
            int[] r2 = r2.compWidth
            r3 = 1
            r2 = r2[r3]
            org.jcodec.common.model.ColorSpace r4 = r30.getColor()
            int[] r4 = r4.compHeight
            r13 = r4[r3]
            int r4 = 4 - r2
            int r25 = r31 << r4
            int r4 = 4 - r13
            int r26 = r32 << r4
            int r4 = r2 + r13
            r5 = 16
            int r4 = r5 >> r4
            r15 = 2
            int[] r6 = new int[r15]
            r6[r3] = r5
            r7 = 0
            r6[r7] = r4
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r1, r6)
            r27 = r6
            int[][] r27 = (int[][]) r27
            int[] r6 = new int[r15]
            r6[r3] = r5
            r6[r7] = r4
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r6)
            int[][] r1 = (int[][]) r1
            int[] r6 = new int[r15]
            r6[r3] = r5
            r6[r7] = r4
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r0, r6)
            r28 = r6
            byte[][] r28 = (byte[][]) r28
            int[] r6 = new int[r15]
            r6[r3] = r5
            r6[r7] = r4
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r6)
            byte[][] r0 = (byte[][]) r0
            r8 = 1
            r4 = r29
            r5 = r30
            r6 = r27
            r7 = r28
            r9 = r2
            r10 = r13
            r11 = r25
            r12 = r26
            r4.predictChroma(r5, r6, r7, r8, r9, r10, r11, r12)
            r8 = 2
            r6 = r1
            r7 = r0
            r4.predictChroma(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r29
            org.jcodec.codecs.h264.io.CAVLC[] r4 = r2.cavlc
            r21 = r4[r3]
            r22 = r4[r15]
            org.jcodec.codecs.h264.io.model.MBType r24 = org.jcodec.codecs.h264.io.model.MBType.I_16x16
            r14 = r30
            r4 = 2
            r15 = r31
            r16 = r32
            r17 = r33
            r18 = r34
            r19 = r27
            r20 = r1
            r23 = r24
            chromaResidual(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            byte[][] r5 = r35.getData()
            r6 = r5[r3]
            r7 = 1
            r5 = r29
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r5.putChroma(r6, r7, r8, r9, r10, r11)
            byte[][] r3 = r35.getData()
            r6 = r3[r4]
            r7 = 2
            r10 = r1
            r11 = r0
            r5.putChroma(r6, r7, r8, r9, r10, r11)
            return
    }

    private void chromaPredBlk0(int r4, int r5, int r6, byte[] r7) {
            r3 = this;
            r0 = r6 & 7
            r1 = 0
            if (r5 == 0) goto L14
            if (r6 == 0) goto L14
            byte[][] r6 = r3.leftRow
            r6 = r6[r4]
            byte[][] r2 = r3.topLine
            r4 = r2[r4]
            int r4 = r3.chromaPredTwo(r6, r4, r0, r5)
            goto L2b
        L14:
            if (r5 == 0) goto L1f
            byte[][] r5 = r3.leftRow
            r4 = r5[r4]
            int r4 = r3.chromaPredOne(r4, r0)
            goto L2b
        L1f:
            if (r6 == 0) goto L2a
            byte[][] r6 = r3.topLine
            r4 = r6[r4]
            int r4 = r3.chromaPredOne(r4, r5)
            goto L2b
        L2a:
            r4 = 0
        L2b:
            int r5 = r7.length
            if (r1 >= r5) goto L37
            r5 = r7[r1]
            int r5 = r5 + r4
            byte r5 = (byte) r5
            r7[r1] = r5
            int r1 = r1 + 1
            goto L2b
        L37:
            return
    }

    private void chromaPredBlk1(int r3, int r4, int r5, byte[] r6) {
            r2 = this;
            r0 = r5 & 7
            r1 = 0
            if (r5 == 0) goto L10
            byte[][] r5 = r2.topLine
            r3 = r5[r3]
            int r4 = r4 + 4
            int r3 = r2.chromaPredOne(r3, r4)
            goto L1c
        L10:
            if (r4 == 0) goto L1b
            byte[][] r4 = r2.leftRow
            r3 = r4[r3]
            int r3 = r2.chromaPredOne(r3, r0)
            goto L1c
        L1b:
            r3 = 0
        L1c:
            int r4 = r6.length
            if (r1 >= r4) goto L28
            r4 = r6[r1]
            int r4 = r4 + r3
            byte r4 = (byte) r4
            r6[r1] = r4
            int r1 = r1 + 1
            goto L1c
        L28:
            return
    }

    private void chromaPredBlk2(int r3, int r4, int r5, byte[] r6) {
            r2 = this;
            r0 = r5 & 7
            r1 = 0
            if (r4 == 0) goto L10
            byte[][] r4 = r2.leftRow
            r3 = r4[r3]
            int r0 = r0 + 4
            int r3 = r2.chromaPredOne(r3, r0)
            goto L1c
        L10:
            if (r5 == 0) goto L1b
            byte[][] r5 = r2.topLine
            r3 = r5[r3]
            int r3 = r2.chromaPredOne(r3, r4)
            goto L1c
        L1b:
            r3 = 0
        L1c:
            int r4 = r6.length
            if (r1 >= r4) goto L28
            r4 = r6[r1]
            int r4 = r4 + r3
            byte r4 = (byte) r4
            r6[r1] = r4
            int r1 = r1 + 1
            goto L1c
        L28:
            return
    }

    private void chromaPredBlk3(int r4, int r5, int r6, byte[] r7) {
            r3 = this;
            r0 = r6 & 7
            r1 = 0
            if (r5 == 0) goto L18
            if (r6 == 0) goto L18
            byte[][] r6 = r3.leftRow
            r6 = r6[r4]
            byte[][] r2 = r3.topLine
            r4 = r2[r4]
            int r0 = r0 + 4
            int r5 = r5 + 4
            int r4 = r3.chromaPredTwo(r6, r4, r0, r5)
            goto L33
        L18:
            if (r5 == 0) goto L25
            byte[][] r5 = r3.leftRow
            r4 = r5[r4]
            int r0 = r0 + 4
            int r4 = r3.chromaPredOne(r4, r0)
            goto L33
        L25:
            if (r6 == 0) goto L32
            byte[][] r6 = r3.topLine
            r4 = r6[r4]
            int r5 = r5 + 4
            int r4 = r3.chromaPredOne(r4, r5)
            goto L33
        L32:
            r4 = 0
        L33:
            int r5 = r7.length
            if (r1 >= r5) goto L3f
            r5 = r7[r1]
            int r5 = r5 + r4
            byte r5 = (byte) r5
            r7[r1] = r5
            int r1 = r1 + 1
            goto L33
        L3f:
            return
    }

    private final int chromaPredOne(byte[] r3, int r4) {
            r2 = this;
            r0 = r3[r4]
            int r1 = r4 + 1
            r1 = r3[r1]
            int r0 = r0 + r1
            int r1 = r4 + 2
            r1 = r3[r1]
            int r0 = r0 + r1
            int r4 = r4 + 3
            r3 = r3[r4]
            int r0 = r0 + r3
            int r0 = r0 + 2
            int r3 = r0 >> 2
            return r3
    }

    private final int chromaPredTwo(byte[] r3, byte[] r4, int r5, int r6) {
            r2 = this;
            r0 = r3[r5]
            int r1 = r5 + 1
            r1 = r3[r1]
            int r0 = r0 + r1
            int r1 = r5 + 2
            r1 = r3[r1]
            int r0 = r0 + r1
            int r5 = r5 + 3
            r3 = r3[r5]
            int r0 = r0 + r3
            r3 = r4[r6]
            int r0 = r0 + r3
            int r3 = r6 + 1
            r3 = r4[r3]
            int r0 = r0 + r3
            int r3 = r6 + 2
            r3 = r4[r3]
            int r0 = r0 + r3
            int r6 = r6 + 3
            r3 = r4[r6]
            int r0 = r0 + r3
            int r0 = r0 + 4
            int r3 = r0 >> 3
            return r3
    }

    public static void chromaResidual(org.jcodec.common.model.Picture8Bit r16, int r17, int r18, org.jcodec.common.io.BitWriter r19, int r20, int[][] r21, int[][] r22, org.jcodec.codecs.h264.io.CAVLC r23, org.jcodec.codecs.h264.io.CAVLC r24, org.jcodec.codecs.h264.io.model.MBType r25, org.jcodec.codecs.h264.io.model.MBType r26) {
            r11 = r20
            transformChroma(r21)
            transformChroma(r22)
            int[] r12 = extractDC(r21)
            int[] r13 = extractDC(r22)
            int r14 = r17 << 1
            int r15 = r18 << 1
            r0 = r23
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r14
            r6 = r15
            r7 = r12
            r8 = r25
            r9 = r26
            writeDC(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r24
            r7 = r13
            writeDC(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r10 = org.jcodec.codecs.h264.encode.MBEncoderI16x16.DUMMY
            r0 = r23
            r4 = r14
            r5 = r15
            r6 = r21
            r7 = r20
            writeAC(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r10 = org.jcodec.codecs.h264.encode.MBEncoderI16x16.DUMMY
            r0 = r24
            r6 = r22
            writeAC(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r21
            restorePlane(r12, r0, r11)
            r0 = r22
            restorePlane(r13, r0, r11)
            return
    }

    private static int[] extractDC(int[][] r4) {
            int r0 = r4.length
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
        L5:
            int r3 = r4.length
            if (r2 >= r3) goto L15
            r3 = r4[r2]
            r3 = r3[r1]
            r0[r2] = r3
            r3 = r4[r2]
            r3[r1] = r1
            int r2 = r2 + 1
            goto L5
        L15:
            return r0
    }

    private void luma(org.jcodec.common.model.Picture8Bit r19, int r20, int r21, org.jcodec.common.io.BitWriter r22, int r23, org.jcodec.common.model.Picture8Bit r24, org.jcodec.codecs.h264.io.CAVLC r25) {
            r18 = this;
            int r5 = r20 << 4
            int r6 = r21 << 4
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x0080: FILL_ARRAY_DATA , data: [16, 16} // fill-array
            java.lang.Class<int> r2 = int.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            r11 = r1
            int[][] r11 = (int[][]) r11
            int[] r0 = new int[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [16, 16} // fill-array
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            r12 = r0
            byte[][] r12 = (byte[][]) r12
            r13 = r18
            r13.lumaDCPred(r5, r6, r12)
            r2 = 0
            r0 = r18
            r1 = r19
            r3 = r11
            r4 = r12
            r0.transform(r1, r2, r3, r4, r5, r6)
            int[] r14 = extractDC(r11)
            int r10 = r20 << 2
            int r15 = r21 << 2
            org.jcodec.codecs.h264.io.model.MBType r16 = org.jcodec.codecs.h264.io.model.MBType.I_16x16
            r0 = r25
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r10
            r6 = r15
            r7 = r14
            r8 = r16
            r9 = r16
            writeDC(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r17 = org.jcodec.codecs.h264.encode.MBEncoderI16x16.DUMMY
            r4 = r10
            r5 = r15
            r6 = r11
            r7 = r23
            r10 = r17
            writeAC(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r23
            restorePlane(r14, r11, r0)
            r0 = 0
            r1 = 0
        L61:
            int r2 = r11.length
            if (r1 >= r2) goto L7f
            r2 = r24
            byte[] r3 = r2.getPlaneData(r0)
            r4 = r11[r1]
            r5 = r12[r1]
            r6 = 4
            int[] r7 = org.jcodec.codecs.h264.H264Const.BLK_X
            r7 = r7[r1]
            int[] r8 = org.jcodec.codecs.h264.H264Const.BLK_Y
            r8 = r8[r1]
            r9 = 4
            r10 = 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = r1 + 1
            goto L61
        L7f:
            return
    }

    private void lumaDCPred(int r5, int r6, byte[][] r7) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L7
            if (r6 != 0) goto L7
            r5 = 0
            goto L37
        L7:
            if (r6 != 0) goto L16
            byte[][] r5 = r4.leftRow
            r5 = r5[r0]
            int r5 = org.jcodec.common.ArrayUtil.sumByte(r5)
        L11:
            int r5 = r5 + 8
            int r5 = r5 >> 4
            goto L37
        L16:
            r6 = 16
            if (r5 != 0) goto L23
            byte[][] r1 = r4.topLine
            r1 = r1[r0]
            int r5 = org.jcodec.common.ArrayUtil.sumByte3(r1, r5, r6)
            goto L11
        L23:
            byte[][] r1 = r4.leftRow
            r1 = r1[r0]
            int r1 = org.jcodec.common.ArrayUtil.sumByte(r1)
            byte[][] r2 = r4.topLine
            r2 = r2[r0]
            int r5 = org.jcodec.common.ArrayUtil.sumByte3(r2, r5, r6)
            int r1 = r1 + r5
            int r1 = r1 + r6
            int r5 = r1 >> 5
        L37:
            r6 = 0
        L38:
            int r1 = r7.length
            if (r6 >= r1) goto L4f
            r1 = 0
        L3c:
            r2 = r7[r6]
            int r2 = r2.length
            if (r1 >= r2) goto L4c
            r2 = r7[r6]
            r3 = r2[r1]
            int r3 = r3 + r5
            byte r3 = (byte) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L3c
        L4c:
            int r6 = r6 + 1
            goto L38
        L4f:
            return
    }

    private void predictChroma(org.jcodec.common.model.Picture8Bit r27, int[][] r28, byte[][] r29, int r30, int r31, int r32, int r33, int r34) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r30
            r12 = r33
            r13 = r34
            r3 = 0
            r4 = r29[r3]
            r0.chromaPredBlk0(r2, r12, r13, r4)
            r14 = 1
            r4 = r29[r14]
            r0.chromaPredBlk1(r2, r12, r13, r4)
            r15 = 2
            r4 = r29[r15]
            r0.chromaPredBlk2(r2, r12, r13, r4)
            r16 = 3
            r4 = r29[r16]
            r0.chromaPredBlk3(r2, r12, r13, r4)
            byte[] r4 = r1.getPlaneData(r2)
            int r5 = r1.getPlaneWidth(r2)
            int r6 = r1.getPlaneHeight(r2)
            r8 = r28[r3]
            r9 = r29[r3]
            r10 = 4
            r11 = 4
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r33
            r7 = r34
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            byte[] r3 = r1.getPlaneData(r2)
            int r4 = r1.getPlaneWidth(r2)
            int r5 = r1.getPlaneHeight(r2)
            int r20 = r12 + 4
            r8 = r28[r14]
            r9 = r29[r14]
            r6 = r20
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            byte[] r3 = r1.getPlaneData(r2)
            int r4 = r1.getPlaneWidth(r2)
            int r5 = r1.getPlaneHeight(r2)
            int r21 = r13 + 4
            r8 = r28[r15]
            r9 = r29[r15]
            r6 = r33
            r7 = r21
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            byte[] r17 = r1.getPlaneData(r2)
            int r18 = r1.getPlaneWidth(r2)
            int r19 = r1.getPlaneHeight(r2)
            r22 = r28[r16]
            r23 = r29[r16]
            r24 = 4
            r25 = 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
    }

    private void putChroma(byte[] r9, int r10, int r11, int r12, int[][] r13, byte[][] r14) {
            r8 = this;
            r10 = 0
            r1 = r13[r10]
            r2 = r14[r10]
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 4
            r7 = 4
            r0 = r9
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            r1 = r13[r10]
            r2 = r14[r10]
            r4 = 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = 2
            r1 = r13[r10]
            r2 = r14[r10]
            r4 = 0
            r5 = 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = 3
            r1 = r13[r10]
            r2 = r14[r10]
            r4 = 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static void restorePlane(int[] r4, int[][] r5, int r6) {
            int r0 = r4.length
            r1 = 4
            if (r0 != r1) goto Lb
            org.jcodec.codecs.h264.decode.CoeffTransformer.invDC2x2(r4)
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantizeDC2x2(r4, r6)
            goto L20
        Lb:
            int r0 = r4.length
            r1 = 8
            if (r0 != r1) goto L17
            org.jcodec.codecs.h264.decode.CoeffTransformer.invDC4x2(r4)
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantizeDC4x2(r4, r6)
            goto L20
        L17:
            org.jcodec.codecs.h264.decode.CoeffTransformer.invDC4x4(r4)
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantizeDC4x4(r4, r6)
            org.jcodec.codecs.h264.decode.CoeffTransformer.reorderDC4x4(r4)
        L20:
            r0 = 0
            r1 = 0
        L22:
            int r2 = r5.length
            if (r1 >= r2) goto L38
            r2 = r5[r1]
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantizeAC(r2, r6)
            r2 = r5[r1]
            r3 = r4[r1]
            r2[r0] = r3
            r2 = r5[r1]
            org.jcodec.codecs.h264.decode.CoeffTransformer.idct4x4(r2)
            int r1 = r1 + 1
            goto L22
        L38:
            return
    }

    private void transform(org.jcodec.common.model.Picture8Bit r13, int r14, int[][] r15, byte[][] r16, int r17, int r18) {
            r12 = this;
            r0 = r15
            r1 = 0
        L2:
            int r2 = r0.length
            if (r1 >= r2) goto L2d
            r2 = r0[r1]
            byte[] r3 = r13.getPlaneData(r14)
            int r4 = r13.getPlaneWidth(r14)
            int r5 = r13.getPlaneHeight(r14)
            int[] r6 = org.jcodec.codecs.h264.H264Const.BLK_X
            r6 = r6[r1]
            int r6 = r17 + r6
            int[] r7 = org.jcodec.codecs.h264.H264Const.BLK_Y
            r7 = r7[r1]
            int r7 = r18 + r7
            r9 = r16[r1]
            r10 = 4
            r11 = 4
            r8 = r2
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            org.jcodec.codecs.h264.decode.CoeffTransformer.fdct4x4(r2)
            int r1 = r1 + 1
            goto L2
        L2d:
            return
    }

    private static void transformChroma(int[][] r2) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto Lc
            r1 = r2[r0]
            org.jcodec.codecs.h264.decode.CoeffTransformer.fdct4x4(r1)
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    private static void writeAC(org.jcodec.codecs.h264.io.CAVLC r16, int r17, int r18, org.jcodec.common.io.BitWriter r19, int r20, int r21, int[][] r22, int r23, org.jcodec.codecs.h264.io.model.MBType r24, org.jcodec.codecs.h264.io.model.MBType r25, int[] r26) {
            r0 = r22
            r1 = 0
        L3:
            int r2 = r0.length
            if (r1 >= r2) goto L3b
            r2 = r0[r1]
            r3 = r23
            org.jcodec.codecs.h264.decode.CoeffTransformer.quantizeAC(r2, r3)
            int[] r2 = org.jcodec.codecs.h264.H264Const.BLK_INV_MAP
            r2 = r2[r1]
            int[] r4 = org.jcodec.codecs.h264.H264Const.MB_BLK_OFF_LEFT
            r4 = r4[r1]
            int r7 = r20 + r4
            int[] r4 = org.jcodec.codecs.h264.H264Const.MB_BLK_OFF_TOP
            r4 = r4[r1]
            int r8 = r21 + r4
            r11 = r0[r1]
            org.jcodec.common.io.VLC[] r12 = org.jcodec.codecs.h264.H264Const.totalZeros16
            r13 = 1
            r14 = 15
            int[] r15 = org.jcodec.codecs.h264.decode.CoeffTransformer.zigzag4x4
            r5 = r16
            r6 = r19
            r9 = r24
            r10 = r25
            int r4 = r5.writeACBlock(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r4 = org.jcodec.codecs.h264.io.CAVLC.totalCoeff(r4)
            r26[r2] = r4
            int r1 = r1 + 1
            goto L3
        L3b:
            return
    }

    private static void writeDC(org.jcodec.codecs.h264.io.CAVLC r11, int r12, int r13, org.jcodec.common.io.BitWriter r14, int r15, int r16, int r17, int[] r18, org.jcodec.codecs.h264.io.model.MBType r19, org.jcodec.codecs.h264.io.model.MBType r20) {
            r0 = r15
            r6 = r18
            int r1 = r6.length
            r2 = 4
            if (r1 != r2) goto L1f
            org.jcodec.codecs.h264.decode.CoeffTransformer.quantizeDC2x2(r6, r15)
            org.jcodec.codecs.h264.decode.CoeffTransformer.fvdDC2x2(r18)
            org.jcodec.common.io.VLC[] r3 = org.jcodec.codecs.h264.H264Const.totalZeros4
            r4 = 0
            int r5 = r6.length
            int[] r7 = new int[r2]
            r7 = {x005c: FILL_ARRAY_DATA , data: [0, 1, 2, 3} // fill-array
            r0 = r11
            r1 = r14
            r2 = r18
            r6 = r7
            r0.writeChrDCBlock(r1, r2, r3, r4, r5, r6)
            goto L5b
        L1f:
            int r1 = r6.length
            r2 = 8
            if (r1 != r2) goto L3c
            org.jcodec.codecs.h264.decode.CoeffTransformer.quantizeDC4x2(r6, r15)
            org.jcodec.codecs.h264.decode.CoeffTransformer.fvdDC4x2(r18)
            org.jcodec.common.io.VLC[] r3 = org.jcodec.codecs.h264.H264Const.totalZeros8
            r4 = 0
            int r5 = r6.length
            int[] r7 = new int[r2]
            r7 = {x0068: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7} // fill-array
            r0 = r11
            r1 = r14
            r2 = r18
            r6 = r7
            r0.writeChrDCBlock(r1, r2, r3, r4, r5, r6)
            goto L5b
        L3c:
            org.jcodec.codecs.h264.decode.CoeffTransformer.reorderDC4x4(r18)
            org.jcodec.codecs.h264.decode.CoeffTransformer.quantizeDC4x4(r6, r15)
            org.jcodec.codecs.h264.decode.CoeffTransformer.fvdDC4x4(r18)
            org.jcodec.common.io.VLC[] r7 = org.jcodec.codecs.h264.H264Const.totalZeros16
            r8 = 0
            r9 = 16
            int[] r10 = org.jcodec.codecs.h264.decode.CoeffTransformer.zigzag4x4
            r0 = r11
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r18
            r0.writeLumaDCBlock(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L5b:
            return
    }

    public void encodeMacroblock(org.jcodec.common.model.Picture8Bit r13, int r14, int r15, org.jcodec.common.io.BitWriter r16, org.jcodec.codecs.h264.encode.EncodedMB r17, org.jcodec.codecs.h264.encode.EncodedMB r18, org.jcodec.codecs.h264.encode.EncodedMB r19, int r20, int r21) {
            r12 = this;
            r8 = r16
            r9 = r17
            r0 = 0
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUE(r8, r0)
            r1 = r21
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSE(r8, r1)
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.I_16x16
            r9.setType(r1)
            r10 = r20
            r9.setQp(r10)
            org.jcodec.common.model.Picture8Bit r6 = r17.getPixels()
            r11 = r12
            org.jcodec.codecs.h264.io.CAVLC[] r1 = r11.cavlc
            r7 = r1[r0]
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r20
            r0.luma(r1, r2, r3, r4, r5, r6, r7)
            org.jcodec.common.model.Picture8Bit r6 = r17.getPixels()
            r0.chroma(r1, r2, r3, r4, r5, r6)
            org.jcodec.codecs.h264.encode.MBDeblocker r0 = new org.jcodec.codecs.h264.encode.MBDeblocker
            r0.<init>()
            r1 = r18
            r2 = r19
            r0.deblockMBI(r9, r1, r2)
            return
    }

    public int getCbpChroma(org.jcodec.common.model.Picture8Bit r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            return r1
    }

    public int getCbpLuma(org.jcodec.common.model.Picture8Bit r1, int r2, int r3) {
            r0 = this;
            r1 = 15
            return r1
    }

    public int getPredMode(org.jcodec.common.model.Picture8Bit r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            return r1
    }
}
