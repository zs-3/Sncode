package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class Ralph extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animJumpingDown;
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animJumpingUp;
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animPunching;
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animRunning;
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animSliding;
    private float _animationSeconds;
    private float _backAndForthSeconds;
    private float _backAndForthX;
    private float _floorY;
    private float _jumpSeconds;
    private float _jumpY;
    private boolean _jumpingUpDustShown;
    private org.fortheloss.sticknodes.minigamescreen.MiniGameScreen _miniGameScreenRef;
    private int _obstacleAvoidState;
    private boolean _punchingDustShown;
    private int _runningDustLastIndex;
    private int _slidingDustLastIndex;
    private org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler _soundHandlerRef;
    private float _speedMultiple;
    private int _state;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _trDeathExplosion;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _trDeathSplat;

    public Ralph(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r7, org.fortheloss.framework.Assets r8) {
            r6 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r6.<init>()
            r1 = 0
            r6._state = r1
            r2 = 1
            r6._obstacleAvoidState = r2
            r3 = 0
            r6._speedMultiple = r3
            r6._animationSeconds = r3
            r6._floorY = r3
            r6._jumpY = r3
            r6._jumpSeconds = r3
            r4 = -1
            r6._runningDustLastIndex = r4
            r6._slidingDustLastIndex = r4
            r6._punchingDustShown = r1
            r6._jumpingUpDustShown = r1
            r6._backAndForthX = r3
            r6._backAndForthSeconds = r3
            r6._miniGameScreenRef = r7
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r7 = r7.getSoundHandler()
            r6._soundHandlerRef = r7
            com.badlogic.gdx.graphics.g2d.Animation r7 = new com.badlogic.gdx.graphics.g2d.Animation
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r1 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = "ralph_run"
            com.badlogic.gdx.utils.Array r1 = r1.findRegions(r3)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r3 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r7.<init>(r4, r1, r3)
            r6._animRunning = r7
            com.badlogic.gdx.graphics.g2d.Animation r7 = new com.badlogic.gdx.graphics.g2d.Animation
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas2
            java.lang.Object r1 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = "ralph_jump"
            com.badlogic.gdx.utils.Array r1 = r1.findRegions(r3)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r4 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.NORMAL
            r5 = 1041865114(0x3e19999a, float:0.15)
            r7.<init>(r5, r1, r4)
            r6._animJumpingUp = r7
            com.badlogic.gdx.graphics.g2d.Animation r7 = new com.badlogic.gdx.graphics.g2d.Animation
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas2
            java.lang.Object r1 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            com.badlogic.gdx.utils.Array r1 = r1.findRegions(r3)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r3 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.REVERSED
            r7.<init>(r5, r1, r3)
            r6._animJumpingDown = r7
            com.badlogic.gdx.graphics.g2d.Animation r7 = new com.badlogic.gdx.graphics.g2d.Animation
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas2
            java.lang.Object r1 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = "ralph_punch"
            com.badlogic.gdx.utils.Array r1 = r1.findRegions(r3)
            r7.<init>(r5, r1, r4)
            r6._animPunching = r7
            com.badlogic.gdx.graphics.g2d.Animation r7 = new com.badlogic.gdx.graphics.g2d.Animation
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas3
            java.lang.Object r1 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = "ralph_slide"
            com.badlogic.gdx.utils.Array r1 = r1.findRegions(r3)
            r7.<init>(r5, r1, r4)
            r6._animSliding = r7
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r1 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = "ralph_dead_splat"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r3)
            r7.<init>(r1)
            r6._trDeathSplat = r7
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r8 = r8.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r8 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r8
            java.lang.String r0 = "ralph_dead_explosion"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r8.findRegion(r0)
            r7.<init>(r8)
            r6._trDeathExplosion = r7
            return
    }

    private void setState(int r1) {
            r0 = this;
            r0._state = r1
            r1 = 0
            r0._animationSeconds = r1
            r0._jumpSeconds = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r25) {
            r24 = this;
            r0 = r24
            super.act(r25)
            float r1 = r0._animationSeconds
            float r1 = r1 + r25
            r0._animationSeconds = r1
            int r1 = r0._state
            r2 = 1092616192(0x41200000, float:10.0)
            r3 = 6
            r4 = 0
            r5 = 5
            if (r1 == r5) goto L2e
            if (r1 == r3) goto L2e
            float r1 = r0._backAndForthSeconds
            float r6 = r0._speedMultiple
            float r6 = r6 * r25
            float r1 = r1 + r6
            r0._backAndForthSeconds = r1
            double r6 = (double) r1
            double r6 = java.lang.Math.sin(r6)
            float r1 = (float) r6
            float r1 = r1 * r2
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r0._backAndForthX = r1
            goto L30
        L2e:
            r0._backAndForthX = r4
        L30:
            int r1 = r0._state
            r6 = 1059481190(0x3f266666, float:0.65)
            r7 = 1069547520(0x3fc00000, float:1.5)
            r12 = 1135869952(0x43b40000, float:360.0)
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r14 = 1061158912(0x3f400000, float:0.75)
            r15 = 3
            r8 = 0
            r16 = 1061997773(0x3f4ccccd, float:0.8)
            r2 = 1065353216(0x3f800000, float:1.0)
            r10 = 2
            r5 = 1
            if (r1 != r5) goto L11b
            float r1 = r0._jumpSeconds
            float r1 = r1 / r6
            float r6 = r0._speedMultiple
            float r1 = r1 * r6
            float r1 = java.lang.Math.min(r2, r1)
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.sineOut
            float r11 = r0._floorY
            float r9 = r0._jumpY
            float r6 = r6.apply(r11, r9, r1)
            r0.setY(r6)
            float r6 = r0._jumpSeconds
            float r6 = r6 + r25
            r0._jumpSeconds = r6
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L70
            r0.setState(r10)
            goto L46b
        L70:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animJumpingUp
            float r6 = r0._animationSeconds
            int r1 = r1.getKeyFrameIndex(r6)
            if (r1 != 0) goto L46b
            boolean r1 = r0._jumpingUpDustShown
            if (r1 != 0) goto L46b
            r0._jumpingUpDustShown = r5
            double r10 = java.lang.Math.random()
            float r1 = (float) r10
            float r1 = r1 * r2
            float r1 = r1 + r7
            float r7 = r7 * r1
            double r10 = java.lang.Math.random()
            float r6 = (float) r10
            float r6 = r6 + r2
            double r10 = java.lang.Math.random()
            float r2 = (float) r10
            float r2 = r2 * r14
            float r2 = r2 + r14
            double r10 = java.lang.Math.random()
            float r10 = (float) r10
            float r10 = r10 * r13
            float r10 = r10 + r16
            com.badlogic.gdx.scenes.scene2d.Action[] r3 = new com.badlogic.gdx.scenes.scene2d.Action[r3]
            double r13 = java.lang.Math.random()
            float r11 = (float) r13
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r11)
            r3[r8] = r11
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r16)
            r3[r5] = r8
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1)
            r8 = 2
            r3[r8] = r1
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r2, r1)
            r3[r15] = r4
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r7, r7, r2, r1)
            r2 = 4
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r6)
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r2, r1)
            r2 = 5
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r23 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1 = r0._miniGameScreenRef
            r18 = 1
            float r2 = r24.getX()
            float r3 = r24.getOriginX()
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r4
            float r19 = r2 + r3
            float r2 = r24.getY()
            r3 = 1092616192(0x41200000, float:10.0)
            float r20 = r2 - r3
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = -1007681536(0xffffffffc3f00000, float:-480.0)
            float r2 = r2 * r3
            float r3 = r0._speedMultiple
            float r2 = r2 * r3
            float r21 = r2 * r10
            double r2 = java.lang.Math.random()
            float r2 = (float) r2
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = r2 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r22 = r2 * r3
            r17 = r1
            r17.addParticle(r18, r19, r20, r21, r22, r23)
            goto L46b
        L11b:
            r9 = 2
            if (r1 != r9) goto L1ea
            float r1 = r0._jumpSeconds
            float r1 = r1 / r6
            float r6 = r0._speedMultiple
            float r1 = r1 * r6
            float r1 = java.lang.Math.min(r2, r1)
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.sineIn
            float r10 = r0._jumpY
            float r11 = r0._floorY
            float r6 = r6.apply(r10, r11, r1)
            r0.setY(r6)
            float r6 = r0._jumpSeconds
            float r6 = r6 + r25
            r0._jumpSeconds = r6
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L46b
            r0.setState(r8)
            r1 = 1075838976(0x40200000, float:2.5)
            double r10 = java.lang.Math.random()
            float r6 = (float) r10
            float r6 = r6 * r2
            float r6 = r6 + r1
            float r7 = r7 * r6
            double r10 = java.lang.Math.random()
            float r1 = (float) r10
            float r1 = r1 + r2
            double r10 = java.lang.Math.random()
            float r2 = (float) r10
            float r2 = r2 * r14
            float r2 = r2 + r14
            double r10 = java.lang.Math.random()
            float r10 = (float) r10
            float r10 = r10 * r13
            float r10 = r10 + r16
            com.badlogic.gdx.scenes.scene2d.Action[] r3 = new com.badlogic.gdx.scenes.scene2d.Action[r3]
            double r13 = java.lang.Math.random()
            float r11 = (float) r13
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r11)
            r3[r8] = r11
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r16)
            r3[r5] = r8
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6)
            r8 = 2
            r3[r8] = r6
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r2, r6)
            r3[r15] = r4
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r7, r7, r2, r6)
            r4 = 4
            r3[r4] = r2
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r2, r1)
            r2 = 5
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r23 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1 = r0._miniGameScreenRef
            r18 = 1
            float r2 = r24.getX()
            float r3 = r24.getOriginX()
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r4
            float r19 = r2 + r3
            float r2 = r24.getY()
            r3 = 1092616192(0x41200000, float:10.0)
            float r20 = r2 - r3
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = -1007681536(0xffffffffc3f00000, float:-480.0)
            float r2 = r2 * r3
            float r3 = r0._speedMultiple
            float r2 = r2 * r3
            float r21 = r2 * r10
            double r2 = java.lang.Math.random()
            float r2 = (float) r2
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = r2 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r22 = r2 * r3
            r17 = r1
            r17.addParticle(r18, r19, r20, r21, r22, r23)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r0._soundHandlerRef
            com.badlogic.gdx.audio.Sound r2 = r1.sndJumpLand
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r1.playSound(r2, r3)
            goto L46b
        L1ea:
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 != r15) goto L2b1
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animPunching
            float r10 = r0._animationSeconds
            boolean r1 = r1.isAnimationFinished(r10)
            if (r1 == 0) goto L1ff
            r0.setState(r8)
            goto L46b
        L1ff:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animPunching
            float r10 = r0._animationSeconds
            int r1 = r1.getKeyFrameIndex(r10)
            if (r1 != r5) goto L46b
            boolean r1 = r0._punchingDustShown
            if (r1 != 0) goto L46b
            r0._punchingDustShown = r5
            double r10 = java.lang.Math.random()
            float r1 = (float) r10
            float r1 = r1 * r6
            float r1 = r1 + r7
            r7 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 * r1
            double r10 = java.lang.Math.random()
            float r10 = (float) r10
            float r10 = r10 + r2
            double r13 = java.lang.Math.random()
            float r2 = (float) r13
            float r2 = r2 * r6
            float r2 = r2 + r6
            r6 = 1068708659(0x3fb33333, float:1.4)
            double r13 = java.lang.Math.random()
            float r11 = (float) r13
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            float r11 = r11 * r13
            float r11 = r11 + r6
            com.badlogic.gdx.scenes.scene2d.Action[] r3 = new com.badlogic.gdx.scenes.scene2d.Action[r3]
            double r13 = java.lang.Math.random()
            float r6 = (float) r13
            float r6 = r6 * r12
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r6)
            r3[r8] = r6
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r16)
            r3[r5] = r6
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1)
            r6 = 2
            r3[r6] = r1
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r2, r1)
            r3[r15] = r4
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r7, r7, r2, r1)
            r2 = 4
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r10)
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r2, r1)
            r2 = 5
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r23 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1 = r0._miniGameScreenRef
            r18 = 1
            float r2 = r24.getX()
            float r3 = r24.getOriginX()
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r4
            float r19 = r2 + r3
            float r2 = r24.getY()
            r3 = 1092616192(0x41200000, float:10.0)
            float r20 = r2 - r3
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = -1007681536(0xffffffffc3f00000, float:-480.0)
            float r2 = r2 * r3
            float r3 = r0._speedMultiple
            float r2 = r2 * r3
            float r21 = r2 * r11
            double r2 = java.lang.Math.random()
            float r2 = (float) r2
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = r2 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r22 = r2 * r3
            r17 = r1
            r17.addParticle(r18, r19, r20, r21, r22, r23)
            goto L46b
        L2b1:
            r2 = 4
            if (r1 != r2) goto L373
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animSliding
            float r2 = r0._animationSeconds
            boolean r1 = r1.isAnimationFinished(r2)
            if (r1 == 0) goto L2c3
            r0.setState(r8)
            goto L46b
        L2c3:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animSliding
            float r2 = r0._animationSeconds
            int r1 = r1.getKeyFrameIndex(r2)
            int r2 = r0._slidingDustLastIndex
            if (r1 == r2) goto L46b
            r0._slidingDustLastIndex = r1
            r1 = 1067030938(0x3f99999a, float:1.2)
            double r10 = java.lang.Math.random()
            float r2 = (float) r10
            float r2 = r2 * r13
            float r2 = r2 + r1
            r1 = 1067450368(0x3fa00000, float:1.25)
            float r1 = r1 * r2
            double r10 = java.lang.Math.random()
            float r6 = (float) r10
            float r6 = r6 * r7
            float r6 = r6 + r7
            double r10 = java.lang.Math.random()
            float r7 = (float) r10
            float r7 = r7 * r14
            float r7 = r7 + r14
            double r10 = java.lang.Math.random()
            float r10 = (float) r10
            float r10 = r10 * r13
            float r10 = r10 + r16
            com.badlogic.gdx.scenes.scene2d.Action[] r3 = new com.badlogic.gdx.scenes.scene2d.Action[r3]
            double r13 = java.lang.Math.random()
            float r11 = (float) r13
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r11)
            r3[r8] = r11
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r16)
            r3[r5] = r8
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2)
            r8 = 2
            r3[r8] = r2
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r7, r2)
            r3[r15] = r4
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1, r7, r2)
            r2 = 4
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r6)
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r2, r1)
            r2 = 5
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r23 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1 = r0._miniGameScreenRef
            r18 = 1
            float r2 = r24.getX()
            float r3 = r24.getOriginX()
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r4
            float r19 = r2 + r3
            float r2 = r24.getY()
            r3 = 1092616192(0x41200000, float:10.0)
            float r20 = r2 - r3
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = -1007681536(0xffffffffc3f00000, float:-480.0)
            float r2 = r2 * r3
            float r3 = r0._speedMultiple
            float r2 = r2 * r3
            float r21 = r2 * r10
            double r2 = java.lang.Math.random()
            float r2 = (float) r2
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = r2 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r22 = r2 * r3
            r17 = r1
            r17.addParticle(r18, r19, r20, r21, r22, r23)
            goto L46b
        L373:
            if (r1 != 0) goto L46b
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animRunning
            float r2 = r0._animationSeconds
            int r1 = r1.getKeyFrameIndex(r2)
            if (r1 == r5) goto L382
            r2 = 5
            if (r1 != r2) goto L46b
        L382:
            int r2 = r0._runningDustLastIndex
            if (r1 == r2) goto L46b
            r0._runningDustLastIndex = r1
            r1 = 1058642330(0x3f19999a, float:0.6)
            double r10 = java.lang.Math.random()
            float r2 = (float) r10
            float r2 = r2 * r13
            float r2 = r2 + r1
            r1 = 1067450368(0x3fa00000, float:1.25)
            float r1 = r1 * r2
            double r10 = java.lang.Math.random()
            float r10 = (float) r10
            float r10 = r10 * r7
            float r10 = r10 + r7
            r7 = r10
            double r9 = java.lang.Math.random()
            float r9 = (float) r9
            float r9 = r9 * r6
            float r6 = r6 + r9
            double r9 = java.lang.Math.random()
            float r9 = (float) r9
            float r9 = r9 * r13
            float r10 = r9 + r16
            com.badlogic.gdx.scenes.scene2d.Action[] r3 = new com.badlogic.gdx.scenes.scene2d.Action[r3]
            double r13 = java.lang.Math.random()
            float r9 = (float) r13
            float r9 = r9 * r12
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r9)
            r3[r8] = r9
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r16)
            r3[r5] = r8
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2)
            r8 = 2
            r3[r8] = r2
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r6, r2)
            r3[r15] = r4
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1, r6, r2)
            r2 = 4
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r7)
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r2, r1)
            r2 = 5
            r3[r2] = r1
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r23 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1 = r0._miniGameScreenRef
            r18 = 1
            float r2 = r24.getX()
            float r3 = r24.getOriginX()
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r4
            float r19 = r2 + r3
            float r2 = r24.getY()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r3
            float r20 = r2 - r4
            r2 = -1007681536(0xffffffffc3f00000, float:-480.0)
            float r3 = r3 * r2
            float r2 = r0._speedMultiple
            float r3 = r3 * r2
            float r21 = r3 * r10
            double r2 = java.lang.Math.random()
            float r2 = (float) r2
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = r2 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r22 = r2 * r3
            r17 = r1
            r17.addParticle(r18, r19, r20, r21, r22, r23)
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r2 = r0._soundHandlerRef
            com.badlogic.gdx.audio.Sound r3 = r2.sndFootstep1
            r4 = 1042536202(0x3e23d70a, float:0.16)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L43e
            com.badlogic.gdx.audio.Sound r3 = r2.sndFootstep2
            goto L465
        L43e:
            r4 = 1051260355(0x3ea8f5c3, float:0.33)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L448
            com.badlogic.gdx.audio.Sound r3 = r2.sndFootstep3
            goto L465
        L448:
            r4 = 1056629064(0x3efae148, float:0.49)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L452
            com.badlogic.gdx.audio.Sound r3 = r2.sndFootstep4
            goto L465
        L452:
            r4 = 1059648963(0x3f28f5c3, float:0.66)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L45c
            com.badlogic.gdx.audio.Sound r3 = r2.sndFootstep5
            goto L465
        L45c:
            r4 = 1062333317(0x3f51eb85, float:0.82)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L465
            com.badlogic.gdx.audio.Sound r3 = r2.sndFootstep6
        L465:
            r1 = 1041865114(0x3e19999a, float:0.15)
            r2.playSound(r3, r1)
        L46b:
            int r1 = r0._state
            if (r1 != 0) goto L472
            r0._obstacleAvoidState = r5
            goto L4b5
        L472:
            if (r1 == r5) goto L49e
            r2 = 2
            if (r1 != r2) goto L478
            goto L49e
        L478:
            r2 = 4
            if (r1 != r2) goto L48c
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animSliding
            float r3 = r0._animationSeconds
            int r1 = r1.getKeyFrameIndex(r3)
            r3 = 5
            if (r1 < r3) goto L489
            r0._obstacleAvoidState = r5
            goto L4b5
        L489:
            r0._obstacleAvoidState = r2
            goto L4b5
        L48c:
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r0._animPunching
            float r3 = r0._animationSeconds
            int r1 = r1.getKeyFrameIndex(r3)
            if (r1 < r2) goto L499
            r0._obstacleAvoidState = r5
            goto L4b5
        L499:
            r1 = 8
            r0._obstacleAvoidState = r1
            goto L4b5
        L49e:
            float r1 = r24.getY()
            float r2 = r0._floorY
            r3 = 1119879168(0x42c00000, float:96.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r2 = r2 + r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L4b3
            r1 = 2
            r0._obstacleAvoidState = r1
            goto L4b5
        L4b3:
            r0._obstacleAvoidState = r5
        L4b5:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.remove()
            r1.clear()
            r0 = 0
            r1._miniGameScreenRef = r0
            r1._soundHandlerRef = r0
            r1._animRunning = r0
            r1._animJumpingUp = r0
            r1._animJumpingDown = r0
            r1._animPunching = r0
            r1._trDeathSplat = r0
            r1._trDeathExplosion = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r7, float r8) {
            r6 = this;
            super.draw(r7, r8)
            com.badlogic.gdx.graphics.Color r8 = r6.getColor()
            r7.setColor(r8)
            int r8 = r6._state
            if (r8 != 0) goto L1a
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r6._animRunning
            float r0 = r6._animationSeconds
            java.lang.Object r8 = r8.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
        L18:
            r1 = r8
            goto L5b
        L1a:
            r0 = 1
            if (r8 != r0) goto L28
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r6._animJumpingUp
            float r0 = r6._animationSeconds
            java.lang.Object r8 = r8.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
            goto L18
        L28:
            r0 = 2
            if (r8 != r0) goto L36
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r6._animJumpingDown
            float r0 = r6._animationSeconds
            java.lang.Object r8 = r8.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
            goto L18
        L36:
            r0 = 3
            if (r8 != r0) goto L44
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r6._animPunching
            float r0 = r6._animationSeconds
            java.lang.Object r8 = r8.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
            goto L18
        L44:
            r0 = 4
            if (r8 != r0) goto L52
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r6._animSliding
            float r0 = r6._animationSeconds
            java.lang.Object r8 = r8.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
            goto L18
        L52:
            r0 = 5
            if (r8 != r0) goto L58
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r6._trDeathSplat
            goto L18
        L58:
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r6._trDeathExplosion
            goto L18
        L5b:
            float r8 = r6.getX()
            float r0 = r6._backAndForthX
            float r2 = r8 + r0
            float r3 = r6.getY()
            int r8 = r1.getRegionWidth()
            float r4 = (float) r8
            int r8 = r1.getRegionHeight()
            float r5 = (float) r8
            r0 = r7
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    public int getObstacleAvoidState() {
            r1 = this;
            int r0 = r1._obstacleAvoidState
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1._state
            return r0
    }

    public void jump() {
            r3 = this;
            int r0 = r3._state
            if (r0 != 0) goto L14
            r0 = 1
            r3.setState(r0)
            r0 = 0
            r3._jumpingUpDustShown = r0
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r3._soundHandlerRef
            com.badlogic.gdx.audio.Sound r1 = r0.sndJump
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.playSound(r1, r2)
        L14:
            return
    }

    public void onDeath(boolean r7, float r8) {
            r6 = this;
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.onDeath(r1, r2, r3, r4, r5)
            return
    }

    public void onDeath(boolean r6, float r7, boolean r8, boolean r9, boolean r10) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1107296256(0x42000000, float:32.0)
            if (r6 == 0) goto La0
            int r6 = r5._state
            r2 = 1
            r3 = 2
            r4 = 1123024896(0x42f00000, float:120.0)
            if (r6 == r2) goto L58
            if (r6 != r3) goto L11
            goto L58
        L11:
            r10 = 4
            if (r6 != r10) goto L36
            if (r8 == 0) goto L25
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
            goto L8c
        L25:
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r8 = r8 * 2
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
            goto L8c
        L36:
            if (r9 == 0) goto L49
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r8 = r8 * 2
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
            goto L8c
        L49:
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
            goto L8c
        L58:
            if (r10 == 0) goto L6b
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r8 = r8 * 3
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
            goto L8c
        L6b:
            if (r9 == 0) goto L7e
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            int r8 = r8 * 2
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
            goto L8c
        L7e:
            float r6 = r5._floorY
            int r8 = org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle.singleBlockSize
            float r8 = (float) r8
            float r6 = r6 + r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r4
            float r6 = r6 - r8
            r5.setY(r6)
        L8c:
            r6 = 5
            r5.setState(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r1
            float r7 = r7 - r6
            r5.setX(r7)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r6 = r5._soundHandlerRef
            com.badlogic.gdx.audio.Sound r7 = r6.sndDeathSplat
            r6.playSound(r7, r0)
            goto Lbf
        La0:
            r6 = 6
            r5.setState(r6)
            r6 = 1126957056(0x432c0000, float:172.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r6
            float r7 = r7 - r8
            r5.setX(r7)
            float r6 = r5._floorY
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r1
            float r6 = r6 - r7
            r5.setY(r6)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r6 = r5._soundHandlerRef
            com.badlogic.gdx.audio.Sound r7 = r6.sndDeathSplat
            r6.playSound(r7, r0)
        Lbf:
            return
    }

    public void punch() {
            r3 = this;
            int r0 = r3._state
            if (r0 != 0) goto L14
            r0 = 3
            r3.setState(r0)
            r0 = 0
            r3._punchingDustShown = r0
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r3._soundHandlerRef
            com.badlogic.gdx.audio.Sound r1 = r0.sndPunchSwing
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.playSound(r1, r2)
        L14:
            return
    }

    public void setFloorAndJumpY(float r1, float r2) {
            r0 = this;
            r0._floorY = r1
            r0._jumpY = r2
            return
    }

    public void setSpeedMultiple(float r3) {
            r2 = this;
            r2._speedMultiple = r3
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = r2._animRunning
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 / r3
            r0.setFrameDuration(r1)
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r3 = r2._animJumpingUp
            float r0 = r2._speedMultiple
            r1 = 1041865114(0x3e19999a, float:0.15)
            float r0 = r1 / r0
            r3.setFrameDuration(r0)
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r3 = r2._animJumpingDown
            float r0 = r2._speedMultiple
            float r0 = r1 / r0
            r3.setFrameDuration(r0)
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r3 = r2._animPunching
            float r0 = r2._speedMultiple
            float r0 = r1 / r0
            r3.setFrameDuration(r0)
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r3 = r2._animSliding
            float r0 = r2._speedMultiple
            float r1 = r1 / r0
            r3.setFrameDuration(r1)
            return
    }

    public void slide() {
            r3 = this;
            int r0 = r3._state
            if (r0 != 0) goto L12
            r0 = 4
            r3.setState(r0)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r3._soundHandlerRef
            com.badlogic.gdx.audio.Sound r1 = r0.sndSlide
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r0.playSound(r1, r2)
        L12:
            return
    }
}
