package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class ScrollingParticle extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Pool.Poolable {
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animation;
    private float _animationSeconds;
    private float _speedX;
    private float _speedY;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _tr;

    public ScrollingParticle() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._animationSeconds = r0
            r1._speedX = r0
            r1._speedY = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r4) {
            r3 = this;
            super.act(r4)
            float r0 = r3._animationSeconds
            float r0 = r0 + r4
            r3._animationSeconds = r0
            float r0 = r3.getX()
            float r1 = r3._speedX
            float r1 = r1 * r4
            float r0 = r0 + r1
            float r1 = r3.getY()
            float r2 = r3._speedY
            float r2 = r2 * r4
            float r1 = r1 + r2
            r3.setPosition(r0, r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            super.draw(r12, r13)
            com.badlogic.gdx.graphics.Color r13 = r11.getColor()
            r12.setColor(r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._tr
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = r11._animation
            if (r0 == 0) goto L18
            float r13 = r11._animationSeconds
            java.lang.Object r13 = r0.getKeyFrame(r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r13
        L18:
            r1 = r13
            float r2 = r11.getX()
            float r3 = r11.getY()
            float r4 = r11.getOriginX()
            float r5 = r11.getOriginY()
            int r13 = r1.getRegionWidth()
            float r6 = (float) r13
            int r13 = r1.getRegionHeight()
            float r7 = (float) r13
            float r8 = r11.getScaleX()
            float r9 = r11.getScaleY()
            float r10 = r11.getRotation()
            r0 = r12
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1, float r2, float r3) {
            r0 = this;
            r0._animation = r1
            r0._speedX = r2
            r0._speedY = r3
            r2 = 0
            java.lang.Object r1 = r1.getKeyFrame(r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            int r2 = r1.getRegionWidth()
            float r2 = (float) r2
            int r1 = r1.getRegionHeight()
            float r1 = (float) r1
            r0.setSize(r2, r1)
            float r1 = r0.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r3 = r0.getHeight()
            float r3 = r3 * r2
            r0.setOrigin(r1, r3)
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureRegion r1, float r2, float r3) {
            r0 = this;
            r0._tr = r1
            r0._speedX = r2
            r0._speedY = r3
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._tr
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            r0.setSize(r1, r2)
            float r1 = r0.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r3 = r0.getHeight()
            float r3 = r3 * r2
            r0.setOrigin(r1, r3)
            return
    }

    public void randomizeFrame() {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = r2._animation
            if (r0 == 0) goto L13
            double r0 = java.lang.Math.random()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r2._animation
            float r1 = r1.getAnimationDuration()
            float r0 = r0 * r1
            r2._animationSeconds = r0
        L13:
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r2.remove()
            r2.clear()
            r0 = 0
            r2._animationSeconds = r0
            r2._speedX = r0
            r2._speedY = r0
            r2.setRotation(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r1)
            r2.setColor(r1, r1, r1, r1)
            r2.setPosition(r0, r0)
            r0 = 0
            r2._animation = r0
            r2._tr = r0
            return
    }
}
