package org.jcodec.codecs.h264.io;

/* loaded from: classes2.dex */
public class CAVLC {
    public static int[] NO_ZIGZAG;
    private org.jcodec.common.io.VLC chromaDCVLC;
    private org.jcodec.common.model.ColorSpace color;
    private int mbMask;
    private int mbWidth;
    private int[] tokensLeft;
    private int[] tokensTop;

    static {
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15} // fill-array
            org.jcodec.codecs.h264.io.CAVLC.NO_ZIGZAG = r0
            return
    }

    public CAVLC(org.jcodec.codecs.h264.io.model.SeqParameterSet r1, org.jcodec.codecs.h264.io.model.PictureParameterSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            org.jcodec.common.model.ColorSpace r2 = r1.chroma_format_idc
            r0.color = r2
            org.jcodec.common.io.VLC r2 = r0.codeTableChromaDC()
            r0.chromaDCVLC = r2
            int r1 = r1.pic_width_in_mbs_minus1
            r2 = 1
            int r1 = r1 + r2
            r0.mbWidth = r1
            int r4 = r2 << r4
            int r4 = r4 - r2
            r0.mbMask = r4
            r2 = 4
            int[] r2 = new int[r2]
            r0.tokensLeft = r2
            int r1 = r1 << r3
            int[] r1 = new int[r1]
            r0.tokensTop = r1
            return
    }

    public static final int coeffToken(int r0, int r1) {
            int r0 = r0 << 4
            r0 = r0 | r1
            return r0
    }

    public static final int totalCoeff(int r0) {
            int r0 = r0 >> 4
            return r0
    }

    private final int unsigned(int r3) {
            r2 = this;
            int r0 = r3 >>> 31
            int r1 = r3 >> 31
            r3 = r3 ^ r1
            int r3 = r3 - r1
            int r3 = r3 << 1
            int r3 = r3 + r0
            int r3 = r3 + (-2)
            return r3
    }

    private int writeBlockGen(org.jcodec.common.io.BitWriter r9, int[] r10, org.jcodec.common.io.VLC[] r11, int r12, int r13, int[] r14, org.jcodec.common.io.VLC r15) {
            r8 = this;
            int[] r0 = new int[r13]
            int[] r1 = new int[r13]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L8:
            r6 = 1
            if (r3 >= r13) goto L23
            int r7 = r3 + r12
            r7 = r14[r7]
            r7 = r10[r7]
            if (r7 != 0) goto L1b
            r7 = r0[r4]
            int r7 = r7 + r6
            r0[r4] = r7
            int r5 = r5 + 1
            goto L20
        L1b:
            int r6 = r4 + 1
            r1[r4] = r7
            r4 = r6
        L20:
            int r3 = r3 + 1
            goto L8
        L23:
            if (r4 >= r13) goto L28
            r10 = r0[r4]
            int r5 = r5 - r10
        L28:
            if (r2 >= r4) goto L3b
            r10 = 3
            if (r2 >= r10) goto L3b
            int r10 = r4 - r2
            int r10 = r10 - r6
            r10 = r1[r10]
            int r10 = java.lang.Math.abs(r10)
            if (r10 != r6) goto L3b
            int r2 = r2 + 1
            goto L28
        L3b:
            int r10 = coeffToken(r4, r2)
            r15.writeVLC(r9, r10)
            if (r4 <= 0) goto L56
            r8.writeTrailingOnes(r9, r1, r4, r2)
            r8.writeLevels(r9, r1, r4, r2)
            if (r4 >= r13) goto L56
            int r12 = r4 + (-1)
            r11 = r11[r12]
            r11.writeVLC(r9, r5)
            r8.writeRuns(r9, r0, r4, r5)
        L56:
            return r10
    }

    private void writeLevels(org.jcodec.common.io.BitWriter r9, int[] r10, int r11, int r12) {
            r8 = this;
            r0 = 3
            r1 = 1
            r2 = 10
            if (r11 <= r2) goto La
            if (r12 >= r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            int r11 = r11 - r12
            int r11 = r11 - r1
            r3 = r11
        Le:
            if (r3 < 0) goto L77
            r4 = r10[r3]
            int r4 = r8.unsigned(r4)
            if (r3 != r11) goto L1c
            if (r12 >= r0) goto L1c
            int r4 = r4 + (-2)
        L1c:
            int r5 = r4 >> r2
            if (r2 != 0) goto L24
            r6 = 14
            if (r5 < r6) goto L2a
        L24:
            r6 = 15
            if (r2 <= 0) goto L33
            if (r5 >= r6) goto L33
        L2a:
            int r5 = r5 + 1
            r9.writeNBit(r1, r5)
            r9.writeNBit(r4, r2)
            goto L60
        L33:
            if (r2 != 0) goto L43
            r5 = 30
            if (r4 >= r5) goto L43
            r9.writeNBit(r1, r6)
            int r4 = r4 + (-14)
            r5 = 4
            r9.writeNBit(r4, r5)
            goto L60
        L43:
            if (r2 != 0) goto L47
            int r4 = r4 + (-15)
        L47:
            r5 = 12
        L49:
            int r6 = r5 + 3
            int r6 = r6 << r2
            int r6 = r4 - r6
            int r7 = r1 << r5
            int r6 = r6 - r7
            int r6 = r6 + 4096
            if (r6 < r7) goto L58
            int r5 = r5 + 1
            goto L49
        L58:
            int r4 = r5 + 4
            r9.writeNBit(r1, r4)
            r9.writeNBit(r6, r5)
        L60:
            if (r2 != 0) goto L63
            r2 = 1
        L63:
            r4 = r10[r3]
            int r4 = org.jcodec.common.tools.MathUtil.abs(r4)
            int r5 = r2 + (-1)
            int r5 = r0 << r5
            if (r4 <= r5) goto L74
            r4 = 6
            if (r2 >= r4) goto L74
            int r2 = r2 + 1
        L74:
            int r3 = r3 + (-1)
            goto Le
        L77:
            return
    }

    private void writeRuns(org.jcodec.common.io.BitWriter r4, int[] r5, int r6, int r7) {
            r3 = this;
            int r6 = r6 + (-1)
        L2:
            if (r6 <= 0) goto L1c
            if (r7 <= 0) goto L1c
            org.jcodec.common.io.VLC[] r0 = org.jcodec.codecs.h264.H264Const.run
            r1 = 6
            int r2 = r7 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            r0 = r0[r1]
            r1 = r5[r6]
            r0.writeVLC(r4, r1)
            r0 = r5[r6]
            int r7 = r7 - r0
            int r6 = r6 + (-1)
            goto L2
        L1c:
            return
    }

    private void writeTrailingOnes(org.jcodec.common.io.BitWriter r3, int[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r5 + (-1)
        L2:
            int r1 = r5 - r6
            if (r0 < r1) goto L10
            r1 = r4[r0]
            int r1 = r1 >>> 31
            r3.write1Bit(r1)
            int r0 = r0 + (-1)
            goto L2
        L10:
            return
    }

    protected org.jcodec.common.io.VLC codeTableChromaDC() {
            r2 = this;
            org.jcodec.common.model.ColorSpace r0 = r2.color
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV420J
            if (r0 != r1) goto L9
            org.jcodec.common.io.VLC r0 = org.jcodec.codecs.h264.H264Const.coeffTokenChromaDCY420
            return r0
        L9:
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV422
            if (r0 != r1) goto L10
            org.jcodec.common.io.VLC r0 = org.jcodec.codecs.h264.H264Const.coeffTokenChromaDCY422
            return r0
        L10:
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV444
            if (r0 != r1) goto L1a
            org.jcodec.common.io.VLC[] r0 = org.jcodec.codecs.h264.H264Const.coeffToken
            r1 = 0
            r0 = r0[r1]
            return r0
        L1a:
            r0 = 0
            return r0
    }

    protected int codeTableLuma(boolean r2, org.jcodec.codecs.h264.io.model.MBType r3, int r4, boolean r5, org.jcodec.codecs.h264.io.model.MBType r6, int r7) {
            r1 = this;
            r0 = 0
            if (r3 != 0) goto L5
            r3 = 0
            goto L9
        L5:
            int r3 = totalCoeff(r4)
        L9:
            if (r6 != 0) goto Ld
            r4 = 0
            goto L11
        Ld:
            int r4 = totalCoeff(r7)
        L11:
            if (r2 == 0) goto L1b
            if (r5 == 0) goto L1b
            int r3 = r3 + r4
            int r3 = r3 + 1
            int r2 = r3 >> 1
            return r2
        L1b:
            if (r2 == 0) goto L1e
            return r3
        L1e:
            if (r5 == 0) goto L21
            return r4
        L21:
            return r0
    }

    public org.jcodec.common.io.VLC getCoeffTokenVLCForChromaDC() {
            r1 = this;
            org.jcodec.common.io.VLC r0 = r1.chromaDCVLC
            return r0
    }

    public org.jcodec.common.io.VLC getCoeffTokenVLCForLuma(boolean r1, org.jcodec.codecs.h264.io.model.MBType r2, int r3, boolean r4, org.jcodec.codecs.h264.io.model.MBType r5, int r6) {
            r0 = this;
            int r1 = r0.codeTableLuma(r1, r2, r3, r4, r5, r6)
            org.jcodec.common.io.VLC[] r2 = org.jcodec.codecs.h264.H264Const.coeffToken
            r3 = 8
            int r1 = java.lang.Math.min(r1, r3)
            r1 = r2[r1]
            return r1
    }

    public int writeACBlock(org.jcodec.common.io.BitWriter r10, int r11, int r12, org.jcodec.codecs.h264.io.model.MBType r13, org.jcodec.codecs.h264.io.model.MBType r14, int[] r15, org.jcodec.common.io.VLC[] r16, int r17, int r18, int[] r19) {
            r9 = this;
            r8 = r9
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            int[] r3 = r8.tokensLeft
            int r4 = r8.mbMask
            r4 = r4 & r12
            r3 = r3[r4]
            if (r12 == 0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            int[] r0 = r8.tokensTop
            r6 = r0[r11]
            r0 = r9
            r1 = r2
            r2 = r13
            r5 = r14
            org.jcodec.common.io.VLC r7 = r0.getCoeffTokenVLCForLuma(r1, r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            int r0 = r0.writeBlockGen(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = r8.tokensLeft
            int r2 = r8.mbMask
            r2 = r2 & r12
            r1[r2] = r0
            int[] r1 = r8.tokensTop
            r1[r11] = r0
            return r0
    }

    public void writeChrDCBlock(org.jcodec.common.io.BitWriter r9, int[] r10, org.jcodec.common.io.VLC[] r11, int r12, int r13, int[] r14) {
            r8 = this;
            org.jcodec.common.io.VLC r7 = r8.getCoeffTokenVLCForChromaDC()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.writeBlockGen(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void writeLumaDCBlock(org.jcodec.common.io.BitWriter r10, int r11, int r12, org.jcodec.codecs.h264.io.model.MBType r13, org.jcodec.codecs.h264.io.model.MBType r14, int[] r15, org.jcodec.common.io.VLC[] r16, int r17, int r18, int[] r19) {
            r9 = this;
            r8 = r9
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            int[] r3 = r8.tokensLeft
            int r4 = r8.mbMask
            r4 = r4 & r12
            r3 = r3[r4]
            if (r12 == 0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            int[] r0 = r8.tokensTop
            r6 = r0[r11]
            r0 = r9
            r1 = r2
            r2 = r13
            r5 = r14
            org.jcodec.common.io.VLC r7 = r0.getCoeffTokenVLCForLuma(r1, r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.writeBlockGen(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
