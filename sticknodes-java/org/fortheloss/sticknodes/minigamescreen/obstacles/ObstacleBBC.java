package org.fortheloss.sticknodes.minigamescreen.obstacles;

/* loaded from: classes2.dex */
public class ObstacleBBC extends org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle {
    public ObstacleBBC(org.fortheloss.framework.Assets r1, org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 13
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
            if (r8 != r0) goto L31
            com.badlogic.gdx.graphics.Color r8 = r6.getColor()
            float r1 = r8.r
            float r2 = r8.g
            float r3 = r8.b
            float r8 = r8.a
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6._buildingFade
            float r4 = r4 - r5
            float r8 = r8 * r4
            r7.setColor(r1, r2, r3, r8)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r6._trCobbleStoneTR
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r3 = r3 * 2
            float r0 = (float) r3
            float r2 = r2 + r0
            r7.draw(r8, r1, r2)
        L31:
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle
    protected void onCollisionWithRalph(org.fortheloss.sticknodes.minigamescreen.Ralph r7) {
            r6 = this;
            float r2 = r6.getX()
            r1 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r7
            r0.onDeath(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle
    public boolean ralphDeathOnContact(org.fortheloss.sticknodes.minigamescreen.Ralph r4) {
            r3 = this;
            boolean r0 = r3._punched
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r4.getObstacleAvoidState()
            int r2 = r3._avoidWith
            r0 = r0 & r2
            if (r0 == 0) goto L10
            return r1
        L10:
            r3.onCollisionWithRalph(r4)
            r4 = 1
            return r4
    }
}
