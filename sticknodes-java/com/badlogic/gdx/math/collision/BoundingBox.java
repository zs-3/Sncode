package com.badlogic.gdx.math.collision;

/* loaded from: classes.dex */
public class BoundingBox implements java.io.Serializable {
    private static final com.badlogic.gdx.math.Vector3 tmpVector = null;
    private final com.badlogic.gdx.math.Vector3 cnt;
    private final com.badlogic.gdx.math.Vector3 dim;
    public final com.badlogic.gdx.math.Vector3 max;
    public final com.badlogic.gdx.math.Vector3 min;

    static {
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            com.badlogic.gdx.math.collision.BoundingBox.tmpVector = r0
            return
    }

    public BoundingBox() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.min = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.max = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.cnt = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.dim = r0
            r1.clr()
            return
    }

    static final float min(float r1, float r2) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5
            r1 = r2
        L5:
            return r1
    }

    public com.badlogic.gdx.math.collision.BoundingBox clr() {
            r3 = this;
            com.badlogic.gdx.math.Vector3 r0 = r3.min
            r1 = 0
            com.badlogic.gdx.math.Vector3 r0 = r0.set(r1, r1, r1)
            com.badlogic.gdx.math.Vector3 r2 = r3.max
            com.badlogic.gdx.math.Vector3 r1 = r2.set(r1, r1, r1)
            com.badlogic.gdx.math.collision.BoundingBox r0 = r3.set(r0, r1)
            return r0
    }

    public com.badlogic.gdx.math.collision.BoundingBox ext(com.badlogic.gdx.math.Vector3 r6) {
            r5 = this;
            com.badlogic.gdx.math.Vector3 r0 = r5.min
            float r1 = r0.x
            float r2 = r6.x
            float r1 = min(r1, r2)
            com.badlogic.gdx.math.Vector3 r2 = r5.min
            float r2 = r2.y
            float r3 = r6.y
            float r2 = min(r2, r3)
            com.badlogic.gdx.math.Vector3 r3 = r5.min
            float r3 = r3.z
            float r4 = r6.z
            float r3 = min(r3, r4)
            com.badlogic.gdx.math.Vector3 r0 = r0.set(r1, r2, r3)
            com.badlogic.gdx.math.Vector3 r1 = r5.max
            float r2 = r1.x
            float r3 = r6.x
            float r2 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.math.Vector3 r3 = r5.max
            float r3 = r3.y
            float r4 = r6.y
            float r3 = java.lang.Math.max(r3, r4)
            com.badlogic.gdx.math.Vector3 r4 = r5.max
            float r4 = r4.z
            float r6 = r6.z
            float r6 = java.lang.Math.max(r4, r6)
            com.badlogic.gdx.math.Vector3 r6 = r1.set(r2, r3, r6)
            com.badlogic.gdx.math.collision.BoundingBox r6 = r5.set(r0, r6)
            return r6
    }

    public com.badlogic.gdx.math.Vector3 getCenter(com.badlogic.gdx.math.Vector3 r2) {
            r1 = this;
            com.badlogic.gdx.math.Vector3 r0 = r1.cnt
            com.badlogic.gdx.math.Vector3 r2 = r2.set(r0)
            return r2
    }

    public com.badlogic.gdx.math.Vector3 getDimensions(com.badlogic.gdx.math.Vector3 r2) {
            r1 = this;
            com.badlogic.gdx.math.Vector3 r0 = r1.dim
            com.badlogic.gdx.math.Vector3 r2 = r2.set(r0)
            return r2
    }

    public com.badlogic.gdx.math.collision.BoundingBox inf() {
            r2 = this;
            com.badlogic.gdx.math.Vector3 r0 = r2.min
            r1 = 2139095040(0x7f800000, float:Infinity)
            r0.set(r1, r1, r1)
            com.badlogic.gdx.math.Vector3 r0 = r2.max
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            r0.set(r1, r1, r1)
            com.badlogic.gdx.math.Vector3 r0 = r2.cnt
            r1 = 0
            r0.set(r1, r1, r1)
            com.badlogic.gdx.math.Vector3 r0 = r2.dim
            r0.set(r1, r1, r1)
            return r2
    }

    public com.badlogic.gdx.math.collision.BoundingBox set(com.badlogic.gdx.math.Vector3 r7, com.badlogic.gdx.math.Vector3 r8) {
            r6 = this;
            com.badlogic.gdx.math.Vector3 r0 = r6.min
            float r1 = r7.x
            float r2 = r8.x
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto Lb
            goto Lc
        Lb:
            r1 = r2
        Lc:
            float r2 = r7.y
            float r3 = r8.y
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L15
            goto L16
        L15:
            r2 = r3
        L16:
            float r3 = r7.z
            float r4 = r8.z
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            r0.set(r1, r2, r3)
            com.badlogic.gdx.math.Vector3 r0 = r6.max
            float r1 = r7.x
            float r2 = r8.x
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            float r2 = r7.y
            float r3 = r8.y
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L38
            goto L39
        L38:
            r2 = r3
        L39:
            float r7 = r7.z
            float r8 = r8.z
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L42
            goto L43
        L42:
            r7 = r8
        L43:
            r0.set(r1, r2, r7)
            r6.update()
            return r6
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            com.badlogic.gdx.math.Vector3 r1 = r2.min
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            com.badlogic.gdx.math.Vector3 r1 = r2.max
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void update() {
            r2 = this;
            com.badlogic.gdx.math.Vector3 r0 = r2.cnt
            com.badlogic.gdx.math.Vector3 r1 = r2.min
            com.badlogic.gdx.math.Vector3 r0 = r0.set(r1)
            com.badlogic.gdx.math.Vector3 r1 = r2.max
            com.badlogic.gdx.math.Vector3 r0 = r0.add(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.scl(r1)
            com.badlogic.gdx.math.Vector3 r0 = r2.dim
            com.badlogic.gdx.math.Vector3 r1 = r2.max
            com.badlogic.gdx.math.Vector3 r0 = r0.set(r1)
            com.badlogic.gdx.math.Vector3 r1 = r2.min
            r0.sub(r1)
            return
    }
}
