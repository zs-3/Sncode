package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class PermanentMovieclipToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _leaveAddButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> _leaveCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _leaveEditButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _modeLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _modeNormalButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _modePanningButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _redoButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _undoButton;
    private int _zoom;









    /* renamed from: -$$Nest$fget_leaveAddButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1067$$Nest$fget_leaveAddButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._leaveAddButton
            return r0
    }

    /* renamed from: -$$Nest$fget_leaveEditButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1068$$Nest$fget_leaveEditButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._leaveEditButton
            return r0
    }

    /* renamed from: -$$Nest$monNormalModeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1069$$Nest$monNormalModeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0) {
            r0.onNormalModeClick()
            return
    }

    /* renamed from: -$$Nest$monPanningModeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1070$$Nest$monPanningModeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0) {
            r0.onPanningModeClick()
            return
    }

    /* renamed from: -$$Nest$monRedoClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1071$$Nest$monRedoClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0) {
            r0.onRedoClick()
            return
    }

    /* renamed from: -$$Nest$monUndoClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1072$$Nest$monUndoClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0) {
            r0.onUndoClick()
            return
    }

    public PermanentMovieclipToolTable(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0._zoom = r1
            return
    }

    private void onNormalModeClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            r1 = 0
            r0.changeMode(r1)
            return
    }

    private void onPanningModeClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            r1 = 1
            r0.changeMode(r1)
            return
    }

    private void onRedoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.redo()
            return
    }

    private void onUndoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
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
            goto L5c
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
            goto L5c
        L3e:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r3 = 3
            if (r0 != r3) goto L5c
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4._zoom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "modePlaying"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r2)
            r0.setText(r1)
        L5c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._undoButton = r0
            r1._redoButton = r0
            r1._modeLabel = r0
            r1._modeNormalButton = r0
            r1._modePanningButton = r0
            r1._leaveEditButton = r0
            r1._leaveAddButton = r0
            r1._leaveCellRef = r0
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$1
            r0.<init>(r7)
            r9.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r7._undoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.add(r9)
            r0 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._undoButton
            float r0 = r0.getHeight()
            r1 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r1
            r9.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalRedoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r9)
            r7._redoButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$2
            r0.<init>(r7)
            r9.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r7._redoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.add(r9)
            r0 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._redoButton
            float r0 = r0.getHeight()
            float r0 = r0 * r1
            r9.height(r0)
            r7.row()
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r1 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "modeNormal"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2, r0)
            java.lang.String r2 = "editingMC"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "\n["
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "]"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._modeLabel = r0
            r0.setWrap(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r7._modeLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r8)
            r0.fillX()
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0.pad(r2)
            r4.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r2)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1090519040(0x41000000, float:8.0)
            float r5 = r5 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.space(r2)
            r2.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            r2.fillX()
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModeNormalCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7._modeNormalButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$3 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$3
            r4.<init>(r7)
            r2.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._modeNormalButton
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModePanningCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7._modePanningButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$4 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$4
            r4.<init>(r7)
            r2.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._modePanningButton
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r8 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r8]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._modeNormalButton
            r8[r3] = r4
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._modePanningButton
            r8[r9] = r3
            r2.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getMCModeLeaveAddCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r7._leaveAddButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$5 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$5
            r9.<init>(r7)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._leaveAddButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$6 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$6
            r9.<init>(r7)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._leaveAddButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r0.add(r8)
            r7._leaveCellRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getMCModeLeaveEditCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r7._leaveEditButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$7 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$7
            r9.<init>(r7)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._leaveEditButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$8 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable$8
            r9.<init>(r7)
            r8.addListener(r9)
            r7.pack()
            float r8 = r7.getHeight()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1135345664(0x43ac0000, float:344.0)
            float r2 = r9 * r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L172
            float r9 = r9 * r0
            r7.setHeight(r9)
        L172:
            r7._zoom = r1
            return
    }

    public void setCreateOrEditing(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L12
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r2 = r1._leaveCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._leaveAddButton
            if (r2 == r0) goto L21
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r2 = r1._leaveCellRef
            r2.setActor(r0)
            goto L21
        L12:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r2 = r1._leaveCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._leaveEditButton
            if (r2 == r0) goto L21
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r2 = r1._leaveCellRef
            r2.setActor(r0)
        L21:
            r1.invalidate()
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
            if (r0 != r1) goto L39
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._undoButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._redoButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeNormalButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modePanningButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._leaveEditButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._leaveAddButton
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            r0.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
            goto L61
        L39:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._undoButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._redoButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeNormalButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modePanningButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._leaveEditButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._leaveAddButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._modeLabel
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r4.setTouchable(r0)
        L61:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            r2 = 1
            if (r0 == 0) goto L81
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            if (r0 != r1) goto L73
            goto L81
        L73:
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            int r0 = r0.getMode()
            if (r0 != r2) goto L86
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modePanningButton
            r0.setChecked(r2)
            goto L86
        L81:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._modeNormalButton
            r0.setChecked(r2)
        L86:
            return
    }
}
