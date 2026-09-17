package org.fortheloss.sticknodes.movieclip;

/* loaded from: classes2.dex */
public class MCReference implements org.fortheloss.sticknodes.animationscreen.IDrawableFigure, org.fortheloss.sticknodes.sprite.IStatefigure {
    private static final com.badlogic.gdx.math.Matrix4 _rememberedTransformationMatrix = null;
    private int _animatingDuringDelayFlag;
    private float _blur;
    private boolean _colorIsInverted;
    private int _currentFrameIndex;
    private boolean _doNotDraw;
    private boolean _drawsTweenedStickfigureArray;
    private float _dsAlpha;
    private int _dsAngle;
    private float _dsBlur;
    private com.badlogic.gdx.graphics.Color _dsColor;
    private int _dsDistance;
    private boolean _flagIsOnceAndDonePlaying;
    private byte _flagLockedToCamera;
    private int _flipX;
    private int _flipY;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;
    private float _glow;
    private com.badlogic.gdx.graphics.Color _glowColor;
    private float _glowIntensity;
    private float _hueShift;
    private int _id;
    private boolean _isJoined;
    private boolean _isLocked;
    private boolean _isMotionBlur;
    private boolean _isPersistentWhenTweening;
    private boolean _isUsingJoinParentFilters;
    private org.fortheloss.sticknodes.stickfigure.StickNode _joinedToNodeRef;
    private org.fortheloss.sticknodes.movieclip.MCNode _mainNode;
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _mcSourceRef;
    private int _motionBlurAngle;
    private org.fortheloss.sticknodes.movieclip.MCReference _originMCRef;
    private float _outlineAlpha;
    private com.badlogic.gdx.graphics.Color _outlineColor;
    private float _outlineThickness;
    private int _pixelation;
    private boolean _playDuringDelay;
    private int _playmode;
    private com.badlogic.gdx.math.Vector2 _position;
    private float _saturation;
    private float _scale;
    private org.fortheloss.sticknodes.movieclip.MCNode _secondaryNode;
    private int _startFrameIndex;
    private float _tintAmount;
    private com.badlogic.gdx.graphics.Color _tintColor;
    private float _transparency;
    private float _volumeScale;
    private float mJoinOffsetAngle;
    private boolean mStateIsControlled;
    private byte mTweenMode;
    private boolean mVisibleInOnionSkin;
    private boolean meKeepJoinDuringInterpolation;
    private boolean motionBlurIsOneDirection;

    static {
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            org.fortheloss.sticknodes.movieclip.MCReference._rememberedTransformationMatrix = r0
            return
    }

    public MCReference(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2, org.fortheloss.sticknodes.data.FrameData r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r2, r3, r0)
            return
    }

    public MCReference(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6, org.fortheloss.sticknodes.data.FrameData r7, int r8) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5._id = r0
            r5._currentFrameIndex = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r5._scale = r1
            r2 = 1
            r5._flipX = r2
            r5._flipY = r2
            r5.mStateIsControlled = r0
            r3 = 2
            r5._playmode = r3
            r5._playDuringDelay = r2
            r5._startFrameIndex = r0
            r5._volumeScale = r1
            r5._doNotDraw = r0
            r5._isLocked = r0
            r5.meKeepJoinDuringInterpolation = r2
            r5._isPersistentWhenTweening = r0
            r5.mTweenMode = r2
            r5.mVisibleInOnionSkin = r2
            r5._drawsTweenedStickfigureArray = r0
            r5._animatingDuringDelayFlag = r0
            r5._flagIsOnceAndDonePlaying = r0
            r5._isJoined = r0
            r3 = 0
            r5.mJoinOffsetAngle = r3
            r5._flagLockedToCamera = r0
            r5._transparency = r1
            r5._blur = r3
            r5._isMotionBlur = r0
            r5.motionBlurIsOneDirection = r0
            r5._motionBlurAngle = r0
            r5._saturation = r1
            r5._pixelation = r2
            r5._tintAmount = r3
            r5._hueShift = r3
            r5._colorIsInverted = r0
            r5._glow = r3
            r5._glowIntensity = r1
            r5._outlineAlpha = r1
            r5._outlineThickness = r3
            r5._dsAlpha = r3
            r2 = 10
            r5._dsDistance = r2
            r2 = 135(0x87, float:1.89E-43)
            r5._dsAngle = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r5._dsBlur = r2
            r5._isUsingJoinParentFilters = r0
            org.fortheloss.sticknodes.movieclip.MCNode r0 = new org.fortheloss.sticknodes.movieclip.MCNode
            r2 = 0
            r0.<init>(r5, r2)
            r5._mainNode = r0
            org.fortheloss.sticknodes.movieclip.MCNode r4 = new org.fortheloss.sticknodes.movieclip.MCNode
            r4.<init>(r5, r0)
            r5._secondaryNode = r4
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r5._position = r0
            r5._originMCRef = r2
            r5._mcSourceRef = r6
            r5._frameDataRef = r7
            r5._playmode = r8
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            r6.<init>(r1, r1, r1, r1)
            r5._tintColor = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            r7 = 1058444951(0x3f169697, float:0.5882353)
            r6.<init>(r3, r7, r1, r1)
            r5._glowColor = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            r6.<init>(r1, r3, r7, r1)
            r5._outlineColor = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            r6.<init>(r3, r3, r3, r1)
            r5._dsColor = r6
            r6 = -1
            r5._id = r6
            return
    }

    public MCReference(org.fortheloss.sticknodes.movieclip.MCReference r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4._id = r0
            r4._currentFrameIndex = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r4._scale = r1
            r2 = 1
            r4._flipX = r2
            r4._flipY = r2
            r4.mStateIsControlled = r0
            r3 = 2
            r4._playmode = r3
            r4._playDuringDelay = r2
            r4._startFrameIndex = r0
            r4._volumeScale = r1
            r4._doNotDraw = r0
            r4._isLocked = r0
            r4.meKeepJoinDuringInterpolation = r2
            r4._isPersistentWhenTweening = r0
            r4.mTweenMode = r2
            r4.mVisibleInOnionSkin = r2
            r4._drawsTweenedStickfigureArray = r0
            r4._animatingDuringDelayFlag = r0
            r4._flagIsOnceAndDonePlaying = r0
            r4._isJoined = r0
            r3 = 0
            r4.mJoinOffsetAngle = r3
            r4._flagLockedToCamera = r0
            r4._transparency = r1
            r4._blur = r3
            r4._isMotionBlur = r0
            r4.motionBlurIsOneDirection = r0
            r4._motionBlurAngle = r0
            r4._saturation = r1
            r4._pixelation = r2
            r4._tintAmount = r3
            r4._hueShift = r3
            r4._colorIsInverted = r0
            r4._glow = r3
            r4._glowIntensity = r1
            r4._outlineAlpha = r1
            r4._outlineThickness = r3
            r4._dsAlpha = r3
            r1 = 10
            r4._dsDistance = r1
            r1 = 135(0x87, float:1.89E-43)
            r4._dsAngle = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r4._dsBlur = r1
            r4._isUsingJoinParentFilters = r0
            r4._frameDataRef = r6
            org.fortheloss.sticknodes.movieclip.MCNode r6 = new org.fortheloss.sticknodes.movieclip.MCNode
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r5._mainNode
            r2 = 0
            r6.<init>(r4, r2, r1)
            r4._mainNode = r6
            org.fortheloss.sticknodes.movieclip.MCNode r1 = new org.fortheloss.sticknodes.movieclip.MCNode
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r5._secondaryNode
            r1.<init>(r4, r6, r3)
            r4._secondaryNode = r1
            int r6 = r5._id
            r4._id = r6
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6 = r5._mcSourceRef
            r4._mcSourceRef = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r6.<init>()
            r4._position = r6
            com.badlogic.gdx.math.Vector2 r1 = r5._position
            r6.set(r1)
            float r6 = r5._scale
            r4._scale = r6
            int r6 = r5._flipX
            r4._flipX = r6
            int r6 = r5._flipY
            r4._flipY = r6
            float r6 = r5._transparency
            r4._transparency = r6
            float r6 = r5._blur
            r4._blur = r6
            boolean r6 = r5._isMotionBlur
            r4._isMotionBlur = r6
            boolean r6 = r5.motionBlurIsOneDirection
            r4.motionBlurIsOneDirection = r6
            int r6 = r5._motionBlurAngle
            r4._motionBlurAngle = r6
            float r6 = r5._saturation
            r4._saturation = r6
            int r6 = r5._pixelation
            r4._pixelation = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r5._tintColor
            r6.<init>(r1)
            r4._tintColor = r6
            float r6 = r5._tintAmount
            r4._tintAmount = r6
            float r6 = r5._hueShift
            r4._hueShift = r6
            boolean r6 = r5._colorIsInverted
            r4._colorIsInverted = r6
            float r6 = r5._glow
            r4._glow = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r5._glowColor
            r6.<init>(r1)
            r4._glowColor = r6
            float r6 = r5._glowIntensity
            r4._glowIntensity = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r5._outlineColor
            r6.<init>(r1)
            r4._outlineColor = r6
            float r6 = r5._outlineAlpha
            r4._outlineAlpha = r6
            float r6 = r5._outlineThickness
            r4._outlineThickness = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r5._dsColor
            r6.<init>(r1)
            r4._dsColor = r6
            float r6 = r5._dsAlpha
            r4._dsAlpha = r6
            int r6 = r5._dsDistance
            r4._dsDistance = r6
            int r6 = r5._dsAngle
            r4._dsAngle = r6
            float r6 = r5._dsBlur
            r4._dsBlur = r6
            boolean r6 = r5._isUsingJoinParentFilters
            r4._isUsingJoinParentFilters = r6
            int r6 = r5._playmode
            r4._playmode = r6
            boolean r6 = r5._playDuringDelay
            r4._playDuringDelay = r6
            int r6 = r5._startFrameIndex
            r4._startFrameIndex = r6
            int r6 = r5._currentFrameIndex
            r4._currentFrameIndex = r6
            float r6 = r5._volumeScale
            r4._volumeScale = r6
            boolean r6 = r5._isLocked
            r4._isLocked = r6
            boolean r6 = r5._isPersistentWhenTweening
            r4._isPersistentWhenTweening = r6
            byte r6 = r5.mTweenMode
            r4.mTweenMode = r6
            boolean r6 = r5.mVisibleInOnionSkin
            r4.mVisibleInOnionSkin = r6
            boolean r6 = r5._drawsTweenedStickfigureArray
            r4._drawsTweenedStickfigureArray = r6
            r4._joinedToNodeRef = r2
            r4._flagLockedToCamera = r0
            float r5 = r5.mJoinOffsetAngle
            r4.mJoinOffsetAngle = r5
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
            r14 = 0
            r0.endFBO(r14)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0.fbo2
            if (r12 != r3) goto L34
            r21.beginFBO2()
            goto L37
        L34:
            r21.beginFBO3()
        L37:
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
            if (r27 == 0) goto Lad
            r0.endFBO(r15)
            r21.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r0.batch
            com.badlogic.gdx.math.Matrix4 r5 = r0.rememberedProjectionMatrixForMCs
            r1.setProjectionMatrix(r5)
            r5 = r3
            r3 = r2
            goto Lbd
        Lad:
            r0.endFBO(r14)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.fbo2
            if (r1 != r2) goto Lb8
            r21.beginFBO2()
            goto Lbb
        Lb8:
            r21.beginFBO3()
        Lbb:
            r3 = 0
            r5 = 0
        Lbd:
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
            if (r27 == 0) goto Lf5
            com.badlogic.gdx.graphics.g2d.Batch r0 = r0.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
        Lf5:
            return
    }

    private void renderDropShadow(org.fortheloss.sticknodes.animationscreen.FilterBundle r24, int r25, int r26, float r27, float r28, com.badlogic.gdx.graphics.Color r29, float r30, float r31) {
            r23 = this;
            r8 = r24
            r4 = r25
            r5 = r26
            r0 = r28
            r1 = r29
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r8.fboForMCs
            boolean r3 = r24.getBlurEnabled()
            r6 = 771(0x303, float:1.08E-42)
            r15 = 1
            if (r3 == 0) goto L166
            r3 = 0
            int r9 = (r30 > r3 ? 1 : (r30 == r3 ? 0 : -1))
            if (r9 > 0) goto L20
            int r9 = (r31 > r3 ? 1 : (r31 == r3 ? 0 : -1))
            if (r9 > 0) goto L20
            goto L166
        L20:
            float r9 = java.lang.Math.max(r30, r31)
            float r14 = (float) r4
            r10 = 1065353216(0x3f800000, float:1.0)
            float r13 = r10 / r14
            boolean r11 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r11 == 0) goto L49
            r11 = 1034147594(0x3da3d70a, float:0.08)
            float r9 = r9 * r11
            r11 = 1092616192(0x41200000, float:10.0)
            float r9 = com.badlogic.gdx.math.MathUtils.clamp(r9, r10, r11)
            r12 = -1087163597(0xffffffffbf333333, float:-0.7)
            float r9 = r9 * r12
            float r9 = r9 / r11
            float r9 = r9 + r10
            r11 = 1060320051(0x3f333333, float:0.7)
            float r9 = com.badlogic.gdx.math.MathUtils.clamp(r9, r11, r10)
            r19 = r9
            goto L4b
        L49:
            r19 = 1065353216(0x3f800000, float:1.0)
        L4b:
            r12 = 0
            r8.endFBO(r12)
            r24.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r9 = r8.batch
            r9.setBlendFunction(r15, r6)
            com.badlogic.gdx.graphics.g2d.Batch r9 = r8.batch
            com.badlogic.gdx.math.Matrix4 r9 = r9.getProjectionMatrix()
            r8.rememberProjectionMatrixForMCs(r9)
            com.badlogic.gdx.graphics.g2d.Batch r9 = r8.batch
            com.badlogic.gdx.utils.viewport.Viewport r11 = r8.fboViewport
            com.badlogic.gdx.graphics.Camera r11 = r11.getCamera()
            com.badlogic.gdx.math.Matrix4 r11 = r11.combined
            r9.setProjectionMatrix(r11)
            float r9 = r24.getFboScaleX()
            float r11 = r24.getFboScaleY()
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            com.badlogic.gdx.math.Matrix4 r6 = r3.getProjectionMatrix()
            com.badlogic.gdx.math.Matrix4 r6 = r6.scale(r9, r11, r10)
            r3.setProjectionMatrix(r6)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r6 = r8.dropShadowHBlurShader
            r3.setShader(r6)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            r3.begin()
            com.badlogic.gdx.graphics.g2d.Batch r3 = r8.batch
            float r6 = r1.r
            float r9 = r1.g
            float r11 = r1.b
            r3.setColor(r6, r9, r11, r10)
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
            if (r12 != 0) goto Lf4
            r8.endFBO(r2)
            r24.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r8.batch
            com.badlogic.gdx.math.Matrix4 r12 = r8.rememberedProjectionMatrixForMCs
            r2.setProjectionMatrix(r12)
            r12 = r11
            r11 = r10
            goto Lfd
        Lf4:
            r2 = 0
            r8.endFBO(r2)
            r24.beginFBO3()
            r11 = 0
            r12 = 0
        Lfd:
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
            if (r0 == 0) goto L162
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
            goto L163
        L162:
            r2 = r7
        L163:
            r0 = 771(0x303, float:1.08E-42)
            goto L1b0
        L166:
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
        L1b0:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r8.batch
            r3 = 770(0x302, float:1.079E-42)
            r1.setBlendFunction(r3, r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r8.batch
            r0.setShader(r2)
            return
    }

    private void renderMC(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r20, org.fortheloss.sticknodes.SNShapeRenderer r21, com.badlogic.gdx.graphics.g2d.Batch r22, org.fortheloss.sticknodes.animationscreen.FilterBundle r23, float r24, float r25, float r26, float r27, float r28, int r29, boolean r30, boolean r31, boolean r32) {
            r19 = this;
            r13 = r23
            r14 = 1
            if (r29 < 0) goto L84
            r0 = 1156579328(0x44f00000, float:1920.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            r3 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 * r3
            float r1 = r1 * r2
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r3 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r3 = r3[r29]
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            com.badlogic.gdx.math.Vector3[] r4 = org.fortheloss.sticknodes.movieclip.MCCache.offsets
            r4 = r4[r29]
            float r5 = r4.z
            float r5 = r26 / r5
            int r6 = r3.getHeight()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r7 = r3.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r5
            float r8 = r4.x
            float r8 = r8 * r5
            float r4 = r4.y
            float r4 = r4 * r5
            com.badlogic.gdx.graphics.g2d.Batch r5 = org.fortheloss.sticknodes.movieclip.MCCache.getRenderBatch()
            r9 = 771(0x303, float:1.08E-42)
            r5.setBlendFunction(r14, r9)
            com.badlogic.gdx.math.Matrix4 r10 = r21.getTransformMatrix()
            r5.setTransformMatrix(r10)
            com.badlogic.gdx.math.Matrix4 r10 = r21.getProjectionMatrix()
            r5.setProjectionMatrix(r10)
            r10 = 1065353216(0x3f800000, float:1.0)
            r5.setColor(r10, r10, r10, r10)
            r5.begin()
            float r0 = r24 + r0
            float r10 = r7 * r2
            float r0 = r0 - r10
            float r0 = r0 + r8
            float r1 = r25 + r1
            float r1 = r1 + r6
            float r2 = r2 * r6
            float r1 = r1 - r2
            float r1 = r1 + r4
            float r2 = -r6
            r20 = r5
            r21 = r3
            r22 = r0
            r23 = r1
            r24 = r7
            r25 = r2
            r20.draw(r21, r22, r23, r24, r25)
            r5.end()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 770(0x302, float:1.079E-42)
            r0.glBlendFuncSeparate(r1, r9, r1, r9)
            goto Lcb
        L84:
            if (r13 == 0) goto L8d
            float r0 = r19.getRotation()
            r13.setExtraRotation(r0)
        L8d:
            int r15 = r20.size()
            r16 = 0
            r12 = 0
        L94:
            if (r12 >= r15) goto Lc5
            r11 = r20
            java.lang.Object r0 = r11.get(r12)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            r9 = 0
            r10 = 0
            if (r31 == 0) goto La7
            if (r30 != 0) goto La7
            r17 = 1
            goto La9
        La7:
            r17 = 0
        La9:
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r27
            r7 = r28
            r8 = r26
            r11 = r32
            r18 = r12
            r12 = r17
            r0.drawLimbs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r12 = r18 + 1
            goto L94
        Lc5:
            if (r13 == 0) goto Lcb
            r0 = 0
            r13.setExtraRotation(r0)
        Lcb:
            return
    }

    public void animateDuringDelay(int r5, int r6, boolean r7, int r8) {
            r4 = this;
            r0 = 2
            r1 = 1
            if (r7 != 0) goto L38
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r4._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r7 = r7.size()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r8 = r4._mcSourceRef
            boolean r8 = r8.getTweenLoopProtectionEnabled()
            if (r8 == 0) goto L20
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r8 = r4._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r8.frames
            int r8 = r8.size()
            if (r8 <= r1) goto L20
            int r7 = r7 + (-1)
        L20:
            r4._animatingDuringDelayFlag = r1
            int r8 = r4.getPlaymode()
            if (r8 != r0) goto L2e
            int r5 = r5 + r6
            int r5 = r5 % r7
            r4._currentFrameIndex = r5
            goto Lbe
        L2e:
            int r5 = r5 + r6
            int r7 = r7 - r1
            int r5 = java.lang.Math.min(r5, r7)
            r4._currentFrameIndex = r5
            goto Lbe
        L38:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r4._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r7 = r7.size()
            int r8 = r8 + r1
            int r2 = r6 / r8
            int r6 = r6 % r8
            int r3 = r4.getPlaymode()
            if (r3 != r0) goto L8a
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r4._mcSourceRef
            boolean r3 = r3.getTweenLoopProtectionEnabled()
            if (r3 == 0) goto L5e
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r4._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r3 = r3.size()
            if (r3 <= r1) goto L5e
            int r7 = r7 + (-1)
        L5e:
            int r5 = r5 + r2
            int r5 = r5 % r7
            r4._currentFrameIndex = r5
            if (r6 != 0) goto L67
            r4._animatingDuringDelayFlag = r1
            goto Lbe
        L67:
            r4._animatingDuringDelayFlag = r0
            float r6 = (float) r6
            float r7 = (float) r8
            float r6 = r6 / r7
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r4._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r5 = r7.get(r5)
            org.fortheloss.sticknodes.data.MCFrameData r5 = (org.fortheloss.sticknodes.data.MCFrameData) r5
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r4._mcSourceRef
            int r8 = r4._currentFrameIndex
            java.util.ArrayList r7 = r7.getIndicesForOrderOfTweeningOfFrame(r8)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r8 = r4._mcSourceRef
            int r0 = r4._currentFrameIndex
            java.util.ArrayList r8 = r8.getIndicesForNextFrameFiguresFromFrame(r0)
            r5.tweenFigures(r7, r8, r6, r1)
            goto Lbe
        L8a:
            int r5 = r5 + r2
            int r7 = r7 - r1
            int r5 = java.lang.Math.min(r5, r7)
            r4._currentFrameIndex = r5
            if (r5 != r7) goto L97
            r4._animatingDuringDelayFlag = r1
            goto Lbe
        L97:
            if (r6 != 0) goto L9c
            r4._animatingDuringDelayFlag = r1
            goto Lbe
        L9c:
            r4._animatingDuringDelayFlag = r0
            float r6 = (float) r6
            float r7 = (float) r8
            float r6 = r6 / r7
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r4._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r5 = r7.get(r5)
            org.fortheloss.sticknodes.data.MCFrameData r5 = (org.fortheloss.sticknodes.data.MCFrameData) r5
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r4._mcSourceRef
            int r8 = r4._currentFrameIndex
            java.util.ArrayList r7 = r7.getIndicesForOrderOfTweeningOfFrame(r8)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r8 = r4._mcSourceRef
            int r0 = r4._currentFrameIndex
            java.util.ArrayList r8 = r8.getIndicesForNextFrameFiguresFromFrame(r0)
            r5.tweenFigures(r7, r8, r6, r1)
        Lbe:
            return
    }

    public void calculateCurrentFrameIndex(int r12, int r13, boolean r14) {
            r11 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lf
            r11._currentFrameIndex = r1
            return
        Lf:
            int r0 = r11.getPlaymode()
            boolean r3 = r11.getPlayDuringDelay()
            r4 = 2
            if (r0 != 0) goto L62
            int r12 = r11._currentFrameIndex
            if (r12 >= 0) goto L21
            r11._currentFrameIndex = r1
            goto L37
        L21:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r13 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r13 = r13.frames
            int r13 = r13.size()
            int r13 = r13 - r2
            if (r12 <= r13) goto L37
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r12 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r12.frames
            int r12 = r12.size()
            int r12 = r12 - r2
            r11._currentFrameIndex = r12
        L37:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r12 = r11._mcSourceRef
            boolean r12 = r12.getTweenLoopProtectionEnabled()
            if (r12 == 0) goto L61
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r12 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r12.frames
            int r12 = r12.size()
            if (r12 <= r2) goto L61
            int r12 = r11._currentFrameIndex
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r13 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r13 = r13.frames
            int r13 = r13.size()
            int r13 = r13 - r2
            if (r12 != r13) goto L61
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r12 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r12.frames
            int r12 = r12.size()
            int r12 = r12 - r4
            r11._currentFrameIndex = r12
        L61:
            return
        L62:
            int r5 = r11._startFrameIndex
            if (r5 >= 0) goto L69
            r11._startFrameIndex = r1
            goto L7e
        L69:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r6 = r6.size()
            if (r5 < r6) goto L7e
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r5.frames
            int r5 = r5.size()
            int r5 = r5 - r2
            r11._startFrameIndex = r5
        L7e:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5 = r11._mcSourceRef
            boolean r5 = r5.getTweenLoopProtectionEnabled()
            if (r5 == 0) goto L95
            int r5 = r11._startFrameIndex
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r6 = r6.size()
            int r6 = r6 - r2
            if (r5 != r6) goto L95
            r11._startFrameIndex = r1
        L95:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r12 = (float) r12
            float r5 = r5 / r12
            org.fortheloss.sticknodes.movieclip.MCReference r12 = r11._originMCRef
            if (r12 != 0) goto La2
            int r12 = r11._startFrameIndex
            r11._currentFrameIndex = r12
            return
        La2:
            org.fortheloss.sticknodes.data.FrameData r12 = r12.getFrame()
            org.fortheloss.sticknodes.data.FrameData r6 = r11._frameDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r7 = r11._originMCRef
            int r7 = r7.getStartFrameIndex()
            r8 = 0
        Laf:
            if (r12 == r6) goto Le8
            boolean r9 = r12.isDelayed()
            if (r9 == 0) goto Le1
            if (r3 == 0) goto Le1
            float r9 = r12.getDelaySeconds()
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto Le1
            if (r14 == 0) goto Ld8
            float r9 = r9 - r5
            float r9 = r9 / r5
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = r13 + 1
            float r10 = (float) r10
            float r9 = r9 / r10
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            int r9 = r9 + r2
            goto Ldf
        Ld8:
            float r9 = r9 / r5
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
        Ldf:
            int r8 = r8 + r9
            goto Le3
        Le1:
            int r8 = r8 + 1
        Le3:
            org.fortheloss.sticknodes.data.FrameData r12 = r12.getNextFrame()
            goto Laf
        Le8:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r12 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r12.frames
            int r12 = r12.size()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r13 = r11._mcSourceRef
            boolean r13 = r13.getTweenLoopProtectionEnabled()
            if (r13 == 0) goto Lfa
            int r12 = r12 + (-1)
        Lfa:
            if (r8 <= 0) goto L110
            int r8 = r8 + (-1)
            int r7 = r7 + 1
            if (r7 < r12) goto Lfa
            if (r0 != r4) goto L106
            r7 = 0
            goto Lfa
        L106:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r12 = r11._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r12.frames
            int r12 = r12.size()
            int r7 = r12 + (-1)
        L110:
            r11._currentFrameIndex = r7
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean checkIsJoinedTo(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            boolean r0 = r1._isJoined
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._joinedToNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            if (r0 != r2) goto L10
            r2 = 1
            return r2
        L10:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._joinedToNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            boolean r2 = r0.checkIsJoinedTo(r2)
            return r2
    }

    public void convertToOrigin() {
            r1 = this;
            r0 = 0
            r1._originMCRef = r0
            int r0 = r1._currentFrameIndex
            r1._startFrameIndex = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._mainNode
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._mainNode = r1
        La:
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._secondaryNode
            if (r0 == 0) goto L13
            r0.dispose()
            r2._secondaryNode = r1
        L13:
            r2._mcSourceRef = r1
            r2._originMCRef = r1
            r2._frameDataRef = r1
            r2._position = r1
            r2._joinedToNodeRef = r1
            r2._tintColor = r1
            r2._glowColor = r1
            r2._outlineColor = r1
            r2._dsColor = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void doNotDraw() {
            r1 = this;
            r0 = 1
            r1._doNotDraw = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void drawLimbs(org.fortheloss.sticknodes.SNShapeRenderer r121, com.badlogic.gdx.graphics.g2d.Batch r122, org.fortheloss.sticknodes.animationscreen.FilterBundle r123, float r124, float r125, float r126, float r127, float r128, boolean r129, org.fortheloss.sticknodes.stickfigure.INode r130, boolean r131, boolean r132) {
            r120 = this;
            r14 = r120
            r15 = r121
            r13 = r123
            boolean r0 = r14._doNotDraw
            r12 = 0
            if (r0 == 0) goto Le
            r14._doNotDraw = r12
            return
        Le:
            r0 = 1156579328(0x44f00000, float:1920.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r16 = 1056964608(0x3f000000, float:0.5)
            float r17 = r0 * r16
            r0 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 * r0
            float r18 = r1 * r16
            float r0 = r120.getX()
            float r0 = r0 - r126
            r11 = 1065353216(0x3f800000, float:1.0)
            float r1 = r128 - r11
            float r0 = r0 * r1
            float r2 = r120.getY()
            float r2 = r2 - r127
            float r2 = r2 * r1
            float r1 = r120.getX()
            float r1 = r1 + r124
            float r1 = r1 + r0
            float r19 = r1 - r17
            float r1 = r120.getY()
            float r1 = r1 + r125
            float r1 = r1 + r2
            float r20 = r1 - r18
            float r1 = r14._scale
            float r21 = r128 * r1
            int r1 = r120.getPlaymode()
            if (r1 != 0) goto L5d
            int r1 = r120.getLibraryID()
            int r3 = r120.getCurrentFrameIndex()
            int r1 = org.fortheloss.sticknodes.movieclip.MCCache.getCachedIndex(r1, r3)
            r22 = r1
            goto L60
        L5d:
            r1 = -1
            r22 = -1
        L60:
            if (r22 < 0) goto L65
            r121.flush()
        L65:
            int r1 = r14._currentFrameIndex
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r14._mcSourceRef
            boolean r3 = r3.getTweenLoopProtectionEnabled()
            r10 = 1
            if (r3 == 0) goto L7c
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r14._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r3 = r3.size()
            int r3 = r3 - r10
            if (r1 != r3) goto L7c
            r1 = 0
        L7c:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r14._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r3 = r3.size()
            if (r3 == r10) goto La3
            boolean r3 = r14._flagIsOnceAndDonePlaying
            if (r3 != 0) goto La3
            boolean r3 = r14._drawsTweenedStickfigureArray
            if (r3 != 0) goto L94
            int r3 = r14._animatingDuringDelayFlag
            r4 = 2
            if (r3 == r4) goto L94
            goto La3
        L94:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r14._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r1 = r3.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1
            java.util.ArrayList r1 = r1.getTweenedDrawableFigures()
            goto Lb1
        La3:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r14._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r1 = r3.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1
            java.util.ArrayList r1 = r1.getDrawableFigures()
        Lb1:
            r9 = r1
            r9.size()
            float r1 = r120.getX()
            float r1 = r1 + r124
            float r1 = r1 + r0
            float r0 = r120.getY()
            float r0 = r0 + r125
            float r0 = r0 + r2
            int r2 = r14._flipX
            float r2 = (float) r2
            int r3 = r14._flipY
            float r3 = (float) r3
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r14._secondaryNode
            float r4 = r4.getAngle()
            int r5 = r14._flipX
            if (r5 >= 0) goto Ld7
            float r4 = -r4
            r5 = 1127481344(0x43340000, float:180.0)
            float r4 = r4 - r5
        Ld7:
            int r5 = r14._flipY
            if (r5 >= 0) goto Ldc
            float r4 = -r4
        Ldc:
            r8 = 0
            int r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r5 != 0) goto Led
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 < 0) goto Led
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 >= 0) goto Lea
            goto Led
        Lea:
            r23 = 0
            goto Lef
        Led:
            r23 = 1
        Lef:
            if (r23 == 0) goto L128
            com.badlogic.gdx.math.Matrix4 r6 = org.fortheloss.sticknodes.movieclip.MCReference._rememberedTransformationMatrix
            com.badlogic.gdx.math.Matrix4 r7 = r121.getTransformMatrix()
            r6.set(r7)
            r121.end()
            com.badlogic.gdx.math.Matrix4 r6 = r121.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r6 = r6.translate(r1, r0, r8)
            com.badlogic.gdx.math.Matrix4 r2 = r6.scale(r2, r3, r11)
            com.badlogic.gdx.math.Matrix4 r2 = r2.rotate(r8, r8, r11, r4)
            float r1 = -r1
            float r0 = -r0
            com.badlogic.gdx.math.Matrix4 r0 = r2.translate(r1, r0, r8)
            r15.setTransformMatrix(r0)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r15.begin(r0)
            if (r13 == 0) goto L128
            boolean r0 = r123.isUsingRotatedTransformationMatrix()
            if (r5 == 0) goto L126
            r13.setIsUsingRotatedTransformationMatrix(r10)
        L126:
            r7 = r0
            goto L129
        L128:
            r7 = 0
        L129:
            int r0 = r9.size()
            int r0 = r0 - r10
        L12e:
            if (r0 < 0) goto L13c
            java.lang.Object r1 = r9.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r1.validateDirtyNodes()
            int r0 = r0 + (-1)
            goto L12e
        L13c:
            if (r13 == 0) goto L143
            float r0 = r123.getUVScale()
            goto L144
        L143:
            r0 = 0
        L144:
            float r1 = r14._transparency
            float r2 = r14._saturation
            int r3 = r14._pixelation
            float r3 = (float) r3
            float r4 = r14._hueShift
            boolean r5 = r14._colorIsInverted
            float r6 = r14._tintAmount
            com.badlogic.gdx.graphics.Color r10 = r14._tintColor
            float r12 = r14._blur
            boolean r11 = r14._isMotionBlur
            boolean r8 = r14.motionBlurIsOneDirection
            r125 = r1
            int r1 = r14._motionBlurAngle
            r127 = r1
            float r1 = r14._glow
            r128 = r1
            float r1 = r14._glowIntensity
            r24 = r1
            com.badlogic.gdx.graphics.Color r1 = r14._glowColor
            r25 = r1
            com.badlogic.gdx.graphics.Color r1 = r14._outlineColor
            r26 = r1
            float r1 = r14._outlineAlpha
            r27 = r1
            float r1 = r14._outlineThickness
            r28 = r1
            com.badlogic.gdx.graphics.Color r1 = r14._dsColor
            r29 = r1
            float r1 = r14._dsAlpha
            r30 = r1
            int r1 = r14._dsDistance
            float r1 = (float) r1
            float r31 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r31
            int r1 = java.lang.Math.round(r1)
            r31 = r1
            int r1 = r14._dsAngle
            r32 = r1
            float r1 = r14._dsBlur
            r33 = r2
            float r2 = r14._blur
            r34 = 1098907648(0x41800000, float:16.0)
            float r35 = r2 * r34
            float r35 = r35 + r34
            float r36 = org.fortheloss.sticknodes.App.assetScaling
            float r35 = r35 * r36
            r37 = r2
            float r2 = r14._glow
            float r2 = r2 * r34
            float r2 = r2 + r34
            float r2 = r2 * r36
            float r38 = r1 * r34
            float r38 = r38 + r34
            float r38 = r38 * r36
            r36 = r1
            if (r13 == 0) goto L1d1
            int r1 = r13.renderWidth
            r39 = r1
            int r1 = r13.renderHeight
            float r40 = r123.getFboScaleX()
            float r41 = r123.getFboScaleY()
            r42 = r1
            r1 = r39
            r39 = r12
            r12 = r40
            r40 = r11
            r11 = r41
            r41 = r10
            goto L1de
        L1d1:
            r41 = r10
            r40 = r11
            r39 = r12
            r1 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1065353216(0x3f800000, float:1.0)
            r42 = 0
        L1de:
            java.lang.String r10 = "u_texWidth"
            r43 = r10
            java.lang.String r10 = "u_blockSize"
            r44 = r10
            java.lang.String r10 = "u_steps"
            r45 = r10
            java.lang.String r10 = "u_normalizedOutlineThickness"
            r46 = 1000593162(0x3ba3d70a, float:0.005)
            r47 = r10
            r50 = 0
            int r51 = (r0 > r50 ? 1 : (r0 == r50 ? 0 : -1))
            if (r51 <= 0) goto L8e3
            boolean r50 = r120.isJoined()
            if (r50 == 0) goto L20e
            boolean r10 = r14._isUsingJoinParentFilters
            if (r10 == 0) goto L20e
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r120.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r10.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r10.getStickfigureToReferForFilters()
            goto L20f
        L20e:
            r10 = 0
        L20f:
            if (r10 == 0) goto L2bd
            float r2 = r10.getTransparency()
            float r3 = r10.getSaturation()
            int r4 = r10.getPixelation()
            float r4 = (float) r4
            float r5 = r10.getHueShift()
            boolean r6 = r10.getIsInvertedColor()
            float r8 = r10.getTintAmount()
            com.badlogic.gdx.graphics.Color r24 = r10.getTintColor()
            float r25 = r10.getBlur()
            boolean r26 = r10.isMotionBlur()
            boolean r27 = r10.getMotionBlurIsOneDirection()
            int r28 = r10.getMotionBlurAngle()
            float r29 = r10.getGlow()
            float r30 = r10.getGlowIntensity()
            com.badlogic.gdx.graphics.Color r31 = r10.getGlowColor()
            com.badlogic.gdx.graphics.Color r32 = r10.getOutlineColor()
            float r33 = r10.getOutlineAlpha()
            float r35 = r10.getOutlineThickness()
            com.badlogic.gdx.graphics.Color r36 = r10.getDsColor()
            float r37 = r10.getDsAlpha()
            r51 = r1
            int r1 = r10.getDsDistance()
            float r1 = (float) r1
            float r38 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r38
            int r1 = java.lang.Math.round(r1)
            int r38 = r10.getDsAngle()
            float r10 = r10.getDsBlur()
            float r39 = r25 * r34
            float r39 = r39 + r34
            float r40 = org.fortheloss.sticknodes.App.assetScaling
            float r39 = r39 * r40
            float r41 = r29 * r34
            float r41 = r41 + r34
            float r41 = r41 * r40
            float r52 = r10 * r34
            float r52 = r52 + r34
            float r40 = r40 * r52
            r52 = r5
            r53 = r6
            r54 = r8
            r57 = r24
            r58 = r26
            r56 = r27
            r26 = r30
            r27 = r33
            r55 = r36
            r30 = r37
            r59 = r39
            r60 = r40
            r5 = 0
            r24 = r2
            r33 = r3
            r37 = r25
            r39 = r37
            r2 = r28
            r28 = r31
            r3 = r38
            r31 = r1
            r1 = r35
            r25 = r10
            r10 = r32
            r32 = r4
            r4 = r39
            goto L2ec
        L2bd:
            r51 = r1
            r52 = r4
            r53 = r5
            r54 = r6
            r56 = r8
            r10 = r26
            r1 = r28
            r55 = r29
            r59 = r35
            r4 = r37
            r60 = r38
            r58 = r40
            r57 = r41
            r5 = 0
            r29 = r128
            r41 = r2
            r26 = r24
            r28 = r25
            r25 = r36
            r24 = r125
            r2 = r127
            r119 = r32
            r32 = r3
            r3 = r119
        L2ec:
            int r6 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r6 > 0) goto L303
            if (r23 == 0) goto L302
            r121.end()
            com.badlogic.gdx.math.Matrix4 r0 = org.fortheloss.sticknodes.movieclip.MCReference._rememberedTransformationMatrix
            r15.setTransformMatrix(r0)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r15.begin(r0)
            r13.setIsUsingRotatedTransformationMatrix(r7)
        L302:
            return
        L303:
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r61 = r1 * r5
            r1 = 0
            int r5 = (r39 > r1 ? 1 : (r39 == r1 ? 0 : -1))
            if (r5 <= 0) goto L30e
            r5 = 1
            goto L30f
        L30e:
            r5 = 0
        L30f:
            float r6 = r14._hueShift
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L31e
            r8 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L31e
            r62 = 1
            goto L320
        L31e:
            r62 = 0
        L320:
            int r6 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r6 <= 0) goto L32b
            int r6 = (r61 > r1 ? 1 : (r61 == r1 ? 0 : -1))
            if (r6 <= 0) goto L32b
            r63 = 1
            goto L32d
        L32b:
            r63 = 0
        L32d:
            if (r63 == 0) goto L354
            r1 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 * r61
            r6 = 1106247680(0x41f00000, float:30.0)
            float r1 = r1 / r6
            float r1 = r1 + r34
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r0
            float r1 = r1 * r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r8 = r21 - r6
            r34 = 1112014848(0x42480000, float:50.0)
            float r8 = r8 / r34
            r34 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r34
            float r8 = r8 + r6
            float r8 = java.lang.Math.max(r6, r8)
            float r1 = r1 * r8
            int r1 = (int) r1
            r8 = r1
            goto L355
        L354:
            r8 = 0
        L355:
            boolean r1 = r123.getBlurEnabled()
            if (r1 != 0) goto L35e
            r34 = 0
            goto L360
        L35e:
            r34 = r5
        L360:
            boolean r1 = r123.getGlowEnabled()
            if (r1 != 0) goto L368
            r29 = 0
        L368:
            if (r34 == 0) goto L397
            if (r58 == 0) goto L397
            float r1 = (float) r2
            boolean r2 = r123.isUsingRotatedTransformationMatrix()
            if (r2 != 0) goto L37c
            float r2 = r123.getExtraRotation()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L386
        L37c:
            float r2 = r123.getTransformationRotationDeg()
            float r4 = r123.getExtraRotation()
            float r2 = r2 + r4
            float r1 = r1 + r2
        L386:
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r2 = r2 * r39
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r39
            r65 = r1
            r64 = r2
            goto L39b
        L397:
            r65 = r4
            r64 = r37
        L39b:
            if (r34 == 0) goto L3a7
            float r0 = r123.getUVScaleBlur()
            r66 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            goto L3b4
        L3a7:
            r1 = 0
            int r2 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r2 <= 0) goto L3b0
            float r0 = r123.getUVScaleGlow()
        L3b0:
            r66 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
        L3b4:
            int r2 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r2 < 0) goto L3d5
            if (r34 != 0) goto L3d5
            if (r62 != 0) goto L3d5
            int r2 = (r33 > r0 ? 1 : (r33 == r0 ? 0 : -1))
            if (r2 != 0) goto L3d5
            int r2 = (r54 > r1 ? 1 : (r54 == r1 ? 0 : -1))
            if (r2 > 0) goto L3d5
            if (r53 != 0) goto L3d5
            int r2 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r2 > 0) goto L3d5
            int r1 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r1 > 0) goto L3d5
            if (r63 == 0) goto L3d1
            goto L3d5
        L3d1:
            r0 = 0
            r67 = 0
            goto L3d8
        L3d5:
            r0 = 0
            r67 = 1
        L3d8:
            int r1 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r1 <= 0) goto L7db
            int r1 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3e7
            float r0 = r123.getUVScaleBlur()
            r68 = r0
            goto L3e9
        L3e7:
            r68 = r66
        L3e9:
            r121.end()
            boolean r0 = r123.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L408
            com.badlogic.gdx.graphics.g2d.Batch r0 = r13.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            r13.rememberTransformationMatrixForMCs(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r13.batch
            com.badlogic.gdx.math.Matrix4 r1 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r1 = r1.idt()
            r0.setTransformMatrix(r1)
        L408:
            r123.popAndRememberScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r123.getDefaultFBO()
            float r5 = r13.renderX
            float r4 = r13.renderY
            boolean r2 = r123.willPopScissors()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r35 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r35 <= 0) goto L41f
            if (r63 == 0) goto L425
        L41f:
            int r1 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r1 > 0) goto L437
            if (r63 == 0) goto L437
        L425:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r13.fboForMCs2
            float r1 = r13.renderX
            r125 = r2
            float r2 = r13.renderY
            r127 = r10
            r10 = 0
            r13.setDefaultFBO(r0, r1, r2, r10)
            r123.beginFBOForMCs2()
            goto L448
        L437:
            r125 = r2
            r127 = r10
            r10 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r13.fboForMCs
            float r1 = r13.renderX
            float r2 = r13.renderY
            r13.setDefaultFBO(r0, r1, r2, r10)
            r123.beginFBOForMCs()
        L448:
            com.badlogic.gdx.math.Matrix4 r0 = r121.getProjectionMatrix()
            r13.rememberProjectionMatrixForMCs(r0)
            com.badlogic.gdx.utils.viewport.Viewport r0 = r13.fboViewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            com.badlogic.gdx.math.Matrix4 r0 = r0.combined
            r15.setProjectionMatrix(r0)
            com.badlogic.gdx.math.Matrix4 r0 = r121.getProjectionMatrix()
            float r1 = r13.renderX
            float r1 = -r1
            float r1 = r1 * r12
            float r1 = r1 * r68
            float r2 = r13.renderY
            float r2 = -r2
            float r2 = r2 * r11
            float r2 = r2 * r68
            r10 = 0
            com.badlogic.gdx.math.Matrix4 r0 = r0.translate(r1, r2, r10)
            float r1 = r12 * r68
            float r2 = r11 * r68
            r124 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r0 = r0.scale(r1, r2, r11)
            r15.setProjectionMatrix(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r13.batch
            com.badlogic.gdx.math.Matrix4 r1 = r121.getProjectionMatrix()
            r0.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r15.begin(r2)
            float r0 = (float) r3
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r14._secondaryNode
            float r1 = r1.getAngle()
            float r0 = r0 - r1
            int r0 = (int) r0
            int r1 = r14._flipX
            if (r1 >= 0) goto L4a4
            int r3 = r14._flipY
            if (r3 <= 0) goto L4a4
            int r31 = r31 * (-1)
            int r0 = 180 - r0
            goto L4ab
        L4a4:
            int r3 = r14._flipY
            if (r3 >= 0) goto L4ab
            if (r1 <= 0) goto L4ab
            int r0 = -r0
        L4ab:
            r1 = r31
            int r0 = r0 + 180
            float r0 = (float) r0
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r1 = (float) r1
            float r3 = r3 * r1
            float r3 = r3 * r21
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r0 = r0 * r1
            float r0 = r0 * r21
            float r3 = r19 + r3
            float r0 = r20 + r0
            if (r67 == 0) goto L535
            if (r35 <= 0) goto L535
            float r1 = r32 * r68
            float r31 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r31
            float r1 = r1 * r21
            int r1 = (int) r1
            r10 = 1
            int r1 = java.lang.Math.max(r1, r10)
            float r1 = (float) r1
            float r10 = r3 * r68
            float r11 = r0 * r68
            r128 = r2
            com.badlogic.gdx.math.Matrix4 r2 = r121.getTransformMatrix()
            com.badlogic.gdx.math.Vector3 r2 = r13.transformPoint(r10, r11, r2)
            float r10 = r2.x
            float r10 = r10 / r1
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            r37 = r4
            r36 = r5
            double r4 = (double) r1
            double r10 = r10 * r4
            r38 = r6
            float r6 = r2.x
            r39 = r7
            double r6 = (double) r6
            double r10 = r10 - r6
            float r6 = (float) r10
            float r7 = r2.y
            float r7 = r7 / r1
            double r10 = (double) r7
            double r10 = java.lang.Math.floor(r10)
            double r10 = r10 * r4
            float r2 = r2.y
            double r4 = (double) r2
            double r10 = r10 - r4
            float r2 = (float) r10
            boolean r4 = r123.isUsingRotatedTransformationMatrix()
            if (r4 == 0) goto L529
            com.badlogic.gdx.math.Matrix4 r4 = r121.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r4 = r13.getInvertedUntranslatedMatrix(r4)
            com.badlogic.gdx.math.Vector3 r4 = r13.transformPoint(r6, r2, r4)
            float r5 = r4.x
            float r5 = r5 / r68
            float r3 = r3 + r5
            float r4 = r4.y
            float r4 = r4 / r68
            goto L52e
        L529:
            float r4 = r6 / r68
            float r3 = r3 + r4
            float r4 = r2 / r68
        L52e:
            float r0 = r0 + r4
            r11 = r1
            r7 = r2
            r5 = r3
            r10 = r6
            r6 = r0
            goto L544
        L535:
            r128 = r2
            r37 = r4
            r36 = r5
            r38 = r6
            r39 = r7
            r6 = r0
            r5 = r3
            r7 = 0
            r10 = 0
            r11 = 0
        L544:
            r0 = r120
            r4 = r51
            r1 = r9
            r3 = r125
            r14 = r128
            r2 = r121
            r14 = r3
            r3 = r122
            r70 = r4
            r69 = r37
            r4 = r123
            r71 = r36
            r72 = r38
            r74 = r7
            r73 = r39
            r7 = r21
            r75 = r8
            r8 = r17
            r31 = r9
            r9 = r18
            r77 = r127
            r76 = r10
            r78 = r43
            r79 = r44
            r80 = r45
            r81 = r47
            r36 = 0
            r10 = r22
            r82 = r124
            r83 = r11
            r11 = r23
            r84 = r12
            r12 = r132
            r125 = r14
            r14 = r13
            r13 = r131
            r0.renderMC(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r121.end()
            com.badlogic.gdx.math.Matrix4 r0 = r14.rememberedProjectionMatrixForMCs
            r15.setProjectionMatrix(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedProjectionMatrixForMCs
            r0.setProjectionMatrix(r1)
            r12 = r125
            r11 = r69
            r10 = r71
            r9 = r72
            r14.setDefaultFBO(r9, r10, r11, r12)
            if (r131 == 0) goto L5b2
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r8 = 771(0x303, float:1.08E-42)
            r13 = 770(0x302, float:1.079E-42)
            r0.glBlendFuncSeparate(r13, r8, r13, r8)
            goto L5b6
        L5b2:
            r8 = 771(0x303, float:1.08E-42)
            r13 = 770(0x302, float:1.079E-42)
        L5b6:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fboForMCs2
            if (r35 <= 0) goto L680
            r7 = 0
            r14.endFBO(r7)
            if (r63 == 0) goto L5cc
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r14.fboForMCs
            com.badlogic.gdx.graphics.GLTexture r1 = r1.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r123.beginFBOForMCs2()
            goto L5da
        L5cc:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fboForMCs2
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r1 = r0
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r123.beginFBOForMCs()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fboForMCs
        L5da:
            r86 = r1
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r6 = 1
            r1.setBlendFunction(r6, r8)
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
            r4 = r82
            r5 = r84
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r5, r4, r3)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.pixelateShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            r2 = r83
            int r3 = (int) r2
            float r3 = (float) r3
            r6 = r79
            r1.setUniformf(r6, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            r3 = r70
            int r7 = r3 + (-1)
            float r7 = (float) r7
            r8 = r78
            r1.setUniformf(r8, r7)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.pixelateShader
            r7 = r42
            int r13 = r7 + (-1)
            float r13 = (float) r13
            r124 = r0
            java.lang.String r0 = "u_texHeight"
            r1.setUniformf(r0, r13)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r13 = r76
            float r1 = -r13
            float r35 = r2 * r16
            float r87 = r1 - r35
            r1 = r74
            float r2 = -r1
            float r88 = r2 - r35
            float r2 = (float) r3
            float r1 = (float) r7
            r91 = 0
            r92 = 0
            r93 = 1065353216(0x3f800000, float:1.0)
            r94 = 1065353216(0x3f800000, float:1.0)
            r85 = r0
            r89 = r2
            r90 = r1
            r85.draw(r86, r87, r88, r89, r90, r91, r92, r93, r94)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r2 = 0
            r0.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            r0 = r124
            goto L690
        L680:
            r7 = r42
            r3 = r70
            r13 = r76
            r8 = r78
            r6 = r79
            r4 = r82
            r5 = r84
            r2 = 771(0x303, float:1.08E-42)
        L690:
            if (r63 == 0) goto L750
            r1 = 0
            r14.endFBO(r1)
            r123.beginFBOForMCs()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r79 = r6
            r6 = 1
            r1.setBlendFunction(r6, r2)
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
            r6 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r5, r4, r6)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r6, r6, r6, r6)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.outlineShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            r2 = r77
            float r6 = r2.r
            r82 = r4
            float r4 = r2.g
            r84 = r5
            float r5 = r2.b
            java.lang.String r36 = "u_outlineRGB"
            r35 = r1
            r37 = r6
            r38 = r4
            r39 = r5
            r40 = r27
            r35.setUniformf(r36, r37, r38, r39, r40)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            float r4 = (float) r3
            float r5 = r61 / r4
            float r5 = r5 * r21
            float r5 = r5 * r66
            float r6 = (float) r7
            float r35 = r61 / r6
            float r35 = r35 * r21
            float r2 = r35 * r66
            r76 = r13
            r13 = r81
            r1.setUniformf(r13, r5, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.outlineShader
            r5 = r75
            float r2 = (float) r5
            r13 = r80
            r1.setUniformf(r13, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r86 = r0
            com.badlogic.gdx.graphics.Texture r86 = (com.badlogic.gdx.graphics.Texture) r86
            r87 = 0
            r88 = 0
            r91 = 0
            r92 = 0
            r93 = 1065353216(0x3f800000, float:1.0)
            r94 = 1065353216(0x3f800000, float:1.0)
            r85 = r1
            r89 = r4
            r90 = r6
            r85.draw(r86, r87, r88, r89, r90, r91, r92, r93, r94)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r2 = 0
            r0.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r4 = 771(0x303, float:1.08E-42)
            r6 = 770(0x302, float:1.079E-42)
            r0.setBlendFunction(r6, r4)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            goto L761
        L750:
            r82 = r4
            r84 = r5
            r79 = r6
            r76 = r13
            r5 = r75
            r13 = r80
            r2 = 0
            r4 = 771(0x303, float:1.08E-42)
            r6 = 770(0x302, float:1.079E-42)
        L761:
            float r0 = java.lang.Math.abs(r64)
            float r0 = r0 * r59
            float r25 = r25 * r60
            float r0 = r0 + r25
            float r0 = r0 * r21
            float r0 = r0 * r68
            float r1 = java.lang.Math.abs(r65)
            float r1 = r1 * r59
            float r1 = r1 + r25
            float r1 = r1 * r21
            float r1 = r1 * r68
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r1 = (float) r0
            float r25 = r30 * r24
            r0 = r120
            r30 = r1
            r35 = r74
            r36 = 0
            r1 = r123
            r38 = r77
            r37 = r83
            r2 = r3
            r95 = r3
            r80 = r13
            r13 = 1065353216(0x3f800000, float:1.0)
            r3 = r7
            r96 = r82
            r39 = 771(0x303, float:1.08E-42)
            r4 = r68
            r40 = r5
            r97 = r84
            r5 = r25
            r98 = r79
            r42 = 770(0x302, float:1.079E-42)
            r6 = r55
            r99 = r7
            r7 = r30
            r100 = r8
            r8 = r30
            r0.renderDropShadow(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r128
            r15.begin(r0)
            boolean r0 = r123.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L7cd
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r14.rememberedTransformationMatrixForMCs
            r0.setTransformMatrix(r1)
        L7cd:
            r7 = r120
            float r0 = r7._dsAlpha
            int r0 = (r0 > r46 ? 1 : (r0 == r46 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L7d8
            r7._dsAlpha = r1
        L7d8:
            r8 = r10
            r10 = r9
            goto L804
        L7db:
            r73 = r7
            r40 = r8
            r31 = r9
            r38 = r10
            r96 = r11
            r97 = r12
            r7 = r14
            r99 = r42
            r100 = r43
            r98 = r44
            r80 = r45
            r81 = r47
            r95 = r51
            r1 = 0
            r42 = 770(0x302, float:1.079E-42)
            r14 = r13
            r13 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r35 = 0
            r37 = 0
            r76 = 0
        L804:
            if (r67 == 0) goto L8c0
            r121.end()
            boolean r0 = r123.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L825
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            r14.rememberTransformationMatrixForMCs(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r2.idt()
            r0.setTransformMatrix(r2)
        L825:
            r123.popAndRememberScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r10 = r123.getDefaultFBO()
            float r8 = r14.renderX
            float r0 = r14.renderY
            boolean r2 = r123.willPopScissors()
            int r3 = (r32 > r13 ? 1 : (r32 == r13 ? 0 : -1))
            if (r3 <= 0) goto L83a
            if (r63 == 0) goto L840
        L83a:
            int r3 = (r32 > r13 ? 1 : (r32 == r13 ? 0 : -1))
            if (r3 > 0) goto L84e
            if (r63 == 0) goto L84e
        L840:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r14.fboForMCs2
            float r4 = r14.renderX
            float r5 = r14.renderY
            r9 = 0
            r14.setDefaultFBO(r3, r4, r5, r9)
            r123.beginFBOForMCs2()
            goto L85b
        L84e:
            r9 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r14.fboForMCs
            float r4 = r14.renderX
            float r5 = r14.renderY
            r14.setDefaultFBO(r3, r4, r5, r9)
            r123.beginFBOForMCs()
        L85b:
            com.badlogic.gdx.math.Matrix4 r3 = r121.getProjectionMatrix()
            r14.rememberProjectionMatrixForMCs(r3)
            com.badlogic.gdx.utils.viewport.Viewport r3 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r3 = r3.getCamera()
            com.badlogic.gdx.math.Matrix4 r3 = r3.combined
            r15.setProjectionMatrix(r3)
            com.badlogic.gdx.math.Matrix4 r3 = r121.getProjectionMatrix()
            float r4 = r14.renderX
            float r4 = -r4
            r5 = r97
            float r4 = r4 * r5
            float r4 = r4 * r66
            float r6 = r14.renderY
            float r6 = -r6
            r11 = r96
            float r6 = r6 * r11
            float r6 = r6 * r66
            com.badlogic.gdx.math.Matrix4 r3 = r3.translate(r4, r6, r1)
            float r12 = r5 * r66
            float r4 = r11 * r66
            com.badlogic.gdx.math.Matrix4 r3 = r3.scale(r12, r4, r13)
            r15.setProjectionMatrix(r3)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r14.batch
            com.badlogic.gdx.math.Matrix4 r4 = r121.getProjectionMatrix()
            r3.setProjectionMatrix(r4)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r15.begin(r3)
            r101 = r0
            r103 = r2
            r12 = r5
            r0 = r8
            r102 = r10
            r5 = r24
            r6 = r26
            r8 = r28
            r4 = r33
            r10 = r38
            r105 = r40
            r3 = r52
            r24 = r53
            r2 = r54
            r25 = r56
            r104 = r57
            goto L938
        L8c0:
            r9 = 0
            r0 = r8
            r102 = r10
            r101 = r11
            r103 = r12
            r5 = r24
            r6 = r26
            r8 = r28
            r4 = r33
            r10 = r38
            r105 = r40
            r3 = r52
            r24 = r53
            r2 = r54
            r25 = r56
            r104 = r57
            r11 = r96
            r12 = r97
            goto L938
        L8e3:
            r95 = r1
            r73 = r7
            r31 = r9
            r7 = r14
            r99 = r42
            r100 = r43
            r98 = r44
            r80 = r45
            r81 = r47
            r1 = 0
            r9 = 0
            r42 = 770(0x302, float:1.079E-42)
            r14 = r13
            r13 = 1065353216(0x3f800000, float:1.0)
            r29 = r128
            r66 = r0
            r32 = r3
            r3 = r4
            r10 = r26
            r61 = r28
            r4 = r33
            r59 = r35
            r64 = r37
            r65 = r64
            r58 = r40
            r104 = r41
            r0 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r62 = 0
            r63 = 0
            r67 = 0
            r76 = 0
            r101 = 0
            r102 = 0
            r103 = 1
            r105 = 0
            r41 = r2
            r2 = r6
            r6 = r24
            r24 = r5
            r5 = r125
            r119 = r25
            r25 = r8
            r8 = r119
        L938:
            if (r67 == 0) goto L9b0
            int r26 = (r32 > r13 ? 1 : (r32 == r13 ? 0 : -1))
            if (r26 <= 0) goto L9b0
            float r26 = r32 * r66
            float r28 = org.fortheloss.sticknodes.App.assetScaling
            float r26 = r26 * r28
            float r1 = r26 * r21
            int r1 = (int) r1
            r15 = 1
            int r1 = java.lang.Math.max(r1, r15)
            float r1 = (float) r1
            float r9 = r19 * r66
            float r13 = r20 * r66
            com.badlogic.gdx.math.Matrix4 r15 = r121.getTransformMatrix()
            com.badlogic.gdx.math.Vector3 r9 = r14.transformPoint(r9, r13, r15)
            float r13 = r9.x
            float r13 = r13 / r1
            r125 = r2
            r124 = r3
            double r2 = (double) r13
            double r2 = java.lang.Math.floor(r2)
            r127 = r4
            r126 = r5
            double r4 = (double) r1
            double r2 = r2 * r4
            float r13 = r9.x
            r128 = r6
            double r6 = (double) r13
            double r2 = r2 - r6
            float r2 = (float) r2
            float r3 = r9.y
            float r3 = r3 / r1
            double r6 = (double) r3
            double r6 = java.lang.Math.floor(r6)
            double r6 = r6 * r4
            float r3 = r9.y
            double r3 = (double) r3
            double r6 = r6 - r3
            float r3 = (float) r6
            boolean r4 = r123.isUsingRotatedTransformationMatrix()
            if (r4 == 0) goto L99f
            com.badlogic.gdx.math.Matrix4 r4 = r121.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r4 = r14.getInvertedUntranslatedMatrix(r4)
            com.badlogic.gdx.math.Vector3 r4 = r14.transformPoint(r2, r3, r4)
            float r5 = r4.x
            float r5 = r5 / r66
            float r19 = r19 + r5
            float r4 = r4.y
            float r4 = r4 / r66
            goto L9a5
        L99f:
            float r4 = r2 / r66
            float r19 = r19 + r4
            float r4 = r3 / r66
        L9a5:
            float r20 = r20 + r4
            r7 = r0
            r13 = r1
            r9 = r2
            r15 = r3
            r5 = r19
            r6 = r20
            goto L9c5
        L9b0:
            r125 = r2
            r124 = r3
            r127 = r4
            r126 = r5
            r128 = r6
            r7 = r0
            r5 = r19
            r6 = r20
            r15 = r35
            r13 = r37
            r9 = r76
        L9c5:
            r0 = r120
            r4 = 0
            r1 = r31
            r3 = r125
            r2 = r121
            r107 = r124
            r106 = r3
            r3 = r122
            r108 = r127
            r4 = r123
            r109 = r126
            r110 = r128
            r19 = r15
            r15 = r7
            r7 = r21
            r111 = r8
            r8 = r17
            r112 = r9
            r9 = r18
            r113 = r10
            r10 = r22
            r114 = r11
            r11 = r23
            r115 = r12
            r12 = r132
            r116 = r13
            r117 = r80
            r118 = r81
            r13 = r131
            r0.renderMC(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r67 == 0) goto L1211
            r121.end()
            com.badlogic.gdx.math.Matrix4 r0 = r14.rememberedProjectionMatrixForMCs
            r1 = r121
            r2 = 1
            r1.setProjectionMatrix(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r3 = r14.rememberedProjectionMatrixForMCs
            r0.setProjectionMatrix(r3)
            r11 = r101
            r10 = r102
            r12 = r103
            r14.setDefaultFBO(r10, r15, r11, r12)
            if (r131 == 0) goto La29
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r3 = 770(0x302, float:1.079E-42)
            r4 = 771(0x303, float:1.08E-42)
            r0.glBlendFuncSeparate(r3, r4, r3, r4)
            goto La2d
        La29:
            r3 = 770(0x302, float:1.079E-42)
            r4 = 771(0x303, float:1.08E-42)
        La2d:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fboForMCs2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r32 > r5 ? 1 : (r32 == r5 ? 0 : -1))
            if (r6 <= 0) goto Laf0
            r7 = 0
            r14.endFBO(r7)
            if (r63 == 0) goto La47
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r14.fboForMCs
            com.badlogic.gdx.graphics.GLTexture r8 = r8.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r123.beginFBOForMCs2()
            goto La55
        La47:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fboForMCs2
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r8 = r0
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r123.beginFBOForMCs()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r14.fboForMCs
        La55:
            r48 = r8
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            r8.setBlendFunction(r2, r4)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.math.Matrix4 r8 = r8.getProjectionMatrix()
            r14.rememberProjectionMatrix(r8)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r9 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r9 = r9.getCamera()
            com.badlogic.gdx.math.Matrix4 r9 = r9.combined
            r8.setProjectionMatrix(r9)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.math.Matrix4 r9 = r8.getProjectionMatrix()
            r11 = r114
            r10 = r115
            com.badlogic.gdx.math.Matrix4 r9 = r9.scale(r10, r11, r5)
            r8.setProjectionMatrix(r9)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            r8.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r14.pixelateShader
            r8.setShader(r9)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            r8.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r8 = r14.pixelateShader
            r9 = r116
            int r12 = (int) r9
            float r12 = (float) r12
            r13 = r98
            r8.setUniformf(r13, r12)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r8 = r14.pixelateShader
            r12 = r95
            int r13 = r12 + (-1)
            float r13 = (float) r13
            r15 = r100
            r8.setUniformf(r15, r13)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r8 = r14.pixelateShader
            r13 = r99
            int r15 = r13 + (-1)
            float r15 = (float) r15
            java.lang.String r5 = "u_texHeight"
            r8.setUniformf(r5, r15)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r8 = r112
            float r8 = -r8
            float r9 = r9 * r16
            float r49 = r8 - r9
            r8 = r19
            float r8 = -r8
            float r50 = r8 - r9
            float r8 = (float) r12
            float r9 = (float) r13
            r53 = 0
            r54 = 0
            r55 = 1065353216(0x3f800000, float:1.0)
            r56 = 1065353216(0x3f800000, float:1.0)
            r47 = r5
            r51 = r8
            r52 = r9
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r5.end()
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r8 = 0
            r5.setShader(r8)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r5.setBlendFunction(r3, r4)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            com.badlogic.gdx.math.Matrix4 r9 = r14.rememberedProjectionMatrix
            r5.setProjectionMatrix(r9)
            goto Lafa
        Laf0:
            r12 = r95
            r13 = r99
            r11 = r114
            r10 = r115
            r7 = 0
            r8 = 0
        Lafa:
            if (r63 == 0) goto Lbae
            r14.endFBO(r7)
            r123.beginFBOForMCs()
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r5.setBlendFunction(r2, r4)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            com.badlogic.gdx.math.Matrix4 r5 = r5.getProjectionMatrix()
            r14.rememberProjectionMatrix(r5)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r9 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r9 = r9.getCamera()
            com.badlogic.gdx.math.Matrix4 r9 = r9.combined
            r5.setProjectionMatrix(r9)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            com.badlogic.gdx.math.Matrix4 r9 = r5.getProjectionMatrix()
            r15 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r9 = r9.scale(r10, r11, r15)
            r5.setProjectionMatrix(r9)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r5.setColor(r15, r15, r15, r15)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r14.outlineShader
            r5.setShader(r9)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r14.batch
            r5.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r5 = r14.outlineShader
            r9 = r113
            float r15 = r9.r
            float r2 = r9.g
            float r9 = r9.b
            java.lang.String r16 = "u_outlineRGB"
            r124 = r5
            r125 = r16
            r126 = r15
            r127 = r2
            r128 = r9
            r129 = r27
            r124.setUniformf(r125, r126, r127, r128, r129)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.outlineShader
            float r5 = (float) r12
            float r9 = r61 / r5
            float r9 = r9 * r21
            float r9 = r9 * r66
            float r15 = (float) r13
            float r61 = r61 / r15
            float r61 = r61 * r21
            float r7 = r61 * r66
            r3 = r118
            r2.setUniformf(r3, r9, r7)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.outlineShader
            r9 = r105
            float r3 = (float) r9
            r7 = r117
            r2.setUniformf(r7, r3)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r48 = r0
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            r49 = 0
            r50 = 0
            r53 = 0
            r54 = 0
            r55 = 1065353216(0x3f800000, float:1.0)
            r56 = 1065353216(0x3f800000, float:1.0)
            r47 = r2
            r51 = r5
            r52 = r15
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.setShader(r8)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r2 = 770(0x302, float:1.079E-42)
            r0.setBlendFunction(r2, r4)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r14.rememberedProjectionMatrix
            r0.setProjectionMatrix(r2)
        Lbae:
            java.lang.String r0 = "u_texelSize"
            java.lang.String r2 = "u_blurPixels"
            r3 = 0
            int r5 = (r29 > r3 ? 1 : (r29 == r3 ? 0 : -1))
            if (r5 <= 0) goto Ldf9
            float r29 = r29 * r41
            float r29 = r29 * r21
            r5 = r120
            float r7 = r5._scale
            float r29 = r29 / r7
            float r7 = r29 * r66
            boolean r9 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r9 == 0) goto Lbcb
            r9 = 1063675494(0x3f666666, float:0.9)
            goto Lbcd
        Lbcb:
            r9 = 1065353216(0x3f800000, float:1.0)
        Lbcd:
            r15 = 0
            r14.endFBO(r15)
            r123.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r15 = r14.batch
            r8 = 1
            r15.setBlendFunction(r8, r4)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.math.Matrix4 r8 = r8.getProjectionMatrix()
            r14.rememberProjectionMatrixForMCs(r8)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r15 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r15 = r15.getCamera()
            com.badlogic.gdx.math.Matrix4 r15 = r15.combined
            r8.setProjectionMatrix(r15)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.math.Matrix4 r15 = r8.getProjectionMatrix()
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r15 = r15.scale(r10, r11, r4)
            r8.setProjectionMatrix(r15)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r15 = r14.hGlowShader
            r8.setShader(r15)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            r8.begin()
            com.badlogic.gdx.graphics.g2d.Batch r8 = r14.batch
            r8.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r14.hGlowShader
            r8 = r111
            float r15 = r8.r
            float r3 = r8.g
            float r1 = r8.b
            r84 = r10
            java.lang.String r10 = "u_glowRGB"
            r4.setUniformf(r10, r15, r3, r1)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            float r9 = r9 * r7
            r1.setUniformf(r2, r9)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            float r3 = (float) r12
            r4 = 1065353216(0x3f800000, float:1.0)
            float r10 = r4 / r3
            r1.setUniformf(r0, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            java.lang.String r4 = "u_glowIntensity"
            r10 = r110
            r1.setUniformf(r4, r10)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r14.fboForMCs
            com.badlogic.gdx.graphics.GLTexture r4 = r4.getColorBufferTexture()
            r48 = r4
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            r49 = 0
            r50 = 0
            float r51 = r3 * r66
            float r4 = (float) r13
            float r52 = r4 * r66
            r53 = 0
            r54 = 0
            r47 = r1
            r55 = r66
            r56 = r66
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            if (r34 != 0) goto Lc8f
            if (r62 != 0) goto Lc8f
            r1 = r108
            r15 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r16 != 0) goto Lc91
            r15 = r106
            r16 = 0
            int r17 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r17 > 0) goto Lc8c
            if (r24 != 0) goto Lc8c
            r106 = r15
            r15 = r109
            r16 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r17 < 0) goto Lc93
            if (r6 > 0) goto Lc93
            if (r63 == 0) goto Lc87
            goto Lc93
        Lc87:
            r122 = r6
            r16 = 0
            goto Lc97
        Lc8c:
            r106 = r15
            goto Lc91
        Lc8f:
            r1 = r108
        Lc91:
            r15 = r109
        Lc93:
            r122 = r6
            r16 = 1
        Lc97:
            float r6 = r14.renderX
            r17 = r6
            float r6 = r14.renderY
            if (r16 != 0) goto Lcbb
            boolean r18 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r18 == 0) goto Lca4
            goto Lcbb
        Lca4:
            r18 = r6
            r6 = 1
            r14.endFBO(r6)
            r123.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r109 = r15
            com.badlogic.gdx.math.Matrix4 r15 = r14.rememberedProjectionMatrixForMCs
            r6.setProjectionMatrix(r15)
            r37 = r17
            r38 = r18
            goto Lcc8
        Lcbb:
            r109 = r15
            r6 = 0
            r14.endFBO(r6)
            r123.beginFBO3()
            r37 = 0
            r38 = 0
        Lcc8:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r6 = r14.vGlowShader
            com.badlogic.gdx.graphics.g2d.Batch r15 = r14.batch
            r15.setShader(r6)
            com.badlogic.gdx.graphics.g2d.Batch r15 = r14.batch
            r15.begin()
            com.badlogic.gdx.graphics.g2d.Batch r15 = r14.batch
            r108 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r15.setColor(r1, r1, r1, r1)
            float r15 = r8.r
            float r1 = r8.g
            float r8 = r8.b
            r82 = r11
            java.lang.String r11 = "u_glowRGB"
            r6.setUniformf(r11, r15, r1, r8)
            r6.setUniformf(r2, r9)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r11 = r1 / r4
            r6.setUniformf(r0, r11)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hGlowShader
            java.lang.String r6 = "u_glowIntensity"
            r1.setUniformf(r6, r10)
            if (r16 != 0) goto Ld24
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 == 0) goto Ld02
            goto Ld24
        Ld02:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r14.fbo2
            com.badlogic.gdx.graphics.GLTexture r6 = r6.getColorBufferTexture()
            r48 = r6
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            r53 = 0
            r54 = 0
            r47 = r1
            r49 = r37
            r50 = r38
            r51 = r3
            r52 = r4
            r55 = r66
            r56 = r66
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            goto Ld41
        Ld24:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r14.fbo2
            com.badlogic.gdx.graphics.GLTexture r6 = r6.getColorBufferTexture()
            r36 = r6
            com.badlogic.gdx.graphics.Texture r36 = (com.badlogic.gdx.graphics.Texture) r36
            r41 = 0
            r42 = 0
            r43 = 1065353216(0x3f800000, float:1.0)
            r44 = 1065353216(0x3f800000, float:1.0)
            r35 = r1
            r39 = r3
            r40 = r4
            r35.draw(r36, r37, r38, r39, r40, r41, r42, r43, r44)
        Ld41:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r6 = 0
            r1.setShader(r6)
            if (r16 == 0) goto Ld9d
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 == 0) goto Ld6a
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r14.fbo3
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r124 = r120
            r125 = r123
            r126 = r1
            r127 = r7
            r128 = r12
            r129 = r13
            r130 = r6
            r131 = r8
            r124.applyGaussian(r125, r126, r127, r128, r129, r130, r131)
        Ld6a:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r14.fboForMCs
            com.badlogic.gdx.graphics.GLTexture r6 = r6.getColorBufferTexture()
            r36 = r6
            com.badlogic.gdx.graphics.Texture r36 = (com.badlogic.gdx.graphics.Texture) r36
            r37 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r43 = 1065353216(0x3f800000, float:1.0)
            r44 = 1065353216(0x3f800000, float:1.0)
            r35 = r1
            r39 = r3
            r40 = r4
            r35.draw(r36, r37, r38, r39, r40, r41, r42, r43, r44)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r3 = r14.rememberedProjectionMatrixForMCs
            r1.setProjectionMatrix(r3)
            goto Ldee
        Ld9d:
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 == 0) goto Ldbf
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r14.fbo3
            r6 = 1
            r124 = r120
            r125 = r123
            r126 = r1
            r127 = r7
            r128 = r12
            r129 = r13
            r130 = r66
            r131 = r6
            r124.applyGaussian(r125, r126, r127, r128, r129, r130, r131)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r6 = 771(0x303, float:1.08E-42)
            r7 = 1
            r1.setBlendFunction(r7, r6)
        Ldbf:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r14.fboForMCs
            com.badlogic.gdx.graphics.GLTexture r6 = r6.getColorBufferTexture()
            r48 = r6
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            float r6 = r14.renderX
            float r7 = r14.renderY
            r53 = 0
            r54 = 0
            r47 = r1
            r49 = r6
            r50 = r7
            r51 = r3
            r52 = r4
            r55 = r66
            r56 = r66
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
        Ldee:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r3 = 770(0x302, float:1.079E-42)
            r4 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r3, r4)
            r1 = 1
            goto Le02
        Ldf9:
            r5 = r120
            r122 = r6
            r84 = r10
            r82 = r11
            r1 = 0
        Le02:
            java.lang.String r3 = "u_hueAdjust"
            java.lang.String r4 = "u_willInvert"
            java.lang.String r6 = "u_saturation"
            java.lang.String r7 = "u_tintAmount"
            java.lang.String r8 = "u_tintRGB"
            if (r34 == 0) goto L10be
            float r9 = (float) r12
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r10 / r9
            float r15 = (float) r13
            r99 = r13
            float r13 = r10 / r15
            com.badlogic.gdx.graphics.glutils.FrameBuffer r10 = r14.fboForMCs
            if (r1 == 0) goto Le1e
            com.badlogic.gdx.graphics.glutils.FrameBuffer r10 = r14.fbo3
        Le1e:
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 == 0) goto Le28
            r1 = 1063675494(0x3f666666, float:0.9)
            r16 = r66
            goto Le2c
        Le28:
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1065353216(0x3f800000, float:1.0)
        Le2c:
            if (r58 != 0) goto Lf63
            float r64 = r64 * r59
            float r64 = r64 * r21
            r70 = r12
            float r12 = r5._scale
            float r64 = r64 / r12
            float r64 = r64 * r66
            float r12 = r64 * r1
            r122 = r1
            r1 = 0
            r14.endFBO(r1)
            r123.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r124 = r13
            r5 = 771(0x303, float:1.08E-42)
            r13 = 1
            r1.setBlendFunction(r13, r5)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.rememberProjectionMatrixForMCs(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r5 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r5 = r5.getCamera()
            com.badlogic.gdx.math.Matrix4 r5 = r5.combined
            r1.setProjectionMatrix(r5)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.math.Matrix4 r5 = r1.getProjectionMatrix()
            r125 = r3
            r126 = r4
            r3 = r82
            r13 = r84
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r3 = r5.scale(r13, r3, r4)
            r1.setProjectionMatrix(r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r14.hBlurShader
            r1.setShader(r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hBlurShader
            r1.setUniformf(r2, r12)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.hBlurShader
            r1.setUniformf(r0, r11)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r3 = r10.getColorBufferTexture()
            r48 = r3
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            r49 = 0
            r50 = 0
            float r51 = r9 * r66
            float r52 = r15 * r66
            r53 = 0
            r54 = 0
            r47 = r1
            r55 = r66
            r56 = r66
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r10 = r14.fbo2
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 != 0) goto Led5
            r1 = 1
            r14.endFBO(r1)
            r123.restoreScissors()
            float r1 = r14.renderX
            float r3 = r14.renderY
            com.badlogic.gdx.graphics.g2d.Batch r4 = r14.batch
            com.badlogic.gdx.math.Matrix4 r5 = r14.rememberedProjectionMatrixForMCs
            r4.setProjectionMatrix(r5)
            r4 = 0
            goto Lee1
        Led5:
            r1 = 0
            r14.endFBO(r1)
            r123.beginFBO3()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r14.fbo3
            r4 = r1
            r1 = 0
            r3 = 0
        Lee1:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r108 > r5 ? 1 : (r108 == r5 ? 0 : -1))
            if (r11 != 0) goto Lf0d
            r5 = 0
            int r11 = (r106 > r5 ? 1 : (r106 == r5 ? 0 : -1))
            if (r11 > 0) goto Lf0d
            if (r62 == 0) goto Leef
            goto Lf0d
        Leef:
            if (r24 == 0) goto Lefe
            com.badlogic.gdx.graphics.glutils.ShaderProgram r5 = r14.vBlurInvertShader
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r6.setShader(r5)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r6.begin()
            goto Lf0a
        Lefe:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r5 = r14.vBlurShader
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r6.setShader(r5)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r14.batch
            r6.begin()
        Lf0a:
            r127 = r1
            goto Lf43
        Lf0d:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r5 = r14.vBlurAllShader
            com.badlogic.gdx.graphics.g2d.Batch r11 = r14.batch
            r11.setShader(r5)
            com.badlogic.gdx.graphics.g2d.Batch r11 = r14.batch
            r11.begin()
            r11 = r104
            float r13 = r11.r
            r127 = r1
            float r1 = r11.g
            float r11 = r11.b
            r5.setUniformf(r8, r13, r1, r11)
            r1 = r106
            r5.setUniformf(r7, r1)
            r1 = r108
            float r1 = -r1
            r5.setUniformf(r6, r1)
            r1 = r126
            if (r24 == 0) goto Lf38
            r11 = 1065353216(0x3f800000, float:1.0)
            goto Lf39
        Lf38:
            r11 = 0
        Lf39:
            r5.setUniformf(r1, r11)
            r6 = r125
            r1 = r107
            r5.setUniformf(r6, r1)
        Lf43:
            r1 = r124
            r5.setUniformf(r0, r1)
            r5.setUniformf(r2, r12)
            float r65 = r65 * r59
            float r65 = r65 * r21
            r0 = r120
            float r1 = r0._scale
            float r65 = r65 / r1
            float r65 = r65 * r66
            float r65 = r65 * r122
            r49 = r127
            r50 = r3
            r18 = r9
            r17 = r15
            goto L1066
        Lf63:
            r122 = r1
            r0 = r4
            r124 = r10
            r70 = r12
            r2 = r13
            r17 = r15
            r13 = r84
            r12 = r104
            r1 = r106
            r5 = r107
            r4 = r108
            r10 = r3
            r3 = r82
            com.badlogic.gdx.graphics.g2d.Batch r15 = r14.batch
            r19 = r2
            r18 = r9
            r2 = 1
            r9 = 771(0x303, float:1.08E-42)
            r15.setBlendFunction(r2, r9)
            boolean r9 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r9 != 0) goto Lf96
            r14.endFBO(r2)
            r123.restoreScissors()
            float r2 = r14.renderX
            float r3 = r14.renderY
            r9 = 0
            goto Lfc7
        Lf96:
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r2.getProjectionMatrix()
            r14.rememberProjectionMatrixForMCs(r2)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            com.badlogic.gdx.utils.viewport.Viewport r9 = r14.fboViewport
            com.badlogic.gdx.graphics.Camera r9 = r9.getCamera()
            com.badlogic.gdx.math.Matrix4 r9 = r9.combined
            r2.setProjectionMatrix(r9)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r14.batch
            com.badlogic.gdx.math.Matrix4 r9 = r2.getProjectionMatrix()
            r15 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r3 = r9.scale(r13, r3, r15)
            r2.setProjectionMatrix(r3)
            r2 = 0
            r14.endFBO(r2)
            r123.beginFBO2()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r14.fbo2
            r9 = r2
            r2 = 0
            r3 = 0
        Lfc7:
            float r64 = r64 * r59
            float r64 = r64 * r21
            float r64 = r64 * r66
            float r13 = r64 * r122
            float r65 = r65 * r59
            float r65 = r65 * r21
            float r65 = r65 * r66
            float r15 = r65 * r122
            r20 = 1065353216(0x3f800000, float:1.0)
            int r21 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r21 != 0) goto L1012
            r20 = 0
            int r21 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r21 > 0) goto L1012
            if (r62 == 0) goto Lfe6
            goto L1012
        Lfe6:
            if (r24 == 0) goto Lffa
            if (r25 == 0) goto Lfed
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurOneDirectionInvertShader
            goto Lfef
        Lfed:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurInvertShader
        Lfef:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setShader(r0)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            goto L100b
        Lffa:
            if (r25 == 0) goto Lfff
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurOneDirectionShader
            goto L1001
        Lfff:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.motionBlurShader
        L1001:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.setShader(r0)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
        L100b:
            r122 = r2
            r125 = r3
            r126 = r9
            goto L1046
        L1012:
            r122 = r2
            if (r25 == 0) goto L1019
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.motionBlurOneDirectionAllShader
            goto L101b
        L1019:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.motionBlurAllShader
        L101b:
            r125 = r3
            com.badlogic.gdx.graphics.g2d.Batch r3 = r14.batch
            r3.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r14.batch
            r3.begin()
            float r3 = r12.r
            r126 = r9
            float r9 = r12.g
            float r12 = r12.b
            r2.setUniformf(r8, r3, r9, r12)
            r2.setUniformf(r7, r1)
            float r1 = -r4
            r2.setUniformf(r6, r1)
            if (r24 == 0) goto L103e
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L103f
        L103e:
            r1 = 0
        L103f:
            r2.setUniformf(r0, r1)
            r2.setUniformf(r10, r5)
            r0 = r2
        L1046:
            java.lang.String r1 = "u_blurPixelsX"
            r0.setUniformf(r1, r13)
            java.lang.String r1 = "u_blurPixelsY"
            r0.setUniformf(r1, r15)
            java.lang.String r1 = "u_texelSizeX"
            r0.setUniformf(r1, r11)
            java.lang.String r1 = "u_texelSizeY"
            r11 = r19
            r0.setUniformf(r1, r11)
            r49 = r122
            r10 = r124
            r50 = r125
            r4 = r126
            r65 = 0
        L1066:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 771(0x303, float:1.08E-42)
            r2 = 1
            r0.setBlendFunction(r2, r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r2 = r109
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r10.getColorBufferTexture()
            r48 = r1
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            float r51 = r18 * r16
            float r52 = r17 * r16
            r53 = 0
            r54 = 0
            r47 = r0
            r55 = r66
            r56 = r66
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 0
            r0.setShader(r1)
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto L1196
            r0 = 1
            r124 = r120
            r125 = r123
            r126 = r4
            r127 = r65
            r128 = r70
            r129 = r99
            r130 = r66
            r131 = r0
            r124.applyGaussian(r125, r126, r127, r128, r129, r130, r131)
            goto L1196
        L10be:
            r10 = r3
            r0 = r4
            r70 = r12
            r99 = r13
            r12 = r104
            r3 = r106
            r5 = r107
            r4 = r108
            r2 = r109
            r9 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L10e5
            r11 = 0
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 > 0) goto L10e5
            if (r24 != 0) goto L10e5
            if (r62 != 0) goto L10e5
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 < 0) goto L10e5
            if (r122 > 0) goto L10e5
            if (r63 == 0) goto L1196
        L10e5:
            r9 = 1
            r14.endFBO(r9)
            r123.restoreScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r14.fboForMCs
            if (r1 == 0) goto L10f2
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r14.fbo3
        L10f2:
            r109 = r2
            double r1 = (double) r4
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r11 != 0) goto L1118
            r1 = 0
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 > 0) goto L1118
            if (r62 == 0) goto L1103
            goto L1118
        L1103:
            if (r24 == 0) goto L1112
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.invertColorShader
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            goto L114a
        L1112:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.begin()
            goto L114a
        L1118:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14.allColorShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r14.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.allColorShader
            float r2 = r12.r
            float r11 = r12.g
            float r12 = r12.b
            r1.setUniformf(r8, r2, r11, r12)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.allColorShader
            r1.setUniformf(r7, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.allColorShader
            float r2 = -r4
            r1.setUniformf(r6, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r14.allColorShader
            if (r24 == 0) goto L1141
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L1142
        L1141:
            r11 = 0
        L1142:
            r1.setUniformf(r0, r11)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r14.allColorShader
            r0.setUniformf(r10, r5)
        L114a:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 771(0x303, float:1.08E-42)
            r2 = 1
            r0.setBlendFunction(r2, r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = r109
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r9.getColorBufferTexture()
            r48 = r1
            com.badlogic.gdx.graphics.Texture r48 = (com.badlogic.gdx.graphics.Texture) r48
            float r1 = r14.renderX
            float r2 = r14.renderY
            r3 = r70
            float r3 = (float) r3
            r4 = r99
            float r4 = (float) r4
            r53 = 0
            r54 = 0
            r47 = r0
            r49 = r1
            r50 = r2
            r51 = r3
            r52 = r4
            r55 = r66
            r56 = r66
            r47.draw(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            r1 = 0
            r0.setShader(r1)
        L1196:
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1 = r121
            r1.begin(r0)
            boolean r0 = r123.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L11aa
            com.badlogic.gdx.graphics.g2d.Batch r0 = r14.batch
            com.badlogic.gdx.math.Matrix4 r2 = r14.rememberedTransformationMatrixForMCs
            r0.setTransformMatrix(r2)
        L11aa:
            r0 = r120
            float r2 = r0._transparency
            r3 = 1065269330(0x3f7eb852, float:0.995)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L11ba
            r2 = 1065353216(0x3f800000, float:1.0)
            r0._transparency = r2
            goto L11bc
        L11ba:
            r2 = 1065353216(0x3f800000, float:1.0)
        L11bc:
            float r3 = r0._saturation
            float r3 = r3 - r2
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r3 >= 0) goto L11c9
            r0._saturation = r2
        L11c9:
            float r2 = r0._tintAmount
            int r2 = (r2 > r46 ? 1 : (r2 == r46 ? 0 : -1))
            if (r2 >= 0) goto L11d3
            r2 = 0
            r0._tintAmount = r2
            goto L11d4
        L11d3:
            r2 = 0
        L11d4:
            float r3 = r0._hueShift
            int r4 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r4 >= 0) goto L11dd
            r0._hueShift = r2
            goto L11e8
        L11dd:
            r4 = 1065269330(0x3f7eb852, float:0.995)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L11e8
            r3 = 1065353216(0x3f800000, float:1.0)
            r0._hueShift = r3
        L11e8:
            float r3 = r0._glow
            int r3 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r3 >= 0) goto L11f0
            r0._glow = r2
        L11f0:
            float r3 = r0._blur
            int r3 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r3 >= 0) goto L11f8
            r0._blur = r2
        L11f8:
            float r3 = r0._dsAlpha
            int r3 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r3 >= 0) goto L1200
            r0._dsAlpha = r2
        L1200:
            float r3 = r0._outlineAlpha
            int r3 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r3 >= 0) goto L1208
            r0._outlineAlpha = r2
        L1208:
            float r3 = r0._outlineThickness
            int r3 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r3 >= 0) goto L1215
            r0._outlineThickness = r2
            goto L1215
        L1211:
            r0 = r120
            r1 = r121
        L1215:
            if (r23 == 0) goto L122b
            r121.end()
            com.badlogic.gdx.math.Matrix4 r2 = org.fortheloss.sticknodes.movieclip.MCReference._rememberedTransformationMatrix
            r1.setTransformMatrix(r2)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1.begin(r2)
            if (r14 == 0) goto L122b
            r12 = r73
            r14.setIsUsingRotatedTransformationMatrix(r12)
        L122b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void drawNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r18, float r19, float r20, float r21, float r22, float r23, boolean r24, boolean r25, org.fortheloss.sticknodes.stickfigure.INode r26, boolean r27) {
            r17 = this;
            r0 = r17
            r9 = r18
            r10 = r26
            r17.validateDirtyNodes()
            float r1 = r17.getX()
            float r1 = r1 - r21
            r11 = 1065353216(0x3f800000, float:1.0)
            float r2 = r23 - r11
            float r1 = r1 * r2
            float r3 = r17.getY()
            float r3 = r3 - r22
            float r3 = r3 * r2
            float r2 = r17.getX()
            float r2 = r2 + r19
            float r12 = r2 + r1
            float r1 = r17.getY()
            float r1 = r1 + r20
            float r13 = r1 + r3
            r14 = 0
            r15 = 1
            if (r27 != 0) goto L3d
            boolean r1 = r0._isLocked
            if (r1 == 0) goto L3a
            boolean r1 = r0._isJoined
            if (r1 != 0) goto L3a
            goto L3d
        L3a:
            r16 = 0
            goto L3f
        L3d:
            r16 = 1
        L3f:
            boolean r1 = r0._isJoined
            if (r1 != 0) goto L56
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r0._mainNode
            if (r1 != r10) goto L49
            r7 = 1
            goto L4a
        L49:
            r7 = 0
        L4a:
            r8 = 0
            r2 = r18
            r3 = r12
            r4 = r13
            r5 = r23
            r6 = r25
            r1.drawNode(r2, r3, r4, r5, r6, r7, r8)
        L56:
            if (r16 != 0) goto L70
            byte r1 = r0._flagLockedToCamera
            r2 = 2
            if (r1 == r2) goto L70
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r0._secondaryNode
            if (r1 != r10) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            r8 = 0
            r2 = r18
            r3 = r12
            r4 = r13
            r5 = r23
            r6 = r25
            r1.drawNode(r2, r3, r4, r5, r6, r7, r8)
        L70:
            if (r25 == 0) goto L80
            r1 = 45
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r9.getNode(r1)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r18.getBatch()
            r1.drawNode(r2, r12, r13, r11)
            goto L8d
        L80:
            r1 = 44
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r9.getNode(r1)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r18.getBatch()
            r1.drawNode(r2, r12, r13, r11)
        L8d:
            return
    }

    public void finishAnimateDuringDelay(int r1) {
            r0 = this;
            r0.setCurrentFrameIndex(r1)
            r1 = 0
            r0._animatingDuringDelayFlag = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flagLockedToCamera(byte r1) {
            r0 = this;
            r0._flagLockedToCamera = r1
            return
    }

    public void flipX(float r2, boolean r3) {
            r1 = this;
            int r0 = r1._flipX
            int r0 = r0 * (-1)
            r1._flipX = r0
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._secondaryNode
            r0.validatePosition()
            boolean r0 = r1.isJoined()
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r1._secondaryNode
            float r3 = r3.getAngle()
            float r3 = r3 - r2
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r1.getJoinedToNode()
            float r2 = r2.getAngle()
            float r2 = r2 - r3
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r1._secondaryNode
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._mainNode
            float r0 = r0.getAngle()
            float r2 = r2 - r0
            r3.setLocalAngle(r2)
            goto L43
        L30:
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r1._secondaryNode
            r3 = 1127481344(0x43340000, float:180.0)
            float r0 = r2.getAngle()
            float r3 = r3 - r0
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._mainNode
            float r0 = r0.getAngle()
            float r3 = r3 - r0
            r2.setLocalAngle(r3)
        L43:
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r1._secondaryNode
            r2.validatePosition()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flipX(boolean r3) {
            r2 = this;
            boolean r0 = r2.isJoined()
            if (r0 == 0) goto L12
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getJoinedToNode()
            float r0 = r0.getAngle()
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 - r1
            goto L13
        L12:
            r0 = 0
        L13:
            r2.flipX(r0, r3)
            return
    }

    public void flipY(float r2, boolean r3) {
            r1 = this;
            int r0 = r1._flipY
            int r0 = r0 * (-1)
            r1._flipY = r0
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._secondaryNode
            r0.validatePosition()
            boolean r0 = r1.isJoined()
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r1._secondaryNode
            float r3 = r3.getAngle()
            float r3 = r3 - r2
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r1.getJoinedToNode()
            float r2 = r2.getAngle()
            float r2 = r2 - r3
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r1._secondaryNode
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._mainNode
            float r0 = r0.getAngle()
            float r2 = r2 - r0
            r3.setLocalAngle(r2)
            goto L41
        L30:
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r1._secondaryNode
            float r3 = r2.getAngle()
            float r3 = -r3
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._mainNode
            float r0 = r0.getAngle()
            float r3 = r3 - r0
            r2.setLocalAngle(r3)
        L41:
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r1._secondaryNode
            r2.validatePosition()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flipY(boolean r2) {
            r1 = this;
            boolean r0 = r1.isJoined()
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.getJoinedToNode()
            float r0 = r0.getAngle()
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.flipY(r0, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getBlur() {
            r1 = this;
            float r0 = r1._blur
            return r0
    }

    public int getCurrentFrameIndex() {
            r1 = this;
            int r0 = r1._currentFrameIndex
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getDsAlpha() {
            r1 = this;
            float r0 = r1._dsAlpha
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getDsAngle() {
            r1 = this;
            int r0 = r1._dsAngle
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getDsBlur() {
            r1 = this;
            float r0 = r1._dsBlur
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getDsColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._dsColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getDsDistance() {
            r1 = this;
            int r0 = r1._dsDistance
            return r0
    }

    public org.fortheloss.sticknodes.data.FrameData getFrame() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._frameDataRef
            return r0
    }

    public org.fortheloss.sticknodes.data.MCFrameData getFrameAt(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.data.MCFrameData r2 = (org.fortheloss.sticknodes.data.MCFrameData) r2
            return r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getGlow() {
            r1 = this;
            float r0 = r1._glow
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getGlowColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._glowColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getGlowIntensity() {
            r1 = this;
            float r0 = r1._glowIntensity
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getHueShift() {
            r1 = this;
            float r0 = r1._hueShift
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getID() {
            r1 = this;
            int r0 = r1._id
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean getIsInvertedColor() {
            r1 = this;
            boolean r0 = r1._colorIsInverted
            return r0
    }

    public boolean getIsStateControlled() {
            r1 = this;
            boolean r0 = r1.mStateIsControlled
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
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._joinedToNodeRef
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
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSourceRef
            int r0 = r0.getLibraryID()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.movieclip.MCNode getMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._mainNode
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.INode getMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1.getMainNode()
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
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSourceRef
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.INode getNodeAtDrawOrderIndex(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r0._mainNode
            return r1
        L5:
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r0._secondaryNode
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getNodeCount(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r0._mcSourceRef
            int r1 = r1.getAverageNodeCount()
            return r1
    }

    public int getNumFrames(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r2 == 0) goto L17
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r1._mcSourceRef
            boolean r2 = r2.getTweenLoopProtectionEnabled()
            if (r2 == 0) goto L17
            r2 = 1
            if (r0 > r2) goto L16
            goto L17
        L16:
            int r0 = r0 - r2
        L17:
            return r0
    }

    public org.fortheloss.sticknodes.movieclip.MCReference getOrigin() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
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

    public boolean getPlayDuringDelay() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 != 0) goto L10
            boolean r0 = r1._playDuringDelay
            if (r0 == 0) goto Le
            int r0 = r1._playmode
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
        L10:
            boolean r0 = r0._playDuringDelay
            return r0
    }

    public int getPlaymode() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 != 0) goto L7
            int r0 = r1._playmode
            return r0
        L7:
            int r0 = r0._playmode
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void getPositionalData(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2._id
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._transparency
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._blur
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2._isMotionBlur
            r3.write(r0)
            boolean r0 = r2.motionBlurIsOneDirection
            r3.write(r0)
            int r0 = r2._motionBlurAngle
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._saturation
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            int r0 = r2._pixelation
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2._tintColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._tintAmount
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._hueShift
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2._colorIsInverted
            r3.write(r0)
            float r0 = r2._glow
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2._glowColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._glowIntensity
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2._outlineColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._outlineAlpha
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._outlineThickness
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2._dsColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._dsAlpha
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            int r0 = r2._dsDistance
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2._dsAngle
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._dsBlur
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2._isUsingJoinParentFilters
            r3.write(r0)
            float r0 = r2._scale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r0 = r0.x
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r0 = r0.y
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            int r0 = r2._currentFrameIndex
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2._startFrameIndex
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2._flipX
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2._flipY
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2._playmode
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._volumeScale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2._playDuringDelay
            r3.write(r0)
            boolean r0 = r2._isLocked
            r3.write(r0)
            boolean r0 = r2._isPersistentWhenTweening
            r3.write(r0)
            byte r0 = r2.mTweenMode
            r3.write(r0)
            boolean r0 = r2.mVisibleInOnionSkin
            r3.write(r0)
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._mainNode
            r0.beginWritingPositionalData(r3)
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._secondaryNode
            r0.beginWritingPositionalData(r3)
            return
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.MCReferenceProperties r3) {
            r2 = this;
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r1 = r0.x
            r3.x = r1
            float r0 = r0.y
            r3.y = r0
            int r0 = r2._startFrameIndex
            r3.startFrameIndex = r0
            int r0 = r2._currentFrameIndex
            r3.currentFrameIndex = r0
            int r0 = r2._playmode
            r3.playmode = r0
            boolean r0 = r2._playDuringDelay
            r3.playDuringDelay = r0
            float r0 = r2._volumeScale
            r3.volumeScale = r0
            int r0 = r2._flipX
            r3.flipX = r0
            int r0 = r2._flipY
            r3.flipY = r0
            float r0 = r2._scale
            r3.scale = r0
            float r0 = r2._transparency
            r3.transparency = r0
            float r0 = r2._blur
            r3.blur = r0
            boolean r0 = r2._isMotionBlur
            r3.isMotionBlur = r0
            boolean r0 = r2.motionBlurIsOneDirection
            r3.motionBlurIsOmniDirectional = r0
            int r0 = r2._motionBlurAngle
            r3.motionBlurAngle = r0
            float r0 = r2._saturation
            r3.saturation = r0
            int r0 = r2._pixelation
            r3.pixelation = r0
            com.badlogic.gdx.graphics.Color r0 = r3.tintColor
            com.badlogic.gdx.graphics.Color r1 = r2._tintColor
            r0.set(r1)
            float r0 = r2._tintAmount
            r3.tintAmount = r0
            float r0 = r2._hueShift
            r3.hueShift = r0
            boolean r0 = r2._colorIsInverted
            r3.colorIsInverted = r0
            float r0 = r2._glow
            r3.glow = r0
            com.badlogic.gdx.graphics.Color r0 = r3.glowColor
            com.badlogic.gdx.graphics.Color r1 = r2._glowColor
            r0.set(r1)
            float r0 = r2._glowIntensity
            r3.glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r3.outlineColor
            com.badlogic.gdx.graphics.Color r1 = r2._outlineColor
            r0.set(r1)
            float r0 = r2._outlineAlpha
            r3.outlineAlpha = r0
            float r0 = r2._outlineThickness
            r3.outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r3.dsColor
            com.badlogic.gdx.graphics.Color r1 = r2._dsColor
            r0.set(r1)
            float r0 = r2._dsAlpha
            r3.dsAlpha = r0
            int r0 = r2._dsDistance
            r3.dsDistance = r0
            int r0 = r2._dsAngle
            r3.dsAngle = r0
            float r0 = r2._dsBlur
            r3.dsBlur = r0
            boolean r0 = r2._isUsingJoinParentFilters
            r3.isUsingJoinParentFilters = r0
            boolean r0 = r2._isLocked
            r3.isLocked = r0
            boolean r0 = r2._isPersistentWhenTweening
            r3.isPersistentWhenTweening = r0
            byte r0 = r2.mTweenMode
            r3.mTweenMode = r0
            boolean r0 = r2.mVisibleInOnionSkin
            r3.visibleInOnionSkin = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getRotation() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._secondaryNode
            float r0 = r0.getAngle()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getSaturation() {
            r1 = this;
            float r0 = r1._saturation
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getScale() {
            r1 = this;
            float r0 = r1._scale
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.INode getSelectedNode(float r4, float r5, float r6, boolean r7, boolean r8, org.fortheloss.sticknodes.NodeDigger r9) {
            r3 = this;
            float r7 = org.fortheloss.sticknodes.stickfigure.Stickfigure.getNodeClickSizeSquared(r6)
            if (r8 != 0) goto L11
            boolean r8 = r3._isLocked
            if (r8 == 0) goto Lf
            boolean r8 = r3._isJoined
            if (r8 != 0) goto Lf
            goto L11
        Lf:
            r8 = 0
            goto L12
        L11:
            r8 = 1
        L12:
            r0 = 0
            if (r8 != 0) goto Lde
            byte r8 = r3._flagLockedToCamera
            r1 = 2
            if (r8 == r1) goto L7a
            org.fortheloss.sticknodes.movieclip.MCNode r8 = r3._mainNode
            float r8 = r8.getGlobalX()
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._secondaryNode
            float r1 = r1.getX()
            float r1 = r1 / r6
            float r8 = r8 + r1
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._mainNode
            float r1 = r1.getGlobalY()
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r3._secondaryNode
            float r2 = r2.getY()
            float r2 = r2 / r6
            float r1 = r1 + r2
            float r6 = r4 - r8
            float r8 = r5 - r1
            float r6 = r6 * r6
            float r8 = r8 * r8
            float r6 = r6 + r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L4f
            if (r9 == 0) goto L4d
            org.fortheloss.sticknodes.movieclip.MCNode r6 = r3._secondaryNode
            boolean r6 = r9.isThisNodeNew(r6)
            if (r6 == 0) goto L4f
        L4d:
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._secondaryNode
        L4f:
            if (r0 != 0) goto L105
            boolean r6 = r3._isJoined
            if (r6 != 0) goto L105
            org.fortheloss.sticknodes.movieclip.MCNode r6 = r3._mainNode
            float r6 = r6.getGlobalX()
            float r4 = r4 - r6
            org.fortheloss.sticknodes.movieclip.MCNode r6 = r3._mainNode
            float r6 = r6.getGlobalY()
            float r5 = r5 - r6
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L105
            if (r9 == 0) goto L76
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r3._mainNode
            boolean r4 = r9.isThisNodeNew(r4)
            if (r4 == 0) goto L105
        L76:
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._mainNode
            goto L105
        L7a:
            boolean r8 = r3._isJoined
            if (r8 != 0) goto La3
            org.fortheloss.sticknodes.movieclip.MCNode r8 = r3._mainNode
            float r8 = r8.getGlobalX()
            float r8 = r4 - r8
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r3._mainNode
            float r2 = r2.getGlobalY()
            float r2 = r5 - r2
            float r8 = r8 * r8
            float r2 = r2 * r2
            float r8 = r8 + r2
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 > 0) goto La3
            if (r9 == 0) goto La1
            org.fortheloss.sticknodes.movieclip.MCNode r8 = r3._mainNode
            boolean r8 = r9.isThisNodeNew(r8)
            if (r8 == 0) goto La3
        La1:
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._mainNode
        La3:
            if (r0 != 0) goto L105
            byte r8 = r3._flagLockedToCamera
            if (r8 == r1) goto L105
            org.fortheloss.sticknodes.movieclip.MCNode r8 = r3._mainNode
            float r8 = r8.getGlobalX()
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._secondaryNode
            float r1 = r1.getX()
            float r1 = r1 / r6
            float r8 = r8 + r1
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._mainNode
            float r1 = r1.getGlobalY()
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r3._secondaryNode
            float r2 = r2.getY()
            float r2 = r2 / r6
            float r1 = r1 + r2
            float r4 = r4 - r8
            float r5 = r5 - r1
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L105
            if (r9 == 0) goto Lda
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r3._secondaryNode
            boolean r4 = r9.isThisNodeNew(r4)
            if (r4 == 0) goto L105
        Lda:
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r3._secondaryNode
            r0 = r4
            goto L105
        Lde:
            boolean r6 = r3._isJoined
            if (r6 != 0) goto L105
            org.fortheloss.sticknodes.movieclip.MCNode r6 = r3._mainNode
            float r6 = r6.getGlobalX()
            float r4 = r4 - r6
            org.fortheloss.sticknodes.movieclip.MCNode r6 = r3._mainNode
            float r6 = r6.getGlobalY()
            float r5 = r5 - r6
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L105
            if (r9 == 0) goto L103
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r3._mainNode
            boolean r4 = r9.isThisNodeNew(r4)
            if (r4 == 0) goto L105
        L103:
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._mainNode
        L105:
            return r0
    }

    public int getStartFrameIndex() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._originMCRef
            if (r0 == 0) goto Lc
            int r1 = r2._playmode
            if (r1 != 0) goto L9
            goto Lc
        L9:
            int r0 = r0._startFrameIndex
            return r0
        Lc:
            int r0 = r2._startFrameIndex
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getTintAmount() {
            r1 = this;
            float r0 = r1._tintAmount
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public com.badlogic.gdx.graphics.Color getTintColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._tintColor
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getTransparency() {
            r1 = this;
            float r0 = r1._transparency
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
            boolean r0 = r1._isUsingJoinParentFilters
            return r0
    }

    public float getVolumeScale() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 != 0) goto L7
            float r0 = r1._volumeScale
            return r0
        L7:
            float r0 = r0._volumeScale
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getX() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            float r0 = r0.x
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getY() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            float r0 = r0.y
            return r0
    }

    public void highlightNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r13, float r14, float r15, float r16, float r17, float r18, org.fortheloss.sticknodes.movieclip.MCNode r19, boolean r20) {
            r12 = this;
            r0 = r12
            r12.validateDirtyNodes()
            float r1 = r12.getX()
            float r1 = r1 - r16
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r18 - r2
            float r1 = r1 * r2
            float r3 = r12.getY()
            float r3 = r3 - r17
            float r3 = r3 * r2
            float r2 = r12.getX()
            float r2 = r2 + r14
            float r1 = r1 + r2
            float r2 = r12.getY()
            float r2 = r2 + r15
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1119092736(0x42b40000, float:90.0)
            float r8 = r3 * r4
            r3 = 23
            r10 = r13
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r4 = r13.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r5 = r13.getBatch()
            float r9 = r12.getRotation()
            r6 = r1
            r7 = r2
            r4.drawLine2(r5, r6, r7, r8, r9)
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r0._mainNode
            r4 = r19
            if (r4 != r3) goto L55
            if (r20 != 0) goto L61
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r0._secondaryNode
            r8 = 1
            r9 = 0
            r11 = 1
            r4 = r13
            r5 = r1
            r6 = r2
            r7 = r18
            r10 = r11
            r3.drawNode(r4, r5, r6, r7, r8, r9, r10)
            goto L61
        L55:
            r8 = 1
            r9 = 0
            r11 = 1
            r4 = r13
            r5 = r1
            r6 = r2
            r7 = r18
            r10 = r11
            r3.drawNode(r4, r5, r6, r7, r8, r9, r10)
        L61:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void interpolateValues(float r9, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11) {
            r8 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r10 = (org.fortheloss.sticknodes.movieclip.MCReference) r10
            org.fortheloss.sticknodes.movieclip.MCReference r11 = (org.fortheloss.sticknodes.movieclip.MCReference) r11
            boolean r0 = r10._isUsingJoinParentFilters
            r8._isUsingJoinParentFilters = r0
            boolean r0 = r10._isPersistentWhenTweening
            r8._isPersistentWhenTweening = r0
            int r0 = r10._flipX
            r8._flipX = r0
            int r0 = r10._flipY
            r8._flipY = r0
            int r0 = r10._currentFrameIndex
            r8._currentFrameIndex = r0
            boolean r0 = r10._isMotionBlur
            r8._isMotionBlur = r0
            boolean r0 = r10.motionBlurIsOneDirection
            r8.motionBlurIsOneDirection = r0
            int r0 = r10._motionBlurAngle
            r8._motionBlurAngle = r0
            boolean r0 = r10._colorIsInverted
            r8._colorIsInverted = r0
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            if (r2 == 0) goto L54
            byte r3 = r10.mTweenMode
            if (r3 != 0) goto L37
            r2 = 0
            goto L54
        L37:
            r4 = 2
            if (r3 != r4) goto L41
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sine
            float r9 = r3.apply(r9)
            goto L54
        L41:
            r4 = 3
            if (r3 != r4) goto L4b
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sineIn
            float r9 = r3.apply(r9)
            goto L54
        L4b:
            r4 = 4
            if (r3 != r4) goto L54
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sineOut
            float r9 = r3.apply(r9)
        L54:
            if (r2 == 0) goto L1c5
            float r2 = r8._scale
            float r3 = r10.mJoinOffsetAngle
            float r4 = r11.mJoinOffsetAngle
            float r4 = r4 - r3
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r5
            r6 = 1141309440(0x44070000, float:540.0)
            float r4 = r4 + r6
            float r4 = r4 % r5
            r5 = 1127481344(0x43340000, float:180.0)
            float r4 = r4 - r5
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8.mJoinOffsetAngle = r3
            float r3 = r10._scale
            float r4 = r11._scale
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._scale = r3
            float r3 = r10._volumeScale
            float r4 = r11._volumeScale
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._volumeScale = r3
            float r3 = r10._transparency
            float r4 = r11._transparency
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._transparency = r3
            float r3 = r10._blur
            float r4 = r11._blur
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._blur = r3
            int r3 = r10._motionBlurAngle
            float r4 = (float) r3
            int r5 = r11._motionBlurAngle
            int r5 = r5 - r3
            int r5 = r5 % 360
            int r5 = r5 + 540
            int r5 = r5 % 360
            int r5 = r5 + (-180)
            float r3 = (float) r5
            float r3 = r3 * r9
            float r4 = r4 + r3
            int r3 = java.lang.Math.round(r4)
            r8._motionBlurAngle = r3
            float r3 = r10._saturation
            float r4 = r11._saturation
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._saturation = r3
            int r3 = r10._pixelation
            float r4 = (float) r3
            int r5 = r11._pixelation
            int r5 = r5 - r3
            float r3 = (float) r5
            float r3 = r3 * r9
            float r4 = r4 + r3
            int r3 = java.lang.Math.round(r4)
            r8._pixelation = r3
            float r3 = r10._tintAmount
            float r4 = r11._tintAmount
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._tintAmount = r3
            com.badlogic.gdx.graphics.Color r3 = r8._tintColor
            com.badlogic.gdx.graphics.Color r4 = r10._tintColor
            com.badlogic.gdx.graphics.Color r3 = r3.set(r4)
            com.badlogic.gdx.graphics.Color r4 = r11._tintColor
            r3.lerp(r4, r9)
            float r3 = r10._hueShift
            float r4 = r11._hueShift
            float r4 = r4 - r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 % r5
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 + r6
            float r4 = r4 % r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 - r6
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._hueShift = r3
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 < 0) goto Lf9
            float r3 = r3 - r5
            r8._hueShift = r3
            goto L101
        Lf9:
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L101
            float r3 = r3 + r5
            r8._hueShift = r3
        L101:
            float r3 = r10._glow
            float r4 = r11._glow
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._glow = r3
            com.badlogic.gdx.graphics.Color r3 = r8._glowColor
            com.badlogic.gdx.graphics.Color r4 = r10._glowColor
            com.badlogic.gdx.graphics.Color r3 = r3.set(r4)
            com.badlogic.gdx.graphics.Color r4 = r11._glowColor
            r3.lerp(r4, r9)
            float r3 = r10._glowIntensity
            float r4 = r11._glowIntensity
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._glowIntensity = r3
            com.badlogic.gdx.graphics.Color r3 = r8._outlineColor
            com.badlogic.gdx.graphics.Color r4 = r10._outlineColor
            com.badlogic.gdx.graphics.Color r3 = r3.set(r4)
            com.badlogic.gdx.graphics.Color r4 = r11._outlineColor
            r3.lerp(r4, r9)
            float r3 = r10._outlineAlpha
            float r4 = r11._outlineAlpha
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._outlineAlpha = r3
            float r3 = r10._outlineThickness
            float r4 = r11._outlineThickness
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._outlineThickness = r3
            com.badlogic.gdx.graphics.Color r3 = r8._dsColor
            com.badlogic.gdx.graphics.Color r4 = r10._dsColor
            com.badlogic.gdx.graphics.Color r3 = r3.set(r4)
            com.badlogic.gdx.graphics.Color r4 = r11._dsColor
            r3.lerp(r4, r9)
            float r3 = r10._dsAlpha
            float r4 = r11._dsAlpha
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._dsAlpha = r3
            int r3 = r10._dsDistance
            float r4 = (float) r3
            int r5 = r11._dsDistance
            int r5 = r5 - r3
            float r3 = (float) r5
            float r3 = r3 * r9
            float r4 = r4 + r3
            int r3 = java.lang.Math.round(r4)
            r8._dsDistance = r3
            int r3 = r10._dsAngle
            float r4 = (float) r3
            int r5 = r11._dsAngle
            int r5 = r5 - r3
            int r5 = r5 % 360
            int r5 = r5 + 540
            int r5 = r5 % 360
            int r5 = r5 + (-180)
            float r3 = (float) r5
            float r3 = r3 * r9
            float r4 = r4 + r3
            int r3 = java.lang.Math.round(r4)
            r8._dsAngle = r3
            float r3 = r10._dsBlur
            float r4 = r11._dsBlur
            float r4 = r4 - r3
            float r4 = r4 * r9
            float r3 = r3 + r4
            r8._dsBlur = r3
            com.badlogic.gdx.math.Vector2 r3 = r8._position
            com.badlogic.gdx.math.Vector2 r4 = r10._position
            float r5 = r4.x
            com.badlogic.gdx.math.Vector2 r6 = r11._position
            float r7 = r6.x
            float r7 = r7 - r5
            float r7 = r7 * r9
            float r5 = r5 + r7
            r3.x = r5
            float r4 = r4.y
            float r5 = r6.y
            float r5 = r5 - r4
            float r5 = r5 * r9
            float r4 = r4 + r5
            r3.y = r4
            float r3 = r8._scale
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L1b1
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r8._secondaryNode
            r2.flagPositionAsDirty()
        L1b1:
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r8._mainNode
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r10._mainNode
            org.fortheloss.sticknodes.movieclip.MCNode r4 = r11._mainNode
            r2.interpolateValues(r9, r3, r4)
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r8._secondaryNode
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r10._secondaryNode
            org.fortheloss.sticknodes.movieclip.MCNode r11 = r11._secondaryNode
            r2.interpolateValues(r9, r3, r11)
            goto L24d
        L1c5:
            float r11 = r10.mJoinOffsetAngle
            r8.mJoinOffsetAngle = r11
            float r11 = r10._scale
            r8._scale = r11
            float r11 = r10._volumeScale
            r8._volumeScale = r11
            float r11 = r10._transparency
            r8._transparency = r11
            float r11 = r10._blur
            r8._blur = r11
            float r11 = r10._saturation
            r8._saturation = r11
            int r11 = r10._pixelation
            r8._pixelation = r11
            float r11 = r10._tintAmount
            r8._tintAmount = r11
            com.badlogic.gdx.graphics.Color r11 = r8._tintColor
            com.badlogic.gdx.graphics.Color r2 = r10._tintColor
            r11.set(r2)
            float r11 = r10._hueShift
            r8._hueShift = r11
            float r11 = r10._glow
            r8._glow = r11
            com.badlogic.gdx.graphics.Color r11 = r8._glowColor
            com.badlogic.gdx.graphics.Color r2 = r10._glowColor
            r11.set(r2)
            float r11 = r10._glowIntensity
            r8._glowIntensity = r11
            com.badlogic.gdx.graphics.Color r11 = r8._outlineColor
            com.badlogic.gdx.graphics.Color r2 = r10._outlineColor
            r11.set(r2)
            float r11 = r10._outlineAlpha
            r8._outlineAlpha = r11
            float r11 = r10._outlineThickness
            r8._outlineThickness = r11
            com.badlogic.gdx.graphics.Color r11 = r8._dsColor
            com.badlogic.gdx.graphics.Color r2 = r10._dsColor
            r11.set(r2)
            float r11 = r10._dsAlpha
            r8._dsAlpha = r11
            int r11 = r10._dsDistance
            r8._dsDistance = r11
            int r11 = r10._dsAngle
            r8._dsAngle = r11
            float r11 = r10._dsBlur
            r8._dsBlur = r11
            com.badlogic.gdx.math.Vector2 r11 = r8._position
            com.badlogic.gdx.math.Vector2 r2 = r10._position
            float r3 = r2.x
            r11.x = r3
            float r2 = r2.y
            r11.y = r2
            float r11 = r8._scale
            float r2 = r10._scale
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L23e
            org.fortheloss.sticknodes.movieclip.MCNode r11 = r8._secondaryNode
            r11.flagPositionAsDirty()
        L23e:
            org.fortheloss.sticknodes.movieclip.MCNode r11 = r8._mainNode
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r10._mainNode
            r3 = 0
            r11.interpolateValues(r9, r2, r3)
            org.fortheloss.sticknodes.movieclip.MCNode r11 = r8._secondaryNode
            org.fortheloss.sticknodes.movieclip.MCNode r2 = r10._secondaryNode
            r11.interpolateValues(r9, r2, r3)
        L24d:
            r8._flagIsOnceAndDonePlaying = r0
            int r10 = r10.getPlaymode()
            if (r10 == 0) goto L287
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r11 = r8._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r11 = r11.frames
            int r0 = r8._currentFrameIndex
            java.lang.Object r11 = r11.get(r0)
            org.fortheloss.sticknodes.data.MCFrameData r11 = (org.fortheloss.sticknodes.data.MCFrameData) r11
            if (r10 != r1) goto L273
            int r10 = r8._currentFrameIndex
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r8._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r10 != r0) goto L273
            r8._flagIsOnceAndDonePlaying = r1
            goto L289
        L273:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r10 = r8._mcSourceRef
            int r0 = r8._currentFrameIndex
            java.util.ArrayList r10 = r10.getIndicesForOrderOfTweeningOfFrame(r0)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r8._mcSourceRef
            int r2 = r8._currentFrameIndex
            java.util.ArrayList r0 = r0.getIndicesForNextFrameFiguresFromFrame(r2)
            r11.tweenFigures(r10, r0, r9, r1)
            goto L289
        L287:
            r8._flagIsOnceAndDonePlaying = r1
        L289:
            return
    }

    public boolean isFlippedX() {
            r2 = this;
            int r0 = r2._flipX
            r1 = 1
            if (r0 == r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isFlippedY() {
            r2 = this;
            int r0 = r2._flipY
            r1 = 1
            if (r0 == r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isJoined() {
            r1 = this;
            boolean r0 = r1._isJoined
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isLocked() {
            r1 = this;
            boolean r0 = r1._isLocked
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public byte isLockedToCamera() {
            r1 = this;
            byte r0 = r1._flagLockedToCamera
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isMotionBlur() {
            r1 = this;
            boolean r0 = r1._isMotionBlur
            return r0
    }

    public boolean isOriginMCRef() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isPersistent() {
            r1 = this;
            boolean r0 = r1._isPersistentWhenTweening
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.IStatefigure
    public boolean isStateable() {
            r1 = this;
            int r0 = r1._playmode
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isVisibleInOnionSkin() {
            r1 = this;
            boolean r0 = r1.mVisibleInOnionSkin
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
            if (r3 == 0) goto L4c
            boolean r0 = r2._isJoined
            if (r0 != 0) goto L44
            r0 = 1
            r2._isJoined = r0
            r2._joinedToNodeRef = r3
            r3.addJoinedFigure(r2)
            if (r4 != 0) goto L2f
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r2._mainNode
            float r3 = r3.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2._joinedToNodeRef
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
            if (r4 >= 0) goto L2d
            float r3 = r3 + r1
        L2d:
            r2.mJoinOffsetAngle = r3
        L2f:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._joinedToNodeRef
            float r3 = r3.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2._joinedToNodeRef
            float r4 = r4.getGlobalY()
            r2.setPosition(r3, r4)
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r2._mainNode
            r3.flagPositionAsDirty()
            return r0
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't join, this movieclip is already joined."
            r3.<init>(r4)
            throw r3
        L4c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't join to a null node."
            r3.<init>(r4)
            throw r3
    }

    public void jumpToKeyframeForAnimateDuringDelay() {
            r3 = this;
            int r0 = r3._animatingDuringDelayFlag
            r1 = 2
            if (r0 != r1) goto L48
            int r0 = r3._currentFrameIndex
            r1 = 1
            int r0 = r0 + r1
            r3._currentFrameIndex = r0
            int r2 = r3._playmode
            if (r2 != r1) goto L25
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r3._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            if (r0 < r2) goto L48
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            int r0 = r0 - r1
            r3._currentFrameIndex = r0
            goto L48
        L25:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r3._mcSourceRef
            boolean r2 = r2.getTweenLoopProtectionEnabled()
            if (r2 == 0) goto L41
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r3._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            if (r2 <= r1) goto L41
            int r0 = r0 + (-1)
        L41:
            int r1 = r3._currentFrameIndex
            if (r1 < r0) goto L48
            r0 = 0
            r3._currentFrameIndex = r0
        L48:
            return
    }

    public void readPositionalData(int r12, int r13, java.io.DataInputStream r14) throws java.io.IOException {
            r11 = this;
            int r0 = r14.readInt()
            r11._id = r0
            float r0 = r14.readFloat()
            r11._transparency = r0
            float r0 = r14.readFloat()
            r11._blur = r0
            r0 = 16
            r1 = 0
            r2 = 1
            r3 = 0
            if (r13 < r0) goto L36
            int r4 = r14.read()
            if (r4 == 0) goto L21
            r4 = 1
            goto L22
        L21:
            r4 = 0
        L22:
            r11._isMotionBlur = r4
            int r4 = r14.read()
            if (r4 == 0) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r11.motionBlurIsOneDirection = r4
            int r4 = r14.readInt()
            r11._motionBlurAngle = r4
            goto L68
        L36:
            int r4 = r14.read()
            if (r4 == 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            int r5 = r14.read()
            if (r5 == 0) goto L47
            r5 = 1
            goto L48
        L47:
            r5 = 0
        L48:
            if (r4 == 0) goto L51
            if (r5 != 0) goto L51
            r11._isMotionBlur = r2
            r11._motionBlurAngle = r3
            goto L66
        L51:
            if (r4 != 0) goto L5c
            if (r5 == 0) goto L5c
            r11._isMotionBlur = r2
            r4 = 90
            r11._motionBlurAngle = r4
            goto L66
        L5c:
            if (r4 != 0) goto L66
            if (r5 != 0) goto L66
            r11._isMotionBlur = r3
            r11._motionBlurAngle = r3
            r11._blur = r1
        L66:
            r11.motionBlurIsOneDirection = r3
        L68:
            float r4 = r14.readFloat()
            r11._saturation = r4
            if (r13 < r0) goto L75
            int r4 = r14.readInt()
            goto L76
        L75:
            r4 = 1
        L76:
            r11._pixelation = r4
            int r4 = r14.readInt()
            com.badlogic.gdx.graphics.Color r5 = r11._tintColor
            r6 = r4 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            r7 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r7
            int r8 = r4 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r7
            int r4 = r4 >> r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r7
            r9 = 1065353216(0x3f800000, float:1.0)
            r5.set(r6, r8, r4, r9)
            float r4 = r14.readFloat()
            r11._tintAmount = r4
            r4 = 303(0x12f, float:4.25E-43)
            if (r12 < r4) goto La3
            float r4 = r14.readFloat()
            goto La4
        La3:
            r4 = 0
        La4:
            r11._hueShift = r4
            int r4 = r14.read()
            if (r4 == 0) goto Lae
            r4 = 1
            goto Laf
        Lae:
            r4 = 0
        Laf:
            r11._colorIsInverted = r4
            float r4 = r14.readFloat()
            r11._glow = r4
            int r4 = r14.readInt()
            com.badlogic.gdx.graphics.Color r5 = r11._glowColor
            r6 = r4 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r7
            int r8 = r4 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r7
            int r4 = r4 >> r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r7
            r5.set(r6, r8, r4, r9)
            float r4 = r14.readFloat()
            r11._glowIntensity = r4
            r4 = 32
            if (r13 < r4) goto Lfd
            int r4 = r14.readInt()
            com.badlogic.gdx.graphics.Color r5 = r11._outlineColor
            r6 = r4 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r7
            int r8 = r4 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r7
            int r4 = r4 >> r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r7
            r5.set(r6, r8, r4, r9)
            float r4 = r14.readFloat()
            r11._outlineAlpha = r4
            float r4 = r14.readFloat()
            r11._outlineThickness = r4
        Lfd:
            r4 = 330(0x14a, float:4.62E-43)
            if (r12 < r4) goto L106
            int r5 = r14.readInt()
            goto L108
        L106:
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L108:
            com.badlogic.gdx.graphics.Color r6 = r11._dsColor
            r8 = r5 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r7
            int r10 = r5 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r7
            int r0 = r5 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r7
            r6.set(r8, r10, r0, r9)
            if (r12 < r4) goto L124
            float r0 = r14.readFloat()
            goto L125
        L124:
            r0 = 0
        L125:
            r11._dsAlpha = r0
            r0 = 10
            if (r12 < r4) goto L130
            int r5 = r14.readInt()
            goto L132
        L130:
            r5 = 10
        L132:
            r11._dsDistance = r5
            r5 = 135(0x87, float:1.89E-43)
            if (r12 < r4) goto L13d
            int r6 = r14.readInt()
            goto L13f
        L13d:
            r6 = 135(0x87, float:1.89E-43)
        L13f:
            r11._dsAngle = r6
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r12 < r4) goto L14a
            float r4 = r14.readFloat()
            goto L14c
        L14a:
            r4 = 1056964608(0x3f000000, float:0.5)
        L14c:
            r11._dsBlur = r4
            r4 = 310(0x136, float:4.34E-43)
            if (r12 < r4) goto L15a
            int r4 = r14.read()
            if (r4 == 0) goto L15a
            r4 = 1
            goto L15b
        L15a:
            r4 = 0
        L15b:
            r11._isUsingJoinParentFilters = r4
            float r4 = r14.readFloat()
            r11._scale = r4
            com.badlogic.gdx.math.Vector2 r4 = r11._position
            float r7 = r14.readFloat()
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r8
            float r8 = r14.readFloat()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r10
            r4.set(r7, r8)
            int r4 = r14.readInt()
            r11._currentFrameIndex = r4
            int r4 = r14.readInt()
            r11._startFrameIndex = r4
            int r4 = r14.readInt()
            r11._flipX = r4
            int r4 = r14.readInt()
            r11._flipY = r4
            int r4 = r14.readInt()
            r11._playmode = r4
            float r4 = r14.readFloat()
            r11._volumeScale = r4
            int r4 = r14.read()
            if (r4 == 0) goto L1a4
            r4 = 1
            goto L1a5
        L1a4:
            r4 = 0
        L1a5:
            r11._playDuringDelay = r4
            int r4 = r14.read()
            if (r4 == 0) goto L1af
            r4 = 1
            goto L1b0
        L1af:
            r4 = 0
        L1b0:
            r11._isLocked = r4
            int r4 = r14.read()
            if (r4 == 0) goto L1ba
            r4 = 1
            goto L1bb
        L1ba:
            r4 = 0
        L1bb:
            r11._isPersistentWhenTweening = r4
            r4 = 78
            if (r13 < r4) goto L1c6
            byte r4 = r14.readByte()
            goto L1c7
        L1c6:
            r4 = 1
        L1c7:
            r11.mTweenMode = r4
            r4 = 15
            if (r13 < r4) goto L1d6
            int r13 = r14.read()
            if (r13 == 0) goto L1d4
            goto L1d6
        L1d4:
            r13 = 0
            goto L1d7
        L1d6:
            r13 = 1
        L1d7:
            r11.mVisibleInOnionSkin = r13
            org.fortheloss.framework.IPlatform r13 = org.fortheloss.sticknodes.App.platform
            boolean r13 = r13.isPro()
            if (r13 != 0) goto L21c
            r11._colorIsInverted = r3
            r11._tintAmount = r1
            com.badlogic.gdx.graphics.Color r13 = r11._tintColor
            r13.set(r9, r9, r9, r9)
            r11._hueShift = r1
            r11._saturation = r9
            r11._pixelation = r2
            r11._blur = r1
            r11._isMotionBlur = r3
            r11.motionBlurIsOneDirection = r3
            r11._motionBlurAngle = r3
            r11._glow = r1
            com.badlogic.gdx.graphics.Color r13 = r11._glowColor
            r2 = 1058444951(0x3f169697, float:0.5882353)
            r13.set(r1, r2, r9, r9)
            r11._glowIntensity = r9
            com.badlogic.gdx.graphics.Color r13 = r11._outlineColor
            r13.set(r9, r1, r2, r9)
            r11._outlineAlpha = r9
            r11._outlineThickness = r1
            com.badlogic.gdx.graphics.Color r13 = r11._dsColor
            r13.set(r1, r1, r1, r9)
            r11._dsAlpha = r1
            r11._dsDistance = r0
            r11._dsAngle = r5
            r11._dsBlur = r6
            r11._isUsingJoinParentFilters = r3
        L21c:
            org.fortheloss.sticknodes.movieclip.MCNode r13 = r11._mainNode
            r13.beginReadingPositionalData(r12, r14)
            org.fortheloss.sticknodes.movieclip.MCNode r13 = r11._secondaryNode
            r13.beginReadingPositionalData(r12, r14)
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
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._secondaryNode
            r1 = 0
            r0.rotate(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setBlur(float r3) {
            r2 = this;
            r2._blur = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._blur = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._blur = r0
        L12:
            float r3 = r2._blur
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._blur = r3
            return
    }

    public void setCurrentFrameIndex(int r3) {
            r2 = this;
            r2._currentFrameIndex = r3
            r0 = 0
            if (r3 >= 0) goto L8
            r2._currentFrameIndex = r0
            goto L1e
        L8:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            if (r3 < r1) goto L1e
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r2._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r3 = r3.size()
            int r3 = r3 + (-1)
            r2._currentFrameIndex = r3
        L1e:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r2._mcSourceRef
            boolean r3 = r3.getTweenLoopProtectionEnabled()
            if (r3 == 0) goto L36
            int r3 = r2._currentFrameIndex
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r3 != r1) goto L36
            r2._currentFrameIndex = r0
        L36:
            return
    }

    public void setDrawsTweenedStickfigureArray(boolean r1) {
            r0 = this;
            r0._drawsTweenedStickfigureArray = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsAlpha(float r3) {
            r2 = this;
            r2._dsAlpha = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._dsAlpha = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._dsAlpha = r0
        L12:
            float r3 = r2._dsAlpha
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._dsAlpha = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsAngle(int r1) {
            r0 = this;
            int r1 = r1 % 360
            r0._dsAngle = r1
        L4:
            int r1 = r0._dsAngle
            if (r1 >= 0) goto Ld
            int r1 = r1 + 360
            r0._dsAngle = r1
            goto L4
        Ld:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsBlur(float r3) {
            r2 = this;
            r2._dsBlur = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._dsBlur = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._dsBlur = r0
        L12:
            float r3 = r2._dsBlur
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._dsBlur = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._dsColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1._dsColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setDsDistance(int r2) {
            r1 = this;
            r1._dsDistance = r2
            r0 = -99999(0xfffffffffffe7961, float:NaN)
            if (r2 >= r0) goto La
            r1._dsDistance = r0
            goto L11
        La:
            r0 = 99999(0x1869f, float:1.40128E-40)
            if (r2 <= r0) goto L11
            r1._dsDistance = r0
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
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._secondaryNode
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r2._mainNode
            float r1 = r1.getAngle()
            float r3 = r3 - r1
            r1 = 1
            r0.rotate(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setFilters(org.fortheloss.sticknodes.data.FigureFilterProperties r4) {
            r3 = this;
            if (r4 != 0) goto L32
            r4 = 1065353216(0x3f800000, float:1.0)
            r3._transparency = r4
            r0 = 0
            r3._colorIsInverted = r0
            r1 = 0
            r3._tintAmount = r1
            r3._hueShift = r1
            r3._saturation = r4
            r2 = 1
            r3._pixelation = r2
            r3._blur = r1
            r3._isMotionBlur = r0
            r3.motionBlurIsOneDirection = r0
            r3._motionBlurAngle = r0
            r3._glow = r1
            r3._glowIntensity = r4
            r3._outlineAlpha = r4
            r3._outlineThickness = r1
            r3._dsAlpha = r1
            r4 = 10
            r3._dsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r3._dsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r3._dsBlur = r4
            goto L96
        L32:
            float r0 = r4.transparency
            r3._transparency = r0
            boolean r0 = r4.colorIsInverted
            r3._colorIsInverted = r0
            float r0 = r4.tintAmount
            r3._tintAmount = r0
            com.badlogic.gdx.graphics.Color r0 = r3._tintColor
            com.badlogic.gdx.graphics.Color r1 = r4.tintColor
            r0.set(r1)
            float r0 = r4.hueShift
            r3._hueShift = r0
            float r0 = r4.saturation
            r3._saturation = r0
            int r0 = r4.pixelation
            r3._pixelation = r0
            float r0 = r4.blur
            r3._blur = r0
            boolean r0 = r4.isMotionBlur
            r3._isMotionBlur = r0
            boolean r0 = r4.motionBlurIsOneDirection
            r3.motionBlurIsOneDirection = r0
            int r0 = r4.motionBlurAngle
            r3._motionBlurAngle = r0
            float r0 = r4.glow
            r3._glow = r0
            com.badlogic.gdx.graphics.Color r0 = r3._glowColor
            com.badlogic.gdx.graphics.Color r1 = r4.glowColor
            r0.set(r1)
            float r0 = r4.glowIntensity
            r3._glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r3._outlineColor
            com.badlogic.gdx.graphics.Color r1 = r4.outlineColor
            r0.set(r1)
            float r0 = r4.outlineAlpha
            r3._outlineAlpha = r0
            float r0 = r4.outlineThickness
            r3._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r3._dsColor
            com.badlogic.gdx.graphics.Color r1 = r4.dsColor
            r0.set(r1)
            float r0 = r4.dsAlpha
            r3._dsAlpha = r0
            int r0 = r4.dsDistance
            r3._dsDistance = r0
            int r0 = r4.dsAngle
            r3._dsAngle = r0
            float r4 = r4.dsBlur
            r3._dsBlur = r4
        L96:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setGlow(float r3) {
            r2 = this;
            r2._glow = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._glow = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._glow = r0
        L12:
            float r3 = r2._glow
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._glow = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setGlowColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._glowColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1._glowColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setGlowIntensity(float r3) {
            r2 = this;
            r2._glowIntensity = r3
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._glowIntensity = r0
            goto L13
        Lb:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2._glowIntensity = r0
        L13:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setHueShift(float r3) {
            r2 = this;
            r2._hueShift = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._hueShift = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._hueShift = r0
        L12:
            float r3 = r2._hueShift
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._hueShift = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setID(int r1) {
            r0 = this;
            r0._id = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setInvertedColor(boolean r1) {
            r0 = this;
            r0._colorIsInverted = r1
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
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSourceRef
            r0.setLibraryID(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setLocked(boolean r1) {
            r0 = this;
            r0._isLocked = r1
            return
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

    public void setNewOrigin(org.fortheloss.sticknodes.movieclip.MCReference r1) {
            r0 = this;
            r0._originMCRef = r1
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
            r0._isPersistentWhenTweening = r1
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

    public void setPlayDuringDelay(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 == 0) goto L8
            r0.setPlayDuringDelay(r2)
            return
        L8:
            r1._playDuringDelay = r2
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            int r0 = r1._id
            r2.onOriginMCPropertiesChange(r0)
            return
    }

    public void setPlaymode(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 == 0) goto L8
            r0.setPlaymode(r2)
            return
        L8:
            r1._playmode = r2
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            int r0 = r1._id
            r2.onOriginMCPropertiesChange(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setPosition(float r2, float r3) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            r0.set(r2, r3)
            return
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.MCReferenceProperties r3) {
            r2 = this;
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r1 = r3.x
            r0.x = r1
            float r1 = r3.y
            r0.y = r1
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r2._mainNode
            r0.flagPositionAsDirty()
            int r0 = r3.startFrameIndex
            r2._startFrameIndex = r0
            int r0 = r3.currentFrameIndex
            r2._currentFrameIndex = r0
            int r0 = r3.playmode
            r2._playmode = r0
            boolean r0 = r3.playDuringDelay
            r2._playDuringDelay = r0
            float r0 = r3.volumeScale
            r2._volumeScale = r0
            int r0 = r3.flipX
            r2._flipX = r0
            int r0 = r3.flipY
            r2._flipY = r0
            float r0 = r3.scale
            r2._scale = r0
            float r0 = r3.transparency
            r2._transparency = r0
            float r0 = r3.blur
            r2._blur = r0
            boolean r0 = r3.isMotionBlur
            r2._isMotionBlur = r0
            boolean r0 = r3.motionBlurIsOmniDirectional
            r2.motionBlurIsOneDirection = r0
            int r0 = r3.motionBlurAngle
            r2._motionBlurAngle = r0
            float r0 = r3.saturation
            r2._saturation = r0
            int r0 = r3.pixelation
            r2._pixelation = r0
            com.badlogic.gdx.graphics.Color r0 = r2._tintColor
            com.badlogic.gdx.graphics.Color r1 = r3.tintColor
            r0.set(r1)
            float r0 = r3.tintAmount
            r2._tintAmount = r0
            float r0 = r3.hueShift
            r2._hueShift = r0
            boolean r0 = r3.colorIsInverted
            r2._colorIsInverted = r0
            float r0 = r3.glow
            r2._glow = r0
            com.badlogic.gdx.graphics.Color r0 = r2._glowColor
            com.badlogic.gdx.graphics.Color r1 = r3.glowColor
            r0.set(r1)
            float r0 = r3.glowIntensity
            r2._glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r2._outlineColor
            com.badlogic.gdx.graphics.Color r1 = r3.outlineColor
            r0.set(r1)
            float r0 = r3.outlineAlpha
            r2._outlineAlpha = r0
            float r0 = r3.outlineThickness
            r2._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r2._dsColor
            com.badlogic.gdx.graphics.Color r1 = r3.dsColor
            r0.set(r1)
            float r0 = r3.dsAlpha
            r2._dsAlpha = r0
            int r0 = r3.dsDistance
            r2._dsDistance = r0
            int r0 = r3.dsAngle
            r2._dsAngle = r0
            float r0 = r3.dsBlur
            r2._dsBlur = r0
            boolean r0 = r3.isUsingJoinParentFilters
            r2._isUsingJoinParentFilters = r0
            boolean r0 = r3.isLocked
            r2._isLocked = r0
            byte r0 = r3.mTweenMode
            r2.mTweenMode = r0
            boolean r0 = r3.isPersistentWhenTweening
            r2._isPersistentWhenTweening = r0
            boolean r3 = r3.visibleInOnionSkin
            r2.mVisibleInOnionSkin = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setSaturation(float r3) {
            r2 = this;
            r2._saturation = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._saturation = r0
            goto L12
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._saturation = r0
        L12:
            float r3 = r2._saturation
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._saturation = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setScale(float r3) {
            r2 = this;
            r2._scale = r3
            r0 = 953267991(0x38d1b717, float:1.0E-4)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r2._scale = r0
            goto L14
        Lc:
            r0 = 1092616192(0x41200000, float:10.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L14
            r2._scale = r0
        L14:
            org.fortheloss.sticknodes.movieclip.MCNode r3 = r2._secondaryNode
            r3.flagPositionAsDirty()
            return
    }

    public void setStartFrameIndex(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._originMCRef
            if (r0 == 0) goto L8
            r0.setStartFrameIndex(r3)
            return
        L8:
            r2._startFrameIndex = r3
            r0 = 0
            if (r3 >= 0) goto L10
            r2._startFrameIndex = r0
            goto L26
        L10:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            if (r3 < r1) goto L26
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r2._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r3 = r3.size()
            int r3 = r3 + (-1)
            r2._startFrameIndex = r3
        L26:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r2._mcSourceRef
            boolean r3 = r3.getTweenLoopProtectionEnabled()
            if (r3 == 0) goto L3e
            int r3 = r2._startFrameIndex
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r3 != r1) goto L3e
            r2._startFrameIndex = r0
        L3e:
            int r3 = r2._startFrameIndex
            r2._currentFrameIndex = r3
            org.fortheloss.sticknodes.data.FrameData r3 = r2._frameDataRef
            int r0 = r2._id
            r3.onOriginMCPropertiesChange(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.IStatefigure
    public void setStateIndex(int r1) {
            r0 = this;
            r0.setCurrentFrameIndex(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.IStatefigure
    public void setStateIsControlled(boolean r1) {
            r0 = this;
            r0.mStateIsControlled = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTintAmount(float r3) {
            r2 = this;
            r2._tintAmount = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._tintAmount = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._tintAmount = r0
        L12:
            float r3 = r2._tintAmount
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._tintAmount = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTintColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._tintColor
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1._tintColor
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setTransparency(float r3) {
            r2 = this;
            r2._transparency = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._transparency = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._transparency = r0
        L12:
            float r3 = r2._transparency
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._transparency = r3
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
            r0._isUsingJoinParentFilters = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setVisibleInOnionSkin(boolean r1) {
            r0 = this;
            r0.mVisibleInOnionSkin = r1
            return
    }

    public void setVolumeScale(float r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._originMCRef
            if (r0 == 0) goto L8
            r0.setVolumeScale(r2)
            return
        L8:
            r1._volumeScale = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void unjoin() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._joinedToNodeRef
            if (r0 == 0) goto L13
            r1 = 0
            r2._isJoined = r1
            r0.removeJoinedFigure(r2)
            r0 = 0
            r2._joinedToNodeRef = r0
            r2.setLocked(r1)
            r2.mStateIsControlled = r1
            return
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't unjoin, this movieclip is not joined to anything."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void validateDirtyNodes() {
            r3 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._mainNode
            r0.validatePosition()
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._secondaryNode
            r0.validatePosition()
            boolean r0 = r3._drawsTweenedStickfigureArray
            if (r0 != 0) goto L1f
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r3._currentFrameIndex
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            java.util.ArrayList r0 = r0.getDrawableFigures()
            goto L2f
        L1f:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._mcSourceRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r3._currentFrameIndex
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            java.util.ArrayList r0 = r0.getTweenedDrawableFigures()
        L2f:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L35:
            if (r1 < 0) goto L43
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.validateDirtyNodes()
            int r1 = r1 + (-1)
            goto L35
        L43:
            return
    }
}
