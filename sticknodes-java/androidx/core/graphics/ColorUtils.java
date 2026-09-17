package androidx.core.graphics;

/* loaded from: classes.dex */
public final class ColorUtils {
    private static final java.lang.ThreadLocal<double[]> TEMP_ARRAY = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.graphics.ColorUtils.TEMP_ARRAY = r0
            return
    }

    public static int XYZToColor(double r17, double r19, double r21) {
            r0 = 4614479601276245823(0x4009ecbfb15b573f, double:3.2406)
            double r0 = r0 * r17
            r2 = -4613770284334934970(0xbff8985f06f69446, double:-1.5372)
            double r2 = r2 * r19
            double r0 = r0 + r2
            r2 = -4620718437840042171(0xbfdfe90ff9724745, double:-0.4986)
            double r2 = r2 * r21
            double r0 = r0 + r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r4 = -4616469741951580845(0xbfef013a92a30553, double:-0.9689)
            double r4 = r4 * r17
            r6 = 4611126671353668488(0x3ffe0346dc5d6388, double:1.8758)
            double r6 = r6 * r19
            double r4 = r4 + r6
            r6 = 4586141601340942451(0x3fa53f7ced916873, double:0.0415)
            double r6 = r6 * r21
            double r4 = r4 + r6
            double r4 = r4 / r2
            r6 = 4588188037011619604(0x3fac84b5dcc63f14, double:0.0557)
            double r6 = r6 * r17
            r8 = -4626854141972371735(0xbfca1cac083126e9, double:-0.204)
            double r8 = r8 * r19
            double r6 = r6 + r8
            r8 = 4607439123978777526(0x3ff0e978d4fdf3b6, double:1.057)
            double r8 = r8 * r21
            double r6 = r6 + r8
            double r6 = r6 / r2
            r2 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r8 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            r10 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r12 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r14 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r16 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r16 <= 0) goto L6f
            double r0 = java.lang.Math.pow(r0, r8)
            double r0 = r0 * r10
            double r0 = r0 - r2
            goto L71
        L6f:
            double r0 = r0 * r12
        L71:
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 <= 0) goto L7d
            double r4 = java.lang.Math.pow(r4, r8)
            double r4 = r4 * r10
            double r4 = r4 - r2
            goto L7f
        L7d:
            double r4 = r4 * r12
        L7f:
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 <= 0) goto L8b
            double r6 = java.lang.Math.pow(r6, r8)
            double r6 = r6 * r10
            double r6 = r6 - r2
            goto L8d
        L8b:
            double r6 = r6 * r12
        L8d:
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)
            int r1 = (int) r0
            r0 = 0
            r8 = 255(0xff, float:3.57E-43)
            int r1 = constrain(r1, r0, r8)
            double r4 = r4 * r2
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = constrain(r5, r0, r8)
            double r6 = r6 * r2
            long r2 = java.lang.Math.round(r6)
            int r3 = (int) r2
            int r0 = constrain(r3, r0, r8)
            int r0 = android.graphics.Color.rgb(r1, r4, r0)
            return r0
    }

    private static int constrain(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            goto L7
        L3:
            int r1 = java.lang.Math.min(r0, r2)
        L7:
            return r1
    }
}
