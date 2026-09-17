package net.sourceforge.jiu.color.quantization;

/* loaded from: classes2.dex */
public interface RGBQuantizer {
    net.sourceforge.jiu.data.Palette createPalette();

    int map(int[] r1, int[] r2);
}
