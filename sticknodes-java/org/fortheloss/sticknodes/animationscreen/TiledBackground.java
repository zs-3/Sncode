package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class TiledBackground {
    public TiledBackground() {
            r0 = this;
            r0.<init>()
            return
    }

    public void renderOnto(org.fortheloss.framework.Assets r13, com.badlogic.gdx.scenes.scene2d.Stage r14, com.badlogic.gdx.graphics.glutils.FrameBuffer r15) {
            r12 = this;
            java.lang.String r0 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r2 = 1
            java.lang.Object r13 = r13.get(r0, r1, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r13 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r13
            java.lang.String r0 = "background"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r13.findRegion(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.getBatch()
            com.badlogic.gdx.graphics.g2d.SpriteBatch r0 = (com.badlogic.gdx.graphics.g2d.SpriteBatch) r0
            int r1 = r15.getWidth()
            int r2 = r15.getHeight()
            int r3 = r13.getRegionWidth()
            int r4 = r13.getRegionHeight()
            float r5 = (float) r1
            float r6 = (float) r3
            float r6 = r5 / r6
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r7 = (float) r2
            float r8 = (float) r4
            float r8 = r7 / r8
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            com.badlogic.gdx.graphics.OrthographicCamera r9 = new com.badlogic.gdx.graphics.OrthographicCamera
            r9.<init>(r5, r7)
            com.badlogic.gdx.math.Vector3 r10 = r9.position
            r11 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r11
            float r7 = r7 * r11
            r11 = 0
            r10.set(r5, r7, r11)
            r9.update()
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            r7 = 0
            r5.glViewport(r7, r7, r1, r2)
            com.badlogic.gdx.math.Matrix4 r1 = r9.combined
            r0.setProjectionMatrix(r1)
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            r15.bind()
            com.badlogic.gdx.graphics.GL20 r15 = com.badlogic.gdx.Gdx.gl
            r1 = 1065353216(0x3f800000, float:1.0)
            r15.glClearColor(r11, r11, r11, r1)
            com.badlogic.gdx.graphics.GL20 r15 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r15.glClear(r2)
            r0.disableBlending()
            r0.begin()
            r0.setColor(r1, r1, r1, r1)
            r15 = 0
        L78:
            if (r15 >= r8) goto L8c
            r1 = 0
        L7b:
            if (r1 >= r6) goto L89
            int r2 = r1 * r3
            float r2 = (float) r2
            int r5 = r15 * r4
            float r5 = (float) r5
            r0.draw(r13, r2, r5)
            int r1 = r1 + 1
            goto L7b
        L89:
            int r15 = r15 + 1
            goto L78
        L8c:
            r0.end()
            r0.enableBlending()
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.utils.viewport.Viewport r13 = r14.getViewport()
            com.badlogic.gdx.graphics.GL20 r15 = com.badlogic.gdx.Gdx.gl
            int r1 = r13.getScreenX()
            int r2 = r13.getScreenY()
            int r3 = r13.getScreenWidth()
            int r13 = r13.getScreenHeight()
            r15.glViewport(r1, r2, r3, r13)
            com.badlogic.gdx.graphics.Camera r13 = r14.getCamera()
            com.badlogic.gdx.math.Matrix4 r13 = r13.combined
            r0.setProjectionMatrix(r13)
            return
    }
}
