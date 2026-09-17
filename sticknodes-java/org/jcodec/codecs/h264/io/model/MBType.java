package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public final class MBType {
    public static final org.jcodec.codecs.h264.io.model.MBType B_8x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_16x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_Bi_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_Bi_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_L0_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_L0_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_L1_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Bi_L1_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_Direct_16x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_16x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_Bi_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_Bi_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_L0_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_L0_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_L1_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L0_L1_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_16x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_Bi_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_Bi_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_L0_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_L0_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_L1_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType B_L1_L1_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType I_16x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType I_NxN = null;
    public static final org.jcodec.codecs.h264.io.model.MBType I_PCM = null;
    public static final org.jcodec.codecs.h264.io.model.MBType P_16x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType P_16x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType P_8x16 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType P_8x8 = null;
    public static final org.jcodec.codecs.h264.io.model.MBType P_8x8ref0 = null;
    public int _code;
    public boolean intra;

    static {
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.MBType.I_NxN = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r1, r1)
            org.jcodec.codecs.h264.io.model.MBType.I_16x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r3 = 25
            r0.<init>(r1, r3)
            org.jcodec.codecs.h264.io.model.MBType.I_PCM = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r2)
            org.jcodec.codecs.h264.io.model.MBType.P_16x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.P_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r3 = 2
            r0.<init>(r2, r3)
            org.jcodec.codecs.h264.io.model.MBType.P_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r4 = 3
            r0.<init>(r2, r4)
            org.jcodec.codecs.h264.io.model.MBType.P_8x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r5 = 4
            r0.<init>(r2, r5)
            org.jcodec.codecs.h264.io.model.MBType.P_8x8ref0 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r2)
            org.jcodec.codecs.h264.io.model.MBType.B_Direct_16x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_16x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r3)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_16x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r4)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_16x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r0.<init>(r2, r5)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_L0_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 5
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_L0_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 6
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_L1_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 7
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_L1_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 8
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_L1_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 9
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_L1_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 10
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_L0_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 11
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_L0_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 12
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_Bi_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 13
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L0_Bi_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 14
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_Bi_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 15
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_L1_Bi_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 16
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_L0_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 17
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_L0_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 18
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_L1_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 19
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_L1_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 20
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_Bi_16x8 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 21
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_Bi_Bi_8x16 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = new org.jcodec.codecs.h264.io.model.MBType
            r1 = 22
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.MBType.B_8x8 = r0
            return
    }

    private MBType(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.intra = r1
            r0._code = r2
            return
    }

    public int code() {
            r1 = this;
            int r0 = r1._code
            return r0
    }

    public boolean isIntra() {
            r1 = this;
            boolean r0 = r1.intra
            return r0
    }
}
