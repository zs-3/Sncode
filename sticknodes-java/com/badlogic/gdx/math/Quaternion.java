package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Quaternion implements java.io.Serializable {
    private static com.badlogic.gdx.math.Quaternion tmp1;
    private static com.badlogic.gdx.math.Quaternion tmp2;
    public float w;
    public float x;
    public float y;
    public float z;

    static {
            com.badlogic.gdx.math.Quaternion r0 = new com.badlogic.gdx.math.Quaternion
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            com.badlogic.gdx.math.Quaternion.tmp1 = r0
            com.badlogic.gdx.math.Quaternion r0 = new com.badlogic.gdx.math.Quaternion
            r0.<init>(r1, r1, r1, r1)
            com.badlogic.gdx.math.Quaternion.tmp2 = r0
            return
    }

    public Quaternion() {
            r0 = this;
            r0.<init>()
            r0.idt()
            return
    }

    public Quaternion(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r2, r3, r4)
            return
    }

    public Quaternion(com.badlogic.gdx.math.Quaternion r1) {
            r0 = this;
            r0.<init>()
            r0.set(r1)
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
            boolean r2 = r5 instanceof com.badlogic.gdx.math.Quaternion
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.badlogic.gdx.math.Quaternion r5 = (com.badlogic.gdx.math.Quaternion) r5
            float r2 = r4.w
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r3 = r5.w
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r3)
            if (r2 != r3) goto L48
            float r2 = r4.x
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r3 = r5.x
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r3)
            if (r2 != r3) goto L48
            float r2 = r4.y
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r3 = r5.y
            int r3 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r3)
            if (r2 != r3) goto L48
            float r2 = r4.z
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            float r5 = r5.z
            int r5 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r5)
            if (r2 != r5) goto L48
            goto L49
        L48:
            r0 = 0
        L49:
            return r0
    }

    public int hashCode() {
            r3 = this;
            float r0 = r3.w
            int r0 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r0)
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r2 = r3.x
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            float r2 = r3.y
            int r2 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            float r1 = r3.z
            int r1 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    public com.badlogic.gdx.math.Quaternion idt() {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Quaternion r0 = r2.set(r0, r0, r0, r1)
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
            float r1 = r2.w
            float r1 = r1 * r1
            float r0 = r0 + r1
            return r0
    }

    public com.badlogic.gdx.math.Quaternion nor() {
            r2 = this;
            float r0 = r2.len2()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L2b
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = com.badlogic.gdx.math.MathUtils.isEqual(r0, r1)
            if (r1 != 0) goto L2b
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            float r1 = r2.w
            float r1 = r1 / r0
            r2.w = r1
            float r1 = r2.x
            float r1 = r1 / r0
            r2.x = r1
            float r1 = r2.y
            float r1 = r1 / r0
            r2.y = r1
            float r1 = r2.z
            float r1 = r1 / r0
            r2.z = r1
        L2b:
            return r2
    }

    public com.badlogic.gdx.math.Quaternion set(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.z = r3
            r0.w = r4
            return r0
    }

    public com.badlogic.gdx.math.Quaternion set(com.badlogic.gdx.math.Quaternion r4) {
            r3 = this;
            float r0 = r4.x
            float r1 = r4.y
            float r2 = r4.z
            float r4 = r4.w
            com.badlogic.gdx.math.Quaternion r4 = r3.set(r0, r1, r2, r4)
            return r4
    }

    public com.badlogic.gdx.math.Quaternion setFromAxis(float r2, float r3, float r4, float r5) {
            r1 = this;
            r0 = 1016003125(0x3c8efa35, float:0.017453292)
            float r5 = r5 * r0
            com.badlogic.gdx.math.Quaternion r2 = r1.setFromAxisRad(r2, r3, r4, r5)
            return r2
    }

    public com.badlogic.gdx.math.Quaternion setFromAxisRad(float r6, float r7, float r8, float r9) {
            r5 = this;
            float r0 = com.badlogic.gdx.math.Vector3.len(r6, r7, r8)
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto Le
            com.badlogic.gdx.math.Quaternion r6 = r5.idt()
            return r6
        Le:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r0
            r0 = 1086918619(0x40c90fdb, float:6.2831855)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 >= 0) goto L1c
            float r9 = -r9
            float r9 = r9 % r0
            float r0 = r0 - r9
            goto L1e
        L1c:
            float r0 = r9 % r0
        L1e:
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r9
            double r0 = (double) r0
            double r3 = java.lang.Math.sin(r0)
            float r9 = (float) r3
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r6 = r6 * r2
            float r6 = r6 * r9
            float r7 = r7 * r2
            float r7 = r7 * r9
            float r2 = r2 * r8
            float r2 = r2 * r9
            com.badlogic.gdx.math.Quaternion r6 = r5.set(r6, r7, r2, r0)
            com.badlogic.gdx.math.Quaternion r6 = r6.nor()
            return r6
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            float r1 = r3.x
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            float r2 = r3.y
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.z
            r0.append(r2)
            r0.append(r1)
            float r1 = r3.w
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
