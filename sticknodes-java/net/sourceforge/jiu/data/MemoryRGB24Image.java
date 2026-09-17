package net.sourceforge.jiu.data;

/* loaded from: classes2.dex */
public class MemoryRGB24Image extends net.sourceforge.jiu.data.MemoryByteChannelImage implements net.sourceforge.jiu.data.RGB24Image {
    public MemoryRGB24Image(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // net.sourceforge.jiu.data.PixelImage
    public net.sourceforge.jiu.data.PixelImage createCompatibleImage(int r2, int r3) {
            r1 = this;
            net.sourceforge.jiu.data.MemoryRGB24Image r0 = new net.sourceforge.jiu.data.MemoryRGB24Image
            r0.<init>(r2, r3)
            return r0
    }
}
