package org.jcodec.scale;

/* loaded from: classes2.dex */
public class Yuv422pToYuv420j {
    private int halfDst;
    private int halfSrc;
    private int shift;

    static {
            return
    }

    public Yuv422pToYuv420j(int r4, int r5) {
            r3 = this;
            r3.<init>()
            int r0 = r5 + 13
            int r1 = r0 - r4
            r3.shift = r1
            if (r1 < 0) goto L22
            int r0 = r5 - r4
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            r2 = 128(0x80, float:1.794E-43)
            int r0 = r2 << r0
            r3.halfSrc = r0
            int r4 = r4 - r5
            int r4 = java.lang.Math.max(r4, r1)
            int r4 = r2 << r4
            r3.halfDst = r4
            return
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Maximum upshift allowed: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }
}
