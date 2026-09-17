package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class MBEncoderP16x16 {
    private org.jcodec.codecs.h264.io.CAVLC[] cavlc;
    private org.jcodec.codecs.h264.decode.BlockInterpolator interpolator;
    private org.jcodec.codecs.h264.encode.MotionEstimator me;
    private int mvLeftX;
    private int mvLeftY;
    private int mvTopLeftX;
    private int mvTopLeftY;
    private int[] mvTopX;
    private int[] mvTopY;
    private org.jcodec.common.model.Picture8Bit ref;
    private org.jcodec.codecs.h264.io.model.SeqParameterSet sps;

    public MBEncoderP16x16(org.jcodec.codecs.h264.io.model.SeqParameterSet r1, org.jcodec.common.model.Picture8Bit r2, org.jcodec.codecs.h264.io.CAVLC[] r3, org.jcodec.codecs.h264.encode.MotionEstimator r4) {
            r0 = this;
            r0.<init>()
            r0.sps = r1
            r0.cavlc = r3
            r0.ref = r2
            r0.me = r4
            int r1 = r1.pic_width_in_mbs_minus1
            int r2 = r1 + 1
            int[] r2 = new int[r2]
            r0.mvTopX = r2
            int r1 = r1 + 1
            int[] r1 = new int[r1]
            r0.mvTopY = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator
            r1.<init>()
            r0.interpolator = r1
            return
    }

    private void chroma(org.jcodec.common.model.Picture8Bit r19, int[] r20, int[] r21, int r22, int r23, org.jcodec.common.io.BitWriter r24, int r25) {
            r18 = this;
            java.lang.Class<int> r0 = int.class
            org.jcodec.common.model.ColorSpace r1 = r19.getColor()
            int[] r1 = r1.compWidth
            r2 = 1
            r1 = r1[r2]
            org.jcodec.common.model.ColorSpace r3 = r19.getColor()
            int[] r3 = r3.compHeight
            r3 = r3[r2]
            int r1 = r1 + r3
            r3 = 16
            int r1 = r3 >> r1
            r4 = 2
            int[] r5 = new int[r4]
            r5[r2] = r3
            r6 = 0
            r5[r6] = r1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r5)
            int[][] r5 = (int[][]) r5
            int[] r7 = new int[r4]
            r7[r2] = r3
            r7[r6] = r1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r7)
            int[][] r0 = (int[][]) r0
            r1 = 0
        L33:
            int r3 = r5.length
            if (r1 >= r3) goto L4e
            r3 = 0
        L37:
            int[][] r7 = org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_2x2
            r8 = r7[r1]
            int r8 = r8.length
            if (r3 >= r8) goto L4b
            r8 = r5[r1]
            r7 = r7[r1]
            r7 = r7[r3]
            r7 = r20[r7]
            r8[r3] = r7
            int r3 = r3 + 1
            goto L37
        L4b:
            int r1 = r1 + 1
            goto L33
        L4e:
            r1 = 0
        L4f:
            int r3 = r0.length
            if (r1 >= r3) goto L6a
            r3 = 0
        L53:
            int[][] r7 = org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_2x2
            r8 = r7[r1]
            int r8 = r8.length
            if (r3 >= r8) goto L67
            r8 = r0[r1]
            r7 = r7[r1]
            r7 = r7[r3]
            r7 = r21[r7]
            r8[r3] = r7
            int r3 = r3 + 1
            goto L53
        L67:
            int r1 = r1 + 1
            goto L4f
        L6a:
            r1 = r18
            org.jcodec.codecs.h264.io.CAVLC[] r3 = r1.cavlc
            r14 = r3[r2]
            r15 = r3[r4]
            org.jcodec.codecs.h264.io.model.MBType r17 = org.jcodec.codecs.h264.io.model.MBType.P_16x16
            r7 = r19
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r5
            r13 = r0
            r16 = r17
            org.jcodec.codecs.h264.encode.MBEncoderI16x16.chromaResidual(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 0
        L86:
            int r3 = r5.length
            if (r2 >= r3) goto La1
            r3 = 0
        L8a:
            int[][] r4 = org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_2x2
            r7 = r4[r2]
            int r7 = r7.length
            if (r3 >= r7) goto L9e
            r4 = r4[r2]
            r4 = r4[r3]
            r7 = r5[r2]
            r7 = r7[r3]
            r20[r4] = r7
            int r3 = r3 + 1
            goto L8a
        L9e:
            int r2 = r2 + 1
            goto L86
        La1:
            r2 = 0
        La2:
            int r3 = r0.length
            if (r2 >= r3) goto Lbd
            r3 = 0
        La6:
            int[][] r4 = org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_2x2
            r5 = r4[r2]
            int r5 = r5.length
            if (r3 >= r5) goto Lba
            r4 = r4[r2]
            r4 = r4[r3]
            r5 = r0[r2]
            r5 = r5[r3]
            r21[r4] = r5
            int r3 = r3 + 1
            goto La6
        Lba:
            int r2 = r2 + 1
            goto La2
        Lbd:
            return
    }

    private int decideRef() {
            r1 = this;
            r0 = 0
            return r0
    }

    private int getCodedBlockPattern() {
            r1 = this;
            r0 = 47
            return r0
    }

    private void luma(org.jcodec.common.model.Picture8Bit r12, int[] r13, int r14, int r15, org.jcodec.common.io.BitWriter r16, int r17, int[] r18) {
            r11 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x006a: FILL_ARRAY_DATA , data: [16, 16} // fill-array
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r10 = 0
            r1 = 0
        L10:
            int r2 = r0.length
            if (r1 >= r2) goto L30
            r2 = 0
        L14:
            int[][] r3 = org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_4x4
            r4 = r3[r1]
            int r4 = r4.length
            if (r2 >= r4) goto L28
            r4 = r0[r1]
            r3 = r3[r1]
            r3 = r3[r2]
            r3 = r13[r3]
            r4[r2] = r3
            int r2 = r2 + 1
            goto L14
        L28:
            r2 = r0[r1]
            org.jcodec.codecs.h264.decode.CoeffTransformer.fdct4x4(r2)
            int r1 = r1 + 1
            goto L10
        L30:
            r2 = 0
            int r6 = r14 << 2
            int r7 = r15 << 2
            r1 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r8 = r0
            r9 = r17
            r1.writeAC(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
        L41:
            int r2 = r0.length
            if (r1 >= r2) goto L68
            r2 = r0[r1]
            r3 = r17
            org.jcodec.codecs.h264.decode.CoeffTransformer.dequantizeAC(r2, r3)
            r2 = r0[r1]
            org.jcodec.codecs.h264.decode.CoeffTransformer.idct4x4(r2)
            r2 = 0
        L51:
            int[][] r4 = org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_4x4
            r5 = r4[r1]
            int r5 = r5.length
            if (r2 >= r5) goto L65
            r4 = r4[r1]
            r4 = r4[r2]
            r5 = r0[r1]
            r5 = r5[r2]
            r13[r4] = r5
            int r2 = r2 + 1
            goto L51
        L65:
            int r1 = r1 + 1
            goto L41
        L68:
            return
    }

    private int[] mvEstimate(org.jcodec.common.model.Picture8Bit r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = r10.getPlaneData(r1)
            int r3 = r10.getPlaneWidth(r1)
            int r10 = r10.getPlaneHeight(r1)
            int r4 = r11 << 4
            int r5 = r12 << 4
            r7 = 16
            r8 = 16
            r1 = r2
            r2 = r3
            r3 = r10
            r6 = r0
            org.jcodec.codecs.h264.encode.MBEncoderHelper.take(r1, r2, r3, r4, r5, r6, r7, r8)
            org.jcodec.codecs.h264.encode.MotionEstimator r1 = r9.me
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            r3 = r0
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            int[] r10 = r1.estimate(r2, r3, r4, r5, r6, r7)
            return r10
    }

    private void writeAC(int r18, int r19, int r20, org.jcodec.common.io.BitWriter r21, int r22, int r23, int[][] r24, int r25) {
            r17 = this;
            r0 = r24
            r1 = 0
        L3:
            int r2 = r0.length
            if (r1 >= r2) goto L37
            int[] r2 = org.jcodec.codecs.h264.H264Const.BLK_INV_MAP
            r2 = r2[r1]
            r3 = r0[r2]
            r4 = r25
            org.jcodec.codecs.h264.decode.CoeffTransformer.quantizeAC(r3, r4)
            r3 = r17
            org.jcodec.codecs.h264.io.CAVLC[] r5 = r3.cavlc
            r6 = r5[r18]
            int[] r5 = org.jcodec.codecs.h264.H264Const.MB_BLK_OFF_LEFT
            r5 = r5[r1]
            int r8 = r22 + r5
            int[] r5 = org.jcodec.codecs.h264.H264Const.MB_BLK_OFF_TOP
            r5 = r5[r1]
            int r9 = r23 + r5
            org.jcodec.codecs.h264.io.model.MBType r11 = org.jcodec.codecs.h264.io.model.MBType.P_16x16
            r12 = r0[r2]
            org.jcodec.common.io.VLC[] r13 = org.jcodec.codecs.h264.H264Const.totalZeros16
            r14 = 0
            r15 = 16
            int[] r16 = org.jcodec.codecs.h264.decode.CoeffTransformer.zigzag4x4
            r7 = r21
            r10 = r11
            r6.writeACBlock(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r1 = r1 + 1
            goto L3
        L37:
            r3 = r17
            return
    }

    public void encodeMacroblock(org.jcodec.common.model.Picture8Bit r50, int r51, int r52, org.jcodec.common.io.BitWriter r53, org.jcodec.codecs.h264.encode.EncodedMB r54, org.jcodec.codecs.h264.encode.EncodedMB r55, org.jcodec.codecs.h264.encode.EncodedMB r56, int r57, int r58) {
            r49 = this;
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r53
            r13 = r54
            org.jcodec.common.model.ColorSpace r0 = r50.getColor()
            int[] r0 = r0.compWidth
            r14 = 1
            r15 = r0[r14]
            org.jcodec.common.model.ColorSpace r0 = r50.getColor()
            int[] r0 = r0.compHeight
            r16 = r0[r14]
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r9.sps
            int r0 = r0.num_ref_frames
            if (r0 <= r14) goto L2d
            int r0 = r49.decideRef()
            org.jcodec.codecs.h264.io.model.SeqParameterSet r1 = r9.sps
            int r1 = r1.num_ref_frames
            int r1 = r1 - r14
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeTE(r12, r0, r1)
        L2d:
            r8 = 0
            if (r52 <= 0) goto L39
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r9.sps
            int r0 = r0.pic_width_in_mbs_minus1
            if (r11 >= r0) goto L39
            r17 = 1
            goto L3b
        L39:
            r17 = 0
        L3b:
            if (r11 <= 0) goto L42
            if (r52 <= 0) goto L42
            r18 = 1
            goto L44
        L42:
            r18 = 0
        L44:
            int r1 = r9.mvLeftX
            int[] r0 = r9.mvTopX
            r2 = r0[r11]
            if (r17 == 0) goto L52
            int r3 = r11 + 1
            r0 = r0[r3]
            r3 = r0
            goto L53
        L52:
            r3 = 0
        L53:
            if (r18 == 0) goto L59
            int r0 = r9.mvTopLeftX
            r4 = r0
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r11 <= 0) goto L5e
            r5 = 1
            goto L5f
        L5e:
            r5 = 0
        L5f:
            if (r52 <= 0) goto L63
            r6 = 1
            goto L64
        L63:
            r6 = 0
        L64:
            r0 = r49
            r7 = r17
            r14 = 0
            r8 = r18
            int r19 = r0.median(r1, r2, r3, r4, r5, r6, r7, r8)
            int r1 = r9.mvLeftY
            int[] r0 = r9.mvTopY
            r2 = r0[r11]
            if (r17 == 0) goto L7d
            int r3 = r11 + 1
            r0 = r0[r3]
            r3 = r0
            goto L7e
        L7d:
            r3 = 0
        L7e:
            if (r18 == 0) goto L84
            int r0 = r9.mvTopLeftY
            r4 = r0
            goto L85
        L84:
            r4 = 0
        L85:
            if (r11 <= 0) goto L89
            r5 = 1
            goto L8a
        L89:
            r5 = 0
        L8a:
            if (r52 <= 0) goto L8e
            r6 = 1
            goto L8f
        L8e:
            r6 = 0
        L8f:
            r0 = r49
            r7 = r17
            r8 = r18
            int r6 = r0.median(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r50
            r2 = r51
            r3 = r52
            r4 = r19
            r5 = r6
            int[] r8 = r0.mvEstimate(r1, r2, r3, r4, r5)
            int[] r0 = r9.mvTopX
            r1 = r0[r11]
            r9.mvTopLeftX = r1
            int[] r1 = r9.mvTopY
            r2 = r1[r11]
            r9.mvTopLeftY = r2
            r2 = r8[r14]
            r0[r11] = r2
            r0 = 1
            r2 = r8[r0]
            r1[r11] = r2
            r1 = r8[r14]
            r9.mvLeftX = r1
            r1 = r8[r0]
            r9.mvLeftY = r1
            r1 = r8[r14]
            int r1 = r1 - r19
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSE(r12, r1)
            r1 = r8[r0]
            int r1 = r1 - r6
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSE(r12, r1)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r9.sps
            org.jcodec.common.model.ColorSpace r0 = r0.chroma_format_idc
            r1 = 16
            org.jcodec.common.model.Picture8Bit r7 = org.jcodec.common.model.Picture8Bit.create(r1, r1, r0)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r9.sps
            org.jcodec.common.model.ColorSpace r0 = r0.chroma_format_idc
            org.jcodec.common.model.Picture r6 = org.jcodec.common.model.Picture.create(r1, r1, r0)
            org.jcodec.codecs.h264.decode.BlockInterpolator r0 = r9.interpolator
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            r22 = 0
            int r3 = r11 << 6
            r4 = r8[r14]
            int r23 = r3 + r4
            int r4 = r52 << 6
            r5 = 1
            r17 = r8[r5]
            int r24 = r4 + r17
            r25 = 16
            r26 = 16
            r19 = r0
            r20 = r2
            r21 = r7
            r19.getBlockLuma(r20, r21, r22, r23, r24, r25, r26)
            org.jcodec.codecs.h264.decode.BlockInterpolator r0 = r9.interpolator
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            r5 = 1
            byte[] r28 = r2.getPlaneData(r5)
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            int r29 = r2.getPlaneWidth(r5)
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            int r30 = r2.getPlaneHeight(r5)
            byte[] r31 = r7.getPlaneData(r5)
            r32 = 0
            int r33 = r7.getPlaneWidth(r5)
            r2 = r8[r14]
            int r34 = r3 + r2
            r2 = r8[r5]
            int r35 = r4 + r2
            r36 = 8
            r37 = 8
            r27 = r0
            r27.getBlockChroma(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            org.jcodec.codecs.h264.decode.BlockInterpolator r0 = r9.interpolator
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            r5 = 2
            byte[] r39 = r2.getPlaneData(r5)
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            int r40 = r2.getPlaneWidth(r5)
            org.jcodec.common.model.Picture8Bit r2 = r9.ref
            int r41 = r2.getPlaneHeight(r5)
            byte[] r42 = r7.getPlaneData(r5)
            r43 = 0
            int r44 = r7.getPlaneWidth(r5)
            r2 = r8[r14]
            int r45 = r3 + r2
            r2 = 1
            r3 = r8[r2]
            int r46 = r4 + r3
            r47 = 8
            r48 = 8
            r38 = r0
            r38.getBlockChroma(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            byte[] r19 = r10.getPlaneData(r14)
            int r20 = r10.getPlaneWidth(r14)
            int r21 = r10.getPlaneHeight(r14)
            int r22 = r11 << 4
            int r23 = r52 << 4
            int[] r24 = r6.getPlaneData(r14)
            byte[] r25 = r7.getPlaneData(r14)
            r27 = 16
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 1
            byte[] r19 = r10.getPlaneData(r0)
            int r20 = r10.getPlaneWidth(r0)
            int r21 = r10.getPlaneHeight(r0)
            int r17 = 4 - r15
            int r2 = r11 << r17
            int r3 = 4 - r16
            int r3 = r52 << r3
            int[] r24 = r6.getPlaneData(r0)
            byte[] r25 = r7.getPlaneData(r0)
            int r15 = r1 >> r15
            int r16 = r1 >> r16
            r22 = r2
            r23 = r3
            r26 = r15
            r27 = r16
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            byte[] r22 = r10.getPlaneData(r5)
            int r23 = r10.getPlaneWidth(r5)
            int r24 = r10.getPlaneHeight(r5)
            int[] r27 = r6.getPlaneData(r5)
            byte[] r28 = r7.getPlaneData(r5)
            r25 = r2
            r26 = r3
            r29 = r15
            r30 = r16
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSubtract(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r0 = r49.getCodedBlockPattern()
            int[] r1 = org.jcodec.codecs.h264.H264Const.CODED_BLOCK_PATTERN_INTER_COLOR_INV
            r0 = r1[r0]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUE(r12, r0)
            r0 = r58
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSE(r12, r0)
            int[] r2 = r6.getPlaneData(r14)
            int[] r18 = r54.getNc()
            r0 = r49
            r1 = r50
            r3 = r51
            r4 = r52
            r14 = 2
            r5 = r53
            r14 = r6
            r6 = r57
            r9 = r7
            r7 = r18
            r0.luma(r1, r2, r3, r4, r5, r6, r7)
            r0 = 1
            int[] r2 = r14.getPlaneData(r0)
            r0 = 2
            int[] r3 = r14.getPlaneData(r0)
            r0 = r49
            r4 = r51
            r5 = r52
            r6 = r53
            r7 = r57
            r0.chroma(r1, r2, r3, r4, r5, r6, r7)
            org.jcodec.common.model.Picture8Bit r0 = r54.getPixels()
            r1 = 0
            byte[] r21 = r0.getPlaneData(r1)
            int[] r22 = r14.getPlaneData(r1)
            byte[] r23 = r9.getPlaneData(r1)
            r24 = 4
            r25 = 0
            r26 = 0
            r27 = 16
            r28 = 16
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r21, r22, r23, r24, r25, r26, r27, r28)
            org.jcodec.common.model.Picture8Bit r0 = r54.getPixels()
            r1 = 1
            byte[] r22 = r0.getPlaneData(r1)
            int[] r23 = r14.getPlaneData(r1)
            byte[] r24 = r9.getPlaneData(r1)
            r27 = 0
            r25 = r17
            r28 = r15
            r29 = r16
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r22, r23, r24, r25, r26, r27, r28, r29)
            org.jcodec.common.model.Picture8Bit r0 = r54.getPixels()
            r1 = 2
            byte[] r22 = r0.getPlaneData(r1)
            int[] r23 = r14.getPlaneData(r1)
            byte[] r24 = r9.getPlaneData(r1)
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlk(r22, r23, r24, r25, r26, r27, r28, r29)
            int[] r0 = r54.getMx()
            r1 = 0
            r1 = r8[r1]
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r54.getMy()
            r1 = 1
            r1 = r8[r1]
            java.util.Arrays.fill(r0, r1)
            org.jcodec.codecs.h264.io.model.MBType r0 = org.jcodec.codecs.h264.io.model.MBType.P_16x16
            r13.setType(r0)
            r0 = r57
            r13.setQp(r0)
            org.jcodec.codecs.h264.encode.MBDeblocker r0 = new org.jcodec.codecs.h264.encode.MBDeblocker
            r0.<init>()
            r1 = r55
            r2 = r56
            r0.deblockMBP(r13, r1, r2)
            return
    }

    public int median(int r1, int r2, int r3, int r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            if (r7 != 0) goto L4
            r3 = r4
            r7 = r8
        L4:
            if (r5 == 0) goto Le
            if (r6 != 0) goto Le
            if (r7 != 0) goto Le
            r2 = r1
            r3 = r2
            r6 = r5
            r7 = r6
        Le:
            r4 = 0
            if (r5 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r6 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            if (r7 == 0) goto L1a
            goto L1b
        L1a:
            r3 = 0
        L1b:
            int r4 = r1 + r2
            int r4 = r4 + r3
            int r5 = java.lang.Math.min(r1, r2)
            int r5 = java.lang.Math.min(r5, r3)
            int r4 = r4 - r5
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = java.lang.Math.max(r1, r3)
            int r4 = r4 - r1
            return r4
    }
}
