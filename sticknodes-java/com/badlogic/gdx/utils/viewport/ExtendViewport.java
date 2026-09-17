package com.badlogic.gdx.utils.viewport;

/* loaded from: classes.dex */
public class ExtendViewport extends com.badlogic.gdx.utils.viewport.Viewport {
    private float maxWorldHeight;
    private float maxWorldWidth;
    private float minWorldHeight;
    private float minWorldWidth;
    private com.badlogic.gdx.utils.Scaling scaling;

    public ExtendViewport(float r7, float r8) {
            r6 = this;
            com.badlogic.gdx.graphics.OrthographicCamera r5 = new com.badlogic.gdx.graphics.OrthographicCamera
            r5.<init>()
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ExtendViewport(float r2, float r3, float r4, float r5, com.badlogic.gdx.graphics.Camera r6) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Scaling r0 = com.badlogic.gdx.utils.Scaling.fit
            r1.scaling = r0
            r1.minWorldWidth = r2
            r1.minWorldHeight = r3
            r1.maxWorldWidth = r4
            r1.maxWorldHeight = r5
            r1.setCamera(r6)
            return
    }

    @Override // com.badlogic.gdx.utils.viewport.Viewport
    public void update(int r10, int r11, boolean r12) {
            r9 = this;
            float r0 = r9.minWorldWidth
            float r1 = r9.minWorldHeight
            com.badlogic.gdx.utils.Scaling r2 = r9.scaling
            float r3 = (float) r10
            float r4 = (float) r11
            com.badlogic.gdx.math.Vector2 r2 = r2.apply(r0, r1, r3, r4)
            float r3 = r2.x
            int r3 = java.lang.Math.round(r3)
            float r2 = r2.y
            int r2 = java.lang.Math.round(r2)
            r4 = 0
            if (r3 >= r10) goto L3a
            float r5 = (float) r2
            float r6 = r5 / r1
            float r5 = r1 / r5
            int r7 = r10 - r3
            float r7 = (float) r7
            float r7 = r7 * r5
            float r5 = r9.maxWorldWidth
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 <= 0) goto L32
            float r8 = r9.minWorldWidth
            float r5 = r5 - r8
            float r7 = java.lang.Math.min(r7, r5)
        L32:
            float r0 = r0 + r7
            float r7 = r7 * r6
            int r5 = java.lang.Math.round(r7)
            int r3 = r3 + r5
        L3a:
            if (r2 >= r11) goto L5b
            float r5 = (float) r3
            float r6 = r5 / r0
            float r5 = r0 / r5
            int r7 = r11 - r2
            float r7 = (float) r7
            float r7 = r7 * r5
            float r5 = r9.maxWorldHeight
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L53
            float r4 = r9.minWorldHeight
            float r5 = r5 - r4
            float r7 = java.lang.Math.min(r7, r5)
        L53:
            float r1 = r1 + r7
            float r7 = r7 * r6
            int r4 = java.lang.Math.round(r7)
            int r2 = r2 + r4
        L5b:
            r9.setWorldSize(r0, r1)
            int r10 = r10 - r3
            int r10 = r10 / 2
            int r11 = r11 - r2
            int r11 = r11 / 2
            r9.setScreenBounds(r10, r11, r3, r2)
            r9.apply(r12)
            return
    }
}
