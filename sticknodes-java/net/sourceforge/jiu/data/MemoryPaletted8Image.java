package net.sourceforge.jiu.data;

/* loaded from: classes2.dex */
public class MemoryPaletted8Image extends net.sourceforge.jiu.data.MemoryByteChannelImage implements net.sourceforge.jiu.data.Paletted8Image {
    private int maxSampleValue;
    private net.sourceforge.jiu.data.Palette palette;

    public MemoryPaletted8Image(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3)
            r2 = 0
            r1.palette = r2
            r2 = 255(0xff, float:3.57E-43)
            r1.maxSampleValue = r2
            return
    }

    public MemoryPaletted8Image(int r1, int r2, net.sourceforge.jiu.data.Palette r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setPalette(r3)
            return
    }

    @Override // net.sourceforge.jiu.data.PalettedImage
    public net.sourceforge.jiu.data.Palette getPalette() {
            r1 = this;
            net.sourceforge.jiu.data.Palette r0 = r1.palette
            return r0
    }

    public void setPalette(net.sourceforge.jiu.data.Palette r3) {
            r2 = this;
            if (r3 == 0) goto L13
            int r0 = r3.getNumEntries()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot use palette with more than 256 entries in a Paletted8Image."
            r3.<init>(r0)
            throw r3
        L13:
            r2.palette = r3
            if (r3 != 0) goto L1c
            r3 = 255(0xff, float:3.57E-43)
            r2.maxSampleValue = r3
            goto L24
        L1c:
            int r3 = r3.getNumEntries()
            int r3 = r3 + (-1)
            r2.maxSampleValue = r3
        L24:
            return
    }
}
