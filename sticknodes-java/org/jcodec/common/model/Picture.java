package org.jcodec.common.model;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class Picture {
    private int bitDepth;
    private org.jcodec.common.model.ColorSpace color;
    private org.jcodec.common.model.Rect crop;
    private int[][] data;
    private int height;
    private int width;

    public Picture(int r1, int r2, int[][] r3, org.jcodec.common.model.ColorSpace r4, int r5, org.jcodec.common.model.Rect r6) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.data = r3
            r0.color = r4
            r0.crop = r6
            r0.bitDepth = r5
            return
    }

    public static org.jcodec.common.model.Picture create(int r2, int r3, org.jcodec.common.model.ColorSpace r4) {
            r0 = 8
            r1 = 0
            org.jcodec.common.model.Picture r2 = doCreate(r2, r3, r4, r0, r1)
            return r2
    }

    public static org.jcodec.common.model.Picture doCreate(int r11, int r12, org.jcodec.common.model.ColorSpace r13, int r14, org.jcodec.common.model.Rect r15) {
            r14 = 4
            int[] r0 = new int[r14]
            r1 = 0
            r2 = 0
        L5:
            int r3 = r13.nComp
            if (r2 >= r3) goto L23
            int[] r3 = r13.compPlane
            r3 = r3[r2]
            r4 = r0[r3]
            int[] r5 = r13.compWidth
            r5 = r5[r2]
            int r5 = r11 >> r5
            int[] r6 = r13.compHeight
            r6 = r6[r2]
            int r6 = r12 >> r6
            int r5 = r5 * r6
            int r4 = r4 + r5
            r0[r3] = r4
            int r2 = r2 + 1
            goto L5
        L23:
            r2 = 0
            r3 = 0
        L25:
            if (r2 >= r14) goto L32
            r4 = r0[r2]
            if (r4 == 0) goto L2d
            r4 = 1
            goto L2e
        L2d:
            r4 = 0
        L2e:
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L25
        L32:
            int[][] r7 = new int[r3][]
            r2 = 0
        L35:
            if (r1 >= r14) goto L47
            r3 = r0[r1]
            if (r3 == 0) goto L44
            int r3 = r2 + 1
            r4 = r0[r1]
            int[] r4 = new int[r4]
            r7[r2] = r4
            r2 = r3
        L44:
            int r1 = r1 + 1
            goto L35
        L47:
            org.jcodec.common.model.Picture r14 = new org.jcodec.common.model.Picture
            r9 = 8
            r4 = r14
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r14
    }

    private boolean planeEquals(org.jcodec.common.model.Picture r12, int r13) {
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
            int[] r5 = r12.getPlaneData(r13)
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
            int[][] r9 = r11.data
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
            boolean r1 = r4 instanceof org.jcodec.common.model.Picture
            if (r1 != 0) goto L8
            goto L3b
        L8:
            org.jcodec.common.model.Picture r4 = (org.jcodec.common.model.Picture) r4
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
            int[][] r2 = r3.getData()
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

    public int[][] getData() {
            r1 = this;
            int[][] r0 = r1.data
            return r0
    }

    public int[] getPlaneData(int r2) {
            r1 = this;
            int[][] r0 = r1.data
            r2 = r0[r2]
            return r2
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}
