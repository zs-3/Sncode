package org.jcodec.codecs.h264;

/* loaded from: classes2.dex */
public class H264Const {
    public static final int[][] ARRAY = null;
    public static final int[][] BLK8x8_BLOCKS = null;
    public static final int[] BLK_4x4_MB_OFF_LUMA = null;
    public static final int[] BLK_8x8_IND = null;
    public static final int[] BLK_8x8_MB_OFF_CHROMA = null;
    public static final int[] BLK_8x8_MB_OFF_LUMA = null;
    public static int[] BLK_8x8_X;
    public static int[] BLK_8x8_Y;
    public static int[] BLK_INV_MAP;
    public static int[] BLK_X;
    public static int[] BLK_Y;
    public static int[] CHROMA_BLOCK_LUT;
    public static int[] CHROMA_POS_LUT;
    public static int[] CODED_BLOCK_PATTERN_INTER_COLOR;
    public static int[] CODED_BLOCK_PATTERN_INTER_COLOR_INV;
    public static int[] CODED_BLOCK_PATTERN_INTRA_COLOR;
    public static int[][] COMP_BLOCK_4x4_LUT;
    public static int[][] COMP_BLOCK_8x8_LUT;
    public static int[][] COMP_POS_4x4_LUT;
    public static int[][] COMP_POS_8x8_LUT;
    public static int[] LUMA_4x4_BLOCK_LUT;
    public static int[] LUMA_4x4_POS_LUT;
    public static int[] LUMA_8x8_BLOCK_LUT;
    public static int[] LUMA_8x8_POS_LUT;
    public static int[] MB_BLK_OFF_LEFT;
    public static int[] MB_BLK_OFF_TOP;
    public static final org.jcodec.common.model.Picture8Bit NO_PIC = null;
    public static final int[][] PIX_MAP_SPLIT_2x2 = null;
    public static final int[][] PIX_MAP_SPLIT_4x4 = null;
    public static final int[] QP_SCALE_CR = null;
    public static org.jcodec.codecs.h264.io.model.MBType[] bMbTypes;
    public static int[] bPartH;
    public static org.jcodec.codecs.h264.H264Const.PartPred[] bPartPredModes;
    public static int[] bPartW;
    public static org.jcodec.codecs.h264.H264Const.PartPred[][] bPredModes;
    public static int[] bSubMbTypes;
    public static int[] coded_block_pattern_inter_monochrome;
    public static int[] coded_block_pattern_intra_monochrome;
    public static org.jcodec.common.io.VLC[] coeffToken;
    public static org.jcodec.common.io.VLC coeffTokenChromaDCY420;
    public static org.jcodec.common.io.VLC coeffTokenChromaDCY422;
    public static int[] identityMapping16;
    public static int[] identityMapping4;
    public static int[] last_sig_coeff_map_8x8;
    public static org.jcodec.common.io.VLC[] run;
    public static int[] sig_coeff_map_8x8;
    public static int[] sig_coeff_map_8x8_mbaff;
    public static org.jcodec.common.io.VLC[] totalZeros16;
    public static org.jcodec.common.io.VLC[] totalZeros4;
    public static org.jcodec.common.io.VLC[] totalZeros8;

    public enum PartPred extends java.lang.Enum<org.jcodec.codecs.h264.H264Const.PartPred> {
        private static final /* synthetic */ org.jcodec.codecs.h264.H264Const.PartPred[] $VALUES = null;
        public static final org.jcodec.codecs.h264.H264Const.PartPred Bi = null;
        public static final org.jcodec.codecs.h264.H264Const.PartPred Direct = null;
        public static final org.jcodec.codecs.h264.H264Const.PartPred L0 = null;
        public static final org.jcodec.codecs.h264.H264Const.PartPred L1 = null;

        static {
                org.jcodec.codecs.h264.H264Const$PartPred r0 = new org.jcodec.codecs.h264.H264Const$PartPred
                java.lang.String r1 = "L0"
                r2 = 0
                r0.<init>(r1, r2)
                org.jcodec.codecs.h264.H264Const.PartPred.L0 = r0
                org.jcodec.codecs.h264.H264Const$PartPred r1 = new org.jcodec.codecs.h264.H264Const$PartPred
                java.lang.String r3 = "L1"
                r4 = 1
                r1.<init>(r3, r4)
                org.jcodec.codecs.h264.H264Const.PartPred.L1 = r1
                org.jcodec.codecs.h264.H264Const$PartPred r3 = new org.jcodec.codecs.h264.H264Const$PartPred
                java.lang.String r5 = "Bi"
                r6 = 2
                r3.<init>(r5, r6)
                org.jcodec.codecs.h264.H264Const.PartPred.Bi = r3
                org.jcodec.codecs.h264.H264Const$PartPred r5 = new org.jcodec.codecs.h264.H264Const$PartPred
                java.lang.String r7 = "Direct"
                r8 = 3
                r5.<init>(r7, r8)
                org.jcodec.codecs.h264.H264Const.PartPred.Direct = r5
                r7 = 4
                org.jcodec.codecs.h264.H264Const$PartPred[] r7 = new org.jcodec.codecs.h264.H264Const.PartPred[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.jcodec.codecs.h264.H264Const.PartPred.$VALUES = r7
                return
        }

        PartPred(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.jcodec.codecs.h264.H264Const.PartPred valueOf(java.lang.String r1) {
                java.lang.Class<org.jcodec.codecs.h264.H264Const$PartPred> r0 = org.jcodec.codecs.h264.H264Const.PartPred.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.jcodec.codecs.h264.H264Const$PartPred r1 = (org.jcodec.codecs.h264.H264Const.PartPred) r1
                return r1
        }

        public static org.jcodec.codecs.h264.H264Const.PartPred[] values() {
                org.jcodec.codecs.h264.H264Const$PartPred[] r0 = org.jcodec.codecs.h264.H264Const.PartPred.$VALUES
                java.lang.Object r0 = r0.clone()
                org.jcodec.codecs.h264.H264Const$PartPred[] r0 = (org.jcodec.codecs.h264.H264Const.PartPred[]) r0
                return r0
        }
    }

    static {
            r0 = 10
            org.jcodec.common.io.VLC[] r1 = new org.jcodec.common.io.VLC[r0]
            org.jcodec.codecs.h264.H264Const.coeffToken = r1
            org.jcodec.common.io.VLCBuilder r1 = new org.jcodec.common.io.VLCBuilder
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "1"
            r1.set(r2, r3)
            r4 = 1
            int r5 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r2)
            java.lang.String r6 = "000101"
            r1.set(r5, r6)
            int r5 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r4)
            java.lang.String r6 = "01"
            r1.set(r5, r6)
            r5 = 2
            int r7 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r2)
            java.lang.String r8 = "00000111"
            r1.set(r7, r8)
            int r7 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r4)
            java.lang.String r8 = "000100"
            r1.set(r7, r8)
            int r7 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r5)
            java.lang.String r8 = "001"
            r1.set(r7, r8)
            r7 = 3
            int r9 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r2)
            java.lang.String r10 = "000000111"
            r1.set(r9, r10)
            int r9 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r4)
            java.lang.String r10 = "00000110"
            r1.set(r9, r10)
            int r9 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r5)
            java.lang.String r10 = "0000101"
            r1.set(r9, r10)
            int r9 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r7)
            java.lang.String r10 = "00011"
            r1.set(r9, r10)
            r9 = 4
            int r10 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r2)
            java.lang.String r11 = "0000000111"
            r1.set(r10, r11)
            int r10 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r4)
            java.lang.String r11 = "000000110"
            r1.set(r10, r11)
            int r10 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r5)
            java.lang.String r11 = "00000101"
            r1.set(r10, r11)
            int r10 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r7)
            java.lang.String r11 = "000011"
            r1.set(r10, r11)
            r10 = 5
            int r11 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r2)
            java.lang.String r12 = "00000000111"
            r1.set(r11, r12)
            int r11 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r4)
            java.lang.String r12 = "0000000110"
            r1.set(r11, r12)
            int r11 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r5)
            java.lang.String r12 = "000000101"
            r1.set(r11, r12)
            int r11 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r7)
            java.lang.String r12 = "0000100"
            r1.set(r11, r12)
            r11 = 6
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r2)
            java.lang.String r13 = "0000000001111"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r4)
            java.lang.String r13 = "00000000110"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r5)
            java.lang.String r13 = "0000000101"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r7)
            java.lang.String r13 = "00000100"
            r1.set(r12, r13)
            r12 = 7
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r2)
            java.lang.String r14 = "0000000001011"
            r1.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r4)
            java.lang.String r14 = "0000000001110"
            r1.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r5)
            java.lang.String r14 = "00000000101"
            r1.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r7)
            java.lang.String r14 = "000000100"
            r1.set(r13, r14)
            r13 = 8
            int r14 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r2)
            java.lang.String r15 = "0000000001000"
            r1.set(r14, r15)
            int r14 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r4)
            java.lang.String r15 = "0000000001010"
            r1.set(r14, r15)
            int r14 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r5)
            java.lang.String r15 = "0000000001101"
            r1.set(r14, r15)
            int r14 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r7)
            java.lang.String r15 = "0000000100"
            r1.set(r14, r15)
            r14 = 9
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r2)
            java.lang.String r13 = "00000000001111"
            r1.set(r15, r13)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r4)
            java.lang.String r15 = "00000000001110"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r5)
            java.lang.String r15 = "0000000001001"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r7)
            java.lang.String r15 = "00000000100"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r15 = "00000000001011"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r15 = "00000000001010"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r15 = "00000000001101"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r15 = "0000000001100"
            r1.set(r13, r15)
            r13 = 11
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r2)
            java.lang.String r0 = "000000000001111"
            r1.set(r15, r0)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r4)
            java.lang.String r15 = "000000000001110"
            r1.set(r0, r15)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r5)
            java.lang.String r15 = "00000000001001"
            r1.set(r0, r15)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r7)
            java.lang.String r15 = "00000000001100"
            r1.set(r0, r15)
            r0 = 12
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "000000000001011"
            r1.set(r15, r13)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r15 = "000000000001010"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r15 = "000000000001101"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r15 = "00000000001000"
            r1.set(r13, r15)
            r13 = 13
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r2)
            java.lang.String r0 = "0000000000001111"
            r1.set(r15, r0)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r4)
            java.lang.String r15 = "000000000000001"
            r1.set(r0, r15)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r5)
            java.lang.String r15 = "000000000001001"
            r1.set(r0, r15)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r7)
            java.lang.String r15 = "000000000001100"
            r1.set(r0, r15)
            r0 = 14
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "0000000000001011"
            r1.set(r15, r13)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r15 = "0000000000001110"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r15 = "0000000000001101"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r15 = "000000000001000"
            r1.set(r13, r15)
            r13 = 15
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r2)
            java.lang.String r0 = "0000000000000111"
            r1.set(r15, r0)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r4)
            java.lang.String r15 = "0000000000001010"
            r1.set(r0, r15)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r5)
            java.lang.String r15 = "0000000000001001"
            r1.set(r0, r15)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r13, r7)
            java.lang.String r15 = "0000000000001100"
            r1.set(r0, r15)
            r0 = 16
            int r15 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "0000000000000100"
            r1.set(r15, r13)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r15 = "0000000000000110"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r15 = "0000000000000101"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r15 = "0000000000001000"
            r1.set(r13, r15)
            org.jcodec.common.io.VLC[] r13 = org.jcodec.codecs.h264.H264Const.coeffToken
            org.jcodec.common.io.VLC r1 = r1.getVLC()
            r13[r4] = r1
            r13[r2] = r1
            org.jcodec.common.io.VLCBuilder r1 = new org.jcodec.common.io.VLCBuilder
            r1.<init>()
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r2, r2)
            java.lang.String r15 = "11"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r2)
            java.lang.String r15 = "001011"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r4)
            java.lang.String r15 = "10"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r2)
            java.lang.String r15 = "000111"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r4)
            java.lang.String r15 = "00111"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r5)
            java.lang.String r15 = "011"
            r1.set(r13, r15)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r2)
            java.lang.String r0 = "0000111"
            r1.set(r13, r0)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r4)
            java.lang.String r13 = "001010"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r5)
            java.lang.String r13 = "001001"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r7)
            java.lang.String r13 = "0101"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r2)
            java.lang.String r13 = "00000111"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r4)
            java.lang.String r13 = "000110"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r5)
            java.lang.String r13 = "000101"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r7)
            java.lang.String r13 = "0100"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r2)
            java.lang.String r13 = "00000100"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r4)
            java.lang.String r13 = "0000110"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r5)
            java.lang.String r13 = "0000101"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r7)
            java.lang.String r13 = "00110"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r2)
            java.lang.String r13 = "000000111"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r4)
            java.lang.String r13 = "00000110"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r5)
            java.lang.String r13 = "00000101"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r7)
            java.lang.String r13 = "001000"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r2)
            java.lang.String r13 = "00000001111"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r4)
            java.lang.String r13 = "000000110"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r5)
            java.lang.String r13 = "000000101"
            r1.set(r0, r13)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r12, r7)
            java.lang.String r13 = "000100"
            r1.set(r0, r13)
            r0 = 8
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r12 = "00000001011"
            r1.set(r13, r12)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "00000001110"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "00000001101"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "0000100"
            r1.set(r12, r0)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r2)
            java.lang.String r12 = "000000001111"
            r1.set(r0, r12)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r4)
            java.lang.String r12 = "00000001010"
            r1.set(r0, r12)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r5)
            java.lang.String r12 = "00000001001"
            r1.set(r0, r12)
            int r0 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r7)
            java.lang.String r12 = "000000100"
            r1.set(r0, r12)
            r0 = 10
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "000000001011"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "000000001110"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "000000001101"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "00000001100"
            r1.set(r12, r0)
            r0 = 11
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "000000001000"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "000000001010"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "000000001001"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "00000001000"
            r1.set(r12, r0)
            r0 = 12
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "0000000001111"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "0000000001110"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "0000000001101"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "000000001100"
            r1.set(r12, r0)
            r0 = 13
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "0000000001011"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "0000000001010"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "0000000001001"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "0000000001100"
            r1.set(r12, r0)
            r0 = 14
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "0000000000111"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "00000000001011"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "0000000000110"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "0000000001000"
            r1.set(r12, r0)
            r0 = 15
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "00000000001001"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "00000000001000"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "00000000001010"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "0000000000001"
            r1.set(r12, r0)
            r0 = 16
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r2)
            java.lang.String r13 = "00000000000111"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r4)
            java.lang.String r13 = "00000000000110"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r5)
            java.lang.String r13 = "00000000000101"
            r1.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r0, r7)
            java.lang.String r0 = "00000000000100"
            r1.set(r12, r0)
            org.jcodec.common.io.VLC[] r0 = org.jcodec.codecs.h264.H264Const.coeffToken
            org.jcodec.common.io.VLC r1 = r1.getVLC()
            r0[r7] = r1
            r0[r5] = r1
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r2, r2)
            java.lang.String r12 = "1111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r2)
            java.lang.String r12 = "001111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r4)
            java.lang.String r12 = "1110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r2)
            java.lang.String r12 = "001011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r4)
            java.lang.String r12 = "01111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r5)
            java.lang.String r12 = "1101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r2)
            java.lang.String r12 = "001000"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r4)
            java.lang.String r12 = "01100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r5)
            java.lang.String r12 = "01110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r7)
            java.lang.String r12 = "1100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r2)
            java.lang.String r12 = "0001111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r4)
            java.lang.String r12 = "01010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r5)
            java.lang.String r12 = "01011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r7)
            java.lang.String r12 = "1011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r2)
            java.lang.String r12 = "0001011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r4)
            java.lang.String r12 = "01000"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r5)
            java.lang.String r12 = "01001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r7)
            java.lang.String r12 = "1010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r2)
            java.lang.String r12 = "0001001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r4)
            java.lang.String r12 = "001110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r5)
            java.lang.String r12 = "001101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r7)
            java.lang.String r12 = "1001"
            r0.set(r1, r12)
            r1 = 7
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "0001000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "001010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "001001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "1000"
            r0.set(r12, r1)
            r1 = 8
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "00001111"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "0001110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "0001101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "01101"
            r0.set(r12, r1)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r2)
            java.lang.String r12 = "00001011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r4)
            java.lang.String r12 = "00001110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r5)
            java.lang.String r12 = "0001010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r7)
            java.lang.String r12 = "001100"
            r0.set(r1, r12)
            r1 = 10
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "000001111"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "00001010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "00001101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "0001100"
            r0.set(r12, r1)
            r1 = 11
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "000001011"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "000001110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "00001001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "00001100"
            r0.set(r12, r1)
            r1 = 12
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "000001000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "000001010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "000001101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "00001000"
            r0.set(r12, r1)
            r1 = 13
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "0000001101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "000000111"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "000001001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "000001100"
            r0.set(r12, r1)
            r1 = 14
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "0000001001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "0000001100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "0000001011"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "0000001010"
            r0.set(r12, r1)
            r1 = 15
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "0000000101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "0000001000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "0000000111"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "0000000110"
            r0.set(r12, r1)
            r1 = 16
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "0000000001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "0000000100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "0000000011"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "0000000010"
            r0.set(r12, r1)
            org.jcodec.common.io.VLC[] r1 = org.jcodec.codecs.h264.H264Const.coeffToken
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r12 = 7
            r1[r12] = r0
            r1[r11] = r0
            r1[r10] = r0
            r1[r9] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r2, r2)
            java.lang.String r12 = "000011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r2)
            java.lang.String r12 = "000000"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r4)
            java.lang.String r12 = "000001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r2)
            java.lang.String r12 = "000100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r4)
            java.lang.String r12 = "000101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r5)
            java.lang.String r12 = "000110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r2)
            java.lang.String r12 = "001000"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r4)
            java.lang.String r12 = "001001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r5)
            java.lang.String r12 = "001010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r7)
            java.lang.String r12 = "001011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r2)
            java.lang.String r12 = "001100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r4)
            java.lang.String r12 = "001101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r5)
            java.lang.String r12 = "001110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r7)
            java.lang.String r12 = "001111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r2)
            java.lang.String r12 = "010000"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r4)
            java.lang.String r12 = "010001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r5)
            java.lang.String r12 = "010010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r7)
            java.lang.String r12 = "010011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r2)
            java.lang.String r12 = "010100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r4)
            java.lang.String r12 = "010101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r5)
            java.lang.String r12 = "010110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r7)
            java.lang.String r12 = "010111"
            r0.set(r1, r12)
            r1 = 7
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "011000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "011001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "011010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "011011"
            r0.set(r12, r1)
            r1 = 8
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "011100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "011101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "011110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "011111"
            r0.set(r12, r1)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r2)
            java.lang.String r12 = "100000"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r4)
            java.lang.String r12 = "100001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r5)
            java.lang.String r12 = "100010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r14, r7)
            java.lang.String r12 = "100011"
            r0.set(r1, r12)
            r1 = 10
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "100100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "100101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "100110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "100111"
            r0.set(r12, r1)
            r1 = 11
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "101000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "101001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "101010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "101011"
            r0.set(r12, r1)
            r1 = 12
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "101100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "101101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "101110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "101111"
            r0.set(r12, r1)
            r1 = 13
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "110000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "110001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "110010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "110011"
            r0.set(r12, r1)
            r1 = 14
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "110100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "110101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "110110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "110111"
            r0.set(r12, r1)
            r1 = 15
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "111000"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "111001"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "111010"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "111011"
            r0.set(r12, r1)
            r1 = 16
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r13 = "111100"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r13 = "111101"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r13 = "111110"
            r0.set(r12, r13)
            int r12 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "111111"
            r0.set(r12, r1)
            org.jcodec.common.io.VLC[] r1 = org.jcodec.codecs.h264.H264Const.coeffToken
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r12 = 8
            r1[r12] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r2, r2)
            r0.set(r1, r6)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r2)
            java.lang.String r12 = "000111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r4)
            r0.set(r1, r3)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r2)
            java.lang.String r12 = "000100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r4)
            java.lang.String r12 = "000110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r5)
            r0.set(r1, r8)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r2)
            java.lang.String r12 = "000011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r4)
            java.lang.String r12 = "0000011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r5)
            java.lang.String r12 = "0000010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r7)
            java.lang.String r12 = "000101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r2)
            java.lang.String r12 = "000010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r4)
            java.lang.String r12 = "00000011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r5)
            java.lang.String r12 = "00000010"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r7)
            java.lang.String r12 = "0000000"
            r0.set(r1, r12)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            org.jcodec.codecs.h264.H264Const.coeffTokenChromaDCY420 = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r2, r2)
            r0.set(r1, r3)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r2)
            java.lang.String r12 = "0001111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r4, r4)
            r0.set(r1, r6)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r2)
            java.lang.String r12 = "0001110"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r4)
            java.lang.String r12 = "0001101"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r5, r5)
            r0.set(r1, r8)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r2)
            java.lang.String r12 = "000000111"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r4)
            java.lang.String r12 = "0001100"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r5)
            java.lang.String r12 = "0001011"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r7, r7)
            java.lang.String r12 = "00001"
            r0.set(r1, r12)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r2)
            java.lang.String r13 = "000000110"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r4)
            java.lang.String r13 = "000000101"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r5)
            java.lang.String r13 = "0001010"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r9, r7)
            java.lang.String r13 = "000001"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r2)
            java.lang.String r13 = "0000000111"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r4)
            java.lang.String r13 = "0000000110"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r5)
            java.lang.String r13 = "000000100"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r10, r7)
            java.lang.String r13 = "0001001"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r2)
            java.lang.String r13 = "00000000111"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r4)
            java.lang.String r13 = "00000000110"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r5)
            java.lang.String r13 = "0000000101"
            r0.set(r1, r13)
            int r1 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r11, r7)
            java.lang.String r13 = "0001000"
            r0.set(r1, r13)
            r1 = 7
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r14 = "000000000111"
            r0.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r14 = "000000000110"
            r0.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r14 = "00000000101"
            r0.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "0000000100"
            r0.set(r13, r1)
            r1 = 8
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r2)
            java.lang.String r14 = "0000000000111"
            r0.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r4)
            java.lang.String r14 = "000000000101"
            r0.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r5)
            java.lang.String r14 = "000000000100"
            r0.set(r13, r14)
            int r13 = org.jcodec.codecs.h264.io.CAVLC.coeffToken(r1, r7)
            java.lang.String r1 = "00000000100"
            r0.set(r13, r1)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            org.jcodec.codecs.h264.H264Const.coeffTokenChromaDCY422 = r0
            r0 = 7
            org.jcodec.common.io.VLC[] r1 = new org.jcodec.common.io.VLC[r0]
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r3)
            java.lang.String r13 = "0"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r2] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r3)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r6)
            java.lang.String r13 = "00"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r4] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r6)
            java.lang.String r13 = "00"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r5] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r6)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r8)
            java.lang.String r13 = "000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r7] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r15)
            java.lang.String r13 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r8)
            java.lang.String r13 = "000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r9] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r8)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r15)
            java.lang.String r13 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r10] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r15)
            java.lang.String r13 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r8)
            java.lang.String r13 = "0001"
            r14 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r12)
            java.lang.String r13 = "000001"
            r14 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "0000001"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00000001"
            r14 = 11
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000000001"
            r14 = 12
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "0000000001"
            r14 = 13
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00000000001"
            r14 = 14
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r11] = r0
            org.jcodec.codecs.h264.H264Const.run = r1
            r0 = 15
            org.jcodec.common.io.VLC[] r1 = new org.jcodec.common.io.VLC[r0]
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r3)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r15)
            java.lang.String r13 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "0011"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            java.lang.String r13 = "0010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "00011"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "00010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            java.lang.String r13 = "000011"
            r14 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000010"
            r14 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "0000011"
            r14 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "0000010"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00000011"
            r14 = 11
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00000010"
            r14 = 12
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000000011"
            r14 = 13
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000000010"
            r14 = 14
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000000001"
            r14 = 15
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r2] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r15)
            java.lang.String r13 = "0101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "0100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            java.lang.String r13 = "0011"
            r14 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "0010"
            r14 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00011"
            r14 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00010"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000011"
            r14 = 11
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000010"
            r14 = 12
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000001"
            r14 = 13
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000000"
            r14 = 14
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r4] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "0101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            java.lang.String r13 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            java.lang.String r13 = "0100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "0011"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            r13 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r15)
            java.lang.String r13 = "0010"
            r14 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00011"
            r14 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00010"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "000001"
            r14 = 11
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 12
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r12)
            java.lang.String r13 = "000000"
            r14 = 13
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r5] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "00011"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            java.lang.String r13 = "0101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "0100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            java.lang.String r13 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            java.lang.String r13 = "0011"
            r14 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r15)
            java.lang.String r13 = "0010"
            r14 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00010"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 11
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r12)
            java.lang.String r13 = "00000"
            r14 = 12
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r7] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "0101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "0100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            java.lang.String r13 = "0011"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            java.lang.String r13 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            r13 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r15)
            java.lang.String r13 = "0010"
            r14 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r12)
            java.lang.String r13 = "0001"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "00000"
            r14 = 11
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r9] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "000001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r12)
            java.lang.String r13 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r15)
            java.lang.String r13 = "010"
            r14 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            java.lang.String r13 = "0001"
            r14 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r8)
            java.lang.String r13 = "000000"
            r14 = 10
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r10] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "000001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r12)
            java.lang.String r13 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r13)
            java.lang.String r13 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r15)
            java.lang.String r13 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            java.lang.String r13 = "0001"
            r14 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            r13 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r8)
            java.lang.String r13 = "000000"
            r14 = 9
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r14, r13)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r13 = "000001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r13)
            java.lang.String r13 = "0001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r13)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r12)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r15)
            java.lang.String r13 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r13)
            java.lang.String r13 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r13)
            java.lang.String r13 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r13)
            r13 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r8)
            java.lang.String r14 = "000000"
            r11 = 8
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r14)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r13] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "000001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            java.lang.String r11 = "000000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r11)
            java.lang.String r11 = "0001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r11)
            java.lang.String r11 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r11)
            java.lang.String r11 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r8)
            r11 = 6
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r6)
            r11 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r12)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 8
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r12)
            java.lang.String r11 = "00000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r8)
            java.lang.String r11 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r11)
            java.lang.String r11 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r6)
            java.lang.String r11 = "0001"
            r13 = 6
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r13, r11)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 9
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "0000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            java.lang.String r11 = "0001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r8)
            java.lang.String r11 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r3)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r15)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 10
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "0000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            java.lang.String r11 = "0001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r6)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r3)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r8)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 11
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r8)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r3)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r6)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 12
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "00"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r6)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r3)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 13
            r1[r11] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "0"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r3)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r11 = 14
            r1[r11] = r0
            org.jcodec.codecs.h264.H264Const.totalZeros16 = r1
            org.jcodec.common.io.VLC[] r0 = new org.jcodec.common.io.VLC[r7]
            org.jcodec.common.io.VLCBuilder r1 = new org.jcodec.common.io.VLCBuilder
            r1.<init>()
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r2, r3)
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r4, r6)
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r5, r8)
            java.lang.String r11 = "000"
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r7, r11)
            org.jcodec.common.io.VLC r1 = r1.getVLC()
            r0[r2] = r1
            org.jcodec.common.io.VLCBuilder r1 = new org.jcodec.common.io.VLCBuilder
            r1.<init>()
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r2, r3)
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r4, r6)
            java.lang.String r11 = "00"
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r5, r11)
            org.jcodec.common.io.VLC r1 = r1.getVLC()
            r0[r4] = r1
            org.jcodec.common.io.VLCBuilder r1 = new org.jcodec.common.io.VLCBuilder
            r1.<init>()
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r2, r3)
            java.lang.String r11 = "0"
            org.jcodec.common.io.VLCBuilder r1 = r1.set(r4, r11)
            org.jcodec.common.io.VLC r1 = r1.getVLC()
            r0[r5] = r1
            org.jcodec.codecs.h264.H264Const.totalZeros4 = r0
            r0 = 7
            org.jcodec.common.io.VLC[] r1 = new org.jcodec.common.io.VLC[r0]
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r3)
            java.lang.String r11 = "010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r15)
            java.lang.String r11 = "0010"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r11)
            java.lang.String r11 = "0011"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r11)
            java.lang.String r11 = "0001"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r11)
            r11 = 6
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r11, r12)
            java.lang.String r11 = "00000"
            r12 = 7
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r12, r11)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r2] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r6)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r8)
            java.lang.String r11 = "100"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r11)
            java.lang.String r11 = "101"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r11)
            java.lang.String r11 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r11)
            java.lang.String r11 = "111"
            r12 = 6
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r12, r11)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r4] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r11 = "000"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r11)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r8)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r6)
            java.lang.String r8 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r8)
            java.lang.String r8 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r8)
            java.lang.String r8 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r10, r8)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r5] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r8 = "110"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r8)
            java.lang.String r8 = "00"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r8)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r6)
            java.lang.String r8 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r8)
            java.lang.String r8 = "111"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r9, r8)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r7] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r8 = "00"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r8)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r6)
            java.lang.String r8 = "10"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r8)
            java.lang.String r8 = "11"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r7, r8)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r9] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r8 = "00"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r8)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r6)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r5, r3)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r1[r10] = r0
            org.jcodec.common.io.VLCBuilder r0 = new org.jcodec.common.io.VLCBuilder
            r0.<init>()
            java.lang.String r6 = "0"
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r2, r6)
            org.jcodec.common.io.VLCBuilder r0 = r0.set(r4, r3)
            org.jcodec.common.io.VLC r0 = r0.getVLC()
            r3 = 6
            r1[r3] = r0
            org.jcodec.codecs.h264.H264Const.totalZeros8 = r1
            r0 = 22
            org.jcodec.codecs.h264.H264Const$PartPred[][] r0 = new org.jcodec.codecs.h264.H264Const.PartPred[r0][]
            r1 = 0
            r0[r2] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r4]
            org.jcodec.codecs.h264.H264Const$PartPred r3 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r1[r2] = r3
            r0[r4] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r4]
            org.jcodec.codecs.h264.H264Const$PartPred r6 = org.jcodec.codecs.h264.H264Const.PartPred.L1
            r1[r2] = r6
            r0[r5] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r4]
            org.jcodec.codecs.h264.H264Const$PartPred r8 = org.jcodec.codecs.h264.H264Const.PartPred.Bi
            r1[r2] = r8
            r0[r7] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r3
            r1[r4] = r3
            r0[r9] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r3
            r1[r4] = r3
            r0[r10] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r6
            r1[r4] = r6
            r11 = 6
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r6
            r1[r4] = r6
            r11 = 7
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r3
            r1[r4] = r6
            r11 = 8
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r3
            r1[r4] = r6
            r11 = 9
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r6
            r1[r4] = r3
            r11 = 10
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r6
            r1[r4] = r3
            r11 = 11
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r3
            r1[r4] = r8
            r11 = 12
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r3
            r1[r4] = r8
            r11 = 13
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r6
            r1[r4] = r8
            r11 = 14
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r6
            r1[r4] = r8
            r11 = 15
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r8
            r1[r4] = r3
            r11 = 16
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r8
            r1[r4] = r3
            r11 = 17
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r8
            r1[r4] = r6
            r11 = 18
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r8
            r1[r4] = r6
            r11 = 19
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r8
            r1[r4] = r8
            r11 = 20
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r5]
            r1[r2] = r8
            r1[r4] = r8
            r11 = 21
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const.bPredModes = r0
            r0 = 23
            org.jcodec.codecs.h264.io.model.MBType[] r0 = new org.jcodec.codecs.h264.io.model.MBType[r0]
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Direct_16x16
            r0[r2] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_16x16
            r0[r4] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_16x16
            r0[r5] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_16x16
            r0[r7] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_L0_16x8
            r0[r9] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_L0_8x16
            r0[r10] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_L1_16x8
            r11 = 6
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_L1_8x16
            r11 = 7
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_L1_16x8
            r11 = 8
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_L1_8x16
            r11 = 9
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_L0_16x8
            r11 = 10
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_L0_8x16
            r11 = 11
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_Bi_16x8
            r11 = 12
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L0_Bi_8x16
            r11 = 13
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_Bi_16x8
            r11 = 14
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_L1_Bi_8x16
            r11 = 15
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_L0_16x8
            r11 = 16
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_L0_8x16
            r11 = 17
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_L1_16x8
            r11 = 18
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_L1_8x16
            r11 = 19
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_Bi_16x8
            r11 = 20
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_Bi_Bi_8x16
            r11 = 21
            r0[r11] = r1
            org.jcodec.codecs.h264.io.model.MBType r1 = org.jcodec.codecs.h264.io.model.MBType.B_8x8
            r11 = 22
            r0[r11] = r1
            org.jcodec.codecs.h264.H264Const.bMbTypes = r0
            r0 = 22
            int[] r0 = new int[r0]
            r0 = {x14f4: FILL_ARRAY_DATA , data: [0, 16, 16, 16, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8} // fill-array
            org.jcodec.codecs.h264.H264Const.bPartW = r0
            r0 = 22
            int[] r0 = new int[r0]
            r0 = {x1524: FILL_ARRAY_DATA , data: [0, 16, 16, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16, 8, 16} // fill-array
            org.jcodec.codecs.h264.H264Const.bPartH = r0
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x1554: FILL_ARRAY_DATA , data: [0, 4, 0, 4, 8, 12, 8, 12, 0, 4, 0, 4, 8, 12, 8, 12} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_X = r1
            int[] r1 = new int[r0]
            r1 = {x1578: FILL_ARRAY_DATA , data: [0, 0, 4, 4, 0, 0, 4, 4, 8, 8, 12, 12, 8, 8, 12, 12} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_Y = r1
            int[] r1 = new int[r9]
            r1 = {x159c: FILL_ARRAY_DATA , data: [0, 8, 0, 8} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_8x8_X = r1
            int[] r1 = new int[r9]
            r1 = {x15a8: FILL_ARRAY_DATA , data: [0, 0, 8, 8} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_8x8_Y = r1
            int[] r1 = new int[r0]
            r1 = {x15b4: FILL_ARRAY_DATA , data: [0, 1, 4, 5, 2, 3, 6, 7, 8, 9, 12, 13, 10, 11, 14, 15} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_INV_MAP = r1
            int[] r1 = new int[r0]
            r1 = {x15d8: FILL_ARRAY_DATA , data: [0, 1, 0, 1, 2, 3, 2, 3, 0, 1, 0, 1, 2, 3, 2, 3} // fill-array
            org.jcodec.codecs.h264.H264Const.MB_BLK_OFF_LEFT = r1
            int[] r1 = new int[r0]
            r1 = {x15fc: FILL_ARRAY_DATA , data: [0, 0, 1, 1, 0, 0, 1, 1, 2, 2, 3, 3, 2, 2, 3, 3} // fill-array
            org.jcodec.codecs.h264.H264Const.MB_BLK_OFF_TOP = r1
            r0 = 52
            int[] r0 = new int[r0]
            r0 = {x1620: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 29, 30, 31, 32, 32, 33, 34, 34, 35, 35, 36, 36, 37, 37, 37, 38, 38, 38, 39, 39, 39, 39} // fill-array
            org.jcodec.codecs.h264.H264Const.QP_SCALE_CR = r0
            r0 = 0
            r1 = 0
            org.jcodec.common.model.Picture8Bit r0 = org.jcodec.common.model.Picture8Bit.createPicture8Bit(r2, r2, r0, r1)
            org.jcodec.codecs.h264.H264Const.NO_PIC = r0
            int[] r0 = new int[r9]
            r0 = {x168c: FILL_ARRAY_DATA , data: [0, 8, 128, 136} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_8x8_MB_OFF_LUMA = r0
            int[] r0 = new int[r9]
            r0 = {x1698: FILL_ARRAY_DATA , data: [0, 4, 32, 36} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_8x8_MB_OFF_CHROMA = r0
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x16a4: FILL_ARRAY_DATA , data: [0, 4, 8, 12, 64, 68, 72, 76, 128, 132, 136, 140, 192, 196, 200, 204} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_4x4_MB_OFF_LUMA = r1
            int[] r1 = new int[r0]
            r1 = {x16c8: FILL_ARRAY_DATA , data: [0, 0, 1, 1, 0, 0, 1, 1, 2, 2, 3, 3, 2, 2, 3, 3} // fill-array
            org.jcodec.codecs.h264.H264Const.BLK_8x8_IND = r1
            int[][] r0 = new int[r9][]
            int[] r1 = new int[r9]
            r1 = {x16ec: FILL_ARRAY_DATA , data: [0, 1, 4, 5} // fill-array
            r0[r2] = r1
            int[] r1 = new int[r9]
            r1 = {x16f8: FILL_ARRAY_DATA , data: [2, 3, 6, 7} // fill-array
            r0[r4] = r1
            int[] r1 = new int[r9]
            r1 = {x1704: FILL_ARRAY_DATA , data: [8, 9, 12, 13} // fill-array
            r0[r5] = r1
            int[] r1 = new int[r9]
            r1 = {x1710: FILL_ARRAY_DATA , data: [10, 11, 14, 15} // fill-array
            r0[r7] = r1
            org.jcodec.codecs.h264.H264Const.BLK8x8_BLOCKS = r0
            int[][] r0 = new int[r9][]
            int[] r1 = new int[r4]
            r1[r2] = r2
            r0[r2] = r1
            int[] r1 = new int[r4]
            r1[r2] = r4
            r0[r4] = r1
            int[] r1 = new int[r4]
            r1[r2] = r5
            r0[r5] = r1
            int[] r1 = new int[r4]
            r1[r2] = r7
            r0[r7] = r1
            org.jcodec.codecs.h264.H264Const.ARRAY = r0
            int[][] r0 = buildPixSplitMap4x4()
            org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_4x4 = r0
            int[][] r0 = buildPixSplitMap2x2()
            org.jcodec.codecs.h264.H264Const.PIX_MAP_SPLIT_2x2 = r0
            r0 = 48
            int[] r0 = new int[r0]
            r0 = {x171c: FILL_ARRAY_DATA , data: [47, 31, 15, 0, 23, 27, 29, 30, 7, 11, 13, 14, 39, 43, 45, 46, 16, 3, 5, 10, 12, 19, 21, 26, 28, 35, 37, 42, 44, 1, 2, 4, 8, 17, 18, 20, 24, 6, 9, 22, 25, 32, 33, 34, 36, 40, 38, 41} // fill-array
            org.jcodec.codecs.h264.H264Const.CODED_BLOCK_PATTERN_INTRA_COLOR = r0
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x1780: FILL_ARRAY_DATA , data: [15, 0, 7, 11, 13, 14, 3, 5, 10, 12, 1, 2, 4, 8, 6, 9} // fill-array
            org.jcodec.codecs.h264.H264Const.coded_block_pattern_intra_monochrome = r1
            r1 = 48
            int[] r1 = new int[r1]
            r1 = {x17a4: FILL_ARRAY_DATA , data: [0, 16, 1, 2, 4, 8, 32, 3, 5, 10, 12, 15, 47, 7, 11, 13, 14, 6, 9, 31, 35, 37, 42, 44, 33, 34, 36, 40, 39, 43, 45, 46, 17, 18, 20, 24, 19, 21, 26, 28, 23, 27, 29, 30, 22, 25, 38, 41} // fill-array
            org.jcodec.codecs.h264.H264Const.CODED_BLOCK_PATTERN_INTER_COLOR = r1
            int[] r1 = inverse(r1)
            org.jcodec.codecs.h264.H264Const.CODED_BLOCK_PATTERN_INTER_COLOR_INV = r1
            int[] r1 = new int[r0]
            r1 = {x1808: FILL_ARRAY_DATA , data: [0, 1, 2, 4, 8, 3, 5, 10, 12, 15, 7, 11, 13, 14, 6, 9} // fill-array
            org.jcodec.codecs.h264.H264Const.coded_block_pattern_inter_monochrome = r1
            r0 = 63
            int[] r0 = new int[r0]
            r0 = {x182c: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 5, 4, 4, 3, 3, 4, 4, 4, 5, 5, 4, 4, 4, 4, 3, 3, 6, 7, 7, 7, 8, 9, 10, 9, 8, 7, 7, 6, 11, 12, 13, 11, 6, 7, 8, 9, 14, 10, 9, 8, 6, 11, 12, 13, 11, 6, 9, 14, 10, 9, 11, 12, 13, 11, 14, 10, 12} // fill-array
            org.jcodec.codecs.h264.H264Const.sig_coeff_map_8x8 = r0
            r0 = 63
            int[] r0 = new int[r0]
            r0 = {x18ae: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7, 8, 4, 5, 6, 9, 10, 10, 8, 11, 12, 11, 9, 9, 10, 10, 8, 11, 12, 11, 9, 9, 10, 10, 8, 11, 12, 11, 9, 9, 10, 10, 8, 13, 13, 9, 9, 10, 10, 8, 13, 13, 9, 9, 10, 10, 14, 14, 14, 14, 14} // fill-array
            org.jcodec.codecs.h264.H264Const.sig_coeff_map_8x8_mbaff = r0
            r0 = 63
            int[] r0 = new int[r0]
            r0 = {x1930: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8} // fill-array
            org.jcodec.codecs.h264.H264Const.last_sig_coeff_map_8x8 = r0
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x19b2: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15} // fill-array
            org.jcodec.codecs.h264.H264Const.identityMapping16 = r1
            int[] r0 = new int[r9]
            r0 = {x19d6: FILL_ARRAY_DATA , data: [0, 1, 2, 3} // fill-array
            org.jcodec.codecs.h264.H264Const.identityMapping4 = r0
            r0 = 13
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = new org.jcodec.codecs.h264.H264Const.PartPred[r0]
            org.jcodec.codecs.h264.H264Const$PartPred r0 = org.jcodec.codecs.h264.H264Const.PartPred.Direct
            r1[r2] = r0
            r1[r4] = r3
            r1[r5] = r6
            r1[r7] = r8
            r1[r9] = r3
            r1[r10] = r3
            r0 = 6
            r1[r0] = r6
            r0 = 7
            r1[r0] = r6
            r0 = 8
            r1[r0] = r8
            r0 = 9
            r1[r0] = r8
            r0 = 10
            r1[r0] = r3
            r0 = 11
            r1[r0] = r6
            r0 = 12
            r1[r0] = r8
            org.jcodec.codecs.h264.H264Const.bPartPredModes = r1
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x19e2: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 1, 2, 1, 2, 1, 2, 3, 3, 3} // fill-array
            org.jcodec.codecs.h264.H264Const.bSubMbTypes = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            org.jcodec.codecs.h264.H264Const.LUMA_4x4_BLOCK_LUT = r0
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]
            org.jcodec.codecs.h264.H264Const.LUMA_4x4_POS_LUT = r1
            r3 = 256(0x100, float:3.59E-43)
            int[] r3 = new int[r3]
            org.jcodec.codecs.h264.H264Const.LUMA_8x8_BLOCK_LUT = r3
            r6 = 256(0x100, float:3.59E-43)
            int[] r6 = new int[r6]
            org.jcodec.codecs.h264.H264Const.LUMA_8x8_POS_LUT = r6
            r8 = 64
            int[] r8 = new int[r8]
            org.jcodec.codecs.h264.H264Const.CHROMA_BLOCK_LUT = r8
            r10 = 64
            int[] r10 = new int[r10]
            org.jcodec.codecs.h264.H264Const.CHROMA_POS_LUT = r10
            int[][] r11 = new int[r7][]
            r11[r2] = r0
            r11[r4] = r8
            r11[r5] = r8
            org.jcodec.codecs.h264.H264Const.COMP_BLOCK_4x4_LUT = r11
            int[][] r0 = new int[r7][]
            r0[r2] = r1
            r0[r4] = r10
            r0[r5] = r10
            org.jcodec.codecs.h264.H264Const.COMP_POS_4x4_LUT = r0
            int[][] r0 = new int[r7][]
            r0[r2] = r3
            r0[r4] = r8
            r0[r5] = r8
            org.jcodec.codecs.h264.H264Const.COMP_BLOCK_8x8_LUT = r0
            int[][] r0 = new int[r7][]
            r0[r2] = r6
            r0[r4] = r10
            r0[r5] = r10
            org.jcodec.codecs.h264.H264Const.COMP_POS_8x8_LUT = r0
            r0 = 16
            int[] r1 = new int[r0]
            r3 = 0
        L1456:
            if (r3 >= r0) goto L1489
            r4 = 0
        L1459:
            if (r4 >= r0) goto L1462
            r1[r4] = r4
            int r4 = r4 + 1
            r0 = 16
            goto L1459
        L1462:
            int[] r0 = org.jcodec.codecs.h264.H264Const.BLK_X
            r11 = r0[r3]
            int[] r0 = org.jcodec.codecs.h264.H264Const.BLK_Y
            r12 = r0[r3]
            r13 = 4
            r14 = 4
            r15 = 16
            int[] r16 = org.jcodec.codecs.h264.H264Const.LUMA_4x4_POS_LUT
            r10 = r1
            putBlk(r10, r11, r12, r13, r14, r15, r16)
            java.util.Arrays.fill(r1, r3)
            int[] r0 = org.jcodec.codecs.h264.H264Const.BLK_X
            r11 = r0[r3]
            int[] r0 = org.jcodec.codecs.h264.H264Const.BLK_Y
            r12 = r0[r3]
            int[] r16 = org.jcodec.codecs.h264.H264Const.LUMA_4x4_BLOCK_LUT
            putBlk(r10, r11, r12, r13, r14, r15, r16)
            int r3 = r3 + 1
            r0 = 16
            goto L1456
        L1489:
            r0 = 0
        L148a:
            if (r0 >= r9) goto L14bb
            r3 = 0
            r4 = 16
        L148f:
            if (r3 >= r4) goto L1496
            r1[r3] = r3
            int r3 = r3 + 1
            goto L148f
        L1496:
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_X
            r11 = r3[r0]
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_Y
            r12 = r3[r0]
            r13 = 4
            r14 = 4
            r15 = 8
            int[] r16 = org.jcodec.codecs.h264.H264Const.CHROMA_POS_LUT
            r10 = r1
            putBlk(r10, r11, r12, r13, r14, r15, r16)
            java.util.Arrays.fill(r1, r0)
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_X
            r11 = r3[r0]
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_Y
            r12 = r3[r0]
            int[] r16 = org.jcodec.codecs.h264.H264Const.CHROMA_BLOCK_LUT
            putBlk(r10, r11, r12, r13, r14, r15, r16)
            int r0 = r0 + 1
            goto L148a
        L14bb:
            r0 = 64
            int[] r0 = new int[r0]
            r1 = 0
        L14c0:
            if (r1 >= r9) goto L14f3
            r3 = 0
        L14c3:
            r4 = 64
            if (r3 >= r4) goto L14cc
            r0[r3] = r3
            int r3 = r3 + 1
            goto L14c3
        L14cc:
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_8x8_X
            r11 = r3[r1]
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_8x8_Y
            r12 = r3[r1]
            r13 = 8
            r14 = 8
            r15 = 16
            int[] r16 = org.jcodec.codecs.h264.H264Const.LUMA_8x8_POS_LUT
            r10 = r0
            putBlk(r10, r11, r12, r13, r14, r15, r16)
            java.util.Arrays.fill(r0, r1)
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_8x8_X
            r11 = r3[r1]
            int[] r3 = org.jcodec.codecs.h264.H264Const.BLK_8x8_Y
            r12 = r3[r1]
            int[] r16 = org.jcodec.codecs.h264.H264Const.LUMA_8x8_BLOCK_LUT
            putBlk(r10, r11, r12, r13, r14, r15, r16)
            int r1 = r1 + 1
            goto L14c0
        L14f3:
            return
    }

    private static int[][] buildPixSplitMap2x2() {
            r0 = 4
            int[][] r0 = new int[r0][]
            r1 = 16
            int[] r2 = new int[r1]
            r2 = {x0040: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 8, 9, 10, 11, 16, 17, 18, 19, 24, 25, 26, 27} // fill-array
            r3 = 0
            r0[r3] = r2
            int[] r2 = new int[r1]
            r4 = 1
            r0[r4] = r2
            int[] r2 = new int[r1]
            r4 = 2
            r0[r4] = r2
            int[] r2 = new int[r1]
            r5 = 3
            r0[r5] = r2
            r2 = 0
            r5 = 0
            r6 = 0
        L1f:
            if (r2 >= r4) goto L3f
            r7 = 0
        L22:
            if (r7 >= r4) goto L3a
            r8 = 0
        L25:
            if (r8 >= r1) goto L33
            r9 = r0[r6]
            r10 = r0[r3]
            r10 = r10[r8]
            int r10 = r10 + r5
            r9[r8] = r10
            int r8 = r8 + 1
            goto L25
        L33:
            int r7 = r7 + 1
            int r6 = r6 + 1
            int r5 = r5 + 4
            goto L22
        L3a:
            int r5 = r5 + 24
            int r2 = r2 + 1
            goto L1f
        L3f:
            return r0
    }

    private static int[][] buildPixSplitMap4x4() {
            r0 = 16
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x0084: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 16, 17, 18, 19, 32, 33, 34, 35, 48, 49, 50, 51} // fill-array
            r3 = 0
            r1[r3] = r2
            int[] r2 = new int[r0]
            r4 = 1
            r1[r4] = r2
            int[] r2 = new int[r0]
            r4 = 2
            r1[r4] = r2
            int[] r2 = new int[r0]
            r4 = 3
            r1[r4] = r2
            int[] r2 = new int[r0]
            r4 = 4
            r1[r4] = r2
            int[] r2 = new int[r0]
            r5 = 5
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 6
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 7
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 8
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 9
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 10
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 11
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 12
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 13
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 14
            r1[r5] = r2
            int[] r2 = new int[r0]
            r5 = 15
            r1[r5] = r2
            r2 = 0
            r5 = 0
            r6 = 0
        L62:
            if (r2 >= r4) goto L82
            r7 = 0
        L65:
            if (r7 >= r4) goto L7d
            r8 = 0
        L68:
            if (r8 >= r0) goto L76
            r9 = r1[r6]
            r10 = r1[r3]
            r10 = r10[r8]
            int r10 = r10 + r5
            r9[r8] = r10
            int r8 = r8 + 1
            goto L68
        L76:
            int r7 = r7 + 1
            int r6 = r6 + 1
            int r5 = r5 + 4
            goto L65
        L7d:
            int r5 = r5 + 48
            int r2 = r2 + 1
            goto L62
        L82:
            return r1
    }

    private static int[] inverse(int[] r4) {
            int r0 = r4.length
            int[] r1 = new int[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto Ld
            r3 = r4[r2]
            r1[r3] = r2
            int r2 = r2 + 1
            goto L4
        Ld:
            return r1
    }

    private static void putBlk(int[] r5, int r6, int r7, int r8, int r9, int r10, int[] r11) {
            int r7 = r7 * r10
            int r7 = r7 + r6
            r6 = 0
            r0 = 0
            r1 = 0
        L6:
            if (r0 >= r9) goto L1b
            r2 = 0
        L9:
            if (r2 >= r8) goto L16
            int r3 = r7 + r2
            int r4 = r1 + r2
            r4 = r5[r4]
            r11[r3] = r4
            int r2 = r2 + 1
            goto L9
        L16:
            int r1 = r1 + r8
            int r7 = r7 + r10
            int r0 = r0 + 1
            goto L6
        L1b:
            return
    }
}
