package org.fortheloss.sticknodes.splashscreen2023;

/* loaded from: classes2.dex */
public class GravityObject extends com.badlogic.gdx.scenes.scene2d.ui.Image {
    private float mFriction;
    private float mGravity;
    private float mRemoveThresholdY;
    private float mSpeedX;
    private float mSpeedY;

    public GravityObject(com.badlogic.gdx.graphics.Texture r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mGravity = r1
            r0.mFriction = r1
            r0.mSpeedX = r1
            r0.mSpeedY = r1
            r1 = -1007026176(0xffffffffc3fa0000, float:-500.0)
            r0.mRemoveThresholdY = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r3) {
            r2 = this;
            super.act(r3)
            float r0 = r2.mSpeedY
            float r1 = r2.mGravity
            float r1 = r1 * r3
            float r0 = r0 + r1
            r2.mSpeedY = r0
            float r3 = r2.mSpeedX
            float r0 = r2.mFriction
            float r3 = r3 * r0
            r2.mSpeedX = r3
            float r3 = r2.getX()
            float r0 = r2.mSpeedX
            float r3 = r3 + r0
            float r0 = r2.getY()
            float r1 = r2.mSpeedY
            float r0 = r0 + r1
            r2.setPosition(r3, r0)
            float r3 = r2.getY()
            float r0 = r2.mRemoveThresholdY
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L32
            r2.remove()
        L32:
            return
    }

    public org.fortheloss.sticknodes.splashscreen2023.GravityObject setForces(float r1, float r2) {
            r0 = this;
            r0.mGravity = r1
            r0.mFriction = r2
            return r0
    }

    public org.fortheloss.sticknodes.splashscreen2023.GravityObject setRemoveThresholdY(float r1) {
            r0 = this;
            r0.mRemoveThresholdY = r1
            return r0
    }

    public org.fortheloss.sticknodes.splashscreen2023.GravityObject setSpeedX(float r1) {
            r0 = this;
            r0.mSpeedX = r1
            return r0
    }

    public org.fortheloss.sticknodes.splashscreen2023.GravityObject setSpeedY(float r1) {
            r0 = this;
            r0.mSpeedY = r1
            return r0
    }
}
