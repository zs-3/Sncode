package net.sourceforge.jiu.color.dithering;

/* loaded from: classes2.dex */
public class ErrorDiffusionDithering extends net.sourceforge.jiu.ops.ImageToImageOperation {
    private static final int[][] BURKES_DATA = null;
    private static final int[][] FLOYD_STEINBERG_DATA = null;
    private static final int[][] JARVIS_JUDICE_NINKE_DATA = null;
    private static final int[][] SIERRA_DATA = null;
    private static final int[][] STEVENSON_ARCE_DATA = null;
    private static final int[][] STUCKI_DATA = null;
    private int[] errorDen;
    private int[] errorNum;
    private int grayBits;
    private int imageWidth;
    private int[] indexLut;
    private int leftColumns;
    private int newWidth;
    private int numRows;
    private net.sourceforge.jiu.color.quantization.RGBQuantizer quantizer;
    private int rightColumns;
    private int[][] templateData;
    private boolean useTruecolorOutput;

    static {
            r0 = 4
            int[][] r1 = new int[r0][]
            int[] r2 = new int[r0]
            r2 = {x01ba: FILL_ARRAY_DATA , data: [1, 0, 7, 16} // fill-array
            r3 = 0
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x01c6: FILL_ARRAY_DATA , data: [-1, 1, 3, 16} // fill-array
            r4 = 1
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x01d2: FILL_ARRAY_DATA , data: [0, 1, 5, 16} // fill-array
            r5 = 2
            r1[r5] = r2
            int[] r2 = new int[r0]
            r2 = {x01de: FILL_ARRAY_DATA , data: [1, 1, 1, 16} // fill-array
            r6 = 3
            r1[r6] = r2
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.FLOYD_STEINBERG_DATA = r1
            r1 = 12
            int[][] r2 = new int[r1][]
            int[] r7 = new int[r0]
            r7 = {x01ea: FILL_ARRAY_DATA , data: [1, 0, 8, 42} // fill-array
            r2[r3] = r7
            int[] r7 = new int[r0]
            r7 = {x01f6: FILL_ARRAY_DATA , data: [2, 0, 4, 42} // fill-array
            r2[r4] = r7
            int[] r7 = new int[r0]
            r7 = {x0202: FILL_ARRAY_DATA , data: [-2, 1, 2, 42} // fill-array
            r2[r5] = r7
            int[] r7 = new int[r0]
            r7 = {x020e: FILL_ARRAY_DATA , data: [-1, 1, 4, 42} // fill-array
            r2[r6] = r7
            int[] r7 = new int[r0]
            r7 = {x021a: FILL_ARRAY_DATA , data: [0, 1, 8, 42} // fill-array
            r2[r0] = r7
            int[] r7 = new int[r0]
            r7 = {x0226: FILL_ARRAY_DATA , data: [1, 1, 4, 42} // fill-array
            r8 = 5
            r2[r8] = r7
            int[] r7 = new int[r0]
            r7 = {x0232: FILL_ARRAY_DATA , data: [2, 1, 2, 42} // fill-array
            r9 = 6
            r2[r9] = r7
            int[] r7 = new int[r0]
            r7 = {x023e: FILL_ARRAY_DATA , data: [-2, 2, 1, 42} // fill-array
            r10 = 7
            r2[r10] = r7
            int[] r7 = new int[r0]
            r7 = {x024a: FILL_ARRAY_DATA , data: [-1, 2, 2, 42} // fill-array
            r11 = 8
            r2[r11] = r7
            int[] r7 = new int[r0]
            r7 = {x0256: FILL_ARRAY_DATA , data: [0, 2, 4, 42} // fill-array
            r12 = 9
            r2[r12] = r7
            int[] r7 = new int[r0]
            r7 = {x0262: FILL_ARRAY_DATA , data: [1, 2, 2, 42} // fill-array
            r13 = 10
            r2[r13] = r7
            int[] r7 = new int[r0]
            r7 = {x026e: FILL_ARRAY_DATA , data: [2, 2, 1, 42} // fill-array
            r14 = 11
            r2[r14] = r7
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.STUCKI_DATA = r2
            int[][] r2 = new int[r10][]
            int[] r7 = new int[r0]
            r7 = {x027a: FILL_ARRAY_DATA , data: [1, 0, 8, 32} // fill-array
            r2[r3] = r7
            int[] r7 = new int[r0]
            r7 = {x0286: FILL_ARRAY_DATA , data: [2, 0, 4, 32} // fill-array
            r2[r4] = r7
            int[] r7 = new int[r0]
            r7 = {x0292: FILL_ARRAY_DATA , data: [-2, 1, 2, 32} // fill-array
            r2[r5] = r7
            int[] r7 = new int[r0]
            r7 = {x029e: FILL_ARRAY_DATA , data: [-1, 1, 4, 32} // fill-array
            r2[r6] = r7
            int[] r7 = new int[r0]
            r7 = {x02aa: FILL_ARRAY_DATA , data: [0, 1, 8, 32} // fill-array
            r2[r0] = r7
            int[] r7 = new int[r0]
            r7 = {x02b6: FILL_ARRAY_DATA , data: [1, 1, 4, 32} // fill-array
            r2[r8] = r7
            int[] r7 = new int[r0]
            r7 = {x02c2: FILL_ARRAY_DATA , data: [2, 1, 2, 32} // fill-array
            r2[r9] = r7
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.BURKES_DATA = r2
            int[][] r2 = new int[r13][]
            int[] r7 = new int[r0]
            r7 = {x02ce: FILL_ARRAY_DATA , data: [1, 0, 5, 32} // fill-array
            r2[r3] = r7
            int[] r7 = new int[r0]
            r7 = {x02da: FILL_ARRAY_DATA , data: [2, 1, 3, 32} // fill-array
            r2[r4] = r7
            int[] r7 = new int[r0]
            r7 = {x02e6: FILL_ARRAY_DATA , data: [-2, 1, 2, 32} // fill-array
            r2[r5] = r7
            int[] r7 = new int[r0]
            r7 = {x02f2: FILL_ARRAY_DATA , data: [-1, 1, 4, 32} // fill-array
            r2[r6] = r7
            int[] r7 = new int[r0]
            r7 = {x02fe: FILL_ARRAY_DATA , data: [0, 1, 5, 32} // fill-array
            r2[r0] = r7
            int[] r7 = new int[r0]
            r7 = {x030a: FILL_ARRAY_DATA , data: [1, 1, 4, 32} // fill-array
            r2[r8] = r7
            int[] r7 = new int[r0]
            r7 = {x0316: FILL_ARRAY_DATA , data: [2, 1, 2, 32} // fill-array
            r2[r9] = r7
            int[] r7 = new int[r0]
            r7 = {x0322: FILL_ARRAY_DATA , data: [-1, 2, 2, 32} // fill-array
            r2[r10] = r7
            int[] r7 = new int[r0]
            r7 = {x032e: FILL_ARRAY_DATA , data: [0, 2, 3, 32} // fill-array
            r2[r11] = r7
            int[] r7 = new int[r0]
            r7 = {x033a: FILL_ARRAY_DATA , data: [1, 2, 2, 32} // fill-array
            r2[r12] = r7
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.SIERRA_DATA = r2
            int[][] r2 = new int[r1][]
            int[] r7 = new int[r0]
            r7 = {x0346: FILL_ARRAY_DATA , data: [1, 0, 7, 48} // fill-array
            r2[r3] = r7
            int[] r7 = new int[r0]
            r7 = {x0352: FILL_ARRAY_DATA , data: [2, 0, 5, 48} // fill-array
            r2[r4] = r7
            int[] r7 = new int[r0]
            r7 = {x035e: FILL_ARRAY_DATA , data: [-2, 1, 3, 48} // fill-array
            r2[r5] = r7
            int[] r7 = new int[r0]
            r7 = {x036a: FILL_ARRAY_DATA , data: [-1, 1, 5, 48} // fill-array
            r2[r6] = r7
            int[] r7 = new int[r0]
            r7 = {x0376: FILL_ARRAY_DATA , data: [0, 1, 7, 48} // fill-array
            r2[r0] = r7
            int[] r7 = new int[r0]
            r7 = {x0382: FILL_ARRAY_DATA , data: [1, 1, 5, 48} // fill-array
            r2[r8] = r7
            int[] r7 = new int[r0]
            r7 = {x038e: FILL_ARRAY_DATA , data: [2, 1, 3, 48} // fill-array
            r2[r9] = r7
            int[] r7 = new int[r0]
            r7 = {x039a: FILL_ARRAY_DATA , data: [-2, 2, 1, 48} // fill-array
            r2[r10] = r7
            int[] r7 = new int[r0]
            r7 = {x03a6: FILL_ARRAY_DATA , data: [-1, 2, 3, 48} // fill-array
            r2[r11] = r7
            int[] r7 = new int[r0]
            r7 = {x03b2: FILL_ARRAY_DATA , data: [0, 2, 5, 48} // fill-array
            r2[r12] = r7
            int[] r7 = new int[r0]
            r7 = {x03be: FILL_ARRAY_DATA , data: [1, 2, 3, 48} // fill-array
            r2[r13] = r7
            int[] r7 = new int[r0]
            r7 = {x03ca: FILL_ARRAY_DATA , data: [2, 2, 1, 48} // fill-array
            r2[r14] = r7
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.JARVIS_JUDICE_NINKE_DATA = r2
            int[][] r1 = new int[r1][]
            int[] r2 = new int[r0]
            r2 = {x03d6: FILL_ARRAY_DATA , data: [2, 0, 32, 200} // fill-array
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x03e2: FILL_ARRAY_DATA , data: [-3, 1, 12, 200} // fill-array
            r1[r4] = r2
            int[] r2 = new int[r0]
            r2 = {x03ee: FILL_ARRAY_DATA , data: [-1, 1, 26, 200} // fill-array
            r1[r5] = r2
            int[] r2 = new int[r0]
            r2 = {x03fa: FILL_ARRAY_DATA , data: [1, 1, 30, 200} // fill-array
            r1[r6] = r2
            int[] r2 = new int[r0]
            r2 = {x0406: FILL_ARRAY_DATA , data: [3, 1, 16, 200} // fill-array
            r1[r0] = r2
            int[] r2 = new int[r0]
            r2 = {x0412: FILL_ARRAY_DATA , data: [-2, 2, 12, 200} // fill-array
            r1[r8] = r2
            int[] r2 = new int[r0]
            r2 = {x041e: FILL_ARRAY_DATA , data: [0, 2, 26, 200} // fill-array
            r1[r9] = r2
            int[] r2 = new int[r0]
            r2 = {x042a: FILL_ARRAY_DATA , data: [2, 2, 12, 200} // fill-array
            r1[r10] = r2
            int[] r2 = new int[r0]
            r2 = {x0436: FILL_ARRAY_DATA , data: [-3, 3, 5, 200} // fill-array
            r1[r11] = r2
            int[] r2 = new int[r0]
            r2 = {x0442: FILL_ARRAY_DATA , data: [-1, 3, 12, 200} // fill-array
            r1[r12] = r2
            int[] r2 = new int[r0]
            r2 = {x044e: FILL_ARRAY_DATA , data: [1, 3, 12, 200} // fill-array
            r1[r13] = r2
            int[] r0 = new int[r0]
            r0 = {x045a: FILL_ARRAY_DATA , data: [3, 3, 5, 200} // fill-array
            r1[r14] = r0
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.STEVENSON_ARCE_DATA = r1
            return
    }

    public ErrorDiffusionDithering() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.setTemplateType(r0)
            return
    }

    private static int adjust(int r0, int r1) {
            if (r0 > 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 < r1) goto L7
            return r1
        L7:
            return r0
    }

    private void fillBuffer(int r6, int r7, int[] r8, int r9) {
            r5 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r5.getInputImage()
            net.sourceforge.jiu.data.IntegerImage r0 = (net.sourceforge.jiu.data.IntegerImage) r0
            int r1 = r5.imageWidth
            int r1 = r1 + r9
            r2 = 0
        La:
            if (r9 == r1) goto L19
            int r3 = r9 + 1
            int r4 = r2 + 1
            int r2 = r0.getSample(r6, r2, r7)
            r8[r9] = r2
            r9 = r3
            r2 = r4
            goto La
        L19:
            return
    }

    private void init(int[][] r8, int r9) {
            r7 = this;
            if (r8 == 0) goto L130
            r0 = 1
            if (r9 < r0) goto L128
            r7.imageWidth = r9
            r1 = 0
            r7.leftColumns = r1
            r7.rightColumns = r1
            r7.numRows = r0
            int r2 = r8.length
            int[] r2 = new int[r2]
            r7.errorNum = r2
            int r2 = r8.length
            int[] r2 = new int[r2]
            r7.errorDen = r2
            r2 = 0
        L19:
            int r3 = r8.length
            if (r2 >= r3) goto L102
            r3 = r8[r2]
            if (r3 == 0) goto Le6
            r3 = r8[r2]
            int r3 = r3.length
            r4 = 4
            java.lang.String r5 = "."
            if (r3 != r4) goto Lc1
            r3 = r8[r2]
            r3 = r3[r1]
            if (r3 >= 0) goto L36
            int r3 = -r3
            int r4 = r7.leftColumns
            if (r3 <= r4) goto L3e
            r7.leftColumns = r3
            goto L3e
        L36:
            if (r3 <= 0) goto L3e
            int r4 = r7.rightColumns
            if (r3 <= r4) goto L3e
            r7.rightColumns = r3
        L3e:
            r4 = r8[r2]
            r4 = r4[r0]
            if (r4 < 0) goto La7
            int r6 = r7.numRows
            int r6 = r6 - r0
            if (r4 <= r6) goto L4d
            int r6 = r4 + 1
            r7.numRows = r6
        L4d:
            if (r3 > 0) goto L6c
            if (r4 == 0) goto L52
            goto L6c
        L52:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "If y is equal to 0, x must not be <= 0; this is true for array index #"
            r9.append(r0)
            r9.append(r2)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6c:
            r3 = r8[r2]
            r4 = 2
            r3 = r3[r4]
            if (r3 == 0) goto L8d
            r3 = r8[r2]
            r6 = 3
            r3 = r3[r6]
            if (r3 == 0) goto L8d
            int[] r3 = r7.errorNum
            r5 = r8[r2]
            r4 = r5[r4]
            r3[r2] = r4
            int[] r3 = r7.errorDen
            r4 = r8[r2]
            r4 = r4[r6]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L19
        L8d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Neither numerator nor denominator can be 0; this is the case for array index #"
            r9.append(r0)
            r9.append(r2)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "The y values must be >= 0; that is not true for array index #"
            r9.append(r0)
            r9.append(r2)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lc1:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r8 = r8[r2]
            int r8 = r8.length
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Each int[] array of data must be of length 4; array #"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " has length "
            r0.append(r1)
            r0.append(r8)
            r0.append(r5)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        Le6:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Each int[] array of data must be initialized; array #"
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = " is not."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L102:
            int r2 = r7.leftColumns
            int r9 = r9 + r2
            int r2 = r7.rightColumns
            int r9 = r9 + r2
            r7.newWidth = r9
            int r9 = r8.length
            int[] r9 = new int[r9]
            r7.indexLut = r9
            r9 = 0
        L110:
            int[] r2 = r7.indexLut
            int r3 = r2.length
            if (r9 >= r3) goto L127
            r3 = r8[r9]
            r3 = r3[r0]
            int r4 = r7.newWidth
            int r3 = r3 * r4
            r4 = r8[r9]
            r4 = r4[r1]
            int r3 = r3 + r4
            r2[r9] = r3
            int r9 = r9 + 1
            goto L110
        L127:
            return
        L128:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Image width must be larger than 0."
            r8.<init>(r9)
            throw r8
        L130:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Data must not be null."
            r8.<init>(r9)
            throw r8
    }

    private void process(net.sourceforge.jiu.data.Gray8Image r18, net.sourceforge.jiu.data.BilevelImage r19) {
            r17 = this;
            r0 = r17
            int r1 = r18.getHeight()
            int r2 = r18.getWidth()
            if (r19 != 0) goto L12
            net.sourceforge.jiu.data.MemoryBilevelImage r3 = new net.sourceforge.jiu.data.MemoryBilevelImage
            r3.<init>(r2, r1)
            goto L14
        L12:
            r3 = r19
        L14:
            int[] r4 = r0.errorNum
            int r4 = r4.length
            int r5 = r0.newWidth
            int r6 = r0.numRows
            int r5 = r5 * r6
            int[] r7 = new int[r5]
            int r6 = java.lang.Math.min(r6, r1)
            int r8 = r0.leftColumns
            r9 = 0
            r10 = 0
        L27:
            int r11 = r6 + (-1)
            if (r6 <= 0) goto L36
            int r6 = r10 + 1
            r0.fillBuffer(r9, r10, r7, r8)
            int r10 = r0.newWidth
            int r8 = r8 + r10
            r10 = r6
            r6 = r11
            goto L27
        L36:
            int r6 = r0.newWidth
            int r8 = r8 - r6
            r3.clear(r9)
            r6 = 0
        L3d:
            if (r6 >= r1) goto L9d
            int r11 = r0.leftColumns
            r12 = 0
        L42:
            if (r12 >= r2) goto L7d
            r13 = r7[r11]
            r14 = 255(0xff, float:3.57E-43)
            if (r13 >= 0) goto L4c
            r13 = 0
            goto L50
        L4c:
            if (r13 <= r14) goto L50
            r13 = 255(0xff, float:3.57E-43)
        L50:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 != 0) goto L55
            goto L5a
        L55:
            r3.putWhite(r12, r6)
            int r13 = r13 + (-255)
        L5a:
            r14 = 0
        L5b:
            if (r14 >= r4) goto L77
            int[] r15 = r0.errorNum
            r15 = r15[r14]
            int r15 = r15 * r13
            int[] r9 = r0.errorDen
            r9 = r9[r14]
            int r15 = r15 / r9
            int[] r9 = r0.indexLut
            r9 = r9[r14]
            int r9 = r9 + r11
            r16 = r7[r9]
            int r16 = r16 + r15
            r7[r9] = r16
            int r14 = r14 + 1
            r9 = 0
            goto L5b
        L77:
            int r11 = r11 + 1
            int r12 = r12 + 1
            r9 = 0
            goto L42
        L7d:
            int r9 = r0.newWidth
            r11 = 0
        L80:
            if (r9 >= r5) goto L8b
            r12 = r7[r9]
            r7[r11] = r12
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L80
        L8b:
            if (r10 >= r1) goto L95
            int r9 = r10 + 1
            r11 = 0
            r0.fillBuffer(r11, r10, r7, r8)
            r10 = r9
            goto L96
        L95:
            r11 = 0
        L96:
            r0.setProgress(r6, r1)
            int r6 = r6 + 1
            r9 = 0
            goto L3d
        L9d:
            r0.setOutputImage(r3)
            return
    }

    private void process(net.sourceforge.jiu.data.Gray8Image r20, net.sourceforge.jiu.data.Gray8Image r21) {
            r19 = this;
            r0 = r19
            int r1 = r20.getHeight()
            int r2 = r20.getWidth()
            int r3 = r0.grayBits
            int r4 = 8 - r3
            r5 = 1
            int r3 = r5 << r3
            int[] r6 = new int[r3]
            r7 = 0
            r8 = 0
        L15:
            if (r8 >= r3) goto L21
            int r9 = r8 * 255
            int r10 = r3 + (-1)
            int r9 = r9 / r10
            r6[r8] = r9
            int r8 = r8 + 1
            goto L15
        L21:
            if (r21 != 0) goto L29
            net.sourceforge.jiu.data.MemoryGray8Image r3 = new net.sourceforge.jiu.data.MemoryGray8Image
            r3.<init>(r2, r1)
            goto L2b
        L29:
            r3 = r21
        L2b:
            int[] r8 = r0.errorNum
            int r8 = r8.length
            int r9 = r0.newWidth
            int r10 = r0.numRows
            int r9 = r9 * r10
            int[] r11 = new int[r9]
            int r10 = java.lang.Math.min(r10, r1)
            int r12 = r0.leftColumns
            r13 = 0
        L3d:
            int r14 = r10 + (-1)
            if (r10 <= 0) goto L4c
            int r10 = r13 + 1
            r0.fillBuffer(r7, r13, r11, r12)
            int r13 = r0.newWidth
            int r12 = r12 + r13
            r13 = r10
            r10 = r14
            goto L3d
        L4c:
            int r10 = r0.newWidth
            int r12 = r12 - r10
            r10 = 0
        L50:
            if (r10 >= r1) goto Lc2
            int r14 = r0.leftColumns
            r15 = 0
        L55:
            if (r15 >= r2) goto L99
            r5 = r11[r14]
            r7 = 255(0xff, float:3.57E-43)
            if (r5 >= 0) goto L5f
            r5 = 0
            goto L63
        L5f:
            if (r5 <= r7) goto L63
            r5 = 255(0xff, float:3.57E-43)
        L63:
            int r7 = r5 >> r4
            r7 = r6[r7]
            r16 = r2
            r2 = 0
            r3.putSample(r2, r15, r10, r7)
            int r5 = r5 - r7
            r2 = 0
        L6f:
            if (r2 >= r8) goto L8e
            int[] r7 = r0.errorNum
            r7 = r7[r2]
            int r7 = r7 * r5
            r17 = r4
            int[] r4 = r0.errorDen
            r4 = r4[r2]
            int r7 = r7 / r4
            int[] r4 = r0.indexLut
            r4 = r4[r2]
            int r4 = r4 + r14
            r18 = r11[r4]
            int r18 = r18 + r7
            r11[r4] = r18
            int r2 = r2 + 1
            r4 = r17
            goto L6f
        L8e:
            r17 = r4
            int r14 = r14 + 1
            int r15 = r15 + 1
            r2 = r16
            r5 = 1
            r7 = 0
            goto L55
        L99:
            r16 = r2
            r17 = r4
            int r2 = r0.newWidth
            r4 = 0
        La0:
            if (r2 >= r9) goto Lab
            r5 = r11[r2]
            r11[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto La0
        Lab:
            r5 = 1
            if (r13 >= r1) goto Lb6
            int r2 = r13 + 1
            r4 = 0
            r0.fillBuffer(r4, r13, r11, r12)
            r13 = r2
            goto Lb7
        Lb6:
            r4 = 0
        Lb7:
            r0.setProgress(r10, r1)
            int r10 = r10 + 1
            r2 = r16
            r4 = r17
            r7 = 0
            goto L50
        Lc2:
            r0.setOutputImage(r3)
            return
    }

    private void process(net.sourceforge.jiu.data.RGB24Image r25, net.sourceforge.jiu.data.Paletted8Image r26) {
            r24 = this;
            r0 = r24
            int r1 = r25.getHeight()
            int r2 = r25.getWidth()
            if (r26 != 0) goto L18
            net.sourceforge.jiu.data.MemoryPaletted8Image r3 = new net.sourceforge.jiu.data.MemoryPaletted8Image
            net.sourceforge.jiu.color.quantization.RGBQuantizer r4 = r0.quantizer
            net.sourceforge.jiu.data.Palette r4 = r4.createPalette()
            r3.<init>(r2, r1, r4)
            goto L1a
        L18:
            r3 = r26
        L1a:
            int[] r4 = r0.errorNum
            int r4 = r4.length
            int r5 = r0.newWidth
            int r6 = r0.numRows
            int r7 = r5 * r6
            int[] r8 = new int[r7]
            int r9 = r5 * r6
            int[] r10 = new int[r9]
            int r5 = r5 * r6
            int[] r11 = new int[r5]
            int r6 = java.lang.Math.min(r6, r1)
            int r12 = r0.leftColumns
            r14 = 0
        L34:
            int r15 = r6 + (-1)
            r13 = 1
            if (r6 <= 0) goto L4c
            r6 = 0
            r0.fillBuffer(r6, r14, r8, r12)
            r0.fillBuffer(r13, r14, r10, r12)
            int r6 = r14 + 1
            r13 = 2
            r0.fillBuffer(r13, r14, r11, r12)
            int r13 = r0.newWidth
            int r12 = r12 + r13
            r14 = r6
            r6 = r15
            goto L34
        L4c:
            int r6 = r0.newWidth
            int r12 = r12 - r6
            r6 = 3
            int[] r15 = new int[r6]
            int[] r6 = new int[r6]
            r16 = r14
            r14 = 0
        L57:
            if (r14 >= r1) goto L155
            int r13 = r0.leftColumns
            r18 = r13
            r13 = 0
        L5e:
            if (r13 >= r2) goto L115
            r19 = r2
            r2 = r8[r18]
            r20 = r12
            r12 = 255(0xff, float:3.57E-43)
            int r2 = adjust(r2, r12)
            r12 = 0
            r15[r12] = r2
            r2 = r10[r18]
            r12 = 255(0xff, float:3.57E-43)
            int r2 = adjust(r2, r12)
            r17 = 1
            r15[r17] = r2
            r2 = r11[r18]
            int r2 = adjust(r2, r12)
            r12 = 2
            r15[r12] = r2
            net.sourceforge.jiu.color.quantization.RGBQuantizer r2 = r0.quantizer
            int r2 = r2.map(r15, r6)
            r12 = 0
            r3.putSample(r12, r13, r14, r2)
            r2 = r15[r12]
            r21 = r6[r12]
            int r2 = r2 - r21
            r12 = 0
        L95:
            if (r12 >= r4) goto Lb9
            r21 = r3
            int[] r3 = r0.errorNum
            r3 = r3[r12]
            int r3 = r3 * r2
            r22 = r2
            int[] r2 = r0.errorDen
            r2 = r2[r12]
            int r3 = r3 / r2
            int[] r2 = r0.indexLut
            r2 = r2[r12]
            int r2 = r18 + r2
            r23 = r8[r2]
            int r23 = r23 + r3
            r8[r2] = r23
            int r12 = r12 + 1
            r3 = r21
            r2 = r22
            goto L95
        Lb9:
            r21 = r3
            r2 = 1
            r3 = r15[r2]
            r12 = r6[r2]
            int r3 = r3 - r12
            r2 = 0
        Lc2:
            if (r2 >= r4) goto Le2
            int[] r12 = r0.errorNum
            r12 = r12[r2]
            int r12 = r12 * r3
            r22 = r3
            int[] r3 = r0.errorDen
            r3 = r3[r2]
            int r12 = r12 / r3
            int[] r3 = r0.indexLut
            r3 = r3[r2]
            int r3 = r18 + r3
            r23 = r10[r3]
            int r23 = r23 + r12
            r10[r3] = r23
            int r2 = r2 + 1
            r3 = r22
            goto Lc2
        Le2:
            r2 = 2
            r3 = r15[r2]
            r12 = r6[r2]
            int r3 = r3 - r12
            r2 = 0
        Le9:
            if (r2 >= r4) goto L109
            int[] r12 = r0.errorNum
            r12 = r12[r2]
            int r12 = r12 * r3
            r22 = r3
            int[] r3 = r0.errorDen
            r3 = r3[r2]
            int r12 = r12 / r3
            int[] r3 = r0.indexLut
            r3 = r3[r2]
            int r3 = r18 + r3
            r23 = r11[r3]
            int r23 = r23 + r12
            r11[r3] = r23
            int r2 = r2 + 1
            r3 = r22
            goto Le9
        L109:
            int r18 = r18 + 1
            int r13 = r13 + 1
            r2 = r19
            r12 = r20
            r3 = r21
            goto L5e
        L115:
            r19 = r2
            r21 = r3
            r20 = r12
            int r2 = r0.newWidth
            int r3 = r7 - r2
            r12 = 0
            java.lang.System.arraycopy(r8, r2, r8, r12, r3)
            int r2 = r0.newWidth
            int r3 = r9 - r2
            java.lang.System.arraycopy(r10, r2, r10, r12, r3)
            int r2 = r0.newWidth
            int r3 = r5 - r2
            java.lang.System.arraycopy(r11, r2, r11, r12, r3)
            r2 = r16
            r3 = r20
            if (r2 >= r1) goto L145
            r0.fillBuffer(r12, r2, r8, r3)
            r13 = 1
            r0.fillBuffer(r13, r2, r10, r3)
            int r16 = r2 + 1
            r12 = 2
            r0.fillBuffer(r12, r2, r11, r3)
            goto L149
        L145:
            r12 = 2
            r13 = 1
            r16 = r2
        L149:
            r0.setProgress(r14, r1)
            int r14 = r14 + 1
            r12 = r3
            r2 = r19
            r3 = r21
            goto L57
        L155:
            r2 = r3
            r0.setOutputImage(r2)
            return
    }

    private void process(net.sourceforge.jiu.data.RGB24Image r24, net.sourceforge.jiu.data.RGB24Image r25) {
            r23 = this;
            r0 = r23
            int r1 = r24.getHeight()
            int r2 = r24.getWidth()
            if (r25 != 0) goto L15
            r3 = r24
            net.sourceforge.jiu.data.PixelImage r3 = r3.createCompatibleImage(r2, r1)
            net.sourceforge.jiu.data.RGB24Image r3 = (net.sourceforge.jiu.data.RGB24Image) r3
            goto L17
        L15:
            r3 = r25
        L17:
            int[] r4 = r0.errorNum
            int r4 = r4.length
            int r5 = r0.newWidth
            int r6 = r0.numRows
            int r7 = r5 * r6
            int[] r8 = new int[r7]
            int r9 = r5 * r6
            int[] r10 = new int[r9]
            int r5 = r5 * r6
            int[] r11 = new int[r5]
            int r6 = java.lang.Math.min(r6, r1)
            int r12 = r0.leftColumns
            r14 = 0
        L31:
            int r15 = r6 + (-1)
            r13 = 1
            if (r6 <= 0) goto L49
            r6 = 0
            r0.fillBuffer(r6, r14, r8, r12)
            r0.fillBuffer(r13, r14, r10, r12)
            int r6 = r14 + 1
            r13 = 2
            r0.fillBuffer(r13, r14, r11, r12)
            int r13 = r0.newWidth
            int r12 = r12 + r13
            r14 = r6
            r6 = r15
            goto L31
        L49:
            int r6 = r0.newWidth
            int r12 = r12 - r6
            r6 = 3
            int[] r15 = new int[r6]
            int[] r6 = new int[r6]
            r16 = r14
            r14 = 0
        L54:
            if (r14 >= r1) goto L15c
            int r13 = r0.leftColumns
            r17 = r13
            r13 = 0
        L5b:
            if (r13 >= r2) goto L11c
            r18 = r2
            r2 = r8[r17]
            r19 = r12
            r12 = 255(0xff, float:3.57E-43)
            int r2 = adjust(r2, r12)
            r12 = 0
            r15[r12] = r2
            r2 = r10[r17]
            r12 = 255(0xff, float:3.57E-43)
            int r2 = adjust(r2, r12)
            r12 = 1
            r15[r12] = r2
            r2 = r11[r17]
            r12 = 255(0xff, float:3.57E-43)
            int r2 = adjust(r2, r12)
            r12 = 2
            r15[r12] = r2
            r2 = 0
            r12 = r6[r2]
            r3.putSample(r2, r13, r14, r12)
            r12 = 1
            r2 = r6[r12]
            r3.putSample(r12, r13, r14, r2)
            r2 = 2
            r12 = r6[r2]
            r3.putSample(r2, r13, r14, r12)
            r2 = 0
            r12 = r15[r2]
            r20 = r6[r2]
            int r12 = r12 - r20
            r2 = 0
        L9c:
            if (r2 >= r4) goto Lc0
            r20 = r3
            int[] r3 = r0.errorNum
            r3 = r3[r2]
            int r3 = r3 * r12
            r21 = r12
            int[] r12 = r0.errorDen
            r12 = r12[r2]
            int r3 = r3 / r12
            int[] r12 = r0.indexLut
            r12 = r12[r2]
            int r12 = r17 + r12
            r22 = r8[r12]
            int r22 = r22 + r3
            r8[r12] = r22
            int r2 = r2 + 1
            r3 = r20
            r12 = r21
            goto L9c
        Lc0:
            r20 = r3
            r2 = 1
            r3 = r15[r2]
            r12 = r6[r2]
            int r3 = r3 - r12
            r2 = 0
        Lc9:
            if (r2 >= r4) goto Le9
            int[] r12 = r0.errorNum
            r12 = r12[r2]
            int r12 = r12 * r3
            r21 = r3
            int[] r3 = r0.errorDen
            r3 = r3[r2]
            int r12 = r12 / r3
            int[] r3 = r0.indexLut
            r3 = r3[r2]
            int r3 = r17 + r3
            r22 = r10[r3]
            int r22 = r22 + r12
            r10[r3] = r22
            int r2 = r2 + 1
            r3 = r21
            goto Lc9
        Le9:
            r2 = 2
            r3 = r15[r2]
            r12 = r6[r2]
            int r3 = r3 - r12
            r2 = 0
        Lf0:
            if (r2 >= r4) goto L110
            int[] r12 = r0.errorNum
            r12 = r12[r2]
            int r12 = r12 * r3
            r21 = r3
            int[] r3 = r0.errorDen
            r3 = r3[r2]
            int r12 = r12 / r3
            int[] r3 = r0.indexLut
            r3 = r3[r2]
            int r3 = r17 + r3
            r22 = r11[r3]
            int r22 = r22 + r12
            r11[r3] = r22
            int r2 = r2 + 1
            r3 = r21
            goto Lf0
        L110:
            int r17 = r17 + 1
            int r13 = r13 + 1
            r2 = r18
            r12 = r19
            r3 = r20
            goto L5b
        L11c:
            r18 = r2
            r20 = r3
            r19 = r12
            int r2 = r0.newWidth
            int r3 = r7 - r2
            r12 = 0
            java.lang.System.arraycopy(r8, r2, r8, r12, r3)
            int r2 = r0.newWidth
            int r3 = r9 - r2
            java.lang.System.arraycopy(r10, r2, r10, r12, r3)
            int r2 = r0.newWidth
            int r3 = r5 - r2
            java.lang.System.arraycopy(r11, r2, r11, r12, r3)
            r2 = r16
            r3 = r19
            if (r2 >= r1) goto L14c
            r0.fillBuffer(r12, r2, r8, r3)
            r13 = 1
            r0.fillBuffer(r13, r2, r10, r3)
            int r16 = r2 + 1
            r12 = 2
            r0.fillBuffer(r12, r2, r11, r3)
            goto L150
        L14c:
            r12 = 2
            r13 = 1
            r16 = r2
        L150:
            r0.setProgress(r14, r1)
            int r14 = r14 + 1
            r12 = r3
            r2 = r18
            r3 = r20
            goto L54
        L15c:
            r2 = r3
            r0.setOutputImage(r2)
            return
    }

    public void process() throws net.sourceforge.jiu.ops.MissingParameterException, net.sourceforge.jiu.ops.WrongParameterException {
            r4 = this;
            r4.ensureInputImageIsAvailable()
            r4.ensureImagesHaveSameResolution()
            net.sourceforge.jiu.data.PixelImage r0 = r4.getInputImage()
            net.sourceforge.jiu.data.PixelImage r1 = r4.getOutputImage()
            boolean r2 = r0 instanceof net.sourceforge.jiu.data.Gray8Image
            if (r2 == 0) goto L3e
            int[][] r2 = r4.templateData
            int r3 = r0.getWidth()
            r4.init(r2, r3)
            int r2 = r4.grayBits
            r3 = 1
            if (r2 != r3) goto L28
            net.sourceforge.jiu.data.Gray8Image r0 = (net.sourceforge.jiu.data.Gray8Image) r0
            net.sourceforge.jiu.data.BilevelImage r1 = (net.sourceforge.jiu.data.BilevelImage) r1
            r4.process(r0, r1)
            goto L62
        L28:
            if (r2 <= r3) goto L36
            r3 = 8
            if (r2 >= r3) goto L36
            net.sourceforge.jiu.data.Gray8Image r0 = (net.sourceforge.jiu.data.Gray8Image) r0
            net.sourceforge.jiu.data.Gray8Image r1 = (net.sourceforge.jiu.data.Gray8Image) r1
            r4.process(r0, r1)
            goto L62
        L36:
            net.sourceforge.jiu.ops.WrongParameterException r0 = new net.sourceforge.jiu.ops.WrongParameterException
            java.lang.String r1 = "Cannot handle gray bits other than 1..7."
            r0.<init>(r1)
            throw r0
        L3e:
            boolean r2 = r0 instanceof net.sourceforge.jiu.data.RGB24Image
            if (r2 == 0) goto L6b
            int[][] r2 = r4.templateData
            int r3 = r0.getWidth()
            r4.init(r2, r3)
            net.sourceforge.jiu.color.quantization.RGBQuantizer r2 = r4.quantizer
            if (r2 == 0) goto L63
            boolean r2 = r4.useTruecolorOutput
            if (r2 == 0) goto L5b
            net.sourceforge.jiu.data.RGB24Image r0 = (net.sourceforge.jiu.data.RGB24Image) r0
            net.sourceforge.jiu.data.RGB24Image r1 = (net.sourceforge.jiu.data.RGB24Image) r1
            r4.process(r0, r1)
            goto L62
        L5b:
            net.sourceforge.jiu.data.RGB24Image r0 = (net.sourceforge.jiu.data.RGB24Image) r0
            net.sourceforge.jiu.data.Paletted8Image r1 = (net.sourceforge.jiu.data.Paletted8Image) r1
            r4.process(r0, r1)
        L62:
            return
        L63:
            net.sourceforge.jiu.ops.MissingParameterException r0 = new net.sourceforge.jiu.ops.MissingParameterException
            java.lang.String r1 = "No quantizer was specified."
            r0.<init>(r1)
            throw r0
        L6b:
            net.sourceforge.jiu.ops.WrongParameterException r1 = new net.sourceforge.jiu.ops.WrongParameterException
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot handle this image: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public void setQuantizer(net.sourceforge.jiu.color.quantization.RGBQuantizer r1) {
            r0 = this;
            r0.quantizer = r1
            return
    }

    public void setTemplateType(int r4) {
            r3 = this;
            if (r4 == 0) goto L46
            r0 = 1
            if (r4 == r0) goto L41
            r0 = 2
            if (r4 == r0) goto L3c
            r0 = 3
            if (r4 == r0) goto L37
            r0 = 4
            if (r4 == r0) goto L32
            r0 = 5
            if (r4 != r0) goto L16
            int[][] r4 = net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.STEVENSON_ARCE_DATA
            r3.templateData = r4
            goto L4a
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown template type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L32:
            int[][] r4 = net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.JARVIS_JUDICE_NINKE_DATA
            r3.templateData = r4
            goto L4a
        L37:
            int[][] r4 = net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.SIERRA_DATA
            r3.templateData = r4
            goto L4a
        L3c:
            int[][] r4 = net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.BURKES_DATA
            r3.templateData = r4
            goto L4a
        L41:
            int[][] r4 = net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.STUCKI_DATA
            r3.templateData = r4
            goto L4a
        L46:
            int[][] r4 = net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering.FLOYD_STEINBERG_DATA
            r3.templateData = r4
        L4a:
            return
    }
}
