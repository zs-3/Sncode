package org.fortheloss.sticknodes.minigamescreen.obstacles;

/* loaded from: classes2.dex */
public class ObstacleBCB extends org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle {
    public ObstacleBCB(org.fortheloss.framework.Assets r1, org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 14
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
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r13, float r14) {
            r12 = this;
            super.draw(r13, r14)
            int r1 = r12._state
            r2 = 2
            if (r1 != r2) goto L77
            com.badlogic.gdx.graphics.Color r1 = r12.getColor()
            boolean r2 = r12._punched
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L56
            float r2 = r1.r
            float r4 = r1.g
            float r5 = r1.b
            float r1 = r1.a
            float r6 = r12._buildingFade
            float r3 = r3 - r6
            float r1 = r1 * r3
            float r3 = r12._punchedBlockAlpha
            float r1 = r1 * r3
            r13.setColor(r2, r4, r5, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r12._trCobbleStoneTR
            float r2 = r12.getX()
            float r3 = r12._midPunchedBlockX
            float r2 = r2 + r3
            float r3 = r12.getY()
            float r4 = r12._midPunchedBlockY
            float r3 = r3 + r4
            int r4 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r5 = (float) r4
            float r3 = r3 + r5
            float r5 = (float) r4
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            float r7 = (float) r4
            float r6 = r6 * r7
            float r7 = (float) r4
            float r8 = (float) r4
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r12._midPunchedBlockRot
            r0 = r13
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L77
        L56:
            float r2 = r1.r
            float r4 = r1.g
            float r5 = r1.b
            float r1 = r1.a
            float r6 = r12._buildingFade
            float r3 = r3 - r6
            float r1 = r1 * r3
            r13.setColor(r2, r4, r5, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r12._trCobbleStoneTR
            float r2 = r12.getX()
            float r3 = r12.getY()
            int r4 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r4 = (float) r4
            float r3 = r3 + r4
            r13.draw(r1, r2, r3)
        L77:
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle
    protected void onCollisionWithRalph(org.fortheloss.sticknodes.minigamescreen.Ralph r7) {
            r6 = this;
            float r2 = r6.getX()
            r1 = 1
            r3 = 0
            r4 = 1
            r5 = 0
            r0 = r7
            r0.onDeath(r1, r2, r3, r4, r5)
            return
    }
}
