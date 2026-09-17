package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class Frustum {
    protected static final com.badlogic.gdx.math.Vector3[] clipSpacePlanePoints = null;
    protected static final float[] clipSpacePlanePointsArray = null;
    private static final com.badlogic.gdx.math.Vector3 tmpV = null;
    public final com.badlogic.gdx.math.Vector3[] planePoints;
    protected final float[] planePointsArray;
    public final com.badlogic.gdx.math.Plane[] planes;

    static {
            r0 = 8
            com.badlogic.gdx.math.Vector3[] r0 = new com.badlogic.gdx.math.Vector3[r0]
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.<init>(r2, r2, r2)
            r3 = 0
            r0[r3] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r4, r2, r2)
            r5 = 1
            r0[r5] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>(r4, r4, r2)
            r5 = 2
            r0[r5] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>(r2, r4, r2)
            r5 = 3
            r0[r5] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>(r2, r2, r4)
            r5 = 4
            r0[r5] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>(r4, r2, r4)
            r5 = 5
            r0[r5] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>(r4, r4, r4)
            r5 = 6
            r0[r5] = r1
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>(r2, r4, r4)
            r2 = 7
            r0[r2] = r1
            com.badlogic.gdx.math.Frustum.clipSpacePlanePoints = r0
            r1 = 24
            float[] r1 = new float[r1]
            com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray = r1
            int r1 = r0.length
            r2 = 0
        L52:
            if (r3 >= r1) goto L6e
            r4 = r0[r3]
            float[] r5 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray
            int r6 = r2 + 1
            float r7 = r4.x
            r5[r2] = r7
            int r2 = r6 + 1
            float r7 = r4.y
            r5[r6] = r7
            int r6 = r2 + 1
            float r4 = r4.z
            r5[r2] = r4
            int r3 = r3 + 1
            r2 = r6
            goto L52
        L6e:
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            com.badlogic.gdx.math.Frustum.tmpV = r0
            return
    }

    public Frustum() {
            r6 = this;
            r6.<init>()
            r0 = 6
            com.badlogic.gdx.math.Plane[] r1 = new com.badlogic.gdx.math.Plane[r0]
            r6.planes = r1
            r1 = 8
            com.badlogic.gdx.math.Vector3[] r1 = new com.badlogic.gdx.math.Vector3[r1]
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r4 = 1
            r1[r4] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r4 = 2
            r1[r4] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r4 = 3
            r1[r4] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r4 = 4
            r1[r4] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r4 = 5
            r1[r4] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r1[r0] = r2
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r4 = 7
            r1[r4] = r2
            r6.planePoints = r1
            r1 = 24
            float[] r1 = new float[r1]
            r6.planePointsArray = r1
        L53:
            if (r3 >= r0) goto L67
            com.badlogic.gdx.math.Plane[] r1 = r6.planes
            com.badlogic.gdx.math.Plane r2 = new com.badlogic.gdx.math.Plane
            com.badlogic.gdx.math.Vector3 r4 = new com.badlogic.gdx.math.Vector3
            r4.<init>()
            r5 = 0
            r2.<init>(r4, r5)
            r1[r3] = r2
            int r3 = r3 + 1
            goto L53
        L67:
            return
    }

    public void update(com.badlogic.gdx.math.Matrix4 r11) {
            r10 = this;
            float[] r0 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray
            float[] r1 = r10.planePointsArray
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            float[] r11 = r11.val
            float[] r0 = r10.planePointsArray
            r1 = 8
            r2 = 3
            com.badlogic.gdx.math.Matrix4.prj(r11, r0, r3, r1, r2)
            r11 = 0
            r0 = 0
        L15:
            if (r11 >= r1) goto L33
            com.badlogic.gdx.math.Vector3[] r4 = r10.planePoints
            r4 = r4[r11]
            float[] r5 = r10.planePointsArray
            int r6 = r0 + 1
            r0 = r5[r0]
            r4.x = r0
            int r0 = r6 + 1
            r6 = r5[r6]
            r4.y = r6
            int r6 = r0 + 1
            r0 = r5[r0]
            r4.z = r0
            int r11 = r11 + 1
            r0 = r6
            goto L15
        L33:
            com.badlogic.gdx.math.Plane[] r11 = r10.planes
            r11 = r11[r3]
            com.badlogic.gdx.math.Vector3[] r0 = r10.planePoints
            r1 = 1
            r4 = r0[r1]
            r5 = r0[r3]
            r6 = 2
            r0 = r0[r6]
            r11.set(r4, r5, r0)
            com.badlogic.gdx.math.Plane[] r11 = r10.planes
            r11 = r11[r1]
            com.badlogic.gdx.math.Vector3[] r0 = r10.planePoints
            r4 = 4
            r5 = r0[r4]
            r7 = 5
            r8 = r0[r7]
            r9 = 7
            r0 = r0[r9]
            r11.set(r5, r8, r0)
            com.badlogic.gdx.math.Plane[] r11 = r10.planes
            r11 = r11[r6]
            com.badlogic.gdx.math.Vector3[] r0 = r10.planePoints
            r5 = r0[r3]
            r8 = r0[r4]
            r0 = r0[r2]
            r11.set(r5, r8, r0)
            com.badlogic.gdx.math.Plane[] r11 = r10.planes
            r11 = r11[r2]
            com.badlogic.gdx.math.Vector3[] r0 = r10.planePoints
            r5 = r0[r7]
            r8 = r0[r1]
            r9 = 6
            r0 = r0[r9]
            r11.set(r5, r8, r0)
            com.badlogic.gdx.math.Plane[] r11 = r10.planes
            r11 = r11[r4]
            com.badlogic.gdx.math.Vector3[] r0 = r10.planePoints
            r5 = r0[r6]
            r2 = r0[r2]
            r0 = r0[r9]
            r11.set(r5, r2, r0)
            com.badlogic.gdx.math.Plane[] r11 = r10.planes
            r11 = r11[r7]
            com.badlogic.gdx.math.Vector3[] r0 = r10.planePoints
            r2 = r0[r4]
            r3 = r0[r3]
            r0 = r0[r1]
            r11.set(r2, r3, r0)
            return
    }
}
