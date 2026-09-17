package org.fortheloss.sticknodes.minigamescreen.obstacles;

/* loaded from: classes2.dex */
public class ObstacleCCB extends org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle {
    public ObstacleCCB(org.fortheloss.framework.Assets r1, org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 10
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
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r16, float r17) {
            r15 = this;
            r0 = r15
            r12 = r16
            super.draw(r16, r17)
            int r1 = r0._state
            r2 = 2
            if (r1 != r2) goto Lae
            com.badlogic.gdx.graphics.Color r1 = r15.getColor()
            boolean r2 = r0._punched
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L80
            float r2 = r1.r
            float r4 = r1.g
            float r5 = r1.b
            float r1 = r1.a
            float r6 = r0._buildingFade
            float r3 = r3 - r6
            float r1 = r1 * r3
            float r3 = r0._punchedBlockAlpha
            float r1 = r1 * r3
            r12.setColor(r2, r4, r5, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trCobbleStoneTR
            float r1 = r15.getX()
            float r3 = r0._midPunchedBlockX
            float r3 = r3 + r1
            float r1 = r15.getY()
            float r4 = r0._midPunchedBlockY
            float r1 = r1 + r4
            int r4 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r5 = (float) r4
            float r5 = r5 + r1
            float r1 = (float) r4
            r13 = 1056964608(0x3f000000, float:0.5)
            float r6 = r1 * r13
            float r1 = (float) r4
            float r7 = r1 * r13
            float r8 = (float) r4
            float r9 = (float) r4
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r14 = r0._midPunchedBlockRot
            r1 = r16
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r14
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trCobbleStoneTR
            float r1 = r15.getX()
            float r3 = r0._bottomPunchedBlockX
            float r3 = r3 + r1
            float r1 = r15.getY()
            float r4 = r0._bottomPunchedBlockY
            float r4 = r4 + r1
            int r1 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r5 = (float) r1
            float r5 = r5 * r13
            float r6 = (float) r1
            float r6 = r6 * r13
            float r7 = (float) r1
            float r8 = (float) r1
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r0._bottomPunchedBlockRot
            r1 = r16
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lae
        L80:
            float r2 = r1.r
            float r4 = r1.g
            float r5 = r1.b
            float r1 = r1.a
            float r6 = r0._buildingFade
            float r3 = r3 - r6
            float r1 = r1 * r3
            r12.setColor(r2, r4, r5, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trCobbleStoneTR
            float r2 = r15.getX()
            float r3 = r15.getY()
            int r4 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r4 = (float) r4
            float r3 = r3 + r4
            r12.draw(r1, r2, r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trCobbleStoneTR
            float r2 = r15.getX()
            float r3 = r15.getY()
            r12.draw(r1, r2, r3)
        Lae:
            return
    }

    @Override // org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle
    protected void onCollisionWithRalph(org.fortheloss.sticknodes.minigamescreen.Ralph r7) {
            r6 = this;
            float r2 = r6.getX()
            r1 = 1
            r3 = 1
            r4 = 1
            r5 = 0
            r0 = r7
            r0.onDeath(r1, r2, r3, r4, r5)
            return
    }
}
