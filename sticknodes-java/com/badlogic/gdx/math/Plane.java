package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Plane implements java.io.Serializable {
    public float d;
    public final com.badlogic.gdx.math.Vector3 normal;

    public Plane(com.badlogic.gdx.math.Vector3 r3, float r4) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r2.normal = r0
            r1 = 0
            r2.d = r1
            com.badlogic.gdx.math.Vector3 r3 = r0.set(r3)
            r3.nor()
            r2.d = r4
            return
    }

    public void set(com.badlogic.gdx.math.Vector3 r5, com.badlogic.gdx.math.Vector3 r6, com.badlogic.gdx.math.Vector3 r7) {
            r4 = this;
            com.badlogic.gdx.math.Vector3 r0 = r4.normal
            com.badlogic.gdx.math.Vector3 r0 = r0.set(r5)
            com.badlogic.gdx.math.Vector3 r0 = r0.sub(r6)
            float r1 = r6.x
            float r2 = r7.x
            float r1 = r1 - r2
            float r2 = r6.y
            float r3 = r7.y
            float r2 = r2 - r3
            float r6 = r6.z
            float r7 = r7.z
            float r6 = r6 - r7
            com.badlogic.gdx.math.Vector3 r6 = r0.crs(r1, r2, r6)
            r6.nor()
            com.badlogic.gdx.math.Vector3 r6 = r4.normal
            float r5 = r5.dot(r6)
            float r5 = -r5
            r4.d = r5
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.badlogic.gdx.math.Vector3 r1 = r2.normal
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
