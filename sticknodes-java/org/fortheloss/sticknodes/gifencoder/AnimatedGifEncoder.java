package org.fortheloss.sticknodes.gifencoder;

/* loaded from: classes2.dex */
public class AnimatedGifEncoder {
    protected boolean _ditherEnabled;
    protected boolean _encodeOptimized;
    private boolean _isFinished;
    private boolean _isVertical;
    protected int _numColors;
    protected int _paletteBits;
    protected int _transparentColorIndex;
    protected boolean closeStream;
    protected int[] colorPalette;
    protected int delay;
    protected int dispose;
    protected boolean firstFrame;
    protected int height;
    protected int[] indexedPixels;
    protected net.sourceforge.jiu.data.MemoryRGB24Image inputImage;
    protected java.io.OutputStream out;
    protected byte[] pixels;
    protected int[] previousFrameColoredPixels;
    protected int repeat;
    protected boolean sizeSet;
    protected boolean started;
    protected int width;

    public AnimatedGifEncoder() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.repeat = r0
            r1 = 0
            r2.delay = r1
            r2.started = r1
            r2.dispose = r0
            r2.closeStream = r1
            r0 = 1
            r2.firstFrame = r0
            r2.sizeSet = r1
            r2._paletteBits = r1
            r2._numColors = r1
            r2._encodeOptimized = r1
            r2._ditherEnabled = r1
            r2._transparentColorIndex = r1
            r2._isFinished = r1
            r2._isVertical = r1
            return
    }

    private boolean start(java.io.OutputStream r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 1
            r2.closeStream = r0
            r2.out = r3
            java.lang.String r3 = "GIF89a"
            r2.writeString(r3)     // Catch: java.io.IOException -> Lf
            r0 = 1
        Lf:
            r2.started = r0
            return r0
    }

    public boolean addFrame(byte[] r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L5a
            boolean r1 = r4.started
            if (r1 == 0) goto L5a
            boolean r1 = r4.sizeSet
            if (r1 != 0) goto Lc
            goto L5a
        Lc:
            r1 = 1
            r4.pixels = r5     // Catch: java.io.IOException -> L5a
            int[] r2 = r4.indexedPixels     // Catch: java.io.IOException -> L5a
            if (r2 != 0) goto L1a
            int r5 = r5.length     // Catch: java.io.IOException -> L5a
            int r5 = r5 / 4
            int[] r5 = new int[r5]     // Catch: java.io.IOException -> L5a
            r4.indexedPixels = r5     // Catch: java.io.IOException -> L5a
        L1a:
            int[] r5 = r4.colorPalette     // Catch: java.io.IOException -> L5a
            if (r5 != 0) goto L24
            r5 = 256(0x100, float:3.59E-43)
            int[] r5 = new int[r5]     // Catch: java.io.IOException -> L5a
            r4.colorPalette = r5     // Catch: java.io.IOException -> L5a
        L24:
            net.sourceforge.jiu.data.MemoryRGB24Image r5 = r4.inputImage     // Catch: java.io.IOException -> L5a
            if (r5 != 0) goto L33
            net.sourceforge.jiu.data.MemoryRGB24Image r5 = new net.sourceforge.jiu.data.MemoryRGB24Image     // Catch: java.io.IOException -> L5a
            int r2 = r4.width     // Catch: java.io.IOException -> L5a
            int r3 = r4.height     // Catch: java.io.IOException -> L5a
            r5.<init>(r2, r3)     // Catch: java.io.IOException -> L5a
            r4.inputImage = r5     // Catch: java.io.IOException -> L5a
        L33:
            r4.analyzePixels()     // Catch: java.io.IOException -> L5a
            boolean r5 = r4.firstFrame     // Catch: java.io.IOException -> L5a
            if (r5 == 0) goto L47
            r4.writeLSD()     // Catch: java.io.IOException -> L5a
            r4.writePalette()     // Catch: java.io.IOException -> L5a
            int r5 = r4.repeat     // Catch: java.io.IOException -> L5a
            if (r5 < 0) goto L47
            r4.writeNetscapeExt()     // Catch: java.io.IOException -> L5a
        L47:
            r4.writeGraphicCtrlExt()     // Catch: java.io.IOException -> L5a
            r4.writeImageDesc()     // Catch: java.io.IOException -> L5a
            boolean r5 = r4.firstFrame     // Catch: java.io.IOException -> L5a
            if (r5 != 0) goto L54
            r4.writePalette()     // Catch: java.io.IOException -> L5a
        L54:
            r4.writePixels()     // Catch: java.io.IOException -> L5a
            r4.firstFrame = r0     // Catch: java.io.IOException -> L5a
            r0 = 1
        L5a:
            return r0
    }

    protected void analyzePixels() {
            r14 = this;
            byte[] r0 = r14.pixels
            int r1 = r0.length
            int r1 = r1 + (-4)
            int r0 = r0.length
            int r0 = r0 / 4
            boolean r2 = r14._isVertical
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L70
            int r1 = r0 * 3
            byte[] r1 = new byte[r1]
            int r2 = r14.height
            int r2 = r2 - r5
            r6 = 0
        L17:
            if (r2 < 0) goto L43
            r7 = 0
        L1a:
            int r8 = r14.width
            if (r7 >= r8) goto L40
            int r8 = r14.height
            int r8 = r8 * r7
            int r8 = r8 + r2
            int r8 = r8 * 4
            int r9 = r6 + 1
            byte[] r10 = r14.pixels
            r11 = r10[r8]
            r1[r6] = r11
            int r6 = r9 + 1
            int r11 = r8 + 1
            r11 = r10[r11]
            r1[r9] = r11
            int r9 = r6 + 1
            int r8 = r8 + r3
            r8 = r10[r8]
            r1[r6] = r8
            int r7 = r7 + 1
            r6 = r9
            goto L1a
        L40:
            int r2 = r2 + (-1)
            goto L17
        L43:
            int r2 = r14.width
            int r2 = r2 - r5
            r6 = 0
            r7 = 0
        L48:
            if (r6 >= r0) goto La4
            net.sourceforge.jiu.data.MemoryRGB24Image r8 = r14.inputImage
            int r9 = r6 * 3
            r10 = r1[r9]
            r8.putByteSample(r4, r2, r7, r10)
            net.sourceforge.jiu.data.MemoryRGB24Image r8 = r14.inputImage
            int r10 = r9 + 1
            r10 = r1[r10]
            r8.putByteSample(r5, r2, r7, r10)
            net.sourceforge.jiu.data.MemoryRGB24Image r8 = r14.inputImage
            int r9 = r9 + r3
            r9 = r1[r9]
            r8.putByteSample(r3, r2, r7, r9)
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L6d
            int r2 = r14.width
            int r2 = r2 - r5
            int r7 = r7 + 1
        L6d:
            int r6 = r6 + 1
            goto L48
        L70:
            int r2 = r14.width
            int r2 = r2 - r5
            r6 = 0
            r7 = 0
        L75:
            if (r6 >= r0) goto La4
            net.sourceforge.jiu.data.MemoryRGB24Image r8 = r14.inputImage
            byte[] r9 = r14.pixels
            r9 = r9[r1]
            r8.putByteSample(r4, r2, r7, r9)
            net.sourceforge.jiu.data.MemoryRGB24Image r8 = r14.inputImage
            byte[] r9 = r14.pixels
            int r10 = r1 + 1
            r9 = r9[r10]
            r8.putByteSample(r5, r2, r7, r9)
            net.sourceforge.jiu.data.MemoryRGB24Image r8 = r14.inputImage
            byte[] r9 = r14.pixels
            int r10 = r1 + 2
            r9 = r9[r10]
            r8.putByteSample(r3, r2, r7, r9)
            int r1 = r1 + (-4)
            int r2 = r2 + (-1)
            if (r2 >= 0) goto La1
            int r2 = r14.width
            int r2 = r2 - r5
            int r7 = r7 + 1
        La1:
            int r6 = r6 + 1
            goto L75
        La4:
            net.sourceforge.jiu.color.quantization.OctreeColorQuantizer r0 = new net.sourceforge.jiu.color.quantization.OctreeColorQuantizer
            r0.<init>()
            net.sourceforge.jiu.data.MemoryRGB24Image r1 = r14.inputImage
            r0.setInputImage(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0.setPaletteSize(r1)
            boolean r2 = r14._ditherEnabled     // Catch: java.lang.Throwable -> L163
            if (r2 == 0) goto Ld4
            r0.init()     // Catch: java.lang.Throwable -> L163
            net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering r2 = new net.sourceforge.jiu.color.dithering.ErrorDiffusionDithering     // Catch: java.lang.Throwable -> L163
            r2.<init>()     // Catch: java.lang.Throwable -> L163
            r2.setTemplateType(r5)     // Catch: java.lang.Throwable -> L163
            r2.setQuantizer(r0)     // Catch: java.lang.Throwable -> L163
            net.sourceforge.jiu.data.MemoryRGB24Image r0 = r14.inputImage     // Catch: java.lang.Throwable -> L163
            r2.setInputImage(r0)     // Catch: java.lang.Throwable -> L163
            r2.process()     // Catch: java.lang.Throwable -> L163
            net.sourceforge.jiu.data.PixelImage r0 = r2.getOutputImage()     // Catch: java.lang.Throwable -> L163
            net.sourceforge.jiu.data.Paletted8Image r0 = (net.sourceforge.jiu.data.Paletted8Image) r0     // Catch: java.lang.Throwable -> L163
            goto Ldd
        Ld4:
            r0.process()     // Catch: java.lang.Throwable -> L163
            net.sourceforge.jiu.data.PixelImage r0 = r0.getOutputImage()     // Catch: java.lang.Throwable -> L163
            net.sourceforge.jiu.data.Paletted8Image r0 = (net.sourceforge.jiu.data.Paletted8Image) r0     // Catch: java.lang.Throwable -> L163
        Ldd:
            r6 = r0
            net.sourceforge.jiu.data.Palette r0 = r6.getPalette()     // Catch: java.lang.Throwable -> L163
            int r2 = r0.getNumEntries()     // Catch: java.lang.Throwable -> L163
            r14._numColors = r2     // Catch: java.lang.Throwable -> L163
            r14._transparentColorIndex = r2     // Catch: java.lang.Throwable -> L163
            r2 = 0
        Leb:
            int r7 = r14._numColors     // Catch: java.lang.Throwable -> L163
            if (r2 >= r7) goto L10b
            int r7 = r0.getSample(r4, r2)     // Catch: java.lang.Throwable -> L163
            r7 = r7 & r1
            int r8 = r0.getSample(r5, r2)     // Catch: java.lang.Throwable -> L163
            r8 = r8 & r1
            int r9 = r0.getSample(r3, r2)     // Catch: java.lang.Throwable -> L163
            r9 = r9 & r1
            int[] r10 = r14.colorPalette     // Catch: java.lang.Throwable -> L163
            int r7 = r7 << 16
            int r8 = r8 << 8
            r7 = r7 | r8
            r7 = r7 | r9
            r10[r2] = r7     // Catch: java.lang.Throwable -> L163
            int r2 = r2 + 1
            goto Leb
        L10b:
            r14._paletteBits = r5     // Catch: java.lang.Throwable -> L163
        L10d:
            int r0 = r14._paletteBits     // Catch: java.lang.Throwable -> L163
            int r1 = r5 << r0
            int r2 = r14._numColors     // Catch: java.lang.Throwable -> L163
            int r2 = r2 + r5
            if (r1 >= r2) goto L11b
            int r0 = r0 + 1
            r14._paletteBits = r0     // Catch: java.lang.Throwable -> L163
            goto L10d
        L11b:
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r14.width     // Catch: java.lang.Throwable -> L163
            int r11 = r14.height     // Catch: java.lang.Throwable -> L163
            int[] r12 = r14.indexedPixels     // Catch: java.lang.Throwable -> L163
            r13 = 0
            r6.getSamples(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L163
            int[] r0 = r14.previousFrameColoredPixels     // Catch: java.lang.Throwable -> L163
            if (r0 == 0) goto L149
            int[] r0 = r14.indexedPixels     // Catch: java.lang.Throwable -> L163
            int r0 = r0.length     // Catch: java.lang.Throwable -> L163
            int r0 = r0 - r5
        L130:
            if (r0 < 0) goto L163
            int[] r1 = r14.colorPalette     // Catch: java.lang.Throwable -> L163
            int[] r2 = r14.indexedPixels     // Catch: java.lang.Throwable -> L163
            r3 = r2[r0]     // Catch: java.lang.Throwable -> L163
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L163
            int[] r3 = r14.previousFrameColoredPixels     // Catch: java.lang.Throwable -> L163
            r4 = r3[r0]     // Catch: java.lang.Throwable -> L163
            if (r1 != r4) goto L144
            int r4 = r14._transparentColorIndex     // Catch: java.lang.Throwable -> L163
            r2[r0] = r4     // Catch: java.lang.Throwable -> L163
        L144:
            r3[r0] = r1     // Catch: java.lang.Throwable -> L163
            int r0 = r0 + (-1)
            goto L130
        L149:
            int[] r0 = r14.indexedPixels     // Catch: java.lang.Throwable -> L163
            int r0 = r0.length     // Catch: java.lang.Throwable -> L163
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L163
            r14.previousFrameColoredPixels = r0     // Catch: java.lang.Throwable -> L163
            int r0 = r0.length     // Catch: java.lang.Throwable -> L163
            int r0 = r0 - r5
        L152:
            if (r0 < 0) goto L163
            int[] r1 = r14.previousFrameColoredPixels     // Catch: java.lang.Throwable -> L163
            int[] r2 = r14.colorPalette     // Catch: java.lang.Throwable -> L163
            int[] r3 = r14.indexedPixels     // Catch: java.lang.Throwable -> L163
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L163
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L163
            r1[r0] = r2     // Catch: java.lang.Throwable -> L163
            int r0 = r0 + (-1)
            goto L152
        L163:
            return
    }

    public void cancel() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.started = r0
            java.io.OutputStream r1 = r2.out     // Catch: java.io.IOException -> L16
            r1.flush()     // Catch: java.io.IOException -> L16
            boolean r1 = r2.closeStream     // Catch: java.io.IOException -> L16
            if (r1 == 0) goto L16
            java.io.OutputStream r1 = r2.out     // Catch: java.io.IOException -> L16
            r1.close()     // Catch: java.io.IOException -> L16
        L16:
            r1 = 0
            r2.out = r1
            r2.pixels = r1
            r2.indexedPixels = r1
            r2.colorPalette = r1
            r2.previousFrameColoredPixels = r1
            r2.closeStream = r0
            r0 = 1
            r2.firstFrame = r0
            r2.inputImage = r1
            java.lang.System.gc()
            r2._isFinished = r0
            return
    }

    public boolean finish() {
            r4 = this;
            boolean r0 = r4.started
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.started = r1
            r0 = 1
            java.io.OutputStream r2 = r4.out     // Catch: java.io.IOException -> L20
            r3 = 59
            r2.write(r3)     // Catch: java.io.IOException -> L20
            java.io.OutputStream r2 = r4.out     // Catch: java.io.IOException -> L20
            r2.flush()     // Catch: java.io.IOException -> L20
            boolean r2 = r4.closeStream     // Catch: java.io.IOException -> L20
            if (r2 == 0) goto L1e
            java.io.OutputStream r2 = r4.out     // Catch: java.io.IOException -> L20
            r2.close()     // Catch: java.io.IOException -> L20
        L1e:
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r3 = 0
            r4.out = r3
            r4.pixels = r3
            r4.indexedPixels = r3
            r4.colorPalette = r3
            r4.previousFrameColoredPixels = r3
            r4.closeStream = r1
            r4.firstFrame = r0
            r4.inputImage = r3
            java.lang.System.gc()
            r4._isFinished = r0
            return r2
    }

    public void setFrameRate(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Le
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            int r2 = java.lang.Math.round(r0)
            r1.delay = r2
        Le:
            return
    }

    public void setRepeat(int r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r0.repeat = r1
        L4:
            return
    }

    public void setSize(int r2, int r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.started
            if (r0 == 0) goto L9
            boolean r0 = r1.firstFrame
            if (r0 != 0) goto L9
            return
        L9:
            r1._isVertical = r4
            if (r4 == 0) goto L12
            r1.width = r3
            r1.height = r2
            goto L16
        L12:
            r1.width = r2
            r1.height = r3
        L16:
            int r2 = r1.width
            r3 = 1
            if (r2 >= r3) goto L1f
            r2 = 320(0x140, float:4.48E-43)
            r1.width = r2
        L1f:
            int r2 = r1.height
            if (r2 >= r3) goto L27
            r2 = 240(0xf0, float:3.36E-43)
            r1.height = r2
        L27:
            r1.sizeSet = r3
            return
    }

    public boolean start(java.lang.String r2, boolean r3, boolean r4) {
            r1 = this;
            r1._encodeOptimized = r3
            r1._ditherEnabled = r4
            r3 = 0
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L19
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L19
            r0.<init>(r2)     // Catch: java.io.IOException -> L19
            r4.<init>(r0)     // Catch: java.io.IOException -> L19
            r1.out = r4     // Catch: java.io.IOException -> L19
            boolean r2 = r1.start(r4)     // Catch: java.io.IOException -> L19
            r4 = 1
            r1.closeStream = r4     // Catch: java.io.IOException -> L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            r1._isFinished = r3
            r1.started = r2
            return r2
    }

    protected void writeGraphicCtrlExt() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = 33
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 249(0xf9, float:3.49E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 4
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 5
            r0.write(r1)
            int r0 = r2.delay
            r2.writeShort(r0)
            java.io.OutputStream r0 = r2.out
            int r1 = r2._transparentColorIndex
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 0
            r0.write(r1)
            return
    }

    protected void writeImageDesc() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = 44
            r0.write(r1)
            r0 = 0
            r2.writeShort(r0)
            r2.writeShort(r0)
            int r1 = r2.width
            r2.writeShort(r1)
            int r1 = r2.height
            r2.writeShort(r1)
            boolean r1 = r2.firstFrame
            if (r1 == 0) goto L22
            java.io.OutputStream r1 = r2.out
            r1.write(r0)
            goto L2d
        L22:
            java.io.OutputStream r0 = r2.out
            int r1 = r2._paletteBits
            int r1 = r1 + (-1)
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.write(r1)
        L2d:
            return
    }

    protected void writeLSD() throws java.io.IOException {
            r2 = this;
            int r0 = r2.width
            r2.writeShort(r0)
            int r0 = r2.height
            r2.writeShort(r0)
            java.io.OutputStream r0 = r2.out
            int r1 = r2._paletteBits
            int r1 = r1 + (-1)
            r1 = r1 | 240(0xf0, float:3.36E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 0
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r0.write(r1)
            return
    }

    protected void writeNetscapeExt() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = 33
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 11
            r0.write(r1)
            java.lang.String r0 = "NETSCAPE2.0"
            r2.writeString(r0)
            java.io.OutputStream r0 = r2.out
            r1 = 3
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 1
            r0.write(r1)
            int r0 = r2.repeat
            r2.writeShort(r0)
            java.io.OutputStream r0 = r2.out
            r1 = 0
            r0.write(r1)
            return
    }

    protected void writePalette() throws java.io.IOException {
            r6 = this;
            int r0 = r6._paletteBits
            r1 = 1
            int r0 = r1 << r0
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L2a
            int r3 = r6._numColors
            if (r2 >= r3) goto L12
            int[] r3 = r6.colorPalette
            r3 = r3[r2]
            goto L13
        L12:
            r3 = 0
        L13:
            java.io.OutputStream r4 = r6.out
            int r5 = r3 >>> 16
            r4.write(r5)
            java.io.OutputStream r4 = r6.out
            int r5 = r3 >>> 8
            r4.write(r5)
            java.io.OutputStream r4 = r6.out
            int r3 = r3 >>> r1
            r4.write(r3)
            int r2 = r2 + 1
            goto L7
        L2a:
            return
    }

    protected void writePixels() throws java.io.IOException {
            r9 = this;
            int r0 = r9._paletteBits
            r1 = 2
            int r5 = java.lang.Math.max(r0, r1)
            java.io.OutputStream r0 = r9.out
            r0.write(r5)
            org.fortheloss.sticknodes.gifencoder.SubblockOutputStream r0 = new org.fortheloss.sticknodes.gifencoder.SubblockOutputStream
            java.io.OutputStream r1 = r9.out
            r0.<init>(r1)
            org.fortheloss.sticknodes.gifencoder.ByteBitOutputStream r1 = new org.fortheloss.sticknodes.gifencoder.ByteBitOutputStream
            r1.<init>(r0)
            boolean r2 = r9._encodeOptimized
            if (r2 == 0) goto L34
            int r2 = r9.width
            int r3 = r9.height
            int r2 = r2 * r3
            int r2 = r2 / 50
            r3 = 2048(0x800, float:2.87E-42)
            int r6 = java.lang.Math.max(r2, r3)
            int[] r2 = r9.indexedPixels
            r3 = 0
            int r4 = r2.length
            r8 = 0
            r7 = r1
            org.fortheloss.sticknodes.gifencoder.GifLzwCompressor.encodeOptimized(r2, r3, r4, r5, r6, r7, r8)
            goto L3b
        L34:
            int[] r2 = r9.indexedPixels
            r3 = 0
            int r4 = r2.length
            org.fortheloss.sticknodes.gifencoder.GifLzwCompressor.encodeMonolithic(r2, r3, r4, r5, r1)
        L3b:
            r1.detach()
            r0.detach()
            return
    }

    protected void writeShort(int r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
            return
    }

    protected void writeString(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L14
            java.io.OutputStream r1 = r3.out
            char r2 = r4.charAt(r0)
            byte r2 = (byte) r2
            r1.write(r2)
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }
}
