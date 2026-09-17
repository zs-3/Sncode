package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class ArrowsWindow extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _aButton;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _bButton;
    private com.badlogic.gdx.graphics.g2d.NinePatch _background;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _downButton;
    private com.badlogic.gdx.math.Vector2 _dragOffset;
    private boolean _enabled;
    private boolean _flagClickedB;
    private boolean _flagCodeCompleted;
    private com.badlogic.gdx.utils.Queue<java.lang.Integer> _inputRecording;
    private boolean _isDragging;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _leftButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _minusButton;
    private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModuleRef;
    private float _pixelNudgeAmount;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _pixelsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _plusButton;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _rightButton;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private float _timerHideBA;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _upButton;
















    /* renamed from: -$$Nest$fget_animationScreenRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.AnimationScreen m208$$Nest$fget_animationScreenRef(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0._animationScreenRef
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m209$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_dragOffset, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m210$$Nest$fget_dragOffset(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._dragOffset
            return r0
    }

    /* renamed from: -$$Nest$fget_flagClickedB, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m211$$Nest$fget_flagClickedB(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            boolean r0 = r0._flagClickedB
            return r0
    }

    /* renamed from: -$$Nest$fget_isDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m212$$Nest$fget_isDragging(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            boolean r0 = r0._isDragging
            return r0
    }

    /* renamed from: -$$Nest$fget_pixelNudgeAmount, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m213$$Nest$fget_pixelNudgeAmount(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            float r0 = r0._pixelNudgeAmount
            return r0
    }

    /* renamed from: -$$Nest$fget_pixelsLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m214$$Nest$fget_pixelsLabel(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._pixelsLabel
            return r0
    }

    /* renamed from: -$$Nest$fput_flagClickedB, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m215$$Nest$fput_flagClickedB(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0, boolean r1) {
            r0._flagClickedB = r1
            return
    }

    /* renamed from: -$$Nest$fput_flagCodeCompleted, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m216$$Nest$fput_flagCodeCompleted(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0, boolean r1) {
            r0._flagCodeCompleted = r1
            return
    }

    /* renamed from: -$$Nest$fput_isDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m217$$Nest$fput_isDragging(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0, boolean r1) {
            r0._isDragging = r1
            return
    }

    /* renamed from: -$$Nest$mboundPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m218$$Nest$mboundPosition(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            r0.boundPosition()
            return
    }

    /* renamed from: -$$Nest$mhideBA, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m219$$Nest$mhideBA(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            r0.hideBA()
            return
    }

    /* renamed from: -$$Nest$monDownArrowClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m220$$Nest$monDownArrowClick(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            r0.onDownArrowClick()
            return
    }

    /* renamed from: -$$Nest$monLeftArrowClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m221$$Nest$monLeftArrowClick(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            r0.onLeftArrowClick()
            return
    }

    /* renamed from: -$$Nest$monPixelClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m222$$Nest$monPixelClick(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0, int r1) {
            r0.onPixelClick(r1)
            return
    }

    /* renamed from: -$$Nest$monRightArrowClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m223$$Nest$monRightArrowClick(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            r0.onRightArrowClick()
            return
    }

    /* renamed from: -$$Nest$monUpArrowClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m224$$Nest$monUpArrowClick(org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0) {
            r0.onUpArrowClick()
            return
    }

    public ArrowsWindow(org.fortheloss.sticknodes.data.SessionData r3, org.fortheloss.sticknodes.data.ProjectData r4, org.fortheloss.sticknodes.animationscreen.AnimationScreen r5, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r7, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r8) {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2._pixelNudgeAmount = r0
            r0 = 0
            r2._flagClickedB = r0
            r2._flagCodeCompleted = r0
            r1 = 0
            r2._timerHideBA = r1
            r2._isDragging = r0
            r0 = 1
            r2._enabled = r0
            r2._sessionDataRef = r3
            r2._projectDataRef = r4
            r2._animationScreenRef = r5
            r2._canvasModuleRef = r6
            r2._animateToolsModuleRef = r7
            r2._movieclipToolsModuleRef = r8
            return
    }

    private void addInput(int r8) {
            r7 = this;
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r0 = r7._inputRecording
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._aButton
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L10
            r7.hideBA()
        L10:
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r0 = r7._inputRecording
            int r1 = r0.size
            r2 = 8
            if (r1 < r2) goto L1b
            r0.removeFirst()
        L1b:
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r0 = r7._inputRecording
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.addLast(r8)
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            int r0 = r8.size
            if (r0 < r2) goto L137
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r0 = 1
            java.lang.Object r8 = r8.get(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r1 = 2
            java.lang.Object r8 = r8.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r1) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r2 = 3
            java.lang.Object r8 = r8.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r1) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r1 = 4
            java.lang.Object r8 = r8.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r2) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r1 = 5
            java.lang.Object r8 = r8.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r0) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r1 = 6
            java.lang.Object r8 = r8.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r2) goto L137
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r8 = r7._inputRecording
            r1 = 7
            java.lang.Object r8 = r8.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r0) goto L137
            r8 = 0
            r7._inputRecording = r8
            r8 = 1067450368(0x3fa00000, float:1.25)
            r7._timerHideBA = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._bButton
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r8.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._aButton
            r8.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._bButton
            r8.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._aButton
            r8.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._bButton
            r8.setTransform(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._aButton
            r8.setTransform(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._bButton
            float r0 = r8.getWidth()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._bButton
            float r2 = r2.getHeight()
            float r2 = r2 * r1
            r8.setOrigin(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._aButton
            float r0 = r8.getWidth()
            float r0 = r0 * r1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._aButton
            float r2 = r2.getHeight()
            float r2 = r2 * r1
            r8.setOrigin(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._bButton
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r0)
            r2 = 1084227584(0x40a00000, float:5.0)
            r3 = 1025758986(0x3d23d70a, float:0.04)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r2, r3)
            r5 = -1063256064(0xffffffffc0a00000, float:-5.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r5, r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r6)
            r6 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r6, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r4)
            r8.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._aButton
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r5, r3)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r2, r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r2)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r6, r1)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r0, r1)
            r8.addAction(r0)
        L137:
            return
    }

    private void boundPosition() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3.getStage()
            if (r0 != 0) goto L7
            return
        L7:
            float r1 = r3.getX()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L13
            r3.setX(r2)
        L13:
            float r1 = r3.getY()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L1e
            r3.setY(r2)
        L1e:
            float r1 = r3.getX()
            float r2 = r3.getWidth()
            float r1 = r1 + r2
            float r2 = r0.getWidth()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3b
            float r1 = r0.getWidth()
            float r2 = r3.getWidth()
            float r1 = r1 - r2
            r3.setX(r1)
        L3b:
            float r1 = r3.getY()
            float r2 = r3.getHeight()
            float r1 = r1 + r2
            float r2 = r0.getHeight()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L58
            float r0 = r0.getHeight()
            float r1 = r3.getHeight()
            float r0 = r0 - r1
            r3.setY(r0)
        L58:
            return
    }

    private void hideBA() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._aButton
            if (r0 == 0) goto L22
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L22
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._bButton
            r0.clear()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._aButton
            r0.clear()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._aButton
            r1 = 0
            r0.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._bButton
            r0.setVisible(r1)
            r0 = 0
            r2._inputRecording = r0
        L22:
            return
    }

    private void onDownArrowClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r1 = r3._pixelNudgeAmount
            float r1 = -r1
            r2 = 0
            r0.userArrowMove(r2, r1)
            r0 = 2
            r3.addInput(r0)
            return
    }

    private void onLeftArrowClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r1 = r3._pixelNudgeAmount
            float r1 = -r1
            r2 = 0
            r0.userArrowMove(r1, r2)
            r0 = 3
            r3.addInput(r0)
            return
    }

    private void onPixelClick(int r5) {
            r4 = this;
            float r0 = r4._pixelNudgeAmount
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 > 0) goto L11
            if (r5 >= 0) goto L11
            float r0 = r0 - r2
            r4._pixelNudgeAmount = r0
            goto L1f
        L11:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L1b
            if (r5 <= 0) goto L1b
            float r0 = r0 + r2
            r4._pixelNudgeAmount = r0
            goto L1f
        L1b:
            float r5 = (float) r5
            float r0 = r0 + r5
            r4._pixelNudgeAmount = r0
        L1f:
            float r5 = r4._pixelNudgeAmount
            r0 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            float r5 = r5 / r0
            r4._pixelNudgeAmount = r5
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L34
            r4._pixelNudgeAmount = r2
            goto L3c
        L34:
            r0 = 1148846080(0x447a0000, float:1000.0)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L3c
            r4._pixelNudgeAmount = r0
        L3c:
            return
    }

    private void onRightArrowClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r1 = r3._pixelNudgeAmount
            r2 = 0
            r0.userArrowMove(r1, r2)
            r0 = 1
            r3.addInput(r0)
            return
    }

    private void onUpArrowClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r1 = r3._pixelNudgeAmount
            r2 = 0
            r0.userArrowMove(r2, r1)
            r0 = 0
            r3.addInput(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r5) {
            r4 = this;
            super.act(r5)
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r0 = r4._inputRecording
            r1 = 0
            if (r0 == 0) goto L29
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            r2 = 1
            if (r0 > r2) goto L27
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            int r0 = r0.size()
            if (r0 > r2) goto L27
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            int r0 = r0.size()
            if (r0 <= 0) goto L29
        L27:
            r4._inputRecording = r1
        L29:
            float r0 = r4._timerHideBA
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3e
            float r0 = r0 - r5
            r4._timerHideBA = r0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L3e
            r4._timerHideBA = r2
            r4.hideBA()
            r4._inputRecording = r1
        L3e:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._sessionDataRef = r0
            r1._projectDataRef = r0
            r1._animationScreenRef = r0
            r1._canvasModuleRef = r0
            r1._animateToolsModuleRef = r0
            r1._movieclipToolsModuleRef = r0
            r1._background = r0
            r1._upButton = r0
            r1._rightButton = r0
            r1._downButton = r0
            r1._leftButton = r0
            r1._aButton = r0
            r1._bButton = r0
            r1._pixelsLabel = r0
            r1._minusButton = r0
            r1._plusButton = r0
            r1._dragOffset = r0
            r1._inputRecording = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r8, float r9) {
            r7 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = r7._background
            float r3 = r7.getX()
            float r4 = r7.getY()
            float r5 = r7.getWidth()
            float r6 = r7.getHeight()
            r2 = r8
            r1.draw(r2, r3, r4, r5, r6)
            super.draw(r8, r9)
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r10) {
            r9 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            r1 = 1
            if (r0 == 0) goto L30
            org.fortheloss.sticknodes.data.ProjectData r0 = r9._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            if (r0 > r1) goto L30
            org.fortheloss.sticknodes.data.ProjectData r0 = r9._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            int r0 = r0.size()
            if (r0 > r1) goto L30
            org.fortheloss.sticknodes.data.ProjectData r0 = r9._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            int r0 = r0.size()
            if (r0 > 0) goto L30
            com.badlogic.gdx.utils.Queue r0 = new com.badlogic.gdx.utils.Queue
            r2 = 8
            r0.<init>(r2)
            r9._inputRecording = r0
        L30:
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r2 = "magnifier_window"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r10.findRegion(r2)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1115684864(0x42800000, float:64.0)
            float r3 = r10 * r2
            int r5 = (int) r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r6 = r10 * r3
            int r6 = (int) r6
            float r3 = r3 * r10
            int r7 = (int) r3
            float r10 = r10 * r2
            int r8 = (int) r10
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r9._background = r0
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$1 r10 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalArrowUpButtonStyle()
            java.lang.String r2 = ""
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r10.<init>(r9, r2, r0, r3)
            r9._upButton = r10
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$2 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$2
            r0.<init>(r9)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$3 r10 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$3
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalArrowRightButtonStyle()
            r10.<init>(r9, r2, r0, r3)
            r9._rightButton = r10
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$4 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$4
            r0.<init>(r9)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$5 r10 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalArrowDownButtonStyle()
            r10.<init>(r9, r2, r0, r3)
            r9._downButton = r10
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$6 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$6
            r0.<init>(r9)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$7 r10 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$7
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalArrowLeftButtonStyle()
            r10.<init>(r9, r2, r0, r3)
            r9._leftButton = r10
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$8 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$8
            r0.<init>(r9)
            r10.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            float r0 = r9.getWidth()
            float r2 = r9.getHeight()
            r10.setSize(r0, r2)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1116471296(0x428c0000, float:70.0)
            float r4 = r0 * r2
            r5 = 1108869120(0x42180000, float:38.0)
            float r6 = r0 * r5
            float r5 = r5 * r0
            float r0 = r0 * r2
            r10.pad(r4, r6, r5, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniformX()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r4
            r0.space(r2)
            r0 = 2
            r10.align(r0)
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r5 = 0
            r2.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r9._upButton
            float r7 = r7.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r4
            r6.space(r7)
            r2.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9._upButton
            r2.add(r0)
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9._downButton
            r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9._leftButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9._leftButton
            float r6 = r6.getHeight()
            r0.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r9._upButton
            float r2 = r2.getHeight()
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9._rightButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r9._rightButton
            float r2 = r2.getHeight()
            r0.width(r2)
            r10.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "pixelNudge"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            float r6 = r9._pixelNudgeAmount
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r2 = ": "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r2 = r7.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r2, r6)
            r9._pixelsLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
            r2 = 3
            r0.colspan(r2)
            r10.row()
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$9 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$9
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonSmallStyle()
            java.lang.String r7 = "-"
            r0.<init>(r9, r7, r6, r3)
            r9._minusButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._minusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1082130432(0x40800000, float:4.0)
            float r8 = r6 * r7
            float r6 = r6 * r7
            r0.pad(r5, r8, r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._minusButton
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$10 r6 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$10
            r6.<init>(r9)
            r0.addListener(r6)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$11 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$11
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonSmallStyle()
            java.lang.String r8 = "+"
            r0.<init>(r9, r8, r6, r3)
            r9._plusButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._plusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r3 * r7
            float r3 = r3 * r7
            r0.pad(r5, r6, r5, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._plusButton
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$12 r3 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$12
            r3.<init>(r9)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.pad(r5)
            r3.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.defaults()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9._minusButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9._plusButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
            r0.colspan(r2)
            r10.pack()
            float r0 = r10.getWidth()
            float r10 = r10.getHeight()
            r9.setSize(r0, r10)
            com.badlogic.gdx.utils.Queue<java.lang.Integer> r10 = r9._inputRecording
            if (r10 == 0) goto L274
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r1 = "B"
            r10.<init>(r1, r0)
            r9._bButton = r10
            r0 = 0
            r10.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = r9._bButton
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$13 r1 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$13
            r1.<init>(r9)
            r10.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = r9._bButton
            float r1 = r9.getWidth()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            float r1 = r1 + r4
            r3 = 1135345664(0x43ac0000, float:344.0)
            float r2 = r2 * r3
            r10.setPosition(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = r9._bButton
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r2 = "A"
            r10.<init>(r2, r1)
            r9._aButton = r10
            r10.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = r9._aButton
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$14 r0 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$14
            r0.<init>(r9)
            r10.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = r9._aButton
            float r0 = r9.getWidth()
            r1 = 1109393408(0x42200000, float:40.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r0 = r0 + r2
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9._bButton
            float r1 = r1.getWidth()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9._bButton
            float r1 = r1.getY()
            r10.setPosition(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = r9._aButton
            r9.addActor(r10)
        L274:
            com.badlogic.gdx.math.Vector2 r10 = new com.badlogic.gdx.math.Vector2
            r10.<init>(r5, r5)
            r9._dragOffset = r10
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow$15 r10 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow$15
            r10.<init>(r9)
            r9.addListener(r10)
            return
    }

    public void setEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3._enabled
            if (r0 != r4) goto L5
            return
        L5:
            r3._enabled = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._upButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._upButton
            r4.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._rightButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._rightButton
            r4.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._downButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._downButton
            r4.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._leftButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._leftButton
            r4.setColor(r0, r0, r0, r0)
            goto L62
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._upButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._upButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._rightButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._rightButton
            r4.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._downButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._downButton
            r4.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._leftButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._leftButton
            r4.setColor(r0, r0, r0, r2)
        L62:
            return
    }

    public void update() {
            r0 = this;
            return
    }
}
