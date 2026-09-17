package org.fortheloss.sticknodes.animationscreen.exporters.renderers;

/* loaded from: classes2.dex */
public class ExportRenderer implements com.badlogic.gdx.utils.Disposable {
    public static int errors;
    private int _actualFPS;
    private int _actualNumTweenedFrames;
    private boolean _allFramesRendered;
    private org.fortheloss.framework.Assets _assetsRef;
    private java.nio.ByteBuffer _byteBufferPixels;
    private boolean _cameraIsWobblingDuringDelay;
    private int _currentKeyframeIndex;
    private boolean _delayedFrameCameraIsMovingToNextFrame;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef;
    private boolean _delayedFrameIsAnimatingMCs;
    private int _endFrame;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fboFinal;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fboRender;
    private org.fortheloss.sticknodes.animationscreen.FilterBundle _filterBundle;
    private int _finalHeight;
    private int _finalWidth;
    private boolean _flagNeedToResetCameraMovingToNextFrameDuringDelay;
    private boolean _flagNeedToResetMovieclipsAnimatingDuringDelay;
    private boolean _flipAndSetToARGB;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCamera;
    private org.fortheloss.sticknodes.data.FrameData _frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef;
    private org.fortheloss.sticknodes.TextfieldBox _freeWatermarkText;
    private int _initialNumExtraDelayFrames;
    private boolean _isOldAAMethod;
    private java.util.ArrayList<java.lang.Integer> _nextFrameFigureIndices;
    private int[] _nextFrameTextfieldIndices;
    private int _numExtraDelayFrames;
    private int _numTweenedFramesToPlay;
    private com.badlogic.gdx.math.Matrix4 _oldProjectionMatrix;
    private byte[] _pixelsRGBA;
    private org.fortheloss.sticknodes.PlaybackRepeatManager _playbackRepeatManager;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private boolean _projectTweeningEnabled;
    private boolean _projectWatermarkEnabled;
    private boolean _renderDelay;
    private int _renderHeight;
    private boolean _renderNextKeyframe;
    private boolean _renderNextTweenedFrame;
    private int _renderTweenedFrameNumber;
    private int _renderWidth;
    private int _renderedFrameCount;
    private org.fortheloss.sticknodes.SNShapeRenderer _shapeRendererRef;
    private com.badlogic.gdx.scenes.scene2d.Stage _stageRef;
    private int _startFrame;
    private java.lang.String _statusString;
    private float _stickfigureScale;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram _textfieldBoxDFShaderRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> _textfieldsAboveWidescreenRef;
    private java.util.ArrayList<java.lang.Integer> _thisFrameFigureIndices;
    private float _totalDelaySeconds;
    private int _totalFrameCount;
    private boolean _transparentBG;
    private org.fortheloss.sticknodes.TextfieldBox _userWatermarkText;
    private float _viewportScaleXFbo1;
    private float _viewportScaleXFbo2;
    private float _viewportScaleYFbo1;
    private float _viewportScaleYFbo2;

    static {
            return
    }

    public ExportRenderer(org.fortheloss.sticknodes.data.ProjectData r3, com.badlogic.gdx.scenes.scene2d.Stage r4, org.fortheloss.framework.Assets r5, org.fortheloss.sticknodes.SNShapeRenderer r6, com.badlogic.gdx.graphics.g2d.BitmapFont r7, com.badlogic.gdx.graphics.glutils.ShaderProgram r8, boolean r9) {
            r2 = this;
            r2.<init>()
            r7 = 0
            r2._transparentBG = r7
            r2._isOldAAMethod = r7
            r0 = 0
            r2._stickfigureScale = r0
            r2._viewportScaleXFbo1 = r0
            r2._viewportScaleXFbo2 = r0
            r2._viewportScaleYFbo1 = r0
            r2._viewportScaleYFbo2 = r0
            r2._allFramesRendered = r7
            r2._projectWatermarkEnabled = r7
            r2._projectTweeningEnabled = r7
            r2._actualFPS = r7
            r2._actualNumTweenedFrames = r7
            r2._totalFrameCount = r7
            r2._renderedFrameCount = r7
            r2._startFrame = r7
            r2._endFrame = r7
            r1 = 1
            r2._renderNextKeyframe = r1
            r2._renderNextTweenedFrame = r7
            r2._renderTweenedFrameNumber = r7
            r2._numTweenedFramesToPlay = r7
            r1 = -1
            r2._currentKeyframeIndex = r1
            r2._renderDelay = r7
            r2._cameraIsWobblingDuringDelay = r7
            r2._delayedFrameCameraIsMovingToNextFrame = r7
            r2._delayedFrameIsAnimatingMCs = r7
            r2._numExtraDelayFrames = r7
            r2._initialNumExtraDelayFrames = r7
            r2._totalDelaySeconds = r0
            r2._flagNeedToResetCameraMovingToNextFrameDuringDelay = r7
            r2._flagNeedToResetMovieclipsAnimatingDuringDelay = r7
            r2._projectDataRef = r3
            r2._stageRef = r4
            r2._assetsRef = r5
            r2._shapeRendererRef = r6
            r2._textfieldBoxDFShaderRef = r8
            r2._flipAndSetToARGB = r9
            return
    }

    private void determineHowToRenderFromKeyframe(org.fortheloss.sticknodes.data.FrameData r7, org.fortheloss.sticknodes.data.FrameData r8, int r9) {
            r6 = this;
            int r0 = r6._endFrame
            int r1 = r6._startFrame
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            boolean r2 = r7.isDelayed()
            r3 = 0
            if (r2 == 0) goto L66
            float r2 = r7.getDelaySeconds()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = r6._actualFPS
            float r5 = (float) r5
            float r4 = r4 / r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L66
            r6._renderDelay = r1
            org.fortheloss.sticknodes.data.ProjectData r2 = r6._projectDataRef
            float r4 = r7.getDelaySeconds()
            int r2 = r2.getNumFramesForFrameDelay(r4)
            r6._numExtraDelayFrames = r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r7.getFrameCamera()
            boolean r2 = r2.isWobbling()
            r6._cameraIsWobblingDuringDelay = r2
            boolean r2 = r7.getCameraIsMovingDuringDelay()
            r6._delayedFrameCameraIsMovingToNextFrame = r2
            boolean r2 = r7.movieclipsAnimatingDuringPrepareIfApplicable()
            r6._delayedFrameIsAnimatingMCs = r2
            int r2 = r6._numExtraDelayFrames
            r6._initialNumExtraDelayFrames = r2
            float r2 = r7.getDelaySeconds()
            r6._totalDelaySeconds = r2
            boolean r2 = r6._delayedFrameCameraIsMovingToNextFrame
            if (r2 == 0) goto L5c
            if (r8 != 0) goto L53
            r6._delayedFrameCameraIsMovingToNextFrame = r3
            goto L5c
        L53:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r6._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r7.getFrameCamera()
            r8.copyFrom(r2, r3)
        L5c:
            boolean r8 = r6._delayedFrameIsAnimatingMCs
            if (r8 != 0) goto L64
            boolean r8 = r6._delayedFrameCameraIsMovingToNextFrame
            if (r8 == 0) goto L66
        L64:
            r6._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef = r7
        L66:
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r6._playbackRepeatManager
            int r8 = r8.getGoBackFrames()
            if (r8 <= 0) goto L7b
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r6._playbackRepeatManager
            org.fortheloss.sticknodes.data.FrameData r8 = r8.getLoopingOriginFrame()
            if (r7 != r8) goto L7b
            boolean r8 = r7.getUseTweenPropertiesDuringRepeating()
            goto L7c
        L7b:
            r8 = 1
        L7c:
            boolean r2 = r7.getCameraIsMovingDuringDelay()
            boolean r4 = r6._projectTweeningEnabled
            if (r4 == 0) goto L8f
            if (r9 <= 0) goto L87
            goto L8d
        L87:
            boolean r4 = r7.getIsUsingSlowMotionTweenedFrames()
            if (r4 == 0) goto L8f
        L8d:
            r4 = 1
            goto L90
        L8f:
            r4 = 0
        L90:
            if (r2 != 0) goto Lc2
            if (r4 == 0) goto Lc2
            if (r8 == 0) goto L9c
            boolean r8 = r7.isTweened()
            if (r8 == 0) goto Lc2
        L9c:
            if (r0 == r1) goto Lc2
            int r8 = r6._currentKeyframeIndex
            int r0 = r6._endFrame
            int r0 = r0 - r1
            if (r8 != r0) goto Lac
            org.fortheloss.sticknodes.data.ProjectData r8 = r6._projectDataRef
            boolean r8 = r8.isLoop
            if (r8 != 0) goto Lac
            goto Lc2
        Lac:
            r6._renderNextKeyframe = r3
            r6._renderNextTweenedFrame = r1
            r6._renderTweenedFrameNumber = r1
            boolean r8 = r7.getIsUsingSlowMotionTweenedFrames()
            if (r8 != 0) goto Lbb
            r6._numTweenedFramesToPlay = r9
            goto Lca
        Lbb:
            int r7 = r7.getSlowMotionTweenedFrames()
            r6._numTweenedFramesToPlay = r7
            goto Lca
        Lc2:
            r6._renderNextKeyframe = r1
            r6._renderNextTweenedFrame = r3
            r6._renderTweenedFrameNumber = r1
            r6._numTweenedFramesToPlay = r1
        Lca:
            return
    }

    private void maybeUpdateJoinChain(org.fortheloss.sticknodes.stickfigure.Stickfigure r7) {
            r6 = this;
            boolean r0 = r7.hasJoinAnchorNode()
            if (r0 == 0) goto L6e
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.add(r7)
        L11:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L68
            java.lang.Object r7 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            r7.validateDirtyNodes()
            java.util.ArrayList r1 = r7.getJoinAnchorNodes()
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L2a:
            if (r1 < 0) goto L11
            java.util.ArrayList r2 = r7.getJoinAnchorNodes()
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList r3 = r2.getJoinedFigures()
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L40:
            if (r3 < 0) goto L65
            java.util.ArrayList r4 = r2.getJoinedFigures()
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            org.fortheloss.sticknodes.stickfigure.INode r5 = r4.getMainNode()
            r5.flagPositionAsDirty()
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L62
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            boolean r5 = r4.hasJoinAnchorNode()
            if (r5 == 0) goto L62
            r0.add(r4)
        L62:
            int r3 = r3 + (-1)
            goto L40
        L65:
            int r1 = r1 + (-1)
            goto L2a
        L68:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
        L6e:
            return
    }

    private void maybeUpdateJoinChains(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L28
            java.lang.Object r1 = r3.get(r0)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r1 = r1.isJoined()
            if (r1 != 0) goto L25
            java.lang.Object r1 = r3.get(r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r2.maybeUpdateJoinChain(r1)
        L25:
            int r0 = r0 + (-1)
            goto L6
        L28:
            return
    }

    public boolean allFramesRendered() {
            r1 = this;
            boolean r0 = r1._allFramesRendered
            return r0
    }

    public void cancel() {
            r3 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r3._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            if (r0 == 0) goto L29
            boolean r1 = r3._flagNeedToResetMovieclipsAnimatingDuringDelay
            if (r1 == 0) goto Lb
            r0.movieclipsAnimatingDuringDelayFinished()
        Lb:
            boolean r0 = r3._flagNeedToResetCameraMovingToNextFrameDuringDelay
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.data.FrameData r0 = r3._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            java.util.ArrayList r0 = r0.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r1 = r3._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            java.util.ArrayList r1 = r1.getTextfieldBoxes()
            org.fortheloss.sticknodes.data.FrameData r2 = r3._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getFrameCamera()
            r2.removeAppliedMoveDuringDelay(r0, r1)
        L24:
            r0 = 0
            r3._flagNeedToResetMovieclipsAnimatingDuringDelay = r0
            r3._flagNeedToResetCameraMovingToNextFrameDuringDelay = r0
        L29:
            r0 = 0
            r3._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 50
            org.fortheloss.sticknodes.animationscreen.FilterBundle.EXTRA_BUFFER_SIZE_HALF = r0
            r0 = 0
            r2._projectDataRef = r0
            r2._stageRef = r0
            r2._shapeRendererRef = r0
            r2._textfieldBoxDFShaderRef = r0
            r2._thisFrameFigureIndices = r0
            r2._nextFrameFigureIndices = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r2._fboRender
            if (r1 == 0) goto L1a
            r1.dispose()
            r2._fboRender = r0
        L1a:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r2._fboFinal
            if (r1 == 0) goto L23
            r1.dispose()
            r2._fboFinal = r0
        L23:
            r2._pixelsRGBA = r0
            r2._byteBufferPixels = r0
            org.fortheloss.sticknodes.animationscreen.FilterBundle r1 = r2._filterBundle
            if (r1 == 0) goto L30
            r1.dispose()
            r2._filterBundle = r0
        L30:
            r2._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef = r0
            r2._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef = r0
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._userWatermarkText
            if (r1 == 0) goto L3d
            r1.dispose()
            r2._userWatermarkText = r0
        L3d:
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._freeWatermarkText
            if (r1 == 0) goto L46
            r1.dispose()
            r2._freeWatermarkText = r0
        L46:
            r2._assetsRef = r0
            r2._oldProjectionMatrix = r0
            r2._statusString = r0
            r2._textfieldsAboveWidescreenRef = r0
            r2._playbackRepeatManager = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r2._frameCamera
            if (r1 == 0) goto L59
            r1.dispose()
            r2._frameCamera = r0
        L59:
            return
    }

    public int getEndFrame() {
            r1 = this;
            int r0 = r1._endFrame
            return r0
    }

    public float getPercentComplete() {
            r2 = this;
            int r0 = r2._renderedFrameCount
            float r0 = (float) r0
            int r1 = r2._totalFrameCount
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    public byte[] getPixelsRGBA() {
            r1 = this;
            byte[] r0 = r1._pixelsRGBA
            return r0
    }

    public int getStartFrame() {
            r1 = this;
            int r0 = r1._startFrame
            return r0
    }

    public java.lang.String getStatusString() {
            r1 = this;
            java.lang.String r0 = r1._statusString
            return r0
    }

    public void initialize(int r26, int r27, int r28, int r29, int r30, int r31, int r32, boolean r33) {
            r25 = this;
            r1 = r25
            r3 = r26
            r4 = r27
            r8 = r30
            r9 = r31
            r2 = r32
            r10 = r33
            r0 = 300(0x12c, float:4.2E-43)
            org.fortheloss.sticknodes.animationscreen.FilterBundle.EXTRA_BUFFER_SIZE_HALF = r0
            r11 = 0
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors = r11
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG
            if (r0 == 0) goto L1f
            int r0 = org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors
            r0 = r0 | 8
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors = r0
        L1f:
            java.lang.String r0 = "statusRendering1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "..."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1._statusString = r0
            r12 = 1
            if (r2 != r12) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r1._isOldAAMethod = r0
            r1._transparentBG = r10
            r1._startFrame = r8
            r1._endFrame = r9
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r1._oldProjectionMatrix = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r13 = 0
            r0.<init>(r13)
            r1._frameCamera = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1._textfieldsAboveWidescreenRef = r0
            r14 = 2
            if (r2 != r14) goto L81
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r3 > r0) goto L72
            float r0 = (float) r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            int r0 = (int) r0
            r1._renderWidth = r0
            float r0 = (float) r4
            float r0 = r0 * r5
            int r0 = (int) r0
            r1._renderHeight = r0
            goto L85
        L72:
            float r0 = (float) r3
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r5
            int r0 = (int) r0
            r1._renderWidth = r0
            float r0 = (float) r4
            float r0 = r0 * r5
            int r0 = (int) r0
            r1._renderHeight = r0
            goto L85
        L81:
            r1._renderWidth = r3
            r1._renderHeight = r4
        L85:
            r1._finalWidth = r3
            r1._finalHeight = r4
            com.badlogic.gdx.graphics.Pixmap$Format r15 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> La0
            int r0 = r1._renderWidth     // Catch: java.lang.IllegalStateException -> La0
            int r5 = r1._renderHeight     // Catch: java.lang.IllegalStateException -> La0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r0
            r17 = r5
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.IllegalStateException -> La0
            r1._fboRender = r0     // Catch: java.lang.IllegalStateException -> La0
            goto Lec
        La0:
            r0 = move-exception
            r0.printStackTrace()
            if (r2 != r14) goto Lec
            float r0 = (float) r3
            r5 = 1067450368(0x3fa00000, float:1.25)
            float r0 = r0 * r5
            int r0 = (int) r0
            r1._renderWidth = r0
            float r6 = (float) r4
            float r6 = r6 * r5
            int r5 = (int) r6
            r1._renderHeight = r5
            int r6 = org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors     // Catch: java.lang.IllegalStateException -> Lcc
            r6 = r6 | r14
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors = r6     // Catch: java.lang.IllegalStateException -> Lcc
            com.badlogic.gdx.graphics.Pixmap$Format r15 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> Lcc
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r0
            r17 = r5
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.IllegalStateException -> Lcc
            r1._fboRender = r0     // Catch: java.lang.IllegalStateException -> Lcc
            goto Lec
        Lcc:
            r0 = move-exception
            int r2 = org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors
            r2 = r2 | 4
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors = r2
            r0.printStackTrace()
            r1._renderWidth = r3
            r1._renderHeight = r4
            com.badlogic.gdx.graphics.Pixmap$Format r2 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r26
            r4 = r27
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r2, r3, r4, r5, r6, r7)
            r1._fboRender = r0
            r1._isOldAAMethod = r11
            r2 = 1
        Lec:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r1._fboRender
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r0 = (com.badlogic.gdx.graphics.Texture) r0
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r0.setFilter(r3, r3)
            if (r2 == r14) goto L103
            boolean r0 = r1._transparentBG
            if (r0 != 0) goto L103
            boolean r0 = r1._flipAndSetToARGB
            if (r0 == 0) goto L120
        L103:
            com.badlogic.gdx.graphics.Pixmap$Format r14 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            int r15 = r1._finalWidth
            int r0 = r1._finalHeight
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r14, r15, r16, r17, r18, r19)
            r1._fboFinal = r0
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r0 = (com.badlogic.gdx.graphics.Texture) r0
            r0.setFilter(r3, r3)
        L120:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r3 = "= = = = = = = = = =\nExporting"
            r0.println(r3)
            java.io.PrintStream r0 = java.lang.System.out
            boolean r3 = r1._isOldAAMethod
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "aaMethod:      "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " (is old? "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ")"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.println(r2)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "transparentBG: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.println(r2)
            java.io.PrintStream r0 = java.lang.System.out
            int r2 = r1._renderWidth
            int r3 = r1._renderHeight
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "render @:      "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " x "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            java.io.PrintStream r0 = java.lang.System.out
            int r3 = r1._finalWidth
            int r4 = r1._finalHeight
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "downsize to:   "
            r5.append(r6)
            r5.append(r3)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            r0.println(r2)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r2 = "= = = = = = = = = ="
            r0.println(r2)
            int r0 = r1._finalWidth
            int r2 = r1._finalHeight
            int r0 = r0 * r2
            int r0 = r0 * 4
            java.nio.ByteBuffer r2 = com.badlogic.gdx.utils.BufferUtils.newByteBuffer(r0)
            r1._byteBufferPixels = r2
            byte[] r0 = new byte[r0]
            r1._pixelsRGBA = r0
            int r0 = r1._renderWidth
            float r0 = (float) r0
            org.fortheloss.sticknodes.data.ProjectData r2 = r1._projectDataRef
            int r2 = r2.canvasWidth
            float r2 = (float) r2
            float r0 = r0 / r2
            r1._stickfigureScale = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            float r0 = r0.getWorldWidth()
            int r2 = r1._renderWidth
            float r2 = (float) r2
            float r0 = r0 / r2
            r1._viewportScaleXFbo1 = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            float r0 = r0.getWorldHeight()
            int r2 = r1._renderHeight
            float r2 = (float) r2
            float r0 = r0 / r2
            r1._viewportScaleYFbo1 = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            float r0 = r0.getWorldWidth()
            int r2 = r1._finalWidth
            float r2 = (float) r2
            float r0 = r0 / r2
            r1._viewportScaleXFbo2 = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            float r0 = r0.getWorldHeight()
            int r2 = r1._finalHeight
            float r2 = (float) r2
            float r0 = r0 / r2
            r1._viewportScaleYFbo2 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 20
            r0.<init>(r2)
            r1._nextFrameFigureIndices = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1._thisFrameFigureIndices = r0
            r0 = 15
            int[] r0 = new int[r0]
            r1._nextFrameTextfieldIndices = r0
            r1._renderNextKeyframe = r12
            r1._renderNextTweenedFrame = r11
            r1._renderTweenedFrameNumber = r11
            r1._numTweenedFramesToPlay = r11
            int r0 = r8 + (-2)
            r1._currentKeyframeIndex = r0
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            boolean r2 = r0.watermarkEnabled
            r1._projectWatermarkEnabled = r2
            int r2 = r9 - r8
            int r3 = r2 + 1
            boolean r0 = r0.getTweeningActuallyEnabled(r3)
            r1._projectTweeningEnabled = r0
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            int r0 = r0.getActualFPS()
            r1._actualFPS = r0
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            int r0 = r0.getActualNumTweenedFrames()
            r1._actualNumTweenedFrames = r0
            if (r2 != 0) goto L26f
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r2 = r8 + (-1)
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            boolean r0 = r0.isDelayed()
            if (r0 == 0) goto L26f
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            boolean r2 = r0.tweeningEnabled
            if (r2 == 0) goto L26c
            int r0 = r0.fps
            r2 = 30
            if (r0 > r2) goto L26c
            r0 = 1
            goto L26d
        L26c:
            r0 = 0
        L26d:
            r1._projectTweeningEnabled = r0
        L26f:
            r1._renderedFrameCount = r11
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            int r0 = r0.getTotalFrameCount(r8, r9)
            r1._totalFrameCount = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r0.<init>(r13)
            r1._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef = r0
            org.fortheloss.sticknodes.PlaybackRepeatManager r0 = new org.fortheloss.sticknodes.PlaybackRepeatManager
            r0.<init>()
            r1._playbackRepeatManager = r0
            org.fortheloss.sticknodes.data.ProjectData r2 = r1._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r3 = r8 + (-1)
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            r0.prepare(r2, r3)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = new org.fortheloss.sticknodes.animationscreen.FilterBundle
            r14 = 3
            int r15 = r1._renderWidth
            int r2 = r1._renderHeight
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r1._fboRender
            r18 = 0
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r1._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r19 = r4.getBatch()
            org.fortheloss.framework.Assets r4 = r1._assetsRef
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r13 = r0
            r16 = r2
            r17 = r3
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1._filterBundle = r0
            org.fortheloss.sticknodes.TextfieldBox r0 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.data.ProjectData r2 = r1._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r2 = r2.getFontLoader()
            r0.<init>(r2)
            r1._userWatermarkText = r0
            r0.setAlignment(r12)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._userWatermarkText
            float r2 = r1._stickfigureScale
            r0.setScale(r2)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._userWatermarkText
            org.fortheloss.sticknodes.data.ProjectData r2 = r1._projectDataRef
            java.lang.String r2 = r2.watermarkText
            r0.setText(r2)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._userWatermarkText
            org.fortheloss.sticknodes.data.ProjectData r2 = r1._projectDataRef
            com.badlogic.gdx.graphics.Color r2 = r2.watermarkColor
            r0.setColor(r2)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._userWatermarkText
            r2 = 0
            r0.setPosition(r2, r2)
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            if (r0 == 0) goto L2f9
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._userWatermarkText
            r0.setFigureRotation(r3)
        L2f9:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L33b
            org.fortheloss.sticknodes.TextfieldBox r0 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.data.ProjectData r4 = r1._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r4 = r4.getFontLoader()
            r0.<init>(r4)
            r1._freeWatermarkText = r0
            r0.setAlignment(r12)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._freeWatermarkText
            java.lang.String r4 = "StickNodes.com"
            r0.setText(r4)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._freeWatermarkText
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            r0.setColor(r4)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._freeWatermarkText
            r4 = 1058642330(0x3f19999a, float:0.6)
            float r5 = r1._stickfigureScale
            float r5 = r5 * r4
            r0.setScale(r5)
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._freeWatermarkText
            r0.setPosition(r2, r2)
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            if (r0 == 0) goto L33b
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._freeWatermarkText
            r0.setFigureRotation(r3)
        L33b:
            return
    }

    public void renderNextFrameToFBO() {
            r37 = this;
            r0 = r37
            boolean r1 = r0._allFramesRendered
            if (r1 == 0) goto L7
            return
        L7:
            int r1 = r0._renderedFrameCount
            r2 = 1
            int r1 = r1 + r2
            r0._renderedFrameCount = r1
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r0._totalFrameCount
            int r1 = java.lang.Math.min(r1, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            int r1 = r0._totalFrameCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r2] = r1
            java.lang.String r1 = "statusRendering2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "..."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0._statusString = r1
            boolean r1 = r0._renderDelay
            r3 = 0
            if (r1 == 0) goto L7e
            int r1 = r0._numExtraDelayFrames
            int r1 = r1 - r2
            r0._numExtraDelayFrames = r1
            if (r1 > 0) goto L7e
            r0._renderDelay = r4
            r0._cameraIsWobblingDuringDelay = r4
            r0._numExtraDelayFrames = r4
            r0._initialNumExtraDelayFrames = r4
            r0._totalDelaySeconds = r3
            boolean r1 = r0._delayedFrameIsAnimatingMCs
            if (r1 == 0) goto L61
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            r1.movieclipsAnimatingDuringDelayJumpToKeyframe()
            r0._delayedFrameIsAnimatingMCs = r4
            r0._flagNeedToResetMovieclipsAnimatingDuringDelay = r2
        L61:
            boolean r1 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r1 == 0) goto L7e
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            java.util.ArrayList r1 = r1.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r5 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            java.util.ArrayList r5 = r5.getTextfieldBoxes()
            org.fortheloss.sticknodes.data.FrameData r6 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r6 = r6.getFrameCamera()
            r6.removeAppliedMoveDuringDelay(r1, r5)
            r0._delayedFrameCameraIsMovingToNextFrame = r4
            r0._flagNeedToResetCameraMovingToNextFrameDuringDelay = r2
        L7e:
            boolean r1 = r0._renderDelay
            if (r1 == 0) goto L94
            boolean r5 = r0._cameraIsWobblingDuringDelay
            if (r5 != 0) goto L94
            boolean r5 = r0._delayedFrameIsAnimatingMCs
            if (r5 != 0) goto L94
            boolean r5 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r5 != 0) goto L94
            java.nio.ByteBuffer r1 = r0._byteBufferPixels
            r1.rewind()
            return
        L94:
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L117
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r7 = r0._currentKeyframeIndex
            java.lang.Object r1 = r1.get(r7)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            java.util.ArrayList r14 = r1.getDrawableFigures()
            java.util.ArrayList r15 = r1.getTextfieldBoxes()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r1.getFrameCamera()
            r7.copyFrom(r8, r4)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            r7.temporarilyReferenceLockedBundles(r1)
            float r7 = r0._totalDelaySeconds
            int r8 = r0._numExtraDelayFrames
            int r9 = r0._initialNumExtraDelayFrames
            int r8 = r8 - r9
            int r8 = java.lang.Math.abs(r8)
            float r8 = (float) r8
            int r9 = r0._initialNumExtraDelayFrames
            float r9 = (float) r9
            float r8 = r8 / r9
            float r9 = r0._totalDelaySeconds
            float r8 = r8 * r9
            float r13 = java.lang.Math.min(r7, r8)
            boolean r7 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r7 == 0) goto Lfb
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r8 = r0._currentKeyframeIndex
            int r8 = r8 + r2
            java.lang.Object r7 = r7.get(r8)
            org.fortheloss.sticknodes.data.FrameData r7 = (org.fortheloss.sticknodes.data.FrameData) r7
            org.fortheloss.sticknodes.animationscreen.FrameCamera r9 = r7.getFrameCamera()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r0._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef
            float r10 = r0._totalDelaySeconds
            float r10 = r13 / r10
            com.badlogic.gdx.math.Interpolation r11 = r1.getCameraMoveDuringDelayInterpolation()
            r12 = r14
            r3 = r13
            r13 = r15
            r7.applyMoveDuringDelay(r8, r9, r10, r11, r12, r13)
            goto Lfc
        Lfb:
            r3 = r13
        Lfc:
            boolean r7 = r0._delayedFrameIsAnimatingMCs
            if (r7 == 0) goto L10f
            double r8 = (double) r3
            int r3 = r0._actualFPS
            float r3 = (float) r3
            float r3 = r6 / r3
            double r10 = (double) r3
            boolean r12 = r0._projectTweeningEnabled
            int r13 = r0._actualNumTweenedFrames
            r7 = r1
            r7.movieclipsAnimatingDuringDelayRelativeIncrement(r8, r10, r12, r13)
        L10f:
            r3 = 0
        L110:
            r36 = r15
            r15 = r14
            r14 = r36
            goto L3c3
        L117:
            boolean r1 = r0._renderNextKeyframe
            if (r1 != 0) goto L2f9
            boolean r1 = r0._projectTweeningEnabled
            if (r1 != 0) goto L121
            goto L2f9
        L121:
            boolean r1 = r0._renderNextTweenedFrame
            if (r1 == 0) goto L2f3
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            boolean r3 = r1.isLoop
            if (r3 != 0) goto L136
            int r3 = r0._currentKeyframeIndex
            int r7 = r0._endFrame
            int r7 = r7 - r2
            if (r3 < r7) goto L136
            r0._allFramesRendered = r2
            goto L2f3
        L136:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r3 = r0._currentKeyframeIndex
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            int r3 = r0._renderTweenedFrameNumber
            if (r3 != r2) goto L276
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            int r3 = r3.getGoBackFrames()
            if (r3 >= 0) goto L155
            int r3 = r0._currentKeyframeIndex
            int r3 = r3 + r2
            int r7 = r0._endFrame
            if (r3 < r7) goto L162
            r3 = 0
            goto L162
        L155:
            int r3 = r0._currentKeyframeIndex
            org.fortheloss.sticknodes.PlaybackRepeatManager r7 = r0._playbackRepeatManager
            int r7 = r7.getGoBackFrames()
            int r3 = r3 - r7
            int r3 = java.lang.Math.max(r4, r3)
        L162:
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r3 = r7.get(r3)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList<java.lang.Integer> r7 = r0._nextFrameFigureIndices
            r7.clear()
            java.util.ArrayList<java.lang.Integer> r7 = r0._thisFrameFigureIndices
            r7.clear()
            java.util.ArrayList r7 = r1.getDrawableFigures()
            java.util.ArrayList r8 = r3.getDrawableFigures()
            java.lang.Class<java.util.ArrayList> r9 = java.util.ArrayList.class
            java.lang.Object r9 = com.badlogic.gdx.utils.Pools.obtain(r9)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r10 = r7.size()
            int r10 = r10 - r2
        L18b:
            if (r10 < 0) goto L1c4
            java.lang.Object r11 = r7.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            boolean r12 = r11.isJoined()
            if (r12 == 0) goto L1b2
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r11.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = r11.getStickfigure()
            r12 = 0
        L1a2:
            int r12 = r12 + r2
            boolean r13 = r11.isJoined()
            if (r13 == 0) goto L1b3
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r11.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = r11.getStickfigure()
            goto L1a2
        L1b2:
            r12 = 0
        L1b3:
            java.lang.Class<org.fortheloss.framework.Int2> r11 = org.fortheloss.framework.Int2.class
            java.lang.Object r11 = com.badlogic.gdx.utils.Pools.obtain(r11)
            org.fortheloss.framework.Int2 r11 = (org.fortheloss.framework.Int2) r11
            r11.set(r10, r12)
            r9.add(r11)
            int r10 = r10 + (-1)
            goto L18b
        L1c4:
            java.util.Comparator r10 = org.fortheloss.framework.Int2.getComparatorY()
            java.util.Collections.sort(r9, r10)
            int r10 = r9.size()
            r11 = 0
        L1d0:
            if (r11 >= r10) goto L1e9
            java.lang.Object r12 = r9.get(r11)
            org.fortheloss.framework.Int2 r12 = (org.fortheloss.framework.Int2) r12
            java.util.ArrayList<java.lang.Integer> r13 = r0._thisFrameFigureIndices
            int r14 = r12.x
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            com.badlogic.gdx.utils.Pools.free(r12)
            int r11 = r11 + 1
            goto L1d0
        L1e9:
            r9.clear()
            com.badlogic.gdx.utils.Pools.free(r9)
            java.util.ArrayList<java.lang.Integer> r9 = r0._thisFrameFigureIndices
            int r9 = r9.size()
            r10 = 0
        L1f6:
            r11 = -1
            if (r10 >= r9) goto L233
            java.util.ArrayList<java.lang.Integer> r12 = r0._thisFrameFigureIndices
            java.lang.Object r12 = r12.get(r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.Object r12 = r7.get(r12)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            int r12 = r12.getID()
            int r13 = r8.size()
            int r13 = r13 - r2
        L214:
            if (r13 < 0) goto L227
            java.lang.Object r14 = r8.get(r13)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r14 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r14
            int r14 = r14.getID()
            if (r14 != r12) goto L224
            r11 = r13
            goto L227
        L224:
            int r13 = r13 + (-1)
            goto L214
        L227:
            java.util.ArrayList<java.lang.Integer> r12 = r0._nextFrameFigureIndices
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.add(r11)
            int r10 = r10 + 1
            goto L1f6
        L233:
            java.util.ArrayList<java.lang.Integer> r7 = r0._thisFrameFigureIndices
            java.util.ArrayList<java.lang.Integer> r8 = r0._nextFrameFigureIndices
            r1.prepBeforeInterpolation(r7, r8, r3)
            int[] r7 = r0._nextFrameTextfieldIndices
            java.util.Arrays.fill(r7, r11)
            java.util.ArrayList r7 = r1.getTextfieldBoxes()
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            int r8 = r7.size()
            int r8 = r8 - r2
        L24c:
            if (r8 < 0) goto L276
            java.lang.Object r9 = r7.get(r8)
            org.fortheloss.sticknodes.TextfieldBox r9 = (org.fortheloss.sticknodes.TextfieldBox) r9
            int r9 = r9.getID()
            int r10 = r3.size()
            int r10 = r10 - r2
        L25d:
            if (r10 < 0) goto L273
            java.lang.Object r11 = r3.get(r10)
            org.fortheloss.sticknodes.TextfieldBox r11 = (org.fortheloss.sticknodes.TextfieldBox) r11
            int r11 = r11.getID()
            if (r11 != r9) goto L270
            int[] r9 = r0._nextFrameTextfieldIndices
            r9[r8] = r10
            goto L273
        L270:
            int r10 = r10 + (-1)
            goto L25d
        L273:
            int r8 = r8 + (-1)
            goto L24c
        L276:
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            int r3 = r3.getGoBackFrames()
            if (r3 >= 0) goto L297
            int r3 = r0._currentKeyframeIndex
            int r3 = r3 + r2
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r7 = r7.size()
            if (r3 < r7) goto L28c
            r3 = 0
        L28c:
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r3 = r7.get(r3)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            goto L2ae
        L297:
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r7 = r0._currentKeyframeIndex
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r0._playbackRepeatManager
            int r8 = r8.getGoBackFrames()
            int r7 = r7 - r8
            int r7 = java.lang.Math.max(r4, r7)
            java.lang.Object r3 = r3.get(r7)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
        L2ae:
            int r7 = r0._renderTweenedFrameNumber
            float r7 = (float) r7
            int r8 = r0._numTweenedFramesToPlay
            int r8 = r8 + r2
            float r8 = (float) r8
            float r7 = r7 / r8
            java.util.ArrayList<java.lang.Integer> r8 = r0._thisFrameFigureIndices
            java.util.ArrayList<java.lang.Integer> r9 = r0._nextFrameFigureIndices
            r1.tweenFigures(r8, r9, r3, r7)
            int[] r8 = r0._nextFrameTextfieldIndices
            r1.tweenTextfieldBoxes(r8, r3, r7)
            java.util.ArrayList r8 = r1.getTweenedDrawableFigures()
            java.util.ArrayList r9 = r1.getTextfieldBoxes()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r10 = r0._frameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r1.getTweenedFrameCamera(r7, r3)
            r10.copyFrom(r3, r4)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r0._frameCamera
            r3.temporarilyReferenceLockedBundles(r1)
            int r3 = r0._renderTweenedFrameNumber
            int r7 = r0._numTweenedFramesToPlay
            if (r3 >= r7) goto L2e6
            r0._renderNextKeyframe = r4
            r0._renderNextTweenedFrame = r2
            int r3 = r3 + r2
            r0._renderTweenedFrameNumber = r3
            goto L2ee
        L2e6:
            r0._renderNextKeyframe = r2
            r0._renderNextTweenedFrame = r4
            r0._renderTweenedFrameNumber = r2
            r0._numTweenedFramesToPlay = r2
        L2ee:
            r14 = r8
            r15 = r9
            r3 = 1
            goto L3be
        L2f3:
            r1 = r5
            r14 = r1
            r15 = r14
        L2f6:
            r3 = 0
            goto L3be
        L2f9:
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            if (r1 == 0) goto L323
            boolean r3 = r0._flagNeedToResetMovieclipsAnimatingDuringDelay
            if (r3 == 0) goto L304
            r1.movieclipsAnimatingDuringDelayFinished()
        L304:
            boolean r1 = r0._flagNeedToResetCameraMovingToNextFrameDuringDelay
            if (r1 == 0) goto L31d
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            java.util.ArrayList r1 = r1.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r3 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            org.fortheloss.sticknodes.data.FrameData r7 = r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r7.getFrameCamera()
            r7.removeAppliedMoveDuringDelay(r1, r3)
        L31d:
            r0._flagNeedToResetMovieclipsAnimatingDuringDelay = r4
            r0._flagNeedToResetCameraMovingToNextFrameDuringDelay = r4
            r0._frameToRestoreAnimatedDuringDelayMCsAndCameraMovementRef = r5
        L323:
            org.fortheloss.sticknodes.PlaybackRepeatManager r1 = r0._playbackRepeatManager
            int r1 = r1.getGoBackFrames()
            if (r1 >= 0) goto L331
            int r1 = r0._currentKeyframeIndex
            int r1 = r1 + r2
            r0._currentKeyframeIndex = r1
            goto L33a
        L331:
            int r3 = r0._currentKeyframeIndex
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r4, r3)
            r0._currentKeyframeIndex = r1
        L33a:
            int r1 = r0._currentKeyframeIndex
            int r3 = r0._endFrame
            if (r1 < r3) goto L346
            r0._allFramesRendered = r2
            r1 = r5
            r7 = r1
            r8 = r7
            goto L3ba
        L346:
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r1 = r7.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1
            int r7 = r0._currentKeyframeIndex
            r3.calculateNextFrame(r1, r7)
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r3 = r0._currentKeyframeIndex
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            int r3 = r3.getGoBackFrames()
            if (r3 >= 0) goto L388
            int r3 = r0._currentKeyframeIndex
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r7 = r7.size()
            int r7 = r7 - r2
            if (r3 >= r7) goto L386
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r7 = r0._currentKeyframeIndex
            int r7 = r7 + r2
            java.lang.Object r3 = r3.get(r7)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            goto L39f
        L386:
            r3 = r5
            goto L39f
        L388:
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r7 = r0._currentKeyframeIndex
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r0._playbackRepeatManager
            int r8 = r8.getGoBackFrames()
            int r7 = r7 - r8
            int r7 = java.lang.Math.max(r4, r7)
            java.lang.Object r3 = r3.get(r7)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
        L39f:
            java.util.ArrayList r7 = r1.getDrawableFigures()
            java.util.ArrayList r8 = r1.getTextfieldBoxes()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r9 = r0._frameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r10 = r1.getFrameCamera()
            r9.copyFrom(r10, r4)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r9 = r0._frameCamera
            r9.temporarilyReferenceLockedBundles(r1)
            int r9 = r0._actualNumTweenedFrames
            r0.determineHowToRenderFromKeyframe(r1, r3, r9)
        L3ba:
            r14 = r7
            r15 = r8
            goto L2f6
        L3be:
            boolean r7 = r0._allFramesRendered
            if (r7 == 0) goto L110
            return
        L3c3:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            boolean r7 = r7.isWobbling()
            if (r7 == 0) goto L3ef
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            boolean r8 = r7.tweeningEnabled
            if (r8 == 0) goto L3da
            int r7 = r7.getActualNumTweenedFrames()
            int r7 = r7 + r2
            float r7 = (float) r7
            float r7 = r6 / r7
            goto L3dc
        L3da:
            r7 = 1065353216(0x3f800000, float:1.0)
        L3dc:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r0._frameCamera
            r8.incrementStaticWobbleSeed(r7)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            boolean r7 = r7.applyWobble(r15, r14, r3)
            if (r7 == 0) goto L3ec
            r0.maybeUpdateJoinChains(r15)
        L3ec:
            r16 = 1
            goto L3f1
        L3ef:
            r16 = 0
        L3f1:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            float r7 = r7.getCameraScale()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r0._frameCamera
            float r8 = r8.getCameraOffsetX()
            float r8 = -r8
            float r8 = r8 / r7
            float r9 = r0._stickfigureScale
            float r30 = r8 * r9
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r0._frameCamera
            float r8 = r8.getCameraOffsetY()
            float r8 = -r8
            float r8 = r8 / r7
            float r9 = r0._stickfigureScale
            float r31 = r8 * r9
            float r32 = r9 / r7
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r0._shapeRendererRef
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r0._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r9 = r9.getBatch()
            com.badlogic.gdx.math.Matrix4 r9 = r9.getProjectionMatrix()
            r8.setProjectionMatrix(r9)
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r9 = r8.getProjectionMatrix()
            float r10 = r0._viewportScaleXFbo1
            float r11 = r0._viewportScaleYFbo1
            com.badlogic.gdx.math.Matrix4 r9 = r9.scale(r10, r11, r6)
            r8.setProjectionMatrix(r9)
            com.badlogic.gdx.math.Matrix4 r8 = r0._oldProjectionMatrix
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r0._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r9 = r9.getBatch()
            com.badlogic.gdx.math.Matrix4 r9 = r9.getProjectionMatrix()
            r8.set(r9)
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r0._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r13 = r8.getBatch()
            com.badlogic.gdx.math.Matrix4 r8 = r13.getProjectionMatrix()
            float r9 = r0._viewportScaleXFbo1
            float r10 = r0._viewportScaleYFbo1
            com.badlogic.gdx.math.Matrix4 r8 = r8.scale(r9, r10, r6)
            r13.setProjectionMatrix(r8)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r8 = r0._textfieldBoxDFShaderRef
            r8.bind()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r8 = r0._textfieldBoxDFShaderRef
            float r9 = r0._viewportScaleXFbo1
            java.lang.String r12 = "u_viewportScale"
            r8.setUniformf(r12, r9)
            com.badlogic.gdx.graphics.GL20 r8 = com.badlogic.gdx.Gdx.gl
            r11 = 3042(0xbe2, float:4.263E-42)
            r8.glEnable(r11)
            r13.enableBlending()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r0._fboRender
            r8.begin()
            com.badlogic.gdx.graphics.Color r8 = r1.getBackgroundColor()
            boolean r9 = r0._transparentBG
            if (r9 != 0) goto L487
            com.badlogic.gdx.graphics.GL20 r9 = com.badlogic.gdx.Gdx.gl
            float r10 = r8.r
            float r11 = r8.g
            float r4 = r8.b
            r9.glClearColor(r10, r11, r4, r6)
            r9 = 0
            goto L48d
        L487:
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl
            r9 = 0
            r4.glClearColor(r9, r9, r9, r9)
        L48d:
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl
            r11 = 16384(0x4000, float:2.2959E-41)
            r4.glClear(r11)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r0._frameCamera
            float r4 = r4.getCameraRotationDeg()
            float r4 = -r4
            r33 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r10 == 0) goto L4d8
            int r10 = r0._renderWidth
            float r10 = (float) r10
            float r10 = r10 * r33
            int r11 = r0._renderHeight
            float r11 = (float) r11
            float r11 = r11 * r33
            org.fortheloss.sticknodes.SNShapeRenderer r5 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r5.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r2.translate(r10, r11, r9)
            com.badlogic.gdx.math.Matrix4 r2 = r2.rotate(r9, r9, r6, r4)
            float r10 = -r10
            float r11 = -r11
            com.badlogic.gdx.math.Matrix4 r2 = r2.translate(r10, r11, r9)
            r5.setTransformMatrix(r2)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r2.getTransformMatrix()
            r13.setTransformMatrix(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            r5 = 1
            r2.setIsUsingRotatedTransformationMatrix(r5)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            r2.setTransformationRotationDeg(r4)
            r5 = 1
            goto L4d9
        L4d8:
            r5 = 0
        L4d9:
            boolean r2 = r1.isUsingGradient()
            if (r2 == 0) goto L542
            boolean r2 = r0._transparentBG
            if (r2 != 0) goto L542
            com.badlogic.gdx.graphics.Color r25 = r1.getGradientColor()
            boolean r2 = r1.isExpandedGradient()
            if (r2 == 0) goto L4f2
            int r2 = r0._renderWidth
            int r2 = r2 * 5
            goto L4f4
        L4f2:
            int r2 = r0._renderWidth
        L4f4:
            float r2 = (float) r2
            boolean r1 = r1.isExpandedGradient()
            if (r1 == 0) goto L500
            int r1 = r0._renderHeight
            int r1 = r1 * 5
            goto L502
        L500:
            int r1 = r0._renderHeight
        L502:
            float r1 = (float) r1
            org.fortheloss.sticknodes.SNShapeRenderer r9 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r10 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r9.begin(r10)
            float r2 = r2 / r7
            double r9 = (double) r2
            double r9 = java.lang.Math.ceil(r9)
            int r2 = (int) r9
            float r2 = (float) r2
            float r1 = r1 / r7
            double r9 = (double) r1
            double r9 = java.lang.Math.ceil(r9)
            int r1 = (int) r9
            float r1 = (float) r1
            org.fortheloss.sticknodes.SNShapeRenderer r9 = r0._shapeRendererRef
            int r10 = r0._renderWidth
            float r10 = (float) r10
            float r10 = r10 / r7
            float r10 = r10 - r2
            float r10 = r10 * r33
            float r18 = r10 + r30
            int r10 = r0._renderHeight
            float r10 = (float) r10
            float r10 = r10 / r7
            float r10 = r10 - r1
            float r10 = r10 * r33
            float r19 = r10 + r31
            r17 = r9
            r20 = r2
            r21 = r1
            r22 = r8
            r23 = r8
            r24 = r25
            r17.rect(r18, r19, r20, r21, r22, r23, r24, r25)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            r1.end()
        L542:
            int r1 = r15.size()
            r2 = 0
        L547:
            if (r2 >= r1) goto L555
            java.lang.Object r7 = r15.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            r7.validateDirtyNodes()
            int r2 = r2 + 1
            goto L547
        L555:
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1.begin(r2)
            int r1 = r15.size()
            r2 = 0
        L561:
            if (r2 >= r1) goto L58f
            java.lang.Object r7 = r15.get(r2)
            r17 = r7
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r17 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r17
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r0._shapeRendererRef
            org.fortheloss.sticknodes.animationscreen.FilterBundle r8 = r0._filterBundle
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            boolean r9 = r0._isOldAAMethod
            r29 = 0
            r18 = r7
            r19 = r13
            r20 = r8
            r21 = r30
            r22 = r31
            r25 = r32
            r28 = r9
            r17.drawLimbs(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r2 = r2 + 1
            goto L561
        L58f:
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            r1.end()
            if (r14 == 0) goto L613
            int r1 = r14.size()
            if (r1 <= 0) goto L613
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCamera
            boolean r2 = r2.isWidescreen()
            if (r2 == 0) goto L5ac
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            boolean r2 = r2.isYoutubeShorts
            if (r2 != 0) goto L5ac
            r2 = 0
            goto L5ad
        L5ac:
            r2 = 1
        L5ad:
            r13.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r7 = r0._textfieldBoxDFShaderRef
            r13.setShader(r7)
            r11 = 0
        L5b6:
            if (r11 >= r1) goto L605
            java.lang.Object r7 = r14.get(r11)
            org.fortheloss.sticknodes.TextfieldBox r7 = (org.fortheloss.sticknodes.TextfieldBox) r7
            if (r2 != 0) goto L5d6
            boolean r8 = r7.getDrawAboveWidescreenBars()
            if (r8 == 0) goto L5d6
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r8 = r0._textfieldsAboveWidescreenRef
            r8.add(r7)
            r17 = r1
            r19 = r11
            r34 = r12
            r6 = r13
            r35 = r14
            r1 = r15
            goto L5f8
        L5d6:
            r13.flush()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r0._textfieldBoxDFShaderRef
            r17 = 0
            r18 = 0
            r8 = r13
            r10 = r30
            r19 = r11
            r11 = r31
            r34 = r12
            r12 = r17
            r6 = r13
            r13 = r18
            r35 = r14
            r14 = r32
            r17 = r1
            r1 = r15
            r15 = r3
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
        L5f8:
            int r11 = r19 + 1
            r15 = r1
            r13 = r6
            r1 = r17
            r12 = r34
            r14 = r35
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L5b6
        L605:
            r34 = r12
            r6 = r13
            r35 = r14
            r1 = r15
            r7 = 0
            r6.setShader(r7)
            r6.end()
            goto L619
        L613:
            r34 = r12
            r6 = r13
            r35 = r14
            r1 = r15
        L619:
            if (r5 == 0) goto L63a
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r5 = r2.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r5 = r5.idt()
            r2.setTransformMatrix(r5)
            com.badlogic.gdx.math.Matrix4 r2 = r6.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r2.idt()
            r6.setTransformMatrix(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            r5 = 0
            r2.setIsUsingRotatedTransformationMatrix(r5)
            goto L63b
        L63a:
            r5 = 0
        L63b:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCamera
            boolean r2 = r2.isWidescreen()
            if (r2 == 0) goto L6f7
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            boolean r2 = r2.isYoutubeShorts
            if (r2 != 0) goto L6f7
            int r2 = r0._renderWidth
            int r2 = r2 + 4
            float r2 = (float) r2
            r7 = 1124335616(0x43040000, float:132.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            float r7 = r0._stickfigureScale
            float r8 = r8 * r7
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r9 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r7.begin(r9)
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r0._shapeRendererRef
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r7.setColor(r10, r10, r10, r9)
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r0._shapeRendererRef
            int r9 = r0._renderHeight
            float r9 = (float) r9
            float r9 = r9 - r8
            r10 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 + r10
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r7.rect(r10, r9, r2, r8)
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r0._shapeRendererRef
            r7.rect(r10, r10, r2, r8)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            r2.end()
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r2 = r0._textfieldsAboveWidescreenRef
            int r2 = r2.size()
            if (r2 <= 0) goto L6f7
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0._frameCamera
            float r7 = r7.getCameraRotationDeg()
            float r7 = -r7
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L6b4
            int r7 = r0._renderWidth
            float r7 = (float) r7
            float r7 = r7 * r33
            int r9 = r0._renderHeight
            float r9 = (float) r9
            float r9 = r9 * r33
            com.badlogic.gdx.math.Matrix4 r10 = r6.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r10 = r10.translate(r7, r9, r8)
            r11 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r4 = r10.rotate(r8, r8, r11, r4)
            float r7 = -r7
            float r9 = -r9
            com.badlogic.gdx.math.Matrix4 r4 = r4.translate(r7, r9, r8)
            r6.setTransformMatrix(r4)
        L6b4:
            boolean r4 = r6.isDrawing()
            if (r4 != 0) goto L6bd
            r6.begin()
        L6bd:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r0._textfieldBoxDFShaderRef
            r6.setShader(r4)
            r4 = 0
        L6c3:
            if (r4 >= r2) goto L6e3
            r6.flush()
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r5 = r0._textfieldsAboveWidescreenRef
            java.lang.Object r5 = r5.get(r4)
            r7 = r5
            org.fortheloss.sticknodes.TextfieldBox r7 = (org.fortheloss.sticknodes.TextfieldBox) r7
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r0._textfieldBoxDFShaderRef
            r12 = 0
            r13 = 0
            r8 = r6
            r10 = r30
            r11 = r31
            r14 = r32
            r15 = r3
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
            int r4 = r4 + 1
            goto L6c3
        L6e3:
            r4 = 0
            r6.setShader(r4)
            r6.end()
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r2.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r2.idt()
            r6.setTransformMatrix(r2)
        L6f7:
            if (r16 == 0) goto L706
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCamera
            r15 = r35
            boolean r2 = r2.removeAppliedWobble(r1, r15, r3)
            if (r2 == 0) goto L706
            r0.maybeUpdateJoinChains(r1)
        L706:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r0._textfieldsAboveWidescreenRef
            r1.clear()
            boolean r1 = r0._projectWatermarkEnabled
            r2 = 1092616192(0x41200000, float:10.0)
            if (r1 == 0) goto L7bc
            r6.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r0._textfieldBoxDFShaderRef
            r6.setShader(r1)
            float r1 = r0._stickfigureScale
            float r1 = r1 * r2
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            boolean r3 = r3.isYoutubeShorts
            if (r3 == 0) goto L77b
            org.fortheloss.sticknodes.TextfieldBox r1 = r0._userWatermarkText
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0._textfieldBoxDFShaderRef
            int r4 = r0._renderWidth
            float r4 = (float) r4
            float r5 = r1.getWidth()
            org.fortheloss.sticknodes.TextfieldBox r7 = r0._userWatermarkText
            float r7 = r7.getScale()
            float r5 = r5 * r7
            float r5 = r5 * r33
            float r4 = r4 - r5
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._userWatermarkText
            float r5 = r5.getHeight()
            org.fortheloss.sticknodes.TextfieldBox r7 = r0._userWatermarkText
            float r7 = r7.getScale()
            float r5 = r5 * r7
            float r20 = r4 - r5
            org.fortheloss.sticknodes.TextfieldBox r4 = r0._userWatermarkText
            float r4 = r4.getWidth()
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._userWatermarkText
            float r5 = r5.getScale()
            float r4 = r4 * r5
            float r4 = r4 * r33
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._userWatermarkText
            float r5 = r5.getHeight()
            org.fortheloss.sticknodes.TextfieldBox r7 = r0._userWatermarkText
            float r7 = r7.getScale()
            float r5 = r5 * r7
            float r21 = r4 + r5
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r17 = r1
            r18 = r6
            r19 = r3
            r17.draw(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L7b5
        L77b:
            org.fortheloss.sticknodes.TextfieldBox r3 = r0._userWatermarkText
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r0._textfieldBoxDFShaderRef
            int r5 = r0._renderWidth
            float r5 = (float) r5
            float r7 = r3.getWidth()
            org.fortheloss.sticknodes.TextfieldBox r8 = r0._userWatermarkText
            float r8 = r8.getScale()
            float r7 = r7 * r8
            float r5 = r5 - r7
            float r20 = r5 - r1
            int r1 = r0._renderHeight
            float r1 = (float) r1
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._userWatermarkText
            float r5 = r5.getHeight()
            org.fortheloss.sticknodes.TextfieldBox r7 = r0._userWatermarkText
            float r7 = r7.getScale()
            float r5 = r5 * r7
            float r21 = r1 - r5
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r17 = r3
            r18 = r6
            r19 = r4
            r17.draw(r18, r19, r20, r21, r22, r23, r24, r25)
        L7b5:
            r1 = 0
            r6.setShader(r1)
            r6.end()
        L7bc:
            org.fortheloss.sticknodes.TextfieldBox r1 = r0._freeWatermarkText
            if (r1 == 0) goto L85d
            r6.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r0._textfieldBoxDFShaderRef
            r6.setShader(r1)
            float r1 = r0._stickfigureScale
            float r20 = r1 * r2
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            boolean r1 = r1.isYoutubeShorts
            if (r1 == 0) goto L833
            org.fortheloss.sticknodes.TextfieldBox r1 = r0._freeWatermarkText
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r0._textfieldBoxDFShaderRef
            float r3 = r1.getWidth()
            org.fortheloss.sticknodes.TextfieldBox r4 = r0._freeWatermarkText
            float r4 = r4.getScale()
            float r3 = r3 * r4
            float r3 = -r3
            float r3 = r3 * r33
            org.fortheloss.sticknodes.TextfieldBox r4 = r0._freeWatermarkText
            float r4 = r4.getHeight()
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._freeWatermarkText
            float r5 = r5.getScale()
            float r4 = r4 * r5
            float r4 = r4 * r33
            float r3 = r3 + r4
            float r3 = r3 + r20
            int r4 = r0._renderHeight
            float r4 = (float) r4
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._freeWatermarkText
            float r5 = r5.getWidth()
            org.fortheloss.sticknodes.TextfieldBox r7 = r0._freeWatermarkText
            float r7 = r7.getScale()
            float r5 = r5 * r7
            float r5 = r5 * r33
            float r4 = r4 - r5
            org.fortheloss.sticknodes.TextfieldBox r5 = r0._freeWatermarkText
            float r5 = r5.getHeight()
            org.fortheloss.sticknodes.TextfieldBox r7 = r0._freeWatermarkText
            float r7 = r7.getScale()
            float r5 = r5 * r7
            float r5 = r5 * r33
            float r4 = r4 + r5
            float r21 = r4 - r20
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r17 = r1
            r18 = r6
            r19 = r2
            r20 = r3
            r17.draw(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L856
        L833:
            org.fortheloss.sticknodes.TextfieldBox r1 = r0._freeWatermarkText
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r0._textfieldBoxDFShaderRef
            float r3 = r1.getHeight()
            org.fortheloss.sticknodes.TextfieldBox r4 = r0._freeWatermarkText
            float r4 = r4.getScale()
            float r3 = r3 * r4
            float r21 = r3 + r20
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r17 = r1
            r18 = r6
            r19 = r2
            r17.draw(r18, r19, r20, r21, r22, r23, r24, r25)
        L856:
            r1 = 0
            r6.setShader(r1)
            r6.end()
        L85d:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fboRender
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fboFinal
            if (r2 == 0) goto L91c
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 3042(0xbe2, float:4.263E-42)
            r1.glDisable(r2)
            r6.disableBlending()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fboFinal
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboRender
            r3.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboFinal
            r3.begin()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r4 = 0
            r3.glClearColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r4 = 16384(0x4000, float:2.2959E-41)
            r3.glClear(r4)
            com.badlogic.gdx.math.Matrix4 r3 = r0._oldProjectionMatrix
            r6.setProjectionMatrix(r3)
            com.badlogic.gdx.math.Matrix4 r3 = r6.getProjectionMatrix()
            float r4 = r0._viewportScaleXFbo2
            float r5 = r0._viewportScaleYFbo2
            r7 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r3 = r3.scale(r4, r5, r7)
            r6.setProjectionMatrix(r3)
            r6.begin()
            r6.setColor(r7, r7, r7, r7)
            boolean r3 = r0._flipAndSetToARGB
            if (r3 == 0) goto L8e7
            boolean r3 = r0._transparentBG
            if (r3 == 0) goto L8b2
            org.fortheloss.sticknodes.animationscreen.FilterBundle r3 = r0._filterBundle
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r3.argbAndUnpremultiplyShader
            r6.setShader(r3)
            goto L8b9
        L8b2:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r3 = r0._filterBundle
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r3.argbShader
            r6.setShader(r3)
        L8b9:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboRender
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            r18 = r3
            com.badlogic.gdx.graphics.Texture r18 = (com.badlogic.gdx.graphics.Texture) r18
            r19 = 0
            r20 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboFinal
            int r3 = r3.getWidth()
            float r3 = (float) r3
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r0._fboFinal
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r17 = r6
            r21 = r3
            r22 = r4
            r17.draw(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L914
        L8e7:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboRender
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            r18 = r3
            com.badlogic.gdx.graphics.Texture r18 = (com.badlogic.gdx.graphics.Texture) r18
            r19 = 0
            r20 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboFinal
            int r3 = r3.getWidth()
            float r3 = (float) r3
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r0._fboFinal
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r23 = 0
            r24 = 0
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 1065353216(0x3f800000, float:1.0)
            r17 = r6
            r21 = r3
            r22 = r4
            r17.draw(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L914:
            r3 = 0
            r6.setShader(r3)
            r6.end()
            goto L91e
        L91c:
            r2 = 3042(0xbe2, float:4.263E-42)
        L91e:
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r4 = 3333(0xd05, float:4.67E-42)
            r5 = 1
            r3.glPixelStorei(r4, r5)
            java.nio.ByteBuffer r3 = r0._byteBufferPixels
            r3.clear()
            com.badlogic.gdx.graphics.GL20 r7 = com.badlogic.gdx.Gdx.gl
            r8 = 0
            r9 = 0
            int r10 = r1.getWidth()
            int r11 = r1.getHeight()
            r12 = 6408(0x1908, float:8.98E-42)
            r13 = 5121(0x1401, float:7.176E-42)
            java.nio.ByteBuffer r14 = r0._byteBufferPixels
            r7.glReadPixels(r8, r9, r10, r11, r12, r13, r14)
            java.nio.ByteBuffer r3 = r0._byteBufferPixels
            r3.clear()
            java.nio.ByteBuffer r3 = r0._byteBufferPixels
            byte[] r4 = r0._pixelsRGBA
            r3.get(r4)
            r1.end()
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r3 = r0._oldProjectionMatrix
            r1.setProjectionMatrix(r3)
            com.badlogic.gdx.math.Matrix4 r1 = r0._oldProjectionMatrix
            r6.setProjectionMatrix(r1)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            int r1 = r1.getScreenWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r0._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r3 = r3.getViewport()
            float r3 = r3.getWorldWidth()
            float r1 = r1 / r3
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0._textfieldBoxDFShaderRef
            r3.bind()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0._textfieldBoxDFShaderRef
            r4 = r34
            r3.setUniformf(r4, r1)
            r6.disableBlending()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glDisable(r2)
            return
    }
}
