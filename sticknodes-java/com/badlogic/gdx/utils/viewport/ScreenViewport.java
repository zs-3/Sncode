package com.badlogic.gdx.utils.viewport;

/* loaded from: classes.dex */
public class ScreenViewport extends com.badlogic.gdx.utils.viewport.Viewport {
    private float unitsPerPixel;

    public ScreenViewport() {
            r1 = this;
            com.badlogic.gdx.graphics.OrthographicCamera r0 = new com.badlogic.gdx.graphics.OrthographicCamera
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public ScreenViewport(com.badlogic.gdx.graphics.Camera r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.unitsPerPixel = r0
            r1.setCamera(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.viewport.Viewport
    public void update(int r2, int r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.setScreenBounds(r0, r0, r2, r3)
            float r2 = (float) r2
            float r0 = r1.unitsPerPixel
            float r2 = r2 * r0
            float r3 = (float) r3
            float r3 = r3 * r0
            r1.setWorldSize(r2, r3)
            r1.apply(r4)
            return
    }
}
