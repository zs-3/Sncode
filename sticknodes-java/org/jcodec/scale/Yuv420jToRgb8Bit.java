package org.jcodec.scale;

/* loaded from: classes2.dex */
public class Yuv420jToRgb8Bit implements org.jcodec.scale.Transform8Bit {
    private static final int FIX_0_71414 = 0;
    private static final int FIX_1_402 = 0;
    private static final int FIX_1_772 = 0;
    private static final int _FIX_0_34414 = 0;

    static {
            r0 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            int r0 = FIX(r0)
            org.jcodec.scale.Yuv420jToRgb8Bit.FIX_0_71414 = r0
            r0 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            int r0 = FIX(r0)
            org.jcodec.scale.Yuv420jToRgb8Bit.FIX_1_772 = r0
            r0 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r0 = FIX(r0)
            int r0 = -r0
            org.jcodec.scale.Yuv420jToRgb8Bit._FIX_0_34414 = r0
            r0 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r0 = FIX(r0)
            org.jcodec.scale.Yuv420jToRgb8Bit.FIX_1_402 = r0
            return
    }

    public Yuv420jToRgb8Bit() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int FIX(double r2) {
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 * r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    public static final void YUVJtoRGB(byte r3, byte r4, byte r5, byte[] r6, int r7) {
            int r3 = r3 + 128
            int r3 = r3 << 10
            int r0 = org.jcodec.scale.Yuv420jToRgb8Bit.FIX_1_402
            int r0 = r0 * r5
            int r0 = r0 + 512
            int r1 = org.jcodec.scale.Yuv420jToRgb8Bit._FIX_0_34414
            int r1 = r1 * r4
            int r2 = org.jcodec.scale.Yuv420jToRgb8Bit.FIX_0_71414
            int r2 = r2 * r5
            int r1 = r1 - r2
            int r1 = r1 + 512
            int r5 = org.jcodec.scale.Yuv420jToRgb8Bit.FIX_1_772
            int r5 = r5 * r4
            int r5 = r5 + 512
            int r0 = r0 + r3
            int r4 = r0 >> 10
            int r1 = r1 + r3
            int r0 = r1 >> 10
            int r3 = r3 + r5
            int r3 = r3 >> 10
            int r4 = r4 + (-128)
            r5 = -128(0xffffffffffffff80, float:NaN)
            r1 = 127(0x7f, float:1.78E-43)
            int r4 = org.jcodec.common.tools.MathUtil.clip(r4, r5, r1)
            byte r4 = (byte) r4
            r6[r7] = r4
            int r4 = r7 + 1
            int r0 = r0 + (-128)
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r5, r1)
            byte r0 = (byte) r0
            r6[r4] = r0
            int r7 = r7 + 2
            int r3 = r3 + (-128)
            int r3 = org.jcodec.common.tools.MathUtil.clip(r3, r5, r1)
            byte r3 = (byte) r3
            r6[r7] = r3
            return
    }

    @Override // org.jcodec.scale.Transform8Bit
    public final void transform(org.jcodec.common.model.Picture8Bit r17, org.jcodec.common.model.Picture8Bit r18) {
            r16 = this;
            r0 = r17
            r1 = 0
            byte[] r2 = r0.getPlaneData(r1)
            r3 = 1
            byte[] r4 = r0.getPlaneData(r3)
            r5 = 2
            byte[] r0 = r0.getPlaneData(r5)
            r5 = r18
            byte[] r6 = r5.getPlaneData(r1)
            int r7 = r18.getWidth()
            r8 = 0
            r9 = 0
            r10 = 0
        L1e:
            int r11 = r18.getHeight()
            int r11 = r11 >> r3
            if (r8 >= r11) goto L93
            r11 = 0
        L26:
            int r12 = r18.getWidth()
            int r12 = r12 >> r3
            if (r11 >= r12) goto L66
            int r12 = r11 << 1
            int r12 = r12 + r9
            r13 = r2[r12]
            r14 = r4[r10]
            r15 = r0[r10]
            int r1 = r12 * 3
            YUVJtoRGB(r13, r14, r15, r6, r1)
            int r1 = r12 + 1
            r13 = r2[r1]
            r14 = r4[r10]
            r15 = r0[r10]
            int r1 = r1 * 3
            YUVJtoRGB(r13, r14, r15, r6, r1)
            int r12 = r12 + r7
            r1 = r2[r12]
            r13 = r4[r10]
            r14 = r0[r10]
            int r15 = r12 * 3
            YUVJtoRGB(r1, r13, r14, r6, r15)
            int r12 = r12 + r3
            r1 = r2[r12]
            r13 = r4[r10]
            r14 = r0[r10]
            int r12 = r12 * 3
            YUVJtoRGB(r1, r13, r14, r6, r12)
            int r10 = r10 + 1
            int r11 = r11 + 1
            r1 = 0
            goto L26
        L66:
            int r1 = r18.getWidth()
            r1 = r1 & r3
            if (r1 == 0) goto L8c
            int r1 = r18.getWidth()
            int r1 = r1 - r3
            int r1 = r1 + r9
            r11 = r2[r1]
            r12 = r4[r10]
            r13 = r0[r10]
            int r14 = r1 * 3
            YUVJtoRGB(r11, r12, r13, r6, r14)
            int r1 = r1 + r7
            r11 = r2[r1]
            r12 = r4[r10]
            r13 = r0[r10]
            int r1 = r1 * 3
            YUVJtoRGB(r11, r12, r13, r6, r1)
            int r10 = r10 + 1
        L8c:
            int r1 = r7 * 2
            int r9 = r9 + r1
            int r8 = r8 + 1
            r1 = 0
            goto L1e
        L93:
            int r1 = r18.getHeight()
            r1 = r1 & r3
            if (r1 == 0) goto Ld9
            r1 = 0
        L9b:
            int r7 = r18.getWidth()
            int r7 = r7 >> r3
            if (r1 >= r7) goto Lc1
            int r7 = r1 << 1
            int r7 = r7 + r9
            r8 = r2[r7]
            r11 = r4[r10]
            r12 = r0[r10]
            int r13 = r7 * 3
            YUVJtoRGB(r8, r11, r12, r6, r13)
            int r7 = r7 + r3
            r8 = r2[r7]
            r11 = r4[r10]
            r12 = r0[r10]
            int r7 = r7 * 3
            YUVJtoRGB(r8, r11, r12, r6, r7)
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L9b
        Lc1:
            int r1 = r18.getWidth()
            r1 = r1 & r3
            if (r1 == 0) goto Ld9
            int r1 = r18.getWidth()
            int r1 = r1 - r3
            int r9 = r9 + r1
            r1 = r2[r9]
            r2 = r4[r10]
            r0 = r0[r10]
            int r9 = r9 * 3
            YUVJtoRGB(r1, r2, r0, r6, r9)
        Ld9:
            return
    }
}
