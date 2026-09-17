package net.sourceforge.jiu.color.quantization;

/* loaded from: classes2.dex */
public class OctreeColorQuantizer extends net.sourceforge.jiu.ops.ImageToImageOperation implements net.sourceforge.jiu.color.quantization.RGBQuantizer {
    private int[] blueValues;
    private int[] greenValues;
    private net.sourceforge.jiu.data.Palette palette;
    private int paletteSize;
    private int[] redValues;
    private net.sourceforge.jiu.color.quantization.OctreeNode root;

    public OctreeColorQuantizer() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r1.paletteSize = r0
            return
    }

    private int assignPaletteIndexValues(net.sourceforge.jiu.color.quantization.OctreeNode r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return r4
        L3:
            boolean r0 = r3.isLeaf()
            if (r0 == 0) goto L12
            r3.setPaletteIndex(r4)
            r3.determineRepresentativeColor()
            int r4 = r4 + 1
            return r4
        L12:
            net.sourceforge.jiu.color.quantization.OctreeNode[] r3 = r3.getChildren()
            if (r3 == 0) goto L2a
            r0 = 0
        L19:
            r1 = 8
            if (r0 >= r1) goto L2a
            r1 = r3[r0]
            if (r1 == 0) goto L27
            r1 = r3[r0]
            int r4 = r2.assignPaletteIndexValues(r1, r4)
        L27:
            int r0 = r0 + 1
            goto L19
        L2a:
            return r4
    }

    private int initOctree() {
            r10 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode r0 = new net.sourceforge.jiu.color.quantization.OctreeNode
            r0.<init>()
            r10.root = r0
            net.sourceforge.jiu.data.PixelImage r0 = r10.getInputImage()
            net.sourceforge.jiu.data.RGB24Image r0 = (net.sourceforge.jiu.data.RGB24Image) r0
            r1 = 0
            r2 = 0
            r3 = 0
        L10:
            int r4 = r0.getHeight()
            if (r2 >= r4) goto L3d
            r4 = 0
        L17:
            int r5 = r0.getWidth()
            if (r4 >= r5) goto L3a
            int r5 = r0.getSample(r1, r4, r2)
            r6 = 1
            int r6 = r0.getSample(r6, r4, r2)
            r7 = 2
            int r7 = r0.getSample(r7, r4, r2)
            net.sourceforge.jiu.color.quantization.OctreeNode r8 = r10.root
            r9 = 8
            boolean r5 = net.sourceforge.jiu.color.quantization.OctreeNode.add(r8, r5, r6, r7, r9)
            if (r5 == 0) goto L37
            int r3 = r3 + 1
        L37:
            int r4 = r4 + 1
            goto L17
        L3a:
            int r2 = r2 + 1
            goto L10
        L3d:
            net.sourceforge.jiu.color.quantization.OctreeNode r0 = r10.root
            r0.copyChildSums()
            return r3
    }

    private void initPalette(net.sourceforge.jiu.color.quantization.OctreeNode r4, net.sourceforge.jiu.data.Palette r5) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4.isLeaf()
            if (r0 == 0) goto L1d
            int r0 = r4.getPaletteIndex()
            int r1 = r4.getRed()
            int r2 = r4.getGreen()
            int r4 = r4.getBlue()
            r5.put(r0, r1, r2, r4)
            return
        L1d:
            net.sourceforge.jiu.color.quantization.OctreeNode[] r4 = r4.getChildren()
            if (r4 != 0) goto L24
            return
        L24:
            r0 = 0
        L25:
            int r1 = r4.length
            if (r0 >= r1) goto L32
            r1 = r4[r0]
            if (r1 == 0) goto L2f
            r3.initPalette(r1, r5)
        L2f:
            int r0 = r0 + 1
            goto L25
        L32:
            return
    }

    private void mapImage() {
            r9 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r9.getInputImage()
            net.sourceforge.jiu.data.RGB24Image r0 = (net.sourceforge.jiu.data.RGB24Image) r0
            net.sourceforge.jiu.data.Palette r1 = r9.createPalette()
            net.sourceforge.jiu.data.MemoryPaletted8Image r2 = new net.sourceforge.jiu.data.MemoryPaletted8Image
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r2.<init>(r3, r4, r1)
            r1 = 3
            int[] r3 = new int[r1]
            int[] r1 = new int[r1]
            r4 = 0
            r5 = 0
        L1e:
            int r6 = r0.getHeight()
            if (r5 >= r6) goto L4c
            r6 = 0
        L25:
            int r7 = r0.getWidth()
            if (r6 >= r7) goto L49
            int r7 = r0.getSample(r4, r6, r5)
            r3[r4] = r7
            r7 = 1
            int r8 = r0.getSample(r7, r6, r5)
            r3[r7] = r8
            r7 = 2
            int r8 = r0.getSample(r7, r6, r5)
            r3[r7] = r8
            int r7 = r9.map(r3, r1)
            r2.putSample(r4, r6, r5, r7)
            int r6 = r6 + 1
            goto L25
        L49:
            int r5 = r5 + 1
            goto L1e
        L4c:
            r9.setOutputImage(r2)
            return
    }

    private void pruneOctree() {
            r10 = this;
            int r0 = r10.paletteSize
            net.sourceforge.jiu.color.quantization.OctreeNode[] r0 = new net.sourceforge.jiu.color.quantization.OctreeNode[r0]
            net.sourceforge.jiu.color.quantization.OctreeNode r1 = r10.root
            r2 = 0
            r0[r2] = r1
            net.sourceforge.jiu.color.quantization.OctreeNode r1 = new net.sourceforge.jiu.color.quantization.OctreeNode
            r1.<init>()
            r3 = 1
            r4 = 1
        L10:
            int r5 = r10.paletteSize
            if (r4 >= r5) goto L51
            int r5 = r4 + (-1)
            net.sourceforge.jiu.util.Sort.sort(r0, r2, r5, r1)
            r6 = r5
        L1a:
            if (r6 < 0) goto L4e
            r7 = r0[r6]
            int r8 = r7.getNumChildren()
            if (r8 <= 0) goto L4b
            int r8 = r8 + r5
            int r9 = r10.paletteSize
            if (r8 >= r9) goto L4b
            if (r6 >= r5) goto L33
            int r5 = r6 + 1
            int r8 = r4 - r6
            int r8 = r8 - r3
            java.lang.System.arraycopy(r0, r5, r0, r6, r8)
        L33:
            int r4 = r4 + (-1)
            net.sourceforge.jiu.color.quantization.OctreeNode[] r5 = r7.getChildren()
            r7 = 0
        L3a:
            int r8 = r5.length
            if (r7 >= r8) goto L4e
            r8 = r5[r7]
            if (r8 == 0) goto L48
            int r8 = r4 + 1
            r9 = r5[r7]
            r0[r4] = r9
            r4 = r8
        L48:
            int r7 = r7 + 1
            goto L3a
        L4b:
            int r6 = r6 + (-1)
            goto L1a
        L4e:
            r5 = -1
            if (r6 != r5) goto L10
        L51:
            r10.paletteSize = r4
        L53:
            if (r2 >= r4) goto L5e
            r1 = r0[r2]
            r3 = 0
            r1.setChildren(r3)
            int r2 = r2 + 1
            goto L53
        L5e:
            return
    }

    @Override // net.sourceforge.jiu.color.quantization.RGBQuantizer
    public net.sourceforge.jiu.data.Palette createPalette() {
            r6 = this;
            net.sourceforge.jiu.data.Palette r0 = r6.palette
            if (r0 != 0) goto L4c
            net.sourceforge.jiu.color.quantization.OctreeNode r0 = r6.root
            r1 = 0
            int r0 = r6.assignPaletteIndexValues(r0, r1)
            net.sourceforge.jiu.data.Palette r2 = new net.sourceforge.jiu.data.Palette
            r2.<init>(r0)
            r6.palette = r2
            net.sourceforge.jiu.color.quantization.OctreeNode r3 = r6.root
            r6.initPalette(r3, r2)
            int[] r2 = new int[r0]
            r6.redValues = r2
            int[] r2 = new int[r0]
            r6.greenValues = r2
            int[] r2 = new int[r0]
            r6.blueValues = r2
            r2 = 0
        L24:
            if (r2 >= r0) goto L49
            int[] r3 = r6.redValues
            net.sourceforge.jiu.data.Palette r4 = r6.palette
            int r4 = r4.getSample(r1, r2)
            r3[r2] = r4
            int[] r3 = r6.greenValues
            net.sourceforge.jiu.data.Palette r4 = r6.palette
            r5 = 1
            int r4 = r4.getSample(r5, r2)
            r3[r2] = r4
            int[] r3 = r6.blueValues
            net.sourceforge.jiu.data.Palette r4 = r6.palette
            r5 = 2
            int r4 = r4.getSample(r5, r2)
            r3[r2] = r4
            int r2 = r2 + 1
            goto L24
        L49:
            net.sourceforge.jiu.data.Palette r0 = r6.palette
            return r0
        L4c:
            java.lang.Object r0 = r0.clone()
            net.sourceforge.jiu.data.Palette r0 = (net.sourceforge.jiu.data.Palette) r0
            return r0
    }

    public void init() throws net.sourceforge.jiu.ops.MissingParameterException, net.sourceforge.jiu.ops.WrongParameterException {
            r2 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r2.getInputImage()
            if (r0 == 0) goto L19
            boolean r0 = r0 instanceof net.sourceforge.jiu.data.RGB24Image
            if (r0 == 0) goto L11
            r2.initOctree()
            r2.pruneOctree()
            return
        L11:
            net.sourceforge.jiu.ops.WrongParameterException r0 = new net.sourceforge.jiu.ops.WrongParameterException
            java.lang.String r1 = "Input image must be of type RGB24Image."
            r0.<init>(r1)
            throw r0
        L19:
            net.sourceforge.jiu.ops.MissingParameterException r0 = new net.sourceforge.jiu.ops.MissingParameterException
            java.lang.String r1 = "Input image needed."
            r0.<init>(r1)
            throw r0
    }

    @Override // net.sourceforge.jiu.color.quantization.RGBQuantizer
    public int map(int[] r11, int[] r12) {
            r10 = this;
            net.sourceforge.jiu.color.quantization.OctreeNode r0 = r10.root
            int r0 = r0.map(r11, r12)
            r1 = -1
            if (r0 != r1) goto L49
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = r11[r1]
            r3 = 1
            r4 = r11[r3]
            r5 = 2
            r11 = r11[r5]
            r6 = 0
            r7 = 0
        L17:
            int[] r8 = r10.redValues
            int r9 = r8.length
            if (r6 >= r9) goto L38
            r8 = r8[r6]
            int r8 = r8 - r2
            int r8 = r8 * r8
            int[] r9 = r10.greenValues
            r9 = r9[r6]
            int r9 = r9 - r4
            int r9 = r9 * r9
            int r8 = r8 + r9
            int[] r9 = r10.blueValues
            r9 = r9[r6]
            int r9 = r9 - r11
            int r9 = r9 * r9
            int r8 = r8 + r9
            if (r8 >= r0) goto L35
            r7 = r6
            r0 = r8
        L35:
            int r6 = r6 + 1
            goto L17
        L38:
            r11 = r8[r7]
            r12[r1] = r11
            int[] r11 = r10.greenValues
            r11 = r11[r7]
            r12[r3] = r11
            int[] r11 = r10.blueValues
            r11 = r11[r7]
            r12[r5] = r11
            return r7
        L49:
            return r0
    }

    public void process() throws net.sourceforge.jiu.ops.MissingParameterException, net.sourceforge.jiu.ops.WrongParameterException {
            r0 = this;
            r0.init()
            r0.mapImage()
            return
    }

    public void setPaletteSize(int r2) {
            r1 = this;
            r0 = 1
            if (r2 < r0) goto L12
            r0 = 256(0x100, float:3.59E-43)
            if (r2 > r0) goto La
            r1.paletteSize = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Palette size must be 256 or smaller."
            r2.<init>(r0)
            throw r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Palette size must be 1 or larger."
            r2.<init>(r0)
            throw r2
    }
}
