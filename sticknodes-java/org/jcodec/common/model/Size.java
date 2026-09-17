package org.jcodec.common.model;

/* loaded from: classes2.dex */
public class Size {
    private int height;
    private int width;

    public Size(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.jcodec.common.model.Size r5 = (org.jcodec.common.model.Size) r5
            int r2 = r4.height
            int r3 = r5.height
            if (r2 == r3) goto L1c
            return r1
        L1c:
            int r2 = r4.width
            int r5 = r5.width
            if (r2 == r5) goto L23
            return r1
        L23:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.height
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.width
            int r0 = r0 + r1
            return r0
    }
}
