package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class MotionEstimator {
    private int maxSearchRange;

    public MotionEstimator(int r1) {
            r0 = this;
            r0.<init>()
            r0.maxSearchRange = r1
            return
    }

    private int sad(byte[] r8, int r9, byte[] r10, int r11, int r12) {
            r7 = this;
            int r12 = r12 * r9
            int r12 = r12 + r11
            r11 = 0
            r0 = 0
            r1 = 0
            r2 = 0
        L7:
            r3 = 16
            if (r0 >= r3) goto L25
            r4 = 0
        Lc:
            if (r4 >= r3) goto L1f
            r5 = r8[r12]
            r6 = r10[r2]
            int r5 = r5 - r6
            int r5 = org.jcodec.common.tools.MathUtil.abs(r5)
            int r1 = r1 + r5
            int r4 = r4 + 1
            int r12 = r12 + 1
            int r2 = r2 + 1
            goto Lc
        L1f:
            int r3 = r9 + (-16)
            int r12 = r12 + r3
            int r0 = r0 + 1
            goto L7
        L25:
            return r1
    }

    public int[] estimate(org.jcodec.common.model.Picture8Bit r22, byte[] r23, int r24, int r25, int r26, int r27) {
            r21 = this;
            r6 = r21
            r0 = r22
            int r1 = r6.maxSearchRange
            int r2 = r1 * 2
            int r2 = r2 + 16
            int r3 = r1 * 2
            int r3 = r3 + 16
            int r2 = r2 * r3
            byte[] r15 = new byte[r2]
            int r2 = r24 << 4
            int r3 = r25 << 4
            int r1 = r2 - r1
            r5 = 0
            int r10 = java.lang.Math.max(r1, r5)
            int r1 = r6.maxSearchRange
            int r1 = r3 - r1
            int r11 = java.lang.Math.max(r1, r5)
            int r1 = r6.maxSearchRange
            int r1 = r1 + r2
            int r1 = r1 + 16
            int r4 = r0.getPlaneWidth(r5)
            int r1 = java.lang.Math.min(r1, r4)
            int r4 = r6.maxSearchRange
            int r4 = r4 + r3
            int r4 = r4 + 16
            int r7 = r0.getPlaneHeight(r5)
            int r4 = java.lang.Math.min(r4, r7)
            int r16 = r2 - r10
            int r17 = r3 - r11
            int r18 = r1 - r10
            int r19 = r4 - r11
            byte[] r7 = r0.getPlaneData(r5)
            int r8 = r0.getPlaneWidth(r5)
            int r9 = r0.getPlaneHeight(r5)
            r12 = r15
            r13 = r18
            r14 = r19
            org.jcodec.codecs.h264.encode.MBEncoderHelper.takeSafe(r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r21
            r1 = r15
            r2 = r18
            r3 = r23
            r4 = r16
            r7 = 0
            r5 = r17
            int r0 = r0.sad(r1, r2, r3, r4, r5)
            r8 = r0
            r10 = r16
            r11 = r17
            r9 = 0
        L71:
            int r0 = r6.maxSearchRange
            r12 = 1
            if (r9 >= r0) goto Lfa
            if (r10 <= 0) goto L88
            int r4 = r10 + (-1)
            r0 = r21
            r1 = r15
            r2 = r18
            r3 = r23
            r5 = r11
            int r0 = r0.sad(r1, r2, r3, r4, r5)
            r14 = r0
            goto L8b
        L88:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L8b:
            int r0 = r18 + (-1)
            if (r10 >= r0) goto L9f
            int r4 = r10 + 1
            r0 = r21
            r1 = r15
            r2 = r18
            r3 = r23
            r5 = r11
            int r0 = r0.sad(r1, r2, r3, r4, r5)
            r5 = r0
            goto La2
        L9f:
            r5 = 2147483647(0x7fffffff, float:NaN)
        La2:
            if (r11 <= 0) goto Lb7
            int r20 = r11 + (-1)
            r0 = r21
            r1 = r15
            r2 = r18
            r3 = r23
            r4 = r10
            r13 = r5
            r5 = r20
            int r0 = r0.sad(r1, r2, r3, r4, r5)
            r5 = r0
            goto Lbb
        Lb7:
            r13 = r5
            r5 = 2147483647(0x7fffffff, float:NaN)
        Lbb:
            int r0 = r19 + (-1)
            if (r11 >= r0) goto Ld1
            int r20 = r11 + 1
            r0 = r21
            r1 = r15
            r2 = r18
            r3 = r23
            r4 = r10
            r12 = r5
            r5 = r20
            int r0 = r0.sad(r1, r2, r3, r4, r5)
            goto Ld5
        Ld1:
            r12 = r5
            r0 = 2147483647(0x7fffffff, float:NaN)
        Ld5:
            int r1 = java.lang.Math.min(r14, r13)
            int r1 = java.lang.Math.min(r1, r12)
            int r0 = java.lang.Math.min(r1, r0)
            if (r0 <= r8) goto Le4
            goto Lfa
        Le4:
            if (r14 != r0) goto Le9
            int r10 = r10 + (-1)
            goto Lf5
        Le9:
            if (r13 != r0) goto Lee
            int r10 = r10 + 1
            goto Lf5
        Lee:
            if (r12 != r0) goto Lf3
            int r11 = r11 + (-1)
            goto Lf5
        Lf3:
            int r11 = r11 + 1
        Lf5:
            int r9 = r9 + 1
            r8 = r0
            goto L71
        Lfa:
            r0 = 2
            int[] r1 = new int[r0]
            int r10 = r10 - r16
            int r2 = r10 << 2
            r1[r7] = r2
            int r11 = r11 - r17
            int r0 = r11 << 2
            r2 = 1
            r1[r2] = r0
            return r1
    }
}
