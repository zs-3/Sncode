package net.sourceforge.jiu.color.quantization;

/* loaded from: classes2.dex */
public class OctreeNode implements net.sourceforge.jiu.util.ComparatorInterface {
    private int blue;
    private int blueSum;
    private net.sourceforge.jiu.color.quantization.OctreeNode[] children;
    private int green;
    private int greenSum;
    private int paletteIndex;
    private int pixelCount;
    private int red;
    private int redSum;

    public OctreeNode() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean add(net.sourceforge.jiu.color.quantization.OctreeNode r4, int r5, int r6, int r7, int r8) {
            r0 = 1
            int r8 = r8 - r0
            r1 = 0
        L3:
            if (r8 < 0) goto L25
            net.sourceforge.jiu.color.quantization.OctreeNode[] r2 = r4.children
            if (r2 != 0) goto Lf
            r2 = 8
            net.sourceforge.jiu.color.quantization.OctreeNode[] r2 = new net.sourceforge.jiu.color.quantization.OctreeNode[r2]
            r4.children = r2
        Lf:
            int r4 = computeIndex(r5, r6, r7, r8)
            r3 = r2[r4]
            if (r3 != 0) goto L21
            net.sourceforge.jiu.color.quantization.OctreeNode r1 = new net.sourceforge.jiu.color.quantization.OctreeNode
            r1.<init>()
            r2[r4] = r1
            r4 = r1
            r1 = 1
            goto L22
        L21:
            r4 = r3
        L22:
            int r8 = r8 + (-1)
            goto L3
        L25:
            r4.update(r5, r6, r7)
            return r1
    }

    private static int computeIndex(int r0, int r1, int r2, int r3) {
            int r0 = r0 >> r3
            r0 = r0 & 1
            int r0 = r0 << 2
            int r1 = r1 >> r3
            r1 = r1 & 1
            int r1 = r1 << 1
            r0 = r0 | r1
            int r1 = r2 >> r3
            r1 = r1 & 1
            r0 = r0 | r1
            return r0
    }

    private final int map(int r10, int r11, int r12, int r13, int[] r14) {
            r9 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode[] r0 = r9.children
            r1 = 1
            if (r0 != 0) goto L16
            r10 = 0
            int r11 = r9.red
            r14[r10] = r11
            int r10 = r9.green
            r14[r1] = r10
            r10 = 2
            int r11 = r9.blue
            r14[r10] = r11
            int r10 = r9.paletteIndex
            return r10
        L16:
            int r0 = computeIndex(r10, r11, r12, r13)
            net.sourceforge.jiu.color.quantization.OctreeNode[] r2 = r9.children
            r3 = r2[r0]
            if (r3 != 0) goto L22
            r10 = -1
            return r10
        L22:
            int r7 = r13 + (-1)
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            int r10 = r3.map(r4, r5, r6, r7, r8)
            return r10
    }

    private void update(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.redSum
            int r0 = r0 + r2
            r1.redSum = r0
            int r2 = r1.greenSum
            int r2 = r2 + r3
            r1.greenSum = r2
            int r2 = r1.blueSum
            int r2 = r2 + r4
            r1.blueSum = r2
            int r2 = r1.pixelCount
            int r2 = r2 + 1
            r1.pixelCount = r2
            return
    }

    @Override // net.sourceforge.jiu.util.ComparatorInterface
    public int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode r1 = (net.sourceforge.jiu.color.quantization.OctreeNode) r1
            net.sourceforge.jiu.color.quantization.OctreeNode r2 = (net.sourceforge.jiu.color.quantization.OctreeNode) r2
            int r1 = r1.pixelCount
            int r2 = r2.pixelCount
            if (r1 >= r2) goto Lc
            r1 = -1
            return r1
        Lc:
            if (r1 != r2) goto L10
            r1 = 0
            return r1
        L10:
            r1 = 1
            return r1
    }

    public void copyChildSums() {
            r4 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode[] r0 = r4.children
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.redSum = r0
            r4.greenSum = r0
            r4.blueSum = r0
            r4.pixelCount = r0
        Le:
            net.sourceforge.jiu.color.quantization.OctreeNode[] r1 = r4.children
            int r2 = r1.length
            if (r0 >= r2) goto L39
            r1 = r1[r0]
            if (r1 == 0) goto L36
            r1.copyChildSums()
            int r2 = r4.redSum
            int r3 = r1.redSum
            int r2 = r2 + r3
            r4.redSum = r2
            int r2 = r4.greenSum
            int r3 = r1.greenSum
            int r2 = r2 + r3
            r4.greenSum = r2
            int r2 = r4.blueSum
            int r3 = r1.blueSum
            int r2 = r2 + r3
            r4.blueSum = r2
            int r2 = r4.pixelCount
            int r1 = r1.pixelCount
            int r2 = r2 + r1
            r4.pixelCount = r2
        L36:
            int r0 = r0 + 1
            goto Le
        L39:
            return
    }

    public void determineRepresentativeColor() {
            r2 = this;
            int r0 = r2.pixelCount
            if (r0 <= 0) goto L13
            int r1 = r2.redSum
            int r1 = r1 / r0
            r2.red = r1
            int r1 = r2.greenSum
            int r1 = r1 / r0
            r2.green = r1
            int r1 = r2.blueSum
            int r1 = r1 / r0
            r2.blue = r1
        L13:
            return
    }

    public int getBlue() {
            r1 = this;
            int r0 = r1.blue
            return r0
    }

    public net.sourceforge.jiu.color.quantization.OctreeNode[] getChildren() {
            r1 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode[] r0 = r1.children
            return r0
    }

    public int getGreen() {
            r1 = this;
            int r0 = r1.green
            return r0
    }

    public int getNumChildren() {
            r4 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode[] r0 = r4.children
            r1 = 0
            if (r0 == 0) goto L15
            r0 = 0
        L6:
            net.sourceforge.jiu.color.quantization.OctreeNode[] r2 = r4.children
            int r3 = r2.length
            if (r1 >= r3) goto L14
            r2 = r2[r1]
            if (r2 == 0) goto L11
            int r0 = r0 + 1
        L11:
            int r1 = r1 + 1
            goto L6
        L14:
            r1 = r0
        L15:
            return r1
    }

    public int getPaletteIndex() {
            r1 = this;
            int r0 = r1.paletteIndex
            return r0
    }

    public int getRed() {
            r1 = this;
            int r0 = r1.red
            return r0
    }

    public boolean isLeaf() {
            r1 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode[] r0 = r1.children
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int map(int[] r8, int[] r9) {
            r7 = this;
            r0 = 0
            r2 = r8[r0]
            r0 = 1
            r3 = r8[r0]
            r0 = 2
            r4 = r8[r0]
            r5 = 7
            r1 = r7
            r6 = r9
            int r8 = r1.map(r2, r3, r4, r5, r6)
            return r8
    }

    public void setChildren(net.sourceforge.jiu.color.quantization.OctreeNode[] r1) {
            r0 = this;
            r0.children = r1
            return
    }

    public void setPaletteIndex(int r1) {
            r0 = this;
            r0.paletteIndex = r1
            return
    }
}
