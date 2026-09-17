package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public class Stickfigure implements org.fortheloss.sticknodes.animationscreen.IDrawableFigure {
    public static boolean GAUSSIAN_BLUR_FLAG = false;
    private static boolean IS_USING_APPROXIMATE_PRECISION = true;
    public static int PRECISION_TOUCH_SIZE = 0;
    public static float PRECISION_TOUCH_SIZE_VIEWPORT_SCALE = 1.0f;
    private static com.badlogic.gdx.math.Vector2 lockedNodeDragOffset;
    private static java.util.Stack<org.fortheloss.sticknodes.stickfigure.Stickfigure> stickfigureFilterReferenceStack;
    private float _blur;
    private com.badlogic.gdx.graphics.Color _color;
    private boolean _colorIsInverted;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _dirtyNodeRefs;
    private boolean _doNotDraw;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _drawOrderedNodeRefs;
    private float _dsAlpha;
    private int _dsAngle;
    private float _dsBlur;
    private com.badlogic.gdx.graphics.Color _dsColor;
    private int _dsDistance;
    private byte _flagLockedToCamera;
    private float _glow;
    private com.badlogic.gdx.graphics.Color _glowColor;
    private float _glowIntensity;
    private boolean _hasDirtyNodes;
    private boolean _hasJoinAnchorNode;
    private float _hueShift;
    private int _id;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _interpolateNodeRefs;
    private boolean _isJoined;
    private boolean _isLocked;
    private boolean _isMotionBlur;
    private boolean _isPersistentWhenTweening;
    private boolean _isTweeningColors;
    private boolean _isUsingJoinParentFilters;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _joinAnchorNodeRefs;
    private org.fortheloss.sticknodes.stickfigure.StickNode _joinedToNodeRef;
    private int _libraryID;
    private float _lockedNodeX;
    private float _lockedNodeY;
    private int _lockedStickNodeIndex;
    private org.fortheloss.sticknodes.stickfigure.StickNode _mainNode;
    private int _motionBlurAngle;
    private boolean _motionBlurIsOneDirection;
    private java.lang.String _name;
    private float _outlineAlpha;
    private com.badlogic.gdx.graphics.Color _outlineColor;
    private float _outlineThickness;
    private int _pixelation;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _polyfillAnchorNodes;
    private org.fortheloss.sticknodes.stickfigure.StickNode _polyfillAnchorToOutlineRef;
    private com.badlogic.gdx.math.Vector2 _position;
    private boolean _pushJoinedStickfigures;
    private float _saturation;
    private float _scale;
    private boolean _scaleJoinedStickfigures;
    private boolean _setStateOfJoins;
    private boolean _smartStretchEnabled;
    private int _stateIndexOfJoins;
    private float _tintAmount;
    private com.badlogic.gdx.graphics.Color _tintColor;
    private float _transparency;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> mConnectorRefs;
    private float mJoinOffsetAngle;
    private byte mTweenMode;
    private boolean mVisibleInOnionSkin;
    private boolean meKeepJoinDuringInterpolation;



    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.lockedNodeDragOffset = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.stickfigureFilterReferenceStack = r0
            return
    }

    public Stickfigure() {
            r16 = this;
            r7 = r16
            r16.<init>()
            r8 = 0
            r7._libraryID = r8
            r0 = -1
            r7._id = r0
            r9 = 0
            r7._scale = r9
            r10 = 1
            r7._smartStretchEnabled = r10
            r7._doNotDraw = r8
            r7._isLocked = r8
            r7.meKeepJoinDuringInterpolation = r10
            r7._isPersistentWhenTweening = r8
            r7.mVisibleInOnionSkin = r10
            r7._isTweeningColors = r8
            r7.mTweenMode = r10
            r7._scaleJoinedStickfigures = r10
            r7._pushJoinedStickfigures = r10
            r7._setStateOfJoins = r8
            r7._stateIndexOfJoins = r8
            r7._hasJoinAnchorNode = r8
            r7._isJoined = r8
            r7.mJoinOffsetAngle = r9
            r7._hasDirtyNodes = r8
            r11 = 1065353216(0x3f800000, float:1.0)
            r7._transparency = r11
            r7._blur = r9
            r7._isMotionBlur = r8
            r7._motionBlurIsOneDirection = r8
            r7._motionBlurAngle = r8
            r7._saturation = r11
            r7._pixelation = r10
            r7._tintAmount = r9
            r7._hueShift = r9
            r7._colorIsInverted = r8
            r7._glow = r9
            r7._glowIntensity = r11
            r7._outlineAlpha = r11
            r7._outlineThickness = r9
            r7._dsAlpha = r9
            r12 = 10
            r7._dsDistance = r12
            r13 = 135(0x87, float:1.89E-43)
            r7._dsAngle = r13
            r14 = 1056964608(0x3f000000, float:0.5)
            r7._dsBlur = r14
            r7._flagLockedToCamera = r8
            r7._lockedStickNodeIndex = r0
            r7._lockedNodeX = r9
            r7._lockedNodeY = r9
            r7._isUsingJoinParentFilters = r8
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1040187392(0x3e000000, float:0.125)
            r0.<init>(r1, r1, r1, r11)
            r7._color = r0
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r15 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1107296256(0x42000000, float:32.0)
            r6 = -1
            r0 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._mainNode = r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7._drawOrderedNodeRefs = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7._mainNode
            r0.add(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r7._interpolateNodeRefs = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7._mainNode
            r0.add(r1)
            r7._scale = r11
            r7._transparency = r11
            r7._blur = r9
            r7._isMotionBlur = r8
            r7._motionBlurIsOneDirection = r8
            r7._motionBlurAngle = r8
            r7._saturation = r11
            r7._pixelation = r10
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r11, r11, r11, r11)
            r7._tintColor = r0
            r7._tintAmount = r9
            r7._hueShift = r9
            r7._colorIsInverted = r8
            r7._glow = r9
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1058444951(0x3f169697, float:0.5882353)
            r0.<init>(r9, r1, r11, r11)
            r7._glowColor = r0
            r7._glowIntensity = r11
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r11, r9, r1, r11)
            r7._outlineColor = r0
            r7._outlineAlpha = r11
            r7._outlineThickness = r9
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r9, r9, r9, r11)
            r7._dsColor = r0
            r7._dsAlpha = r9
            r7._dsDistance = r12
            r7._dsAngle = r13
            r7._dsBlur = r14
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._position = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7._dirtyNodeRefs = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7._mainNode
            r0.flagPositionAsDirty()
            return
    }

    public Stickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Stickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r11, boolean r12) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10._libraryID = r0
            r1 = -1
            r10._id = r1
            r2 = 0
            r10._scale = r2
            r3 = 1
            r10._smartStretchEnabled = r3
            r10._doNotDraw = r0
            r10._isLocked = r0
            r10.meKeepJoinDuringInterpolation = r3
            r10._isPersistentWhenTweening = r0
            r10.mVisibleInOnionSkin = r3
            r10._isTweeningColors = r0
            r10.mTweenMode = r3
            r10._scaleJoinedStickfigures = r3
            r10._pushJoinedStickfigures = r3
            r10._setStateOfJoins = r0
            r10._stateIndexOfJoins = r0
            r10._hasJoinAnchorNode = r0
            r10._isJoined = r0
            r10.mJoinOffsetAngle = r2
            r10._hasDirtyNodes = r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r10._transparency = r4
            r10._blur = r2
            r10._isMotionBlur = r0
            r10._motionBlurIsOneDirection = r0
            r10._motionBlurAngle = r0
            r10._saturation = r4
            r10._pixelation = r3
            r10._tintAmount = r2
            r10._hueShift = r2
            r10._colorIsInverted = r0
            r10._glow = r2
            r10._glowIntensity = r4
            r10._outlineAlpha = r4
            r10._outlineThickness = r2
            r10._dsAlpha = r2
            r4 = 10
            r10._dsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r10._dsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r10._dsBlur = r4
            r10._flagLockedToCamera = r0
            r10._lockedStickNodeIndex = r1
            r10._lockedNodeX = r2
            r10._lockedNodeY = r2
            r10._isUsingJoinParentFilters = r0
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r2 = r11._color
            r1.<init>(r2)
            r10._color = r1
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r11._mainNode
            r6 = 0
            r8 = 1
            r4 = r1
            r5 = r10
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r10._mainNode = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r11._drawOrderedNodeRefs
            int r2 = r2.size()
            r1.<init>(r2)
            r10._drawOrderedNodeRefs = r1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r11._drawOrderedNodeRefs
            int r1 = r1.size()
            int r1 = r1 - r3
        L8e:
            r2 = 0
            if (r1 < 0) goto L99
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r10._drawOrderedNodeRefs
            r4.add(r2)
            int r1 = r1 + (-1)
            goto L8e
        L99:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r10._mainNode
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r10._drawOrderedNodeRefs
            r1.putAllIntoDrawOrderArray(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 20
            r1.<init>(r4)
            r10._interpolateNodeRefs = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r10._mainNode
            r1.add(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r10._mainNode
            java.util.ArrayList r1 = r1.getChildrenNodes()
            int r1 = r1.size()
            int r1 = r1 - r3
        Lb9:
            if (r1 < 0) goto Lcf
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r10._interpolateNodeRefs
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r10._mainNode
            java.util.ArrayList r5 = r5.getChildrenNodes()
            java.lang.Object r5 = r5.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r4.add(r5)
            int r1 = r1 + (-1)
            goto Lb9
        Lcf:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r10._drawOrderedNodeRefs
            int r1 = r1.size()
            int r1 = r1 - r3
        Ld6:
            if (r1 < r3) goto Lfc
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r10._drawOrderedNodeRefs
            java.lang.Object r4 = r4.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r10._interpolateNodeRefs
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lf9
            boolean r5 = r4.isStatic()
            if (r5 == 0) goto Lf4
            boolean r5 = r4.getIsAngleLocked()
            if (r5 == 0) goto Lf9
        Lf4:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r10._interpolateNodeRefs
            r5.add(r4)
        Lf9:
            int r1 = r1 + (-1)
            goto Ld6
        Lfc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10._dirtyNodeRefs = r1
            boolean r1 = r11.hasPolyfillAnchorNode()
            if (r1 == 0) goto L125
            r10.recreatePolyfillAnchorsAfterClone(r11)
            if (r12 != 0) goto L125
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r12 = r10._polyfillAnchorNodes
            int r12 = r12.size()
            r1 = 0
        L115:
            if (r1 >= r12) goto L125
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r10._polyfillAnchorNodes
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r3.analyzePolyfillForCompleteChildren()
            int r1 = r1 + 1
            goto L115
        L125:
            boolean r12 = r11.hasConnectors()
            if (r12 == 0) goto L12e
            r10.reattachConnectorsAfterClone(r11)
        L12e:
            r10.updateRelativeAngleLocksAfterClone(r11)
            com.badlogic.gdx.math.Vector2 r12 = new com.badlogic.gdx.math.Vector2
            com.badlogic.gdx.math.Vector2 r1 = r11._position
            r12.<init>(r1)
            r10._position = r12
            java.lang.String r12 = new java.lang.String
            java.lang.String r1 = r11._name
            r12.<init>(r1)
            r10._name = r12
            int r12 = r11._libraryID
            r10._libraryID = r12
            int r12 = r11._id
            r10._id = r12
            float r12 = r11._scale
            r10._scale = r12
            float r12 = r11._transparency
            r10._transparency = r12
            float r12 = r11._blur
            r10._blur = r12
            boolean r12 = r11._isMotionBlur
            r10._isMotionBlur = r12
            boolean r12 = r11._motionBlurIsOneDirection
            r10._motionBlurIsOneDirection = r12
            int r12 = r11._motionBlurAngle
            r10._motionBlurAngle = r12
            float r12 = r11._saturation
            r10._saturation = r12
            int r12 = r11._pixelation
            r10._pixelation = r12
            com.badlogic.gdx.graphics.Color r12 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r11._tintColor
            r12.<init>(r1)
            r10._tintColor = r12
            float r12 = r11._tintAmount
            r10._tintAmount = r12
            float r12 = r11._hueShift
            r10._hueShift = r12
            boolean r12 = r11._colorIsInverted
            r10._colorIsInverted = r12
            float r12 = r11._glow
            r10._glow = r12
            com.badlogic.gdx.graphics.Color r12 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r11._glowColor
            r12.<init>(r1)
            r10._glowColor = r12
            float r12 = r11._glowIntensity
            r10._glowIntensity = r12
            com.badlogic.gdx.graphics.Color r12 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r11._outlineColor
            r12.<init>(r1)
            r10._outlineColor = r12
            float r12 = r11._outlineAlpha
            r10._outlineAlpha = r12
            float r12 = r11._outlineThickness
            r10._outlineThickness = r12
            com.badlogic.gdx.graphics.Color r12 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r11._dsColor
            r12.<init>(r1)
            r10._dsColor = r12
            float r12 = r11._dsAlpha
            r10._dsAlpha = r12
            int r12 = r11._dsDistance
            r10._dsDistance = r12
            int r12 = r11._dsAngle
            r10._dsAngle = r12
            float r12 = r11._dsBlur
            r10._dsBlur = r12
            boolean r12 = r11._isLocked
            r10._isLocked = r12
            boolean r12 = r11._isPersistentWhenTweening
            r10._isPersistentWhenTweening = r12
            boolean r12 = r11.mVisibleInOnionSkin
            r10.mVisibleInOnionSkin = r12
            boolean r12 = r11._isTweeningColors
            r10._isTweeningColors = r12
            byte r12 = r11.mTweenMode
            r10.mTweenMode = r12
            boolean r12 = r11._scaleJoinedStickfigures
            r10._scaleJoinedStickfigures = r12
            boolean r12 = r11._pushJoinedStickfigures
            r10._pushJoinedStickfigures = r12
            boolean r12 = r11._setStateOfJoins
            r10._setStateOfJoins = r12
            int r12 = r11._stateIndexOfJoins
            r10._stateIndexOfJoins = r12
            boolean r12 = r11._isUsingJoinParentFilters
            r10._isUsingJoinParentFilters = r12
            r10._joinAnchorNodeRefs = r2
            r10._joinedToNodeRef = r2
            float r12 = r11.mJoinOffsetAngle
            r10.mJoinOffsetAngle = r12
            r10._flagLockedToCamera = r0
            int r12 = r11._lockedStickNodeIndex
            r10._lockedStickNodeIndex = r12
            float r12 = r11._lockedNodeX
            r10._lockedNodeX = r12
            float r11 = r11._lockedNodeY
            r10._lockedNodeY = r11
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r10._mainNode
            r11.flagPositionAsDirty()
            r10.validateDirtyNodes()
            return
    }

    private com.badlogic.gdx.math.Vector2 actuallyRepositionBasedOnLockedStickNode(org.fortheloss.sticknodes.stickfigure.Stickfigure r2, org.fortheloss.sticknodes.stickfigure.StickNode r3, float r4, float r5) {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getMainNode()
            r0.validatePosition()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getMainNode()
            r0.validatePosition()
            float r0 = r3.getGlobalX()
            float r0 = r0 - r4
            float r3 = r3.getGlobalY()
            float r3 = r3 - r5
            float r4 = r2.getX()
            float r4 = r4 - r0
            float r5 = r2.getY()
            float r5 = r5 - r3
            r2.setPosition(r4, r5)
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.stickfigure.Stickfigure.lockedNodeDragOffset
            com.badlogic.gdx.math.Vector2 r2 = r2.set(r0, r3)
            return r2
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

    private org.fortheloss.sticknodes.stickfigure.StickNode getLockedStickNodeAsRootJoin() {
            r8 = this;
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r0.add(r8)
            r1 = 0
        L9:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L5c
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r1.getLockedStickNode()
            if (r2 == 0) goto L1d
            r1 = r2
            goto L5c
        L1d:
            boolean r3 = r1.hasJoinAnchorNode()
            if (r3 == 0) goto L5a
            java.util.ArrayList r1 = r1.getJoinAnchorNodes()
            int r3 = r1.size()
            int r3 = r3 + (-1)
        L2d:
            if (r3 < 0) goto L5a
            java.lang.Object r4 = r1.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            java.util.ArrayList r5 = r4.getJoinedFigures()
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3f:
            if (r5 < 0) goto L57
            java.util.ArrayList r6 = r4.getJoinedFigures()
            java.lang.Object r6 = r6.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto L54
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            r0.add(r6)
        L54:
            int r5 = r5 + (-1)
            goto L3f
        L57:
            int r3 = r3 + (-1)
            goto L2d
        L5a:
            r1 = r2
            goto L9
        L5c:
            return r1
    }

    public static float getNodeClickSizeSquared(float r2) {
            int r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r1
            float r0 = r0 * r1
            float r2 = r2 * r2
            float r0 = r0 / r2
            float r2 = org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE_VIEWPORT_SCALE
            float r2 = r2 * r2
            float r0 = r0 / r2
            return r0
    }

    public static float getNodeClickSizeSquaredBigger(float r2) {
            int r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE
            int r0 = r0 + 1600
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r1
            float r0 = r0 * r1
            float r2 = r2 * r2
            float r0 = r0 / r2
            float r2 = org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE_VIEWPORT_SCALE
            float r2 = r2 * r2
            float r0 = r0 / r2
            return r0
    }

    public static float getTouchPrecisionRatio() {
            int r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE
            float r0 = (float) r0
            int r1 = org.fortheloss.sticknodes.stickfigure.StickNode.NODE_CLICK_SIZE_SQUARED_MOBILE
            float r1 = (float) r1
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            float r1 = r1 * r2
            float r0 = r0 / r1
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
            return r0
    }

    public static boolean isUsingApproximateTouch() {
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.IS_USING_APPROXIMATE_PRECISION
            return r0
    }

    private void reattachConnectorsAfterClone(org.fortheloss.sticknodes.stickfigure.Stickfigure r5) {
            r4 = this;
            java.util.ArrayList r5 = r5.getConnectors()
            int r0 = r5.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L35
            java.lang.Object r2 = r5.get(r1)
            org.fortheloss.sticknodes.stickfigure.Connector r2 = (org.fortheloss.sticknodes.stickfigure.Connector) r2
            int r2 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r2 = r4.getNodeAtDrawOrderIndex(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r2 = (org.fortheloss.sticknodes.stickfigure.Connector) r2
            java.lang.Object r3 = r5.get(r1)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getEndNode()
            int r3 = r3.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r3 = r4.getNodeAtDrawOrderIndex(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r2.changeEndNode(r3)
            int r1 = r1 + 1
            goto L9
        L35:
            return
    }

    private void recalculateNodeDrawOrder() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._drawOrderedNodeRefs
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r3._drawOrderedNodeRefs
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r2.setDrawOrderIndex(r1)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    private void recreatePolyfillAnchorsAfterClone(org.fortheloss.sticknodes.stickfigure.Stickfigure r5) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r5._polyfillAnchorNodes
            int r0 = r5.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r5.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r3 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r3 = r4.getNodeAtDrawOrderIndex(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r3.recreatePolyfillAfterClone(r2)
            int r1 = r1 + 1
            goto L7
        L1f:
            return
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

    private void renderStickfigure(org.fortheloss.sticknodes.SNShapeRenderer r17, float r18, float r19, float r20, boolean r21, boolean r22, boolean r23, org.fortheloss.sticknodes.stickfigure.INode r24) {
            r16 = this;
            r0 = r16
            r1 = r24
            r2 = 0
            r3 = 1
            if (r21 != 0) goto L80
            if (r22 != 0) goto L58
            if (r23 != 0) goto L2c
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._drawOrderedNodeRefs
            int r1 = r1.size()
        L12:
            if (r2 >= r1) goto Ld2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r0._drawOrderedNodeRefs
            java.lang.Object r3 = r3.get(r2)
            r4 = r3
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r9 = 0
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.drawLimb(r5, r6, r7, r8, r9)
            int r2 = r2 + 1
            goto L12
        L2c:
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r4 = 3042(0xbe2, float:4.263E-42)
            r1.glEnable(r4)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r4 = 771(0x303, float:1.08E-42)
            r1.glBlendFunc(r3, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._drawOrderedNodeRefs
            int r1 = r1.size()
        L40:
            if (r2 >= r1) goto Ld2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r0._drawOrderedNodeRefs
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r3.drawLimbAA(r10, r11, r12, r13)
            int r2 = r2 + 1
            goto L40
        L58:
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._drawOrderedNodeRefs
            int r1 = r1.size()
        L66:
            if (r2 >= r1) goto Ld2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r0._drawOrderedNodeRefs
            java.lang.Object r3 = r3.get(r2)
            r4 = r3
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r9 = 0
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.drawLimbCulled(r5, r6, r7, r8, r9)
            int r2 = r2 + 1
            goto L66
        L80:
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            if (r22 != 0) goto Lae
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r0._drawOrderedNodeRefs
            int r14 = r4.size()
            r15 = 0
        L91:
            if (r15 >= r14) goto Ld2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r0._drawOrderedNodeRefs
            java.lang.Object r4 = r4.get(r15)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            if (r4 != r1) goto L9f
            r9 = 1
            goto La0
        L9f:
            r9 = 0
        La0:
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.drawLimb(r5, r6, r7, r8, r9)
            int r15 = r15 + 1
            goto L91
        Lae:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r0._drawOrderedNodeRefs
            int r14 = r4.size()
            r15 = 0
        Lb5:
            if (r15 >= r14) goto Ld2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r0._drawOrderedNodeRefs
            java.lang.Object r4 = r4.get(r15)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            if (r4 != r1) goto Lc3
            r9 = 1
            goto Lc4
        Lc3:
            r9 = 0
        Lc4:
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.drawLimbCulled(r5, r6, r7, r8, r9)
            int r15 = r15 + 1
            goto Lb5
        Ld2:
            return
    }

    public static void setTouchPrecision(boolean r0, float r1, float r2) {
            org.fortheloss.sticknodes.stickfigure.Stickfigure.IS_USING_APPROXIMATE_PRECISION = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE_VIEWPORT_SCALE = r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 - r1
            if (r0 == 0) goto L14
            int r0 = org.fortheloss.sticknodes.stickfigure.StickNode.NODE_CLICK_SIZE_SQUARED_MOBILE
            float r0 = (float) r0
            float r0 = r0 * r2
            float r0 = r0 * r2
            int r0 = (int) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE = r0
            goto L1e
        L14:
            int r0 = org.fortheloss.sticknodes.stickfigure.StickNode.NODE_CLICK_SIZE_SQUARED
            float r0 = (float) r0
            float r0 = r0 * r2
            float r0 = r0 * r2
            int r0 = (int) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure.PRECISION_TOUCH_SIZE = r0
        L1e:
            return
    }

    private void updateJoinsState() {
            r7 = this;
            boolean r0 = r7.hasJoinAnchorNode()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r7._joinAnchorNodeRefs
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        L14:
            if (r1 < 0) goto L38
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r7._joinAnchorNodeRefs
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList r3 = r3.getJoinedFigures()
            int r4 = r3.size()
            int r4 = r4 - r2
        L27:
            if (r4 < 0) goto L35
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            r0.push(r5)
            int r4 = r4 + (-1)
            goto L27
        L35:
            int r1 = r1 + (-1)
            goto L14
        L38:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto La0
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.sprite.IStatefigure
            if (r3 == 0) goto L63
            r3 = r1
            org.fortheloss.sticknodes.sprite.IStatefigure r3 = (org.fortheloss.sticknodes.sprite.IStatefigure) r3
            boolean r4 = r3.isStateable()
            if (r4 == 0) goto L63
            boolean r1 = r7._setStateOfJoins
            if (r1 == 0) goto L5e
            int r1 = r7._stateIndexOfJoins
            r3.setStateIndex(r1)
            r3.setStateIsControlled(r2)
            goto L38
        L5e:
            r1 = 0
            r3.setStateIsControlled(r1)
            goto L38
        L63:
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L38
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            boolean r3 = r1.getDoesSetStateOfJoins()
            if (r3 != 0) goto L38
            boolean r3 = r1.hasJoinAnchorNode()
            if (r3 == 0) goto L38
            java.util.ArrayList r1 = r1.getJoinAnchorNodes()
            int r3 = r1.size()
            int r3 = r3 - r2
        L7e:
            if (r3 < 0) goto L38
            java.lang.Object r4 = r1.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            java.util.ArrayList r4 = r4.getJoinedFigures()
            int r5 = r4.size()
            int r5 = r5 - r2
        L8f:
            if (r5 < 0) goto L9d
            java.lang.Object r6 = r4.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            r0.push(r6)
            int r5 = r5 + (-1)
            goto L8f
        L9d:
            int r3 = r3 + (-1)
            goto L7e
        La0:
            return
    }

    private void updateRelativeAngleLocksAfterClone(org.fortheloss.sticknodes.stickfigure.Stickfigure r5) {
            r4 = this;
            java.lang.Class<java.util.LinkedList> r0 = java.util.LinkedList.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4._mainNode
            r0.add(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r5._mainNode
            r0.add(r5)
        L12:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L5c
            java.lang.Object r5 = r0.remove()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            java.lang.Object r1 = r0.remove()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r2 = r1.getIsAngleLocked()
            if (r2 == 0) goto L33
            boolean r2 = r1.getAngleLockIsMainNode()
            if (r2 != 0) goto L33
            r5.updateAngleLock(r1)
        L33:
            java.util.ArrayList r2 = r5.getChildrenNodes()
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L3d:
            if (r2 < 0) goto L12
            java.util.ArrayList r3 = r5.getChildrenNodes()
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.add(r3)
            java.util.ArrayList r3 = r1.getChildrenNodes()
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.add(r3)
            int r2 = r2 + (-1)
            goto L3d
        L5c:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void addConnector(org.fortheloss.sticknodes.stickfigure.Connector r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r2.mConnectorRefs
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2.mConnectorRefs = r0
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r2.mConnectorRefs
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r2.mConnectorRefs
            r0.add(r3)
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "The Stickfigure already has this Connector in its reference array!"
            r3.<init>(r0)
            throw r3
    }

    public void addDirtyNode(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._dirtyNodeRefs
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1e
            boolean r0 = r2.isMainNode()
            if (r0 == 0) goto L19
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._dirtyNodeRefs
            r0.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._dirtyNodeRefs
            r0.add(r2)
            goto L1e
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._dirtyNodeRefs
            r0.add(r2)
        L1e:
            r2 = 1
            r1._hasDirtyNodes = r2
            return
    }

    public void addJoinAnchor(int r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._joinAnchorNodeRefs
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._joinAnchorNodeRefs = r0
        Lb:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._drawOrderedNodeRefs
            java.lang.Object r3 = r0.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._joinAnchorNodeRefs
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._joinAnchorNodeRefs
            r0.add(r3)
        L20:
            r3 = 1
            r2._hasJoinAnchorNode = r3
            r3 = 0
            r0 = r2
        L25:
            if (r0 == 0) goto L41
            boolean r1 = r0.getDoesSetStateOfJoins()
            if (r1 == 0) goto L32
            r0.updateJoinsState()
        L30:
            r0 = r3
            goto L25
        L32:
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto L30
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            goto L25
        L41:
            return
    }

    public void addNodeToDrawOrder(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._drawOrderedNodeRefs
            r0.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._drawOrderedNodeRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r2.setDrawOrderIndex(r0)
            return
    }

    public void addNodeToDrawOrderAfter(org.fortheloss.sticknodes.stickfigure.StickNode r6, org.fortheloss.sticknodes.stickfigure.StickNode r7) {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._drawOrderedNodeRefs
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r2 >= r0) goto L37
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r5._drawOrderedNodeRefs
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L34
            int r0 = r0 - r3
            if (r2 >= r0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            int r2 = r2 + r3
            r7.add(r2, r6)
            r6.setDrawOrderIndex(r2)
            r5.recalculateNodeDrawOrder()
            goto L32
        L23:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            r7.add(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            int r7 = r7.size()
            int r7 = r7 - r3
            r6.setDrawOrderIndex(r7)
        L32:
            r1 = 1
            goto L37
        L34:
            int r2 = r2 + 1
            goto L8
        L37:
            if (r1 != 0) goto L48
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            r7.add(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            int r7 = r7.size()
            int r7 = r7 - r3
            r6.setDrawOrderIndex(r7)
        L48:
            return
    }

    public void addNodeToDrawOrderBefore(org.fortheloss.sticknodes.stickfigure.StickNode r6, org.fortheloss.sticknodes.stickfigure.StickNode r7) {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._drawOrderedNodeRefs
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r2 >= r0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r5._drawOrderedNodeRefs
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            r7.add(r2, r6)
            r6.setDrawOrderIndex(r2)
            r5.recalculateNodeDrawOrder()
            r1 = 1
            goto L23
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            if (r1 != 0) goto L34
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            r7.add(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._drawOrderedNodeRefs
            int r7 = r7.size()
            int r7 = r7 - r3
            r6.setDrawOrderIndex(r7)
        L34:
            return
    }

    public void addPolyfillAnchorNode(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyfillAnchorNodes
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2._polyfillAnchorNodes = r0
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyfillAnchorNodes
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyfillAnchorNodes
            r0.add(r3)
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "This StickNode is already an polygon anchor according to the stickfigure, something went wrong."
            r3.<init>(r0)
            throw r3
    }

    public void apply252SmartStretchFix() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
            r0.apply252SmartStretchFix()
            return
    }

    public void checkIfPolyfillAffectedBySplit(org.fortheloss.sticknodes.stickfigure.StickNode r3, org.fortheloss.sticknodes.stickfigure.StickNode r4, org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyfillAnchorNodes
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._polyfillAnchorNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.polyfillAnchorInsertBetween(r3, r4, r5)
            int r0 = r0 + (-1)
            goto La
        L1a:
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

    public void copyPropertiesBundle(org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r3) {
            r2 = this;
            java.lang.String r0 = r2._name
            r3.setCopiedStickfigureName(r0)
            int r0 = r2._libraryID
            r3.setCopiedStickfigureLibraryID(r0)
            boolean r0 = r2._isPersistentWhenTweening
            r3.setIsPersistentWhenTweening(r0)
            boolean r0 = r2.mVisibleInOnionSkin
            r3.setIsVisibleInOnionSkin(r0)
            boolean r0 = r2._isTweeningColors
            r3.setIsTweeningColors(r0)
            byte r0 = r2.mTweenMode
            r3.setTweenMode(r0)
            boolean r0 = r2._scaleJoinedStickfigures
            r3.setScaleJoinedStickfigures(r0)
            boolean r0 = r2._pushJoinedStickfigures
            r3.setPushJoinedFigures(r0)
            boolean r0 = r2._setStateOfJoins
            r3.setStateOfJoins(r0)
            int r0 = r2._stateIndexOfJoins
            r3.setJoinsState(r0)
            boolean r0 = r2._isUsingJoinParentFilters
            r3.setUseJoinParentFilters(r0)
            float r0 = r2.mJoinOffsetAngle
            r3.setJoinOffsetAngle(r0)
            float r0 = r2.getX()
            float r1 = r2.getY()
            r3.setPosition(r0, r1)
            float r0 = r2.getScale()
            r3.setScale(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.getColor()
            r3.setColor(r0)
            float r0 = r2.getRotation()
            r3.setRotation(r0)
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = new org.fortheloss.sticknodes.data.FigureFilterProperties
            r0.<init>()
            r0.getProperties(r2)
            r3.setFilterProperties(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._mainNode
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r0 = r0.getBranchProperties()
            r3.setNodeProperties(r0)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._mainNode
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._mainNode = r1
        La:
            r2._drawOrderedNodeRefs = r1
            r2._interpolateNodeRefs = r1
            r2._position = r1
            r2._name = r1
            r2._color = r1
            r2._tintColor = r1
            r2._glowColor = r1
            r2._outlineColor = r1
            r2._dsColor = r1
            r2._joinAnchorNodeRefs = r1
            r2._joinedToNodeRef = r1
            r2._dirtyNodeRefs = r1
            r2._polyfillAnchorToOutlineRef = r1
            r2._polyfillAnchorNodes = r1
            r2.mConnectorRefs = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void doNotDraw() {
            r1 = this;
            r0 = 1
            r1._doNotDraw = r0
            return
    }

    public void drawAllNodesAt(java.util.ArrayList<java.lang.Integer> r10) {
            r9 = this;
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r9._drawOrderedNodeRefs
            int r1 = r1.size()
            org.fortheloss.sticknodes.stickfigure.StickNode[] r2 = new org.fortheloss.sticknodes.stickfigure.StickNode[r1]
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r9._mainNode
            r0.push(r3)
            r3 = 0
            r4 = 0
        L14:
            boolean r5 = r0.empty()
            if (r5 != 0) goto L47
            java.lang.Object r5 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            int r6 = r4 + 1
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2[r4] = r5
            java.util.ArrayList r4 = r5.getChildrenNodes()
            int r5 = r4.size()
            r7 = 0
        L37:
            if (r7 >= r5) goto L45
            java.lang.Object r8 = r4.get(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8
            r0.push(r8)
            int r7 = r7 + 1
            goto L37
        L45:
            r4 = r6
            goto L14
        L47:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r9._drawOrderedNodeRefs
            r10.clear()
        L4c:
            if (r3 >= r1) goto L58
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r9._drawOrderedNodeRefs
            r0 = r2[r3]
            r10.add(r0)
            int r3 = r3 + 1
            goto L4c
        L58:
            r9.recalculateNodeDrawOrder()
            return
    }

    public void drawDrawOrderText(com.badlogic.gdx.graphics.g2d.GlyphLayout r17, com.badlogic.gdx.graphics.g2d.BitmapFont r18, com.badlogic.gdx.graphics.g2d.SpriteBatch r19, float r20, float r21, float r22, float r23, float r24) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r16.validateDirtyNodes()
            float r3 = r16.getX()
            float r3 = r3 - r22
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r24 - r4
            float r3 = r3 * r5
            float r6 = r16.getY()
            float r6 = r6 - r23
            float r6 = r6 * r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1099956224(0x41900000, float:18.0)
            float r5 = r5 * r7
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r0._drawOrderedNodeRefs
            int r7 = r7.size()
            r8 = 0
        L2a:
            if (r8 >= r7) goto La2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r0._drawOrderedNodeRefs
            java.lang.Object r9 = r9.get(r8)
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            boolean r10 = r9.isMainNode()
            if (r10 == 0) goto L3d
            r9 = r19
            goto L9f
        L3d:
            java.lang.String r10 = java.lang.String.valueOf(r8)
            r1.setText(r2, r10)
            float r11 = r1.width
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r12
            float r13 = r1.height
            float r13 = r13 * r12
            float r12 = r9.getAngle()
            r14 = 1127481344(0x43340000, float:180.0)
            float r12 = r12 - r14
            float r14 = r16.getX()
            float r14 = r14 + r20
            float r14 = r14 + r3
            float r15 = r9.getX()
            float r15 = r15 * r24
            float r14 = r14 + r15
            float r14 = r14 - r11
            float r11 = com.badlogic.gdx.math.MathUtils.cosDeg(r12)
            float r11 = r11 * r5
            float r14 = r14 + r11
            float r11 = r16.getY()
            float r11 = r11 + r21
            float r11 = r11 + r6
            float r9 = r9.getY()
            float r9 = r9 * r24
            float r11 = r11 + r9
            float r11 = r11 + r13
            float r9 = com.badlogic.gdx.math.MathUtils.sinDeg(r12)
            float r9 = r9 * r5
            float r11 = r11 + r9
            r9 = 1
            if (r8 == r9) goto L8d
            int r9 = r7 + (-1)
            if (r8 != r9) goto L89
            goto L8d
        L89:
            r2.setColor(r4, r4, r4, r4)
            goto L93
        L8d:
            r9 = 1050924810(0x3ea3d70a, float:0.32)
            r2.setColor(r4, r9, r9, r4)
        L93:
            r9 = 1090519040(0x41000000, float:8.0)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r9
            float r11 = r11 + r12
            r9 = r19
            r2.draw(r9, r10, r14, r11)
        L9f:
            int r8 = r8 + 1
            goto L2a
        La2:
            r2.setColor(r4, r4, r4, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void drawLimbs(org.fortheloss.sticknodes.SNShapeRenderer r92, com.badlogic.gdx.graphics.g2d.Batch r93, org.fortheloss.sticknodes.animationscreen.FilterBundle r94, float r95, float r96, float r97, float r98, float r99, boolean r100, org.fortheloss.sticknodes.stickfigure.INode r101, boolean r102, boolean r103) {
            r91 = this;
            r9 = r91
            r10 = r92
            r11 = r94
            boolean r0 = r9._doNotDraw
            if (r0 == 0) goto Lb
            return
        Lb:
            r13 = 1
            if (r103 == 0) goto L18
            int r0 = r9.getNodeCount(r13)
            r1 = 10
            if (r0 >= r1) goto L18
            r14 = 0
            goto L1a
        L18:
            r14 = r103
        L1a:
            r91.validateDirtyNodes()
            float r0 = r91.getX()
            float r0 = r0 - r97
            r15 = 1065353216(0x3f800000, float:1.0)
            float r1 = r99 - r15
            float r0 = r0 * r1
            float r2 = r91.getY()
            float r2 = r2 - r98
            float r2 = r2 * r1
            if (r11 == 0) goto L38
            float r3 = r94.getUVScale()
            goto L39
        L38:
            r3 = 0
        L39:
            float r4 = r9._transparency
            float r5 = r9._saturation
            int r6 = r9._pixelation
            float r7 = r9._hueShift
            boolean r12 = r9._colorIsInverted
            float r13 = r9._tintAmount
            com.badlogic.gdx.graphics.Color r15 = r9._tintColor
            float r8 = r9._blur
            r98 = r4
            boolean r4 = r9._isMotionBlur
            r16 = r4
            boolean r4 = r9._motionBlurIsOneDirection
            r17 = r4
            int r4 = r9._motionBlurAngle
            r18 = r4
            float r4 = r9._glow
            r19 = r4
            float r4 = r9._glowIntensity
            r20 = r4
            com.badlogic.gdx.graphics.Color r4 = r9._glowColor
            r21 = r4
            com.badlogic.gdx.graphics.Color r4 = r9._outlineColor
            r22 = r4
            float r4 = r9._outlineAlpha
            r23 = r4
            float r4 = r9._outlineThickness
            r24 = r4
            com.badlogic.gdx.graphics.Color r4 = r9._dsColor
            r25 = r4
            float r4 = r9._dsAlpha
            r26 = r4
            int r4 = r9._dsDistance
            float r4 = (float) r4
            float r27 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r27
            int r4 = java.lang.Math.round(r4)
            r27 = r4
            int r4 = r9._dsAngle
            r28 = r4
            float r4 = r9._dsBlur
            r29 = r5
            float r5 = r9._blur
            r30 = 1098907648(0x41800000, float:16.0)
            float r31 = r5 * r30
            float r31 = r31 + r30
            float r32 = org.fortheloss.sticknodes.App.assetScaling
            float r31 = r31 * r32
            r33 = r5
            float r5 = r9._glow
            float r5 = r5 * r30
            float r5 = r5 + r30
            float r5 = r5 * r32
            float r34 = r4 * r30
            float r34 = r34 + r30
            float r34 = r34 * r32
            r32 = r4
            if (r11 == 0) goto Lce
            int r4 = r11.renderWidth
            r35 = r4
            int r4 = r11.renderHeight
            float r36 = r94.getFboScaleX()
            float r37 = r94.getFboScaleY()
            r88 = r12
            r12 = r4
            r4 = r35
            r35 = r88
            r89 = r36
            r36 = r13
            r13 = r89
            r90 = r37
            r37 = r15
            r15 = r90
            goto Lda
        Lce:
            r35 = r12
            r36 = r13
            r37 = r15
            r4 = 0
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
        Lda:
            float r38 = r91.getX()
            float r38 = r38 + r95
            float r38 = r38 + r0
            float r39 = r91.getY()
            float r39 = r39 + r96
            float r39 = r39 + r2
            r40 = 1056964608(0x3f000000, float:0.5)
            r41 = r12
            java.lang.String r12 = "u_texHeight"
            r42 = r12
            java.lang.String r12 = "u_texWidth"
            r43 = r12
            java.lang.String r12 = "u_blockSize"
            r44 = r12
            java.lang.String r12 = "u_steps"
            r45 = r12
            java.lang.String r12 = "u_normalizedOutlineThickness"
            r46 = r12
            r47 = 1000593162(0x3ba3d70a, float:0.005)
            r48 = 0
            int r49 = (r3 > r48 ? 1 : (r3 == r48 ? 0 : -1))
            if (r49 <= 0) goto L6dc
            boolean r48 = r91.isJoined()
            if (r48 == 0) goto L122
            boolean r12 = r9._isUsingJoinParentFilters
            if (r12 == 0) goto L122
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = r91.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = r12.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = r12.getStickfigureToReferForFilters()
            goto L123
        L122:
            r12 = 0
        L123:
            if (r12 == 0) goto L1ca
            float r5 = r12.getTransparency()
            float r6 = r12.getSaturation()
            float r7 = r12.getHueShift()
            boolean r8 = r12.getIsInvertedColor()
            float r16 = r12.getTintAmount()
            com.badlogic.gdx.graphics.Color r17 = r12.getTintColor()
            float r18 = r12.getBlur()
            boolean r19 = r12.isMotionBlur()
            boolean r20 = r12.getMotionBlurIsOneDirection()
            int r21 = r12.getMotionBlurAngle()
            float r22 = r12.getGlow()
            float r23 = r12.getGlowIntensity()
            com.badlogic.gdx.graphics.Color r24 = r12.getGlowColor()
            com.badlogic.gdx.graphics.Color r25 = r12.getOutlineColor()
            float r26 = r12.getOutlineAlpha()
            float r27 = r12.getOutlineThickness()
            com.badlogic.gdx.graphics.Color r28 = r12.getDsColor()
            float r29 = r12.getDsAlpha()
            r49 = r4
            int r4 = r12.getDsDistance()
            float r4 = (float) r4
            float r31 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r31
            int r4 = java.lang.Math.round(r4)
            int r31 = r12.getDsAngle()
            float r32 = r12.getDsBlur()
            int r12 = r12.getPixelation()
            float r33 = r18 * r30
            float r33 = r33 + r30
            float r34 = org.fortheloss.sticknodes.App.assetScaling
            float r33 = r33 * r34
            float r35 = r22 * r30
            float r35 = r35 + r30
            float r35 = r35 * r34
            float r36 = r32 * r30
            float r36 = r36 + r30
            float r34 = r34 * r36
            r36 = r8
            r9 = r12
            r37 = r16
            r50 = r17
            r16 = r19
            r17 = r20
            r19 = r22
            r8 = r25
            r51 = r33
            r52 = r34
            r22 = 0
            r12 = r5
            r34 = r7
            r20 = r18
            r33 = r20
            r5 = r21
            r7 = r31
            r21 = r33
            r18 = r23
            r31 = r28
            r28 = r6
            r6 = r4
            r4 = r27
            r27 = r24
            goto L1f9
        L1ca:
            r49 = r4
            r12 = r98
            r9 = r6
            r4 = r24
            r6 = r27
            r51 = r31
            r52 = r34
            r50 = r37
            r34 = r7
            r27 = r21
            r31 = r25
            r7 = r28
            r28 = r29
            r37 = r36
            r21 = r8
            r8 = r22
            r29 = r26
            r36 = r35
            r22 = 0
            r35 = r5
            r5 = r18
            r18 = r20
            r26 = r23
            r20 = r33
        L1f9:
            int r23 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r23 > 0) goto L1fe
            return
        L1fe:
            float r23 = org.fortheloss.sticknodes.App.assetScaling
            float r53 = r4 * r23
            int r4 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r4 <= 0) goto L208
            r4 = 1
            goto L209
        L208:
            r4 = 0
        L209:
            int r23 = (r34 > r22 ? 1 : (r34 == r22 ? 0 : -1))
            if (r23 <= 0) goto L216
            r23 = 1065353216(0x3f800000, float:1.0)
            int r24 = (r34 > r23 ? 1 : (r34 == r23 ? 0 : -1))
            if (r24 >= 0) goto L216
            r54 = 1
            goto L218
        L216:
            r54 = 0
        L218:
            int r23 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r23 <= 0) goto L223
            int r23 = (r53 > r22 ? 1 : (r53 == r22 ? 0 : -1))
            if (r23 <= 0) goto L223
            r55 = 1
            goto L225
        L223:
            r55 = 0
        L225:
            if (r55 == 0) goto L24d
            r22 = 1090519040(0x41000000, float:8.0)
            float r22 = r22 * r53
            r23 = 1106247680(0x41f00000, float:30.0)
            float r22 = r22 / r23
            float r22 = r22 + r30
            r23 = 1073741824(0x40000000, float:2.0)
            float r23 = r23 * r3
            float r22 = r22 * r23
            r23 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 / r23
            r23 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r23
            r25 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r3
            float r1 = java.lang.Math.max(r3, r1)
            float r1 = r1 * r22
            int r1 = (int) r1
            r3 = r1
            goto L250
        L24d:
            r25 = r3
            r3 = 0
        L250:
            boolean r1 = r94.getBlurEnabled()
            if (r1 != 0) goto L259
            r30 = 0
            goto L25b
        L259:
            r30 = r4
        L25b:
            boolean r1 = r94.getGlowEnabled()
            if (r1 != 0) goto L263
            r19 = 0
        L263:
            if (r30 == 0) goto L292
            if (r16 == 0) goto L292
            float r1 = (float) r5
            boolean r4 = r94.isUsingRotatedTransformationMatrix()
            if (r4 != 0) goto L277
            float r4 = r94.getExtraRotation()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L281
        L277:
            float r4 = r94.getTransformationRotationDeg()
            float r5 = r94.getExtraRotation()
            float r4 = r4 + r5
            float r1 = r1 + r4
        L281:
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r4 = r4 * r21
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r21
            r56 = r1
            r33 = r4
            goto L294
        L292:
            r56 = r20
        L294:
            if (r30 == 0) goto L29e
            float r1 = r94.getUVScaleBlur()
            r57 = r1
            r1 = 0
            goto L2ac
        L29e:
            r1 = 0
            int r4 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r4 <= 0) goto L2aa
            float r4 = r94.getUVScaleGlow()
            r57 = r4
            goto L2ac
        L2aa:
            r57 = r25
        L2ac:
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 < 0) goto L2ce
            if (r30 != 0) goto L2ce
            if (r54 != 0) goto L2ce
            int r5 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r5 != 0) goto L2ce
            int r4 = (r37 > r1 ? 1 : (r37 == r1 ? 0 : -1))
            if (r4 > 0) goto L2ce
            if (r36 != 0) goto L2ce
            int r4 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r4 > 0) goto L2ce
            r1 = 1
            if (r9 > r1) goto L2ce
            if (r55 == 0) goto L2ca
            goto L2ce
        L2ca:
            r1 = 0
            r58 = 0
            goto L2d1
        L2ce:
            r1 = 0
            r58 = 1
        L2d1:
            int r4 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r4 <= 0) goto L634
            int r4 = (r32 > r1 ? 1 : (r32 == r1 ? 0 : -1))
            if (r4 <= 0) goto L2e0
            float r1 = r94.getUVScaleBlur()
            r59 = r1
            goto L2e2
        L2e0:
            r59 = r57
        L2e2:
            r92.end()
            boolean r1 = r94.isUsingRotatedTransformationMatrix()
            if (r1 == 0) goto L301
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getTransformMatrix()
            r11.rememberTransformationMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r4 = r1.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r4 = r4.idt()
            r1.setTransformMatrix(r4)
        L301:
            r94.popAndRememberScissors()
            r1 = 1
            if (r9 > r1) goto L30e
            if (r55 == 0) goto L30a
            goto L30e
        L30a:
            r94.beginFBO1()
            goto L311
        L30e:
            r94.beginFBO3()
        L311:
            com.badlogic.gdx.math.Matrix4 r1 = r92.getProjectionMatrix()
            r11.rememberProjectionMatrix(r1)
            com.badlogic.gdx.utils.viewport.Viewport r1 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r10.setProjectionMatrix(r1)
            com.badlogic.gdx.math.Matrix4 r1 = r92.getProjectionMatrix()
            float r4 = r11.renderX
            float r4 = -r4
            float r4 = r4 * r13
            float r4 = r4 * r59
            float r5 = r11.renderY
            float r5 = -r5
            float r5 = r5 * r15
            float r5 = r5 * r59
            r98 = r8
            r8 = 0
            com.badlogic.gdx.math.Matrix4 r1 = r1.translate(r4, r5, r8)
            float r4 = r13 * r59
            float r5 = r15 * r59
            r8 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r1 = r1.scale(r4, r5, r8)
            r10.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r8 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r10.begin(r8)
            int r7 = r7 + 180
            float r1 = (float) r7
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r5 = (float) r6
            float r4 = r4 * r5
            float r4 = r4 * r99
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r5
            float r1 = r1 * r99
            float r5 = r91.getX()
            float r5 = r5 + r95
            float r5 = r5 + r0
            float r5 = r5 + r4
            float r0 = r91.getY()
            float r0 = r0 + r96
            float r0 = r0 + r2
            float r0 = r0 + r1
            if (r58 == 0) goto L3e1
            r1 = 1
            if (r9 <= r1) goto L3e1
            float r2 = (float) r9
            float r2 = r2 * r59
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r4
            float r2 = r2 * r99
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r2, r1)
            float r1 = (float) r2
            float r2 = r5 * r59
            float r4 = r0 * r59
            com.badlogic.gdx.math.Matrix4 r6 = r92.getTransformMatrix()
            com.badlogic.gdx.math.Vector3 r2 = r11.transformPoint(r2, r4, r6)
            float r4 = r2.x
            float r4 = r4 / r1
            double r6 = (double) r4
            double r6 = java.lang.Math.floor(r6)
            r20 = r3
            double r3 = (double) r1
            double r6 = r6 * r3
            r21 = r8
            float r8 = r2.x
            r61 = r12
            r60 = r13
            double r12 = (double) r8
            double r6 = r6 - r12
            float r6 = (float) r6
            float r7 = r2.y
            float r7 = r7 / r1
            double r7 = (double) r7
            double r7 = java.lang.Math.floor(r7)
            double r7 = r7 * r3
            float r2 = r2.y
            double r2 = (double) r2
            double r7 = r7 - r2
            float r2 = (float) r7
            boolean r3 = r94.isUsingRotatedTransformationMatrix()
            if (r3 == 0) goto L3d5
            com.badlogic.gdx.math.Matrix4 r3 = r92.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r3 = r11.getInvertedUntranslatedMatrix(r3)
            com.badlogic.gdx.math.Vector3 r3 = r11.transformPoint(r6, r2, r3)
            float r4 = r3.x
            float r4 = r4 / r59
            float r5 = r5 + r4
            float r3 = r3.y
            float r3 = r3 / r59
            goto L3da
        L3d5:
            float r3 = r6 / r59
            float r5 = r5 + r3
            float r3 = r2 / r59
        L3da:
            float r0 = r0 + r3
            r3 = r0
            r12 = r1
            r8 = r2
            r2 = r5
            r13 = r6
            goto L3ee
        L3e1:
            r20 = r3
            r21 = r8
            r61 = r12
            r60 = r13
            r3 = r0
            r2 = r5
            r8 = 0
            r12 = 0
            r13 = 0
        L3ee:
            r0 = r91
            r1 = r92
            r7 = r20
            r6 = r49
            r4 = r99
            r5 = r100
            r49 = r13
            r13 = r6
            r6 = r14
            r62 = r14
            r14 = r7
            r7 = r102
            r65 = r98
            r95 = r14
            r64 = r21
            r14 = r8
            r8 = r101
            r0.renderStickfigure(r1, r2, r3, r4, r5, r6, r7, r8)
            r92.end()
            com.badlogic.gdx.math.Matrix4 r0 = r11.rememberedProjectionMatrix
            r10.setProjectionMatrix(r0)
            if (r102 == 0) goto L422
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.glBlendFuncSeparate(r1, r2, r1, r2)
        L422:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r11.fbo3
            r1 = 1
            if (r9 <= r1) goto L4dd
            r2 = 0
            r11.endFBO(r2)
            if (r55 == 0) goto L433
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r11.fbo2
            r94.beginFBO2()
            goto L436
        L433:
            r94.beginFBO1()
        L436:
            com.badlogic.gdx.graphics.g2d.Batch r2 = r11.batch
            r3 = 771(0x303, float:1.08E-42)
            r2.setBlendFunction(r1, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r11.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r8 = r60
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r8, r15, r3)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.pixelateShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.pixelateShader
            int r2 = (int) r12
            float r2 = (float) r2
            r7 = r44
            r1.setUniformf(r7, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.pixelateShader
            int r4 = r13 + (-1)
            float r2 = (float) r4
            r6 = r43
            r1.setUniformf(r6, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.pixelateShader
            int r2 = r41 + (-1)
            float r2 = (float) r2
            r5 = r42
            r1.setUniformf(r5, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo3
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r67 = r2
            com.badlogic.gdx.graphics.Texture r67 = (com.badlogic.gdx.graphics.Texture) r67
            r4 = r49
            float r2 = -r4
            float r3 = r12 * r40
            float r68 = r2 - r3
            float r2 = -r14
            float r69 = r2 - r3
            float r2 = (float) r13
            r96 = r0
            r3 = r41
            float r0 = (float) r3
            r72 = 0
            r73 = 0
            r74 = 1065353216(0x3f800000, float:1.0)
            r75 = 1065353216(0x3f800000, float:1.0)
            r66 = r1
            r70 = r2
            r71 = r0
            r66.draw(r67, r68, r69, r70, r71, r72, r73, r74, r75)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 0
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r11.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            r0 = r96
            goto L4eb
        L4dd:
            r3 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r4 = r49
            r8 = r60
            r2 = 771(0x303, float:1.08E-42)
        L4eb:
            if (r55 == 0) goto L5af
            r1 = 0
            r11.endFBO(r1)
            r94.beginFBO1()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r49 = r4
            r4 = 1
            r1.setBlendFunction(r4, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r11.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r8, r15, r4)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.outlineShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.outlineShader
            r4 = r65
            float r2 = r4.r
            r42 = r5
            float r5 = r4.g
            r43 = r6
            float r6 = r4.b
            java.lang.String r21 = "u_outlineRGB"
            r20 = r1
            r22 = r2
            r23 = r5
            r24 = r6
            r25 = r26
            r20.setUniformf(r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.outlineShader
            float r2 = (float) r13
            float r5 = r53 / r2
            float r5 = r5 * r99
            float r5 = r5 * r57
            float r6 = (float) r3
            float r20 = r53 / r6
            float r20 = r20 * r99
            r41 = r3
            float r3 = r20 * r57
            r20 = r9
            r9 = r46
            r1.setUniformf(r9, r5, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.outlineShader
            r5 = r95
            float r3 = (float) r5
            r21 = r12
            r12 = r45
            r1.setUniformf(r12, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r66 = r0
            com.badlogic.gdx.graphics.Texture r66 = (com.badlogic.gdx.graphics.Texture) r66
            r67 = 0
            r68 = 0
            r71 = 0
            r72 = 0
            r73 = 1065353216(0x3f800000, float:1.0)
            r74 = 1065353216(0x3f800000, float:1.0)
            r65 = r1
            r69 = r2
            r70 = r6
            r65.draw(r66, r67, r68, r69, r70, r71, r72, r73, r74)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 0
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r11.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            goto L5c3
        L5af:
            r41 = r3
            r49 = r4
            r42 = r5
            r43 = r6
            r20 = r9
            r21 = r12
            r12 = r45
            r9 = r46
            r4 = r65
            r5 = r95
        L5c3:
            float r0 = java.lang.Math.abs(r33)
            float r0 = r0 * r51
            float r32 = r32 * r52
            float r0 = r0 + r32
            float r0 = r0 * r99
            float r0 = r0 * r59
            float r1 = java.lang.Math.abs(r56)
            float r1 = r1 * r51
            float r1 = r1 + r32
            float r1 = r1 * r99
            float r1 = r1 * r59
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r6 = (float) r0
            float r22 = r29 * r61
            r0 = r91
            r1 = r94
            r2 = r13
            r32 = r41
            r3 = r32
            r25 = r4
            r23 = r49
            r4 = r59
            r24 = r5
            r29 = r14
            r14 = r42
            r5 = r22
            r22 = r6
            r45 = r12
            r12 = r43
            r6 = r31
            r46 = r9
            r9 = r7
            r7 = r22
            r14 = r8
            r8 = r22
            r0.renderDropShadow(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r64
            r10.begin(r0)
            boolean r0 = r94.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L626
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r11.rememberedTransformationMatrix
            r0.setTransformMatrix(r1)
        L626:
            r8 = r91
            r6 = r20
            float r0 = r8._dsAlpha
            int r0 = (r0 > r47 ? 1 : (r0 == r47 ? 0 : -1))
            r4 = 0
            if (r0 >= 0) goto L64f
            r8._dsAlpha = r4
            goto L64f
        L634:
            r4 = 0
            r24 = r3
            r25 = r8
            r6 = r9
            r61 = r12
            r62 = r14
            r32 = r41
            r12 = r43
            r9 = r44
            r8 = r91
            r14 = r13
            r13 = r49
            r21 = 0
            r23 = 0
            r29 = 0
        L64f:
            if (r58 == 0) goto L6ba
            r92.end()
            boolean r0 = r94.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto L670
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            r11.rememberTransformationMatrix(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r1 = r1.idt()
            r0.setTransformMatrix(r1)
        L670:
            r94.popAndRememberScissors()
            r0 = 1
            if (r6 > r0) goto L67d
            if (r55 == 0) goto L679
            goto L67d
        L679:
            r94.beginFBO1()
            goto L680
        L67d:
            r94.beginFBO3()
        L680:
            com.badlogic.gdx.math.Matrix4 r0 = r92.getProjectionMatrix()
            r11.rememberProjectionMatrix(r0)
            com.badlogic.gdx.utils.viewport.Viewport r0 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            com.badlogic.gdx.math.Matrix4 r0 = r0.combined
            r10.setProjectionMatrix(r0)
            com.badlogic.gdx.math.Matrix4 r0 = r92.getProjectionMatrix()
            float r1 = r11.renderX
            float r1 = -r1
            float r1 = r1 * r14
            float r1 = r1 * r57
            float r2 = r11.renderY
            float r2 = -r2
            float r2 = r2 * r15
            float r2 = r2 * r57
            com.badlogic.gdx.math.Matrix4 r0 = r0.translate(r1, r2, r4)
            float r1 = r14 * r57
            float r2 = r15 * r57
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r0 = r0.scale(r1, r2, r3)
            r10.setProjectionMatrix(r0)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r10.begin(r0)
        L6ba:
            r0 = r6
            r5 = r18
            r22 = r19
            r7 = r24
            r6 = r25
            r3 = r27
            r1 = r28
            r76 = r34
            r77 = r37
            r78 = r50
            r31 = r51
            r2 = r61
            r27 = r17
            r88 = r26
            r26 = r16
            r16 = r21
            r21 = r88
            goto L71c
        L6dc:
            r25 = r3
            r8 = r9
            r62 = r14
            r32 = r41
            r12 = r43
            r9 = r44
            r14 = r13
            r13 = r4
            r4 = 0
            r2 = r98
            r0 = r6
            r76 = r7
            r26 = r16
            r27 = r17
            r3 = r21
            r6 = r22
            r21 = r23
            r53 = r24
            r57 = r25
            r1 = r29
            r56 = r33
            r77 = r36
            r78 = r37
            r7 = 0
            r16 = 0
            r23 = 0
            r29 = 0
            r30 = 0
            r54 = 0
            r55 = 0
            r58 = 0
            r22 = r19
            r36 = r35
            r35 = r5
            r5 = r20
        L71c:
            if (r58 == 0) goto L795
            r4 = 1
            if (r0 <= r4) goto L795
            float r4 = (float) r0
            float r4 = r4 * r57
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r16
            float r4 = r4 * r99
            int r4 = (int) r4
            r17 = r0
            r0 = 1
            int r4 = java.lang.Math.max(r4, r0)
            float r0 = (float) r4
            float r4 = r38 * r57
            r95 = r1
            float r1 = r39 * r57
            r96 = r2
            com.badlogic.gdx.math.Matrix4 r2 = r92.getTransformMatrix()
            com.badlogic.gdx.math.Vector3 r1 = r11.transformPoint(r4, r1, r2)
            float r2 = r1.x
            float r2 = r2 / r0
            r97 = r3
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            r98 = r5
            double r4 = (double) r0
            double r2 = r2 * r4
            r18 = r6
            float r6 = r1.x
            r19 = r7
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
            boolean r3 = r94.isUsingRotatedTransformationMatrix()
            if (r3 == 0) goto L787
            com.badlogic.gdx.math.Matrix4 r3 = r92.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r3 = r11.getInvertedUntranslatedMatrix(r3)
            com.badlogic.gdx.math.Vector3 r3 = r11.transformPoint(r2, r1, r3)
            float r4 = r3.x
            float r4 = r4 / r57
            float r38 = r38 + r4
            float r3 = r3.y
            float r3 = r3 / r57
            goto L78d
        L787:
            float r3 = r2 / r57
            float r38 = r38 + r3
            float r3 = r1 / r57
        L78d:
            float r39 = r39 + r3
            r7 = r0
            r5 = r1
            r6 = r2
            r4 = r17
            goto L7ab
        L795:
            r17 = r0
            r95 = r1
            r96 = r2
            r97 = r3
            r98 = r5
            r18 = r6
            r19 = r7
            r7 = r16
            r4 = r17
            r6 = r23
            r5 = r29
        L7ab:
            r2 = r38
            r3 = r39
            r0 = r91
            r79 = r95
            r1 = r92
            r80 = r96
            r81 = r97
            r43 = r12
            r12 = r4
            r4 = r99
            r83 = r98
            r82 = r5
            r5 = r100
            r84 = r6
            r85 = r18
            r6 = r62
            r49 = r13
            r86 = r19
            r13 = r7
            r7 = r102
            r8 = r101
            r0.renderStickfigure(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r58 == 0) goto Lfda
            r92.end()
            com.badlogic.gdx.math.Matrix4 r0 = r11.rememberedProjectionMatrix
            r10.setProjectionMatrix(r0)
            if (r102 == 0) goto L7eb
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.glBlendFuncSeparate(r1, r2, r1, r2)
        L7eb:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r11.fbo3
            r1 = 1
            if (r12 <= r1) goto L8a2
            r2 = 0
            r11.endFBO(r2)
            if (r55 == 0) goto L7fc
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r11.fbo2
            r94.beginFBO2()
            goto L7ff
        L7fc:
            r94.beginFBO1()
        L7ff:
            com.badlogic.gdx.graphics.g2d.Batch r2 = r11.batch
            r3 = 771(0x303, float:1.08E-42)
            r2.setBlendFunction(r1, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r11.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r14, r15, r3)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.pixelateShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.pixelateShader
            int r2 = (int) r13
            float r2 = (float) r2
            r1.setUniformf(r9, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.pixelateShader
            int r4 = r49 + (-1)
            float r2 = (float) r4
            r3 = r43
            r1.setUniformf(r3, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.pixelateShader
            r8 = r32
            int r2 = r8 + (-1)
            float r2 = (float) r2
            r3 = r42
            r1.setUniformf(r3, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo3
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r59 = r2
            com.badlogic.gdx.graphics.Texture r59 = (com.badlogic.gdx.graphics.Texture) r59
            r2 = r84
            float r2 = -r2
            float r7 = r13 * r40
            float r60 = r2 - r7
            r2 = r82
            float r2 = -r2
            float r61 = r2 - r7
            r9 = r49
            float r2 = (float) r9
            float r3 = (float) r8
            r64 = 0
            r65 = 0
            r66 = 1065353216(0x3f800000, float:1.0)
            r67 = 1065353216(0x3f800000, float:1.0)
            r58 = r1
            r62 = r2
            r63 = r3
            r58.draw(r59, r60, r61, r62, r63, r64, r65, r66, r67)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 0
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 770(0x302, float:1.079E-42)
            r3 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r2, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r11.rememberedProjectionMatrix
            r1.setProjectionMatrix(r2)
            goto L8a8
        L8a2:
            r8 = r32
            r9 = r49
            r3 = 771(0x303, float:1.08E-42)
        L8a8:
            if (r55 == 0) goto L95d
            r1 = 0
            r11.endFBO(r1)
            r94.beginFBO1()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 1
            r1.setBlendFunction(r2, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r11.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r14, r15, r3)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.outlineShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.outlineShader
            r2 = r85
            float r3 = r2.r
            float r4 = r2.g
            float r2 = r2.b
            java.lang.String r17 = "u_outlineRGB"
            r16 = r1
            r18 = r3
            r19 = r4
            r20 = r2
            r16.setUniformf(r17, r18, r19, r20, r21)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.outlineShader
            float r2 = (float) r9
            float r3 = r53 / r2
            float r3 = r3 * r99
            float r3 = r3 * r57
            float r4 = (float) r8
            float r53 = r53 / r4
            float r53 = r53 * r99
            float r5 = r53 * r57
            r6 = r46
            r1.setUniformf(r6, r3, r5)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.outlineShader
            r3 = r86
            float r3 = (float) r3
            r5 = r45
            r1.setUniformf(r5, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r59 = r0
            com.badlogic.gdx.graphics.Texture r59 = (com.badlogic.gdx.graphics.Texture) r59
            r60 = 0
            r61 = 0
            r64 = 0
            r65 = 0
            r66 = 1065353216(0x3f800000, float:1.0)
            r67 = 1065353216(0x3f800000, float:1.0)
            r58 = r1
            r62 = r2
            r63 = r4
            r58.draw(r59, r60, r61, r62, r63, r64, r65, r66, r67)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 0
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r11.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
        L95d:
            java.lang.String r13 = "u_texelSize"
            java.lang.String r7 = "u_blurPixels"
            r6 = 0
            int r0 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lbb2
            float r22 = r22 * r35
            float r22 = r22 * r99
            float r3 = r22 * r57
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto L974
            r0 = 1063675494(0x3f666666, float:0.9)
            goto L976
        L974:
            r0 = 1065353216(0x3f800000, float:1.0)
        L976:
            r1 = 0
            r11.endFBO(r1)
            r94.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 771(0x303, float:1.08E-42)
            r4 = 1
            r1.setBlendFunction(r4, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r11.rememberProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r2 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r1.getProjectionMatrix()
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r2.scale(r14, r15, r4)
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.hGlowShader
            r1.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.hGlowShader
            r2 = r81
            float r4 = r2.r
            float r5 = r2.g
            float r6 = r2.b
            java.lang.String r10 = "u_glowRGB"
            r1.setUniformf(r10, r4, r5, r6)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.hGlowShader
            float r0 = r0 * r3
            r1.setUniformf(r7, r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.hGlowShader
            float r10 = (float) r9
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r4 / r10
            r1.setUniformf(r13, r5)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.hGlowShader
            java.lang.String r4 = "u_glowIntensity"
            r5 = r83
            r1.setUniformf(r4, r5)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r11.fbo1
            com.badlogic.gdx.graphics.GLTexture r4 = r4.getColorBufferTexture()
            r17 = r4
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            r18 = 0
            r19 = 0
            float r20 = r10 * r57
            float r6 = (float) r8
            float r21 = r6 * r57
            r22 = 0
            r23 = 0
            r16 = r1
            r24 = r57
            r25 = r57
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.end()
            if (r30 != 0) goto La43
            if (r54 != 0) goto La43
            r4 = r79
            r1 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r16 != 0) goto La3e
            r1 = r77
            r28 = 0
            int r16 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r16 > 0) goto La37
            if (r36 != 0) goto La37
            r60 = r14
            r14 = r80
            r16 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r95 = r1
            if (r17 < 0) goto La4d
            r1 = 1
            if (r12 > r1) goto La4d
            if (r55 == 0) goto La33
            goto La4d
        La33:
            r79 = r4
            r1 = 0
            goto La50
        La37:
            r95 = r1
            r60 = r14
            r14 = r80
            goto La4d
        La3e:
            r60 = r14
            r95 = r77
            goto La49
        La43:
            r60 = r14
            r95 = r77
            r4 = r79
        La49:
            r14 = r80
            r28 = 0
        La4d:
            r79 = r4
            r1 = 1
        La50:
            float r4 = r11.renderX
            r16 = r4
            float r4 = r11.renderY
            if (r1 != 0) goto La74
            boolean r17 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r17 == 0) goto La5d
            goto La74
        La5d:
            r17 = r4
            r4 = 1
            r11.endFBO(r4)
            r94.restoreScissors()
            com.badlogic.gdx.graphics.g2d.Batch r4 = r11.batch
            r29 = r12
            com.badlogic.gdx.math.Matrix4 r12 = r11.rememberedProjectionMatrix
            r4.setProjectionMatrix(r12)
            r18 = r16
            r19 = r17
            goto La81
        La74:
            r29 = r12
            r4 = 0
            r11.endFBO(r4)
            r94.beginFBO3()
            r18 = 0
            r19 = 0
        La81:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r11.vGlowShader
            com.badlogic.gdx.graphics.g2d.Batch r12 = r11.batch
            r12.setShader(r4)
            com.badlogic.gdx.graphics.g2d.Batch r12 = r11.batch
            r12.begin()
            com.badlogic.gdx.graphics.g2d.Batch r12 = r11.batch
            r80 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            r12.setColor(r14, r14, r14, r14)
            float r12 = r2.r
            float r14 = r2.g
            float r2 = r2.b
            r97 = r15
            java.lang.String r15 = "u_glowRGB"
            r4.setUniformf(r15, r12, r14, r2)
            r4.setUniformf(r7, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r15 = r0 / r6
            r4.setUniformf(r13, r15)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.hGlowShader
            java.lang.String r2 = "u_glowIntensity"
            r0.setUniformf(r2, r5)
            if (r1 != 0) goto Lad9
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Labb
            goto Lad9
        Labb:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo2
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r17 = r2
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            r22 = 0
            r23 = 0
            r16 = r0
            r20 = r10
            r21 = r6
            r24 = r57
            r25 = r57
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto Laf6
        Lad9:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo2
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r17 = r2
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 1065353216(0x3f800000, float:1.0)
            r16 = r0
            r20 = r10
            r21 = r6
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        Laf6:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r2 = 0
            r0.setShader(r2)
            if (r1 == 0) goto Lb59
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Lb21
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo3
            r12 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r0 = r91
            r15 = r95
            r1 = r94
            r5 = r79
            r4 = r9
            r87 = r5
            r5 = r8
            r21 = r6
            r6 = r12
            r12 = r7
            r7 = r14
            r0.applyGaussian(r1, r2, r3, r4, r5, r6, r7)
            goto Lb28
        Lb21:
            r15 = r95
            r21 = r6
            r12 = r7
            r87 = r79
        Lb28:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.begin()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r11.fbo1
            com.badlogic.gdx.graphics.GLTexture r1 = r1.getColorBufferTexture()
            r17 = r1
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 1065353216(0x3f800000, float:1.0)
            r16 = r0
            r20 = r10
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r11.rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            goto Lba7
        Lb59:
            r15 = r95
            r21 = r6
            r12 = r7
            r87 = r79
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Lb7a
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo3
            r7 = 1
            r0 = r91
            r1 = r94
            r4 = r9
            r5 = r8
            r6 = r57
            r0.applyGaussian(r1, r2, r3, r4, r5, r6, r7)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 771(0x303, float:1.08E-42)
            r2 = 1
            r0.setBlendFunction(r2, r1)
        Lb7a:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.begin()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r11.fbo1
            com.badlogic.gdx.graphics.GLTexture r1 = r1.getColorBufferTexture()
            r17 = r1
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            float r1 = r11.renderX
            float r2 = r11.renderY
            r22 = 0
            r23 = 0
            r16 = r0
            r18 = r1
            r19 = r2
            r20 = r10
            r24 = r57
            r25 = r57
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
        Lba7:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            r0 = 1
            goto Lbbe
        Lbb2:
            r29 = r12
            r60 = r14
            r97 = r15
            r15 = r77
            r87 = r79
            r12 = r7
            r0 = 0
        Lbbe:
            java.lang.String r1 = "u_hueAdjust"
            java.lang.String r2 = "u_willInvert"
            java.lang.String r3 = "u_saturation"
            java.lang.String r4 = "u_tintAmount"
            java.lang.String r5 = "u_tintRGB"
            if (r30 == 0) goto Le80
            float r6 = (float) r9
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = r7 / r6
            float r14 = (float) r8
            r41 = r8
            float r8 = r7 / r14
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r11.fbo1
            if (r0 == 0) goto Lbda
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r11.fbo3
        Lbda:
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto Lbe4
            r0 = 1063675494(0x3f666666, float:0.9)
            r28 = r57
            goto Lbe8
        Lbe4:
            r0 = 1065353216(0x3f800000, float:1.0)
            r28 = 1065353216(0x3f800000, float:1.0)
        Lbe8:
            if (r26 != 0) goto Ld26
            float r33 = r33 * r31
            float r33 = r33 * r99
            float r33 = r33 * r57
            r49 = r9
            float r9 = r33 * r0
            r95 = r0
            r0 = 0
            r11.endFBO(r0)
            r94.beginFBO2()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r98 = r1
            r96 = r8
            r1 = 1
            r8 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r8)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getProjectionMatrix()
            r11.rememberProjectionMatrix(r0)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r1 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r0.setProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r0.getProjectionMatrix()
            r100 = r3
            r8 = r60
            r3 = 1065353216(0x3f800000, float:1.0)
            r88 = r2
            r2 = r97
            r97 = r88
            com.badlogic.gdx.math.Matrix4 r1 = r1.scale(r8, r2, r3)
            r0.setProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.hBlurShader
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.begin()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.hBlurShader
            r0.setUniformf(r12, r9)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.hBlurShader
            r0.setUniformf(r13, r10)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r7.getColorBufferTexture()
            r17 = r1
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            r18 = 0
            r19 = 0
            float r20 = r6 * r57
            float r21 = r14 * r57
            r22 = 0
            r23 = 0
            r16 = r0
            r24 = r57
            r25 = r57
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r11.fbo2
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 != 0) goto Lc95
            r0 = 1
            r11.endFBO(r0)
            r94.restoreScissors()
            float r8 = r11.renderX
            float r0 = r11.renderY
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.math.Matrix4 r2 = r11.rememberedProjectionMatrix
            r1.setProjectionMatrix(r2)
            r3 = r87
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            goto Lca5
        Lc95:
            r0 = 0
            r11.endFBO(r0)
            r94.beginFBO3()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r11.fbo3
            r1 = r0
            r3 = r87
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
        Lca5:
            int r10 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r2 = 0
            if (r10 != 0) goto Lcd3
            int r10 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r10 > 0) goto Lcd3
            if (r54 == 0) goto Lcb1
            goto Lcd3
        Lcb1:
            if (r36 == 0) goto Lcc0
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r11.vBlurInvertShader
            com.badlogic.gdx.graphics.g2d.Batch r4 = r11.batch
            r4.setShader(r3)
            com.badlogic.gdx.graphics.g2d.Batch r4 = r11.batch
            r4.begin()
            goto Lccc
        Lcc0:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r11.vBlurShader
            com.badlogic.gdx.graphics.g2d.Batch r4 = r11.batch
            r4.setShader(r3)
            com.badlogic.gdx.graphics.g2d.Batch r4 = r11.batch
            r4.begin()
        Lccc:
            r93 = r0
            r101 = r1
            r0 = r96
            goto Ld0c
        Lcd3:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r11.vBlurAllShader
            com.badlogic.gdx.graphics.g2d.Batch r2 = r11.batch
            r2.setShader(r10)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r11.batch
            r2.begin()
            r93 = r0
            r2 = r78
            float r0 = r2.r
            r101 = r1
            float r1 = r2.g
            float r2 = r2.b
            r10.setUniformf(r5, r0, r1, r2)
            r10.setUniformf(r4, r15)
            float r0 = -r3
            r1 = r100
            r10.setUniformf(r1, r0)
            r1 = r97
            if (r36 == 0) goto Lcfe
            r0 = 1065353216(0x3f800000, float:1.0)
            goto Lcff
        Lcfe:
            r0 = 0
        Lcff:
            r10.setUniformf(r1, r0)
            r1 = r98
            r0 = r76
            r10.setUniformf(r1, r0)
            r0 = r96
            r3 = r10
        Ld0c:
            r3.setUniformf(r13, r0)
            r3.setUniformf(r12, r9)
            float r56 = r56 * r31
            float r56 = r56 * r99
            float r56 = r56 * r57
            float r56 = r56 * r95
            r19 = r93
            r0 = r101
            r17 = r6
            r18 = r8
            r16 = r14
            goto Le28
        Ld26:
            r95 = r0
            r13 = r1
            r1 = r3
            r96 = r7
            r49 = r9
            r16 = r14
            r0 = r76
            r12 = r78
            r3 = r87
            r7 = r2
            r9 = r8
            r8 = r60
            r2 = r97
            com.badlogic.gdx.graphics.g2d.Batch r14 = r11.batch
            r17 = r6
            r18 = r9
            r6 = 771(0x303, float:1.08E-42)
            r9 = 1
            r14.setBlendFunction(r9, r6)
            boolean r6 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r6 != 0) goto Ld58
            r11.endFBO(r9)
            r94.restoreScissors()
            float r8 = r11.renderX
            float r2 = r11.renderY
            r6 = 0
            goto Ld89
        Ld58:
            com.badlogic.gdx.graphics.g2d.Batch r6 = r11.batch
            com.badlogic.gdx.math.Matrix4 r6 = r6.getProjectionMatrix()
            r11.rememberProjectionMatrix(r6)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r11.batch
            com.badlogic.gdx.utils.viewport.Viewport r9 = r11.fboViewport
            com.badlogic.gdx.graphics.Camera r9 = r9.getCamera()
            com.badlogic.gdx.math.Matrix4 r9 = r9.combined
            r6.setProjectionMatrix(r9)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r11.batch
            com.badlogic.gdx.math.Matrix4 r9 = r6.getProjectionMatrix()
            r14 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r2 = r9.scale(r8, r2, r14)
            r6.setProjectionMatrix(r2)
            r2 = 0
            r11.endFBO(r2)
            r94.beginFBO2()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r11.fbo2
            r6 = r2
            r2 = 0
            r8 = 0
        Ld89:
            float r33 = r33 * r31
            float r33 = r33 * r99
            float r33 = r33 * r57
            float r9 = r33 * r95
            float r56 = r56 * r31
            float r56 = r56 * r99
            float r56 = r56 * r57
            float r14 = r56 * r95
            r19 = 1065353216(0x3f800000, float:1.0)
            int r20 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r20 != 0) goto Ldd4
            r19 = 0
            int r20 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r20 > 0) goto Ldd4
            if (r54 == 0) goto Lda8
            goto Ldd4
        Lda8:
            if (r36 == 0) goto Ldbc
            if (r27 == 0) goto Ldaf
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.motionBlurOneDirectionInvertShader
            goto Ldb1
        Ldaf:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.motionBlurInvertShader
        Ldb1:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setShader(r0)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
            goto Ldcd
        Ldbc:
            if (r27 == 0) goto Ldc1
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.motionBlurOneDirectionShader
            goto Ldc3
        Ldc1:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.motionBlurShader
        Ldc3:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.setShader(r0)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.begin()
        Ldcd:
            r93 = r2
            r95 = r6
            r97 = r8
            goto Le08
        Ldd4:
            r93 = r2
            if (r27 == 0) goto Lddb
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.motionBlurOneDirectionAllShader
            goto Lddd
        Lddb:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11.motionBlurAllShader
        Lddd:
            r95 = r6
            com.badlogic.gdx.graphics.g2d.Batch r6 = r11.batch
            r6.setShader(r2)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r11.batch
            r6.begin()
            float r6 = r12.r
            r97 = r8
            float r8 = r12.g
            float r12 = r12.b
            r2.setUniformf(r5, r6, r8, r12)
            r2.setUniformf(r4, r15)
            float r3 = -r3
            r2.setUniformf(r1, r3)
            if (r36 == 0) goto Le00
            r8 = 1065353216(0x3f800000, float:1.0)
            goto Le01
        Le00:
            r8 = 0
        Le01:
            r2.setUniformf(r7, r8)
            r2.setUniformf(r13, r0)
            r0 = r2
        Le08:
            java.lang.String r1 = "u_blurPixelsX"
            r0.setUniformf(r1, r9)
            java.lang.String r1 = "u_blurPixelsY"
            r0.setUniformf(r1, r14)
            java.lang.String r1 = "u_texelSizeX"
            r0.setUniformf(r1, r10)
            java.lang.String r1 = "u_texelSizeY"
            r15 = r18
            r0.setUniformf(r1, r15)
            r19 = r93
            r0 = r95
            r7 = r96
            r18 = r97
            r56 = 0
        Le28:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 771(0x303, float:1.08E-42)
            r3 = 1
            r1.setBlendFunction(r3, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = r80
            r1.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            com.badlogic.gdx.graphics.GLTexture r2 = r7.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r2 = (com.badlogic.gdx.graphics.Texture) r2
            float r20 = r17 * r28
            float r21 = r16 * r28
            r22 = 0
            r23 = 0
            r16 = r1
            r17 = r2
            r24 = r57
            r25 = r57
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r1.end()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 770(0x302, float:1.079E-42)
            r3 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r2, r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r11.batch
            r2 = 0
            r1.setShader(r2)
            boolean r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r1 == 0) goto Lf57
            r1 = 1
            r95 = r91
            r96 = r94
            r97 = r0
            r98 = r56
            r99 = r49
            r100 = r41
            r101 = r57
            r102 = r1
            r95.applyGaussian(r96, r97, r98, r99, r100, r101, r102)
            goto Lf57
        Le80:
            r13 = r1
            r7 = r2
            r1 = r3
            r41 = r8
            r49 = r9
            r6 = r76
            r12 = r78
            r2 = r80
            r3 = r87
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 != 0) goto Leaa
            r9 = 0
            int r10 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r10 > 0) goto Leaa
            if (r36 != 0) goto Leaa
            if (r54 != 0) goto Leaa
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 < 0) goto Leaa
            r8 = r29
            r9 = 1
            if (r8 > r9) goto Leab
            if (r55 == 0) goto Lf57
            goto Leab
        Leaa:
            r9 = 1
        Leab:
            r11.endFBO(r9)
            r94.restoreScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r11.fbo1
            if (r0 == 0) goto Leb7
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r11.fbo3
        Leb7:
            double r9 = (double) r3
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 != 0) goto Ledb
            r0 = 0
            int r9 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r9 > 0) goto Ledb
            if (r54 == 0) goto Lec6
            goto Ledb
        Lec6:
            if (r36 == 0) goto Led5
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11.invertColorShader
            r0.setShader(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.begin()
            goto Lf0d
        Led5:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.begin()
            goto Lf0d
        Ledb:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r11.allColorShader
            r0.setShader(r9)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.allColorShader
            float r9 = r12.r
            float r10 = r12.g
            float r12 = r12.b
            r0.setUniformf(r5, r9, r10, r12)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.allColorShader
            r0.setUniformf(r4, r15)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.allColorShader
            float r3 = -r3
            r0.setUniformf(r1, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.allColorShader
            if (r36 == 0) goto Lf04
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lf05
        Lf04:
            r1 = 0
        Lf05:
            r0.setUniformf(r7, r1)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11.allColorShader
            r0.setUniformf(r13, r6)
        Lf0d:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 771(0x303, float:1.08E-42)
            r3 = 1
            r0.setBlendFunction(r3, r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.graphics.GLTexture r1 = r8.getColorBufferTexture()
            r17 = r1
            com.badlogic.gdx.graphics.Texture r17 = (com.badlogic.gdx.graphics.Texture) r17
            float r1 = r11.renderX
            float r2 = r11.renderY
            r3 = r49
            float r3 = (float) r3
            r4 = r41
            float r4 = (float) r4
            r22 = 0
            r23 = 0
            r16 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r24 = r57
            r25 = r57
            r16.draw(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r0.end()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r0.setBlendFunction(r1, r2)
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            r1 = 0
            r0.setShader(r1)
        Lf57:
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1 = r92
            r1.begin(r0)
            boolean r0 = r94.isUsingRotatedTransformationMatrix()
            if (r0 == 0) goto Lf6b
            com.badlogic.gdx.graphics.g2d.Batch r0 = r11.batch
            com.badlogic.gdx.math.Matrix4 r1 = r11.rememberedTransformationMatrix
            r0.setTransformMatrix(r1)
        Lf6b:
            r0 = r91
            float r1 = r0._transparency
            r2 = 1065269330(0x3f7eb852, float:0.995)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lf7b
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._transparency = r1
            goto Lf7d
        Lf7b:
            r1 = 1065353216(0x3f800000, float:1.0)
        Lf7d:
            float r2 = r0._saturation
            float r2 = r2 - r1
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lf8a
            r0._saturation = r1
        Lf8a:
            float r1 = r0._tintAmount
            int r1 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r1 >= 0) goto Lf94
            r1 = 0
            r0._tintAmount = r1
            goto Lf95
        Lf94:
            r1 = 0
        Lf95:
            float r2 = r0._hueShift
            int r3 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r3 >= 0) goto Lf9e
            r0._hueShift = r1
            goto Lfa9
        Lf9e:
            r3 = 1065269330(0x3f7eb852, float:0.995)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lfa9
            r2 = 1065353216(0x3f800000, float:1.0)
            r0._hueShift = r2
        Lfa9:
            float r2 = r0._glow
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lfb1
            r0._glow = r1
        Lfb1:
            float r2 = r0._blur
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lfb9
            r0._blur = r1
        Lfb9:
            float r2 = r0._blur
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lfc1
            r0._blur = r1
        Lfc1:
            float r2 = r0._dsAlpha
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lfc9
            r0._dsAlpha = r1
        Lfc9:
            float r2 = r0._outlineAlpha
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lfd1
            r0._outlineAlpha = r1
        Lfd1:
            float r2 = r0._outlineThickness
            int r2 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r2 >= 0) goto Lfdc
            r0._outlineThickness = r1
            goto Lfdc
        Lfda:
            r0 = r91
        Lfdc:
            return
    }

    public void drawNodeAt(org.fortheloss.sticknodes.stickfigure.StickNode r2, int r3) {
            r1 = this;
            int r2 = r2.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._drawOrderedNodeRefs
            java.lang.Object r2 = r0.remove(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.add(r3, r2)
            r1.recalculateNodeDrawOrder()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void drawNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r22, float r23, float r24, float r25, float r26, float r27, boolean r28, boolean r29, org.fortheloss.sticknodes.stickfigure.INode r30, boolean r31) {
            r21 = this;
            r0 = r21
            r10 = r30
            r21.validateDirtyNodes()
            float r1 = r21.getX()
            float r1 = r1 - r25
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r27 - r2
            float r1 = r1 * r2
            float r3 = r21.getY()
            float r3 = r3 - r26
            float r3 = r3 * r2
            float r2 = r21.getX()
            float r2 = r2 + r23
            float r11 = r2 + r1
            float r1 = r21.getY()
            float r1 = r1 + r24
            float r12 = r1 + r3
            r13 = 1
            r14 = 0
            if (r31 != 0) goto L36
            boolean r1 = r0._isLocked
            if (r1 == 0) goto L34
            goto L36
        L34:
            r1 = 0
            goto L37
        L36:
            r1 = 1
        L37:
            if (r1 == 0) goto L84
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._drawOrderedNodeRefs
            java.lang.Object r1 = r1.get(r14)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 != r10) goto L45
            r8 = 1
            goto L46
        L45:
            r8 = 0
        L46:
            r9 = 0
            r2 = r22
            r3 = r11
            r4 = r12
            r5 = r27
            r6 = r28
            r7 = r29
            r1.drawNode(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = r0._hasJoinAnchorNode
            if (r1 == 0) goto Lb0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._joinAnchorNodeRefs
            int r15 = r1.size()
            r9 = 0
        L5f:
            if (r9 >= r15) goto Lb0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._joinAnchorNodeRefs
            java.lang.Object r1 = r1.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 != r10) goto L6d
            r8 = 1
            goto L6e
        L6d:
            r8 = 0
        L6e:
            r16 = 0
            r2 = r22
            r3 = r11
            r4 = r12
            r5 = r27
            r6 = r28
            r7 = r29
            r17 = r9
            r9 = r16
            r1.drawNode(r2, r3, r4, r5, r6, r7, r8, r9)
            int r9 = r17 + 1
            goto L5f
        L84:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._drawOrderedNodeRefs
            int r15 = r1.size()
            r9 = 0
        L8b:
            if (r9 >= r15) goto Lb0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._drawOrderedNodeRefs
            java.lang.Object r1 = r1.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 != r10) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            r16 = 0
            r2 = r22
            r3 = r11
            r4 = r12
            r5 = r27
            r6 = r28
            r7 = r29
            r17 = r9
            r9 = r16
            r1.drawNode(r2, r3, r4, r5, r6, r7, r8, r9)
            int r9 = r17 + 1
            goto L8b
        Lb0:
            int r1 = r0._lockedStickNodeIndex
            if (r1 <= 0) goto Lca
            org.fortheloss.sticknodes.stickfigure.INode r1 = r0.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 != r10) goto Lbe
            r7 = 1
            goto Lbf
        Lbe:
            r7 = 0
        Lbf:
            r2 = r22
            r3 = r11
            r4 = r12
            r5 = r27
            r6 = r29
            r1.drawLockedNode(r2, r3, r4, r5, r6, r7)
        Lca:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0._polyfillAnchorToOutlineRef
            if (r1 == 0) goto L11f
            boolean r1 = r1.isPolyfillAnchor()
            if (r1 == 0) goto L11f
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0._polyfillAnchorToOutlineRef
            java.util.ArrayList r1 = r1.getPolynodeChildren()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r0._polyfillAnchorToOutlineRef
            int r3 = r1.size()
        Le0:
            if (r14 > r3) goto L11f
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r0._polyfillAnchorToOutlineRef
            if (r14 >= r3) goto Lec
            java.lang.Object r4 = r1.get(r14)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
        Lec:
            r5 = 26
            r6 = r22
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r15 = r6.getNode(r5)
            com.badlogic.gdx.graphics.g2d.Batch r16 = r22.getBatch()
            float r5 = r2.getX()
            float r5 = r5 * r27
            float r17 = r11 + r5
            float r2 = r2.getY()
            float r2 = r2 * r27
            float r18 = r12 + r2
            float r2 = r4.getX()
            float r2 = r2 * r27
            float r19 = r11 + r2
            float r2 = r4.getY()
            float r2 = r2 * r27
            float r20 = r12 + r2
            r15.drawDashedLine(r16, r17, r18, r19, r20)
            int r14 = r14 + 1
            r2 = r4
            goto Le0
        L11f:
            return
    }

    public void drawPolyfillNumbers(org.fortheloss.sticknodes.stickfigure.StickNode r17, com.badlogic.gdx.graphics.g2d.GlyphLayout r18, com.badlogic.gdx.graphics.g2d.BitmapFont r19, com.badlogic.gdx.graphics.g2d.SpriteBatch r20, float r21, float r22, float r23, float r24, float r25) {
            r16 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r17.isPolyfillAnchor()
            if (r2 != 0) goto Lb
            return
        Lb:
            java.util.ArrayList r2 = r17.getPolynodeChildren()
            if (r2 == 0) goto Ldb
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L19
            goto Ldb
        L19:
            r16.validateDirtyNodes()
            float r3 = r16.getX()
            float r3 = r3 - r23
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r25 - r4
            float r3 = r3 * r5
            float r6 = r16.getY()
            float r6 = r6 - r24
            float r6 = r6 * r5
            r5 = 1099956224(0x41900000, float:18.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r5
            r5 = 0
            r8 = -1
            int r9 = r2.size()
        L3c:
            if (r8 >= r9) goto Ld8
            if (r8 < 0) goto L47
            java.lang.Object r10 = r2.get(r8)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            goto L49
        L47:
            r10 = r17
        L49:
            int r8 = r8 + 1
            java.lang.String r11 = java.lang.String.valueOf(r8)
            r0.setText(r1, r11)
            float r12 = r0.width
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r13
            float r14 = r0.height
            float r14 = r14 * r13
            if (r5 == 0) goto La6
            float r13 = r5.getY()
            float r15 = r10.getY()
            float r13 = r13 - r15
            float r5 = r5.getX()
            float r15 = r10.getX()
            float r5 = r5 - r15
            float r5 = com.badlogic.gdx.math.MathUtils.atan2(r13, r5)
            r13 = 1113927392(0x42652ee0, float:57.295776)
            float r5 = r5 * r13
            float r13 = r16.getX()
            float r13 = r13 + r21
            float r13 = r13 + r3
            float r15 = r10.getX()
            float r15 = r15 * r25
            float r13 = r13 + r15
            float r13 = r13 - r12
            float r12 = com.badlogic.gdx.math.MathUtils.cosDeg(r5)
            float r12 = r12 * r7
            float r13 = r13 + r12
            float r12 = r16.getY()
            float r12 = r12 + r22
            float r12 = r12 + r6
            float r15 = r10.getY()
            float r15 = r15 * r25
            float r12 = r12 + r15
            float r12 = r12 + r14
            float r5 = com.badlogic.gdx.math.MathUtils.sinDeg(r5)
            float r5 = r5 * r7
            float r12 = r12 + r5
            goto Lc6
        La6:
            float r5 = r16.getX()
            float r5 = r5 + r21
            float r5 = r5 + r3
            float r13 = r10.getX()
            float r13 = r13 * r25
            float r5 = r5 + r13
            float r13 = r5 - r12
            float r5 = r16.getY()
            float r5 = r5 + r22
            float r5 = r5 + r6
            float r12 = r10.getY()
            float r12 = r12 * r25
            float r5 = r5 + r12
            float r12 = r5 + r14
        Lc6:
            r1.setColor(r4, r4, r4, r4)
            r5 = 1090519040(0x41000000, float:8.0)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r5
            float r12 = r12 + r14
            r5 = r20
            r1.draw(r5, r11, r13, r12)
            r5 = r10
            goto L3c
        Ld8:
            r1.setColor(r4, r4, r4, r4)
        Ldb:
            return
    }

    public void flagDrawPolylineForPolyfillAnchor(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            r0._polyfillAnchorToOutlineRef = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flagLockedToCamera(byte r1) {
            r0 = this;
            r0._flagLockedToCamera = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flipX(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
            r0.flipX(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void flipY(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
            r0.flipY(r2)
            return
    }

    public void getAllNodeDrawOrderIndices(java.util.ArrayList<java.lang.Integer> r6) {
            r5 = this;
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5._mainNode
            r0.push(r1)
        La:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L38
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            int r2 = r1.getDrawOrderIndex()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.add(r2)
            java.util.ArrayList r1 = r1.getChildrenNodes()
            r2 = 0
            int r3 = r1.size()
        L2a:
            if (r2 >= r3) goto La
            java.lang.Object r4 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.push(r4)
            int r2 = r2 + 1
            goto L2a
        L38:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public float getBlur() {
            r1 = this;
            float r0 = r1._blur
            return r0
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._color
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> getConnectors() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorRefs
            return r0
    }

    public boolean getDoesSetStateOfJoins() {
            r1 = this;
            boolean r0 = r1._setStateOfJoins
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

    public boolean getIsScalingJoinedStickfigures() {
            r1 = this;
            boolean r0 = r1._scaleJoinedStickfigures
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> getJoinAnchorNodes() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._joinAnchorNodeRefs
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
            int r0 = r1._libraryID
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getLockedStickNode() {
            r1 = this;
            int r0 = r1._lockedStickNodeIndex
            if (r0 <= 0) goto Lb
            org.fortheloss.sticknodes.stickfigure.INode r0 = r1.getNodeAtDrawOrderIndex(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getLockedStickNodeIncludingJoins() {
            r2 = this;
            r0 = r2
        L1:
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            goto L1
        L10:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getLockedStickNodeAsRootJoin()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.INode getMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.getMainNode()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.StickNode getMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
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
            boolean r0 = r1._motionBlurIsOneDirection
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1._name
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public org.fortheloss.sticknodes.stickfigure.INode getNodeAtDrawOrderIndex(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._drawOrderedNodeRefs
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.INode r2 = (org.fortheloss.sticknodes.stickfigure.INode) r2
            return r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getNodeCount(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L2c
            boolean r3 = r2.hasPolyfillAnchorNode()
            if (r3 != 0) goto L9
            goto L2c
        L9:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r2._drawOrderedNodeRefs
            int r3 = r3.size()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyfillAnchorNodes
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._polyfillAnchorNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            int r1 = r1.getPolynodeChildrenCount()
            int r1 = r1 + 1
            int r3 = r3 + r1
            int r0 = r0 + (-1)
            goto L17
        L2b:
            return r3
        L2c:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r2._drawOrderedNodeRefs
            int r3 = r3.size()
            return r3
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

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> getPolyfillAnchorNodes() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyfillAnchorNodes
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void getPositionalData(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2._id
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._scale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._transparency
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._blur
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2._isMotionBlur
            r3.write(r0)
            boolean r0 = r2._motionBlurIsOneDirection
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
            com.badlogic.gdx.graphics.Color r0 = r2._color
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            boolean r0 = r2._isLocked
            r3.write(r0)
            boolean r0 = r2._isPersistentWhenTweening
            r3.write(r0)
            boolean r0 = r2.mVisibleInOnionSkin
            r3.write(r0)
            boolean r0 = r2._isTweeningColors
            r3.write(r0)
            byte r0 = r2.mTweenMode
            r3.write(r0)
            boolean r0 = r2._scaleJoinedStickfigures
            r3.write(r0)
            boolean r0 = r2._pushJoinedStickfigures
            r3.write(r0)
            boolean r0 = r2._setStateOfJoins
            r3.write(r0)
            int r0 = r2._stateIndexOfJoins
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            boolean r0 = r2._isUsingJoinParentFilters
            r3.write(r0)
            int r0 = r2._lockedStickNodeIndex
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            float r0 = r2._lockedNodeX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._lockedNodeY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._mainNode
            r0.beginWritingPositionalData(r3)
            return
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.StickfigureProperties r3) {
            r2 = this;
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r1 = r0.x
            r3.x = r1
            float r0 = r0.y
            r3.y = r0
            float r0 = r2._scale
            r3.scale = r0
            float r0 = r2._transparency
            r3.transparency = r0
            float r0 = r2._blur
            r3.blur = r0
            boolean r0 = r2._isMotionBlur
            r3.isMotionBlur = r0
            boolean r0 = r2._motionBlurIsOneDirection
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
            com.badlogic.gdx.graphics.Color r0 = r3.color
            com.badlogic.gdx.graphics.Color r1 = r2._color
            r0.set(r1)
            boolean r0 = r2._isLocked
            r3.isLocked = r0
            boolean r0 = r2._isPersistentWhenTweening
            r3.isPersistentWhenTweening = r0
            boolean r0 = r2.mVisibleInOnionSkin
            r3.visibleInOnionSkin = r0
            boolean r0 = r2._isTweeningColors
            r3.isTweeningColors = r0
            byte r0 = r2.mTweenMode
            r3.mTweenMode = r0
            boolean r0 = r2._scaleJoinedStickfigures
            r3.scaleJoinedStickfigures = r0
            boolean r0 = r2._pushJoinedStickfigures
            r3.pushJoinedStickfigures = r0
            boolean r0 = r2._setStateOfJoins
            r3.setStateOfJoins = r0
            int r0 = r2._stateIndexOfJoins
            r3.joinsState = r0
            boolean r0 = r2._isUsingJoinParentFilters
            r3.isUsingJoinParentFilters = r0
            float r0 = r2.mJoinOffsetAngle
            r3.mJoinOffsetAngle = r0
            int r0 = r2._lockedStickNodeIndex
            r3.lockedStickNodeIndex = r0
            float r0 = r2._lockedNodeX
            r3.lockedNodeX = r0
            float r0 = r2._lockedNodeY
            r3.lockedNodeY = r0
            return
    }

    public boolean getPushJoinedFigures() {
            r1 = this;
            boolean r0 = r1._pushJoinedStickfigures
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getRotation() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
            float r0 = r0.getLocalAngle()
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
    public org.fortheloss.sticknodes.stickfigure.INode getSelectedNode(float r5, float r6, float r7, boolean r8, boolean r9, org.fortheloss.sticknodes.NodeDigger r10) {
            r4 = this;
            float r7 = getNodeClickSizeSquared(r7)
            r0 = 1
            if (r9 != 0) goto Le
            boolean r9 = r4._isLocked
            if (r9 == 0) goto Lc
            goto Le
        Lc:
            r9 = 0
            goto Lf
        Le:
            r9 = 1
        Lf:
            r1 = 0
            if (r9 != 0) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r4._drawOrderedNodeRefs
            int r9 = r9.size()
            int r9 = r9 - r0
        L19:
            boolean r0 = r4._isJoined
            if (r9 < r0) goto Lb5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r4._drawOrderedNodeRefs
            java.lang.Object r0 = r0.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r2 = r0.isStatic()
            if (r2 == 0) goto L2d
            if (r8 == 0) goto L4b
        L2d:
            float r2 = r0.getGlobalX()
            float r2 = r5 - r2
            float r3 = r0.getGlobalY()
            float r3 = r6 - r3
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r2 = r2 + r3
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L4b
            if (r10 == 0) goto Lb0
            boolean r2 = r10.isThisNodeNew(r0)
            if (r2 == 0) goto L4b
            goto Lb0
        L4b:
            int r9 = r9 + (-1)
            goto L19
        L4e:
            boolean r9 = r4._isJoined
            if (r9 != 0) goto L6d
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = r4._mainNode
            float r9 = r9.getGlobalX()
            float r9 = r5 - r9
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r4._mainNode
            float r2 = r2.getGlobalY()
            float r2 = r6 - r2
            float r9 = r9 * r9
            float r2 = r2 * r2
            float r9 = r9 + r2
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 > 0) goto L6d
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4._mainNode
        L6d:
            if (r1 != 0) goto Lb5
            boolean r9 = r4._hasJoinAnchorNode
            if (r9 == 0) goto Lb5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r4._joinAnchorNodeRefs
            int r9 = r9.size()
            int r9 = r9 - r0
        L7a:
            if (r9 < 0) goto Lb5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r4._joinAnchorNodeRefs
            java.lang.Object r0 = r0.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r2 = r0.isMainNode()
            if (r2 == 0) goto L8b
            goto Lb2
        L8b:
            boolean r2 = r0.isStatic()
            if (r2 == 0) goto L93
            if (r8 == 0) goto Lb2
        L93:
            float r2 = r0.getGlobalX()
            float r2 = r5 - r2
            float r3 = r0.getGlobalY()
            float r3 = r6 - r3
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r2 = r2 + r3
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto Lb2
            if (r10 == 0) goto Lb0
            boolean r2 = r10.isThisNodeNew(r0)
            if (r2 == 0) goto Lb2
        Lb0:
            r1 = r0
            goto Lb5
        Lb2:
            int r9 = r9 + (-1)
            goto L7a
        Lb5:
            return r1
    }

    public int getStateIndexOfJoins() {
            r1 = this;
            int r0 = r1._stateIndexOfJoins
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigureToReferForFilters() {
            r2 = this;
            boolean r0 = r2._isUsingJoinParentFilters
            if (r0 == 0) goto L50
            boolean r0 = r2.isJoined()
            if (r0 != 0) goto Lb
            goto L50
        Lb:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            boolean r1 = r0.isJoined()
            if (r1 != 0) goto L1a
            return r0
        L1a:
            java.util.Stack<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.stickfigureFilterReferenceStack
            r1.add(r0)
        L1f:
            java.util.Stack<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.stickfigureFilterReferenceStack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4e
            java.util.Stack<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.stickfigureFilterReferenceStack
            java.lang.Object r0 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto L48
            boolean r1 = r0._isUsingJoinParentFilters
            if (r1 != 0) goto L3a
            goto L48
        L3a:
            java.util.Stack<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.stickfigureFilterReferenceStack
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            r1.add(r0)
            goto L1f
        L48:
            java.util.Stack<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = org.fortheloss.sticknodes.stickfigure.Stickfigure.stickfigureFilterReferenceStack
            r1.clear()
            goto L4f
        L4e:
            r0 = r2
        L4f:
            return r0
        L50:
            return r2
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

    public boolean hasConnectors() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorRefs
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean hasJoinAnchorNode() {
            r1 = this;
            boolean r0 = r1._hasJoinAnchorNode
            return r0
    }

    public boolean hasPolyfillAnchorNode() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyfillAnchorNodes
            if (r0 == 0) goto Lc
            int r0 = r0.size()
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void highlightChildrenAndParentNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r13, float r14, float r15, float r16, float r17, float r18, boolean r19, org.fortheloss.sticknodes.stickfigure.StickNode r20, boolean r21) {
            r12 = this;
            float r0 = r12.getX()
            float r0 = r0 - r16
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r18 - r1
            float r0 = r0 * r1
            float r2 = r12.getY()
            float r2 = r2 - r17
            float r2 = r2 * r1
            float r1 = r12.getX()
            float r1 = r1 + r14
            float r4 = r1 + r0
            float r0 = r12.getY()
            float r0 = r0 + r15
            float r5 = r0 + r2
            r2 = r20
            r3 = r13
            r6 = r18
            r7 = r19
            r2.highlightChildrenAndParentNodes(r3, r4, r5, r6, r7)
            if (r21 == 0) goto L7a
            boolean r0 = r20.isJoinAnchor()
            if (r0 == 0) goto L7a
            java.util.ArrayList r0 = r20.getJoinedFigures()
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r11 = r1
        L3f:
            if (r11 < 0) goto L7a
            java.lang.Object r1 = r0.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L60
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r8 = 0
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = r1.getMainNode()
            r10 = 1
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r1.highlightChildrenAndParentNodes(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L77
        L60:
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L77
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            org.fortheloss.sticknodes.movieclip.MCNode r8 = r1.getMainNode()
            r9 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r1.highlightNodes(r2, r3, r4, r5, r6, r7, r8, r9)
        L77:
            int r11 = r11 + (-1)
            goto L3f
        L7a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void interpolateValues(float r8, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10) {
            r7 = this;
            r0 = 0
            r7._doNotDraw = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            boolean r1 = r9._isUsingJoinParentFilters
            r7._isUsingJoinParentFilters = r1
            boolean r1 = r9._isPersistentWhenTweening
            r7._isPersistentWhenTweening = r1
            boolean r1 = r9._isTweeningColors
            r7._isTweeningColors = r1
            byte r1 = r9.mTweenMode
            if (r1 == 0) goto L298
            r2 = 2
            if (r1 != r2) goto L21
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sine
            float r8 = r1.apply(r8)
            goto L34
        L21:
            r2 = 3
            if (r1 != r2) goto L2b
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineIn
            float r8 = r1.apply(r8)
            goto L34
        L2b:
            r2 = 4
            if (r1 != r2) goto L34
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineOut
            float r8 = r1.apply(r8)
        L34:
            boolean r1 = r7._isTweeningColors
            if (r1 == 0) goto L49
            if (r10 != 0) goto L3b
            goto L49
        L3b:
            com.badlogic.gdx.graphics.Color r1 = r7._color
            com.badlogic.gdx.graphics.Color r2 = r9._color
            com.badlogic.gdx.graphics.Color r1 = r1.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r10._color
            r1.lerp(r2, r8)
            goto L50
        L49:
            com.badlogic.gdx.graphics.Color r1 = r7._color
            com.badlogic.gdx.graphics.Color r2 = r9._color
            r1.set(r2)
        L50:
            boolean r1 = r9._isMotionBlur
            r7._isMotionBlur = r1
            boolean r1 = r9._motionBlurIsOneDirection
            r7._motionBlurIsOneDirection = r1
            int r1 = r9._motionBlurAngle
            r7._motionBlurAngle = r1
            boolean r1 = r9._colorIsInverted
            r7._colorIsInverted = r1
            if (r10 == 0) goto L1fe
            boolean r1 = r7._isTweeningColors
            if (r1 != 0) goto L6e
            com.badlogic.gdx.graphics.Color r1 = r7._color
            com.badlogic.gdx.graphics.Color r2 = r9._color
            r1.set(r2)
            goto L7b
        L6e:
            com.badlogic.gdx.graphics.Color r1 = r7._color
            com.badlogic.gdx.graphics.Color r2 = r9._color
            com.badlogic.gdx.graphics.Color r1 = r1.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r10._color
            r1.lerp(r2, r8)
        L7b:
            float r1 = r9.mJoinOffsetAngle
            float r2 = r10.mJoinOffsetAngle
            float r2 = r2 - r1
            r3 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r3
            r4 = 1141309440(0x44070000, float:540.0)
            float r2 = r2 + r4
            float r2 = r2 % r3
            r3 = 1127481344(0x43340000, float:180.0)
            float r2 = r2 - r3
            float r2 = r2 * r8
            float r1 = r1 + r2
            r7.mJoinOffsetAngle = r1
            float r1 = r7._scale
            float r2 = r9._scale
            float r3 = r10._scale
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._scale = r2
            float r2 = r9._transparency
            float r3 = r10._transparency
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._transparency = r2
            float r2 = r9._blur
            float r3 = r10._blur
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._blur = r2
            int r2 = r9._motionBlurAngle
            float r3 = (float) r2
            int r4 = r10._motionBlurAngle
            int r4 = r4 - r2
            int r4 = r4 % 360
            int r4 = r4 + 540
            int r4 = r4 % 360
            int r4 = r4 + (-180)
            float r2 = (float) r4
            float r2 = r2 * r8
            float r3 = r3 + r2
            int r2 = java.lang.Math.round(r3)
            r7._motionBlurAngle = r2
            float r2 = r9._saturation
            float r3 = r10._saturation
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._saturation = r2
            int r2 = r9._pixelation
            float r3 = (float) r2
            int r4 = r10._pixelation
            int r4 = r4 - r2
            float r2 = (float) r4
            float r2 = r2 * r8
            float r3 = r3 + r2
            int r2 = java.lang.Math.round(r3)
            r7._pixelation = r2
            float r2 = r9._tintAmount
            float r3 = r10._tintAmount
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._tintAmount = r2
            com.badlogic.gdx.graphics.Color r2 = r7._tintColor
            com.badlogic.gdx.graphics.Color r3 = r9._tintColor
            com.badlogic.gdx.graphics.Color r2 = r2.set(r3)
            com.badlogic.gdx.graphics.Color r3 = r10._tintColor
            r2.lerp(r3, r8)
            float r2 = r9._hueShift
            float r3 = r10._hueShift
            float r3 = r3 - r2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 % r4
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 + r5
            float r3 = r3 % r4
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r5
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._hueShift = r2
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 < 0) goto L114
            float r2 = r2 - r4
            r7._hueShift = r2
            goto L11c
        L114:
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L11c
            float r2 = r2 + r4
            r7._hueShift = r2
        L11c:
            float r2 = r9._glow
            float r3 = r10._glow
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._glow = r2
            com.badlogic.gdx.graphics.Color r2 = r7._glowColor
            com.badlogic.gdx.graphics.Color r3 = r9._glowColor
            com.badlogic.gdx.graphics.Color r2 = r2.set(r3)
            com.badlogic.gdx.graphics.Color r3 = r10._glowColor
            r2.lerp(r3, r8)
            float r2 = r9._glowIntensity
            float r3 = r10._glowIntensity
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._glowIntensity = r2
            com.badlogic.gdx.graphics.Color r2 = r7._outlineColor
            com.badlogic.gdx.graphics.Color r3 = r9._outlineColor
            com.badlogic.gdx.graphics.Color r2 = r2.set(r3)
            com.badlogic.gdx.graphics.Color r3 = r10._outlineColor
            r2.lerp(r3, r8)
            float r2 = r9._outlineAlpha
            float r3 = r10._outlineAlpha
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._outlineAlpha = r2
            float r2 = r9._outlineThickness
            float r3 = r10._outlineThickness
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._outlineThickness = r2
            com.badlogic.gdx.graphics.Color r2 = r7._dsColor
            com.badlogic.gdx.graphics.Color r3 = r9._dsColor
            com.badlogic.gdx.graphics.Color r2 = r2.set(r3)
            com.badlogic.gdx.graphics.Color r3 = r10._dsColor
            r2.lerp(r3, r8)
            float r2 = r9._dsAlpha
            float r3 = r10._dsAlpha
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._dsAlpha = r2
            int r2 = r9._dsDistance
            float r3 = (float) r2
            int r4 = r10._dsDistance
            int r4 = r4 - r2
            float r2 = (float) r4
            float r2 = r2 * r8
            float r3 = r3 + r2
            int r2 = java.lang.Math.round(r3)
            r7._dsDistance = r2
            int r2 = r9._dsAngle
            float r3 = (float) r2
            int r4 = r10._dsAngle
            int r4 = r4 - r2
            int r4 = r4 % 360
            int r4 = r4 + 540
            int r4 = r4 % 360
            int r4 = r4 + (-180)
            float r2 = (float) r4
            float r2 = r2 * r8
            float r3 = r3 + r2
            int r2 = java.lang.Math.round(r3)
            r7._dsAngle = r2
            float r2 = r9._dsBlur
            float r3 = r10._dsBlur
            float r3 = r3 - r2
            float r3 = r3 * r8
            float r2 = r2 + r3
            r7._dsBlur = r2
            com.badlogic.gdx.math.Vector2 r2 = r7._position
            com.badlogic.gdx.math.Vector2 r3 = r9._position
            float r4 = r3.x
            com.badlogic.gdx.math.Vector2 r5 = r10._position
            float r6 = r5.x
            float r6 = r6 - r4
            float r6 = r6 * r8
            float r4 = r4 + r6
            r2.x = r4
            float r3 = r3.y
            float r4 = r5.y
            float r4 = r4 - r3
            float r4 = r4 * r8
            float r3 = r3 + r4
            r2.y = r3
            float r2 = r7._scale
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L1cc
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7._mainNode
            r1.flagPositionAsDirty()
        L1cc:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7.getMainNode()
            r1.flagPositionAsDirty()
            r7.validateDirtyNodes()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r7._interpolateNodeRefs
            int r1 = r1.size()
        L1dc:
            if (r0 >= r1) goto L331
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r7._interpolateNodeRefs
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r9._interpolateNodeRefs
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r10._interpolateNodeRefs
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            boolean r5 = r7._isTweeningColors
            r2.interpolate(r3, r4, r8, r5)
            int r0 = r0 + 1
            goto L1dc
        L1fe:
            com.badlogic.gdx.graphics.Color r8 = r7._color
            com.badlogic.gdx.graphics.Color r10 = r9._color
            r8.set(r10)
            float r8 = r7._scale
            float r10 = r9._scale
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L212
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r7._mainNode
            r8.flagPositionAsDirty()
        L212:
            float r8 = r9.mJoinOffsetAngle
            r7.mJoinOffsetAngle = r8
            float r8 = r9._scale
            r7._scale = r8
            float r8 = r9._transparency
            r7._transparency = r8
            float r8 = r9._blur
            r7._blur = r8
            float r8 = r9._saturation
            r7._saturation = r8
            int r8 = r9._pixelation
            r7._pixelation = r8
            float r8 = r9._tintAmount
            r7._tintAmount = r8
            com.badlogic.gdx.graphics.Color r8 = r7._tintColor
            com.badlogic.gdx.graphics.Color r10 = r9._tintColor
            r8.set(r10)
            float r8 = r9._hueShift
            r7._hueShift = r8
            float r8 = r9._glow
            r7._glow = r8
            com.badlogic.gdx.graphics.Color r8 = r7._glowColor
            com.badlogic.gdx.graphics.Color r10 = r9._glowColor
            r8.set(r10)
            float r8 = r9._glowIntensity
            r7._glowIntensity = r8
            com.badlogic.gdx.graphics.Color r8 = r7._outlineColor
            com.badlogic.gdx.graphics.Color r10 = r9._outlineColor
            r8.set(r10)
            float r8 = r9._outlineAlpha
            r7._outlineAlpha = r8
            float r8 = r9._outlineThickness
            r7._outlineThickness = r8
            com.badlogic.gdx.graphics.Color r8 = r7._dsColor
            com.badlogic.gdx.graphics.Color r10 = r9._dsColor
            r8.set(r10)
            float r8 = r9._dsAlpha
            r7._dsAlpha = r8
            int r8 = r9._dsDistance
            r7._dsDistance = r8
            int r8 = r9._dsAngle
            r7._dsAngle = r8
            float r8 = r9._dsBlur
            r7._dsBlur = r8
            com.badlogic.gdx.math.Vector2 r8 = r7._position
            com.badlogic.gdx.math.Vector2 r10 = r9._position
            float r1 = r10.x
            r8.x = r1
            float r10 = r10.y
            r8.y = r10
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8 = r7._interpolateNodeRefs
            int r8 = r8.size()
        L280:
            if (r0 >= r8) goto L331
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r7._interpolateNodeRefs
            java.lang.Object r10 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r9._interpolateNodeRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r10.interpolate(r1)
            int r0 = r0 + 1
            goto L280
        L298:
            com.badlogic.gdx.graphics.Color r8 = r7._color
            com.badlogic.gdx.graphics.Color r10 = r9._color
            r8.set(r10)
            float r8 = r9.mJoinOffsetAngle
            r7.mJoinOffsetAngle = r8
            boolean r8 = r9._isMotionBlur
            r7._isMotionBlur = r8
            boolean r8 = r9._motionBlurIsOneDirection
            r7._motionBlurIsOneDirection = r8
            int r8 = r9._motionBlurAngle
            r7._motionBlurAngle = r8
            boolean r8 = r9._colorIsInverted
            r7._colorIsInverted = r8
            float r8 = r9._scale
            r7._scale = r8
            float r8 = r9._transparency
            r7._transparency = r8
            float r8 = r9._blur
            r7._blur = r8
            float r8 = r9._saturation
            r7._saturation = r8
            int r8 = r9._pixelation
            r7._pixelation = r8
            float r8 = r9._tintAmount
            r7._tintAmount = r8
            com.badlogic.gdx.graphics.Color r8 = r7._tintColor
            com.badlogic.gdx.graphics.Color r10 = r9._tintColor
            r8.set(r10)
            float r8 = r9._glow
            r7._glow = r8
            com.badlogic.gdx.graphics.Color r8 = r7._glowColor
            com.badlogic.gdx.graphics.Color r10 = r9._glowColor
            r8.set(r10)
            float r8 = r9._glowIntensity
            r7._glowIntensity = r8
            com.badlogic.gdx.graphics.Color r8 = r7._outlineColor
            com.badlogic.gdx.graphics.Color r10 = r9._outlineColor
            r8.set(r10)
            float r8 = r9._outlineAlpha
            r7._outlineAlpha = r8
            float r8 = r9._outlineThickness
            r7._outlineThickness = r8
            com.badlogic.gdx.graphics.Color r8 = r7._dsColor
            com.badlogic.gdx.graphics.Color r10 = r9._dsColor
            r8.set(r10)
            float r8 = r9._dsAlpha
            r7._dsAlpha = r8
            int r8 = r9._dsDistance
            r7._dsDistance = r8
            int r8 = r9._dsAngle
            r7._dsAngle = r8
            float r8 = r9._dsBlur
            r7._dsBlur = r8
            com.badlogic.gdx.math.Vector2 r8 = r7._position
            com.badlogic.gdx.math.Vector2 r10 = r9._position
            float r1 = r10.x
            r8.x = r1
            float r10 = r10.y
            r8.y = r10
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8 = r7._interpolateNodeRefs
            int r8 = r8.size()
        L319:
            if (r0 >= r8) goto L331
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r7._interpolateNodeRefs
            java.lang.Object r10 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r9._interpolateNodeRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r10.interpolate(r1)
            int r0 = r0 + 1
            goto L319
        L331:
            return
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

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public boolean isPersistent() {
            r1 = this;
            boolean r0 = r1._isPersistentWhenTweening
            return r0
    }

    public boolean isTweeningColors() {
            r1 = this;
            boolean r0 = r1._isTweeningColors
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
            if (r3 == 0) goto L64
            boolean r0 = r2._isJoined
            if (r0 != 0) goto L5c
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3.getStickfigure()
            r1 = 0
            if (r2 != r0) goto Le
            return r1
        Le:
            if (r4 != 0) goto L13
            r2.unlockStickNode()
        L13:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3.getStickfigure()
            boolean r0 = r0.checkIsJoinedTo(r2)
            if (r0 == 0) goto L1e
            return r1
        L1e:
            r0 = 1
            r2._isJoined = r0
            r2._joinedToNodeRef = r3
            r3.addJoinedFigure(r2)
            if (r4 != 0) goto L47
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._mainNode
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
            if (r4 >= 0) goto L45
            float r3 = r3 + r1
        L45:
            r2.mJoinOffsetAngle = r3
        L47:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._joinedToNodeRef
            float r3 = r3.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2._joinedToNodeRef
            float r4 = r4.getGlobalY()
            r2.setPosition(r3, r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._mainNode
            r3.flagPositionAsDirty()
            return r0
        L5c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't join, this stickfigure is already joined."
            r3.<init>(r4)
            throw r3
        L64:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't join to a null node."
            r3.<init>(r4)
            throw r3
    }

    public void lockStickNode(int r9) {
            r8 = this;
            if (r9 > 0) goto L3
            return
        L3:
            r0 = 0
            boolean r1 = r8.isJoined()
            r2 = 1
            if (r1 != 0) goto L1e
            boolean r1 = r8.hasJoinAnchorNode()
            if (r1 == 0) goto L12
            goto L1e
        L12:
            r8.unlockStickNode()
            byte r1 = r8.isLockedToCamera()
            if (r1 == 0) goto L8a
            r0 = 1
            goto L8a
        L1e:
            boolean r1 = r8.isJoined()
            if (r1 == 0) goto L34
            r1 = r8
        L25:
            boolean r3 = r1.isJoined()
            if (r3 == 0) goto L35
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            goto L25
        L34:
            r1 = r8
        L35:
            java.util.Stack r3 = new java.util.Stack
            r3.<init>()
            r3.add(r1)
        L3d:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L8a
            java.lang.Object r1 = r3.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            byte r4 = r1.isLockedToCamera()
            if (r4 == 0) goto L50
            r0 = 1
        L50:
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L3d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r1.unlockStickNode()
            boolean r4 = r1.hasJoinAnchorNode()
            if (r4 == 0) goto L3d
            java.util.ArrayList r1 = r1.getJoinAnchorNodes()
            int r4 = r1.size()
            int r4 = r4 - r2
        L68:
            if (r4 < 0) goto L3d
            java.lang.Object r5 = r1.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            java.util.ArrayList r5 = r5.getJoinedFigures()
            int r6 = r5.size()
            int r6 = r6 - r2
        L79:
            if (r6 < 0) goto L87
            java.lang.Object r7 = r5.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            r3.add(r7)
            int r6 = r6 + (-1)
            goto L79
        L87:
            int r4 = r4 + (-1)
            goto L68
        L8a:
            if (r0 == 0) goto L8d
            return
        L8d:
            r8.validateDirtyNodes()
            r8._lockedStickNodeIndex = r9
            org.fortheloss.sticknodes.stickfigure.INode r9 = r8.getNodeAtDrawOrderIndex(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            float r0 = r9.getGlobalX()
            r8._lockedNodeX = r0
            float r9 = r9.getGlobalY()
            r8._lockedNodeY = r9
            return
    }

    public void pastePropertiesBundle(org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
            r2 = this;
            boolean r0 = r3.getIsPersistentWhenTweening()
            r2._isPersistentWhenTweening = r0
            boolean r0 = r3.isVisibleInOnionSkin()
            r2.mVisibleInOnionSkin = r0
            boolean r0 = r3.getIsTweeningColors()
            r2._isTweeningColors = r0
            byte r0 = r3.getTweenMode()
            r2.mTweenMode = r0
            boolean r0 = r3.getScaleJoinedStickfigures()
            r2._scaleJoinedStickfigures = r0
            boolean r0 = r3.getPushJoinedFigures()
            r2._pushJoinedStickfigures = r0
            boolean r0 = r3.getStateOfJoins()
            r2._setStateOfJoins = r0
            int r0 = r3.getJoinsState()
            r2._stateIndexOfJoins = r0
            boolean r0 = r3.getUseJoinParentFilters()
            r2._isUsingJoinParentFilters = r0
            r0 = 0
            r2.mJoinOffsetAngle = r0
            r0 = 0
            if (r4 == 0) goto L57
            boolean r4 = r2.isJoined()
            if (r4 != 0) goto L57
            byte r4 = r2._flagLockedToCamera
            if (r4 != 0) goto L57
            r2.setLocked(r0)
            r2.unlockStickNode()
            float r4 = r3.getX()
            float r1 = r3.getY()
            r2.setPosition(r4, r1)
        L57:
            if (r5 == 0) goto L63
            r2.unlockStickNode()
            float r4 = r3.getScale()
            r2.setScale(r4)
        L63:
            if (r6 == 0) goto L6c
            com.badlogic.gdx.graphics.Color r4 = r3.getColor()
            r2.setColor(r4)
        L6c:
            if (r7 == 0) goto L7b
            r2.setLocked(r0)
            r2.unlockStickNode()
            float r4 = r3.getRotation()
            r2.setFigureRotation(r4)
        L7b:
            if (r8 == 0) goto L84
            org.fortheloss.sticknodes.data.FigureFilterProperties r4 = r3.getFilterProperties()
            r2.setFilters(r4)
        L84:
            if (r9 == 0) goto L9d
            int r4 = r2._libraryID
            int r5 = r3.getCopiedStickfigureLibraryID()
            if (r4 != r5) goto L9d
            r2.setLocked(r0)
            r2.unlockStickNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2._mainNode
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r5 = r3.getNodeProperties()
            r4.setBranchProperties(r5)
        L9d:
            float r3 = r3.getJoinOffsetAngle()
            r2.mJoinOffsetAngle = r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._mainNode
            r3.flagPositionAsDirty()
            return
    }

    public void pushBranchBack(org.fortheloss.sticknodes.stickfigure.StickNode r10) {
            r9 = this;
            boolean r0 = r10.isMainNode()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r10.getDescendantCount()
            r1 = 1
            int r0 = r0 + r1
            if (r0 != r1) goto L13
            r9.pushSegmentBack(r10)
            return
        L13:
            org.fortheloss.sticknodes.stickfigure.StickNode[] r2 = new org.fortheloss.sticknodes.stickfigure.StickNode[r0]
            r10.addDescendantsToArray(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r9._drawOrderedNodeRefs
            int r10 = r10.size()
            r3 = 2
        L1f:
            if (r3 >= r10) goto L5c
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r9._drawOrderedNodeRefs
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r9._drawOrderedNodeRefs
            int r6 = r3 + (-1)
            java.lang.Object r5 = r5.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r6 = 0
            int r7 = r0 + (-1)
        L36:
            if (r7 < 0) goto L43
            r8 = r2[r7]
            if (r8 != r5) goto L3d
            goto L59
        L3d:
            if (r8 != r4) goto L40
            r6 = 1
        L40:
            int r7 = r7 + (-1)
            goto L36
        L43:
            if (r6 == 0) goto L59
            int r4 = r4.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r9._drawOrderedNodeRefs
            int r6 = r4 + (-1)
            java.lang.Object r4 = r5.remove(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5.add(r6, r4)
            r9.recalculateNodeDrawOrder()
        L59:
            int r3 = r3 + 1
            goto L1f
        L5c:
            return
    }

    public void pushBranchForward(org.fortheloss.sticknodes.stickfigure.StickNode r9) {
            r8 = this;
            boolean r0 = r9.isMainNode()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r9.getDescendantCount()
            r1 = 1
            int r0 = r0 + r1
            if (r0 != r1) goto L13
            r8.pushSegmentForward(r9)
            return
        L13:
            org.fortheloss.sticknodes.stickfigure.StickNode[] r2 = new org.fortheloss.sticknodes.stickfigure.StickNode[r0]
            r9.addDescendantsToArray(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r8._drawOrderedNodeRefs
            int r9 = r9.size()
            int r9 = r9 + (-2)
        L20:
            if (r9 <= 0) goto L5d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r8._drawOrderedNodeRefs
            java.lang.Object r3 = r3.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r8._drawOrderedNodeRefs
            int r5 = r9 + 1
            java.lang.Object r4 = r4.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5 = 0
            int r6 = r0 + (-1)
        L37:
            if (r6 < 0) goto L44
            r7 = r2[r6]
            if (r7 != r4) goto L3e
            goto L5a
        L3e:
            if (r7 != r3) goto L41
            r5 = 1
        L41:
            int r6 = r6 + (-1)
            goto L37
        L44:
            if (r5 == 0) goto L5a
            int r3 = r3.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r8._drawOrderedNodeRefs
            int r5 = r3 + 1
            java.lang.Object r3 = r4.remove(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r4.add(r5, r3)
            r8.recalculateNodeDrawOrder()
        L5a:
            int r9 = r9 + (-1)
            goto L20
        L5d:
            return
    }

    public boolean pushSegmentBack(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            boolean r0 = r4.isMainNode()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r4 = r4.getDrawOrderIndex()
            r0 = 1
            if (r4 > r0) goto L10
            return r1
        L10:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3._drawOrderedNodeRefs
            int r2 = r4 + (-1)
            java.lang.Object r4 = r1.remove(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r1.add(r2, r4)
            r3.recalculateNodeDrawOrder()
            return r0
    }

    public boolean pushSegmentForward(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            boolean r0 = r4.isMainNode()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r4 = r4.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._drawOrderedNodeRefs
            int r0 = r0.size()
            r2 = 1
            int r0 = r0 - r2
            if (r4 != r0) goto L17
            return r1
        L17:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._drawOrderedNodeRefs
            int r1 = r4 + 1
            java.lang.Object r4 = r0.remove(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.add(r1, r4)
            r3.recalculateNodeDrawOrder()
            return r2
    }

    public void readData(java.io.DataInputStream r9) throws java.io.IOException {
            r8 = this;
            int r0 = r9.readInt()
            r1 = 1
            r2 = 403(0x193, float:5.65E-43)
            if (r0 < r2) goto Le
            int r2 = r9.readInt()
            goto Lf
        Le:
            r2 = 1
        Lf:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Opening stickfigure made with version "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", build "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            if (r0 < 0) goto L11e
            r3 = 425(0x1a9, float:5.96E-43)
            if (r0 > r3) goto L11e
            float r3 = r9.readFloat()
            r8._scale = r3
            int r3 = r9.readInt()
            com.badlogic.gdx.graphics.Color r4 = r8._color
            r5 = r3 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r6
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.set(r5, r7, r3, r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r8._mainNode
            r3.beginReadingData(r0, r2, r9)
            r3 = 36
            if (r2 >= r3) goto L65
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r8._mainNode
            r4 = 0
            r3.setLocalAngle(r4)
        L65:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r8._mainNode
            int r3 = r3.getDescendantCount()
            r4 = 0
            r5 = 0
        L6d:
            if (r5 >= r3) goto L78
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r6 = r8._drawOrderedNodeRefs
            r7 = 0
            r6.add(r7)
            int r5 = r5 + 1
            goto L6d
        L78:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r8._mainNode
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r8._drawOrderedNodeRefs
            r3.putAllIntoDrawOrderArray(r5)
            r3 = 230(0xe6, float:3.22E-43)
            if (r0 < r3) goto L88
            int r3 = r9.readInt()
            goto L89
        L88:
            r3 = 0
        L89:
            if (r3 <= 0) goto L9f
        L8b:
            if (r3 <= 0) goto L9f
            int r5 = r9.readInt()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r6 = r8._drawOrderedNodeRefs
            java.lang.Object r5 = r6.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r5.readPolyfillAnchorData(r0, r9)
            int r3 = r3 + (-1)
            goto L8b
        L9f:
            r3 = 38
            if (r2 < r3) goto Lc3
            int r2 = r9.readInt()
        La7:
            if (r4 >= r2) goto Lc3
            int r3 = r9.readInt()
            org.fortheloss.sticknodes.stickfigure.INode r3 = r8.getNodeAtDrawOrderIndex(r3)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            int r5 = r9.readInt()
            org.fortheloss.sticknodes.stickfigure.INode r5 = r8.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r3.changeEndNode(r5)
            int r4 = r4 + 1
            goto La7
        Lc3:
            java.lang.Class<java.util.Stack> r9 = java.util.Stack.class
            java.lang.Object r9 = com.badlogic.gdx.utils.Pools.obtain(r9)
            java.util.Stack r9 = (java.util.Stack) r9
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r8._mainNode
            r9.add(r2)
        Ld0:
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L10c
            java.lang.Object r2 = r9.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            boolean r3 = r2.isMainNode()
            if (r3 != 0) goto Lf1
            boolean r3 = r2.getIsAngleLocked()
            if (r3 == 0) goto Lf1
            boolean r3 = r2.getAngleLockIsMainNode()
            if (r3 != 0) goto Lf1
            r2.updateAngleLock(r1)
        Lf1:
            java.util.ArrayList r3 = r2.getChildrenNodes()
            int r3 = r3.size()
            int r3 = r3 - r1
        Lfa:
            if (r3 < 0) goto Ld0
            java.util.ArrayList r4 = r2.getChildrenNodes()
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r9.add(r4)
            int r3 = r3 + (-1)
            goto Lfa
        L10c:
            r9.clear()
            com.badlogic.gdx.utils.Pools.free(r9)
            r9 = 248(0xf8, float:3.48E-43)
            if (r0 < r9) goto L11d
            r9 = 251(0xfb, float:3.52E-43)
            if (r0 > r9) goto L11d
            r8.apply252SmartStretchFix()
        L11d:
            return
        L11e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Stickfigure version is out of bounds. Might be an old file?"
            r9.<init>(r0)
            throw r9
    }

    public void readDataOld(java.nio.ByteBuffer r7) {
            r6 = this;
            int r0 = r7.getInt()
            float r1 = r7.getFloat()
            r6._scale = r1
            int r1 = r7.getInt()
            com.badlogic.gdx.graphics.Color r2 = r6._color
            r3 = r1 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            int r5 = r1 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r4
            int r1 = r1 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.set(r3, r5, r1, r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r6._mainNode
            r1.beginReadingDataOld(r0, r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r6._mainNode
            int r7 = r7.getDescendantCount()
            r0 = 0
        L33:
            if (r0 >= r7) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r6._drawOrderedNodeRefs
            r2 = 0
            r1.add(r2)
            int r0 = r0 + 1
            goto L33
        L3e:
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r6._mainNode
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r6._drawOrderedNodeRefs
            r7.putAllIntoDrawOrderArray(r0)
            return
    }

    public void readPositionalData(int r18, int r19, java.io.DataInputStream r20) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r20.readInt()
            r0._id = r3
            float r3 = r20.readFloat()
            r0._scale = r3
            r3 = 220(0xdc, float:3.08E-43)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 < r3) goto L1d
            float r5 = r20.readFloat()
            goto L1f
        L1d:
            r5 = 1065353216(0x3f800000, float:1.0)
        L1f:
            r0._transparency = r5
            r5 = 0
            if (r1 < r3) goto L29
            float r6 = r20.readFloat()
            goto L2a
        L29:
            r6 = 0
        L2a:
            r0._blur = r6
            r6 = 16
            r7 = 1
            r8 = 0
            if (r2 < r6) goto L4f
            int r9 = r20.read()
            if (r9 == 0) goto L3a
            r9 = 1
            goto L3b
        L3a:
            r9 = 0
        L3b:
            r0._isMotionBlur = r9
            int r9 = r20.read()
            if (r9 == 0) goto L45
            r9 = 1
            goto L46
        L45:
            r9 = 0
        L46:
            r0._motionBlurIsOneDirection = r9
            int r9 = r20.readInt()
            r0._motionBlurAngle = r9
            goto L85
        L4f:
            if (r1 < r3) goto L59
            int r9 = r20.read()
            if (r9 == 0) goto L59
            r9 = 1
            goto L5a
        L59:
            r9 = 0
        L5a:
            if (r1 < r3) goto L64
            int r10 = r20.read()
            if (r10 == 0) goto L64
            r10 = 1
            goto L65
        L64:
            r10 = 0
        L65:
            if (r9 == 0) goto L6e
            if (r10 != 0) goto L6e
            r0._isMotionBlur = r7
            r0._motionBlurAngle = r8
            goto L83
        L6e:
            if (r9 != 0) goto L79
            if (r10 == 0) goto L79
            r0._isMotionBlur = r7
            r9 = 90
            r0._motionBlurAngle = r9
            goto L83
        L79:
            if (r9 != 0) goto L83
            if (r10 != 0) goto L83
            r0._isMotionBlur = r8
            r0._motionBlurAngle = r8
            r0._blur = r5
        L83:
            r0._motionBlurIsOneDirection = r8
        L85:
            if (r1 < r3) goto L8c
            float r9 = r20.readFloat()
            goto L8e
        L8c:
            r9 = 1065353216(0x3f800000, float:1.0)
        L8e:
            r0._saturation = r9
            if (r2 < r6) goto L97
            int r9 = r20.readInt()
            goto L98
        L97:
            r9 = 1
        L98:
            r0._pixelation = r9
            r9 = -1
            if (r1 < r3) goto La2
            int r10 = r20.readInt()
            goto La3
        La2:
            r10 = -1
        La3:
            com.badlogic.gdx.graphics.Color r11 = r0._tintColor
            r12 = r10 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 / r13
            int r14 = r10 >> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            float r14 = r14 / r13
            int r10 = r10 >> r6
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r13
            r11.set(r12, r14, r10, r4)
            if (r1 < r3) goto Lc0
            float r10 = r20.readFloat()
            goto Lc1
        Lc0:
            r10 = 0
        Lc1:
            r0._tintAmount = r10
            r10 = 303(0x12f, float:4.25E-43)
            if (r1 < r10) goto Lcc
            float r10 = r20.readFloat()
            goto Lcd
        Lcc:
            r10 = 0
        Lcd:
            r0._hueShift = r10
            if (r1 < r3) goto Ld9
            int r3 = r20.read()
            if (r3 == 0) goto Ld9
            r3 = 1
            goto Lda
        Ld9:
            r3 = 0
        Lda:
            r0._colorIsInverted = r3
            r3 = 230(0xe6, float:3.22E-43)
            if (r1 < r3) goto Le5
            float r10 = r20.readFloat()
            goto Le6
        Le5:
            r10 = 0
        Le6:
            r0._glow = r10
            if (r1 < r3) goto Lee
            int r9 = r20.readInt()
        Lee:
            com.badlogic.gdx.graphics.Color r10 = r0._glowColor
            r11 = r9 & 255(0xff, float:3.57E-43)
            float r11 = (float) r11
            float r11 = r11 / r13
            int r12 = r9 >> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            int r9 = r9 >> r6
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r13
            r10.set(r11, r12, r9, r4)
            r9 = 242(0xf2, float:3.39E-43)
            if (r1 < r9) goto L10b
            float r9 = r20.readFloat()
            goto L10d
        L10b:
            r9 = 1065353216(0x3f800000, float:1.0)
        L10d:
            r0._glowIntensity = r9
            r9 = 32
            if (r2 < r9) goto L137
            int r9 = r20.readInt()
            com.badlogic.gdx.graphics.Color r10 = r0._outlineColor
            r11 = r9 & 255(0xff, float:3.57E-43)
            float r11 = (float) r11
            float r11 = r11 / r13
            int r12 = r9 >> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            int r9 = r9 >> r6
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r13
            r10.set(r11, r12, r9, r4)
            float r9 = r20.readFloat()
            r0._outlineAlpha = r9
            float r9 = r20.readFloat()
            r0._outlineThickness = r9
        L137:
            r9 = 330(0x14a, float:4.62E-43)
            if (r1 < r9) goto L140
            int r10 = r20.readInt()
            goto L142
        L140:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L142:
            com.badlogic.gdx.graphics.Color r11 = r0._dsColor
            r12 = r10 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            int r14 = r10 >> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            float r14 = r14 / r13
            int r10 = r10 >> r6
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r13
            r11.set(r12, r14, r10, r4)
            if (r1 < r9) goto L15d
            float r10 = r20.readFloat()
            goto L15e
        L15d:
            r10 = 0
        L15e:
            r0._dsAlpha = r10
            r10 = 10
            if (r1 < r9) goto L169
            int r11 = r20.readInt()
            goto L16b
        L169:
            r11 = 10
        L16b:
            r0._dsDistance = r11
            r11 = 135(0x87, float:1.89E-43)
            if (r1 < r9) goto L176
            int r12 = r20.readInt()
            goto L178
        L176:
            r12 = 135(0x87, float:1.89E-43)
        L178:
            r0._dsAngle = r12
            if (r1 < r9) goto L181
            float r9 = r20.readFloat()
            goto L183
        L181:
            r9 = 1056964608(0x3f000000, float:0.5)
        L183:
            r0._dsBlur = r9
            com.badlogic.gdx.math.Vector2 r9 = r0._position
            float r14 = r20.readFloat()
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r15
            float r15 = r20.readFloat()
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r15 * r16
            r9.set(r14, r15)
            int r9 = r20.readInt()
            com.badlogic.gdx.graphics.Color r14 = r0._color
            r15 = r9 & 255(0xff, float:3.57E-43)
            float r15 = (float) r15
            float r15 = r15 / r13
            int r12 = r9 >> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            int r6 = r9 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r13
            r14.set(r15, r12, r6, r4)
            r6 = 126(0x7e, float:1.77E-43)
            if (r1 < r6) goto L1bf
            int r6 = r20.read()
            if (r6 == 0) goto L1bf
            r6 = 1
            goto L1c0
        L1bf:
            r6 = 0
        L1c0:
            r0._isLocked = r6
            r6 = 180(0xb4, float:2.52E-43)
            if (r1 < r6) goto L1ce
            int r6 = r20.read()
            if (r6 == 0) goto L1ce
            r6 = 1
            goto L1cf
        L1ce:
            r6 = 0
        L1cf:
            r0._isPersistentWhenTweening = r6
            r6 = 15
            if (r2 < r6) goto L1de
            int r6 = r20.read()
            if (r6 == 0) goto L1dc
            goto L1de
        L1dc:
            r6 = 0
            goto L1df
        L1de:
            r6 = 1
        L1df:
            r0.mVisibleInOnionSkin = r6
            if (r1 < r3) goto L1eb
            int r6 = r20.read()
            if (r6 == 0) goto L1eb
            r6 = 1
            goto L1ec
        L1eb:
            r6 = 0
        L1ec:
            r0._isTweeningColors = r6
            if (r1 < r3) goto L205
            r3 = 77
            if (r2 > r3) goto L205
            int r3 = r20.read()
            if (r3 == 0) goto L1fc
            r3 = 1
            goto L1fd
        L1fc:
            r3 = 0
        L1fd:
            if (r3 != 0) goto L202
            r0.mTweenMode = r8
            goto L20f
        L202:
            r0.mTweenMode = r7
            goto L20f
        L205:
            r3 = 78
            if (r2 < r3) goto L20f
            byte r3 = r20.readByte()
            r0.mTweenMode = r3
        L20f:
            r3 = 244(0xf4, float:3.42E-43)
            if (r1 < r3) goto L21b
            int r3 = r20.read()
            if (r3 == 0) goto L21b
            r3 = 1
            goto L21c
        L21b:
            r3 = 0
        L21c:
            r0._scaleJoinedStickfigures = r3
            r3 = 400(0x190, float:5.6E-43)
            if (r1 < r3) goto L22a
            int r6 = r20.read()
            if (r6 == 0) goto L22a
            r6 = 1
            goto L22b
        L22a:
            r6 = 0
        L22b:
            r0._pushJoinedStickfigures = r6
            if (r1 < r3) goto L237
            int r6 = r20.read()
            if (r6 == 0) goto L237
            r6 = 1
            goto L238
        L237:
            r6 = 0
        L238:
            r0._setStateOfJoins = r6
            if (r1 < r3) goto L241
            int r3 = r20.readInt()
            goto L242
        L241:
            r3 = 0
        L242:
            r0._stateIndexOfJoins = r3
            r3 = 310(0x136, float:4.34E-43)
            if (r1 < r3) goto L250
            int r3 = r20.read()
            if (r3 == 0) goto L250
            r3 = 1
            goto L251
        L250:
            r3 = 0
        L251:
            r0._isUsingJoinParentFilters = r3
            r3 = 248(0xf8, float:3.48E-43)
            if (r1 < r3) goto L282
            int r3 = r20.readInt()
            r0._lockedStickNodeIndex = r3
            r3 = 251(0xfb, float:3.52E-43)
            if (r1 < r3) goto L276
            float r3 = r20.readFloat()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r6
            r0._lockedNodeX = r3
            float r3 = r20.readFloat()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r6
            r0._lockedNodeY = r3
            goto L282
        L276:
            float r3 = r20.readFloat()
            r0._lockedNodeX = r3
            float r3 = r20.readFloat()
            r0._lockedNodeY = r3
        L282:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 != 0) goto L2c7
            r0._colorIsInverted = r8
            r0._tintAmount = r5
            com.badlogic.gdx.graphics.Color r3 = r0._tintColor
            r3.set(r4, r4, r4, r4)
            r0._hueShift = r5
            r0._saturation = r4
            r0._pixelation = r7
            r0._blur = r5
            r0._isMotionBlur = r8
            r0._motionBlurIsOneDirection = r8
            r0._motionBlurAngle = r8
            r0._glow = r5
            com.badlogic.gdx.graphics.Color r3 = r0._glowColor
            r6 = 1058444951(0x3f169697, float:0.5882353)
            r3.set(r5, r6, r4, r4)
            r0._glowIntensity = r4
            com.badlogic.gdx.graphics.Color r3 = r0._outlineColor
            r3.set(r4, r5, r6, r4)
            r0._outlineAlpha = r4
            r0._outlineThickness = r5
            com.badlogic.gdx.graphics.Color r3 = r0._dsColor
            r3.set(r5, r5, r5, r4)
            r0._dsAlpha = r5
            r0._dsDistance = r10
            r0._dsAngle = r11
            r3 = 1056964608(0x3f000000, float:0.5)
            r0._dsBlur = r3
            r0._isUsingJoinParentFilters = r8
        L2c7:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r0._mainNode
            r4 = r20
            r3.beginReadingPositionalData(r1, r2, r4)
            r17.validateDirtyNodes()
            return
    }

    public void readPositionalDataOld(int r10, java.nio.ByteBuffer r11) {
            r9 = this;
            int r0 = r11.getInt()
            r9._id = r0
            float r0 = r11.getFloat()
            r9._scale = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r9._transparency = r0
            r1 = 0
            r9._blur = r1
            r2 = 0
            r9._isMotionBlur = r2
            r9._motionBlurIsOneDirection = r2
            r9._motionBlurAngle = r2
            r9._saturation = r0
            r3 = 1
            r9._pixelation = r3
            com.badlogic.gdx.graphics.Color r4 = r9._tintColor
            r4.set(r0, r0, r0, r0)
            r9._tintAmount = r1
            r9._hueShift = r1
            r9._colorIsInverted = r2
            r9._glow = r1
            com.badlogic.gdx.graphics.Color r4 = r9._glowColor
            r5 = 1058444951(0x3f169697, float:0.5882353)
            r4.set(r1, r5, r0, r0)
            r9._glowIntensity = r0
            com.badlogic.gdx.graphics.Color r4 = r9._outlineColor
            r4.set(r0, r1, r5, r0)
            r9._outlineAlpha = r0
            r9._outlineThickness = r1
            com.badlogic.gdx.graphics.Color r4 = r9._dsColor
            r4.set(r1, r1, r1, r0)
            r9._dsAlpha = r1
            r4 = 10
            r9._dsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r9._dsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r9._dsBlur = r4
            com.badlogic.gdx.math.Vector2 r4 = r9._position
            float r5 = r11.getFloat()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            float r6 = r11.getFloat()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r7
            r4.set(r5, r6)
            int r4 = r11.getInt()
            com.badlogic.gdx.graphics.Color r5 = r9._color
            r6 = r4 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            r7 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r7
            int r8 = r4 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r7
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r7
            r5.set(r6, r8, r4, r0)
            r0 = 126(0x7e, float:1.77E-43)
            if (r10 < r0) goto L8e
            byte r0 = r11.get()
            if (r0 == 0) goto L8e
            r0 = 1
            goto L8f
        L8e:
            r0 = 0
        L8f:
            r9._isLocked = r0
            r0 = 180(0xb4, float:2.52E-43)
            if (r10 < r0) goto L9d
            byte r0 = r11.get()
            if (r0 == 0) goto L9d
            r0 = 1
            goto L9e
        L9d:
            r0 = 0
        L9e:
            r9._isPersistentWhenTweening = r0
            r9.mVisibleInOnionSkin = r3
            r9._isTweeningColors = r2
            r9.mTweenMode = r3
            r9._scaleJoinedStickfigures = r2
            r9._pushJoinedStickfigures = r2
            r9._setStateOfJoins = r2
            r9._stateIndexOfJoins = r2
            r9._isUsingJoinParentFilters = r2
            r9._lockedStickNodeIndex = r2
            r9._lockedNodeX = r1
            r9._lockedNodeY = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r9._mainNode
            r0.beginReadingPositionalDataOld(r10, r11)
            r9.validateDirtyNodes()
            return
    }

    public void recalculatePolyfills() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyfillAnchorNodes
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L1b
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._polyfillAnchorNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.flagPolyfillAsDirty()
            int r0 = r0 + (-1)
            goto Lb
        L1b:
            return
    }

    public void reconstructConnectorsAfterNodeDeleteUndoRedo(org.fortheloss.sticknodes.data.useractions.StickfigureConnectorData r5) {
            r4 = this;
            java.util.ArrayList r0 = r5.getConnectorIds()
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L46
            java.util.ArrayList r1 = r5.getConnectorIds()
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.ArrayList r2 = r5.getConnectorEndpoints()
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            org.fortheloss.sticknodes.stickfigure.INode r1 = r4.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L43
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r1.getEndNode()
            if (r3 != 0) goto L43
            org.fortheloss.sticknodes.stickfigure.INode r2 = r4.getNodeAtDrawOrderIndex(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r1.changeEndNode(r2)
        L43:
            int r0 = r0 + (-1)
            goto La
        L46:
            return
    }

    public void reconstructPolyfillAfterNodeDeleteUndoRedo(org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r9) {
            r8 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r8._polyfillAnchorNodes
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r8._polyfillAnchorNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.deletePolyAnchor()
            int r0 = r0 + (-1)
            goto La
        L1a:
            int[] r0 = r9.getPolyfillAnchorIDs()
            int[][] r9 = r9.getPolyfillAnchorPolynodeIDs()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L25:
            if (r3 >= r1) goto L4b
            r4 = r0[r3]
            org.fortheloss.sticknodes.stickfigure.INode r4 = r8.getNodeAtDrawOrderIndex(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.convertToPolyAnchor()
            r5 = r9[r3]
            int r5 = r5.length
            r6 = 0
        L36:
            if (r6 >= r5) goto L48
            r7 = r9[r3]
            r7 = r7[r6]
            org.fortheloss.sticknodes.stickfigure.INode r7 = r8.getNodeAtDrawOrderIndex(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            r4.addPolynodeChild(r7)
            int r6 = r6 + 1
            goto L36
        L48:
            int r3 = r3 + 1
            goto L25
        L4b:
            return
    }

    public void removeAllJoinedFigures() {
            r2 = this;
            boolean r0 = r2._hasJoinAnchorNode
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._joinAnchorNodeRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._joinAnchorNodeRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.removeAllJoinedFigures()
            int r0 = r0 + (-1)
            goto Ld
        L1d:
            return
    }

    public void removeConnector(org.fortheloss.sticknodes.stickfigure.Connector r2) {
            r1 = this;
            boolean r0 = r1.hasConnectors()
            if (r0 == 0) goto L22
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorRefs
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r2 = r1.mConnectorRefs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L19
            r2 = 0
            r1.mConnectorRefs = r2
        L19:
            return
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The Stickfigure does not have a reference to this Connector!"
            r2.<init>(r0)
            throw r2
        L22:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The Stickfigure has no Connectors!"
            r2.<init>(r0)
            throw r2
    }

    public void removeJoinAnchor(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._joinAnchorNodeRefs
            if (r0 == 0) goto L23
            int r0 = r0.size()
            if (r0 == 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._drawOrderedNodeRefs
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._joinAnchorNodeRefs
            r0.remove(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._joinAnchorNodeRefs
            int r2 = r2.size()
            if (r2 != 0) goto L22
            r2 = 0
            r1._hasJoinAnchorNode = r2
        L22:
            return
        L23:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove join anchor node, this stickfigure has none."
            r2.<init>(r0)
            throw r2
    }

    public void removeNodeFromDrawOrder(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._drawOrderedNodeRefs
            r0.remove(r2)
            r1.recalculateNodeDrawOrder()
            return
    }

    public void removePolyfillAnchorNode(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyfillAnchorNodes
            if (r0 == 0) goto L1e
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L16
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._polyfillAnchorNodes
            int r2 = r2.size()
            if (r2 > 0) goto L15
            r2 = 0
            r1._polyfillAnchorNodes = r2
        L15:
            return
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove this polygon anchor, as the stickfigure reports it isn't an anchor, something went wrong."
            r2.<init>(r0)
            throw r2
        L1e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove a polygon anchor, as the stickfigure reports there are none, something went wrong."
            r2.<init>(r0)
            throw r2
    }

    public com.badlogic.gdx.math.Vector2 repositionBasedOnLockedStickNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
            com.badlogic.gdx.math.Vector2 r0 = r1.repositionBasedOnLockedStickNode(r0)
            return r0
    }

    public com.badlogic.gdx.math.Vector2 repositionBasedOnLockedStickNode(org.fortheloss.sticknodes.stickfigure.StickNode r7) {
            r6 = this;
            java.lang.Class<java.util.Stack> r7 = java.util.Stack.class
            java.lang.Object r7 = com.badlogic.gdx.utils.Pools.obtain(r7)
            java.util.Stack r7 = (java.util.Stack) r7
            r7.add(r6)
        Lb:
            boolean r0 = r7.isEmpty()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L62
            java.lang.Object r0 = r7.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r0.validateDirtyNodes()
            int r1 = r0._lockedStickNodeIndex
            if (r1 <= 0) goto L29
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0.getLockedStickNode()
            float r3 = r0._lockedNodeX
            float r0 = r0._lockedNodeY
            goto L65
        L29:
            boolean r1 = r0.hasJoinAnchorNode()
            if (r1 == 0) goto Lb
            java.util.ArrayList r0 = r0.getJoinAnchorNodes()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L39:
            if (r1 < 0) goto Lb
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList r2 = r2.getJoinedFigures()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L4b:
            if (r3 < 0) goto L5f
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L5c
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            r7.add(r4)
        L5c:
            int r3 = r3 + (-1)
            goto L4b
        L5f:
            int r1 = r1 + (-1)
            goto L39
        L62:
            r1 = r2
            r0 = 0
            r3 = 0
        L65:
            r7.clear()
            com.badlogic.gdx.utils.Pools.free(r7)
            if (r1 == 0) goto L88
            r6.validateDirtyNodes()
            r7 = r6
        L71:
            boolean r2 = r7.isJoined()
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r7.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r7.getStickfigure()
            r7.validateDirtyNodes()
            goto L71
        L83:
            com.badlogic.gdx.math.Vector2 r7 = r6.actuallyRepositionBasedOnLockedStickNode(r7, r1, r3, r0)
            return r7
        L88:
            return r2
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
            boolean r0 = r2.isJoined()
            if (r0 == 0) goto L1f
            float r0 = r2.getJoinOffsetAngle()
            float r0 = r0 + r3
            r2.setJoinOffsetAngle(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            r3.flagPositionAsDirty()
            goto L2b
        L1f:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._mainNode
            float r0 = r0.getLocalAngle()
            float r0 = r0 + r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._mainNode
            r3.setAngle(r0)
        L2b:
            return
    }

    public void sendBranchToBack(org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r5 = this;
            int r0 = r6.getDescendantCount()
            r1 = 1
            int r0 = r0 + r1
            if (r0 != r1) goto Lc
            r5.sendSegmentToBack(r6)
            return
        Lc:
            org.fortheloss.sticknodes.stickfigure.StickNode[] r2 = new org.fortheloss.sticknodes.stickfigure.StickNode[r0]
            r6.addDescendantsToArray(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure$1 r6 = new org.fortheloss.sticknodes.stickfigure.Stickfigure$1
            r6.<init>(r5)
            java.util.Arrays.sort(r2, r6)
            int r0 = r0 - r1
            r6 = r0
        L1b:
            if (r6 < 0) goto L2e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r5._drawOrderedNodeRefs
            r4 = r2[r6]
            int r4 = r4.getDrawOrderIndex()
            r3.remove(r4)
            r5.recalculateNodeDrawOrder()
            int r6 = r6 + (-1)
            goto L1b
        L2e:
            if (r0 < 0) goto L3a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r6 = r5._drawOrderedNodeRefs
            r3 = r2[r0]
            r6.add(r1, r3)
            int r0 = r0 + (-1)
            goto L2e
        L3a:
            r5.recalculateNodeDrawOrder()
            return
    }

    public void sendBranchToFront(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            int r0 = r5.getDescendantCount()
            r1 = 1
            int r0 = r0 + r1
            if (r0 != r1) goto Lc
            r4.sendSegmentToFront(r5)
            return
        Lc:
            org.fortheloss.sticknodes.stickfigure.StickNode[] r1 = new org.fortheloss.sticknodes.stickfigure.StickNode[r0]
            r5.addDescendantsToArray(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure$2 r5 = new org.fortheloss.sticknodes.stickfigure.Stickfigure$2
            r5.<init>(r4)
            java.util.Arrays.sort(r1, r5)
            int r5 = r0 + (-1)
        L1b:
            if (r5 < 0) goto L2e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r4._drawOrderedNodeRefs
            r3 = r1[r5]
            int r3 = r3.getDrawOrderIndex()
            r2.remove(r3)
            r4.recalculateNodeDrawOrder()
            int r5 = r5 + (-1)
            goto L1b
        L2e:
            r5 = 0
        L2f:
            if (r5 >= r0) goto L3b
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r4._drawOrderedNodeRefs
            r3 = r1[r5]
            r2.add(r3)
            int r5 = r5 + 1
            goto L2f
        L3b:
            r4.recalculateNodeDrawOrder()
            return
    }

    public boolean sendSegmentToBack(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            boolean r0 = r3.isMainNode()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r3 = r3.getDrawOrderIndex()
            r0 = 1
            if (r3 > r0) goto L10
            return r1
        L10:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._drawOrderedNodeRefs
            java.lang.Object r3 = r1.remove(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r1.add(r0, r3)
            r2.recalculateNodeDrawOrder()
            return r0
    }

    public boolean sendSegmentToFront(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            boolean r0 = r4.isMainNode()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r4 = r4.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._drawOrderedNodeRefs
            int r0 = r0.size()
            r2 = 1
            int r0 = r0 - r2
            if (r4 != r0) goto L17
            return r1
        L17:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._drawOrderedNodeRefs
            java.lang.Object r4 = r0.remove(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.add(r4)
            r3.recalculateNodeDrawOrder()
            return r2
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

    public void setColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._color
            r0.set(r2)
            com.badlogic.gdx.graphics.Color r2 = r1._color
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.a = r0
            return
    }

    public void setDefaults() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._mainNode
            r0.setDefaults()
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
            boolean r0 = r2.isJoined()
            if (r0 == 0) goto L1a
            r2.setJoinOffsetAngle(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            r3.flagPositionAsDirty()
            goto L1f
        L1a:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._mainNode
            r0.setAngle(r3)
        L1f:
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
            r3._motionBlurIsOneDirection = r0
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
            r3._motionBlurIsOneDirection = r0
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
    public void setLibraryID(int r1) {
            r0 = this;
            r0._libraryID = r1
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
            r0._motionBlurIsOneDirection = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0._name = r1
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

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setPosition(float r2, float r3) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            r0.set(r2, r3)
            boolean r2 = r1._hasJoinAnchorNode
            if (r2 == 0) goto Le
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r1._mainNode
            r2.flagPositionAsDirty()
        Le:
            return
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.StickfigureProperties r8) {
            r7 = this;
            com.badlogic.gdx.math.Vector2 r0 = r7._position
            float r1 = r8.x
            r0.x = r1
            float r1 = r8.y
            r0.y = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7._mainNode
            r0.flagPositionAsDirty()
            float r0 = r7._scale
            float r1 = r8.scale
            r7._scale = r1
            boolean r2 = r7._scaleJoinedStickfigures
            if (r2 == 0) goto L79
            boolean r2 = r7._hasJoinAnchorNode
            if (r2 == 0) goto L79
            float r1 = r1 / r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._joinAnchorNodeRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L79
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r7._joinAnchorNodeRefs
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList r3 = r2.getJoinedFigures()
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L3a:
            if (r3 < 0) goto L76
            java.util.ArrayList r4 = r2.getJoinedFigures()
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L6a
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = (org.fortheloss.sticknodes.sprite.SpriteRef) r4
            boolean r5 = r4.getScaleLinked()
            r6 = 0
            r4.setScaleLinked(r6)
            float r6 = r4.getScaleX()
            float r6 = r6 * r1
            r4.setScaleX(r6)
            float r6 = r4.getScaleY()
            float r6 = r6 * r1
            r4.setScaleY(r6)
            r4.setScaleLinked(r5)
            goto L73
        L6a:
            float r5 = r4.getScale()
            float r5 = r5 * r1
            r4.setScale(r5)
        L73:
            int r3 = r3 + (-1)
            goto L3a
        L76:
            int r0 = r0 + (-1)
            goto L26
        L79:
            float r0 = r8.transparency
            r7._transparency = r0
            float r0 = r8.blur
            r7._blur = r0
            boolean r0 = r8.isMotionBlur
            r7._isMotionBlur = r0
            boolean r0 = r8.motionBlurIsOmniDirectional
            r7._motionBlurIsOneDirection = r0
            int r0 = r8.motionBlurAngle
            r7._motionBlurAngle = r0
            float r0 = r8.saturation
            r7._saturation = r0
            int r0 = r8.pixelation
            r7._pixelation = r0
            com.badlogic.gdx.graphics.Color r0 = r7._tintColor
            com.badlogic.gdx.graphics.Color r1 = r8.tintColor
            r0.set(r1)
            float r0 = r8.tintAmount
            r7._tintAmount = r0
            float r0 = r8.hueShift
            r7._hueShift = r0
            boolean r0 = r8.colorIsInverted
            r7._colorIsInverted = r0
            float r0 = r8.glow
            r7._glow = r0
            com.badlogic.gdx.graphics.Color r0 = r7._glowColor
            com.badlogic.gdx.graphics.Color r1 = r8.glowColor
            r0.set(r1)
            float r0 = r8.glowIntensity
            r7._glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r7._outlineColor
            com.badlogic.gdx.graphics.Color r1 = r8.outlineColor
            r0.set(r1)
            float r0 = r8.outlineAlpha
            r7._outlineAlpha = r0
            float r0 = r8.outlineThickness
            r7._outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r7._dsColor
            com.badlogic.gdx.graphics.Color r1 = r8.dsColor
            r0.set(r1)
            float r0 = r8.dsAlpha
            r7._dsAlpha = r0
            int r0 = r8.dsDistance
            r7._dsDistance = r0
            int r0 = r8.dsAngle
            r7._dsAngle = r0
            float r0 = r8.dsBlur
            r7._dsBlur = r0
            com.badlogic.gdx.graphics.Color r0 = r7._color
            com.badlogic.gdx.graphics.Color r1 = r8.color
            r0.set(r1)
            boolean r0 = r8.isLocked
            r7._isLocked = r0
            boolean r0 = r8.isPersistentWhenTweening
            r7._isPersistentWhenTweening = r0
            boolean r0 = r8.visibleInOnionSkin
            r7.mVisibleInOnionSkin = r0
            boolean r0 = r8.isTweeningColors
            r7._isTweeningColors = r0
            byte r0 = r8.mTweenMode
            r7.mTweenMode = r0
            boolean r0 = r8.scaleJoinedStickfigures
            r7._scaleJoinedStickfigures = r0
            boolean r0 = r8.pushJoinedStickfigures
            r7._pushJoinedStickfigures = r0
            boolean r0 = r8.setStateOfJoins
            r7._setStateOfJoins = r0
            int r0 = r8.joinsState
            r7._stateIndexOfJoins = r0
            boolean r0 = r8.isUsingJoinParentFilters
            r7._isUsingJoinParentFilters = r0
            float r0 = r8.mJoinOffsetAngle
            r7.mJoinOffsetAngle = r0
            int r0 = r8.lockedStickNodeIndex
            r7._lockedStickNodeIndex = r0
            float r0 = r8.lockedNodeX
            r7._lockedNodeX = r0
            float r8 = r8.lockedNodeY
            r7._lockedNodeY = r8
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r7._joinedToNodeRef
            if (r8 == 0) goto L14f
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r8.getStickfigure()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r0.add(r8)
        L12c:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L144
            java.lang.Object r8 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r8
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r8._joinedToNodeRef
            if (r1 == 0) goto L12c
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            r0.add(r1)
            goto L12c
        L144:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r8._mainNode
            r0.flagPositionAsDirty()
            r8.validateDirtyNodes()
            r8.repositionBasedOnLockedStickNode()
        L14f:
            return
    }

    public void setPushJoinedFigures(boolean r1) {
            r0 = this;
            r0._pushJoinedStickfigures = r1
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
    public void setScale(float r7) {
            r6 = this;
            float r0 = r6._scale
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r7 = 1008981770(0x3c23d70a, float:0.01)
        La:
            r6._scale = r7
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 >= 0) goto L16
            r6._scale = r1
            goto L1e
        L16:
            r1 = 1101004800(0x41a00000, float:20.0)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L1e
            r6._scale = r1
        L1e:
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r6._mainNode
            r7.flagPositionAsDirty()
            boolean r7 = r6._scaleJoinedStickfigures
            if (r7 == 0) goto L89
            boolean r7 = r6._hasJoinAnchorNode
            if (r7 == 0) goto L89
            float r7 = r6._scale
            float r7 = r7 / r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r6._joinAnchorNodeRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L89
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r6._joinAnchorNodeRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            java.util.ArrayList r2 = r1.getJoinedFigures()
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L4a:
            if (r2 < 0) goto L86
            java.util.ArrayList r3 = r1.getJoinedFigures()
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L7a
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            boolean r4 = r3.getScaleLinked()
            r5 = 0
            r3.setScaleLinked(r5)
            float r5 = r3.getScaleX()
            float r5 = r5 * r7
            r3.setScaleX(r5)
            float r5 = r3.getScaleY()
            float r5 = r5 * r7
            r3.setScaleY(r5)
            r3.setScaleLinked(r4)
            goto L83
        L7a:
            float r4 = r3.getScale()
            float r4 = r4 * r7
            r3.setScale(r4)
        L83:
            int r2 = r2 + (-1)
            goto L4a
        L86:
            int r0 = r0 + (-1)
            goto L36
        L89:
            r6.repositionBasedOnLockedStickNode()
            return
    }

    public void setScaleJoinedStickfigures(boolean r1) {
            r0 = this;
            r0._scaleJoinedStickfigures = r1
            return
    }

    public void setSmartStretchEnabled(boolean r1) {
            r0 = this;
            r0._smartStretchEnabled = r1
            return
    }

    public void setStateIndexOfJoins(int r1) {
            r0 = this;
            r0._stateIndexOfJoins = r1
            r0.updateJoinsState()
            return
    }

    public void setStateOfJoins(boolean r1) {
            r0 = this;
            r0._setStateOfJoins = r1
            r0.updateJoinsState()
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
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._transparency = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L16
            r2._transparency = r0
            goto L1e
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1e
            r2._transparency = r0
        L1e:
            return
    }

    public void setTweenColors(boolean r1) {
            r0 = this;
            r0._isTweeningColors = r1
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

    public boolean smartStretchIsEnabled() {
            r1 = this;
            boolean r0 = r1._smartStretchEnabled
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void unjoin() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._joinedToNodeRef
            if (r0 == 0) goto L11
            r1 = 0
            r2._isJoined = r1
            r0.removeJoinedFigure(r2)
            r0 = 0
            r2._joinedToNodeRef = r0
            r2.setLocked(r1)
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't unjoin, this stickfigure is not joined to anything."
            r0.<init>(r1)
            throw r0
    }

    public void unlockStickNode() {
            r1 = this;
            r0 = -1
            r1._lockedStickNodeIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void validateDirtyNodes() {
            r3 = this;
            boolean r0 = r3._hasDirtyNodes
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r3._hasDirtyNodes = r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3._dirtyNodeRefs
            int r1 = r1.size()
        Le:
            if (r0 >= r1) goto L1e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r3._dirtyNodeRefs
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r2.validatePosition()
            int r0 = r0 + 1
            goto Le
        L1e:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._dirtyNodeRefs
            r0.clear()
            return
    }

    public void writeData(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 425(0x1a9, float:5.96E-43)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            r0 = 100
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            float r0 = r5._scale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            com.badlogic.gdx.graphics.Color r0 = r5._color
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._mainNode
            r0.beginWritingData(r6)
            boolean r0 = r5.hasPolyfillAnchorNode()
            r1 = 0
            if (r0 == 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r5._polyfillAnchorNodes
            int r2 = r2.size()
            goto L2c
        L2b:
            r2 = 0
        L2c:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r6)
            if (r0 == 0) goto L4f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._polyfillAnchorNodes
            int r0 = r0.size()
            r2 = 0
        L38:
            if (r2 >= r0) goto L4f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r5._polyfillAnchorNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            int r4 = r3.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
            r3.writePolyfillAnchorData(r6)
            int r2 = r2 + 1
            goto L38
        L4f:
            boolean r0 = r5.hasConnectors()
            if (r0 == 0) goto L5c
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r2 = r5.mConnectorRefs
            int r2 = r2.size()
            goto L5d
        L5c:
            r2 = 0
        L5d:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r6)
            if (r0 == 0) goto L87
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r5.mConnectorRefs
            int r0 = r0.size()
        L68:
            if (r1 >= r0) goto L87
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r2 = r5.mConnectorRefs
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.Connector r2 = (org.fortheloss.sticknodes.stickfigure.Connector) r2
            int r3 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getEndNode()
            int r2 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r6)
            int r1 = r1 + 1
            goto L68
        L87:
            return
    }
}
