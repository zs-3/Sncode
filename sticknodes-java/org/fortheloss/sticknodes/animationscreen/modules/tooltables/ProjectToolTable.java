package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class ProjectToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _exportButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _projectNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _saveAsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _saveButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _watermarkButton;
    private org.fortheloss.framework.ColorPicker _watermarkColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _watermarkTable;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _watermarkTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _ytShortsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _ytShortsCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _ytShortsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _ytShortsRotateCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _ytShortsTable;











    /* renamed from: -$$Nest$fget_watermarkColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1081$$Nest$fget_watermarkColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._watermarkColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_ytShortsButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1082$$Nest$fget_ytShortsButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._ytShortsButton
            return r0
    }

    /* renamed from: -$$Nest$monExportClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1083$$Nest$monExportClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            r0.onExportClick()
            return
    }

    /* renamed from: -$$Nest$monSaveAsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1084$$Nest$monSaveAsClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            r0.onSaveAsClick()
            return
    }

    /* renamed from: -$$Nest$monSaveClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1085$$Nest$monSaveClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            r0.onSaveClick()
            return
    }

    /* renamed from: -$$Nest$monSetWatermarkTextEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1086$$Nest$monSetWatermarkTextEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            r0.onSetWatermarkTextEnter()
            return
    }

    /* renamed from: -$$Nest$monWatermarkButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1087$$Nest$monWatermarkButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            r0.onWatermarkButtonClick()
            return
    }

    /* renamed from: -$$Nest$monWatermarkColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1088$$Nest$monWatermarkColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0) {
            r0.onWatermarkColorSelect()
            return
    }

    public ProjectToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onExportClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.export()
            return
    }

    private void onSaveAsClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.saveAs()
            return
    }

    private void onSaveClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.save()
            return
    }

    private void onSetWatermarkTextEnter() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r2._watermarkTextField
            java.lang.String r1 = r1.getText()
            r0.setWatermarkText(r1)
            return
    }

    private void onWatermarkButtonClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._watermarkButton
            boolean r1 = r1.isChecked()
            r0.setWatermarkEnabled(r1)
            return
    }

    private void onWatermarkColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._watermarkColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setWatermarkColor(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._titleLabel = r0
            r4._projectNameLabel = r0
            r4._saveButton = r0
            r4._saveAsButton = r0
            r4._exportButton = r0
            r4._watermarkButton = r0
            r4._watermarkTextField = r0
            r4._watermarkColorPicker = r0
            r4._ytShortsButton = r0
            r4._ytShortsLabel = r0
            r4._ytShortsCell = r0
            r4._ytShortsRotateCameraButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._watermarkTable
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
            r4._watermarkTable = r0
        L3b:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._ytShortsTable
            if (r1 == 0) goto L5d
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L47:
            if (r2 < 0) goto L5b
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L58
            r3.clear()
        L58:
            int r2 = r2 + (-1)
            goto L47
        L5b:
            r4._ytShortsTable = r0
        L5d:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r12, com.badlogic.gdx.graphics.g2d.TextureAtlas r13, com.badlogic.gdx.scenes.scene2d.utils.Drawable r14) {
            r11 = this;
            super.initialize(r14)
            java.lang.String r14 = "projectTools"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1, r0)
            r11._titleLabel = r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r11.row()
            java.lang.String r14 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1)
            r11._projectNameLabel = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r11.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r0)
            r2.fillX()
            r11.row()
            java.lang.String r2 = "save"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r3)
            r11._saveButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$1 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$1
            r3.<init>(r11)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r11._saveButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r11.add(r2)
            r3 = 16
            r2.align(r3)
            java.lang.String r2 = "saveAs"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r3)
            r11._saveAsButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$2
            r3.<init>(r11)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r11._saveAsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r11.add(r2)
            r3 = 8
            r2.align(r3)
            r11.row()
            java.lang.String r2 = "exportAll"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "..."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r3)
            r11._exportButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$3 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$3
            r3.<init>(r11)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r11._exportButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r11.add(r2)
            r2.colspan(r0)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r3 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r12.findRegion(r3)
            r2.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r11.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padBottom(r4)
            r2.fillX()
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r11._watermarkTable = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r11.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r0)
            r2.fillX()
            r11.row()
            java.lang.String r2 = "showWatermark"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r11._watermarkTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r11._watermarkButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$4 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$4
            r4.<init>(r11)
            r2.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r11._watermarkTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r11._watermarkButton
            r2.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r11._watermarkTable
            r2.row()
            r2 = 22
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r11.createTextField(r14, r2)
            r11._watermarkTextField = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$5 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$5
            r2.<init>(r11)
            r14.setTextFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r11._watermarkTextField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$6 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$6
            r2.<init>(r11)
            r14.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$7 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$7
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r11._animationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r2.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r9 = r2 * r4
            org.fortheloss.sticknodes.data.SessionData r2 = r11.mSessionDataRef
            boolean r10 = r2.getIsLeftHandMode()
            r4 = r14
            r5 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11._watermarkColorPicker = r14
            r13 = 1065353216(0x3f800000, float:1.0)
            r14.setColor(r13, r13, r13, r13)
            org.fortheloss.framework.ColorPicker r13 = r11._watermarkColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$8 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$8
            r14.<init>(r11)
            r13.addListener(r14)
            java.lang.String r13 = "makeVertical"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            r13.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r13)
            r11._ytShortsButton = r13
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$9 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$9
            r14.<init>(r11)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r11._ytShortsButton
            r11.add(r13)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r11._ytShortsTable = r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r11._ytShortsCell = r13
            r11.row()
            java.lang.String r13 = "rotateCamerasNote"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            r11._ytShortsLabel = r13
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r11._ytShortsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r14.add(r13)
            r13.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r11._ytShortsTable
            r13.row()
            java.lang.String r13 = "rotateCameras"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r13, r14)
            r11._ytShortsRotateCameraButton = r13
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$10 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable$10
            r14.<init>(r11)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r11._ytShortsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r11._ytShortsRotateCameraButton
            r13.add(r14)
            com.badlogic.gdx.Application r13 = com.badlogic.gdx.Gdx.app
            java.lang.String r14 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r13 = r13.getPreferences(r14)
            java.lang.String r14 = "count"
            r2 = -1
            int r14 = r13.getInteger(r14, r2)
            java.lang.String r4 = "on310InstallCount"
            int r13 = r13.getInteger(r4, r2)
            if (r13 == r2) goto L245
            int r14 = r14 - r13
            r13 = 10
            if (r14 >= r13) goto L245
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r12.findRegion(r3)
            r13.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r0)
            int r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r13 = (float) r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r13)
            int r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r13 = (float) r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padBottom(r13)
            r12.fillX()
            r11.row()
            java.lang.String r12 = "viewOptionsMovedInfo"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r12, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r0)
            r12.fillX()
        L245:
            r11.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r4 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.lang.String r0 = r0.projectName
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._projectNameLabel
            java.lang.String r1 = "projectNotSaved"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r0.setText(r1)
            goto L21
        L18:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._projectNameLabel
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            java.lang.String r1 = r1.projectName
            r0.setText(r1)
        L21:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._watermarkButton
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            boolean r1 = r1.watermarkEnabled
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._watermarkTextField
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            java.lang.String r1 = r1.watermarkText
            r0.setText(r1)
            org.fortheloss.framework.ColorPicker r0 = r4._watermarkColorPicker
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            com.badlogic.gdx.graphics.Color r1 = r1.watermarkColor
            r2 = 0
            r0.setColor(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._ytShortsButton
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            boolean r1 = r1.isYoutubeShorts
            r0.setChecked(r1)
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            boolean r0 = r0.watermarkEnabled
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r4._watermarkTextField
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            r3 = 1
            if (r1 != 0) goto L55
            r1 = 1
            goto L56
        L55:
            r1 = 0
        L56:
            if (r0 != r1) goto L59
            r2 = 1
        L59:
            if (r2 == 0) goto Ldb
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            r0.clear()
            java.lang.String r0 = "showWatermark"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._watermarkTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._watermarkButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            r0.row()
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            boolean r0 = r0.watermarkEnabled
            if (r0 == 0) goto Ldb
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r4._watermarkTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.size(r1, r2)
            r1 = 2
            r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            r0.row()
            java.lang.String r0 = "watermarkColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._watermarkTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            org.fortheloss.framework.ColorPicker r1 = r4._watermarkColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._watermarkTable
            r0.row()
        Ldb:
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            if (r0 == 0) goto Lf1
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4._ytShortsCell
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto Lf6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4._ytShortsCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._ytShortsTable
            r0.setActor(r1)
            goto Lf6
        Lf1:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4._ytShortsCell
            r0.clearActor()
        Lf6:
            return
    }
}
