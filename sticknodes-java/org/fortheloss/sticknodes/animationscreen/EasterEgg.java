package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class EasterEgg implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.Color _backgroundColor;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _backgroundTR;
    private float _bgAlpha;
    private float _bgOffset;
    private float _buildup;
    private float _canvasHeight;
    private float _canvasWidth;
    private float _canvasX;
    private float _canvasY;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _face2TR;
    private float _faceAlpha;
    private float _facePositionX;
    private float _facePositionY;
    private float _facePositionYPopupStart;
    private float _faceRotation;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _faceTR;
    private boolean _flagDrawStickfigureFace;
    private int _fromBlackout1To;
    private boolean _isComplete;
    private boolean _isShakingScreen;
    private com.badlogic.gdx.graphics.Color _lerpedColor;
    private com.badlogic.gdx.graphics.g2d.TextureAtlas _ownedAtlas;
    private float _randomFlashBlackChance;
    private float _screenHeight;
    private float _screenWidth;
    private float _smoke1Alpha;
    private float _smoke1PositionX;
    private float _smoke1PositionY;
    private float _smoke1Scale;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _smoke1TR;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _smoke2TR;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg.SmokeBall> _smokeBalls;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _squareTR;
    private int _state;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _stickfigureDistortedTR;
    private float _stickfigureOffsetX;
    private float _stickfigureOffsetY;
    private float _stickfigurePositionX;
    private float _stickfigurePositionY;
    private float _stickfigurePositionYPopupStart;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _stickfigureTR;
    private float _timer;

    private class SmokeBall {
        public float alpha;
        public float cos;
        public int direction;
        public float height;
        public float originX;
        public float originY;
        public float rotation;
        public float scale;
        public float sin;
        public float speed;
        public float speedStart;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.EasterEgg this$0;
        public float width;
        public float x;
        public float y;

        private SmokeBall(org.fortheloss.sticknodes.animationscreen.EasterEgg r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.alpha = r1
                r0.speed = r1
                r0.speedStart = r1
                r0.rotation = r1
                r0.cos = r1
                r0.sin = r1
                r0.x = r1
                r0.y = r1
                r0.width = r1
                r0.height = r1
                r0.originX = r1
                r0.originY = r1
                r0.scale = r1
                r1 = 0
                r0.direction = r1
                return
        }

        /* synthetic */ SmokeBall(org.fortheloss.sticknodes.animationscreen.EasterEgg r1, org.fortheloss.sticknodes.animationscreen.EasterEgg.SmokeBallIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void move(float r5) {
                r4 = this;
                float r0 = r4.x
                float r1 = r4.speed
                float r2 = r4.cos
                float r2 = r2 * r1
                r3 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 * r3
                float r2 = r2 * r5
                float r0 = r0 + r2
                r4.x = r0
                float r0 = r4.y
                float r2 = r4.sin
                float r2 = r2 * r1
                float r2 = r2 * r3
                float r2 = r2 * r5
                float r0 = r0 + r2
                r4.y = r0
                float r0 = r4.scale
                float r1 = r1 * r5
                r2 = 1008981770(0x3c23d70a, float:0.01)
                float r1 = r1 * r2
                float r0 = r0 + r1
                r4.scale = r0
                float r0 = r4.rotation
                r1 = 1097859072(0x41700000, float:15.0)
                float r5 = r5 * r1
                int r1 = r4.direction
                float r1 = (float) r1
                float r5 = r5 * r1
                float r0 = r0 + r5
                r4.rotation = r0
                return
        }

        public void setAngle(float r2, int r3) {
                r1 = this;
                float r0 = com.badlogic.gdx.math.MathUtils.cosDeg(r2)
                r1.cos = r0
                float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r2)
                r1.sin = r2
                r1.direction = r3
                return
        }

        public void setPosition(float r1, float r2) {
                r0 = this;
                r0.x = r1
                r0.y = r2
                return
        }

        public void setScale(float r1) {
                r0 = this;
                r0.scale = r1
                return
        }

        public void setSize(float r2, float r3) {
                r1 = this;
                r1.width = r2
                r1.height = r3
                r0 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r0
                r1.originX = r2
                float r3 = r3 / r0
                r1.originY = r3
                return
        }

        public void setSpeed(float r1) {
                r0 = this;
                r0.speed = r1
                r0.speedStart = r1
                return
        }
    }

    /* compiled from: R8$$SyntheticClass */
    /* renamed from: org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall-IA, reason: invalid class name */
    public final /* synthetic */ class SmokeBallIA {
    }

    public EasterEgg() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._buildup = r0
            r1 = 1
            r3._isShakingScreen = r1
            r3._screenWidth = r0
            r3._screenHeight = r0
            r3._canvasX = r0
            r3._canvasY = r0
            r3._canvasWidth = r0
            r3._canvasHeight = r0
            r3._timer = r0
            r3._bgAlpha = r0
            r3._bgOffset = r0
            r3._stickfigurePositionX = r0
            r3._stickfigurePositionY = r0
            r3._stickfigureOffsetX = r0
            r3._stickfigureOffsetY = r0
            r1 = 0
            r3._flagDrawStickfigureFace = r1
            r3._facePositionX = r0
            r3._facePositionY = r0
            r3._faceRotation = r0
            r3._faceAlpha = r0
            r3._smoke1PositionX = r0
            r3._smoke1PositionY = r0
            r3._smoke1Scale = r0
            r3._smoke1Alpha = r0
            r3._randomFlashBlackChance = r0
            r2 = 2
            r3._fromBlackout1To = r2
            r3._stickfigurePositionYPopupStart = r0
            r3._facePositionYPopupStart = r0
            r3._isComplete = r1
            r3._state = r1
            return
    }

    public void act(float r14) {
            r13 = this;
            float r0 = r13._timer
            float r0 = r0 + r14
            r13._timer = r0
            float r1 = r13._buildup
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1b
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 * r14
            float r1 = r1 + r3
            r13._buildup = r1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1b
            r13._buildup = r2
        L1b:
            int r1 = r13._state
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L2e
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 < 0) goto L1dd
            r13._timer = r4
            r13._fromBlackout1To = r3
            r13._state = r5
            goto L1dd
        L2e:
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r5) goto L3e
            int r14 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r14 < 0) goto L1dd
            r13._timer = r4
            int r14 = r13._fromBlackout1To
            r13._state = r14
            goto L1dd
        L3e:
            r7 = 4
            r8 = 1069547520(0x3fc00000, float:1.5)
            if (r1 != r7) goto L4b
            int r14 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r14 < 0) goto L1dd
            r13._isComplete = r5
            goto L1dd
        L4b:
            r9 = 3
            r10 = 1082130432(0x40800000, float:4.0)
            if (r1 != r9) goto L8a
            r14 = 1078774989(0x404ccccd, float:3.2)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 < 0) goto L5b
            r13._timer = r4
            r13._state = r7
        L5b:
            float r0 = r13._timer
            int r1 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r1 < 0) goto L1dd
            float r0 = r0 - r14
            r14 = 1061997772(0x3f4ccccc, float:0.79999995)
            float r0 = r0 / r14
            float r14 = java.lang.Math.min(r0, r2)
            com.badlogic.gdx.math.Interpolation$ExpOut r0 = com.badlogic.gdx.math.Interpolation.exp10Out
            float r1 = r13._stickfigurePositionYPopupStart
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1150681088(0x44960000, float:1200.0)
            float r2 = r2 * r3
            float r2 = r2 + r1
            float r1 = r0.apply(r1, r2, r14)
            r13._stickfigurePositionY = r1
            float r1 = r13._facePositionYPopupStart
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            float r2 = r2 + r1
            float r14 = r0.apply(r1, r2, r14)
            r13._facePositionY = r14
            goto L1dd
        L8a:
            if (r1 != r3) goto L1dd
            r1 = 1086324736(0x40c00000, float:6.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 < 0) goto L10d
            r13._timer = r4
            r13._fromBlackout1To = r9
            r13._state = r5
            com.badlogic.gdx.graphics.Color r14 = r13._lerpedColor
            com.badlogic.gdx.graphics.Color r0 = r13._backgroundColor
            float r1 = r0.r
            float r3 = r0.g
            float r0 = r0.b
            r14.set(r1, r3, r0, r2)
            r14 = 0
            r13._isShakingScreen = r14
            float r14 = r13._canvasX
            float r0 = r13._canvasWidth
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r13._stickfigureDistortedTR
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            float r0 = r0 * r6
            float r14 = r14 + r0
            r13._stickfigurePositionX = r14
            com.badlogic.gdx.graphics.g2d.TextureRegion r14 = r13._stickfigureDistortedTR
            int r14 = r14.getRegionHeight()
            int r14 = -r14
            float r14 = (float) r14
            float r14 = r14 * r2
            r0 = 1114636288(0x42700000, float:60.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            float r14 = r14 - r1
            r13._stickfigurePositionY = r14
            r13._stickfigurePositionYPopupStart = r14
            float r14 = r13._stickfigurePositionX
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r13._stickfigureDistortedTR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            float r0 = r0 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r13._faceTR
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 * r8
            float r0 = r0 - r1
            float r0 = r0 * r6
            float r14 = r14 + r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            float r14 = r14 - r0
            r13._facePositionX = r14
            float r14 = r13._stickfigurePositionY
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r13._stickfigureDistortedTR
            int r0 = r0.getRegionHeight()
            float r0 = (float) r0
            float r0 = r0 * r2
            float r14 = r14 + r0
            r0 = 1150066688(0x448ca000, float:1125.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            float r14 = r14 - r1
            r13._facePositionY = r14
            r13._facePositionYPopupStart = r14
            goto L1dd
        L10d:
            float r0 = r0 / r1
            float r0 = java.lang.Math.min(r0, r2)
            float r3 = r13._timer
            r4 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r4
            double r6 = (double) r3
            double r6 = java.lang.Math.sin(r6)
            float r3 = (float) r6
            r6 = 1028443341(0x3d4ccccd, float:0.05)
            float r3 = r3 * r6
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 + r6
            float r3 = r3 * r0
            r13._bgAlpha = r3
            double r6 = java.lang.Math.random()
            float r3 = (float) r6
            float r3 = r3 * r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            r13._bgOffset = r3
            r3 = 1090519040(0x41000000, float:8.0)
            float r4 = r4 * r3
            double r6 = java.lang.Math.random()
            float r3 = (float) r6
            float r3 = r3 * r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            float r3 = r3 - r4
            float r3 = r3 * r0
            r13._stickfigureOffsetX = r3
            double r11 = java.lang.Math.random()
            float r3 = (float) r11
            float r3 = r3 * r4
            float r3 = r3 * r6
            float r3 = r3 - r4
            float r3 = r3 * r0
            r13._stickfigureOffsetY = r3
            float r3 = r13._timer
            float r3 = r3 / r1
            float r3 = java.lang.Math.min(r3, r2)
            r13._smoke1Alpha = r3
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sineOut
            r4 = 1084227584(0x40a00000, float:5.0)
            float r6 = r13._timer
            float r6 = r6 / r1
            float r6 = java.lang.Math.min(r6, r2)
            float r3 = r3.apply(r2, r4, r6)
            r13._smoke1Scale = r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r3 = r13._smokeBalls
            int r3 = r3.size()
            int r3 = r3 - r5
        L17b:
            if (r3 < 0) goto L1a9
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r4 = r13._smokeBalls
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall r4 = (org.fortheloss.sticknodes.animationscreen.EasterEgg.SmokeBall) r4
            float r6 = r13._timer
            float r6 = r6 / r1
            float r6 = java.lang.Math.min(r6, r2)
            r4.alpha = r6
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.sineOut
            float r7 = r4.speedStart
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            float r11 = r13._timer
            float r11 = r11 / r1
            float r11 = java.lang.Math.min(r11, r2)
            float r6 = r6.apply(r7, r9, r11)
            r4.speed = r6
            r4.move(r14)
            int r3 = r3 + (-1)
            goto L17b
        L1a9:
            float r3 = r13._timer
            float r3 = r3 / r1
            float r1 = java.lang.Math.min(r3, r2)
            r3 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r3
            r13._randomFlashBlackChance = r1
            float r1 = r13._timer
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L1cd
            r13._flagDrawStickfigureFace = r5
            float r1 = r13._faceAlpha
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1cd
            float r1 = r1 + r14
            r13._faceAlpha = r1
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 < 0) goto L1cd
            r13._faceAlpha = r2
        L1cd:
            double r1 = java.lang.Math.random()
            float r14 = (float) r1
            r1 = 1106247680(0x41f00000, float:30.0)
            float r14 = r14 * r1
            r1 = 1097859072(0x41700000, float:15.0)
            float r14 = r14 - r1
            float r14 = r14 * r0
            r13._faceRotation = r14
        L1dd:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = r2._ownedAtlas
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._ownedAtlas = r1
        La:
            r2._backgroundColor = r1
            r2._lerpedColor = r1
            r2._squareTR = r1
            r2._backgroundTR = r1
            r2._stickfigureTR = r1
            r2._stickfigureDistortedTR = r1
            r2._smoke1TR = r1
            r2._smoke2TR = r1
            r2._faceTR = r1
            r2._face2TR = r1
            r2._smokeBalls = r1
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch r19) {
            r18 = this;
            r0 = r18
            r12 = r19
            int r1 = r0._state
            if (r1 != 0) goto L9
            return
        L9:
            r13 = 1
            r14 = 1082130432(0x40800000, float:4.0)
            r15 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r13) goto L14
            r2 = 4
            if (r1 != r2) goto L2d
        L14:
            r12.setColor(r15, r15, r15, r11)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._squareTR
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4 = -1073741824(0xffffffffc0000000, float:-2.0)
            float r1 = r0._screenWidth
            float r5 = r1 + r14
            float r1 = r0._screenHeight
            float r6 = r1 + r14
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6)
            r12.setColor(r11, r11, r11, r11)
        L2d:
            int r1 = r0._state
            r2 = 2
            if (r1 != r2) goto L128
            float r1 = r0._bgAlpha
            r12.setColor(r11, r11, r11, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._backgroundTR
            float r1 = r0._bgOffset
            float r3 = -r1
            float r4 = -r1
            float r5 = r0._screenWidth
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r1 * r6
            float r5 = r5 + r7
            float r7 = r0._screenHeight
            float r1 = r1 * r6
            float r6 = r7 + r1
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._smoke1TR
            int r1 = r1.getRegionWidth()
            float r7 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._smoke1TR
            int r1 = r1.getRegionHeight()
            float r8 = (float) r1
            float r1 = r0._smoke1Alpha
            r12.setColor(r11, r11, r11, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._smoke1TR
            float r3 = r0._smoke1PositionX
            float r4 = r0._smoke1PositionY
            r16 = 1056964608(0x3f000000, float:0.5)
            float r5 = r7 * r16
            float r6 = r8 * r16
            float r10 = r0._smoke1Scale
            r17 = 0
            r1 = r19
            r9 = r10
            r14 = 1065353216(0x3f800000, float:1.0)
            r11 = r17
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r1 = r0._smokeBalls
            int r1 = r1.size()
            int r1 = r1 - r13
            r13 = r1
        L84:
            if (r13 < 0) goto Lae
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r1 = r0._smokeBalls
            java.lang.Object r1 = r1.get(r13)
            org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall r1 = (org.fortheloss.sticknodes.animationscreen.EasterEgg.SmokeBall) r1
            float r2 = r1.alpha
            r12.setColor(r14, r14, r14, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._smoke2TR
            float r3 = r1.x
            float r4 = r1.y
            float r5 = r1.originX
            float r6 = r1.originY
            float r7 = r1.width
            float r8 = r1.height
            float r10 = r1.scale
            float r11 = r1.rotation
            r1 = r19
            r9 = r10
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r13 = r13 + (-1)
            goto L84
        Lae:
            double r1 = java.lang.Math.random()
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lbb
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._stickfigureDistortedTR
            goto Lbd
        Lbb:
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._stickfigureTR
        Lbd:
            r12.setColor(r14, r14, r14, r14)
            float r2 = r0._stickfigurePositionX
            float r3 = r0._stickfigureOffsetX
            float r2 = r2 + r3
            float r3 = r0._stickfigurePositionY
            float r4 = r0._stickfigureOffsetY
            float r3 = r3 + r4
            r12.draw(r1, r2, r3)
            boolean r1 = r0._flagDrawStickfigureFace
            if (r1 == 0) goto Lff
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._faceTR
            int r1 = r1.getRegionWidth()
            float r7 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._faceTR
            int r1 = r1.getRegionHeight()
            float r8 = (float) r1
            float r1 = r0._faceAlpha
            r12.setColor(r14, r14, r14, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._faceTR
            float r1 = r0._facePositionX
            float r3 = r0._stickfigureOffsetX
            float r3 = r3 + r1
            float r1 = r0._facePositionY
            float r4 = r0._stickfigureOffsetY
            float r4 = r4 + r1
            float r5 = r7 * r16
            float r6 = r8 * r16
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r0._faceRotation
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        Lff:
            double r1 = java.lang.Math.random()
            float r3 = r0._randomFlashBlackChance
            double r3 = (double) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L124
            r12.setColor(r15, r15, r15, r14)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._squareTR
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4 = -1073741824(0xffffffffc0000000, float:-2.0)
            float r1 = r0._screenWidth
            r5 = 1082130432(0x40800000, float:4.0)
            float r6 = r1 + r5
            float r1 = r0._screenHeight
            float r7 = r1 + r5
            r1 = r19
            r5 = r6
            r6 = r7
            r1.draw(r2, r3, r4, r5, r6)
        L124:
            r12.setColor(r14, r14, r14, r14)
            goto L12a
        L128:
            r14 = 1065353216(0x3f800000, float:1.0)
        L12a:
            int r1 = r0._state
            r2 = 3
            if (r1 != r2) goto L1a5
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r1 = r1 * r2
            double r3 = java.lang.Math.random()
            float r3 = (float) r3
            r4 = 1109393408(0x42200000, float:40.0)
            float r3 = r3 * r4
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            float r7 = r1 + r3
            float r5 = r5 * r2
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            float r1 = r1 * r4
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r8 = r5 + r1
            r12.setColor(r14, r14, r14, r14)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._stickfigureDistortedTR
            float r1 = r0._stickfigurePositionX
            float r3 = r1 + r7
            float r1 = r0._stickfigurePositionY
            float r4 = r1 + r8
            int r1 = r2.getRegionWidth()
            float r1 = (float) r1
            r9 = 1092616192(0x41200000, float:10.0)
            float r5 = r1 * r9
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._stickfigureDistortedTR
            int r1 = r1.getRegionHeight()
            float r1 = (float) r1
            float r6 = r1 * r9
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6)
            float r1 = r0._faceAlpha
            r12.setColor(r14, r14, r14, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._face2TR
            float r1 = r0._facePositionX
            float r3 = r1 + r7
            float r1 = r0._facePositionY
            float r4 = r1 + r8
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._faceTR
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            float r1 = r1 * r9
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r6 = r1 * r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._faceTR
            int r1 = r1.getRegionHeight()
            float r1 = (float) r1
            float r1 = r1 * r9
            float r7 = r1 * r5
            r1 = r19
            r5 = r6
            r6 = r7
            r1.draw(r2, r3, r4, r5, r6)
        L1a5:
            return
    }

    public float getBuildup() {
            r1 = this;
            float r0 = r1._buildup
            return r0
    }

    public com.badlogic.gdx.graphics.Color getLerpedColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._lerpedColor
            return r0
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r6, float r7, float r8, float r9, float r10, float r11, float r12, com.badlogic.gdx.graphics.Color r13) {
            r5 = this;
            r5._ownedAtlas = r6
            r5._screenWidth = r7
            r5._screenHeight = r8
            r5._canvasX = r9
            r5._canvasY = r10
            r5._canvasWidth = r11
            r5._canvasHeight = r12
            com.badlogic.gdx.graphics.Color r7 = new com.badlogic.gdx.graphics.Color
            r7.<init>(r13)
            r5._backgroundColor = r7
            com.badlogic.gdx.graphics.Color r7 = new com.badlogic.gdx.graphics.Color
            r8 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r8, r8, r8)
            r5._lerpedColor = r7
            java.lang.String r7 = "sq"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._squareTR = r7
            java.lang.String r7 = "ditbg"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._backgroundTR = r7
            java.lang.String r7 = "stg"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._stickfigureTR = r7
            java.lang.String r7 = "stdit"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._stickfigureDistortedTR = r7
            java.lang.String r7 = "fc"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._faceTR = r7
            java.lang.String r7 = "cf"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._face2TR = r7
            java.lang.String r7 = "smo"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5._smoke1TR = r7
            java.lang.String r7 = "smt"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r6.findRegion(r7)
            r5._smoke2TR = r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r5._stickfigureTR
            int r6 = r6.getRegionWidth()
            float r6 = (float) r6
            float r6 = r11 - r6
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            float r6 = r6 + r9
            r5._stickfigurePositionX = r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r5._stickfigureTR
            int r6 = r6.getRegionHeight()
            float r6 = (float) r6
            float r6 = r12 - r6
            float r6 = r6 * r7
            float r6 = r6 + r10
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1090519040(0x41000000, float:8.0)
            float r13 = r13 * r0
            float r6 = r6 + r13
            r5._stickfigurePositionY = r6
            float r6 = r5._stickfigurePositionX
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r5._stickfigureTR
            int r13 = r13.getRegionWidth()
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._faceTR
            int r0 = r0.getRegionWidth()
            int r13 = r13 - r0
            float r13 = (float) r13
            float r13 = r13 * r7
            float r6 = r6 + r13
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1082130432(0x40800000, float:4.0)
            float r13 = r13 * r0
            float r6 = r6 - r13
            r5._facePositionX = r6
            float r6 = r5._stickfigurePositionY
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r5._stickfigureTR
            int r13 = r13.getRegionHeight()
            float r13 = (float) r13
            float r6 = r6 + r13
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1119092736(0x42b40000, float:90.0)
            float r13 = r13 * r0
            float r6 = r6 - r13
            r5._facePositionY = r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r5._smoke1TR
            int r6 = r6.getRegionWidth()
            float r6 = (float) r6
            float r6 = r11 - r6
            float r6 = r6 * r7
            float r6 = r6 + r9
            r5._smoke1PositionX = r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r5._smoke1TR
            int r6 = r6.getRegionHeight()
            float r6 = (float) r6
            float r6 = r12 - r6
            float r6 = r6 * r7
            float r6 = r6 + r10
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1115684864(0x42800000, float:64.0)
            float r13 = r13 * r0
            float r6 = r6 - r13
            r5._smoke1PositionY = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5._smokeBalls = r6
            org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall r6 = new org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall
            r13 = 0
            r6.<init>(r5, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._smoke2TR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r5._smoke2TR
            int r1 = r1.getRegionHeight()
            float r1 = (float) r1
            r6.setSize(r0, r1)
            r0 = 1123024896(0x42f00000, float:120.0)
            r1 = 1
            r6.setAngle(r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._smoke2TR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            float r0 = r11 - r0
            float r0 = r0 * r7
            float r0 = r0 + r9
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._smoke2TR
            int r2 = r2.getRegionWidth()
            float r2 = (float) r2
            float r2 = r12 - r2
            float r2 = r2 * r7
            float r2 = r2 + r10
            r6.setPosition(r0, r2)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r2
            r6.setSpeed(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            r6.setScale(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r0 = r5._smokeBalls
            r0.add(r6)
            org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall r6 = new org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall
            r6.<init>(r5, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._smoke2TR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r5._smoke2TR
            int r3 = r3.getRegionHeight()
            float r3 = (float) r3
            r6.setSize(r0, r3)
            r0 = 1097859072(0x41700000, float:15.0)
            r3 = -1
            r6.setAngle(r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._smoke2TR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            float r0 = r11 - r0
            float r0 = r0 * r7
            float r0 = r0 + r9
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r5._smoke2TR
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            float r4 = r12 - r4
            float r4 = r4 * r7
            float r4 = r4 + r10
            r6.setPosition(r0, r4)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            r6.setSpeed(r0)
            r6.setScale(r8)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r0 = r5._smokeBalls
            r0.add(r6)
            org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall r6 = new org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall
            r6.<init>(r5, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._smoke2TR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._smoke2TR
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            r6.setSize(r0, r2)
            r0 = 1130430464(0x43610000, float:225.0)
            r6.setAngle(r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r5._smoke2TR
            int r0 = r0.getRegionWidth()
            float r0 = (float) r0
            float r0 = r11 - r0
            float r0 = r0 * r7
            float r0 = r0 + r9
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._smoke2TR
            int r2 = r2.getRegionWidth()
            float r2 = (float) r2
            float r2 = r12 - r2
            float r2 = r2 * r7
            float r2 = r2 + r10
            r6.setPosition(r0, r2)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1114636288(0x42700000, float:60.0)
            float r0 = r0 * r2
            r6.setSpeed(r0)
            r6.setScale(r8)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r8 = r5._smokeBalls
            r8.add(r6)
            org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall r6 = new org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall
            r6.<init>(r5, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r5._smoke2TR
            int r8 = r8.getRegionWidth()
            float r8 = (float) r8
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r5._smoke2TR
            int r13 = r13.getRegionHeight()
            float r13 = (float) r13
            r6.setSize(r8, r13)
            r8 = 1134231552(0x439b0000, float:310.0)
            r6.setAngle(r8, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r5._smoke2TR
            int r8 = r8.getRegionWidth()
            float r8 = (float) r8
            float r11 = r11 - r8
            float r11 = r11 * r7
            float r9 = r9 + r11
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r5._smoke2TR
            int r8 = r8.getRegionWidth()
            float r8 = (float) r8
            float r12 = r12 - r8
            float r12 = r12 * r7
            float r10 = r10 + r12
            r6.setPosition(r9, r10)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1106247680(0x41f00000, float:30.0)
            float r7 = r7 * r8
            r6.setSpeed(r7)
            r7 = 1069547520(0x3fc00000, float:1.5)
            r6.setScale(r7)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.EasterEgg$SmokeBall> r7 = r5._smokeBalls
            r7.add(r6)
            return
    }

    public boolean isComplete() {
            r1 = this;
            boolean r0 = r1._isComplete
            return r0
    }

    public boolean isShakingScreen() {
            r1 = this;
            boolean r0 = r1._isShakingScreen
            return r0
    }
}
