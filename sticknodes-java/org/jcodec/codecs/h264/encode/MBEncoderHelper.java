package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class MBEncoderHelper {
    private static void pubBlkOnePlane(byte[] r4, int r5, byte[] r6, int r7, int r8, int r9, int r10) {
            int r10 = r10 * r5
            int r10 = r10 + r9
            r9 = 0
            r0 = 0
            r1 = 0
        L6:
            if (r0 >= r8) goto L1c
            r2 = 0
        L9:
            if (r2 >= r7) goto L16
            r3 = r6[r1]
            r4[r10] = r3
            int r2 = r2 + 1
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L9
        L16:
            int r2 = r5 - r7
            int r10 = r10 + r2
            int r0 = r0 + 1
            goto L6
        L1c:
            return
    }

    public static final void putBlk(byte[] r14, int[] r15, byte[] r16, int r17, int r18, int r19, int r20, int r21) {
            r0 = 1
            int r0 = r0 << r17
            int r1 = r19 << r17
            int r1 = r1 + r18
            r2 = 0
            r3 = r21
            r4 = 0
            r5 = 0
        Lc:
            if (r4 >= r3) goto L5f
            r6 = r20
            r8 = r1
            r7 = 0
        L12:
            if (r7 >= r6) goto L5b
            r9 = r15[r5]
            r10 = r16[r5]
            int r9 = r9 + r10
            r10 = -128(0xffffffffffffff80, float:NaN)
            r11 = 127(0x7f, float:1.78E-43)
            int r9 = org.jcodec.common.tools.MathUtil.clip(r9, r10, r11)
            byte r9 = (byte) r9
            r14[r8] = r9
            int r9 = r8 + 1
            int r12 = r5 + 1
            r13 = r15[r12]
            r12 = r16[r12]
            int r13 = r13 + r12
            int r12 = org.jcodec.common.tools.MathUtil.clip(r13, r10, r11)
            byte r12 = (byte) r12
            r14[r9] = r12
            int r9 = r8 + 2
            int r12 = r5 + 2
            r13 = r15[r12]
            r12 = r16[r12]
            int r13 = r13 + r12
            int r12 = org.jcodec.common.tools.MathUtil.clip(r13, r10, r11)
            byte r12 = (byte) r12
            r14[r9] = r12
            int r9 = r8 + 3
            int r12 = r5 + 3
            r13 = r15[r12]
            r12 = r16[r12]
            int r13 = r13 + r12
            int r10 = org.jcodec.common.tools.MathUtil.clip(r13, r10, r11)
            byte r10 = (byte) r10
            r14[r9] = r10
            int r5 = r5 + 4
            int r8 = r8 + 4
            int r7 = r7 + 4
            goto L12
        L5b:
            int r1 = r1 + r0
            int r4 = r4 + 1
            goto Lc
        L5f:
            return
    }

    public static final void putBlkPic(org.jcodec.common.model.Picture8Bit r9, org.jcodec.common.model.Picture8Bit r10, int r11, int r12) {
            org.jcodec.common.model.ColorSpace r0 = r9.getColor()
            org.jcodec.common.model.ColorSpace r1 = r10.getColor()
            if (r0 != r1) goto L42
            r0 = 0
        Lb:
            org.jcodec.common.model.ColorSpace r1 = r9.getColor()
            int r1 = r1.nComp
            if (r0 >= r1) goto L41
            byte[] r2 = r9.getPlaneData(r0)
            int r3 = r9.getPlaneWidth(r0)
            byte[] r4 = r10.getPlaneData(r0)
            int r5 = r10.getPlaneWidth(r0)
            int r6 = r10.getPlaneHeight(r0)
            org.jcodec.common.model.ColorSpace r1 = r9.getColor()
            int[] r1 = r1.compWidth
            r1 = r1[r0]
            int r7 = r11 >> r1
            org.jcodec.common.model.ColorSpace r1 = r9.getColor()
            int[] r1 = r1.compHeight
            r1 = r1[r0]
            int r8 = r12 >> r1
            pubBlkOnePlane(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r0 + 1
            goto Lb
        L41:
            return
        L42:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Incompatible color"
            r9.<init>(r10)
            throw r9
    }

    public static final void take(byte[] r1, int r2, int r3, int r4, int r5, byte[] r6, int r7, int r8) {
            int r0 = r4 + r7
            if (r0 >= r2) goto Lc
            int r0 = r5 + r8
            if (r0 >= r3) goto Lc
            takeSafe(r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lf
        Lc:
            takeExtendBorder(r1, r2, r3, r4, r5, r6, r7, r8)
        Lf:
            return
    }

    public static final void takeExtendBorder(byte[] r6, int r7, int r8, int r9, int r10, byte[] r11, int r12, int r13) {
            r0 = 0
            r1 = r10
        L2:
            int r2 = r10 + r13
            int r3 = java.lang.Math.min(r2, r8)
            if (r1 >= r3) goto L35
            int r2 = r1 * r7
            int r3 = java.lang.Math.min(r9, r7)
            int r2 = r2 + r3
            r3 = r9
        L12:
            int r4 = r9 + r12
            int r5 = java.lang.Math.min(r4, r7)
            if (r3 >= r5) goto L25
            r4 = r6[r2]
            r11[r0] = r4
            int r3 = r3 + 1
            int r0 = r0 + 1
            int r2 = r2 + 1
            goto L12
        L25:
            int r2 = r2 + (-1)
        L27:
            if (r3 >= r4) goto L32
            r5 = r6[r2]
            r11[r0] = r5
            int r3 = r3 + 1
            int r0 = r0 + 1
            goto L27
        L32:
            int r1 = r1 + 1
            goto L2
        L35:
            if (r1 >= r2) goto L63
            int r10 = r8 * r7
            int r10 = r10 - r7
            int r13 = java.lang.Math.min(r9, r7)
            int r10 = r10 + r13
            r13 = r9
        L40:
            int r3 = r9 + r12
            int r4 = java.lang.Math.min(r3, r7)
            if (r13 >= r4) goto L53
            r3 = r6[r10]
            r11[r0] = r3
            int r13 = r13 + 1
            int r0 = r0 + 1
            int r10 = r10 + 1
            goto L40
        L53:
            int r10 = r10 + (-1)
        L55:
            if (r13 >= r3) goto L60
            r4 = r6[r10]
            r11[r0] = r4
            int r13 = r13 + 1
            int r0 = r0 + 1
            goto L55
        L60:
            int r1 = r1 + 1
            goto L35
        L63:
            return
    }

    public static final void takeSafe(byte[] r4, int r5, int r6, int r7, int r8, byte[] r9, int r10, int r11) {
            int r8 = r8 * r5
            int r8 = r8 + r7
            r6 = 0
            r7 = 0
            r0 = 0
        L6:
            if (r7 >= r11) goto L1b
            r2 = r8
            r1 = 0
        La:
            if (r1 >= r10) goto L17
            r3 = r4[r2]
            r9[r0] = r3
            int r1 = r1 + 1
            int r0 = r0 + 1
            int r2 = r2 + 1
            goto La
        L17:
            int r7 = r7 + 1
            int r8 = r8 + r5
            goto L6
        L1b:
            return
    }

    public static final void takeSubtract(byte[] r1, int r2, int r3, int r4, int r5, int[] r6, byte[] r7, int r8, int r9) {
            int r0 = r4 + r8
            if (r0 >= r2) goto Lc
            int r0 = r5 + r9
            if (r0 >= r3) goto Lc
            takeSubtractSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lf
        Lc:
            takeSubtractUnsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        Lf:
            return
    }

    public static final void takeSubtractSafe(byte[] r6, int r7, int r8, int r9, int r10, int[] r11, byte[] r12, int r13, int r14) {
            int r10 = r10 * r7
            int r10 = r10 + r9
            r8 = 0
            r9 = 0
            r0 = 0
        L6:
            if (r9 >= r14) goto L3f
            r2 = r10
            r1 = 0
        La:
            if (r1 >= r13) goto L3b
            r3 = r6[r2]
            r4 = r12[r0]
            int r3 = r3 - r4
            r11[r0] = r3
            int r3 = r0 + 1
            int r4 = r2 + 1
            r4 = r6[r4]
            r5 = r12[r3]
            int r4 = r4 - r5
            r11[r3] = r4
            int r3 = r0 + 2
            int r4 = r2 + 2
            r4 = r6[r4]
            r5 = r12[r3]
            int r4 = r4 - r5
            r11[r3] = r4
            int r3 = r0 + 3
            int r4 = r2 + 3
            r4 = r6[r4]
            r5 = r12[r3]
            int r4 = r4 - r5
            r11[r3] = r4
            int r1 = r1 + 4
            int r0 = r0 + 4
            int r2 = r2 + 4
            goto La
        L3b:
            int r9 = r9 + 1
            int r10 = r10 + r7
            goto L6
        L3f:
            return
    }

    public static final void takeSubtractUnsafe(byte[] r7, int r8, int r9, int r10, int r11, int[] r12, byte[] r13, int r14, int r15) {
            r0 = 0
            r1 = r11
        L2:
            int r2 = r11 + r15
            int r3 = java.lang.Math.min(r2, r9)
            if (r1 >= r3) goto L3b
            int r2 = r1 * r8
            int r3 = java.lang.Math.min(r10, r8)
            int r2 = r2 + r3
            r3 = r10
        L12:
            int r4 = r10 + r14
            int r5 = java.lang.Math.min(r4, r8)
            if (r3 >= r5) goto L28
            r4 = r7[r2]
            r5 = r13[r0]
            int r4 = r4 - r5
            r12[r0] = r4
            int r3 = r3 + 1
            int r0 = r0 + 1
            int r2 = r2 + 1
            goto L12
        L28:
            int r2 = r2 + (-1)
        L2a:
            if (r3 >= r4) goto L38
            r5 = r7[r2]
            r6 = r13[r0]
            int r5 = r5 - r6
            r12[r0] = r5
            int r3 = r3 + 1
            int r0 = r0 + 1
            goto L2a
        L38:
            int r1 = r1 + 1
            goto L2
        L3b:
            if (r1 >= r2) goto L6f
            int r11 = r9 * r8
            int r11 = r11 - r8
            int r15 = java.lang.Math.min(r10, r8)
            int r11 = r11 + r15
            r15 = r10
        L46:
            int r3 = r10 + r14
            int r4 = java.lang.Math.min(r3, r8)
            if (r15 >= r4) goto L5c
            r3 = r7[r11]
            r4 = r13[r0]
            int r3 = r3 - r4
            r12[r0] = r3
            int r15 = r15 + 1
            int r0 = r0 + 1
            int r11 = r11 + 1
            goto L46
        L5c:
            int r11 = r11 + (-1)
        L5e:
            if (r15 >= r3) goto L6c
            r4 = r7[r11]
            r5 = r13[r0]
            int r4 = r4 - r5
            r12[r0] = r4
            int r15 = r15 + 1
            int r0 = r0 + 1
            goto L5e
        L6c:
            int r1 = r1 + 1
            goto L3b
        L6f:
            return
    }
}
