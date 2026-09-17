package org.jcodec.codecs.h264;

/* loaded from: classes2.dex */
public class H264Encoder extends org.jcodec.common.VideoEncoder {
    private org.jcodec.codecs.h264.io.CAVLC[] cavlc;
    private int frameNumber;
    private int keyInterval;
    private byte[][] leftRow;
    private int maxFrameNumber;
    private int maxPOC;
    private org.jcodec.codecs.h264.encode.MBEncoderI16x16 mbEncoderI16x16;
    private org.jcodec.codecs.h264.encode.MBEncoderP16x16 mbEncoderP16x16;
    private org.jcodec.codecs.h264.encode.EncodedMB outMB;
    private org.jcodec.common.model.Picture8Bit picOut;
    private org.jcodec.codecs.h264.io.model.PictureParameterSet pps;
    private org.jcodec.codecs.h264.encode.RateControl rc;
    private org.jcodec.common.model.Picture8Bit ref;
    private org.jcodec.codecs.h264.io.model.SeqParameterSet sps;
    private org.jcodec.codecs.h264.encode.EncodedMB[] topEncoded;
    private byte[][] topLine;

    public H264Encoder(org.jcodec.codecs.h264.encode.RateControl r1) {
            r0 = this;
            r0.<init>()
            r0.rc = r1
            r1 = 25
            r0.keyInterval = r1
            return
    }

    private void addToReference(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L15
            org.jcodec.common.model.Picture8Bit r0 = r3.picOut
            org.jcodec.codecs.h264.encode.EncodedMB[] r1 = r3.topEncoded
            r1 = r1[r4]
            org.jcodec.common.model.Picture8Bit r1 = r1.getPixels()
            int r2 = r4 << 4
            int r5 = r5 + (-1)
            int r5 = r5 << 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlkPic(r0, r1, r2, r5)
        L15:
            org.jcodec.codecs.h264.encode.EncodedMB[] r5 = r3.topEncoded
            r0 = r5[r4]
            org.jcodec.codecs.h264.encode.EncodedMB r1 = r3.outMB
            r5[r4] = r1
            r3.outMB = r0
            return
    }

    private void collectPredictors(org.jcodec.common.model.Picture8Bit r9, int r10) {
            r8 = this;
            r0 = 0
            byte[] r1 = r9.getPlaneData(r0)
            byte[][] r2 = r8.topLine
            r2 = r2[r0]
            int r3 = r10 << 4
            r4 = 240(0xf0, float:3.36E-43)
            r5 = 16
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            r1 = 1
            byte[] r2 = r9.getPlaneData(r1)
            byte[][] r3 = r8.topLine
            r3 = r3[r1]
            int r10 = r10 << 3
            r4 = 56
            r6 = 8
            java.lang.System.arraycopy(r2, r4, r3, r10, r6)
            r2 = 2
            byte[] r3 = r9.getPlaneData(r2)
            byte[][] r7 = r8.topLine
            r7 = r7[r2]
            java.lang.System.arraycopy(r3, r4, r7, r10, r6)
            byte[] r10 = r9.getPlaneData(r0)
            byte[][] r3 = r8.leftRow
            r0 = r3[r0]
            r3 = 15
            r8.copyCol(r10, r3, r5, r0)
            byte[] r10 = r9.getPlaneData(r1)
            byte[][] r0 = r8.leftRow
            r0 = r0[r1]
            r1 = 7
            r8.copyCol(r10, r1, r6, r0)
            byte[] r9 = r9.getPlaneData(r2)
            byte[][] r10 = r8.leftRow
            r10 = r10[r2]
            r8.copyCol(r9, r1, r6, r10)
            return
    }

    private void copyCol(byte[] r3, int r4, int r5, byte[] r6) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto Lc
            r1 = r3[r4]
            r6[r0] = r1
            int r4 = r4 + r5
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    private void encodeMacroblock(org.jcodec.codecs.h264.io.model.MBType r12, org.jcodec.common.model.Picture8Bit r13, int r14, int r15, org.jcodec.common.io.BitWriter r16, int r17, int r18) {
            r11 = this;
            r0 = r11
            r1 = r12
            org.jcodec.codecs.h264.io.model.MBType r2 = org.jcodec.codecs.h264.io.model.MBType.I_16x16
            r3 = 0
            if (r1 != r2) goto L2c
            org.jcodec.codecs.h264.encode.MBEncoderI16x16 r1 = r0.mbEncoderI16x16
            org.jcodec.codecs.h264.encode.EncodedMB r6 = r0.outMB
            if (r14 <= 0) goto L15
            org.jcodec.codecs.h264.encode.EncodedMB[] r2 = r0.topEncoded
            int r4 = r14 + (-1)
            r2 = r2[r4]
            r7 = r2
            goto L16
        L15:
            r7 = r3
        L16:
            if (r15 <= 0) goto L1e
            org.jcodec.codecs.h264.encode.EncodedMB[] r2 = r0.topEncoded
            r2 = r2[r14]
            r8 = r2
            goto L1f
        L1e:
            r8 = r3
        L1f:
            int r9 = r17 + r18
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r10 = r18
            r1.encodeMacroblock(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L54
        L2c:
            org.jcodec.codecs.h264.io.model.MBType r2 = org.jcodec.codecs.h264.io.model.MBType.P_16x16
            if (r1 != r2) goto L55
            org.jcodec.codecs.h264.encode.MBEncoderP16x16 r1 = r0.mbEncoderP16x16
            org.jcodec.codecs.h264.encode.EncodedMB r6 = r0.outMB
            if (r14 <= 0) goto L3e
            org.jcodec.codecs.h264.encode.EncodedMB[] r2 = r0.topEncoded
            int r4 = r14 + (-1)
            r2 = r2[r4]
            r7 = r2
            goto L3f
        L3e:
            r7 = r3
        L3f:
            if (r15 <= 0) goto L47
            org.jcodec.codecs.h264.encode.EncodedMB[] r2 = r0.topEncoded
            r2 = r2[r14]
            r8 = r2
            goto L48
        L47:
            r8 = r3
        L48:
            int r9 = r17 + r18
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r10 = r18
            r1.encodeMacroblock(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L54:
            return
        L55:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Macroblock of type "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r1 = " is not supported."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    private void encodeSlice(org.jcodec.codecs.h264.io.model.SeqParameterSet r22, org.jcodec.codecs.h264.io.model.PictureParameterSet r23, org.jcodec.common.model.Picture8Bit r24, java.nio.ByteBuffer r25, boolean r26, int r27, org.jcodec.codecs.h264.io.model.SliceType r28) {
            r21 = this;
            r8 = r21
            r9 = r22
            r0 = r23
            r10 = r24
            r11 = r25
            r12 = r28
            r13 = 0
            if (r26 == 0) goto L1a
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.io.model.SliceType.I
            if (r12 == r1) goto L1a
            java.lang.String r1 = "Illegal value of idr = true when sliceType != I"
            org.jcodec.common.logging.Logger.warn(r1)
            r1 = 0
            goto L1c
        L1a:
            r1 = r26
        L1c:
            r2 = 3
            org.jcodec.codecs.h264.io.CAVLC[] r3 = new org.jcodec.codecs.h264.io.CAVLC[r2]
            org.jcodec.codecs.h264.io.CAVLC r4 = new org.jcodec.codecs.h264.io.CAVLC
            r5 = 2
            r4.<init>(r9, r0, r5, r5)
            r3[r13] = r4
            org.jcodec.codecs.h264.io.CAVLC r4 = new org.jcodec.codecs.h264.io.CAVLC
            r14 = 1
            r4.<init>(r9, r0, r14, r14)
            r3[r14] = r4
            org.jcodec.codecs.h264.io.CAVLC r4 = new org.jcodec.codecs.h264.io.CAVLC
            r4.<init>(r9, r0, r14, r14)
            r3[r5] = r4
            r8.cavlc = r3
            org.jcodec.codecs.h264.encode.MBEncoderI16x16 r3 = new org.jcodec.codecs.h264.encode.MBEncoderI16x16
            org.jcodec.codecs.h264.io.CAVLC[] r4 = r8.cavlc
            byte[][] r6 = r8.leftRow
            byte[][] r7 = r8.topLine
            r3.<init>(r4, r6, r7)
            r8.mbEncoderI16x16 = r3
            org.jcodec.codecs.h264.encode.MBEncoderP16x16 r3 = new org.jcodec.codecs.h264.encode.MBEncoderP16x16
            org.jcodec.common.model.Picture8Bit r4 = r8.ref
            org.jcodec.codecs.h264.io.CAVLC[] r6 = r8.cavlc
            org.jcodec.codecs.h264.encode.MotionEstimator r7 = new org.jcodec.codecs.h264.encode.MotionEstimator
            r15 = 16
            r7.<init>(r15)
            r3.<init>(r9, r4, r6, r7)
            r8.mbEncoderP16x16 = r3
            org.jcodec.codecs.h264.encode.RateControl r3 = r8.rc
            r3.reset()
            org.jcodec.codecs.h264.encode.RateControl r3 = r8.rc
            int r3 = r3.getInitQp(r12)
            r11.putInt(r14)
            org.jcodec.codecs.h264.io.model.NALUnit r4 = new org.jcodec.codecs.h264.io.model.NALUnit
            if (r1 == 0) goto L6c
            org.jcodec.codecs.h264.io.model.NALUnitType r6 = org.jcodec.codecs.h264.io.model.NALUnitType.IDR_SLICE
            goto L6e
        L6c:
            org.jcodec.codecs.h264.io.model.NALUnitType r6 = org.jcodec.codecs.h264.io.model.NALUnitType.NON_IDR_SLICE
        L6e:
            r4.<init>(r6, r2)
            r4.write(r11)
            org.jcodec.codecs.h264.io.model.SliceHeader r2 = new org.jcodec.codecs.h264.io.model.SliceHeader
            r2.<init>()
            r2.slice_type = r12
            if (r1 == 0) goto L84
            org.jcodec.codecs.h264.io.model.RefPicMarkingIDR r4 = new org.jcodec.codecs.h264.io.model.RefPicMarkingIDR
            r4.<init>(r13, r13)
            r2.refPicMarkingIDR = r4
        L84:
            r2.pps = r0
            r2.sps = r9
            int r4 = r27 << 1
            int r6 = r8.maxPOC
            int r4 = r4 % r6
            r2.pic_order_cnt_lsb = r4
            int r4 = r8.maxFrameNumber
            int r4 = r27 % r4
            r2.frame_num = r4
            int r0 = r0.pic_init_qp_minus26
            int r0 = r0 + 26
            int r0 = r3 - r0
            r2.slice_qp_delta = r0
            int r0 = r24.getWidth()
            int r4 = r24.getHeight()
            int r0 = r0 * r4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            org.jcodec.common.io.BitWriter r4 = new org.jcodec.common.io.BitWriter
            r4.<init>(r0)
            org.jcodec.codecs.h264.io.write.SliceHeaderWriter r0 = new org.jcodec.codecs.h264.io.write.SliceHeaderWriter
            r0.<init>()
            r0.write(r2, r1, r5, r4)
            r15 = 0
        Lb9:
            int r0 = r9.pic_height_in_map_units_minus1
            int r0 = r0 + r14
            if (r15 >= r0) goto L15d
            r16 = r3
            r7 = r4
            r6 = 0
        Lc2:
            int r0 = r9.pic_width_in_mbs_minus1
            int r0 = r0 + r14
            if (r6 >= r0) goto L152
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.P
            if (r12 != r0) goto Lce
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUE(r7, r13)
        Lce:
            org.jcodec.codecs.h264.io.model.MBType r5 = r8.selectMBType(r12)
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.I_16x16
            if (r5 != r1) goto Lff
            org.jcodec.codecs.h264.encode.MBEncoderI16x16 r1 = r8.mbEncoderI16x16
            int r1 = r1.getPredMode(r10, r6, r15)
            org.jcodec.codecs.h264.encode.MBEncoderI16x16 r2 = r8.mbEncoderI16x16
            int r2 = r2.getCbpChroma(r10, r6, r15)
            org.jcodec.codecs.h264.encode.MBEncoderI16x16 r3 = r8.mbEncoderI16x16
            int r3 = r3.getCbpLuma(r10, r6, r15)
            int r3 = r3 / 15
            int r3 = r3 * 12
            int r2 = r2 * 4
            int r3 = r3 + r2
            int r3 = r3 + r1
            if (r12 != r0) goto Lf4
            r0 = 5
            goto Lf5
        Lf4:
            r0 = 0
        Lf5:
            int r1 = r5.code()
            int r0 = r0 + r1
            int r0 = r0 + r3
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUE(r7, r0)
            goto L106
        Lff:
            int r0 = r5.code()
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUE(r7, r0)
        L106:
            org.jcodec.common.io.BitWriter r17 = r7.fork()
            org.jcodec.codecs.h264.encode.RateControl r0 = r8.rc
            int r18 = r0.getQpDelta()
            r0 = r21
            r1 = r5
            r2 = r24
            r3 = r6
            r4 = r15
            r19 = r5
            r5 = r17
            r13 = r6
            r6 = r16
            r20 = r7
            r7 = r18
            r0.encodeMacroblock(r1, r2, r3, r4, r5, r6, r7)
            org.jcodec.codecs.h264.encode.RateControl r0 = r8.rc
            int r1 = r17.position()
            int r2 = r20.position()
            int r1 = r1 - r2
            boolean r0 = r0.accept(r1)
            if (r0 == 0) goto L14b
            int r16 = r16 + r18
            org.jcodec.codecs.h264.encode.EncodedMB r0 = r8.outMB
            org.jcodec.common.model.Picture8Bit r0 = r0.getPixels()
            r8.collectPredictors(r0, r13)
            r8.addToReference(r13, r15)
            int r6 = r13 + 1
            r7 = r17
            r13 = 0
            goto Lc2
        L14b:
            r6 = r13
            r5 = r19
            r7 = r20
            r13 = 0
            goto L106
        L152:
            r20 = r7
            int r15 = r15 + 1
            r3 = r16
            r4 = r20
            r13 = 0
            goto Lb9
        L15d:
            r4.write1Bit(r14)
            r4.flush()
            java.nio.ByteBuffer r0 = r4.getBuffer()
            java.nio.Buffer r1 = r0.flip()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            org.jcodec.codecs.h264.H264Utils.escapeNAL(r0, r11)
            return
    }

    private void putLastMBLine() {
            r7 = this;
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r7.sps
            int r1 = r0.pic_width_in_mbs_minus1
            int r1 = r1 + 1
            int r0 = r0.pic_height_in_map_units_minus1
            int r0 = r0 + 1
            r2 = 0
        Lb:
            if (r2 >= r1) goto L23
            org.jcodec.common.model.Picture8Bit r3 = r7.picOut
            org.jcodec.codecs.h264.encode.EncodedMB[] r4 = r7.topEncoded
            r4 = r4[r2]
            org.jcodec.common.model.Picture8Bit r4 = r4.getPixels()
            int r5 = r2 << 4
            int r6 = r0 + (-1)
            int r6 = r6 << 4
            org.jcodec.codecs.h264.encode.MBEncoderHelper.putBlkPic(r3, r4, r5, r6)
            int r2 = r2 + 1
            goto Lb
        L23:
            return
    }

    private org.jcodec.codecs.h264.io.model.MBType selectMBType(org.jcodec.codecs.h264.io.model.SliceType r2) {
            r1 = this;
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.I
            if (r2 != r0) goto L7
            org.jcodec.codecs.h264.io.model.MBType r2 = org.jcodec.codecs.h264.io.model.MBType.I_16x16
            return r2
        L7:
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.P
            if (r2 != r0) goto Le
            org.jcodec.codecs.h264.io.model.MBType r2 = org.jcodec.codecs.h264.io.model.MBType.P_16x16
            return r2
        Le:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported slice type"
            r2.<init>(r0)
            throw r2
    }

    private void writePPS(java.nio.ByteBuffer r2, org.jcodec.codecs.h264.io.model.PictureParameterSet r3) {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.write(r0)
            java.nio.Buffer r3 = r0.flip()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            org.jcodec.codecs.h264.H264Utils.escapeNAL(r0, r2)
            return
    }

    private void writeSPS(java.nio.ByteBuffer r2, org.jcodec.codecs.h264.io.model.SeqParameterSet r3) {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.write(r0)
            java.nio.Buffer r3 = r0.flip()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            org.jcodec.codecs.h264.H264Utils.escapeNAL(r0, r2)
            return
    }

    public java.nio.ByteBuffer doEncodeFrame8Bit(org.jcodec.common.model.Picture8Bit r10, java.nio.ByteBuffer r11, boolean r12, int r13, org.jcodec.codecs.h264.io.model.SliceType r14) {
            r9 = this;
            java.nio.ByteBuffer r11 = r11.duplicate()
            r0 = 1
            if (r12 == 0) goto L32
            org.jcodec.common.model.Size r1 = new org.jcodec.common.model.Size
            int r2 = r10.getCroppedWidth()
            int r3 = r10.getCroppedHeight()
            r1.<init>(r2, r3)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r1 = r9.initSPS(r1)
            r9.sps = r1
            org.jcodec.codecs.h264.io.model.PictureParameterSet r1 = r9.initPPS()
            r9.pps = r1
            org.jcodec.codecs.h264.io.model.SeqParameterSet r1 = r9.sps
            int r2 = r1.log2_max_pic_order_cnt_lsb_minus4
            int r2 = r2 + 4
            int r2 = r0 << r2
            r9.maxPOC = r2
            int r1 = r1.log2_max_frame_num_minus4
            int r1 = r1 + 4
            int r1 = r0 << r1
            r9.maxFrameNumber = r1
        L32:
            r1 = 3
            if (r12 == 0) goto L59
            r11.putInt(r0)
            org.jcodec.codecs.h264.io.model.NALUnit r2 = new org.jcodec.codecs.h264.io.model.NALUnit
            org.jcodec.codecs.h264.io.model.NALUnitType r3 = org.jcodec.codecs.h264.io.model.NALUnitType.SPS
            r2.<init>(r3, r1)
            r2.write(r11)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r2 = r9.sps
            r9.writeSPS(r11, r2)
            r11.putInt(r0)
            org.jcodec.codecs.h264.io.model.NALUnit r2 = new org.jcodec.codecs.h264.io.model.NALUnit
            org.jcodec.codecs.h264.io.model.NALUnitType r3 = org.jcodec.codecs.h264.io.model.NALUnitType.PPS
            r2.<init>(r3, r1)
            r2.write(r11)
            org.jcodec.codecs.h264.io.model.PictureParameterSet r2 = r9.pps
            r9.writePPS(r11, r2)
        L59:
            org.jcodec.codecs.h264.io.model.SeqParameterSet r2 = r9.sps
            int r3 = r2.pic_width_in_mbs_minus1
            int r3 = r3 + r0
            int r2 = r2.pic_height_in_map_units_minus1
            int r2 = r2 + r0
            byte[][] r4 = new byte[r1][]
            r5 = 16
            byte[] r5 = new byte[r5]
            r6 = 0
            r4[r6] = r5
            r5 = 8
            byte[] r7 = new byte[r5]
            r4[r0] = r7
            byte[] r5 = new byte[r5]
            r7 = 2
            r4[r7] = r5
            r9.leftRow = r4
            byte[][] r1 = new byte[r1][]
            int r4 = r3 << 4
            byte[] r5 = new byte[r4]
            r1[r6] = r5
            int r5 = r3 << 3
            byte[] r8 = new byte[r5]
            r1[r0] = r8
            byte[] r0 = new byte[r5]
            r1[r7] = r0
            r9.topLine = r1
            int r0 = r2 << 4
            org.jcodec.common.model.ColorSpace r1 = r10.getColor()
            org.jcodec.common.model.Picture8Bit r0 = org.jcodec.common.model.Picture8Bit.create(r4, r0, r1)
            r9.picOut = r0
            org.jcodec.codecs.h264.encode.EncodedMB r0 = new org.jcodec.codecs.h264.encode.EncodedMB
            r0.<init>()
            r9.outMB = r0
            org.jcodec.codecs.h264.encode.EncodedMB[] r0 = new org.jcodec.codecs.h264.encode.EncodedMB[r3]
            r9.topEncoded = r0
        La2:
            if (r6 >= r3) goto Lb0
            org.jcodec.codecs.h264.encode.EncodedMB[] r0 = r9.topEncoded
            org.jcodec.codecs.h264.encode.EncodedMB r1 = new org.jcodec.codecs.h264.encode.EncodedMB
            r1.<init>()
            r0[r6] = r1
            int r6 = r6 + 1
            goto La2
        Lb0:
            org.jcodec.codecs.h264.io.model.SeqParameterSet r1 = r9.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r2 = r9.pps
            r0 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.encodeSlice(r1, r2, r3, r4, r5, r6, r7)
            r9.putLastMBLine()
            org.jcodec.common.model.Picture8Bit r10 = r9.picOut
            r9.ref = r10
            java.nio.Buffer r10 = r11.flip()
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            return r11
    }

    public java.nio.ByteBuffer encodeFrame8Bit(org.jcodec.common.model.Picture8Bit r10, java.nio.ByteBuffer r11) {
            r9 = this;
            int r0 = r9.frameNumber
            int r1 = r9.keyInterval
            r2 = 0
            if (r0 < r1) goto L9
            r9.frameNumber = r2
        L9:
            int r7 = r9.frameNumber
            if (r7 != 0) goto L10
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.I
            goto L12
        L10:
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.P
        L12:
            r8 = r0
            if (r7 != 0) goto L18
            r2 = 1
            r6 = 1
            goto L19
        L18:
            r6 = 0
        L19:
            int r0 = r7 + 1
            r9.frameNumber = r0
            r3 = r9
            r4 = r10
            r5 = r11
            java.nio.ByteBuffer r10 = r3.doEncodeFrame8Bit(r4, r5, r6, r7, r8)
            return r10
    }

    public org.jcodec.common.model.ColorSpace[] getSupportedColorSpaces() {
            r3 = this;
            r0 = 1
            org.jcodec.common.model.ColorSpace[] r0 = new org.jcodec.common.model.ColorSpace[r0]
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV420J
            r2 = 0
            r0[r2] = r1
            return r0
    }

    public org.jcodec.codecs.h264.io.model.PictureParameterSet initPPS() {
            r3 = this;
            org.jcodec.codecs.h264.io.model.PictureParameterSet r0 = new org.jcodec.codecs.h264.io.model.PictureParameterSet
            r0.<init>()
            org.jcodec.codecs.h264.encode.RateControl r1 = r3.rc
            org.jcodec.codecs.h264.io.model.SliceType r2 = org.jcodec.codecs.h264.io.model.SliceType.I
            int r1 = r1.getInitQp(r2)
            int r1 = r1 + (-26)
            r0.pic_init_qp_minus26 = r1
            return r0
    }

    public org.jcodec.codecs.h264.io.model.SeqParameterSet initSPS(org.jcodec.common.model.Size r7) {
            r6 = this;
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = new org.jcodec.codecs.h264.io.model.SeqParameterSet
            r0.<init>()
            int r1 = r7.getWidth()
            int r1 = r1 + 15
            int r1 = r1 >> 4
            r2 = 1
            int r1 = r1 - r2
            r0.pic_width_in_mbs_minus1 = r1
            int r1 = r7.getHeight()
            int r1 = r1 + 15
            int r1 = r1 >> 4
            int r1 = r1 - r2
            r0.pic_height_in_map_units_minus1 = r1
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV420J
            r0.chroma_format_idc = r1
            r1 = 66
            r0.profile_idc = r1
            r1 = 40
            r0.level_idc = r1
            r0.frame_mbs_only_flag = r2
            int r1 = r6.keyInterval
            int r1 = org.jcodec.common.tools.MathUtil.log2(r1)
            int r1 = r1 + (-3)
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            r0.log2_max_frame_num_minus4 = r1
            int r1 = r0.pic_width_in_mbs_minus1
            int r1 = r1 + r2
            int r1 = r1 << 4
            int r4 = r0.pic_height_in_map_units_minus1
            int r4 = r4 + r2
            int r4 = r4 << 4
            int r5 = r7.getWidth()
            if (r1 != r5) goto L4f
            int r5 = r7.getHeight()
            if (r4 == r5) goto L50
        L4f:
            r3 = 1
        L50:
            r0.frame_cropping_flag = r3
            int r3 = r7.getWidth()
            int r1 = r1 - r3
            int r1 = r1 + r2
            int r1 = r1 >> r2
            r0.frame_crop_right_offset = r1
            int r7 = r7.getHeight()
            int r4 = r4 - r7
            int r4 = r4 + r2
            int r7 = r4 >> 1
            r0.frame_crop_bottom_offset = r7
            return r0
    }
}
