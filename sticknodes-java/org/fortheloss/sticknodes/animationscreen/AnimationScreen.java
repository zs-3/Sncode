package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class AnimationScreen extends org.fortheloss.framework.AppScreen implements org.fortheloss.framework.ISaveMediaToGalleryDelegate {
    public static int onOpenFlag;
    private com.badlogic.gdx.graphics.Color _DEBUGbgColor1;
    private com.badlogic.gdx.graphics.Color _DEBUGbgColor2;
    private org.fortheloss.sticknodes.StickfigureDominantColorFinder _DEBUGstickfigureDominantColorFinder;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> _activeDialogs;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModule;
    private boolean _backupCreationStickfigureEnabled;
    private float _backupCreationStickfigureTimer;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModule;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModule;
    private int _debugBackgroundColorPresetIndex;
    private com.badlogic.gdx.graphics.Color[] _debugBackgroundColorPresets;
    private long _debugClearFrameLastTapTime;
    private double _delayInitialSeconds;
    private boolean _delayedFrameCameraIsMovingToNextFrame;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef;
    private boolean _delayedFrameIsAnimatingMCs;
    private boolean _delayedFrameIsWobbling;
    private org.fortheloss.sticknodes.animationscreen.EasterEgg _easterEgg;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ExitDialog _exitDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog _exportProgressDialogRef;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fboBuffer;
    private com.badlogic.gdx.graphics.OrthographicCamera _fboCamera;
    private boolean _fboEffectActive;
    private float _fboEffectAlpha;
    private com.badlogic.gdx.math.Vector2 _fboEffectAlphaStartEnd;
    private com.badlogic.gdx.math.Interpolation _fboEffectInterpolation;
    private float _fboEffectScale;
    private com.badlogic.gdx.math.Vector2 _fboEffectScaleStartEnd;
    private float _fboEffectSeconds;
    private float _fboEffectTimer;
    private java.lang.String _filenameJustFinishedExporting;
    private boolean _firstTimeCreationMode;
    private boolean _flagBeginMiniGame;
    private boolean _flagOpenProjectReady;
    private boolean _flagStartNewProject;
    private org.fortheloss.sticknodes.data.IFrameData _frameBeforePlayingRef;
    private int _frameBeforePlayingRefIndex;
    private org.fortheloss.sticknodes.animationscreen.FrameContextMenu _frameContextMenu;
    private org.fortheloss.sticknodes.data.FrameData _frameToRestoreAnimatedDuringDelayMCsRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModule;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _fullscreenListener;
    private com.badlogic.gdx.scenes.scene2d.Group _groupModules;
    private boolean _isExportingGIF;
    private boolean _isExportingMP4;
    private boolean _isExportingPNG;
    private boolean _isFirstAnimationScreenSinceAppStart;
    private org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog _isOpeningDialogRef;
    private boolean _isRendering;
    private boolean _isShowingEasterEgg;
    private float _memoryUpdateTimer;
    private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModule;
    private java.util.ArrayList<java.lang.Integer> _nextFrameFigureIndices;
    private org.fortheloss.sticknodes.data.IFrameData _nextFrameForTweeningRef;
    private int[] _nextFrameTextfieldIndices;
    private org.fortheloss.sticknodes.animationscreen.NodeDrawTools _nodeDrawTools;
    private int _numTweenedFramesToPlay;
    private boolean _playFirstFrame;
    private boolean _playNextKeyframe;
    private boolean _playNextTweenedFrame;
    private int _playTweenedFrameNumber;
    private int _playbackRangeEndFrame;
    private int _playbackRangeGoBackToStartFrame;
    private org.fortheloss.sticknodes.PlaybackRepeatManager _playbackRepeatManager;
    private double _playingKeyframeDelay;
    private org.fortheloss.sticknodes.animationscreen.PopupText _popupText;
    private org.fortheloss.sticknodes.data.ProjectData _projectData;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataToOpenRef;
    private float _savePromptSeconds;
    private float _savePromptTimer;
    private org.fortheloss.sticknodes.Screenshotter _screenshotter;
    private org.fortheloss.sticknodes.data.SessionData _sessionData;
    private org.fortheloss.sticknodes.SNShapeRenderer _shapeRenderer;
    private java.util.ArrayList<java.lang.Integer> _thisFrameFigureIndices;
    private org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper _threadedGifExportLooper;
    private org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper _threadedMP4ExportLooper;
    private org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper _threadedPNGExportLooper;
    private org.fortheloss.sticknodes.animationscreen.TiledBackground _tiledBackground;
    private double _timeElapsedSinceDelay;
    private double _timePassed;
    private org.fortheloss.sticknodes.animationscreen.TooltipManager _tooltipManager;
    private org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu _viewOptionsMenu;
    private boolean _waitingOnDelayedFrame;
    private boolean _willShowProAd;
    private org.fortheloss.sticknodes.animationscreen.ZoomButtons _zoomButtons;














    /* renamed from: -$$Nest$fget_activeDialogs, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m197$$Nest$fget_activeDialogs(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r0._activeDialogs
            return r0
    }

    /* renamed from: -$$Nest$fget_animateToolsModule, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule m198$$Nest$fget_animateToolsModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r0._animateToolsModule
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModule, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m199$$Nest$fget_canvasModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModule
            return r0
    }

    /* renamed from: -$$Nest$fget_isOpeningDialogRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog m200$$Nest$fget_isOpeningDialogRef(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog r0 = r0._isOpeningDialogRef
            return r0
    }

    /* renamed from: -$$Nest$fget_movieclipToolsModule, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule m201$$Nest$fget_movieclipToolsModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r0._movieclipToolsModule
            return r0
    }

    /* renamed from: -$$Nest$fget_projectData, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m202$$Nest$fget_projectData(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectData
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataToOpenRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m203$$Nest$fget_projectDataToOpenRef(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataToOpenRef
            return r0
    }

    /* renamed from: -$$Nest$fget_sessionData, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.SessionData m204$$Nest$fget_sessionData(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            org.fortheloss.sticknodes.data.SessionData r0 = r0._sessionData
            return r0
    }

    /* renamed from: -$$Nest$fput_projectDataToOpenRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m205$$Nest$fput_projectDataToOpenRef(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0, org.fortheloss.sticknodes.data.ProjectData r1) {
            r0._projectDataToOpenRef = r1
            return
    }

    /* renamed from: -$$Nest$mopenProjectFinished, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m206$$Nest$mopenProjectFinished(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0, boolean r1) {
            r0.openProjectFinished(r1)
            return
    }

    /* renamed from: -$$Nest$mperformAndroidStorageTransfer, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m207$$Nest$mperformAndroidStorageTransfer(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0, com.badlogic.gdx.Preferences r1) {
            r0.performAndroidStorageTransfer(r1)
            return
    }

    static {
            return
    }

    public AnimationScreen(org.fortheloss.sticknodes.App r5, org.fortheloss.sticknodes.data.ProjectData r6, boolean r7) {
            r4 = this;
            r4.<init>(r5)
            r0 = 0
            r4._isExportingGIF = r0
            r4._isExportingMP4 = r0
            r4._isExportingPNG = r0
            r1 = 0
            r4._timePassed = r1
            r4._playingKeyframeDelay = r1
            r4._timeElapsedSinceDelay = r1
            r4._delayInitialSeconds = r1
            r4._waitingOnDelayedFrame = r0
            r4._delayedFrameIsWobbling = r0
            r4._delayedFrameCameraIsMovingToNextFrame = r0
            r4._delayedFrameIsAnimatingMCs = r0
            r4._playNextKeyframe = r0
            r4._playFirstFrame = r0
            r1 = 1
            r4._playNextTweenedFrame = r1
            r4._playTweenedFrameNumber = r1
            r4._numTweenedFramesToPlay = r1
            r4._frameBeforePlayingRefIndex = r0
            r2 = 0
            r4._memoryUpdateTimer = r2
            r4._flagBeginMiniGame = r0
            r4._flagStartNewProject = r0
            r4._flagOpenProjectReady = r0
            r4._isFirstAnimationScreenSinceAppStart = r0
            r4._isShowingEasterEgg = r0
            r4._fboEffectActive = r1
            r4._fboEffectTimer = r2
            r4._fboEffectSeconds = r2
            r4._fboEffectScale = r2
            r4._fboEffectAlpha = r2
            r4._savePromptTimer = r2
            r4._savePromptSeconds = r2
            r4._backupCreationStickfigureTimer = r2
            r4._backupCreationStickfigureEnabled = r1
            r4._willShowProAd = r0
            r4._firstTimeCreationMode = r1
            r4._playbackRangeEndFrame = r0
            r1 = -1
            r4._playbackRangeGoBackToStartFrame = r1
            r4._isRendering = r0
            r4._debugBackgroundColorPresetIndex = r0
            r2 = 0
            r4._debugClearFrameLastTapTime = r2
            org.fortheloss.sticknodes.App.isUsingCustomSkin = r0
            r4._projectData = r6
            r4._isFirstAnimationScreenSinceAppStart = r7
            int r5 = r5.getOutsideOpenRequest()
            if (r5 == r1) goto L67
            r4._isFirstAnimationScreenSinceAppStart = r0
        L67:
            org.fortheloss.sticknodes.data.SessionData r5 = new org.fortheloss.sticknodes.data.SessionData
            org.fortheloss.sticknodes.data.ProjectData r6 = r4._projectData
            org.fortheloss.sticknodes.animationscreen.FontLoader r6 = r6.getFontLoader()
            r5.<init>(r4, r6)
            r4._sessionData = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.hasShownGuidlines = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r0)
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            boolean r5 = r5.isPro()
            if (r5 == 0) goto L8a
            boolean r5 = org.fortheloss.sticknodes.App.isParroted
            if (r5 == 0) goto L8a
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            r5.loadInterstitialAd()
        L8a:
            return
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$000(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$100(org.fortheloss.sticknodes.animationscreen.AnimationScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    private void addPopupText() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = new org.fortheloss.sticknodes.animationscreen.PopupText
            r0.<init>(r5)
            r5._popupText = r0
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r5._stageRef
            r1.addActor(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            boolean r0 = r0.getIsLeftHandMode()
            r1 = 1109393408(0x42200000, float:40.0)
            r2 = 1107296256(0x42000000, float:32.0)
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r5._popupText
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r5.getStage()
            float r3 = r3.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r5._animateToolsModule
            float r4 = r4.getWidth()
            float r3 = r3 - r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r4
            float r3 = r3 - r2
            float r4 = r4 * r1
            r0.setPosition(r3, r4)
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r5._popupText
            r1 = 16
            r0.align(r1)
            goto L4d
        L3b:
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r5._popupText
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r5._animateToolsModule
            float r3 = r3.getWidth()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r4
            float r3 = r3 + r2
            float r4 = r4 * r1
            r0.setPosition(r3, r4)
        L4d:
            return
    }

    private void beginPlayingFullscreen() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r1 = 0
            r0.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.setNeedsToBeDrawn()
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r2._fullscreenListener
            if (r0 != 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$12 r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$12
            r0.<init>(r2)
            r2._fullscreenListener = r0
        L2f:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._fullscreenListener
            r0.addListener(r1)
            return
    }

    private void checkMCsForSounds(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6) {
            r5 = this;
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L4f
            java.lang.Object r1 = r6.get(r0)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r6.get(r0)
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r2 = r1.getPlaymode()
            if (r2 != 0) goto L1d
            goto L4c
        L1d:
            int r2 = r1.getCurrentFrameIndex()
            org.fortheloss.sticknodes.data.MCFrameData r2 = r1.getFrameAt(r2)
            int r3 = r2.getSoundToPlayLibraryID()
            if (r3 < 0) goto L4c
            float r1 = r1.getVolumeScale()
            org.fortheloss.sticknodes.data.ProjectData r4 = r5._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r4 = r4.librarySoundDatas
            java.lang.Object r3 = r4.get(r3)
            org.fortheloss.sticknodes.data.SoundData r3 = (org.fortheloss.sticknodes.data.SoundData) r3
            com.badlogic.gdx.audio.Sound r3 = r3.sound
            float r4 = r2.getSoundVolume()
            float r4 = r4 * r1
            float r1 = r2.getSoundPitch()
            float r2 = r2.getSoundPan()
            r3.play(r4, r1, r2)
        L4c:
            int r0 = r0 + (-1)
            goto L6
        L4f:
            return
    }

    private void debugColorBackground() {
            r11 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r11._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            if (r1 > 0) goto L11
            return
        L11:
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
        L17:
            r3 = 0
            if (r1 < 0) goto L27
            java.lang.Object r4 = r0.get(r1)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L24
            r1 = 1
            goto L28
        L24:
            int r1 = r1 + (-1)
            goto L17
        L27:
            r1 = 0
        L28:
            if (r1 != 0) goto L2b
            return
        L2b:
            com.badlogic.gdx.Input r1 = com.badlogic.gdx.Gdx.input
            r4 = 146(0x92, float:2.05E-43)
            boolean r1 = r1.isKeyPressed(r4)
            org.fortheloss.sticknodes.StickfigureDominantColorFinder r4 = r11._DEBUGstickfigureDominantColorFinder
            if (r4 != 0) goto L4c
            org.fortheloss.sticknodes.StickfigureDominantColorFinder r4 = new org.fortheloss.sticknodes.StickfigureDominantColorFinder
            r4.<init>()
            r11._DEBUGstickfigureDominantColorFinder = r4
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r4.<init>()
            r11._DEBUGbgColor1 = r4
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r4.<init>()
            r11._DEBUGbgColor2 = r4
        L4c:
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1132396544(0x437f0000, float:255.0)
            if (r1 != 0) goto L95
            r1 = r4
        L54:
            if (r1 != 0) goto L71
            double r7 = java.lang.Math.random()
            int r9 = r0.size()
            int r9 = r9 - r2
            double r9 = (double) r9
            double r7 = r7 * r9
            int r7 = (int) r7
            java.lang.Object r7 = r0.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            boolean r8 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r8 == 0) goto L54
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            goto L54
        L71:
            org.fortheloss.sticknodes.StickfigureDominantColorFinder r0 = r11._DEBUGstickfigureDominantColorFinder
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r11._shapeRenderer
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r11.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r8 = r8.getBatch()
            com.badlogic.gdx.graphics.Color r0 = r0.getDominantColor(r7, r8, r1)
            float r1 = r0.r
            float r1 = r1 * r6
            int r1 = (int) r1
            float r7 = r0.g
            float r7 = r7 * r6
            int r7 = (int) r7
            float r0 = r0.b
            float r0 = r0 * r6
            int r0 = (int) r0
            float[] r0 = java.awt.Color.RGBtoHSB(r1, r7, r0, r4)
            goto Lbc
        L95:
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            double r7 = java.lang.Math.random()
            float r1 = (float) r7
            double r7 = java.lang.Math.random()
            float r7 = (float) r7
            double r8 = java.lang.Math.random()
            float r8 = (float) r8
            r0.<init>(r1, r7, r8, r5)
            float r1 = r0.r
            float r1 = r1 * r6
            int r1 = (int) r1
            float r7 = r0.g
            float r7 = r7 * r6
            int r7 = (int) r7
            float r0 = r0.b
            float r0 = r0 * r6
            int r0 = (int) r0
            float[] r0 = java.awt.Color.RGBtoHSB(r1, r7, r0, r4)
        Lbc:
            r1 = r0[r3]
            r3 = r0[r2]
            r4 = 2
            r0 = r0[r4]
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lcc
            float r1 = r1 - r5
        Lcc:
            double r7 = java.lang.Math.random()
            float r4 = (float) r7
            r7 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r7
            float r4 = r4 + r0
            r0 = 1060320051(0x3f333333, float:0.7)
            double r7 = java.lang.Math.random()
            float r7 = (float) r7
            r8 = 1050253722(0x3e99999a, float:0.3)
            float r7 = r7 * r8
            float r7 = r7 + r0
            float r3 = r3 * r7
            int r0 = java.awt.Color.HSBtoRGB(r1, r4, r3)
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r6
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r6
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r6
            com.badlogic.gdx.graphics.Color r7 = r11._DEBUGbgColor1
            r7.set(r3, r4, r0, r5)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            double r3 = java.lang.Math.random()
            float r3 = (float) r3
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r3 * r4
            float r3 = r3 + r0
            double r9 = java.lang.Math.random()
            float r0 = (float) r9
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r4
            float r0 = r5 - r0
            int r0 = java.awt.Color.HSBtoRGB(r1, r3, r0)
            int r1 = r0 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r6
            int r3 = r0 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r6
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r6
            float r4 = r5 - r1
            float r4 = r4 * r8
            float r1 = r1 + r4
            float r4 = r5 - r3
            float r4 = r4 * r8
            float r3 = r3 + r4
            float r4 = r5 - r0
            float r4 = r4 * r8
            float r0 = r0 + r4
            com.badlogic.gdx.graphics.Color r4 = r11._DEBUGbgColor2
            r4.set(r1, r3, r0, r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r11._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            r0.setUseGradient(r2)
            double r1 = java.lang.Math.random()
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L161
            com.badlogic.gdx.graphics.Color r1 = r11._DEBUGbgColor2
            r0.setBackgroundColor(r1)
            com.badlogic.gdx.graphics.Color r1 = r11._DEBUGbgColor1
            r0.setGradientColor(r1)
            goto L16b
        L161:
            com.badlogic.gdx.graphics.Color r1 = r11._DEBUGbgColor1
            r0.setBackgroundColor(r1)
            com.badlogic.gdx.graphics.Color r1 = r11._DEBUGbgColor2
            r0.setGradientColor(r1)
        L16b:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r11._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r11._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r11._animateToolsModule
            r0.updateFrameTools()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r11._animateToolsModule
            r0.setNeedsToBeDrawn()
            return
    }

    private void debugColorBackgroundPreset() {
            r6 = this;
            int r0 = r6._debugBackgroundColorPresetIndex
            com.badlogic.gdx.graphics.Color[] r1 = r6._debugBackgroundColorPresets
            int r1 = r1.length
            if (r0 < r1) goto La
            r0 = 0
            r6._debugBackgroundColorPresetIndex = r0
        La:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            r1 = 1
            r0.setUseGradient(r1)
            double r1 = java.lang.Math.random()
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L3b
            com.badlogic.gdx.graphics.Color[] r1 = r6._debugBackgroundColorPresets
            int r2 = r6._debugBackgroundColorPresetIndex
            int r3 = r2 + 1
            r6._debugBackgroundColorPresetIndex = r3
            r1 = r1[r2]
            r0.setBackgroundColor(r1)
            com.badlogic.gdx.graphics.Color[] r1 = r6._debugBackgroundColorPresets
            int r2 = r6._debugBackgroundColorPresetIndex
            int r3 = r2 + 1
            r6._debugBackgroundColorPresetIndex = r3
            r1 = r1[r2]
            r0.setGradientColor(r1)
            goto L55
        L3b:
            com.badlogic.gdx.graphics.Color[] r1 = r6._debugBackgroundColorPresets
            int r2 = r6._debugBackgroundColorPresetIndex
            int r3 = r2 + 1
            r6._debugBackgroundColorPresetIndex = r3
            r1 = r1[r2]
            r0.setGradientColor(r1)
            com.badlogic.gdx.graphics.Color[] r1 = r6._debugBackgroundColorPresets
            int r2 = r6._debugBackgroundColorPresetIndex
            int r3 = r2 + 1
            r6._debugBackgroundColorPresetIndex = r3
            r1 = r1[r2]
            r0.setBackgroundColor(r1)
        L55:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r6._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r6._animateToolsModule
            r0.setNeedsToBeDrawn()
            return
    }

    private void debugResaveFiles() {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L24
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto L24
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$13 r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$13
            r0.<init>(r5, r5)
            java.lang.String r1 = "Resave All Stickfigures"
            java.lang.String r2 = "This will resave all of the stickfigures currently on the stage as they are positioned/scaled at this moment. This will overwrite the file for the stickfigure if it exists already."
            java.lang.String r3 = "Resave files"
            java.lang.String r4 = "Cancel"
            r0.initialize(r1, r2, r3, r4)
            r5.addDialogToStage(r0)
        L24:
            return
    }

    private void debugUpdate(float r13) {
            r12 = this;
            org.fortheloss.sticknodes.Screenshotter r13 = r12._screenshotter
            if (r13 == 0) goto L12
            boolean r13 = r13.doScreenshot()
            if (r13 == 0) goto L12
            org.fortheloss.sticknodes.Screenshotter r13 = r12._screenshotter
            r13.dispose()
            r13 = 0
            r12._screenshotter = r13
        L12:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r0 = 112(0x70, float:1.57E-43)
            boolean r13 = r13.isKeyJustPressed(r0)
            r1 = 0
            if (r13 == 0) goto L75
            com.badlogic.gdx.scenes.scene2d.Stage r13 = r12.getStage()
            com.badlogic.gdx.scenes.scene2d.Actor r13 = r13.getKeyboardFocus()
            boolean r13 = r13 instanceof com.badlogic.gdx.scenes.scene2d.ui.TextField
            if (r13 != 0) goto L75
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            int r13 = r13.getScreen()
            if (r13 == 0) goto L3a
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            int r13 = r13.getScreen()
            r2 = 2
            if (r13 != r2) goto L75
        L3a:
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            int r13 = r13.getMode()
            if (r13 != 0) goto L75
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r13 = r13.getCurrentlySelectedStickfigure()
            if (r13 != 0) goto L50
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            org.fortheloss.sticknodes.movieclip.MCReference r13 = r13.getCurrentlySelectedMC()
        L50:
            if (r13 != 0) goto L58
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            org.fortheloss.sticknodes.sprite.SpriteRef r13 = r13.getCurrentlySelectedSprite()
        L58:
            boolean r2 = r13 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L62
            r2 = r13
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r12.deleteStickfigure(r2, r1)
        L62:
            boolean r2 = r13 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L6c
            r2 = r13
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            r12.deleteMC(r2)
        L6c:
            boolean r2 = r13 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L75
            org.fortheloss.sticknodes.sprite.SpriteRef r13 = (org.fortheloss.sticknodes.sprite.SpriteRef) r13
            r12.deleteSpriteRef(r13)
        L75:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 151(0x97, float:2.12E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 != 0) goto Lb1
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 152(0x98, float:2.13E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 != 0) goto Lb1
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 153(0x99, float:2.14E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 != 0) goto Lb1
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 148(0x94, float:2.07E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 != 0) goto Lb1
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 149(0x95, float:2.09E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 != 0) goto Lb1
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 150(0x96, float:2.1E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 == 0) goto Lb4
        Lb1:
            r12.debugSeparateStickfigures()
        Lb4:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 145(0x91, float:2.03E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 != 0) goto Ld7
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 146(0x92, float:2.05E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 == 0) goto Lc9
            goto Ld7
        Lc9:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 147(0x93, float:2.06E-43)
            boolean r13 = r13.isKeyJustPressed(r2)
            if (r13 == 0) goto Lda
            r12.debugColorBackgroundPreset()
            goto Lda
        Ld7:
            r12.debugColorBackground()
        Lda:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r2 = 3
            boolean r13 = r13.isKeyJustPressed(r2)
            r3 = 1
            if (r13 == 0) goto Le8
            r12.debugScaleStickfiguresUniformly(r3)
            goto Lf6
        Le8:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r4 = 123(0x7b, float:1.72E-43)
            boolean r13 = r13.isKeyJustPressed(r4)
            if (r13 == 0) goto Lf6
            r13 = -1
            r12.debugScaleStickfiguresUniformly(r13)
        Lf6:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r4 = 124(0x7c, float:1.74E-43)
            boolean r13 = r13.isKeyJustPressed(r4)
            if (r13 == 0) goto L103
            r12.debugResaveFiles()
        L103:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            boolean r13 = r13.isKeyJustPressed(r0)
            if (r13 == 0) goto L11a
            com.badlogic.gdx.scenes.scene2d.Stage r13 = r12.getStage()
            com.badlogic.gdx.scenes.scene2d.Actor r13 = r13.getKeyboardFocus()
            boolean r13 = r13 instanceof com.badlogic.gdx.scenes.scene2d.ui.TextField
            if (r13 != 0) goto L11a
            r12.debugClearFrame(r1)
        L11a:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r0 = 92
            boolean r13 = r13.isKeyJustPressed(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L168
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13 = r12._framesModule
            org.fortheloss.sticknodes.data.IFrameData r13 = r13.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            com.badlogic.gdx.graphics.Color r1 = r13.getBackgroundColor()
            float r4 = r1.r
            float r5 = r1.g
            float r6 = r1.b
            com.badlogic.gdx.graphics.Color r7 = r13.getGradientColor()
            float r8 = r7.r
            float r9 = r7.g
            float r10 = r7.b
            r11 = 1066192077(0x3f8ccccd, float:1.1)
            float r4 = r4 * r11
            float r5 = r5 * r11
            float r6 = r6 * r11
            r1.set(r4, r5, r6, r0)
            r13.setBackgroundColor(r1)
            float r8 = r8 * r11
            float r9 = r9 * r11
            float r10 = r10 * r11
            r7.set(r8, r9, r10, r0)
            r13.setGradientColor(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r13 = r12._canvasModule
            r13.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13 = r12._framesModule
            r13.setNeedsToBeDrawn()
            goto L1b3
        L168:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r1 = 93
            boolean r13 = r13.isKeyJustPressed(r1)
            if (r13 == 0) goto L1b3
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13 = r12._framesModule
            org.fortheloss.sticknodes.data.IFrameData r13 = r13.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            com.badlogic.gdx.graphics.Color r1 = r13.getBackgroundColor()
            float r4 = r1.r
            float r5 = r1.g
            float r6 = r1.b
            com.badlogic.gdx.graphics.Color r7 = r13.getGradientColor()
            float r8 = r7.r
            float r9 = r7.g
            float r10 = r7.b
            r11 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r11
            float r5 = r5 * r11
            float r6 = r6 * r11
            r1.set(r4, r5, r6, r0)
            r13.setBackgroundColor(r1)
            float r8 = r8 * r11
            float r9 = r9 * r11
            float r10 = r10 * r11
            r7.set(r8, r9, r10, r0)
            r13.setGradientColor(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r13 = r12._canvasModule
            r13.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13 = r12._framesModule
            r13.setNeedsToBeDrawn()
        L1b3:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r0 = 129(0x81, float:1.81E-43)
            boolean r13 = r13.isKeyPressed(r0)
            if (r13 == 0) goto L230
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionData
            int r13 = r13.getMode()
            org.fortheloss.sticknodes.data.SessionData r0 = r12._sessionData
            int r0 = r0.getScreen()
            if (r13 != 0) goto L203
            if (r0 != 0) goto L203
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 31
            boolean r0 = r0.isKeyJustPressed(r1)
            if (r0 == 0) goto L1f6
            org.fortheloss.sticknodes.data.SessionData r0 = r12._sessionData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 == 0) goto L1f6
            org.fortheloss.sticknodes.data.SessionData r0 = r12._sessionData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r12._framesModule
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.data.ProjectData r4 = r12._projectData
            int r4 = r4.getUID()
            r12.copyStickfigure(r0, r3, r1, r4)
        L1f6:
            com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
            r1 = 50
            boolean r0 = r0.isKeyJustPressed(r1)
            if (r0 == 0) goto L203
            r12.pasteStickfigure()
        L203:
            if (r13 == r2) goto L230
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r0 = 59
            boolean r13 = r13.isKeyPressed(r0)
            r1 = 54
            if (r13 != 0) goto L21d
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            boolean r13 = r13.isKeyJustPressed(r1)
            if (r13 == 0) goto L21d
            r12.undo()
            goto L230
        L21d:
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            boolean r13 = r13.isKeyPressed(r0)
            if (r13 == 0) goto L230
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            boolean r13 = r13.isKeyJustPressed(r1)
            if (r13 == 0) goto L230
            r12.redo()
        L230:
            return
    }

    private void determineHowToPlayFromKeyframe(org.fortheloss.sticknodes.data.IFrameData r9, org.fortheloss.sticknodes.animationscreen.FramesContainer r10, int r11) {
            r8 = this;
            org.fortheloss.sticknodes.PlaybackRepeatManager r0 = r8._playbackRepeatManager
            int r0 = r0.getGoBackFrames()
            r1 = 1
            if (r0 <= 0) goto L19
            org.fortheloss.sticknodes.PlaybackRepeatManager r0 = r8._playbackRepeatManager
            org.fortheloss.sticknodes.data.FrameData r0 = r0.getLoopingOriginFrame()
            if (r9 != r0) goto L19
            r0 = r9
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            boolean r0 = r0.getUseTweenPropertiesDuringRepeating()
            goto L1a
        L19:
            r0 = 1
        L1a:
            boolean r2 = r9 instanceof org.fortheloss.sticknodes.data.FrameData
            r3 = 0
            if (r2 == 0) goto L2a
            r2 = r9
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            boolean r2 = r2.getCameraIsMovingDuringDelay()
            if (r2 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r10.frames
            int r4 = r4.size()
            boolean r5 = r10.tweeningEnabled
            if (r5 == 0) goto L40
            if (r11 <= 0) goto L38
            goto L3e
        L38:
            boolean r5 = r9.getIsUsingSlowMotionTweenedFrames()
            if (r5 == 0) goto L40
        L3e:
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            if (r5 == 0) goto L6c
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r10.frames
            int r6 = r6.size()
            int r6 = r6 - r1
        L4a:
            if (r6 < 0) goto L59
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r10.frames
            java.lang.Object r7 = r7.get(r6)
            if (r7 != r9) goto L56
            int r6 = r6 + r1
            goto L5a
        L56:
            int r6 = r6 + (-1)
            goto L4a
        L59:
            r6 = 0
        L5a:
            int r7 = r8._playbackRangeEndFrame
            if (r6 != r7) goto L6c
            if (r7 <= 0) goto L61
            goto L6b
        L61:
            boolean r2 = r10.isLoop
            if (r2 == 0) goto L6b
            int r2 = r8._playbackRangeGoBackToStartFrame
            if (r2 > r1) goto L6b
            r2 = 0
            goto L6c
        L6b:
            r2 = 1
        L6c:
            if (r2 != 0) goto La1
            if (r5 == 0) goto La1
            if (r0 == 0) goto L78
            boolean r2 = r9.isTweened()
            if (r2 == 0) goto La1
        L78:
            if (r4 == r1) goto La1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r8._framesModule
            int r2 = r2.getCurrentFrameIndex()
            int r4 = r4 - r1
            if (r2 != r4) goto L88
            boolean r10 = r10.isLoop
            if (r10 != 0) goto L88
            goto La1
        L88:
            r8._playNextKeyframe = r3
            r8._playNextTweenedFrame = r1
            r8._playTweenedFrameNumber = r1
            if (r0 == 0) goto L9e
            boolean r10 = r9.getIsUsingSlowMotionTweenedFrames()
            if (r10 != 0) goto L97
            goto L9e
        L97:
            int r9 = r9.getSlowMotionTweenedFrames()
            r8._numTweenedFramesToPlay = r9
            goto La9
        L9e:
            r8._numTweenedFramesToPlay = r11
            goto La9
        La1:
            r8._playNextKeyframe = r1
            r8._playNextTweenedFrame = r3
            r8._playTweenedFrameNumber = r1
            r8._numTweenedFramesToPlay = r1
        La9:
            return
    }

    private void exitPlayingFullscreen() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r4._animateToolsModule
            r0.setVisible(r1)
            goto L14
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r4._movieclipToolsModule
            r0.setVisible(r1)
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModule
            r0.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r4._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r4._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModule
            r0.forceNextDraw()
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r4._fullscreenListener
            if (r0 == 0) goto L3f
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r4.getStage()
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r4._fullscreenListener
            r0.removeListener(r1)
        L3f:
            org.fortheloss.sticknodes.animationscreen.TiledBackground r0 = r4._tiledBackground
            org.fortheloss.framework.Assets r1 = r4._assetsRef
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r4._stageRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r4._fboBuffer
            r0.renderOnto(r1, r2, r3)
            return
    }

    private void openProjectFinished(boolean r4) {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "AnimationScreen.openProjectFinished()"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog r0 = r3._isOpeningDialogRef
            if (r0 == 0) goto L10
            r0.hideImmediately()
        L10:
            r0 = 1
            if (r4 == 0) goto L16
            r3._flagOpenProjectReady = r0
            goto L1e
        L16:
            r3._flagStartNewProject = r0
            int r4 = org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag
            if (r4 != 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag = r0
        L1e:
            return
    }

    private void performAndroidStorageTransfer(com.badlogic.gdx.Preferences r7) {
            r6 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog
            r0.<init>(r6)
            com.badlogic.gdx.graphics.g2d.Animation r1 = new com.badlogic.gdx.graphics.g2d.Animation
            org.fortheloss.framework.Assets r2 = r6._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r4 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r5 = 1
            java.lang.Object r2 = r2.get(r3, r4, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r3 = "exporting_animation"
            com.badlogic.gdx.utils.Array r2 = r2.findRegions(r3)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r3 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r4 = 1026206379(0x3d2aaaab, float:0.041666668)
            r1.<init>(r4, r2, r3)
            r0.initialize(r1)
            r6.addDialogToStage(r0)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.lang.Thread r2 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$11 r3 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$11
            r3.<init>(r6, r1, r0, r7)
            r2.<init>(r3)
            r2.start()
            return
    }

    private void reduceSpriteGroupStateIndex(org.fortheloss.sticknodes.sprite.SpriteGroupSource r11, int r12) {
            r10 = this;
            int r11 = r11.getLibraryId()
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L4a
            java.lang.Object r4 = r0.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
            java.util.ArrayList r4 = r4.getDrawableFigures()
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L20:
            if (r5 < 0) goto L47
            java.lang.Object r6 = r4.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r7 != 0) goto L2d
            goto L44
        L2d:
            int r7 = r6.getLibraryID()
            if (r7 != r11) goto L44
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r6 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r6
            int r7 = r6.getStateIndex()
            if (r7 < r12) goto L44
            int r7 = r6.getStateIndex()
            int r7 = r7 + (-1)
            r6.setStateIndex(r7)
        L44:
            int r5 = r5 + (-1)
            goto L20
        L47:
            int r3 = r3 + 1
            goto Le
        L4a:
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L54:
            if (r1 < 0) goto La8
            java.lang.Object r3 = r0.get(r1)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r4 = r3.size()
            r5 = 0
        L63:
            if (r5 >= r4) goto La5
            java.lang.Object r6 = r3.get(r5)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            java.util.ArrayList r6 = r6.getDrawableFigures()
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L75:
            if (r7 < 0) goto La2
            java.lang.Object r8 = r6.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            boolean r9 = r8 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r9 != 0) goto L82
            goto L9f
        L82:
            int r9 = r8.getLibraryID()
            if (r9 != r11) goto L9f
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r8 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r8
            boolean r9 = r8.getIsStateControlled()
            if (r9 != 0) goto L9f
            int r9 = r8.getStateIndex()
            if (r9 < r12) goto L9f
            int r9 = r8.getStateIndex()
            int r9 = r9 + (-1)
            r8.setStateIndex(r9)
        L9f:
            int r7 = r7 + (-1)
            goto L75
        La2:
            int r5 = r5 + 1
            goto L63
        La5:
            int r1 = r1 + (-1)
            goto L54
        La8:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L107
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r10._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            if (r0 == 0) goto L107
            int r1 = r0.getLibraryID()
            if (r1 >= 0) goto L107
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
        Lc5:
            if (r2 >= r1) goto L107
            java.lang.Object r3 = r0.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            java.util.ArrayList r3 = r3.getDrawableFigures()
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Ld7:
            if (r4 < 0) goto L104
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r6 != 0) goto Le4
            goto L101
        Le4:
            int r6 = r5.getLibraryID()
            if (r6 != r11) goto L101
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r5 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r5
            boolean r6 = r5.getIsStateControlled()
            if (r6 != 0) goto L101
            int r6 = r5.getStateIndex()
            if (r6 < r12) goto L101
            int r6 = r5.getStateIndex()
            int r6 = r6 + (-1)
            r5.setStateIndex(r6)
        L101:
            int r4 = r4 + (-1)
            goto Ld7
        L104:
            int r2 = r2 + 1
            goto Lc5
        L107:
            return
    }

    private void setSessionScreen(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setScreen(r4)
            r0 = 2
            r1 = 1
            if (r4 != r1) goto Lc
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r0
            goto Le
        Lc:
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r1
        Le:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r3._animateToolsModule
            r2.onSessionScreenChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r3._createToolsModule
            r2.onSessionScreenChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r3._movieclipToolsModule
            r2.onSessionScreenChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModule
            r2.onSessionScreenChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r3._canvasModule
            r2.onSessionScreenChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r3._animateToolsModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r3._createToolsModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r3._movieclipToolsModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r3._canvasModule
            r2.setNeedsToBeDrawn()
            if (r4 != r1) goto L45
            java.lang.String r4 = "creation"
            goto L4c
        L45:
            if (r4 != r0) goto L4a
            java.lang.String r4 = "movieclip"
            goto L4c
        L4a:
            java.lang.String r4 = "animation"
        L4c:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "current_screen"
            r0.setCrashlyticsKeyString(r1, r4)
            return
    }

    private void showFinishedExportingDialog(java.lang.String r2, int r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.FinishedExportingDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.FinishedExportingDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    private void showOpeningProjectWarningDialog(java.lang.String r2) {
            r1 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L12
            org.fortheloss.sticknodes.animationscreen.dialogs.OpeningProjectWarningDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.OpeningProjectWarningDialog
            r0.<init>(r1)
            r0.initialize(r2)
            r1.addDialogToStage(r0)
            goto L21
        L12:
            java.lang.String r2 = "errorOpeningTitle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r0 = "errorOpeningInfo2"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1.showErrorDialog(r2, r0)
        L21:
            return
    }

    private void showPopupText(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r3._popupText
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Lf
            return
        Lf:
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r3._popupText
            java.lang.Object r0 = r0.getUserObject()
            if (r0 != r4) goto L18
            return
        L18:
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r3._popupText
            r0.setUserObject(r4)
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r3._popupText
            java.lang.String r1 = r4.getName()
            int r4 = r4.getID()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " (ID: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.setText(r4)
            return
    }

    private void updateMemoryStats(float r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r1._memoryUpdateTimer
            float r0 = r0 + r2
            r1._memoryUpdateTimer = r0
            r2 = 1101004800(0x41a00000, float:20.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L28
            r2 = 0
            r1._memoryUpdateTimer = r2
            org.fortheloss.sticknodes.data.SessionData r2 = r1._sessionData
            r0 = 0
            r2.updateMemoryData(r1, r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.updateJumpToolTable()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.updateJumpToolTable()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.updateJumpToolTable()
        L28:
            return
    }

    public void addDialogToStage(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r3._activeDialogs
            r0.add(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3._stageRef
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1109393408(0x42200000, float:40.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r4.show(r0, r1)
            return
    }

    public boolean addMC(org.fortheloss.sticknodes.movieclip.MCReference r8, int r9, boolean r10, boolean r11, boolean r12) {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r7._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            if (r10 == 0) goto L19
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r10 = r7._canvasModule
            float r10 = r10.getZoomPositionX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r7._canvasModule
            float r1 = r1.getZoomPositionY()
            r8.setPosition(r10, r1)
        L19:
            r10 = 0
            if (r11 == 0) goto L40
            if (r12 == 0) goto L40
            org.fortheloss.sticknodes.data.SessionData r10 = r7._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferencePasteAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferencePasteAction.class
            java.lang.Object r10 = r10.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferencePasteAction r10 = (org.fortheloss.sticknodes.data.useractions.MCReferencePasteAction) r10
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r7._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r7._framesModule
            org.fortheloss.sticknodes.data.IFrameData r5 = r1.getNextFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r7._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r1.getFramesContainer()
            r1 = r10
            r2 = r8
            r3 = r9
            r1.initialize(r2, r3, r4, r5, r6)
        L40:
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectData
            boolean r1 = r1.canAddFigure(r0, r8)
            r2 = 1
            if (r1 == 0) goto L91
            if (r9 < 0) goto L5f
            java.util.ArrayList r1 = r0.getDrawableFigures()
            int r1 = r1.size()
            if (r9 >= r1) goto L5f
            int r1 = r8.getID()
            org.fortheloss.sticknodes.data.ProjectData r3 = r7._projectData
            r0.addFigureAt(r8, r1, r9, r3)
            goto L68
        L5f:
            int r9 = r8.getID()
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectData
            r0.addFigure(r8, r9, r1)
        L68:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r7._framesModule
            r9.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r9 = r7._canvasModule
            r9.selectLastFigure()
            if (r11 == 0) goto L90
            if (r12 != 0) goto L8b
            org.fortheloss.sticknodes.data.SessionData r9 = r7._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceAddAction> r10 = org.fortheloss.sticknodes.data.useractions.MCReferenceAddAction.class
            java.lang.Object r9 = r9.getUserAction(r10)
            org.fortheloss.sticknodes.data.useractions.MCReferenceAddAction r9 = (org.fortheloss.sticknodes.data.useractions.MCReferenceAddAction) r9
            org.fortheloss.sticknodes.data.ProjectData r10 = r7._projectData
            r9.initialize(r8, r0, r10)
            org.fortheloss.sticknodes.data.SessionData r8 = r7._sessionData
            r8.addUserAction(r9)
            goto L90
        L8b:
            org.fortheloss.sticknodes.data.SessionData r8 = r7._sessionData
            r8.addUserAction(r10)
        L90:
            return r2
        L91:
            r8.dispose()
            java.lang.String r8 = "stickfigureLimitWarningTitle"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r11 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 0
            r9[r12] = r11
            java.lang.String r11 = "stickfigureLimitWarningInfoNew2"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r11, r9)
            r7.showErrorDialog(r8, r9)
            if (r10 == 0) goto Lb5
            r10.dispose()
        Lb5:
            return r12
    }

    public boolean addMC(org.fortheloss.sticknodes.movieclip.MCReference r7, boolean r8, boolean r9, boolean r10) {
            r6 = this;
            r2 = -1
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r7 = r0.addMC(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean addMovieclipToLibrary(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            boolean r2 = r0.addMovieclipToLibrary(r2)
            if (r2 == 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.selectLastImportedMC()
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public boolean addSprite(org.fortheloss.sticknodes.sprite.SpriteRef r5, int r6, boolean r7, boolean r8) {
            r4 = this;
            if (r7 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModule
            float r7 = r7.getZoomPositionX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModule
            float r0 = r0.getZoomPositionY()
            r5.setPosition(r7, r0)
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r4._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r7 = r7.getFramesContainer()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            boolean r1 = r7.canAddFigure(r0, r5)
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L7c
            if (r6 < 0) goto L41
            java.util.ArrayList r1 = r0.getDrawableFigures()
            int r1 = r1.size()
            if (r6 >= r1) goto L41
            int r1 = r5.getID()
            r0.addFigureAt(r5, r1, r6, r7)
            r4.setSessionSelectionToSprite(r5)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModule
            r1.setNeedsToBeDrawn()
            goto L4d
        L41:
            int r1 = r5.getID()
            r0.addFigure(r5, r1, r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModule
            r1.selectLastFigure()
        L4d:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r4._framesModule
            r1.setNeedsToBeDrawn()
            if (r8 == 0) goto L66
            org.fortheloss.sticknodes.data.SessionData r8 = r4._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteAddAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteAddAction.class
            java.lang.Object r8 = r8.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteAddAction r8 = (org.fortheloss.sticknodes.data.useractions.SpriteAddAction) r8
            r8.initialize(r5, r6, r0, r7)
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionData
            r5.addUserAction(r8)
        L66:
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionData
            int r5 = r5.getScreen()
            if (r5 != r2) goto L7b
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            boolean r5 = r5.isTracingFrame()
            if (r5 == 0) goto L7b
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            r5.flagTracingFBODirty()
        L7b:
            return r3
        L7c:
            r5.dispose()
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            java.lang.String r6 = "stickfigureLimitWarningInfoNew2"
            java.lang.String r7 = "spriteLimitWarningTitle"
            r8 = 0
            if (r5 == 0) goto La0
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            int r0 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r8] = r0
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6, r7)
            r4.showErrorDialog(r5, r6)
            goto Le4
        La0:
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            int r0 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r8] = r0
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r8] = r0
            r0 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r3] = r0
            java.lang.String r0 = "frameLimitWarningInfo"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r0, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "\n\n"
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            r4.showErrorDialog(r5, r6)
        Le4:
            return r8
    }

    public boolean addSprite(org.fortheloss.sticknodes.sprite.SpriteRef r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = -1
            boolean r2 = r1.addSprite(r2, r0, r3, r4)
            return r2
    }

    public boolean addSpriteToLibrary(org.fortheloss.sticknodes.sprite.ISpriteSource r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            boolean r2 = r0.addSpriteToLibrary(r2)
            if (r2 == 0) goto L14
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.selectLastImportedSprite()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.selectLastImportedSprite()
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public void addStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            if (r6 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r3._canvasModule
            float r6 = r6.getZoomPositionX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            float r0 = r0.getZoomPositionY()
            r4.setPosition(r6, r0)
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r3._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r6.getFramesContainer()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            boolean r1 = r6.canAddFigure(r0, r4)
            r2 = 2
            if (r1 == 0) goto L7b
            if (r5 < 0) goto L40
            java.util.ArrayList r1 = r0.getDrawableFigures()
            int r1 = r1.size()
            if (r5 >= r1) goto L40
            int r1 = r4.getID()
            r0.addFigureAt(r4, r1, r5, r6)
            r3.setSessionSelectionToStickfigure(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModule
            r1.setNeedsToBeDrawn()
            goto L4c
        L40:
            int r1 = r4.getID()
            r0.addFigure(r4, r1, r6)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModule
            r1.selectLastFigure()
        L4c:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r3._framesModule
            r1.setNeedsToBeDrawn()
            if (r7 == 0) goto L65
            org.fortheloss.sticknodes.data.SessionData r7 = r3._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureAddAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureAddAction.class
            java.lang.Object r7 = r7.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureAddAction r7 = (org.fortheloss.sticknodes.data.useractions.StickfigureAddAction) r7
            r7.initialize(r4, r5, r0, r6)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionData
            r4.addUserAction(r7)
        L65:
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionData
            int r4 = r4.getScreen()
            if (r4 != r2) goto Le4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            boolean r4 = r4.isTracingFrame()
            if (r4 == 0) goto Le4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            r4.flagTracingFBODirty()
            goto Le4
        L7b:
            r4.dispose()
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            java.lang.String r5 = "stickfigureLimitWarningInfoNew2"
            java.lang.String r6 = "stickfigureLimitWarningTitle"
            r7 = 0
            r0 = 1
            if (r4 == 0) goto La0
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            int r0 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r7] = r0
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5, r6)
            r3.showErrorDialog(r4, r5)
            goto Le4
        La0:
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            int r1 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r7] = r1
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5, r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r7] = r1
            r7 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r0] = r7
            java.lang.String r7 = "frameLimitWarningInfo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "\n\n"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r3.showErrorDialog(r4, r5)
        Le4:
            return
    }

    public void addStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = -1
            r1.addStickfigure(r2, r0, r3, r4)
            return
    }

    public boolean addStickfigureToLibrary(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            boolean r2 = r0.addStickfigureToLibrary(r2)
            if (r2 == 0) goto L14
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.selectLastImportedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.selectLastImportedStickfigure()
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public void addTextfield(org.fortheloss.sticknodes.TextfieldBox r5, boolean r6, boolean r7) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            if (r6 == 0) goto L29
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r4._canvasModule
            float r6 = r6.getZoomPositionX()
            float r1 = r5.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r6 = r6 - r1
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModule
            float r1 = r1.getZoomPositionY()
            float r3 = r5.getHeight()
            float r3 = r3 * r2
            float r1 = r1 + r3
            r5.setPosition(r6, r1)
        L29:
            int r6 = r5.getID()
            boolean r6 = r0.addTextfield(r5, r6)
            if (r6 == 0) goto L54
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r4._framesModule
            r6.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r4._canvasModule
            r6.selectLastTextfield()
            if (r7 == 0) goto L6f
            org.fortheloss.sticknodes.data.SessionData r6 = r4._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxAddAction> r7 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxAddAction.class
            java.lang.Object r6 = r6.getUserAction(r7)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxAddAction r6 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxAddAction) r6
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModule
            r6.initialize(r5, r0, r7)
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionData
            r5.addUserAction(r6)
            goto L6f
        L54:
            java.lang.String r5 = "textfieldLimitWarningTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r0 = 15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r7] = r0
            java.lang.String r7 = "textfieldLimitWarningInfo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r7, r6)
            r4.showErrorDialog(r5, r6)
        L6f:
            return
    }

    public void androidKeepAppAlive(boolean r3) {
            r2 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 == r1) goto Lf
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.androidEnableNotification(r3)
        Lf:
            return
    }

    public void beginExport(java.lang.String r13, int r14, int r15, int r16, int r17, boolean r18, int r19, boolean r20) {
            r12 = this;
            r0 = r12
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "last_status_event"
            java.lang.String r3 = "AnimationScreen.beginExport()"
            r1.setCrashlyticsKeyString(r2, r3)
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r1 = r0._threadedGifExportLooper
            if (r1 == 0) goto L11
            r1.dispose()
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.hideMagnifier()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.hideArrows()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r2 = 0
            r1.enableQuickResizeTool(r2)
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r2
            org.fortheloss.sticknodes.movieclip.MCCache.disposeFBOs()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            r1.disposeCopiedFrames()
            r1 = 1
            if (r20 == 0) goto L30
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r1
        L30:
            r3 = 2
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r3
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r3 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r0._stageRef
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r0._shapeRenderer
            org.fortheloss.sticknodes.data.ProjectData r8 = r0._projectData
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntWatermarkDejavuSansCondensed
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r9 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Object r4 = r6.get(r4, r9, r2)
            r9 = r4
            com.badlogic.gdx.graphics.g2d.BitmapFont r9 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r9
            org.fortheloss.framework.Assets r4 = r0._assetsRef
            java.lang.String r10 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r11 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            java.lang.Object r4 = r4.get(r10, r11, r2)
            r10 = r4
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r10
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0._threadedGifExportLooper = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog
            r3.<init>(r12)
            r0._exportProgressDialogRef = r3
            com.badlogic.gdx.graphics.g2d.Animation r4 = new com.badlogic.gdx.graphics.g2d.Animation
            r5 = 1026206379(0x3d2aaaab, float:0.041666668)
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r8 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r6 = r6.get(r7, r8, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r6
            java.lang.String r7 = "exporting_animation"
            com.badlogic.gdx.utils.Array r6 = r6.findRegions(r7)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r7 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r4.<init>(r5, r6, r7)
            r3.initialize(r2, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r3 = r0._threadedGifExportLooper
            r2.setGIFExporterToReadFrom(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            r12.addDialogToStage(r2)
            r9 = 1
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r3 = r0._threadedGifExportLooper
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r10 = r18
            r11 = r19
            r3.beginExport(r4, r5, r6, r7, r8, r9, r10, r11)
            r0._isExportingGIF = r1
            return
    }

    public void beginMP4Export(java.lang.String r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26, boolean r27) {
            r17 = this;
            r0 = r17
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r1 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "last_status_event"
            java.lang.String r4 = "AnimationScreen.beginMP4Export()"
            r2.setCrashlyticsKeyString(r3, r4)
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r2 = r0._threadedMP4ExportLooper
            if (r2 == 0) goto L14
            r2.dispose()
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r2.hideMagnifier()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r2.hideArrows()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r3 = 0
            r2.enableQuickResizeTool(r3)
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r3
            org.fortheloss.sticknodes.movieclip.MCCache.disposeFBOs()
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            r2.disposeCopiedFrames()
            r2 = 1
            if (r27 == 0) goto L33
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r2
        L33:
            r4 = 2
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r4
            java.lang.String r4 = "exporting MP4 method failed - "
            java.lang.String r5 = "error"
            r6 = 0
            if (r23 != 0) goto Lab
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r9 = r7.getPlatformMP4Encoder()
            if (r9 == 0) goto Lab
            r0._isExportingMP4 = r2
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper r7 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper
            org.fortheloss.framework.Assets r10 = r0._assetsRef
            com.badlogic.gdx.scenes.scene2d.Stage r11 = r0._stageRef
            org.fortheloss.sticknodes.SNShapeRenderer r12 = r0._shapeRenderer
            org.fortheloss.sticknodes.data.ProjectData r13 = r0._projectData
            java.lang.String r8 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Object r8 = r10.get(r8, r1, r3)
            r14 = r8
            com.badlogic.gdx.graphics.glutils.ShaderProgram r14 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r14
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0._threadedMP4ExportLooper = r7
            com.badlogic.gdx.Application r7 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r7 = r7.getType()
            com.badlogic.gdx.Application$ApplicationType r8 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r7 != r8) goto L6d
            java.lang.String r7 = "Android SDK"
            goto L6f
        L6d:
            java.lang.String r7 = "iOS SDK"
        L6f:
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r8 = r0._threadedMP4ExportLooper
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r24
            r15 = r25
            r16 = r26
            boolean r8 = r8.beginExport(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r8 != 0) goto Lab
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.String r9 = "Failed to encode with the native platform MP4 encoder, attempting with jcodec."
            r8.println(r9)
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r8 = r0._threadedMP4ExportLooper
            r8.dispose()
            r0._threadedMP4ExportLooper = r6
            r0._isExportingMP4 = r3
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.analyticsSendEvent(r5, r7)
        Lab:
            boolean r7 = r0._isExportingMP4
            if (r7 != 0) goto L102
            r0._isExportingMP4 = r2
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper r7 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r0._stageRef
            org.fortheloss.framework.Assets r10 = r0._assetsRef
            org.fortheloss.sticknodes.SNShapeRenderer r11 = r0._shapeRenderer
            org.fortheloss.sticknodes.data.ProjectData r12 = r0._projectData
            java.lang.String r8 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Object r1 = r10.get(r8, r1, r3)
            r13 = r1
            com.badlogic.gdx.graphics.glutils.ShaderProgram r13 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r13
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r0._threadedMP4ExportLooper = r7
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r24
            r15 = r26
            boolean r1 = r8.beginExport(r9, r10, r11, r12, r13, r14, r15)
            if (r1 != 0) goto L102
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r1 = r0._threadedMP4ExportLooper
            r1.dispose()
            r0._threadedMP4ExportLooper = r6
            r0._isExportingMP4 = r3
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            if (r23 != 0) goto Lee
            java.lang.String r6 = "jcodec (platform failed)"
            goto Lf0
        Lee:
            java.lang.String r6 = "jcodec (by choice)"
        Lf0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            r1.analyticsSendEvent(r5, r4)
        L102:
            boolean r1 = r0._isExportingMP4
            if (r1 == 0) goto L139
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog
            r1.<init>(r0)
            r0._exportProgressDialogRef = r1
            com.badlogic.gdx.graphics.g2d.Animation r3 = new com.badlogic.gdx.graphics.g2d.Animation
            r4 = 1026206379(0x3d2aaaab, float:0.041666668)
            org.fortheloss.framework.Assets r5 = r0._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r7 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r5 = r5.get(r6, r7, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r5
            java.lang.String r6 = "exporting_animation"
            com.badlogic.gdx.utils.Array r5 = r5.findRegions(r6)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r6 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r3.<init>(r4, r5, r6)
            r1.initialize(r2, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r1 = r0._exportProgressDialogRef
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r2 = r0._threadedMP4ExportLooper
            r1.setMP4ExporterToReadFrom(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r1 = r0._exportProgressDialogRef
            r0.addDialogToStage(r1)
            goto L156
        L139:
            java.lang.String r1 = "encoderFailTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r4 = "encoderFailInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r0.showErrorDialog(r1, r4)
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r2
            org.fortheloss.sticknodes.movieclip.MCCache.rebuildFBOs()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r3
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r2
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.enableQuickResizeTool(r2)
        L156:
            return
    }

    public void beginMiniGame() {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "AnimationScreen.beginMiniGame()"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "minigame"
            java.lang.String r2 = "user entered minigame"
            r0.analyticsSendEvent(r1, r2)
            r0 = 1
            r3._flagBeginMiniGame = r0
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3._groupModules
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            return
    }

    public void beginPNGExport(java.lang.String r14, int r15, int r16, int r17, int r18, boolean r19, int r20, boolean r21) {
            r13 = this;
            r0 = r13
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "last_status_event"
            java.lang.String r3 = "AnimationScreen.beginPNGExport()"
            r1.setCrashlyticsKeyString(r2, r3)
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r1 = r0._threadedPNGExportLooper
            if (r1 == 0) goto L11
            r1.dispose()
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.hideMagnifier()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.hideArrows()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r2 = 0
            r1.enableQuickResizeTool(r2)
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r2
            org.fortheloss.sticknodes.movieclip.MCCache.disposeFBOs()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            r1.disposeCopiedFrames()
            r1 = 1
            if (r21 == 0) goto L30
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r1
        L30:
            r3 = 2
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r3
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r5 = r3.getPlatformPNGEncoder()
            if (r5 == 0) goto Lb1
            r0._isExportingPNG = r1
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper r3 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r0._stageRef
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r0._shapeRenderer
            org.fortheloss.sticknodes.data.ProjectData r9 = r0._projectData
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntWatermarkDejavuSansCondensed
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r10 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Object r4 = r6.get(r4, r10, r2)
            r10 = r4
            com.badlogic.gdx.graphics.g2d.BitmapFont r10 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r10
            org.fortheloss.framework.Assets r4 = r0._assetsRef
            java.lang.String r11 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r12 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            java.lang.Object r4 = r4.get(r11, r12, r2)
            r11 = r4
            com.badlogic.gdx.graphics.glutils.ShaderProgram r11 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r11
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0._threadedPNGExportLooper = r3
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r3 = r3.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r3 != r4) goto L72
            java.lang.String r3 = "Android SDK"
            goto L74
        L72:
            java.lang.String r3 = "iOS SDK"
        L74:
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r4 = r0._threadedPNGExportLooper
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            boolean r4 = r4.beginExport(r5, r6, r7, r8, r9, r10, r11)
            if (r4 != 0) goto Lb1
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.String r5 = "Failed to encode with the native platform PNG encoder."
            r4.println(r5)
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r4 = r0._threadedPNGExportLooper
            r4.dispose()
            r4 = 0
            r0._threadedPNGExportLooper = r4
            r0._isExportingPNG = r2
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "exporting PNG method failed - "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "error"
            r4.analyticsSendEvent(r5, r3)
        Lb1:
            boolean r3 = r0._isExportingPNG
            if (r3 == 0) goto Le9
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog
            r2.<init>(r13)
            r0._exportProgressDialogRef = r2
            r3 = 3
            com.badlogic.gdx.graphics.g2d.Animation r4 = new com.badlogic.gdx.graphics.g2d.Animation
            r5 = 1026206379(0x3d2aaaab, float:0.041666668)
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r8 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r1 = r6.get(r7, r8, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r6 = "exporting_animation"
            com.badlogic.gdx.utils.Array r1 = r1.findRegions(r6)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r6 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r4.<init>(r5, r1, r6)
            r2.initialize(r3, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r1 = r0._exportProgressDialogRef
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r2 = r0._threadedPNGExportLooper
            r1.setPNGExporterToReadFrom(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r1 = r0._exportProgressDialogRef
            r13.addDialogToStage(r1)
            goto L106
        Le9:
            java.lang.String r3 = "pngEncoderFailTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "pngEncoderFailInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r13.showErrorDialog(r3, r4)
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r1
            org.fortheloss.sticknodes.movieclip.MCCache.rebuildFBOs()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r2
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r1
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r2.enableQuickResizeTool(r1)
        L106:
            return
    }

    public void beginPackScreenshotter() {
            r3 = this;
            org.fortheloss.sticknodes.Screenshotter r0 = new org.fortheloss.sticknodes.Screenshotter
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModule
            r0.<init>(r3, r1, r2)
            r3._screenshotter = r0
            org.fortheloss.framework.Assets r1 = r3._assetsRef
            r2 = 1
            r0.begin(r1, r2)
            return
    }

    public void beginScreenshotter() {
            r3 = this;
            org.fortheloss.sticknodes.Screenshotter r0 = new org.fortheloss.sticknodes.Screenshotter
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModule
            r0.<init>(r3, r1, r2)
            r3._screenshotter = r0
            org.fortheloss.framework.Assets r1 = r3._assetsRef
            r2 = 0
            r0.begin(r1, r2)
            return
    }

    public void breakApartMC(org.fortheloss.sticknodes.movieclip.MCReference r27) {
            r26 = this;
            r0 = r26
            r2 = r27
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r1 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionData
            int r3 = r3.getScreen()
            if (r3 != 0) goto L35d
            if (r2 != 0) goto L12
            goto L35d
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r5 = r3
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            int r3 = r27.getCurrentFrameIndex()
            org.fortheloss.sticknodes.data.MCFrameData r3 = r2.getFrameAt(r3)
            int r4 = r3.getFrameTotalNodeCount()
            int r6 = r5.getFrameTotalNodeCount()
            r7 = 0
            int r8 = r2.getNodeCount(r7)
            int r6 = r6 - r8
            int r6 = r6 + r4
            int r4 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            if (r6 <= r4) goto L48
            java.lang.String r1 = "breakApartMCErrorTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "breakApartMCErrorInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
            return
        L48:
            java.util.ArrayList r4 = r5.getDrawableFigures()
            int r6 = r4.size()
            r8 = 1
            int r6 = r6 - r8
        L52:
            if (r6 < 0) goto L5e
            java.lang.Object r10 = r4.get(r6)
            if (r10 != r2) goto L5b
            goto L5f
        L5b:
            int r6 = r6 + (-1)
            goto L52
        L5e:
            r6 = -1
        L5f:
            if (r6 >= 0) goto L62
            return
        L62:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            float r11 = r27.getX()
            float r12 = r27.getY()
            float r13 = r27.getRotation()
            float r14 = r27.getScale()
            boolean r15 = r27.isFlippedX()
            boolean r9 = r27.isFlippedY()
            boolean r17 = r27.isJoined()
            if (r17 == 0) goto L98
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r0._canvasModule
            r8.unjoinFigure(r2, r7)
            org.fortheloss.sticknodes.data.SessionData r8 = r0._sessionData
            java.lang.Object r1 = r8.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r1 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r1
            org.fortheloss.sticknodes.data.SessionData r8 = r0._sessionData
            r8.addUserAction(r1)
            goto Lb4
        L98:
            byte r8 = r27.isLockedToCamera()
            if (r8 == 0) goto Lb4
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r8 = r0._framesModule
            int r7 = r27.getID()
            r8.removeFigureFromCameraLock(r7, r5)
            org.fortheloss.sticknodes.data.SessionData r7 = r0._sessionData
            java.lang.Object r1 = r7.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r1 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r1
            org.fortheloss.sticknodes.data.SessionData r7 = r0._sessionData
            r7.addUserAction(r1)
        Lb4:
            r5.deleteFigure(r2)
            java.util.ArrayList r1 = r3.getDrawableFigures()
            int r3 = r1.size()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>(r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r17 = 1
            int r3 = r3 + (-1)
        Ld2:
            r18 = 1127481344(0x43340000, float:180.0)
            if (r3 < 0) goto L262
            java.lang.Object r19 = r1.get(r3)
            r20 = r1
            r1 = r19
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r19 = r4
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto Lf1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r21 = r3
            r3 = r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r4.<init>(r3)
            goto L108
        Lf1:
            r21 = r3
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r3 == 0) goto L100
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r4 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r3 = r1
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r3 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r3
            r4.<init>(r3)
            goto L108
        L100:
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r3 = r1
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            r4.<init>(r3)
        L108:
            r2.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r3.getFramesContainer()
            r22 = r2
            r2 = -1
            r5.addFigureAt(r4, r2, r6, r3)
            boolean r3 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L122
            r16 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r16 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r16
            r16.unlockStickNode()
        L122:
            int r16 = r1.getID()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            int r16 = r4.getID()
            r23 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r7.put(r2, r6)
            boolean r2 = r1.isJoined()
            if (r2 == 0) goto L162
            org.fortheloss.framework.ThreeInts r2 = new org.fortheloss.framework.ThreeInts
            int r6 = r1.getID()
            org.fortheloss.sticknodes.stickfigure.StickNode r16 = r1.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r16 = r16.getStickfigure()
            r24 = r5
            int r5 = r16.getID()
            org.fortheloss.sticknodes.stickfigure.StickNode r16 = r1.getJoinedToNode()
            r25 = r7
            int r7 = r16.getDrawOrderIndex()
            r2.<init>(r6, r5, r7)
            r8.add(r2)
            goto L166
        L162:
            r24 = r5
            r25 = r7
        L166:
            float r2 = r1.getX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r0._canvasModule
            float r5 = r5.getWidth()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            float r2 = r2 - r5
            float r2 = r2 * r14
            float r5 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r0._canvasModule
            float r7 = r7.getHeight()
            float r7 = r7 * r6
            float r5 = r5 - r7
            float r5 = r5 * r14
            double r6 = (double) r5
            r16 = r1
            double r0 = (double) r2
            double r0 = java.lang.Math.atan2(r6, r0)
            float r0 = (float) r0
            r1 = 1113927392(0x42652ee0, float:57.295776)
            float r0 = r0 * r1
            if (r15 == r9) goto L19a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
        L19a:
            float r0 = r0 + r13
            r1 = 1016003125(0x3c8efa35, float:0.017453292)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r6 = java.lang.Math.cos(r0)
            float r6 = (float) r6
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float r2 = r2 * r2
            float r5 = r5 * r5
            float r2 = r2 + r5
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r6 = r6 * r1
            float r0 = r0 * r1
            float r6 = r6 + r11
            float r0 = r0 + r12
            r4.setPosition(r6, r0)
            if (r3 == 0) goto L1cb
            float r0 = r16.getScale()
            float r0 = r0 * r14
            r4.setScale(r0)
            goto L1e4
        L1cb:
            r0 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r1 = r16
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            float r2 = r1.getScaleX()
            float r2 = r2 * r14
            r0.setScaleX(r2)
            float r1 = r1.getScaleY()
            float r1 = r1 * r14
            r0.setScaleY(r1)
        L1e4:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 == 0) goto L24c
            float r0 = r4.getDsAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L231
            if (r15 != r9) goto L202
            int r0 = r4.getDsAngle()
            float r0 = (float) r0
            float r0 = r0 + r13
            int r0 = (int) r0
            r4.setDsAngle(r0)
            goto L21d
        L202:
            if (r15 == 0) goto L211
            int r0 = r4.getDsAngle()
            int r0 = 180 - r0
            float r1 = r13 - r18
            int r1 = (int) r1
            int r0 = r0 + r1
            r4.setDsAngle(r0)
        L211:
            if (r9 == 0) goto L21d
            int r0 = r4.getDsAngle()
            int r0 = -r0
            int r1 = (int) r13
            int r0 = r0 + r1
            r4.setDsAngle(r0)
        L21d:
            float r0 = r4.getDsBlur()
            float r0 = r0 * r14
            r4.setDsBlur(r0)
            int r0 = r4.getDsDistance()
            float r0 = (float) r0
            float r0 = r0 * r14
            int r0 = (int) r0
            r4.setDsDistance(r0)
        L231:
            float r0 = r4.getBlur()
            float r0 = r0 * r14
            r4.setBlur(r0)
            float r0 = r4.getGlow()
            float r0 = r0 * r14
            r4.setGlow(r0)
            float r0 = r4.getGlowIntensity()
            float r0 = r0 * r14
            r4.setGlowIntensity(r0)
        L24c:
            r0 = 0
            r10.add(r0, r4)
            int r3 = r21 + (-1)
            r0 = r26
            r4 = r19
            r1 = r20
            r2 = r22
            r6 = r23
            r5 = r24
            r7 = r25
            goto Ld2
        L262:
            r22 = r2
            r19 = r4
            r24 = r5
            r23 = r6
            r25 = r7
            int r0 = r8.size()
            r1 = 1
            int r0 = r0 - r1
        L272:
            if (r0 < 0) goto L2ec
            java.lang.Object r1 = r8.get(r0)
            org.fortheloss.framework.ThreeInts r1 = (org.fortheloss.framework.ThreeInts) r1
            int r2 = r1.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r25
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r4 = r1.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r3.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = r1.c
            int r5 = r19.size()
            r6 = 1
            int r5 = r5 - r6
            r6 = 0
            r7 = r6
        L2a6:
            r11 = r19
            if (r5 < 0) goto L2ca
            java.lang.Object r12 = r11.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            int r14 = r12.getID()
            if (r14 != r2) goto L2b8
            r6 = r12
            goto L2c0
        L2b8:
            if (r14 != r4) goto L2c0
            org.fortheloss.sticknodes.stickfigure.INode r7 = r12.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
        L2c0:
            if (r6 == 0) goto L2c5
            if (r7 == 0) goto L2c5
            goto L2ca
        L2c5:
            int r5 = r5 + (-1)
            r19 = r11
            goto L2a6
        L2ca:
            if (r6 == 0) goto L2e1
            if (r7 != 0) goto L2cf
            goto L2e1
        L2cf:
            r6.joinTo(r7)
            r5 = r24
            r5.onFigureJoined(r6, r7)
            boolean r1 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L2e3
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = (org.fortheloss.sticknodes.sprite.SpriteRef) r6
            r6.applySmartStretch()
            goto L2e3
        L2e1:
            r5 = r24
        L2e3:
            int r0 = r0 + (-1)
            r25 = r3
            r24 = r5
            r19 = r11
            goto L272
        L2ec:
            r5 = r24
            int r0 = r22.size()
            r1 = 1
            int r0 = r0 - r1
        L2f4:
            if (r0 < 0) goto L32a
            r2 = r22
            java.lang.Object r3 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            boolean r4 = r3.isJoined()
            if (r4 != 0) goto L316
            r3.rotateFigureBy(r13)
            if (r15 == r9) goto L325
            float r4 = -r13
            r3.rotateFigureBy(r4)
            r3.flipX(r1)
            float r4 = r13 + r18
            r3.rotateFigureBy(r4)
            goto L325
        L316:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L325
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            int r4 = r3.getSmartStretchState()
            if (r4 == 0) goto L325
            r3.updateSmartStretchDefaults()
        L325:
            int r0 = r0 + (-1)
            r22 = r2
            goto L2f4
        L32a:
            r0 = r26
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.maybeUpdateJoinChains()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceBreakApartAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceBreakApartAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            r7 = r1
            org.fortheloss.sticknodes.data.useractions.MCReferenceBreakApartAction r7 = (org.fortheloss.sticknodes.data.useractions.MCReferenceBreakApartAction) r7
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r1.getFramesContainer()
            r1 = r7
            r2 = r27
            r3 = r10
            r4 = r23
            r1.initialize(r2, r3, r4, r5, r6)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            r1.addUserAction(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            r1.setNeedsToBeDrawn()
            r26.setSessionSelectionToNothing()
        L35d:
            return
    }

    public void cancelExport() {
            r1 = this;
            boolean r0 = r1._isExportingGIF
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r0 = r1._threadedGifExportLooper
            if (r0 == 0) goto Lc
            r0.requestCancel()
        Lc:
            return
    }

    public void cancelMP4Export() {
            r1 = this;
            boolean r0 = r1._isExportingMP4
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r0 = r1._threadedMP4ExportLooper
            if (r0 == 0) goto Lc
            r0.requestCancel()
        Lc:
            return
    }

    public void cancelPNGExport() {
            r1 = this;
            boolean r0 = r1._isExportingPNG
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r0 = r1._threadedPNGExportLooper
            if (r0 == 0) goto Lc
            r0.requestCancel()
        Lc:
            return
    }

    public void changeMovieclipName(int r2, java.lang.String r3) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r2
            r2.setName(r3)
            return
    }

    public void changeSpriteName(int r2, java.lang.String r3) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r0.librarySprites
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r2 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r2
            r2.setName(r3)
            return
    }

    public void changeStickfigureName(int r11, java.lang.String r12) {
            r10 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            java.lang.Object r0 = r0.get(r11)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r0.setName(r12)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r1) goto L47
            java.lang.Object r4 = r0.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
            java.util.ArrayList r4 = r4.getDrawableFigures()
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L29:
            if (r5 < 0) goto L44
            java.lang.Object r6 = r4.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto L41
            int r7 = r6.getLibraryID()
            if (r7 == r11) goto L3c
            goto L41
        L3c:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            r6.setName(r12)
        L41:
            int r5 = r5 + (-1)
            goto L29
        L44:
            int r3 = r3 + 1
            goto L17
        L47:
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L51:
            if (r1 < 0) goto L93
            java.lang.Object r3 = r0.get(r1)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r4 = r3.size()
            r5 = 0
        L60:
            if (r5 >= r4) goto L90
            java.lang.Object r6 = r3.get(r5)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            java.util.ArrayList r6 = r6.getDrawableFigures()
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L72:
            if (r7 < 0) goto L8d
            java.lang.Object r8 = r6.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            boolean r9 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r9 == 0) goto L8a
            int r9 = r8.getLibraryID()
            if (r9 == r11) goto L85
            goto L8a
        L85:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r8
            r8.setName(r12)
        L8a:
            int r7 = r7 + (-1)
            goto L72
        L8d:
            int r5 = r5 + 1
            goto L60
        L90:
            int r1 = r1 + (-1)
            goto L51
        L93:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto Le0
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r10._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            if (r0 == 0) goto Le0
            int r1 = r0.getLibraryID()
            if (r1 >= 0) goto Le0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
        Lb0:
            if (r2 >= r1) goto Le0
            java.lang.Object r3 = r0.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            java.util.ArrayList r3 = r3.getDrawableFigures()
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Lc2:
            if (r4 < 0) goto Ldd
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r6 == 0) goto Lda
            int r6 = r5.getLibraryID()
            if (r6 == r11) goto Ld5
            goto Lda
        Ld5:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r5.setName(r12)
        Lda:
            int r4 = r4 + (-1)
            goto Lc2
        Ldd:
            int r2 = r2 + 1
            goto Lb0
        Le0:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void checkOutsideOpenRequests() {
            r8 = this;
            int r0 = r8._screenState
            if (r0 == 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.data.ProjectData r0 = r8._projectData
            if (r0 != 0) goto La
            return
        La:
            org.fortheloss.sticknodes.App r0 = r8._appRef
            int r0 = r0.getOutsideOpenRequest()
            r1 = -1
            if (r0 == r1) goto L1f4
            r1 = 5
            if (r0 != r1) goto L2f
            org.fortheloss.sticknodes.App r0 = r8._appRef
            java.lang.String r0 = r0.getOutsideOpenRequestFilename()
            org.fortheloss.sticknodes.App r1 = r8._appRef
            org.fortheloss.framework.IMP3FromURLDownloader r1 = r1.getMP3FromURLDownlaoder()
            org.fortheloss.sticknodes.animationscreen.dialogs.IOSMP3DownloadConfirmDialog r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.IOSMP3DownloadConfirmDialog
            r2.<init>(r8, r1, r0)
            r2.initialize()
            r8.addDialogToStage(r2)
            goto L1e5
        L2f:
            r1 = 4
            java.lang.String r2 = "last_status_event"
            r3 = 0
            r4 = 1
            if (r0 != r1) goto Lae
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "AnimationScreen_outside_open_request_import_mp3"
            r0.setCrashlyticsKeyString(r2, r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Importing MP3."
            r0.println(r1)
            org.fortheloss.sticknodes.App r0 = r8._appRef
            java.lang.String r0 = r0.getOutsideOpenRequestFilename()
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r0)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L81
            java.lang.String r2 = r1.extension()
            java.lang.String r5 = "mp3"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L81
            long r1 = r1.length()
            r5 = 256000(0x3e800, double:1.26481E-318)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L7f
            goto L81
        L7f:
            r1 = 1
            goto L82
        L81:
            r1 = 0
        L82:
            if (r1 == 0) goto L99
            java.lang.String r1 = "soundFileAddedTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "soundFileAddedInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            r8.showErrorDialog(r1, r0)
            goto L1e5
        L99:
            java.lang.String r1 = "soundFileNotAddedTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "soundFileNotAddedInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            r8.showErrorDialog(r1, r0)
            goto L1e5
        Lae:
            java.lang.String r1 = "errorImportingTitle"
            if (r0 != 0) goto L12e
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "AnimationScreen_outside_open_request_import_stickfigure"
            r0.setCrashlyticsKeyString(r2, r5)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r2 = "Importing stickfigure."
            r0.println(r2)
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            org.fortheloss.sticknodes.App r5 = r8._appRef
            java.lang.String r5 = r5.getOutsideOpenRequestFilename()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r2)
            boolean r0 = r8.importStickfigure(r0)
            if (r0 != 0) goto L11b
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r2 = "Failed to import the stickfigure with new method, trying old method."
            r0.println(r2)
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            org.fortheloss.sticknodes.App r5 = r8._appRef
            java.lang.String r5 = r5.getOutsideOpenRequestFilename()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r2)
            boolean r0 = r8.importStickfigureOld(r0)
            if (r0 != 0) goto L11b
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r1 = "errorImportingInfo1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r8.showErrorDialog(r0, r1)
            goto L11c
        L11b:
            r3 = 1
        L11c:
            if (r3 == 0) goto L1e5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r1 = r8._projectData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getLastAddedLibraryStickfigure()
            r0.<init>(r1)
            r8.addStickfigure(r0, r4, r4)
            goto L1e5
        L12e:
            if (r0 != r4) goto L184
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "AnimationScreen_outside_open_request_import_pivot_stickfigure"
            r0.setCrashlyticsKeyString(r2, r5)
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            org.fortheloss.sticknodes.App r5 = r8._appRef
            java.lang.String r5 = r5.getOutsideOpenRequestFilename()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r2)
            boolean r0 = r8.importPivotStickfigure(r0)
            if (r0 != 0) goto L172
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r2 = 400(0x190, float:5.6E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            java.lang.String r2 = "errorImportingInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2, r1)
            r8.showErrorDialog(r0, r1)
            goto L173
        L172:
            r3 = 1
        L173:
            if (r3 == 0) goto L1e5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r1 = r8._projectData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getLastAddedLibraryStickfigure()
            r0.<init>(r1)
            r8.addStickfigure(r0, r4, r4)
            goto L1e5
        L184:
            r1 = 6
            if (r0 != r1) goto L1a4
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "AnimationScreen_outside_open_request_import_movieclip"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L1e5
            org.fortheloss.sticknodes.App r0 = r8._appRef
            java.lang.String r0 = r0.getOutsideOpenRequestFilename()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.onOpenScrollToName = r0
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r8._animateToolsModule
            r0.importMovieclip()
            goto L1e5
        L1a4:
            r1 = 2
            if (r0 != r1) goto L1b1
            org.fortheloss.sticknodes.App r0 = r8._appRef
            java.lang.String r0 = r0.getOutsideOpenRequestFilename()
            r8.showOpeningProjectWarningDialog(r0)
            goto L1e5
        L1b1:
            r2 = 3
            if (r0 != r2) goto L1d3
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionData
            int r0 = r0.getScreen()
            if (r0 != r1) goto L1bf
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r8._animateToolsModule
            goto L1c1
        L1bf:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r8._movieclipToolsModule
        L1c1:
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog
            org.fortheloss.sticknodes.App r2 = r8._appRef
            java.lang.String r2 = r2.getOutsideOpenRequestFilename()
            r1.<init>(r8, r0, r2)
            r1.initialize()
            r8.addDialogToStage(r1)
            goto L1e5
        L1d3:
            r1 = 7
            if (r0 != r1) goto L1e5
            java.lang.String r0 = "error"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            org.fortheloss.sticknodes.App r1 = r8._appRef
            java.lang.String r1 = r1.getOutsideOpenRequestFilename()
            r8.showErrorDialog(r0, r1)
        L1e5:
            org.fortheloss.sticknodes.App r0 = r8._appRef
            r0.outsideRequestConsumed()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r8._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r8._framesModule
            r0.setNeedsToBeDrawn()
        L1f4:
            return
    }

    public void copyCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            if (r2 == 0) goto L7
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedFrameCamera(r2)
        L7:
            return
    }

    public void copyFrame(org.fortheloss.sticknodes.data.IFrameData r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L7
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedFrame(r2, r3)
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r1._framesModule
            r2.updatePasteFrameButton()
            return
    }

    public void copyFrames(org.fortheloss.sticknodes.data.IFrameData r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r0.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L1d
            java.lang.Object r2 = r0.get(r1)
            if (r2 != r4) goto L1a
            goto L1e
        L1a:
            int r1 = r1 + (-1)
            goto L11
        L1d:
            r1 = -1
        L1e:
            if (r1 < 0) goto L2a
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionData
            r4.setCopiedFrames(r0, r1, r5, r6)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModule
            r4.updatePasteFrameButton()
        L2a:
            return
    }

    public void copyMC(org.fortheloss.sticknodes.movieclip.MCReference r2, org.fortheloss.sticknodes.data.FrameData r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedMovieclip(r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.updateMCLibraryTools()
        Lc:
            return
    }

    public void copySegment(boolean r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r1 = this;
            if (r3 == 0) goto L7
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedStickNode(r3, r2)
        L7:
            return
    }

    public void copySprite(org.fortheloss.sticknodes.sprite.SpriteRef r2, org.fortheloss.sticknodes.data.IFrameData r3) {
            r1 = this;
            if (r2 == 0) goto L11
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedSprite(r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.updateSpriteLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.updateSpriteLibraryTools()
        L11:
            return
    }

    public void copyStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r2, boolean r3, org.fortheloss.sticknodes.data.IFrameData r4, int r5) {
            r1 = this;
            if (r2 == 0) goto L11
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedStickfigure(r2, r3, r4, r5)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.updateLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.updateLibraryTools()
        L11:
            return
    }

    public void copyTextfield(org.fortheloss.sticknodes.TextfieldBox r2) {
            r1 = this;
            if (r2 == 0) goto L7
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setCopiedTextfield(r2)
        L7:
            return
    }

    public void debugAddLastImportedStickfiguresToStage(int r7) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r7) goto L20
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r3 = r6._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r3 = r3.libraryStickfigures
            int r4 = r3.size()
            r5 = 1
            int r4 = r4 - r5
            int r4 = r4 - r1
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r2.<init>(r3)
            r6.addStickfigure(r2, r5, r0)
            int r1 = r1 + 1
            goto L2
        L20:
            return
    }

    public void debugClearFrame(boolean r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L66
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionData
            int r0 = r0.getMode()
            r1 = 3
            if (r0 != r1) goto L12
            goto L66
        L12:
            long r0 = r4._debugClearFrameLastTapTime
            long r2 = java.lang.System.nanoTime()
            r4._debugClearFrameLastTapTime = r2
            if (r5 != 0) goto L2d
            long r2 = r2 - r0
            double r0 = (double) r2
            r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r2
            r2 = 4595653203753948938(0x3fc70a3d70a3d70a, double:0.18)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L66
        L2d:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r5.getCurrentFrame()
            r5.clearFrame(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            r0 = 0
            r5.resetZoom(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r5 = r5.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = r5.getFrameCamera()
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setCameraScale(r0)
            r0 = 0
            r5.setCameraOffsetX(r0)
            r5.setCameraOffsetY(r0)
            r5.setCameraRotation(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModule
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r5 = r4._animateToolsModule
            r5.setNeedsToBeDrawn()
        L66:
            return
    }

    public com.badlogic.gdx.graphics.Color[] debugGetColorBackgroundPresets() {
            r1 = this;
            com.badlogic.gdx.graphics.Color[] r0 = r1._debugBackgroundColorPresets
            return r0
    }

    public java.util.ArrayList<java.lang.String> debugResaveAllStickfigures() {
            r8 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L51
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionData
            int r0 = r0.getMode()
            r1 = 3
            if (r0 != r1) goto L12
            goto L51
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r8._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            java.util.ArrayList r0 = r0.getDrawableFigures()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            r3 = 0
            r4 = 0
        L29:
            if (r4 >= r2) goto L50
            java.lang.Object r5 = r0.get(r4)
            boolean r5 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 != 0) goto L34
            goto L4d
        L34:
            java.lang.Object r5 = r0.get(r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            java.lang.String r6 = r5.getName()
            boolean r7 = r1.contains(r6)
            if (r7 == 0) goto L45
            goto L4d
        L45:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r7 = r8._createToolsModule
            r7.saveStickfigureToFile(r6, r5, r3)
            r1.add(r6)
        L4d:
            int r4 = r4 + 1
            goto L29
        L50:
            return r1
        L51:
            r0 = 0
            return r0
    }

    public void debugScaleStickfiguresUniformly(int r7) {
            r6 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            if (r1 > 0) goto L11
            return
        L11:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L36
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            float r3 = r2.getScale()
            float r4 = r2.getScale()
            r5 = 1028443341(0x3d4ccccd, float:0.05)
            float r4 = r4 * r5
            float r5 = (float) r7
            float r4 = r4 * r5
            float r3 = r3 + r4
            r2.setScale(r3)
            int r1 = r1 + (-1)
            goto L17
        L36:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r6._canvasModule
            r7.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r6._framesModule
            r7.setNeedsToBeDrawn()
            return
    }

    public void debugSeparateStickfigures() {
            r1 = this;
            r0 = 0
            r1.debugSeparateStickfigures(r0)
            return
    }

    public void debugSeparateStickfigures(boolean r20) {
            r19 = this;
            r0 = r19
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r1 = r1.size()
            if (r1 > 0) goto L13
            return
        L13:
            com.badlogic.gdx.Input r1 = com.badlogic.gdx.Gdx.input
            r2 = 151(0x97, float:2.12E-43)
            boolean r1 = r1.isKeyPressed(r2)
            r3 = 152(0x98, float:2.13E-43)
            if (r1 != 0) goto L34
            com.badlogic.gdx.Input r1 = com.badlogic.gdx.Gdx.input
            boolean r1 = r1.isKeyPressed(r3)
            if (r1 != 0) goto L34
            com.badlogic.gdx.Input r1 = com.badlogic.gdx.Gdx.input
            r6 = 153(0x99, float:2.14E-43)
            boolean r1 = r1.isKeyPressed(r6)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            com.badlogic.gdx.Input r6 = com.badlogic.gdx.Gdx.input
            boolean r2 = r6.isKeyPressed(r2)
            if (r2 != 0) goto L49
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r6 = 148(0x94, float:2.07E-43)
            boolean r2 = r2.isKeyPressed(r6)
            if (r2 != 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            if (r20 == 0) goto L4e
            r1 = 1
            r2 = 0
        L4e:
            r6 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            boolean r3 = r7.isKeyPressed(r3)
            if (r3 != 0) goto L63
            com.badlogic.gdx.Input r3 = com.badlogic.gdx.Gdx.input
            r7 = 149(0x95, float:2.09E-43)
            boolean r3 = r3.isKeyPressed(r7)
            if (r3 == 0) goto L66
        L63:
            r6 = 1058642330(0x3f19999a, float:0.6)
        L66:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r3.getFrameCamera()
            float r7 = r3.getCameraOffsetX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r0._canvasModule
            float r8 = r8.getWidth()
            float r9 = r3.getCameraScale()
            float r8 = r8 * r9
            float r8 = r8 + r7
            float r9 = r3.getCameraOffsetY()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r10 = r0._canvasModule
            float r10 = r10.getHeight()
            float r11 = r3.getCameraScale()
            float r10 = r10 * r11
            float r10 = r10 + r9
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r11 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r11 = r11.getCurrentFrame()
            java.util.ArrayList r11 = r11.getDrawableFigures()
            int r12 = r11.size()
            r13 = 0
            if (r2 == 0) goto L156
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r2 = new org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r15 = r0._canvasModule
            float r15 = r15.getWidth()
            float r16 = r3.getCameraScale()
            float r15 = r15 * r16
            float r15 = r15 * r6
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r0._canvasModule
            float r4 = r4.getHeight()
            float r3 = r3.getCameraScale()
            float r4 = r4 * r3
            float r4 = r4 * r6
            r3 = 0
        Lc7:
            if (r3 >= r12) goto L156
            java.lang.Object r6 = r11.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            boolean r14 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r14 != 0) goto Ld7
        Ld3:
            r18 = r2
            goto L14f
        Ld7:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            r6.setPosition(r13, r13)
            com.badlogic.gdx.math.Rectangle r14 = r2.getSize(r6)
            float r5 = r14.width
            float r13 = r14.x
            float r5 = r5 - r13
            float r13 = r14.height
            float r14 = r14.y
            float r13 = r13 - r14
            r14 = 0
            int r17 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r17 <= 0) goto L12a
            int r18 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r18 > 0) goto Lf4
            goto L12a
        Lf4:
            int r14 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r14 <= 0) goto Lfb
            float r5 = r15 / r5
            goto Lfd
        Lfb:
            r5 = 1065353216(0x3f800000, float:1.0)
        Lfd:
            int r14 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r14 <= 0) goto L110
            float r13 = r4 / r13
            float r14 = java.lang.Math.abs(r13)
            float r18 = java.lang.Math.abs(r5)
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 >= 0) goto L110
            r5 = r13
        L110:
            r13 = 953267991(0x38d1b717, float:1.0E-4)
            r14 = 1101004800(0x41a00000, float:20.0)
            float r18 = r6.getScale()
            float r5 = r5 * r18
            float r5 = java.lang.Math.min(r14, r5)
            float r5 = java.lang.Math.max(r13, r5)
            r6.setScale(r5)
            r6.validateDirtyNodes()
            goto Ld3
        L12a:
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = r2
            java.lang.String r2 = "[Fail] Stickfigure is invalid size ("
            r14.append(r2)
            r14.append(r5)
            java.lang.String r2 = " x "
            r14.append(r2)
            r14.append(r13)
            java.lang.String r2 = ")."
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            r6.println(r2)
        L14f:
            int r3 = r3 + 1
            r2 = r18
            r13 = 0
            goto Lc7
        L156:
            r2 = 32
            r3 = 2
            r4 = 4
            if (r12 <= r2) goto L160
            r3 = 10
        L15e:
            r2 = 1
            goto L17e
        L160:
            r2 = 16
            if (r12 <= r2) goto L167
            r3 = 8
            goto L15e
        L167:
            r2 = 6
            if (r12 <= r2) goto L16d
            r2 = 1
            r3 = 4
            goto L17e
        L16d:
            if (r12 <= r4) goto L174
            r2 = 3
            r2 = 1
            r3 = 3
        L172:
            r4 = 2
            goto L17e
        L174:
            if (r12 <= r3) goto L178
            r2 = 1
            goto L172
        L178:
            r2 = 1
            if (r12 <= r2) goto L17c
            goto L17d
        L17c:
            r3 = 1
        L17d:
            r4 = 1
        L17e:
            float r8 = r8 - r7
            int r5 = r3 + 1
            float r5 = (float) r5
            float r8 = r8 / r5
            float r5 = r10 - r9
            int r4 = r4 + r2
            float r2 = (float) r4
            float r5 = r5 / r2
            r2 = 1048576000(0x3e800000, float:0.25)
            float r2 = r2 * r8
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
        L191:
            if (r4 >= r12) goto L1c3
            float r13 = r6 * r8
            float r13 = r13 + r7
            float r14 = r9 * r5
            float r14 = r10 - r14
            if (r1 == 0) goto L1aa
            r15 = 1073741824(0x40000000, float:2.0)
            float r15 = r9 % r15
            r16 = 0
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 != 0) goto L1a8
            float r13 = r13 + r2
            goto L1ac
        L1a8:
            float r13 = r13 - r2
            goto L1ac
        L1aa:
            r16 = 0
        L1ac:
            java.lang.Object r15 = r11.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r15 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r15
            r15.setPosition(r13, r14)
            r13 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r13
            float r14 = (float) r3
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 <= 0) goto L1c0
            float r9 = r9 + r13
            r6 = 1065353216(0x3f800000, float:1.0)
        L1c0:
            int r4 = r4 + 1
            goto L191
        L1c3:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            r1.setNeedsToBeDrawn()
            return
    }

    public void deleteBackupStickfigureFile(java.lang.String r4) {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L36
            if (r4 != 0) goto L27
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r0 = org.fortheloss.sticknodes.App.stickfigureBackupsPath
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r0)
            com.badlogic.gdx.files.FileHandle[] r4 = r4.list()
            int r0 = r4.length
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L36
            r1 = r4[r0]
            boolean r2 = r1.exists()
            if (r2 == 0) goto L24
            r1.delete()
        L24:
            int r0 = r0 + (-1)
            goto L17
        L27:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r4 = r0.absolute(r4)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L36
            r4.delete()
        L36:
            return
    }

    public void deleteMC(org.fortheloss.sticknodes.movieclip.MCReference r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r1.getFramesContainer()
            r2.deleteMC(r3, r0, r1)
            return
    }

    public void deleteMC(org.fortheloss.sticknodes.movieclip.MCReference r5, org.fortheloss.sticknodes.data.IFrameData r6, org.fortheloss.sticknodes.animationscreen.FramesContainer r7) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r6.getFigurePosition(r5)
            r1 = -1
            if (r0 != r1) goto Lb
            return
        Lb:
            r4.setSessionSelectionToNothing()
            byte r1 = r5.isLockedToCamera()
            if (r1 == 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r4._framesModule
            int r2 = r5.getID()
            r3 = r6
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            r1.removeFigureFromCameraLock(r2, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r2 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r1 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r1
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionData
            r2.addUserAction(r1)
        L2f:
            r6.deleteFigure(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceDeleteAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceDeleteAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferenceDeleteAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceDeleteAction) r1
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            r1.initialize(r5, r0, r6, r7)
            org.fortheloss.sticknodes.data.SessionData r6 = r4._sessionData
            r6.addUserAction(r1)
            boolean r6 = r5.isJoined()
            if (r6 == 0) goto L4f
            r5.unjoin()
        L4f:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModule
            r5.setNeedsToBeDrawn()
            return
    }

    public void deleteMCFiles(java.lang.String[] r2, org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteMCDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteMCDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void deleteMCFromProject(int r11) {
            r10 = this;
            if (r11 >= 0) goto L3
            return
        L3:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lib_id_"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "removed_mc_from_project"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L25:
            r4 = 1
            if (r3 >= r1) goto L85
            java.lang.Object r5 = r0.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5
            java.util.ArrayList r6 = r5.getDrawableFigures()
            int r7 = r6.size()
            int r7 = r7 - r4
        L37:
            if (r7 < 0) goto L54
            java.lang.Object r8 = r6.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            boolean r9 = r8 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r9 != 0) goto L44
            goto L51
        L44:
            int r9 = r8.getLibraryID()
            if (r9 != r11) goto L51
            org.fortheloss.sticknodes.movieclip.MCReference r8 = (org.fortheloss.sticknodes.movieclip.MCReference) r8
            org.fortheloss.sticknodes.data.ProjectData r9 = r10._projectData
            r10.deleteMC(r8, r5, r9)
        L51:
            int r7 = r7 + (-1)
            goto L37
        L54:
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = r5.getFrameCamera()
            java.util.ArrayList r5 = r5.getLockedStickfigureBundles()
            if (r5 == 0) goto L82
            int r6 = r5.size()
            int r6 = r6 - r4
        L65:
            if (r6 < 0) goto L82
            java.lang.Object r7 = r5.get(r6)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r7 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r7
            int r8 = r7.getFigureType()
            if (r8 == r4) goto L74
            goto L7f
        L74:
            int r8 = r7.getLibraryID()
            if (r8 <= r11) goto L7f
            int r8 = r8 + (-1)
            r7.setLibraryID(r8)
        L7f:
            int r6 = r6 + (-1)
            goto L65
        L82:
            int r3 = r3 + 1
            goto L25
        L85:
            r0 = -1
            org.fortheloss.sticknodes.movieclip.MCCache.removeFromCache(r11, r0)
            int[][] r0 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            int r1 = r0.length
            int r1 = r1 - r4
        L8d:
            if (r1 < 0) goto La1
            r3 = r0[r1]
            r3 = r3[r2]
            if (r3 <= r11) goto L9e
            r3 = r0[r1]
            r5 = r0[r1]
            r5 = r5[r2]
            int r5 = r5 - r4
            r3[r2] = r5
        L9e:
            int r1 = r1 + (-1)
            goto L8d
        La1:
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            int r0 = r0.size()
            int r0 = r0 - r4
        Laa:
            if (r0 < 0) goto Lc4
            if (r0 > r11) goto Laf
            goto Lc4
        Laf:
            org.fortheloss.sticknodes.data.ProjectData r1 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r1.libraryMovieclips
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r1
            int r3 = r1.getLibraryID()
            int r3 = r3 - r4
            r1.setLibraryID(r3)
            int r0 = r0 + (-1)
            goto Laa
        Lc4:
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            java.lang.Object r0 = r0.remove(r11)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r0
            r0.dispose()
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            r0.hideMovieclipInImportList(r11, r2)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<java.lang.Integer> r0 = r0.hiddenMovieclipLibraryIDs
            int r0 = r0.size()
            int r0 = r0 - r4
        Ldf:
            if (r0 < 0) goto L101
            org.fortheloss.sticknodes.data.ProjectData r1 = r10._projectData
            java.util.ArrayList<java.lang.Integer> r1 = r1.hiddenMovieclipLibraryIDs
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= r11) goto Lfe
            org.fortheloss.sticknodes.data.ProjectData r2 = r10._projectData
            java.util.ArrayList<java.lang.Integer> r2 = r2.hiddenMovieclipLibraryIDs
            int r1 = r1 + (-1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.set(r0, r1)
        Lfe:
            int r0 = r0 + (-1)
            goto Ldf
        L101:
            org.fortheloss.sticknodes.data.SessionData r11 = r10._sessionData
            r11.clearAnimateUndoRedo()
            org.fortheloss.sticknodes.data.SessionData r11 = r10._sessionData
            r11.clearCopiedFigures()
            org.fortheloss.sticknodes.data.SessionData r11 = r10._sessionData
            r11.clearCopiedFrames()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r11 = r10._canvasModule
            r11.flagOnionSkinDirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r11 = r10._canvasModule
            r11.flagTracingFBODirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r11 = r10._canvasModule
            r11.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r11 = r10._framesModule
            r11.setNeedsToBeDrawn()
            r10.updateMovieclipLibraryList()
            return
    }

    public void deleteProjectFile(com.badlogic.gdx.files.FileHandle r2, org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteProjectDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteProjectDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void deleteRegionFiles(java.lang.String[] r2, org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteRegionDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteRegionDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void deleteSegment(org.fortheloss.sticknodes.stickfigure.StickNode r9, boolean r10) {
            r8 = this;
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r0 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction.class
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionData
            int r2 = r2.getScreen()
            r3 = 1
            if (r2 != r3) goto Lc9
            if (r9 == 0) goto Lc9
            boolean r2 = r9.isMainNode()
            if (r2 == 0) goto L17
            goto Lc9
        L17:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r9.getParentNode()
            if (r10 != 0) goto La1
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r10 == 0) goto L23
            goto La1
        L23:
            org.fortheloss.sticknodes.stickfigure.Connector r10 = r9.getConnectorChild()
            if (r10 == 0) goto L47
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionData
            java.lang.Object r4 = r4.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction r4 = (org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction) r4
            r4.initialize(r10)
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionData
            r5.addUserAction(r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionData
            java.lang.Object r5 = r4.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r5 = (org.fortheloss.sticknodes.data.useractions.UserAction) r5
            r4.addUserAction(r5)
            r10.delete(r3)
        L47:
            boolean r10 = r9.hasConnectorAttachments()
            if (r10 == 0) goto L8a
            java.util.ArrayList r10 = r9.getConnectorAttachments()
            int r4 = r10.size()
            int r4 = r4 - r3
        L56:
            if (r4 < 0) goto L8a
            java.lang.Object r5 = r10.get(r4)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = (org.fortheloss.sticknodes.stickfigure.Connector) r5
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5.getParentNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r9.getParentNode()
            if (r6 != r7) goto L87
            org.fortheloss.sticknodes.data.SessionData r10 = r8._sessionData
            java.lang.Object r10 = r10.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction r10 = (org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction) r10
            r10.initialize(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionData
            r1.addUserAction(r10)
            org.fortheloss.sticknodes.data.SessionData r10 = r8._sessionData
            java.lang.Object r0 = r10.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            r10.addUserAction(r0)
            r5.delete(r3)
            goto L8a
        L87:
            int r4 = r4 + (-1)
            goto L56
        L8a:
            org.fortheloss.sticknodes.data.SessionData r10 = r8._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeDeleteOneAction> r0 = org.fortheloss.sticknodes.data.useractions.StickNodeDeleteOneAction.class
            java.lang.Object r10 = r10.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.StickNodeDeleteOneAction r10 = (org.fortheloss.sticknodes.data.useractions.StickNodeDeleteOneAction) r10
            r10.initialize(r9)
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionData
            r0.addUserAction(r10)
            r10 = 0
            r9.delete(r10)
            goto Lb4
        La1:
            org.fortheloss.sticknodes.data.SessionData r10 = r8._sessionData
            java.lang.Object r10 = r10.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction r10 = (org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction) r10
            r10.initialize(r9)
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionData
            r0.addUserAction(r10)
            r9.delete(r3)
        Lb4:
            r8.setSessionSelectionToNode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r9 = r8._canvasModule
            r9.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r9 = r8._sessionData
            int r9 = r9.getScreen()
            if (r9 != r3) goto Lc9
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r9 = r8._createToolsModule
            r9.updateNodeCount()
        Lc9:
            return
    }

    public void deleteSound(int r7) {
            r6 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1e
            org.fortheloss.sticknodes.data.ProjectData r1 = r6._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r1.librarySoundDatas
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.data.SoundData r1 = (org.fortheloss.sticknodes.data.SoundData) r1
            com.badlogic.gdx.audio.Sound r1 = r1.sound
            r1.stop()
            int r0 = r0 + (-1)
            goto La
        L1e:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r6._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            goto L30
        L2f:
            r0 = r2
        L30:
            org.fortheloss.sticknodes.data.ProjectData r3 = r6._projectData
            boolean r0 = r3.deleteSound(r7, r0)
            if (r0 == 0) goto L6f
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            r6.setSessionSelectionToFrameData(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            r0.clearAnimateUndoRedo()
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            org.fortheloss.sticknodes.data.IFrameData[] r0 = r0.getCopiedFrames()
            int r3 = r0.length
            int r3 = r3 + (-1)
        L4f:
            if (r3 < 0) goto L6a
            r4 = r0[r3]
            if (r4 == 0) goto L67
            int r5 = r4.getSoundToPlayLibraryID()
            if (r5 != r7) goto L60
            r5 = -1
            r4.setSoundToPlay(r5)
            goto L67
        L60:
            if (r5 <= r7) goto L67
            int r5 = r5 + (-1)
            r4.setSoundToPlay(r5)
        L67:
            int r3 = r3 + (-1)
            goto L4f
        L6a:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r6._framesModule
            r7.setNeedsToBeDrawn()
        L6f:
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            int r7 = r7.getScreen()
            if (r7 != 0) goto L7d
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r7 = r6._animateToolsModule
            r7.updateFrameTools()
            goto L8a
        L7d:
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            int r7 = r7.getScreen()
            if (r7 != r1) goto L8a
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r7 = r6._movieclipToolsModule
            r7.updateFrameTools()
        L8a:
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            r7.setCopiedFrameSoundData(r2)
            return
    }

    public void deleteSoundFiles(java.lang.String[] r2, org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteSoundDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteSoundDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void deleteSpriteFromProject(int r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            if (r1 >= 0) goto L7
            return
        L7:
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "lib_id_"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "removed_sprite_from_project"
            r2.setCrashlyticsKeyString(r4, r3)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r3 = r2.size()
            r5 = 0
        L28:
            r6 = 2
            r7 = 1
            if (r5 >= r3) goto L89
            java.lang.Object r8 = r2.get(r5)
            org.fortheloss.sticknodes.data.IFrameData r8 = (org.fortheloss.sticknodes.data.IFrameData) r8
            java.util.ArrayList r9 = r8.getDrawableFigures()
            int r10 = r9.size()
            int r10 = r10 - r7
        L3b:
            if (r10 < 0) goto L58
            java.lang.Object r11 = r9.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            boolean r12 = r11 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r12 != 0) goto L48
            goto L55
        L48:
            int r12 = r11.getLibraryID()
            if (r12 != r1) goto L55
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = (org.fortheloss.sticknodes.sprite.SpriteRef) r11
            org.fortheloss.sticknodes.data.ProjectData r12 = r0._projectData
            r0.deleteSpriteRef(r11, r8, r12)
        L55:
            int r10 = r10 + (-1)
            goto L3b
        L58:
            org.fortheloss.sticknodes.data.FrameData r8 = (org.fortheloss.sticknodes.data.FrameData) r8
            org.fortheloss.sticknodes.animationscreen.FrameCamera r8 = r8.getFrameCamera()
            java.util.ArrayList r8 = r8.getLockedStickfigureBundles()
            if (r8 == 0) goto L86
            int r9 = r8.size()
            int r9 = r9 - r7
        L69:
            if (r9 < 0) goto L86
            java.lang.Object r7 = r8.get(r9)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r7 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r7
            int r10 = r7.getFigureType()
            if (r10 == r6) goto L78
            goto L83
        L78:
            int r10 = r7.getLibraryID()
            if (r10 <= r1) goto L83
            int r10 = r10 + (-1)
            r7.setLibraryID(r10)
        L83:
            int r9 = r9 + (-1)
            goto L69
        L86:
            int r5 = r5 + 1
            goto L28
        L89:
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r2 = r2.libraryMovieclips
            int r3 = r2.size()
            int r3 = r3 - r7
        L92:
            if (r3 < 0) goto Lda
            java.lang.Object r5 = r2.get(r3)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r5
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r5.frames
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        La2:
            if (r10 >= r9) goto Ld7
            java.lang.Object r12 = r8.get(r10)
            org.fortheloss.sticknodes.data.IFrameData r12 = (org.fortheloss.sticknodes.data.IFrameData) r12
            java.util.ArrayList r13 = r12.getDrawableFigures()
            int r14 = r13.size()
            int r14 = r14 - r7
        Lb3:
            if (r14 < 0) goto Lcf
            java.lang.Object r15 = r13.get(r14)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r15 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r15
            boolean r4 = r15 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 != 0) goto Lc0
            goto Lcc
        Lc0:
            int r4 = r15.getLibraryID()
            if (r4 != r1) goto Lcc
            org.fortheloss.sticknodes.sprite.SpriteRef r15 = (org.fortheloss.sticknodes.sprite.SpriteRef) r15
            r0.deleteSpriteRef(r15, r12, r5)
            r11 = 1
        Lcc:
            int r14 = r14 + (-1)
            goto Lb3
        Lcf:
            if (r11 == 0) goto Ld4
            r5.recalculateAllNextFrameStickfigureIndicesForTweening()
        Ld4:
            int r10 = r10 + 1
            goto La2
        Ld7:
            int r3 = r3 + (-1)
            goto L92
        Lda:
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getScreen()
            if (r2 != r6) goto L126
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r0._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r2.getMCMovieclipSourceBeingEdited()
            if (r2 == 0) goto L126
            int r3 = r2.getLibraryID()
            if (r3 >= 0) goto L126
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r2.frames
            int r4 = r3.size()
            r5 = 0
        Lf7:
            if (r5 >= r4) goto L126
            java.lang.Object r6 = r3.get(r5)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            java.util.ArrayList r8 = r6.getDrawableFigures()
            int r9 = r8.size()
            int r9 = r9 - r7
        L108:
            if (r9 < 0) goto L123
            java.lang.Object r10 = r8.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            boolean r11 = r10 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r11 != 0) goto L115
            goto L120
        L115:
            int r11 = r10.getLibraryID()
            if (r11 != r1) goto L120
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = (org.fortheloss.sticknodes.sprite.SpriteRef) r10
            r0.deleteSpriteRef(r10, r6, r2)
        L120:
            int r9 = r9 + (-1)
            goto L108
        L123:
            int r5 = r5 + 1
            goto Lf7
        L126:
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r2.librarySprites
            r3 = 0
            java.lang.Object r4 = r2.get(r1)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r4 != 0) goto L174
            int r4 = r2.size()
            int r4 = r4 - r7
        L138:
            if (r4 < 0) goto L174
            java.lang.Object r5 = r2.get(r4)
            boolean r5 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r5 == 0) goto L171
            java.lang.Object r5 = r2.get(r4)
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r5 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r5
            java.util.ArrayList r6 = r5.getStates()
            int r8 = r6.size()
            int r8 = r8 - r7
        L151:
            if (r8 < 0) goto L171
            java.lang.Object r9 = r6.get(r8)
            org.fortheloss.sticknodes.sprite.SpriteSource r9 = (org.fortheloss.sticknodes.sprite.SpriteSource) r9
            int r9 = r9.getLibraryId()
            if (r9 != r1) goto L16e
            r5.removeState(r8)
            int r6 = r5.getNumStates()
            if (r6 > 0) goto L16a
            r3 = r5
            goto L171
        L16a:
            r0.reduceSpriteGroupStateIndex(r5, r8)
            goto L171
        L16e:
            int r8 = r8 + (-1)
            goto L151
        L171:
            int r4 = r4 + (-1)
            goto L138
        L174:
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r2.librarySprites
            int r2 = r2.size()
            int r2 = r2 - r7
        L17d:
            if (r2 < 0) goto L197
            if (r2 > r1) goto L182
            goto L197
        L182:
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r4 = r4.librarySprites
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r4 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r4
            int r5 = r4.getLibraryId()
            int r5 = r5 - r7
            r4.setLibraryId(r5)
            int r2 = r2 + (-1)
            goto L17d
        L197:
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r2.librarySprites
            java.lang.Object r2 = r2.remove(r1)
            org.fortheloss.sticknodes.sprite.ISpriteSource r2 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r2
            r2.dispose()
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            r4 = 0
            r2.hideSpriteInImportList(r1, r4)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            java.util.ArrayList<java.lang.Integer> r2 = r2.hiddenSpriteLibraryIDs
            int r2 = r2.size()
            int r2 = r2 - r7
        L1b3:
            if (r2 < 0) goto L1d5
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectData
            java.util.ArrayList<java.lang.Integer> r4 = r4.hiddenSpriteLibraryIDs
            java.lang.Object r4 = r4.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= r1) goto L1d2
            org.fortheloss.sticknodes.data.ProjectData r5 = r0._projectData
            java.util.ArrayList<java.lang.Integer> r5 = r5.hiddenSpriteLibraryIDs
            int r4 = r4 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.set(r2, r4)
        L1d2:
            int r2 = r2 + (-1)
            goto L1b3
        L1d5:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            r1.clearAnimateUndoRedo()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            r1.clearCopiedFigures()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            r1.clearCopiedFrames()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.flagOnionSkinDirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.flagTracingFBODirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            r1.setNeedsToBeDrawn()
            r16.updateSpriteLibraryList()
            if (r3 == 0) goto L204
            int r1 = r3.getLibraryId()
            r0.deleteSpriteFromProject(r1)
        L204:
            return
    }

    public void deleteSpriteRef(org.fortheloss.sticknodes.sprite.SpriteRef r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r1.getFramesContainer()
            r2.deleteSpriteRef(r3, r0, r1)
            return
    }

    public void deleteSpriteRef(org.fortheloss.sticknodes.sprite.SpriteRef r4, org.fortheloss.sticknodes.data.IFrameData r5, org.fortheloss.sticknodes.animationscreen.FramesContainer r6) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = r5.getFigurePosition(r4)
            r1 = -1
            if (r0 != r1) goto Lb
            return
        Lb:
            r3.setSessionSelectionToNothing()
            byte r0 = r4.isLockedToCamera()
            if (r0 == 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            int r1 = r4.getID()
            r2 = r5
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            r0.removeFigureFromCameraLock(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r1 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r0 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionData
            r1.addUserAction(r0)
        L2f:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteDeleteAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteDeleteAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteDeleteAction) r0
            r0.initialize(r4, r5, r6)
            org.fortheloss.sticknodes.data.SessionData r6 = r3._sessionData
            r6.addUserAction(r0)
            r5.deleteFigure(r4)
            boolean r5 = r4.isJoined()
            if (r5 == 0) goto L4d
            r4.unjoin()
        L4d:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModule
            r4.setNeedsToBeDrawn()
            return
    }

    public void deleteStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r4, org.fortheloss.sticknodes.data.IFrameData r5, org.fortheloss.sticknodes.animationscreen.FramesContainer r6, boolean r7) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = r5.getFigurePosition(r4)
            r1 = -1
            if (r0 != r1) goto Lb
            return
        Lb:
            r3.setSessionSelectionToNothing()
            byte r0 = r4.isLockedToCamera()
            if (r0 == 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            int r1 = r4.getID()
            r2 = r5
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            r0.removeFigureFromCameraLock(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r1 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r0 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionData
            r1.addUserAction(r0)
        L2f:
            boolean r0 = r4.hasJoinAnchorNode()
            if (r0 != 0) goto L36
            r7 = 0
        L36:
            if (r7 != 0) goto L60
            org.fortheloss.sticknodes.data.SessionData r7 = r3._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction> r0 = org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction.class
            java.lang.Object r7 = r7.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction r7 = (org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction) r7
            r7.initialize(r4, r5, r6)
            org.fortheloss.sticknodes.data.SessionData r6 = r3._sessionData
            r6.addUserAction(r7)
            r5.deleteFigure(r4)
            boolean r5 = r4.isJoined()
            if (r5 == 0) goto L56
            r4.unjoin()
        L56:
            boolean r5 = r4.hasJoinAnchorNode()
            if (r5 == 0) goto Lcb
            r4.removeAllJoinedFigures()
            goto Lcb
        L60:
            org.fortheloss.sticknodes.data.SessionData r7 = r3._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsDeleteAction> r0 = org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsDeleteAction.class
            java.lang.Object r7 = r7.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsDeleteAction r7 = (org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsDeleteAction) r7
            r7.initialize(r4, r5, r6)
            org.fortheloss.sticknodes.data.SessionData r6 = r3._sessionData
            r6.addUserAction(r7)
            java.util.Stack r6 = new java.util.Stack
            r6.<init>()
            r6.add(r4)
        L7a:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto Lcb
            java.lang.Object r4 = r6.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            r5.deleteFigure(r4)
            boolean r7 = r4.isJoined()
            if (r7 == 0) goto L92
            r4.unjoin()
        L92:
            boolean r7 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto L7a
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            boolean r7 = r4.hasJoinAnchorNode()
            if (r7 == 0) goto L7a
            java.util.ArrayList r4 = r4.getJoinAnchorNodes()
            int r7 = r4.size()
            int r7 = r7 + (-1)
        La8:
            if (r7 < 0) goto L7a
            java.lang.Object r0 = r4.get(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            java.util.ArrayList r0 = r0.getJoinedFigures()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Lba:
            if (r1 < 0) goto Lc8
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r6.add(r2)
            int r1 = r1 + (-1)
            goto Lba
        Lc8:
            int r7 = r7 + (-1)
            goto La8
        Lcb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionData
            int r4 = r4.getScreen()
            r5 = 2
            if (r4 != r5) goto Leb
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            boolean r4 = r4.isTracingFrame()
            if (r4 == 0) goto Leb
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            r4.flagTracingFBODirty()
        Leb:
            return
    }

    public void deleteStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r1.getFramesContainer()
            r2.deleteStickfigure(r3, r0, r1, r4)
            return
    }

    public void deleteStickfigureFiles(java.lang.String[] r2, org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteStickfigureDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PermaDeleteStickfigureDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void deleteStickfigureFromProject(int r15) {
            r14 = this;
            if (r15 > 0) goto L3
            return
        L3:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lib_id_"
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "removed_stickfigure_from_project"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L25:
            r4 = 1
            if (r3 >= r1) goto L91
            java.lang.Object r5 = r0.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5
            java.util.ArrayList r6 = r5.getDrawableFigures()
            int r7 = r6.size()
            int r7 = r7 - r4
        L37:
            if (r7 < 0) goto L60
            java.lang.Object r8 = r6.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            boolean r9 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r9 != 0) goto L44
            goto L5d
        L44:
            int r9 = r8.getLibraryID()
            if (r9 != r15) goto L52
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r8
            org.fortheloss.sticknodes.data.ProjectData r9 = r14._projectData
            r14.deleteStickfigure(r8, r5, r9, r2)
            goto L5d
        L52:
            int r9 = r8.getLibraryID()
            if (r9 <= r15) goto L5d
            int r9 = r9 + (-1)
            r8.setLibraryID(r9)
        L5d:
            int r7 = r7 + (-1)
            goto L37
        L60:
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = r5.getFrameCamera()
            java.util.ArrayList r5 = r5.getLockedStickfigureBundles()
            if (r5 == 0) goto L8e
            int r6 = r5.size()
            int r6 = r6 - r4
        L71:
            if (r6 < 0) goto L8e
            java.lang.Object r4 = r5.get(r6)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r4
            int r7 = r4.getFigureType()
            if (r7 == 0) goto L80
            goto L8b
        L80:
            int r7 = r4.getLibraryID()
            if (r7 <= r15) goto L8b
            int r7 = r7 + (-1)
            r4.setLibraryID(r7)
        L8b:
            int r6 = r6 + (-1)
            goto L71
        L8e:
            int r3 = r3 + 1
            goto L25
        L91:
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            int r1 = r0.size()
            int r1 = r1 - r4
        L9a:
            if (r1 < 0) goto Lee
            java.lang.Object r3 = r0.get(r1)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r3.frames
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        Laa:
            if (r7 >= r6) goto Leb
            java.lang.Object r9 = r5.get(r7)
            org.fortheloss.sticknodes.data.IFrameData r9 = (org.fortheloss.sticknodes.data.IFrameData) r9
            java.util.ArrayList r10 = r9.getDrawableFigures()
            int r11 = r10.size()
            int r11 = r11 - r4
        Lbb:
            if (r11 < 0) goto Le3
            java.lang.Object r12 = r10.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            boolean r13 = r12 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r13 != 0) goto Lc8
            goto Le0
        Lc8:
            int r13 = r12.getLibraryID()
            if (r13 != r15) goto Ld5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r12
            r14.deleteStickfigure(r12, r9, r3, r2)
            r8 = 1
            goto Le0
        Ld5:
            int r13 = r12.getLibraryID()
            if (r13 <= r15) goto Le0
            int r13 = r13 + (-1)
            r12.setLibraryID(r13)
        Le0:
            int r11 = r11 + (-1)
            goto Lbb
        Le3:
            if (r8 == 0) goto Le8
            r3.recalculateAllNextFrameStickfigureIndicesForTweening()
        Le8:
            int r7 = r7 + 1
            goto Laa
        Leb:
            int r1 = r1 + (-1)
            goto L9a
        Lee:
            org.fortheloss.sticknodes.data.SessionData r0 = r14._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L147
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r14._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            if (r0 == 0) goto L147
            int r1 = r0.getLibraryID()
            if (r1 >= 0) goto L147
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r0.frames
            int r3 = r1.size()
            r5 = 0
        L10c:
            if (r5 >= r3) goto L147
            java.lang.Object r6 = r1.get(r5)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            java.util.ArrayList r7 = r6.getDrawableFigures()
            int r8 = r7.size()
            int r8 = r8 - r4
        L11d:
            if (r8 < 0) goto L144
            java.lang.Object r9 = r7.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r10 != 0) goto L12a
            goto L141
        L12a:
            int r10 = r9.getLibraryID()
            if (r10 != r15) goto L136
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r9
            r14.deleteStickfigure(r9, r6, r0, r2)
            goto L141
        L136:
            int r10 = r9.getLibraryID()
            if (r10 <= r15) goto L141
            int r10 = r10 + (-1)
            r9.setLibraryID(r10)
        L141:
            int r8 = r8 + (-1)
            goto L11d
        L144:
            int r5 = r5 + 1
            goto L10c
        L147:
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            int r0 = r0.size()
            int r0 = r0 - r4
        L150:
            if (r0 < 0) goto L16a
            if (r0 > r15) goto L155
            goto L16a
        L155:
            org.fortheloss.sticknodes.data.ProjectData r1 = r14._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r1.libraryStickfigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            int r3 = r1.getLibraryID()
            int r3 = r3 - r4
            r1.setLibraryID(r3)
            int r0 = r0 + (-1)
            goto L150
        L16a:
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            java.lang.Object r0 = r0.remove(r15)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r0.dispose()
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectData
            r0.hideStickfigureInImportList(r15, r2)
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectData
            java.util.ArrayList<java.lang.Integer> r0 = r0.hiddenStickfigureLibraryIDs
            int r0 = r0.size()
            int r0 = r0 - r4
        L185:
            if (r0 < 0) goto L1a7
            org.fortheloss.sticknodes.data.ProjectData r1 = r14._projectData
            java.util.ArrayList<java.lang.Integer> r1 = r1.hiddenStickfigureLibraryIDs
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= r15) goto L1a4
            org.fortheloss.sticknodes.data.ProjectData r2 = r14._projectData
            java.util.ArrayList<java.lang.Integer> r2 = r2.hiddenStickfigureLibraryIDs
            int r1 = r1 + (-1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.set(r0, r1)
        L1a4:
            int r0 = r0 + (-1)
            goto L185
        L1a7:
            org.fortheloss.sticknodes.data.SessionData r15 = r14._sessionData
            r15.clearAnimateUndoRedo()
            org.fortheloss.sticknodes.data.SessionData r15 = r14._sessionData
            r15.clearCopiedFigures()
            org.fortheloss.sticknodes.data.SessionData r15 = r14._sessionData
            r15.clearCopiedFrames()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r15 = r14._canvasModule
            r15.flagOnionSkinDirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r15 = r14._canvasModule
            r15.flagTracingFBODirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r15 = r14._canvasModule
            r15.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r15 = r14._framesModule
            r15.setNeedsToBeDrawn()
            r14.updateStickfigureLibraryList()
            return
    }

    public void deleteTextfield(org.fortheloss.sticknodes.TextfieldBox r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            int r1 = r0.getTextfieldPosition(r5)
            r2 = -1
            if (r1 != r2) goto L13
            return
        L13:
            r4.setSessionSelectionToNothing()
            boolean r2 = r5.isLockedToCamera()
            if (r2 == 0) goto L34
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r4._framesModule
            int r3 = r5.getID()
            r2.removeTextfieldFromCameraLock(r3)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r3 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r2 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r2
            org.fortheloss.sticknodes.data.SessionData r3 = r4._sessionData
            r3.addUserAction(r2)
        L34:
            r0.deleteTextfield(r5)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxDeleteAction> r3 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxDeleteAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxDeleteAction r2 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxDeleteAction) r2
            r2.initialize(r5, r1, r0)
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionData
            r5.addUserAction(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModule
            r5.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.framework.AppScreen, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            org.fortheloss.sticknodes.movieclip.MCCache.disposeCache()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r3._fboBuffer
            r1 = 0
            if (r0 == 0) goto Ld
            r0.dispose()
            r3._fboBuffer = r1
        Ld:
            r3._fboCamera = r1
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectData
            if (r0 == 0) goto L18
            r0.dispose()
            r3._projectData = r1
        L18:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            if (r0 == 0) goto L21
            r0.dispose()
            r3._sessionData = r1
        L21:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r3._activeDialogs
            if (r0 == 0) goto L3d
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L2b:
            if (r0 < 0) goto L3b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r3._activeDialogs
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L2b
        L3b:
            r3._activeDialogs = r1
        L3d:
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r0 = r3._nodeDrawTools
            if (r0 == 0) goto L46
            r0.dispose()
            r3._nodeDrawTools = r1
        L46:
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0 = r3._frameContextMenu
            if (r0 == 0) goto L4f
            r0.dispose()
            r3._frameContextMenu = r1
        L4f:
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r3._viewOptionsMenu
            if (r0 == 0) goto L58
            r0.dispose()
            r3._viewOptionsMenu = r1
        L58:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r0 = r3._threadedGifExportLooper
            if (r0 == 0) goto L61
            r0.dispose()
            r3._threadedGifExportLooper = r1
        L61:
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r0 = r3._threadedMP4ExportLooper
            if (r0 == 0) goto L6a
            r0.dispose()
            r3._threadedMP4ExportLooper = r1
        L6a:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r3._shapeRenderer
            if (r0 == 0) goto L73
            r0.dispose()
            r3._shapeRenderer = r1
        L73:
            r3._tiledBackground = r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r3._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef
            if (r0 == 0) goto L7e
            r0.dispose()
            r3._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef = r1
        L7e:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            if (r0 == 0) goto L87
            r0.dispose()
            r3._framesModule = r1
        L87:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            if (r0 == 0) goto L90
            r0.dispose()
            r3._animateToolsModule = r1
        L90:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            if (r0 == 0) goto L99
            r0.dispose()
            r3._createToolsModule = r1
        L99:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            if (r0 == 0) goto La2
            r0.dispose()
            r3._movieclipToolsModule = r1
        La2:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            if (r0 == 0) goto Lab
            r0.dispose()
            r3._canvasModule = r1
        Lab:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3._groupModules
            if (r0 == 0) goto Lb4
            r0.clear()
            r3._groupModules = r1
        Lb4:
            r3._nextFrameFigureIndices = r1
            r3._thisFrameFigureIndices = r1
            r3._nextFrameTextfieldIndices = r1
            r3._frameBeforePlayingRef = r1
            r3._frameToRestoreAnimatedDuringDelayMCsRef = r1
            r3._exportProgressDialogRef = r1
            r3._exitDialogRef = r1
            r3._isOpeningDialogRef = r1
            r3._projectDataToOpenRef = r1
            r3._filenameJustFinishedExporting = r1
            org.fortheloss.sticknodes.animationscreen.EasterEgg r0 = r3._easterEgg
            if (r0 == 0) goto Ld1
            r0.dispose()
            r3._easterEgg = r1
        Ld1:
            r3._fboEffectScaleStartEnd = r1
            r3._fboEffectAlphaStartEnd = r1
            r3._fboEffectInterpolation = r1
            org.fortheloss.sticknodes.animationscreen.TooltipManager r0 = r3._tooltipManager
            if (r0 == 0) goto Le0
            r0.dispose()
            r3._tooltipManager = r1
        Le0:
            org.fortheloss.sticknodes.animationscreen.ZoomButtons r0 = r3._zoomButtons
            if (r0 == 0) goto Le9
            r0.dispose()
            r3._zoomButtons = r1
        Le9:
            org.fortheloss.sticknodes.Screenshotter r0 = r3._screenshotter
            if (r0 == 0) goto Lf2
            r0.dispose()
            r3._screenshotter = r1
        Lf2:
            org.fortheloss.sticknodes.StickfigureDominantColorFinder r0 = r3._DEBUGstickfigureDominantColorFinder
            if (r0 == 0) goto Lfb
            r0.dispose()
            r3._DEBUGstickfigureDominantColorFinder = r1
        Lfb:
            r3._debugBackgroundColorPresets = r1
            org.fortheloss.sticknodes.animationscreen.modules.Module.disposeStyles()
            r3._fullscreenListener = r1
            r3._playbackRepeatManager = r1
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r3._popupText
            if (r0 == 0) goto L10d
            r0.dispose()
            r3._popupText = r1
        L10d:
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void draw() {
            r18 = this;
            r0 = r18
            super.draw()
            int r1 = r0._screenState
            r2 = 1
            if (r1 != r2) goto Lf
            r18.renderLoadingTexture()
            goto L1c0
        Lf:
            if (r1 != 0) goto L1c0
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r3 = 0
            r1.glClearColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r3 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r3)
            boolean r1 = r0._isRendering
            if (r1 != 0) goto L23
            return
        L23:
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.getBatch()
            com.badlogic.gdx.graphics.g2d.SpriteBatch r1 = (com.badlogic.gdx.graphics.g2d.SpriteBatch) r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fboBuffer
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            r4 = r3
            com.badlogic.gdx.graphics.Texture r4 = (com.badlogic.gdx.graphics.Texture) r4
            int r3 = r4.getWidth()
            int r5 = r4.getHeight()
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r0._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r9 = r6.getViewport()
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            int r7 = r9.getScreenX()
            int r8 = r9.getScreenY()
            int r10 = r9.getScreenWidth()
            int r11 = r9.getScreenHeight()
            r6.glViewport(r7, r8, r10, r11)
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r0._stageRef
            com.badlogic.gdx.graphics.Camera r6 = r6.getCamera()
            com.badlogic.gdx.math.Matrix4 r6 = r6.combined
            r1.setProjectionMatrix(r6)
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r0._shapeRenderer
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r0._stageRef
            com.badlogic.gdx.graphics.Camera r7 = r7.getCamera()
            com.badlogic.gdx.math.Matrix4 r7 = r7.combined
            r6.setProjectionMatrix(r7)
            com.badlogic.gdx.scenes.scene2d.Group r6 = r0._groupModules
            com.badlogic.gdx.utils.SnapshotArray r6 = r6.getChildren()
            r1.begin()
            int r7 = r6.size
            r10 = 0
            r8 = 0
        L7c:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r8 >= r7) goto L98
            java.lang.Object r12 = r6.get(r8)
            com.badlogic.gdx.scenes.scene2d.Actor r12 = (com.badlogic.gdx.scenes.scene2d.Actor) r12
            boolean r12 = r12.isVisible()
            if (r12 == 0) goto L95
            java.lang.Object r12 = r6.get(r8)
            com.badlogic.gdx.scenes.scene2d.Actor r12 = (com.badlogic.gdx.scenes.scene2d.Actor) r12
            r12.draw(r1, r11)
        L95:
            int r8 = r8 + 1
            goto L7c
        L98:
            r1.end()
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r6.glViewport(r10, r10, r3, r5)
            com.badlogic.gdx.graphics.OrthographicCamera r6 = r0._fboCamera
            com.badlogic.gdx.math.Matrix4 r6 = r6.combined
            r1.setProjectionMatrix(r6)
            r1.begin()
            boolean r6 = r0._isShowingEasterEgg
            if (r6 == 0) goto L11f
            org.fortheloss.sticknodes.animationscreen.EasterEgg r6 = r0._easterEgg
            float r17 = r6.getBuildup()
            r6 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 * r17
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r7
            double r7 = java.lang.Math.random()
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r7 = r7 * r6
            float r7 = r6 - r7
            double r12 = java.lang.Math.random()
            float r12 = (float) r12
            float r12 = r12 * r8
            float r12 = r12 * r6
            float r6 = r6 - r12
            org.fortheloss.sticknodes.animationscreen.EasterEgg r8 = r0._easterEgg
            com.badlogic.gdx.graphics.Color r8 = r8.getLerpedColor()
            r8.set(r11, r11, r11, r11)
            org.fortheloss.sticknodes.animationscreen.EasterEgg r12 = r0._easterEgg
            boolean r12 = r12.isShakingScreen()
            if (r12 == 0) goto Lf0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1056964608(0x3f000000, float:0.5)
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1065353216(0x3f800000, float:1.0)
            r12 = r8
            r12.lerp(r13, r14, r15, r16, r17)
        Lf0:
            r1.setColor(r8)
            r1.disableBlending()
            org.fortheloss.sticknodes.animationscreen.EasterEgg r8 = r0._easterEgg
            boolean r8 = r8.isShakingScreen()
            if (r8 == 0) goto L10b
            float r8 = (float) r5
            float r6 = r6 + r8
            float r8 = (float) r3
            int r3 = -r5
            float r12 = (float) r3
            r3 = r1
            r5 = r7
            r7 = r8
            r8 = r12
            r3.draw(r4, r5, r6, r7, r8)
            goto L118
        L10b:
            r6 = 0
            float r7 = (float) r5
            float r8 = (float) r3
            int r3 = -r5
            float r12 = (float) r3
            r3 = r1
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r12
            r3.draw(r4, r5, r6, r7, r8)
        L118:
            r1.enableBlending()
            r1.setColor(r11, r11, r11, r11)
            goto L17c
        L11f:
            boolean r6 = r0._fboEffectActive
            if (r6 != 0) goto L14d
            r1.disableBlending()
            boolean r6 = r0._isExportingGIF
            if (r6 != 0) goto L136
            boolean r6 = r0._isExportingMP4
            if (r6 != 0) goto L136
            boolean r6 = r0._isExportingPNG
            if (r6 != 0) goto L136
            r1.setColor(r11, r11, r11, r11)
            goto L13c
        L136:
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r1.setColor(r6, r6, r6, r11)
        L13c:
            r6 = 0
            float r7 = (float) r5
            float r8 = (float) r3
            int r3 = -r5
            float r12 = (float) r3
            r3 = r1
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r12
            r3.draw(r4, r5, r6, r7, r8)
            r1.enableBlending()
            goto L17c
        L14d:
            float r3 = (float) r3
            float r6 = r0._fboEffectScale
            float r7 = r3 * r6
            float r5 = (float) r5
            float r6 = r6 * r5
            r1.enableBlending()
            float r8 = r0._fboEffectAlpha
            r1.setColor(r8, r8, r8, r8)
            r12 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r2, r12)
            float r3 = r7 - r3
            float r3 = -r3
            r8 = 1056964608(0x3f000000, float:0.5)
            float r13 = r3 * r8
            float r3 = r6 - r5
            float r3 = r3 * r8
            float r8 = r5 + r3
            float r14 = -r6
            r3 = r1
            r5 = r13
            r6 = r8
            r8 = r14
            r3.draw(r4, r5, r6, r7, r8)
            r3 = 770(0x302, float:1.079E-42)
            r1.setBlendFunction(r3, r12)
        L17c:
            r1.end()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            int r4 = r9.getScreenX()
            int r5 = r9.getScreenY()
            int r6 = r9.getScreenWidth()
            int r7 = r9.getScreenHeight()
            r3.glViewport(r4, r5, r6, r7)
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r0._stageRef
            com.badlogic.gdx.graphics.Camera r3 = r3.getCamera()
            com.badlogic.gdx.math.Matrix4 r3 = r3.combined
            r1.setProjectionMatrix(r3)
            com.badlogic.gdx.scenes.scene2d.Group r3 = r0._groupModules
            r3.setVisible(r10)
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r0._stageRef
            r3.draw()
            com.badlogic.gdx.scenes.scene2d.Group r3 = r0._groupModules
            r3.setVisible(r2)
            org.fortheloss.sticknodes.animationscreen.EasterEgg r2 = r0._easterEgg
            if (r2 == 0) goto L1c0
            r1.begin()
            r1.setColor(r11, r11, r11, r11)
            org.fortheloss.sticknodes.animationscreen.EasterEgg r2 = r0._easterEgg
            r2.draw(r1)
            r1.end()
        L1c0:
            return
    }

    public void enableStickfigureBackup(boolean r1) {
            r0 = this;
            r0._backupCreationStickfigureEnabled = r1
            r1 = 0
            r0._backupCreationStickfigureTimer = r1
            return
    }

    public org.fortheloss.framework.Assets getAssets() {
            r1 = this;
            org.fortheloss.framework.Assets r0 = r1._assetsRef
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.NodeDrawTools getNodeDrawTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r0 = r1._nodeDrawTools
            return r0
    }

    public org.fortheloss.sticknodes.data.ProjectData getProjectData() {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            return r0
    }

    public com.badlogic.gdx.graphics.glutils.FrameBuffer getScreenFBO() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r1._fboBuffer
            return r0
    }

    public org.fortheloss.sticknodes.data.SessionData getSessionData() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            return r0
    }

    public org.fortheloss.sticknodes.SNShapeRenderer getShapeRenderer() {
            r1 = this;
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r1._shapeRenderer
            return r0
    }

    public boolean hasActiveDialogs() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r1._activeDialogs
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean hasDialogs() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r1._activeDialogs
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

    public void importMovieclip(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6) {
            r5 = this;
            java.lang.String r0 = r6.getName()
            r1 = 1
            r2 = 1
        L6:
            org.fortheloss.sticknodes.data.ProjectData r3 = r5._projectData
            boolean r3 = r3.addMovieclipToLibrary(r6)
            if (r3 != 0) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r6.setName(r3)
            int r2 = r2 + r1
            goto L6
        L2c:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r5._animateToolsModule
            r6.mcImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r5._animateToolsModule
            r6.selectLastImportedMC()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r5._animateToolsModule
            r6.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r5._animateToolsModule
            r6.selectLastImportedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r5._movieclipToolsModule
            r6.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r5._movieclipToolsModule
            r6.selectLastImportedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r5._animateToolsModule
            r6.spriteImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r5._animateToolsModule
            r6.selectLastImportedSprite()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r5._movieclipToolsModule
            r6.spriteImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r5._movieclipToolsModule
            r6.selectLastImportedSprite()
            return
    }

    public boolean importPivotStickfigure(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            boolean r2 = r0.importPivotStickfigure(r2)
            if (r2 == 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.selectLastImportedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.selectLastImportedStickfigure()
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public int importSound(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            int r2 = r0.importSound(r2)
            r0 = 1
            if (r2 != r0) goto L12
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            r1.setSessionSelectionToFrameData(r0)
        L12:
            return r2
    }

    public boolean importStickfigure(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.importStickfigure(r2, r0)
            return r2
    }

    public boolean importStickfigure(com.badlogic.gdx.files.FileHandle r2, java.lang.String r3) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            boolean r2 = r0.importStickfigure(r2, r3)
            if (r2 == 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.selectLastImportedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.selectLastImportedStickfigure()
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public boolean importStickfigureOld(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectData
            boolean r2 = r0.importStickfigureOld(r2)
            if (r2 == 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModule
            r2.selectLastImportedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModule
            r2.selectLastImportedStickfigure()
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // org.fortheloss.framework.AppScreen
    public void initialize() {
            r16 = this;
            r0 = r16
            r1 = 1
            r0._flagLoadLoadingTexture = r1
            super.initialize()
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            java.lang.String r3 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r2 = r2.getPreferences(r3)
            r3 = 0
            r0._willShowProAd = r3
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            boolean r4 = r4.isPro()
            r5 = 5
            if (r4 != 0) goto L2f
            boolean r4 = r0._isFirstAnimationScreenSinceAppStart
            if (r4 == 0) goto L2f
            java.lang.String r4 = "count"
            int r2 = r2.getInteger(r4, r1)
            r4 = 10
            if (r2 < r4) goto L2f
            int r2 = r2 % r5
            if (r2 != 0) goto L2f
            r0._willShowProAd = r1
        L2f:
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r2 == r4) goto L3b
            goto L4ea
        L3b:
            r2 = 74
            com.badlogic.gdx.graphics.Color[] r2 = new com.badlogic.gdx.graphics.Color[r2]
            r0._debugBackgroundColorPresets = r2
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r6 = 1059168674(0x3f21a1a2, float:0.6313726)
            r7 = 1063839977(0x3f68e8e9, float:0.9098039)
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r7, r8, r8)
            r2[r3] = r4
            com.badlogic.gdx.graphics.Color[] r2 = r0._debugBackgroundColorPresets
            r3 = 2
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r6 = 1041272977(0x3e109091, float:0.14117648)
            r9 = 1053740751(0x3ecececf, float:0.40392157)
            r10 = 1062655703(0x3f56d6d7, float:0.8392157)
            r4.<init>(r6, r9, r10, r8)
            r2[r1] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 3
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r6 = 1060023983(0x3f2eaeaf, float:0.68235296)
            r9 = 1061339843(0x3f42c2c3, float:0.7607843)
            r4.<init>(r6, r8, r9, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 4
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r6 = 1061010878(0x3f3dbdbe, float:0.7411765)
            r11 = 1064826872(0x3f77f7f8, float:0.96862745)
            r4.<init>(r8, r11, r6, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r4 = 1063379426(0x3f61e1e2, float:0.88235295)
            r6 = 1064168942(0x3f6dedee, float:0.92941177)
            r2.<init>(r6, r4, r8, r8)
            r1[r3] = r2
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 6
            com.badlogic.gdx.graphics.Color r3 = new com.badlogic.gdx.graphics.Color
            r4 = 1062984668(0x3f5bdbdc, float:0.85882354)
            r12 = 1061800394(0x3f49c9ca, float:0.7882353)
            r3.<init>(r12, r8, r4, r8)
            r1[r5] = r3
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 7
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1062721496(0x3f57d7d8, float:0.84313726)
            r13 = 1063774184(0x3f67e7e8, float:0.90588236)
            r4.<init>(r13, r5, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 8
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1060550327(0x3f36b6b7, float:0.7137255)
            r4.<init>(r8, r10, r5, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 9
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064892665(0x3f78f8f9, float:0.972549)
            r4.<init>(r8, r10, r5, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 10
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064761079(0x3f76f6f7, float:0.9647059)
            r14 = 1061734601(0x3f48c8c9, float:0.78431374)
            r4.<init>(r8, r5, r14, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 11
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1065155837(0x3f7cfcfd, float:0.9882353)
            r14 = 1062984668(0x3f5bdbdc, float:0.85882354)
            r4.<init>(r5, r8, r14, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 12
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1058905502(0x3f1d9d9e, float:0.6156863)
            r14 = 1055582955(0x3eeaeaeb, float:0.45882353)
            r4.<init>(r8, r5, r14, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 13
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1063905770(0x3f69e9ea, float:0.9137255)
            r14 = 1061668808(0x3f47c7c8, float:0.78039217)
            r4.<init>(r14, r5, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 14
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064234735(0x3f6eeeef, float:0.93333334)
            r15 = 1064629493(0x3f74f4f5, float:0.95686275)
            r4.<init>(r15, r12, r5, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 15
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1057984400(0x3f0f8f90, float:0.56078434)
            r6 = 1060155569(0x3f30b0b1, float:0.6901961)
            r4.<init>(r8, r5, r6, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 16
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1055846127(0x3eeeeeef, float:0.46666667)
            r6 = 1051109031(0x3ea6a6a7, float:0.3254902)
            r4.<init>(r15, r5, r6, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 17
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1061931980(0x3f4bcbcc, float:0.79607844)
            r6 = 1060418741(0x3f34b4b5, float:0.7058824)
            r4.<init>(r5, r6, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 18
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1056997505(0x3f008081, float:0.5019608)
            r10 = 1060221362(0x3f31b1b2, float:0.69411767)
            r4.<init>(r5, r10, r13, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 19
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064234735(0x3f6eeeef, float:0.93333334)
            r10 = 1064432114(0x3f71f1f2, float:0.94509804)
            r4.<init>(r5, r8, r10, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 20
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1062524117(0x3f54d4d5, float:0.83137256)
            r15 = 1063247840(0x3f5fdfe0, float:0.8745098)
            r4.<init>(r13, r5, r15, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 21
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1062918875(0x3f5adadb, float:0.85490197)
            r4.<init>(r8, r7, r5, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 22
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1062195152(0x3f4fcfd0, float:0.8117647)
            r4.<init>(r7, r13, r5, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 23
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1053609165(0x3ecccccd, float:0.4)
            r15 = 1061208257(0x3f40c0c1, float:0.7529412)
            r4.<init>(r7, r15, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 24
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1040220289(0x3e008081, float:0.1254902)
            r15 = 1053477579(0x3ecacacb, float:0.39607844)
            r4.<init>(r7, r15, r10, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 25
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1054135509(0x3ed4d4d5, float:0.41568628)
            r13 = 1059102881(0x3f20a0a1, float:0.627451)
            r4.<init>(r8, r7, r13, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 26
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1050056343(0x3e969697, float:0.29411766)
            r4.<init>(r10, r15, r7, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 27
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1063182047(0x3f5ededf, float:0.87058824)
            r13 = 1060879292(0x3f3bbbbc, float:0.73333335)
            r4.<init>(r7, r8, r13, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 28
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1050714273(0x3ea0a0a1, float:0.3137255)
            r13 = 1049003655(0x3e868687, float:0.2627451)
            r10 = 1063116254(0x3f5dddde, float:0.8666667)
            r4.<init>(r7, r10, r13, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 29
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1060089776(0x3f2fafb0, float:0.6862745)
            r13 = 1057852814(0x3f0d8d8e, float:0.5529412)
            r4.<init>(r8, r7, r13, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 30
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1062260945(0x3f50d0d1, float:0.8156863)
            r13 = 1059037088(0x3f1f9fa0, float:0.62352943)
            r4.<init>(r7, r13, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 31
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1062787289(0x3f58d8d9, float:0.84705883)
            r4.<init>(r7, r8, r5, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 32
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1060352948(0x3f33b3b4, float:0.7019608)
            r13 = 1064037356(0x3f6bebec, float:0.92156863)
            r4.<init>(r7, r13, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 33
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1062129359(0x3f4ececf, float:0.80784315)
            r4.<init>(r7, r8, r12, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 34
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1057129091(0x3f028283, float:0.50980395)
            r13 = 1062195152(0x3f4fcfd0, float:0.8117647)
            r4.<init>(r7, r13, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 35
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1059826604(0x3f2babac, float:0.67058825)
            r13 = 1061405636(0x3f43c3c4, float:0.7647059)
            r4.<init>(r7, r8, r13, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 36
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1050582687(0x3e9e9e9f, float:0.30980393)
            r4.<init>(r7, r14, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 37
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1062721496(0x3f57d7d8, float:0.84313726)
            r13 = 1062260945(0x3f50d0d1, float:0.8156863)
            r4.<init>(r7, r13, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 38
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1059563432(0x3f27a7a8, float:0.654902)
            r13 = 1065287423(0x3f7efeff, float:0.99607843)
            r4.<init>(r7, r13, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 39
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1062458324(0x3f53d3d4, float:0.827451)
            r4.<init>(r8, r7, r9, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 40
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1063511012(0x3f63e3e4, float:0.8901961)
            r4.<init>(r8, r7, r11, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 41
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1058773916(0x3f1b9b9c, float:0.60784316)
            r9 = 1063971563(0x3f6aeaeb, float:0.91764706)
            r4.<init>(r8, r7, r9, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 42
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1058379158(0x3f159596, float:0.58431375)
            r9 = 1055714541(0x3eececed, float:0.4627451)
            r11 = 1064695286(0x3f75f5f6, float:0.9607843)
            r4.<init>(r11, r7, r9, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 43
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1053345993(0x3ec8c8c9, float:0.39215687)
            r9 = 1060681913(0x3f38b8b9, float:0.72156864)
            r4.<init>(r7, r9, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 44
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1057721228(0x3f0b8b8c, float:0.54509807)
            r4.<init>(r5, r11, r7, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 45
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r4.<init>(r6, r11, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 46
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1058708123(0x3f1a9a9b, float:0.6039216)
            r4.<init>(r5, r15, r11, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 47
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1054793439(0x3edededf, float:0.43529412)
            r7 = 1054793439(0x3edededf, float:0.43529412)
            r4.<init>(r8, r5, r7, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 48
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1057063298(0x3f018182, float:0.5058824)
            r7 = 1061537222(0x3f45c5c6, float:0.77254903)
            r4.<init>(r7, r5, r11, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 49
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1056109299(0x3ef2f2f3, float:0.4745098)
            r9 = 1062392531(0x3f52d2d3, float:0.8235294)
            r4.<init>(r8, r9, r5, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 50
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1057392263(0x3f068687, float:0.5254902)
            r11 = 1063247840(0x3f5fdfe0, float:0.8745098)
            r4.<init>(r5, r8, r11, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 51
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064892665(0x3f78f8f9, float:0.972549)
            r11 = 1065155837(0x3f7cfcfd, float:0.9882353)
            r4.<init>(r5, r11, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 52
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1061076671(0x3f3ebebf, float:0.74509805)
            r11 = 1060747706(0x3f39b9ba, float:0.7254902)
            r13 = 1062326738(0x3f51d1d2, float:0.81960785)
            r4.<init>(r5, r11, r13, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 53
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1046273245(0x3e5cdcdd, float:0.21568628)
            r11 = 1064300528(0x3f6feff0, float:0.9372549)
            r4.<init>(r5, r11, r8, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 54
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1049529999(0x3e8e8e8f, float:0.2784314)
            r11 = 1057589642(0x3f09898a, float:0.5372549)
            r4.<init>(r5, r11, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 55
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1060681913(0x3f38b8b9, float:0.72156864)
            r11 = 1055319783(0x3ee6e6e7, float:0.4509804)
            r4.<init>(r10, r5, r11, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 56
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064037356(0x3f6bebec, float:0.92156863)
            r11 = 1059300260(0x3f23a3a4, float:0.6392157)
            r4.<init>(r8, r5, r11, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 57
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1060945085(0x3f3cbcbd, float:0.7372549)
            r4.<init>(r5, r10, r6, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 58
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r6 = 1064629493(0x3f74f4f5, float:0.95686275)
            r4.<init>(r8, r6, r5, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 59
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1057918607(0x3f0e8e8f, float:0.5568628)
            r6 = 1054661853(0x3edcdcdd, float:0.43137255)
            r10 = 1063642598(0x3f65e5e6, float:0.8980392)
            r4.<init>(r10, r5, r6, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 60
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1062853082(0x3f59d9da, float:0.8509804)
            r4.<init>(r8, r5, r7, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 61
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1059102881(0x3f20a0a1, float:0.627451)
            r6 = 1059300260(0x3f23a3a4, float:0.6392157)
            r4.<init>(r5, r6, r10, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 62
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1057063298(0x3f018182, float:0.5058824)
            r6 = 1063774184(0x3f67e7e8, float:0.90588236)
            r4.<init>(r8, r5, r6, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 63
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1049398413(0x3e8c8c8d, float:0.27450982)
            r6 = 1059629225(0x3f28a8a9, float:0.65882355)
            r4.<init>(r5, r6, r10, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 64
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1045746901(0x3e54d4d5, float:0.20784314)
            r4.<init>(r5, r8, r9, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 65
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1061208257(0x3f40c0c1, float:0.7529412)
            r4.<init>(r5, r10, r7, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 66
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1045746901(0x3e54d4d5, float:0.20784314)
            r4.<init>(r5, r8, r9, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 67
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1061142464(0x3f3fbfc0, float:0.7490196)
            r6 = 1060879292(0x3f3bbbbc, float:0.73333335)
            r4.<init>(r5, r6, r10, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 68
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1057589642(0x3f09898a, float:0.5372549)
            r6 = 1058313365(0x3f149495, float:0.5803922)
            r4.<init>(r5, r6, r8, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 69
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1056372471(0x3ef6f6f7, float:0.48235294)
            r6 = 1062655703(0x3f56d6d7, float:0.8392157)
            r4.<init>(r10, r5, r6, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 70
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1061734601(0x3f48c8c9, float:0.78431374)
            r6 = 1060221362(0x3f31b1b2, float:0.69411767)
            r4.<init>(r8, r5, r6, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 71
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1064168942(0x3f6dedee, float:0.92941177)
            r4.<init>(r5, r5, r5, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r2 = 72
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1061274050(0x3f41c1c2, float:0.75686276)
            r6 = 1064432114(0x3f71f1f2, float:0.94509804)
            r4.<init>(r14, r5, r6, r8)
            r1[r3] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            r3 = 73
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r5 = 1062326738(0x3f51d1d2, float:0.81960785)
            r6 = 1064168942(0x3f6dedee, float:0.92941177)
            r4.<init>(r6, r12, r5, r8)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Color[] r1 = r0._debugBackgroundColorPresets
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>(r8, r8, r8, r8)
            r1[r3] = r2
        L4ea:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadAssets() {
            r15 = this;
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r0 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r1 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r3 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            super.loadAssets()
            com.badlogic.gdx.utils.viewport.ExtendViewport r4 = new com.badlogic.gdx.utils.viewport.ExtendViewport
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1159069696(0x45160000, float:2400.0)
            float r6 = r6 * r5
            r7 = 1152647168(0x44b40000, float:1440.0)
            float r5 = r5 * r7
            r4.<init>(r6, r5)
            com.badlogic.gdx.Graphics r5 = com.badlogic.gdx.Gdx.graphics
            int r5 = r5.getWidth()
            com.badlogic.gdx.Graphics r6 = com.badlogic.gdx.Gdx.graphics
            int r6 = r6.getHeight()
            r7 = 1
            r4.update(r5, r6, r7)
            r4.apply(r7)
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r15._stageRef
            r5.setViewport(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r15._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r4 = r4.getBatch()
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r15._stageRef
            com.badlogic.gdx.graphics.Camera r5 = r5.getCamera()
            com.badlogic.gdx.math.Matrix4 r5 = r5.combined
            r4.setProjectionMatrix(r5)
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "last_status_event"
            java.lang.String r6 = "AnimationScreen.loadAssets()"
            r4.setCrashlyticsKeyString(r5, r6)
            java.lang.System.gc()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L5a
            java.lang.String r4 = "SD/"
            goto L5c
        L5a:
            java.lang.String r4 = "HD/"
        L5c:
            com.badlogic.gdx.Application r5 = com.badlogic.gdx.Gdx.app
            java.lang.String r6 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r5 = r5.getPreferences(r6)
            java.lang.String r6 = "customSkinSetting"
            int r8 = r5.getInteger(r6, r7)
            java.lang.String r9 = "hasDisabledCustomSkin424"
            r10 = 0
            boolean r11 = r5.getBoolean(r9, r10)
            r12 = 3
            r13 = 2
            if (r11 != 0) goto L81
            r5.putBoolean(r9, r7)
            if (r8 != r12) goto L7e
            r5.putInteger(r6, r13)
            r8 = 2
        L7e:
            r5.flush()
        L81:
            if (r8 != r12) goto L1db
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.skinPath
            java.lang.String r9 = org.fortheloss.sticknodes.App.animationMenuPNG
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r4)
            r11.append(r9)
            java.lang.String r6 = r11.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L1db
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.skinPath
            java.lang.String r9 = org.fortheloss.sticknodes.App.animationMenuPNG2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r4)
            r11.append(r9)
            java.lang.String r6 = r11.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L1db
            org.fortheloss.sticknodes.App.isUsingCustomSkin = r7
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.skinPath
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            r5.load(r6, r2, r8, r7)
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas2
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.skinPath
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            r5.load(r6, r2, r8, r7)
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.skinPath
            java.lang.String r8 = org.fortheloss.sticknodes.App.animationMenuPNG3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L143
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.skinPath
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            r5.load(r6, r2, r8, r7)
            goto L14a
        L143:
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            r5.load(r6, r2, r7)
        L14a:
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.skinPath
            java.lang.String r8 = org.fortheloss.sticknodes.App.colorPickerPNG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L18a
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.colorPickerAtlas
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.skinPath
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            r5.load(r6, r2, r8, r7)
            goto L191
        L18a:
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.colorPickerAtlas
            r5.load(r6, r2, r7)
        L191:
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.skinPath
            java.lang.String r8 = org.fortheloss.sticknodes.App.exportingAnimationPNG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L1d2
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.skinPath
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r8.<init>(r4)
            r5.load(r6, r2, r8, r7)
            goto L280
        L1d2:
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            r4.load(r5, r2, r7)
            goto L280
        L1db:
            if (r8 != r13) goto L25b
            org.fortheloss.sticknodes.App.isUsingCustomSkin = r10
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.darkSkinFolder
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9, r7)
            r5.load(r6, r2, r8, r7)
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas2
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.darkSkinFolder
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9, r7)
            r5.load(r6, r2, r8, r7)
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.darkSkinFolder
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9, r7)
            r5.load(r6, r2, r8, r7)
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.colorPickerAtlas
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r8 = new org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter
            java.lang.String r9 = org.fortheloss.sticknodes.App.darkSkinFolder
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r8.<init>(r4, r7)
            r5.load(r6, r2, r8, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            r4.load(r5, r2, r7)
            goto L280
        L25b:
            org.fortheloss.sticknodes.App.isUsingCustomSkin = r10
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.animationMenuAtlas2
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.colorPickerAtlas
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            r4.load(r5, r2, r7)
        L280:
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.qrtAtlas
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.easterEggAtlas
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.drawToolsAtlas
            r4.load(r5, r2, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            r4.load(r5, r3, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r5 = "shaders/default.vert"
            r4.vertexFile = r5
            java.lang.String r6 = org.fortheloss.sticknodes.App.shaderArgbAndUnpremultiply
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            r8.load(r6, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r5
            java.lang.String r6 = org.fortheloss.sticknodes.App.shaderArgb
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            r8.load(r6, r3, r4, r10)
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            boolean r4 = r4.isPro()
            if (r4 == 0) goto L403
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r5
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderOutline
            r6.load(r8, r3, r4, r10)
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderAllColor
            r6.load(r8, r3, r4, r10)
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderInvertColor
            r6.load(r8, r3, r4, r10)
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderDropShadowNoBlur
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r6 = "shaders/blur.frag"
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.shaderHBlur
            r8.load(r9, r3, r4, r10)
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.shaderVBlur
            r8.load(r9, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r8 = "shaders/hBlur.vert"
            r4.vertexFile = r8
            java.lang.String r9 = "shaders/blur_invertColor.frag"
            r4.fragmentFile = r9
            org.fortheloss.framework.Assets r11 = r15._assetsRef
            java.lang.String r12 = org.fortheloss.sticknodes.App.shaderHBlurInvert
            r11.load(r12, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r8
            java.lang.String r11 = "shaders/blur_allColor.frag"
            r4.fragmentFile = r11
            org.fortheloss.framework.Assets r12 = r15._assetsRef
            java.lang.String r13 = org.fortheloss.sticknodes.App.shaderHBlurAll
            r12.load(r13, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r12 = "shaders/vBlur.vert"
            r4.vertexFile = r12
            r4.fragmentFile = r9
            org.fortheloss.framework.Assets r13 = r15._assetsRef
            java.lang.String r14 = org.fortheloss.sticknodes.App.shaderVBlurInvert
            r13.load(r14, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r12
            r4.fragmentFile = r11
            org.fortheloss.framework.Assets r13 = r15._assetsRef
            java.lang.String r14 = org.fortheloss.sticknodes.App.shaderVBlurAll
            r13.load(r14, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r8
            java.lang.String r8 = "shaders/dropShadow.frag"
            r4.fragmentFile = r8
            org.fortheloss.framework.Assets r13 = r15._assetsRef
            java.lang.String r14 = org.fortheloss.sticknodes.App.shaderDropShadowHBlur
            r13.load(r14, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r12
            r4.fragmentFile = r8
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            java.lang.String r12 = org.fortheloss.sticknodes.App.shaderDropShadowVBlur
            r8.load(r12, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderMotionBlur
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r6 = "shaders/motionBlur.vert"
            r4.vertexFile = r6
            r4.fragmentFile = r9
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.shaderMotionBlurInvert
            r8.load(r9, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r6
            r4.fragmentFile = r11
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderMotionBlurAll
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r6 = "shaders/blurOneDirection.frag"
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirection
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r6 = "shaders/motionBlurOneDirection.vert"
            r4.vertexFile = r6
            java.lang.String r8 = "shaders/blurOneDirection_invertColor.frag"
            r4.fragmentFile = r8
            org.fortheloss.framework.Assets r8 = r15._assetsRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionInvert
            r8.load(r9, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r6
            java.lang.String r6 = "shaders/blurOneDirection_allColor.frag"
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionAll
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r5
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderGaussianBlur
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r5
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderPixelate
            r6.load(r8, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            java.lang.String r6 = "shaders/glow.frag"
            r4.fragmentFile = r6
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderHGlow
            r6.load(r8, r3, r4, r10)
            org.fortheloss.framework.Assets r6 = r15._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.shaderVGlow
            r6.load(r8, r3, r4, r10)
        L403:
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter
            r4.<init>()
            r4.vertexFile = r5
            org.fortheloss.framework.Assets r5 = r15._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.shaderRemoveColor
            r5.load(r6, r3, r4, r10)
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r3 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter
            r3.<init>()
            com.badlogic.gdx.graphics.Texture$TextureFilter r4 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r3.minFilter = r4
            r3.magFilter = r4
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntDejavuSansCondensed
            r4.load(r5, r1, r3, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedBig
            r4.load(r5, r1, r3, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedInput
            r4.load(r5, r1, r3, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            r4.load(r5, r1, r3, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            r4.load(r5, r1, r3, r7)
            org.fortheloss.framework.Assets r4 = r15._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntWatermarkDejavuSansCondensed
            r4.load(r5, r1, r3, r10)
            boolean r1 = r15._willShowProAd
            if (r1 == 0) goto L474
            org.fortheloss.framework.Assets r1 = r15._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.proFiltersAtlas
            r1.load(r3, r2, r7)
            org.fortheloss.framework.Assets r1 = r15._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.proAdMP4Texture
            r1.load(r2, r0, r7)
            org.fortheloss.framework.Assets r1 = r15._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.proAdSoundsTexture
            r1.load(r2, r0, r7)
            org.fortheloss.framework.Assets r1 = r15._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.proStoreAmazonTexture
            r1.load(r2, r0, r7)
            org.fortheloss.framework.Assets r1 = r15._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.proStoreAppStoreTexture
            r1.load(r2, r0, r7)
            org.fortheloss.framework.Assets r1 = r15._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.proStoreGooglePlayTexture
            r1.load(r2, r0, r7)
        L474:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadingComplete() {
            r35 = this;
            r6 = r35
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r0 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r7 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.loadingComplete()
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r8 = r1.getPreferences(r2)
            java.lang.String r1 = "screenPaddingLeft"
            r9 = 0
            int r1 = r8.getInteger(r1, r9)
            r10 = 200(0xc8, float:2.8E-43)
            int r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r9, r10)
            java.lang.String r2 = "screenPaddingRight"
            int r2 = r8.getInteger(r2, r9)
            int r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r9, r10)
            int r2 = r2 + r1
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r6._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r3 = r3.getViewport()
            com.badlogic.gdx.Graphics r4 = com.badlogic.gdx.Gdx.graphics
            int r4 = r4.getWidth()
            int r4 = r4 - r2
            com.badlogic.gdx.Graphics r2 = com.badlogic.gdx.Gdx.graphics
            int r2 = r2.getHeight()
            r11 = 1
            r3.update(r4, r2, r11)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r6._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            r2.setScreenPosition(r1, r9)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r6._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            r1.apply(r11)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "last_status_event"
            java.lang.String r3 = "AnimationScreen.loadingComplete()"
            r1.setCrashlyticsKeyString(r2, r3)
            org.fortheloss.framework.Assets r1 = r6._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r3 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            java.lang.Object r1 = r1.get(r2, r3, r9)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r6._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            int r2 = r2.getScreenWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r6._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r3 = r3.getViewport()
            float r3 = r3.getWorldWidth()
            float r2 = r2 / r3
            r1.bind()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r12 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r12
            java.lang.String r4 = "u_spread"
            r1.setUniformf(r4, r3)
            java.lang.String r3 = "u_viewportScale"
            r1.setUniformf(r3, r2)
            org.fortheloss.framework.Assets r1 = r6._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            boolean r1 = r1.isLoaded(r2, r0, r11)
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto Lc2
            org.fortheloss.framework.Assets r1 = r6._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r0 = r1.get(r2, r0, r11)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r0.getData()
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setLineHeight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto Lbc
            r1 = 1070386381(0x3fcccccd, float:1.6)
            r0.setScale(r1)
            goto Lc2
        Lbc:
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0.setScale(r1)
        Lc2:
            java.lang.String r0 = "count"
            int r14 = r8.getInteger(r0, r11)
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            float r0 = r0.getPpiX()
            r1 = 1122369536(0x42e60000, float:115.0)
            float r0 = r0 / r1
            int r0 = java.lang.Math.round(r0)
            r15 = 5
            int r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r11, r15)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            long r2 = java.lang.System.currentTimeMillis()
            r1.setLastSaveMillis(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.String r2 = "unlimitedNodesEnabled"
            boolean r2 = r8.getBoolean(r2, r9)
            r1.setUnlimitedNodesEnabled(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.String r2 = "axisLockingEnabled"
            boolean r2 = r8.getBoolean(r2, r9)
            r1.setAxisLockingEnabled(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.String r2 = "quickMenuEnabled"
            boolean r2 = r8.getBoolean(r2, r11)
            r1.setQuickMenuEnabled(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.String r2 = "sensitivityNodeSelection"
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r8.getFloat(r2, r3)
            r1.setNodeSelectionSensitivity(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.String r2 = "sensitivityAxisLocking"
            float r2 = r8.getFloat(r2, r3)
            r1.setAxisLockingSensitivity(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.String r2 = "lineWidth"
            int r0 = r8.getInteger(r2, r0)
            r1.setOpenGLLineWidth(r0)
            java.lang.String r0 = "quickResizeToolsMode"
            r1 = -1
            int r2 = r8.getInteger(r0, r1)
            byte r2 = (byte) r2
            if (r2 != r1) goto L13d
            java.lang.String r2 = "quickResizeToolsEnabled"
            boolean r2 = r8.getBoolean(r2, r9)
            if (r2 == 0) goto L13b
            r2 = 2
            goto L13c
        L13b:
            r2 = 0
        L13c:
            byte r2 = (byte) r2
        L13d:
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionData
            r4.setShowQuickResizeTool(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "preserveSelectionWhenChangingFrames"
            boolean r4 = r8.getBoolean(r4, r9)
            r2.setPreserveSelectionWhenChangingFrames(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "androidKeepAppAlive"
            boolean r4 = r8.getBoolean(r4, r9)
            r2.setAndroidKeepAppAlive(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "neighborNodesAffectedByJoins"
            boolean r4 = r8.getBoolean(r4, r11)
            r2.setNeighborNodesAffectedByJoins(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "idPopupEnabled"
            boolean r4 = r8.getBoolean(r4, r11)
            r2.setShowIdPopup(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "showZoomButtons"
            boolean r4 = r8.getBoolean(r4, r9)
            r2.setShowZoomButtons(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "movieclipDoubleTapEnabled"
            boolean r4 = r8.getBoolean(r4, r9)
            r2.setDoubleTapForMovieclipsEnabled(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "nerdModeEnabled"
            boolean r4 = r8.getBoolean(r4, r9)
            r2.setNerdModeEnabled(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            java.lang.String r4 = "riggerModeEnabled"
            boolean r4 = r8.getBoolean(r4, r9)
            r2.setRiggerModeEnabled(r4)
            java.lang.String r2 = "leftHandModeEnabled"
            boolean r2 = r8.getBoolean(r2, r9)
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionData
            r4.setLeftHandMode(r2)
            java.lang.String r4 = "enableStickfigureBackup"
            boolean r4 = r8.getBoolean(r4, r11)
            r6._backupCreationStickfigureEnabled = r4
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionData
            boolean r4 = r4.getUnlimitedNodesIsEnabled()
            org.fortheloss.sticknodes.App.setUnlimitedNodesPerFrame(r4)
            java.lang.String r4 = "incrementButtonsVisibleInitially"
            boolean r4 = r8.getBoolean(r4, r9)
            org.fortheloss.framework.LabelInputIncrementField.BUTTONS_VISIBLE_INITIALLY = r4
            org.fortheloss.framework.Assets r4 = r6._assetsRef
            org.fortheloss.sticknodes.animationscreen.modules.Module.createStyles(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r10 = 4
            r4.<init>(r10)
            r6._activeDialogs = r4
            com.badlogic.gdx.scenes.scene2d.Group r4 = new com.badlogic.gdx.scenes.scene2d.Group
            r4.<init>()
            r6._groupModules = r4
            r4.setTransform(r9)
            com.badlogic.gdx.scenes.scene2d.Group r4 = r6._groupModules
            com.badlogic.gdx.scenes.scene2d.Touchable r10 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r10)
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r10 = r6._groupModules
            r4.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r6._stageRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$7 r10 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$7
            r10.<init>(r6)
            r4.addListener(r10)
            org.fortheloss.sticknodes.SNShapeRenderer r4 = new org.fortheloss.sticknodes.SNShapeRenderer
            r10 = 32000(0x7d00, float:4.4842E-41)
            r4.<init>(r10)
            r6._shapeRenderer = r4
            java.lang.String r4 = "nodeSkinType"
            int r4 = r8.getInteger(r4, r11)
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r10 = new org.fortheloss.sticknodes.animationscreen.NodeDrawTools
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRenderer
            com.badlogic.gdx.scenes.scene2d.Stage r12 = r6._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r12 = r12.getBatch()
            r10.<init>(r3, r12, r4)
            r6._nodeDrawTools = r10
            java.lang.String r3 = "openCountSince412"
            int r3 = r8.getInteger(r3, r9)
            r10 = 10
            if (r3 != r10) goto L232
            org.fortheloss.framework.IPlatform r12 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "node_style_"
            r10.append(r13)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            double r5 = (double) r4
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
            java.lang.String r5 = "node_style"
            r12.analyticsSendValue(r10, r5, r4)
        L232:
            int r3 = r3 + r11
            java.lang.String r4 = "openCountSince412"
            r8.putInteger(r4, r3)
            r8.flush()
            java.lang.String r3 = "hasSetVibrationDefault"
            boolean r3 = r8.getBoolean(r3, r9)
            if (r3 != 0) goto L269
            if (r14 >= r15) goto L247
            r3 = 1
            goto L248
        L247:
            r3 = 0
        L248:
            java.lang.String r4 = "hasSetVibrationDefault"
            r8.putBoolean(r4, r11)
            java.lang.String r4 = "vibrationAllButtons"
            r8.putBoolean(r4, r9)
            java.lang.String r4 = "vibrationQrtButtons"
            r8.putBoolean(r4, r3)
            java.lang.String r4 = "vibrationLongPress"
            r8.putBoolean(r4, r11)
            java.lang.String r4 = "vibrationProcessCompletion"
            r8.putBoolean(r4, r3)
            java.lang.String r3 = "vibrationIntensity"
            r8.putInteger(r3, r9)
            r8.flush()
        L269:
            java.lang.String r3 = "vibrationAllButtons"
            boolean r3 = r8.getBoolean(r3, r9)
            java.lang.String r4 = "vibrationQrtButtons"
            boolean r4 = r8.getBoolean(r4, r9)
            java.lang.String r5 = "vibrationLongPress"
            boolean r5 = r8.getBoolean(r5, r9)
            java.lang.String r6 = "vibrationProcessCompletion"
            boolean r6 = r8.getBoolean(r6, r9)
            java.lang.String r10 = "vibrationIntensity"
            int r10 = r8.getInteger(r10, r9)
            org.fortheloss.sticknodes.App.setVibrationEnabled(r3, r4, r5, r6, r10)
            java.lang.String r3 = "openCountSince417"
            int r3 = r8.getInteger(r3, r9)
            java.lang.String r4 = "off"
            r5 = 20
            if (r3 != r5) goto L2ec
            java.lang.String r6 = "nerdModeEnabled"
            boolean r6 = r8.getBoolean(r6, r9)
            java.lang.String r10 = "preserveSelectionWhenChangingFrames"
            boolean r10 = r8.getBoolean(r10, r9)
            org.fortheloss.framework.IPlatform r12 = org.fortheloss.sticknodes.App.platform
            if (r6 == 0) goto L2ab
            java.lang.String r19 = "on"
            r13 = r19
            goto L2ac
        L2ab:
            r13 = r4
        L2ac:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "nerd_mode_"
            r15.append(r1)
            r15.append(r13)
            java.lang.String r1 = r15.toString()
            double r5 = (double) r6
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.String r6 = "nerd_mode"
            r12.analyticsSendValue(r1, r6, r5)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            if (r10 == 0) goto L2ce
            java.lang.String r5 = "on"
            goto L2cf
        L2ce:
            r5 = r4
        L2cf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "preserve_sel_"
            r6.append(r12)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = r14
            double r13 = (double) r10
            java.lang.Double r10 = java.lang.Double.valueOf(r13)
            java.lang.String r13 = "preserve_selection"
            r1.analyticsSendValue(r5, r13, r10)
            goto L2ed
        L2ec:
            r6 = r14
        L2ed:
            int r3 = r3 + r11
            java.lang.String r1 = "openCountSince417"
            r8.putInteger(r1, r3)
            r8.flush()
            java.lang.String r1 = "openCountSince424"
            int r1 = r8.getInteger(r1, r9)
            r3 = 20
            if (r1 != r3) goto L32f
            r3 = -1
            int r0 = r8.getInteger(r0, r3)
            byte r0 = (byte) r0
            if (r0 != r11) goto L30c
            java.lang.String r4 = "legacy"
            r5 = 2
            goto L311
        L30c:
            r5 = 2
            if (r0 != r5) goto L311
            java.lang.String r4 = "docked"
        L311:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "resize_tools_"
            r10.append(r12)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            double r14 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r14)
            java.lang.String r10 = "resize_tools"
            r3.analyticsSendValue(r4, r10, r0)
            goto L330
        L32f:
            r5 = 2
        L330:
            int r1 = r1 + r11
            java.lang.String r0 = "openCountSince424"
            r8.putInteger(r0, r1)
            r8.flush()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            r10 = r35
            r10._thisFrameFigureIndices = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r10._nextFrameFigureIndices = r0
            r0 = 15
            int[] r0 = new int[r0]
            r10._nextFrameTextfieldIndices = r0
            com.badlogic.gdx.graphics.Pixmap$Format r21 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.Exception -> L36c
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics     // Catch: java.lang.Exception -> L36c
            int r22 = r0.getWidth()     // Catch: java.lang.Exception -> L36c
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics     // Catch: java.lang.Exception -> L36c
            int r23 = r0.getHeight()     // Catch: java.lang.Exception -> L36c
            r24 = 0
            r25 = 0
            r26 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Exception -> L36c
            r10._fboBuffer = r0     // Catch: java.lang.Exception -> L36c
            goto L386
        L36c:
            com.badlogic.gdx.graphics.Pixmap$Format r21 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r22 = r0.getWidth()
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r23 = r0.getHeight()
            r24 = 0
            r25 = 0
            r26 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r21, r22, r23, r24, r25, r26)
            r10._fboBuffer = r0
        L386:
            com.badlogic.gdx.graphics.OrthographicCamera r0 = new com.badlogic.gdx.graphics.OrthographicCamera
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            int r1 = r1.getWidth()
            float r1 = (float) r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r10._fboBuffer
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r0.<init>(r1, r3)
            r10._fboCamera = r0
            com.badlogic.gdx.math.Vector3 r0 = r0.position
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            int r1 = r1.getWidth()
            float r1 = (float) r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r10._fboBuffer
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r3
            r12 = 0
            r0.set(r1, r4, r12)
            com.badlogic.gdx.graphics.OrthographicCamera r0 = r10._fboCamera
            r0.update()
            r10._fboEffectActive = r11
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            r10._fboEffectTimer = r0
            r0 = 1061158912(0x3f400000, float:0.75)
            r10._fboEffectSeconds = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r1 = 1082130432(0x40800000, float:4.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r3)
            r10._fboEffectScaleStartEnd = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>(r12, r3)
            r10._fboEffectAlphaStartEnd = r0
            com.badlogic.gdx.math.Vector2 r1 = r10._fboEffectScaleStartEnd
            float r1 = r1.x
            r10._fboEffectScale = r1
            float r0 = r0.x
            r10._fboEffectAlpha = r0
            com.badlogic.gdx.math.Interpolation$ExpOut r0 = com.badlogic.gdx.math.Interpolation.exp10Out
            r10._fboEffectInterpolation = r0
            org.fortheloss.sticknodes.animationscreen.TiledBackground r0 = new org.fortheloss.sticknodes.animationscreen.TiledBackground
            r0.<init>()
            r10._tiledBackground = r0
            org.fortheloss.framework.Assets r1 = r10._assetsRef
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r10._stageRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r10._fboBuffer
            r0.renderOnto(r1, r3, r4)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r13 = 0
            r0.<init>(r13)
            r10._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            r0.<init>(r10, r1)
            r10._animateToolsModule = r0
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            r0.<init>(r10, r1)
            r10._createToolsModule = r0
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            r0.<init>(r10, r1)
            r10._movieclipToolsModule = r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            r0.<init>(r10, r1)
            r10._framesModule = r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = new org.fortheloss.sticknodes.animationscreen.modules.CanvasModule
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r10._fboBuffer
            r0.<init>(r10, r1)
            r10._canvasModule = r0
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r10._animateToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r10._framesModule
            r1.setReferences(r0, r3)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r10._createToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            r0.setReferences(r1)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r10._movieclipToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r10._framesModule
            r0.setReferences(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r10._animateToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r10._createToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r10._movieclipToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r14 = r10._framesModule
            r0.setReferences(r1, r3, r4, r14)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r10._framesModule
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r10._animateToolsModule
            r0.setReferences(r1, r3)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r10._groupModules
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            r0.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r10._groupModules
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r10._animateToolsModule
            r0.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r10._groupModules
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r10._createToolsModule
            r0.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r10._groupModules
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r10._movieclipToolsModule
            r0.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r10._groupModules
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r10._framesModule
            r0.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            org.fortheloss.framework.Assets r1 = r10._assetsRef
            r0.initialize(r1)
            if (r2 != 0) goto L488
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            r0.setPosition(r12, r12)
            goto L49a
        L488:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10._stageRef
            float r1 = r1.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r10._animateToolsModule
            float r3 = r3.getWidth()
            float r1 = r1 - r3
            r0.setPosition(r1, r12)
        L49a:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r10._stageRef
            float r0 = r0.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r10._animateToolsModule
            float r1 = r1.getWidth()
            float r0 = r0 - r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r3
            float r0 = r0 - r1
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r10._createToolsModule
            org.fortheloss.framework.Assets r4 = r10._assetsRef
            r1.initialize(r4, r0)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r10._createToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r10._animateToolsModule
            float r4 = r4.getX()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r14 = r10._animateToolsModule
            float r14 = r14.getY()
            r1.setPosition(r4, r14)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r10._movieclipToolsModule
            org.fortheloss.framework.Assets r4 = r10._assetsRef
            r1.initialize(r4)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r10._movieclipToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r10._animateToolsModule
            float r4 = r4.getX()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r14 = r10._animateToolsModule
            float r14 = r14.getY()
            r1.setPosition(r4, r14)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r10._animateToolsModule
            float r1 = r1.getWidth()
            float r1 = r1 + r12
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r1 = r1 + r4
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r10._framesModule
            org.fortheloss.sticknodes.data.ProjectData r14 = r10._projectData
            org.fortheloss.framework.Assets r15 = r10._assetsRef
            r4.initialize(r14, r15, r1, r0)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r10._framesModule
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r10._stageRef
            float r4 = r4.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r14 = r10._framesModule
            float r14 = r14.getHeight()
            float r4 = r4 - r14
            r0.setPosition(r1, r4)
            if (r2 != 0) goto L525
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r10._framesModule
            float r1 = r1.getX()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r10._framesModule
            float r2 = r2.getY()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r2 = r2 - r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r10._canvasModule
            float r3 = r3.getHeight()
            float r2 = r2 - r3
            r0.setPosition(r1, r2)
            goto L54e
        L525:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r10._animateToolsModule
            float r1 = r1.getX()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            float r1 = r1 - r2
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r10._canvasModule
            float r2 = r2.getWidth()
            float r1 = r1 - r2
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r10._framesModule
            float r2 = r2.getY()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r2 = r2 - r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r10._canvasModule
            float r3 = r3.getHeight()
            float r2 = r2 - r3
            r0.setPosition(r1, r2)
        L54e:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            org.fortheloss.framework.Assets r1 = r10._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            r0.setScreen(r11)
            r10.setToAnimateScreen(r9, r9)
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 != 0) goto L572
            java.lang.String r0 = "noExternalStorageTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "noExternalStorageInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
        L572:
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10._stageRef
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r10._shapeRenderer
            com.badlogic.gdx.graphics.g2d.Batch r3 = r1.getBatch()
            org.fortheloss.framework.Assets r4 = r10._assetsRef
            org.fortheloss.sticknodes.movieclip.MCCache.generateCache(r0, r1, r2, r3, r4)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            int[][] r0 = r0.getSavedCacheLibraryIDs()
            if (r0 == 0) goto L59b
            int r1 = r0.length
            r2 = 0
        L58b:
            if (r2 >= r1) goto L59b
            r3 = r0[r2]
            r3 = r3[r9]
            r4 = r0[r2]
            r4 = r4[r11]
            org.fortheloss.sticknodes.movieclip.MCCache.addToCache(r3, r4)
            int r2 = r2 + 1
            goto L58b
        L59b:
            r10._isRendering = r11
            boolean r0 = org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.DEMON_SHOWN
            if (r0 != 0) goto L5b3
            org.fortheloss.sticknodes.App r0 = r10._appRef
            int r0 = r0.getOutsideOpenRequest()
            if (r0 == 0) goto L5b3
            org.fortheloss.sticknodes.App r0 = r10._appRef
            int r0 = r0.getOutsideOpenRequest()
            if (r0 == r11) goto L5b3
            r0 = 1
            goto L5b4
        L5b3:
            r0 = 0
        L5b4:
            org.fortheloss.sticknodes.data.ProjectData r1 = r10._projectData
            java.lang.String r1 = r1.projectName
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6e1
            double r1 = java.lang.Math.random()
            r3 = 4643985272004935680(0x4072c00000000000, double:300.0)
            double r1 = r1 * r3
            int r1 = (int) r1
            if (r0 == 0) goto L5d2
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L5d2
            r0 = 1
            goto L5d3
        L5d2:
            r0 = 0
        L5d3:
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = "stickfigures/_Stickfigure.nodes"
            com.badlogic.gdx.files.FileHandle r1 = r1.internal(r2)
            boolean r1 = r10.importStickfigure(r1)
            if (r1 == 0) goto L6cd
            boolean r1 = org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.DEMON_SHOWN
            if (r1 == 0) goto L627
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.DEMON_SHOWN = r9
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = "config/git_values.xls"
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r1)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            r1.<init>()
            org.fortheloss.sticknodes.data.ProjectData r2 = r10._projectData
            boolean r0 = r1.open(r0, r2, r11)
            if (r0 == 0) goto L6cd
            r1.recalculateAllNextFrameStickfigureIndicesForTweening()
            r10.importMovieclip(r1)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r9)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.movieclip.MCReference r2 = new org.fortheloss.sticknodes.movieclip.MCReference
            r2.<init>(r1, r0, r9)
            r10.addMC(r2, r11, r9, r9)
            r10._isShowingEasterEgg = r9
            r10._isRendering = r9
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$8 r1 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$8
            r1.<init>(r10)
            r0.<init>(r1)
            r0.start()
            goto L6cd
        L627:
            org.fortheloss.sticknodes.App r1 = r10._appRef
            int r1 = r1.getOutsideOpenRequest()
            if (r1 == 0) goto L6cd
            org.fortheloss.sticknodes.App r1 = r10._appRef
            int r1 = r1.getOutsideOpenRequest()
            if (r1 == r11) goto L6cd
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r2 = r10._projectData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r2.getLibraryStickfigure(r9)
            r1.<init>(r2)
            r10.addStickfigure(r1, r11, r9)
            if (r0 == 0) goto L6cd
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = "config/git_keys.xls"
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            r2.<init>()
            org.fortheloss.sticknodes.data.ProjectData r3 = r10._projectData
            boolean r0 = r2.open(r0, r3, r11)
            if (r0 == 0) goto L6cd
            r2.recalculateAllNextFrameStickfigureIndicesForTweening()
            r10.importMovieclip(r2)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r9)
            r14 = r0
            org.fortheloss.sticknodes.data.FrameData r14 = (org.fortheloss.sticknodes.data.FrameData) r14
            r0 = 5
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r0)
            r15 = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r15 = (org.fortheloss.sticknodes.stickfigure.StickNode) r15
            org.fortheloss.sticknodes.movieclip.MCReference r4 = new org.fortheloss.sticknodes.movieclip.MCReference
            r4.<init>(r2, r14, r9)
            org.fortheloss.sticknodes.movieclip.MCReference r3 = new org.fortheloss.sticknodes.movieclip.MCReference
            r3.<init>(r2, r14, r9)
            r3.setCurrentFrameIndex(r11)
            r10.addMC(r4, r11, r9, r9)
            r2 = 0
            r16 = 1
            r19 = 0
            r21 = 0
            r0 = r35
            r1 = r3
            r13 = r3
            r3 = r16
            r9 = r4
            r4 = r19
            r5 = r21
            r0.addMC(r1, r2, r3, r4, r5)
            r9.joinTo(r15)
            r14.onFigureJoined(r9, r15)
            r0 = 1059313418(0x3f23d70a, float:0.64)
            r9.setScale(r0)
            r9.setFigureRotation(r12)
            r9.setLocked(r11)
            r13.joinTo(r15)
            r14.onFigureJoined(r13, r15)
            r13.setScale(r0)
            r13.setFigureRotation(r12)
            r13.setLocked(r11)
            r0 = 0
            r10._isShowingEasterEgg = r0
            r10._isRendering = r0
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$9 r1 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$9
            r1.<init>(r10)
            r0.<init>(r1)
            r0.start()
        L6cd:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r10._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDefaultStageBGColor()
            r1.<init>(r2)
            r0.setBackgroundColor(r1)
        L6e1:
            r35.setSessionSelectionToNothing()
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            boolean r0 = r0.getIsShowingIdPopup()
            if (r0 == 0) goto L6ef
            r35.addPopupText()
        L6ef:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            boolean r0 = r0.getQuickMenuIsEnabled()
            if (r0 == 0) goto L6fc
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            r0.showQuickMenu()
        L6fc:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r35.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            int r0 = r0.getScreenWidth()
            float r0 = (float) r0
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            java.lang.String r1 = "precisionIsApproximate"
            boolean r2 = r8.contains(r1)
            if (r2 == 0) goto L727
            boolean r1 = r8.getBoolean(r1)
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionData
            float r2 = r2.getNodeSelectionSensitivity()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.setTouchPrecision(r1, r2, r0)
            goto L74c
        L727:
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            boolean r2 = r2.isChromebook()
            if (r2 == 0) goto L73d
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionData
            float r2 = r2.getNodeSelectionSensitivity()
            r3 = 0
            org.fortheloss.sticknodes.stickfigure.Stickfigure.setTouchPrecision(r3, r2, r0)
            r8.putBoolean(r1, r3)
            goto L749
        L73d:
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionData
            float r2 = r2.getNodeSelectionSensitivity()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.setTouchPrecision(r11, r2, r0)
            r8.putBoolean(r1, r11)
        L749:
            r8.flush()
        L74c:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 == r1) goto L76b
            boolean r0 = org.fortheloss.sticknodes.stickfigure.Stickfigure.isUsingApproximateTouch()
            if (r0 != 0) goto L76b
            java.lang.String r0 = "preciseTouchesWarningTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "preciseTouchesWarningInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
        L76b:
            r0 = 0
            org.fortheloss.sticknodes.App.STORAGE_LIMITED = r0
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            long r0 = r0.getFreeStorageSpace()
            r2 = -1
            r4 = 0
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 < 0) goto L7a8
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            long r2 = r0 / r2
            r0 = 100
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L7a8
            java.lang.String r0 = "storageSpaceTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            int r4 = (int) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r1[r5] = r4
            java.lang.String r4 = "storageSpaceInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r4, r1)
            r10.showErrorDialog(r0, r1)
            r0 = 40
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L7a8
            org.fortheloss.sticknodes.App.STORAGE_LIMITED = r11
        L7a8:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "session_remaining_storage_mbs"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r1 = org.fortheloss.sticknodes.App.STORAGE_LIMITED
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "session_sprite_storage_is_limited"
            r0.setCrashlyticsKeyString(r2, r1)
            java.lang.String r0 = "savePromptMinutes"
            r1 = 5
            int r0 = r8.getInteger(r0, r1)
            r10.setSavePromptSeconds(r0)
            java.lang.String r0 = "changelogShown"
            boolean r1 = r8.contains(r0)
            r2 = 425(0x1a9, float:5.96E-43)
            if (r1 == 0) goto L7e3
            int r1 = r8.getInteger(r0)
            if (r1 == r2) goto L7e1
            r8.putInteger(r0, r2)
            r8.flush()
            goto L7e9
        L7e1:
            r0 = 0
            goto L7ea
        L7e3:
            r8.putInteger(r0, r2)
            r8.flush()
        L7e9:
            r0 = 1
        L7ea:
            org.fortheloss.sticknodes.data.ProjectData r1 = r10._projectData
            java.util.ArrayList<java.lang.String> r1 = r1.soundsNotFound
            java.lang.String r2 = "\n\n"
            if (r1 == 0) goto L888
            int r1 = r1.size()
            if (r1 <= 0) goto L888
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L879
            java.lang.String r1 = "soundsErrorInfo1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            org.fortheloss.sticknodes.data.ProjectData r3 = r10._projectData
            java.util.ArrayList<java.lang.String> r3 = r3.soundsNotFound
            int r3 = r3.size()
            r4 = 10
            int r3 = java.lang.Math.min(r4, r3)
            r4 = 0
        L824:
            if (r4 >= r3) goto L857
            org.fortheloss.sticknodes.data.ProjectData r5 = r10._projectData
            java.util.ArrayList<java.lang.String> r5 = r5.soundsNotFound
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r5)
            java.lang.String r1 = r9.toString()
            int r5 = r3 + (-1)
            if (r4 == r5) goto L854
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = ", "
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L854:
            int r4 = r4 + 1
            goto L824
        L857:
            java.lang.String r3 = "soundsErrorInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            java.lang.String r3 = "soundsErrorTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r10.showErrorDialog(r3, r1)
            goto L888
        L879:
            java.lang.String r1 = "soundsRemovedTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r3 = "soundsRemovedInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r10.showErrorDialog(r1, r3)
        L888:
            org.fortheloss.sticknodes.data.ProjectData r1 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r10._framesModule
            r3.checkAndShowFrameCountWarning(r1, r11)
            org.fortheloss.sticknodes.data.SessionData r1 = r10._sessionData
            boolean r1 = r1.getIsShowingZoomButtons()
            r10.showZoomButtons(r1)
            boolean r1 = r10._isFirstAnimationScreenSinceAppStart
            if (r1 == 0) goto L95a
            java.lang.String r1 = "tooltipsCount"
            r3 = 0
            int r1 = r8.getInteger(r1, r3)
            r3 = 3
            if (r1 > r3) goto L95a
            int r1 = r1 + r11
            java.lang.String r3 = "tooltipsCount"
            r8.putInteger(r3, r1)
            r8.flush()
            org.fortheloss.sticknodes.animationscreen.TooltipManager r1 = new org.fortheloss.sticknodes.animationscreen.TooltipManager
            r1.<init>()
            r10._tooltipManager = r1
            r1.initialize()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10._stageRef
            org.fortheloss.sticknodes.animationscreen.TooltipManager r3 = r10._tooltipManager
            r1.addActor(r3)
            org.fortheloss.sticknodes.animationscreen.Tooltip r1 = new org.fortheloss.sticknodes.animationscreen.Tooltip
            org.fortheloss.sticknodes.data.SessionData r3 = r10._sessionData
            r1.<init>(r3)
            org.fortheloss.framework.Assets r3 = r10._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Object r3 = r3.get(r4, r7, r11)
            r29 = r3
            com.badlogic.gdx.graphics.g2d.TextureAtlas r29 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r29
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r10._framesModule
            float r3 = r3.getX()
            r4 = 1132920832(0x43870000, float:270.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            float r30 = r3 + r5
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r10._framesModule
            float r3 = r3.getY()
            r4 = 1114636288(0x42700000, float:60.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            float r31 = r3 + r5
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 == 0) goto L900
            java.lang.String r3 = "tooltipFrameToolsPro"
            goto L902
        L900:
            java.lang.String r3 = "tooltipFrameToolsFree"
        L902:
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r32 = r3
            r33 = 1
            r34 = 4
            r28 = r1
            r28.initialize(r29, r30, r31, r32, r33, r34)
            org.fortheloss.sticknodes.animationscreen.TooltipManager r3 = r10._tooltipManager
            r3.addTooltip(r1)
            org.fortheloss.sticknodes.animationscreen.Tooltip r1 = new org.fortheloss.sticknodes.animationscreen.Tooltip
            org.fortheloss.sticknodes.data.SessionData r3 = r10._sessionData
            r1.<init>(r3)
            org.fortheloss.framework.Assets r3 = r10._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Object r3 = r3.get(r4, r7, r11)
            r29 = r3
            com.badlogic.gdx.graphics.g2d.TextureAtlas r29 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r29
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r10._canvasModule
            float r3 = r3.getX()
            r4 = 1149616128(0x4485c000, float:1070.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            float r30 = r3 + r5
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r10._canvasModule
            float r3 = r3.getY()
            r4 = 1141309440(0x44070000, float:540.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            float r31 = r3 + r5
            java.lang.String r3 = "tooltipStickfigureTools"
            java.lang.String r32 = org.fortheloss.sticknodes.App.localize(r3)
            r33 = 0
            r34 = 1
            r28 = r1
            r28.initialize(r29, r30, r31, r32, r33, r34)
            org.fortheloss.sticknodes.animationscreen.TooltipManager r3 = r10._tooltipManager
            r3.addTooltip(r1)
        L95a:
            r35.checkOutsideOpenRequests()
            int r1 = org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag
            if (r1 != r11) goto L970
            java.lang.String r1 = "errorOpeningTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r3 = "errorOpeningInfo1"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r10.showErrorDialog(r1, r3)
        L970:
            int r1 = org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag
            r3 = 2
            if (r1 != r3) goto L984
            java.lang.String r1 = "errorOpeningTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r4 = "errorOpeningInfo2OOME"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r10.showErrorDialog(r1, r4)
        L984:
            r1 = 0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag = r1
            boolean r1 = r10._willShowProAd
            if (r1 == 0) goto L998
            org.fortheloss.sticknodes.animationscreen.dialogs.GetProDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.GetProDialog
            org.fortheloss.framework.Assets r4 = r10._assetsRef
            r1.<init>(r10, r4)
            r1.initialize()
            r10.addDialogToStage(r1)
        L998:
            boolean r1 = r10._isFirstAnimationScreenSinceAppStart
            if (r1 == 0) goto L9af
            int r14 = r6 % 9
            if (r14 != 0) goto L9af
            org.fortheloss.sticknodes.animationscreen.dialogs.BackupReminderDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.BackupReminderDialog
            org.fortheloss.framework.Assets r4 = r10._assetsRef
            r1.<init>(r10, r4)
            org.fortheloss.framework.Assets r4 = r10._assetsRef
            r1.initialize(r4)
            r10.addDialogToStage(r1)
        L9af:
            boolean r1 = r10._isFirstAnimationScreenSinceAppStart
            if (r1 == 0) goto La21
            int r14 = r6 % 8
            if (r14 != 0) goto La21
            java.lang.String r1 = "uninstallWarningMessage1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r4 = "uninstallWarningMessage2"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r4 = r4.getType()
            com.badlogic.gdx.Application$ApplicationType r5 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r4 != r5) goto L9f8
            java.lang.String r4 = "uninstallWarningMessage3"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            goto La10
        L9f8:
            java.lang.String r4 = "uninstallWarningMessage4"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
        La10:
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog
            r2.<init>(r10)
            java.lang.String r4 = "uninstallWarningTitle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r2.initialize(r4, r1)
            r10.addDialogToStage(r2)
        La21:
            if (r0 == 0) goto La26
            r35.showChangelog()
        La26:
            java.lang.String r0 = "validationNum"
            int r0 = r8.getInteger(r0, r6)
            double r1 = java.lang.Math.random()
            r4 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r1 = r1 * r4
            int r1 = (int) r1
            boolean r2 = org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.DEMON_SHOWN
            if (r2 != 0) goto La61
            boolean r2 = r10._isFirstAnimationScreenSinceAppStart
            if (r2 == 0) goto La61
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r10._activeDialogs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La61
            if (r6 < r0) goto La61
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto La61
            org.fortheloss.sticknodes.data.ProjectData r2 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r2 = r2.libraryMovieclips
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La61
            int r14 = r6 + 10
            java.lang.String r2 = "validationNum"
            r8.putInteger(r2, r14)
            r8.flush()
            r2 = 1
            goto La62
        La61:
            r2 = 0
        La62:
            java.io.PrintStream r4 = java.lang.System.out
            boolean r5 = r10._isFirstAnimationScreenSinceAppStart
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "[EE stats] Can show EE: "
            r9.append(r12)
            r9.append(r5)
            java.lang.String r5 = ", count >= countForEE: "
            r9.append(r5)
            r9.append(r6)
            java.lang.String r5 = " >=? "
            r9.append(r5)
            r9.append(r0)
            java.lang.String r0 = ", random needs to be 200: "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = "."
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r4.println(r0)
            if (r2 == 0) goto Lb8e
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            r1 = 0
            r0.setQuickMenuEnabled(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            r0.hideQuickMenu(r11)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r10._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            java.util.ArrayList r0 = r0.getDrawableFigures()
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r10.deleteStickfigure(r0, r1)
            org.fortheloss.sticknodes.animationscreen.TooltipManager r0 = r10._tooltipManager
            if (r0 == 0) goto Lac1
            r0.dispose()
            r0 = 0
            r10._tooltipManager = r0
        Lac1:
            org.fortheloss.framework.Assets r0 = r10._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.easterEggAtlas
            java.lang.Object r0 = r0.get(r1, r7, r11)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r0
            com.badlogic.gdx.utils.Array r0 = r0.getRegions()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lae0
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = "HD/atlases/NVYf374gTXtheshadowalkerX6tWYG1Sr7Q_warning.donotunleash"
            com.badlogic.gdx.files.FileHandle r1 = r1.internal(r2)
            goto Lae8
        Lae0:
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = "SD/atlases/NVYf374gTXtheshadowalkerX6tWYG1Sr7Q_warning.donotunleash"
            com.badlogic.gdx.files.FileHandle r1 = r1.internal(r2)
        Lae8:
            java.lang.String r1 = r1.readString()
            byte[] r1 = com.badlogic.gdx.utils.Base64Coder.decode(r1)
            com.badlogic.gdx.graphics.Texture r2 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.graphics.glutils.PixmapTextureData r4 = new com.badlogic.gdx.graphics.glutils.PixmapTextureData
            com.badlogic.gdx.graphics.Pixmap r5 = new com.badlogic.gdx.graphics.Pixmap
            int r9 = r1.length
            r12 = 0
            r5.<init>(r1, r12, r9)
            r1 = 0
            r4.<init>(r5, r1, r12, r11)
            r2.<init>(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r18 = new com.badlogic.gdx.graphics.g2d.TextureAtlas
            r18.<init>()
            int r1 = r0.size
            r4 = 0
        Lb0a:
            if (r4 >= r1) goto Lb30
            java.lang.Object r5 = r0.get(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r5
            java.lang.String r9 = r5.name
            int r26 = r5.getRegionX()
            int r27 = r5.getRegionY()
            int r28 = r5.getRegionWidth()
            int r29 = r5.getRegionHeight()
            r23 = r18
            r24 = r9
            r25 = r2
            r23.addRegion(r24, r25, r26, r27, r28, r29)
            int r4 = r4 + 1
            goto Lb0a
        Lb30:
            org.fortheloss.framework.Assets r0 = r10._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.easterEggAtlas
            boolean r0 = r0.isLoaded(r1, r7, r11)
            if (r0 == 0) goto Lb41
            org.fortheloss.framework.Assets r0 = r10._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.easterEggAtlas
            r0.unload(r1, r11)
        Lb41:
            org.fortheloss.sticknodes.animationscreen.EasterEgg r0 = new org.fortheloss.sticknodes.animationscreen.EasterEgg
            r0.<init>()
            r10._easterEgg = r0
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10._stageRef
            float r19 = r1.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10._stageRef
            float r20 = r1.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            float r21 = r1.getX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            float r22 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            float r23 = r1.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModule
            float r24 = r1.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r10._framesModule
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            com.badlogic.gdx.graphics.Color r25 = r1.getBackgroundColor()
            r17 = r0
            r17.initialize(r18, r19, r20, r21, r22, r23, r24, r25)
            r10._isShowingEasterEgg = r11
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            double r1 = (double) r6
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "easter_egg_shown"
            java.lang.String r4 = "num_times_app_opened"
            r0.analyticsSendValue(r2, r4, r1)
            goto Lb9f
        Lb8e:
            org.fortheloss.framework.Assets r0 = r10._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.easterEggAtlas
            boolean r0 = r0.isLoaded(r1, r7, r11)
            if (r0 == 0) goto Lb9f
            org.fortheloss.framework.Assets r0 = r10._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.easterEggAtlas
            r0.unload(r1, r11)
        Lb9f:
            java.lang.String r0 = "lagCullingEnabled"
            r1 = 0
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "lagOnionSkinEnabled"
            boolean r2 = r8.getBoolean(r2, r11)
            java.lang.String r4 = "lagFiltersEnabled"
            boolean r4 = r8.getBoolean(r4, r1)
            java.lang.String r5 = "lagThirdThumbnailEnabled"
            boolean r5 = r8.getBoolean(r5, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r10._sessionData
            r1.setStickNodeCullingEnabled(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            r1 = r2 ^ 1
            r0.setDrawOnionSkinWhenMovingStage(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            r1 = r4 ^ 1
            r0.setRenderFiltersWhenDragging(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            r0.setRenderEveryThirdThumbnail(r5)
            org.fortheloss.sticknodes.data.ProjectData r0 = r10._projectData
            org.fortheloss.sticknodes.data.SessionSaveData r0 = r0.getSessionSaveData()
            r10.readSessionSaveData(r0)
            r35.setSessionSelectionToNothing()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            r0.updateAnimationTools()
            org.fortheloss.sticknodes.PlaybackRepeatManager r0 = new org.fortheloss.sticknodes.PlaybackRepeatManager
            r0.<init>()
            r10._playbackRepeatManager = r0
            r0 = 256(0x100, float:3.59E-43)
            r1 = 511(0x1ff, float:7.16E-43)
            r2 = 1107296256(0x42000000, float:32.0)
            float[] r4 = new float[r1]
            float[] r5 = new float[r1]
            float[] r1 = new float[r1]
            org.fortheloss.framework.OpenSimplexNoise r7 = new org.fortheloss.framework.OpenSimplexNoise
            r12 = 69
            r7.<init>(r12)
            r9 = 0
        Lbfc:
            if (r9 >= r0) goto Lc31
            int r12 = r9 % 256
            float r12 = (float) r12
            float r12 = r12 / r2
            double r12 = (double) r12
            r14 = 1073741824(0x40000000, float:2.0)
            double r14 = (double) r14
            double r14 = r7.eval(r12, r14)
            r17 = r1
            r2 = 1082130432(0x40800000, float:4.0)
            double r0 = (double) r2
            double r0 = r7.eval(r12, r0)
            r2 = 1088159744(0x40dc0000, float:6.875)
            r19 = r4
            double r3 = (double) r2
            double r2 = r7.eval(r12, r3)
            float r4 = (float) r14
            r19[r9] = r4
            float r0 = (float) r0
            r5[r9] = r0
            float r0 = (float) r2
            r17[r9] = r0
            int r9 = r9 + 1
            r1 = r17
            r4 = r19
            r0 = 256(0x100, float:3.59E-43)
            r2 = 1107296256(0x42000000, float:32.0)
            r3 = 2
            goto Lbfc
        Lc31:
            r17 = r1
            r19 = r4
            r0 = 0
        Lc36:
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto Lc4f
            r1 = 256(0x100, float:3.59E-43)
            int r2 = r1 + r0
            int r3 = 255 - r0
            r4 = r19[r3]
            r19[r2] = r4
            r4 = r5[r3]
            r5[r2] = r4
            r3 = r17[r3]
            r17[r2] = r3
            int r0 = r0 + 1
            goto Lc36
        Lc4f:
            r0 = 170(0xaa, float:2.38E-43)
            r1 = 340(0x154, float:4.76E-43)
            org.fortheloss.sticknodes.App.rotate(r5, r1)
            r1 = r17
            org.fortheloss.sticknodes.App.rotate(r1, r0)
            r0 = r19
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setSimplexNoise(r0, r5, r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            r0.updateMemoryData(r10, r11)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            r0.updateJumpToolTable()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r10._movieclipToolsModule
            r0.updateJumpToolTable()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r10._createToolsModule
            r0.updateJumpToolTable()
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto Lcb6
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.stickfigureBackupsPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            com.badlogic.gdx.files.FileHandle[] r0 = r0.list()
            long r1 = java.lang.System.currentTimeMillis()
            int r3 = r0.length
            int r3 = r3 - r11
        Lc8c:
            if (r3 < 0) goto Lcb6
            r4 = r0[r3]
            if (r4 == 0) goto Lcb3
            boolean r5 = r4.exists()
            if (r5 == 0) goto Lcb3
            long r12 = r4.lastModified()
            r14 = 0
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 > 0) goto Lca3
            goto Lcb3
        Lca3:
            long r12 = r4.lastModified()
            long r12 = r1 - r12
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 <= 0) goto Lcb3
            r4.delete()
        Lcb3:
            int r3 = r3 + (-1)
            goto Lc8c
        Lcb6:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            r0.updateLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            r0.updateMCLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r10._animateToolsModule
            r0.updateSpriteLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r10._movieclipToolsModule
            r0.updateLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r10._movieclipToolsModule
            r0.updateSpriteLibraryTools()
            boolean r0 = r10._isFirstAnimationScreenSinceAppStart
            if (r0 == 0) goto Lce8
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 == r1) goto Lce8
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            boolean r0 = r0.getAndroidKeepAppAlive()
            if (r0 == 0) goto Lce8
            r10.androidKeepAppAlive(r11)
        Lce8:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r0 != r1) goto Ld38
            if (r6 > r11) goto Lcfd
            java.lang.String r0 = "scopedStorageDone"
            r8.putBoolean(r0, r11)
            r8.flush()
            goto Ld38
        Lcfd:
            java.lang.String r0 = "scopedStorageDone"
            r1 = 0
            boolean r0 = r8.getBoolean(r0, r1)
            if (r0 != 0) goto Ld38
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = r0.getExternalPath()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "/storage/emulated/0/Stick Nodes/"
            r2[r1] = r3
            r2[r11] = r0
            java.lang.String r0 = "storageMessage1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$10 r1 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$10
            r1.<init>(r10, r10, r8)
            java.lang.String r2 = "storageTitle1"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "transferNow"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "doItLater"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r1.initialize(r2, r0, r3, r4)
            r10.addDialogToStage(r1)
        Ld38:
            java.lang.String r0 = "pleaseRateDialogActive"
            boolean r0 = r8.getBoolean(r0, r11)
            boolean r1 = r10._isFirstAnimationScreenSinceAppStart
            if (r1 == 0) goto Ld55
            if (r0 == 0) goto Ld55
            int r14 = r6 % 7
            if (r14 != 0) goto Ld55
            org.fortheloss.sticknodes.animationscreen.dialogs.PleaseRateDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PleaseRateDialog
            r0.<init>(r10)
            org.fortheloss.framework.Assets r1 = r10._assetsRef
            r0.initialize(r1)
            r10.addDialogToStage(r0)
        Ld55:
            return
    }

    public void movieclipSourceEdited(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7) {
            r6 = this;
            int r7 = r7.getLibraryID()
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Le:
            if (r0 < 0) goto L57
            org.fortheloss.sticknodes.data.ProjectData r1 = r6._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            java.util.ArrayList r2 = r1.getDrawableFigures()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L24:
            if (r3 < 0) goto L54
            java.lang.Object r4 = r2.get(r3)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r4 != 0) goto L2f
            goto L51
        L2f:
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.movieclip.MCReference r4 = (org.fortheloss.sticknodes.movieclip.MCReference) r4
            int r5 = r4.getLibraryID()
            if (r5 != r7) goto L51
            r1.refreshFrameTotalNodeCount()
            boolean r5 = r4.isOriginMCRef()
            if (r5 == 0) goto L51
            java.util.ArrayList r5 = r1.getTweenedDrawableFigures()
            java.lang.Object r5 = r5.get(r3)
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            r1.refreshMovieclip(r4, r5)
        L51:
            int r3 = r3 + (-1)
            goto L24
        L54:
            int r0 = r0 + (-1)
            goto Le
        L57:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r6._canvasModule
            r7.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r6._framesModule
            r7.setNeedsToBeDrawn()
            return
    }

    public void onFrameAddDeleteAction() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.flagTracingFBODirty()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            r2.movieclipSourceEdited(r0)
        L17:
            return
    }

    public void onFrameChange(boolean r17) {
            r16 = this;
            r0 = r16
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getCurrentlySelected()
            r3 = 6
            r4 = 5
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 != r7) goto L26
            org.fortheloss.sticknodes.data.SessionData r8 = r0._sessionData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r8.getCurrentlySelectedStickfigure()
            org.fortheloss.sticknodes.data.SessionData r9 = r0._sessionData
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getCurrentlySelectedNode()
            r10 = r6
            r11 = r10
            r12 = r9
            r9 = r11
            goto L61
        L26:
            if (r2 != r4) goto L3a
            org.fortheloss.sticknodes.data.SessionData r8 = r0._sessionData
            org.fortheloss.sticknodes.movieclip.MCReference r8 = r8.getCurrentlySelectedMC()
            org.fortheloss.sticknodes.data.SessionData r9 = r0._sessionData
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getCurrentlySelectedNode()
            r10 = r6
            r11 = r10
            r12 = r9
            r9 = r8
            r8 = r11
            goto L61
        L3a:
            if (r2 != r3) goto L4e
            org.fortheloss.sticknodes.data.SessionData r8 = r0._sessionData
            org.fortheloss.sticknodes.sprite.SpriteRef r8 = r8.getCurrentlySelectedSprite()
            org.fortheloss.sticknodes.data.SessionData r9 = r0._sessionData
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getCurrentlySelectedNode()
            r11 = r6
            r10 = r8
            r12 = r9
            r8 = r11
            r9 = r8
            goto L61
        L4e:
            if (r2 != r5) goto L5c
            org.fortheloss.sticknodes.data.SessionData r8 = r0._sessionData
            org.fortheloss.sticknodes.TextfieldBox r8 = r8.getCurrentlySelectedTextfieldBox()
            r9 = r6
            r10 = r9
            r12 = r10
            r11 = r8
            r8 = r12
            goto L61
        L5c:
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L61:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r13 = r0._canvasModule
            java.util.ArrayList r14 = r1.getDrawableFigures()
            r13.setFigures(r14)
            boolean r13 = r1 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r13 == 0) goto L7b
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r0._canvasModule
            r14 = r1
            org.fortheloss.sticknodes.data.FrameData r14 = (org.fortheloss.sticknodes.data.FrameData) r14
            java.util.ArrayList r14 = r14.getTextfieldBoxes()
            r6.setTextfieldBoxes(r14)
            goto L80
        L7b:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r14 = r0._canvasModule
            r14.setTextfieldBoxes(r6)
        L80:
            org.fortheloss.sticknodes.data.SessionData r6 = r0._sessionData
            int r6 = r6.getMode()
            r14 = 0
            r15 = 3
            if (r6 == r15) goto L14a
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r0._canvasModule
            r6.flagOnionSkinDirty()
            org.fortheloss.sticknodes.data.SessionData r6 = r0._sessionData
            int r6 = r6.getScreen()
            if (r6 != r5) goto L9c
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r0._movieclipToolsModule
            r6.onFrameChange()
        L9c:
            if (r17 == 0) goto La3
            r0.setSessionSelectionToFrameData(r1)
            goto L14a
        La3:
            if (r2 != r7) goto La7
            if (r8 != 0) goto Laf
        La7:
            if (r2 != r4) goto Lab
            if (r9 != 0) goto Laf
        Lab:
            if (r2 != r3) goto L103
            if (r10 == 0) goto L103
        Laf:
            if (r8 == 0) goto Lb6
            int r2 = r8.getID()
            goto Lc1
        Lb6:
            if (r9 == 0) goto Lbd
            int r2 = r9.getID()
            goto Lc1
        Lbd:
            int r2 = r10.getID()
        Lc1:
            java.util.ArrayList r3 = r1.getDrawableFigures()
            int r4 = r3.size()
            int r4 = r4 - r7
        Lca:
            if (r4 < 0) goto L144
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            int r5 = r5.getID()
            if (r5 != r2) goto L100
            java.lang.Object r2 = r3.get(r4)
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto Lea
            java.lang.Object r2 = r3.get(r4)
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            r0.setSessionSelectionToSprite(r2)
            goto L142
        Lea:
            if (r12 == 0) goto L144
            int r2 = r12.getDrawOrderIndex()
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            org.fortheloss.sticknodes.stickfigure.INode r2 = r3.getNodeAtDrawOrderIndex(r2)
            if (r2 == 0) goto L144
            r0.setSessionSelectionToNode(r2)
            goto L142
        L100:
            int r4 = r4 + (-1)
            goto Lca
        L103:
            if (r2 != r5) goto L134
            if (r13 == 0) goto L134
            if (r11 == 0) goto L144
            int r2 = r11.getID()
            r3 = r1
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            int r4 = r3.size()
            int r4 = r4 - r7
        L119:
            if (r4 < 0) goto L144
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.TextfieldBox r5 = (org.fortheloss.sticknodes.TextfieldBox) r5
            int r5 = r5.getID()
            if (r5 != r2) goto L131
            java.lang.Object r2 = r3.get(r4)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            r0.setSessionSelectionToTextFieldBox(r2)
            goto L142
        L131:
            int r4 = r4 + (-1)
            goto L119
        L134:
            if (r2 != r15) goto L144
            if (r13 == 0) goto L144
            r2 = r1
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getFrameCamera()
            r0.setSessionSelectionToFrameCamera(r2)
        L142:
            r2 = 1
            goto L145
        L144:
            r2 = 0
        L145:
            if (r2 != 0) goto L14a
            r0.setSessionSelectionToFrameData(r1)
        L14a:
            if (r17 == 0) goto L160
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            int r1 = r1.getMode()
            if (r1 != r15) goto L160
            r1 = 0
            r0._timePassed = r1
            r0._playNextKeyframe = r14
            r0._playNextTweenedFrame = r7
            r0._playTweenedFrameNumber = r7
            r0._numTweenedFramesToPlay = r7
        L160:
            return
    }

    public void onUndoRedoFigureAction(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            r0 = 0
            r1.onUndoRedoFigureAction(r2, r0)
            return
    }

    public void onUndoRedoFigureAction(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r1 = 0
            r0.setKeyboardFocus(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L1b
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            if (r0 == 0) goto L1b
            r0 = 0
            r2.setSessionMode(r0)
        L1b:
            if (r3 != 0) goto L39
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getCurrentlySelectedStickfigure()
            if (r3 == r4) goto L35
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            org.fortheloss.sticknodes.movieclip.MCReference r3 = r3.getCurrentlySelectedMC()
            if (r3 == r4) goto L35
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r3.getCurrentlySelectedSprite()
            if (r3 != r4) goto L5f
        L35:
            r2.setSessionSelectionToNothing()
            goto L5f
        L39:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L50
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r2.setSessionSelectionToStickfigure(r3)
            org.fortheloss.sticknodes.data.SessionData r4 = r2._sessionData
            int r4 = r4.getScreen()
            if (r4 == r1) goto L5f
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2._canvasModule
            r4.maybeUpdateJoinChain(r3)
            goto L5f
        L50:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L5a
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            r2.setSessionSelectionToSprite(r3)
            goto L5f
        L5a:
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            r2.setSessionSelectionToMC(r3)
        L5f:
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            int r3 = r3.getScreen()
            if (r3 != 0) goto L72
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.setNeedsToBeDrawn()
            goto L93
        L72:
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            int r3 = r3.getScreen()
            if (r3 != r1) goto L80
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.setNeedsToBeDrawn()
            goto L93
        L80:
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            int r3 = r3.getScreen()
            r4 = 2
            if (r3 != r4) goto L93
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
        L93:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoFigureJoinAction(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r1 = this;
            if (r3 != 0) goto Lc
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r1._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onFigureUnjoined(r2)
            goto L15
        Lc:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r0.onFigureJoined(r2, r3)
        L15:
            return
    }

    public void onUndoRedoFrameAction() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r1 = 0
            r0.setKeyboardFocus(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L2c
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r2.setSessionSelectionToFrameData(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.setNeedsToBeDrawn()
        L2c:
            return
    }

    public void onUndoRedoFrameCameraAction() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r1 = 0
            r0.setKeyboardFocus(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L1a
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            r1 = 2
            if (r0 == r1) goto L1a
            r2.setSessionMode(r1)
        L1a:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L40
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r2.setSessionSelectionToFrameCamera(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.maybeUpdateJoinChains()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.setNeedsToBeDrawn()
        L40:
            return
    }

    public void onUndoRedoGeneralAction() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r1 = 0
            r0.setKeyboardFocus(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModule
            r0.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoMCReferenceFlipAction(org.fortheloss.sticknodes.movieclip.MCReference r3, boolean r4, boolean r5) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L15
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            if (r0 == 0) goto L15
            r0 = 0
            r2.setSessionMode(r0)
        L15:
            if (r3 == 0) goto L30
            r2.setSessionSelectionToMC(r3)
            if (r4 == 0) goto L26
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            r4.onFigureFlippedX(r3, r5)
            goto L2f
        L26:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            r4.onFigureFlippedY(r3, r5)
        L2f:
            return
        L30:
            r2.setSessionSelectionToNothing()
            return
    }

    public void onUndoRedoNodeAction(org.fortheloss.sticknodes.stickfigure.INode r5, boolean r6) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r4._stageRef
            r1 = 0
            r0.setKeyboardFocus(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L1b
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionData
            int r0 = r0.getMode()
            if (r0 == 0) goto L1b
            r0 = 0
            r4.setSessionMode(r0)
        L1b:
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L99
            r0 = r5
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionData
            int r2 = r2.getScreen()
            if (r2 == 0) goto L47
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionData
            int r2 = r2.getScreen()
            r3 = 2
            if (r2 != r3) goto L34
            goto L47
        L34:
            org.fortheloss.sticknodes.data.SessionData r6 = r4._sessionData
            int r6 = r6.getScreen()
            if (r6 != r1) goto L99
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r6 = r4._createToolsModule
            r6.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r6 = r4._createToolsModule
            r6.updateRelativeAngleLocks()
            goto L99
        L47:
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionData
            int r2 = r2.getScreen()
            if (r2 != 0) goto L5e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r2 = r2.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getFrameCamera()
            r2.updateLocked(r1, r1)
        L5e:
            if (r6 == 0) goto L69
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r4._framesModule
            org.fortheloss.sticknodes.data.IFrameData r6 = r6.getCurrentFrame()
            r6.onStickNodeColorModified(r0)
        L69:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r0.getStickfigure()
            r6.repositionBasedOnLockedStickNode()
            boolean r6 = r0.isSmartStretch()
            if (r6 == 0) goto L79
            r0.applySmartStretchToChildren()
        L79:
            r0.applySmartStretchToJoinedSprites()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r4._canvasModule
            r6.maybeUpdateJoinChains()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r4._framesModule
            r6.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r6 = r4._sessionData
            int r6 = r6.getScreen()
            if (r6 != 0) goto L94
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r4._animateToolsModule
            r6.setNeedsToBeDrawn()
            goto L99
        L94:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r4._movieclipToolsModule
            r6.setNeedsToBeDrawn()
        L99:
            if (r5 == 0) goto L9f
            r4.setSessionSelectionToNode(r5)
            goto La2
        L9f:
            r4.setSessionSelectionToNothing()
        La2:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModule
            r5.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoPanningAction() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L19
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            if (r0 == r1) goto L14
            r2.setSessionMode(r1)
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.maybeUpdateJoinChains()
        L19:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            if (r0 == r1) goto L35
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.setNeedsToBeDrawn()
        L35:
            return
    }

    public void onUndoRedoPolyfillAction(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            r1.setSessionSelectionToNode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r0 = 8
            r2.setDrawTool(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoPolyfillActionBegin(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            r2.setSessionSelectionToNode(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModule
            r1 = 8
            r0.setDrawTool(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModule
            r0.beginPolyfillEditing(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoPolyfillActionCancel(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            r1.setSessionSelectionToNode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r0 = 0
            r2.setDrawTool(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.cancelPolyfillEditing()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoPolyfillActionFinish(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            r1.setSessionSelectionToNode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r0 = 0
            r2.setDrawTool(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.finishPolyfillEditing()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void onUndoRedoStickfigureFlipAction(org.fortheloss.sticknodes.stickfigure.StickNode r3, boolean r4, boolean r5) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L15
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            if (r0 == 0) goto L15
            r0 = 0
            r2.setSessionMode(r0)
        L15:
            if (r3 == 0) goto L49
            r2.setSessionSelectionToNode(r3)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            if (r0 == r1) goto L2b
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3.getStickfigure()
            r0.maybeUpdateJoinChain(r1)
        L2b:
            if (r4 == 0) goto L3b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getStickfigure()
            r4.onFigureFlippedX(r3, r5)
            goto L48
        L3b:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getStickfigure()
            r4.onFigureFlippedY(r3, r5)
        L48:
            return
        L49:
            r2.setSessionSelectionToNothing()
            return
    }

    public void onUndoRedoTextfieldAction(org.fortheloss.sticknodes.TextfieldBox r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r1 = 0
            r0.setKeyboardFocus(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L1b
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            if (r0 == 0) goto L1b
            r0 = 0
            r2.setSessionMode(r0)
        L1b:
            if (r3 == 0) goto L21
            r2.setSessionSelectionToTextFieldBox(r3)
            goto L24
        L21:
            r2.setSessionSelectionToNothing()
        L24:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            return
    }

    public void onZipImported(java.lang.String r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r3 = "zipImportedTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 0
            r0[r1] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5 = 2
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 3
            r0[r5] = r4
            java.lang.String r4 = "zipImportedInfo3_2"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4, r0)
            r2.showErrorDialog(r3, r4)
            return
    }

    public void openProject(com.badlogic.gdx.files.FileHandle r6, float r7, boolean r8) {
            r5 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            if (r8 == 0) goto L7
            java.lang.String r1 = "fromFirstFrame"
            goto L9
        L7:
            java.lang.String r1 = "fromLastFrame"
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AnimationScreen.openProject("
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "last_status_event"
            r0.setCrashlyticsKeyString(r2, r1)
        L2c:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r5._activeDialogs
            int r0 = r0.size()
            if (r0 <= 0) goto L41
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r0 = r5._activeDialogs
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0 = (org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper) r0
            r0.hideImmediately()
            goto L2c
        L41:
            org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog
            org.fortheloss.framework.Assets r1 = r5._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            java.lang.Object r1 = r1.get(r2, r3, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "loading_spinner"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r0.<init>(r5, r1)
            r5._isOpeningDialogRef = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog r0 = r5._isOpeningDialogRef
            r5.addDialogToStage(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModule
            r0.hideArrows()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModule
            r0.hideMagnifier()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModule
            r1 = 0
            r0.showQuickResizeTool(r1)
            org.fortheloss.sticknodes.data.ProjectData r0 = r5._projectData
            r0.dispose()
            r5._projectData = r1
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModule
            r0.remove()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModule
            r0.dispose()
            r5._canvasModule = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r5._framesModule
            r0.remove()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r5._framesModule
            r0.dispose()
            r5._framesModule = r1
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r5._animateToolsModule
            r0.remove()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r5._animateToolsModule
            r0.dispose()
            r5._animateToolsModule = r1
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r5._createToolsModule
            r0.remove()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r5._createToolsModule
            r0.dispose()
            r5._createToolsModule = r1
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r5._movieclipToolsModule
            r0.remove()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r5._movieclipToolsModule
            r0.dispose()
            r5._movieclipToolsModule = r1
            com.badlogic.gdx.scenes.scene2d.Group r0 = r5._groupModules
            r0.remove()
            org.fortheloss.sticknodes.App.deleteScratchFiles()
            java.lang.System.gc()
            org.fortheloss.sticknodes.data.ProjectData r0 = new org.fortheloss.sticknodes.data.ProjectData
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = new org.fortheloss.sticknodes.animationscreen.FontLoader
            boolean r2 = org.fortheloss.sticknodes.App.isInternationalUI()
            r1.<init>(r2)
            r0.<init>(r1)
            r5._projectDataToOpenRef = r0
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$1 r1 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$1
            r1.<init>(r5, r6, r7, r8)
            r0.<init>(r1)
            r0.start()
            return
    }

    public void pasteCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r3) {
            r2 = this;
            if (r3 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCopiedFrameCamera()
            if (r0 != 0) goto Lb
            goto L31
        Lb:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionData
            r1.addUserAction(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCopiedFrameCamera()
            r1 = 1
            r3.copyFrom(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
        L31:
            return
    }

    public void pasteFrame() {
            r17 = this;
            r0 = r17
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            org.fortheloss.sticknodes.data.IFrameData[] r1 = r1.getCopiedFrames()
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getNumCopiedFrames()
            if (r1 == 0) goto L112
            if (r2 > 0) goto L14
            goto L112
        L14:
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionData
            int r3 = r3.getCopiedFrameFramesContainerUID()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r4.getFramesContainer()
            int r4 = r4.getUID()
            org.fortheloss.sticknodes.data.SessionData r5 = r0._sessionData
            int r5 = r5.getScreen()
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L30
            r5 = 1
            goto L31
        L30:
            r5 = 0
        L31:
            r8 = r1[r6]
            boolean r8 = r8 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r5 != 0) goto L9a
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r9 = r9.getFramesContainer()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r9
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r9.frames
            int r10 = r10.size()
            int r10 = r10 + r2
            r11 = 2
            java.lang.String r12 = "failedToPasteFramesInfo"
            java.lang.String r13 = "failedToPasteFramesTitle"
            r14 = 256000(0x3e800, float:3.58732E-40)
            r15 = 200(0xc8, float:2.8E-43)
            if (r10 <= r15) goto L6c
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r2[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2[r7] = r3
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r12, r2)
            r0.showErrorDialog(r1, r2)
            return
        L6c:
            int r9 = r9.getTotalNodeCount()
            r10 = 0
        L71:
            if (r10 >= r2) goto L7e
            r16 = r1[r10]
            int r16 = r16.getFrameTotalNodeCount()
            int r9 = r9 + r16
            int r10 = r10 + 1
            goto L71
        L7e:
            if (r9 <= r14) goto L9a
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r2[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2[r7] = r3
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r12, r2)
            r0.showErrorDialog(r1, r2)
            return
        L9a:
            if (r3 != r4) goto Lc3
        L9c:
            if (r6 >= r2) goto L112
            if (r8 == 0) goto Lb1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.FrameData r4 = new org.fortheloss.sticknodes.data.FrameData
            int r5 = r6 + 1
            r6 = r1[r6]
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            r4.<init>(r6, r7)
            r3.addFrame(r4, r7)
            goto Lc1
        Lb1:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.MCFrameData r4 = new org.fortheloss.sticknodes.data.MCFrameData
            int r5 = r6 + 1
            r6 = r1[r6]
            org.fortheloss.sticknodes.data.MCFrameData r6 = (org.fortheloss.sticknodes.data.MCFrameData) r6
            r4.<init>(r6, r7)
            r3.addFrame(r4, r7)
        Lc1:
            r6 = r5
            goto L9c
        Lc3:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r9 = r9.getFramesContainer()
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            java.util.HashMap r3 = r10.getIDConversionMapForContainerUID(r4, r3)
        Lcf:
            if (r6 >= r2) goto L112
            if (r8 == 0) goto Led
            if (r5 == 0) goto Le1
            org.fortheloss.sticknodes.data.FrameData r4 = new org.fortheloss.sticknodes.data.FrameData
            int r10 = r6 + 1
            r6 = r1[r6]
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            r4.<init>(r6, r7)
            goto L108
        Le1:
            org.fortheloss.sticknodes.data.MCFrameData r4 = new org.fortheloss.sticknodes.data.MCFrameData
            int r10 = r6 + 1
            r6 = r1[r6]
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            r4.<init>(r6, r7)
            goto L108
        Led:
            if (r5 != 0) goto Lfb
            org.fortheloss.sticknodes.data.MCFrameData r4 = new org.fortheloss.sticknodes.data.MCFrameData
            int r10 = r6 + 1
            r6 = r1[r6]
            org.fortheloss.sticknodes.data.MCFrameData r6 = (org.fortheloss.sticknodes.data.MCFrameData) r6
            r4.<init>(r6, r7)
            goto L108
        Lfb:
            org.fortheloss.sticknodes.data.FrameData r4 = new org.fortheloss.sticknodes.data.FrameData
            int r10 = r6 + 1
            r6 = r1[r6]
            org.fortheloss.sticknodes.data.MCFrameData r6 = (org.fortheloss.sticknodes.data.MCFrameData) r6
            org.fortheloss.sticknodes.data.ProjectData r11 = r0._projectData
            r4.<init>(r6, r11, r7)
        L108:
            r6 = r10
            r9.convertIDs(r4, r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r10 = r0._framesModule
            r10.addFrame(r4, r7)
            goto Lcf
        L112:
            return
    }

    public void pasteMC() {
            r12 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r12._sessionData
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCopiedMovieclip()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r1 = r12._sessionData
            boolean r1 = r1.getPasteWillTryToPreserveLayeringIndex()
            org.fortheloss.sticknodes.data.SessionData r2 = r12._sessionData
            int r5 = r2.getCopiedMovieclipIndexInFrame()
            org.fortheloss.sticknodes.data.SessionData r2 = r12._sessionData
            int r2 = r2.getCopiedMovieclipFigureIdFront()
            org.fortheloss.sticknodes.data.SessionData r3 = r12._sessionData
            int r3 = r3.getCopiedMovieclipFigureIdBehind()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r12._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            java.util.ArrayList r6 = r4.getDrawableFigures()
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L73
            r9 = -1
            if (r2 <= r9) goto L49
            int r10 = r6.size()
            int r10 = r10 - r8
        L37:
            if (r10 < 0) goto L49
            java.lang.Object r11 = r6.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            int r11 = r11.getID()
            if (r11 != r2) goto L46
            goto L4a
        L46:
            int r10 = r10 + (-1)
            goto L37
        L49:
            r10 = -1
        L4a:
            if (r10 != r9) goto L67
            if (r3 <= r9) goto L67
            int r2 = r6.size()
            int r2 = r2 - r8
        L53:
            if (r2 < 0) goto L67
            java.lang.Object r11 = r6.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            int r11 = r11.getID()
            if (r11 != r3) goto L64
            int r10 = r2 + 1
            goto L67
        L64:
            int r2 = r2 + (-1)
            goto L53
        L67:
            if (r10 != r9) goto L70
            int r2 = r6.size()
            if (r2 <= r5) goto L70
            r10 = r5
        L70:
            if (r10 != r9) goto L73
            r1 = 0
        L73:
            org.fortheloss.sticknodes.movieclip.MCReference r2 = new org.fortheloss.sticknodes.movieclip.MCReference
            org.fortheloss.sticknodes.data.FrameData r4 = (org.fortheloss.sticknodes.data.FrameData) r4
            r2.<init>(r0, r4)
            if (r1 == 0) goto L86
            r6 = 0
            r7 = 1
            r8 = 1
            r3 = r12
            r4 = r2
            boolean r0 = r3.addMC(r4, r5, r6, r7, r8)
            goto L8a
        L86:
            boolean r0 = r12.addMC(r2, r7, r8, r8)
        L8a:
            if (r0 == 0) goto L94
            r12.setSessionSelectionToMC(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r12._canvasModule
            r0.setNeedsToBeDrawn()
        L94:
            return
    }

    public void pasteSegment(org.fortheloss.sticknodes.stickfigure.StickNode r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.pasteSegment(r2, r3, r0)
            return
    }

    public boolean pasteSegment(org.fortheloss.sticknodes.stickfigure.StickNode r10, boolean r11, org.fortheloss.sticknodes.stickfigure.StickNode r12) {
            r9 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionData
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r0.getCopiedStickNode()
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionData
            java.util.ArrayList r7 = r0.getCopiedStickNodePolynodeAnchorIndices()
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionData
            java.util.ArrayList r8 = r0.getCopiedStickNodePolynodeChildrenIndices()
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionData
            java.util.ArrayList r5 = r0.getCopiedConnectorPairIndices()
            if (r10 == 0) goto L42
            if (r2 == 0) goto L42
            if (r7 == 0) goto L2a
            if (r8 == 0) goto L2a
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r9._canvasModule
            r3 = r10
            r4 = r11
            r6 = r12
            boolean r10 = r1.pasteSegment(r2, r3, r4, r5, r6, r7, r8)
            goto L33
        L2a:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r9._canvasModule
            r3 = r10
            r4 = r11
            r6 = r12
            boolean r10 = r1.pasteSegment(r2, r3, r4, r5, r6)
        L33:
            org.fortheloss.sticknodes.data.SessionData r11 = r9._sessionData
            int r11 = r11.getScreen()
            r12 = 1
            if (r11 != r12) goto L43
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r11 = r9._createToolsModule
            r11.updateNodeCount()
            goto L43
        L42:
            r10 = 0
        L43:
            return r10
    }

    public void pasteSprite() {
            r10 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCopiedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            boolean r0 = r0.getPasteWillTryToPreserveLayeringIndex()
            org.fortheloss.sticknodes.data.SessionData r1 = r10._sessionData
            int r1 = r1.getCopiedSpriteFigureIdFront()
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionData
            int r2 = r2.getCopiedSpriteFigureIdBehind()
            org.fortheloss.sticknodes.data.SessionData r3 = r10._sessionData
            int r3 = r3.getCopiedSpriteIndexInFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r10._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            java.util.ArrayList r4 = r4.getDrawableFigures()
            r5 = 0
            r6 = 1
            r7 = -1
            if (r0 == 0) goto L77
            if (r1 <= r7) goto L49
            int r8 = r4.size()
            int r8 = r8 - r6
        L37:
            if (r8 < 0) goto L49
            java.lang.Object r9 = r4.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            int r9 = r9.getID()
            if (r9 != r1) goto L46
            goto L4a
        L46:
            int r8 = r8 + (-1)
            goto L37
        L49:
            r8 = -1
        L4a:
            if (r8 != r7) goto L67
            if (r2 <= r7) goto L67
            int r1 = r4.size()
            int r1 = r1 - r6
        L53:
            if (r1 < 0) goto L67
            java.lang.Object r9 = r4.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            int r9 = r9.getID()
            if (r9 != r2) goto L64
            int r8 = r1 + 1
            goto L67
        L64:
            int r1 = r1 + (-1)
            goto L53
        L67:
            if (r8 != r7) goto L70
            int r1 = r4.size()
            if (r1 <= r3) goto L70
            goto L71
        L70:
            r3 = r8
        L71:
            if (r3 != r7) goto L76
            r7 = r3
            r0 = 0
            goto L77
        L76:
            r7 = r3
        L77:
            org.fortheloss.sticknodes.data.SessionData r1 = r10._sessionData
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getCopiedSprite()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r2 == 0) goto L89
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r2 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r1 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r1
            r2.<init>(r1)
            goto L8e
        L89:
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r2.<init>(r1)
        L8e:
            if (r0 == 0) goto L95
            boolean r0 = r10.addSprite(r2, r7, r5, r6)
            goto L99
        L95:
            boolean r0 = r10.addSprite(r2, r5, r6)
        L99:
            if (r0 == 0) goto La3
            r10.setSessionSelectionToSprite(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            r0.setNeedsToBeDrawn()
        La3:
            return
    }

    public void pasteStickfigure() {
            r20 = this;
            r6 = r20
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            java.util.ArrayList r0 = r0.getCopiedStickfigureWithJoins()
            if (r0 == 0) goto L27c
            int r1 = r0.size()
            if (r1 > 0) goto L12
            goto L27c
        L12:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            boolean r1 = r1.getPasteWillTryToPreserveLayeringIndex()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            int r7 = r2.getCopiedStickfigureFramesContainerUID()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            int r2 = r2.getCopiedStickfigureFigureIdFront()
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionData
            int r3 = r3.getCopiedStickfigureFigureIdBehind()
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionData
            int r4 = r4.getCopiedStickfigureIndexInFrame()
            org.fortheloss.sticknodes.data.SessionData r5 = r6._sessionData
            java.util.ArrayList r8 = r5.getCopiedStickfigureJoinData()
            org.fortheloss.sticknodes.data.SessionData r5 = r6._sessionData
            java.util.ArrayList r9 = r5.getCopiedStickfigureLayerOrder()
            org.fortheloss.sticknodes.data.SessionData r5 = r6._sessionData
            int r5 = r5.getScreen()
            r10 = 2
            r11 = 0
            r12 = 1
            if (r5 != r10) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = 0
        L4a:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r13 = r13.getCurrentFrame()
            java.util.ArrayList r14 = r13.getDrawableFigures()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r15 = r6._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r15 = r15.getFramesContainer()
            int r10 = r9.size()
            boolean r16 = r15.canAddFigures(r13, r0)
            if (r16 != 0) goto Lc8
            java.lang.String r0 = "stickfigureLimitWarningInfoNew2"
            java.lang.String r1 = "stickfigureLimitWarningTitle"
            if (r5 == 0) goto Lb0
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            int r3 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r11] = r3
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r11] = r3
            r3 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r12] = r3
            java.lang.String r3 = "frameLimitWarningInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\n\n"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r6.showErrorDialog(r1, r0)
            goto Lc7
        Lb0:
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            int r3 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r11] = r3
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            r6.showErrorDialog(r1, r0)
        Lc7:
            return
        Lc8:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = 0
        Lce:
            if (r12 >= r10) goto L124
            java.lang.Object r17 = r0.get(r12)
            r18 = r0
            r0 = r17
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            r17 = r8
            boolean r8 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r8 == 0) goto Lea
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r8.<init>(r0)
        Le7:
            r19 = r5
            goto L118
        Lea:
            boolean r8 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r8 == 0) goto Lf6
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r8 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r0 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r0
            r8.<init>(r0)
            goto Le7
        Lf6:
            boolean r8 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r8 == 0) goto L102
            org.fortheloss.sticknodes.sprite.SpriteRef r8 = new org.fortheloss.sticknodes.sprite.SpriteRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r8.<init>(r0)
            goto Le7
        L102:
            boolean r8 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r8 == 0) goto L115
            if (r5 != 0) goto L115
            org.fortheloss.sticknodes.movieclip.MCReference r8 = new org.fortheloss.sticknodes.movieclip.MCReference
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r19 = r5
            r5 = r13
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            r8.<init>(r0, r5)
            goto L118
        L115:
            r19 = r5
            r8 = 0
        L118:
            r11.add(r8)
            int r12 = r12 + 1
            r8 = r17
            r0 = r18
            r5 = r19
            goto Lce
        L124:
            r17 = r8
            r0 = -1
            if (r1 == 0) goto L17d
            int r5 = r15.getUID()
            if (r5 == r7) goto L132
        L12f:
            r1 = 1
            r8 = 0
            goto L17f
        L132:
            if (r2 <= r0) goto L14c
            int r5 = r14.size()
            r8 = 1
            int r5 = r5 - r8
        L13a:
            if (r5 < 0) goto L14c
            java.lang.Object r8 = r14.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            int r8 = r8.getID()
            if (r8 != r2) goto L149
            goto L14d
        L149:
            int r5 = r5 + (-1)
            goto L13a
        L14c:
            r5 = -1
        L14d:
            if (r5 != r0) goto L16c
            if (r3 <= r0) goto L16c
            int r2 = r14.size()
            r8 = 1
            int r2 = r2 - r8
        L157:
            if (r2 < 0) goto L16c
            java.lang.Object r12 = r14.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            int r12 = r12.getID()
            if (r12 != r3) goto L168
            int r5 = r2 + 1
            goto L16c
        L168:
            int r2 = r2 + (-1)
            r8 = 1
            goto L157
        L16c:
            if (r5 != r0) goto L175
            int r2 = r14.size()
            if (r2 <= r4) goto L175
            goto L176
        L175:
            r4 = r5
        L176:
            if (r4 != r0) goto L17a
            r0 = r4
            goto L12f
        L17a:
            r8 = r1
            r0 = r4
            goto L17e
        L17d:
            r8 = r1
        L17e:
            r1 = 1
        L17f:
            if (r10 != r1) goto L183
            r12 = 1
            goto L184
        L183:
            r12 = 0
        L184:
            if (r12 != 0) goto L1ad
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PasteAffectingNextFrameMCsAction> r2 = org.fortheloss.sticknodes.data.useractions.PasteAffectingNextFrameMCsAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.PasteAffectingNextFrameMCsAction r1 = (org.fortheloss.sticknodes.data.useractions.PasteAffectingNextFrameMCsAction) r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r2 = r2.getNextFrame()
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            r2.addUserAction(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r2 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r1 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r1
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            r2.addUserAction(r1)
        L1ad:
            r2 = r0
            r14 = 0
        L1af:
            if (r14 >= r10) goto L223
            java.lang.Object r0 = r9.get(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r0 = r11.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            if (r0 != 0) goto L1c4
            goto L220
        L1c4:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 != 0) goto L207
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r6._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r1.getFramesContainer()
            int r3 = r1.getUID()
            if (r7 == r3) goto L1dd
            org.fortheloss.sticknodes.data.ProjectData r4 = r6._projectData
            java.util.HashMap r3 = r4.getIDConversionMapForContainerUID(r3, r7)
            r1.convertID(r0, r3)
        L1dd:
            if (r8 == 0) goto L1f6
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L1ec
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            int r1 = r2 + 1
            r3 = 0
            r6.addStickfigure(r0, r2, r3, r12)
            goto L1f4
        L1ec:
            r3 = 0
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            int r1 = r2 + 1
            r6.addSprite(r0, r2, r3, r12)
        L1f4:
            r2 = r1
            goto L220
        L1f6:
            r3 = 0
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L201
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r6.addStickfigure(r0, r3, r12)
            goto L220
        L201:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r6.addSprite(r0, r3, r12)
            goto L220
        L207:
            if (r8 == 0) goto L219
            r1 = r0
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            int r18 = r2 + 1
            r3 = 0
            r5 = 1
            r0 = r20
            r4 = r12
            r0.addMC(r1, r2, r3, r4, r5)
            r2 = r18
            goto L220
        L219:
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r1 = 0
            r3 = 1
            r6.addMC(r0, r1, r12, r3)
        L220:
            int r14 = r14 + 1
            goto L1af
        L223:
            r3 = 0
        L224:
            if (r3 >= r10) goto L259
            r0 = r17
            java.lang.Object r1 = r0.get(r3)
            com.badlogic.gdx.math.Vector2 r1 = (com.badlogic.gdx.math.Vector2) r1
            if (r1 != 0) goto L232
        L230:
            r4 = 1
            goto L254
        L232:
            float r2 = r1.x
            int r2 = (int) r2
            float r1 = r1.y
            int r1 = (int) r1
            java.lang.Object r2 = r11.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            org.fortheloss.sticknodes.stickfigure.INode r1 = r2.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            java.lang.Object r2 = r11.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            if (r2 != 0) goto L24d
            goto L230
        L24d:
            r4 = 1
            r2.joinTo(r1, r4)
            r13.onFigureJoined(r2, r1)
        L254:
            int r3 = r3 + 1
            r17 = r0
            goto L224
        L259:
            r1 = 0
            java.lang.Object r0 = r11.get(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            if (r12 != 0) goto L274
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsPasteAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsPasteAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsPasteAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsPasteAction) r1
            r1.initialize(r0, r13, r15)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionData
            r2.addUserAction(r1)
        L274:
            r6.setSessionSelectionToStickfigure(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r6._canvasModule
            r0.setNeedsToBeDrawn()
        L27c:
            return
    }

    public void pasteTextfield() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCopiedTextfield()
            if (r0 == 0) goto L12
            org.fortheloss.sticknodes.TextfieldBox r1 = new org.fortheloss.sticknodes.TextfieldBox
            r1.<init>(r0)
            r0 = 0
            r2 = 1
            r3.addTextfield(r1, r0, r2)
        L12:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void pause() {
            r2 = this;
            super.pause()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getMode()
            r1 = 3
            if (r0 != r1) goto L25
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            boolean r0 = r0.getIsPlayFullscreen()
            if (r0 == 0) goto L22
            r0 = 0
            r2.setPlayFullscreen(r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.fullscreenChanged()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.fullscreenChanged()
        L22:
            r2.stopAnimation()
        L25:
            return
    }

    public void playAnimation() {
            r6 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            org.fortheloss.sticknodes.animationscreen.TooltipManager r0 = r6._tooltipManager
            r2 = 0
            if (r0 == 0) goto L14
            r0.dispose()
            r6._tooltipManager = r2
        L14:
            org.fortheloss.sticknodes.animationscreen.ZoomButtons r0 = r6._zoomButtons
            r3 = 0
            if (r0 == 0) goto L1c
            r0.setEnabled(r3)
        L1c:
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r6._popupText
            if (r0 == 0) goto L23
            r0.hide()
        L23:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r6._canvasModule
            r0.rememberZoom()
            r0 = 3
            r6.setSessionMode(r0)
            org.fortheloss.sticknodes.PlaybackRepeatManager r0 = r6._playbackRepeatManager
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r6._framesModule
            int r5 = r5.getCurrentFrameIndex()
            r0.prepare(r4, r5)
            r0 = 1065353216(0x3f800000, float:1.0)
            org.fortheloss.sticknodes.data.ProjectData r4 = r6._projectData
            int r4 = r4.getActualFPS()
            float r4 = (float) r4
            float r0 = r0 / r4
            double r4 = (double) r0
            r6._timePassed = r4
            r4 = 0
            r6._playingKeyframeDelay = r4
            r6._waitingOnDelayedFrame = r3
            r6._delayedFrameIsWobbling = r3
            r6._delayedFrameIsAnimatingMCs = r3
            r6._timeElapsedSinceDelay = r4
            r6._delayInitialSeconds = r4
            r6._frameToRestoreAnimatedDuringDelayMCsRef = r2
            r6._playFirstFrame = r1
            r6._playNextKeyframe = r1
            r6._playNextTweenedFrame = r3
            r6._playTweenedFrameNumber = r3
            r6._numTweenedFramesToPlay = r3
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            int r0 = r0.getPlaybackEndFrame()
            r6._playbackRangeEndFrame = r0
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            int r0 = r0.getPlaybackStartFrame()
            if (r0 != r1) goto L7c
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            int r0 = r0.getCurrentFrameIndex()
            int r0 = r0 + r1
            goto L7d
        L7c:
            r0 = -1
        L7d:
            r6._playbackRangeGoBackToStartFrame = r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r6._frameBeforePlayingRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            int r0 = r0.getCurrentFrameIndex()
            r6._frameBeforePlayingRefIndex = r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0.getScrollPane()
            r1 = 0
            r0.fling(r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameBeforePlayingRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 == 0) goto Lb4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r6._canvasModule
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            org.fortheloss.sticknodes.data.IFrameData r2 = r6._frameBeforePlayingRef
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            r1.setPlayingFrameCamera(r0, r2)
            goto Lbb
        Lb4:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r6._canvasModule
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            r0.setPlayingFrameCamera(r1, r2)
        Lbb:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            boolean r0 = r0.getIsPlayFullscreen()
            if (r0 == 0) goto Lc6
            r6.beginPlayingFullscreen()
        Lc6:
            return
    }

    public void playbackSettingChanged() {
            r10 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionData
            int r0 = r0.getMode()
            r1 = 0
            r2 = 1
            r3 = 3
            if (r0 != r3) goto L16
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r10._stageRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getKeyboardFocus()
            r10.stopAnimation()
            r3 = 1
            goto L18
        L16:
            r0 = 0
            r3 = 0
        L18:
            org.fortheloss.sticknodes.data.ProjectData r4 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r4 = r4.size()
            r5 = 0
        L21:
            if (r5 >= r4) goto L5e
            org.fortheloss.sticknodes.data.ProjectData r6 = r10._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            java.lang.Object r6 = r6.get(r5)
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            boolean r7 = r6.isDelayed()
            if (r7 != 0) goto L34
            goto L5b
        L34:
            java.util.ArrayList r7 = r6.getDrawableFigures()
            int r8 = r7.size()
            int r8 = r8 - r2
        L3d:
            if (r8 < 0) goto L5b
            java.lang.Object r9 = r7.get(r8)
            boolean r9 = r9 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r9 != 0) goto L48
            goto L58
        L48:
            java.lang.Object r9 = r7.get(r8)
            org.fortheloss.sticknodes.movieclip.MCReference r9 = (org.fortheloss.sticknodes.movieclip.MCReference) r9
            boolean r9 = r9.getPlayDuringDelay()
            if (r9 == 0) goto L58
            r6.refreshAllMovieclips(r1, r2)
            goto L5b
        L58:
            int r8 = r8 + (-1)
            goto L3d
        L5b:
            int r5 = r5 + 1
            goto L21
        L5e:
            if (r3 == 0) goto L6a
            r10.playAnimation()
            if (r0 == 0) goto L6a
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10._stageRef
            r1.setKeyboardFocus(r0)
        L6a:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r10._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r10._canvasModule
            r0.setNeedsToBeDrawn()
            return
    }

    public void quickJumpMenuTo(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.jumpToSubmenu(r3)
            goto L2b
        Le:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto L1d
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModule
            r0.jumpToSubmenu(r3)
            goto L2b
        L1d:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L2b
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.jumpToSubmenu(r3)
        L2b:
            return
    }

    public void readSessionSaveData(org.fortheloss.sticknodes.data.SessionSaveData r4) {
            r3 = this;
            if (r4 == 0) goto L7c
            int r0 = r4.version
            r1 = 251(0xfb, float:3.52E-43)
            if (r0 < r1) goto L7c
            boolean r0 = r4.projectIsFullyOpened
            if (r0 == 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r2 = r4.frameIndex
            java.lang.Object r1 = r1.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1
            r2 = 0
            r0.goToFrame(r1, r2)
        L1e:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.readSessionSaveData(r4)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.onlyDrawMainNodes
            r0.setDrawOnlyMainNodes(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.showFigureIDs
            r0.setShowFigureIDs(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.onionSkinIsNormal
            r0.setOnionSkin(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.isShowingOutline
            r0.setShowOutline(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.isShowingOutlineCreative
            r0.setShowOutlineCreative(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.isShowingNeighborNodes
            r0.setShowNeighborNodes(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.isShowingNeighborNodesCreative
            r0.setShowNeighborNodesCreative(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.isShowingGuides
            r0.setShowGuides(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.isShowingStageBox
            r0.setShowStageBox(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.neighborNodesAreAffectedByJoins
            r0.setNeighborNodesAffectedByJoins(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.alwaysShowCurrentFigureNodes
            r0.setAlwaysShowCurrentFigureNodes(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            boolean r1 = r4.showFigureIds
            r0.setShowFigureIDs(r1)
            byte r4 = r4.frameCameraMode
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r4)
        L7c:
            return
    }

    public void redo() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.redo()
            return
    }

    public void removeIndexFromMCCache(int r1) {
            r0 = this;
            org.fortheloss.sticknodes.movieclip.MCCache.removeFromCache(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            r1.setNeedsToBeDrawn()
            return
    }

    public void resetBackupStickfigureTimer() {
            r1 = this;
            r0 = 0
            r1._backupCreationStickfigureTimer = r0
            return
    }

    public void resetSavePromptTimer() {
            r1 = this;
            r0 = 0
            r1._savePromptTimer = r0
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void resize() {
            r1 = this;
            super.resize()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            if (r0 == 0) goto La
            r0.setNeedsToBeDrawn()
        La:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._createToolsModule
            if (r0 == 0) goto L11
            r0.setNeedsToBeDrawn()
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModule
            if (r0 == 0) goto L18
            r0.setNeedsToBeDrawn()
        L18:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModule
            if (r0 == 0) goto L1f
            r0.setNeedsToBeDrawn()
        L1f:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModule
            if (r0 == 0) goto L26
            r0.setNeedsToBeDrawn()
        L26:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void resume() {
            r4 = this;
            super.resume()
            int r0 = r4._screenState
            r1 = 1
            if (r0 != r1) goto L9
            return
        L9:
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r2 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r3 = 0
            java.lang.Object r0 = r0.get(r1, r2, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r4._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            int r1 = r1.getScreenWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r4._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            float r2 = r2.getWorldWidth()
            float r1 = r1 / r2
            if (r0 == 0) goto L41
            r0.bind()
            r2 = 1082130432(0x40800000, float:4.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            java.lang.String r2 = "u_spread"
            r0.setUniformf(r2, r3)
            java.lang.String r2 = "u_viewportScale"
            r0.setUniformf(r2, r1)
        L41:
            return
    }

    public void setDrawAllNodesOfSelectedFigure(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setAlwaysShowCurrentFigureNodes(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setDrawOnlyMainNodes(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setDrawOnlyMainNodes(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.updateSideDrawTools()
            return
    }

    public void setFilterQuality(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setFiltersQuality(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.onFiltersQualityChanged()
            return
    }

    public void setIsRendering(boolean r1) {
            r0 = this;
            r0._isRendering = r1
            return
    }

    public void setNeighborNodesAffectedByJoins(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setNeighborNodesAffectedByJoins(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setNumNextOnionSkinFrames(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setNumNextOnionSkinFrames(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.flagOnionSkinDirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setNumPrevOnionSkinFrames(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setNumPrevOnionSkinFrames(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.flagOnionSkinDirty()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setOnionSkinInFront(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r2 = r2 ^ 1
            r0.setOnionSkin(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setPlayFullscreen(boolean r3) {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto Lf
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            r0 = 0
            r3.setPlayFullscreen(r0)
            return
        Lf:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setPlayFullscreen(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.onPlayFullscreenChange()
            r0 = 3
            if (r3 == 0) goto L27
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionData
            int r1 = r1.getMode()
            if (r1 != r0) goto L27
            r2.beginPlayingFullscreen()
        L27:
            if (r3 != 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionData
            int r3 = r3.getMode()
            if (r3 != r0) goto L34
            r2.exitPlayingFullscreen()
        L34:
            return
    }

    public void setQuickMenuEnabled(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setQuickMenuEnabled(r2)
            if (r2 == 0) goto Ld
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.showQuickMenu()
            goto L13
        Ld:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r0 = 1
            r2.hideQuickMenu(r0)
        L13:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setSavePromptSeconds(int r2) {
            r1 = this;
            if (r2 > 0) goto L6
            r2 = 0
            r1._savePromptSeconds = r2
            goto L1d
        L6:
            r0 = 3
            if (r2 >= r0) goto Le
            r2 = 1127481344(0x43340000, float:180.0)
            r1._savePromptSeconds = r2
            goto L1d
        Le:
            r0 = 99
            if (r2 <= r0) goto L18
            r2 = 1169793024(0x45b9a000, float:5940.0)
            r1._savePromptSeconds = r2
            goto L1d
        L18:
            int r2 = r2 * 60
            float r2 = (float) r2
            r1._savePromptSeconds = r2
        L1d:
            return
    }

    public void setSessionMode(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setMode(r3)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.onSessionModeChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModule
            r0.onSessionModeChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.onSessionModeChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.onSessionModeChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.onSessionModeChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.setNeedsToBeDrawn()
            r0 = 2
            if (r3 != r0) goto L49
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModule
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            r2.setSessionSelectionToFrameCamera(r1)
        L49:
            r1 = 1
            if (r3 != r1) goto L4f
            java.lang.String r3 = "panning"
            goto L5c
        L4f:
            if (r3 != r0) goto L54
            java.lang.String r3 = "camera"
            goto L5c
        L54:
            r0 = 3
            if (r3 != r0) goto L5a
            java.lang.String r3 = "playing"
            goto L5c
        L5a:
            java.lang.String r3 = "normal"
        L5c:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "current_mode"
            r0.setCrashlyticsKeyString(r1, r3)
            return
    }

    public void setSessionSelectionToFrameCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setCurrentlySelectedToFrameCamera(r3)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = "current_selection"
            java.lang.String r1 = "camera"
            r3.setCrashlyticsKeyString(r0, r1)
            org.fortheloss.sticknodes.animationscreen.PopupText r3 = r2._popupText
            if (r3 == 0) goto L48
            r0 = 0
            r3.setUserObject(r0)
        L48:
            return
    }

    public void setSessionSelectionToFrameData(org.fortheloss.sticknodes.data.IFrameData r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModule
            r0.clearSoundSearchFilter()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModule
            r0.clearSoundSearchFilter()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setCurrentlySelectedToFrameData(r3)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = "current_selection"
            java.lang.String r1 = "frame"
            r3.setCrashlyticsKeyString(r0, r1)
            org.fortheloss.sticknodes.animationscreen.PopupText r3 = r2._popupText
            if (r3 == 0) goto L52
            r0 = 0
            r3.setUserObject(r0)
        L52:
            return
    }

    public void setSessionSelectionToMC(org.fortheloss.sticknodes.movieclip.MCReference r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setCurrentlySelectedToMC(r4)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "current_selection"
            java.lang.String r2 = "movieclip"
            r0.setCrashlyticsKeyString(r1, r2)
            r3.showPopupText(r4)
            return
    }

    public void setSessionSelectionToNode(org.fortheloss.sticknodes.stickfigure.INode r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            java.lang.String r1 = "current_selection"
            if (r0 == 0) goto L1c
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.setCurrentlySelectedToStickNode(r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            r3.showPopupText(r4)
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = "sticknode"
            r4.setCrashlyticsKeyString(r1, r0)
            goto L4b
        L1c:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r0 == 0) goto L36
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            org.fortheloss.sticknodes.sprite.SpriteNode r4 = (org.fortheloss.sticknodes.sprite.SpriteNode) r4
            r0.setCurrentlySelectedToSpriteNode(r4)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "spritenode"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r4.getSpriteReference()
            r3.showPopupText(r4)
            goto L4b
        L36:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            org.fortheloss.sticknodes.movieclip.MCNode r4 = (org.fortheloss.sticknodes.movieclip.MCNode) r4
            r0.setCurrentlySelectedToMCNode(r4)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "mcnode"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.movieclip.MCReference r4 = r4.getMCReference()
            r3.showPopupText(r4)
        L4b:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r3._animateToolsModule
            r4.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModule
            r4.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r3._movieclipToolsModule
            r4.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModule
            r4.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            r4.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r3._animateToolsModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r3._movieclipToolsModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModule
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModule
            r4.setNeedsToBeDrawn()
            return
    }

    public void setSessionSelectionToNothing() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setCurrentlySelectedToNothing()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "current_selection"
            java.lang.String r2 = "nothing"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r3._popupText
            if (r0 == 0) goto L48
            r1 = 0
            r0.setUserObject(r1)
        L48:
            return
    }

    public void setSessionSelectionToSprite(org.fortheloss.sticknodes.sprite.SpriteRef r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setCurrentlySelectedToSprite(r4)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "current_selection"
            java.lang.String r2 = "sprite"
            r0.setCrashlyticsKeyString(r1, r2)
            r3.showPopupText(r4)
            return
    }

    public void setSessionSelectionToStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setCurrentlySelectedToStickfigure(r4)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "current_selection"
            java.lang.String r2 = "stickfigure"
            r0.setCrashlyticsKeyString(r1, r2)
            r3.showPopupText(r4)
            return
    }

    public void setSessionSelectionToTextFieldBox(org.fortheloss.sticknodes.TextfieldBox r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setCurrentlySelectedToTextFieldBox(r3)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = "current_selection"
            java.lang.String r1 = "textfield"
            r3.setCrashlyticsKeyString(r0, r1)
            org.fortheloss.sticknodes.animationscreen.PopupText r3 = r2._popupText
            if (r3 == 0) goto L48
            r0 = 0
            r3.setUserObject(r0)
        L48:
            return
    }

    public void setShowCreationDrawOrder(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowCreationDrawOrder(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.updateSideDrawTools()
            return
    }

    public void setShowCreationStaticNodes(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowCreationStaticNodes(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModule
            r2.updateSideDrawTools()
            return
    }

    public void setShowFigureIDs(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowFigureIDs(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setShowFilters(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setFilterShowingState(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.onFilterShowingStateChanged()
            return
    }

    public void setShowGuides(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowGuides(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setShowIdPopup(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowIdPopup(r2)
            if (r2 == 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.PopupText r0 = r1._popupText
            if (r0 != 0) goto Lf
            r1.addPopupText()
            goto L1b
        Lf:
            if (r2 != 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.PopupText r2 = r1._popupText
            if (r2 == 0) goto L1b
            r2.dispose()
            r2 = 0
            r1._popupText = r2
        L1b:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setShowNeighborNodes(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Lf
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setShowNeighborNodesCreative(r3)
            goto L14
        Lf:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setShowNeighborNodes(r3)
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            return
    }

    public void setShowOutline(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Lf
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setShowOutlineCreative(r3)
            goto L14
        Lf:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setShowOutline(r3)
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            return
    }

    public void setShowQuickResizeTool(byte r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            r0.setShowQuickResizeTool(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r0 = 0
            r1 = 1
            r3.showQuickResizeTool(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModule
            r3.setNeedsToBeDrawn()
            return
    }

    public void setShowStageBox(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowStageBox(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.setNeedsToBeDrawn()
            return
    }

    public void setToAnimateScreen(boolean r6, boolean r7) {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L37
            r5._fboEffectActive = r1
            r5._fboEffectTimer = r0
            r6 = 1050253722(0x3e99999a, float:0.3)
            r5._fboEffectSeconds = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r2 = 1065772646(0x3f866666, float:1.05)
            r3 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r2, r3)
            r5._fboEffectScaleStartEnd = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r6.<init>(r3, r3)
            r5._fboEffectAlphaStartEnd = r6
            com.badlogic.gdx.math.Vector2 r2 = r5._fboEffectScaleStartEnd
            float r2 = r2.x
            r5._fboEffectScale = r2
            float r6 = r6.x
            r5._fboEffectAlpha = r6
            com.badlogic.gdx.math.Interpolation$BounceOut r6 = com.badlogic.gdx.math.Interpolation.bounceOut
            r5._fboEffectInterpolation = r6
        L37:
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionData
            int r6 = r6.getScreen()
            r2 = 2
            if (r6 != r2) goto L6b
            if (r7 == 0) goto L60
            org.fortheloss.sticknodes.data.SessionData r7 = r5._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MovieclipScreenExitAction> r3 = org.fortheloss.sticknodes.data.useractions.MovieclipScreenExitAction.class
            java.lang.Object r7 = r7.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.MovieclipScreenExitAction r7 = (org.fortheloss.sticknodes.data.useractions.MovieclipScreenExitAction) r7
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r5._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r3.getMCMovieclipSourceBeingEdited()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r5._framesModule
            int r4 = r4.getCurrentFrameIndex()
            r7.initialize(r3, r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r5._sessionData
            r3.addUserAction(r7)
        L60:
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r1
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r7 = r5._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = r7.getMCMovieclipSourceBeingEdited()
            org.fortheloss.sticknodes.movieclip.MCCache.updateCacheOf(r7)
        L6b:
            org.fortheloss.sticknodes.data.SessionData r7 = r5._sessionData
            r1 = 0
            r7.setUndoRedoMode(r1)
            r5.setSessionScreen(r1)
            r5.setSessionMode(r1)
            r5.setSessionSelectionToNothing()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r5._framesModule
            org.fortheloss.sticknodes.data.ProjectData r1 = r5._projectData
            r7.setFramesContainer(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r5._framesModule
            org.fortheloss.sticknodes.data.IFrameData r7 = r7.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r7 = (org.fortheloss.sticknodes.data.FrameData) r7
            if (r6 != r2) goto L90
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModule
            r6.setToRememberedScrollXAmount()
        L90:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModule
            java.util.ArrayList r1 = r7.getDrawableFigures()
            r6.setFigures(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModule
            java.util.ArrayList r7 = r7.getTextfieldBoxes()
            r6.setTextfieldBoxes(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModule
            r6.flagOnionSkinDirty()
            r5._backupCreationStickfigureTimer = r0
            return
    }

    public void setToCreateScreen(org.fortheloss.sticknodes.stickfigure.Stickfigure r8, int r9) {
            r7 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r7._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            org.fortheloss.sticknodes.data.SessionData r0 = r7._sessionData
            boolean r0 = r0.getNerdModeEnabled()
            r2 = 0
            if (r0 != 0) goto L3a
            boolean r0 = r7._firstTimeCreationMode
            if (r0 == 0) goto L3a
            r7._firstTimeCreationMode = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog
            r0.<init>(r7)
            java.lang.String r3 = "nodesAndLagTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r5 = 400(0x190, float:5.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "nodesAndLagInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r5, r4)
            r0.initialize(r3, r4)
            r7.addDialogToStage(r0)
        L3a:
            org.fortheloss.sticknodes.animationscreen.TooltipManager r0 = r7._tooltipManager
            r3 = 0
            if (r0 == 0) goto L44
            r0.dispose()
            r7._tooltipManager = r3
        L44:
            r7._fboEffectActive = r1
            r0 = 0
            r7._fboEffectTimer = r0
            r4 = 1050253722(0x3e99999a, float:0.3)
            r7._fboEffectSeconds = r4
            com.badlogic.gdx.math.Vector2 r4 = new com.badlogic.gdx.math.Vector2
            r5 = 1065772646(0x3f866666, float:1.05)
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r5, r6)
            r7._fboEffectScaleStartEnd = r4
            com.badlogic.gdx.math.Vector2 r4 = new com.badlogic.gdx.math.Vector2
            r4.<init>(r6, r6)
            r7._fboEffectAlphaStartEnd = r4
            com.badlogic.gdx.math.Vector2 r5 = r7._fboEffectScaleStartEnd
            float r5 = r5.x
            r7._fboEffectScale = r5
            float r4 = r4.x
            r7._fboEffectAlpha = r4
            com.badlogic.gdx.math.Interpolation$BounceOut r4 = com.badlogic.gdx.math.Interpolation.bounceOut
            r7._fboEffectInterpolation = r4
            org.fortheloss.sticknodes.data.SessionData r4 = r7._sessionData
            r4.setUndoRedoMode(r1)
            r7.setSessionScreen(r1)
            r7.setSessionMode(r2)
            r7.setSessionSelectionToNothing()
            org.fortheloss.sticknodes.data.SessionData r4 = r7._sessionData
            r4.setDrawOnlyMainNodes(r2)
            org.fortheloss.sticknodes.data.SessionData r4 = r7._sessionData
            r4.setShowCreationStaticNodes(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r7._sessionData
            r1.setShowCreationDrawOrder(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r7._sessionData
            r1.setNodeHighlightMode(r2)
            if (r8 != 0) goto La5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r8.<init>()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r8.getMainNode()
            r4 = 1120403456(0x42c80000, float:100.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r6 = 1107296256(0x42000000, float:32.0)
            r1.addChildNode(r4, r5, r6, r2)
        La5:
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectData
            int r2 = r1.canvasWidth
            float r2 = (float) r2
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            int r1 = r1.canvasHeight
            float r1 = (float) r1
            float r1 = r1 * r4
            r8.setPosition(r2, r1)
            r7.setSessionSelectionToStickfigure(r8)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r7._createToolsModule
            r1.setCreatedStickfigure(r8)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r8 = r7._createToolsModule
            r8.setFromScreen(r9)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r8 = r7._createToolsModule
            r8.updateNodeCount()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r7._canvasModule
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r9 = r7._createToolsModule
            java.util.ArrayList r9 = r9.getFigureArray()
            r8.setFigures(r9)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r7._canvasModule
            r8.setTextfieldBoxes(r3)
            r7._backupCreationStickfigureTimer = r0
            return
    }

    public void setToMovieclipScreen(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7, int r8, boolean r9) {
            r6 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto La
            return
        La:
            org.fortheloss.sticknodes.animationscreen.TooltipManager r0 = r6._tooltipManager
            r2 = 0
            if (r0 == 0) goto L14
            r0.dispose()
            r6._tooltipManager = r2
        L14:
            r0 = 1
            r6._fboEffectActive = r0
            r3 = 0
            r6._fboEffectTimer = r3
            r3 = 1050253722(0x3e99999a, float:0.3)
            r6._fboEffectSeconds = r3
            com.badlogic.gdx.math.Vector2 r3 = new com.badlogic.gdx.math.Vector2
            r4 = 1065772646(0x3f866666, float:1.05)
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r5)
            r6._fboEffectScaleStartEnd = r3
            com.badlogic.gdx.math.Vector2 r3 = new com.badlogic.gdx.math.Vector2
            r3.<init>(r5, r5)
            r6._fboEffectAlphaStartEnd = r3
            com.badlogic.gdx.math.Vector2 r4 = r6._fboEffectScaleStartEnd
            float r4 = r4.x
            r6._fboEffectScale = r4
            float r3 = r3.x
            r6._fboEffectAlpha = r3
            com.badlogic.gdx.math.Interpolation$BounceOut r3 = com.badlogic.gdx.math.Interpolation.bounceOut
            r6._fboEffectInterpolation = r3
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionData
            int r3 = r3.getScreen()
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionData
            r5 = 0
            r4.setUndoRedoMode(r5)
            r6.setSessionScreen(r1)
            r6.setSessionMode(r5)
            r6.setSessionSelectionToNothing()
            if (r7 == 0) goto L5f
            int r4 = r7.getLibraryID()
            if (r4 >= 0) goto L5e
            goto L5f
        L5e:
            r0 = 0
        L5f:
            if (r3 != 0) goto L92
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r6._framesModule
            r4.rememberScrollXAmount()
            if (r7 != 0) goto L6d
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            r7.<init>()
        L6d:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r6._movieclipToolsModule
            r4.setCreatedMovieclip(r7)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r6._framesModule
            r4.setFramesContainer(r7)
            if (r8 < 0) goto L7e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r6._framesModule
            r4.goToFrame(r8)
        L7e:
            if (r9 == 0) goto L92
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionData
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MovieclipScreenEnterAction> r5 = org.fortheloss.sticknodes.data.useractions.MovieclipScreenEnterAction.class
            java.lang.Object r4 = r4.getUserAction(r5)
            org.fortheloss.sticknodes.data.useractions.MovieclipScreenEnterAction r4 = (org.fortheloss.sticknodes.data.useractions.MovieclipScreenEnterAction) r4
            r4.initialize(r7, r8)
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            r7.addUserAction(r4)
        L92:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r6._framesModule
            org.fortheloss.sticknodes.data.IFrameData r7 = r7.getCurrentFrame()
            org.fortheloss.sticknodes.data.MCFrameData r7 = (org.fortheloss.sticknodes.data.MCFrameData) r7
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r6._canvasModule
            java.util.ArrayList r7 = r7.getDrawableFigures()
            r8.setFigures(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r6._canvasModule
            r7.setTextfieldBoxes(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r6._canvasModule
            r7.flagOnionSkinDirty()
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            boolean r7 = r7.getNerdModeEnabled()
            if (r7 != 0) goto Ld7
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            int r7 = r7.getNoticeCountMcEditing()
            if (r7 >= r1) goto Ld7
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionData
            r7.incrementNoticeCountMcEditing()
            if (r3 != 0) goto Ld7
            if (r0 != 0) goto Ld7
            if (r9 == 0) goto Ld7
            java.lang.String r7 = "editingMCTitle"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r8 = "editingMCInfo"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r6.showErrorDialog(r7, r8)
        Ld7:
            r6.setSessionSelectionToNothing()
            return
    }

    public void showAndroidOpenWithMessage() {
            r5 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r0 == r1) goto L15
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 == r1) goto L15
            return
        L15:
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            org.fortheloss.framework.Assets r1 = r5._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.androidFilesOpenWithTexture
            com.badlogic.gdx.files.FileHandle r1 = r1.getPathFromResolutionFolder(r2)
            r0.<init>(r1)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r1 = r1.getPreferences(r2)
            r2 = 0
            java.lang.String r3 = "androidOpenWithMessageDismissed"
            boolean r2 = r1.getBoolean(r3, r2)
            if (r2 != 0) goto L5d
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "okayDoNotShowAgain"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r2.put(r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$2 r3 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$2
            r3.<init>(r5, r5, r1, r0)
            java.lang.String r1 = "androidFilesOpenWithTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r4 = "androidFilesOpenWithMessage"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3.initialize(r1, r4, r0, r2)
            r5.addDialogToStage(r3)
        L5d:
            return
    }

    public void showArrows() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModule
            r0.showArrows()
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r1._viewOptionsMenu
            r0.updateTexts()
            return
    }

    public void showChangelog() {
            r9 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto Le
            java.lang.String r1 = "Stick Nodes Pro "
            goto L10
        Le:
            java.lang.String r1 = "Stick Nodes "
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "4.2.5"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "changelogTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1, r0)
            java.lang.String r1 = "changelogInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            boolean r2 = org.fortheloss.sticknodes.App.isInternationalUI()
            if (r2 == 0) goto L3b
            java.lang.String r2 = "-"
            java.lang.String r3 = "\n\n-"
            goto L3f
        L3b:
            java.lang.String r2 = "- "
            java.lang.String r3 = "\n\n- "
        L3f:
            java.lang.String r4 = "changelog424_12"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ""
            r5.append(r6)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_1"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_2"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_3"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_4"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_5"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_6"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_7"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_8"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_9"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            double r4 = java.lang.Math.random()
            r6 = 4596373779801702400(0x3fc99999a0000000, double:0.20000000298023224)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L156
            int r4 = org.fortheloss.sticknodes.App.language_id
            if (r4 != 0) goto L156
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "Removed Herobrine"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L156:
            java.lang.String r4 = "changelog424_10"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r4 = "changelog424_11"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            org.fortheloss.sticknodes.animationscreen.dialogs.ChangelogDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ChangelogDialog
            r3.<init>(r9)
            r4 = 0
            r3.initialize(r0, r1, r2, r4)
            r9.addDialogToStage(r3)
            return
    }

    public void showCredits() {
            r3 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 1
            int r0 = r0.get(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Created by Ralph Damiano of ForTheLoss Games, Inc\nWebsite: sticknodes.com\nTwitter: x.com/FTLRalph\nYoutube: youtube.com/FTLRalph\nCreated with LibGDX and RoboVM in Java.\nCopyright 2014 - "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ". All rights reserved.\n\nStickfigure credits\n===================\nRalph Damiano: Stickfigure\nSean Byrnes: Block Head, Cat, Cha Fighter, Floor\nAdrielfit: Iron Man, Spider Man\nBenCo: Background (Kitchen), Cop Car\nPsycho M: Creeper, Sasuke\nBlast Animations: Goku\nBlast Animations/Burst Animations: Vegeta\nGentlemen: Background (City)\nSpider Man Anims: Batman\nBerke381: Pistol\nHyper Tiger: Stickfigure (Girl)\nNobody (Aeries): Gradient Ball\nTuna: Classic Stickfigure\nDBZ StickNodes Animation: Naruto\nEpitaph: Pikachu\nStickion: Police Hat\nJordan Anims: Stickfigure (Base)\nRayden Anims: Background (Shock)\nUnknown: Stegosaurus\n\nMovieclip credits\n===================\n@wasteoftime: Action Lines\n@vamz: Electricity, Ground Dust\n@tastylemon16: Fire, Hit, Sparks\n@pnasty235animss: Forcefield\n@infiniteguess: Rain\n@auto-angel: Speed Zoom\n@vihack20: SSJ Aura\n@flashlockanims: SSJB Aura\n@ralph: Snow Tho\n\nLanguage credits\n=============\nSpanish: Heckray\nFilipino: Squi, (originally: AxZel)\nFrench: DmLan\nJapanese: Zordoron_Rez\nPortuguese: Ronny Anims, (originally: Daniel)\nRussian: Haunted One\nTurkish: Berke381\n\nSound credits\n=============\nSounds are from multiple sources including:\nSonniss.com 10GB Free Audio Pack\nGenerdyn (99Sounds.org)\nMichael Baradari and Jute (OpenGameArt.org)\nFindSounds.com\nPepper from Hyun's Dojo\nToei Animation (DBZ sound effects)\nYasumasa Koyama, sounds ripped by \"Jojo's Bizarre Sound Design\" on YT\n\nSpecial thanks\n==============\nSean Byrnes for being Australian and the butt of all upside-down jokes.\nPeter Bone for Pivot, the inspiration for Stick Nodes.\nChimdi O for the \"country balls\" on the language screen.\nAll the beta testers from the super-secret SN beta-testing discord server.\nArcionek for the SN Dark Skin.\nArcionek for the _Stickfigure (IK).nodes figure.\nArcionek for reducing my life expectancy.\nJackFly and Blanzi for the rate image/splash screen background.\nAlso Arcionek for constantly passive-aggressively belittling me into adding many of the features SN has today.\nAll the regulars on the SN website that don't cause drama.\nAll the regulars on the SN website that do cause drama.\nThe amazing translators that love translation homework apparently.\nGigan's mom.\nSpidöh Man.\nYou, for reading the credits.\nAlso the Stick Nodes demon is still fake.\nEdit 2024: It's still fake."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Stick Nodes®"
            r3.showErrorDialog(r1, r0)
            return
    }

    public void showErrorDialog(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog
            r0.<init>(r1)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void showExitDialog() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ExitDialog r0 = r1._exitDialogRef
            if (r0 == 0) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.dialogs.ExitDialog r0 = r1._exitDialogRef
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L17
            return
        L17:
            org.fortheloss.sticknodes.animationscreen.dialogs.ExitDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExitDialog
            r0.<init>(r1)
            r1._exitDialogRef = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.dialogs.ExitDialog r0 = r1._exitDialogRef
            r1.addDialogToStage(r0)
            return
    }

    public void showFileRenameDialog(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.files.FileHandle r3, org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r4) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$3 r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$3
            r0.<init>(r1, r1, r4)
            r0.initialize(r2, r3)
            r1.addDialogToStage(r0)
            return
    }

    public void showFrameContextMenu(org.fortheloss.sticknodes.data.IFrameData r8, float r9, float r10) {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0 = r7._frameContextMenu
            if (r0 != 0) goto L1f
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getFrameContextMenuWindowStyle()
            r0.<init>(r7, r1)
            r7._frameContextMenu = r0
            org.fortheloss.framework.Assets r1 = r7._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            java.lang.Object r1 = r1.get(r2, r3, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            r0.initialize(r1)
        L1f:
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0 = r7._frameContextMenu
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L2c
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0 = r7._frameContextMenu
            r0.remove()
        L2c:
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r1 = r7._frameContextMenu
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r7._stageRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r7._framesModule
            r3 = r8
            r5 = r9
            r6 = r10
            r1.show(r2, r3, r4, r5, r6)
            return
    }

    public void showMagnifier() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionData
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L20
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectData
            boolean r1 = r0.hasShownMagnifierMessage
            if (r1 != 0) goto L20
            r1 = 1
            r0.hasShownMagnifierMessage = r1
            java.lang.String r0 = "aboutMagnifierTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "aboutMagnifierInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r2.showErrorDialog(r0, r1)
        L20:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModule
            r0.showMagnifier()
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r2._viewOptionsMenu
            r0.updateTexts()
            return
    }

    public void showMovieclipImportListEditorDialog(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectData
            r0.<init>(r2, r3, r1)
            r0.initialize()
            r2.addDialogToStage(r0)
            return
    }

    public void showMovieclipRenameDialog(int r3, org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$5 r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$5
            r0.<init>(r2, r2, r3, r4)
            org.fortheloss.sticknodes.data.ProjectData r4 = r2._projectData
            r1 = 1
            r0.initialize(r1, r4, r3)
            r2.addDialogToStage(r0)
            return
    }

    public void showPreviewMovieclipDialog(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewMovieclipDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreviewMovieclipDialog
            r0.<init>(r1)
            r0.initialize(r2)
            r1.addDialogToStage(r0)
            return
    }

    public void showPreviewSoundDialog(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSoundDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSoundDialog
            r0.<init>(r1)
            r0.initialize(r2)
            r1.addDialogToStage(r0)
            return
    }

    public void showPreviewSpriteDialog(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSpriteDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSpriteDialog
            r0.<init>(r1)
            r0.initialize(r2)
            r1.addDialogToStage(r0)
            return
    }

    public void showPreviewStickfigureDialog(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog
            r0.<init>(r1)
            r0.initialize(r2)
            r1.addDialogToStage(r0)
            return
    }

    public void showPreviewStickfigureDialog(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog
            r0.<init>(r1)
            r0.initialize(r2)
            r1.addDialogToStage(r0)
            return
    }

    public void showSpriteImportListEditorDialog(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L10
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            goto L11
        L10:
            r0 = 0
        L11:
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectData
            r1.<init>(r3, r4, r2)
            r1.initialize(r0)
            r3.addDialogToStage(r1)
            return
    }

    public void showSpriteRenameDialog(int r3, org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$6 r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$6
            r0.<init>(r2, r2, r3, r4)
            org.fortheloss.sticknodes.data.ProjectData r4 = r2._projectData
            r1 = 2
            r0.initialize(r1, r4, r3)
            r2.addDialogToStage(r0)
            return
    }

    public void showStickfigureImportListEditorDialog(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L10
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3._movieclipToolsModule
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.getMCMovieclipSourceBeingEdited()
            goto L11
        L10:
            r0 = 0
        L11:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectData
            r1.<init>(r3, r4, r2)
            r1.initialize(r0)
            r3.addDialogToStage(r1)
            return
    }

    public void showStickfigureRenameDialog(int r3, org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen$4 r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen$4
            r0.<init>(r2, r2, r3, r4)
            org.fortheloss.sticknodes.data.ProjectData r4 = r2._projectData
            r1 = 0
            r0.initialize(r1, r4, r3)
            r2.addDialogToStage(r0)
            return
    }

    public void showSubmitStickfigureFormDialog(boolean r4) {
            r3 = this;
            r0 = 1
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.hasShownGuidlines = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r3._animateToolsModule
            r4 = r4 ^ r0
            r1.<init>(r3, r2, r4)
            org.fortheloss.framework.Assets r4 = r3._assetsRef
            r1.initialize(r4)
            r3.addDialogToStage(r1)
            return
    }

    public void showViewOptions() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r5._viewOptionsMenu
            if (r0 != 0) goto L26
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getFrameContextMenuWindowStyle()
            r0.<init>(r5, r1)
            r5._viewOptionsMenu = r0
            org.fortheloss.framework.Assets r1 = r5._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            java.lang.Object r1 = r1.get(r2, r3, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r5._stageRef
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r5._viewOptionsMenu
            r0.updateTexts()
        L26:
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r5._viewOptionsMenu
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L33
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r5._viewOptionsMenu
            r0.remove()
        L33:
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r5._viewOptionsMenu
            float r0 = r0.getWidth()
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionData
            boolean r1 = r1.getIsLeftHandMode()
            if (r1 == 0) goto L45
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
        L45:
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r1 = r5._viewOptionsMenu
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r5._stageRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r5._framesModule
            float r3 = r3.getX()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r5._framesModule
            float r4 = r4.getWidth()
            float r3 = r3 + r4
            float r3 = r3 - r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r5._stageRef
            float r0 = r0.getHeight()
            r1.show(r2, r3, r0)
            return
    }

    public void showWarningDeleteFigureFromLibrary(int r4, org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r5) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.DeleteFigureFromLibraryWarningDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.DeleteFigureFromLibraryWarningDialog
            r0.<init>(r3)
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectData
            org.fortheloss.framework.Assets r2 = r3._assetsRef
            r0.initialize(r1, r2, r4, r5)
            r3.addDialogToStage(r0)
            return
    }

    public void showWarningDeleteFigureFromLibrary(int r4, org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r5) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.DeleteFigureFromLibraryWarningDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.DeleteFigureFromLibraryWarningDialog
            r0.<init>(r3)
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectData
            org.fortheloss.framework.Assets r2 = r3._assetsRef
            r0.initialize(r1, r2, r4, r5)
            r3.addDialogToStage(r0)
            return
    }

    public void showWarningDeleteFigureFromLibrary(int r4, org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r5) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.DeleteFigureFromLibraryWarningDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.DeleteFigureFromLibraryWarningDialog
            r0.<init>(r3)
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectData
            org.fortheloss.framework.Assets r2 = r3._assetsRef
            r0.initialize(r1, r2, r4, r5)
            r3.addDialogToStage(r0)
            return
    }

    public void showZoomButtons(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.setShowZoomButtons(r2)
            if (r2 == 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.ZoomButtons r2 = r1._zoomButtons
            if (r2 == 0) goto Lc
            return
        Lc:
            org.fortheloss.sticknodes.animationscreen.ZoomButtons r2 = new org.fortheloss.sticknodes.animationscreen.ZoomButtons
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModule
            r2.<init>(r1, r0)
            r1._zoomButtons = r2
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            r0.addActor(r2)
            goto L26
        L1b:
            org.fortheloss.sticknodes.animationscreen.ZoomButtons r2 = r1._zoomButtons
            if (r2 != 0) goto L20
            return
        L20:
            r2.dispose()
            r2 = 0
            r1._zoomButtons = r2
        L26:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModule
            r2.onShowZoomButtons()
            return
    }

    public void spriteImported() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            r0.spriteImported()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            r0.stickfigureImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModule
            r0.spriteImported()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModule
            r0.stickfigureImported()
            return
    }

    public void startNewProject() {
            r1 = this;
            r0 = 0
            r1.startNewProject(r0)
            return
    }

    public void startNewProject(boolean r4) {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "AnimationScreen.startNewProject()"
            r0.setCrashlyticsKeyString(r1, r2)
            r3._flagUnloadAssetsOnDispose = r4
            r4 = 1
            r3._flagStartNewProject = r4
            com.badlogic.gdx.scenes.scene2d.Group r4 = r3._groupModules
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
            return
    }

    public void stopAnimation() {
            r1 = this;
            r0 = 0
            r1.stopAnimation(r0)
            return
    }

    public void stopAnimation(int r6) {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            int r0 = r0.getMode()
            r2 = 3
            r3 = 0
            if (r0 == r2) goto L66
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionData
            int r0 = r0.getScreen()
            if (r0 != 0) goto L60
            if (r6 <= r1) goto L60
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModule
            org.fortheloss.sticknodes.data.IFrameData r6 = r6.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            org.fortheloss.sticknodes.animationscreen.FrameCamera r6 = r6.getFrameCamera()
            float r0 = r6.getCameraScale()
            float r2 = r6.getCameraOffsetX()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r5._canvasModule
            float r3 = r3.getWidth()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r3 = r3 * r0
            float r2 = r2 + r3
            float r6 = r6.getCameraOffsetY()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r5._canvasModule
            float r3 = r3.getHeight()
            float r3 = r3 * r4
            float r3 = r3 * r0
            float r6 = r6 + r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            r4 = 1112014848(0x42480000, float:50.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r5._canvasModule
            r3.resetZoomValue(r0, r2, r6, r1)
            goto Ld2
        L60:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModule
            r6.resetZoom(r3)
            goto Ld2
        L66:
            org.fortheloss.sticknodes.animationscreen.ZoomButtons r6 = r5._zoomButtons
            if (r6 == 0) goto L6d
            r6.setEnabled(r1)
        L6d:
            boolean r6 = r5._delayedFrameIsAnimatingMCs
            if (r6 == 0) goto L7e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModule
            org.fortheloss.sticknodes.data.IFrameData r6 = r6.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            r6.movieclipsAnimatingDuringDelayFinished()
            r5._delayedFrameIsAnimatingMCs = r3
        L7e:
            boolean r6 = r5._delayedFrameCameraIsMovingToNextFrame
            if (r6 == 0) goto L9b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModule
            org.fortheloss.sticknodes.data.IFrameData r6 = r6.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            java.util.ArrayList r0 = r6.getDrawableFigures()
            java.util.ArrayList r2 = r6.getTextfieldBoxes()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r6 = r6.getFrameCamera()
            r6.removeAppliedMoveDuringDelay(r0, r2)
            r5._delayedFrameCameraIsMovingToNextFrame = r3
        L9b:
            r5.setSessionMode(r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModule
            org.fortheloss.sticknodes.data.IFrameData r0 = r5._frameBeforePlayingRef
            r6.goToFrame(r0, r3)
            r5.setSessionSelectionToNothing()
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionData
            r6.setDrawOnlyMainNodes(r3)
            r5.onFrameChange(r3)
            org.fortheloss.sticknodes.data.ProjectData r6 = r5._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r6 = r6.librarySoundDatas
            int r6 = r6.size()
            int r6 = r6 - r1
        Lb9:
            if (r6 < 0) goto Lcd
            org.fortheloss.sticknodes.data.ProjectData r0 = r5._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            java.lang.Object r0 = r0.get(r6)
            org.fortheloss.sticknodes.data.SoundData r0 = (org.fortheloss.sticknodes.data.SoundData) r0
            com.badlogic.gdx.audio.Sound r0 = r0.sound
            r0.stop()
            int r6 = r6 + (-1)
            goto Lb9
        Lcd:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModule
            r6.resetZoom(r1)
        Ld2:
            return
    }

    @Override // org.fortheloss.framework.ISaveMediaToGalleryDelegate
    public void success(int r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.lang.String r2 = r1._filenameJustFinishedExporting
            r0 = 0
            r1.showFinishedExportingDialog(r2, r0)
            goto L18
        L9:
            r0 = 1
            if (r2 != r0) goto L12
            java.lang.String r2 = r1._filenameJustFinishedExporting
            r1.showFinishedExportingDialog(r2, r0)
            goto L18
        L12:
            java.lang.String r2 = r1._filenameJustFinishedExporting
            r0 = 2
            r1.showFinishedExportingDialog(r2, r0)
        L18:
            return
    }

    public void toggleHighlightNodes() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            short r0 = r0.getNodeHighlightMode()
            r1 = 1
            if (r0 != 0) goto Lf
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setNodeHighlightMode(r1)
            goto L27
        Lf:
            r2 = 2
            if (r0 != r1) goto L18
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r0.setNodeHighlightMode(r2)
            goto L27
        L18:
            if (r0 != r2) goto L21
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r1 = 3
            r0.setNodeHighlightMode(r1)
            goto L27
        L21:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionData
            r1 = 0
            r0.setNodeHighlightMode(r1)
        L27:
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0 = r3._viewOptionsMenu
            r0.updateTexts()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModule
            r0.setNeedsToBeDrawn()
            return
    }

    public void undo() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            r0.undo()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void unloadAssets() {
            r7 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r1 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r2 = com.badlogic.gdx.graphics.Texture.class
            super.unloadAssets()
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.easterEggAtlas
            r5 = 1
            boolean r3 = r3.isLoaded(r4, r0, r5)
            if (r3 == 0) goto L1b
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.easterEggAtlas
            r3.unload(r4, r5)
        L1b:
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas2
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.qrtAtlas
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.drawToolsAtlas
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.colorPickerAtlas
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.exportingAnimationAtlas
            r3.unload(r4, r5)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            r6 = 0
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderArgbAndUnpremultiply
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderArgb
            r3.unload(r4, r6)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 == 0) goto L104
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderOutline
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderAllColor
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderInvertColor
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderDropShadowHBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderDropShadowVBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderDropShadowNoBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderHBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderVBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderHBlurInvert
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderHBlurAll
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderVBlurInvert
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderVBlurAll
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderMotionBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderMotionBlurInvert
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderMotionBlurAll
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirection
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionInvert
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionAll
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderHGlow
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderVGlow
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderGaussianBlur
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderPixelate
            r3.unload(r4, r6)
        L104:
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.shaderRemoveColor
            r3.unload(r4, r6)
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntDejavuSansCondensed
            boolean r3 = r3.isLoaded(r4, r1, r5)
            if (r3 == 0) goto L11c
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntDejavuSansCondensed
            r3.unload(r4, r5)
        L11c:
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedBig
            boolean r3 = r3.isLoaded(r4, r1, r5)
            if (r3 == 0) goto L12d
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedBig
            r3.unload(r4, r5)
        L12d:
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedInput
            boolean r3 = r3.isLoaded(r4, r1, r5)
            if (r3 == 0) goto L13e
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedInput
            r3.unload(r4, r5)
        L13e:
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            boolean r1 = r3.isLoaded(r4, r1, r5)
            if (r1 == 0) goto L14f
            org.fortheloss.framework.Assets r1 = r7._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            r1.unload(r3, r5)
        L14f:
            org.fortheloss.framework.Assets r1 = r7._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            r1.unload(r3, r5)
            org.fortheloss.framework.Assets r1 = r7._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntWatermarkDejavuSansCondensed
            r1.unload(r3, r6)
            org.fortheloss.framework.Assets r1 = r7._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.proFiltersAtlas
            boolean r0 = r1.isLoaded(r3, r0, r5)
            if (r0 == 0) goto L16e
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proFiltersAtlas
            r0.unload(r1, r5)
        L16e:
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdMP4Texture
            boolean r0 = r0.isLoaded(r1, r2, r5)
            if (r0 == 0) goto L17f
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdMP4Texture
            r0.unload(r1, r5)
        L17f:
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdSoundsTexture
            boolean r0 = r0.isLoaded(r1, r2, r5)
            if (r0 == 0) goto L190
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdSoundsTexture
            r0.unload(r1, r5)
        L190:
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAmazonTexture
            boolean r0 = r0.isLoaded(r1, r2, r5)
            if (r0 == 0) goto L1a1
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAmazonTexture
            r0.unload(r1, r5)
        L1a1:
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAppStoreTexture
            boolean r0 = r0.isLoaded(r1, r2, r5)
            if (r0 == 0) goto L1b2
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAppStoreTexture
            r0.unload(r1, r5)
        L1b2:
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreGooglePlayTexture
            boolean r0 = r0.isLoaded(r1, r2, r5)
            if (r0 == 0) goto L1c3
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreGooglePlayTexture
            r0.unload(r1, r5)
        L1c3:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void update(float r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            super.update(r27)
            int r2 = r0._screenState
            if (r2 != 0) goto Lb40
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.Desktop
            r4 = 1
            if (r2 != r3) goto L22
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r5 = 131(0x83, float:1.84E-43)
            boolean r2 = r2.isKeyJustPressed(r5)
            if (r2 == 0) goto L22
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r4
        L22:
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getMode()
            r5 = 3
            if (r2 != r5) goto L3f
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getScreen()
            if (r2 != 0) goto L39
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r0._animateToolsModule
            r2.act(r1)
            goto L4b
        L39:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r0._movieclipToolsModule
            r2.act(r1)
            goto L4b
        L3f:
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            if (r2 == 0) goto L4b
            r26.updateMemoryStats(r27)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            r2.act(r1)
        L4b:
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            if (r2 != r3) goto L56
            r26.debugUpdate(r27)
        L56:
            float r2 = r0._savePromptSeconds
            r3 = 1127481344(0x43340000, float:180.0)
            r6 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto Lbb
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getScreen()
            if (r2 != 0) goto Lbb
            boolean r2 = r0._isExportingGIF
            if (r2 != 0) goto Lbb
            boolean r2 = r0._isExportingMP4
            if (r2 != 0) goto Lbb
            boolean r2 = r0._isExportingPNG
            if (r2 != 0) goto Lbb
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r0._activeDialogs
            int r2 = r2.size()
            if (r2 != 0) goto Lbb
            float r2 = r0._savePromptTimer
            float r2 = r2 + r1
            r0._savePromptTimer = r2
            float r3 = r0._savePromptSeconds
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto Lbb
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getMode()
            if (r2 == r5) goto Lbb
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r0._activeDialogs
            int r2 = r2.size()
            if (r2 != 0) goto Lbb
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            if (r2 == 0) goto Lbb
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getKeyboardFocus()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getTouchArea()
            if (r2 != r3) goto Lbb
            org.fortheloss.sticknodes.animationscreen.dialogs.SavePromptDialog r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.SavePromptDialog
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r0._animateToolsModule
            org.fortheloss.sticknodes.data.SessionData r7 = r0._sessionData
            long r7 = r7.getLastSaveMillis()
            r2.<init>(r0, r3, r7)
            r2.initialize()
            r0.addDialogToStage(r2)
            r0._savePromptTimer = r6
        Lbb:
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getScreen()
            if (r2 != r4) goto Lf9
            boolean r2 = r0._backupCreationStickfigureEnabled
            if (r2 == 0) goto Lf9
            float r2 = r0._backupCreationStickfigureTimer
            float r2 = r2 + r1
            r0._backupCreationStickfigureTimer = r2
            r3 = 1133903872(0x43960000, float:300.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lf9
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r0._activeDialogs
            int r2 = r2.size()
            if (r2 > 0) goto Lf9
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            boolean r2 = r2.isTouched()
            if (r2 != 0) goto Lf9
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r0._createToolsModule
            int r2 = r2.getPolyfillState()
            if (r2 != 0) goto Lf9
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r0._createToolsModule
            boolean r2 = r2.userIsTestingSmartStretch()
            if (r2 != 0) goto Lf9
            r0._backupCreationStickfigureTimer = r6
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r0._createToolsModule
            r2.backupStickfigure()
        Lf9:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r0._activeDialogs
            int r2 = r2.size()
            if (r2 <= 0) goto L123
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r2 = r0._activeDialogs
            int r2 = r2.size()
            int r2 = r2 - r4
        L108:
            if (r2 < 0) goto L123
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r3 = r0._activeDialogs
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r3 = (org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper) r3
            boolean r7 = r3.isReadyToBeDisposed()
            if (r7 == 0) goto L120
            r3.dispose()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper> r3 = r0._activeDialogs
            r3.remove(r2)
        L120:
            int r2 = r2 + (-1)
            goto L108
        L123:
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r2 = r0._frameContextMenu
            if (r2 == 0) goto L132
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
            if (r2 == 0) goto L132
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu r2 = r0._frameContextMenu
            r2.act(r1)
        L132:
            org.fortheloss.sticknodes.animationscreen.TooltipManager r2 = r0._tooltipManager
            r3 = 0
            if (r2 == 0) goto L149
            r2.act(r1)
            org.fortheloss.sticknodes.animationscreen.TooltipManager r2 = r0._tooltipManager
            boolean r2 = r2.isComplete()
            if (r2 == 0) goto L149
            org.fortheloss.sticknodes.animationscreen.TooltipManager r2 = r0._tooltipManager
            r2.dispose()
            r0._tooltipManager = r3
        L149:
            boolean r2 = r0._isExportingGIF
            r7 = 6
            java.lang.String r10 = "animationExportFailedInfo2"
            java.lang.String r11 = "animationExportFailedTitle"
            java.lang.String r12 = "exportCancelledInfo"
            java.lang.String r13 = "exportCancelledTitle"
            r14 = 2
            r8 = 0
            r15 = 0
            if (r2 == 0) goto L22c
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r2 = r0._threadedGifExportLooper
            int r2 = r2.update()
            if (r2 <= 0) goto L21f
            if (r2 != r4) goto L1dd
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r2 = r0._threadedGifExportLooper
            java.lang.String r2 = r2.getFilename()
            r0._filenameJustFinishedExporting = r2
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r10 = org.fortheloss.sticknodes.App.exportsPath
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r11 = r0._threadedGifExportLooper
            java.lang.String r11 = r11.getFilename()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = ".gif"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r2.saveImageToGallery(r10, r0)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r10.frames
            int r10 = r10.size()
            double r10 = (double) r10
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            java.lang.String r11 = "gif_export"
            java.lang.String r12 = "gif exported, num frames"
            r2.analyticsSendValue(r11, r12, r10)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            int r10 = r10.fps
            double r12 = (double) r10
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "gif exported, fps"
            r2.analyticsSendValue(r11, r12, r10)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            boolean r10 = r10.tweeningEnabled
            if (r10 == 0) goto L1be
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L1bf
        L1be:
            r12 = r8
        L1bf:
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "gif exported, is tweened"
            r2.analyticsSendValue(r11, r12, r10)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            boolean r10 = r2.tweeningEnabled
            if (r10 == 0) goto L1fc
            org.fortheloss.framework.IPlatform r10 = org.fortheloss.sticknodes.App.platform
            int r2 = r2.numTweenedFrames
            double r12 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "gif exported, num tweened frames"
            r10.analyticsSendValue(r11, r12, r2)
            goto L1fc
        L1dd:
            if (r2 != r14) goto L1eb
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            r0.showErrorDialog(r2, r10)
            goto L1fc
        L1eb:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = "GIF"
            r10[r15] = r11
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r12, r10)
            r0.showErrorDialog(r2, r10)
        L1fc:
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            r2.hideImmediately()
            r0._exportProgressDialogRef = r3
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r4
            org.fortheloss.sticknodes.movieclip.MCCache.rebuildFBOs()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r15
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r2.enableQuickResizeTool(r4)
            org.fortheloss.sticknodes.App.vibrate(r7)
            r0._isExportingGIF = r15
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r2 = r0._threadedGifExportLooper
            r2.dispose()
            r0._threadedGifExportLooper = r3
            goto L36b
        L21f:
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r7 = r0._threadedGifExportLooper
            float r7 = r7.getPercentComplete()
            r2.setPercent(r7)
            goto L36b
        L22c:
            boolean r2 = r0._isExportingMP4
            if (r2 == 0) goto L303
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r2 = r0._threadedMP4ExportLooper
            int r2 = r2.update()
            if (r2 == 0) goto L2f7
            r0._isExportingMP4 = r15
            if (r2 != r4) goto L2b5
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r2 = r0._threadedMP4ExportLooper
            java.lang.String r2 = r2.getFilename()
            r0._filenameJustFinishedExporting = r2
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r10 = org.fortheloss.sticknodes.App.exportsPath
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r11 = r0._threadedMP4ExportLooper
            java.lang.String r11 = r11.getFilename()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = ".mp4"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r2.saveVideoToGallery(r10, r0)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r10.frames
            int r10 = r10.size()
            double r10 = (double) r10
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            java.lang.String r11 = "mp4_export"
            java.lang.String r12 = "mp4 exported, num frames"
            r2.analyticsSendValue(r11, r12, r10)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            int r10 = r10.fps
            double r12 = (double) r10
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "mp4 exported, fps"
            r2.analyticsSendValue(r11, r12, r10)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectData
            boolean r10 = r10.tweeningEnabled
            if (r10 == 0) goto L296
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L297
        L296:
            r12 = r8
        L297:
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "mp4 exported, is tweened"
            r2.analyticsSendValue(r11, r12, r10)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            boolean r10 = r2.tweeningEnabled
            if (r10 == 0) goto L2d4
            org.fortheloss.framework.IPlatform r10 = org.fortheloss.sticknodes.App.platform
            int r2 = r2.numTweenedFrames
            double r12 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "mp4 exported, num tweened frames"
            r10.analyticsSendValue(r11, r12, r2)
            goto L2d4
        L2b5:
            if (r2 != r14) goto L2c3
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            r0.showErrorDialog(r2, r10)
            goto L2d4
        L2c3:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = "MP4"
            r10[r15] = r11
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r12, r10)
            r0.showErrorDialog(r2, r10)
        L2d4:
            r0._isExportingMP4 = r15
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r2 = r0._threadedMP4ExportLooper
            r2.dispose()
            r0._threadedMP4ExportLooper = r3
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r4
            org.fortheloss.sticknodes.movieclip.MCCache.rebuildFBOs()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r15
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r2.enableQuickResizeTool(r4)
            org.fortheloss.sticknodes.App.vibrate(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            r2.hideImmediately()
            r0._exportProgressDialogRef = r3
            goto L36b
        L2f7:
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r7 = r0._threadedMP4ExportLooper
            float r7 = r7.getPercentComplete()
            r2.setPercent(r7)
            goto L36b
        L303:
            boolean r2 = r0._isExportingPNG
            if (r2 == 0) goto L36b
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r2 = r0._threadedPNGExportLooper
            int r2 = r2.update()
            if (r2 == 0) goto L360
            r0._isExportingMP4 = r15
            if (r2 != r4) goto L31f
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r2 = r0._threadedPNGExportLooper
            java.lang.String r2 = r2.getFilename()
            r0._filenameJustFinishedExporting = r2
            r0.showFinishedExportingDialog(r2, r14)
            goto L33e
        L31f:
            if (r2 != r14) goto L32d
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            r0.showErrorDialog(r2, r10)
            goto L33e
        L32d:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = "PNG"
            r10[r15] = r11
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r12, r10)
            r0.showErrorDialog(r2, r10)
        L33e:
            r0._isExportingPNG = r15
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r2 = r0._threadedPNGExportLooper
            r2.dispose()
            r0._threadedPNGExportLooper = r3
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r4
            org.fortheloss.sticknodes.movieclip.MCCache.rebuildFBOs()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.GAUSSIAN_BLUR_FLAG = r15
            org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY = r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModule
            r2.enableQuickResizeTool(r4)
            org.fortheloss.sticknodes.App.vibrate(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            r2.hideImmediately()
            r0._exportProgressDialogRef = r3
            goto L36b
        L360:
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r2 = r0._exportProgressDialogRef
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r7 = r0._threadedPNGExportLooper
            float r7 = r7.getPercentComplete()
            r2.setPercent(r7)
        L36b:
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionData
            int r2 = r2.getMode()
            if (r2 != r5) goto L9b7
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r2.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r2.frames
            int r10 = r10.size()
            boolean r10 = r2.getTweeningActuallyEnabled(r10)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r11 = r2.frames
            int r11 = r11.size()
            if (r11 != r4) goto L3a8
            boolean r11 = r2.tweeningEnabled
            if (r11 == 0) goto L3a8
            int r11 = r2.fps
            r12 = 30
            if (r11 > r12) goto L3a8
            boolean r11 = r2 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r11 == 0) goto L3a8
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r11 = r2.frames
            java.lang.Object r11 = r11.get(r15)
            org.fortheloss.sticknodes.data.FrameData r11 = (org.fortheloss.sticknodes.data.FrameData) r11
            boolean r11 = r11.isDelayed()
            if (r11 == 0) goto L3a8
            r10 = 1
        L3a8:
            int r11 = r2.fps
            int r12 = r2.numTweenedFrames
            if (r10 == 0) goto L3bd
            int r13 = r12 + 1
            int r13 = r13 * r11
            r14 = 60
            if (r13 <= r14) goto L3b9
            int r14 = r14 / r11
            int r12 = r14 + (-1)
        L3b9:
            int r13 = r12 + 1
            int r11 = r11 * r13
        L3bd:
            double r13 = (double) r11
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r16 / r13
            double r5 = r0._timePassed
            double r3 = (double) r1
            double r5 = r5 + r3
            r0._timePassed = r5
        L3c8:
            boolean r3 = r0._waitingOnDelayedFrame
            if (r3 == 0) goto L42c
            boolean r3 = r0._delayedFrameIsWobbling
            if (r3 != 0) goto L3de
            boolean r3 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r3 != 0) goto L3de
            boolean r3 = r0._delayedFrameIsAnimatingMCs
            if (r3 != 0) goto L3de
            double r3 = r0._playingKeyframeDelay
            double r13 = java.lang.Math.max(r13, r3)
        L3de:
            double r3 = r0._timePassed
            double r5 = r0._playingKeyframeDelay
            int r19 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r19 < 0) goto L42c
            double r3 = r3 - r5
            r0._timePassed = r3
            boolean r3 = r0._delayedFrameIsAnimatingMCs
            if (r3 == 0) goto L403
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            r0._frameToRestoreAnimatedDuringDelayMCsRef = r3
            r3.movieclipsAnimatingDuringDelayJumpToKeyframe()
            org.fortheloss.sticknodes.data.FrameData r3 = r0._frameToRestoreAnimatedDuringDelayMCsRef
            java.util.ArrayList r3 = r3.getDrawableFigures()
            r0.checkMCsForSounds(r3)
        L403:
            boolean r3 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r3 == 0) goto L41e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r4 = r3.getDrawableFigures()
            java.util.ArrayList r5 = r3.getTextfieldBoxes()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r3.getFrameCamera()
            r3.removeAppliedMoveDuringDelay(r4, r5)
        L41e:
            r0._playingKeyframeDelay = r8
            r0._waitingOnDelayedFrame = r15
            r0._delayedFrameIsWobbling = r15
            r0._delayedFrameCameraIsMovingToNextFrame = r15
            r0._timeElapsedSinceDelay = r8
            r0._delayInitialSeconds = r8
            r3 = 1
            goto L42d
        L42c:
            r3 = 0
        L42d:
            double r4 = r0._timePassed
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L435
            if (r3 == 0) goto L9b7
        L435:
            boolean r6 = r0._waitingOnDelayedFrame
            if (r6 == 0) goto L443
            double r7 = r0._playingKeyframeDelay
            double r7 = r7 - r4
            r0._playingKeyframeDelay = r7
            double r7 = r0._timeElapsedSinceDelay
            double r7 = r7 + r4
            r0._timeElapsedSinceDelay = r7
        L443:
            if (r3 != 0) goto L448
            double r4 = r4 - r13
            r0._timePassed = r4
        L448:
            if (r6 == 0) goto L572
            r3 = 0
            r0._timePassed = r3
            double r3 = r0._timeElapsedSinceDelay
            double r5 = r0._delayInitialSeconds
            double r3 = java.lang.Math.min(r3, r5)
            r0._timeElapsedSinceDelay = r3
            boolean r3 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r3 == 0) goto L4b5
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r24 = r3.getDrawableFigures()
            java.util.ArrayList r25 = r3.getTextfieldBoxes()
            org.fortheloss.sticknodes.PlaybackRepeatManager r4 = r0._playbackRepeatManager
            int r4 = r4.getGoBackFrames()
            if (r4 >= 0) goto L479
            org.fortheloss.sticknodes.data.FrameData r4 = r3.getNextFrame()
            goto L498
        L479:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r4.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r0._framesModule
            int r5 = r5.getCurrentFrameIndex()
            org.fortheloss.sticknodes.PlaybackRepeatManager r6 = r0._playbackRepeatManager
            int r6 = r6.getGoBackFrames()
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r15, r5)
            java.lang.Object r4 = r4.get(r5)
            org.fortheloss.sticknodes.data.FrameData r4 = (org.fortheloss.sticknodes.data.FrameData) r4
        L498:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r0._canvasModule
            org.fortheloss.sticknodes.animationscreen.FrameCamera r19 = r5.getPlayingFrameCamera()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r21 = r4.getFrameCamera()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r0._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef
            double r5 = r0._timeElapsedSinceDelay
            double r7 = r0._delayInitialSeconds
            double r5 = r5 / r7
            float r5 = (float) r5
            com.badlogic.gdx.math.Interpolation r23 = r3.getCameraMoveDuringDelayInterpolation()
            r20 = r4
            r22 = r5
            r19.applyMoveDuringDelay(r20, r21, r22, r23, r24, r25)
        L4b5:
            boolean r3 = r0._delayedFrameIsAnimatingMCs
            if (r3 == 0) goto L56b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r4 = r3.getMovieclipsAnimatingDuringDelayCurrentKeyframe()
            double r5 = r0._timeElapsedSinceDelay
            r19 = r3
            r20 = r5
            r22 = r13
            r24 = r10
            r25 = r12
            r19.movieclipsAnimatingDuringDelayRelativeIncrement(r20, r22, r24, r25)
            java.util.ArrayList r3 = r3.getDrawableFigures()
            int r5 = r4.size()
            r6 = 0
        L4dd:
            if (r6 >= r5) goto L56b
            int r7 = r6 + 1
            java.lang.Object r6 = r4.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r8 = r7 + 1
            java.lang.Object r7 = r4.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r3.get(r6)
            org.fortheloss.sticknodes.movieclip.MCReference r6 = (org.fortheloss.sticknodes.movieclip.MCReference) r6
            int r9 = r6.getCurrentFrameIndex()
            if (r7 != r9) goto L50a
            r20 = r3
            r21 = r4
            r23 = r5
            goto L559
        L50a:
            int r7 = r7 + 1
            r20 = r3
            int r3 = r6.getPlaymode()
            r21 = r4
            r4 = 1
            if (r3 != r4) goto L51c
            int r3 = r6.getNumFrames(r15)
            goto L520
        L51c:
            int r3 = r6.getNumFrames(r4)
        L520:
            if (r7 < r3) goto L523
            r7 = 0
        L523:
            org.fortheloss.sticknodes.data.MCFrameData r4 = r6.getFrameAt(r7)
            int r15 = r4.getSoundToPlayLibraryID()
            if (r15 < 0) goto L553
            float r23 = r6.getVolumeScale()
            r24 = r3
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r3 = r3.librarySoundDatas
            java.lang.Object r3 = r3.get(r15)
            org.fortheloss.sticknodes.data.SoundData r3 = (org.fortheloss.sticknodes.data.SoundData) r3
            com.badlogic.gdx.audio.Sound r3 = r3.sound
            float r15 = r4.getSoundVolume()
            float r15 = r15 * r23
            r23 = r5
            float r5 = r4.getSoundPitch()
            float r4 = r4.getSoundPan()
            r3.play(r15, r5, r4)
            goto L557
        L553:
            r24 = r3
            r23 = r5
        L557:
            if (r7 != r9) goto L563
        L559:
            r6 = r8
            r3 = r20
            r4 = r21
            r5 = r23
            r15 = 0
            goto L4dd
        L563:
            int r7 = r7 + 1
            r5 = r23
            r3 = r24
            r15 = 0
            goto L520
        L56b:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            r3.setNeedsToBeDrawn()
            goto L78c
        L572:
            boolean r3 = r0._playNextKeyframe
            if (r3 != 0) goto L792
            if (r10 != 0) goto L57a
            goto L792
        L57a:
            boolean r3 = r0._playNextTweenedFrame
            if (r3 == 0) goto L78c
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.data.FrameData
            int r5 = r0._playTweenedFrameNumber
            r6 = 1
            if (r5 != r6) goto L701
            org.fortheloss.sticknodes.PlaybackRepeatManager r5 = r0._playbackRepeatManager
            int r5 = r5.getGoBackFrames()
            if (r5 >= 0) goto L5a5
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r5 = r5.getNextFrame()
            if (r5 != 0) goto L5bf
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r2.frames
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5
            goto L5bf
        L5a5:
            r6 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r2.frames
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r0._framesModule
            int r7 = r7.getCurrentFrameIndex()
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r0._playbackRepeatManager
            int r8 = r8.getGoBackFrames()
            int r7 = r7 - r8
            int r7 = java.lang.Math.max(r6, r7)
            java.lang.Object r5 = r5.get(r7)
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5
        L5bf:
            r0._nextFrameForTweeningRef = r5
            java.util.ArrayList<java.lang.Integer> r6 = r0._thisFrameFigureIndices
            r6.clear()
            java.util.ArrayList<java.lang.Integer> r6 = r0._nextFrameFigureIndices
            r6.clear()
            java.util.ArrayList r6 = r3.getDrawableFigures()
            java.util.ArrayList r7 = r5.getDrawableFigures()
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            java.lang.Object r8 = com.badlogic.gdx.utils.Pools.obtain(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r9 = r6.size()
            r15 = 1
            int r9 = r9 - r15
        L5e1:
            if (r9 < 0) goto L62b
            java.lang.Object r18 = r6.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r18 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r18
            boolean r20 = r18.isJoined()
            if (r20 == 0) goto L612
            org.fortheloss.sticknodes.stickfigure.StickNode r18 = r18.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r18 = r18.getStickfigure()
            r20 = r18
            r18 = 0
        L5fb:
            int r21 = r18 + 1
            boolean r15 = r20.isJoined()
            if (r15 == 0) goto L60f
            org.fortheloss.sticknodes.stickfigure.StickNode r15 = r20.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r20 = r15.getStickfigure()
            r18 = r21
            r15 = 1
            goto L5fb
        L60f:
            r15 = r21
            goto L613
        L612:
            r15 = 0
        L613:
            java.lang.Class<org.fortheloss.framework.Int2> r20 = org.fortheloss.framework.Int2.class
            java.lang.Object r20 = com.badlogic.gdx.utils.Pools.obtain(r20)
            r21 = r10
            r10 = r20
            org.fortheloss.framework.Int2 r10 = (org.fortheloss.framework.Int2) r10
            r10.set(r9, r15)
            r8.add(r10)
            int r9 = r9 + (-1)
            r10 = r21
            r15 = 1
            goto L5e1
        L62b:
            r21 = r10
            java.util.Comparator r9 = org.fortheloss.framework.Int2.getComparatorY()
            java.util.Collections.sort(r8, r9)
            int r9 = r8.size()
            r10 = 0
        L639:
            if (r10 >= r9) goto L658
            java.lang.Object r15 = r8.get(r10)
            org.fortheloss.framework.Int2 r15 = (org.fortheloss.framework.Int2) r15
            r20 = r9
            java.util.ArrayList<java.lang.Integer> r9 = r0._thisFrameFigureIndices
            int r1 = r15.x
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.add(r1)
            com.badlogic.gdx.utils.Pools.free(r15)
            int r10 = r10 + 1
            r1 = r27
            r9 = r20
            goto L639
        L658:
            r8.clear()
            com.badlogic.gdx.utils.Pools.free(r8)
            java.util.ArrayList<java.lang.Integer> r1 = r0._thisFrameFigureIndices
            int r1 = r1.size()
            r8 = 0
        L665:
            if (r8 >= r1) goto L6a5
            java.util.ArrayList<java.lang.Integer> r10 = r0._thisFrameFigureIndices
            java.lang.Object r10 = r10.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r10 = r6.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            int r10 = r10.getID()
            int r15 = r7.size()
            r18 = 1
            int r15 = r15 + (-1)
        L685:
            if (r15 < 0) goto L698
            java.lang.Object r20 = r7.get(r15)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r20 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r20
            int r9 = r20.getID()
            if (r9 != r10) goto L695
            r9 = r15
            goto L699
        L695:
            int r15 = r15 + (-1)
            goto L685
        L698:
            r9 = -1
        L699:
            java.util.ArrayList<java.lang.Integer> r10 = r0._nextFrameFigureIndices
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.add(r9)
            int r8 = r8 + 1
            goto L665
        L6a5:
            boolean r1 = r3 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 == 0) goto L6ad
            r1 = r3
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            goto L6ae
        L6ad:
            r1 = 0
        L6ae:
            if (r1 == 0) goto L6bb
            java.util.ArrayList<java.lang.Integer> r6 = r0._thisFrameFigureIndices
            java.util.ArrayList<java.lang.Integer> r7 = r0._nextFrameFigureIndices
            org.fortheloss.sticknodes.data.IFrameData r8 = r0._nextFrameForTweeningRef
            org.fortheloss.sticknodes.data.FrameData r8 = (org.fortheloss.sticknodes.data.FrameData) r8
            r1.prepBeforeInterpolation(r6, r7, r8)
        L6bb:
            int[] r1 = r0._nextFrameTextfieldIndices
            r6 = -1
            java.util.Arrays.fill(r1, r6)
            if (r4 == 0) goto L703
            r1 = r3
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            java.util.ArrayList r1 = r1.getTextfieldBoxes()
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            java.util.ArrayList r5 = r5.getTextfieldBoxes()
            int r6 = r1.size()
            r7 = 1
            int r6 = r6 - r7
        L6d6:
            if (r6 < 0) goto L703
            java.lang.Object r8 = r1.get(r6)
            org.fortheloss.sticknodes.TextfieldBox r8 = (org.fortheloss.sticknodes.TextfieldBox) r8
            int r8 = r8.getID()
            int r9 = r5.size()
            int r9 = r9 - r7
        L6e7:
            if (r9 < 0) goto L6fd
            java.lang.Object r7 = r5.get(r9)
            org.fortheloss.sticknodes.TextfieldBox r7 = (org.fortheloss.sticknodes.TextfieldBox) r7
            int r7 = r7.getID()
            if (r7 != r8) goto L6fa
            int[] r7 = r0._nextFrameTextfieldIndices
            r7[r6] = r9
            goto L6fd
        L6fa:
            int r9 = r9 + (-1)
            goto L6e7
        L6fd:
            int r6 = r6 + (-1)
            r7 = 1
            goto L6d6
        L701:
            r21 = r10
        L703:
            int r1 = r0._playTweenedFrameNumber
            float r1 = (float) r1
            int r5 = r0._numTweenedFramesToPlay
            r6 = 1
            int r5 = r5 + r6
            float r5 = (float) r5
            float r1 = r1 / r5
            if (r4 == 0) goto L74a
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList<java.lang.Integer> r4 = r0._thisFrameFigureIndices
            java.util.ArrayList<java.lang.Integer> r5 = r0._nextFrameFigureIndices
            org.fortheloss.sticknodes.data.IFrameData r6 = r0._nextFrameForTweeningRef
            org.fortheloss.sticknodes.data.FrameData r6 = (org.fortheloss.sticknodes.data.FrameData) r6
            r3.tweenFigures(r4, r5, r6, r1)
            int[] r4 = r0._nextFrameTextfieldIndices
            org.fortheloss.sticknodes.data.IFrameData r5 = r0._nextFrameForTweeningRef
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            r3.tweenTextfieldBoxes(r4, r5, r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r0._canvasModule
            java.util.ArrayList r5 = r3.getTweenedDrawableFigures()
            r4.setFigures(r5)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r0._canvasModule
            java.util.ArrayList r5 = r3.getTextfieldBoxes()
            r6 = 1
            r4.setTextfieldBoxes(r5, r6)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r0._canvasModule
            org.fortheloss.sticknodes.data.IFrameData r5 = r0._nextFrameForTweeningRef
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r3.getTweenedFrameCamera(r1, r5)
            r4.setPlayingFrameCamera(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.setNeedsToBeDrawn()
            goto L770
        L74a:
            r4 = r3
            org.fortheloss.sticknodes.data.MCFrameData r4 = (org.fortheloss.sticknodes.data.MCFrameData) r4
            java.util.ArrayList<java.lang.Integer> r5 = r0._thisFrameFigureIndices
            java.util.ArrayList<java.lang.Integer> r6 = r0._nextFrameFigureIndices
            r7 = 0
            r4.tweenFigures(r5, r6, r1, r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            java.util.ArrayList r3 = r3.getTweenedDrawableFigures()
            r1.setFigures(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r3 = 0
            r1.setTextfieldBoxes(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            r1.setPlayingFrameCamera(r4, r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModule
            r1.setNeedsToBeDrawn()
        L770:
            int r1 = r0._playTweenedFrameNumber
            int r3 = r0._numTweenedFramesToPlay
            if (r1 >= r3) goto L781
            r3 = 0
            r0._playNextKeyframe = r3
            r4 = 1
            r0._playNextTweenedFrame = r4
            int r1 = r1 + 1
            r0._playTweenedFrameNumber = r1
            goto L78e
        L781:
            r3 = 0
            r4 = 1
            r0._playNextKeyframe = r4
            r0._playNextTweenedFrame = r3
            r0._playTweenedFrameNumber = r4
            r0._numTweenedFramesToPlay = r4
            goto L78e
        L78c:
            r21 = r10
        L78e:
            r3 = 0
            goto L9a0
        L792:
            r21 = r10
            boolean r1 = r0._playFirstFrame
            if (r1 != 0) goto L85e
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameToRestoreAnimatedDuringDelayMCsRef
            if (r1 == 0) goto L7a5
            r1.movieclipsAnimatingDuringDelayFinished()
            r1 = 0
            r0._frameToRestoreAnimatedDuringDelayMCsRef = r1
            r1 = 0
            r0._delayedFrameIsAnimatingMCs = r1
        L7a5:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            int r1 = r1.getCurrentFrameIndex()
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            int r3 = r3.getGoBackFrames()
            if (r3 >= 0) goto L7eb
            int r3 = r0._playbackRangeEndFrame
            r4 = 1
            int r3 = r3 - r4
            if (r1 != r3) goto L7cd
            int r1 = r0._playbackRangeGoBackToStartFrame
            if (r1 <= 0) goto L7c5
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            int r1 = r1 + (-1)
            r3.goToFrame(r1)
            goto L7cb
        L7c5:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            r3 = 0
            r1.goToFrame(r3)
        L7cb:
            r1 = 1
            goto L7fd
        L7cd:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            boolean r1 = r1.goToNextFrame()
            if (r1 == 0) goto L7fd
            int r3 = r0._playbackRangeGoBackToStartFrame
            if (r3 <= 0) goto L7fd
            int r4 = r0._playbackRangeEndFrame
            if (r4 == 0) goto L7e3
            int r4 = r4 + (-1)
            int r5 = r0._frameBeforePlayingRefIndex
            if (r4 <= r5) goto L7fd
        L7e3:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            int r3 = r3 + (-1)
            r4.goToFrame(r3)
            goto L7fd
        L7eb:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            int r1 = r1.getCurrentFrameIndex()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            int r1 = r1 - r3
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            r4.goToFrame(r1)
            r1 = 0
        L7fd:
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r0._framesModule
            int r5 = r5.getCurrentFrameIndex()
            r3.calculateNextFrame(r4, r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            int r3 = r3.getCurrentFrameIndex()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r4.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r4.frames
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
            if (r3 != r5) goto L83e
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r4.frames
            int r3 = r3.size()
            if (r3 <= r6) goto L83e
            boolean r3 = r4 instanceof org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            if (r3 == 0) goto L83e
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r4
            boolean r3 = r4.getTweenLoopProtectionEnabled()
            if (r3 == 0) goto L83e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            boolean r1 = r1.goToNextFrame()
        L83e:
            if (r1 == 0) goto L894
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r1.librarySoundDatas
            int r1 = r1.size()
            r3 = 1
            int r1 = r1 - r3
        L84a:
            if (r1 < 0) goto L894
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r3 = r3.librarySoundDatas
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.data.SoundData r3 = (org.fortheloss.sticknodes.data.SoundData) r3
            com.badlogic.gdx.audio.Sound r3 = r3.sound
            r3.stop()
            int r1 = r1 + (-1)
            goto L84a
        L85e:
            r1 = 0
            r0._playFirstFrame = r1
            r3 = 0
            r0._timePassed = r3
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            int r1 = r1.getCurrentFrameIndex()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModule
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r3.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r3.frames
            int r4 = r4.size()
            r5 = 1
            int r4 = r4 - r5
            if (r1 != r4) goto L894
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3.frames
            int r1 = r1.size()
            if (r1 <= r5) goto L894
            boolean r1 = r3 instanceof org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            if (r1 == 0) goto L894
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            boolean r1 = r3.getTweenLoopProtectionEnabled()
            if (r1 == 0) goto L894
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            r1.goToNextFrame()
        L894:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r3 == 0) goto L95f
            r3 = r1
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            boolean r4 = r3.willStopSounds()
            if (r4 == 0) goto L8c5
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r4 = r4.librarySoundDatas
            int r4 = r4.size()
            r5 = 1
            int r4 = r4 - r5
        L8b1:
            if (r4 < 0) goto L8c5
            org.fortheloss.sticknodes.data.ProjectData r5 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r5 = r5.librarySoundDatas
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.data.SoundData r5 = (org.fortheloss.sticknodes.data.SoundData) r5
            com.badlogic.gdx.audio.Sound r5 = r5.sound
            r5.stop()
            int r4 = r4 + (-1)
            goto L8b1
        L8c5:
            boolean r4 = r3.isDelayed()
            if (r4 == 0) goto L91a
            float r4 = r3.getDelaySeconds()
            float r5 = (float) r11
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = r6 / r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L91a
            float r4 = r3.getDelaySeconds()
            double r4 = (double) r4
            r0._playingKeyframeDelay = r4
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r3.getFrameCamera()
            boolean r4 = r4.isWobbling()
            r0._delayedFrameIsWobbling = r4
            boolean r4 = r3.getCameraIsMovingDuringDelay()
            r0._delayedFrameCameraIsMovingToNextFrame = r4
            boolean r4 = r3.movieclipsAnimatingDuringPrepareIfApplicable()
            r0._delayedFrameIsAnimatingMCs = r4
            r4 = 1
            r0._waitingOnDelayedFrame = r4
            r4 = 0
            r0._timeElapsedSinceDelay = r4
            double r4 = r0._playingKeyframeDelay
            r0._delayInitialSeconds = r4
            boolean r4 = r0._delayedFrameCameraIsMovingToNextFrame
            if (r4 == 0) goto L91a
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r0._framesModule
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getNextFrame()
            if (r4 != 0) goto L910
            r4 = 0
            r0._delayedFrameCameraIsMovingToNextFrame = r4
            goto L91a
        L910:
            r4 = 0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = r0._delayedFrameCameraIsMovingToNextFrameCameraInitialCameraRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r6 = r3.getFrameCamera()
            r5.copyFrom(r6, r4)
        L91a:
            int r4 = r3.getSoundToPlayLibraryID()
            if (r4 < 0) goto L93b
            org.fortheloss.sticknodes.data.ProjectData r5 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r5 = r5.librarySoundDatas
            java.lang.Object r4 = r5.get(r4)
            org.fortheloss.sticknodes.data.SoundData r4 = (org.fortheloss.sticknodes.data.SoundData) r4
            com.badlogic.gdx.audio.Sound r4 = r4.sound
            float r5 = r3.getSoundVolume()
            float r6 = r3.getSoundPitch()
            float r7 = r3.getSoundPan()
            r4.play(r5, r6, r7)
        L93b:
            java.util.ArrayList r4 = r3.getDrawableFigures()
            r0.checkMCsForSounds(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r0._canvasModule
            r5.setFigures(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r0._canvasModule
            java.util.ArrayList r5 = r3.getTextfieldBoxes()
            r4.setTextfieldBoxes(r5)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r0._canvasModule
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = r3.getFrameCamera()
            r4.setPlayingFrameCamera(r5, r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            r3.setNeedsToBeDrawn()
            goto L99b
        L95f:
            int r3 = r1.getSoundToPlayLibraryID()
            if (r3 < 0) goto L980
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r4 = r4.librarySoundDatas
            java.lang.Object r3 = r4.get(r3)
            org.fortheloss.sticknodes.data.SoundData r3 = (org.fortheloss.sticknodes.data.SoundData) r3
            com.badlogic.gdx.audio.Sound r3 = r3.sound
            float r4 = r1.getSoundVolume()
            float r5 = r1.getSoundPitch()
            float r6 = r1.getSoundPan()
            r3.play(r4, r5, r6)
        L980:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            java.util.ArrayList r4 = r1.getDrawableFigures()
            r3.setFigures(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            r4 = 0
            r3.setTextfieldBoxes(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            r3.setPlayingFrameCamera(r5, r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r0._canvasModule
            r3.setNeedsToBeDrawn()
        L99b:
            r0.determineHowToPlayFromKeyframe(r1, r2, r12)
            goto L78e
        L9a0:
            int r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r1 <= 0) goto L9b7
            boolean r1 = r0._waitingOnDelayedFrame
            if (r1 != 0) goto L9af
            double r5 = r0._timePassed
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 >= 0) goto L9af
            goto L9b7
        L9af:
            r1 = r27
            r8 = r3
            r10 = r21
            r15 = 0
            goto L3c8
        L9b7:
            boolean r1 = r0._fboEffectActive
            if (r1 == 0) goto La0d
            float r1 = r0._fboEffectTimer
            r2 = r27
            float r1 = r1 + r2
            r0._fboEffectTimer = r1
            float r3 = r0._fboEffectSeconds
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r1, r3)
            r3 = 0
            float r1 = java.lang.Math.max(r3, r1)
            com.badlogic.gdx.math.Interpolation r3 = r0._fboEffectInterpolation
            com.badlogic.gdx.math.Vector2 r4 = r0._fboEffectScaleStartEnd
            float r5 = r4.x
            float r4 = r4.y
            float r3 = r3.apply(r5, r4, r1)
            r0._fboEffectScale = r3
            com.badlogic.gdx.math.Interpolation r3 = r0._fboEffectInterpolation
            com.badlogic.gdx.math.Vector2 r4 = r0._fboEffectAlphaStartEnd
            float r5 = r4.x
            float r4 = r4.y
            float r3 = r3.apply(r5, r4, r1)
            r0._fboEffectAlpha = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto La0f
            r1 = 0
            r0._fboEffectActive = r1
            com.badlogic.gdx.math.Vector2 r1 = r0._fboEffectScaleStartEnd
            float r1 = r1.y
            r0._fboEffectScale = r1
            com.badlogic.gdx.math.Vector2 r1 = r0._fboEffectAlphaStartEnd
            float r1 = r1.y
            r0._fboEffectAlpha = r1
            org.fortheloss.sticknodes.animationscreen.EasterEgg r1 = r0._easterEgg
            if (r1 != 0) goto La0f
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupModules
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r1.setTouchable(r3)
            goto La0f
        La0d:
            r2 = r27
        La0f:
            boolean r1 = r0._isShowingEasterEgg
            if (r1 == 0) goto La5c
            org.fortheloss.sticknodes.animationscreen.EasterEgg r1 = r0._easterEgg
            boolean r1 = r1.isComplete()
            if (r1 == 0) goto La54
            r1 = 0
            r0._isShowingEasterEgg = r1
            org.fortheloss.sticknodes.animationscreen.EasterEgg r1 = r0._easterEgg
            r1.dispose()
            r1 = 0
            r0._easterEgg = r1
            org.fortheloss.framework.Assets r1 = r0._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.easterEggAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            boolean r1 = r1.isLoaded(r2, r3, r4)
            if (r1 == 0) goto La3a
            org.fortheloss.framework.Assets r1 = r0._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.easterEggAtlas
            r1.unload(r2, r4)
        La3a:
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupModules
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r1.setTouchable(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectData
            r3 = 0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r2.getLibraryStickfigure(r3)
            r1.<init>(r2)
            r0.addStickfigure(r1, r4, r3)
            r26.setSessionSelectionToNothing()
            goto La5e
        La54:
            r3 = 0
            r4 = 1
            org.fortheloss.sticknodes.animationscreen.EasterEgg r1 = r0._easterEgg
            r1.act(r2)
            goto La5e
        La5c:
            r3 = 0
            r4 = 1
        La5e:
            boolean r1 = r0._flagBeginMiniGame
            if (r1 == 0) goto La71
            r0._flagBeginMiniGame = r3
            r0._flagUnloadAssetsOnDispose = r4
            org.fortheloss.sticknodes.App r1 = r0._appRef
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r2 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen
            r2.<init>(r1)
            r1.setScreen(r2)
            return
        La71:
            boolean r1 = r0._flagStartNewProject
            if (r1 == 0) goto Lab1
            r0._flagStartNewProject = r3
            org.fortheloss.sticknodes.App.deleteScratchFiles()
            org.fortheloss.sticknodes.data.ProjectData r1 = new org.fortheloss.sticknodes.data.ProjectData
            org.fortheloss.sticknodes.animationscreen.FontLoader r2 = new org.fortheloss.sticknodes.animationscreen.FontLoader
            boolean r3 = org.fortheloss.sticknodes.App.isInternationalUI()
            r2.<init>(r3)
            r1.<init>(r2)
            r1.newProject()
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            boolean r2 = r2.isPro()
            if (r2 == 0) goto Laa5
            boolean r2 = org.fortheloss.sticknodes.App.isParroted
            if (r2 == 0) goto Laa5
            org.fortheloss.sticknodes.App r2 = r0._appRef
            org.fortheloss.sticknodes.TransitionAdScreenForParrots r3 = new org.fortheloss.sticknodes.TransitionAdScreenForParrots
            org.fortheloss.sticknodes.App r4 = r0._appRef
            r5 = 0
            r3.<init>(r4, r1, r5)
            r2.setScreen(r3)
            goto Lab0
        Laa5:
            r5 = 0
            org.fortheloss.sticknodes.App r2 = r0._appRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen
            r3.<init>(r2, r1, r5)
            r2.setScreen(r3)
        Lab0:
            return
        Lab1:
            r5 = 0
            boolean r1 = r0._flagOpenProjectReady
            if (r1 == 0) goto Lae2
            r0._flagOpenProjectReady = r5
            r0._flagUnloadAssetsOnDispose = r5
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto Lad5
            boolean r1 = org.fortheloss.sticknodes.App.isParroted
            if (r1 == 0) goto Lad5
            org.fortheloss.sticknodes.App r1 = r0._appRef
            org.fortheloss.sticknodes.TransitionAdScreenForParrots r2 = new org.fortheloss.sticknodes.TransitionAdScreenForParrots
            org.fortheloss.sticknodes.App r3 = r0._appRef
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectDataToOpenRef
            r2.<init>(r3, r4, r5)
            r1.setScreen(r2)
            goto Lae1
        Lad5:
            org.fortheloss.sticknodes.App r1 = r0._appRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataToOpenRef
            r2.<init>(r1, r3, r5)
            r1.setScreen(r2)
        Lae1:
            return
        Lae2:
            boolean r1 = org.fortheloss.sticknodes.App.BACK_KEY_PRESSED
            if (r1 == 0) goto Lb40
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r5
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            int r1 = r1.getMode()
            r2 = 3
            if (r1 != r2) goto Lb0a
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionData
            boolean r1 = r1.getIsPlayFullscreen()
            if (r1 == 0) goto Lb06
            r0.setPlayFullscreen(r5)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r0._animateToolsModule
            r1.fullscreenChanged()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r0._movieclipToolsModule
            r1.fullscreenChanged()
        Lb06:
            r26.stopAnimation()
            goto Lb40
        Lb0a:
            boolean r1 = r0._isExportingGIF
            if (r1 == 0) goto Lb16
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r1 = r0._threadedGifExportLooper
            if (r1 == 0) goto Lb16
            r1.requestCancel()
            goto Lb40
        Lb16:
            boolean r1 = r0._isExportingMP4
            if (r1 == 0) goto Lb22
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r1 = r0._threadedMP4ExportLooper
            if (r1 == 0) goto Lb22
            r1.requestCancel()
            goto Lb40
        Lb22:
            boolean r1 = r0._isExportingPNG
            if (r1 == 0) goto Lb2e
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r1 = r0._threadedPNGExportLooper
            if (r1 == 0) goto Lb2e
            r1.requestCancel()
            goto Lb40
        Lb2e:
            org.fortheloss.sticknodes.animationscreen.dialogs.IsOpeningDialog r1 = r0._isOpeningDialogRef
            if (r1 == 0) goto Lb3d
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r1.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto Lb3d
            goto Lb40
        Lb3d:
            r26.showExitDialog()
        Lb40:
            return
    }

    public void updateMovieclipLibraryList() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            r0.updateMCLibraryTools()
            return
    }

    public void updateSpriteLibraryList() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            r0.updateSpriteLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModule
            r0.updateSpriteLibraryTools()
            return
    }

    public void updateStickfigureLibraryList() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animateToolsModule
            r0.updateLibraryTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModule
            r0.updateLibraryTools()
            return
    }

    public void writeSessionSaveData(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModule
            int r0 = r0.getCurrentFrameIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModule
            r0.writeSessionData(r2)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsOnlyDrawingMainNodes()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingFigureIDs()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsNormalOnionSkin()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingOutline()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingOutlineCreative()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingNeighborNodes()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingNeighborNodesCreative()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingGuides()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingStageBox()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getNeighborNodesAffectedByJoins()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getAlwaysShowCurrentFigureNodes()
            r2.write(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionData
            boolean r0 = r0.getIsShowingFigureIDs()
            r2.write(r0)
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r2.write(r0)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor1
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor2
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor3
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor4
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor5
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor6
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor7
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            return
    }
}
