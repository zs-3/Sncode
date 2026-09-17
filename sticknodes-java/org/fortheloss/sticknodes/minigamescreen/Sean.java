package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class Sean extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.minigamescreen.MiniGameScreen _miniGameScreenRef;
    private float _moneySeconds;
    private float _rotation;
    private float _secondsBetweenObstacles;
    private float _speedMultiple;
    private int _state;
    private float _timeSinceLastObstacle;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _trWithMoney;
    private float _wobbleSeconds;
    private float _wobbleX;
    private float _wobbleY;

    public Sean(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r4, org.fortheloss.framework.Assets r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._state = r0
            r0 = 0
            r3._speedMultiple = r0
            r3._moneySeconds = r0
            r3._wobbleX = r0
            r3._wobbleY = r0
            r3._rotation = r0
            r3._wobbleSeconds = r0
            r3._timeSinceLastObstacle = r0
            r3._secondsBetweenObstacles = r0
            r3._miniGameScreenRef = r4
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r0 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r2 = 1
            java.lang.Object r5 = r5.get(r0, r1, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r5
            java.lang.String r0 = "sean_with_money"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r5.findRegion(r0)
            r4.<init>(r5)
            r3._trWithMoney = r4
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r3._trWithMoney
            int r5 = r5.getRegionHeight()
            float r5 = (float) r5
            r3.setSize(r4, r5)
            float r4 = r3.getWidth()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            float r0 = r3.getHeight()
            float r0 = r0 * r5
            r3.setOrigin(r4, r0)
            r4 = 1069547520(0x3fc00000, float:1.5)
            r3._secondsBetweenObstacles = r4
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r13) {
            r12 = this;
            super.act(r13)
            float r0 = r12._wobbleSeconds
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r13 * r1
            float r3 = r12._speedMultiple
            float r2 = r2 * r3
            float r0 = r0 + r2
            r12._wobbleSeconds = r0
            double r2 = (double) r0
            double r2 = java.lang.Math.cos(r2)
            float r0 = (float) r2
            r2 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 * r2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            float r2 = r2 * r1
            float r0 = r0 - r2
            r12._wobbleX = r0
            float r0 = r12._wobbleSeconds
            double r0 = (double) r0
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            r1 = 1103101952(0x41c00000, float:24.0)
            float r0 = r0 * r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r2 = 1094713344(0x41400000, float:12.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            r12._wobbleY = r0
            float r0 = r12._wobbleSeconds
            double r0 = (double) r0
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r2 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            r12._rotation = r0
            int r0 = r12._state
            if (r0 != 0) goto L13a
            float r0 = r12._moneySeconds
            float r1 = r12._speedMultiple
            float r1 = r1 * r13
            float r0 = r0 + r1
            r12._moneySeconds = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lda
            r0 = 0
            r12._moneySeconds = r0
            double r2 = java.lang.Math.random()
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lda
            r0 = 1060320051(0x3f333333, float:0.7)
            double r2 = java.lang.Math.random()
            float r2 = (float) r2
            float r2 = r2 * r1
            float r2 = r2 + r0
            double r0 = java.lang.Math.random()
            float r0 = (float) r0
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r0 * r1
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r3 = r12._miniGameScreenRef
            r4 = 0
            float r1 = r12.getX()
            float r2 = r12.getOriginX()
            float r1 = r1 + r2
            float r2 = r12._wobbleX
            float r1 = r1 + r2
            r2 = 1101004800(0x41a00000, float:20.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r2
            float r5 = r1 - r5
            float r1 = r12.getY()
            r2 = 1109393408(0x42200000, float:40.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r6
            float r1 = r1 + r2
            float r2 = r12._wobbleY
            float r1 = r1 + r2
            r2 = -1007026176(0xffffffffc3fa0000, float:-500.0)
            float r6 = r6 * r2
            float r2 = r12._speedMultiple
            float r6 = r6 * r2
            float r7 = r6 * r0
            double r10 = java.lang.Math.random()
            float r0 = (float) r10
            r2 = -1009647616(0xffffffffc3d20000, float:-420.0)
            float r0 = r0 * r2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            double r10 = java.lang.Math.random()
            float r2 = (float) r10
            r6 = 1112014848(0x42480000, float:50.0)
            float r2 = r2 * r6
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r6
            float r8 = r0 + r2
            r6 = r1
            r3.addParticle(r4, r5, r6, r7, r8, r9)
        Lda:
            float r0 = r12._timeSinceLastObstacle
            float r0 = r0 + r13
            r12._timeSinceLastObstacle = r0
            float r13 = r12._secondsBetweenObstacles
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 < 0) goto L13a
        Le5:
            float r13 = r12._timeSinceLastObstacle
            float r0 = r12._secondsBetweenObstacles
            int r1 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf1
            float r13 = r13 - r0
            r12._timeSinceLastObstacle = r13
            goto Le5
        Lf1:
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r13 = r12._miniGameScreenRef
            float r0 = r12.getX()
            r1 = 1119879168(0x42c00000, float:96.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r0 = r0 + r2
            float r1 = r12._wobbleX
            float r0 = r0 + r1
            float r1 = r12.getY()
            r2 = 1133248512(0x438c0000, float:280.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            float r1 = r1 + r3
            float r2 = r12._wobbleY
            float r1 = r1 + r2
            float r2 = r12.getX()
            float r3 = r12.getWidth()
            float r2 = r2 + r3
            r3 = 1128267776(0x43400000, float:192.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r2 = r2 + r4
            float r3 = r12._speedMultiple
            r4 = 1072064102(0x3fe66666, float:1.8)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L12a
            r3 = 1
            goto L12b
        L12a:
            r3 = 0
        L12b:
            boolean r13 = r13.throwObstacle(r0, r1, r2, r3)
            if (r13 == 0) goto L13a
            float r13 = r12._secondsBetweenObstacles
            r0 = 1059481190(0x3f266666, float:0.65)
            float r13 = r13 * r0
            r12._timeSinceLastObstacle = r13
        L13a:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.remove()
            r1.clear()
            r0 = 0
            r1._miniGameScreenRef = r0
            r1._trWithMoney = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            super.draw(r12, r13)
            com.badlogic.gdx.graphics.Color r13 = r11.getColor()
            r12.setColor(r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r11._trWithMoney
            float r13 = r11.getX()
            float r0 = r11._wobbleX
            float r2 = r13 + r0
            float r13 = r11.getY()
            float r0 = r11._wobbleY
            float r3 = r13 + r0
            float r4 = r11.getOriginX()
            float r5 = r11.getOriginY()
            float r6 = r11.getWidth()
            float r7 = r11.getHeight()
            float r10 = r11._rotation
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r0 = r12
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public void setSpeedMultiple(float r3) {
            r2 = this;
            r2._speedMultiple = r3
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lb
            r2._secondsBetweenObstacles = r0
            goto L4c
        Lb:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L17
            r3 = 1067869798(0x3fa66666, float:1.3)
            r2._secondsBetweenObstacles = r3
            goto L4c
        L17:
            r0 = 1075838976(0x40200000, float:2.5)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L23
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            r2._secondsBetweenObstacles = r3
            goto L4c
        L23:
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2f
            r3 = 1063675494(0x3f666666, float:0.9)
            r2._secondsBetweenObstacles = r3
            goto L4c
        L2f:
            r0 = 1080033280(0x40600000, float:3.5)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3b
            r3 = 1060320051(0x3f333333, float:0.7)
            r2._secondsBetweenObstacles = r3
            goto L4c
        L3b:
            r0 = 1082130432(0x40800000, float:4.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L47
            r3 = 1059481190(0x3f266666, float:0.65)
            r2._secondsBetweenObstacles = r3
            goto L4c
        L47:
            r3 = 1058642330(0x3f19999a, float:0.6)
            r2._secondsBetweenObstacles = r3
        L4c:
            return
    }

    public void setState(int r1) {
            r0 = this;
            r0._state = r1
            return
    }
}
