package org.fortheloss.framework.colorthief;

/* loaded from: classes2.dex */
public class ColorThief {
    public static int[] getColor(java.awt.image.BufferedImage r1) {
            r0 = 5
            int[][] r1 = getPalette(r1, r0)
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public static org.fortheloss.framework.colorthief.MMCQ.CMap getColorMap(java.awt.image.BufferedImage r2, int r3) {
            r0 = 10
            r1 = 1
            org.fortheloss.framework.colorthief.MMCQ$CMap r2 = getColorMap(r2, r3, r0, r1)
            return r2
    }

    public static org.fortheloss.framework.colorthief.MMCQ.CMap getColorMap(java.awt.image.BufferedImage r2, int r3, int r4, boolean r5) {
            r0 = 2
            if (r3 < r0) goto L2a
            r0 = 256(0x100, float:3.59E-43)
            if (r3 > r0) goto L2a
            r0 = 1
            if (r4 < r0) goto L22
            int r0 = r2.getType()
            r1 = 5
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L19
            int[][] r2 = getPixelsSlow(r2, r4, r5)
            goto L1d
        L19:
            int[][] r2 = getPixelsFast(r2, r4, r5)
        L1d:
            org.fortheloss.framework.colorthief.MMCQ$CMap r2 = org.fortheloss.framework.colorthief.MMCQ.quantize(r2, r3)
            return r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Specified quality should be greater then 0."
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Specified colorCount must be between 2 and 256."
            r2.<init>(r3)
            throw r2
    }

    public static int[][] getPalette(java.awt.image.BufferedImage r0, int r1) {
            org.fortheloss.framework.colorthief.MMCQ$CMap r0 = getColorMap(r0, r1)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int[][] r0 = r0.palette()
            return r0
    }

    private static int[][] getPixelsFast(java.awt.image.BufferedImage r15, int r16, boolean r17) {
            java.awt.image.WritableRaster r0 = r15.getRaster()
            java.awt.image.DataBuffer r0 = r0.getDataBuffer()
            java.awt.image.DataBufferByte r0 = (java.awt.image.DataBufferByte) r0
            byte[] r0 = r0.getData()
            int r1 = r15.getWidth()
            int r2 = r15.getHeight()
            int r1 = r1 * r2
            int r2 = r15.getType()
            java.lang.String r3 = "Unhandled type: "
            r4 = 6
            r5 = 5
            r6 = 3
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L27
            r7 = 4
            goto L3d
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            r7 = 3
        L3d:
            int r7 = r7 * r1
            int r8 = r0.length
            if (r7 != r8) goto Ld0
            int r7 = r1 + r16
            r8 = 1
            int r7 = r7 - r8
            int r7 = r7 / r16
            int[][] r7 = new int[r7][]
            r9 = 2
            r10 = 250(0xfa, float:3.5E-43)
            r11 = 0
            if (r2 == r5) goto L9d
            if (r2 != r4) goto L88
            r2 = 0
            r3 = 0
        L54:
            if (r2 >= r1) goto Lc9
            int r4 = r2 * 4
            r5 = r0[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r12 = r4 + 1
            r12 = r0[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r13 = r4 + 2
            r13 = r0[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r6
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r14 = 125(0x7d, float:1.75E-43)
            if (r5 < r14) goto L85
            if (r17 == 0) goto L79
            if (r4 <= r10) goto L79
            if (r13 <= r10) goto L79
            if (r12 > r10) goto L85
        L79:
            int[] r5 = new int[r6]
            r5[r11] = r4
            r5[r8] = r13
            r5[r9] = r12
            r7[r3] = r5
            int r3 = r3 + 1
        L85:
            int r2 = r2 + r16
            goto L54
        L88:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9d:
            r2 = 0
            r3 = 0
        L9f:
            if (r2 >= r1) goto Lc9
            int r4 = r2 * 3
            r5 = r0[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r12 = r4 + 1
            r12 = r0[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r9
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r17 == 0) goto Lba
            if (r4 <= r10) goto Lba
            if (r12 <= r10) goto Lba
            if (r5 > r10) goto Lc6
        Lba:
            int[] r13 = new int[r6]
            r13[r11] = r4
            r13[r8] = r12
            r13[r9] = r5
            r7[r3] = r13
            int r3 = r3 + 1
        Lc6:
            int r2 = r2 + r16
            goto L9f
        Lc9:
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r7, r11, r3)
            int[][] r0 = (int[][]) r0
            return r0
        Ld0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r0 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "(expectedDataLength = "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ") != (pixels.length = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    private static int[][] getPixelsSlow(java.awt.image.BufferedImage r11, int r12, boolean r13) {
            int r0 = r11.getWidth()
            int r1 = r11.getHeight()
            int r1 = r1 * r0
            int r2 = r1 + r12
            r3 = 1
            int r2 = r2 - r3
            int r2 = r2 / r12
            int[][] r2 = new int[r2][]
            r4 = 0
            r5 = 0
            r6 = 0
        L14:
            if (r5 >= r1) goto L42
            int r7 = r5 / r0
            int r8 = r5 % r0
            int r7 = r11.getRGB(r8, r7)
            int r8 = r7 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r7 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r13 == 0) goto L32
            r10 = 250(0xfa, float:3.5E-43)
            if (r8 <= r10) goto L32
            if (r9 <= r10) goto L32
            if (r7 > r10) goto L40
        L32:
            r10 = 3
            int[] r10 = new int[r10]
            r10[r4] = r8
            r10[r3] = r9
            r8 = 2
            r10[r8] = r7
            r2[r6] = r10
            int r6 = r6 + 1
        L40:
            int r5 = r5 + r12
            goto L14
        L42:
            java.lang.Object[] r11 = java.util.Arrays.copyOfRange(r2, r4, r6)
            int[][] r11 = (int[][]) r11
            return r11
    }
}
