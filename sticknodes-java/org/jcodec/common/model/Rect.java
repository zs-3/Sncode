package org.jcodec.common.model;

/* loaded from: classes2.dex */
public class Rect {
    private int height;
    private int width;
    private int x;
    private int y;

    public Rect(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
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
            org.jcodec.common.model.Rect r5 = (org.jcodec.common.model.Rect) r5
            int r2 = r4.height
            int r3 = r5.height
            if (r2 == r3) goto L1c
            return r1
        L1c:
            int r2 = r4.width
            int r3 = r5.width
            if (r2 == r3) goto L23
            return r1
        L23:
            int r2 = r4.x
            int r3 = r5.x
            if (r2 == r3) goto L2a
            return r1
        L2a:
            int r2 = r4.y
            int r5 = r5.y
            if (r2 == r5) goto L31
            return r1
        L31:
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

    public int getX() {
            r1 = this;
            int r0 = r1.x
            return r0
    }

    public int getY() {
            r1 = this;
            int r0 = r1.y
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.height
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r3.width
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.x
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.y
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.x
            int r1 = r6.y
            int r2 = r6.width
            int r3 = r6.height
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Rect [x="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", y="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", width="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", height="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = "]"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
