package org.jcodec.scale;

/* loaded from: classes2.dex */
public class Yuv420pToRgb8Bit implements org.jcodec.scale.Transform8Bit {
    public Yuv420pToRgb8Bit() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void YUV420pToRGB(byte r2, byte r3, byte r4, byte[] r5, int r6) {
            int r2 = r2 + 112
            int r2 = r2 * 298
            int r0 = r4 * 409
            int r0 = r0 + r2
            int r0 = r0 + 128
            int r0 = r0 >> 8
            int r1 = r3 * 100
            int r1 = r2 - r1
            int r4 = r4 * 208
            int r1 = r1 - r4
            int r1 = r1 + 128
            int r4 = r1 >> 8
            int r3 = r3 * 516
            int r2 = r2 + r3
            int r2 = r2 + 128
            int r2 = r2 >> 8
            int r3 = crop(r0)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r5[r6] = r3
            int r3 = r6 + 1
            int r4 = crop(r4)
            int r4 = r4 + (-128)
            byte r4 = (byte) r4
            r5[r3] = r4
            int r6 = r6 + 2
            int r2 = crop(r2)
            int r2 = r2 + (-128)
            byte r2 = (byte) r2
            r5[r6] = r2
            return
    }

    private static int crop(int r1) {
            r0 = 255(0xff, float:3.57E-43)
            if (r1 >= 0) goto L6
            r1 = 0
            goto La
        L6:
            if (r1 <= r0) goto La
            r1 = 255(0xff, float:3.57E-43)
        La:
            return r1
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
            YUV420pToRGB(r13, r14, r15, r6, r1)
            int r1 = r12 + 1
            r13 = r2[r1]
            r14 = r4[r10]
            r15 = r0[r10]
            int r1 = r1 * 3
            YUV420pToRGB(r13, r14, r15, r6, r1)
            int r12 = r12 + r7
            r1 = r2[r12]
            r13 = r4[r10]
            r14 = r0[r10]
            int r15 = r12 * 3
            YUV420pToRGB(r1, r13, r14, r6, r15)
            int r12 = r12 + r3
            r1 = r2[r12]
            r13 = r4[r10]
            r14 = r0[r10]
            int r12 = r12 * 3
            YUV420pToRGB(r1, r13, r14, r6, r12)
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
            YUV420pToRGB(r11, r12, r13, r6, r14)
            int r1 = r1 + r7
            r11 = r2[r1]
            r12 = r4[r10]
            r13 = r0[r10]
            int r1 = r1 * 3
            YUV420pToRGB(r11, r12, r13, r6, r1)
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
            YUV420pToRGB(r8, r11, r12, r6, r13)
            int r7 = r7 + r3
            r8 = r2[r7]
            r11 = r4[r10]
            r12 = r0[r10]
            int r7 = r7 * 3
            YUV420pToRGB(r8, r11, r12, r6, r7)
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
            YUV420pToRGB(r1, r2, r0, r6, r9)
        Ld9:
            return
    }
}
