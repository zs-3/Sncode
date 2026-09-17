package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Matrix3 implements java.io.Serializable {
    private float[] tmp;
    public float[] val;

    public Matrix3() {
            r3 = this;
            r3.<init>()
            r0 = 9
            float[] r1 = new float[r0]
            r3.val = r1
            float[] r0 = new float[r0]
            r3.tmp = r0
            r1 = 8
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r3.idt()
            return
    }

    public com.badlogic.gdx.math.Matrix3 idt() {
            r4 = this;
            float[] r0 = r4.val
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r1 = 1
            r3 = 0
            r0[r1] = r3
            r1 = 2
            r0[r1] = r3
            r1 = 3
            r0[r1] = r3
            r1 = 4
            r0[r1] = r2
            r1 = 5
            r0[r1] = r3
            r1 = 6
            r0[r1] = r3
            r1 = 7
            r0[r1] = r3
            r1 = 8
            r0[r1] = r2
            return r4
    }

    public java.lang.String toString() {
            r5 = this;
            float[] r0 = r5.val
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            r2 = 0
            r2 = r0[r2]
            r1.append(r2)
            java.lang.String r2 = "|"
            r1.append(r2)
            r3 = 3
            r3 = r0[r3]
            r1.append(r3)
            r1.append(r2)
            r3 = 6
            r3 = r0[r3]
            r1.append(r3)
            java.lang.String r3 = "]\n["
            r1.append(r3)
            r4 = 1
            r4 = r0[r4]
            r1.append(r4)
            r1.append(r2)
            r4 = 4
            r4 = r0[r4]
            r1.append(r4)
            r1.append(r2)
            r4 = 7
            r4 = r0[r4]
            r1.append(r4)
            r1.append(r3)
            r3 = 2
            r3 = r0[r3]
            r1.append(r3)
            r1.append(r2)
            r3 = 5
            r3 = r0[r3]
            r1.append(r3)
            r1.append(r2)
            r2 = 8
            r0 = r0[r2]
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
