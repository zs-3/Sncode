package org.jcodec.common.model;

/* loaded from: classes2.dex */
public class Picture8Bit {
    private org.jcodec.common.model.ColorSpace color;
    private org.jcodec.common.model.Rect crop;
    private byte[][] data;
    private int height;
    private int width;

    public Picture8Bit(int r7, int r8, byte[][] r9, org.jcodec.common.model.ColorSpace r10, org.jcodec.common.model.Rect r11) {
            r6 = this;
            r6.<init>()
            r6.width = r7
            r6.height = r8
            r6.data = r9
            r6.color = r10
            r6.crop = r11
            if (r10 == 0) goto Lef
            r9 = 0
        L10:
            int r0 = r10.nComp
            if (r9 >= r0) goto Lef
            int[] r0 = r10.compWidth
            r0 = r0[r9]
            int r0 = 8 - r0
            r1 = 255(0xff, float:3.57E-43)
            int r0 = r1 >> r0
            r2 = r7 & r0
            java.lang.String r3 = " for colorspace: "
            java.lang.String r4 = "Component "
            r5 = 1
            if (r2 != 0) goto Lc6
            if (r11 == 0) goto L5a
            int r2 = r11.getWidth()
            r0 = r0 & r2
            if (r0 != 0) goto L31
            goto L5a
        L31:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int[] r8 = r10.compWidth
            r8 = r8[r9]
            int r8 = r5 << r8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r9)
            java.lang.String r9 = " cropped width should be a multiple of "
            r11.append(r9)
            r11.append(r8)
            r11.append(r3)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            int[] r0 = r10.compHeight
            r0 = r0[r9]
            int r0 = 8 - r0
            int r0 = r1 >> r0
            r1 = r8 & r0
            if (r1 != 0) goto L9d
            if (r11 == 0) goto L99
            int r1 = r11.getHeight()
            r0 = r0 & r1
            if (r0 != 0) goto L70
            goto L99
        L70:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int[] r8 = r10.compHeight
            r8 = r8[r9]
            int r8 = r5 << r8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r9)
            java.lang.String r9 = " cropped height should be a multiple of "
            r11.append(r9)
            r11.append(r8)
            r11.append(r3)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r7.<init>(r8)
            throw r7
        L99:
            int r9 = r9 + 1
            goto L10
        L9d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int[] r8 = r10.compHeight
            r8 = r8[r9]
            int r8 = r5 << r8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r9)
            java.lang.String r9 = " height should be a multiple of "
            r11.append(r9)
            r11.append(r8)
            r11.append(r3)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r7.<init>(r8)
            throw r7
        Lc6:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int[] r8 = r10.compWidth
            r8 = r8[r9]
            int r8 = r5 << r8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r9)
            java.lang.String r9 = " width should be a multiple of "
            r11.append(r9)
            r11.append(r8)
            r11.append(r3)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r7.<init>(r8)
            throw r7
        Lef:
            return
    }

    public static org.jcodec.common.model.Picture8Bit create(int r1, int r2, org.jcodec.common.model.ColorSpace r3) {
            r0 = 0
            org.jcodec.common.model.Picture8Bit r1 = createCropped(r1, r2, r3, r0)
            return r1
    }

    public static org.jcodec.common.model.Picture8Bit createCropped(int r11, int r12, org.jcodec.common.model.ColorSpace r13, org.jcodec.common.model.Rect r14) {
            r0 = 4
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L5:
            int r4 = r13.nComp
            if (r3 >= r4) goto L23
            int[] r4 = r13.compPlane
            r4 = r4[r3]
            r5 = r1[r4]
            int[] r6 = r13.compWidth
            r6 = r6[r3]
            int r6 = r11 >> r6
            int[] r7 = r13.compHeight
            r7 = r7[r3]
            int r7 = r12 >> r7
            int r6 = r6 * r7
            int r5 = r5 + r6
            r1[r4] = r5
            int r3 = r3 + 1
            goto L5
        L23:
            r3 = 0
            r4 = 0
        L25:
            if (r3 >= r0) goto L32
            r5 = r1[r3]
            if (r5 == 0) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L25
        L32:
            byte[][] r8 = new byte[r4][]
            r3 = 0
        L35:
            if (r2 >= r0) goto L47
            r4 = r1[r2]
            if (r4 == 0) goto L44
            int r4 = r3 + 1
            r5 = r1[r2]
            byte[] r5 = new byte[r5]
            r8[r3] = r5
            r3 = r4
        L44:
            int r2 = r2 + 1
            goto L35
        L47:
            org.jcodec.common.model.Picture8Bit r0 = new org.jcodec.common.model.Picture8Bit
            r5 = r0
            r6 = r11
            r7 = r12
            r9 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
    }

    public static org.jcodec.common.model.Picture8Bit createPicture8Bit(int r7, int r8, byte[][] r9, org.jcodec.common.model.ColorSpace r10) {
            org.jcodec.common.model.Picture8Bit r6 = new org.jcodec.common.model.Picture8Bit
            org.jcodec.common.model.Rect r5 = new org.jcodec.common.model.Rect
            r0 = 0
            r5.<init>(r0, r0, r7, r8)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    private boolean planeEquals(org.jcodec.common.model.Picture8Bit r12, int r13) {
            r11 = this;
            org.jcodec.common.model.ColorSpace r0 = r11.color
            int[] r1 = r0.compWidth
            r1 = r1[r13]
            int[] r0 = r0.compHeight
            r0 = r0[r13]
            org.jcodec.common.model.Rect r2 = r12.getCrop()
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L2d
        L13:
            org.jcodec.common.model.Rect r2 = r12.getCrop()
            int r2 = r2.getX()
            int r2 = r2 >> r1
            org.jcodec.common.model.Rect r4 = r12.getCrop()
            int r4 = r4.getY()
            int r4 = r4 >> r0
            int r5 = r12.getWidth()
            int r5 = r5 >> r1
            int r4 = r4 * r5
            int r2 = r2 + r4
        L2d:
            org.jcodec.common.model.Rect r4 = r11.crop
            if (r4 != 0) goto L33
            r4 = 0
            goto L45
        L33:
            int r4 = r4.getX()
            int r4 = r4 >> r1
            org.jcodec.common.model.Rect r5 = r11.crop
            int r5 = r5.getY()
            int r5 = r5 >> r0
            int r6 = r11.width
            int r6 = r6 >> r1
            int r5 = r5 * r6
            int r4 = r4 + r5
        L45:
            byte[] r5 = r12.getPlaneData(r13)
            r6 = 0
        L4a:
            int r7 = r11.getCroppedHeight()
            int r7 = r7 >> r0
            if (r6 >= r7) goto L78
            r7 = 0
        L52:
            int r8 = r11.getCroppedWidth()
            int r8 = r8 >> r1
            if (r7 >= r8) goto L6b
            int r8 = r2 + r7
            r8 = r5[r8]
            byte[][] r9 = r11.data
            r9 = r9[r13]
            int r10 = r4 + r7
            r9 = r9[r10]
            if (r8 == r9) goto L68
            return r3
        L68:
            int r7 = r7 + 1
            goto L52
        L6b:
            int r6 = r6 + 1
            int r7 = r12.getWidth()
            int r7 = r7 >> r1
            int r2 = r2 + r7
            int r7 = r11.width
            int r7 = r7 >> r1
            int r4 = r4 + r7
            goto L4a
        L78:
            r12 = 1
            return r12
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L3b
            boolean r1 = r4 instanceof org.jcodec.common.model.Picture8Bit
            if (r1 != 0) goto L8
            goto L3b
        L8:
            org.jcodec.common.model.Picture8Bit r4 = (org.jcodec.common.model.Picture8Bit) r4
            int r1 = r4.getCroppedWidth()
            int r2 = r3.getCroppedWidth()
            if (r1 != r2) goto L3b
            int r1 = r4.getCroppedHeight()
            int r2 = r3.getCroppedHeight()
            if (r1 != r2) goto L3b
            org.jcodec.common.model.ColorSpace r1 = r4.getColor()
            org.jcodec.common.model.ColorSpace r2 = r3.color
            if (r1 == r2) goto L27
            goto L3b
        L27:
            r1 = 0
        L28:
            byte[][] r2 = r3.getData()
            int r2 = r2.length
            if (r1 >= r2) goto L39
            boolean r2 = r3.planeEquals(r4, r1)
            if (r2 != 0) goto L36
            return r0
        L36:
            int r1 = r1 + 1
            goto L28
        L39:
            r4 = 1
            return r4
        L3b:
            return r0
    }

    public org.jcodec.common.model.ColorSpace getColor() {
            r1 = this;
            org.jcodec.common.model.ColorSpace r0 = r1.color
            return r0
    }

    public org.jcodec.common.model.Rect getCrop() {
            r1 = this;
            org.jcodec.common.model.Rect r0 = r1.crop
            return r0
    }

    public int getCroppedHeight() {
            r1 = this;
            org.jcodec.common.model.Rect r0 = r1.crop
            if (r0 != 0) goto L7
            int r0 = r1.height
            goto Lb
        L7:
            int r0 = r0.getHeight()
        Lb:
            return r0
    }

    public int getCroppedWidth() {
            r1 = this;
            org.jcodec.common.model.Rect r0 = r1.crop
            if (r0 != 0) goto L7
            int r0 = r1.width
            goto Lb
        L7:
            int r0 = r0.getWidth()
        Lb:
            return r0
    }

    public byte[][] getData() {
            r1 = this;
            byte[][] r0 = r1.data
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public byte[] getPlaneData(int r2) {
            r1 = this;
            byte[][] r0 = r1.data
            r2 = r0[r2]
            return r2
    }

    public int getPlaneHeight(int r3) {
            r2 = this;
            int r0 = r2.height
            org.jcodec.common.model.ColorSpace r1 = r2.color
            int[] r1 = r1.compHeight
            r3 = r1[r3]
            int r3 = r0 >> r3
            return r3
    }

    public int getPlaneWidth(int r3) {
            r2 = this;
            int r0 = r2.width
            org.jcodec.common.model.ColorSpace r1 = r2.color
            int[] r1 = r1.compWidth
            r3 = r1[r3]
            int r3 = r0 >> r3
            return r3
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}
