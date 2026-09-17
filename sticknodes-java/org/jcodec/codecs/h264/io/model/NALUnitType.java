package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public final class NALUnitType {
    public static final org.jcodec.codecs.h264.io.model.NALUnitType ACC_UNIT_DELIM = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType AUX_SLICE = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType END_OF_SEQ = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType END_OF_STREAM = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType FILLER_DATA = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType IDR_SLICE = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType NON_IDR_SLICE = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType PPS = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType SEI = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType SEQ_PAR_SET_EXT = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType SLICE_PART_A = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType SLICE_PART_B = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType SLICE_PART_C = null;
    public static final org.jcodec.codecs.h264.io.model.NALUnitType SPS = null;
    private static final org.jcodec.codecs.h264.io.model.NALUnitType[] _values = null;
    private static final org.jcodec.codecs.h264.io.model.NALUnitType[] lut = null;
    private final java.lang.String displayName;
    private final int value;

    static {
            org.jcodec.codecs.h264.io.model.NALUnitType r0 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r1 = 1
            java.lang.String r2 = "non IDR slice"
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.NALUnitType.NON_IDR_SLICE = r0
            org.jcodec.codecs.h264.io.model.NALUnitType r2 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r3 = 2
            java.lang.String r4 = "slice part a"
            r2.<init>(r3, r4)
            org.jcodec.codecs.h264.io.model.NALUnitType.SLICE_PART_A = r2
            org.jcodec.codecs.h264.io.model.NALUnitType r4 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r5 = 3
            java.lang.String r6 = "slice part b"
            r4.<init>(r5, r6)
            org.jcodec.codecs.h264.io.model.NALUnitType.SLICE_PART_B = r4
            org.jcodec.codecs.h264.io.model.NALUnitType r6 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r7 = 4
            java.lang.String r8 = "slice part c"
            r6.<init>(r7, r8)
            org.jcodec.codecs.h264.io.model.NALUnitType.SLICE_PART_C = r6
            org.jcodec.codecs.h264.io.model.NALUnitType r8 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r9 = 5
            java.lang.String r10 = "idr slice"
            r8.<init>(r9, r10)
            org.jcodec.codecs.h264.io.model.NALUnitType.IDR_SLICE = r8
            org.jcodec.codecs.h264.io.model.NALUnitType r10 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r11 = 6
            java.lang.String r12 = "sei"
            r10.<init>(r11, r12)
            org.jcodec.codecs.h264.io.model.NALUnitType.SEI = r10
            org.jcodec.codecs.h264.io.model.NALUnitType r12 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r13 = 7
            java.lang.String r14 = "sequence parameter set"
            r12.<init>(r13, r14)
            org.jcodec.codecs.h264.io.model.NALUnitType.SPS = r12
            org.jcodec.codecs.h264.io.model.NALUnitType r14 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 8
            java.lang.String r13 = "picture parameter set"
            r14.<init>(r15, r13)
            org.jcodec.codecs.h264.io.model.NALUnitType.PPS = r14
            org.jcodec.codecs.h264.io.model.NALUnitType r13 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 9
            java.lang.String r11 = "access unit delimiter"
            r13.<init>(r15, r11)
            org.jcodec.codecs.h264.io.model.NALUnitType.ACC_UNIT_DELIM = r13
            org.jcodec.codecs.h264.io.model.NALUnitType r11 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 10
            java.lang.String r9 = "end of sequence"
            r11.<init>(r15, r9)
            org.jcodec.codecs.h264.io.model.NALUnitType.END_OF_SEQ = r11
            org.jcodec.codecs.h264.io.model.NALUnitType r9 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 11
            java.lang.String r7 = "end of stream"
            r9.<init>(r15, r7)
            org.jcodec.codecs.h264.io.model.NALUnitType.END_OF_STREAM = r9
            org.jcodec.codecs.h264.io.model.NALUnitType r7 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 12
            java.lang.String r5 = "filler data"
            r7.<init>(r15, r5)
            org.jcodec.codecs.h264.io.model.NALUnitType.FILLER_DATA = r7
            org.jcodec.codecs.h264.io.model.NALUnitType r5 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 13
            java.lang.String r3 = "sequence parameter set extension"
            r5.<init>(r15, r3)
            org.jcodec.codecs.h264.io.model.NALUnitType.SEQ_PAR_SET_EXT = r5
            org.jcodec.codecs.h264.io.model.NALUnitType r3 = new org.jcodec.codecs.h264.io.model.NALUnitType
            r15 = 19
            java.lang.String r1 = "auxilary slice"
            r3.<init>(r15, r1)
            org.jcodec.codecs.h264.io.model.NALUnitType.AUX_SLICE = r3
            r1 = 14
            org.jcodec.codecs.h264.io.model.NALUnitType[] r1 = new org.jcodec.codecs.h264.io.model.NALUnitType[r1]
            r15 = 0
            r1[r15] = r0
            r0 = 1
            r1[r0] = r2
            r0 = 2
            r1[r0] = r4
            r0 = 3
            r1[r0] = r6
            r0 = 4
            r1[r0] = r8
            r0 = 5
            r1[r0] = r10
            r0 = 6
            r1[r0] = r12
            r0 = 7
            r1[r0] = r14
            r0 = 8
            r1[r0] = r13
            r0 = 9
            r1[r0] = r11
            r0 = 10
            r1[r0] = r9
            r0 = 11
            r1[r0] = r7
            r0 = 12
            r1[r0] = r5
            r0 = 13
            r1[r0] = r3
            org.jcodec.codecs.h264.io.model.NALUnitType._values = r1
            r0 = 256(0x100, float:3.59E-43)
            org.jcodec.codecs.h264.io.model.NALUnitType[] r0 = new org.jcodec.codecs.h264.io.model.NALUnitType[r0]
            org.jcodec.codecs.h264.io.model.NALUnitType.lut = r0
        Lcf:
            org.jcodec.codecs.h264.io.model.NALUnitType[] r0 = org.jcodec.codecs.h264.io.model.NALUnitType._values
            int r1 = r0.length
            if (r15 >= r1) goto Ldf
            r0 = r0[r15]
            org.jcodec.codecs.h264.io.model.NALUnitType[] r1 = org.jcodec.codecs.h264.io.model.NALUnitType.lut
            int r2 = r0.value
            r1[r2] = r0
            int r15 = r15 + 1
            goto Lcf
        Ldf:
            return
    }

    private NALUnitType(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.displayName = r2
            return
    }

    public static org.jcodec.codecs.h264.io.model.NALUnitType fromValue(int r2) {
            org.jcodec.codecs.h264.io.model.NALUnitType[] r0 = org.jcodec.codecs.h264.io.model.NALUnitType.lut
            int r1 = r0.length
            if (r2 >= r1) goto L8
            r2 = r0[r2]
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
