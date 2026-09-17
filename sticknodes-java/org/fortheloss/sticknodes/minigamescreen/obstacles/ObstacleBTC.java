package org.fortheloss.sticknodes.minigamescreen.obstacles;

/* loaded from: classes2.dex */
public class ObstacleBTC extends org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle {
    public ObstacleBTC(org.fortheloss.framework.Assets r1, org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 4
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
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r8, float r9) {
            r7 = this;
            super.draw(r8, r9)
            int r9 = r7._state
            r0 = 2
            if (r9 != r0) goto L4e
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r9 = r7._trTntAnimation
            float r1 = r7._animationSeconds
            java.lang.Object r9 = r9.getKeyFrame(r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r9 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r9
            com.badlogic.gdx.graphics.Color r1 = r7.getColor()
            float r2 = r1.r
            float r3 = r1.g
            float r4 = r1.b
            float r1 = r1.a
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = r7._buildingFade
            float r5 = r5 - r6
            float r1 = r1 * r5
            r8.setColor(r2, r3, r4, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r7._trCobbleStoneTR
            float r2 = r7.getX()
            float r3 = r7.getY()
            int r4 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r4 = r4 * 2
            float r0 = (float) r4
            float r3 = r3 + r0
            r8.draw(r1, r2, r3)
            boolean r0 = r7._exploded
            if (r0 != 0) goto L4e
            float r0 = r7.getX()
            float r1 = r7.getY()
            int r2 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r2 = (float) r2
            float r1 = r1 + r2
            r8.draw(r9, r0, r1)
        L4e:
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
