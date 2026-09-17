package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public final class Affine2 implements java.io.Serializable {
    public float m00;
    public float m01;
    public float m02;
    public float m10;
    public float m11;
    public float m12;

    public Affine2() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.m00 = r0
            r1 = 0
            r2.m01 = r1
            r2.m02 = r1
            r2.m10 = r1
            r2.m11 = r0
            r2.m12 = r1
            return
    }

    public com.badlogic.gdx.math.Affine2 preMul(com.badlogic.gdx.math.Affine2 r12) {
            r11 = this;
            float r0 = r12.m00
            float r1 = r11.m00
            float r2 = r0 * r1
            float r3 = r12.m01
            float r4 = r11.m10
            float r5 = r3 * r4
            float r2 = r2 + r5
            float r5 = r11.m01
            float r6 = r0 * r5
            float r7 = r11.m11
            float r8 = r3 * r7
            float r6 = r6 + r8
            float r8 = r11.m02
            float r0 = r0 * r8
            float r9 = r11.m12
            float r3 = r3 * r9
            float r0 = r0 + r3
            float r3 = r12.m02
            float r0 = r0 + r3
            float r3 = r12.m10
            float r1 = r1 * r3
            float r10 = r12.m11
            float r4 = r4 * r10
            float r1 = r1 + r4
            float r5 = r5 * r3
            float r7 = r7 * r10
            float r5 = r5 + r7
            float r3 = r3 * r8
            float r10 = r10 * r9
            float r3 = r3 + r10
            float r12 = r12.m12
            float r3 = r3 + r12
            r11.m00 = r2
            r11.m01 = r6
            r11.m02 = r0
            r11.m10 = r1
            r11.m11 = r5
            r11.m12 = r3
            return r11
    }

    public com.badlogic.gdx.math.Affine2 setToTrnRotScl(float r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            r0.m02 = r1
            r0.m12 = r2
            r1 = 0
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 != 0) goto L12
            r0.m00 = r4
            r0.m01 = r1
            r0.m10 = r1
            r0.m11 = r5
            goto L2b
        L12:
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r3)
            float r2 = com.badlogic.gdx.math.MathUtils.cosDeg(r3)
            float r3 = r2 * r4
            r0.m00 = r3
            float r3 = -r1
            float r3 = r3 * r5
            r0.m01 = r3
            float r1 = r1 * r4
            r0.m10 = r1
            float r2 = r2 * r5
            r0.m11 = r2
        L2b:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            float r1 = r3.m00
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            float r2 = r3.m01
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.m02
            r0.append(r2)
            java.lang.String r2 = "]\n["
            r0.append(r2)
            float r2 = r3.m10
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.m11
            r0.append(r2)
            r0.append(r1)
            float r1 = r3.m12
            r0.append(r1)
            java.lang.String r1 = "]\n[0.0|0.0|0.1]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.badlogic.gdx.math.Affine2 translate(float r4, float r5) {
            r3 = this;
            float r0 = r3.m02
            float r1 = r3.m00
            float r1 = r1 * r4
            float r2 = r3.m01
            float r2 = r2 * r5
            float r1 = r1 + r2
            float r0 = r0 + r1
            r3.m02 = r0
            float r0 = r3.m12
            float r1 = r3.m10
            float r1 = r1 * r4
            float r4 = r3.m11
            float r4 = r4 * r5
            float r1 = r1 + r4
            float r0 = r0 + r1
            r3.m12 = r0
            return r3
    }
}
