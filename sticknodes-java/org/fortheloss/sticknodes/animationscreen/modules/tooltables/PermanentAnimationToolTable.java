package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class PermanentAnimationToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _lagButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _modeCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _modeLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _modeNormalButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _modePanningButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _redoButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _undoButton;
    private int _zoom;







    /* renamed from: -$$Nest$monCameraModeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1059$$Nest$monCameraModeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0) {
            r0.onCameraModeClick()
            return
    }

    /* renamed from: -$$Nest$monNormalModeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1060$$Nest$monNormalModeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0) {
            r0.onNormalModeClick()
            return
    }

    /* renamed from: -$$Nest$monPanningModeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1061$$Nest$monPanningModeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0) {
            r0.onPanningModeClick()
            return
    }

    /* renamed from: -$$Nest$monRedoClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1062$$Nest$monRedoClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0) {
            r0.onRedoClick()
            return
    }

    /* renamed from: -$$Nest$monUndoClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1063$$Nest$monUndoClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0) {
            r0.onUndoClick()
            return
    }

    /* renamed from: -$$Nest$mshowLagDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1064$$Nest$mshowLagDialog(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0) {
            r0.showLagDialog()
            return
    }

    public PermanentAnimationToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r1 = 0
            r0._zoom = r1
            r0._canvasModuleRef = r2
            return
    }

    private void onCameraModeClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r1 = 2
            r0.changeMode(r1)
            return
    }

    private void onNormalModeClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r1 = 0
            r0.changeMode(r1)
            return
    }

    private void onPanningModeClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r1 = 1
            r0.changeMode(r1)
            return
    }

    private void onRedoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.redo()
            return
    }

    private void onUndoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.undo()
            return
    }

    private void setModeText() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4._zoom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "modeNormal"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r2)
            r0.setText(r1)
            goto L71
        L20:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            if (r0 != r2) goto L3e
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4._zoom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "modePanning"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r2)
            r0.setText(r1)
            goto L71
        L3e:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r3 = 2
            if (r0 != r3) goto L5d
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4._zoom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "modeCamera"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r2)
            r0.setText(r1)
            goto L71
        L5d:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 != r1) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            java.lang.String r1 = "modePlaying"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r0.setText(r1)
        L71:
            return
    }

    private void showLagDialog() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.showLagDialog()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._canvasModuleRef = r0
            r1._undoButton = r0
            r1._redoButton = r0
            r1._modeLabel = r0
            r1._modeNormalButton = r0
            r1._modePanningButton = r0
            r1._modeCameraButton = r0
            r1._lagButton = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r8, com.badlogic.gdx.scenes.scene2d.utils.Drawable r9) {
            r7 = this;
            super.initialize(r9)
            r8 = 2
            r7.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalUndoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r9)
            r7._undoButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$1
            r0.<init>(r7)
            r9.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r7._undoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.add(r9)
            r0 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7._undoButton
            float r1 = r1.getHeight()
            r2 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r2
            r9.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalRedoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r9)
            r7._redoButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$2
            r1.<init>(r7)
            r9.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r7._redoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.add(r9)
            r1 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r3 = r7._redoButton
            float r3 = r3.getHeight()
            float r3 = r3 * r2
            r9.height(r3)
            r7.row()
            r9 = 1
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r3 = 100
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "modeNormal"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r9)
            r7._modeLabel = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            r2.fillX()
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r2.pad(r4)
            r6.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r6.space(r4)
            r4.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModeNormalCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r4)
            r7._modeNormalButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$3 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$3
            r6.<init>(r7)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._modeNormalButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r2.add(r4)
            r4.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModePanningCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._modePanningButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$4 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$4
            r4.<init>(r7)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._modePanningButton
            r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModeCameraCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._modeCameraButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$5 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$5
            r4.<init>(r7)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._modeCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r2)
            r0.colspan(r8)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r0.<init>()
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r1]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._modeNormalButton
            r1[r5] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._modePanningButton
            r1[r9] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r7._modeCameraButton
            r1[r8] = r9
            r0.add(r1)
            org.fortheloss.sticknodes.data.SessionData r9 = r7.mSessionDataRef
            boolean r9 = r9.getIsLeftHandMode()
            if (r9 != 0) goto L137
            java.lang.String r9 = "lagTitle"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r9, r0)
            r7._lagButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$6 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable$6
            r0.<init>(r7)
            r9.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r7._lagButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.add(r9)
            r9.colspan(r8)
        L137:
            r7.pack()
            float r8 = r7.getHeight()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1135345664(0x43ac0000, float:344.0)
            float r1 = r9 * r0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L14d
            float r9 = r9 * r0
            r7.setHeight(r9)
        L14d:
            r7._zoom = r3
            return
    }

    public void setZoom(float r2) {
            r1 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1._zoom = r2
            r0 = 30
            if (r2 >= r0) goto Le
            r1._zoom = r0
            goto L14
        Le:
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 <= r0) goto L14
            r1._zoom = r0
        L14:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r4 = this;
            r4.setModeText()
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto L42
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            boolean r0 = r0.isWaitingForUserToChooseFigure()
            if (r0 == 0) goto L17
            goto L42
        L17:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._undoButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._redoButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeNormalButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modePanningButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeCameraButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._lagButton
            if (r0 == 0) goto L3c
            r0.setColor(r2, r2, r2, r2)
        L3c:
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r4.setTouchable(r0)
            goto L6e
        L42:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._undoButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._redoButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeNormalButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modePanningButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeCameraButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._lagButton
            if (r0 == 0) goto L69
            r0.setColor(r2, r2, r2, r3)
        L69:
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
        L6e:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r2 = 1
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            if (r0 != r1) goto L80
            goto L9d
        L80:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            if (r0 != r2) goto L8e
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modePanningButton
            r0.setChecked(r2)
            goto La2
        L8e:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r1 = 2
            if (r0 != r1) goto La2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeCameraButton
            r0.setChecked(r2)
            goto La2
        L9d:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeNormalButton
            r0.setChecked(r2)
        La2:
            return
    }
}
