package org.jcodec.scale;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class Yuv420jToRgb {
    private static final int FIX_0_71414 = 0;
    private static final int FIX_1_402 = 0;
    private static final int FIX_1_772 = 0;
    private static final int _FIX_0_34414 = 0;

    static {
            r0 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            int r0 = FIX(r0)
            org.jcodec.scale.Yuv420jToRgb.FIX_0_71414 = r0
            r0 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            int r0 = FIX(r0)
            org.jcodec.scale.Yuv420jToRgb.FIX_1_772 = r0
            r0 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r0 = FIX(r0)
            int r0 = -r0
            org.jcodec.scale.Yuv420jToRgb._FIX_0_34414 = r0
            r0 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r0 = FIX(r0)
            org.jcodec.scale.Yuv420jToRgb.FIX_1_402 = r0
            return
    }

    public Yuv420jToRgb() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int FIX(double r2) {
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 * r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }
}
