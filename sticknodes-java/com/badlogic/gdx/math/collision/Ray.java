package com.badlogic.gdx.math.collision;

/* loaded from: classes.dex */
public class Ray implements java.io.Serializable {
    static com.badlogic.gdx.math.Vector3 tmp;
    public final com.badlogic.gdx.math.Vector3 direction;
    public final com.badlogic.gdx.math.Vector3 origin;

    static {
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            com.badlogic.gdx.math.collision.Ray.tmp = r0
            return
    }

    public Ray() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.origin = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.direction = r0
            return
    }

    public Ray(com.badlogic.gdx.math.Vector3 r3, com.badlogic.gdx.math.Vector3 r4) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r2.origin = r0
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>()
            r2.direction = r1
            r0.set(r3)
            com.badlogic.gdx.math.Vector3 r3 = r1.set(r4)
            r3.nor()
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2b
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r4.getClass()
            if (r2 == r3) goto L12
            goto L2b
        L12:
            com.badlogic.gdx.math.collision.Ray r5 = (com.badlogic.gdx.math.collision.Ray) r5
            com.badlogic.gdx.math.Vector3 r2 = r4.direction
            com.badlogic.gdx.math.Vector3 r3 = r5.direction
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            com.badlogic.gdx.math.Vector3 r2 = r4.origin
            com.badlogic.gdx.math.Vector3 r5 = r5.origin
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
        L2b:
            return r1
    }

    public int hashCode() {
            r2 = this;
            com.badlogic.gdx.math.Vector3 r0 = r2.direction
            int r0 = r0.hashCode()
            r1 = 73
            int r0 = r0 + r1
            int r0 = r0 * 73
            com.badlogic.gdx.math.Vector3 r1 = r2.origin
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ray ["
            r0.append(r1)
            com.badlogic.gdx.math.Vector3 r1 = r2.origin
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            com.badlogic.gdx.math.Vector3 r1 = r2.direction
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
