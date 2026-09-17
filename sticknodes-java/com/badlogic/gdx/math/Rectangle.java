package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Rectangle implements java.io.Serializable {
    public static final com.badlogic.gdx.math.Rectangle tmp = null;
    public static final com.badlogic.gdx.math.Rectangle tmp2 = null;
    public float height;
    public float width;
    public float x;
    public float y;

    static {
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            com.badlogic.gdx.math.Rectangle.tmp = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            com.badlogic.gdx.math.Rectangle.tmp2 = r0
            return
    }

    public Rectangle() {
            r0 = this;
            r0.<init>()
            return
    }

    public Rectangle(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    public boolean contains(float r3, float r4) {
            r2 = this;
            float r0 = r2.x
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 > 0) goto L1c
            float r1 = r2.width
            float r0 = r0 + r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L1c
            float r3 = r2.y
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto L1c
            float r0 = r2.height
            float r3 = r3 + r0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
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
            com.badlogic.gdx.math.Rectangle r5 = (com.badlogic.gdx.math.Rectangle) r5
            float r2 = r4.height
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r3 = r5.height
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r3)
            if (r2 == r3) goto L24
            return r1
        L24:
            float r2 = r4.width
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r3 = r5.width
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r3)
            if (r2 == r3) goto L33
            return r1
        L33:
            float r2 = r4.x
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r3 = r5.x
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r3)
            if (r2 == r3) goto L42
            return r1
        L42:
            float r2 = r4.y
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r5 = r5.y
            int r5 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r5)
            if (r2 == r5) goto L51
            return r1
        L51:
            return r0
    }

    public float getHeight() {
            r1 = this;
            float r0 = r1.height
            return r0
    }

    public float getWidth() {
            r1 = this;
            float r0 = r1.width
            return r0
    }

    public int hashCode() {
            r3 = this;
            float r0 = r3.height
            int r0 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r0)
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r2 = r3.width
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            float r2 = r3.x
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            float r1 = r3.y
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    public com.badlogic.gdx.math.Rectangle set(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return r0
    }

    public com.badlogic.gdx.math.Rectangle set(com.badlogic.gdx.math.Rectangle r2) {
            r1 = this;
            float r0 = r2.x
            r1.x = r0
            float r0 = r2.y
            r1.y = r0
            float r0 = r2.width
            r1.width = r0
            float r2 = r2.height
            r1.height = r2
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            float r1 = r3.x
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            float r2 = r3.y
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.width
            r0.append(r2)
            r0.append(r1)
            float r1 = r3.height
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
