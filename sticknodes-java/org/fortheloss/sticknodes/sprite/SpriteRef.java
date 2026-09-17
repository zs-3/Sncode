package org.fortheloss.sticknodes.sprite;

/* loaded from: classes2.dex */
public class SpriteRef implements org.fortheloss.sticknodes.animationscreen.IDrawableFigure {
    public static boolean FLAG_RESET_ALPHA = true;
    private static boolean drag_is_origin_based;
    private static final com.badlogic.gdx.math.Vector2 funcVec1 = null;
    private static final com.badlogic.gdx.math.Vector2 funcVec2 = null;
    private static final com.badlogic.gdx.math.Vector2 funcVec3 = null;
    private static final com.badlogic.gdx.math.Vector2 funcVec4 = null;
    private static final com.badlogic.gdx.math.Matrix4 mRememberedTransformationMatrix = null;
    private static final float[] renderVerts = null;
    private static boolean scale_is_linked;
    private static final com.badlogic.gdx.math.Vector2 temp = null;
    private static final com.badlogic.gdx.math.Vector2 tempL1 = null;
    private static final com.badlogic.gdx.math.Vector2 tempL2 = null;
    private static final com.badlogic.gdx.math.Vector2 tempNP = null;
    private static final com.badlogic.gdx.math.Vector2 tempP = null;
    private boolean _isMotionBlur;
    private int _motionBlurAngle;
    private float _outlineAlpha;
    private com.badlogic.gdx.graphics.Color _outlineColor;
    private float _outlineThickness;
    private int _pixelation;
    private float mAngle;
    private float mBlur;
    private boolean mColorIsInverted;
    private boolean mDoNotDraw;
    private float mDsAlpha;
    private int mDsAngle;
    private float mDsBlur;
    private com.badlogic.gdx.graphics.Color mDsColor;
    private int mDsDistance;
    private byte mFlagLockedToCamera;
    private float mGlow;
    private com.badlogic.gdx.graphics.Color mGlowColor;
    private float mGlowIntensity;
    private float mHueShift;
    private int mId;
    private boolean mIsFlippedX;
    private boolean mIsFlippedY;
    private boolean mIsJoined;
    private boolean mIsPersistentWhenTweening;
    private boolean mIsUsingJoinParentFilters;
    private float mJoinOffsetAngle;
    private org.fortheloss.sticknodes.stickfigure.StickNode mJoinedToNodeRef;
    private int mLockState;
    private org.fortheloss.sticknodes.sprite.SpriteNode mMainNode;
    protected com.badlogic.gdx.math.Vector2 mOrigin;
    private com.badlogic.gdx.math.Vector2 mPosition;
    private float mSSCalcDefaultAngleFromNode;
    private float mSSCalcDefaultHeight;
    private float mSSCalcDefaultWidth;
    private float mSSCalcNegativeDiff;
    private float mSSRememberedAngle;
    private float mSSRememberedNodeAngle;
    private float mSSRememberedNodeLength;
    private float mSSRememberedScale;
    private float mSSRememberedStickfigureScale;
    private float mSaturation;
    private float mScaleX;
    private float mScaleXYRatio;
    private float mScaleY;
    private int mSmartStretchState;
    private org.fortheloss.sticknodes.sprite.SpriteSource mSpriteSourceRef;
    private float mTintAmount;
    private com.badlogic.gdx.graphics.Color mTintColor;
    private float mTransparency;
    private byte mTweenMode;
    private org.fortheloss.sticknodes.sprite.SpriteNode mVersatileNode;
    private boolean mVisibleInOnionSkin;
    private boolean meKeepJoinDuringInterpolation;
    private boolean motionBlurIsOneDirection;

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.funcVec1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.funcVec2 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.funcVec3 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.funcVec4 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.temp = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.tempL1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.tempL2 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.tempP = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.tempNP = r0
            r0 = 1
            org.fortheloss.sticknodes.sprite.SpriteRef.scale_is_linked = r0
            r0 = 0
            org.fortheloss.sticknodes.sprite.SpriteRef.drag_is_origin_based = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteRef.mRememberedTransformationMatrix = r0
            r0 = 20
            float[] r0 = new float[r0]
            org.fortheloss.sticknodes.sprite.SpriteRef.renderVerts = r0
            return
    }

    public SpriteRef() {
            r5 = this;
            r5.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.mTransparency = r0
            r1 = 0
            r5.mBlur = r1
            r2 = 0
            r5._isMotionBlur = r2
            r5.motionBlurIsOneDirection = r2
            r5._motionBlurAngle = r2
            r5.mSaturation = r0
            r3 = 1
            r5._pixelation = r3
            r5.mTintAmount = r1
            r5.mHueShift = r1
            r5.mColorIsInverted = r2
            r5.mGlow = r1
            r5.mGlowIntensity = r0
            r5._outlineAlpha = r0
            r5._outlineThickness = r1
            r5.mDsAlpha = r1
            r4 = 10
            r5.mDsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r5.mDsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r5.mDsBlur = r4
            r4 = -1
            r5.mId = r4
            r5.mDoNotDraw = r2
            r5.mIsJoined = r2
            r5.mJoinOffsetAngle = r1
            r5.mFlagLockedToCamera = r2
            r5.mIsFlippedX = r2
            r5.mIsFlippedY = r2
            r5.mAngle = r1
            r5.mScaleXYRatio = r0
            r5.mScaleX = r0
            r5.mScaleY = r0
            r5.mLockState = r2
            r5.meKeepJoinDuringInterpolation = r3
            r5.mIsUsingJoinParentFilters = r2
            r5.mIsPersistentWhenTweening = r2
            r5.mTweenMode = r3
            r5.mVisibleInOnionSkin = r3
            r5.mSmartStretchState = r2
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = new org.fortheloss.sticknodes.sprite.SpriteNode
            r3 = 0
            r2.<init>(r5, r3)
            r5.mMainNode = r2
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = new org.fortheloss.sticknodes.sprite.SpriteNode
            r3.<init>(r5, r2)
            r5.mVersatileNode = r3
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r5.mPosition = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r5.mOrigin = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>(r0, r0, r0, r0)
            r5.mTintColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r3 = 1058444951(0x3f169697, float:0.5882353)
            r2.<init>(r1, r3, r0, r0)
            r5.mGlowColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>(r0, r1, r3, r0)
            r5._outlineColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>(r1, r1, r1, r0)
            r5.mDsColor = r2
            return
    }

    public SpriteRef(org.fortheloss.sticknodes.sprite.SpriteRef r6) {
            r5 = this;
            r5.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.mTransparency = r0
            r1 = 0
            r5.mBlur = r1
            r2 = 0
            r5._isMotionBlur = r2
            r5.motionBlurIsOneDirection = r2
            r5._motionBlurAngle = r2
            r5.mSaturation = r0
            r3 = 1
            r5._pixelation = r3
            r5.mTintAmount = r1
            r5.mHueShift = r1
            r5.mColorIsInverted = r2
            r5.mGlow = r1
            r5.mGlowIntensity = r0
            r5._outlineAlpha = r0
            r5._outlineThickness = r1
            r5.mDsAlpha = r1
            r4 = 10
            r5.mDsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r5.mDsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r5.mDsBlur = r4
            r4 = -1
            r5.mId = r4
            r5.mDoNotDraw = r2
            r5.mIsJoined = r2
            r5.mJoinOffsetAngle = r1
            r5.mFlagLockedToCamera = r2
            r5.mIsFlippedX = r2
            r5.mIsFlippedY = r2
            r5.mAngle = r1
            r5.mScaleXYRatio = r0
            r5.mScaleX = r0
            r5.mScaleY = r0
            r5.mLockState = r2
            r5.meKeepJoinDuringInterpolation = r3
            r5.mIsUsingJoinParentFilters = r2
            r5.mIsPersistentWhenTweening = r2
            r5.mTweenMode = r3
            r5.mVisibleInOnionSkin = r3
            r5.mSmartStretchState = r2
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r6.mSpriteSourceRef
            r5.mSpriteSourceRef = r0
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = new org.fortheloss.sticknodes.sprite.SpriteNode
            org.fortheloss.sticknodes.sprite.SpriteNode r1 = r6.mMainNode
            r2 = 0
            r0.<init>(r5, r2, r1)
            r5.mMainNode = r0
            org.fortheloss.sticknodes.sprite.SpriteNode r1 = new org.fortheloss.sticknodes.sprite.SpriteNode
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = r6.mVersatileNode
            r1.<init>(r5, r0, r2)
            r5.mVersatileNode = r1
            int r0 = r6.mId
            r5.mId = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            com.badlogic.gdx.math.Vector2 r1 = r6.mPosition
            r0.<init>(r1)
            r5.mPosition = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            com.badlogic.gdx.math.Vector2 r1 = r6.mOrigin
            r0.<init>(r1)
            r5.mOrigin = r0
            boolean r0 = r6.mIsFlippedX
            r5.mIsFlippedX = r0
            boolean r0 = r6.mIsFlippedY
            r5.mIsFlippedY = r0
            float r0 = r6.mAngle
            r5.mAngle = r0
            float r0 = r6.mScaleXYRatio
            r5.mScaleXYRatio = r0
            float r0 = r6.mScaleX
            r5.mScaleX = r0
            float r0 = r6.mScaleY
            r5.mScaleY = r0
            int r0 = r6.mLockState
            r5.mLockState = r0
            int r0 = r6.mSmartStretchState
            r5.mSmartStretchState = r0
            boolean r0 = r6.mIsUsingJoinParentFilters
            r5.mIsUsingJoinParentFilters = r0
            boolean r0 = r6.mIsPersistentWhenTweening
            r5.mIsPersistentWhenTweening = r0
            byte r0 = r6.mTweenMode
            r5.mTweenMode = r0
            boolean r0 = r6.mVisibleInOnionSkin
            r5.mVisibleInOnionSkin = r0
            float r0 = r6.mSSRememberedAngle
            r5.mSSRememberedAngle = r0
            float r0 = r6.mSSRememberedNodeLength
            r5.mSSRememberedNodeLength = r0
            float r0 = r6.mSSRememberedStickfigureScale
            r5.mSSRememberedStickfigureScale = r0
            float r0 = r6.mSSRememberedNodeAngle
            r5.mSSRememberedNodeAngle = r0
            float r0 = r6.mSSRememberedScale
            r5.mSSRememberedScale = r0
            float r0 = r6.mSSCalcDefaultAngleFromNode
            r5.mSSCalcDefaultAngleFromNode = r0
            float r0 = r6.mSSCalcDefaultWidth
            r5.mSSCalcDefaultWidth = r0
            float r0 = r6.mSSCalcDefaultHeight
            r5.mSSCalcDefaultHeight = r0
            float r0 = r6.mSSCalcNegativeDiff
            r5.mSSCalcNegativeDiff = r0
            float r0 = r6.mTransparency
            r5.mTransparency = r0
            float r0 = r6.mBlur
            r5.mBlur = r0
            boolean r0 = r6._isMotionBlur
            r5._isMotionBlur = r0
            boolean r0 = r6.motionBlurIsOneDirection
            r5.motionBlurIsOneDirection = r0
            int r0 = r6._motionBlurAngle
            r5._motionBlurAngle = r0
            float r0 = r6.mSaturation
            r5.mSaturation = r0
            int r0 = r6._pixelation
            r5._pixelation = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r6.mTintColor
            r0.<init>(r1)
            r5.mTintColor = r0
            float r0 = r6.mTintAmount
            r5.mTintAmount = r0
            float r0 = r6.mHueShift
            r5.mHueShift = r0
            boolean r0 = r6.mColorIsInverted
            r5.mColorIsInverted = r0
            float r0 = r6.mGlow
            r5.mGlow = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r6.mGlowColor
            r0.<init>(r1)
            r5.mGlowColor = r0
            float r0 = r6.mGlowIntensity
            r5.mGlowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r6._outlineColor
            r0.<init>(r1)
            r5._outlineColor = r0
            float r0 = r6._outlineAlpha
            r5._outlineAlpha = r0
            float r0 = r6._outlineThickness
            r5._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r6.mDsColor
            r0.<init>(r1)
            r5.mDsColor = r0
            float r0 = r6.mDsAlpha
            r5.mDsAlpha = r0
            int r0 = r6.mDsDistance
            r5.mDsDistance = r0
            int r0 = r6.mDsAngle
            r5.mDsAngle = r0
            float r0 = r6.mDsBlur
            r5.mDsBlur = r0
            float r6 = r6.mJoinOffsetAngle
            r5.mJoinOffsetAngle = r6
            return
    }

    private void applyGaussian(org.fortheloss.sticknodes.animationscreen.FilterBundle r21, com.badlogic.gdx.graphics.glutils.FrameBuffer r22, float r23, int r24, int r25, float r26, boolean r27) {
            r20 = this;
            r0 = r21
            r1 = r22
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.fbo3
            if (r1 != r2) goto La
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.fbo2
        La:
            r12 = r2
            r2 = 1112014848(0x42480000, float:50.0)
            float r2 = r23 / r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r3
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r2 = r2 + r4
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r2 = r2 / r3
            r13 = 1065353216(0x3f800000, float:1.0)
            float r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r4, r13)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r14 = 0
            r0.endFBO(r14)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0.fbo2
            if (r12 != r3) goto L38
            r21.beginFBO2()
            goto L3b
        L38:
            r21.beginFBO3()
        L3b:
            com.badlogic.gdx.graphics.g2d.Batch r3 = r0.batch
            r15 = 1
            r11 = 771(0x303, float:1.08E-42)
            r3.setBlendFunction(r15, r11)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r0.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r0.gaussianBlurShader
            r3.setShader(r4)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r0.batch
            r3.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0.gaussianBlurShader
            r4 = 1148190720(0x44700000, float:960.0)
            r5 = 1141309440(0x44070000, float:540.0)
            java.lang.String r6 = "u_fboSize"
            r3.setUniformf(r6, r4, r5)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0.gaussianBlurShader
            java.lang.String r10 = "u_is_vertical"
            r3.setUniformf(r10, r13)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0.gaussianBlurShader
            java.lang.String r4 = "u_blur_intensity"
            r3.setUniformf(r4, r2)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0.batch
            r2.setColor(r13, r13, r13, r13)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0.batch
            com.badlogic.gdx.graphics.GLTexture r3 = r22.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r4 = 0
            r5 = 0
            r6 = r24
            float r9 = (float) r6
            float r6 = r9 * r26
            r7 = r25
            float r8 = (float) r7
            float r7 = r8 * r26
            r16 = 0
            r17 = 0
            r18 = r8
            r8 = r16
            r16 = r9
            r9 = r17
            r19 = r10
            r10 = r26
            r11 = r26
            r2.draw(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0.batch
            r2.flush()
            float r2 = r0.renderX
            float r3 = r0.renderY
            if (r27 == 0) goto Lb1
            r0.endFBO(r15)
            r21.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r0.batch
            com.badlogic.gdx.math.Matrix4 r5 = r0.rememberedProjectionMatrix
            r1.setProjectionMatrix(r5)
            r5 = r3
            r3 = r2
            goto Lc1
        Lb1:
            r0.endFBO(r14)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.fbo2
            if (r1 != r2) goto Lbc
            r21.beginFBO2()
            goto Lbf
        Lbc:
            r21.beginFBO3()
        Lbf:
            r3 = 0
            r5 = 0
        Lc1:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r0.batch
            r1.setColor(r13, r13, r13, r13)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r0.gaussianBlurShader
            r2 = r19
            r1.setUniformf(r2, r4)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r0.batch
            com.badlogic.gdx.graphics.GLTexture r2 = r12.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r2 = (com.badlogic.gdx.graphics.Texture) r2
            r7 = 0
            r8 = 0
            r4 = r5
            r5 = r16
            r6 = r18
            r9 = r26
            r10 = r26
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r0.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r0.batch
            r2 = 0
            r1.setShader(r2)
            if (r27 == 0) goto Lf9
            com.badlogic.gdx.graphics.g2d.Batch r0 = r0.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
        Lf9:
            return
    }

    private void buildRenderVerts(com.badlogic.gdx.graphics.Texture r17, com.badlogic.gdx.graphics.Color r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
            r16 = this;
            r0 = r21
            r1 = r22
            r2 = r28
            r3 = r29
            float r4 = r19 + r0
            float r5 = r20 + r1
            float r6 = -r0
            float r7 = -r1
            float r0 = r23 - r0
            float r1 = r24 - r1
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r25 > r8 ? 1 : (r25 == r8 ? 0 : -1))
            if (r9 != 0) goto L1c
            int r9 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r9 == 0) goto L24
        L1c:
            float r6 = r6 * r25
            float r7 = r7 * r26
            float r0 = r0 * r25
            float r1 = r1 * r26
        L24:
            r9 = 0
            int r9 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r9 == 0) goto L55
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r27)
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r27)
            float r11 = r9 * r6
            float r12 = r10 * r7
            float r12 = r11 - r12
            float r6 = r6 * r10
            float r7 = r7 * r9
            float r7 = r7 + r6
            float r13 = r10 * r1
            float r11 = r11 - r13
            float r1 = r1 * r9
            float r6 = r6 + r1
            float r9 = r9 * r0
            float r9 = r9 - r13
            float r10 = r10 * r0
            float r1 = r1 + r10
            float r0 = r9 - r11
            float r0 = r0 + r12
            float r10 = r6 - r7
            float r10 = r1 - r10
            r15 = r1
            r1 = r0
            r0 = r9
            r9 = r7
            r7 = r15
            goto L5c
        L55:
            r11 = r6
            r12 = r11
            r9 = r7
            r10 = r9
            r6 = r1
            r7 = r6
            r1 = r0
        L5c:
            float r12 = r12 + r4
            float r9 = r9 + r5
            float r11 = r11 + r4
            float r6 = r6 + r5
            float r0 = r0 + r4
            float r7 = r7 + r5
            float r1 = r1 + r4
            float r10 = r10 + r5
            int r4 = r17.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r17.getHeight()
            float r5 = (float) r5
            float r8 = r8 / r5
            float r5 = (float) r2
            float r5 = r5 * r4
            int r13 = r3 + r31
            float r13 = (float) r13
            float r13 = r13 * r8
            int r2 = r2 + r30
            float r2 = (float) r2
            float r2 = r2 * r4
            float r3 = (float) r3
            float r3 = r3 * r8
            if (r32 == 0) goto L86
            r15 = r5
            r5 = r2
            r2 = r15
        L86:
            if (r33 == 0) goto L8b
            r15 = r13
            r13 = r3
            r3 = r15
        L8b:
            float r4 = r18.toFloatBits()
            r8 = 0
            float[] r14 = org.fortheloss.sticknodes.sprite.SpriteRef.renderVerts
            r14[r8] = r12
            r8 = 1
            r14[r8] = r9
            r8 = 2
            r14[r8] = r4
            r8 = 3
            r14[r8] = r5
            r8 = 4
            r14[r8] = r13
            r8 = 5
            r14[r8] = r11
            r8 = 6
            r14[r8] = r6
            r6 = 7
            r14[r6] = r4
            r6 = 8
            r14[r6] = r5
            r5 = 9
            r14[r5] = r3
            r5 = 10
            r14[r5] = r0
            r0 = 11
            r14[r0] = r7
            r0 = 12
            r14[r0] = r4
            r0 = 13
            r14[r0] = r2
            r0 = 14
            r14[r0] = r3
            r0 = 15
            r14[r0] = r1
            r0 = 16
            r14[r0] = r10
            r0 = 17
            r14[r0] = r4
            r0 = 18
            r14[r0] = r2
            r0 = 19
            r14[r0] = r13
            return
    }

    private org.fortheloss.sticknodes.sprite.SpriteNode getCornerNode(int r4, float r5, float r6, float r7) {
            r3 = this;
            float r0 = r3.getTouchPrecisionRatio()
            r1 = 1117782016(0x42a00000, float:80.0)
            float r0 = r0 * r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            float r0 = r0 / r7
            r7 = 1067450368(0x3fa00000, float:1.25)
            float r7 = r7 * r0
            com.badlogic.gdx.math.Vector2 r1 = org.fortheloss.sticknodes.sprite.SpriteRef.temp
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.getSpriteCorner(r4, r2, r7, r1)
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.mMainNode
            float r7 = r7.getGlobalX()
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = r3.mMainNode
            float r2 = r2.getGlobalY()
            r1.add(r7, r2)
            float r7 = r1.x
            float r7 = r7 - r5
            float r1 = r1.y
            float r1 = r1 - r6
            float r7 = r7 * r7
            float r1 = r1 * r1
            float r7 = r7 + r1
            float r0 = r0 * r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L53
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.mVersatileNode
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r3.mMainNode
            float r0 = r0.getGlobalX()
            float r5 = r5 - r0
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r3.mMainNode
            float r0 = r0.getGlobalY()
            float r6 = r6 - r0
            r7.setPosition(r5, r6)
            org.fortheloss.sticknodes.sprite.SpriteNode r5 = r3.mVersatileNode
            r5.setType(r4)
            org.fortheloss.sticknodes.sprite.SpriteNode r4 = r3.mVersatileNode
            return r4
        L53:
            r4 = 0
            return r4
    }

    private org.fortheloss.sticknodes.sprite.SpriteNode getEdgeNode(int r19, float r20, float r21, float r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            float r4 = r18.getTouchPrecisionRatio()
            r5 = 128(0x80, float:1.794E-43)
            r6 = 64
            r7 = 32
            r8 = 16
            r9 = 4
            r10 = 8
            r11 = 2
            if (r1 != r8) goto L22
            r6 = 32
            r7 = 8
            r9 = 2
        L1f:
            r10 = 1
            r11 = 4
            goto L37
        L22:
            if (r1 != r7) goto L2b
            r5 = 16
            r7 = 1
            r10 = 2
            r11 = 8
            goto L37
        L2b:
            if (r1 != r6) goto L31
            r6 = 32
            r7 = 1
            goto L37
        L31:
            r5 = 16
            r7 = 2
            r9 = 8
            goto L1f
        L37:
            r8 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r8
            float r4 = r4 / r22
            float r8 = r18.getScaledWidth()
            float r8 = java.lang.Math.abs(r8)
            float r13 = r18.getScaledHeight()
            float r13 = java.lang.Math.abs(r13)
            float r8 = java.lang.Math.min(r8, r13)
            float r8 = r8 * r22
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r14 = 1138819072(0x43e10000, float:450.0)
            float r8 = r8 / r14
            r14 = 1058642330(0x3f19999a, float:0.6)
            float r8 = r8 * r14
            float r8 = r8 + r13
            r13 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r8, r13)
            float r4 = r4 * r8
            com.badlogic.gdx.math.Vector2 r8 = org.fortheloss.sticknodes.sprite.SpriteRef.tempL1
            com.badlogic.gdx.math.Vector2 r14 = org.fortheloss.sticknodes.sprite.SpriteRef.temp
            r15 = 0
            com.badlogic.gdx.math.Vector2 r12 = r0.getSpriteCorner(r10, r13, r15, r14)
            com.badlogic.gdx.math.Vector2 r12 = r8.set(r12)
            org.fortheloss.sticknodes.sprite.SpriteNode r13 = r0.mMainNode
            float r13 = r13.getGlobalX()
            org.fortheloss.sticknodes.sprite.SpriteNode r15 = r0.mMainNode
            float r15 = r15.getGlobalY()
            r12.add(r13, r15)
            com.badlogic.gdx.math.Vector2 r12 = org.fortheloss.sticknodes.sprite.SpriteRef.tempL2
            r17 = r6
            r13 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Vector2 r6 = r0.getSpriteCorner(r9, r15, r13, r14)
            com.badlogic.gdx.math.Vector2 r6 = r12.set(r6)
            org.fortheloss.sticknodes.sprite.SpriteNode r13 = r0.mMainNode
            float r13 = r13.getGlobalX()
            org.fortheloss.sticknodes.sprite.SpriteNode r15 = r0.mMainNode
            float r15 = r15.getGlobalY()
            r6.add(r13, r15)
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.sprite.SpriteRef.tempP
            r6.set(r2, r3)
            com.badlogic.gdx.math.Vector2 r13 = org.fortheloss.sticknodes.sprite.SpriteRef.tempNP
            r0.getNearestPoint(r8, r12, r6, r13)
            float r6 = r13.x
            float r8 = r6 - r2
            float r12 = r13.y
            float r12 = r12 - r3
            float r8 = r8 * r8
            float r12 = r12 * r12
            float r8 = r8 + r12
            float r4 = r4 * r4
            r12 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L19a
            org.fortheloss.sticknodes.sprite.SpriteNode r8 = r0.mVersatileNode
            org.fortheloss.sticknodes.sprite.SpriteNode r15 = r0.mMainNode
            float r15 = r15.getGlobalX()
            float r6 = r6 - r15
            float r13 = r13.y
            org.fortheloss.sticknodes.sprite.SpriteNode r15 = r0.mMainNode
            float r15 = r15.getGlobalY()
            float r13 = r13 - r15
            r8.setPosition(r6, r13)
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.getSpriteCorner(r10, r8, r6, r14)
            float r6 = r18.getX()
            float r8 = r18.getY()
            r14.add(r6, r8)
            float r6 = r14.x
            float r8 = r6 - r2
            float r6 = r6 - r2
            float r8 = r8 * r6
            float r6 = r14.y
            float r10 = r6 - r3
            float r6 = r6 - r3
            float r10 = r10 * r6
            float r8 = r8 + r10
            r6 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto Lfe
            r8 = 1
            goto Lff
        Lfe:
            r8 = 0
        Lff:
            r10 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r0.getSpriteCorner(r9, r13, r10, r14)
            float r9 = r18.getX()
            float r10 = r18.getY()
            r14.add(r9, r10)
            float r9 = r14.x
            float r10 = r9 - r2
            float r9 = r9 - r2
            float r10 = r10 * r9
            float r9 = r14.y
            float r13 = r9 - r3
            float r9 = r9 - r3
            float r13 = r13 * r9
            float r10 = r10 + r13
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 > 0) goto L125
            r9 = 1
            goto L126
        L125:
            r9 = 0
        L126:
            r10 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r0.getSpriteCorner(r7, r13, r10, r14)
            float r7 = r18.getX()
            float r10 = r18.getY()
            r14.add(r7, r10)
            float r7 = r14.x
            float r10 = r7 - r2
            float r7 = r7 - r2
            float r10 = r10 * r7
            float r7 = r14.y
            float r13 = r7 - r3
            float r7 = r7 - r3
            float r13 = r13 * r7
            float r10 = r10 + r13
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 > 0) goto L14c
            r7 = 1
            goto L14d
        L14c:
            r7 = 0
        L14d:
            r10 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r0.getSpriteCorner(r11, r13, r10, r14)
            float r10 = r18.getX()
            float r11 = r18.getY()
            r14.add(r10, r11)
            float r10 = r14.x
            float r11 = r10 - r2
            float r10 = r10 - r2
            float r11 = r11 * r10
            float r2 = r14.y
            float r10 = r2 - r3
            float r2 = r2 - r3
            float r10 = r10 * r2
            float r11 = r11 + r10
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 > 0) goto L174
            r16 = 1
            goto L176
        L174:
            r16 = 0
        L176:
            if (r8 == 0) goto L17a
            if (r7 != 0) goto L17e
        L17a:
            if (r9 == 0) goto L17f
            if (r16 == 0) goto L17f
        L17e:
            return r12
        L17f:
            if (r8 != r9) goto L187
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = r0.mVersatileNode
            r2.setType(r1)
            goto L197
        L187:
            if (r8 == 0) goto L190
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = r0.mVersatileNode
            r1 = r1 | r5
            r2.setType(r1)
            goto L197
        L190:
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = r0.mVersatileNode
            r1 = r1 | r17
            r2.setType(r1)
        L197:
            org.fortheloss.sticknodes.sprite.SpriteNode r1 = r0.mVersatileNode
            return r1
        L19a:
            return r12
    }

    private void getNearestPoint(com.badlogic.gdx.math.Vector2 r12, com.badlogic.gdx.math.Vector2 r13, com.badlogic.gdx.math.Vector2 r14, com.badlogic.gdx.math.Vector2 r15) {
            r11 = this;
            float r0 = r12.x
            float r1 = r13.x
            float r2 = r0 - r1
            float r3 = r0 - r1
            float r2 = r2 * r3
            float r3 = r12.y
            float r4 = r13.y
            float r5 = r3 - r4
            float r6 = r3 - r4
            float r5 = r5 * r6
            float r2 = r2 + r5
            double r5 = (double) r2
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L20
            r15.set(r12)
            return
        L20:
            float r5 = r14.x
            float r5 = r5 - r0
            float r6 = r1 - r0
            float r5 = r5 * r6
            float r14 = r14.y
            float r14 = r14 - r3
            float r6 = r4 - r3
            float r14 = r14 * r6
            float r5 = r5 + r14
            float r5 = r5 / r2
            double r9 = (double) r5
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 >= 0) goto L39
            r15.set(r12)
            return
        L39:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 <= 0) goto L43
            r15.set(r13)
            return
        L43:
            float r1 = r1 - r0
            float r1 = r1 * r5
            float r0 = r0 + r1
            r15.x = r0
            float r4 = r4 - r3
            float r5 = r5 * r4
            float r3 = r3 + r5
            r15.y = r3
            return
    }

    private com.badlogic.gdx.math.Vector2 getSpriteCorner(int r10, float r11, float r12, com.badlogic.gdx.math.Vector2 r13) {
            r9 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r9.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r1 = r0.getTexture()
            int r2 = r1.getWidth()
            float r2 = (float) r2
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            com.badlogic.gdx.math.Vector2 r3 = r9.mOrigin
            float r4 = r3.x
            float r4 = r4 * r2
            float r3 = r3.y
            float r3 = r3 * r1
            float r5 = r9.getScaleX()
            float r6 = r0.getInternalScaleX()
            float r5 = r5 * r6
            float r6 = r9.getScaleY()
            float r0 = r0.getInternalScaleY()
            float r6 = r6 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 >= 0) goto L47
            com.badlogic.gdx.math.Vector2 r4 = r9.mOrigin
            float r4 = r4.x
            float r4 = r0 - r4
            float r4 = r4 * r2
        L47:
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L52
            com.badlogic.gdx.math.Vector2 r3 = r9.mOrigin
            float r3 = r3.y
            float r0 = r0 - r3
            float r3 = r1 * r0
        L52:
            float r0 = java.lang.Math.abs(r5)
            float r5 = java.lang.Math.abs(r6)
            float r2 = r2 * r0
            float r1 = r1 * r5
            r6 = 1
            if (r10 != r6) goto L6a
            float r10 = -r4
            float r10 = r10 * r0
            float r10 = r10 - r12
        L65:
            float r3 = r3 * r5
            float r1 = r1 - r3
            float r1 = r1 + r12
            goto L85
        L6a:
            r6 = 2
            if (r10 != r6) goto L73
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r10 = r2 + r12
            goto L65
        L73:
            r1 = 4
            if (r10 != r1) goto L7c
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r10 = r2 + r12
            goto L80
        L7c:
            float r10 = -r4
            float r10 = r10 * r0
            float r10 = r10 - r12
        L80:
            float r0 = -r3
            float r0 = r0 * r5
            float r1 = r0 - r12
        L85:
            double r2 = (double) r1
            double r4 = (double) r10
            double r2 = java.lang.Math.atan2(r2, r4)
            float r12 = (float) r2
            float r0 = r9.getRotation()
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r0 = r0 * r2
            float r12 = r12 + r0
            float r10 = r10 * r10
            float r1 = r1 * r1
            float r10 = r10 + r1
            double r0 = (double) r10
            double r0 = java.lang.Math.sqrt(r0)
            float r10 = (float) r0
            float r10 = r10 * r11
            float r11 = org.fortheloss.framework.CustomMathUtils.cos(r12)
            float r11 = r11 * r10
            r13.x = r11
            float r11 = org.fortheloss.framework.CustomMathUtils.sin(r12)
            float r11 = r11 * r10
            r13.y = r11
            return r13
    }

    private float getTouchPrecisionRatio() {
            r3 = this;
            float r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.getTouchPrecisionRatio()
            r1 = 1059481190(0x3f266666, float:0.65)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
            return r0
    }

    private void renderDropShadow(org.fortheloss.sticknodes.animationscreen.FilterBundle r24, int r25, int r26, float r27, float r28, com.badlogic.gdx.graphics.Color r29, float r30, float r31) {
            r23 = this;
            r8 = r24
            r4 = r25
            r5 = r26
            r0 = r28
            r1 = r29
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r8.fbo1
            boolean r3 = r24.getBlurEnabled()
            r6 = 771(0x303, float:1.08E-42)
            r15 = 1
            if (r3 == 0) goto L14d
            r3 = 0
            int r9 = (r30 > r3 ? 1 : (r30 == r3 ? 0 : -1))
            if (r9 > 0) goto L20
            int r9 = (r31 > r3 ? 1 : (r31 == r3 ? 0 : -1))
            if (r9 > 0) goto L20
            goto L14d
        L20:
            float r14 = (float) r4
            r9 = 1065353216(0x3f800000, float:1.0)
            float r13 = r9 / r14
            boolean r10 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r10 == 0) goto L30
            r10 = 1063675494(0x3f666666, float:0.9)
            r19 = 1063675494(0x3f666666, float:0.9)
            goto L32
        L30:
            r19 = 1065353216(0x3f800000, float:1.0)
        L32:
            r12 = 0
            r8.endFBO(r12)
            r24.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r10 = r8.batch
            r10.setBlendFunction(r15, r6)
            com.badlogic.gdx.graphics.g2d.Batch r10 = r8.batch
            com.badlogic.gdx.math.Matrix4 r10 = r10.getProjectionMatrix()
            r8.rememberProjectionMatrix(r10)
            com.badlogic.gdx.graphics.g2d.Batch r10 = r8.batch
            com.badlogic.gdx.utils.viewport.Viewport r11 = r8.fboViewport
            com.badlogic.gdx.graphics.Camera r11 = r11.getCamera()
            com.badlogic.gdx.math.Matrix4 r11 = r11.combined
            r10.setProjectionMatrix(r11)
            float r10 = r24.getFboScaleX()
            float r11 = r24.getFboScaleY()
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            com.badlogic.gdx.math.Matrix4 r6 = r3.getProjectionMatrix()
            com.badlogic.gdx.math.Matrix4 r6 = r6.scale(r10, r11, r9)
            r3.setProjectionMatrix(r6)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r6 = r8.dropShadowHBlurShader
            r3.setShader(r6)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            r3.begin()
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            float r6 = r1.r
            float r10 = r1.g
            float r11 = r1.b
            r3.setColor(r6, r10, r11, r9)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r8.hBlurShader
            float r6 = r30 * r19
            java.lang.String r11 = "u_blurPixels"
            r3.setUniformf(r11, r6)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r8.hBlurShader
            java.lang.String r6 = "u_texelSize"
            r3.setUniformf(r6, r13)
            com.badlogic.gdx.graphics.g2d.Batch r9 = r8.batch
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r10 = r2
            com.badlogic.gdx.graphics.Texture r10 = (com.badlogic.gdx.graphics.Texture) r10
            r2 = 0
            r3 = 0
            float r16 = r14 * r27
            float r7 = (float) r5
            float r17 = r7 * r27
            r18 = 0
            r20 = 0
            r21 = r11
            r11 = r2
            r2 = 0
            r12 = r3
            r3 = r13
            r13 = r16
            r22 = r14
            r14 = r17
            r2 = 1
            r15 = r18
            r16 = r20
            r17 = r27
            r18 = r27
            r9.draw(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.badlogic.gdx.graphics.g2d.Batch r9 = r8.batch
            r9.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r8.fbo2
            float r10 = r8.renderX
            float r11 = r8.renderY
            boolean r12 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r12 != 0) goto Ldb
            r8.endFBO(r2)
            r24.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r8.batch
            com.badlogic.gdx.math.Matrix4 r12 = r8.rememberedProjectionMatrix
            r2.setProjectionMatrix(r12)
            r12 = r11
            r11 = r10
            goto Le4
        Ldb:
            r2 = 0
            r8.endFBO(r2)
            r24.beginFBO3()
            r11 = 0
            r12 = 0
        Le4:
            com.badlogic.gdx.graphics.g2d.Batch r2 = r8.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r8.dropShadowVBlurShader
            r2.setShader(r10)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r8.batch
            r2.begin()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r8.batch
            float r10 = r1.r
            float r13 = r1.g
            float r1 = r1.b
            r2.setColor(r10, r13, r1, r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r8.dropShadowVBlurShader
            float r1 = r31 * r19
            r2 = r21
            r0.setUniformf(r2, r1)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r8.dropShadowVBlurShader
            r0.setUniformf(r6, r3)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r8.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r9.getColorBufferTexture()
            r10 = r1
            com.badlogic.gdx.graphics.Texture r10 = (com.badlogic.gdx.graphics.Texture) r10
            r15 = 0
            r16 = 0
            r9 = r0
            r13 = r22
            r14 = r7
            r17 = r27
            r18 = r27
            r9.draw(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r8.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r8.batch
            r7 = 0
            r0.setShader(r7)
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto L149
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r8.fbo3
            float r3 = java.lang.Math.max(r30, r31)
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = 1
            r0 = r23
            r1 = r24
            r4 = r25
            r5 = r26
            r15 = 771(0x303, float:1.08E-42)
            r14 = r7
            r7 = r9
            r0.applyGaussian(r1, r2, r3, r4, r5, r6, r7)
            r2 = r14
            goto L14a
        L149:
            r2 = r7
        L14a:
            r0 = 771(0x303, float:1.08E-42)
            goto L197
        L14d:
            r3 = r2
            r2 = 1
            r14 = 0
            r15 = 771(0x303, float:1.08E-42)
            r8.endFBO(r2)
            r24.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r6 = r8.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r7 = r8.dropShadowNoBlurShader
            r6.setShader(r7)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r8.batch
            r6.begin()
            com.badlogic.gdx.graphics.g2d.Batch r6 = r8.batch
            r6.setBlendFunction(r2, r15)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r8.batch
            float r6 = r1.r
            float r7 = r1.g
            float r1 = r1.b
            r2.setColor(r6, r7, r1, r0)
            com.badlogic.gdx.graphics.g2d.Batch r9 = r8.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r3.getColorBufferTexture()
            r10 = r0
            com.badlogic.gdx.graphics.Texture r10 = (com.badlogic.gdx.graphics.Texture) r10
            float r11 = r8.renderX
            float r12 = r8.renderY
            float r13 = (float) r4
            float r0 = (float) r5
            r1 = 0
            r16 = 0
            r2 = r14
            r14 = r0
            r0 = 771(0x303, float:1.08E-42)
            r15 = r1
            r17 = r27
            r18 = r27
            r9.draw(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r8.batch
            r1.end()
        L197:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r8.batch
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r8.batch
            r2 = 770(0x302, float:1.079E-42)
            r1.setBlendFunction(r2, r0)
            return
    }

    private void renderSprite(com.badlogic.gdx.graphics.g2d.Batch r19, com.badlogic.gdx.graphics.Texture r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28) {
            r18 = this;
            r10 = r18
            r9 = r19
            boolean r0 = org.fortheloss.sticknodes.sprite.SpriteRef.FLAG_RESET_ALPHA
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Le
            r9.setColor(r1, r1, r1, r1)
            goto L17
        Le:
            com.badlogic.gdx.graphics.Color r0 = r19.getColor()
            float r0 = r0.a
            r9.setColor(r1, r1, r1, r0)
        L17:
            r0 = 1
            r8 = 771(0x303, float:1.08E-42)
            r9.setBlendFunction(r0, r8)
            com.badlogic.gdx.graphics.Color r2 = r19.getColor()
            float r11 = r18.getRotation()
            r12 = 0
            r13 = 0
            int r14 = r20.getWidth()
            int r15 = r20.getHeight()
            boolean r0 = r10.mIsFlippedX
            r16 = r0
            boolean r0 = r10.mIsFlippedY
            r17 = r0
            r0 = r18
            r1 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r0.buildRenderVerts(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            float[] r0 = org.fortheloss.sticknodes.sprite.SpriteRef.renderVerts
            r1 = 0
            r2 = 20
            r3 = r19
            r4 = r20
            r3.draw(r4, r0, r1, r2)
            r19.flush()
            r0 = 770(0x302, float:1.079E-42)
            r1 = 771(0x303, float:1.08E-42)
            r3.setBlendFunction(r0, r1)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r2.glBlendFuncSeparate(r0, r1, r0, r1)
            return
    }

    public void applySmartStretch() {
            r13 = this;
            int r0 = r13.mSmartStretchState
            if (r0 == 0) goto L11a
            boolean r0 = r13.isJoined()
            if (r0 == 0) goto L11a
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r13.getJoinedToNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L14
            goto L11a
        L14:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r13.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            boolean r0 = r0.getIsScalingJoinedStickfigures()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r13.mJoinedToNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            float r1 = r1.getScale()
            float r2 = r13.mSSRememberedStickfigureScale
            float r1 = r1 - r2
            float r1 = r1 / r2
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r13.getJoinedToNode()
            float r2 = r2.getLength()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = java.lang.Math.max(r2, r3)
            float r4 = r13.mSSRememberedNodeLength
            float r2 = r2 / r4
            r4 = 1
            r5 = 0
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 != 0) goto L59
            float r0 = r13.mSSRememberedAngle
            r13.setFigureRotation(r0)
            int r0 = r13.mSmartStretchState
            if (r0 != r4) goto L54
            r13.setScaleX(r5)
            goto L11a
        L54:
            r13.setScaleY(r5)
            goto L11a
        L59:
            boolean r6 = r13.getScaleLinked()
            r7 = 0
            r13.setScaleLinked(r7)
            int r7 = r13.mSmartStretchState
            r8 = 1113927392(0x42652ee0, float:57.295776)
            r9 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            r10 = -1
            if (r7 != r4) goto La9
            float r7 = r13.mSSCalcDefaultWidth
            float r7 = r7 * r2
            float r7 = r7 * r7
            float r11 = r13.mSSCalcDefaultHeight
            float r11 = r11 * r11
            float r7 = r7 + r11
            double r11 = (double) r7
            double r11 = java.lang.Math.sqrt(r11)
            float r7 = (float) r11
            float r11 = r13.mSSRememberedScale
            int r12 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r12 >= 0) goto L84
            r4 = -1
        L84:
            float r4 = (float) r4
            float r7 = r7 * r4
            if (r0 == 0) goto L8c
            float r1 = r1 * r11
            goto L8d
        L8c:
            r1 = 0
        L8d:
            float r1 = r1 * r2
            float r1 = r1 + r7
            r13.setScaleX(r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L9c
            float r0 = java.lang.Math.max(r3, r7)
            goto La0
        L9c:
            float r0 = java.lang.Math.min(r9, r7)
        La0:
            float r1 = r13.mSSCalcDefaultHeight
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.asin(r0)
            goto Le5
        La9:
            float r7 = r13.mSSCalcDefaultHeight
            float r7 = r7 * r2
            float r11 = r13.mSSCalcDefaultWidth
            float r11 = r11 * r11
            float r7 = r7 * r7
            float r11 = r11 + r7
            double r11 = (double) r11
            double r11 = java.lang.Math.sqrt(r11)
            float r7 = (float) r11
            float r11 = r13.mSSRememberedScale
            int r12 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r12 >= 0) goto Lc1
            r4 = -1
        Lc1:
            float r4 = (float) r4
            float r7 = r7 * r4
            if (r0 == 0) goto Lc9
            float r1 = r1 * r11
            goto Lca
        Lc9:
            r1 = 0
        Lca:
            float r1 = r1 * r2
            float r1 = r1 + r7
            r13.setScaleY(r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto Ld9
            float r0 = java.lang.Math.max(r3, r7)
            goto Ldd
        Ld9:
            float r0 = java.lang.Math.min(r9, r7)
        Ldd:
            float r1 = r13.mSSCalcDefaultWidth
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.acos(r0)
        Le5:
            float r0 = (float) r0
            float r0 = r0 * r8
            r13.setScaleLinked(r6)
            float r1 = r13.mSSCalcDefaultAngleFromNode
            float r0 = r0 - r1
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 + r1
            r2 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r2
            float r0 = r0 - r1
            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lfc
            float r0 = r0 + r2
        Lfc:
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r13.getJoinedToNode()
            float r4 = r4.getAngle()
            float r5 = r13.mSSRememberedNodeAngle
            float r4 = r4 - r5
            float r4 = r4 + r1
            float r4 = r4 % r2
            float r4 = r4 - r1
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 >= 0) goto L10f
            float r4 = r4 + r2
        L10f:
            float r1 = r13.mSSRememberedAngle
            float r2 = r13.mSSCalcNegativeDiff
            float r0 = r0 * r2
            float r1 = r1 + r0
            float r1 = r1 + r4
            r13.setFigureRotation(r1)
        L11a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean checkIsJoinedTo(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            boolean r0 = r1.mIsJoined
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mJoinedToNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            if (r0 != r2) goto L10
            r2 = 1
            return r2
        L10:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mJoinedToNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            boolean r2 = r0.checkIsJoinedTo(r2)
            return r2
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mSpriteSourceRef = r0
            org.fortheloss.sticknodes.sprite.SpriteNode r1 = r2.mMainNode
            if (r1 == 0) goto Lc
            r1.dispose()
            r2.mMainNode = r0
        Lc:
            org.fortheloss.sticknodes.sprite.SpriteNode r1 = r2.mVersatileNode
            if (r1 == 0) goto L15
            r1.dispose()
            r2.mVersatileNode = r0
        L15:
            r2.mPosition = r0
            r2.mOrigin = r0
            r2.mTintColor = r0
            r2.mGlowColor = r0
            r2._outlineColor = r0
            r2.mDsColor = r0
            r2.mJoinedToNodeRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void doNotDraw() {
            r1 = this;
            r0 = 1
            r1.mDoNotDraw = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void drawLimbs(org.fortheloss.sticknodes.SNShapeRenderer r107, com.badlogic.gdx.graphics.g2d.Batch r108, org.fortheloss.sticknodes.animationscreen.FilterBundle r109, float r110, float r111, float r112, float r113, float r114, boolean r115, org.fortheloss.sticknodes.stickfigure.INode r116, boolean r117, boolean r118) {
            r106 = this;
            r11 = r106
            r12 = r107
            r13 = r108
            r14 = r109
            boolean r0 = r11.mDoNotDraw
            if (r0 == 0) goto Ld
            return
        Ld:
            org.fortheloss.sticknodes.sprite.SpriteSource r15 = r106.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r0 = r15.getTexture()
            if (r0 != 0) goto L18
            return
        L18:
            r107.end()
            r108.begin()
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r16 = r1 * r2
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r17 = r0 * r1
            com.badlogic.gdx.math.Vector2 r0 = r11.mOrigin
            float r1 = r0.x
            float r18 = r16 * r1
            float r0 = r0.y
            float r19 = r17 * r0
            float r0 = r106.getX()
            float r0 = r0 - r112
            r10 = 1065353216(0x3f800000, float:1.0)
            float r1 = r114 - r10
            float r0 = r0 * r1
            float r2 = r106.getY()
            float r2 = r2 - r113
            float r2 = r2 * r1
            float r3 = r106.getScaleX()
            float r3 = r3 * r114
            float r4 = r15.getInternalScaleX()
            float r20 = r3 * r4
            float r3 = r106.getScaleY()
            float r3 = r3 * r114
            float r4 = r15.getInternalScaleY()
            float r21 = r3 * r4
            float r3 = r106.getX()
            float r3 = r3 - r18
            float r3 = r3 + r110
            float r22 = r3 + r0
            float r0 = r106.getY()
            float r0 = r0 - r19
            float r0 = r0 + r111
            float r23 = r0 + r2
            if (r14 == 0) goto L81
            float r0 = r109.getUVScale()
            goto L82
        L81:
            r0 = 0
        L82:
            float r2 = r11.mTransparency
            float r3 = r11.mSaturation
            int r4 = r11._pixelation
            float r5 = r11.mHueShift
            boolean r6 = r11.mColorIsInverted
            float r7 = r11.mTintAmount
            com.badlogic.gdx.graphics.Color r8 = r11.mTintColor
            float r10 = r11.mBlur
            boolean r9 = r11._isMotionBlur
            r111 = r2
            boolean r2 = r11.motionBlurIsOneDirection
            r113 = r2
            int r2 = r11._motionBlurAngle
            r115 = r2
            float r2 = r11.mGlow
            r116 = r2
            float r2 = r11.mGlowIntensity
            r117 = r2
            com.badlogic.gdx.graphics.Color r2 = r11.mGlowColor
            r118 = r2
            com.badlogic.gdx.graphics.Color r2 = r11._outlineColor
            r24 = r2
            float r2 = r11._outlineAlpha
            r25 = r2
            float r2 = r11._outlineThickness
            r26 = r2
            com.badlogic.gdx.graphics.Color r2 = r11.mDsColor
            r27 = r2
            float r2 = r11.mDsAlpha
            r28 = r2
            int r2 = r11.mDsDistance
            float r2 = (float) r2
            float r29 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r29
            int r2 = java.lang.Math.round(r2)
            r29 = r2
            int r2 = r11.mDsAngle
            r30 = r2
            float r2 = r11.mDsBlur
            r31 = r3
            float r3 = r11.mBlur
            r32 = 1098907648(0x41800000, float:16.0)
            float r33 = r3 * r32
            float r33 = r33 + r32
            float r34 = org.fortheloss.sticknodes.App.assetScaling
            float r33 = r33 * r34
            r35 = r3
            float r3 = r11.mGlow
            float r3 = r3 * r32
            float r3 = r3 + r32
            float r3 = r3 * r34
            float r36 = r2 * r32
            float r36 = r36 + r32
            float r36 = r36 * r34
            r34 = r10
            if (r14 == 0) goto L10e
            int r10 = r14.renderWidth
            r38 = r2
            int r2 = r14.renderHeight
            float r39 = r109.getFboScaleX()
            float r40 = r109.getFboScaleY()
            r104 = r40
            r40 = r9
            r9 = r104
            r105 = r39
            r39 = r10
            r10 = r105
            goto L119
        L10e:
            r38 = r2
            r40 = r9
            r2 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r39 = 0
        L119:
            r41 = 1056964608(0x3f000000, float:0.5)
            r42 = r8
            java.lang.String r8 = "u_texHeight"
            r43 = r8
            java.lang.String r8 = "u_texWidth"
            r44 = r8
            java.lang.String r8 = "u_blockSize"
            r45 = r8
            java.lang.String r8 = "u_steps"
            r46 = r8
            java.lang.String r8 = "u_normalizedOutlineThickness"
            r47 = r8
            r48 = 1000593162(0x3ba3d70a, float:0.005)
            r49 = 0
            int r50 = (r0 > r49 ? 1 : (r0 == r49 ? 0 : -1))
            if (r50 <= 0) goto L72d
            boolean r49 = r106.isJoined()
            if (r49 == 0) goto L151
            boolean r8 = r11.mIsUsingJoinParentFilters
            if (r8 == 0) goto L151
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r106.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r8.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r8.getStickfigureToReferForFilters()
            goto L152
        L151:
            r8 = 0
        L152:
            if (r8 == 0) goto L1f6
            float r3 = r8.getTransparency()
            float r4 = r8.getSaturation()
            int r5 = r8.getPixelation()
            float r6 = r8.getHueShift()
            boolean r7 = r8.getIsInvertedColor()
            float r24 = r8.getTintAmount()
            com.badlogic.gdx.graphics.Color r25 = r8.getTintColor()
            float r26 = r8.getBlur()
            boolean r27 = r8.isMotionBlur()
            boolean r28 = r8.getMotionBlurIsOneDirection()
            int r29 = r8.getMotionBlurAngle()
            float r30 = r8.getGlow()
            float r31 = r8.getGlowIntensity()
            com.badlogic.gdx.graphics.Color r33 = r8.getGlowColor()
            com.badlogic.gdx.graphics.Color r34 = r8.getOutlineColor()
            float r35 = r8.getOutlineAlpha()
            float r36 = r8.getOutlineThickness()
            com.badlogic.gdx.graphics.Color r38 = r8.getDsColor()
            float r40 = r8.getDsAlpha()
            r50 = r2
            int r2 = r8.getDsDistance()
            float r2 = (float) r2
            float r42 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r42
            int r2 = java.lang.Math.round(r2)
            int r42 = r8.getDsAngle()
            float r8 = r8.getDsBlur()
            float r51 = r26 * r32
            float r51 = r51 + r32
            float r52 = org.fortheloss.sticknodes.App.assetScaling
            float r51 = r51 * r52
            float r53 = r30 * r32
            float r53 = r53 + r32
            float r53 = r53 * r52
            float r54 = r8 * r32
            float r54 = r54 + r32
            float r52 = r52 * r54
            r54 = r51
            r55 = r52
            r56 = 0
            r52 = r26
            r51 = r27
            r27 = r6
            r6 = r52
            r104 = r4
            r4 = r2
            r2 = r36
            r36 = r24
            r24 = r3
            r3 = r29
            r29 = r7
            r7 = r5
            r5 = r42
            r42 = r25
            r25 = r104
            r105 = r38
            r38 = r8
            r8 = r34
            r34 = r105
            goto L22b
        L1f6:
            r50 = r2
            r53 = r3
            r8 = r24
            r2 = r26
            r54 = r33
            r52 = r34
            r26 = r35
            r55 = r36
            r51 = r40
            r56 = 0
            r24 = r111
            r3 = r115
            r33 = r118
            r36 = r7
            r34 = r27
            r40 = r28
            r28 = r113
            r7 = r4
            r27 = r5
            r4 = r29
            r5 = r30
            r30 = r116
            r29 = r6
            r6 = r26
            r35 = r25
            r25 = r31
            r31 = r117
        L22b:
            int r57 = (r24 > r56 ? 1 : (r24 == r56 ? 0 : -1))
            if (r57 > 0) goto L238
            r108.end()
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r12.begin(r0)
            return
        L238:
            float r57 = org.fortheloss.sticknodes.App.assetScaling
            float r57 = r57 * r2
            int r2 = (r52 > r56 ? 1 : (r52 == r56 ? 0 : -1))
            if (r2 <= 0) goto L242
            r2 = 1
            goto L243
        L242:
            r2 = 0
        L243:
            int r58 = (r27 > r56 ? 1 : (r27 == r56 ? 0 : -1))
            if (r58 <= 0) goto L250
            r58 = 1065353216(0x3f800000, float:1.0)
            int r59 = (r27 > r58 ? 1 : (r27 == r58 ? 0 : -1))
            if (r59 >= 0) goto L250
            r58 = 1
            goto L252
        L250:
            r58 = 0
        L252:
            int r59 = (r35 > r56 ? 1 : (r35 == r56 ? 0 : -1))
            if (r59 <= 0) goto L25d
            int r59 = (r57 > r56 ? 1 : (r57 == r56 ? 0 : -1))
            if (r59 <= 0) goto L25d
            r56 = 1
            goto L25f
        L25d:
            r56 = 0
        L25f:
            if (r56 == 0) goto L287
            r59 = 1090519040(0x41000000, float:8.0)
            float r59 = r59 * r57
            r60 = 1106247680(0x41f00000, float:30.0)
            float r59 = r59 / r60
            float r59 = r59 + r32
            r32 = 1073741824(0x40000000, float:2.0)
            float r32 = r32 * r0
            float r59 = r59 * r32
            r32 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 / r32
            r32 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r32
            r115 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            float r1 = java.lang.Math.max(r0, r1)
            float r0 = r59 * r1
            int r0 = (int) r0
            r1 = r0
            goto L28a
        L287:
            r115 = r0
            r1 = 0
        L28a:
            boolean r0 = r109.getBlurEnabled()
            if (r0 != 0) goto L293
            r32 = 0
            goto L295
        L293:
            r32 = r2
        L295:
            boolean r0 = r109.getGlowEnabled()
            if (r0 != 0) goto L29d
            r30 = 0
        L29d:
            if (r32 == 0) goto L2cc
            if (r51 == 0) goto L2cc
            float r0 = (float) r3
            boolean r2 = r109.isUsingRotatedTransformationMatrix()
            if (r2 != 0) goto L2b1
            float r2 = r109.getExtraRotation()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L2bb
        L2b1:
            float r2 = r109.getTransformationRotationDeg()
            float r3 = r109.getExtraRotation()
            float r2 = r2 + r3
            float r0 = r0 + r2
        L2bb:
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r2 = r2 * r52
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r0 = r0 * r52
            r52 = r0
            r26 = r2
            goto L2ce
        L2cc:
            r52 = r6
        L2ce:
            if (r32 == 0) goto L2d8
            float r0 = r109.getUVScaleBlur()
            r59 = r0
            r0 = 0
            goto L2e6
        L2d8:
            r0 = 0
            int r2 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r2 <= 0) goto L2e4
            float r2 = r109.getUVScaleGlow()
            r59 = r2
            goto L2e6
        L2e4:
            r59 = r115
        L2e6:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r3 < 0) goto L308
            if (r32 != 0) goto L308
            if (r58 != 0) goto L308
            int r3 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r3 != 0) goto L308
            int r2 = (r36 > r0 ? 1 : (r36 == r0 ? 0 : -1))
            if (r2 > 0) goto L308
            if (r29 != 0) goto L308
            int r2 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r2 > 0) goto L308
            r0 = 1
            if (r7 > r0) goto L308
            if (r56 == 0) goto L304
            goto L308
        L304:
            r0 = 0
            r60 = 0
            goto L30b
        L308:
            r0 = 0
            r60 = 1
        L30b:
            int r2 = (r40 > r0 ? 1 : (r40 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68d
            int r2 = (r38 > r0 ? 1 : (r38 == r0 ? 0 : -1))
            if (r2 <= 0) goto L31a
            float r0 = r109.getUVScaleBlur()
            r61 = r0
            goto L31c
        L31a:
            r61 = r59
        L31c:
            boolean r0 = r109.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L32b
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            r14.rememberTransformationMatrix(r0)
        L32b:
            r109.popAndRememberScissors()
            r0 = 1
            if (r7 > r0) goto L338
            if (r56 == 0) goto L334
            goto L338
        L334:
            r109.beginFBO1()
            goto L33b
        L338:
            r109.beginFBO3()
        L33b:
            com.badlogic.gdx.math.Matrix4 r0 = r108.getProjectionMatrix()
            r14.rememberProjectionMatrix(r0)
            com.badlogic.gdx.utils.viewport.Viewport r0 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            com.badlogic.gdx.math.Matrix4 r0 = r0.combined
            r13.setProjectionMatrix(r0)
            com.badlogic.gdx.math.Matrix4 r0 = r108.getProjectionMatrix()
            float r2 = r14.renderX
            float r2 = -r2
            float r2 = r2 * r10
            float r2 = r2 * r61
            float r3 = r14.renderY
            float r3 = -r3
            float r3 = r3 * r9
            float r3 = r3 * r61
            r6 = 0
            com.badlogic.gdx.math.Matrix4 r0 = r0.translate(r2, r3, r6)
            float r2 = r10 * r61
            float r3 = r9 * r61
            r110 = r10
            r10 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r0 = r0.scale(r2, r3, r10)
            r13.setProjectionMatrix(r0)
            int r5 = r5 + 180
            float r0 = (float) r5
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r3 = (float) r4
            float r2 = r2 * r3
            float r2 = r2 * r114
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r0 = r0 * r3
            float r0 = r0 * r114
            float r2 = r22 + r2
            float r0 = r23 + r0
            if (r60 == 0) goto L3f8
            r5 = 1
            if (r7 <= r5) goto L3f8
            float r3 = (float) r7
            float r3 = r3 * r61
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            float r3 = r3 * r114
            int r3 = (int) r3
            int r3 = java.lang.Math.max(r3, r5)
            float r3 = (float) r3
            float r4 = r2 * r61
            float r5 = r0 * r61
            com.badlogic.gdx.math.Matrix4 r6 = r107.getTransformMatrix()
            com.badlogic.gdx.math.Vector3 r4 = r14.transformPoint(r4, r5, r6)
            float r5 = r4.x
            float r5 = r5 / r3
            double r5 = (double) r5
            double r5 = java.lang.Math.floor(r5)
            double r10 = (double) r3
            double r5 = r5 * r10
            r113 = r1
            float r1 = r4.x
            r117 = r7
            r116 = r8
            double r7 = (double) r1
            double r5 = r5 - r7
            float r1 = (float) r5
            float r5 = r4.y
            float r5 = r5 / r3
            double r5 = (double) r5
            double r5 = java.lang.Math.floor(r5)
            double r5 = r5 * r10
            float r4 = r4.y
            double r7 = (double) r4
            double r5 = r5 - r7
            float r4 = (float) r5
            boolean r5 = r109.isUsingRotatedTransformationMatrix()
            if (r5 == 0) goto L3ec
            com.badlogic.gdx.math.Matrix4 r5 = r107.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r5 = r14.getInvertedUntranslatedMatrix(r5)
            com.badlogic.gdx.math.Vector3 r5 = r14.transformPoint(r1, r4, r5)
            float r6 = r5.x
            float r6 = r6 / r61
            float r2 = r2 + r6
            float r5 = r5.y
            float r5 = r5 / r61
            goto L3f1
        L3ec:
            float r5 = r1 / r61
            float r2 = r2 + r5
            float r5 = r4 / r61
        L3f1:
            float r0 = r0 + r5
            r10 = r1
            r11 = r3
            r8 = r4
            r4 = r0
            r3 = r2
            goto L403
        L3f8:
            r113 = r1
            r117 = r7
            r116 = r8
            r4 = r0
            r3 = r2
            r8 = 0
            r10 = 0
            r11 = 0
        L403:
            com.badlogic.gdx.math.Matrix4 r7 = org.fortheloss.sticknodes.sprite.SpriteRef.mRememberedTransformationMatrix
            com.badlogic.gdx.math.Matrix4 r0 = r108.getTransformMatrix()
            r7.set(r0)
            com.badlogic.gdx.math.Matrix4 r0 = r107.getTransformMatrix()
            r13.setTransformMatrix(r0)
            com.badlogic.gdx.graphics.Texture r2 = r15.getTexture()
            r0 = r106
            r6 = r113
            r1 = r108
            r5 = r50
            r12 = r5
            r49 = 1
            r5 = r18
            r50 = r15
            r62 = 0
            r15 = r6
            r6 = r19
            r63 = r12
            r113 = r15
            r15 = r117
            r12 = r7
            r7 = r16
            r65 = r116
            r64 = r8
            r66 = r43
            r67 = r44
            r68 = r45
            r69 = r46
            r70 = r47
            r43 = r11
            r11 = 1
            r8 = r17
            r71 = r9
            r9 = r20
            r74 = r110
            r75 = r10
            r73 = r39
            r10 = r21
            r0.renderSprite(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r109.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L46a
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r0 = r0.idt()
            r13.setTransformMatrix(r0)
            goto L46d
        L46a:
            r13.setTransformMatrix(r12)
        L46d:
            r108.end()
            com.badlogic.gdx.math.Matrix4 r0 = r14.rememberedProjectionMatrix
            r13.setProjectionMatrix(r0)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fbo3
            if (r15 <= r11) goto L537
            r12 = 0
            r14.endFBO(r12)
            if (r56 == 0) goto L485
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fbo2
            r109.beginFBO2()
            goto L488
        L485:
            r109.beginFBO1()
        L488:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r11, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r9 = r71
            r10 = r74
            r8 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r10, r9, r8)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r8, r8, r8, r8)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.pixelateShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            r2 = r43
            int r3 = (int) r2
            float r3 = (float) r3
            r7 = r68
            r1.setUniformf(r7, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            r6 = r73
            int r3 = r6 + (-1)
            float r3 = (float) r3
            r5 = r67
            r1.setUniformf(r5, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            int r3 = r63 + (-1)
            float r3 = (float) r3
            r4 = r66
            r1.setUniformf(r4, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r14.fbo3
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            r77 = r3
            com.badlogic.gdx.graphics.Texture r77 = (com.badlogic.gdx.graphics.Texture) r77
            r3 = r75
            float r8 = -r3
            float r37 = r2 * r41
            float r78 = r8 - r37
            r8 = r64
            float r11 = -r8
            float r79 = r11 - r37
            float r11 = (float) r6
            r110 = r0
            r12 = r63
            float r0 = (float) r12
            r82 = 0
            r83 = 0
            r84 = 1065353216(0x3f800000, float:1.0)
            r85 = 1065353216(0x3f800000, float:1.0)
            r76 = r1
            r80 = r11
            r81 = r0
            r76.draw(r77, r78, r79, r80, r81, r82, r83, r84, r85)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r11 = 0
            r0.setShader(r11)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 770(0x302, float:1.079E-42)
            r11 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r11)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            r0 = r110
            goto L54d
        L537:
            r2 = r43
            r12 = r63
            r8 = r64
            r4 = r66
            r5 = r67
            r7 = r68
            r9 = r71
            r6 = r73
            r10 = r74
            r3 = r75
            r11 = 771(0x303, float:1.08E-42)
        L54d:
            if (r56 == 0) goto L614
            r1 = 0
            r14.endFBO(r1)
            r109.beginFBO1()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r43 = r2
            r2 = 1
            r1.setBlendFunction(r2, r11)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r11 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r10, r9, r11)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r11, r11, r11, r11)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.outlineShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            r2 = r65
            float r11 = r2.r
            r73 = r6
            float r6 = r2.g
            r68 = r7
            float r7 = r2.b
            java.lang.String r37 = "u_outlineRGB"
            r39 = r3
            r3 = r1
            r1 = r4
            r4 = r37
            r86 = r5
            r5 = r11
            r11 = r73
            r87 = r68
            r37 = r8
            r8 = r35
            r3.setUniformf(r4, r5, r6, r7, r8)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r14.outlineShader
            float r4 = (float) r11
            float r5 = r57 / r4
            float r5 = r5 * r114
            float r5 = r5 * r59
            float r6 = (float) r12
            float r7 = r57 / r6
            float r7 = r7 * r114
            float r7 = r7 * r59
            r8 = r70
            r3.setUniformf(r8, r5, r7)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r14.outlineShader
            r7 = r113
            float r5 = (float) r7
            r71 = r9
            r9 = r69
            r3.setUniformf(r9, r5)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r73 = r0
            com.badlogic.gdx.graphics.Texture r73 = (com.badlogic.gdx.graphics.Texture) r73
            r74 = 0
            r75 = 0
            r78 = 0
            r79 = 0
            r80 = 1065353216(0x3f800000, float:1.0)
            r81 = 1065353216(0x3f800000, float:1.0)
            r72 = r3
            r76 = r4
            r77 = r6
            r72.draw(r73, r74, r75, r76, r77, r78, r79, r80, r81)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r3 = 0
            r0.setShader(r3)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r3 = 770(0x302, float:1.079E-42)
            r4 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r3, r4)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r4 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r4)
            goto L62c
        L614:
            r43 = r2
            r39 = r3
            r1 = r4
            r86 = r5
            r11 = r6
            r87 = r7
            r37 = r8
            r71 = r9
            r2 = r65
            r9 = r69
            r8 = r70
            r3 = 770(0x302, float:1.079E-42)
            r7 = r113
        L62c:
            float r0 = java.lang.Math.abs(r26)
            float r0 = r0 * r54
            float r38 = r38 * r55
            float r0 = r0 + r38
            float r0 = r0 * r114
            float r0 = r0 * r61
            float r4 = java.lang.Math.abs(r52)
            float r4 = r4 * r54
            float r4 = r4 + r38
            float r4 = r4 * r114
            float r4 = r4 * r61
            float r0 = r0 * r0
            float r4 = r4 * r4
            float r0 = r0 + r4
            double r4 = (double) r0
            double r4 = java.lang.Math.sqrt(r4)
            float r6 = (float) r4
            float r5 = r40 * r24
            r0 = r106
            r4 = r1
            r1 = r109
            r40 = r2
            r38 = r43
            r2 = r11
            r3 = r12
            r88 = r4
            r4 = r61
            r43 = r6
            r6 = r34
            r34 = r7
            r7 = r43
            r89 = r8
            r8 = r43
            r0.renderDropShadow(r1, r2, r3, r4, r5, r6, r7, r8)
            r108.begin()
            boolean r0 = r109.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L681
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedTransformationMatrix
            r0.setTransformMatrix(r1)
        L681:
            r8 = r106
            float r0 = r8.mDsAlpha
            int r0 = (r0 > r48 ? 1 : (r0 == r48 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L6ac
            r8.mDsAlpha = r2
            goto L6ac
        L68d:
            r34 = r1
            r40 = r8
            r71 = r9
            r8 = r11
            r11 = r39
            r88 = r43
            r86 = r44
            r87 = r45
            r9 = r46
            r89 = r47
            r12 = r50
            r2 = 0
            r50 = r15
            r15 = r7
            r37 = 0
            r38 = 0
            r39 = 0
        L6ac:
            if (r60 == 0) goto L703
            boolean r0 = r109.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L6bd
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            r14.rememberTransformationMatrix(r0)
        L6bd:
            r109.popAndRememberScissors()
            r0 = 1
            if (r15 > r0) goto L6ca
            if (r56 == 0) goto L6c6
            goto L6ca
        L6c6:
            r109.beginFBO1()
            goto L6cd
        L6ca:
            r109.beginFBO3()
        L6cd:
            com.badlogic.gdx.math.Matrix4 r0 = r108.getProjectionMatrix()
            r14.rememberProjectionMatrix(r0)
            com.badlogic.gdx.utils.viewport.Viewport r0 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            com.badlogic.gdx.math.Matrix4 r0 = r0.combined
            r13.setProjectionMatrix(r0)
            com.badlogic.gdx.math.Matrix4 r0 = r108.getProjectionMatrix()
            float r1 = r14.renderX
            float r1 = -r1
            float r1 = r1 * r10
            float r1 = r1 * r59
            float r3 = r14.renderY
            float r3 = -r3
            float r3 = r3 * r71
            float r3 = r3 * r59
            com.badlogic.gdx.math.Matrix4 r0 = r0.translate(r1, r3, r2)
            float r1 = r10 * r59
            float r3 = r71 * r59
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r0 = r0.scale(r1, r3, r4)
            r13.setProjectionMatrix(r0)
            goto L705
        L703:
            r4 = 1065353216(0x3f800000, float:1.0)
        L705:
            r1 = r15
            r4 = r24
            r3 = r25
            r25 = r26
            r0 = r27
            r6 = r31
            r43 = r32
            r5 = r33
            r92 = r34
            r90 = r36
            r7 = r40
            r91 = r42
            r40 = r51
            r27 = r52
            r45 = r54
            r42 = r56
            r26 = r57
            r44 = r58
            r24 = r59
            r36 = r35
            goto L774
        L72d:
            r115 = r0
            r12 = r2
            r71 = r9
            r8 = r11
            r50 = r15
            r11 = r39
            r88 = r43
            r86 = r44
            r87 = r45
            r9 = r46
            r89 = r47
            r2 = 0
            r28 = r113
            r30 = r116
            r53 = r3
            r1 = r4
            r0 = r5
            r29 = r6
            r90 = r7
            r7 = r24
            r36 = r25
            r3 = r31
            r45 = r33
            r25 = r35
            r27 = r25
            r91 = r42
            r37 = 0
            r38 = 0
            r39 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r60 = 0
            r92 = 0
            r4 = r111
            r24 = r115
            r6 = r117
            r5 = r118
        L774:
            com.badlogic.gdx.math.Matrix4 r15 = org.fortheloss.sticknodes.sprite.SpriteRef.mRememberedTransformationMatrix
            com.badlogic.gdx.math.Matrix4 r2 = r108.getTransformMatrix()
            r15.set(r2)
            com.badlogic.gdx.math.Matrix4 r2 = r107.getTransformMatrix()
            r13.setTransformMatrix(r2)
            if (r60 == 0) goto L7ff
            r2 = 1
            if (r1 <= r2) goto L7ff
            float r2 = (float) r1
            float r2 = r2 * r24
            float r31 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r31
            float r2 = r2 * r114
            int r2 = (int) r2
            r110 = r0
            r0 = 1
            int r2 = java.lang.Math.max(r2, r0)
            float r0 = (float) r2
            float r2 = r22 * r24
            r31 = r1
            float r1 = r23 * r24
            r111 = r3
            com.badlogic.gdx.math.Matrix4 r3 = r107.getTransformMatrix()
            com.badlogic.gdx.math.Vector3 r1 = r14.transformPoint(r2, r1, r3)
            float r2 = r1.x
            float r2 = r2 / r0
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            r113 = r4
            r112 = r5
            double r4 = (double) r0
            double r2 = r2 * r4
            r115 = r6
            float r6 = r1.x
            r116 = r7
            double r6 = (double) r6
            double r2 = r2 - r6
            float r2 = (float) r2
            float r3 = r1.y
            float r3 = r3 / r0
            double r6 = (double) r3
            double r6 = java.lang.Math.floor(r6)
            double r6 = r6 * r4
            float r1 = r1.y
            double r3 = (double) r1
            double r6 = r6 - r3
            float r1 = (float) r6
            boolean r3 = r109.isUsingRotatedTransformationMatrix()
            if (r3 == 0) goto L7ef
            com.badlogic.gdx.math.Matrix4 r3 = r107.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r3 = r14.getInvertedUntranslatedMatrix(r3)
            com.badlogic.gdx.math.Vector3 r3 = r14.transformPoint(r2, r1, r3)
            float r4 = r3.x
            float r4 = r4 / r24
            float r22 = r22 + r4
            float r3 = r3.y
            float r3 = r3 / r24
            goto L7f5
        L7ef:
            float r3 = r2 / r24
            float r22 = r22 + r3
            float r3 = r1 / r24
        L7f5:
            float r23 = r23 + r3
            r6 = r0
            r7 = r1
            r5 = r2
            r3 = r22
            r4 = r23
            goto L817
        L7ff:
            r110 = r0
            r31 = r1
            r111 = r3
            r113 = r4
            r112 = r5
            r115 = r6
            r116 = r7
            r3 = r22
            r4 = r23
            r7 = r37
            r6 = r38
            r5 = r39
        L817:
            com.badlogic.gdx.graphics.Texture r2 = r50.getTexture()
            r1 = r110
            r0 = r106
            r93 = r1
            r50 = r12
            r12 = r31
            r1 = r108
            r94 = r111
            r95 = r113
            r97 = r112
            r96 = r5
            r5 = r18
            r98 = r115
            r73 = r11
            r11 = r6
            r6 = r19
            r100 = r116
            r99 = r7
            r7 = r16
            r8 = r17
            r101 = r9
            r16 = r11
            r11 = r71
            r9 = r20
            r102 = r10
            r10 = r21
            r0.renderSprite(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r60 == 0) goto L865
            boolean r0 = r109.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L865
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r0 = r0.idt()
            r13.setTransformMatrix(r0)
            goto L868
        L865:
            r13.setTransformMatrix(r15)
        L868:
            if (r60 == 0) goto L105b
            r108.end()
            com.badlogic.gdx.math.Matrix4 r0 = r14.rememberedProjectionMatrix
            r13.setProjectionMatrix(r0)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fbo3
            r1 = 1
            if (r12 <= r1) goto L92f
            r2 = 0
            r14.endFBO(r2)
            if (r42 == 0) goto L883
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fbo2
            r109.beginFBO2()
            goto L886
        L883:
            r109.beginFBO1()
        L886:
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            r3 = 771(0x303, float:1.08E-42)
            r2.setBlendFunction(r1, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r8 = r102
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r8, r11, r3)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.pixelateShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            r2 = r16
            int r3 = (int) r2
            float r3 = (float) r3
            r4 = r87
            r1.setUniformf(r4, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            int r3 = r73 + (-1)
            float r3 = (float) r3
            r4 = r86
            r1.setUniformf(r4, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            int r3 = r50 + (-1)
            float r3 = (float) r3
            r4 = r88
            r1.setUniformf(r4, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r14.fbo3
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            r55 = r3
            com.badlogic.gdx.graphics.Texture r55 = (com.badlogic.gdx.graphics.Texture) r55
            r3 = r96
            float r3 = -r3
            float r6 = r2 * r41
            float r56 = r3 - r6
            r2 = r99
            float r2 = -r2
            float r57 = r2 - r6
            r10 = r73
            float r2 = (float) r10
            r9 = r50
            float r3 = (float) r9
            r60 = 0
            r61 = 0
            r62 = 1065353216(0x3f800000, float:1.0)
            r63 = 1065353216(0x3f800000, float:1.0)
            r54 = r1
            r58 = r2
            r59 = r3
            r54.draw(r55, r56, r57, r58, r59, r60, r61, r62, r63)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 0
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 771(0x303, float:1.08E-42)
            r13 = 770(0x302, float:1.079E-42)
            r1.setBlendFunction(r13, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r3 = r14.rememberedProjectionMatrix
            r1.setProjectionMatrix(r3)
            goto L939
        L92f:
            r9 = r50
            r10 = r73
            r8 = r102
            r2 = 771(0x303, float:1.08E-42)
            r13 = 770(0x302, float:1.079E-42)
        L939:
            if (r42 == 0) goto L9ec
            r1 = 0
            r14.endFBO(r1)
            r109.beginFBO1()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r3 = 1
            r1.setBlendFunction(r3, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r8, r11, r3)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.outlineShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            r2 = r100
            float r3 = r2.r
            float r4 = r2.g
            float r2 = r2.b
            java.lang.String r32 = "u_outlineRGB"
            r31 = r1
            r33 = r3
            r34 = r4
            r35 = r2
            r31.setUniformf(r32, r33, r34, r35, r36)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            float r2 = (float) r10
            float r3 = r26 / r2
            float r3 = r3 * r114
            float r3 = r3 * r24
            float r4 = (float) r9
            float r26 = r26 / r4
            float r26 = r26 * r114
            float r5 = r26 * r24
            r6 = r89
            r1.setUniformf(r6, r3, r5)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            r3 = r92
            float r3 = (float) r3
            r5 = r101
            r1.setUniformf(r5, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r55 = r0
            com.badlogic.gdx.graphics.Texture r55 = (com.badlogic.gdx.graphics.Texture) r55
            r56 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r62 = 1065353216(0x3f800000, float:1.0)
            r63 = 1065353216(0x3f800000, float:1.0)
            r54 = r1
            r58 = r2
            r59 = r4
            r54.draw(r55, r56, r57, r58, r59, r60, r61, r62, r63)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 0
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r13, r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
        L9ec:
            java.lang.String r15 = "u_texelSize"
            java.lang.String r7 = "u_blurPixels"
            r6 = 0
            int r0 = (r30 > r6 ? 1 : (r30 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lc49
            float r30 = r30 * r53
            float r30 = r30 * r114
            float r3 = r30 * r24
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto La03
            r0 = 1063675494(0x3f666666, float:0.9)
            goto La05
        La03:
            r0 = 1065353216(0x3f800000, float:1.0)
        La05:
            r1 = 0
            r14.endFBO(r1)
            r109.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 771(0x303, float:1.08E-42)
            r4 = 1
            r1.setBlendFunction(r4, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r8, r11, r4)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.hGlowShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            r2 = r97
            float r4 = r2.r
            float r5 = r2.g
            float r13 = r2.b
            java.lang.String r6 = "u_glowRGB"
            r1.setUniformf(r6, r4, r5, r13)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            float r0 = r0 * r3
            r1.setUniformf(r7, r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            float r13 = (float) r10
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r4 / r13
            r1.setUniformf(r15, r5)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            java.lang.String r4 = "u_glowIntensity"
            r5 = r98
            r1.setUniformf(r4, r5)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r14.fbo1
            com.badlogic.gdx.graphics.GLTexture r4 = r4.getColorBufferTexture()
            r52 = r4
            com.badlogic.gdx.graphics.Texture r52 = (com.badlogic.gdx.graphics.Texture) r52
            r53 = 0
            r54 = 0
            float r55 = r13 * r24
            float r6 = (float) r9
            float r56 = r6 * r24
            r57 = 0
            r58 = 0
            r51 = r1
            r59 = r24
            r60 = r24
            r51.draw(r52, r53, r54, r55, r56, r57, r58, r59, r60)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            if (r43 != 0) goto Lad2
            if (r44 != 0) goto Lad2
            r4 = r94
            r1 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r16 != 0) goto Lacd
            r1 = r90
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 > 0) goto Lac6
            if (r29 != 0) goto Lac6
            r74 = r8
            r8 = r95
            r17 = 1065353216(0x3f800000, float:1.0)
            int r18 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            r108 = r1
            if (r18 < 0) goto Ladc
            r1 = 1
            if (r12 > r1) goto Ladc
            if (r42 == 0) goto Lac2
            goto Ladc
        Lac2:
            r94 = r4
            r1 = 0
            goto Ladf
        Lac6:
            r108 = r1
            r74 = r8
            r8 = r95
            goto Ladc
        Lacd:
            r74 = r8
            r108 = r90
            goto Lad8
        Lad2:
            r74 = r8
            r108 = r90
            r4 = r94
        Lad8:
            r8 = r95
            r16 = 0
        Ladc:
            r94 = r4
            r1 = 1
        Ladf:
            float r4 = r14.renderX
            r17 = r4
            float r4 = r14.renderY
            if (r1 != 0) goto Lb03
            boolean r18 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r18 == 0) goto Laec
            goto Lb03
        Laec:
            r18 = r4
            r4 = 1
            r14.endFBO(r4)
            r109.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r4 = r14.batch
            r19 = r12
            com.badlogic.gdx.math.Matrix4 r12 = r14.rememberedProjectionMatrix
            r4.setProjectionMatrix(r12)
            r32 = r17
            r33 = r18
            goto Lb10
        Lb03:
            r19 = r12
            r4 = 0
            r14.endFBO(r4)
            r109.beginFBO3()
            r32 = 0
            r33 = 0
        Lb10:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r14.vGlowShader
            com.badlogic.gdx.graphics.g2d.Batch r12 = r14.batch
            r12.setShader(r4)
            com.badlogic.gdx.graphics.g2d.Batch r12 = r14.batch
            r12.begin()
            com.badlogic.gdx.graphics.g2d.Batch r12 = r14.batch
            r95 = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            r12.setColor(r8, r8, r8, r8)
            float r12 = r2.r
            float r8 = r2.g
            float r2 = r2.b
            r71 = r11
            java.lang.String r11 = "u_glowRGB"
            r4.setUniformf(r11, r12, r8, r2)
            r4.setUniformf(r7, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0 / r6
            r4.setUniformf(r15, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.hGlowShader
            java.lang.String r2 = "u_glowIntensity"
            r0.setUniformf(r2, r5)
            if (r1 != 0) goto Lb6c
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Lb4a
            goto Lb6c
        Lb4a:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r14.fbo2
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r52 = r2
            com.badlogic.gdx.graphics.Texture r52 = (com.badlogic.gdx.graphics.Texture) r52
            r57 = 0
            r58 = 0
            r51 = r0
            r53 = r32
            r54 = r33
            r55 = r13
            r56 = r6
            r59 = r24
            r60 = r24
            r51.draw(r52, r53, r54, r55, r56, r57, r58, r59, r60)
            goto Lb89
        Lb6c:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r14.fbo2
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r31 = r2
            com.badlogic.gdx.graphics.Texture r31 = (com.badlogic.gdx.graphics.Texture) r31
            r36 = 0
            r37 = 0
            r38 = 1065353216(0x3f800000, float:1.0)
            r39 = 1065353216(0x3f800000, float:1.0)
            r30 = r0
            r34 = r13
            r35 = r6
            r30.draw(r31, r32, r33, r34, r35, r36, r37, r38, r39)
        Lb89:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r2 = 0
            r0.setShader(r2)
            if (r1 == 0) goto Lbee
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Lbb4
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r14.fbo3
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r0 = r106
            r12 = r108
            r1 = r109
            r5 = r94
            r4 = r10
            r103 = r5
            r5 = r9
            r16 = r6
            r6 = r8
            r8 = r7
            r7 = r11
            r0.applyGaussian(r1, r2, r3, r4, r5, r6, r7)
            goto Lbbb
        Lbb4:
            r12 = r108
            r16 = r6
            r8 = r7
            r103 = r94
        Lbbb:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r14.fbo1
            com.badlogic.gdx.graphics.GLTexture r1 = r1.getColorBufferTexture()
            r31 = r1
            com.badlogic.gdx.graphics.Texture r31 = (com.badlogic.gdx.graphics.Texture) r31
            r32 = 0
            r33 = 0
            r36 = 0
            r37 = 0
            r38 = 1065353216(0x3f800000, float:1.0)
            r39 = 1065353216(0x3f800000, float:1.0)
            r30 = r0
            r34 = r13
            r35 = r16
            r30.draw(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            goto Lc3e
        Lbee:
            r12 = r108
            r16 = r6
            r8 = r7
            r103 = r94
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Lc0f
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r14.fbo3
            r7 = 1
            r0 = r106
            r1 = r109
            r4 = r10
            r5 = r9
            r6 = r24
            r0.applyGaussian(r1, r2, r3, r4, r5, r6, r7)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 771(0x303, float:1.08E-42)
            r2 = 1
            r0.setBlendFunction(r2, r1)
        Lc0f:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r14.fbo1
            com.badlogic.gdx.graphics.GLTexture r1 = r1.getColorBufferTexture()
            r52 = r1
            com.badlogic.gdx.graphics.Texture r52 = (com.badlogic.gdx.graphics.Texture) r52
            float r1 = r14.renderX
            float r2 = r14.renderY
            r57 = 0
            r58 = 0
            r51 = r0
            r53 = r1
            r54 = r2
            r55 = r13
            r56 = r16
            r59 = r24
            r60 = r24
            r51.draw(r52, r53, r54, r55, r56, r57, r58, r59, r60)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
        Lc3e:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            r0 = 1
            goto Lc55
        Lc49:
            r74 = r8
            r71 = r11
            r19 = r12
            r12 = r90
            r103 = r94
            r8 = r7
            r0 = 0
        Lc55:
            java.lang.String r1 = "u_hueAdjust"
            java.lang.String r2 = "u_willInvert"
            java.lang.String r3 = "u_saturation"
            java.lang.String r4 = "u_tintAmount"
            java.lang.String r5 = "u_tintRGB"
            if (r43 == 0) goto Lf09
            r6 = 0
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r6
            float r6 = (float) r10
            r7 = 1065353216(0x3f800000, float:1.0)
            float r11 = r7 / r6
            float r13 = (float) r9
            r50 = r9
            float r9 = r7 / r13
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r14.fbo1
            if (r0 == 0) goto Lc74
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r14.fbo3
        Lc74:
            if (r40 != 0) goto Ldb2
            float r25 = r25 * r45
            float r25 = r25 * r114
            float r25 = r25 * r24
            r73 = r10
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = r25 * r0
            r0 = 0
            r14.endFBO(r0)
            r109.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r110 = r1
            r108 = r9
            r1 = 1
            r9 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r9)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getProjectionMatrix()
            r14.rememberProjectionMatrix(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r1 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r0.setProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r0.getProjectionMatrix()
            r111 = r2
            r112 = r3
            r2 = r71
            r9 = r74
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r1 = r1.scale(r9, r2, r3)
            r0.setProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hBlurShader
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.hBlurShader
            r0.setUniformf(r8, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.hBlurShader
            r0.setUniformf(r15, r11)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r7.getColorBufferTexture()
            r52 = r1
            com.badlogic.gdx.graphics.Texture r52 = (com.badlogic.gdx.graphics.Texture) r52
            r53 = 0
            r54 = 0
            float r55 = r6 * r24
            float r56 = r13 * r24
            r57 = 0
            r58 = 0
            r51 = r0
            r59 = r24
            r60 = r24
            r51.draw(r52, r53, r54, r55, r56, r57, r58, r59, r60)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r14.fbo2
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 != 0) goto Ld20
            r0 = 1
            r14.endFBO(r0)
            r109.restoreScissors()
            float r9 = r14.renderX
            float r0 = r14.renderY
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r14.rememberedProjectionMatrix
            r1.setProjectionMatrix(r2)
            r1 = r0
            r3 = r103
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            goto Ld2f
        Ld20:
            r0 = 0
            r14.endFBO(r0)
            r109.beginFBO3()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fbo3
            r3 = r103
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
        Ld2f:
            int r11 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r2 = 0
            if (r11 != 0) goto Ld5d
            int r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r11 > 0) goto Ld5d
            if (r44 == 0) goto Ld3b
            goto Ld5d
        Ld3b:
            if (r29 == 0) goto Ld4a
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r14.vBlurInvertShader
            com.badlogic.gdx.graphics.g2d.Batch r4 = r14.batch
            r4.setShader(r3)
            com.badlogic.gdx.graphics.g2d.Batch r4 = r14.batch
            r4.begin()
            goto Ld56
        Ld4a:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r14.vBlurShader
            com.badlogic.gdx.graphics.g2d.Batch r4 = r14.batch
            r4.setShader(r3)
            com.badlogic.gdx.graphics.g2d.Batch r4 = r14.batch
            r4.begin()
        Ld56:
            r113 = r0
            r115 = r1
            r0 = r108
            goto Ld96
        Ld5d:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r11 = r14.vBlurAllShader
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            r2.setShader(r11)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            r2.begin()
            r113 = r0
            r2 = r91
            float r0 = r2.r
            r115 = r1
            float r1 = r2.g
            float r2 = r2.b
            r11.setUniformf(r5, r0, r1, r2)
            r11.setUniformf(r4, r12)
            float r0 = -r3
            r1 = r112
            r11.setUniformf(r1, r0)
            r1 = r111
            if (r29 == 0) goto Ld88
            r0 = 1065353216(0x3f800000, float:1.0)
            goto Ld89
        Ld88:
            r0 = 0
        Ld89:
            r11.setUniformf(r1, r0)
            r1 = r110
            r0 = r93
            r11.setUniformf(r1, r0)
            r0 = r108
            r3 = r11
        Ld96:
            r3.setUniformf(r15, r0)
            r3.setUniformf(r8, r10)
            float r27 = r27 * r45
            float r27 = r27 * r114
            float r27 = r27 * r24
            r0 = 1065353216(0x3f800000, float:1.0)
            float r27 = r27 * r0
            r0 = r113
            r54 = r115
            r17 = r6
            r53 = r9
            r16 = r13
            goto Leaf
        Ldb2:
            r15 = r1
            r1 = r3
            r108 = r7
            r73 = r10
            r16 = r13
            r8 = r91
            r0 = r93
            r3 = r103
            r7 = r2
            r10 = r9
            r2 = r71
            r9 = r74
            com.badlogic.gdx.graphics.g2d.Batch r13 = r14.batch
            r17 = r6
            r18 = r10
            r6 = 771(0x303, float:1.08E-42)
            r10 = 1
            r13.setBlendFunction(r10, r6)
            boolean r6 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r6 != 0) goto Lde5
            r14.endFBO(r10)
            r109.restoreScissors()
            float r9 = r14.renderX
            float r2 = r14.renderY
            r6 = r2
            r2 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto Le15
        Lde5:
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            com.badlogic.gdx.math.Matrix4 r6 = r6.getProjectionMatrix()
            r14.rememberProjectionMatrix(r6)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r10 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r10 = r10.getCamera()
            com.badlogic.gdx.math.Matrix4 r10 = r10.combined
            r6.setProjectionMatrix(r10)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            com.badlogic.gdx.math.Matrix4 r10 = r6.getProjectionMatrix()
            r13 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r10.scale(r9, r2, r13)
            r6.setProjectionMatrix(r2)
            r2 = 0
            r14.endFBO(r2)
            r109.beginFBO2()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r14.fbo2
            r6 = 0
            r9 = 0
        Le15:
            float r25 = r25 * r45
            float r25 = r25 * r114
            float r25 = r25 * r24
            float r10 = r25 * r13
            float r27 = r27 * r45
            float r27 = r27 * r114
            float r27 = r27 * r24
            r110 = r2
            float r2 = r27 * r13
            int r19 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r19 != 0) goto Le5d
            r13 = 0
            int r19 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r19 > 0) goto Le5d
            if (r44 == 0) goto Le33
            goto Le5d
        Le33:
            if (r29 == 0) goto Le47
            if (r28 == 0) goto Le3a
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurOneDirectionInvertShader
            goto Le3c
        Le3a:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurInvertShader
        Le3c:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setShader(r0)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            goto Le58
        Le47:
            if (r28 == 0) goto Le4c
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurOneDirectionShader
            goto Le4e
        Le4c:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurShader
        Le4e:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setShader(r0)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
        Le58:
            r111 = r6
            r112 = r9
            goto Le8f
        Le5d:
            if (r28 == 0) goto Le62
            com.badlogic.gdx.graphics.glutils.ShaderProgram r13 = r14.motionBlurOneDirectionAllShader
            goto Le64
        Le62:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r13 = r14.motionBlurAllShader
        Le64:
            r111 = r6
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r6.setShader(r13)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r6.begin()
            float r6 = r8.r
            r112 = r9
            float r9 = r8.g
            float r8 = r8.b
            r13.setUniformf(r5, r6, r9, r8)
            r13.setUniformf(r4, r12)
            float r3 = -r3
            r13.setUniformf(r1, r3)
            if (r29 == 0) goto Le87
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Le88
        Le87:
            r1 = 0
        Le88:
            r13.setUniformf(r7, r1)
            r13.setUniformf(r15, r0)
            r0 = r13
        Le8f:
            java.lang.String r1 = "u_blurPixelsX"
            r0.setUniformf(r1, r10)
            java.lang.String r1 = "u_blurPixelsY"
            r0.setUniformf(r1, r2)
            java.lang.String r1 = "u_texelSizeX"
            r0.setUniformf(r1, r11)
            java.lang.String r1 = "u_texelSizeY"
            r10 = r18
            r0.setUniformf(r1, r10)
            r7 = r108
            r0 = r110
            r54 = r111
            r53 = r112
            r27 = 0
        Leaf:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 771(0x303, float:1.08E-42)
            r3 = 1
            r1.setBlendFunction(r3, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = r95
            r1.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r2 = r7.getColorBufferTexture()
            r52 = r2
            com.badlogic.gdx.graphics.Texture r52 = (com.badlogic.gdx.graphics.Texture) r52
            r2 = 1065353216(0x3f800000, float:1.0)
            float r55 = r17 * r2
            float r56 = r16 * r2
            r57 = 0
            r58 = 0
            r51 = r1
            r59 = r24
            r60 = r24
            r51.draw(r52, r53, r54, r55, r56, r57, r58, r59, r60)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 770(0x302, float:1.079E-42)
            r3 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r2, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r2 = 0
            r1.setShader(r2)
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 == 0) goto Lfe0
            r1 = 1
            r110 = r106
            r111 = r109
            r112 = r0
            r113 = r27
            r114 = r73
            r115 = r50
            r116 = r24
            r117 = r1
            r110.applyGaussian(r111, r112, r113, r114, r115, r116, r117)
            goto Lfe0
        Lf09:
            r15 = r1
            r7 = r2
            r1 = r3
            r50 = r9
            r73 = r10
            r8 = r91
            r6 = r93
            r2 = r95
            r3 = r103
            r9 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r10 != 0) goto Lf33
            r10 = 0
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 > 0) goto Lf33
            if (r29 != 0) goto Lf33
            if (r44 != 0) goto Lf33
            int r10 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r10 < 0) goto Lf33
            r9 = r19
            r10 = 1
            if (r9 > r10) goto Lf34
            if (r42 == 0) goto Lfe0
            goto Lf34
        Lf33:
            r10 = 1
        Lf34:
            r14.endFBO(r10)
            r109.restoreScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r14.fbo1
            if (r0 == 0) goto Lf40
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r14.fbo3
        Lf40:
            double r10 = (double) r3
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 != 0) goto Lf64
            r0 = 0
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 > 0) goto Lf64
            if (r44 == 0) goto Lf4f
            goto Lf64
        Lf4f:
            if (r29 == 0) goto Lf5e
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.invertColorShader
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            goto Lf96
        Lf5e:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            goto Lf96
        Lf64:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14.allColorShader
            r0.setShader(r10)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.allColorShader
            float r10 = r8.r
            float r11 = r8.g
            float r8 = r8.b
            r0.setUniformf(r5, r10, r11, r8)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.allColorShader
            r0.setUniformf(r4, r12)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.allColorShader
            float r3 = -r3
            r0.setUniformf(r1, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.allColorShader
            if (r29 == 0) goto Lf8d
            r10 = 1065353216(0x3f800000, float:1.0)
            goto Lf8e
        Lf8d:
            r10 = 0
        Lf8e:
            r0.setUniformf(r7, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.allColorShader
            r0.setUniformf(r15, r6)
        Lf96:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 771(0x303, float:1.08E-42)
            r3 = 1
            r0.setBlendFunction(r3, r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r9.getColorBufferTexture()
            r52 = r1
            com.badlogic.gdx.graphics.Texture r52 = (com.badlogic.gdx.graphics.Texture) r52
            float r1 = r14.renderX
            float r2 = r14.renderY
            r10 = r73
            float r3 = (float) r10
            r4 = r50
            float r4 = (float) r4
            r57 = 0
            r58 = 0
            r51 = r0
            r53 = r1
            r54 = r2
            r55 = r3
            r56 = r4
            r59 = r24
            r60 = r24
            r51.draw(r52, r53, r54, r55, r56, r57, r58, r59, r60)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 0
            r0.setShader(r1)
        Lfe0:
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1 = r107
            r1.begin(r0)
            boolean r0 = r109.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto Lff4
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedTransformationMatrix
            r0.setTransformMatrix(r1)
        Lff4:
            r0 = r106
            float r1 = r0.mTransparency
            r2 = 1065269330(0x3f7eb852, float:0.995)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1004
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mTransparency = r1
            goto L1006
        L1004:
            r1 = 1065353216(0x3f800000, float:1.0)
        L1006:
            float r2 = r0.mSaturation
            float r2 = r2 - r1
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 >= 0) goto L1013
            r0.mSaturation = r1
        L1013:
            float r1 = r0.mTintAmount
            int r1 = (r1 > r48 ? 1 : (r1 == r48 ? 0 : -1))
            if (r1 >= 0) goto L101d
            r1 = 0
            r0.mTintAmount = r1
            goto L101e
        L101d:
            r1 = 0
        L101e:
            float r2 = r0.mHueShift
            int r3 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r3 >= 0) goto L1027
            r0.mHueShift = r1
            goto L1032
        L1027:
            r3 = 1065269330(0x3f7eb852, float:0.995)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1032
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mHueShift = r2
        L1032:
            float r2 = r0.mGlow
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 >= 0) goto L103a
            r0.mGlow = r1
        L103a:
            float r2 = r0.mBlur
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 >= 0) goto L1042
            r0.mBlur = r1
        L1042:
            float r2 = r0.mDsAlpha
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 >= 0) goto L104a
            r0.mDsAlpha = r1
        L104a:
            float r2 = r0._outlineAlpha
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 >= 0) goto L1052
            r0._outlineAlpha = r1
        L1052:
            float r2 = r0._outlineThickness
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 >= 0) goto L1067
            r0._outlineThickness = r1
            goto L1067
        L105b:
            r0 = r106
            r1 = r107
            r108.end()
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1.begin(r2)
        L1067:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void drawNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r32, float r33, float r34, float r35, float r36, float r37, boolean r38, boolean r39, org.fortheloss.sticknodes.stickfigure.INode r40, boolean r41) {
            r31 = this;
            r0 = r31
            r8 = r32
            r9 = r37
            r10 = r40
            r31.validateDirtyNodes()
            int r11 = r31.getLockState()
            org.fortheloss.sticknodes.sprite.SpriteSource r1 = r31.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r2 = r1.getTexture()
            int r3 = r2.getWidth()
            float r3 = (float) r3
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r3 * r4
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r2 * r3
            float r2 = r31.getX()
            float r2 = r2 - r35
            r14 = 1065353216(0x3f800000, float:1.0)
            float r3 = r9 - r14
            float r2 = r2 * r3
            float r4 = r31.getY()
            float r4 = r4 - r36
            float r4 = r4 * r3
            float r3 = r31.getX()
            float r3 = r3 + r33
            float r21 = r3 + r2
            float r2 = r31.getY()
            float r2 = r2 + r34
            float r22 = r2 + r4
            float r2 = r31.getScaleX()
            float r2 = r2 * r9
            float r3 = r1.getInternalScaleX()
            float r2 = r2 * r3
            float r3 = r31.getScaleY()
            float r3 = r3 * r9
            float r1 = r1.getInternalScaleY()
            float r3 = r3 * r1
            float r15 = java.lang.Math.abs(r2)
            float r16 = java.lang.Math.abs(r3)
            org.fortheloss.sticknodes.sprite.SpriteNode r1 = r0.mMainNode
            r7 = 1
            if (r1 != r10) goto L75
            r17 = 1
            goto L78
        L75:
            r2 = 0
            r17 = 0
        L78:
            r2 = r32
            r3 = r21
            r4 = r22
            r5 = r37
            r6 = r39
            r14 = 1
            r7 = r17
            r1.drawNode(r2, r3, r4, r5, r6, r7)
            com.badlogic.gdx.math.Vector2 r1 = org.fortheloss.sticknodes.sprite.SpriteRef.funcVec1
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.sprite.SpriteRef.temp
            r3 = 0
            com.badlogic.gdx.math.Vector2 r4 = r0.getSpriteCorner(r14, r9, r3, r2)
            r1.set(r4)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.sprite.SpriteRef.funcVec2
            r5 = 2
            com.badlogic.gdx.math.Vector2 r6 = r0.getSpriteCorner(r5, r9, r3, r2)
            r4.set(r6)
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.sprite.SpriteRef.funcVec3
            r7 = 4
            com.badlogic.gdx.math.Vector2 r14 = r0.getSpriteCorner(r7, r9, r3, r2)
            r6.set(r14)
            com.badlogic.gdx.math.Vector2 r14 = org.fortheloss.sticknodes.sprite.SpriteRef.funcVec4
            r7 = 8
            com.badlogic.gdx.math.Vector2 r3 = r0.getSpriteCorner(r7, r9, r3, r2)
            r14.set(r3)
            float r3 = r1.x
            float r7 = r4.x
            float r3 = r3 + r7
            float r7 = r6.x
            float r3 = r3 + r7
            float r7 = r14.x
            float r3 = r3 + r7
            r7 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 / r7
            float r3 = r21 + r3
            float r5 = r1.y
            float r7 = r4.y
            float r5 = r5 + r7
            float r7 = r6.y
            float r5 = r5 + r7
            float r7 = r14.y
            float r5 = r5 + r7
            r7 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 / r7
            float r5 = r22 + r5
            r7 = 1092616192(0x41200000, float:10.0)
            float r17 = org.fortheloss.sticknodes.App.assetScaling
            float r17 = r17 * r7
            if (r39 != 0) goto Lff
            boolean r7 = r0.mIsJoined
            if (r7 == 0) goto Le4
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r0.mJoinedToNodeRef
            if (r7 != r10) goto Le4
            goto Lff
        Le4:
            r7 = 20
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r8.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r32.getBatch()
            r32 = r1
            r33 = r2
            r34 = r21
            r35 = r22
            r36 = r3
            r37 = r5
            r32.drawLine(r33, r34, r35, r36, r37)
            goto L3bd
        Lff:
            r7 = 20
            if (r39 == 0) goto L10a
            r10 = 49
            r18 = 51
            r7 = 51
            goto L110
        L10a:
            r10 = 48
            r18 = 50
            r7 = 50
        L110:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r23 = r8.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r24 = r32.getBatch()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r18 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r18
            float r26 = r5 - r7
            float r12 = r12 * r15
            float r18 = r18 * r17
            float r12 = r12 + r18
            float r13 = r13 * r16
            float r13 = r13 + r18
            float r29 = r31.getRotation()
            r25 = r3
            r27 = r12
            r28 = r13
            r23.drawPatch(r24, r25, r26, r27, r28, r29)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r23 = r8.getNode(r10)
            com.badlogic.gdx.graphics.g2d.Batch r24 = r32.getBatch()
            float r29 = r31.getRotation()
            r26 = r5
            r23.drawPatch(r24, r25, r26, r27, r28, r29)
            r7 = 3
            if (r11 == r7) goto L156
            r10 = 2
            if (r11 != r10) goto L14f
            goto L156
        L14f:
            r29 = r2
            r2 = r8
            r30 = r11
            goto L260
        L156:
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r17 = r17 * r17
            float r10 = r17 + r17
            double r7 = (double) r10
            double r7 = java.lang.Math.sqrt(r7)
            float r7 = (float) r7
            float r8 = r14.x
            float r8 = r21 + r8
            float r10 = r31.getRotation()
            r15 = 1130430464(0x43610000, float:225.0)
            float r10 = r10 + r15
            float r10 = com.badlogic.gdx.math.MathUtils.cosDeg(r10)
            float r10 = r10 * r7
            float r8 = r8 + r10
            float r10 = r14.y
            float r10 = r22 + r10
            float r16 = r31.getRotation()
            float r16 = r16 + r15
            float r15 = com.badlogic.gdx.math.MathUtils.sinDeg(r16)
            float r15 = r15 * r7
            float r10 = r10 + r15
            float r7 = r31.getRotation()
            r15 = 2
            if (r11 != r15) goto L25a
            r15 = 9
            r16 = 1119092736(0x42b40000, float:90.0)
            float r17 = r7 + r16
            float r18 = org.fortheloss.framework.CustomMathUtils.cosDeg(r17)
            float r18 = r18 * r13
            r19 = 1056964608(0x3f000000, float:0.5)
            float r18 = r18 * r19
            float r8 = r8 + r18
            float r18 = org.fortheloss.framework.CustomMathUtils.sinDeg(r17)
            float r18 = r18 * r13
            float r18 = r18 * r19
            float r10 = r10 + r18
            r29 = r2
            r2 = r32
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r9 = r2.getNode(r15)
            com.badlogic.gdx.graphics.g2d.Batch r15 = r32.getBatch()
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.drawNode(r15, r8, r10, r0)
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r17)
            float r0 = r0 * r13
            float r0 = r0 * r19
            float r8 = r8 + r0
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r17)
            float r0 = r0 * r13
            float r0 = r0 * r19
            float r10 = r10 + r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r0 = r0 * r12
            float r0 = r0 * r19
            float r8 = r8 + r0
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r0 = r0 * r12
            float r0 = r0 * r19
            float r10 = r10 + r0
            r0 = 9
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r9 = r2.getNode(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r32.getBatch()
            r15 = 1065353216(0x3f800000, float:1.0)
            r9.drawNode(r0, r8, r10, r15)
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r0 = r0 * r12
            float r0 = r0 * r19
            float r8 = r8 + r0
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r0 = r0 * r12
            float r0 = r0 * r19
            float r10 = r10 + r0
            float r0 = r7 - r16
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r9 = r9 * r13
            float r9 = r9 * r19
            float r8 = r8 + r9
            float r9 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r9 = r9 * r13
            float r9 = r9 * r19
            float r10 = r10 + r9
            r9 = 9
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r2.getNode(r9)
            com.badlogic.gdx.graphics.g2d.Batch r9 = r32.getBatch()
            r30 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r15.drawNode(r9, r8, r10, r11)
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r9 = r9 * r13
            float r9 = r9 * r19
            float r8 = r8 + r9
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r0 = r0 * r13
            float r0 = r0 * r19
            float r10 = r10 + r0
            r0 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 - r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r0 = r0 * r12
            float r0 = r0 * r19
            float r8 = r8 + r0
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r0 = r0 * r12
            float r0 = r0 * r19
            float r10 = r10 + r0
            r0 = 9
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r0 = r2.getNode(r0)
            com.badlogic.gdx.graphics.g2d.Batch r7 = r32.getBatch()
            r9 = 1065353216(0x3f800000, float:1.0)
            r0.drawNode(r7, r8, r10, r9)
            goto L260
        L25a:
            r29 = r2
            r30 = r11
            r2 = r32
        L260:
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            boolean r0 = r31.isDragOriginBased()
            r7 = 25
            r8 = 24
            if (r0 == 0) goto L2c2
            if (r39 == 0) goto L26f
            goto L271
        L26f:
            r7 = 24
        L271:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r2.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r16 = r32.getBatch()
            float r0 = r1.x
            float r19 = r21 + r0
            float r0 = r1.y
            float r20 = r22 + r0
            r17 = r21
            r18 = r22
            r15.drawDashedLine(r16, r17, r18, r19, r20)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r2.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r16 = r32.getBatch()
            float r0 = r4.x
            float r19 = r21 + r0
            float r0 = r4.y
            float r20 = r22 + r0
            r15.drawDashedLine(r16, r17, r18, r19, r20)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r2.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r16 = r32.getBatch()
            float r0 = r6.x
            float r19 = r21 + r0
            float r0 = r6.y
            float r20 = r22 + r0
            r15.drawDashedLine(r16, r17, r18, r19, r20)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r2.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r16 = r32.getBatch()
            float r0 = r14.x
            float r19 = r21 + r0
            float r0 = r14.y
            float r20 = r22 + r0
            r15.drawDashedLine(r16, r17, r18, r19, r20)
            goto L330
        L2c2:
            if (r39 == 0) goto L2cb
            r0 = 21
            r7 = 21
            r8 = 25
            goto L2cd
        L2cb:
            r7 = 20
        L2cd:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r2.getNode(r7)
            com.badlogic.gdx.graphics.g2d.Batch r16 = r32.getBatch()
            r17 = r21
            r18 = r22
            r19 = r3
            r20 = r5
            r15.drawLine(r16, r17, r18, r19, r20)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r23 = r2.getNode(r8)
            com.badlogic.gdx.graphics.g2d.Batch r24 = r32.getBatch()
            float r0 = r1.x
            float r27 = r21 + r0
            float r0 = r1.y
            float r28 = r22 + r0
            r25 = r3
            r26 = r5
            r23.drawDashedLine(r24, r25, r26, r27, r28)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r23 = r2.getNode(r8)
            com.badlogic.gdx.graphics.g2d.Batch r24 = r32.getBatch()
            float r0 = r4.x
            float r27 = r21 + r0
            float r0 = r4.y
            float r28 = r22 + r0
            r23.drawDashedLine(r24, r25, r26, r27, r28)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r23 = r2.getNode(r8)
            com.badlogic.gdx.graphics.g2d.Batch r24 = r32.getBatch()
            float r0 = r6.x
            float r27 = r21 + r0
            float r0 = r6.y
            float r28 = r22 + r0
            r23.drawDashedLine(r24, r25, r26, r27, r28)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r23 = r2.getNode(r8)
            com.badlogic.gdx.graphics.g2d.Batch r24 = r32.getBatch()
            float r0 = r14.x
            float r27 = r21 + r0
            float r0 = r14.y
            float r28 = r22 + r0
            r23.drawDashedLine(r24, r25, r26, r27, r28)
        L330:
            r0 = r30
            r1 = 1
            if (r0 == r1) goto L3bb
            r1 = 3
            if (r0 == r1) goto L3bb
            r0 = r31
            byte r1 = r0.mFlagLockedToCamera
            r3 = 2
            if (r1 == r3) goto L3bd
            float r1 = r31.getTouchPrecisionRatio()
            r3 = 1117782016(0x42a00000, float:80.0)
            float r1 = r1 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            if (r39 == 0) goto L350
            r3 = 47
            goto L352
        L350:
            r3 = 46
        L352:
            r4 = r37
            float r1 = r1 / r4
            r5 = 1067450368(0x3fa00000, float:1.25)
            float r1 = r1 * r5
            r5 = r29
            r6 = 1
            r0.getSpriteCorner(r6, r4, r1, r5)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r2.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r7 = r32.getBatch()
            float r8 = r5.x
            float r8 = r21 + r8
            float r9 = r5.y
            float r9 = r22 + r9
            r10 = 1065353216(0x3f800000, float:1.0)
            r6.drawNode(r7, r8, r9, r10)
            r6 = 2
            r0.getSpriteCorner(r6, r4, r1, r5)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r2.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r7 = r32.getBatch()
            float r8 = r5.x
            float r8 = r21 + r8
            float r9 = r5.y
            float r9 = r22 + r9
            r6.drawNode(r7, r8, r9, r10)
            r6 = 4
            r0.getSpriteCorner(r6, r4, r1, r5)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r2.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r7 = r32.getBatch()
            float r8 = r5.x
            float r8 = r21 + r8
            float r9 = r5.y
            float r9 = r22 + r9
            r6.drawNode(r7, r8, r9, r10)
            r6 = 8
            r0.getSpriteCorner(r6, r4, r1, r5)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r2.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r32.getBatch()
            float r3 = r5.x
            float r3 = r21 + r3
            float r4 = r5.y
            float r4 = r22 + r4
            r1.drawNode(r2, r3, r4, r10)
            goto L3bd
        L3bb:
            r0 = r31
        L3bd:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flagLockedToCamera(byte r1) {
            r0 = this;
            r0.mFlagLockedToCamera = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flipX(boolean r2) {
            r1 = this;
            r0 = 0
            r1.flipX(r0, r2)
            return
    }

    public void flipX(boolean r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.mIsFlippedX
            r0 = r0 ^ 1
            r4.mIsFlippedX = r0
            float r0 = r4.mAngle
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r4.mAngle = r0
            com.badlogic.gdx.math.Vector2 r0 = r4.mOrigin
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0.x
            float r1 = r1 - r2
            r0.x = r1
            boolean r0 = r4.isJoined()
            if (r0 == 0) goto L63
            r0 = 1127481344(0x43340000, float:180.0)
            if (r5 == 0) goto L27
            float r6 = r4.mJoinOffsetAngle
            float r0 = r0 - r6
            r4.mJoinOffsetAngle = r0
            goto L5a
        L27:
            r1 = 1135869952(0x43b40000, float:360.0)
            if (r6 == 0) goto L43
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r4.getJoinedToNode()
            float r6 = r6.getAngle()
            float r6 = r6 % r0
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3a
            float r6 = r6 + r1
        L3a:
            float r2 = r4.mAngle
            r3 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r3
            float r2 = r2 + r6
            r4.mAngle = r2
        L43:
            float r6 = r4.mAngle
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r4.mJoinedToNodeRef
            float r2 = r2.getAngle()
            float r6 = r6 - r2
            float r6 = r6 + r0
            float r6 = r6 % r1
            float r6 = r6 - r0
            r4.mJoinOffsetAngle = r6
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L58
            float r6 = r6 + r1
        L58:
            r4.mJoinOffsetAngle = r6
        L5a:
            if (r5 != 0) goto L63
            int r5 = r4.mSmartStretchState
            if (r5 == 0) goto L63
            r4.updateSmartStretchDefaults()
        L63:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flipY(boolean r2) {
            r1 = this;
            r0 = 0
            r1.flipY(r0, r2)
            return
    }

    public void flipY(boolean r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.mIsFlippedY
            r0 = r0 ^ 1
            r4.mIsFlippedY = r0
            float r0 = r4.mAngle
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r4.mAngle = r0
            com.badlogic.gdx.math.Vector2 r0 = r4.mOrigin
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0.y
            float r1 = r1 - r2
            r0.y = r1
            boolean r0 = r4.isJoined()
            if (r0 == 0) goto L63
            if (r5 == 0) goto L25
            float r6 = r4.mJoinOffsetAngle
            float r6 = -r6
            r4.mJoinOffsetAngle = r6
            goto L5a
        L25:
            r0 = 1135869952(0x43b40000, float:360.0)
            r1 = 1127481344(0x43340000, float:180.0)
            if (r6 == 0) goto L43
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r4.getJoinedToNode()
            float r6 = r6.getAngle()
            float r6 = r6 % r1
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3a
            float r6 = r6 + r0
        L3a:
            float r2 = r4.mAngle
            r3 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r3
            float r2 = r2 + r6
            r4.mAngle = r2
        L43:
            float r6 = r4.mAngle
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r4.mJoinedToNodeRef
            float r2 = r2.getAngle()
            float r6 = r6 - r2
            float r6 = r6 + r1
            float r6 = r6 % r0
            float r6 = r6 - r1
            r4.mJoinOffsetAngle = r6
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L58
            float r6 = r6 + r0
        L58:
            r4.mJoinOffsetAngle = r6
        L5a:
            if (r5 != 0) goto L63
            int r5 = r4.mSmartStretchState
            if (r5 == 0) goto L63
            r4.updateSmartStretchDefaults()
        L63:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getBlur() {
            r1 = this;
            float r0 = r1.mBlur
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getDsAlpha() {
            r1 = this;
            float r0 = r1.mDsAlpha
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getDsAngle() {
            r1 = this;
            int r0 = r1.mDsAngle
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getDsBlur() {
            r1 = this;
            float r0 = r1.mDsBlur
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getDsColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mDsColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getDsDistance() {
            r1 = this;
            int r0 = r1.mDsDistance
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getGlow() {
            r1 = this;
            float r0 = r1.mGlow
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getGlowColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mGlowColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getGlowIntensity() {
            r1 = this;
            float r0 = r1.mGlowIntensity
            return r0
    }

    public float getHeight() {
            r2 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r2.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r1 = r0.getTexture()
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0.getInternalScaleY()
            float r1 = r1 * r0
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getHueShift() {
            r1 = this;
            float r0 = r1.mHueShift
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getID() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean getIsInvertedColor() {
            r1 = this;
            boolean r0 = r1.mColorIsInverted
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getJoinOffsetAngle() {
            r1 = this;
            float r0 = r1.mJoinOffsetAngle
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.StickNode getJoinedToNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mJoinedToNodeRef
            return r0
    }

    public boolean getKeepJoinDuringInterpolation() {
            r1 = this;
            boolean r0 = r1.meKeepJoinDuringInterpolation
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getLibraryID() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.mSpriteSourceRef
            int r0 = r0.getLibraryId()
            return r0
    }

    public int getLockState() {
            r1 = this;
            boolean r0 = r1.isJoined()
            if (r0 == 0) goto Lc
            int r0 = r1.mSmartStretchState
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r1.mLockState
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.INode getMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r1.mMainNode
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getMotionBlurAngle() {
            r1 = this;
            int r0 = r1._motionBlurAngle
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean getMotionBlurIsOneDirection() {
            r1 = this;
            boolean r0 = r1.motionBlurIsOneDirection
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public java.lang.String getName() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.getSpriteSource()
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.INode getNodeAtDrawOrderIndex(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getNodeCount(boolean r1) {
            r0 = this;
            r1 = 2
            return r1
    }

    public float getNormalizedOriginX() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mOrigin
            float r0 = r0.x
            return r0
    }

    public float getNormalizedOriginY() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mOrigin
            float r0 = r0.y
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getOutlineAlpha() {
            r1 = this;
            float r0 = r1._outlineAlpha
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getOutlineColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._outlineColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getOutlineThickness() {
            r1 = this;
            float r0 = r1._outlineThickness
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getPixelation() {
            r1 = this;
            int r0 = r1._pixelation
            return r0
    }

    public byte[] getPixels() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.getSpriteSource()
            byte[] r0 = r0.getPixels()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void getPositionalData(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.mId
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2.mTransparency
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mBlur
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2._isMotionBlur
            r3.write(r0)
            boolean r0 = r2.motionBlurIsOneDirection
            r3.write(r0)
            int r0 = r2._motionBlurAngle
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2.mSaturation
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            int r0 = r2._pixelation
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2.mTintColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2.mTintAmount
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mHueShift
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2.mColorIsInverted
            r3.write(r0)
            float r0 = r2.mGlow
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2.mGlowColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2.mGlowIntensity
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2._outlineColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._outlineAlpha
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._outlineThickness
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2.mDsColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2.mDsAlpha
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            int r0 = r2.mDsDistance
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2.mDsAngle
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2.mDsBlur
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2.mIsUsingJoinParentFilters
            r3.write(r0)
            float r0 = r2.mScaleXYRatio
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mScaleX
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mScaleY
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2.mOrigin
            float r0 = r0.x
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2.mOrigin
            float r0 = r0.y
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2.mPosition
            float r0 = r0.x
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2.mPosition
            float r0 = r0.y
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2.mIsFlippedX
            r3.write(r0)
            boolean r0 = r2.mIsFlippedY
            r3.write(r0)
            boolean r0 = r2.mIsPersistentWhenTweening
            r3.write(r0)
            byte r0 = r2.mTweenMode
            r3.write(r0)
            boolean r0 = r2.mVisibleInOnionSkin
            r3.write(r0)
            int r0 = r2.mLockState
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2.mSmartStretchState
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2.mSmartStretchState
            if (r0 == 0) goto L112
            float r0 = r2.mSSRememberedAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSRememberedNodeLength
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSRememberedStickfigureScale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSRememberedNodeAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSRememberedScale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSCalcDefaultAngleFromNode
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSCalcDefaultWidth
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSCalcDefaultHeight
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.mSSCalcNegativeDiff
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
        L112:
            return
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.SpriteProperties r3) {
            r2 = this;
            com.badlogic.gdx.math.Vector2 r0 = r2.mPosition
            float r1 = r0.x
            r3.x = r1
            float r0 = r0.y
            r3.y = r0
            com.badlogic.gdx.math.Vector2 r0 = r2.mOrigin
            float r1 = r0.x
            r3.originX = r1
            float r0 = r0.y
            r3.originY = r0
            float r0 = r2.mScaleX
            r3.scaleX = r0
            float r0 = r2.mScaleY
            r3.scaleY = r0
            float r0 = r2.mAngle
            r3.angle = r0
            float r0 = r2.mTransparency
            r3.transparency = r0
            float r0 = r2.mBlur
            r3.blur = r0
            boolean r0 = r2._isMotionBlur
            r3.isMotionBlur = r0
            boolean r0 = r2.motionBlurIsOneDirection
            r3.motionBlurIsOmniDirectional = r0
            int r0 = r2._motionBlurAngle
            r3.motionBlurAngle = r0
            float r0 = r2.mSaturation
            r3.saturation = r0
            int r0 = r2._pixelation
            r3.pixelation = r0
            com.badlogic.gdx.graphics.Color r0 = r3.tintColor
            com.badlogic.gdx.graphics.Color r1 = r2.mTintColor
            r0.set(r1)
            float r0 = r2.mTintAmount
            r3.tintAmount = r0
            float r0 = r2.mHueShift
            r3.hueShift = r0
            boolean r0 = r2.mColorIsInverted
            r3.colorIsInverted = r0
            float r0 = r2.mGlow
            r3.glow = r0
            com.badlogic.gdx.graphics.Color r0 = r3.glowColor
            com.badlogic.gdx.graphics.Color r1 = r2.mGlowColor
            r0.set(r1)
            float r0 = r2.mGlowIntensity
            r3.glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r3.outlineColor
            com.badlogic.gdx.graphics.Color r1 = r2._outlineColor
            r0.set(r1)
            float r0 = r2._outlineAlpha
            r3.outlineAlpha = r0
            float r0 = r2._outlineThickness
            r3.outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r3.dsColor
            com.badlogic.gdx.graphics.Color r1 = r2.mDsColor
            r0.set(r1)
            float r0 = r2.mDsAlpha
            r3.dsAlpha = r0
            int r0 = r2.mDsDistance
            r3.dsDistance = r0
            int r0 = r2.mDsAngle
            r3.dsAngle = r0
            float r0 = r2.mDsBlur
            r3.dsBlur = r0
            boolean r0 = r2.mIsFlippedX
            r3.isFlippedX = r0
            boolean r0 = r2.mIsFlippedY
            r3.isFlippedY = r0
            float r0 = r2.mScaleXYRatio
            r3.scaleXYRatio = r0
            int r0 = r2.mLockState
            r3.lockState = r0
            boolean r0 = r2.mIsPersistentWhenTweening
            r3.isPersistentWhenTweening = r0
            byte r0 = r2.mTweenMode
            r3.mTweenMode = r0
            boolean r0 = r2.mVisibleInOnionSkin
            r3.visibleInOnionSkin = r0
            boolean r0 = r2.mIsUsingJoinParentFilters
            r3.isUsingJoinParentFilters = r0
            float r0 = r2.mSSRememberedAngle
            r3.sSRememberedAngle = r0
            float r0 = r2.mSSRememberedNodeLength
            r3.sSRememberedNodeLength = r0
            float r0 = r2.mSSRememberedStickfigureScale
            r3.sSRememberedStickfigureScale = r0
            float r0 = r2.mSSRememberedNodeAngle
            r3.sSRememberedNodeAngle = r0
            float r0 = r2.mSSRememberedScale
            r3.sSRememberedScale = r0
            float r0 = r2.mSSCalcDefaultAngleFromNode
            r3.sSCalcDefaultAngleFromNode = r0
            float r0 = r2.mSSCalcDefaultWidth
            r3.sSCalcDefaultWidth = r0
            float r0 = r2.mSSCalcDefaultHeight
            r3.sSCalcDefaultHeight = r0
            float r0 = r2.mSSCalcNegativeDiff
            r3.sSCalcNegativeDiff = r0
            int r0 = r2.mSmartStretchState
            r3.smartStretchState = r0
            float r0 = r2.mJoinOffsetAngle
            r3.mJoinOffsetAngle = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getRotation() {
            r1 = this;
            float r0 = r1.mAngle
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getSaturation() {
            r1 = this;
            float r0 = r1.mSaturation
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getScale() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot read the scale of a SpriteRef like this."
            r0.<init>(r1)
            throw r0
    }

    public boolean getScaleLinked() {
            r1 = this;
            boolean r0 = org.fortheloss.sticknodes.sprite.SpriteRef.scale_is_linked
            return r0
    }

    public float getScaleX() {
            r2 = this;
            float r0 = r2.mScaleX
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r0 = 1008981770(0x3c23d70a, float:0.01)
        La:
            return r0
    }

    public float getScaleY() {
            r2 = this;
            float r0 = r2.mScaleY
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r0 = 1008981770(0x3c23d70a, float:0.01)
        La:
            return r0
    }

    public float getScaledHeight() {
            r3 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r3.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r1 = r0.getTexture()
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r2 = r3.getScaleY()
            float r1 = r1 * r2
            float r0 = r0.getInternalScaleY()
            float r1 = r1 * r0
            return r1
    }

    public float getScaledWidth() {
            r3 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r3.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r1 = r0.getTexture()
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r2 = r3.getScaleX()
            float r1 = r1 * r2
            float r0 = r0.getInternalScaleX()
            float r1 = r1 * r0
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.INode getSelectedNode(float r8, float r9, float r10, boolean r11, boolean r12, org.fortheloss.sticknodes.NodeDigger r13) {
            r7 = this;
            if (r13 != 0) goto L4
            r13 = 0
            goto L8
        L4:
            org.fortheloss.sticknodes.stickfigure.INode r13 = r13.getLastSelectedNode()
        L8:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.fortheloss.sticknodes.stickfigure.INode r8 = r0.getSelectedNode(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public org.fortheloss.sticknodes.stickfigure.INode getSelectedNode(float r4, float r5, float r6, boolean r7, boolean r8, org.fortheloss.sticknodes.stickfigure.INode r9) {
            r3 = this;
            float r7 = org.fortheloss.sticknodes.stickfigure.Stickfigure.getNodeClickSizeSquared(r6)
            boolean r8 = r3.mIsJoined
            if (r8 != 0) goto L24
            org.fortheloss.sticknodes.sprite.SpriteNode r8 = r3.mMainNode
            float r8 = r8.getGlobalX()
            float r8 = r4 - r8
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r3.mMainNode
            float r0 = r0.getGlobalY()
            float r0 = r5 - r0
            float r8 = r8 * r8
            float r0 = r0 * r0
            float r8 = r8 + r0
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L24
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.mMainNode
            goto L25
        L24:
            r7 = 0
        L25:
            int r8 = r3.getLockState()
            float r0 = r3.getScaledWidth()
            float r0 = java.lang.Math.abs(r0)
            float r1 = r3.getScaledHeight()
            float r1 = java.lang.Math.abs(r1)
            float r0 = java.lang.Math.min(r0, r1)
            float r0 = r0 * r6
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r2 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r2
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6a
            boolean r0 = r9 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r0 == 0) goto L6a
            r0 = r9
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = (org.fortheloss.sticknodes.sprite.SpriteNode) r0
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getSpriteReference()
            if (r0 != r3) goto L6a
            boolean r0 = r3.isJoined()
            if (r0 != 0) goto L6a
            if (r8 == r2) goto L6a
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3.isWithinBounds(r4, r5)
            if (r0 == 0) goto L6a
            org.fortheloss.sticknodes.sprite.SpriteNode r4 = r3.mMainNode
            return r4
        L6a:
            boolean r0 = r3.mIsJoined
            if (r0 == 0) goto L72
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.mJoinedToNodeRef
            if (r0 == r9) goto L7a
        L72:
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r3.mMainNode
            if (r9 == r0) goto L7a
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r3.mVersatileNode
            if (r9 != r0) goto Lc7
        L7a:
            r9 = 2
            if (r8 == r2) goto L9f
            r0 = 3
            if (r8 == r0) goto L9f
            byte r0 = r3.mFlagLockedToCamera
            if (r0 == r9) goto L9f
            if (r7 != 0) goto L8a
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getCornerNode(r2, r4, r5, r6)
        L8a:
            if (r7 != 0) goto L90
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getCornerNode(r9, r4, r5, r6)
        L90:
            if (r7 != 0) goto L97
            r7 = 4
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getCornerNode(r7, r4, r5, r6)
        L97:
            if (r7 != 0) goto L9f
            r7 = 8
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getCornerNode(r7, r4, r5, r6)
        L9f:
            if (r8 == r2) goto Lc7
            if (r8 == r9) goto Lc7
            byte r8 = r3.mFlagLockedToCamera
            if (r8 == r9) goto Lc7
            if (r7 != 0) goto Laf
            r7 = 16
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getEdgeNode(r7, r4, r5, r6)
        Laf:
            if (r7 != 0) goto Lb7
            r7 = 32
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getEdgeNode(r7, r4, r5, r6)
        Lb7:
            if (r7 != 0) goto Lbf
            r7 = 64
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getEdgeNode(r7, r4, r5, r6)
        Lbf:
            if (r7 != 0) goto Lc7
            r7 = 128(0x80, float:1.794E-43)
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r3.getEdgeNode(r7, r4, r5, r6)
        Lc7:
            return r7
    }

    public int getSmartStretchState() {
            r1 = this;
            int r0 = r1.mSmartStretchState
            return r0
    }

    protected org.fortheloss.sticknodes.sprite.SpriteSource getSpriteSource() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.mSpriteSourceRef
            return r0
    }

    public com.badlogic.gdx.graphics.Texture getTexture() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r0 = r0.getTexture()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getTintAmount() {
            r1 = this;
            float r0 = r1.mTintAmount
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getTintColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mTintColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getTransparency() {
            r1 = this;
            float r0 = r1.mTransparency
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public byte getTweenMode() {
            r1 = this;
            byte r0 = r1.mTweenMode
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean getUseJoinParentFilters() {
            r1 = this;
            boolean r0 = r1.mIsUsingJoinParentFilters
            return r0
    }

    public float getWidth() {
            r2 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r2.getSpriteSource()
            com.badlogic.gdx.graphics.Texture r1 = r0.getTexture()
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0.getInternalScaleX()
            float r1 = r1 * r0
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getX() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mPosition
            float r0 = r0.x
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getY() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mPosition
            float r0 = r0.y
            return r0
    }

    public boolean hasRawRgbData() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.getSpriteSource()
            boolean r0 = r0.hasRawRgbData()
            return r0
    }

    public void highlightNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r1, float r2, float r3, float r4, float r5, float r6, boolean r7) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void interpolateValues(float r10, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12) {
            r9 = this;
            r0 = 0
            r9.mDoNotDraw = r0
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = (org.fortheloss.sticknodes.sprite.SpriteRef) r11
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = (org.fortheloss.sticknodes.sprite.SpriteRef) r12
            boolean r1 = r9.isJoined()
            r2 = 1
            if (r1 == 0) goto L15
            boolean r1 = r9.meKeepJoinDuringInterpolation
            if (r1 != 0) goto L13
            goto L15
        L13:
            r1 = 0
            goto L16
        L15:
            r1 = 1
        L16:
            boolean r3 = r11.mIsUsingJoinParentFilters
            r9.mIsUsingJoinParentFilters = r3
            boolean r3 = r11.mIsPersistentWhenTweening
            r9.mIsPersistentWhenTweening = r3
            int r3 = r11.mSmartStretchState
            r9.mSmartStretchState = r3
            float r3 = r11.mSSRememberedAngle
            r9.mSSRememberedAngle = r3
            float r3 = r11.mSSRememberedNodeLength
            r9.mSSRememberedNodeLength = r3
            float r3 = r11.mSSRememberedStickfigureScale
            r9.mSSRememberedStickfigureScale = r3
            float r3 = r11.mSSRememberedNodeAngle
            r9.mSSRememberedNodeAngle = r3
            float r3 = r11.mSSRememberedScale
            r9.mSSRememberedScale = r3
            float r3 = r11.mSSCalcDefaultAngleFromNode
            r9.mSSCalcDefaultAngleFromNode = r3
            float r3 = r11.mSSCalcDefaultWidth
            r9.mSSCalcDefaultWidth = r3
            float r3 = r11.mSSCalcDefaultHeight
            r9.mSSCalcDefaultHeight = r3
            float r3 = r11.mSSCalcNegativeDiff
            r9.mSSCalcNegativeDiff = r3
            boolean r3 = r11.mIsFlippedX
            r9.mIsFlippedX = r3
            boolean r3 = r11.mIsFlippedY
            r9.mIsFlippedY = r3
            boolean r3 = r11._isMotionBlur
            r9._isMotionBlur = r3
            boolean r3 = r11.motionBlurIsOneDirection
            r9.motionBlurIsOneDirection = r3
            int r3 = r11._motionBlurAngle
            r9._motionBlurAngle = r3
            boolean r3 = r11.mColorIsInverted
            r9.mColorIsInverted = r3
            if (r12 == 0) goto L61
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 == 0) goto L86
            byte r3 = r11.mTweenMode
            if (r3 != 0) goto L69
            goto L87
        L69:
            r0 = 2
            if (r3 != r0) goto L73
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.sine
            float r10 = r0.apply(r10)
            goto L86
        L73:
            r0 = 3
            if (r3 != r0) goto L7d
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.sineIn
            float r10 = r0.apply(r10)
            goto L86
        L7d:
            r0 = 4
            if (r3 != r0) goto L86
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.sineOut
            float r10 = r0.apply(r10)
        L86:
            r0 = r2
        L87:
            if (r0 == 0) goto L203
            float r0 = r11.mJoinOffsetAngle
            float r2 = r12.mJoinOffsetAngle
            float r2 = r2 - r0
            r3 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r3
            r4 = 1141309440(0x44070000, float:540.0)
            float r2 = r2 + r4
            float r2 = r2 % r3
            r5 = 1127481344(0x43340000, float:180.0)
            float r2 = r2 - r5
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mJoinOffsetAngle = r0
            com.badlogic.gdx.math.Vector2 r0 = r9.mOrigin
            com.badlogic.gdx.math.Vector2 r2 = r11.mOrigin
            float r6 = r2.x
            com.badlogic.gdx.math.Vector2 r7 = r12.mOrigin
            float r8 = r7.x
            float r8 = r8 - r6
            float r8 = r8 * r10
            float r6 = r6 + r8
            r0.x = r6
            float r2 = r2.y
            float r6 = r7.y
            float r6 = r6 - r2
            float r6 = r6 * r10
            float r2 = r2 + r6
            r0.y = r2
            float r0 = r11.mScaleX
            float r2 = r12.mScaleX
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mScaleX = r0
            float r0 = r11.mScaleY
            float r2 = r12.mScaleY
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mScaleY = r0
            float r0 = r11.mTransparency
            float r2 = r12.mTransparency
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mTransparency = r0
            float r0 = r11.mBlur
            float r2 = r12.mBlur
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mBlur = r0
            int r0 = r11._motionBlurAngle
            float r2 = (float) r0
            int r6 = r12._motionBlurAngle
            int r6 = r6 - r0
            int r6 = r6 % 360
            int r6 = r6 + 540
            int r6 = r6 % 360
            int r6 = r6 + (-180)
            float r0 = (float) r6
            float r0 = r0 * r10
            float r2 = r2 + r0
            int r0 = java.lang.Math.round(r2)
            r9._motionBlurAngle = r0
            float r0 = r11.mSaturation
            float r2 = r12.mSaturation
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mSaturation = r0
            int r0 = r11._pixelation
            float r2 = (float) r0
            int r6 = r12._pixelation
            int r6 = r6 - r0
            float r0 = (float) r6
            float r0 = r0 * r10
            float r2 = r2 + r0
            int r0 = java.lang.Math.round(r2)
            r9._pixelation = r0
            float r0 = r11.mTintAmount
            float r2 = r12.mTintAmount
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mTintAmount = r0
            com.badlogic.gdx.graphics.Color r0 = r9.mTintColor
            com.badlogic.gdx.graphics.Color r2 = r11.mTintColor
            com.badlogic.gdx.graphics.Color r0 = r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r12.mTintColor
            r0.lerp(r2, r10)
            float r0 = r11.mHueShift
            float r2 = r12.mHueShift
            float r2 = r2 - r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 % r6
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 + r7
            float r2 = r2 % r6
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r7
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mHueShift = r0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L144
            float r0 = r0 - r6
            r9.mHueShift = r0
            goto L14c
        L144:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L14c
            float r0 = r0 + r6
            r9.mHueShift = r0
        L14c:
            float r0 = r11.mGlow
            float r2 = r12.mGlow
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mGlow = r0
            com.badlogic.gdx.graphics.Color r0 = r9.mGlowColor
            com.badlogic.gdx.graphics.Color r2 = r11.mGlowColor
            com.badlogic.gdx.graphics.Color r0 = r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r12.mGlowColor
            r0.lerp(r2, r10)
            float r0 = r11.mGlowIntensity
            float r2 = r12.mGlowIntensity
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mGlowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r9._outlineColor
            com.badlogic.gdx.graphics.Color r2 = r11._outlineColor
            com.badlogic.gdx.graphics.Color r0 = r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r12._outlineColor
            r0.lerp(r2, r10)
            float r0 = r11._outlineAlpha
            float r2 = r12._outlineAlpha
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9._outlineAlpha = r0
            float r0 = r11._outlineThickness
            float r2 = r12._outlineThickness
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r9.mDsColor
            com.badlogic.gdx.graphics.Color r2 = r11.mDsColor
            com.badlogic.gdx.graphics.Color r0 = r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r12.mDsColor
            r0.lerp(r2, r10)
            float r0 = r11.mDsAlpha
            float r2 = r12.mDsAlpha
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mDsAlpha = r0
            int r0 = r11.mDsDistance
            float r2 = (float) r0
            int r6 = r12.mDsDistance
            int r6 = r6 - r0
            float r0 = (float) r6
            float r0 = r0 * r10
            float r2 = r2 + r0
            int r0 = java.lang.Math.round(r2)
            r9.mDsDistance = r0
            int r0 = r11.mDsAngle
            float r2 = (float) r0
            int r6 = r12.mDsAngle
            int r6 = r6 - r0
            int r6 = r6 % 360
            int r6 = r6 + 540
            int r6 = r6 % 360
            int r6 = r6 + (-180)
            float r0 = (float) r6
            float r0 = r0 * r10
            float r2 = r2 + r0
            int r0 = java.lang.Math.round(r2)
            r9.mDsAngle = r0
            float r0 = r11.mDsBlur
            float r2 = r12.mDsBlur
            float r2 = r2 - r0
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.mDsBlur = r0
            if (r1 == 0) goto L281
            float r0 = r11.mAngle
            float r1 = r12.mAngle
            float r1 = r1 - r0
            float r1 = r1 % r3
            float r1 = r1 + r4
            float r1 = r1 % r3
            float r1 = r1 - r5
            float r1 = r1 * r10
            float r0 = r0 + r1
            r9.mAngle = r0
            com.badlogic.gdx.math.Vector2 r0 = r9.mPosition
            com.badlogic.gdx.math.Vector2 r11 = r11.mPosition
            float r1 = r11.x
            com.badlogic.gdx.math.Vector2 r12 = r12.mPosition
            float r2 = r12.x
            float r2 = r2 - r1
            float r2 = r2 * r10
            float r1 = r1 + r2
            r0.x = r1
            float r11 = r11.y
            float r12 = r12.y
            float r12 = r12 - r11
            float r12 = r12 * r10
            float r11 = r11 + r12
            r0.y = r11
            goto L281
        L203:
            float r10 = r11.mJoinOffsetAngle
            r9.mJoinOffsetAngle = r10
            com.badlogic.gdx.math.Vector2 r10 = r9.mOrigin
            com.badlogic.gdx.math.Vector2 r12 = r11.mOrigin
            float r0 = r12.x
            r10.x = r0
            float r12 = r12.y
            r10.y = r12
            float r10 = r11.mScaleX
            r9.mScaleX = r10
            float r10 = r11.mScaleY
            r9.mScaleY = r10
            float r10 = r11.mTransparency
            r9.mTransparency = r10
            float r10 = r11.mBlur
            r9.mBlur = r10
            float r10 = r11.mSaturation
            r9.mSaturation = r10
            int r10 = r11._pixelation
            r9._pixelation = r10
            float r10 = r11.mTintAmount
            r9.mTintAmount = r10
            com.badlogic.gdx.graphics.Color r10 = r9.mTintColor
            com.badlogic.gdx.graphics.Color r12 = r11.mTintColor
            r10.set(r12)
            float r10 = r11.mHueShift
            r9.mHueShift = r10
            float r10 = r11.mGlow
            r9.mGlow = r10
            com.badlogic.gdx.graphics.Color r10 = r9.mGlowColor
            com.badlogic.gdx.graphics.Color r12 = r11.mGlowColor
            r10.set(r12)
            float r10 = r11.mGlowIntensity
            r9.mGlowIntensity = r10
            com.badlogic.gdx.graphics.Color r10 = r9._outlineColor
            com.badlogic.gdx.graphics.Color r12 = r11._outlineColor
            r10.set(r12)
            float r10 = r11._outlineAlpha
            r9._outlineAlpha = r10
            float r10 = r11._outlineThickness
            r9._outlineThickness = r10
            com.badlogic.gdx.graphics.Color r10 = r9.mDsColor
            com.badlogic.gdx.graphics.Color r12 = r11.mDsColor
            r10.set(r12)
            float r10 = r11.mDsAlpha
            r9.mDsAlpha = r10
            int r10 = r11.mDsDistance
            r9.mDsDistance = r10
            int r10 = r11.mDsAngle
            r9.mDsAngle = r10
            float r10 = r11.mDsBlur
            r9.mDsBlur = r10
            if (r1 == 0) goto L281
            float r10 = r11.mAngle
            r9.mAngle = r10
            com.badlogic.gdx.math.Vector2 r10 = r9.mPosition
            com.badlogic.gdx.math.Vector2 r11 = r11.mPosition
            float r12 = r11.x
            r10.x = r12
            float r11 = r11.y
            r10.y = r11
        L281:
            int r10 = r9.mSmartStretchState
            if (r10 == 0) goto L288
            r9.applySmartStretch()
        L288:
            return
    }

    public boolean isDragOriginBased() {
            r1 = this;
            boolean r0 = org.fortheloss.sticknodes.sprite.SpriteRef.drag_is_origin_based
            if (r0 != 0) goto Ld
            boolean r0 = r1.isJoined()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isJoined() {
            r1 = this;
            boolean r0 = r1.mIsJoined
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isLocked() {
            r2 = this;
            int r0 = r2.getLockState()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public byte isLockedToCamera() {
            r1 = this;
            byte r0 = r1.mFlagLockedToCamera
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isMotionBlur() {
            r1 = this;
            boolean r0 = r1._isMotionBlur
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isPersistent() {
            r1 = this;
            boolean r0 = r1.mIsPersistentWhenTweening
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isVisibleInOnionSkin() {
            r1 = this;
            boolean r0 = r1.mVisibleInOnionSkin
            return r0
    }

    public org.fortheloss.sticknodes.sprite.SpriteRef isWithinBounds(float r30, float r31) {
            r29 = this;
            r0 = r29
            float r1 = r29.getScaledWidth()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            double r1 = (double) r1
            float r3 = r29.getScaledHeight()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            double r3 = (double) r3
            float r5 = r29.getNormalizedOriginX()
            double r5 = (double) r5
            double r5 = r5 * r1
            float r7 = r29.getNormalizedOriginY()
            double r7 = (double) r7
            double r7 = r7 * r3
            double r9 = r1 * r3
            double r9 = java.lang.Math.abs(r9)
            float r11 = (float) r7
            float r12 = (float) r5
            float r11 = com.badlogic.gdx.math.MathUtils.atan2(r11, r12)
            r12 = 1113927392(0x42652ee0, float:57.295776)
            float r11 = r11 * r12
            double r5 = r5 * r5
            double r7 = r7 * r7
            double r5 = r5 + r7
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            double r5 = (double) r5
            float r7 = r29.getRotation()
            float r8 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            org.fortheloss.sticknodes.sprite.SpriteNode r13 = r0.mMainNode
            float r13 = r13.getGlobalX()
            double r13 = (double) r13
            float r11 = r11 + r7
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            r15 = r9
            double r9 = (double) r7
            double r9 = r9 * r5
            double r13 = r13 - r9
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r0.mMainNode
            float r7 = r7.getGlobalY()
            double r9 = (double) r7
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r11)
            r17 = r3
            double r3 = (double) r7
            double r3 = r3 * r5
            double r9 = r9 - r3
            double r3 = (double) r8
            double r5 = r3 * r1
            double r5 = r5 + r13
            double r7 = (double) r12
            double r1 = r1 * r7
            double r1 = r1 + r9
            double r7 = r7 * r17
            double r11 = r5 - r7
            double r3 = r3 * r17
            double r17 = r1 + r3
            double r7 = r13 - r7
            double r3 = r3 + r9
            r0 = r31
            r19 = r7
            double r7 = (double) r0
            double r21 = r1 - r7
            double r21 = r21 * r13
            double r23 = r7 - r9
            double r23 = r23 * r5
            double r21 = r21 + r23
            r0 = r30
            r23 = r13
            double r13 = (double) r0
            double r25 = r9 - r1
            double r25 = r25 * r13
            double r21 = r21 + r25
            r25 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r21 = r21 / r25
            r27 = r9
            double r9 = java.lang.Math.abs(r21)
            long r9 = (long) r9
            double r21 = r17 - r7
            double r5 = r5 * r21
            double r21 = r7 - r1
            double r21 = r21 * r11
            double r5 = r5 + r21
            double r1 = r1 - r17
            double r1 = r1 * r13
            double r5 = r5 + r1
            double r5 = r5 / r25
            double r0 = java.lang.Math.abs(r5)
            long r0 = (long) r0
            double r5 = r3 - r7
            double r11 = r11 * r5
            double r5 = r7 - r17
            double r5 = r5 * r19
            double r11 = r11 + r5
            double r17 = r17 - r3
            double r17 = r17 * r13
            double r11 = r11 + r17
            double r11 = r11 / r25
            double r5 = java.lang.Math.abs(r11)
            long r5 = (long) r5
            double r11 = r27 - r7
            double r11 = r11 * r19
            double r7 = r7 - r3
            double r7 = r7 * r23
            double r11 = r11 + r7
            double r3 = r3 - r27
            double r13 = r13 * r3
            double r11 = r11 + r13
            double r11 = r11 / r25
            double r2 = java.lang.Math.abs(r11)
            long r2 = (long) r2
            long r9 = r9 + r0
            long r9 = r9 + r5
            long r9 = r9 + r2
            double r0 = (double) r9
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 > 0) goto Led
            return r29
        Led:
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean joinTo(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.joinTo(r2, r0)
            return r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean joinTo(org.fortheloss.sticknodes.stickfigure.StickNode r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L48
            boolean r0 = r2.mIsJoined
            if (r0 != 0) goto L40
            r0 = 1
            r2.mIsJoined = r0
            r2.mJoinedToNodeRef = r3
            r3.addJoinedFigure(r2)
            if (r4 != 0) goto L2b
            float r3 = r2.mAngle
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2.mJoinedToNodeRef
            float r4 = r4.getAngle()
            float r3 = r3 - r4
            r4 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 + r4
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            float r3 = r3 - r4
            r2.mJoinOffsetAngle = r3
            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L29
            float r3 = r3 + r1
        L29:
            r2.mJoinOffsetAngle = r3
        L2b:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.mJoinedToNodeRef
            float r3 = r3.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2.mJoinedToNodeRef
            float r4 = r4.getGlobalY()
            r2.setPosition(r3, r4)
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = r2.mMainNode
            r3.flagPositionAsDirty()
            return r0
        L40:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't join, this sprite is already joined."
            r3.<init>(r4)
            throw r3
        L48:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't join to a null node."
            r3.<init>(r4)
            throw r3
    }

    public void readPositionalData(int r10, int r11, java.io.DataInputStream r12) throws java.io.IOException {
            r9 = this;
            int r10 = r12.readInt()
            r9.mId = r10
            float r10 = r12.readFloat()
            r9.mTransparency = r10
            float r10 = r12.readFloat()
            r9.mBlur = r10
            r10 = 16
            r0 = 0
            r1 = 1
            r2 = 0
            if (r11 < r10) goto L36
            int r3 = r12.read()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            r9._isMotionBlur = r3
            int r3 = r12.read()
            if (r3 == 0) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            r9.motionBlurIsOneDirection = r3
            int r3 = r12.readInt()
            r9._motionBlurAngle = r3
            goto L68
        L36:
            int r3 = r12.read()
            if (r3 == 0) goto L3e
            r3 = 1
            goto L3f
        L3e:
            r3 = 0
        L3f:
            int r4 = r12.read()
            if (r4 == 0) goto L47
            r4 = 1
            goto L48
        L47:
            r4 = 0
        L48:
            if (r3 == 0) goto L51
            if (r4 != 0) goto L51
            r9._isMotionBlur = r1
            r9._motionBlurAngle = r2
            goto L66
        L51:
            if (r3 != 0) goto L5c
            if (r4 == 0) goto L5c
            r9._isMotionBlur = r1
            r3 = 90
            r9._motionBlurAngle = r3
            goto L66
        L5c:
            if (r3 != 0) goto L66
            if (r4 != 0) goto L66
            r9._isMotionBlur = r2
            r9._motionBlurAngle = r2
            r9.mBlur = r0
        L66:
            r9.motionBlurIsOneDirection = r2
        L68:
            float r3 = r12.readFloat()
            r9.mSaturation = r3
            if (r11 < r10) goto L75
            int r3 = r12.readInt()
            goto L76
        L75:
            r3 = 1
        L76:
            r9._pixelation = r3
            int r3 = r12.readInt()
            com.badlogic.gdx.graphics.Color r4 = r9.mTintColor
            r5 = r3 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r6
            int r3 = r3 >> r10
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r6
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.set(r5, r7, r3, r8)
            float r3 = r12.readFloat()
            r9.mTintAmount = r3
            float r3 = r12.readFloat()
            r9.mHueShift = r3
            int r3 = r12.read()
            if (r3 == 0) goto La8
            r3 = 1
            goto La9
        La8:
            r3 = 0
        La9:
            r9.mColorIsInverted = r3
            float r3 = r12.readFloat()
            r9.mGlow = r3
            int r3 = r12.readInt()
            com.badlogic.gdx.graphics.Color r4 = r9.mGlowColor
            r5 = r3 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r6
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r6
            int r3 = r3 >> r10
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r6
            r4.set(r5, r7, r3, r8)
            float r3 = r12.readFloat()
            r9.mGlowIntensity = r3
            r3 = 32
            if (r11 < r3) goto Lf7
            int r3 = r12.readInt()
            com.badlogic.gdx.graphics.Color r4 = r9._outlineColor
            r5 = r3 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r6
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r6
            int r3 = r3 >> r10
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r6
            r4.set(r5, r7, r3, r8)
            float r3 = r12.readFloat()
            r9._outlineAlpha = r3
            float r3 = r12.readFloat()
            r9._outlineThickness = r3
        Lf7:
            int r3 = r12.readInt()
            com.badlogic.gdx.graphics.Color r4 = r9.mDsColor
            r5 = r3 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r6
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r6
            int r10 = r3 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r6
            r4.set(r5, r7, r10, r8)
            float r10 = r12.readFloat()
            r9.mDsAlpha = r10
            int r10 = r12.readInt()
            r9.mDsDistance = r10
            int r10 = r12.readInt()
            r9.mDsAngle = r10
            float r10 = r12.readFloat()
            r9.mDsBlur = r10
            int r10 = r12.read()
            if (r10 == 0) goto L130
            r10 = 1
            goto L131
        L130:
            r10 = 0
        L131:
            r9.mIsUsingJoinParentFilters = r10
            r10 = 2
            if (r11 >= r10) goto L13c
            r12.read()
            r12.read()
        L13c:
            float r10 = r12.readFloat()
            r9.mScaleXYRatio = r10
            float r10 = r12.readFloat()
            r9.mScaleX = r10
            float r10 = r12.readFloat()
            r9.mScaleY = r10
            com.badlogic.gdx.math.Vector2 r10 = r9.mOrigin
            float r3 = r12.readFloat()
            float r4 = r12.readFloat()
            r10.set(r3, r4)
            com.badlogic.gdx.math.Vector2 r10 = r9.mPosition
            float r3 = r12.readFloat()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            float r4 = r12.readFloat()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r10.set(r3, r4)
            float r10 = r12.readFloat()
            r9.mAngle = r10
            int r10 = r12.read()
            if (r10 == 0) goto L17e
            r10 = 1
            goto L17f
        L17e:
            r10 = 0
        L17f:
            r9.mIsFlippedX = r10
            int r10 = r12.read()
            if (r10 == 0) goto L189
            r10 = 1
            goto L18a
        L189:
            r10 = 0
        L18a:
            r9.mIsFlippedY = r10
            int r10 = r12.read()
            if (r10 == 0) goto L194
            r10 = 1
            goto L195
        L194:
            r10 = 0
        L195:
            r9.mIsPersistentWhenTweening = r10
            r10 = 78
            if (r11 < r10) goto L1a0
            byte r10 = r12.readByte()
            goto L1a1
        L1a0:
            r10 = 1
        L1a1:
            r9.mTweenMode = r10
            r10 = 15
            if (r11 < r10) goto L1b0
            int r10 = r12.read()
            if (r10 == 0) goto L1ae
            goto L1b0
        L1ae:
            r10 = 0
            goto L1b1
        L1b0:
            r10 = 1
        L1b1:
            r9.mVisibleInOnionSkin = r10
            int r10 = r12.readInt()
            r9.mLockState = r10
            int r10 = r12.readInt()
            r9.mSmartStretchState = r10
            if (r10 == 0) goto L1f7
            float r10 = r12.readFloat()
            r9.mSSRememberedAngle = r10
            float r10 = r12.readFloat()
            r9.mSSRememberedNodeLength = r10
            float r10 = r12.readFloat()
            r9.mSSRememberedStickfigureScale = r10
            float r10 = r12.readFloat()
            r9.mSSRememberedNodeAngle = r10
            float r10 = r12.readFloat()
            r9.mSSRememberedScale = r10
            float r10 = r12.readFloat()
            r9.mSSCalcDefaultAngleFromNode = r10
            float r10 = r12.readFloat()
            r9.mSSCalcDefaultWidth = r10
            float r10 = r12.readFloat()
            r9.mSSCalcDefaultHeight = r10
            float r10 = r12.readFloat()
            r9.mSSCalcNegativeDiff = r10
        L1f7:
            org.fortheloss.framework.IPlatform r10 = org.fortheloss.sticknodes.App.platform
            boolean r10 = r10.isPro()
            if (r10 != 0) goto L240
            r9.mColorIsInverted = r2
            r9.mTintAmount = r0
            com.badlogic.gdx.graphics.Color r10 = r9.mTintColor
            r10.set(r8, r8, r8, r8)
            r9.mHueShift = r0
            r9.mSaturation = r8
            r9._pixelation = r1
            r9.mBlur = r0
            r9._isMotionBlur = r2
            r9.motionBlurIsOneDirection = r2
            r9._motionBlurAngle = r2
            r9.mGlow = r0
            com.badlogic.gdx.graphics.Color r10 = r9.mGlowColor
            r11 = 1058444951(0x3f169697, float:0.5882353)
            r10.set(r0, r11, r8, r8)
            r9.mGlowIntensity = r8
            com.badlogic.gdx.graphics.Color r10 = r9._outlineColor
            r10.set(r8, r0, r11, r8)
            r9._outlineAlpha = r8
            r9._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r10 = r9.mDsColor
            r10.set(r0, r0, r0, r8)
            r9.mDsAlpha = r0
            r10 = 10
            r9.mDsDistance = r10
            r10 = 135(0x87, float:1.89E-43)
            r9.mDsAngle = r10
            r10 = 1056964608(0x3f000000, float:0.5)
            r9.mDsBlur = r10
            r9.mIsUsingJoinParentFilters = r2
        L240:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void rotateFigureBy(float r3) {
            r2 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L9
            float r3 = r3 + r0
        L9:
            float r0 = r2.mAngle
            float r0 = r0 + r3
            r2.mAngle = r0
            boolean r0 = r2.isJoined()
            if (r0 == 0) goto L20
            float r0 = r2.mJoinOffsetAngle
            float r0 = r0 + r3
            r2.mJoinOffsetAngle = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            r3.flagPositionAsDirty()
        L20:
            return
    }

    public void rotateFigureViaJoin(float r2) {
            r1 = this;
            float r0 = r1.mAngle
            float r0 = r0 + r2
            r1.mAngle = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setBlur(float r3) {
            r2 = this;
            r2.mBlur = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mBlur = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mBlur = r0
        L12:
            float r3 = r2.mBlur
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mBlur = r3
            return
    }

    public void setDragType(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef.drag_is_origin_based = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsAlpha(float r3) {
            r2 = this;
            r2.mDsAlpha = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mDsAlpha = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mDsAlpha = r0
        L12:
            float r3 = r2.mDsAlpha
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mDsAlpha = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsAngle(int r1) {
            r0 = this;
            int r1 = r1 % 360
            r0.mDsAngle = r1
        L4:
            int r1 = r0.mDsAngle
            if (r1 >= 0) goto Ld
            int r1 = r1 + 360
            r0.mDsAngle = r1
            goto L4
        Ld:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsBlur(float r3) {
            r2 = this;
            r2.mDsBlur = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mDsBlur = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mDsBlur = r0
        L12:
            float r3 = r2.mDsBlur
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mDsBlur = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mDsColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mDsColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsDistance(int r2) {
            r1 = this;
            r1.mDsDistance = r2
            r0 = -99999(0xfffffffffffe7961, float:NaN)
            if (r2 >= r0) goto La
            r1.mDsDistance = r0
            goto L11
        La:
            r0 = 99999(0x1869f, float:1.40128E-40)
            if (r2 <= r0) goto L11
            r1.mDsDistance = r0
        L11:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setFigureRotation(float r3) {
            r2 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L9
            float r3 = r3 + r0
        L9:
            float r0 = r2.mAngle
            r2.mAngle = r3
            boolean r3 = r2.isJoined()
            if (r3 == 0) goto L22
            float r3 = r2.mAngle
            float r3 = r3 - r0
            float r0 = r2.mJoinOffsetAngle
            float r0 = r0 + r3
            r2.mJoinOffsetAngle = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            r3.flagPositionAsDirty()
        L22:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setFilters(org.fortheloss.sticknodes.data.FigureFilterProperties r4) {
            r3 = this;
            if (r4 != 0) goto L32
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.mTransparency = r4
            r0 = 0
            r3.mColorIsInverted = r0
            r1 = 0
            r3.mTintAmount = r1
            r3.mHueShift = r1
            r3.mSaturation = r4
            r2 = 1
            r3._pixelation = r2
            r3.mBlur = r1
            r3._isMotionBlur = r0
            r3.motionBlurIsOneDirection = r0
            r3._motionBlurAngle = r0
            r3.mGlow = r1
            r3.mGlowIntensity = r4
            r3._outlineAlpha = r4
            r3._outlineThickness = r1
            r3.mDsAlpha = r1
            r4 = 10
            r3.mDsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r3.mDsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.mDsBlur = r4
            goto L96
        L32:
            float r0 = r4.transparency
            r3.mTransparency = r0
            boolean r0 = r4.colorIsInverted
            r3.mColorIsInverted = r0
            float r0 = r4.tintAmount
            r3.mTintAmount = r0
            com.badlogic.gdx.graphics.Color r0 = r3.mTintColor
            com.badlogic.gdx.graphics.Color r1 = r4.tintColor
            r0.set(r1)
            float r0 = r4.hueShift
            r3.mHueShift = r0
            float r0 = r4.saturation
            r3.mSaturation = r0
            int r0 = r4.pixelation
            r3._pixelation = r0
            float r0 = r4.blur
            r3.mBlur = r0
            boolean r0 = r4.isMotionBlur
            r3._isMotionBlur = r0
            boolean r0 = r4.motionBlurIsOneDirection
            r3.motionBlurIsOneDirection = r0
            int r0 = r4.motionBlurAngle
            r3._motionBlurAngle = r0
            float r0 = r4.glow
            r3.mGlow = r0
            com.badlogic.gdx.graphics.Color r0 = r3.mGlowColor
            com.badlogic.gdx.graphics.Color r1 = r4.glowColor
            r0.set(r1)
            float r0 = r4.glowIntensity
            r3.mGlowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r3._outlineColor
            com.badlogic.gdx.graphics.Color r1 = r4.outlineColor
            r0.set(r1)
            float r0 = r4.outlineAlpha
            r3._outlineAlpha = r0
            float r0 = r4.outlineThickness
            r3._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r3.mDsColor
            com.badlogic.gdx.graphics.Color r1 = r4.dsColor
            r0.set(r1)
            float r0 = r4.dsAlpha
            r3.mDsAlpha = r0
            int r0 = r4.dsDistance
            r3.mDsDistance = r0
            int r0 = r4.dsAngle
            r3.mDsAngle = r0
            float r4 = r4.dsBlur
            r3.mDsBlur = r4
        L96:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setGlow(float r3) {
            r2 = this;
            r2.mGlow = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mGlow = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mGlow = r0
        L12:
            float r3 = r2.mGlow
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mGlow = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setGlowColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mGlowColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mGlowColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setGlowIntensity(float r3) {
            r2 = this;
            r2.mGlowIntensity = r3
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2.mGlowIntensity = r0
            goto L13
        Lb:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2.mGlowIntensity = r0
        L13:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setHueShift(float r3) {
            r2 = this;
            r2.mHueShift = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mHueShift = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mHueShift = r0
        L12:
            float r3 = r2.mHueShift
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mHueShift = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setID(int r1) {
            r0 = this;
            r0.mId = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setInvertedColor(boolean r1) {
            r0 = this;
            r0.mColorIsInverted = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setJoinOffsetAngle(float r1) {
            r0 = this;
            r0.mJoinOffsetAngle = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setKeepJoinDuringInterpolation(boolean r1) {
            r0 = this;
            r0.meKeepJoinDuringInterpolation = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setLibraryID(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r1.mSpriteSourceRef
            r0.setLibraryId(r2)
            return
    }

    public void setLockState(int r1) {
            r0 = this;
            r0.mLockState = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setLocked(boolean r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Sprites do not lock like this"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setMotionBlur(boolean r1) {
            r0 = this;
            r0._isMotionBlur = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setMotionBlurAngle(int r1) {
            r0 = this;
            r0._motionBlurAngle = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setMotionBlurIsOneDirection(boolean r1) {
            r0 = this;
            r0.motionBlurIsOneDirection = r1
            return
    }

    public void setNormalizedOriginX(float r4) {
            r3 = this;
            com.badlogic.gdx.math.Vector2 r0 = r3.mOrigin
            r1 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r2 = 1176255488(0x461c3c00, float:9999.0)
            float r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r1, r2)
            r0.x = r4
            return
    }

    public void setNormalizedOriginY(float r4) {
            r3 = this;
            com.badlogic.gdx.math.Vector2 r0 = r3.mOrigin
            r1 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r2 = 1176255488(0x461c3c00, float:9999.0)
            float r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r1, r2)
            r0.y = r4
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setOutlineAlpha(float r3) {
            r2 = this;
            r2._outlineAlpha = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._outlineAlpha = r0
            goto L12
        Lb:
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L12
            r2._outlineAlpha = r0
        L12:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setOutlineColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._outlineColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1._outlineColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setOutlineThickness(float r3) {
            r2 = this;
            r2._outlineThickness = r3
            r0 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._outlineThickness = r0
            goto L12
        Lb:
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L12
            r2._outlineThickness = r0
        L12:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setPersist(boolean r1) {
            r0 = this;
            r0.mIsPersistentWhenTweening = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setPixelation(int r2) {
            r1 = this;
            r1._pixelation = r2
            r0 = 1
            if (r2 >= r0) goto L8
            r1._pixelation = r0
            goto Le
        L8:
            r0 = 99
            if (r2 <= r0) goto Le
            r1._pixelation = r0
        Le:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setPosition(float r2, float r3) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mPosition
            r0.set(r2, r3)
            return
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.SpriteProperties r3) {
            r2 = this;
            com.badlogic.gdx.math.Vector2 r0 = r2.mPosition
            float r1 = r3.x
            r0.x = r1
            float r1 = r3.y
            r0.y = r1
            com.badlogic.gdx.math.Vector2 r0 = r2.mOrigin
            float r1 = r3.originX
            r0.x = r1
            float r1 = r3.originY
            r0.y = r1
            float r0 = r3.scaleX
            r2.mScaleX = r0
            float r0 = r3.scaleY
            r2.mScaleY = r0
            float r0 = r3.angle
            r2.mAngle = r0
            com.badlogic.gdx.graphics.Color r0 = r2.mTintColor
            com.badlogic.gdx.graphics.Color r1 = r3.tintColor
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r2.mGlowColor
            com.badlogic.gdx.graphics.Color r1 = r3.glowColor
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r2._outlineColor
            com.badlogic.gdx.graphics.Color r1 = r3.outlineColor
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r2.mDsColor
            com.badlogic.gdx.graphics.Color r1 = r3.dsColor
            r0.set(r1)
            float r0 = r3.transparency
            r2.mTransparency = r0
            float r0 = r3.blur
            r2.mBlur = r0
            boolean r0 = r3.isMotionBlur
            r2._isMotionBlur = r0
            boolean r0 = r3.motionBlurIsOmniDirectional
            r2.motionBlurIsOneDirection = r0
            int r0 = r3.motionBlurAngle
            r2._motionBlurAngle = r0
            float r0 = r3.saturation
            r2.mSaturation = r0
            int r0 = r3.pixelation
            r2._pixelation = r0
            float r0 = r3.tintAmount
            r2.mTintAmount = r0
            float r0 = r3.hueShift
            r2.mHueShift = r0
            boolean r0 = r3.colorIsInverted
            r2.mColorIsInverted = r0
            float r0 = r3.glow
            r2.mGlow = r0
            float r0 = r3.outlineAlpha
            r2._outlineAlpha = r0
            float r0 = r3.outlineThickness
            r2._outlineThickness = r0
            float r0 = r3.glowIntensity
            r2.mGlowIntensity = r0
            float r0 = r3.dsAlpha
            r2.mDsAlpha = r0
            int r0 = r3.dsDistance
            r2.mDsDistance = r0
            int r0 = r3.dsAngle
            r2.mDsAngle = r0
            float r0 = r3.dsBlur
            r2.mDsBlur = r0
            boolean r0 = r3.isFlippedX
            r2.mIsFlippedX = r0
            boolean r0 = r3.isFlippedY
            r2.mIsFlippedY = r0
            float r0 = r3.scaleXYRatio
            r2.mScaleXYRatio = r0
            int r0 = r3.lockState
            r2.mLockState = r0
            boolean r0 = r3.isPersistentWhenTweening
            r2.mIsPersistentWhenTweening = r0
            byte r0 = r3.mTweenMode
            r2.mTweenMode = r0
            boolean r0 = r3.visibleInOnionSkin
            r2.mVisibleInOnionSkin = r0
            boolean r0 = r3.isUsingJoinParentFilters
            r2.mIsUsingJoinParentFilters = r0
            float r0 = r3.sSRememberedAngle
            r2.mSSRememberedAngle = r0
            float r0 = r3.sSRememberedNodeLength
            r2.mSSRememberedNodeLength = r0
            float r0 = r3.sSRememberedStickfigureScale
            r2.mSSRememberedStickfigureScale = r0
            float r0 = r3.sSRememberedNodeAngle
            r2.mSSRememberedNodeAngle = r0
            float r0 = r3.sSRememberedScale
            r2.mSSRememberedScale = r0
            float r0 = r3.sSCalcDefaultAngleFromNode
            r2.mSSCalcDefaultAngleFromNode = r0
            float r0 = r3.sSCalcDefaultWidth
            r2.mSSCalcDefaultWidth = r0
            float r0 = r3.sSCalcDefaultHeight
            r2.mSSCalcDefaultHeight = r0
            float r0 = r3.sSCalcNegativeDiff
            r2.mSSCalcNegativeDiff = r0
            int r0 = r3.smartStretchState
            r2.mSmartStretchState = r0
            float r3 = r3.mJoinOffsetAngle
            r2.mJoinOffsetAngle = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setSaturation(float r3) {
            r2 = this;
            r2.mSaturation = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mSaturation = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mSaturation = r0
        L12:
            float r3 = r2.mSaturation
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mSaturation = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setScale(float r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot set the scale of a SpriteRef, need to use setScaleX() and setScaleY()"
            r2.<init>(r0)
            throw r2
    }

    public void setScaleLinked(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef.scale_is_linked = r1
            return
    }

    public void setScaleX(float r2) {
            r1 = this;
            r0 = 0
            r1.setScaleX(r2, r0)
            return
    }

    public void setScaleX(float r6, boolean r7) {
            r5 = this;
            float r0 = r5.mScaleX
            r1 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r2 = 1176255488(0x461c3c00, float:9999.0)
            float r6 = com.badlogic.gdx.math.MathUtils.clamp(r6, r1, r2)
            r5.mScaleX = r6
            boolean r3 = org.fortheloss.sticknodes.sprite.SpriteRef.scale_is_linked
            if (r3 != 0) goto L21
            if (r7 == 0) goto L15
            goto L21
        L15:
            float r6 = r5.getScaleX()
            float r7 = r5.getScaleY()
            float r6 = r6 / r7
            r5.mScaleXYRatio = r6
            goto L42
        L21:
            float r7 = r5.mScaleXYRatio
            r4 = 0
            if (r3 != 0) goto L35
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L34
            float r7 = r5.mScaleY
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 != 0) goto L31
            goto L34
        L31:
            float r0 = r0 / r7
            r7 = r0
            goto L35
        L34:
            r7 = 0
        L35:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L42
            float r6 = r6 / r7
            r5.mScaleY = r6
            float r6 = com.badlogic.gdx.math.MathUtils.clamp(r6, r1, r2)
            r5.mScaleY = r6
        L42:
            return
    }

    public void setScaleY(float r2) {
            r1 = this;
            r0 = 0
            r1.setScaleY(r2, r0)
            return
    }

    public void setScaleY(float r7, boolean r8) {
            r6 = this;
            float r0 = r6.mScaleY
            r1 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r2 = 1176255488(0x461c3c00, float:9999.0)
            float r7 = com.badlogic.gdx.math.MathUtils.clamp(r7, r1, r2)
            r6.mScaleY = r7
            boolean r3 = org.fortheloss.sticknodes.sprite.SpriteRef.scale_is_linked
            if (r3 != 0) goto L21
            if (r8 == 0) goto L15
            goto L21
        L15:
            float r7 = r6.getScaleX()
            float r8 = r6.getScaleY()
            float r7 = r7 / r8
            r6.mScaleXYRatio = r7
            goto L47
        L21:
            float r8 = r6.mScaleXYRatio
            r4 = 1065353216(0x3f800000, float:1.0)
            float r8 = r4 / r8
            r5 = 0
            if (r3 != 0) goto L3a
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 == 0) goto L39
            float r8 = r6.mScaleX
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L35
            goto L39
        L35:
            float r4 = r4 / r8
            float r4 = r4 / r0
            r8 = r4
            goto L3a
        L39:
            r8 = 0
        L3a:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L47
            float r7 = r7 / r8
            r6.mScaleX = r7
            float r7 = com.badlogic.gdx.math.MathUtils.clamp(r7, r1, r2)
            r6.mScaleX = r7
        L47:
            return
    }

    public void setSmartStretchState(int r1) {
            r0 = this;
            r0.mSmartStretchState = r1
            if (r1 == 0) goto Ld
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto Ld
            r0.updateSmartStretchDefaults()
        Ld:
            return
    }

    public void setSpriteSource(org.fortheloss.sticknodes.sprite.SpriteSource r3) {
            r2 = this;
            r2.mSpriteSourceRef = r3
            com.badlogic.gdx.math.Vector2 r0 = r2.mOrigin
            float r1 = r3.getOriginX()
            float r3 = r3.getOriginY()
            r0.set(r1, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTintAmount(float r3) {
            r2 = this;
            r2.mTintAmount = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2.mTintAmount = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2.mTintAmount = r0
        L12:
            float r3 = r2.mTintAmount
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mTintAmount = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTintColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mTintColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1.mTintColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTransparency(float r3) {
            r2 = this;
            r2.mTransparency = r3
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2.mTransparency = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L16
            r2.mTransparency = r0
            goto L1e
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1e
            r2.mTransparency = r0
        L1e:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTweenMode(byte r1) {
            r0 = this;
            r0.mTweenMode = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setUseJoinParentFilters(boolean r1) {
            r0 = this;
            r0.mIsUsingJoinParentFilters = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setVisibleInOnionSkin(boolean r1) {
            r0 = this;
            r0.mVisibleInOnionSkin = r1
            return
    }

    public void toggleLockState() {
            r3 = this;
            int r0 = r3.mLockState
            r1 = 1
            if (r0 != 0) goto L8
            r3.mLockState = r1
            goto L17
        L8:
            r2 = 2
            if (r0 != r1) goto Le
            r3.mLockState = r2
            goto L17
        Le:
            if (r0 != r2) goto L14
            r0 = 3
            r3.mLockState = r0
            goto L17
        L14:
            r0 = 0
            r3.mLockState = r0
        L17:
            return
    }

    public void toggleSmartStretchState() {
            r2 = this;
            int r0 = r2.mSmartStretchState
            r1 = 1
            if (r0 != 0) goto L9
            r2.setSmartStretchState(r1)
            goto L14
        L9:
            if (r0 != r1) goto L10
            r0 = 2
            r2.setSmartStretchState(r0)
            goto L14
        L10:
            r0 = 0
            r2.setSmartStretchState(r0)
        L14:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void unjoin() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.mJoinedToNodeRef
            if (r0 == 0) goto L11
            r1 = 0
            r2.mIsJoined = r1
            r0.removeJoinedFigure(r2)
            r0 = 0
            r2.mJoinedToNodeRef = r0
            r2.setSmartStretchState(r1)
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't unjoin, this movieclip is not joined to anything."
            r0.<init>(r1)
            throw r0
    }

    public void updateSmartStretchDefaults() {
            r6 = this;
            int r0 = r6.mSmartStretchState
            if (r0 == 0) goto Lc0
            boolean r0 = r6.isJoined()
            if (r0 != 0) goto Lc
            goto Lc0
        Lc:
            r6.validateDirtyNodes()
            int r0 = r6.mSmartStretchState
            r1 = 1
            if (r0 != r1) goto L19
            float r0 = r6.getScaleX()
            goto L1d
        L19:
            float r0 = r6.getScaleY()
        L1d:
            r6.mSSRememberedScale = r0
            float r0 = r6.getRotation()
            r6.mSSRememberedAngle = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r6.getJoinedToNode()
            float r1 = r1.getLength()
            float r0 = java.lang.Math.max(r0, r1)
            r6.mSSRememberedNodeLength = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6.getJoinedToNode()
            float r0 = r0.getAngle()
            r6.mSSRememberedNodeAngle = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            float r0 = r0.getScale()
            r6.mSSRememberedStickfigureScale = r0
            float r0 = r6.mSSRememberedAngle
            float r1 = r6.mSSRememberedNodeAngle
            float r0 = r0 - r1
            r6.mSSCalcDefaultAngleFromNode = r0
        L55:
            float r0 = r6.mSSCalcDefaultAngleFromNode
            r1 = 1135869952(0x43b40000, float:360.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L61
            float r0 = r0 - r1
            r6.mSSCalcDefaultAngleFromNode = r0
            goto L55
        L61:
            float r0 = r6.mSSCalcDefaultAngleFromNode
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L6c
            float r0 = r0 + r1
            r6.mSSCalcDefaultAngleFromNode = r0
            goto L61
        L6c:
            r2 = 1065353216(0x3f800000, float:1.0)
            r6.mSSCalcNegativeDiff = r2
            r2 = 1132920832(0x43870000, float:270.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = 1127481344(0x43340000, float:180.0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L7e
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 < 0) goto L82
        L7e:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L86
        L82:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.mSSCalcNegativeDiff = r5
        L86:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L8e
            float r1 = r1 - r0
            r6.mSSCalcDefaultAngleFromNode = r1
            goto L9d
        L8e:
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 <= 0) goto L96
            float r0 = r0 - r4
            r6.mSSCalcDefaultAngleFromNode = r0
            goto L9d
        L96:
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 <= 0) goto L9d
            float r4 = r4 - r0
            r6.mSSCalcDefaultAngleFromNode = r4
        L9d:
            float r0 = r6.mSSCalcDefaultAngleFromNode
            r1 = 1016003125(0x3c8efa35, float:0.017453292)
            float r0 = r0 * r1
            double r2 = (double) r0
            double r2 = java.lang.Math.sin(r2)
            float r0 = (float) r2
            float r2 = r6.mSSRememberedScale
            float r0 = r0 * r2
            r6.mSSCalcDefaultHeight = r0
            float r0 = r6.mSSCalcDefaultAngleFromNode
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r1 = r6.mSSRememberedScale
            float r0 = r0 * r1
            r6.mSSCalcDefaultWidth = r0
        Lc0:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void validateDirtyNodes() {
            r0 = this;
            return
    }
}
