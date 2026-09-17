package com.badlogic.gdx.utils.viewport;

/* loaded from: classes.dex */
public abstract class Viewport {
    private com.badlogic.gdx.graphics.Camera camera;
    private int screenHeight;
    private int screenWidth;
    private int screenX;
    private int screenY;
    private final com.badlogic.gdx.math.Vector3 tmp;
    private float worldHeight;
    private float worldWidth;

    public Viewport() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r1.tmp = r0
            return
    }

    public void apply(boolean r5) {
            r4 = this;
            int r0 = r4.screenX
            int r1 = r4.screenY
            int r2 = r4.screenWidth
            int r3 = r4.screenHeight
            com.badlogic.gdx.graphics.glutils.HdpiUtils.glViewport(r0, r1, r2, r3)
            com.badlogic.gdx.graphics.Camera r0 = r4.camera
            float r1 = r4.worldWidth
            r0.viewportWidth = r1
            float r2 = r4.worldHeight
            r0.viewportHeight = r2
            if (r5 == 0) goto L21
            com.badlogic.gdx.math.Vector3 r5 = r0.position
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 / r0
            r0 = 0
            r5.set(r1, r2, r0)
        L21:
            com.badlogic.gdx.graphics.Camera r5 = r4.camera
            r5.update()
            return
    }

    public void calculateScissors(com.badlogic.gdx.math.Matrix4 r9, com.badlogic.gdx.math.Rectangle r10, com.badlogic.gdx.math.Rectangle r11) {
            r8 = this;
            com.badlogic.gdx.graphics.Camera r0 = r8.camera
            int r1 = r8.screenX
            float r1 = (float) r1
            int r2 = r8.screenY
            float r2 = (float) r2
            int r3 = r8.screenWidth
            float r3 = (float) r3
            int r4 = r8.screenHeight
            float r4 = (float) r4
            r5 = r9
            r6 = r10
            r7 = r11
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public com.badlogic.gdx.graphics.Camera getCamera() {
            r1 = this;
            com.badlogic.gdx.graphics.Camera r0 = r1.camera
            return r0
    }

    public int getScreenHeight() {
            r1 = this;
            int r0 = r1.screenHeight
            return r0
    }

    public int getScreenWidth() {
            r1 = this;
            int r0 = r1.screenWidth
            return r0
    }

    public int getScreenX() {
            r1 = this;
            int r0 = r1.screenX
            return r0
    }

    public int getScreenY() {
            r1 = this;
            int r0 = r1.screenY
            return r0
    }

    public float getWorldHeight() {
            r1 = this;
            float r0 = r1.worldHeight
            return r0
    }

    public float getWorldWidth() {
            r1 = this;
            float r0 = r1.worldWidth
            return r0
    }

    public void setCamera(com.badlogic.gdx.graphics.Camera r1) {
            r0 = this;
            r0.camera = r1
            return
    }

    public void setScreenBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.screenX = r1
            r0.screenY = r2
            r0.screenWidth = r3
            r0.screenHeight = r4
            return
    }

    public void setScreenPosition(int r1, int r2) {
            r0 = this;
            r0.screenX = r1
            r0.screenY = r2
            return
    }

    public void setWorldSize(float r1, float r2) {
            r0 = this;
            r0.worldWidth = r1
            r0.worldHeight = r2
            return
    }

    public com.badlogic.gdx.math.Vector2 unproject(com.badlogic.gdx.math.Vector2 r11) {
            r10 = this;
            com.badlogic.gdx.math.Vector3 r0 = r10.tmp
            float r1 = r11.x
            float r2 = r11.y
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.set(r1, r2, r3)
            com.badlogic.gdx.graphics.Camera r4 = r10.camera
            com.badlogic.gdx.math.Vector3 r5 = r10.tmp
            int r0 = r10.screenX
            float r6 = (float) r0
            int r0 = r10.screenY
            float r7 = (float) r0
            int r0 = r10.screenWidth
            float r8 = (float) r0
            int r0 = r10.screenHeight
            float r9 = (float) r0
            r4.unproject(r5, r6, r7, r8, r9)
            com.badlogic.gdx.math.Vector3 r0 = r10.tmp
            float r1 = r0.x
            float r0 = r0.y
            r11.set(r1, r0)
            return r11
    }

    public final void update(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.update(r2, r3, r0)
            return
    }

    public abstract void update(int r1, int r2, boolean r3);
}
