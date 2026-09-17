package org.fortheloss.sticknodes.minigamescreen.obstacles;

/* loaded from: classes2.dex */
public class ObstacleTBB extends org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle {
    public ObstacleTBB(org.fortheloss.framework.Assets r1, org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 2
            r0._avoidWith = r1
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r1) {
            r0 = this;
            super.act(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r7, float r8) {
            r6 = this;
            super.draw(r7, r8)
            int r8 = r6._state
            r0 = 2
            if (r8 != r0) goto L37
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r6._trTntAnimation
            float r0 = r6._animationSeconds
            java.lang.Object r8 = r8.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
            com.badlogic.gdx.graphics.Color r0 = r6.getColor()
            float r1 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            float r0 = r0.a
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6._buildingFade
            float r4 = r4 - r5
            float r0 = r0 * r4
            r7.setColor(r1, r2, r3, r0)
            boolean r0 = r6._exploded
            if (r0 != 0) goto L37
            float r0 = r6.getX()
            float r1 = r6.getY()
            r7.draw(r8, r0, r1)
        L37:
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle
    protected void onCollisionWithRalph(org.fortheloss.sticknodes.minigamescreen.Ralph r3) {
            r2 = this;
            float r0 = r2.getX()
            r1 = 0
            r3.onDeath(r1, r0)
            r3 = 1
            r2._exploded = r3
            return
    }
}
