package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class Magnifier extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _arrowsTR;
    private com.badlogic.gdx.graphics.g2d.NinePatch _background;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.math.Vector2 _dragOffset;
    private boolean _enabled;
    private boolean _isDragging;
    private boolean _isShowingNodes;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _lockButton;
    private org.fortheloss.sticknodes.animationscreen.MagnifierViewer _magnifierViewer;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _minusButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _nodesToShowButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _plusButton;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;






    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m229$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_dragOffset, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m230$$Nest$fget_dragOffset(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._dragOffset
            return r0
    }

    /* renamed from: -$$Nest$fget_isDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m231$$Nest$fget_isDragging(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            boolean r0 = r0._isDragging
            return r0
    }

    /* renamed from: -$$Nest$fget_lockButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m232$$Nest$fget_lockButton(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._lockButton
            return r0
    }

    /* renamed from: -$$Nest$fget_magnifierViewer, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.MagnifierViewer m233$$Nest$fget_magnifierViewer(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0 = r0._magnifierViewer
            return r0
    }

    /* renamed from: -$$Nest$fput_isDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m234$$Nest$fput_isDragging(org.fortheloss.sticknodes.animationscreen.Magnifier r0, boolean r1) {
            r0._isDragging = r1
            return
    }

    /* renamed from: -$$Nest$mboundPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m235$$Nest$mboundPosition(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            r0.boundPosition()
            return
    }

    /* renamed from: -$$Nest$monScaleButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m236$$Nest$monScaleButtonClick(org.fortheloss.sticknodes.animationscreen.Magnifier r0, int r1) {
            r0.onScaleButtonClick(r1)
            return
    }

    /* renamed from: -$$Nest$mtoggleShowingNodes, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m237$$Nest$mtoggleShowingNodes(org.fortheloss.sticknodes.animationscreen.Magnifier r0) {
            r0.toggleShowingNodes()
            return
    }

    public Magnifier(org.fortheloss.sticknodes.data.SessionData r2, org.fortheloss.sticknodes.animationscreen.AnimationScreen r3, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isDragging = r0
            r0 = 1
            r1._enabled = r0
            r1._isShowingNodes = r0
            r1._sessionDataRef = r2
            r1._animationScreenRef = r3
            r1._canvasModuleRef = r4
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

    private void onScaleButtonClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0 = r1._magnifierViewer
            r0.zoom(r2)
            return
    }

    private void toggleShowingNodes() {
            r2 = this;
            boolean r0 = r2._isShowingNodes
            r0 = r0 ^ 1
            r2._isShowingNodes = r0
            if (r0 == 0) goto L1d
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._nodesToShowButton
            java.lang.String r1 = "showingAllNodes"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeViewNodesAllButtonStyle()
            r0.setStyle(r1)
            goto L31
        L1d:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._nodesToShowButton
            java.lang.String r1 = "notShowingNodes"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeViewNodesNoneButtonStyle()
            r0.setStyle(r1)
        L31:
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0 = r2._magnifierViewer
            r0.flagDirty()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r1) {
            r0 = this;
            super.act(r1)
            return
    }

    public void checkAndUpdateFBO(com.badlogic.gdx.graphics.g2d.Batch r8, com.badlogic.gdx.graphics.glutils.FrameBuffer r9, com.badlogic.gdx.utils.viewport.Viewport r10, boolean r11) {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r7._canvasModuleRef
            boolean r0 = r0.getAndConsumeRedrawnFlag()
            if (r0 != 0) goto La
            if (r11 == 0) goto L22
        La:
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r11 = r7._magnifierViewer
            com.badlogic.gdx.math.Vector2 r11 = r11.getViewCenter()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r7._canvasModuleRef
            float r4 = r11.x
            float r5 = r11.y
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r11 = r7._magnifierViewer
            float r6 = r11.getZoom()
            r1 = r8
            r2 = r9
            r3 = r10
            r0.renderMagnifierView(r1, r2, r3, r4, r5, r6)
        L22:
            return
    }

    public void checkForNodeAt(float r2, float r3, float r4) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            int r0 = r0.getMode()
            if (r0 == 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            org.fortheloss.sticknodes.stickfigure.INode r2 = r0.getSelectedNodeFromFigures(r2, r3, r4)
            if (r2 == 0) goto L1c
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r1._animationScreenRef
            r3.setSessionSelectionToNode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            r3 = 1
            r2.setMagnifiedNodeSelected(r3)
        L1c:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._sessionDataRef = r0
            r2._animationScreenRef = r0
            r2._canvasModuleRef = r0
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r1 = r2._magnifierViewer
            if (r1 == 0) goto L10
            r1.dispose()
            r2._magnifierViewer = r0
        L10:
            r2._background = r0
            r2._arrowsTR = r0
            r2._minusButton = r0
            r2._plusButton = r0
            r2._nodesToShowButton = r0
            r2._lockButton = r0
            r2._dragOffset = r0
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

    public boolean getIsShowingNodes() {
            r1 = this;
            boolean r0 = r1._isShowingNodes
            return r0
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r11) {
            r10 = this;
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0 = new org.fortheloss.sticknodes.animationscreen.MagnifierViewer
            r0.<init>(r10)
            r10._magnifierViewer = r0
            java.lang.String r1 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r11.findRegion(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r10._canvasModuleRef
            r0.initialize(r1, r2)
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r1 = "magnifier_window"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r11.findRegion(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1115684864(0x42800000, float:64.0)
            float r3 = r1 * r2
            int r5 = (int) r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r6 = r1 * r3
            int r6 = (int) r6
            float r3 = r3 * r1
            int r7 = (int) r3
            float r1 = r1 * r2
            int r8 = (int) r1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r10._background = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r1 = "magnifier_window_arrows"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r11.findRegion(r1)
            r0.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r11.findRegion(r1)
            r2.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonSmallStyle()
            java.lang.String r3 = "-"
            r11.<init>(r3, r1)
            r10._minusButton = r11
            org.fortheloss.sticknodes.animationscreen.Magnifier$1 r1 = new org.fortheloss.sticknodes.animationscreen.Magnifier$1
            r1.<init>(r10)
            r11.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonSmallStyle()
            java.lang.String r3 = "+"
            r11.<init>(r3, r1)
            r10._plusButton = r11
            org.fortheloss.sticknodes.animationscreen.Magnifier$2 r1 = new org.fortheloss.sticknodes.animationscreen.Magnifier$2
            r1.<init>(r10)
            r11.addListener(r1)
            r11 = 1
            r10._isShowingNodes = r11
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            java.lang.String r3 = "showingAllNodes"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeViewNodesAllButtonStyle()
            r1.<init>(r3, r4)
            r10._nodesToShowButton = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r1.getLabel()
            r3 = 8
            r1.setAlignment(r3, r11)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r10._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.getImageCell()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1111490560(0x42400000, float:48.0)
            float r5 = r5 * r4
            r6 = 1098907648(0x41800000, float:16.0)
            float r4 = r4 * r6
            r6 = 0
            r1.pad(r6, r5, r6, r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r10._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.getLabelCell()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r10._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r1.getLabel()
            r1.setWrap(r11)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r10._nodesToShowButton
            org.fortheloss.sticknodes.animationscreen.Magnifier$3 r4 = new org.fortheloss.sticknodes.animationscreen.Magnifier$3
            r4.<init>(r10)
            r1.addListener(r4)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1142980608(0x44208000, float:642.0)
            float r4 = r4 * r1
            r5 = 1144913920(0x443e0000, float:760.0)
            float r1 = r1 * r5
            r10.setSize(r4, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            float r4 = r10.getWidth()
            float r5 = r10.getHeight()
            r1.setSize(r4, r5)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1112014848(0x42480000, float:50.0)
            float r7 = r4 * r5
            r8 = 1099956224(0x41900000, float:18.0)
            float r9 = r4 * r8
            float r8 = r8 * r4
            float r4 = r4 * r5
            r1.pad(r7, r9, r8, r4)
            r4 = 2
            r1.align(r4)
            r10.addActor(r1)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1141211136(0x44058000, float:534.0)
            float r4 = r4 * r5
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r5 = r10._magnifierViewer
            float r5 = r5.getPadding()
            float r4 = r4 + r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1137180672(0x43c80000, float:400.0)
            float r5 = r5 * r7
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r7 = r10._magnifierViewer
            float r7 = r7.getPadding()
            float r5 = r5 + r7
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r7 = r10._magnifierViewer
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r1.add(r7)
            r8 = 4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.colspan(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.size(r4, r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            r4.padBottom(r5)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10._minusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r7
            r0.padRight(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10._plusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r2)
            r0.expandX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r10._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r8)
            r0.align(r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1106247680(0x41f00000, float:30.0)
            float r11 = r11 * r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRoundLockButtonStyle()
            java.lang.String r3 = ""
            r0.<init>(r3, r2)
            r10._lockButton = r0
            r2 = 0
            r0.setChecked(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r10._lockButton
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r10._lockButton
            float r2 = r1.getX()
            float r3 = r1.getPadLeft()
            float r2 = r2 + r3
            float r2 = r2 + r11
            float r3 = r1.getY()
            float r4 = r1.getHeight()
            float r3 = r3 + r4
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r10._lockButton
            float r4 = r4.getHeight()
            float r3 = r3 - r4
            float r1 = r1.getPadTop()
            float r3 = r3 - r1
            float r3 = r3 - r11
            r0.setPosition(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r10._lockButton
            org.fortheloss.sticknodes.animationscreen.Magnifier$4 r0 = new org.fortheloss.sticknodes.animationscreen.Magnifier$4
            r0.<init>(r10)
            r11.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r10._lockButton
            r10.addActor(r11)
            com.badlogic.gdx.math.Vector2 r11 = new com.badlogic.gdx.math.Vector2
            r11.<init>(r6, r6)
            r10._dragOffset = r11
            org.fortheloss.sticknodes.animationscreen.Magnifier$5 r11 = new org.fortheloss.sticknodes.animationscreen.Magnifier$5
            r11.<init>(r10)
            r10.addListener(r11)
            return
    }

    public void reset() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0 = r4._magnifierViewer
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            float r1 = r1.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r4._canvasModuleRef
            float r3 = r3.getHeight()
            float r3 = r3 * r2
            r0.reset(r1, r3)
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
            if (r4 == 0) goto L28
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r4 = r3._magnifierViewer
            r1 = 1
            r4.setEnabled(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._minusButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._minusButton
            r4.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._plusButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._plusButton
            r4.setColor(r0, r0, r0, r0)
            goto L46
        L28:
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r4 = r3._magnifierViewer
            r1 = 0
            r4.setEnabled(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._minusButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._minusButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._plusButton
            r4.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._plusButton
            r4.setColor(r0, r0, r0, r2)
        L46:
            return
    }

    public void setViewCenter(float r2, float r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0 = r1._magnifierViewer
            r0.setViewCenter(r2, r3)
            return
    }
}
