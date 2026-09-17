package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public abstract class Camera {
    public final com.badlogic.gdx.math.Matrix4 combined;
    public final com.badlogic.gdx.math.Vector3 direction;
    public float far;
    public final com.badlogic.gdx.math.Frustum frustum;
    public final com.badlogic.gdx.math.Matrix4 invProjectionView;
    public float near;
    public final com.badlogic.gdx.math.Vector3 position;
    public final com.badlogic.gdx.math.Matrix4 projection;
    private final com.badlogic.gdx.math.collision.Ray ray;
    private final com.badlogic.gdx.math.Vector3 tmpVec;
    public final com.badlogic.gdx.math.Vector3 up;
    public final com.badlogic.gdx.math.Matrix4 view;
    public float viewportHeight;
    public float viewportWidth;

    public Camera() {
            r3 = this;
            r3.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r3.position = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.<init>(r1, r1, r2)
            r3.direction = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r1)
            r3.up = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r3.projection = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r3.view = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r3.combined = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r3.invProjectionView = r0
            r3.near = r2
            r0 = 1120403456(0x42c80000, float:100.0)
            r3.far = r0
            r3.viewportWidth = r1
            r3.viewportHeight = r1
            com.badlogic.gdx.math.Frustum r0 = new com.badlogic.gdx.math.Frustum
            r0.<init>()
            r3.frustum = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r3.tmpVec = r0
            com.badlogic.gdx.math.collision.Ray r0 = new com.badlogic.gdx.math.collision.Ray
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>()
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r0.<init>(r1, r2)
            r3.ray = r0
            return
    }

    public com.badlogic.gdx.math.Vector3 project(com.badlogic.gdx.math.Vector3 r3, float r4, float r5, float r6, float r7) {
            r2 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r2.combined
            r3.prj(r0)
            float r0 = r3.x
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            float r6 = r6 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            float r6 = r6 + r4
            r3.x = r6
            float r4 = r3.y
            float r4 = r4 + r1
            float r7 = r7 * r4
            float r7 = r7 / r0
            float r7 = r7 + r5
            r3.y = r7
            float r4 = r3.z
            float r4 = r4 + r1
            float r4 = r4 / r0
            r3.z = r4
            return r3
    }

    public com.badlogic.gdx.math.Vector3 unproject(com.badlogic.gdx.math.Vector3 r3, float r4, float r5, float r6, float r7) {
            r2 = this;
            float r0 = r3.x
            float r0 = r0 - r4
            com.badlogic.gdx.Graphics r4 = com.badlogic.gdx.Gdx.graphics
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r1 = r3.y
            float r4 = r4 - r1
            float r4 = r4 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r0 = r0 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            r3.x = r0
            float r4 = r4 * r5
            float r4 = r4 / r7
            float r4 = r4 - r6
            r3.y = r4
            float r4 = r3.z
            float r4 = r4 * r5
            float r4 = r4 - r6
            r3.z = r4
            com.badlogic.gdx.math.Matrix4 r4 = r2.invProjectionView
            r3.prj(r4)
            return r3
    }

    public abstract void update();
}
