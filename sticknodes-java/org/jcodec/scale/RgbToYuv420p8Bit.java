package org.jcodec.scale;

/* loaded from: classes2.dex */
public class RgbToYuv420p8Bit implements org.jcodec.scale.Transform8Bit {
    public RgbToYuv420p8Bit() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void rgb2yuv(byte r3, byte r4, byte r5, int[] r6) {
            int r3 = r3 + 128
            int r4 = r4 + 128
            int r5 = r5 + 128
            int r0 = r3 * 66
            int r1 = r4 * 129
            int r0 = r0 + r1
            int r1 = r5 * 25
            int r0 = r0 + r1
            int r1 = r3 * (-38)
            int r2 = r4 * 74
            int r1 = r1 - r2
            int r2 = r5 * 112
            int r1 = r1 + r2
            int r3 = r3 * 112
            int r4 = r4 * 94
            int r3 = r3 - r4
            int r5 = r5 * 18
            int r3 = r3 - r5
            int r0 = r0 + 128
            int r4 = r0 >> 8
            int r1 = r1 + 128
            int r5 = r1 >> 8
            int r3 = r3 + 128
            int r3 = r3 >> 8
            int r4 = r4 + (-112)
            r0 = -128(0xffffffffffffff80, float:NaN)
            r1 = 127(0x7f, float:1.78E-43)
            int r4 = org.jcodec.common.tools.MathUtil.clip(r4, r0, r1)
            r2 = 0
            r6[r2] = r4
            int r4 = org.jcodec.common.tools.MathUtil.clip(r5, r0, r1)
            r5 = 1
            r6[r5] = r4
            int r3 = org.jcodec.common.tools.MathUtil.clip(r3, r0, r1)
            r4 = 2
            r6[r4] = r3
            return
    }

    @Override // org.jcodec.scale.Transform8Bit
    public void transform(org.jcodec.common.model.Picture8Bit r18, org.jcodec.common.model.Picture8Bit r19) {
            r17 = this;
            byte[][] r0 = r18.getData()
            r1 = 0
            r0 = r0[r1]
            byte[][] r2 = r19.getData()
            r3 = 2
            int[] r4 = new int[r3]
            r4 = {x0104: FILL_ARRAY_DATA , data: [4, 3} // fill-array
            java.lang.Class<int> r5 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r5, r4)
            int[][] r4 = (int[][]) r4
            int r5 = r18.getWidth()
            r6 = 3
            int r5 = r5 * 3
            int r7 = r19.getWidth()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L28:
            int r12 = r18.getHeight()
            r13 = 1
            int r12 = r12 >> r13
            if (r8 >= r12) goto L102
            r12 = 0
        L31:
            int r14 = r18.getWidth()
            int r14 = r14 >> r13
            if (r12 >= r14) goto Lf6
            r14 = r2[r13]
            r14[r9] = r1
            r14 = r2[r3]
            r14[r9] = r1
            r14 = r0[r11]
            int r15 = r11 + 1
            r15 = r0[r15]
            int r16 = r11 + 2
            r6 = r0[r16]
            r3 = r4[r1]
            rgb2yuv(r14, r15, r6, r3)
            r3 = r2[r1]
            r6 = r4[r1]
            r6 = r6[r1]
            byte r6 = (byte) r6
            r3[r10] = r6
            int r3 = r11 + r5
            r6 = r0[r3]
            int r14 = r3 + 1
            r14 = r0[r14]
            int r15 = r3 + 2
            r15 = r0[r15]
            r19 = r8
            r8 = r4[r13]
            rgb2yuv(r6, r14, r15, r8)
            r6 = r2[r1]
            int r8 = r10 + r7
            r14 = r4[r13]
            r14 = r14[r1]
            byte r14 = (byte) r14
            r6[r8] = r14
            int r10 = r10 + 1
            int r6 = r11 + 3
            r6 = r0[r6]
            int r8 = r11 + 4
            r8 = r0[r8]
            int r14 = r11 + 5
            r14 = r0[r14]
            r15 = 2
            r13 = r4[r15]
            rgb2yuv(r6, r8, r14, r13)
            r6 = r2[r1]
            r8 = r4[r15]
            r8 = r8[r1]
            byte r8 = (byte) r8
            r6[r10] = r8
            int r6 = r3 + 3
            r6 = r0[r6]
            int r8 = r3 + 4
            r8 = r0[r8]
            int r3 = r3 + 5
            r3 = r0[r3]
            r13 = 3
            r14 = r4[r13]
            rgb2yuv(r6, r8, r3, r14)
            r3 = r2[r1]
            int r6 = r10 + r7
            r8 = r4[r13]
            r8 = r8[r1]
            byte r8 = (byte) r8
            r3[r6] = r8
            r3 = 1
            int r10 = r10 + r3
            r6 = r2[r3]
            r8 = r4[r1]
            r8 = r8[r3]
            r13 = r4[r3]
            r13 = r13[r3]
            int r8 = r8 + r13
            r13 = 2
            r14 = r4[r13]
            r14 = r14[r3]
            int r8 = r8 + r14
            r14 = 3
            r15 = r4[r14]
            r14 = r15[r3]
            int r8 = r8 + r14
            int r8 = r8 + r13
            int r8 = r8 >> r13
            byte r8 = (byte) r8
            r6[r9] = r8
            r6 = r2[r13]
            r8 = r4[r1]
            r8 = r8[r13]
            r14 = r4[r3]
            r14 = r14[r13]
            int r8 = r8 + r14
            r14 = r4[r13]
            r14 = r14[r13]
            int r8 = r8 + r14
            r14 = 3
            r15 = r4[r14]
            r15 = r15[r13]
            int r8 = r8 + r15
            int r8 = r8 + r13
            int r8 = r8 >> r13
            byte r8 = (byte) r8
            r6[r9] = r8
            int r9 = r9 + 1
            int r11 = r11 + 6
            int r12 = r12 + 1
            r8 = r19
            r3 = 2
            r6 = 3
            r13 = 1
            goto L31
        Lf6:
            r19 = r8
            r13 = 2
            r14 = 3
            int r10 = r10 + r7
            int r11 = r11 + r5
            int r8 = r19 + 1
            r3 = 2
            r6 = 3
            goto L28
        L102:
            return
    }
}
