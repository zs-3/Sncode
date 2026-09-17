package org.jcodec.codecs.h264.decode.deblock;

/* loaded from: classes2.dex */
public class DeblockingFilter {
    public static int[] alphaTab;
    public static int[] betaTab;
    static int[] inverse;
    public static int[][] tcs;

    static {
            r0 = 52
            int[] r1 = new int[r0]
            r1 = {x0038: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 17, 20, 22, 25, 28, 32, 36, 40, 45, 50, 56, 63, 71, 80, 90, 101, 113, 127, 144, 162, 182, 203, 226, 255, 255} // fill-array
            org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.alphaTab = r1
            int[] r1 = new int[r0]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18} // fill-array
            org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.betaTab = r1
            r1 = 3
            int[][] r1 = new int[r1][]
            int[] r2 = new int[r0]
            r2 = {x0110: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8, 9, 10, 11, 13} // fill-array
            r3 = 0
            r1[r3] = r2
            int[] r2 = new int[r0]
            r2 = {x017c: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8, 10, 11, 12, 13, 15, 17} // fill-array
            r3 = 1
            r1[r3] = r2
            int[] r0 = new int[r0]
            r0 = {x01e8: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8, 9, 10, 11, 13, 14, 16, 18, 20, 23, 25} // fill-array
            r2 = 2
            r1[r2] = r0
            org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.tcs = r1
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0254: FILL_ARRAY_DATA , data: [0, 1, 4, 5, 2, 3, 6, 7, 8, 9, 12, 13, 10, 11, 14, 15} // fill-array
            org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.inverse = r0
            return
    }
}
