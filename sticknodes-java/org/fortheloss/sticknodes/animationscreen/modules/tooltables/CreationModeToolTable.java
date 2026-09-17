package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class CreationModeToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _addButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _backgroundButtonsTable;
    private org.fortheloss.framework.ColorPicker _backgroundColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _backgroundImageOnTopButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell _backgroundTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _backgroundTransparencySlider;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _backgroundTransparencyTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _cancelButton;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearBackgroundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _loadBackgroundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _saveButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showNodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _showNodesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _showNodesTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _traceFrameButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _traceStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _viewBackupsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mIncrementButtonsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mIncrementButtonsTableCellRef;



















    /* renamed from: -$$Nest$fget_backgroundColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m910$$Nest$fget_backgroundColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._backgroundColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_backgroundTransparencySlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m911$$Nest$fget_backgroundTransparencySlider(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._backgroundTransparencySlider
            return r0
    }

    /* renamed from: -$$Nest$fget_backgroundTransparencyTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m912$$Nest$fget_backgroundTransparencyTextField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._backgroundTransparencyTextField
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m913$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_showNodesButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m914$$Nest$fget_showNodesButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showNodesButton
            return r0
    }

    /* renamed from: -$$Nest$monAddStickfigureToLibraryClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m915$$Nest$monAddStickfigureToLibraryClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onAddStickfigureToLibraryClick()
            return
    }

    /* renamed from: -$$Nest$monBackgroundColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m916$$Nest$monBackgroundColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onBackgroundColorSelect()
            return
    }

    /* renamed from: -$$Nest$monBackgroundOnTopClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m917$$Nest$monBackgroundOnTopClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onBackgroundOnTopClick()
            return
    }

    /* renamed from: -$$Nest$monCancelClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m918$$Nest$monCancelClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onCancelClick()
            return
    }

    /* renamed from: -$$Nest$monClearBackgroundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m919$$Nest$monClearBackgroundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onClearBackgroundClick()
            return
    }

    /* renamed from: -$$Nest$monLoadBackgroundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m920$$Nest$monLoadBackgroundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onLoadBackgroundClick()
            return
    }

    /* renamed from: -$$Nest$monSaveStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m921$$Nest$monSaveStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onSaveStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monSetBackgroundTransparencyEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m922$$Nest$monSetBackgroundTransparencyEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0, boolean r1) {
            r0.onSetBackgroundTransparencyEnter(r1)
            return
    }

    /* renamed from: -$$Nest$monTraceFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m923$$Nest$monTraceFrameClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onTraceFrameClick()
            return
    }

    /* renamed from: -$$Nest$monTraceStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m924$$Nest$monTraceStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onTraceStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monViewBackupsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m925$$Nest$monViewBackupsClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0) {
            r0.onViewBackupsClick()
            return
    }

    public CreationModeToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0._canvasModuleRef = r2
            return
    }

    private void onAddStickfigureToLibraryClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.addStickfigureToLibrary()
            return
    }

    private void onBackgroundColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._backgroundColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setBackgroundColor(r1)
            return
    }

    private void onBackgroundOnTopClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._backgroundImageOnTopButton
            boolean r1 = r1.isChecked()
            r0.setBackgroundOnTop(r1)
            return
    }

    private void onCancelClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.cancelCreationMode()
            return
    }

    private void onClearBackgroundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.clearBackgroundImage()
            return
    }

    private void onLoadBackgroundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.loadBackground()
            return
    }

    private void onSaveStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.saveStickfigure()
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
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r4._creationToolsModuleRef
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
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.showSelectFrameToTraceFromDialog()
            return
    }

    private void onTraceStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.showSelectStickfigureToTraceFromDialog()
            return
    }

    private void onViewBackupsClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.showBackups()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._canvasModuleRef = r0
            r4._titleLabel = r0
            r4._addButton = r0
            r4._saveButton = r0
            r4._cancelButton = r0
            r4._traceStickfigureButton = r0
            r4._traceFrameButton = r0
            r4._loadBackgroundButton = r0
            r4._clearBackgroundButton = r0
            r4._backgroundTableCell = r0
            r4._backgroundTransparencyTextField = r0
            r4._backgroundTransparencySlider = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._backgroundButtonsTable
            if (r1 == 0) goto L3b
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L25:
            if (r2 < 0) goto L39
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L36
            r3.clear()
        L36:
            int r2 = r2 + (-1)
            goto L25
        L39:
            r4._backgroundButtonsTable = r0
        L3b:
            org.fortheloss.framework.ColorPicker r1 = r4._backgroundColorPicker
            if (r1 == 0) goto L44
            r1.dispose()
            r4._backgroundColorPicker = r0
        L44:
            r4._backgroundImageOnTopButton = r0
            r4._showNodesButton = r0
            r4._viewBackupsButton = r0
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

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r13, com.badlogic.gdx.graphics.g2d.TextureAtlas r14, com.badlogic.gdx.scenes.scene2d.utils.Drawable r15) {
            r12 = this;
            super.initialize(r15)
            java.lang.String r15 = "creationModeTools"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1, r0)
            r12._titleLabel = r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r12.row()
            java.lang.String r15 = "addStickfigureToLibrary"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r15, r2)
            r12._addButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$1
            r2.<init>(r12)
            r15.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = r12._addButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r15.colspan(r0)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSaveButtonStyle()
            java.lang.String r2 = ""
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r15)
            r12._saveButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$2
            r3.<init>(r12)
            r15.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = r12._saveButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r3 = 16
            r15.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCancelButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r15)
            r12._cancelButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$3
            r2.<init>(r12)
            r15.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = r12._cancelButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r2 = 8
            r15.align(r2)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r4 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r13.findRegion(r4)
            r15.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padTop(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padBottom(r5)
            r15.fillX()
            r12.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r15 = r12.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r15 = r15.getContext()
            org.fortheloss.sticknodes.data.SessionData r15 = r15.getSessionData()
            boolean r15 = r15.getNerdModeEnabled()
            if (r15 != 0) goto Ldb
            java.lang.String r15 = "traceMenu2"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r12.row()
        Ldb:
            java.lang.String r15 = "traceStickfigure"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r5)
            r12._traceStickfigureButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$4 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$4
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r12._traceStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r15.colspan(r0)
            r12.row()
            java.lang.String r15 = "traceFrame"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r5)
            r12._traceFrameButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$5 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$5
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r12._traceFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r15.colspan(r0)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r12.mIncrementButtonsTable = r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.fillX()
            r12.mIncrementButtonsTableCellRef = r15
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r15)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$6 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$6
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r12.mIncrementButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r3)
            float r15 = r15.getHeight()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r6
            r5.height(r15)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r15)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$7 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$7
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r12.mIncrementButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r2)
            float r15 = r15.getHeight()
            float r15 = r15 * r6
            r5.height(r15)
            org.fortheloss.sticknodes.animationscreen.modules.Module r15 = r12.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r15 = r15.getContext()
            org.fortheloss.sticknodes.data.SessionData r15 = r15.getSessionData()
            boolean r15 = r15.getNerdModeEnabled()
            if (r15 != 0) goto L1ac
            java.lang.String r15 = "txtTracingBackground"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r12.row()
        L1ac:
            java.lang.String r15 = "loadBGImage"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r5)
            r12._loadBackgroundButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$8 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$8
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r12._loadBackgroundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r15.align(r3)
            java.lang.String r15 = "clearBGImage"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r3)
            r12._clearBackgroundButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$9 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$9
            r3.<init>(r12)
            r15.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r12._clearBackgroundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r15.align(r2)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r12._backgroundButtonsTable = r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.fillX()
            r12._backgroundTableCell = r15
            r12.row()
            java.lang.String r15 = "backgroundTransparency"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r12._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r3.add(r15)
            r15.fillX()
            r15 = 4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter
            r3.<init>()
            java.lang.String r5 = "1.00"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r15 = r12.createTextField(r5, r15, r3)
            r12._backgroundTransparencyTextField = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$10 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$10
            r3.<init>(r12)
            r15.setTextFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r15 = r12._backgroundTransparencyTextField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$11 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$11
            r3.<init>(r12)
            r15.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r12._backgroundTransparencyTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.add(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r3 = (float) r3
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.size(r3, r5)
            r15.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            r15.row()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r15 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1017370378(0x3ca3d70a, float:0.02)
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r12._backgroundTransparencySlider = r15
            r3 = 1065353216(0x3f800000, float:1.0)
            r15.setValue(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r15 = r12._backgroundTransparencySlider
            org.fortheloss.framework.CustomStopListener r5 = new org.fortheloss.framework.CustomStopListener
            r5.<init>()
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r15 = r12._backgroundTransparencySlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$12 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$12
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r15 = r12._backgroundTransparencySlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$13 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$13
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r12._backgroundTransparencySlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r5 = (float) r5
            r15.width(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            r15.row()
            java.lang.String r15 = "backgroundOnTop"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r12._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r5.add(r15)
            r15.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r15)
            r12._backgroundImageOnTopButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$14 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$14
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r12._backgroundImageOnTopButton
            r15.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            r15.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r12._showNodesTable = r15
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r12._backgroundButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r5.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.fillX()
            r12._showNodesTableCellRef = r15
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._backgroundButtonsTable
            r15.row()
            java.lang.String r15 = "showNodesWhenTracing"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r12._showNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r5.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.expandX()
            r15.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r15)
            r12._showNodesButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$15 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$15
            r5.<init>(r12)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._showNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r12._showNodesButton
            r15.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r13.findRegion(r4)
            r15.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padTop(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padBottom(r5)
            r15.fillX()
            r12.row()
            java.lang.String r15 = "backgroundColor"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r15.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$16 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$16
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r5 = r12._creationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r5.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            r5 = 1092616192(0x41200000, float:10.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r6 * r5
            org.fortheloss.sticknodes.data.SessionData r5 = r12.mSessionDataRef
            boolean r11 = r5.getIsLeftHandMode()
            r5 = r15
            r6 = r12
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12._backgroundColorPicker = r15
            r15.setColor(r3, r3, r3, r3)
            org.fortheloss.framework.ColorPicker r14 = r12._backgroundColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$17 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$17
            r15.<init>(r12)
            r14.addListener(r15)
            org.fortheloss.framework.ColorPicker r14 = r12._backgroundColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.width(r15)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.height(r15)
            r14.align(r2)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r13.findRegion(r4)
            r14.<init>(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padTop(r14)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padBottom(r14)
            r13.fillX()
            r12.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r13 = r12.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r13.getContext()
            org.fortheloss.sticknodes.data.SessionData r13 = r13.getSessionData()
            boolean r13 = r13.getNerdModeEnabled()
            if (r13 != 0) goto L3fc
            java.lang.String r13 = "viewBackupsInfo1"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.colspan(r0)
            r12.row()
        L3fc:
            java.lang.String r13 = "viewBackups"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r13, r14)
            r12._viewBackupsButton = r13
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$18 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable$18
            r14.<init>(r12)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r12._viewBackupsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            r13.colspan(r0)
            r12.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r5._creationToolsModuleRef
            boolean r0 = r0.hasBackgroundImage()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L1e
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5._clearBackgroundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5._clearBackgroundButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5._backgroundTableCell
            r0.clearActor()
            goto L31
        L1e:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5._clearBackgroundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5._clearBackgroundButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5._backgroundTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r5._backgroundButtonsTable
            r0.setActor(r1)
        L31:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r5._backgroundTransparencyTextField
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r5._creationToolsModuleRef
            float r4 = r4.getBackgroundImageTransparency()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2[r3] = r4
            java.lang.String r3 = "%.2f"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r5._backgroundTransparencySlider
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r5._creationToolsModuleRef
            float r1 = r1.getBackgroundImageTransparency()
            r0.setValue(r1)
            org.fortheloss.framework.ColorPicker r0 = r5._backgroundColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r5._creationToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._backgroundImageOnTopButton
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r5._creationToolsModuleRef
            boolean r1 = r1.getBackgroundImageOnTop()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._showNodesButton
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5._canvasModuleRef
            boolean r1 = r1.getDrawNodesOnTracedFbo()
            r0.setChecked(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModuleRef
            boolean r0 = r0.isTracingFrame()
            if (r0 == 0) goto L92
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r5.mIncrementButtonsTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto L97
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r5.mIncrementButtonsTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r5.mIncrementButtonsTable
            r0.setActor(r1)
            goto L97
        L92:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r5.mIncrementButtonsTableCellRef
            r0.clearActor()
        L97:
            return
    }
}
