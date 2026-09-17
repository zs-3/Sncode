package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class AnimationWidget extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    protected com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.Sprite> _animationRefS;
    protected com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.Texture> _animationRefT;
    protected com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animationRefTR;
    protected float _animationTime;

    public AnimationWidget(com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._animationTime = r0
            r1._animationRefTR = r2
            return
    }

    public AnimationWidget(com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.Sprite> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0._animationTime = r2
            r0._animationRefS = r1
            return
    }

    public AnimationWidget(com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.Texture> r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0._animationTime = r2
            r0._animationRefT = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r2) {
            r1 = this;
            super.act(r2)
            float r0 = r1._animationTime
            float r0 = r0 + r2
            r1._animationTime = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationRefTR = r0
            r1._animationRefS = r0
            r1._animationRefT = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r19, float r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            super.draw(r19, r20)
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r3 = r2.r
            float r4 = r2.g
            float r5 = r2.b
            float r2 = r2.a
            float r2 = r2 * r20
            r1.setColor(r3, r4, r5, r2)
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r2 = r0._animationRefTR
            if (r2 == 0) goto L47
            float r3 = r0._animationTime
            int r2 = r2.getKeyFrameIndex(r3)
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r3 = r0._animationRefTR
            java.lang.Object[] r3 = r3.getKeyFrames()
            com.badlogic.gdx.graphics.g2d.TextureRegion[] r3 = (com.badlogic.gdx.graphics.g2d.TextureRegion[]) r3
            r2 = r3[r2]
            float r3 = r18.getX()
            float r4 = r18.getY()
            float r5 = r18.getWidth()
            float r6 = r18.getHeight()
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6)
            goto La6
        L47:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.Sprite> r2 = r0._animationRefS
            if (r2 == 0) goto L62
            float r3 = r0._animationTime
            java.lang.Object r2 = r2.getKeyFrame(r3)
            com.badlogic.gdx.graphics.g2d.Sprite r2 = (com.badlogic.gdx.graphics.g2d.Sprite) r2
            float r3 = r18.getX()
            float r4 = r18.getY()
            r2.setPosition(r3, r4)
            r2.draw(r1)
            goto La6
        L62:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.Texture> r2 = r0._animationRefT
            float r3 = r0._animationTime
            java.lang.Object r2 = r2.getKeyFrame(r3)
            com.badlogic.gdx.graphics.Texture r2 = (com.badlogic.gdx.graphics.Texture) r2
            if (r2 != 0) goto L6f
            return
        L6f:
            int r14 = r2.getWidth()
            int r15 = r2.getHeight()
            float r3 = r18.getX()
            float r4 = r18.getY()
            float r5 = r18.getOriginX()
            float r6 = r18.getOriginY()
            float r7 = r18.getWidth()
            float r8 = r18.getHeight()
            float r9 = r18.getScaleX()
            float r10 = r18.getScaleY()
            float r11 = r18.getRotation()
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        La6:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            float r0 = r1.getHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            float r0 = r1.getWidth()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void layout() {
            r3 = this;
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = r3._animationRefTR
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.getKeyFrame(r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r0
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r2 = r3._animationRefTR
            java.lang.Object r1 = r2.getKeyFrame(r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            int r1 = r1.getRegionHeight()
        L1c:
            float r1 = (float) r1
            goto L53
        L1e:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.Sprite> r0 = r3._animationRefS
            if (r0 == 0) goto L39
            java.lang.Object r0 = r0.getKeyFrame(r1)
            com.badlogic.gdx.graphics.g2d.Sprite r0 = (com.badlogic.gdx.graphics.g2d.Sprite) r0
            float r0 = r0.getWidth()
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.Sprite> r2 = r3._animationRefS
            java.lang.Object r1 = r2.getKeyFrame(r1)
            com.badlogic.gdx.graphics.g2d.Sprite r1 = (com.badlogic.gdx.graphics.g2d.Sprite) r1
            float r1 = r1.getHeight()
            goto L53
        L39:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.Texture> r0 = r3._animationRefT
            java.lang.Object r0 = r0.getKeyFrame(r1)
            com.badlogic.gdx.graphics.Texture r0 = (com.badlogic.gdx.graphics.Texture) r0
            int r0 = r0.getWidth()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.Texture> r2 = r3._animationRefT
            java.lang.Object r1 = r2.getKeyFrame(r1)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            int r1 = r1.getHeight()
            goto L1c
        L53:
            r3.setSize(r0, r1)
            return
    }
}
