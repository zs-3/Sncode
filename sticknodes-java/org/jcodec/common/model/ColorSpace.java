package org.jcodec.common.model;

/* loaded from: classes2.dex */
public final class ColorSpace {
    public static final org.jcodec.common.model.ColorSpace BGR = null;
    public static final org.jcodec.common.model.ColorSpace GREY = null;
    public static final org.jcodec.common.model.ColorSpace MONO = null;
    public static final org.jcodec.common.model.ColorSpace RGB = null;
    public static final org.jcodec.common.model.ColorSpace YUV420 = null;
    public static final org.jcodec.common.model.ColorSpace YUV420J = null;
    public static final org.jcodec.common.model.ColorSpace YUV422 = null;
    public static final org.jcodec.common.model.ColorSpace YUV422J = null;
    public static final org.jcodec.common.model.ColorSpace YUV422_10 = null;
    public static final org.jcodec.common.model.ColorSpace YUV444 = null;
    public static final org.jcodec.common.model.ColorSpace YUV444J = null;
    public static final org.jcodec.common.model.ColorSpace YUV444_10 = null;
    private static final int[] _000 = null;
    private static final int[] _011 = null;
    private static final int[] _012 = null;
    public int[] compHeight;
    public int[] compPlane;
    public int[] compWidth;
    public int nComp;

    static {
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x007a: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            org.jcodec.common.model.ColorSpace._000 = r1
            int[] r2 = new int[r0]
            r2 = {x0084: FILL_ARRAY_DATA , data: [0, 1, 1} // fill-array
            org.jcodec.common.model.ColorSpace._011 = r2
            int[] r3 = new int[r0]
            r3 = {x008e: FILL_ARRAY_DATA , data: [0, 1, 2} // fill-array
            org.jcodec.common.model.ColorSpace._012 = r3
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r1, r1, r1)
            org.jcodec.common.model.ColorSpace.BGR = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r1, r1, r1)
            org.jcodec.common.model.ColorSpace.RGB = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r2, r2)
            org.jcodec.common.model.ColorSpace.YUV420 = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r2, r2)
            org.jcodec.common.model.ColorSpace.YUV420J = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r2, r1)
            org.jcodec.common.model.ColorSpace.YUV422 = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r2, r1)
            org.jcodec.common.model.ColorSpace.YUV422J = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r1, r1)
            org.jcodec.common.model.ColorSpace.YUV444 = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r1, r1)
            org.jcodec.common.model.ColorSpace.YUV444J = r4
            org.jcodec.common.model.ColorSpace r4 = new org.jcodec.common.model.ColorSpace
            r4.<init>(r0, r3, r2, r1)
            org.jcodec.common.model.ColorSpace.YUV422_10 = r4
            org.jcodec.common.model.ColorSpace r2 = new org.jcodec.common.model.ColorSpace
            r4 = 1
            int[] r5 = new int[r4]
            r6 = 0
            r5[r6] = r6
            int[] r7 = new int[r4]
            r7[r6] = r6
            int[] r8 = new int[r4]
            r8[r6] = r6
            r2.<init>(r4, r5, r7, r8)
            org.jcodec.common.model.ColorSpace.GREY = r2
            org.jcodec.common.model.ColorSpace r2 = new org.jcodec.common.model.ColorSpace
            r2.<init>(r4, r1, r1, r1)
            org.jcodec.common.model.ColorSpace.MONO = r2
            org.jcodec.common.model.ColorSpace r2 = new org.jcodec.common.model.ColorSpace
            r2.<init>(r0, r3, r1, r1)
            org.jcodec.common.model.ColorSpace.YUV444_10 = r2
            return
    }

    private ColorSpace(int r1, int[] r2, int[] r3, int[] r4) {
            r0 = this;
            r0.<init>()
            r0.nComp = r1
            r0.compPlane = r2
            r0.compWidth = r3
            r0.compHeight = r4
            return
    }
}
