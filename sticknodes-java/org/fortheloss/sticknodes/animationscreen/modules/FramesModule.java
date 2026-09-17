package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class FramesModule extends org.fortheloss.sticknodes.animationscreen.modules.Module implements org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _addFrameButton;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private org.fortheloss.framework.Assets _assetsRef;
    private boolean _calculatedScissors;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _copyButton;
    private int _currentFrame;
    private org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer _currentThumbnailContainerRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _deleteFrameButton;
    private boolean _flagIsScrolling;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> _frameThumbnailRefsNewEffectActions;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _innerTable;
    private org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer _movieclipThumbnailContainer;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _outerTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _pasteButton;
    private org.fortheloss.sticknodes.ImageButtonLongPress _playButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu _playContextMenu;
    private org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer _projectThumbnailContainer;
    private int _rememberedProjectCurrentFrame;
    private float _rememberedScrollXAmount;
    private com.badlogic.gdx.math.Rectangle _scissorBounds;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _stopButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _viewOptionsButton;













    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m800$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_framesContainerRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.FramesContainer m801$$Nest$fget_framesContainerRef(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r0._framesContainerRef
            return r0
    }

    /* renamed from: -$$Nest$fget_playContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu m802$$Nest$fget_playContextMenu(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu r0 = r0._playContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_sessionDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.SessionData m803$$Nest$fget_sessionDataRef(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            org.fortheloss.sticknodes.data.SessionData r0 = r0._sessionDataRef
            return r0
    }

    /* renamed from: -$$Nest$monAddFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m804$$Nest$monAddFrameClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            r0.onAddFrameClick()
            return
    }

    /* renamed from: -$$Nest$monCopyFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m805$$Nest$monCopyFrameClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            r0.onCopyFrameClick()
            return
    }

    /* renamed from: -$$Nest$monDeleteFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m806$$Nest$monDeleteFrameClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            r0.onDeleteFrameClick()
            return
    }

    /* renamed from: -$$Nest$monPasteFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m807$$Nest$monPasteFrameClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            r0.onPasteFrameClick()
            return
    }

    /* renamed from: -$$Nest$monPlayClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m808$$Nest$monPlayClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            r0.onPlayClick()
            return
    }

    /* renamed from: -$$Nest$monStopClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m809$$Nest$monStopClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0, int r1) {
            r0.onStopClick(r1)
            return
    }

    /* renamed from: -$$Nest$monViewOptionsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m810$$Nest$monViewOptionsClick(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0) {
            r0.onViewOptionsClick()
            return
    }

    public FramesModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, com.badlogic.gdx.graphics.glutils.FrameBuffer r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._currentFrame = r1
            r0._rememberedProjectCurrentFrame = r1
            r0._calculatedScissors = r1
            r0._flagIsScrolling = r1
            r1 = 0
            r0._rememberedScrollXAmount = r1
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$1
            r1.<init>(r0)
            r0.addListener(r1)
            return
    }

    private void onAddFrameClick() {
            r0 = this;
            r0.addFrame()
            return
    }

    private void onCopyFrameClick() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3.getCurrentFrame()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r3._framesContainerRef
            int r2 = r2.getUID()
            r1.copyFrame(r0, r2)
            return
    }

    private void onDeleteFrameClick() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.deleteFrame(r0, r1)
            return
    }

    private void onPasteFrameClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.pasteFrame()
            return
    }

    private void onPlayClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu r0 = r2._playContextMenu
            r1 = 1
            r0.hide(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.playAnimation()
            return
    }

    private void onStopClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.stopAnimation(r2)
            return
    }

    private void onViewOptionsClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showViewOptions()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r10) {
            r9 = this;
            super.act(r10)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r9._frameThumbnailRefsNewEffectActions
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        Lb:
            r2 = 0
            if (r0 < 0) goto L31
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r3 = r9._frameThumbnailRefsNewEffectActions
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r3 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r3
            float r4 = r3.getNewFrameEffectTimer()
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r10
            float r4 = r4 - r5
            r3.setNewFrameEffectTimer(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r9._frameThumbnailRefsNewEffectActions
            r2.remove(r0)
        L2b:
            r9.setNeedsToBeDrawn()
            int r0 = r0 + (-1)
            goto Lb
        L31:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            boolean r10 = r10.isFlinging()
            r0 = 0
            if (r10 != 0) goto L6a
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            boolean r10 = r10.isPanning()
            if (r10 != 0) goto L6a
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            float r10 = r10.getVisualScrollX()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r9._scrollPane
            float r3 = r3.getScrollX()
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L6a
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            boolean r10 = r10.isDragging()
            if (r10 == 0) goto L5b
            goto L6a
        L5b:
            boolean r10 = r9._flagIsScrolling
            if (r10 == 0) goto L9b
            r9._flagIsScrolling = r0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r10 = r9._currentThumbnailContainerRef
            r10.onlyRenderThirdFrames(r0)
            r9.setNeedsToBeDrawn()
            goto L9b
        L6a:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            float r10 = r10.getScrollX()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r9._scrollPane
            float r3 = r3.getMaxX()
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 >= 0) goto L84
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            float r10 = r10.getScrollX()
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L89
        L84:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            r10.fling(r2, r2, r2)
        L89:
            r9._flagIsScrolling = r1
            r9.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r10 = r9._sessionDataRef
            boolean r10 = r10.getRenderEveryThirdThumbnail()
            if (r10 == 0) goto L9b
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r10 = r9._currentThumbnailContainerRef
            r10.onlyRenderThirdFrames(r1)
        L9b:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r10 = r9._currentThumbnailContainerRef
            int r10 = r10.getShowCurrentFrameSelectionOffscreen()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r2 = r9._currentThumbnailContainerRef
            int r3 = r9._currentFrame
            float r2 = r2.getThumbnailX(r3)
            int r2 = (int) r2
            float r3 = (float) r2
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r4 = r9._currentThumbnailContainerRef
            float r4 = r4.getThumbnailWidth()
            float r3 = r3 + r4
            int r3 = (int) r3
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r4 = r9._currentThumbnailContainerRef
            float r4 = r4.getX()
            int r4 = (int) r4
            r5 = -1
            int r4 = r4 * (-1)
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r9._scrollPane
            float r6 = r6.getWidth()
            float r6 = r6 + r4
            int r6 = (int) r6
            float r3 = (float) r3
            r7 = 1092616192(0x41200000, float:10.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            float r3 = r3 + r8
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto Ld8
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r9._currentThumbnailContainerRef
            r0.setShowCurrentFrameSelectionOffscreen(r5)
            goto Le5
        Ld8:
            if (r2 <= r6) goto Le0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r9._currentThumbnailContainerRef
            r0.setShowCurrentFrameSelectionOffscreen(r1)
            goto Le5
        Le0:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r9._currentThumbnailContainerRef
            r1.setShowCurrentFrameSelectionOffscreen(r0)
        Le5:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r9._currentThumbnailContainerRef
            int r0 = r0.getShowCurrentFrameSelectionOffscreen()
            if (r10 == r0) goto Lf0
            r9.setNeedsToBeDrawn()
        Lf0:
            return
    }

    public int addAutoCameraToFrame(int r10, int r11, boolean r12, boolean r13, short r14, boolean r15) {
            r9 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            r2 = -2
            if (r1 != 0) goto L8
            return r2
        L8:
            r1 = -1
            if (r11 > r10) goto Lc
            return r1
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r11 < r0) goto L15
            return r2
        L15:
            int r0 = r10 + 1
        L17:
            if (r0 >= r11) goto L2e
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            boolean r2 = r2.isAutoCameraOriginFrame()
            if (r2 == 0) goto L2b
            r10 = -3
            return r10
        L2b:
            int r0 = r0 + 1
            goto L17
        L2e:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r10 = r0.get(r10)
            org.fortheloss.sticknodes.data.FrameData r10 = (org.fortheloss.sticknodes.data.FrameData) r10
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r11 = r0.get(r11)
            r4 = r11
            org.fortheloss.sticknodes.data.FrameData r4 = (org.fortheloss.sticknodes.data.FrameData) r4
            boolean r11 = r10.isAutoCameraOriginFrame()
            r0 = 0
            if (r11 == 0) goto L6f
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r11 = r10.getAutoCameraBundle()
            if (r15 == 0) goto L65
            org.fortheloss.sticknodes.data.FrameData r1 = r11.getFrame2()
            int r1 = r9.getFrameIndex(r1)
            boolean r2 = r11.isEaseIn()
            boolean r3 = r11.isEaseOut()
            short r5 = r11.getInterpolationID()
            goto L68
        L65:
            r2 = 0
            r3 = 0
            r5 = 0
        L68:
            r9.deleteAutoCameraFromFrame(r11, r0)
            r11 = r2
            r0 = r3
            r8 = r5
            goto L71
        L6f:
            r11 = 0
            r8 = 0
        L71:
            r2 = r10
            r3 = r9
            r5 = r12
            r6 = r13
            r7 = r14
            r2.setAutoCameraBundle(r3, r4, r5, r6, r7)
            if (r15 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r12 = r9._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AutoCameraAddAction> r13 = org.fortheloss.sticknodes.data.useractions.AutoCameraAddAction.class
            java.lang.Object r12 = r12.getUserAction(r13)
            org.fortheloss.sticknodes.data.useractions.AutoCameraAddAction r12 = (org.fortheloss.sticknodes.data.useractions.AutoCameraAddAction) r12
            if (r1 >= 0) goto L8b
            r12.initialize(r10, r9)
            goto L94
        L8b:
            r2 = r12
            r3 = r10
            r4 = r9
            r5 = r1
            r6 = r0
            r7 = r11
            r2.initialize(r3, r4, r5, r6, r7, r8)
        L94:
            org.fortheloss.sticknodes.data.SessionData r11 = r9._sessionDataRef
            r11.addUserAction(r12)
        L99:
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r10 = r10.getAutoCameraBundle()
            r10.apply()
            r9.setNeedsToBeDrawn()
            r10 = 1
            return r10
    }

    public void addFigureToCameraLock(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8, boolean r9, boolean r10, boolean r11) {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r7._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.IFrameData r0 = r7.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            byte r1 = r8.isLockedToCamera()
            java.lang.String r2 = "cannotLockToCameraErrorTitle"
            if (r1 == 0) goto L32
            if (r9 == 0) goto L20
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r8 = r7._animateToolsModuleRef
            r8.showLockToCameraDialog(r0)
        L20:
            if (r10 != 0) goto L31
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r7._animationScreenRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r10 = "cannotLockToCameraErrorInfo1"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            r8.showErrorDialog(r9, r10)
        L31:
            return
        L32:
            boolean r1 = r8.isJoined()
            if (r1 == 0) goto L51
            if (r9 == 0) goto L3f
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r8 = r7._animateToolsModuleRef
            r8.showLockToCameraDialog(r0)
        L3f:
            if (r10 != 0) goto L50
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r7._animationScreenRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r10 = "cannotLockToCameraErrorInfo2"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            r8.showErrorDialog(r9, r10)
        L50:
            return
        L51:
            boolean r10 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r10 == 0) goto Lb1
            r10 = r8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            boolean r1 = r10.hasJoinAnchorNode()
            if (r1 == 0) goto Lae
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            r1.push(r10)
        L66:
            boolean r10 = r1.empty()
            if (r10 != 0) goto Lb1
            java.lang.Object r10 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            r10.unlockStickNode()
            boolean r2 = r10.hasJoinAnchorNode()
            if (r2 == 0) goto L66
            java.util.ArrayList r10 = r10.getJoinAnchorNodes()
            int r2 = r10.size()
            int r2 = r2 + (-1)
        L85:
            if (r2 < 0) goto L66
            java.lang.Object r3 = r10.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList r3 = r3.getJoinedFigures()
            int r4 = r3.size()
            int r4 = r4 + (-1)
        L97:
            if (r4 < 0) goto Lab
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r6 == 0) goto La8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r1.push(r5)
        La8:
            int r4 = r4 + (-1)
            goto L97
        Lab:
            int r2 = r2 + (-1)
            goto L85
        Lae:
            r10.unlockStickNode()
        Lb1:
            r0.addLockedFigure(r8)
            if (r11 == 0) goto Lc8
            org.fortheloss.sticknodes.data.SessionData r10 = r7._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddCameraFigureLockAction> r11 = org.fortheloss.sticknodes.data.useractions.AddCameraFigureLockAction.class
            java.lang.Object r10 = r10.getUserAction(r11)
            org.fortheloss.sticknodes.data.useractions.AddCameraFigureLockAction r10 = (org.fortheloss.sticknodes.data.useractions.AddCameraFigureLockAction) r10
            r10.initialize(r0, r8)
            org.fortheloss.sticknodes.data.SessionData r8 = r7._sessionDataRef
            r8.addUserAction(r10)
        Lc8:
            if (r9 == 0) goto Lcf
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r8 = r7._animateToolsModuleRef
            r8.showLockToCameraDialog(r0)
        Lcf:
            return
    }

    public void addFrame() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r4._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            r1 = 0
            if (r0 == 0) goto L19
            org.fortheloss.sticknodes.data.FrameData r0 = new org.fortheloss.sticknodes.data.FrameData
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r3 = r4._currentFrame
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            r0.<init>(r2, r1)
            goto L2a
        L19:
            org.fortheloss.sticknodes.data.MCFrameData r0 = new org.fortheloss.sticknodes.data.MCFrameData
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r3 = r4._currentFrame
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.data.MCFrameData r2 = (org.fortheloss.sticknodes.data.MCFrameData) r2
            r0.<init>(r2, r1)
        L2a:
            r1 = 1
            r4.addFrame(r0, r1)
            return
    }

    public void addFrame(org.fortheloss.sticknodes.data.IFrameData r7, boolean r8) {
            r6 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            boolean r0 = r0.canAddFrame(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L33
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r6._animationScreenRef
            java.lang.String r0 = "frameLimitWarningTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            r1 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r2] = r1
            java.lang.String r1 = "frameLimitWarningInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r8.showErrorDialog(r0, r1)
            r7.dispose()
            return
        L33:
            int r0 = r6._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r3 = r3.size()
            int r3 = r3 - r2
            if (r0 != r3) goto L7a
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r3 = r0.size()
            int r3 = r3 - r2
            java.lang.Object r0 = r0.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            r0.setIsLastFrame(r1)
            r7.setIsLastFrame(r2)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            r0.add(r7)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r0 = new org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail
            r0.<init>(r7, r2)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r3 = r6._currentThumbnailContainerRef
            r3.addThumbnail(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r6._scrollPane
            r3.invalidate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r6._scrollPane
            r3.validate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r6._scrollPane
            float r4 = r3.getMaxX()
            r3.setScrollX(r4)
            goto La8
        L7a:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r3 = r6._currentFrame
            int r3 = r3 + r2
            r0.add(r3, r7)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r0 = new org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail
            r0.<init>(r7, r2)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r3 = r6._currentThumbnailContainerRef
            int r4 = r6._currentFrame
            int r4 = r4 + r2
            r3.addThumbnail(r4, r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r6._scrollPane
            r3.invalidate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r6._scrollPane
            r3.validate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r6._scrollPane
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r4 = r6._currentThumbnailContainerRef
            int r5 = r6._currentFrame
            float r4 = r4.getThumbnailX(r5)
            r3.setScrollX(r4)
        La8:
            int r3 = r6._currentFrame
            r4 = -1
            if (r3 != r4) goto Lbd
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            r3.setIsFirstFrame(r1)
            r7.setIsFirstFrame(r2)
        Lbd:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r3 = r6._frameThumbnailRefsNewEffectActions
            r3.add(r0)
            int r0 = r6._currentFrame
            int r0 = r0 + r2
            r6._currentFrame = r0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r3 = r6._currentThumbnailContainerRef
            r3.setCurrentFrame(r0)
            int r0 = r6._currentFrame
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.setNewestFrameIndex(r0, r1)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 == 0) goto L107
            int r0 = r6._currentFrame
            int r0 = r0 - r2
        Lda:
            if (r0 < 0) goto L107
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            boolean r4 = r3.isAutoCameraOriginFrame()
            if (r4 == 0) goto L104
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r3.getAutoCameraBundle()
            org.fortheloss.sticknodes.data.FrameData r0 = r0.getFrame2()
            int r0 = r6.getFrameIndex(r0)
            int r4 = r6._currentFrame
            if (r0 <= r4) goto L107
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r3.getAutoCameraBundle()
            r0.apply()
            goto L107
        L104:
            int r0 = r0 + (-1)
            goto Lda
        L107:
            int r0 = r6._currentFrame
            r3 = 0
            if (r0 != 0) goto L126
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r0 <= r2) goto L124
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r4 = r0.size()
            int r4 = r4 - r2
            java.lang.Object r0 = r0.get(r4)
            goto L12f
        L124:
            r0 = r3
            goto L131
        L126:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r0 = r0 - r2
            java.lang.Object r0 = r4.get(r0)
        L12f:
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
        L131:
            r7.setPreviousFrame(r0)
            int r0 = r6._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r4 = r4.size()
            int r4 = r4 - r2
            if (r0 != r4) goto L154
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r0 <= r2) goto L162
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r1)
            goto L15f
        L154:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r3 = r6._currentFrame
            int r3 = r3 + r2
            java.lang.Object r0 = r0.get(r3)
        L15f:
            r3 = r0
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
        L162:
            r7.setNextFrame(r3)
            boolean r0 = r7 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r0 == 0) goto L16f
            r0 = r7
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            r0.refreshAllMovieclips(r2, r2, r2)
        L16f:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onFrameChange(r1)
            if (r8 == 0) goto L18f
            org.fortheloss.sticknodes.data.SessionData r8 = r6._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameAddAction> r0 = org.fortheloss.sticknodes.data.useractions.FrameAddAction.class
            java.lang.Object r8 = r8.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.FrameAddAction r8 = (org.fortheloss.sticknodes.data.useractions.FrameAddAction) r8
            int r0 = r6._currentFrame
            r8.initialize(r7, r0, r6)
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            r7.addUserAction(r8)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6._animationScreenRef
            r7.onFrameAddDeleteAction()
        L18f:
            r6.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.FramesContainer r7 = r6._framesContainerRef
            boolean r8 = r7 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r8 == 0) goto L1a1
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r7 = r7.size()
            r6.checkAndShowFrameCountWarning(r7, r1)
        L1a1:
            return
    }

    public void addFrameAt(org.fortheloss.sticknodes.data.IFrameData r2, int r3) {
            r1 = this;
            int r3 = r3 + (-1)
            r1._currentFrame = r3
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r1._currentThumbnailContainerRef
            r0.setCurrentFrame(r3)
            r3 = 0
            r1.addFrame(r2, r3)
            return
    }

    public void addTextfieldToCameraLock(org.fortheloss.sticknodes.TextfieldBox r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r3._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.IFrameData r0 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            boolean r1 = r4.isLockedToCamera()
            if (r1 == 0) goto L18
            return
        L18:
            r0.addLockedTextfield(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddCameraTextfieldLockAction> r2 = org.fortheloss.sticknodes.data.useractions.AddCameraTextfieldLockAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.AddCameraTextfieldLockAction r1 = (org.fortheloss.sticknodes.data.useractions.AddCameraTextfieldLockAction) r1
            r1.initialize(r0, r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public boolean addTweenedFrame(int r12, boolean r13, boolean r14, boolean r15) {
            r11 = this;
            int r0 = r11._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r11._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r0 < r1) goto L10
            return r3
        L10:
            int r0 = r11._currentFrame
            int r1 = r0 + 1
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r11._framesContainerRef
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.data.ProjectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            java.lang.Object r0 = r4.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r11._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r6 = r11._currentFrame
            int r6 = r6 + r2
            java.lang.Object r4 = r4.get(r6)
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
            int r6 = r11._currentFrame
            int r6 = r6 + r2
            r7 = 2
            if (r13 == 0) goto L3b
            if (r14 == 0) goto L3b
            if (r12 == r7) goto L39
            if (r12 != r2) goto L3b
        L39:
            r8 = 2
            goto L3c
        L3b:
            r8 = 1
        L3c:
            if (r5 != 0) goto L79
            org.fortheloss.sticknodes.data.MCFrameData r9 = new org.fortheloss.sticknodes.data.MCFrameData
            r10 = r0
            org.fortheloss.sticknodes.data.MCFrameData r10 = (org.fortheloss.sticknodes.data.MCFrameData) r10
            r9.<init>(r10, r3)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r10 = r11._framesContainerRef
            boolean r10 = r10.canAddFrames(r9, r8)
            if (r10 != 0) goto L76
            r9.dispose()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            java.lang.String r13 = "frameLimitWarningTitle"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r15 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r3] = r15
            r15 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r2] = r15
            java.lang.String r15 = "frameLimitWarningInfo"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r15, r14)
            r12.showErrorDialog(r13, r14)
            return r2
        L76:
            r9.dispose()
        L79:
            r9 = 3
            if (r12 != r9) goto L99
            if (r5 == 0) goto L87
            org.fortheloss.sticknodes.data.FrameData r12 = new org.fortheloss.sticknodes.data.FrameData
            r13 = r0
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            r12.<init>(r13, r3)
            goto L8f
        L87:
            org.fortheloss.sticknodes.data.MCFrameData r12 = new org.fortheloss.sticknodes.data.MCFrameData
            r13 = r0
            org.fortheloss.sticknodes.data.MCFrameData r13 = (org.fortheloss.sticknodes.data.MCFrameData) r13
            r12.<init>(r13, r3)
        L8f:
            r13 = 1056964608(0x3f000000, float:0.5)
            r12.tweenEverything(r0, r4, r13)
            r11.addFrame(r12, r3)
            goto L114
        L99:
            if (r12 != r7) goto Ld8
            if (r13 == 0) goto Lb9
            if (r5 == 0) goto La8
            org.fortheloss.sticknodes.data.FrameData r12 = new org.fortheloss.sticknodes.data.FrameData
            r13 = r0
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            r12.<init>(r13, r3)
            goto Lb0
        La8:
            org.fortheloss.sticknodes.data.MCFrameData r12 = new org.fortheloss.sticknodes.data.MCFrameData
            r13 = r0
            org.fortheloss.sticknodes.data.MCFrameData r13 = (org.fortheloss.sticknodes.data.MCFrameData) r13
            r12.<init>(r13, r3)
        Lb0:
            r13 = 1051260355(0x3ea8f5c3, float:0.33)
            r12.tweenEverything(r0, r4, r13)
            r11.addFrame(r12, r3)
        Lb9:
            if (r14 == 0) goto L114
            if (r5 == 0) goto Lc6
            org.fortheloss.sticknodes.data.FrameData r12 = new org.fortheloss.sticknodes.data.FrameData
            r13 = r0
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            r12.<init>(r13, r3)
            goto Lce
        Lc6:
            org.fortheloss.sticknodes.data.MCFrameData r12 = new org.fortheloss.sticknodes.data.MCFrameData
            r13 = r0
            org.fortheloss.sticknodes.data.MCFrameData r13 = (org.fortheloss.sticknodes.data.MCFrameData) r13
            r12.<init>(r13, r3)
        Lce:
            r13 = 1059816735(0x3f2b851f, float:0.67)
            r12.tweenEverything(r0, r4, r13)
            r11.addFrame(r12, r3)
            goto L114
        Ld8:
            if (r13 == 0) goto Lf6
            if (r5 == 0) goto Le5
            org.fortheloss.sticknodes.data.FrameData r12 = new org.fortheloss.sticknodes.data.FrameData
            r13 = r0
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            r12.<init>(r13, r3)
            goto Led
        Le5:
            org.fortheloss.sticknodes.data.MCFrameData r12 = new org.fortheloss.sticknodes.data.MCFrameData
            r13 = r0
            org.fortheloss.sticknodes.data.MCFrameData r13 = (org.fortheloss.sticknodes.data.MCFrameData) r13
            r12.<init>(r13, r3)
        Led:
            r13 = 1036831949(0x3dcccccd, float:0.1)
            r12.tweenEverything(r0, r4, r13)
            r11.addFrame(r12, r3)
        Lf6:
            if (r14 == 0) goto L114
            if (r5 == 0) goto L103
            org.fortheloss.sticknodes.data.FrameData r12 = new org.fortheloss.sticknodes.data.FrameData
            r13 = r0
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13
            r12.<init>(r13, r3)
            goto L10b
        L103:
            org.fortheloss.sticknodes.data.MCFrameData r12 = new org.fortheloss.sticknodes.data.MCFrameData
            r13 = r0
            org.fortheloss.sticknodes.data.MCFrameData r13 = (org.fortheloss.sticknodes.data.MCFrameData) r13
            r12.<init>(r13, r3)
        L10b:
            r13 = 1063675494(0x3f666666, float:0.9)
            r12.tweenEverything(r0, r4, r13)
            r11.addFrame(r12, r3)
        L114:
            if (r15 == 0) goto L12d
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction> r13 = org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction.class
            java.lang.Object r12 = r12.getUserAction(r13)
            org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction r12 = (org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction) r12
            r12.initialize(r1, r8, r11)
            org.fortheloss.sticknodes.data.SessionData r13 = r11._sessionDataRef
            r13.addUserAction(r12)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            r12.onFrameAddDeleteAction()
        L12d:
            int r12 = r11._currentFrame
            int r12 = r12 - r6
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.setNewestFrameIndex(r6, r12)
            return r2
    }

    public boolean addTweenedFrames(int r13, boolean r14) {
            r12 = this;
            int r0 = r12._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r12._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r0 < r1) goto L10
            return r3
        L10:
            int r0 = r12._currentFrame
            int r1 = r0 + 1
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r12._framesContainerRef
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.data.ProjectData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            java.lang.Object r0 = r4.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r12._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r6 = r12._currentFrame
            int r6 = r6 + r2
            java.lang.Object r4 = r4.get(r6)
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
            int r6 = r12._currentFrame
            int r6 = r6 + r2
            if (r5 == 0) goto L3b
            org.fortheloss.sticknodes.data.FrameData r7 = new org.fortheloss.sticknodes.data.FrameData
            r8 = r0
            org.fortheloss.sticknodes.data.FrameData r8 = (org.fortheloss.sticknodes.data.FrameData) r8
            r7.<init>(r8, r3)
            goto L43
        L3b:
            org.fortheloss.sticknodes.data.MCFrameData r7 = new org.fortheloss.sticknodes.data.MCFrameData
            r8 = r0
            org.fortheloss.sticknodes.data.MCFrameData r8 = (org.fortheloss.sticknodes.data.MCFrameData) r8
            r7.<init>(r8, r3)
        L43:
            r8 = 1056964608(0x3f000000, float:0.5)
            r7.tweenEverything(r0, r4, r8)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r8 = r12._framesContainerRef
            boolean r8 = r8.canAddFrames(r7, r13)
            if (r8 != 0) goto L79
            r7.dispose()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r12._animationScreenRef
            java.lang.String r14 = "frameLimitWarningTitle"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            r1 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "frameLimitWarningInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1, r0)
            r13.showErrorDialog(r14, r0)
            return r2
        L79:
            r7.dispose()
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = r13 + 1
            float r8 = (float) r8
            float r7 = r7 / r8
            r8 = r13
            r9 = r7
        L84:
            if (r8 <= 0) goto La3
            if (r5 == 0) goto L91
            org.fortheloss.sticknodes.data.FrameData r10 = new org.fortheloss.sticknodes.data.FrameData
            r11 = r0
            org.fortheloss.sticknodes.data.FrameData r11 = (org.fortheloss.sticknodes.data.FrameData) r11
            r10.<init>(r11, r3)
            goto L99
        L91:
            org.fortheloss.sticknodes.data.MCFrameData r10 = new org.fortheloss.sticknodes.data.MCFrameData
            r11 = r0
            org.fortheloss.sticknodes.data.MCFrameData r11 = (org.fortheloss.sticknodes.data.MCFrameData) r11
            r10.<init>(r11, r3)
        L99:
            r10.tweenEverything(r0, r4, r9)
            r12.addFrame(r10, r3)
            float r9 = r9 + r7
            int r8 = r8 + (-1)
            goto L84
        La3:
            if (r14 == 0) goto Lbc
            org.fortheloss.sticknodes.data.SessionData r14 = r12._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction> r0 = org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction.class
            java.lang.Object r14 = r14.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction r14 = (org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction) r14
            r14.initialize(r1, r13, r12)
            org.fortheloss.sticknodes.data.SessionData r13 = r12._sessionDataRef
            r13.addUserAction(r14)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r12._animationScreenRef
            r13.onFrameAddDeleteAction()
        Lbc:
            int r13 = r12._currentFrame
            int r13 = r13 - r6
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.setNewestFrameIndex(r6, r13)
            return r2
    }

    public void applyAutoCamera(org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r17) {
            r16 = this;
            r0 = r16
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r0._framesContainerRef
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r1 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.FrameData r1 = r17.getFrame1()
            org.fortheloss.sticknodes.data.FrameData r2 = r17.getFrame2()
            int r3 = r0.getFrameIndex(r1)
            int r4 = r0.getFrameIndex(r2)
            com.badlogic.gdx.math.Interpolation r5 = r17.getInterpolation()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getFrameCamera()
            float r6 = r1.getCameraOffsetX()
            float r7 = r1.getCameraOffsetY()
            float r8 = r1.getCameraRotationDeg()
            float r1 = r1.getCameraScale()
            float r9 = r2.getCameraOffsetX()
            float r10 = r2.getCameraOffsetY()
            float r11 = r2.getCameraRotationDeg()
            float r2 = r2.getCameraScale()
            r12 = 1135869952(0x43b40000, float:360.0)
            r13 = 1127481344(0x43340000, float:180.0)
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 >= 0) goto L59
            float r14 = r8 - r11
            float r14 = java.lang.Math.abs(r14)
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 < 0) goto L64
            float r8 = r8 + r12
            goto L64
        L59:
            float r14 = r8 - r11
            float r14 = java.lang.Math.abs(r14)
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 < 0) goto L64
            float r11 = r11 + r12
        L64:
            int r12 = r4 - r3
            r13 = 0
            r14 = 1
            int r3 = r3 + r14
        L69:
            if (r3 >= r4) goto La3
            int r13 = r13 + r14
            float r15 = (float) r13
            float r14 = (float) r12
            float r15 = r15 / r14
            org.fortheloss.sticknodes.animationscreen.FramesContainer r14 = r0._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r14 = r14.frames
            java.lang.Object r14 = r14.get(r3)
            org.fortheloss.sticknodes.data.FrameData r14 = (org.fortheloss.sticknodes.data.FrameData) r14
            org.fortheloss.sticknodes.animationscreen.FrameCamera r14 = r14.getFrameCamera()
            r0 = 1
            r14.setIsAutoCamera(r0)
            float r0 = r5.apply(r6, r9, r15)
            r14.setCameraOffsetX(r0)
            float r0 = r5.apply(r7, r10, r15)
            r14.setCameraOffsetY(r0)
            float r0 = r5.apply(r8, r11, r15)
            r14.setCameraRotation(r0)
            float r0 = r5.apply(r1, r2, r15)
            r14.setCameraScale(r0)
            int r3 = r3 + 1
            r14 = 1
            r0 = r16
            goto L69
        La3:
            r16.setNeedsToBeDrawn()
            return
    }

    public void checkAndShowFrameCountWarning(int r4, boolean r5) {
            r3 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 == 0) goto L6
            if (r4 >= r0) goto L14
        L6:
            if (r4 == r0) goto L14
            r5 = 700(0x2bc, float:9.81E-43)
            if (r4 == r5) goto L14
            r5 = 900(0x384, float:1.261E-42)
            if (r4 < r5) goto L2f
            int r5 = r4 % 100
            if (r5 != 0) goto L2f
        L14:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            java.lang.String r0 = "frameCountWarningTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "frameCountWarningInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4, r1)
            r5.showErrorDialog(r0, r4)
        L2f:
            return
    }

    public void clearFrame(org.fortheloss.sticknodes.data.IFrameData r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r2.clear()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setSessionSelectionToFrameData(r2)
            return
    }

    public void clearSound(org.fortheloss.sticknodes.data.IFrameData r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r0 = -1
            r3.setSoundToPlay(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            r3.setSoundVolume(r0)
            r0 = 0
            r3.setSoundPan(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setSoundPitch(r0)
            r2.setNeedsToBeDrawn()
            return
    }

    public void copySound(org.fortheloss.sticknodes.data.IFrameData r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            r0.setCopiedFrameSoundData(r2)
            return
    }

    public void deleteAutoCameraFromFrame(org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r2._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            if (r4 == 0) goto L1b
            org.fortheloss.sticknodes.data.SessionData r4 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AutoCameraDeleteAction> r0 = org.fortheloss.sticknodes.data.useractions.AutoCameraDeleteAction.class
            java.lang.Object r4 = r4.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.AutoCameraDeleteAction r4 = (org.fortheloss.sticknodes.data.useractions.AutoCameraDeleteAction) r4
            r4.initialize(r3, r2)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r0.addUserAction(r4)
        L1b:
            org.fortheloss.sticknodes.data.FrameData r4 = r3.getFrame1()
            org.fortheloss.sticknodes.data.FrameData r3 = r3.getFrame2()
            r4.deleteAutoCameraBundle()
            int r4 = r2.getFrameIndex(r4)
            int r3 = r2.getFrameIndex(r3)
        L2e:
            int r4 = r4 + 1
            if (r4 >= r3) goto L45
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r2._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r4)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r1 = 0
            r0.setIsAutoCamera(r1)
            goto L2e
        L45:
            r2.setNeedsToBeDrawn()
            return
    }

    public void deleteFrame(boolean r10, boolean r11) {
            r9 = this;
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r0 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            r2 = 1
            if (r1 > r2) goto L1d
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$12 r10 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$12
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r9._animationScreenRef
            r10.<init>(r9, r11)
            r10.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r9._animationScreenRef
            r11.addDialogToStage(r10)
            return
        L1d:
            r1 = -1
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.setNewestFrameIndex(r1)
            int r1 = r9._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            r4 = 0
            if (r10 == 0) goto L3e
            org.fortheloss.sticknodes.data.SessionData r5 = r9._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameDeleteAction> r6 = org.fortheloss.sticknodes.data.useractions.FrameDeleteAction.class
            java.lang.Object r5 = r5.getUserAction(r6)
            org.fortheloss.sticknodes.data.useractions.FrameDeleteAction r5 = (org.fortheloss.sticknodes.data.useractions.FrameDeleteAction) r5
            r5.initialize(r3, r1, r9)
            goto L3f
        L3e:
            r5 = r4
        L3f:
            int r6 = r9._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r7 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            int r7 = r7.size()
            int r7 = r7 - r2
            r8 = 0
            if (r6 != r7) goto L63
            r3.setIsLastFrame(r8)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r7 = r6.size()
            int r7 = r7 + (-2)
            java.lang.Object r6 = r6.get(r7)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            r6.setIsLastFrame(r2)
        L63:
            int r6 = r9._currentFrame
            if (r6 != 0) goto L77
            r3.setIsFirstFrame(r8)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            java.lang.Object r6 = r6.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            r6.setIsFirstFrame(r2)
        L77:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r9._framesContainerRef
            boolean r6 = r6 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r6 == 0) goto L11d
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            boolean r6 = r3.isAutoCameraOriginFrame()
            if (r6 == 0) goto Lb8
            boolean r6 = r3.isAutoCameraEndFrame()
            if (r6 == 0) goto Lb8
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r3.getAutoCameraBundle()
            r9.deleteAutoCameraFromFrame(r1, r10)
            if (r10 == 0) goto La1
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            java.lang.Object r1 = r1.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r1 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r1
            org.fortheloss.sticknodes.data.SessionData r6 = r9._sessionDataRef
            r6.addUserAction(r1)
        La1:
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r3.getLinkedAutoCameraBundle()
            r9.deleteAutoCameraFromFrame(r1, r10)
            if (r5 == 0) goto L11d
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            java.lang.Object r0 = r1.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r0 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            r1.addUserAction(r0)
            goto L11d
        Lb8:
            boolean r6 = r3.isAutoCameraOriginFrame()
            if (r6 == 0) goto Ld5
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r3.getAutoCameraBundle()
            r9.deleteAutoCameraFromFrame(r1, r10)
            if (r5 == 0) goto L11d
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            java.lang.Object r0 = r1.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r0 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            r1.addUserAction(r0)
            goto L11d
        Ld5:
            boolean r6 = r3.isAutoCameraEndFrame()
            if (r6 == 0) goto Lf2
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r3.getLinkedAutoCameraBundle()
            r9.deleteAutoCameraFromFrame(r1, r10)
            if (r5 == 0) goto L11d
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            java.lang.Object r0 = r1.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r0 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            r1.addUserAction(r0)
            goto L11d
        Lf2:
            int r1 = r1 - r2
        Lf3:
            if (r1 < 0) goto L11d
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            boolean r3 = r0.isAutoCameraOriginFrame()
            if (r3 == 0) goto L11a
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r0.getAutoCameraBundle()
            org.fortheloss.sticknodes.data.FrameData r1 = r1.getFrame2()
            int r1 = r9.getFrameIndex(r1)
            int r3 = r9._currentFrame
            if (r1 <= r3) goto L11d
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r0 = r0.getAutoCameraBundle()
            goto L11e
        L11a:
            int r1 = r1 + (-1)
            goto Lf3
        L11d:
            r0 = r4
        L11e:
            if (r5 == 0) goto L125
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            r1.addUserAction(r5)
        L125:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r3 = r9._currentFrame
            r1.remove(r3)
            if (r0 == 0) goto L133
            r0.apply()
        L133:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r9._currentThumbnailContainerRef
            r0.deleteThumbnail()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r9._scrollPane
            r0.invalidate()
            int r0 = r9._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            if (r0 < r1) goto L15a
            org.fortheloss.sticknodes.animationscreen.FramesContainer r11 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r11 = r11.frames
            int r11 = r11.size()
            int r11 = r11 - r2
            r9._currentFrame = r11
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r9._currentThumbnailContainerRef
            r0.setCurrentFrame(r11)
            goto L166
        L15a:
            if (r11 == 0) goto L166
            int r11 = r9._currentFrame
            int r11 = r11 - r2
            r9._currentFrame = r11
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r9._currentThumbnailContainerRef
            r0.setCurrentFrame(r11)
        L166:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r11 = r9._scrollPane
            r11.validate()
            org.fortheloss.sticknodes.animationscreen.FramesContainer r11 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r11 = r11.frames
            int r0 = r9._currentFrame
            java.lang.Object r11 = r11.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r11 = (org.fortheloss.sticknodes.data.IFrameData) r11
            int r0 = r9._currentFrame
            if (r0 != 0) goto L195
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r0 <= r2) goto L193
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            goto L19e
        L193:
            r0 = r4
            goto L1a0
        L195:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r0 = r0 - r2
            java.lang.Object r0 = r1.get(r0)
        L19e:
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
        L1a0:
            r11.setPreviousFrame(r0)
            int r0 = r9._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            int r1 = r1 - r2
            if (r0 != r1) goto L1c3
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r0 <= r2) goto L1d1
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r8)
            goto L1ce
        L1c3:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r9._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r9._currentFrame
            int r1 = r1 + r2
            java.lang.Object r0 = r0.get(r1)
        L1ce:
            r4 = r0
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
        L1d1:
            r11.setNextFrame(r4)
            boolean r0 = r11 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r0 == 0) goto L1de
            r0 = r11
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            r0.refreshAllMovieclips(r2, r2)
        L1de:
            if (r10 == 0) goto L1e5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            r10.onFrameAddDeleteAction()
        L1e5:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            r10.onFrameChange(r8)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            r10.setSessionSelectionToFrameData(r11)
            r9.setNeedsToBeDrawn()
            return
    }

    public void disableAll(boolean r2) {
            r1 = this;
            r0 = 0
            r1.disableAll(r2, r0)
            return
    }

    public void disableAll(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L13
            if (r3 == 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r1._innerTable
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.setColor(r0, r0, r0, r3)
        Ld:
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            goto L1f
        L13:
            if (r3 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r1._innerTable
            r2.setColor(r0, r0, r0, r0)
        L1a:
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r1.setTouchable(r2)
        L1f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.Module, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._assetsRef = r0
            r4._canvasModuleRef = r0
            r4._animateToolsModuleRef = r0
            r4._sessionDataRef = r0
            r4._scrollPane = r0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r4._projectThumbnailContainer
            if (r1 == 0) goto L14
            r1.dispose()
            r4._projectThumbnailContainer = r0
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r4._movieclipThumbnailContainer
            if (r1 == 0) goto L1d
            r1.dispose()
            r4._movieclipThumbnailContainer = r0
        L1d:
            r4._currentThumbnailContainerRef = r0
            r4._frameThumbnailRefsNewEffectActions = r0
            r4._addFrameButton = r0
            r4._deleteFrameButton = r0
            r4._copyButton = r0
            r4._pasteButton = r0
            r4._playButton = r0
            r4._stopButton = r0
            r4._viewOptionsButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu r1 = r4._playContextMenu
            if (r1 == 0) goto L38
            r1.dispose()
            r4._playContextMenu = r0
        L38:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._innerTable
            if (r1 == 0) goto L58
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L44:
            if (r2 < 0) goto L56
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            r3.clear()
            int r2 = r2 + (-1)
            goto L44
        L56:
            r4._innerTable = r0
        L58:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._outerTable
            if (r1 == 0) goto L78
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L64:
            if (r2 < 0) goto L76
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            r3.clear()
            int r2 = r2 + (-1)
            goto L64
        L76:
            r4._outerTable = r0
        L78:
            r4._scissorBounds = r0
            super.dispose()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            boolean r0 = r11._priorityNeedsToBeDrawn
            if (r0 != 0) goto L11
            boolean r0 = r11._needsToBeDrawn
            if (r0 == 0) goto L91
            org.fortheloss.sticknodes.data.SessionData r0 = r11._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto L91
        L11:
            r0 = 0
            r11._needsToBeDrawn = r0
            r11._priorityNeedsToBeDrawn = r0
            boolean r0 = r11._calculatedScissors
            if (r0 != 0) goto L66
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r11._scissorBounds = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r11.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11.getStage()
            com.badlogic.gdx.graphics.Camera r2 = r1.getCamera()
            int r1 = r0.getScreenX()
            float r3 = (float) r1
            int r1 = r0.getScreenY()
            float r4 = (float) r1
            int r1 = r0.getScreenWidth()
            float r5 = (float) r1
            int r0 = r0.getScreenHeight()
            float r6 = (float) r0
            com.badlogic.gdx.math.Matrix4 r7 = r12.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r8 = new com.badlogic.gdx.math.Rectangle
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r9 = r11.getWidth()
            float r10 = r11.getHeight()
            r8.<init>(r0, r1, r9, r10)
            com.badlogic.gdx.math.Rectangle r9 = r11._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 1
            r11._calculatedScissors = r0
        L66:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r11._fboRef
            r0.bind()
            r12.flush()
            com.badlogic.gdx.math.Rectangle r0 = r11._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r0)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.glClearColor(r2, r2, r2, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            super.draw(r12, r13)
            r12.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
        L91:
            return
    }

    public org.fortheloss.sticknodes.data.IFrameData getCurrentFrame() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r2._framesContainerRef
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r2._currentFrame
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            return r0
    }

    public int getCurrentFrameIndex() {
            r1 = this;
            int r0 = r1._currentFrame
            return r0
    }

    public org.fortheloss.sticknodes.data.IFrameData getFrameAt(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r1._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            return r2
    }

    public int getFrameIndex(org.fortheloss.sticknodes.data.IFrameData r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r3._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r3._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            java.lang.Object r2 = r2.get(r1)
            if (r2 != r4) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L9
        L19:
            r4 = -1
            return r4
    }

    public org.fortheloss.sticknodes.animationscreen.FramesContainer getFramesContainer() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r1._framesContainerRef
            return r0
    }

    public org.fortheloss.sticknodes.data.IFrameData getNextFrame() {
            r2 = this;
            int r0 = r2._currentFrame
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r2._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 < r1) goto L10
            r0 = 0
            return r0
        L10:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r2._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r2._currentFrame
            int r1 = r1 + 1
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.NodeDrawTools getNodeDrawTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r0 = r0.getNodeDrawTools()
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.ScrollPane getScrollPane() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r1._scrollPane
            return r0
    }

    public int getTotalFrames() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r1._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            return r0
    }

    public void goToAutoCamStartFrame(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r1._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 == 0) goto L37
            boolean r0 = r2.isAutoCamera()
            if (r0 != 0) goto Ld
            goto L37
        Ld:
            org.fortheloss.sticknodes.data.FrameData r2 = r2.getFrameData()
            int r2 = r1.getFrameIndex(r2)
        L15:
            if (r2 < 0) goto L29
            int r2 = r2 + (-1)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r1._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            boolean r0 = r0.isAutoCameraOriginFrame()
            if (r0 == 0) goto L15
        L29:
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r1._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            r0 = 1
            r1.goToFrame(r2, r0, r0)
        L37:
            return
    }

    public void goToFrame(int r5) {
            r4 = this;
            r4._currentFrame = r5
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r4._currentThumbnailContainerRef
            r0.setCurrentFrame(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            r0 = 1
            r5.onFrameChange(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r4._currentThumbnailContainerRef
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r0 = r0.getCurrentThumbnail()
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r4._currentThumbnailContainerRef
            float r1 = r1.getThumbnailWidth()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r2 = r4._currentThumbnailContainerRef
            float r2 = r2.getThumbnailHeight()
            r3 = 0
            r5.scrollTo(r0, r3, r1, r2)
            return
    }

    public void goToFrame(org.fortheloss.sticknodes.data.IFrameData r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.goToFrame(r2, r3, r0)
            return
    }

    public void goToFrame(org.fortheloss.sticknodes.data.IFrameData r17, boolean r18, boolean r19) {
            r16 = this;
            r6 = r16
            r0 = r17
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            r2 = 0
            r7 = 0
        Le:
            if (r7 >= r1) goto L1ab
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r6._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            java.lang.Object r2 = r2.get(r7)
            if (r0 != r2) goto L1a7
            r8 = 3
            r9 = 2
            r10 = 6
            r11 = 5
            r1 = -1
            r12 = 1
            if (r18 == 0) goto L9e
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r2 = r2.getPreserveSelectionWhenChangingFrames()
            if (r2 == 0) goto L9e
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 != r12) goto L4a
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            int r1 = r1.getID()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r2 = r2.getCurrentlySelectedNode()
            int r2 = r2.getDrawOrderIndex()
            r14 = r1
            r15 = r2
            r13 = 1
            goto La1
        L4a:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 != r11) goto L6a
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            int r1 = r1.getID()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r2 = r2.getCurrentlySelectedNode()
            int r2 = r2.getDrawOrderIndex()
            r14 = r1
            r15 = r2
            r13 = 5
            goto La1
        L6a:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 != r10) goto L7f
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r2.getCurrentlySelectedSprite()
            int r2 = r2.getID()
            r14 = r2
            r13 = 6
            goto La0
        L7f:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 != r9) goto L94
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r2 = r2.getCurrentlySelectedTextfieldBox()
            int r2 = r2.getID()
            r14 = r2
            r13 = 2
            goto La0
        L94:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 != r8) goto L9e
            r13 = 3
            goto L9f
        L9e:
            r13 = -1
        L9f:
            r14 = -1
        La0:
            r15 = -1
        La1:
            if (r18 == 0) goto La8
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            r1.setSessionSelectionToFrameData(r0)
        La8:
            int r0 = r6._currentFrame
            if (r0 != r7) goto Lae
            goto L1ab
        Lae:
            if (r18 == 0) goto Lce
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameSelectionAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameSelectionAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            r5 = r0
            org.fortheloss.sticknodes.data.useractions.FrameSelectionAction r5 = (org.fortheloss.sticknodes.data.useractions.FrameSelectionAction) r5
            org.fortheloss.sticknodes.data.IFrameData r1 = r16.getCurrentFrame()
            r0 = r5
            r2 = r16
            r3 = r13
            r4 = r14
            r8 = r5
            r5 = r15
            r0.initialize(r1, r2, r3, r4, r5)
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            r0.addUserAction(r8)
        Lce:
            r6._currentFrame = r7
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r6._currentThumbnailContainerRef
            r0.setCurrentFrame(r7)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onFrameChange(r12)
            if (r18 == 0) goto Lde
            if (r19 == 0) goto Lfa
        Lde:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r6._scrollPane
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r6._currentThumbnailContainerRef
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r1 = r1.getCurrentThumbnail()
            float r1 = r1.getX()
            r2 = 0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r3 = r6._currentThumbnailContainerRef
            float r3 = r3.getThumbnailWidth()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r4 = r6._currentThumbnailContainerRef
            float r4 = r4.getThumbnailHeight()
            r0.scrollTo(r1, r2, r3, r4)
        Lfa:
            if (r13 < 0) goto L1ab
            org.fortheloss.sticknodes.data.IFrameData r0 = r16.getCurrentFrame()
            java.util.ArrayList r1 = r0.getDrawableFigures()
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r2 == 0) goto L110
            r3 = r0
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            goto L111
        L110:
            r3 = 0
        L111:
            if (r13 != r12) goto L134
            java.util.Iterator r0 = r1.iterator()
        L117:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ab
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r14) goto L117
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r15)
            r0.setSessionSelectionToNode(r1)
            goto L1ab
        L134:
            if (r13 != r11) goto L156
            java.util.Iterator r0 = r1.iterator()
        L13a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ab
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r14) goto L13a
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r15)
            r0.setSessionSelectionToNode(r1)
            goto L1ab
        L156:
            if (r13 != r10) goto L176
            java.util.Iterator r0 = r1.iterator()
        L15c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ab
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r14) goto L15c
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.setSessionSelectionToSprite(r1)
            goto L1ab
        L176:
            if (r13 != r9) goto L196
            if (r3 == 0) goto L196
            java.util.Iterator r0 = r3.iterator()
        L17e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ab
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            int r2 = r1.getID()
            if (r2 != r14) goto L17e
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.setSessionSelectionToTextFieldBox(r1)
            goto L1ab
        L196:
            r1 = 3
            if (r13 != r1) goto L1ab
            if (r2 == 0) goto L1ab
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r1.setSessionSelectionToFrameCamera(r0)
            goto L1ab
        L1a7:
            int r7 = r7 + 1
            goto Le
        L1ab:
            return
    }

    public boolean goToNextFrame() {
            r4 = this;
            int r0 = r4._currentFrame
            r1 = 1
            int r0 = r0 + r1
            r4._currentFrame = r0
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            r3 = 0
            if (r0 < r2) goto L14
            r4._currentFrame = r3
            goto L15
        L14:
            r1 = 0
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r4._currentThumbnailContainerRef
            int r2 = r4._currentFrame
            r0.setCurrentFrame(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.onFrameChange(r3)
            return r1
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FramesContainer r62, org.fortheloss.framework.Assets r63, float r64, float r65) {
            r61 = this;
            r4 = r61
            r0 = r63
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r1 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r0)
            r3 = r62
            r4._framesContainerRef = r3
            r4._assetsRef = r0
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r5 = 1
            java.lang.Object r3 = r0.get(r3, r2, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r6 = r0.get(r6, r2, r5)
            r15 = r6
            com.badlogic.gdx.graphics.g2d.TextureAtlas r15 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r15
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r14 = r6.getProjectData()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r6 = r6.getSessionData()
            r4._sessionDataRef = r6
            org.fortheloss.sticknodes.animationscreen.FramesContainer r6 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r6 = r6.size()
            int r6 = r6 - r5
        L3a:
            if (r6 < 0) goto L5d
            org.fortheloss.sticknodes.animationscreen.FramesContainer r7 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r7 = r7.get(r6)
            org.fortheloss.sticknodes.data.FrameData r7 = (org.fortheloss.sticknodes.data.FrameData) r7
            boolean r8 = r7.isAutoCameraOriginFrame()
            if (r8 == 0) goto L5a
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r8 = r7.getAutoCameraBundle()
            r8.setFramesModuleReference(r4)
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r7 = r7.getAutoCameraBundle()
            r7.apply()
        L5a:
            int r6 = r6 + (-1)
            goto L3a
        L5d:
            r6 = 1139802112(0x43f00000, float:480.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r7
            int r6 = (int) r6
            r8 = 1132920832(0x43870000, float:270.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            com.badlogic.gdx.utils.Scaling r8 = com.badlogic.gdx.utils.Scaling.fit
            int r9 = r14.canvasWidth
            float r9 = (float) r9
            int r10 = r14.canvasHeight
            float r10 = (float) r10
            float r6 = (float) r6
            float r7 = (float) r7
            com.badlogic.gdx.math.Vector2 r13 = r8.apply(r9, r10, r6, r7)
            float r6 = r13.x
            int r7 = r14.canvasWidth
            float r7 = (float) r7
            float r52 = r6 / r7
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r56 = 1101004800(0x41a00000, float:20.0)
            float r53 = r6 * r56
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r7 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Object r2 = r0.get(r7, r2, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r7 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r7)
            r6.<init>(r2)
            r2 = 1135345664(0x43ac0000, float:344.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r2
            r2 = r65
            r6.setSize(r2, r7)
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r6.setTouchable(r2)
            r4.addActor(r6)
            float r2 = r6.getWidth()
            float r6 = r6.getHeight()
            r4.setSize(r2, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r12 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r2.pad(r12)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r56
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r6.padLeft(r7)
            r11 = 2
            r6.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.space(r12)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r56
            r6.spaceRight(r7)
            float r6 = r61.getWidth()
            float r7 = r61.getHeight()
            r2.setSize(r6, r7)
            r4.addActor(r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 5
            r6.<init>(r7)
            r4._frameThumbnailRefsNewEffectActions = r6
            boolean r6 = org.fortheloss.sticknodes.App.isInternationalUI()
            if (r6 != 0) goto L103
            java.lang.String r6 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedBig
            java.lang.Object r0 = r0.get(r6, r1, r5)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            goto L10b
        L103:
            java.lang.String r6 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r0 = r0.get(r6, r1, r5)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
        L10b:
            r49 = r0
            java.lang.String r0 = "frame_icon_tween"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r3.findRegion(r0)
            r34 = r6
            java.lang.String r0 = "frame_icon_tween_none"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r3.findRegion(r0)
            r35 = r7
            java.lang.String r0 = "frame_icon_tween_slow"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r3.findRegion(r0)
            r36 = r8
            java.lang.String r0 = "frame_icon_tween_fast"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r3.findRegion(r0)
            r37 = r9
            java.lang.String r0 = "frame_icon_sound"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r3.findRegion(r0)
            r38 = r10
            java.lang.String r0 = "frame_icon_sound_silence_all"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r3.findRegion(r0)
            r39 = r0
            r1 = 2
            r11 = r0
            java.lang.String r0 = "frame_icon_delay"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r3.findRegion(r0)
            r40 = r0
            r12 = r0
            java.lang.String r0 = "frame_icon_delay_with_camera"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r3.findRegion(r0)
            r41 = r0
            r57 = r13
            r13 = r0
            java.lang.String r0 = "frame_icon_autocam_start"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r3.findRegion(r0)
            r42 = r0
            r62 = r14
            r14 = r0
            java.lang.String r0 = "frame_icon_autocam"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r3.findRegion(r0)
            r43 = r0
            r1 = r15
            r15 = r0
            java.lang.String r0 = "frame_icon_keyframes"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r16 = r3.findRegion(r0)
            r44 = r16
            java.lang.String r0 = "d_frame_icon_repeat_series"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r17 = r1.findRegion(r0)
            r45 = r17
            java.lang.String r0 = "frame-copy-button"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r0)
            r46 = r18
            java.lang.String r0 = "thumbnail_background"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r19 = r3.findRegion(r0)
            r47 = r19
            java.lang.String r0 = "thumbnail_background_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r20 = r3.findRegion(r0)
            r48 = r20
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = new org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer
            r0 = r1
            r3 = 1
            r58 = r2
            r2 = r3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r4._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r3.getShapeRenderer()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            r65 = r1
            r2 = r57
            float r1 = r2.x
            int r1 = (int) r1
            r22 = r1
            float r1 = r2.y
            int r1 = (int) r1
            r23 = r1
            float r1 = r61.getHeight()
            float r21 = org.fortheloss.sticknodes.App.assetScaling
            r29 = 1082130432(0x40800000, float:4.0)
            float r21 = r21 * r29
            float r26 = r1 - r21
            float r27 = r61.getWidth()
            r59 = r65
            r1 = r61
            r4 = r62
            r21 = r49
            r24 = r52
            r25 = r53
            r60 = r2
            r2 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r61
            r1 = r59
            r0._movieclipThumbnailContainer = r1
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = new org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer
            r28 = r1
            r30 = 0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r31 = r2.getShapeRenderer()
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionDataRef
            r33 = r2
            r2 = r60
            float r3 = r2.x
            int r3 = (int) r3
            r50 = r3
            float r2 = r2.y
            int r2 = (int) r2
            r51 = r2
            float r2 = r61.getHeight()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r29
            float r54 = r2 - r3
            float r55 = r61.getWidth()
            r29 = r61
            r32 = r62
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r0._projectThumbnailContainer = r1
            r2 = r62
            r1.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r0._projectThumbnailContainer
            int r2 = r0._currentFrame
            r1.setCurrentFrame(r2)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$2
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r2 = r0._projectThumbnailContainer
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getFramesScrollPaneStyle()
            r1.<init>(r0, r2, r3)
            r0._scrollPane = r1
            r2 = 0
            r1.setFadeScrollBars(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r0._scrollPane
            r3 = 1
            r1.setScrollingDisabled(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r0._scrollPane
            r1.setOverscroll(r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r0._scrollPane
            r1.setSmoothScrolling(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r0._scrollPane
            r4 = r58
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r4.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expand()
            r1.fill()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r0._projectThumbnailContainer
            r0._currentThumbnailContainerRef = r1
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r0._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            r5 = 0
        L251:
            if (r5 >= r1) goto L26a
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r6 = new org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail
            org.fortheloss.sticknodes.animationscreen.FramesContainer r7 = r0._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r7.frames
            java.lang.Object r7 = r7.get(r5)
            org.fortheloss.sticknodes.data.IFrameData r7 = (org.fortheloss.sticknodes.data.IFrameData) r7
            r6.<init>(r7, r2)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r7 = r0._projectThumbnailContainer
            r7.addThumbnail(r6)
            int r5 = r5 + 1
            goto L251
        L26a:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getAddFrameButtonStyle()
            r1.<init>(r2)
            r0._addFrameButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$3
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDeleteFrameButtonStyle()
            r1.<init>(r2)
            r0._deleteFrameButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$4 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$4
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCopyButtonStyle()
            r1.<init>(r2)
            r0._copyButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$5 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$5
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getPasteButtonStyle()
            r1.<init>(r2)
            r0._pasteButton = r1
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r0._pasteButton
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = 1056964608(0x3f000000, float:0.5)
            r1.setColor(r2, r2, r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r0._pasteButton
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$6 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$6
            r2.<init>(r0)
            r1.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$7 r1 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$7
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r1.<init>(r0, r0, r2)
            r0._playContextMenu = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$8 r1 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$8
            org.fortheloss.sticknodes.ImageButtonLongPress$ImageButtonLongPressStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getPlayButtonLongPressStyle()
            r1.<init>(r0, r2)
            r0._playButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$9 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$9
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getStopButtonStyle()
            r1.<init>(r2)
            r0._stopButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$10 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$10
            r2.<init>(r0)
            r1.addListener(r2)
            java.lang.String r1 = "viewOptions"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeShortViewOptionsStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._viewOptionsButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule$11 r2 = new org.fortheloss.sticknodes.animationscreen.modules.FramesModule$11
            r2.<init>(r0)
            r1.addListener(r2)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r1 * r56
            r6 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            r0._innerTable = r6
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
            r6.setBackground(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0._innerTable
            r7 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r6.align(r7)
            r7 = 0
            r6.pad(r1, r2, r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceRight(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r7)
            r2.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._addFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._addFrameButton
            float r6 = r6.getWidth()
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            float r6 = r6 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._addFrameButton
            float r6 = r6.getHeight()
            r8 = 1063675494(0x3f666666, float:0.9)
            float r6 = r6 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r6)
            r6 = 16
            r2.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._copyButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._copyButton
            float r9 = r9.getWidth()
            float r9 = r9 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._addFrameButton
            float r9 = r9.getHeight()
            float r9 = r9 * r8
            r2.height(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            org.fortheloss.sticknodes.ImageButtonLongPress r9 = r0._playButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            org.fortheloss.sticknodes.ImageButtonLongPress r9 = r0._playButton
            float r9 = r9.getWidth()
            float r9 = r9 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._addFrameButton
            float r9 = r9.getHeight()
            float r9 = r9 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r9)
            r9 = 8
            r2.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r10 = r0._deleteFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r10 = r0._deleteFrameButton
            float r10 = r10.getWidth()
            float r10 = r10 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r10 = r0._addFrameButton
            float r10 = r10.getHeight()
            float r10 = r10 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r10)
            r2.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._pasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._pasteButton
            float r6 = r6.getWidth()
            float r6 = r6 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._addFrameButton
            float r6 = r6.getHeight()
            float r6 = r6 * r8
            r2.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._stopButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._stopButton
            float r6 = r6.getWidth()
            float r6 = r6 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._addFrameButton
            float r6 = r6.getHeight()
            float r6 = r6 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r6)
            r2.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r0._viewOptionsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r0._addFrameButton
            float r6 = r6.getWidth()
            float r6 = r6 * r7
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = r0._copyButton
            float r7 = r7.getWidth()
            float r7 = r7 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r5
            float r6 = r6 + r7
            float r1 = r1 * r5
            float r6 = r6 + r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.width(r6)
            r2 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.align(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsLeftHandMode()
            if (r1 == 0) goto L46b
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r4.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r0._animateToolsModuleRef
            float r2 = r2.getWidth()
            r1.width(r2)
            goto L478
        L46b:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._innerTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r4.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandY()
            r1.fillY()
        L478:
            r4.validate()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r0._projectThumbnailContainer
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r0._scrollPane
            float r2 = r2.getWidth()
            r1.setMaxVisibleX(r2)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r0._movieclipThumbnailContainer
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r0._scrollPane
            float r2 = r2.getWidth()
            r1.setMaxVisibleX(r2)
            return
    }

    public void modifyFigureCameraLockParallax(int r6, int r7) {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r5._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.IFrameData r0 = r5.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r1 = 1
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = r2.peekAtUndo()
            r3 = 0
            if (r2 == 0) goto L2e
            boolean r4 = r2 instanceof org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction
            if (r4 == 0) goto L2e
            org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction r2 = (org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction) r2
            int r4 = r2.getLastChangedProperty()
            if (r4 != 0) goto L2e
            int r2 = r2.getFigureID()
            if (r2 != r6) goto L2e
            r1 = 0
        L2e:
            if (r1 == 0) goto L42
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction> r2 = org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction r1 = (org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction) r1
            r1.initialize(r0, r6, r3)
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            r2.addUserAction(r1)
        L42:
            r0.incrementLockedFigureParallax(r6, r7)
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModuleRef
            r6.setNeedsToBeDrawn()
            return
    }

    public void modifyFigureCameraLockRotateWithCamera(int r4, boolean r5) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r3._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.IFrameData r0 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction> r2 = org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction r1 = (org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction) r1
            r2 = 1
            r1.initialize(r0, r4, r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            r0.setLockedFigureRotateAndScaleWithCamera(r4, r5)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public void onSessionModeChange() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != r1) goto L5e
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._addFrameButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._addFrameButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._deleteFrameButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._deleteFrameButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._copyButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._copyButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r0.setTouchable(r1)
            org.fortheloss.sticknodes.ImageButtonLongPress r0 = r4._playButton
            r0.setColor(r3, r3, r3, r2)
            org.fortheloss.sticknodes.ImageButtonLongPress r0 = r4._playButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r4._viewOptionsButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r4._viewOptionsButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r4._scrollPane
            r0.setTouchable(r1)
            r4.forceNextDraw()
            goto Lb6
        L5e:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._addFrameButton
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._addFrameButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._deleteFrameButton
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._deleteFrameButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._copyButton
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._copyButton
            r0.setTouchable(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getNumCopiedFrames()
            if (r0 <= 0) goto L91
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r0.setTouchable(r1)
            goto L9d
        L91:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
        L9d:
            org.fortheloss.sticknodes.ImageButtonLongPress r0 = r4._playButton
            r0.setColor(r3, r3, r3, r3)
            org.fortheloss.sticknodes.ImageButtonLongPress r0 = r4._playButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r4._viewOptionsButton
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r4._viewOptionsButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r4._scrollPane
            r0.setTouchable(r1)
        Lb6:
            return
    }

    public void onSessionScreenChange() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == 0) goto L28
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            r2 = 2
            if (r0 != r2) goto L13
            goto L28
        L13:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != r1) goto L33
            r0 = 0
            r3.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r0)
            r3.setNeedsToBeDrawn()
            goto L33
        L28:
            r3.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r3.setTouchable(r0)
            r3.setNeedsToBeDrawn()
        L33:
            r0 = -1
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.setNewestFrameIndex(r0)
            return
    }

    public void onSessionSelectionChange() {
            r0 = this;
            return
    }

    public void pasteFigureCameraLockBundles(org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r12) {
            r11 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r11._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.IFrameData r0 = r11.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            java.util.ArrayList r1 = r0.getDrawableFigures()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0.getFrameCamera()
            int r3 = r12.length
            int r4 = r1.size()
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r7 = 0
        L1e:
            if (r4 < 0) goto L4a
            java.lang.Object r8 = r1.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            int r8 = r8.getID()
            r9 = 0
        L2b:
            if (r9 >= r3) goto L47
            r10 = r12[r9]
            int r10 = r10.getFigureID()
            if (r10 != r8) goto L44
            java.lang.Object r10 = r1.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            boolean r10 = r10.isJoined()
            if (r10 == 0) goto L42
            goto L44
        L42:
            r7 = 1
            goto L47
        L44:
            int r9 = r9 + 1
            goto L2b
        L47:
            int r4 = r4 + (-1)
            goto L1e
        L4a:
            if (r7 != 0) goto L4d
            return
        L4d:
            org.fortheloss.sticknodes.data.SessionData r4 = r11._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction> r7 = org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction.class
            java.lang.Object r4 = r4.getUserAction(r7)
            org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction r4 = (org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction) r4
            r4.initialize(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r11._sessionDataRef
            r0.addUserAction(r4)
            r0 = 0
        L60:
            if (r0 >= r3) goto Lb2
            r4 = r12[r0]
            int r4 = r4.getFigureID()
            int r7 = r1.size()
            int r7 = r7 - r5
        L6d:
            if (r7 < 0) goto Laf
            java.lang.Object r8 = r1.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            int r9 = r8.getID()
            if (r4 == r9) goto L7e
            int r7 = r7 + (-1)
            goto L6d
        L7e:
            byte r7 = r8.isLockedToCamera()
            if (r7 != 0) goto L87
            r11.addFigureToCameraLock(r8, r6, r5, r6)
        L87:
            java.util.ArrayList r7 = r2.getLockedStickfigureBundles()
            r8 = 0
            int r9 = r7.size()
            int r9 = r9 - r5
        L91:
            if (r9 < 0) goto Laa
            java.lang.Object r10 = r7.get(r9)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r10 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r10
            int r10 = r10.getFigureID()
            if (r10 != r4) goto La7
            java.lang.Object r4 = r7.get(r9)
            r8 = r4
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r8 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r8
            goto Laa
        La7:
            int r9 = r9 + (-1)
            goto L91
        Laa:
            r4 = r12[r0]
            r8.copyDataFrom(r4)
        Laf:
            int r0 = r0 + 1
            goto L60
        Lb2:
            r2.onFigureLockBundlesModified(r1)
            r11.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r12 = r11._canvasModuleRef
            r12.setNeedsToBeDrawn()
            return
    }

    public void pasteSound(org.fortheloss.sticknodes.data.IFrameData r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getCopiedSoundID()
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            float r1 = r1.getCopiedSoundVolume()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            float r2 = r2.getCopiedSoundPan()
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            float r3 = r3.getCopiedSoundPitch()
            if (r0 < 0) goto L44
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L23
            goto L44
        L23:
            org.fortheloss.sticknodes.data.SessionData r4 = r6._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r5 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r4 = r4.getUserAction(r5)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r4 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r4
            r4.initialize(r7)
            org.fortheloss.sticknodes.data.SessionData r5 = r6._sessionDataRef
            r5.addUserAction(r4)
            r7.setSoundToPlay(r0)
            r7.setSoundVolume(r1)
            r7.setSoundPan(r2)
            r7.setSoundPitch(r3)
            r6.setNeedsToBeDrawn()
        L44:
            return
    }

    public void promptUserToChooseStickfigureToLockToCamera() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            r1 = 1
            r0.setDrawOnlyMainNodesTemp(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            java.lang.String r2 = "selectStickfigure"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "selectStickfigureCameraLock2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.promptUserToChooseStickfigure(r4, r2, r3, r1)
            return
    }

    public void rememberScrollXAmount() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r1._scrollPane
            float r0 = r0.getScrollX()
            r1._rememberedScrollXAmount = r0
            return
    }

    public void removeFigureFromCameraLock(int r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r4._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r6 = r6.getFrameCamera()
            r0 = 0
            org.fortheloss.sticknodes.data.FrameData r1 = r6.getFrameData()
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L1a:
            if (r2 < 0) goto L33
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            if (r3 != r5) goto L30
            java.lang.Object r5 = r1.get(r2)
            r0 = r5
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            goto L33
        L30:
            int r2 = r2 + (-1)
            goto L1a
        L33:
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.RemoveCameraFigureLockAction> r1 = org.fortheloss.sticknodes.data.useractions.RemoveCameraFigureLockAction.class
            java.lang.Object r5 = r5.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.RemoveCameraFigureLockAction r5 = (org.fortheloss.sticknodes.data.useractions.RemoveCameraFigureLockAction) r5
            r5.initialize(r6, r0)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r5)
            r6.removeLockedFigure(r0)
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L52
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r5 = r4._animateToolsModuleRef
            r5.updateStickfigureTools()
            goto L61
        L52:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r5 == 0) goto L5c
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r5 = r4._animateToolsModuleRef
            r5.updateMovieclipTools()
            goto L61
        L5c:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r5 = r4._animateToolsModuleRef
            r5.updateSpriteTools()
        L61:
            return
    }

    public void removeTextfieldFromCameraLock(int r6) {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r5._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.IFrameData r0 = r5.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r1 = 0
            org.fortheloss.sticknodes.data.FrameData r2 = r0.getFrameData()
            java.util.ArrayList r2 = r2.getTextfieldBoxes()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L20:
            if (r3 < 0) goto L39
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            int r4 = r4.getID()
            if (r4 != r6) goto L36
            java.lang.Object r6 = r2.get(r3)
            r1 = r6
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            goto L39
        L36:
            int r3 = r3 + (-1)
            goto L20
        L39:
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.RemoveCameraTextfieldLockAction> r2 = org.fortheloss.sticknodes.data.useractions.RemoveCameraTextfieldLockAction.class
            java.lang.Object r6 = r6.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.RemoveCameraTextfieldLockAction r6 = (org.fortheloss.sticknodes.data.useractions.RemoveCameraTextfieldLockAction) r6
            r6.initialize(r0, r1)
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            r2.addUserAction(r6)
            r0.removeLockedTextfield(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModuleRef
            r6.setNeedsToBeDrawn()
            return
    }

    public void rotateAllCameras(float r4, boolean r5) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r3._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto L7
            return
        L7:
            if (r5 == 0) goto L1b
            org.fortheloss.sticknodes.data.SessionData r5 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.RotateAllCamerasAction> r0 = org.fortheloss.sticknodes.data.useractions.RotateAllCamerasAction.class
            java.lang.Object r5 = r5.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.RotateAllCamerasAction r5 = (org.fortheloss.sticknodes.data.useractions.RotateAllCamerasAction) r5
            r5.initialize(r3, r4)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            r0.addUserAction(r5)
        L1b:
            r5 = 0
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r3._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
        L24:
            if (r5 >= r0) goto L4e
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r3._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            java.lang.Object r1 = r1.get(r5)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r1.getFrameCamera()
            boolean r2 = r2.isAutoCamera()
            if (r2 == 0) goto L3b
            goto L4b
        L3b:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r1.getFrameCamera()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            float r1 = r1.getCameraRotationDeg()
            float r1 = r1 + r4
            r2.setCameraRotation(r1)
        L4b:
            int r5 = r5 + 1
            goto L24
        L4e:
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public void setFrameBackgroundColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setBackgroundColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameCameraMoveDuringDelay(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setCameraMoveDuringDelay(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameCameraMoveDuringDelayProperties(boolean r3, boolean r4, short r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r2 = this;
            if (r6 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r6.setCameraMoveDuringDelayProperties(r3, r4, r5)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameDelaySeconds(float r4, org.fortheloss.sticknodes.data.FrameData r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            if (r1 == 0) goto L19
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction
            if (r2 == 0) goto L19
            org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction) r1
            org.fortheloss.sticknodes.data.FrameData r1 = r1.getFrameData()
            if (r1 != r5) goto L19
            r0 = 0
        L19:
            if (r0 == 0) goto L2d
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction) r0
            r0.initialize(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L2d:
            r5.setDelaySeconds(r4)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public void setFrameExpandedGradient(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setExpandedGradient(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameGradient(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setGradientColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameIsDelayed(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameDelayChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameDelayChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameDelayChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameDelayChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setIsDelayed(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameIsRepeating(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setIsRepeating(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameIsUsingSlowMotionTweenedFrames(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setIsUsingSlowMotionTweenedFrames(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameRepeatGoBackFrames(int r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 6
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameData()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setRepeatGoBackFrames(r5)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFrameRepeatLoops(int r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 7
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameData()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setRepeatLoops(r5)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFrameSilencesSounds(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setWillStopSounds(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFrameSlowMotionTweenedFrames(int r5, org.fortheloss.sticknodes.data.FrameData r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 5
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameData()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setSlowMotionTweenedFrames(r5)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFrameSound(int r3, org.fortheloss.sticknodes.data.IFrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setSoundToPlay(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFrameSoundPan(float r5, org.fortheloss.sticknodes.data.IFrameData r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 3
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameData()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setSoundPan(r5)
            return
    }

    public void setFrameSoundPitch(float r5, org.fortheloss.sticknodes.data.IFrameData r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 4
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameData()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setSoundPitch(r5)
            return
    }

    public void setFrameSoundVolume(float r5, org.fortheloss.sticknodes.data.IFrameData r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 2
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameData()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setSoundVolume(r5)
            return
    }

    public void setFrameTweening(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setFrameTweening(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFrameUseTweenPropertiesDuringRepeating(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setUseTweenPropertiesDuringRepeating(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFramesContainer(org.fortheloss.sticknodes.animationscreen.FramesContainer r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r4._framesContainerRef
            if (r0 != r5) goto L5
            return
        L5:
            r4._framesContainerRef = r5
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 == 0) goto L2d
            int r5 = r4._rememberedProjectCurrentFrame
            r4._currentFrame = r5
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r4._projectThumbnailContainer
            r0.setCurrentFrame(r5)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r5 = r4._projectThumbnailContainer
            r4._currentThumbnailContainerRef = r5
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r4._scrollPane
            r0.setActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            r5.invalidate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            r5.validate()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r5 = r4._movieclipThumbnailContainer
            r5.reset()
            goto L82
        L2d:
            int r0 = r4._currentFrame
            r4._rememberedProjectCurrentFrame = r0
            r0 = 0
            r4._currentFrame = r0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r1 = r4._movieclipThumbnailContainer
            r1.initialize(r5)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r5 = r4._movieclipThumbnailContainer
            int r1 = r4._currentFrame
            r5.setCurrentFrame(r1)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r5 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r5.frames
            int r5 = r5.size()
            r1 = 0
        L49:
            if (r1 >= r5) goto L62
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2 = new org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r4._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            r2.<init>(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r3 = r4._movieclipThumbnailContainer
            r3.addThumbnail(r2)
            int r1 = r1 + 1
            goto L49
        L62:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r5 = r4._movieclipThumbnailContainer
            r4._currentThumbnailContainerRef = r5
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r4._scrollPane
            r0.setActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            r5.invalidate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            r5.validate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0 = r4._currentThumbnailContainerRef
            int r1 = r4._currentFrame
            float r0 = r0.getThumbnailX(r1)
            r5.setScrollX(r0)
        L82:
            r4.setNeedsToBeDrawn()
            return
    }

    public void setPlaybackEndFrame(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r3._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
            r2 = 0
            int r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r2, r1)
            r0.setPlaybackEndFrame(r4)
            return
    }

    public void setPlaybackStartFrame(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            r0.setPlaybackStartFrame(r2)
            return
    }

    public void setReferences(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2) {
            r0 = this;
            r0._canvasModuleRef = r1
            r0._animateToolsModuleRef = r2
            return
    }

    public void setToRememberedScrollXAmount() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r2._scrollPane
            float r1 = r2._rememberedScrollXAmount
            r0.setScrollX(r1)
            return
    }

    public void showFrameContextMenu(org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r3._scrollPane
            r1 = 0
            r0.fling(r1, r1, r1)
            r3.setNeedsToBeDrawn()
            float r0 = r3.getX()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r3._scrollPane
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r4.getX()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r3._scrollPane
            float r1 = r1.getScrollX()
            float r0 = r0 - r1
            float r1 = r3.getY()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r3._scrollPane
            float r2 = r2.getY()
            float r1 = r1 + r2
            float r2 = r4.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r3._scrollPane
            float r2 = r2.getScrollY()
            float r1 = r1 - r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getFrameData()
            r2.showFrameContextMenu(r4, r0, r1)
            return
    }

    public void toggleCameraMode() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction) r0
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r0.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r0)
        L22:
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            if (r0 != 0) goto L2c
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r1)
            goto L53
        L2c:
            r2 = 2
            if (r0 != r1) goto L33
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r2)
            goto L53
        L33:
            r1 = 3
            if (r0 != r2) goto L3a
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r1)
            goto L53
        L3a:
            r2 = 4
            if (r0 != r1) goto L41
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r2)
            goto L53
        L41:
            r1 = 5
            if (r0 != r2) goto L48
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r1)
            goto L53
        L48:
            if (r0 != r1) goto L4f
            r0 = 6
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r0)
            goto L53
        L4f:
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r0)
        L53:
            return
    }

    public void updatePasteFrameButton() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getNumCopiedFrames()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._pasteButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._pasteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            goto L25
        L17:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._pasteButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._pasteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
        L25:
            r3.setNeedsToBeDrawn()
            return
    }

    public void useFrameGradient(boolean r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setUseGradient(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter
    public void userChoseNode(org.fortheloss.sticknodes.stickfigure.INode r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            r1 = 0
            r0.setDrawOnlyMainNodesTemp(r1)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r3._framesContainerRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.ProjectData
            if (r0 != 0) goto Ld
            return
        Ld:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r2 = 0
            r0.promptUserToChooseStickfigure(r2, r2, r2, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.IFrameData r2 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getFrameCamera()
            r0.setSessionSelectionToFrameCamera(r2)
            if (r4 != 0) goto L34
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r3._animateToolsModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r3.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r4.showLockToCameraDialog(r0)
            return
        L34:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            r2 = 1
            if (r0 == 0) goto L43
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            r3.addFigureToCameraLock(r4, r2, r1, r2)
            goto L5a
        L43:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r0 == 0) goto L51
            org.fortheloss.sticknodes.sprite.SpriteNode r4 = (org.fortheloss.sticknodes.sprite.SpriteNode) r4
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r4.getSpriteReference()
            r3.addFigureToCameraLock(r4, r2, r1, r2)
            goto L5a
        L51:
            org.fortheloss.sticknodes.movieclip.MCNode r4 = (org.fortheloss.sticknodes.movieclip.MCNode) r4
            org.fortheloss.sticknodes.movieclip.MCReference r4 = r4.getMCReference()
            r3.addFigureToCameraLock(r4, r2, r1, r2)
        L5a:
            return
    }
}
