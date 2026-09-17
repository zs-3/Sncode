package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class PolyfillCreationToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addPolynodeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _deletePolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _endPolyfullButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _infoExpandLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _infoLabel;
    private boolean _infoLabelExpanded;
    private org.fortheloss.framework.ColorPicker _polyfillColorPicker;
    private org.fortheloss.framework.LabelInputIncrementField _polyfillCurvePrecisionField;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _polynodeCountLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _polynodePreciseButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _polynodePreciseInstructionsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _polynodePreciseTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _polynodeQuickButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _polynodeSelectionPrecisionLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _preciseButtonsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _pushBackButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _pushForwardButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _removeLastPolynodeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _removePolynodeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showPolynodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _usePolyfillColorButton;
















    /* renamed from: -$$Nest$fget_polyfillColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1073$$Nest$fget_polyfillColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._polyfillColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_showPolynodesButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1074$$Nest$fget_showPolynodesButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showPolynodesButton
            return r0
    }

    /* renamed from: -$$Nest$monDeletePolyfillClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1075$$Nest$monDeletePolyfillClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            r0.onDeletePolyfillClick()
            return
    }

    /* renamed from: -$$Nest$monEndPolyfillClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1076$$Nest$monEndPolyfillClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            r0.onEndPolyfillClick()
            return
    }

    /* renamed from: -$$Nest$monPolyfillColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1077$$Nest$monPolyfillColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            r0.onPolyfillColorSelect()
            return
    }

    /* renamed from: -$$Nest$monRemoveLastPolynodeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1078$$Nest$monRemoveLastPolynodeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            r0.onRemoveLastPolynodeClick()
            return
    }

    /* renamed from: -$$Nest$monUsePolyfillColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1079$$Nest$monUsePolyfillColorClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            r0.onUsePolyfillColorClick()
            return
    }

    /* renamed from: -$$Nest$mtoggleLagLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1080$$Nest$mtoggleLagLabel(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0) {
            r0.toggleLagLabel()
            return
    }

    public PolyfillCreationToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0._infoLabelExpanded = r1
            return
    }

    private void onDeletePolyfillClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.deletePolyfill()
            return
    }

    private void onEndPolyfillClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.endPolyfill()
            return
    }

    private void onPolyfillColorSelect() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._creationToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r3._polyfillColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r3._creationToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getCurrentWorkingPolyfillAnchor()
            r0.setPolyfillColor(r1, r2)
            return
    }

    private void onRemoveLastPolynodeClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.removeLastPolynode()
            return
    }

    private void onUsePolyfillColorClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._creationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r3._usePolyfillColorButton
            boolean r1 = r1.isChecked()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r3._creationToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getCurrentWorkingPolyfillAnchor()
            r0.setUsePolyfillColor(r1, r2)
            return
    }

    private void toggleLagLabel() {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._infoExpandLabel
            if (r0 == 0) goto L5f
            boolean r0 = r5._infoLabelExpanded
            java.lang.String r1 = "]"
            java.lang.String r2 = "["
            if (r0 == 0) goto L34
            r0 = 0
            r5._infoLabelExpanded = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._infoLabel
            java.lang.String r3 = "..."
            r0.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._infoExpandLabel
            java.lang.String r3 = "more"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.setText(r1)
            goto L5f
        L34:
            r0 = 1
            r5._infoLabelExpanded = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._infoLabel
            java.lang.String r3 = "polyfillCreationToolsInfoNew"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._infoExpandLabel
            java.lang.String r3 = "less"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.setText(r1)
        L5f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._polynodeCountLabel = r0
            r2._usePolyfillColorButton = r0
            org.fortheloss.framework.ColorPicker r1 = r2._polyfillColorPicker
            if (r1 == 0) goto L10
            r1.dispose()
            r2._polyfillColorPicker = r0
        L10:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2._polyfillCurvePrecisionField
            if (r1 == 0) goto L19
            r1.dispose()
            r2._polyfillCurvePrecisionField = r0
        L19:
            r2._removeLastPolynodeButton = r0
            r2._endPolyfullButton = r0
            r2._deletePolyfillButton = r0
            r2._infoLabel = r0
            r2._infoExpandLabel = r0
            r2._polynodeSelectionPrecisionLabel = r0
            r2._polynodePreciseInstructionsLabel = r0
            r2._polynodeQuickButton = r0
            r2._polynodePreciseButton = r0
            r2._addPolynodeButton = r0
            r2._removePolynodeButton = r0
            r2._showPolynodesButton = r0
            r2._preciseButtonsTable = r0
            r2._polynodePreciseTableCellRef = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r12, com.badlogic.gdx.graphics.g2d.TextureAtlas r13, com.badlogic.gdx.scenes.scene2d.utils.Drawable r14) {
            r11 = this;
            super.initialize(r14)
            java.lang.String r14 = "polyfillTools"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1, r0)
            r11._titleLabel = r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fillX()
            r0 = 2
            r14.colspan(r0)
            r11.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r14 = r11.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r14.getContext()
            org.fortheloss.sticknodes.data.SessionData r14 = r14.getSessionData()
            boolean r14 = r14.getNerdModeEnabled()
            java.lang.String r2 = "separator"
            if (r14 != 0) goto L100
            java.lang.String r14 = "polyfillEditInfo1"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r3 = "polyfillEditInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "polyfillEditInfo3"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r5 = "polyfillToolsInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r14 = "\n\n"
            r6.append(r14)
            r6.append(r3)
            r6.append(r14)
            r6.append(r4)
            r6.append(r14)
            r6.append(r5)
            java.lang.String r14 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1)
            r11._infoLabel = r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fillX()
            r14.colspan(r0)
            r11.row()
            java.lang.String r14 = "less"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "["
            r3.append(r4)
            r3.append(r14)
            java.lang.String r14 = "]"
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r3.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1, r3)
            r11._infoExpandLabel = r14
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = r14.getStyle()
            com.badlogic.gdx.graphics.Color r14 = r14.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r14.set(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r11._infoExpandLabel
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$1 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$1
            r3.<init>(r11)
            r14.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r11._infoExpandLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r12.findRegion(r2)
            r14.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fillX()
            r14.colspan(r0)
            r11.row()
        L100:
            java.lang.String r14 = "polynodeCount"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            java.lang.String r14 = ": 0"
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1)
            r11._polynodeCountLabel = r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fillX()
            r14.colspan(r0)
            r11.row()
            java.lang.String r14 = "finishPolyfill"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeApplyStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r14, r3)
            r11._endPolyfullButton = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$2
            r3.<init>(r11)
            r14.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r14 = r11._endPolyfullButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            r14.colspan(r0)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r12.findRegion(r2)
            r14.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fillX()
            r14.colspan(r0)
            r11.row()
            java.lang.String r14 = "usePolyfillColor"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
            r11._usePolyfillColorButton = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$3 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$3
            r3.<init>(r11)
            r14.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = r11._usePolyfillColorButton
            r11.add(r14)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$4 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$4
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r11._creationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r3.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            r3 = 1092616192(0x41200000, float:10.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r4 * r3
            org.fortheloss.sticknodes.data.SessionData r3 = r11.mSessionDataRef
            boolean r9 = r3.getIsLeftHandMode()
            r3 = r14
            r4 = r11
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11._polyfillColorPicker = r14
            com.badlogic.gdx.graphics.Color r13 = org.fortheloss.sticknodes.App.COLOR_POLYFILL_DEFAULT
            r14.setColor(r13)
            org.fortheloss.framework.ColorPicker r13 = r11._polyfillColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$5 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$5
            r14.<init>(r11)
            r13.addListener(r14)
            org.fortheloss.framework.ColorPicker r13 = r11._polyfillColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.width(r14)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.height(r14)
            r14 = 8
            r13.align(r14)
            r11.row()
            org.fortheloss.framework.LabelInputIncrementField r13 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r11.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3.getContext()
            java.lang.String r3 = "polyfillCurvePrecision"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "\n(0 - 5)"
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r7 = 1
            r8 = 0
            r9 = 1084227584(0x40a00000, float:5.0)
            r10 = 0
            java.lang.String r6 = "1"
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11._polyfillCurvePrecisionField = r13
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$6 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$6
            r3.<init>(r11)
            r13.setFieldListener(r3)
            org.fortheloss.framework.LabelInputIncrementField r13 = r11._polyfillCurvePrecisionField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
            r13.fillX()
            r11.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r13 = r11.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r13.getContext()
            org.fortheloss.sticknodes.data.SessionData r13 = r13.getSessionData()
            boolean r13 = r13.getNerdModeEnabled()
            if (r13 != 0) goto L266
            java.lang.String r13 = "polyfillCurvePrecisionInfo"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
            r13.fillX()
            r11.row()
        L266:
            java.lang.String r13 = "showPolynodes"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            r13.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r13)
            r11._showPolynodesButton = r13
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$7 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$7
            r3.<init>(r11)
            r13.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r11._showPolynodesButton
            r11.add(r13)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r12.findRegion(r2)
            r13.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.colspan(r0)
            r11.row()
            java.lang.String r13 = "polynodeSelectionPrecision"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            r11._polynodeSelectionPrecisionLabel = r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.colspan(r0)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            r3.fillX()
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r12.findRegion(r2)
            r3.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r3)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.fillX()
            r12.colspan(r0)
            r11.row()
            java.lang.String r12 = "quick"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r12, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r13.add(r12)
            r12.fillX()
            java.lang.String r12 = "precise"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r12, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r13.add(r12)
            r12.fillX()
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r12)
            r11._polynodeQuickButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$8 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$8
            r2.<init>(r11)
            r12.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r11._polynodeQuickButton
            r13.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r12)
            r11._polynodePreciseButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$9 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$9
            r2.<init>(r11)
            r12.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r11._polynodePreciseButton
            r13.add(r12)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r12 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r0]
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r11._polynodeQuickButton
            r2[r3] = r4
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r11._polynodePreciseButton
            r2[r1] = r3
            r12.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r11._polynodeQuickButton
            r12.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r11._preciseButtonsTable = r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r13.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r0)
            r11._polynodePreciseTableCellRef = r12
            java.lang.String r12 = "withSelectedNode"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = ":"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r12, r1)
            r11._polynodePreciseInstructionsLabel = r12
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r11._preciseButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r13.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.fillX()
            r12.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            r12.row()
            java.lang.String r12 = "addAsPolynode"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r12, r13)
            r11._addPolynodeButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$10 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$10
            r13.<init>(r11)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r11._addPolynodeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r13)
            r12.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            r12.row()
            java.lang.String r12 = "removePolynode"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r12, r13)
            r11._removePolynodeButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$11 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$11
            r13.<init>(r11)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r11._removePolynodeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r13)
            r12.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushBackwardStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r12)
            r11._pushBackButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$12 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$12
            r13.<init>(r11)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r13 = r11._pushBackButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r13)
            r13 = 16
            r12.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushForwardStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r12)
            r11._pushForwardButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$13 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$13
            r13.<init>(r11)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r11._preciseButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r13 = r11._pushForwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r13)
            r12.align(r14)
            java.lang.String r12 = "removeLastPolynode"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeUndoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r12, r13)
            r11._removeLastPolynodeButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$14 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$14
            r13.<init>(r11)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r12 = r11._removeLastPolynodeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            r12.colspan(r0)
            r11.row()
            java.lang.String r12 = "deletePolyfill"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r12, r13)
            r11._deletePolyfillButton = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$15 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable$15
            r13.<init>(r11)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r12 = r11._deletePolyfillButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            r12.colspan(r0)
            r11.row()
            r11.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r11 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r11._creationToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getCurrentWorkingPolyfillAnchor()
            org.fortheloss.sticknodes.data.SessionData r1 = r11.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            r2 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L22
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r11.setTouchable(r0)
            r11.setColor(r4, r4, r4, r3)
            org.fortheloss.framework.ColorPicker r0 = r11._polyfillColorPicker
            r0.disableWithAlpha(r2)
            goto L164
        L22:
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r11.setTouchable(r5)
            r11.setColor(r4, r4, r4, r4)
            org.fortheloss.framework.ColorPicker r6 = r11._polyfillColorPicker
            r7 = 0
            r6.disableWithAlpha(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r11._polynodeCountLabel
            java.lang.String r8 = "polynodeCount"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            int r9 = r0.getPolynodeChildrenCount()
            int r9 = r9 + r2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = ": "
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r6.setText(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r11._usePolyfillColorButton
            boolean r8 = r0.isUsingPolyfillColor()
            r6.setChecked(r8)
            org.fortheloss.framework.ColorPicker r6 = r11._polyfillColorPicker
            com.badlogic.gdx.graphics.Color r8 = r0.getPolyfillColor()
            r6.setColor(r8, r7)
            org.fortheloss.framework.LabelInputIncrementField r6 = r11._polyfillCurvePrecisionField
            int r8 = r0.getSegmentCurvePrecision()
            float r8 = (float) r8
            r6.setValue(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r11._polynodePreciseButton
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r8 = r11._creationToolsModuleRef
            boolean r8 = r8.getPolynodeSelectionPrecisionIsQuick()
            r8 = r8 ^ r2
            r6.setChecked(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r11._polynodeQuickButton
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r8 = r11._creationToolsModuleRef
            boolean r8 = r8.getPolynodeSelectionPrecisionIsQuick()
            r6.setChecked(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r11._showPolynodesButton
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r8 = r11._creationToolsModuleRef
            boolean r8 = r8.getPolynodeIsShowingNumbers()
            r6.setChecked(r8)
            if (r1 == 0) goto L100
            if (r1 != r0) goto L97
            goto L100
        L97:
            java.util.ArrayList r6 = r0.getPolynodeChildren()
            if (r6 == 0) goto Ld5
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto Ld5
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto Laa
            goto Ld5
        Laa:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._addPolynodeButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._addPolynodeButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._removePolynodeButton
            r1.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._removePolynodeButton
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushBackButton
            r1.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushBackButton
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushForwardButton
            r1.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushForwardButton
            r1.setColor(r4, r4, r4, r4)
            goto L12a
        Ld5:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._addPolynodeButton
            r1.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._addPolynodeButton
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._removePolynodeButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._removePolynodeButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushBackButton
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushBackButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushForwardButton
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushForwardButton
            r1.setColor(r4, r4, r4, r3)
            goto L12a
        L100:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._addPolynodeButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._addPolynodeButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._removePolynodeButton
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r11._removePolynodeButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushBackButton
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushBackButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushForwardButton
            r1.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r11._pushForwardButton
            r1.setColor(r4, r4, r4, r3)
        L12a:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r11._polynodePreciseButton
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L142
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r11._polynodePreciseTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 != 0) goto L147
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r11._polynodePreciseTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r11._preciseButtonsTable
            r1.setActor(r3)
            goto L147
        L142:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r11._polynodePreciseTableCellRef
            r1.clearActor()
        L147:
            boolean r0 = r0.isUsingPolyfillColor()
            if (r0 == 0) goto L158
            org.fortheloss.framework.ColorPicker r0 = r11._polyfillColorPicker
            r0.setTouchable(r5)
            org.fortheloss.framework.ColorPicker r0 = r11._polyfillColorPicker
            r0.disableWithAlpha(r7)
            goto L164
        L158:
            org.fortheloss.framework.ColorPicker r0 = r11._polyfillColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            org.fortheloss.framework.ColorPicker r0 = r11._polyfillColorPicker
            r0.disableWithAlpha(r2)
        L164:
            return
    }
}
