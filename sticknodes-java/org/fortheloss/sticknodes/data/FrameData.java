package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class FrameData implements com.badlogic.gdx.utils.Disposable, org.fortheloss.sticknodes.data.IFrameData {
    private static java.util.ArrayList<java.lang.Integer> _animatingDuringDelayMCKeyframes;
    private static org.fortheloss.sticknodes.animationscreen.FrameCamera _tempFrameCamera;
    private static java.util.ArrayList<java.lang.Integer> _tweenedDuringDelayMCIndices;
    private org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle _autoCameraBundle;
    private com.badlogic.gdx.graphics.Color _backgroundColor;
    private boolean _cameraIsMovingDuringDelay;
    private boolean _cameraMoveDuringDelayEaseIn;
    private boolean _cameraMoveDuringDelayEaseOut;
    private short _cameraMoveDuringDelayInterpolationID;
    private com.badlogic.gdx.math.Interpolation _cameraMoveDuringDelayInterpolationRef;
    private float _delaySeconds;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _drawableFigures;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCamera;
    private com.badlogic.gdx.graphics.Color _gradientColor;
    private boolean _isDelayed;
    private boolean _isExpandedGradient;
    private boolean _isFirstFrame;
    private boolean _isLastFrame;
    private boolean _isRepeating;
    private boolean _isTweened;
    private boolean _isUsingGradient;
    private boolean _isUsingImageBackground;
    private boolean _isUsingSlowMotionTweenedFrames;
    private org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle _linkedAutoCameraBundleRef;
    private org.fortheloss.sticknodes.data.FrameData _nextFrameRef;
    private org.fortheloss.sticknodes.data.FrameData _previousFrameRef;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private int _repeatGoBackFrames;
    private int _repeatLoops;
    private int _slowMotionTweenedFrames;
    private int _soundLibraryID;
    private float _soundPan;
    private float _soundPitch;
    private float _soundVolume;
    private int _stickfigureNodeCount;
    private java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> _textfieldBoxes;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _tweenedDrawableFigures;
    private boolean _useTweenPropertiesDuringRepeating;
    private boolean _willStopSounds;


    /* renamed from: -$$Nest$fget_drawableFigures, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1300$$Nest$fget_drawableFigures(org.fortheloss.sticknodes.data.FrameData r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r0._drawableFigures
            return r0
    }

    static {
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r1 = 0
            r0.<init>(r1)
            org.fortheloss.sticknodes.data.FrameData._tempFrameCamera = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.fortheloss.sticknodes.data.FrameData._animatingDuringDelayMCKeyframes = r0
            return
    }

    public FrameData(org.fortheloss.sticknodes.data.FrameData r19, boolean r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r18.<init>()
            r2 = 0
            r0._isLastFrame = r2
            r0._isFirstFrame = r2
            r0._stickfigureNodeCount = r2
            r3 = 1
            r0._isTweened = r3
            r0._isUsingImageBackground = r3
            r0._willStopSounds = r2
            r0._isUsingGradient = r2
            r0._isExpandedGradient = r2
            r0._isDelayed = r2
            r4 = 0
            r0._delaySeconds = r4
            r0._isUsingSlowMotionTweenedFrames = r2
            r0._slowMotionTweenedFrames = r3
            r0._isRepeating = r2
            r0._repeatGoBackFrames = r3
            r0._repeatLoops = r3
            r0._useTweenPropertiesDuringRepeating = r2
            r0._cameraIsMovingDuringDelay = r2
            r0._cameraMoveDuringDelayEaseIn = r2
            r0._cameraMoveDuringDelayEaseOut = r2
            r5 = -1
            r0._cameraMoveDuringDelayInterpolationID = r5
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.linear
            r0._cameraMoveDuringDelayInterpolationRef = r6
            r0._soundLibraryID = r5
            r6 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r6
            r0._soundPan = r4
            r0._soundPitch = r6
            org.fortheloss.sticknodes.data.ProjectData r7 = r1._projectDataRef
            r0._projectDataRef = r7
            java.util.ArrayList r7 = r19.getDrawableFigures()
            java.util.ArrayList r8 = r19.getTextfieldBoxes()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0._drawableFigures = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0._tweenedDrawableFigures = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0._textfieldBoxes = r9
            int r9 = r7.size()
            r10 = 0
        L67:
            if (r10 >= r9) goto Lea
            java.lang.Object r11 = r7.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            boolean r12 = r11 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r12 == 0) goto L8b
            r12 = r11
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r12
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._drawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r14 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r14.<init>(r12)
            r13.add(r14)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r14 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r14.<init>(r12)
            r13.add(r14)
            goto Ldd
        L8b:
            boolean r12 = r11 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r12 == 0) goto Lc3
            boolean r12 = r11 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r12 == 0) goto Lab
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r13 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r14 = r11
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r14 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r14
            r13.<init>(r14)
            r12.add(r13)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r13 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r13.<init>(r14)
            r12.add(r13)
            goto Ldd
        Lab:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r13 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r14 = r11
            org.fortheloss.sticknodes.sprite.SpriteRef r14 = (org.fortheloss.sticknodes.sprite.SpriteRef) r14
            r13.<init>(r14)
            r12.add(r13)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r13 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r13.<init>(r14)
            r12.add(r13)
            goto Ldd
        Lc3:
            r12 = r11
            org.fortheloss.sticknodes.movieclip.MCReference r12 = (org.fortheloss.sticknodes.movieclip.MCReference) r12
            org.fortheloss.sticknodes.movieclip.MCReference r13 = new org.fortheloss.sticknodes.movieclip.MCReference
            r13.<init>(r12, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r14 = r0._drawableFigures
            r14.add(r13)
            org.fortheloss.sticknodes.movieclip.MCReference r13 = new org.fortheloss.sticknodes.movieclip.MCReference
            r13.<init>(r12, r0)
            r13.setDrawsTweenedStickfigureArray(r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._tweenedDrawableFigures
            r12.add(r13)
        Ldd:
            int r12 = r0._stickfigureNodeCount
            int r11 = r11.getNodeCount(r3)
            int r12 = r12 + r11
            r0._stickfigureNodeCount = r12
            int r10 = r10 + 1
            goto L67
        Lea:
            r10 = 0
        Leb:
            if (r10 >= r9) goto L1a0
            java.lang.Object r11 = r7.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            boolean r12 = r11 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r12 != 0) goto Lf9
            goto L196
        Lf9:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r11
            boolean r12 = r11.hasJoinAnchorNode()
            if (r12 == 0) goto L196
            java.util.ArrayList r11 = r11.getJoinAnchorNodes()
            int r12 = r11.size()
            r13 = 0
        L10a:
            if (r13 >= r12) goto L196
            java.lang.Object r14 = r11.get(r13)
            org.fortheloss.sticknodes.stickfigure.StickNode r14 = (org.fortheloss.sticknodes.stickfigure.StickNode) r14
            java.util.ArrayList r15 = r14.getJoinedFigures()
            int r2 = r15.size()
            r4 = 0
        L11b:
            if (r4 >= r2) goto L18c
            java.lang.Object r16 = r15.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r16 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r16
            int r6 = r16.getID()
            r16 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r0._drawableFigures
            int r5 = r5.size()
            int r5 = r5 - r3
        L130:
            if (r5 < 0) goto L149
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._drawableFigures
            java.lang.Object r3 = r3.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            r17 = r2
            int r2 = r3.getID()
            if (r2 != r6) goto L143
            goto L14d
        L143:
            int r5 = r5 + (-1)
            r2 = r17
            r3 = 1
            goto L130
        L149:
            r17 = r2
            r3 = r16
        L14d:
            if (r3 != 0) goto L150
            goto L183
        L150:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._drawableFigures
            java.lang.Object r2 = r2.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r6 = r14.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r2 = r2.getNodeAtDrawOrderIndex(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r6 = 1
            r3.joinTo(r2, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._tweenedDrawableFigures
            java.lang.Object r2 = r2.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._tweenedDrawableFigures
            java.lang.Object r3 = r3.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r5 = r14.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r2.joinTo(r3)
        L183:
            int r4 = r4 + 1
            r2 = r17
            r3 = 1
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L11b
        L18c:
            int r13 = r13 + 1
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L10a
        L196:
            int r10 = r10 + 1
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            goto Leb
        L1a0:
            int r2 = r8.size()
            r3 = 0
        L1a5:
            if (r3 >= r2) goto L1ba
            java.lang.Object r4 = r8.get(r3)
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r5 = r0._textfieldBoxes
            org.fortheloss.sticknodes.TextfieldBox r6 = new org.fortheloss.sticknodes.TextfieldBox
            r6.<init>(r4)
            r5.add(r6)
            int r3 = r3 + 1
            goto L1a5
        L1ba:
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r3 = r19.getBackgroundColor()
            r2.<init>(r3)
            r0._backgroundColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r3 = r19.getGradientColor()
            r2.<init>(r3)
            r0._gradientColor = r2
            boolean r2 = r1._isUsingImageBackground
            r0._isUsingImageBackground = r2
            boolean r2 = r1._isUsingGradient
            r0._isUsingGradient = r2
            boolean r2 = r1._isExpandedGradient
            r0._isExpandedGradient = r2
            boolean r2 = r1._isTweened
            r0._isTweened = r2
            boolean r2 = r1._isUsingSlowMotionTweenedFrames
            r0._isUsingSlowMotionTweenedFrames = r2
            int r2 = r1._slowMotionTweenedFrames
            r0._slowMotionTweenedFrames = r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r1._frameCamera
            r4 = 1
            r2.<init>(r3, r0, r4)
            r0._frameCamera = r2
            if (r20 == 0) goto L235
            int r2 = r1._soundLibraryID
            r0._soundLibraryID = r2
            float r2 = r1._soundVolume
            r0._soundVolume = r2
            float r2 = r1._soundPan
            r0._soundPan = r2
            float r2 = r1._soundPitch
            r0._soundPitch = r2
            boolean r2 = r1._willStopSounds
            r0._willStopSounds = r2
            boolean r2 = r1._isDelayed
            r0._isDelayed = r2
            float r2 = r1._delaySeconds
            r0._delaySeconds = r2
            boolean r2 = r1._cameraIsMovingDuringDelay
            r0._cameraIsMovingDuringDelay = r2
            boolean r2 = r1._cameraMoveDuringDelayEaseIn
            r0._cameraMoveDuringDelayEaseIn = r2
            boolean r2 = r1._cameraMoveDuringDelayEaseOut
            r0._cameraMoveDuringDelayEaseOut = r2
            short r2 = r1._cameraMoveDuringDelayInterpolationID
            r0._cameraMoveDuringDelayInterpolationID = r2
            com.badlogic.gdx.math.Interpolation r2 = r1._cameraMoveDuringDelayInterpolationRef
            r0._cameraMoveDuringDelayInterpolationRef = r2
            boolean r2 = r1._isRepeating
            r0._isRepeating = r2
            int r2 = r1._repeatGoBackFrames
            r0._repeatGoBackFrames = r2
            int r2 = r1._repeatLoops
            r0._repeatLoops = r2
            boolean r1 = r1._useTweenPropertiesDuringRepeating
            r0._useTweenPropertiesDuringRepeating = r1
            goto L25d
        L235:
            r1 = -1
            r0._soundLibraryID = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r2
            r3 = 0
            r0._soundPan = r3
            r0._soundPitch = r2
            r2 = 0
            r0._willStopSounds = r2
            r0._isDelayed = r2
            r0._delaySeconds = r3
            r0._cameraIsMovingDuringDelay = r2
            r0._cameraMoveDuringDelayEaseIn = r2
            r0._cameraMoveDuringDelayEaseOut = r2
            r0._cameraMoveDuringDelayInterpolationID = r1
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.linear
            r0._cameraMoveDuringDelayInterpolationRef = r1
            r0._isRepeating = r2
            r1 = 1
            r0._repeatGoBackFrames = r1
            r0._repeatLoops = r1
            r0._useTweenPropertiesDuringRepeating = r2
        L25d:
            return
    }

    public FrameData(org.fortheloss.sticknodes.data.MCFrameData r18, org.fortheloss.sticknodes.data.ProjectData r19, boolean r20) {
            r17 = this;
            r0 = r17
            r17.<init>()
            r1 = 0
            r0._isLastFrame = r1
            r0._isFirstFrame = r1
            r0._stickfigureNodeCount = r1
            r2 = 1
            r0._isTweened = r2
            r0._isUsingImageBackground = r2
            r0._willStopSounds = r1
            r0._isUsingGradient = r1
            r0._isExpandedGradient = r1
            r0._isDelayed = r1
            r3 = 0
            r0._delaySeconds = r3
            r0._isUsingSlowMotionTweenedFrames = r1
            r0._slowMotionTweenedFrames = r2
            r0._isRepeating = r1
            r0._repeatGoBackFrames = r2
            r0._repeatLoops = r2
            r0._useTweenPropertiesDuringRepeating = r1
            r0._cameraIsMovingDuringDelay = r1
            r0._cameraMoveDuringDelayEaseIn = r1
            r0._cameraMoveDuringDelayEaseOut = r1
            r4 = -1
            r0._cameraMoveDuringDelayInterpolationID = r4
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.linear
            r0._cameraMoveDuringDelayInterpolationRef = r5
            r0._soundLibraryID = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r5
            r0._soundPan = r3
            r0._soundPitch = r5
            r6 = r19
            r0._projectDataRef = r6
            java.util.ArrayList r6 = r18.getDrawableFigures()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0._drawableFigures = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0._tweenedDrawableFigures = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0._textfieldBoxes = r7
            int r7 = r6.size()
            r8 = 0
        L61:
            if (r8 >= r7) goto Lc8
            java.lang.Object r9 = r6.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r10 == 0) goto L85
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._drawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r12 = r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r12
            r11.<init>(r12)
            r10.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r11.<init>(r12)
            r10.add(r11)
            goto Lbc
        L85:
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r10 == 0) goto La1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r11 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r12 = r9
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r12 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r12
            r11.<init>(r12)
            r10.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r11 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r11.<init>(r12)
            r10.add(r11)
            goto Lbc
        La1:
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r10 == 0) goto Lbc
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r12 = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = (org.fortheloss.sticknodes.sprite.SpriteRef) r12
            r11.<init>(r12)
            r10.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r11.<init>(r12)
            r10.add(r11)
        Lbc:
            int r10 = r0._stickfigureNodeCount
            int r9 = r9.getNodeCount(r2)
            int r10 = r10 + r9
            r0._stickfigureNodeCount = r10
            int r8 = r8 + 1
            goto L61
        Lc8:
            r8 = 0
        Lc9:
            if (r8 >= r7) goto L176
            java.lang.Object r9 = r6.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r10 != 0) goto Ld7
            goto L16d
        Ld7:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r9
            boolean r10 = r9.hasJoinAnchorNode()
            if (r10 == 0) goto L16d
            java.util.ArrayList r9 = r9.getJoinAnchorNodes()
            int r10 = r9.size()
            r11 = 0
        Le8:
            if (r11 >= r10) goto L16d
            java.lang.Object r12 = r9.get(r11)
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = (org.fortheloss.sticknodes.stickfigure.StickNode) r12
            java.util.ArrayList r13 = r12.getJoinedFigures()
            int r14 = r13.size()
            r15 = 0
        Lf9:
            if (r15 >= r14) goto L164
            java.lang.Object r16 = r13.get(r15)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r16 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r16
            int r1 = r16.getID()
            r16 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._drawableFigures
            int r3 = r3.size()
            int r3 = r3 - r2
        L10e:
            if (r3 < 0) goto L125
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r0._drawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r4.getID()
            if (r5 != r1) goto L11f
            goto L127
        L11f:
            int r3 = r3 + (-1)
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L10e
        L125:
            r4 = r16
        L127:
            if (r4 != 0) goto L12a
            goto L15c
        L12a:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r0._drawableFigures
            java.lang.Object r1 = r1.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r5 = r12.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r4.joinTo(r1, r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r0._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._tweenedDrawableFigures
            java.lang.Object r3 = r3.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r4 = r12.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getNodeAtDrawOrderIndex(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r1.joinTo(r3)
        L15c:
            int r15 = r15 + 1
            r1 = 0
            r3 = 0
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto Lf9
        L164:
            int r11 = r11 + 1
            r1 = 0
            r3 = 0
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto Le8
        L16d:
            int r8 = r8 + 1
            r1 = 0
            r3 = 0
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto Lc9
        L176:
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r2, r2, r2)
            r0._backgroundColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r3, r3, r3, r2)
            r0._gradientColor = r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r1.<init>(r0)
            r0._frameCamera = r1
            if (r20 == 0) goto L1aa
            int r1 = r18.getSoundToPlayLibraryID()
            r0._soundLibraryID = r1
            float r1 = r18.getSoundVolume()
            r0._soundVolume = r1
            float r1 = r18.getSoundPan()
            r0._soundPan = r1
            float r1 = r18.getSoundPitch()
            r0._soundPitch = r1
            goto L1b6
        L1aa:
            r1 = -1
            r0._soundLibraryID = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r1
            r2 = 0
            r0._soundPan = r2
            r0._soundPitch = r1
        L1b6:
            return
    }

    public FrameData(org.fortheloss.sticknodes.data.ProjectData r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4._isLastFrame = r0
            r4._isFirstFrame = r0
            r4._stickfigureNodeCount = r0
            r1 = 1
            r4._isTweened = r1
            r4._isUsingImageBackground = r1
            r4._willStopSounds = r0
            r4._isUsingGradient = r0
            r4._isExpandedGradient = r0
            r4._isDelayed = r0
            r2 = 0
            r4._delaySeconds = r2
            r4._isUsingSlowMotionTweenedFrames = r0
            r4._slowMotionTweenedFrames = r1
            r4._isRepeating = r0
            r4._repeatGoBackFrames = r1
            r4._repeatLoops = r1
            r4._useTweenPropertiesDuringRepeating = r0
            r4._cameraIsMovingDuringDelay = r0
            r4._cameraMoveDuringDelayEaseIn = r0
            r4._cameraMoveDuringDelayEaseOut = r0
            r1 = -1
            r4._cameraMoveDuringDelayInterpolationID = r1
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.linear
            r4._cameraMoveDuringDelayInterpolationRef = r3
            r4._soundLibraryID = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r4._soundVolume = r1
            r4._soundPan = r2
            r4._soundPitch = r1
            r4._projectDataRef = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4._drawableFigures = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4._tweenedDrawableFigures = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4._textfieldBoxes = r5
            r4._stickfigureNodeCount = r0
            com.badlogic.gdx.graphics.Color r5 = new com.badlogic.gdx.graphics.Color
            r5.<init>(r1, r1, r1, r1)
            r4._backgroundColor = r5
            com.badlogic.gdx.graphics.Color r5 = new com.badlogic.gdx.graphics.Color
            r0 = 1056964608(0x3f000000, float:0.5)
            r5.<init>(r0, r0, r0, r1)
            r4._gradientColor = r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r5.<init>(r4)
            r4._frameCamera = r5
            return
    }

    private void findOriginForMC(org.fortheloss.sticknodes.movieclip.MCReference r9) {
            r8 = this;
            int r0 = r9.getID()
            boolean r1 = r9.isOriginMCRef()
            org.fortheloss.sticknodes.data.FrameData r2 = r8._previousFrameRef
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            boolean r5 = r8._isFirstFrame
            if (r5 != 0) goto L44
            java.util.ArrayList r2 = r2.getDrawableFigures()
            int r5 = r2.size()
            int r5 = r5 - r4
        L1b:
            if (r5 < 0) goto L44
            java.lang.Object r6 = r2.get(r5)
            boolean r6 = r6 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r6 != 0) goto L26
            goto L41
        L26:
            java.lang.Object r6 = r2.get(r5)
            org.fortheloss.sticknodes.movieclip.MCReference r6 = (org.fortheloss.sticknodes.movieclip.MCReference) r6
            int r7 = r6.getID()
            if (r0 != r7) goto L41
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r6.getOrigin()
            if (r2 != 0) goto L3c
            r9.setNewOrigin(r6)
            goto L3f
        L3c:
            r9.setNewOrigin(r2)
        L3f:
            r2 = 1
            goto L45
        L41:
            int r5 = r5 + (-1)
            goto L1b
        L44:
            r2 = 0
        L45:
            if (r2 != 0) goto L4a
            r9.convertToOrigin()
        L4a:
            boolean r2 = r9.isOriginMCRef()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L9f
            boolean r1 = r9.isOriginMCRef()
            if (r1 != 0) goto L9f
        L58:
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r9.getOrigin()
            if (r1 != 0) goto L5f
            goto L60
        L5f:
            r9 = r1
        L60:
            org.fortheloss.sticknodes.data.FrameData r1 = r8._nextFrameRef
            r2 = 0
            if (r1 == 0) goto L6a
            boolean r5 = r8._isLastFrame
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r1 = r2
        L6b:
            if (r1 == 0) goto L9f
            java.util.ArrayList r5 = r1.getDrawableFigures()
            int r6 = r5.size()
            int r6 = r6 - r4
        L76:
            if (r6 < 0) goto L92
            java.lang.Object r7 = r5.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            int r7 = r7.getID()
            if (r7 != r0) goto L8f
            java.lang.Object r5 = r5.get(r6)
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            r5.setNewOrigin(r9)
            r5 = 1
            goto L93
        L8f:
            int r6 = r6 + (-1)
            goto L76
        L92:
            r5 = 0
        L93:
            if (r5 == 0) goto L6a
            org.fortheloss.sticknodes.data.FrameData r5 = r1._nextFrameRef
            if (r5 == 0) goto L6a
            boolean r1 = r1._isLastFrame
            if (r1 != 0) goto L6a
            r1 = r5
            goto L6b
        L9f:
            return
    }

    private void refreshMovieclip(int r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._drawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L32
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            java.lang.Object r1 = r1.get(r0)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L2f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r2 = r1.getID()
            if (r2 == r4) goto L23
            goto L2f
        L23:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._tweenedDrawableFigures
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.movieclip.MCReference r4 = (org.fortheloss.sticknodes.movieclip.MCReference) r4
            r3.refreshMovieclip(r1, r4)
            goto L32
        L2f:
            int r0 = r0 + (-1)
            goto L8
        L32:
            return
    }

    private void removeLinkedAutoCameraBundleReference() {
            r1 = this;
            r0 = 0
            r1._linkedAutoCameraBundleRef = r0
            return
    }

    private void setLinkedAutoCameraBundleReference(org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1) {
            r0 = this;
            r0._linkedAutoCameraBundleRef = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void addFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2, int r3, org.fortheloss.sticknodes.animationscreen.FramesContainer r4) {
            r1 = this;
            r0 = -1
            r1.addFigureAt(r2, r3, r0, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void addFigureAt(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5, int r6, int r7, org.fortheloss.sticknodes.animationscreen.FramesContainer r8) {
            r4 = this;
            r0 = 1
            if (r6 < 0) goto L31
            r1 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._drawableFigures
            int r2 = r2.size()
            int r2 = r2 - r0
        Lb:
            if (r2 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r4._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            if (r3 != r6) goto L1d
            r1 = 1
            goto L20
        L1d:
            int r2 = r2 + (-1)
            goto Lb
        L20:
            if (r1 != 0) goto L26
            r5.setID(r6)
            goto L3b
        L26:
            int r6 = r8.getUniqueFigureID()
            r5.setID(r6)
            r8.incrementUniqueFigureID()
            goto L3b
        L31:
            int r6 = r8.getUniqueFigureID()
            r5.setID(r6)
            r8.incrementUniqueFigureID()
        L3b:
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r8 = -1
            if (r6 == 0) goto L6b
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r1 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r6.<init>(r1)
            if (r7 == r8) goto L5f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            int r8 = r8.size()
            if (r7 <= r8) goto L53
            goto L5f
        L53:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            r8.add(r7, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._tweenedDrawableFigures
            r8.add(r7, r6)
            goto L106
        L5f:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._drawableFigures
            r7.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._tweenedDrawableFigures
            r7.add(r6)
            goto L106
        L6b:
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r6 == 0) goto La5
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r6 == 0) goto L7c
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r6 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r1 = r5
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r1 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r1
            r6.<init>(r1)
            goto L84
        L7c:
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r1 = r5
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r6.<init>(r1)
        L84:
            if (r7 == r8) goto L9a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            int r8 = r8.size()
            if (r7 <= r8) goto L8f
            goto L9a
        L8f:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            r8.add(r7, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._tweenedDrawableFigures
            r8.add(r7, r6)
            goto L106
        L9a:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._drawableFigures
            r7.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._tweenedDrawableFigures
            r7.add(r6)
            goto L106
        La5:
            r6 = r5
            org.fortheloss.sticknodes.movieclip.MCReference r6 = (org.fortheloss.sticknodes.movieclip.MCReference) r6
            org.fortheloss.sticknodes.movieclip.MCReference r1 = new org.fortheloss.sticknodes.movieclip.MCReference
            r1.<init>(r6, r4)
            r1.setDrawsTweenedStickfigureArray(r0)
            if (r7 == r8) goto Lc6
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            int r8 = r8.size()
            if (r7 <= r8) goto Lbb
            goto Lc6
        Lbb:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            r8.add(r7, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._tweenedDrawableFigures
            r8.add(r7, r1)
            goto Ld0
        Lc6:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._drawableFigures
            r7.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._tweenedDrawableFigures
            r7.add(r1)
        Ld0:
            int r7 = r6.getPlaymode()
            if (r7 == 0) goto L106
            r4.findOriginForMC(r6)
            org.fortheloss.sticknodes.data.ProjectData r7 = r4._projectDataRef
            int r7 = r7.getActualFPS()
            org.fortheloss.sticknodes.data.ProjectData r8 = r4._projectDataRef
            int r2 = r8.numTweenedFrames
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r8.frames
            int r3 = r3.size()
            boolean r8 = r8.getTweeningActuallyEnabled(r3)
            r6.calculateCurrentFrameIndex(r7, r2, r8)
            int r7 = r6.getCurrentFrameIndex()
            r1.setCurrentFrameIndex(r7)
            boolean r7 = r4._isLastFrame
            if (r7 != 0) goto L106
            org.fortheloss.sticknodes.data.FrameData r7 = r4._nextFrameRef
            if (r7 == 0) goto L106
            int r6 = r6.getID()
            r7.refreshMovieclip(r6)
        L106:
            int r6 = r4._stickfigureNodeCount
            int r5 = r5.getNodeCount(r0)
            int r6 = r6 + r5
            r4._stickfigureNodeCount = r6
            return
    }

    public boolean addTextfield(org.fortheloss.sticknodes.TextfieldBox r3, int r4) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r2._textfieldBoxes
            int r0 = r0.size()
            r1 = 15
            if (r0 < r1) goto Lc
            r3 = 0
            return r3
        Lc:
            r0 = -1
            r2.addTextfieldAt(r3, r4, r0)
            r3 = 1
            return r3
    }

    public void addTextfieldAt(org.fortheloss.sticknodes.TextfieldBox r5, int r6, int r7) {
            r4 = this;
            r0 = 1
            if (r6 < 0) goto L31
            r1 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r2 = r4._textfieldBoxes
            int r2 = r2.size()
            int r2 = r2 - r0
        Lb:
            if (r2 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3 = r4._textfieldBoxes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.TextfieldBox r3 = (org.fortheloss.sticknodes.TextfieldBox) r3
            int r3 = r3.getID()
            if (r3 != r6) goto L1d
            r1 = 1
            goto L20
        L1d:
            int r2 = r2 + (-1)
            goto Lb
        L20:
            if (r1 != 0) goto L26
            r5.setID(r6)
            goto L3b
        L26:
            int r6 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            r5.setID(r6)
            int r6 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            int r6 = r6 + r0
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r6
            goto L3b
        L31:
            int r6 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            r5.setID(r6)
            int r6 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            int r6 = r6 + r0
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r6
        L3b:
            r6 = -1
            if (r7 == r6) goto L4d
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r6 = r4._textfieldBoxes
            int r6 = r6.size()
            if (r7 <= r6) goto L47
            goto L4d
        L47:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r6 = r4._textfieldBoxes
            r6.add(r7, r5)
            goto L52
        L4d:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r6 = r4._textfieldBoxes
            r6.add(r5)
        L52:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void clear() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCamera
            r0.removeLockedFigures()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._drawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r2.deleteFigure(r1)
            int r0 = r0 + (-1)
            goto Ld
        L1d:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r2._textfieldBoxes
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L25:
            if (r0 < 0) goto L35
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r2._textfieldBoxes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            r2.deleteTextfield(r1)
            int r0 = r0 + (-1)
            goto L25
        L35:
            return
    }

    public void deleteAutoCameraBundle() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r2._autoCameraBundle
            if (r0 == 0) goto L14
            org.fortheloss.sticknodes.data.FrameData r0 = r0.getFrame2()
            r0.removeLinkedAutoCameraBundleReference()
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r2._autoCameraBundle
            r0.dispose()
            r0 = 0
            r2._autoCameraBundle = r0
            return
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't delete an auto-camera from a frame that doesn't have one."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void deleteFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6) {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._drawableFigures
            int r0 = r0.indexOf(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._drawableFigures
            r1.remove(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._tweenedDrawableFigures
            java.lang.Object r0 = r1.remove(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            int r1 = r5._stickfigureNodeCount
            r2 = 1
            int r3 = r6.getNodeCount(r2)
            int r1 = r1 - r3
            r5._stickfigureNodeCount = r1
            boolean r1 = r6 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L61
            r1 = r6
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r1 = r1.getPlaymode()
            if (r1 == 0) goto L61
            boolean r1 = r5._isLastFrame
            if (r1 != 0) goto L61
            org.fortheloss.sticknodes.data.FrameData r1 = r5._nextFrameRef
            if (r1 == 0) goto L61
            int r6 = r6.getID()
            org.fortheloss.sticknodes.data.FrameData r1 = r5._nextFrameRef
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r3 = r1.size()
            int r3 = r3 - r2
        L41:
            if (r3 < 0) goto L61
            java.lang.Object r2 = r1.get(r3)
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 != 0) goto L4c
            goto L5e
        L4c:
            java.lang.Object r2 = r1.get(r3)
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            int r4 = r2.getID()
            if (r4 != r6) goto L5e
            org.fortheloss.sticknodes.data.FrameData r6 = r5._nextFrameRef
            r6.findOriginForMC(r2)
            goto L61
        L5e:
            int r3 = r3 + (-1)
            goto L41
        L61:
            boolean r6 = r0.isJoined()
            if (r6 == 0) goto L6a
            r0.unjoin()
        L6a:
            boolean r6 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r6 == 0) goto L7a
            r6 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            boolean r1 = r6.hasJoinAnchorNode()
            if (r1 == 0) goto L7a
            r6.removeAllJoinedFigures()
        L7a:
            r0.dispose()
            return
    }

    public void deleteTextfield(org.fortheloss.sticknodes.TextfieldBox r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r1._textfieldBoxes
            int r2 = r0.indexOf(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r1._textfieldBoxes
            r0.remove(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._projectDataRef = r0
            r3._previousFrameRef = r0
            r3._nextFrameRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            if (r1 == 0) goto L23
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._drawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L11
        L21:
            r3._drawableFigures = r0
        L23:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            if (r1 == 0) goto L3f
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L2d:
            if (r1 < 0) goto L3d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._tweenedDrawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L2d
        L3d:
            r3._tweenedDrawableFigures = r0
        L3f:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r3._textfieldBoxes
            if (r1 == 0) goto L5b
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L49:
            if (r1 < 0) goto L59
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r2 = r3._textfieldBoxes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L49
        L59:
            r3._textfieldBoxes = r0
        L5b:
            r3._backgroundColor = r0
            r3._gradientColor = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r3._frameCamera
            if (r1 == 0) goto L68
            r1.dispose()
            r3._frameCamera = r0
        L68:
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r3._autoCameraBundle
            if (r1 == 0) goto L71
            r1.dispose()
            r3._autoCameraBundle = r0
        L71:
            r3._linkedAutoCameraBundleRef = r0
            r3._cameraMoveDuringDelayInterpolationRef = r0
            return
    }

    public org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle getAutoCameraBundle() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r1._autoCameraBundle
            return r0
    }

    public com.badlogic.gdx.graphics.Color getBackgroundColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._backgroundColor
            return r0
    }

    public boolean getCameraIsMovingDuringDelay() {
            r1 = this;
            boolean r0 = r1._cameraIsMovingDuringDelay
            return r0
    }

    public boolean getCameraMoveDuringDelayEaseIn() {
            r1 = this;
            boolean r0 = r1._cameraMoveDuringDelayEaseIn
            return r0
    }

    public boolean getCameraMoveDuringDelayEaseOut() {
            r1 = this;
            boolean r0 = r1._cameraMoveDuringDelayEaseOut
            return r0
    }

    public com.badlogic.gdx.math.Interpolation getCameraMoveDuringDelayInterpolation() {
            r1 = this;
            com.badlogic.gdx.math.Interpolation r0 = r1._cameraMoveDuringDelayInterpolationRef
            return r0
    }

    public short getCameraMoveDuringDelayInterpolationID() {
            r1 = this;
            short r0 = r1._cameraMoveDuringDelayInterpolationID
            return r0
    }

    public void getData(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5._isTweened
            r6.write(r0)
            boolean r0 = r5._isUsingImageBackground
            r6.write(r0)
            boolean r0 = r5._isUsingGradient
            r6.write(r0)
            boolean r0 = r5._isExpandedGradient
            r6.write(r0)
            boolean r0 = r5._willStopSounds
            r6.write(r0)
            boolean r0 = r5._isDelayed
            r6.write(r0)
            float r0 = r5._delaySeconds
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            boolean r0 = r5._isUsingSlowMotionTweenedFrames
            r6.write(r0)
            int r0 = r5._slowMotionTweenedFrames
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            boolean r0 = r5._isRepeating
            r6.write(r0)
            int r0 = r5._repeatGoBackFrames
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            int r0 = r5._repeatLoops
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            boolean r0 = r5._useTweenPropertiesDuringRepeating
            r6.write(r0)
            boolean r0 = r5._cameraIsMovingDuringDelay
            r6.write(r0)
            boolean r0 = r5._cameraMoveDuringDelayEaseIn
            r6.write(r0)
            boolean r0 = r5._cameraMoveDuringDelayEaseOut
            r6.write(r0)
            short r0 = r5._cameraMoveDuringDelayInterpolationID
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r6)
            com.badlogic.gdx.graphics.Color r0 = r5._backgroundColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            com.badlogic.gdx.graphics.Color r0 = r5._gradientColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            int r0 = r5._soundLibraryID
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            float r0 = r5._soundVolume
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            float r0 = r5._soundPan
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            float r0 = r5._soundPitch
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._drawableFigures
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._drawableFigures
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8c:
            if (r2 >= r0) goto Ld3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L9c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r6)
            goto Lbe
        L9c:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r3 == 0) goto Lab
            r3 = 3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            goto Lbe
        Lab:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r3 == 0) goto Lba
            r3 = 2
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            goto Lbe
        Lba:
            r3 = 1
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
        Lbe:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r4 = r3.getLibraryID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
            r3.getPositionalData(r6)
            int r2 = r2 + 1
            goto L8c
        Ld3:
            r2 = 0
            r3 = 0
        Ld5:
            if (r2 >= r0) goto Lea
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._drawableFigures
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r4 = r4.isJoined()
            if (r4 == 0) goto Le7
            int r3 = r3 + 1
        Le7:
            int r2 = r2 + 1
            goto Ld5
        Lea:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            if (r3 <= 0) goto L127
            r2 = 0
        Lf0:
            if (r2 >= r0) goto L127
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            boolean r4 = r3.isJoined()
            if (r4 == 0) goto L124
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r3.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            int r4 = r4.getID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r3.getJoinedToNode()
            int r4 = r4.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
            float r3 = r3.getJoinOffsetAngle()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r6)
        L124:
            int r2 = r2 + 1
            goto Lf0
        L127:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r5._textfieldBoxes
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r5._textfieldBoxes
            int r0 = r0.size()
        L136:
            if (r1 >= r0) goto L146
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r2 = r5._textfieldBoxes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            r2.getData(r6)
            int r1 = r1 + 1
            goto L136
        L146:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r5._frameCamera
            r0.getData(r6)
            return
    }

    public float getDelaySeconds() {
            r1 = this;
            float r0 = r1._delaySeconds
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getDrawableFigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._drawableFigures
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void getFigureOrder(java.util.ArrayList<java.lang.Integer> r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._drawableFigures
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._drawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r2 = r2.getID()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L7
        L1f:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getFigurePosition(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._drawableFigures
            int r2 = r0.indexOf(r2)
            return r2
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getFrameCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r1._frameCamera
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getFrameTotalNodeCount() {
            r1 = this;
            int r0 = r1._stickfigureNodeCount
            return r0
    }

    public com.badlogic.gdx.graphics.Color getGradientColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._gradientColor
            return r0
    }

    public boolean getIsRepeating() {
            r1 = this;
            boolean r0 = r1._isRepeating
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public boolean getIsUsingSlowMotionTweenedFrames() {
            r1 = this;
            boolean r0 = r1._isUsingSlowMotionTweenedFrames
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle getLinkedAutoCameraBundle() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r1._linkedAutoCameraBundleRef
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getMovieclipsAnimatingDuringDelayCurrentKeyframe() {
            r5 = this;
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._animatingDuringDelayMCKeyframes
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3e
            java.util.ArrayList<java.lang.Integer> r2 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r3 = r1 + 1
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r3 + 1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            int r3 = r3.getCurrentFrameIndex()
            java.util.ArrayList<java.lang.Integer> r4 = org.fortheloss.sticknodes.data.FrameData._animatingDuringDelayMCKeyframes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r1)
            java.util.ArrayList<java.lang.Integer> r1 = org.fortheloss.sticknodes.data.FrameData._animatingDuringDelayMCKeyframes
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            r1 = r2
            goto Lc
        L3e:
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._animatingDuringDelayMCKeyframes
            return r0
    }

    public org.fortheloss.sticknodes.data.FrameData getNextFrame() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._nextFrameRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void getProperties(org.fortheloss.sticknodes.data.useractions.FrameDataProperties r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = r3.backgroundColor
            com.badlogic.gdx.graphics.Color r1 = r2._backgroundColor
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r3.gradientColor
            com.badlogic.gdx.graphics.Color r1 = r2._gradientColor
            r0.set(r1)
            boolean r0 = r2._isTweened
            r3.isTweened = r0
            boolean r0 = r2._isUsingImageBackground
            r3.isUsingImageBackground = r0
            boolean r0 = r2._isUsingGradient
            r3.isUsingGradient = r0
            boolean r0 = r2._isExpandedGradient
            r3.isExpandedGradient = r0
            boolean r0 = r2._willStopSounds
            r3.willStopSounds = r0
            boolean r0 = r2._isDelayed
            r3.isDelayed = r0
            boolean r0 = r2._cameraIsMovingDuringDelay
            r3.cameraIsMovingDuringDelay = r0
            boolean r0 = r2._cameraMoveDuringDelayEaseIn
            r3.cameraMoveDuringDelayEaseIn = r0
            boolean r0 = r2._cameraMoveDuringDelayEaseOut
            r3.cameraMoveDuringDelayEaseOut = r0
            short r0 = r2._cameraMoveDuringDelayInterpolationID
            r3.cameraMoveDuringDelayInterpolationID = r0
            float r0 = r2._delaySeconds
            r3.delaySeconds = r0
            boolean r0 = r2._isUsingSlowMotionTweenedFrames
            r3.isUsingSlowMotionTweenedFrames = r0
            int r0 = r2._slowMotionTweenedFrames
            r3.slowMotionTweenedFrames = r0
            boolean r0 = r2._isRepeating
            r3.isRepeating = r0
            int r0 = r2._repeatGoBackFrames
            r3.repeatGoBackFrames = r0
            int r0 = r2._repeatLoops
            r3.repeatLoops = r0
            boolean r0 = r2._useTweenPropertiesDuringRepeating
            r3.useTweenPropertiesDuringRepeating = r0
            int r0 = r2._soundLibraryID
            r3.soundLibraryID = r0
            float r0 = r2._soundVolume
            r3.soundVolume = r0
            float r0 = r2._soundPan
            r3.soundPan = r0
            float r0 = r2._soundPitch
            r3.soundPitch = r0
            return
    }

    public int getRepeatGoBackFrames() {
            r1 = this;
            int r0 = r1._repeatGoBackFrames
            return r0
    }

    public int getRepeatLoops() {
            r1 = this;
            int r0 = r1._repeatLoops
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getSlowMotionTweenedFrames() {
            r1 = this;
            int r0 = r1._slowMotionTweenedFrames
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public float getSoundPan() {
            r1 = this;
            float r0 = r1._soundPan
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public float getSoundPitch() {
            r1 = this;
            float r0 = r1._soundPitch
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getSoundToPlayLibraryID() {
            r1 = this;
            int r0 = r1._soundLibraryID
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public float getSoundVolume() {
            r1 = this;
            float r0 = r1._soundVolume
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> getTextfieldBoxes() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r1._textfieldBoxes
            return r0
    }

    public int getTextfieldPosition(org.fortheloss.sticknodes.TextfieldBox r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r1._textfieldBoxes
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getTweenedDrawableFigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._tweenedDrawableFigures
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getTweenedFrameCamera(float r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r6 = r6.getFrameCamera()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            float r1 = r1.getCameraOffsetX()
            float r2 = r6.getCameraOffsetX()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r4._frameCamera
            float r3 = r3.getCameraOffsetX()
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.setCameraOffsetX(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            float r1 = r1.getCameraOffsetY()
            float r2 = r6.getCameraOffsetY()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r4._frameCamera
            float r3 = r3.getCameraOffsetY()
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.setCameraOffsetY(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            float r1 = r1.getCameraScale()
            float r2 = r6.getCameraScale()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r4._frameCamera
            float r3 = r3.getCameraScale()
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.setCameraScale(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            boolean r1 = r1.isWidescreen()
            r0.setIsWidescreen(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            boolean r1 = r1.isWobblingXY()
            r0.setWobbleXY(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            boolean r1 = r1.isWobblingRotation()
            r0.setWobbleRotation(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            boolean r1 = r1.isWobbleScaleEnabled()
            r0.setWobbleScale(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            int r1 = r1.getWobbleXYIntensity()
            float r1 = (float) r1
            int r2 = r6.getWobbleXYIntensity()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r4._frameCamera
            int r3 = r3.getWobbleXYIntensity()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.setWobbleXYIntensity(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            float r1 = r1.getWobbleRotationIntensity()
            float r2 = r6.getWobbleRotationIntensity()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r4._frameCamera
            float r3 = r3.getWobbleRotationIntensity()
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.setWobbleRotationIntensity(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            float r1 = r1.getWobbleSpeed()
            float r2 = r6.getWobbleSpeed()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r4._frameCamera
            float r3 = r3.getWobbleSpeed()
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.setWobbleSpeed(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r4._frameCamera
            float r0 = r0.getCameraRotationDeg()
            float r6 = r6.getCameraRotationDeg()
            float r6 = r6 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            float r6 = r6 + r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r1
            float r6 = r6 - r0
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le2
            float r6 = r6 + r1
        Le2:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r4._frameCamera
            float r1 = r1.getCameraRotationDeg()
            float r6 = r6 * r5
            float r1 = r1 + r6
            r0.setCameraRotation(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = org.fortheloss.sticknodes.data.FrameData._tempFrameCamera
            return r5
    }

    public boolean getUseTweenPropertiesDuringRepeating() {
            r1 = this;
            boolean r0 = r1._useTweenPropertiesDuringRepeating
            return r0
    }

    public boolean isAutoCameraEndFrame() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r1._linkedAutoCameraBundleRef
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isAutoCameraOriginFrame() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r1._autoCameraBundle
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isDelayed() {
            r1 = this;
            boolean r0 = r1._isDelayed
            return r0
    }

    public boolean isExpandedGradient() {
            r1 = this;
            boolean r0 = r1._isExpandedGradient
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public boolean isTweened() {
            r1 = this;
            boolean r0 = r1._isTweened
            if (r0 == 0) goto Le
            boolean r0 = r1._cameraIsMovingDuringDelay
            if (r0 == 0) goto Lc
            boolean r0 = r1._isDelayed
            if (r0 != 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isUsingGradient() {
            r1 = this;
            boolean r0 = r1._isUsingGradient
            return r0
    }

    public boolean isUsingImageBackground() {
            r1 = this;
            boolean r0 = r1._isUsingImageBackground
            return r0
    }

    public void movieclipsAnimatingDuringDelayFinished() {
            r5 = this;
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r0 = r0.size()
            r1 = 0
        L7:
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L43
            java.util.ArrayList<java.lang.Integer> r2 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r3 = r1 + 1
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.ArrayList<java.lang.Integer> r2 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r4 = r3 + 1
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            r3.finishAnimateDuringDelay(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._tweenedDrawableFigures
            java.lang.Object r1 = r2.get(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r2 = r3.getCurrentFrameIndex()
            r1.setCurrentFrameIndex(r2)
            r1 = r4
            goto L7
        L43:
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            r0.clear()
            return
    }

    public void movieclipsAnimatingDuringDelayJumpToKeyframe() {
            r5 = this;
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r0 = r0.size()
            r1 = 0
        L7:
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L37
            java.util.ArrayList<java.lang.Integer> r2 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r3 = r1 + 1
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r3 + 1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            r3.jumpToKeyframeForAnimateDuringDelay()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._tweenedDrawableFigures
            java.lang.Object r1 = r4.get(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r3 = r3.getCurrentFrameIndex()
            r1.setCurrentFrameIndex(r3)
            r1 = r2
            goto L7
        L37:
            return
    }

    public void movieclipsAnimatingDuringDelayRelativeIncrement(double r3, double r5, boolean r7, int r8) {
            r2 = this;
            double r3 = r3 / r5
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            java.util.ArrayList<java.lang.Integer> r3 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r3 = r3.size()
            r5 = 0
        Ld:
            int r6 = r3 + (-1)
            if (r5 >= r6) goto L3a
            java.util.ArrayList<java.lang.Integer> r6 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r0 = r5 + 1
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.ArrayList<java.lang.Integer> r6 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r1 = r0 + 1
            java.lang.Object r6 = r6.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            java.lang.Object r5 = r0.get(r5)
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            r5.animateDuringDelay(r6, r4, r7, r8)
            r5 = r1
            goto Ld
        L3a:
            return
    }

    public boolean movieclipsAnimatingDuringPrepareIfApplicable() {
            r5 = this;
            java.util.ArrayList<java.lang.Integer> r0 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            r0.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._drawableFigures
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        Le:
            if (r0 < 0) goto L48
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r0)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r3 == 0) goto L45
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            int r4 = r3.getPlaymode()
            if (r4 == 0) goto L45
            boolean r4 = r3.getPlayDuringDelay()
            if (r4 == 0) goto L45
            java.util.ArrayList<java.lang.Integer> r2 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2.add(r4)
            java.util.ArrayList<java.lang.Integer> r2 = org.fortheloss.sticknodes.data.FrameData._tweenedDuringDelayMCIndices
            int r3 = r3.getCurrentFrameIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            r2 = 1
        L45:
            int r0 = r0 + (-1)
            goto Le
        L48:
            return r2
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureFlippedX(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4, boolean r5) {
            r3 = this;
            int r4 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L20
            r1.flipX(r5)
            goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureFlippedY(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4, boolean r5) {
            r3 = this;
            int r4 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L20
            r1.flipY(r5)
            goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureJoined(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7, org.fortheloss.sticknodes.stickfigure.StickNode r8) {
            r6 = this;
            int r7 = r7.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L57
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r7) goto L54
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r8.getStickfigure()
            int r2 = r2.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._tweenedDrawableFigures
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L2c:
            if (r3 < 0) goto L54
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._tweenedDrawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 != 0) goto L3b
            goto L51
        L3b:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            int r5 = r4.getID()
            if (r5 != r2) goto L51
            int r7 = r8.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r7 = r4.getNodeAtDrawOrderIndex(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            r1.joinTo(r7)
            goto L57
        L51:
            int r3 = r3 + (-1)
            goto L2c
        L54:
            int r0 = r0 + (-1)
            goto Lc
        L57:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureUnjoined(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            int r4 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L20
            r1.unjoin()
            goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            return
    }

    public void onOriginMCPropertiesChange(int r2) {
            r1 = this;
            boolean r0 = r1._isLastFrame
            if (r0 != 0) goto Lb
            org.fortheloss.sticknodes.data.FrameData r0 = r1._nextFrameRef
            if (r0 == 0) goto Lb
            r0.refreshMovieclip(r2)
        Lb:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onStickNodeColorModified(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r5.getStickfigure()
            int r0 = r0.getID()
            int r1 = r5.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._tweenedDrawableFigures
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L39
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r4._tweenedDrawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            if (r3 != r0) goto L36
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r4._tweenedDrawableFigures
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r5.copyColorValuesTo(r0)
            goto L39
        L36:
            int r2 = r2 + (-1)
            goto L14
        L39:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onStickNodeFlippedX(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L23
            org.fortheloss.sticknodes.stickfigure.INode r4 = r1.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5 = 0
            r4.flipX(r5)
            goto L26
        L23:
            int r0 = r0 + (-1)
            goto L8
        L26:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onStickNodeFlippedY(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L23
            org.fortheloss.sticknodes.stickfigure.INode r4 = r1.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5 = 0
            r4.flipY(r5)
            goto L26
        L23:
            int r0 = r0 + (-1)
            goto L8
        L26:
            return
    }

    public void onUserChangeCameraPosition() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r1._autoCameraBundle
            if (r0 == 0) goto L7
            r0.apply()
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r1._linkedAutoCameraBundleRef
            if (r0 == 0) goto Le
            r0.apply()
        Le:
            return
    }

    public void prepBeforeInterpolation(java.util.ArrayList<java.lang.Integer> r11, java.util.ArrayList<java.lang.Integer> r12, org.fortheloss.sticknodes.data.FrameData r13) {
            r10 = this;
            int r0 = r11.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L82
            java.lang.Object r3 = r11.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r12.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r10._tweenedDrawableFigures
            java.lang.Object r3 = r5.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            if (r4 < 0) goto L31
            java.util.ArrayList r5 = r13.getDrawableFigures()
            java.lang.Object r4 = r5.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            goto L32
        L31:
            r4 = 0
        L32:
            boolean r5 = r3.isJoined()
            if (r5 == 0) goto L7f
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r3.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r5.getStickfigure()
            int r5 = r5.getID()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r3.getJoinedToNode()
            int r6 = r6.getDrawOrderIndex()
            r7 = -1
            if (r4 == 0) goto L63
            boolean r8 = r4.isJoined()
            if (r8 != 0) goto L56
            goto L63
        L56:
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r4.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r8.getStickfigure()
            int r8 = r8.getID()
            goto L64
        L63:
            r8 = -1
        L64:
            if (r4 == 0) goto L75
            boolean r9 = r4.isJoined()
            if (r9 != 0) goto L6d
            goto L75
        L6d:
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r4.getJoinedToNode()
            int r7 = r4.getDrawOrderIndex()
        L75:
            if (r5 != r8) goto L7b
            if (r6 != r7) goto L7b
            r4 = 1
            goto L7c
        L7b:
            r4 = 0
        L7c:
            r3.setKeepJoinDuringInterpolation(r4)
        L7f:
            int r2 = r2 + 1
            goto L6
        L82:
            return
    }

    public void readData(int r17, int r18, org.fortheloss.sticknodes.data.ProjectData r19, org.fortheloss.sticknodes.data.FrameData r20, java.io.DataInputStream r21) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            int r5 = r21.read()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = 0
        L15:
            r0._isTweened = r5
            r5 = 140(0x8c, float:1.96E-43)
            if (r1 < r5) goto L24
            int r5 = r21.read()
            if (r5 == 0) goto L22
            goto L24
        L22:
            r5 = 0
            goto L25
        L24:
            r5 = 1
        L25:
            r0._isUsingImageBackground = r5
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 < r5) goto L33
            int r8 = r21.read()
            if (r8 == 0) goto L33
            r8 = 1
            goto L34
        L33:
            r8 = 0
        L34:
            r0._isUsingGradient = r8
            if (r1 < r5) goto L40
            int r8 = r21.read()
            if (r8 == 0) goto L40
            r8 = 1
            goto L41
        L40:
            r8 = 0
        L41:
            r0._isExpandedGradient = r8
            r8 = 160(0xa0, float:2.24E-43)
            if (r1 < r8) goto L4f
            int r9 = r21.read()
            if (r9 == 0) goto L4f
            r9 = 1
            goto L50
        L4f:
            r9 = 0
        L50:
            r0._willStopSounds = r9
            if (r1 < r5) goto L5c
            int r9 = r21.read()
            if (r9 == 0) goto L5c
            r9 = 1
            goto L5d
        L5c:
            r9 = 0
        L5d:
            r0._isDelayed = r9
            if (r1 < r5) goto L66
            float r10 = r21.readFloat()
            goto L67
        L66:
            r10 = 0
        L67:
            r0._delaySeconds = r10
            r10 = 310(0x136, float:4.34E-43)
            if (r1 < r10) goto L75
            int r11 = r21.read()
            if (r11 == 0) goto L75
            r11 = 1
            goto L76
        L75:
            r11 = 0
        L76:
            r0._isUsingSlowMotionTweenedFrames = r11
            if (r1 < r10) goto L7f
            int r11 = r21.readInt()
            goto L80
        L7f:
            r11 = 1
        L80:
            r0._slowMotionTweenedFrames = r11
            r11 = 330(0x14a, float:4.62E-43)
            if (r1 < r11) goto L8e
            int r12 = r21.read()
            if (r12 == 0) goto L8e
            r12 = 1
            goto L8f
        L8e:
            r12 = 0
        L8f:
            r0._isRepeating = r12
            if (r1 < r11) goto L98
            int r12 = r21.readInt()
            goto L99
        L98:
            r12 = 1
        L99:
            r0._repeatGoBackFrames = r12
            if (r1 < r11) goto La2
            int r12 = r21.readInt()
            goto La3
        La2:
            r12 = 1
        La3:
            r0._repeatLoops = r12
            if (r1 < r11) goto Laf
            int r11 = r21.read()
            if (r11 == 0) goto Laf
            r11 = 1
            goto Lb0
        Laf:
            r11 = 0
        Lb0:
            r0._useTweenPropertiesDuringRepeating = r11
            r11 = -1
            if (r1 < r10) goto Le7
            int r12 = r21.read()
            if (r12 == 0) goto Lbd
            r12 = 1
            goto Lbe
        Lbd:
            r12 = 0
        Lbe:
            r0._cameraIsMovingDuringDelay = r12
            int r12 = r21.read()
            if (r12 == 0) goto Lc8
            r12 = 1
            goto Lc9
        Lc8:
            r12 = 0
        Lc9:
            r0._cameraMoveDuringDelayEaseIn = r12
            int r12 = r21.read()
            if (r12 == 0) goto Ld3
            r12 = 1
            goto Ld4
        Ld3:
            r12 = 0
        Ld4:
            r0._cameraMoveDuringDelayEaseOut = r12
            short r12 = r21.readShort()
            r0._cameraMoveDuringDelayInterpolationID = r12
            boolean r13 = r0._cameraMoveDuringDelayEaseIn
            boolean r14 = r0._cameraMoveDuringDelayEaseOut
            com.badlogic.gdx.math.Interpolation r12 = org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle.determineInterpolationFromID(r12, r13, r14)
            r0._cameraMoveDuringDelayInterpolationRef = r12
            goto Lf3
        Le7:
            r0._cameraIsMovingDuringDelay = r6
            r0._cameraMoveDuringDelayEaseIn = r6
            r0._cameraMoveDuringDelayEaseOut = r6
            r0._cameraMoveDuringDelayInterpolationID = r11
            com.badlogic.gdx.math.Interpolation r12 = com.badlogic.gdx.math.Interpolation.linear
            r0._cameraMoveDuringDelayInterpolationRef = r12
        Lf3:
            int r12 = r21.readInt()
            com.badlogic.gdx.graphics.Color r13 = r0._backgroundColor
            r14 = r12 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            r15 = 1132396544(0x437f0000, float:255.0)
            float r14 = r14 / r15
            int r6 = r12 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r15
            int r12 = r12 >> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r15
            r9 = 1065353216(0x3f800000, float:1.0)
            r13.set(r14, r6, r12, r9)
            if (r1 < r5) goto L12c
            int r5 = r21.readInt()
            com.badlogic.gdx.graphics.Color r6 = r0._gradientColor
            r12 = r5 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r15
            int r13 = r5 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            float r13 = (float) r13
            float r13 = r13 / r15
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r15
            r6.set(r12, r13, r5, r9)
            goto L133
        L12c:
            com.badlogic.gdx.graphics.Color r5 = r0._gradientColor
            r6 = 1056964608(0x3f000000, float:0.5)
            r5.set(r6, r6, r6, r9)
        L133:
            if (r1 < r8) goto L13a
            int r5 = r21.readInt()
            goto L13b
        L13a:
            r5 = -1
        L13b:
            r0._soundLibraryID = r5
            if (r1 < r8) goto L144
            float r5 = r21.readFloat()
            goto L146
        L144:
            r5 = 1065353216(0x3f800000, float:1.0)
        L146:
            r0._soundVolume = r5
            if (r1 < r10) goto L14f
            float r5 = r21.readFloat()
            goto L150
        L14f:
            r5 = 0
        L150:
            r0._soundPan = r5
            if (r1 < r10) goto L158
            float r9 = r21.readFloat()
        L158:
            r0._soundPitch = r9
            int r5 = r21.readInt()
            r6 = 0
        L15f:
            r8 = 53
            if (r6 >= r5) goto L256
            r9 = 300(0x12c, float:4.2E-43)
            if (r1 < r9) goto L16c
            int r9 = r21.readInt()
            goto L16d
        L16c:
            r9 = 0
        L16d:
            if (r9 != 0) goto L1c3
            int r9 = r21.readInt()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r3.getLibraryStickfigure(r9)
            r10.<init>(r9)
            r10.readPositionalData(r1, r2, r4)
            if (r2 > r8) goto L1a9
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r10.getMainNode()
            java.util.ArrayList r9 = r8.getChildrenNodes()
            int r9 = r9.size()
            int r9 = r9 - r7
        L18e:
            if (r9 < 0) goto L1a9
            java.util.ArrayList r12 = r8.getChildrenNodes()
            java.lang.Object r12 = r12.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = (org.fortheloss.sticknodes.stickfigure.StickNode) r12
            float r13 = r12.getLocalAngle()
            float r14 = r8.getLocalAngle()
            float r13 = r13 - r14
            r12.setLocalAngle(r13)
            int r9 = r9 + (-1)
            goto L18e
        L1a9:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r10)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r9.<init>(r10)
            r8.add(r9)
            int r8 = r0._stickfigureNodeCount
            int r9 = r10.getNodeCount(r7)
            int r8 = r8 + r9
            r0._stickfigureNodeCount = r8
            goto L252
        L1c3:
            if (r9 != r7) goto L1f1
            int r8 = r21.readInt()
            org.fortheloss.sticknodes.movieclip.MCReference r9 = new org.fortheloss.sticknodes.movieclip.MCReference
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r8 = r3.getLibraryMovieclip(r8)
            r9.<init>(r8, r0)
            r9.readPositionalData(r1, r2, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r9)
            org.fortheloss.sticknodes.movieclip.MCReference r8 = new org.fortheloss.sticknodes.movieclip.MCReference
            r8.<init>(r9, r0)
            r8.setDrawsTweenedStickfigureArray(r7)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._tweenedDrawableFigures
            r10.add(r8)
            int r8 = r0._stickfigureNodeCount
            int r9 = r9.getNodeCount(r7)
            int r8 = r8 + r9
            r0._stickfigureNodeCount = r8
            goto L252
        L1f1:
            r8 = 3
            if (r9 != r8) goto L222
            int r8 = r21.readInt()
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r9 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r9.<init>()
            org.fortheloss.sticknodes.sprite.ISpriteSource r8 = r3.getLibrarySprite(r8)
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r8 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r8
            r9.setSpriteGroupSource(r8)
            r9.readPositionalData(r1, r2, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r10 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r10.<init>(r9)
            r8.add(r10)
            int r8 = r0._stickfigureNodeCount
            int r9 = r9.getNodeCount(r7)
            int r8 = r8 + r9
            r0._stickfigureNodeCount = r8
            goto L252
        L222:
            r8 = 2
            if (r9 != r8) goto L252
            int r8 = r21.readInt()
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r9.<init>()
            org.fortheloss.sticknodes.sprite.ISpriteSource r8 = r3.getLibrarySprite(r8)
            org.fortheloss.sticknodes.sprite.SpriteSource r8 = (org.fortheloss.sticknodes.sprite.SpriteSource) r8
            r9.setSpriteSource(r8)
            r9.readPositionalData(r1, r2, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r10.<init>(r9)
            r8.add(r10)
            int r8 = r0._stickfigureNodeCount
            int r9 = r9.getNodeCount(r7)
            int r8 = r8 + r9
            r0._stickfigureNodeCount = r8
        L252:
            int r6 = r6 + 1
            goto L15f
        L256:
            r3 = 174(0xae, float:2.44E-43)
            if (r1 < r3) goto L2e4
            int r3 = r21.readInt()
        L25e:
            if (r3 <= 0) goto L2e4
            int r5 = r21.readInt()
            int r6 = r21.readInt()
            int r9 = r21.readInt()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._drawableFigures
            java.lang.Object r5 = r10.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            r10 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._drawableFigures
            int r12 = r12.size()
            int r12 = r12 - r7
        L27c:
            if (r12 < 0) goto L299
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._drawableFigures
            java.lang.Object r13 = r13.get(r12)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r13 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r13
            int r13 = r13.getID()
            if (r6 != r13) goto L296
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6 = r0._drawableFigures
            java.lang.Object r6 = r6.get(r12)
            r10 = r6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            goto L299
        L296:
            int r12 = r12 + (-1)
            goto L27c
        L299:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r10.getMainNode()
            r6.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r10.getMainNode()
            r6.validatePosition()
            org.fortheloss.sticknodes.stickfigure.INode r6 = r10.getNodeAtDrawOrderIndex(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            boolean r9 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r9 == 0) goto L2ba
            org.fortheloss.sticknodes.stickfigure.INode r9 = r5.getMainNode()
            float r9 = r9.getAngle()
            goto L2be
        L2ba:
            float r9 = r5.getRotation()
        L2be:
            float r10 = r6.getAngle()
            float r9 = r9 - r10
            r10 = 1127481344(0x43340000, float:180.0)
            float r9 = r9 + r10
            r12 = 1135869952(0x43b40000, float:360.0)
            float r9 = r9 % r12
            float r9 = r9 - r10
            r10 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L2d1
            float r9 = r9 + r12
        L2d1:
            if (r2 < r8) goto L2d7
            float r9 = r21.readFloat()
        L2d7:
            r5.setJoinOffsetAngle(r9)
            r5.joinTo(r6, r7)
            r0.onFigureJoined(r5, r6)
            int r3 = r3 + (-1)
            goto L25e
        L2e4:
            r3 = 150(0x96, float:2.1E-43)
            if (r1 < r3) goto L314
            int r3 = r21.readInt()
            r6 = 0
        L2ed:
            if (r6 >= r3) goto L314
            org.fortheloss.sticknodes.TextfieldBox r5 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.data.ProjectData r8 = r0._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r8 = r8.getFontLoader()
            r5.<init>(r7, r8)
            r8 = 176(0xb0, float:2.47E-43)
            if (r1 < r8) goto L302
            r5.readData(r1, r4, r11)
            goto L30c
        L302:
            int r8 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            r5.readData(r1, r4, r8)
            int r8 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            int r8 = r8 + r7
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r8
        L30c:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r8 = r0._textfieldBoxes
            r8.add(r5)
            int r6 = r6 + 1
            goto L2ed
        L314:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r0._frameCamera
            r3.readData(r1, r2, r4)
            return
    }

    public void readDataOld(int r8, org.fortheloss.sticknodes.data.ProjectData r9, java.nio.ByteBuffer r10) {
            r7 = this;
            byte r0 = r10.get()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r7._isTweened = r0
            r0 = 140(0x8c, float:1.96E-43)
            if (r8 < r0) goto L1a
            byte r0 = r10.get()
            if (r0 == 0) goto L18
            goto L1a
        L18:
            r0 = 0
            goto L1b
        L1a:
            r0 = 1
        L1b:
            r7._isUsingImageBackground = r0
            int r0 = r10.getInt()
            com.badlogic.gdx.graphics.Color r3 = r7._backgroundColor
            r4 = r0 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 / r5
            int r6 = r0 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r5
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.set(r4, r6, r0, r5)
            int r0 = r10.getInt()
            r3 = 0
        L3f:
            if (r3 >= r0) goto L6c
            int r4 = r10.getInt()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r9.getLibraryStickfigure(r4)
            r5.<init>(r4)
            r5.readPositionalDataOld(r8, r10)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r7._drawableFigures
            r4.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r7._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r6.<init>(r5)
            r4.add(r6)
            int r4 = r7._stickfigureNodeCount
            int r5 = r5.getNodeCount(r2)
            int r4 = r4 + r5
            r7._stickfigureNodeCount = r4
            int r3 = r3 + 1
            goto L3f
        L6c:
            r9 = 150(0x96, float:2.1E-43)
            if (r8 < r9) goto L93
            int r9 = r10.getInt()
        L74:
            if (r1 >= r9) goto L93
            org.fortheloss.sticknodes.TextfieldBox r0 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.data.ProjectData r3 = r7._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r3 = r3.getFontLoader()
            r0.<init>(r3)
            int r3 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            r0.readDataOld(r8, r10, r3)
            int r3 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID
            int r3 = r3 + r2
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r3
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3 = r7._textfieldBoxes
            r3.add(r0)
            int r1 = r1 + 1
            goto L74
        L93:
            return
    }

    public void refreshAllMovieclips(boolean r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.refreshAllMovieclips(r2, r3, r0)
            return
    }

    public void refreshAllMovieclips(boolean r4, boolean r5, boolean r6) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._drawableFigures
            int r4 = r4.size()
            int r4 = r4 - r0
        La:
            if (r4 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            java.lang.Object r1 = r1.get(r4)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 != 0) goto L17
            goto L28
        L17:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            java.lang.Object r1 = r1.get(r4)
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r2 = r1.getPlaymode()
            if (r2 == 0) goto L28
            r3.findOriginForMC(r1)
        L28:
            int r4 = r4 + (-1)
            goto La
        L2b:
            if (r6 == 0) goto L38
            org.fortheloss.sticknodes.data.FrameData r4 = r3._nextFrameRef
            if (r4 == 0) goto L38
            boolean r6 = r3._isLastFrame
            if (r6 != 0) goto L38
            r4.refreshAllMovieclips(r0, r5)
        L38:
            if (r5 == 0) goto L69
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._drawableFigures
            int r4 = r4.size()
            int r4 = r4 - r0
        L41:
            if (r4 < 0) goto L69
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r3._drawableFigures
            java.lang.Object r5 = r5.get(r4)
            boolean r5 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r5 == 0) goto L66
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r3._drawableFigures
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            int r6 = r5.getPlaymode()
            if (r6 == 0) goto L66
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6 = r3._tweenedDrawableFigures
            java.lang.Object r6 = r6.get(r4)
            org.fortheloss.sticknodes.movieclip.MCReference r6 = (org.fortheloss.sticknodes.movieclip.MCReference) r6
            r3.refreshMovieclip(r5, r6)
        L66:
            int r4 = r4 + (-1)
            goto L41
        L69:
            return
    }

    public void refreshFrameTotalNodeCount() {
            r4 = this;
            r0 = 0
            r4._stickfigureNodeCount = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r4._drawableFigures
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        Lb:
            if (r0 < 0) goto L21
            int r2 = r4._stickfigureNodeCount
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r4._drawableFigures
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getNodeCount(r1)
            int r2 = r2 + r3
            r4._stickfigureNodeCount = r2
            int r0 = r0 + (-1)
            goto Lb
        L21:
            return
    }

    public void refreshMovieclip(org.fortheloss.sticknodes.movieclip.MCReference r5, org.fortheloss.sticknodes.movieclip.MCReference r6) {
            r4 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            int r0 = r0.getActualFPS()
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            int r2 = r1.numTweenedFrames
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r1.frames
            int r3 = r3.size()
            boolean r1 = r1.getTweeningActuallyEnabled(r3)
            r5.calculateCurrentFrameIndex(r0, r2, r1)
            int r0 = r5.getCurrentFrameIndex()
            r6.setCurrentFrameIndex(r0)
            boolean r6 = r4._isLastFrame
            if (r6 != 0) goto L2d
            org.fortheloss.sticknodes.data.FrameData r6 = r4._nextFrameRef
            if (r6 == 0) goto L2d
            int r5 = r5.getID()
            r6.refreshMovieclip(r5)
        L2d:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void restoreReferences(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.data.IFrameData r2) {
            r0 = this;
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0._previousFrameRef = r1
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            r0._nextFrameRef = r2
            return
    }

    public void setAutoCameraBundle(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9, org.fortheloss.sticknodes.data.FrameData r10, boolean r11, boolean r12, short r13) {
            r8 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r8._autoCameraBundle
            if (r0 != 0) goto L1c
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = new org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle
            r1 = r0
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8._autoCameraBundle = r0
            org.fortheloss.sticknodes.data.FrameData r9 = r0.getFrame2()
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r10 = r8._autoCameraBundle
            r9.setLinkedAutoCameraBundleReference(r10)
            return
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Can't add an auto-camera to a frame that already has one, must be removed first."
            r9.<init>(r10)
            throw r9
    }

    public void setBackgroundColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._backgroundColor
            r0.set(r2)
            return
    }

    public void setCameraMoveDuringDelay(boolean r1) {
            r0 = this;
            r0._cameraIsMovingDuringDelay = r1
            return
    }

    public void setCameraMoveDuringDelayProperties(boolean r1, boolean r2, short r3) {
            r0 = this;
            r0._cameraMoveDuringDelayEaseIn = r1
            r0._cameraMoveDuringDelayEaseOut = r2
            r0._cameraMoveDuringDelayInterpolationID = r3
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            r3 = -1
        Lb:
            com.badlogic.gdx.math.Interpolation r1 = org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle.determineInterpolationFromID(r3, r1, r2)
            r0._cameraMoveDuringDelayInterpolationRef = r1
            return
    }

    public void setDelaySeconds(float r3) {
            r2 = this;
            r2._delaySeconds = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._delaySeconds = r0
            goto L12
        La:
            r0 = 1106247680(0x41f00000, float:30.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._delaySeconds = r0
        L12:
            float r3 = r2._delaySeconds
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._delaySeconds = r3
            boolean r3 = r2._isDelayed
            if (r3 == 0) goto L29
            r3 = 0
            r0 = 1
            r2.refreshAllMovieclips(r3, r0)
        L29:
            return
    }

    public void setExpandedGradient(boolean r1) {
            r0 = this;
            r0._isExpandedGradient = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setFigureOrder(java.util.ArrayList<java.lang.Integer> r6) {
            r5 = this;
            int r0 = r6.size()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._drawableFigures
            int r1 = r1.size()
            if (r0 != r1) goto L52
            int r0 = r6.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L51
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r1
        L1e:
            if (r3 >= r0) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._drawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getID()
            if (r4 != r2) goto L4b
            if (r3 == r1) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._drawableFigures
            java.lang.Object r2 = r2.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._drawableFigures
            r4.add(r1, r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._tweenedDrawableFigures
            java.lang.Object r2 = r2.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._tweenedDrawableFigures
            r3.add(r1, r2)
            goto L4e
        L4b:
            int r3 = r3 + 1
            goto L1e
        L4e:
            int r1 = r1 + 1
            goto L11
        L51:
            return
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r6 = r6.size()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._drawableFigures
            int r1 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't set figure order, ids ("
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ") and figures ("
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = ") size not the same"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setFigureOrder(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3, int r4) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            int r0 = r0.size()
            if (r4 < r0) goto L10
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r2._drawableFigures
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L10:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            int r3 = r0.indexOf(r3)
            if (r3 >= 0) goto L19
            return
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            java.lang.Object r1 = r0.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r0.add(r4, r1)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._tweenedDrawableFigures
            java.lang.Object r3 = r0.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            r0.add(r4, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setFigureOrderUndoRedo(java.lang.Integer[] r7) {
            r6 = this;
            int r0 = r7.length
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._drawableFigures
            int r1 = r1.size()
            if (r0 == r1) goto La
            return
        La:
            r0 = 0
            int r1 = r7.length
        Lc:
            if (r0 >= r1) goto L35
            r2 = r7[r0]
            int r2 = r2.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._drawableFigures
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L1c:
            if (r3 < 0) goto L32
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._drawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r4.getID()
            if (r5 != r2) goto L2f
            r6.setFigureOrder(r4, r0)
        L2f:
            int r3 = r3 + (-1)
            goto L1c
        L32:
            int r0 = r0 + 1
            goto Lc
        L35:
            return
    }

    public void setFrameTweening(boolean r2) {
            r1 = this;
            r1._isTweened = r2
            r2 = 0
            r0 = 1
            r1.refreshAllMovieclips(r2, r0)
            return
    }

    public void setGradientColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._gradientColor
            r0.set(r2)
            return
    }

    public void setIsDelayed(boolean r2) {
            r1 = this;
            r1._isDelayed = r2
            r2 = 0
            r0 = 1
            r1.refreshAllMovieclips(r2, r0)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setIsFirstFrame(boolean r1) {
            r0 = this;
            r0._isFirstFrame = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setIsLastFrame(boolean r1) {
            r0 = this;
            r0._isLastFrame = r1
            return
    }

    public void setIsRepeating(boolean r1) {
            r0 = this;
            r0._isRepeating = r1
            return
    }

    public void setIsUsingSlowMotionTweenedFrames(boolean r1) {
            r0 = this;
            r0._isUsingSlowMotionTweenedFrames = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setNextFrame(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0._nextFrameRef = r1
            if (r1 == 0) goto L8
            r1._previousFrameRef = r0
        L8:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setPreviousFrame(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0._previousFrameRef = r1
            if (r1 == 0) goto L8
            r1._nextFrameRef = r0
        L8:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setProperties(org.fortheloss.sticknodes.data.useractions.FrameDataProperties r4) {
            r3 = this;
            com.badlogic.gdx.graphics.Color r0 = r3._backgroundColor
            com.badlogic.gdx.graphics.Color r1 = r4.backgroundColor
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = r3._gradientColor
            com.badlogic.gdx.graphics.Color r1 = r4.gradientColor
            r0.set(r1)
            boolean r0 = r4.isTweened
            r3._isTweened = r0
            boolean r0 = r4.isUsingImageBackground
            r3._isUsingImageBackground = r0
            boolean r0 = r4.isUsingGradient
            r3._isUsingGradient = r0
            boolean r0 = r4.isExpandedGradient
            r3._isExpandedGradient = r0
            boolean r0 = r4.willStopSounds
            r3._willStopSounds = r0
            boolean r0 = r4.isDelayed
            r3._isDelayed = r0
            boolean r0 = r4.cameraIsMovingDuringDelay
            r3._cameraIsMovingDuringDelay = r0
            boolean r0 = r4.cameraMoveDuringDelayEaseIn
            r3._cameraMoveDuringDelayEaseIn = r0
            boolean r1 = r4.cameraMoveDuringDelayEaseOut
            r3._cameraMoveDuringDelayEaseOut = r1
            short r2 = r4.cameraMoveDuringDelayInterpolationID
            r3._cameraMoveDuringDelayInterpolationID = r2
            com.badlogic.gdx.math.Interpolation r0 = org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle.determineInterpolationFromID(r2, r0, r1)
            r3._cameraMoveDuringDelayInterpolationRef = r0
            float r0 = r4.delaySeconds
            r3._delaySeconds = r0
            boolean r0 = r4.isUsingSlowMotionTweenedFrames
            r3._isUsingSlowMotionTweenedFrames = r0
            int r0 = r4.slowMotionTweenedFrames
            r3._slowMotionTweenedFrames = r0
            boolean r0 = r4.isRepeating
            r3._isRepeating = r0
            int r0 = r4.repeatGoBackFrames
            r3._repeatGoBackFrames = r0
            int r0 = r4.repeatLoops
            r3._repeatLoops = r0
            boolean r0 = r4.useTweenPropertiesDuringRepeating
            r3._useTweenPropertiesDuringRepeating = r0
            int r0 = r4.soundLibraryID
            r3._soundLibraryID = r0
            float r0 = r4.soundVolume
            r3._soundVolume = r0
            float r0 = r4.soundPan
            r3._soundPan = r0
            float r4 = r4.soundPitch
            r3._soundPitch = r4
            return
    }

    public void setRepeatGoBackFrames(int r1) {
            r0 = this;
            r0._repeatGoBackFrames = r1
            return
    }

    public void setRepeatLoops(int r1) {
            r0 = this;
            r0._repeatLoops = r1
            return
    }

    public void setSlowMotionTweenedFrames(int r2) {
            r1 = this;
            r1._slowMotionTweenedFrames = r2
            r0 = 1
            if (r2 >= r0) goto L8
            r1._slowMotionTweenedFrames = r0
            goto Le
        L8:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r2 <= r0) goto Le
            r1._slowMotionTweenedFrames = r0
        Le:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundPan(float r3) {
            r2 = this;
            r2._soundPan = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._soundPan = r0
            goto L13
        Lb:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2._soundPan = r0
        L13:
            float r3 = r2._soundPan
            r0 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._soundPan = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundPitch(float r3) {
            r2 = this;
            r2._soundPitch = r3
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._soundPitch = r0
            goto L13
        Lb:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2._soundPitch = r0
        L13:
            float r3 = r2._soundPitch
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._soundPitch = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundToPlay(int r1) {
            r0 = this;
            r0._soundLibraryID = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundVolume(float r3) {
            r2 = this;
            r2._soundVolume = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._soundVolume = r0
            goto L14
        Lb:
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L14
            r2._soundVolume = r0
        L14:
            float r3 = r2._soundVolume
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._soundVolume = r3
            return
    }

    public void setUseGradient(boolean r1) {
            r0 = this;
            r0._isUsingGradient = r1
            return
    }

    public void setUseTweenPropertiesDuringRepeating(boolean r1) {
            r0 = this;
            r0._useTweenPropertiesDuringRepeating = r1
            return
    }

    public void setWillStopSounds(boolean r1) {
            r0 = this;
            r0._willStopSounds = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void sortFiguresArrayByLayerOrder(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData$1 r0 = new org.fortheloss.sticknodes.data.FrameData$1
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void swapFigures(int r3, int r4) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            java.lang.Object r1 = r0.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            java.lang.Object r0 = r0.set(r3, r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._drawableFigures
            r1.set(r4, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._tweenedDrawableFigures
            java.lang.Object r1 = r0.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            java.lang.Object r3 = r0.set(r3, r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._tweenedDrawableFigures
            r0.set(r4, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void tweenEverything(org.fortheloss.sticknodes.data.IFrameData r11, org.fortheloss.sticknodes.data.IFrameData r12, float r13) {
            r10 = this;
            org.fortheloss.sticknodes.data.FrameData r12 = (org.fortheloss.sticknodes.data.FrameData) r12
            java.util.ArrayList r0 = r12.getDrawableFigures()
            java.util.ArrayList r1 = r12.getTextfieldBoxes()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r12.getFrameCamera()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r10._drawableFigures
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L16:
            r3 = 0
            if (r2 < 0) goto Ld6
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r10._drawableFigures
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r0.size()
            int r5 = r5 + (-1)
        L27:
            if (r5 < 0) goto L3e
            java.lang.Object r6 = r0.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            int r7 = r6.getID()
            int r8 = r4.getID()
            if (r7 != r8) goto L3b
            r3 = r6
            goto L3e
        L3b:
            int r5 = r5 + (-1)
            goto L27
        L3e:
            if (r3 != 0) goto L5d
            r10.deleteFigure(r4)
            boolean r3 = r4.isJoined()
            if (r3 == 0) goto L4c
            r4.unjoin()
        L4c:
            boolean r3 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto Ld2
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            boolean r3 = r4.hasJoinAnchorNode()
            if (r3 == 0) goto Ld2
            r4.removeAllJoinedFigures()
            goto Ld2
        L5d:
            boolean r5 = r4.isJoined()
            if (r5 == 0) goto La9
            boolean r5 = r3.isJoined()
            if (r5 != 0) goto L70
            r4.unjoin()
            r10.onFigureUnjoined(r4)
            goto La9
        L70:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r4.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r5.getStickfigure()
            int r5 = r5.getID()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r3.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r6.getStickfigure()
            int r6 = r6.getID()
            if (r5 == r6) goto L91
            r4.unjoin()
            r10.onFigureUnjoined(r4)
            goto La9
        L91:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r4.getJoinedToNode()
            int r5 = r5.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r3.getJoinedToNode()
            int r6 = r6.getDrawOrderIndex()
            if (r5 == r6) goto La9
            r4.unjoin()
            r10.onFigureUnjoined(r4)
        La9:
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto Lce
            r5 = r11
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r5._drawableFigures
            int r6 = r4.getID()
            int r7 = r5.size()
            int r7 = r7 + (-1)
        Lbc:
            if (r7 < 0) goto Lce
            java.lang.Object r8 = r5.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            int r9 = r8.getID()
            if (r9 != r6) goto Lcb
            goto Lcf
        Lcb:
            int r7 = r7 + (-1)
            goto Lbc
        Lce:
            r8 = r4
        Lcf:
            r4.interpolateValues(r13, r8, r3)
        Ld2:
            int r2 = r2 + (-1)
            goto L16
        Ld6:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r10._drawableFigures
            int r11 = r11.size()
            int r11 = r11 + (-1)
        Lde:
            if (r11 < 0) goto L12e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r10._drawableFigures
            java.lang.Object r2 = r2.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r4 = r0.size()
            int r4 = r4 + (-1)
        Lee:
            if (r4 < 0) goto L104
            java.lang.Object r5 = r0.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            int r6 = r5.getID()
            int r7 = r2.getID()
            if (r6 != r7) goto L101
            goto L105
        L101:
            int r4 = r4 + (-1)
            goto Lee
        L104:
            r5 = r3
        L105:
            boolean r4 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L12b
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2.getLockedStickNode()
            if (r4 == 0) goto L12b
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r5.getLockedStickNode()
            if (r5 == 0) goto L128
            int r5 = r5.getDrawOrderIndex()
            int r4 = r4.getDrawOrderIndex()
            if (r5 == r4) goto L124
            goto L128
        L124:
            r2.repositionBasedOnLockedStickNode()
            goto L12b
        L128:
            r2.unlockStickNode()
        L12b:
            int r11 = r11 + (-1)
            goto Lde
        L12e:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r11 = r10._textfieldBoxes
            int r11 = r11.size()
            int r11 = r11 + (-1)
        L136:
            if (r11 < 0) goto L169
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r10._textfieldBoxes
            java.lang.Object r0 = r0.get(r11)
            org.fortheloss.sticknodes.TextfieldBox r0 = (org.fortheloss.sticknodes.TextfieldBox) r0
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L146:
            if (r2 < 0) goto L15c
            java.lang.Object r4 = r1.get(r2)
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            int r5 = r4.getID()
            int r6 = r0.getID()
            if (r5 != r6) goto L159
            goto L15d
        L159:
            int r2 = r2 + (-1)
            goto L146
        L15c:
            r4 = r3
        L15d:
            if (r4 != 0) goto L163
            r10.deleteTextfield(r0)
            goto L166
        L163:
            r0.interpolateValues(r13, r4)
        L166:
            int r11 = r11 + (-1)
            goto L136
        L169:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r11 = r10._frameCamera
            r11.interpolateValues(r13, r12)
            return
    }

    public void tweenFigures(java.util.ArrayList<java.lang.Integer> r8, java.util.ArrayList<java.lang.Integer> r9, org.fortheloss.sticknodes.data.FrameData r10, float r11) {
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4f
            java.lang.Object r2 = r8.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r9.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r7._drawableFigures
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r7._tweenedDrawableFigures
            java.lang.Object r2 = r5.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            if (r3 < 0) goto L38
            java.util.ArrayList r5 = r10.getDrawableFigures()
            java.lang.Object r5 = r5.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            goto L39
        L38:
            r5 = 0
        L39:
            r6 = -1
            if (r3 != r6) goto L46
            boolean r3 = r4.isPersistent()
            if (r3 != 0) goto L46
            r2.doNotDraw()
            goto L4c
        L46:
            r2.interpolateValues(r11, r4, r5)
            r2.validateDirtyNodes()
        L4c:
            int r1 = r1 + 1
            goto L5
        L4f:
            return
    }

    public void tweenTextfieldBoxes(int[] r5, org.fortheloss.sticknodes.data.FrameData r6, float r7) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r4._textfieldBoxes
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r4._textfieldBoxes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            r2 = r5[r0]
            r3 = -1
            if (r2 != r3) goto L1b
            r1.setTweenedValues(r1)
            goto L28
        L1b:
            java.util.ArrayList r3 = r6.getTextfieldBoxes()
            java.lang.Object r2 = r3.get(r2)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            r1.setTweenedValues(r7, r1, r2)
        L28:
            int r0 = r0 + (-1)
            goto L8
        L2b:
            return
    }

    public boolean willStopSounds() {
            r1 = this;
            boolean r0 = r1._willStopSounds
            return r0
    }
}
