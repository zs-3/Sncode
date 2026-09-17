package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Vector2 implements java.io.Serializable {
    public static final com.badlogic.gdx.math.Vector2 X = null;
    public static final com.badlogic.gdx.math.Vector2 Y = null;
    public static final com.badlogic.gdx.math.Vector2 Zero = null;
    public float x;
    public float y;

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.<init>(r1, r2)
            com.badlogic.gdx.math.Vector2.X = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>(r2, r1)
            com.badlogic.gdx.math.Vector2.Y = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>(r2, r2)
            com.badlogic.gdx.math.Vector2.Zero = r0
            return
    }

    public Vector2() {
            r0 = this;
            r0.<init>()
            return
    }

    public Vector2(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            return
    }

    public Vector2(com.badlogic.gdx.math.Vector2 r1) {
            r0 = this;
            r0.<init>()
            r0.set(r1)
            return
    }

    public com.badlogic.gdx.math.Vector2 add(float r2, float r3) {
            r1 = this;
            float r0 = r1.x
            float r0 = r0 + r2
            r1.x = r0
            float r2 = r1.y
            float r2 = r2 + r3
            r1.y = r2
            return r1
    }

    public float dst(com.badlogic.gdx.math.Vector2 r3) {
            r2 = this;
            float r0 = r3.x
            float r1 = r2.x
            float r0 = r0 - r1
            float r3 = r3.y
            float r1 = r2.y
            float r3 = r3 - r1
            float r0 = r0 * r0
            float r3 = r3 * r3
            float r0 = r0 + r3
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r3 = (float) r0
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
            com.badlogic.gdx.math.Vector2 r5 = (com.badlogic.gdx.math.Vector2) r5
            float r2 = r4.x
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r2)
            float r3 = r5.x
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r3)
            if (r2 == r3) goto L24
            return r1
        L24:
            float r2 = r4.y
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r2)
            float r5 = r5.y
            int r5 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r5)
            if (r2 == r5) goto L33
            return r1
        L33:
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.x
            int r0 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r0)
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r2.y
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    public float len() {
            r2 = this;
            float r0 = r2.x
            float r0 = r0 * r0
            float r1 = r2.y
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public com.badlogic.gdx.math.Vector2 nor() {
            r2 = this;
            float r0 = r2.len()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L13
            float r1 = r2.x
            float r1 = r1 / r0
            r2.x = r1
            float r1 = r2.y
            float r1 = r1 / r0
            r2.y = r1
        L13:
            return r2
    }

    public com.badlogic.gdx.math.Vector2 set(float r1, float r2) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            return r0
    }

    public com.badlogic.gdx.math.Vector2 set(com.badlogic.gdx.math.Vector2 r2) {
            r1 = this;
            float r0 = r2.x
            r1.x = r0
            float r2 = r2.y
            r1.y = r2
            return r1
    }

    public com.badlogic.gdx.math.Vector2 sub(com.badlogic.gdx.math.Vector2 r3) {
            r2 = this;
            float r0 = r2.x
            float r1 = r3.x
            float r0 = r0 - r1
            r2.x = r0
            float r0 = r2.y
            float r3 = r3.y
            float r0 = r0 - r3
            r2.y = r0
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            float r1 = r2.x
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            float r1 = r2.y
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
