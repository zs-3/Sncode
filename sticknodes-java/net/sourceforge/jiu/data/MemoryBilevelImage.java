package net.sourceforge.jiu.data;

/* loaded from: classes2.dex */
public class MemoryBilevelImage implements net.sourceforge.jiu.data.BilevelImage {
    private final int BYTES_PER_ROW;
    private final int HEIGHT;
    private final int WIDTH;
    private final byte[] data;

    public MemoryBilevelImage(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 < r0) goto L30
            if (r4 < r0) goto L19
            int r0 = r3 + 7
            int r0 = r0 / 8
            r2.BYTES_PER_ROW = r0
            r2.WIDTH = r3
            r2.HEIGHT = r4
            int r0 = r0 * r4
            byte[] r3 = new byte[r0]
            r2.data = r3
            return
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Height must be larger than zero; got "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Width must be larger than zero; got "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    private void checkPositionAndNumber(int r5, int r6, int r7, int r8) {
            r4 = this;
            if (r7 < 0) goto Lce
            if (r8 < 0) goto Lb7
            java.lang.String r0 = "."
            if (r5 < 0) goto L9d
            int r1 = r4.getWidth()
            if (r5 >= r1) goto L9d
            if (r6 < 0) goto L83
            int r1 = r4.getHeight()
            if (r6 >= r1) goto L83
            int r0 = r5 + r7
            int r1 = r4.getWidth()
            java.lang.String r2 = ")."
            java.lang.String r3 = "Cannot copy "
            if (r0 > r1) goto L57
            int r5 = r6 + r8
            int r7 = r4.getHeight()
            if (r5 > r7) goto L2b
            return
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r7 = r4.getHeight()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r8)
            java.lang.String r8 = " rows starting at "
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = " (height is only "
            r0.append(r6)
            r0.append(r7)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L57:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            int r8 = r4.getWidth()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r7 = " values starting at offset "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r5 = " (width is only "
            r0.append(r5)
            r0.append(r8)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L83:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "The value for y is invalid: "
            r7.append(r8)
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L9d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "The value for x is invalid: "
            r7.append(r8)
            r7.append(r5)
            r7.append(r0)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        Lb7:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Negative number of rows to be copied: "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lce:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Negative number of samples to be copied: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private void checkValue(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Le
            if (r2 != 0) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample value must be either BilevelImage.BLACK or BilevelImage.WHITE."
            r2.<init>(r0)
            throw r2
        Le:
            return
    }

    @Override // net.sourceforge.jiu.data.IntegerImage
    public void clear(int r2) {
            r1 = this;
            r0 = 0
            r1.clear(r0, r2)
            return
    }

    public void clear(int r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L16
            r2.checkValue(r4)
            r3 = 0
            if (r4 != 0) goto La
            r4 = 0
            goto Lb
        La:
            r4 = -1
        Lb:
            byte[] r0 = r2.data
            int r1 = r0.length
            if (r3 >= r1) goto L15
            r0[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid channel index; bilevel images have only one channel, so 0 is the only valid argument; got "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // net.sourceforge.jiu.data.PixelImage
    public int getHeight() {
            r1 = this;
            int r0 = r1.HEIGHT
            return r0
    }

    @Override // net.sourceforge.jiu.data.IntegerImage
    public int getSample(int r2, int r3, int r4) {
            r1 = this;
            if (r2 != 0) goto Lc
            boolean r2 = r1.isBlack(r3, r4)
            if (r2 == 0) goto La
            r2 = 0
            return r2
        La:
            r2 = 1
            return r2
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "The channelIndex argument must be 0 for bilevel images; got "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // net.sourceforge.jiu.data.PixelImage
    public int getWidth() {
            r1 = this;
            int r0 = r1.WIDTH
            return r0
    }

    public boolean isBlack(int r4, int r5) {
            r3 = this;
            r0 = 1
            int r1 = r3.BYTES_PER_ROW     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L19
            int r1 = r1 * r5
            int r2 = r4 >> 3
            int r1 = r1 + r2
            byte[] r2 = r3.data     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L19
            r5 = r2[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L19
            r4 = r4 & 7
            int r4 = 7 - r4
            int r4 = r0 << r4
            byte r4 = (byte) r4
            r4 = r4 & r5
            if (r4 != 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
        L19:
            r3.checkPositionAndNumber(r4, r5, r0, r0)
            return r0
    }

    @Override // net.sourceforge.jiu.data.GrayImage
    public void putWhite(int r6, int r7) {
            r5 = this;
            r0 = 1
            int r1 = r5.BYTES_PER_ROW     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L18
            int r1 = r1 * r7
            int r2 = r6 >> 3
            int r1 = r1 + r2
            byte[] r2 = r5.data     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L18
            r3 = r2[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L18
            r4 = r6 & 7
            int r4 = 7 - r4
            int r4 = r0 << r4
            byte r4 = (byte) r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L18
            r3 = r3 | r4
            byte r3 = (byte) r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L18
            r2[r1] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L18
            goto L1b
        L18:
            r5.checkPositionAndNumber(r6, r7, r0, r0)
        L1b:
            return
    }
}
