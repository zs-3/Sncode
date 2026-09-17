package com.badlogic.gdx.utils.viewport;

/* loaded from: classes.dex */
public class ScalingViewport extends com.badlogic.gdx.utils.viewport.Viewport {
    private com.badlogic.gdx.utils.Scaling scaling;

    public ScalingViewport(com.badlogic.gdx.utils.Scaling r2, float r3, float r4) {
            r1 = this;
            com.badlogic.gdx.graphics.OrthographicCamera r0 = new com.badlogic.gdx.graphics.OrthographicCamera
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ScalingViewport(com.badlogic.gdx.utils.Scaling r1, float r2, float r3, com.badlogic.gdx.graphics.Camera r4) {
            r0 = this;
            r0.<init>()
            r0.scaling = r1
            r0.setWorldSize(r2, r3)
            r0.setCamera(r4)
            return
    }

    @Override // com.badlogic.gdx.utils.viewport.Viewport
    public void update(int r6, int r7, boolean r8) {
            r5 = this;
            com.badlogic.gdx.utils.Scaling r0 = r5.scaling
            float r1 = r5.getWorldWidth()
            float r2 = r5.getWorldHeight()
            float r3 = (float) r6
            float r4 = (float) r7
            com.badlogic.gdx.math.Vector2 r0 = r0.apply(r1, r2, r3, r4)
            float r1 = r0.x
            int r1 = java.lang.Math.round(r1)
            float r0 = r0.y
            int r0 = java.lang.Math.round(r0)
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r7 = r7 - r0
            int r7 = r7 / 2
            r5.setScreenBounds(r6, r7, r1, r0)
            r5.apply(r8)
            return
    }
}
