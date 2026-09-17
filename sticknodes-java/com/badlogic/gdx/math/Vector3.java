package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Vector3 implements java.io.Serializable {
    public static final com.badlogic.gdx.math.Vector3 X = null;
    public static final com.badlogic.gdx.math.Vector3 Y = null;
    public static final com.badlogic.gdx.math.Vector3 Z = null;
    public static final com.badlogic.gdx.math.Vector3 Zero = null;
    private static final com.badlogic.gdx.math.Matrix4 tmpMat = null;
    public float x;
    public float y;
    public float z;

    static {
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.badlogic.gdx.math.Vector3.X = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>(r2, r1, r2)
            com.badlogic.gdx.math.Vector3.Y = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>(r2, r2, r1)
            com.badlogic.gdx.math.Vector3.Z = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>(r2, r2, r2)
            com.badlogic.gdx.math.Vector3.Zero = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            com.badlogic.gdx.math.Vector3.tmpMat = r0
            return
    }

    public Vector3() {
            r0 = this;
            r0.<init>()
            return
    }

    public Vector3(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r2, r3)
            return
    }

    public Vector3(com.badlogic.gdx.math.Vector3 r1) {
            r0 = this;
            r0.<init>()
            r0.set(r1)
            return
    }

    public static float len(float r0, float r1, float r2) {
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r2 = r2 * r2
            float r0 = r0 + r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public com.badlogic.gdx.math.Vector3 add(float r2, float r3, float r4) {
            r1 = this;
            float r0 = r1.x
            float r0 = r0 + r2
            float r2 = r1.y
            float r2 = r2 + r3
            float r3 = r1.z
            float r3 = r3 + r4
            com.badlogic.gdx.math.Vector3 r2 = r1.set(r0, r2, r3)
            return r2
    }

    public com.badlogic.gdx.math.Vector3 add(com.badlogic.gdx.math.Vector3 r3) {
            r2 = this;
            float r0 = r3.x
            float r1 = r3.y
            float r3 = r3.z
            com.badlogic.gdx.math.Vector3 r3 = r2.add(r0, r1, r3)
            return r3
    }

    public com.badlogic.gdx.math.Vector3 crs(float r5, float r6, float r7) {
            r4 = this;
            float r0 = r4.y
            float r1 = r0 * r7
            float r2 = r4.z
            float r3 = r2 * r6
            float r1 = r1 - r3
            float r2 = r2 * r5
            float r3 = r4.x
            float r7 = r7 * r3
            float r2 = r2 - r7
            float r3 = r3 * r6
            float r0 = r0 * r5
            float r3 = r3 - r0
            com.badlogic.gdx.math.Vector3 r5 = r4.set(r1, r2, r3)
            return r5
    }

    public com.badlogic.gdx.math.Vector3 crs(com.badlogic.gdx.math.Vector3 r7) {
            r6 = this;
            float r0 = r6.y
            float r1 = r7.z
            float r2 = r0 * r1
            float r3 = r6.z
            float r4 = r7.y
            float r5 = r3 * r4
            float r2 = r2 - r5
            float r7 = r7.x
            float r3 = r3 * r7
            float r5 = r6.x
            float r1 = r1 * r5
            float r3 = r3 - r1
            float r5 = r5 * r4
            float r0 = r0 * r7
            float r5 = r5 - r0
            com.badlogic.gdx.math.Vector3 r7 = r6.set(r2, r3, r5)
            return r7
    }

    public float dot(com.badlogic.gdx.math.Vector3 r4) {
            r3 = this;
            float r0 = r3.x
            float r1 = r4.x
            float r0 = r0 * r1
            float r1 = r3.y
            float r2 = r4.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r3.z
            float r4 = r4.z
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
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
            com.badlogic.gdx.math.Vector3 r5 = (com.badlogic.gdx.math.Vector3) r5
            float r2 = r4.x
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r2)
            float r3 = r5.x
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r3)
            if (r2 == r3) goto L24
            return r1
        L24:
            float r2 = r4.y
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r2)
            float r3 = r5.y
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r3)
            if (r2 == r3) goto L33
            return r1
        L33:
            float r2 = r4.z
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r2)
            float r5 = r5.z
            int r5 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r5)
            if (r2 == r5) goto L42
            return r1
        L42:
            return r0
    }

    public int hashCode() {
            r3 = this;
            float r0 = r3.x
            int r0 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r0)
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r2 = r3.y
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            float r1 = r3.z
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
            float r1 = r2.z
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public float len2() {
            r2 = this;
            float r0 = r2.x
            float r0 = r0 * r0
            float r1 = r2.y
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r2.z
            float r1 = r1 * r1
            float r0 = r0 + r1
            return r0
    }

    public com.badlogic.gdx.math.Vector3 mul(com.badlogic.gdx.math.Matrix4 r7) {
            r6 = this;
            float[] r7 = r7.val
            float r0 = r6.x
            r1 = 0
            r1 = r7[r1]
            float r1 = r1 * r0
            float r2 = r6.y
            r3 = 4
            r3 = r7[r3]
            float r3 = r3 * r2
            float r1 = r1 + r3
            float r3 = r6.z
            r4 = 8
            r4 = r7[r4]
            float r4 = r4 * r3
            float r1 = r1 + r4
            r4 = 12
            r4 = r7[r4]
            float r1 = r1 + r4
            r4 = 1
            r4 = r7[r4]
            float r4 = r4 * r0
            r5 = 5
            r5 = r7[r5]
            float r5 = r5 * r2
            float r4 = r4 + r5
            r5 = 9
            r5 = r7[r5]
            float r5 = r5 * r3
            float r4 = r4 + r5
            r5 = 13
            r5 = r7[r5]
            float r4 = r4 + r5
            r5 = 2
            r5 = r7[r5]
            float r0 = r0 * r5
            r5 = 6
            r5 = r7[r5]
            float r2 = r2 * r5
            float r0 = r0 + r2
            r2 = 10
            r2 = r7[r2]
            float r3 = r3 * r2
            float r0 = r0 + r3
            r2 = 14
            r7 = r7[r2]
            float r0 = r0 + r7
            com.badlogic.gdx.math.Vector3 r7 = r6.set(r1, r4, r0)
            return r7
    }

    public com.badlogic.gdx.math.Vector3 nor() {
            r4 = this;
            float r0 = r4.len2()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L1c
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L1c
        L10:
            double r2 = (double) r0
            double r2 = java.lang.Math.sqrt(r2)
            float r0 = (float) r2
            float r1 = r1 / r0
            com.badlogic.gdx.math.Vector3 r0 = r4.scl(r1)
            return r0
        L1c:
            return r4
    }

    public com.badlogic.gdx.math.Vector3 prj(com.badlogic.gdx.math.Matrix4 r8) {
            r7 = this;
            float[] r8 = r8.val
            float r0 = r7.x
            r1 = 3
            r1 = r8[r1]
            float r1 = r1 * r0
            float r2 = r7.y
            r3 = 7
            r3 = r8[r3]
            float r3 = r3 * r2
            float r1 = r1 + r3
            float r3 = r7.z
            r4 = 11
            r4 = r8[r4]
            float r4 = r4 * r3
            float r1 = r1 + r4
            r4 = 15
            r4 = r8[r4]
            float r1 = r1 + r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r1
            r1 = 0
            r1 = r8[r1]
            float r1 = r1 * r0
            r5 = 4
            r5 = r8[r5]
            float r5 = r5 * r2
            float r1 = r1 + r5
            r5 = 8
            r5 = r8[r5]
            float r5 = r5 * r3
            float r1 = r1 + r5
            r5 = 12
            r5 = r8[r5]
            float r1 = r1 + r5
            float r1 = r1 * r4
            r5 = 1
            r5 = r8[r5]
            float r5 = r5 * r0
            r6 = 5
            r6 = r8[r6]
            float r6 = r6 * r2
            float r5 = r5 + r6
            r6 = 9
            r6 = r8[r6]
            float r6 = r6 * r3
            float r5 = r5 + r6
            r6 = 13
            r6 = r8[r6]
            float r5 = r5 + r6
            float r5 = r5 * r4
            r6 = 2
            r6 = r8[r6]
            float r0 = r0 * r6
            r6 = 6
            r6 = r8[r6]
            float r2 = r2 * r6
            float r0 = r0 + r2
            r2 = 10
            r2 = r8[r2]
            float r3 = r3 * r2
            float r0 = r0 + r3
            r2 = 14
            r8 = r8[r2]
            float r0 = r0 + r8
            float r0 = r0 * r4
            com.badlogic.gdx.math.Vector3 r8 = r7.set(r1, r5, r0)
            return r8
    }

    public com.badlogic.gdx.math.Vector3 scl(float r4) {
            r3 = this;
            float r0 = r3.x
            float r0 = r0 * r4
            float r1 = r3.y
            float r1 = r1 * r4
            float r2 = r3.z
            float r2 = r2 * r4
            com.badlogic.gdx.math.Vector3 r4 = r3.set(r0, r1, r2)
            return r4
    }

    public com.badlogic.gdx.math.Vector3 set(float r1, float r2, float r3) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.z = r3
            return r0
    }

    public com.badlogic.gdx.math.Vector3 set(com.badlogic.gdx.math.Vector3 r3) {
            r2 = this;
            float r0 = r3.x
            float r1 = r3.y
            float r3 = r3.z
            com.badlogic.gdx.math.Vector3 r3 = r2.set(r0, r1, r3)
            return r3
    }

    public com.badlogic.gdx.math.Vector3 sub(float r2, float r3, float r4) {
            r1 = this;
            float r0 = r1.x
            float r0 = r0 - r2
            float r2 = r1.y
            float r2 = r2 - r3
            float r3 = r1.z
            float r3 = r3 - r4
            com.badlogic.gdx.math.Vector3 r2 = r1.set(r0, r2, r3)
            return r2
    }

    public com.badlogic.gdx.math.Vector3 sub(com.badlogic.gdx.math.Vector3 r3) {
            r2 = this;
            float r0 = r3.x
            float r1 = r3.y
            float r3 = r3.z
            com.badlogic.gdx.math.Vector3 r3 = r2.sub(r0, r1, r3)
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            float r1 = r3.x
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            float r2 = r3.y
            r0.append(r2)
            r0.append(r1)
            float r1 = r3.z
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
