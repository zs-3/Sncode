package org.fortheloss.sticknodes.minigamescreen.obstacles;

/* loaded from: classes2.dex */
public abstract class Obstacle extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    public static int singleBlockSize;
    protected float _animationSeconds;
    protected int _avoidWith;
    protected com.badlogic.gdx.graphics.g2d.TextureRegion _blankTR;
    protected float _bottomPunchedBlockRandom;
    protected float _bottomPunchedBlockRot;
    protected float _bottomPunchedBlockX;
    protected float _bottomPunchedBlockY;
    protected float _buildingBlockMidPercentage;
    protected float _buildingBlockTopPercentage;
    protected float _buildingFade;
    protected boolean _buildingMiddleBlock;
    protected float _buildingSeconds;
    protected float _destX;
    protected boolean _exploded;
    protected float _floorY;
    protected float _midPunchedBlockRandom;
    protected float _midPunchedBlockRot;
    protected float _midPunchedBlockX;
    protected float _midPunchedBlockY;
    private org.fortheloss.sticknodes.minigamescreen.MiniGameScreen _miniGameScreenRef;
    protected boolean _punched;
    protected float _punchedBlockAlpha;
    protected float _punchedBlockSeconds;
    private org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler _soundHandlerRef;
    protected float _speedMultiple;
    protected float _speedY;
    protected int _state;
    protected com.badlogic.gdx.graphics.g2d.TextureRegion _trCobbleStoneTR;
    protected com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _trTntAnimation;

    static {
            return
    }

    public Obstacle(org.fortheloss.framework.Assets r6, org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r7, float r8, float r9, float r10) {
            r5 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r5.<init>()
            r1 = 0
            r5._animationSeconds = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r5._speedMultiple = r2
            r3 = 0
            r5._state = r3
            r5._floorY = r1
            r5._destX = r1
            r5._speedY = r1
            r5._avoidWith = r3
            r5._buildingFade = r1
            r5._buildingBlockMidPercentage = r1
            r5._buildingBlockTopPercentage = r1
            r5._buildingSeconds = r1
            r4 = 1
            r5._buildingMiddleBlock = r4
            r5._punched = r3
            r5._exploded = r3
            r5._punchedBlockSeconds = r1
            r5._midPunchedBlockRandom = r2
            r5._midPunchedBlockX = r1
            r5._midPunchedBlockY = r1
            r5._midPunchedBlockRot = r1
            r5._bottomPunchedBlockRandom = r2
            r5._bottomPunchedBlockX = r1
            r5._bottomPunchedBlockY = r1
            r5._bottomPunchedBlockRot = r1
            r5._punchedBlockAlpha = r2
            r5._miniGameScreenRef = r7
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r7 = r7.getSoundHandler()
            r5._soundHandlerRef = r7
            r5._floorY = r8
            r5._destX = r9
            r5._speedMultiple = r10
            java.lang.String r7 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r7 = r6.get(r7, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r7 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r7
            java.lang.String r8 = "block_blank"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r7.findRegion(r8)
            r5._blankTR = r7
            java.lang.String r7 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r7 = r6.get(r7, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r7 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r7
            java.lang.String r8 = "block_cobblestone"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r7.findRegion(r8)
            r5._trCobbleStoneTR = r7
            com.badlogic.gdx.graphics.g2d.Animation r7 = new com.badlogic.gdx.graphics.g2d.Animation
            r8 = 1048576000(0x3e800000, float:0.25)
            float r9 = r8 / r10
            java.lang.String r10 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r6 = r6.get(r10, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r6
            java.lang.String r10 = "block_tnt"
            com.badlogic.gdx.utils.Array r6 = r6.findRegions(r10)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r10 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r7.<init>(r9, r6, r10)
            r5._trTntAnimation = r7
            r5._state = r3
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1142292480(0x44160000, float:600.0)
            float r6 = r6 * r7
            r5._speedY = r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r5._blankTR
            int r6 = r6.getRegionWidth()
            float r6 = (float) r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r5._blankTR
            int r7 = r7.getRegionHeight()
            float r7 = (float) r7
            r5.setSize(r6, r7)
            float r6 = r5.getWidth()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            float r9 = r5.getHeight()
            float r9 = r9 * r7
            r5.setOrigin(r6, r9)
            r5.setScale(r8, r8)
            float r6 = r5.getHeight()
            int r6 = (int) r6
            org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize = r6
            return
    }

    private void beginBuilding() {
            r2 = this;
            r0 = 1
            r2._state = r0
            r1 = 0
            r2._buildingBlockMidPercentage = r1
            r2._buildingBlockTopPercentage = r1
            r2._buildingSeconds = r1
            r2._buildingMiddleBlock = r0
            r2.setOriginY(r1)
            return
    }

    private void beginFadingIn() {
            r2 = this;
            r0 = 2
            r2._state = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2._buildingFade = r0
            float r0 = r2.getHeight()
            r1 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r1
            r2.setHeight(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r10) {
            r9 = this;
            super.act(r10)
            int r0 = r9._state
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L7f
            float r0 = r9.getScaleX()
            float r5 = r9.getScaleX()
            float r5 = r4 - r5
            float r5 = r5 * r10
            float r0 = r0 + r5
            float r5 = r9._speedY
            r6 = 1145569280(0x44480000, float:800.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r6
            float r6 = r9._speedMultiple
            float r7 = r7 * r6
            float r7 = r7 * r10
            float r5 = r5 - r7
            r9._speedY = r5
            float r5 = r9.getRotation()
            r6 = 1144258560(0x44340000, float:720.0)
            float r6 = r6 * r10
            float r5 = r5 + r6
            r9.setRotation(r5)
            float r5 = r9.getX()
            float r6 = r9._destX
            float r7 = r9.getX()
            float r6 = r6 - r7
            float r6 = r6 * r10
            float r7 = r9._speedMultiple
            float r6 = r6 * r7
            float r5 = r5 + r6
            r9.setX(r5)
            float r5 = r9.getY()
            float r6 = r9._speedY
            float r6 = r6 * r10
            float r5 = r5 + r6
            r9.setY(r5)
            r9.setScale(r0, r0)
            float r0 = r9.getY()
            float r5 = r9._floorY
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto Ldf
            r9.setRotation(r3)
            float r0 = r9._destX
            float r5 = r9._floorY
            r9.setPosition(r0, r5)
            r9.setScale(r4, r4)
            r9.beginBuilding()
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r9._soundHandlerRef
            com.badlogic.gdx.audio.Sound r5 = r0.sndStack1
            r0.playSound(r5, r1)
            goto Ldf
        L7f:
            r5 = 1
            if (r0 != r5) goto Lc8
            float r0 = r9._speedMultiple
            float r0 = r2 / r0
            float r5 = r9._buildingSeconds
            float r5 = r5 + r10
            r9._buildingSeconds = r5
            float r5 = r5 / r0
            float r0 = java.lang.Math.min(r4, r5)
            boolean r5 = r9._buildingMiddleBlock
            if (r5 != 0) goto Lab
            com.badlogic.gdx.math.Interpolation$SwingOut r5 = com.badlogic.gdx.math.Interpolation.swingOut
            float r5 = r5.apply(r2, r4, r0)
            r9._buildingBlockTopPercentage = r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Ldf
            r9.beginFadingIn()
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r9._soundHandlerRef
            com.badlogic.gdx.audio.Sound r5 = r0.sndStack3
            r0.playSound(r5, r1)
            goto Ldf
        Lab:
            com.badlogic.gdx.math.Interpolation$SwingOut r5 = com.badlogic.gdx.math.Interpolation.swingOut
            float r5 = r5.apply(r3, r4, r0)
            r9._buildingBlockMidPercentage = r5
            float r5 = r5 * r2
            r9._buildingBlockTopPercentage = r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Ldf
            r0 = 0
            r9._buildingMiddleBlock = r0
            r9._buildingSeconds = r3
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r9._soundHandlerRef
            com.badlogic.gdx.audio.Sound r5 = r0.sndStack2
            r0.playSound(r5, r1)
            goto Ldf
        Lc8:
            r1 = 2
            if (r0 != r1) goto Ldf
            float r0 = r9._animationSeconds
            float r0 = r0 + r10
            r9._animationSeconds = r0
            float r0 = r9._buildingFade
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r10
            float r0 = r0 - r1
            r9._buildingFade = r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Ldf
            r9._buildingFade = r3
        Ldf:
            boolean r0 = r9._punched
            if (r0 == 0) goto L139
            float r0 = r9._punchedBlockSeconds
            float r0 = r0 + r10
            r9._punchedBlockSeconds = r0
            float r0 = r0 / r2
            float r0 = java.lang.Math.min(r4, r0)
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineIn
            float r1 = r1.apply(r4, r3, r0)
            r9._punchedBlockAlpha = r1
            float r1 = r9._midPunchedBlockRot
            float r2 = r9._midPunchedBlockRandom
            r4 = 1149698048(0x44870000, float:1080.0)
            float r5 = r2 * r4
            float r5 = r5 * r10
            float r1 = r1 - r5
            r9._midPunchedBlockRot = r1
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineOut
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1149239296(0x44800000, float:1024.0)
            float r5 = r5 * r6
            float r5 = r5 * r2
            float r2 = r1.apply(r3, r5, r0)
            r9._midPunchedBlockX = r2
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.circleIn
            r5 = -1015021568(0xffffffffc3800000, float:-256.0)
            float r7 = r2.apply(r3, r5, r0)
            r9._midPunchedBlockY = r7
            float r7 = r9._bottomPunchedBlockRot
            float r8 = r9._bottomPunchedBlockRandom
            float r4 = r4 * r8
            float r4 = r4 * r10
            float r7 = r7 - r4
            r9._bottomPunchedBlockRot = r7
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r6
            float r10 = r10 * r8
            float r10 = r1.apply(r3, r10, r0)
            r9._bottomPunchedBlockX = r10
            float r10 = r2.apply(r3, r5, r0)
            r9._bottomPunchedBlockY = r10
        L139:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.clear()
            r1.remove()
            r0 = 0
            r1._blankTR = r0
            r1._trCobbleStoneTR = r0
            r1._trTntAnimation = r0
            r1._miniGameScreenRef = r0
            r1._soundHandlerRef = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            super.draw(r12, r13)
            int r13 = r11._state
            if (r13 != 0) goto L3a
            com.badlogic.gdx.graphics.Color r13 = r11.getColor()
            r12.setColor(r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r11._blankTR
            float r2 = r11.getX()
            float r3 = r11.getY()
            float r4 = r11.getOriginX()
            float r5 = r11.getOriginY()
            float r6 = r11.getWidth()
            float r7 = r11.getHeight()
            float r8 = r11.getScaleX()
            float r9 = r11.getScaleY()
            float r10 = r11.getRotation()
            r0 = r12
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto Lcc
        L3a:
            r0 = 1
            r1 = 2
            if (r13 != r0) goto L7f
            com.badlogic.gdx.graphics.Color r13 = r11.getColor()
            r12.setColor(r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._blankTR
            float r0 = r11.getX()
            float r2 = r11.getY()
            r12.draw(r13, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._blankTR
            float r0 = r11.getX()
            float r2 = r11.getY()
            int r3 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r3 = (float) r3
            float r4 = r11._buildingBlockMidPercentage
            float r3 = r3 * r4
            float r2 = r2 + r3
            r12.draw(r13, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._blankTR
            float r0 = r11.getX()
            float r2 = r11.getY()
            int r3 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r3 = r3 * 2
            float r1 = (float) r3
            float r3 = r11._buildingBlockTopPercentage
            float r1 = r1 * r3
            float r2 = r2 + r1
            r12.draw(r13, r0, r2)
            goto Lcc
        L7f:
            if (r13 != r1) goto Lcc
            float r13 = r11._buildingFade
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto Lcc
            com.badlogic.gdx.graphics.Color r13 = r11.getColor()
            float r0 = r13.r
            float r2 = r13.g
            float r3 = r13.b
            float r13 = r13.a
            float r4 = r11._buildingFade
            float r13 = r13 * r4
            r12.setColor(r0, r2, r3, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._blankTR
            float r0 = r11.getX()
            float r2 = r11.getY()
            r12.draw(r13, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._blankTR
            float r0 = r11.getX()
            float r2 = r11.getY()
            int r3 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r3 = (float) r3
            float r2 = r2 + r3
            r12.draw(r13, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._blankTR
            float r0 = r11.getX()
            float r2 = r11.getY()
            int r3 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r3 = r3 * 2
            float r1 = (float) r3
            float r2 = r2 + r1
            r12.draw(r13, r0, r2)
        Lcc:
            return
    }

    public int getState() {
            r1 = this;
            int r0 = r1._state
            return r0
    }

    protected abstract void onCollisionWithRalph(org.fortheloss.sticknodes.minigamescreen.Ralph r1);

    public boolean ralphDeathOnContact(org.fortheloss.sticknodes.minigamescreen.Ralph r30) {
            r29 = this;
            r0 = r29
            boolean r1 = r0._punched
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            int r1 = r30.getObstacleAvoidState()
            int r3 = r0._avoidWith
            r3 = r3 & r1
            r4 = 1
            if (r3 == 0) goto L130
            r1 = r1 & 8
            if (r1 == 0) goto L12f
            r0._punched = r4
            r1 = 0
            r0._punchedBlockSeconds = r1
            double r5 = java.lang.Math.random()
            float r3 = (float) r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r5
            float r3 = r3 + r5
            r0._midPunchedBlockRandom = r3
            double r6 = java.lang.Math.random()
            float r3 = (float) r6
            float r3 = r3 * r5
            float r3 = r3 + r5
            r0._bottomPunchedBlockRandom = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            double r6 = java.lang.Math.random()
            float r6 = (float) r6
            r7 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r7
            float r6 = r6 + r3
            r3 = 1075838976(0x40200000, float:2.5)
            float r3 = r3 * r6
            double r8 = java.lang.Math.random()
            float r8 = (float) r8
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            float r8 = r8 * r9
            float r8 = r8 + r5
            r9 = 6
            com.badlogic.gdx.scenes.scene2d.Action[] r10 = new com.badlogic.gdx.scenes.scene2d.Action[r9]
            com.badlogic.gdx.graphics.Color r11 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.color(r11)
            r10[r2] = r12
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r7)
            r10[r4] = r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r13 = r6 * r12
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r14 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r13)
            r15 = 2
            r10[r15] = r14
            com.badlogic.gdx.math.Interpolation r14 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r16 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r1, r8, r14)
            r17 = 3
            r10[r17] = r16
            float r12 = r12 * r3
            com.badlogic.gdx.math.Interpolation$ExpOut r5 = com.badlogic.gdx.math.Interpolation.exp10Out
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r16 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r3, r12, r8, r5)
            r18 = 4
            r10[r18] = r16
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            r19 = 1120403456(0x42c80000, float:100.0)
            float r15 = r16 * r19
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r15, r1, r8, r14)
            r16 = 5
            r10[r16] = r15
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r26 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r10)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r10 = r0._miniGameScreenRef
            r21 = 1
            float r15 = r29.getX()
            float r20 = org.fortheloss.sticknodes.App.assetScaling
            r28 = 1101004800(0x41a00000, float:20.0)
            float r20 = r20 * r28
            float r22 = r15 + r20
            float r15 = r29.getY()
            int r1 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r1 = (float) r1
            float r23 = r15 + r1
            r24 = 0
            r1 = 1114636288(0x42700000, float:60.0)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r25 = r15 * r1
            r27 = 1
            r20 = r10
            r20.addParticle(r21, r22, r23, r24, r25, r26, r27)
            com.badlogic.gdx.scenes.scene2d.Action[] r1 = new com.badlogic.gdx.scenes.scene2d.Action[r9]
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.color(r11)
            r1[r2] = r9
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r7)
            r1[r4] = r7
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r13)
            r6 = 2
            r1[r6] = r4
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r8, r14)
            r1[r17] = r6
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r3, r12, r8, r5)
            r1[r18] = r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r19
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r3, r4, r8, r14)
            r1[r16] = r3
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r4 = r0._miniGameScreenRef
            r5 = 1
            float r1 = r29.getX()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r28
            float r6 = r1 + r3
            float r1 = r29.getY()
            int r3 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r3 = (float) r3
            r7 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r7
            float r7 = r1 + r3
            r8 = 0
            r1 = -1032847360(0xffffffffc2700000, float:-60.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r3 * r1
            r11 = 1
            r4.addParticle(r5, r6, r7, r8, r9, r10, r11)
            double r3 = java.lang.Math.random()
            float r1 = (float) r3
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r3 = r0._soundHandlerRef
            com.badlogic.gdx.audio.Sound r4 = r3.sndPunch1
            r5 = 1051260355(0x3ea8f5c3, float:0.33)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L120
            com.badlogic.gdx.audio.Sound r4 = r3.sndPunch2
            goto L129
        L120:
            r5 = 1059648963(0x3f28f5c3, float:0.66)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L129
            com.badlogic.gdx.audio.Sound r4 = r3.sndPunch3
        L129:
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r3.playSound(r4, r1)
        L12f:
            return r2
        L130:
            r29.onCollisionWithRalph(r30)
            return r4
    }
}
