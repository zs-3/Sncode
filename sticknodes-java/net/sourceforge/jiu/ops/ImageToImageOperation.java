package net.sourceforge.jiu.ops;

/* loaded from: classes2.dex */
public abstract class ImageToImageOperation extends net.sourceforge.jiu.ops.Operation {
    private boolean canInAndOutBeEqual;
    private net.sourceforge.jiu.data.PixelImage inputImage;
    private net.sourceforge.jiu.data.PixelImage outputImage;

    public ImageToImageOperation() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public ImageToImageOperation(net.sourceforge.jiu.data.PixelImage r1, net.sourceforge.jiu.data.PixelImage r2) {
            r0 = this;
            r0.<init>()
            r0.setInputImage(r1)
            r0.setOutputImage(r2)
            r1 = 0
            r0.canInAndOutBeEqual = r1
            return
    }

    public void ensureImagesHaveSameResolution() throws net.sourceforge.jiu.ops.WrongParameterException {
            r4 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r4.getInputImage()
            net.sourceforge.jiu.data.PixelImage r1 = r4.getOutputImage()
            if (r0 == 0) goto L31
            if (r1 == 0) goto L31
            int r2 = r0.getWidth()
            int r3 = r1.getWidth()
            if (r2 != r3) goto L29
            int r0 = r0.getHeight()
            int r1 = r1.getHeight()
            if (r0 != r1) goto L21
            goto L31
        L21:
            net.sourceforge.jiu.ops.WrongParameterException r0 = new net.sourceforge.jiu.ops.WrongParameterException
            java.lang.String r1 = "Input and output image must have the same height."
            r0.<init>(r1)
            throw r0
        L29:
            net.sourceforge.jiu.ops.WrongParameterException r0 = new net.sourceforge.jiu.ops.WrongParameterException
            java.lang.String r1 = "Input and output image must have the same width."
            r0.<init>(r1)
            throw r0
        L31:
            return
    }

    public void ensureInputImageIsAvailable() throws net.sourceforge.jiu.ops.MissingParameterException {
            r2 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r2.getInputImage()
            if (r0 == 0) goto L7
            return
        L7:
            net.sourceforge.jiu.ops.MissingParameterException r0 = new net.sourceforge.jiu.ops.MissingParameterException
            java.lang.String r1 = "Input image missing."
            r0.<init>(r1)
            throw r0
    }

    public net.sourceforge.jiu.data.PixelImage getInputImage() {
            r1 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r1.inputImage
            return r0
    }

    public net.sourceforge.jiu.data.PixelImage getOutputImage() {
            r1 = this;
            net.sourceforge.jiu.data.PixelImage r0 = r1.outputImage
            return r0
    }

    public void setInputImage(net.sourceforge.jiu.data.PixelImage r1) {
            r0 = this;
            r0.inputImage = r1
            return
    }

    public void setOutputImage(net.sourceforge.jiu.data.PixelImage r1) {
            r0 = this;
            r0.outputImage = r1
            return
    }
}
