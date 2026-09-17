package net.sourceforge.jiu.data;

/* loaded from: classes2.dex */
public abstract class MemoryByteChannelImage implements net.sourceforge.jiu.data.IntegerImage {
    private final byte[][] data;
    private final byte[] firstChannel;
    private final int height;
    private final int numChannels;
    private final int numPixels;
    private final int width;

    public MemoryByteChannelImage(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r4 < r0) goto L5c
            if (r5 < r0) goto L45
            if (r3 < r0) goto L2e
            r2.width = r4
            r2.height = r5
            r2.numChannels = r3
            int r4 = r4 * r5
            r2.numPixels = r4
            byte[][] r4 = new byte[r3][]
            r2.data = r4
            r4 = 0
            r5 = 0
        L1a:
            if (r5 >= r3) goto L27
            byte[][] r0 = r2.data
            int r1 = r2.numPixels
            byte[] r1 = new byte[r1]
            r0[r5] = r1
            int r5 = r5 + 1
            goto L1a
        L27:
            byte[][] r3 = r2.data
            r3 = r3[r4]
            r2.firstChannel = r3
            return
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Number of channels must be larger than 0: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L45:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Height must be larger than 0: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Width must be larger than 0: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    protected void checkPositionAndNumber(int r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "."
            if (r4 < 0) goto Lec
            int r2 = r3.numChannels
            if (r4 >= r2) goto Lec
            if (r5 < 0) goto Ld2
            int r4 = r3.getWidth()
            if (r5 >= r4) goto Ld2
            if (r7 < r0) goto Lb8
            int r4 = r5 + r7
            int r2 = r3.getWidth()
            if (r4 > r2) goto L8d
            if (r8 < r0) goto L73
            if (r6 < 0) goto L59
            int r4 = r3.getHeight()
            if (r6 >= r4) goto L59
            int r4 = r6 + r8
            int r5 = r3.getHeight()
            if (r4 > r5) goto L2e
            return
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            int r5 = r3.getHeight()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The values y + h exceed the height of this image; y="
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = ", h="
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = ", height="
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "The value for y is invalid: "
            r5.append(r7)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L73:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "The value for h is invalid: "
            r5.append(r6)
            r5.append(r8)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L8d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            int r6 = r3.getWidth()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "The values x + w exceed the width of this image; x="
            r8.append(r0)
            r8.append(r5)
            java.lang.String r5 = ", w="
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = ", width="
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            r4.<init>(r5)
            throw r4
        Lb8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "The value for w is invalid: "
            r5.append(r6)
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Ld2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "The value for x is invalid: "
            r6.append(r7)
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        Lec:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r6 = r3.numChannels
            int r6 = r6 - r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal channel index value: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = ". Must be from 0 to "
            r7.append(r4)
            r7.append(r6)
            r7.append(r1)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // net.sourceforge.jiu.data.PixelImage
    public final int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // net.sourceforge.jiu.data.IntegerImage
    public final int getSample(int r7, int r8, int r9) {
            r6 = this;
            byte[][] r0 = r6.data     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            r0 = r0[r7]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            int r1 = r6.width     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            int r1 = r1 * r9
            int r1 = r1 + r8
            r7 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            r7 = r7 & 255(0xff, float:3.57E-43)
            return r7
        Le:
            r4 = 1
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.checkPositionAndNumber(r1, r2, r3, r4, r5)
            r7 = -1
            return r7
    }

    @Override // net.sourceforge.jiu.data.IntegerImage
    public void getSamples(int r4, int r5, int r6, int r7, int r8, int[] r9, int r10) {
            r3 = this;
            r0 = 1
            if (r7 < r0) goto L2c
            if (r8 >= r0) goto L6
            goto L2c
        L6:
            byte[][] r0 = r3.data
            r4 = r0[r4]
            int r0 = r3.width
            int r6 = r6 * r0
            int r6 = r6 + r5
        Lf:
            int r5 = r8 + (-1)
            if (r8 == 0) goto L2c
            r0 = r6
            r8 = r7
        L15:
            int r1 = r8 + (-1)
            if (r8 == 0) goto L27
            int r8 = r10 + 1
            int r2 = r0 + 1
            r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9[r10] = r0
            r10 = r8
            r8 = r1
            r0 = r2
            goto L15
        L27:
            int r8 = r3.width
            int r6 = r6 + r8
            r8 = r5
            goto Lf
        L2c:
            return
    }

    @Override // net.sourceforge.jiu.data.PixelImage
    public final int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public final void putByteSample(int r9, int r10, int r11, byte r12) {
            r8 = this;
            r4 = 1
            r5 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.checkPositionAndNumber(r1, r2, r3, r4, r5)
            byte[][] r0 = r8.data     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
            r0 = r0[r9]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
            int r1 = r8.width     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
            int r1 = r1 * r11
            int r1 = r1 + r10
            r0[r1] = r12     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
            goto L1e
        L15:
            r6 = 1
            r7 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.checkPositionAndNumber(r3, r4, r5, r6, r7)
        L1e:
            return
    }

    @Override // net.sourceforge.jiu.data.IntegerImage
    public final void putSample(int r1, int r2, int r3, int r4) {
            r0 = this;
            byte r4 = (byte) r4
            r0.putByteSample(r1, r2, r3, r4)
            return
    }
}
