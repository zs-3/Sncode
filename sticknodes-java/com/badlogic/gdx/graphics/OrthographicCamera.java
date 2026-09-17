package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class OrthographicCamera extends com.badlogic.gdx.graphics.Camera {
    private final com.badlogic.gdx.math.Vector3 tmp;
    public float zoom;

    public OrthographicCamera() {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zoom = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.tmp = r0
            r0 = 0
            r1.near = r0
            return
    }

    public OrthographicCamera(float r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zoom = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.tmp = r0
            r1.viewportWidth = r2
            r1.viewportHeight = r3
            r2 = 0
            r1.near = r2
            r1.update()
            return
    }

    @Override // com.badlogic.gdx.graphics.Camera
    public void update() {
            r1 = this;
            r0 = 1
            r1.update(r0)
            return
    }

    public void update(boolean r9) {
            r8 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r8.projection
            float r1 = r8.zoom
            float r2 = r8.viewportWidth
            float r3 = -r2
            float r3 = r3 * r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 / r4
            float r2 = r2 * r1
            float r5 = r8.viewportHeight
            float r6 = r5 / r4
            float r6 = -r6
            float r6 = r6 * r1
            float r1 = r1 * r5
            float r4 = r1 / r4
            float r5 = r8.near
            float r7 = r8.far
            r1 = r3
            r3 = r6
            r6 = r7
            r0.setToOrtho(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Matrix4 r0 = r8.view
            com.badlogic.gdx.math.Vector3 r1 = r8.position
            com.badlogic.gdx.math.Vector3 r2 = r8.tmp
            com.badlogic.gdx.math.Vector3 r2 = r2.set(r1)
            com.badlogic.gdx.math.Vector3 r3 = r8.direction
            com.badlogic.gdx.math.Vector3 r2 = r2.add(r3)
            com.badlogic.gdx.math.Vector3 r3 = r8.up
            r0.setToLookAt(r1, r2, r3)
            com.badlogic.gdx.math.Matrix4 r0 = r8.combined
            com.badlogic.gdx.math.Matrix4 r1 = r8.projection
            r0.set(r1)
            com.badlogic.gdx.math.Matrix4 r0 = r8.combined
            float[] r0 = r0.val
            com.badlogic.gdx.math.Matrix4 r1 = r8.view
            float[] r1 = r1.val
            com.badlogic.gdx.math.Matrix4.mul(r0, r1)
            if (r9 == 0) goto L62
            com.badlogic.gdx.math.Matrix4 r9 = r8.invProjectionView
            com.badlogic.gdx.math.Matrix4 r0 = r8.combined
            r9.set(r0)
            com.badlogic.gdx.math.Matrix4 r9 = r8.invProjectionView
            float[] r9 = r9.val
            com.badlogic.gdx.math.Matrix4.inv(r9)
            com.badlogic.gdx.math.Frustum r9 = r8.frustum
            com.badlogic.gdx.math.Matrix4 r0 = r8.invProjectionView
            r9.update(r0)
        L62:
            return
    }
}
