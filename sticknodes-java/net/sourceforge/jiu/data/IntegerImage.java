package net.sourceforge.jiu.data;

/* loaded from: classes2.dex */
public interface IntegerImage extends net.sourceforge.jiu.data.PixelImage {
    void clear(int r1);

    int getSample(int r1, int r2, int r3);

    void getSamples(int r1, int r2, int r3, int r4, int r5, int[] r6, int r7);

    void putSample(int r1, int r2, int r3, int r4);
}
