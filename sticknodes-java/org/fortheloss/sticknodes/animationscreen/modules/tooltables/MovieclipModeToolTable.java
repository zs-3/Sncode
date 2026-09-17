package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class MovieclipModeToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _aboutMCsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _addButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _addOrEditTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _addTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _backgroundButtonsTable;
    private org.fortheloss.framework.ColorPicker _backgroundColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _backgroundImageOnTopButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell _backgroundTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _backgroundTransparencySlider;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _backgroundTransparencyTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _cancelButton;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearBackgroundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _editTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _finishedButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _loadBackgroundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _mcNameLable;
    private org.fortheloss.framework.RepeatingTextButton _offsetXButtonMinus;
    private org.fortheloss.framework.RepeatingTextButton _offsetXButtonPlus;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _offsetXValueLabel;
    private org.fortheloss.framework.RepeatingTextButton _offsetYButtonMinus;
    private org.fortheloss.framework.RepeatingTextButton _offsetYButtonPlus;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _offsetYValueLabel;
    private org.fortheloss.framework.RepeatingTextButton _offsetZoomButtonMinus;
    private org.fortheloss.framework.RepeatingTextButton _offsetZoomButtonPlus;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _offsetZoomValueLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _saveButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _saveButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showNodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _showNodesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _showNodesTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _traceFrameButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mIncrementButtonsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mIncrementButtonsTableCellRef;




































    /* renamed from: -$$Nest$fget_backgroundColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1007$$Nest$fget_backgroundColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._backgroundColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_backgroundTransparencySlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m1008$$Nest$fget_backgroundTransparencySlider(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._backgroundTransparencySlider
            return r0
    }

    /* renamed from: -$$Nest$fget_backgroundTransparencyTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m1009$$Nest$fget_backgroundTransparencyTextField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._backgroundTransparencyTextField
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m1010$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_showNodesButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1011$$Nest$fget_showNodesButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showNodesButton
            return r0
    }

    /* renamed from: -$$Nest$monAboutMCsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1012$$Nest$monAboutMCsClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onAboutMCsClick()
            return
    }

    /* renamed from: -$$Nest$monAddMovieclipToLibraryClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1013$$Nest$monAddMovieclipToLibraryClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onAddMovieclipToLibraryClick()
            return
    }

    /* renamed from: -$$Nest$monBackgroundColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1014$$Nest$monBackgroundColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onBackgroundColorSelect()
            return
    }

    /* renamed from: -$$Nest$monBackgroundOnTopClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1015$$Nest$monBackgroundOnTopClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onBackgroundOnTopClick()
            return
    }

    /* renamed from: -$$Nest$monCancelClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1016$$Nest$monCancelClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onCancelClick()
            return
    }

    /* renamed from: -$$Nest$monClearBackgroundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1017$$Nest$monClearBackgroundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onClearBackgroundClick()
            return
    }

    /* renamed from: -$$Nest$monLoadBackgroundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1018$$Nest$monLoadBackgroundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onLoadBackgroundClick()
            return
    }

    /* renamed from: -$$Nest$monOffsetXPress, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1019$$Nest$monOffsetXPress(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0, int r1) {
            r0.onOffsetXPress(r1)
            return
    }

    /* renamed from: -$$Nest$monOffsetYPress, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1020$$Nest$monOffsetYPress(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0, int r1) {
            r0.onOffsetYPress(r1)
            return
    }

    /* renamed from: -$$Nest$monOffsetZoomPress, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1021$$Nest$monOffsetZoomPress(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0, int r1) {
            r0.onOffsetZoomPress(r1)
            return
    }

    /* renamed from: -$$Nest$monSaveMovieclipClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1022$$Nest$monSaveMovieclipClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onSaveMovieclipClick()
            return
    }

    /* renamed from: -$$Nest$monSetBackgroundTransparencyEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1023$$Nest$monSetBackgroundTransparencyEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0, boolean r1) {
            r0.onSetBackgroundTransparencyEnter(r1)
            return
    }

    /* renamed from: -$$Nest$monTraceFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1024$$Nest$monTraceFrameClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0) {
            r0.onTraceFrameClick()
            return
    }

    public MovieclipModeToolTable(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0._canvasModuleRef = r2
            return
    }

    private void onAboutMCsClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.showAboutMCsDialog()
            return
    }

    private void onAddMovieclipToLibraryClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.addMovieclipToLibrary()
            return
    }

    private void onBackgroundColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._backgroundColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setBackgroundColor(r1)
            return
    }

    private void onBackgroundOnTopClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._backgroundImageOnTopButton
            boolean r1 = r1.isChecked()
            r0.setBackgroundOnTop(r1)
            return
    }

    private void onCancelClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.cancelMovieclipMode()
            return
    }

    private void onClearBackgroundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.clearBackgroundImage()
            return
    }

    private void onLoadBackgroundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.loadBackground()
            return
    }

    private void onOffsetXPress(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            r1 = 0
            r0.updateOffset(r3, r1, r1)
            return
    }

    private void onOffsetYPress(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            r1 = 0
            r0.updateOffset(r1, r3, r1)
            return
    }

    private void onOffsetZoomPress(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            int r3 = -r3
            r1 = 0
            r0.updateOffset(r1, r1, r3)
            return
    }

    private void onSaveMovieclipClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.saveMovieclip()
            return
    }

    private void onSetBackgroundTransparencyEnter(boolean r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._backgroundTransparencyTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L11
            goto L21
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._backgroundTransparencyTextField     // Catch: java.lang.NumberFormatException -> L20
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L20
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L20
            float r1 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L20
            goto L21
        L20:
        L21:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L2a
            r1 = 0
            goto L30
        L2a:
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
        L30:
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r4._backgroundTransparencySlider
            r0.setValue(r1)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r4._movieclipToolsModuleRef
            r0.setBackgroundImageTransparency(r1)
            if (r5 == 0) goto L53
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._backgroundTransparencyTextField
            java.util.Locale r0 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            r5.setText(r0)
        L53:
            return
    }

    private void onTraceFrameClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            r0.showSelectFrameToTraceFromDialog()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._canvasModuleRef = r0
            r4._offsetXValueLabel = r0
            r4._offsetXButtonMinus = r0
            r4._offsetXButtonPlus = r0
            r4._offsetYValueLabel = r0
            r4._offsetYButtonMinus = r0
            r4._offsetYButtonPlus = r0
            r4._offsetZoomValueLabel = r0
            r4._offsetZoomButtonMinus = r0
            r4._offsetZoomButtonPlus = r0
            r4._titleLabel = r0
            r4._mcNameLable = r0
            r4._aboutMCsButton = r0
            r4._saveButton = r0
            r4._cancelButton = r0
            r4._loadBackgroundButton = r0
            r4._clearBackgroundButton = r0
            r4._traceFrameButton = r0
            r4._backgroundTransparencyTextField = r0
            r4._backgroundTransparencySlider = r0
            r4._backgroundImageOnTopButton = r0
            r4._showNodesButton = r0
            org.fortheloss.framework.ColorPicker r1 = r4._backgroundColorPicker
            if (r1 == 0) goto L36
            r1.dispose()
            r4._backgroundColorPicker = r0
        L36:
            r4._backgroundTableCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._backgroundButtonsTable
            if (r1 == 0) goto L5a
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L44:
            if (r2 < 0) goto L58
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L55
            r3.clear()
        L55:
            int r2 = r2 + (-1)
            goto L44
        L58:
            r4._backgroundButtonsTable = r0
        L5a:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._addTable
            if (r1 == 0) goto L7c
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L66:
            if (r2 < 0) goto L7a
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L77
            r3.clear()
        L77:
            int r2 = r2 + (-1)
            goto L66
        L7a:
            r4._addTable = r0
        L7c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._editTable
            if (r1 == 0) goto L9e
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L88:
            if (r2 < 0) goto L9c
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L99
            r3.clear()
        L99:
            int r2 = r2 + (-1)
            goto L88
        L9c:
            r4._editTable = r0
        L9e:
            r4._addButton = r0
            r4._finishedButton = r0
            r4._saveButton2 = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mIncrementButtonsTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r4.mIncrementButtonsTable = r0
            r4.mIncrementButtonsTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._showNodesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r4._showNodesTable = r0
            r4._showNodesTableCellRef = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r17, com.badlogic.gdx.graphics.g2d.TextureAtlas r18, com.badlogic.gdx.scenes.scene2d.utils.Drawable r19) {
            r16 = this;
            r7 = r16
            r8 = r17
            r0 = r19
            super.initialize(r0)
            java.lang.String r0 = "mcToolsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r1)
            r7._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r16.row()
            java.lang.String r0 = "newMC"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._mcNameLable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            java.lang.String r11 = "separator"
            if (r0 != 0) goto Lbb
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r1 = "whatAreMCs"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            r0.<init>(r1, r2)
            r7._aboutMCsButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$1
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._aboutMCsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r10)
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r11)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r16.row()
        Lbb:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._addTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._editTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7._addOrEditTableCell = r0
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r11)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r16.row()
            java.lang.String r0 = "addMCToLibraryButton"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7._addButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$2
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._addButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            r0.row()
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r0 = r0.getNerdModeEnabled()
            java.lang.String r1 = "saveAs"
            java.lang.String r2 = ""
            if (r0 == 0) goto L17a
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSaveButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r0)
            r7._saveButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$3 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$3
            r3.<init>(r7)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r7._saveButton
            r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCancelButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r0)
            r7._cancelButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$4 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$4
            r3.<init>(r7)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r7._cancelButton
            r0.add(r3)
            r16.row()
            goto L1c6
        L17a:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSaveLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r3)
            r7._saveButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$5 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$5
            r3.<init>(r7)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r7._saveButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            r0.row()
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCancelLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r3)
            r7._cancelButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$6 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$6
            r3.<init>(r7)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._addTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r7._cancelButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            r0.colspan(r10)
            r16.row()
        L1c6:
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 == 0) goto L206
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonFinishedStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r0)
            r7._finishedButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$7 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$7
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._finishedButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSaveButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r0)
            r7._saveButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$8 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$8
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._saveButton2
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            r0.row()
            goto L24c
        L206:
            java.lang.String r0 = "finishedEditing"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeFinishedStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r2)
            r7._finishedButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$9 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$9
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r7._finishedButton
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            r0.row()
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSaveLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7._saveButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$10 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$10
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._saveButton2
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editTable
            r0.row()
        L24c:
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L276
            java.lang.String r0 = "traceMenu2"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r16.row()
        L276:
            java.lang.String r0 = "traceFrame"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._traceFrameButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$11 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$11
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._traceFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r10)
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mIncrementButtonsTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mIncrementButtonsTableCellRef = r0
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$12 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$12
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mIncrementButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r0)
            r12 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r12)
            float r0 = r0.getHeight()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            r1.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$13 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$13
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mIncrementButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r0)
            r13 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r13)
            float r0 = r0.getHeight()
            float r0 = r0 * r2
            r1.height(r0)
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L327
            java.lang.String r0 = "txtTracingBackground"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r16.row()
        L327:
            java.lang.String r0 = "loadBGImage"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._loadBackgroundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$14 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$14
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._loadBackgroundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r12)
            java.lang.String r0 = "clearBGImage"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._clearBackgroundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$15 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$15
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearBackgroundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r11)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._backgroundButtonsTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._backgroundTableCell = r0
            r16.row()
            java.lang.String r0 = "backgroundTransparency"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            r0 = 4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter
            r1.<init>()
            java.lang.String r2 = "1.00"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7.createTextField(r2, r0, r1)
            r7._backgroundTransparencyTextField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$16 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$16
            r1.<init>(r7)
            r0.setTextFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7._backgroundTransparencyTextField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$17 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$17
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r7._backgroundTransparencyTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.size(r1, r2)
            r0.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1017370378(0x3ca3d70a, float:0.02)
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7._backgroundTransparencySlider = r0
            r14 = 1065353216(0x3f800000, float:1.0)
            r0.setValue(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._backgroundTransparencySlider
            org.fortheloss.framework.CustomStopListener r1 = new org.fortheloss.framework.CustomStopListener
            r1.<init>()
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._backgroundTransparencySlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$18 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$18
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._backgroundTransparencySlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$19 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$19
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Slider r1 = r7._backgroundTransparencySlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            r0.row()
            java.lang.String r0 = "backgroundOnTop"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._backgroundImageOnTopButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$20 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$20
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._backgroundImageOnTopButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._showNodesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._showNodesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            r0.row()
            java.lang.String r0 = "showNodesWhenTracing"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._showNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._showNodesButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$21 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$21
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._showNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._showNodesButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r11)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._backgroundButtonsTable
            r0.row()
            java.lang.String r0 = "backgroundColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$22 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$22
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r7._movieclipToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r1 * r0
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r6 = r0.getIsLeftHandMode()
            r0 = r15
            r1 = r16
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._backgroundColorPicker = r15
            r15.setColor(r14, r14, r14, r14)
            org.fortheloss.framework.ColorPicker r0 = r7._backgroundColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$23 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$23
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7._backgroundColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r13)
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r11)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r16.row()
            java.lang.String r0 = "mcCameraOffset"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            r16.row()
            java.lang.String r0 = "offset"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " X"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r1.fillX()
            java.lang.String r1 = "0"
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r9)
            r7._offsetXValueLabel = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r2)
            r2.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$24 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$24
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r4 = "-"
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            r2.<init>(r7, r4, r3, r5)
            r7._offsetXButtonMinus = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r2.getLabel()
            r2.setWrap(r9)
            org.fortheloss.framework.RepeatingTextButton r2 = r7._offsetXButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.getCell(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1082130432(0x40800000, float:4.0)
            float r8 = r3 * r6
            float r3 = r3 * r6
            r10 = 0
            r2.pad(r10, r8, r10, r3)
            org.fortheloss.framework.RepeatingTextButton r2 = r7._offsetXButtonMinus
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$25 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$25
            r3.<init>(r7)
            r2.addListener(r3)
            org.fortheloss.framework.RepeatingTextButton r2 = r7._offsetXButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r2)
            r2.align(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$26 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$26
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r8 = "+"
            r2.<init>(r7, r8, r3, r5)
            r7._offsetXButtonPlus = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r2.getLabel()
            r2.setWrap(r9)
            org.fortheloss.framework.RepeatingTextButton r2 = r7._offsetXButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.getCell(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r3 * r6
            float r3 = r3 * r6
            r2.pad(r10, r11, r10, r3)
            org.fortheloss.framework.RepeatingTextButton r2 = r7._offsetXButtonPlus
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$27 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$27
            r3.<init>(r7)
            r2.addListener(r3)
            org.fortheloss.framework.RepeatingTextButton r2 = r7._offsetXButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r2)
            r2.align(r13)
            r16.row()
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " Y"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r9)
            r7._offsetYValueLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$28 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$28
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r0.<init>(r7, r4, r2, r5)
            r7._offsetYButtonMinus = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r9)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetYButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r2 * r6
            float r2 = r2 * r6
            r0.pad(r10, r3, r10, r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetYButtonMinus
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$29 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$29
            r2.<init>(r7)
            r0.addListener(r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetYButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$30 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$30
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r0.<init>(r7, r8, r2, r5)
            r7._offsetYButtonPlus = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r9)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetYButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r2 * r6
            float r2 = r2 * r6
            r0.pad(r10, r3, r10, r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetYButtonPlus
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$31 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$31
            r2.<init>(r7)
            r0.addListener(r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetYButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r16.row()
            java.lang.String r0 = "zoom"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r9)
            r7._offsetZoomValueLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$32 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$32
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r0.<init>(r7, r4, r1, r5)
            r7._offsetZoomButtonMinus = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r9)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetZoomButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r1 * r6
            float r1 = r1 * r6
            r0.pad(r10, r2, r10, r1)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetZoomButtonMinus
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$33 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$33
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetZoomButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$34 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$34
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r0.<init>(r7, r8, r1, r5)
            r7._offsetZoomButtonPlus = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r9)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetZoomButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r1 * r6
            float r1 = r1 * r6
            r0.pad(r10, r2, r10, r1)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetZoomButtonPlus
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$35 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable$35
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.RepeatingTextButton r0 = r7._offsetZoomButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r16.row()
            r16.pack()
            return
    }

    public void setCreateOrEditing(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L15
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r2 = r1._addOrEditTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._addTable
            if (r2 == r0) goto L11
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r2 = r1._addOrEditTableCell
            r2.setActor(r0)
        L11:
            r1.invalidate()
            goto L27
        L15:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r2 = r1._addOrEditTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._editTable
            if (r2 == r0) goto L24
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r2 = r1._addOrEditTableCell
            r2.setActor(r0)
        L24:
            r1.invalidate()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r7._movieclipToolsModuleRef
            java.lang.String r0 = r0.getMCName()
            if (r0 != 0) goto L2a
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r7._mcNameLable
            java.lang.String r1 = "newMC"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            goto L2f
        L2a:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r7._mcNameLable
            r1.setText(r0)
        L2f:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r7._movieclipToolsModuleRef
            boolean r0 = r0.hasBackgroundImage()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L4d
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearBackgroundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearBackgroundButton
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7._backgroundTableCell
            r0.clearActor()
            goto L60
        L4d:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearBackgroundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearBackgroundButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7._backgroundTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._backgroundButtonsTable
            r0.setActor(r3)
        L60:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7._backgroundTransparencyTextField
            java.util.Locale r3 = java.util.Locale.US
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r6 = r7._movieclipToolsModuleRef
            float r6 = r6.getBackgroundImageTransparency()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r4[r5] = r6
            java.lang.String r5 = "%.2f"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r0.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._backgroundTransparencySlider
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r7._movieclipToolsModuleRef
            float r3 = r3.getBackgroundImageTransparency()
            r0.setValue(r3)
            org.fortheloss.framework.ColorPicker r0 = r7._backgroundColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r7._movieclipToolsModuleRef
            com.badlogic.gdx.graphics.Color r3 = r3.getBackgroundColor()
            r0.setColor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._backgroundImageOnTopButton
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r7._movieclipToolsModuleRef
            boolean r3 = r3.getBackgroundImageOnTop()
            r0.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._showNodesButton
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r7._canvasModuleRef
            boolean r3 = r3.getDrawNodesOnTracedFbo()
            r0.setChecked(r3)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r7._movieclipToolsModuleRef
            com.badlogic.gdx.math.Vector2 r0 = r0.getPreviewZoomPosition()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r7._movieclipToolsModuleRef
            float r3 = r3.getPreviewZoom()
            float r2 = r2 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            float r3 = r0.x
            org.fortheloss.sticknodes.data.ProjectData r4 = r7._projectDataRef
            int r4 = r4.canvasWidth
            float r4 = (float) r4
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r5 = r7._movieclipToolsModuleRef
            float r5 = r5.getPreviewZoom()
            float r4 = r4 * r5
            float r4 = r4 * r1
            float r3 = r3 + r4
            org.fortheloss.sticknodes.data.ProjectData r4 = r7._projectDataRef
            int r5 = r4.canvasWidth
            float r5 = (float) r5
            float r5 = r5 * r1
            float r3 = r3 - r5
            int r3 = (int) r3
            float r0 = r0.y
            int r4 = r4.canvasHeight
            float r4 = (float) r4
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r5 = r7._movieclipToolsModuleRef
            float r5 = r5.getPreviewZoom()
            float r4 = r4 * r5
            float r4 = r4 * r1
            float r0 = r0 + r4
            org.fortheloss.sticknodes.data.ProjectData r4 = r7._projectDataRef
            int r4 = r4.canvasHeight
            float r4 = (float) r4
            float r4 = r4 * r1
            float r0 = r0 - r4
            int r0 = (int) r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r7._offsetXValueLabel
            r1.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r7._offsetYValueLabel
            r1.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r7._offsetZoomValueLabel
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "%"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r7._canvasModuleRef
            boolean r0 = r0.isTracingFrame()
            if (r0 == 0) goto L12a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mIncrementButtonsTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto L12f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mIncrementButtonsTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mIncrementButtonsTable
            r0.setActor(r1)
            goto L12f
        L12a:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mIncrementButtonsTableCellRef
            r0.clearActor()
        L12f:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r7._canvasModuleRef
            boolean r0 = r0.isTracing()
            if (r0 == 0) goto L147
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7._showNodesTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._showNodesTable
            if (r0 == r1) goto L14c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7._showNodesTableCellRef
            r0.setActor(r1)
            goto L14c
        L147:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7._showNodesTableCellRef
            r0.clearActor()
        L14c:
            return
    }
}
