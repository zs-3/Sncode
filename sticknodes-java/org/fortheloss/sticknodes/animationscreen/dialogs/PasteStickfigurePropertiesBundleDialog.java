package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PasteStickfigurePropertiesBundleDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private static boolean colorChecked = true;
    private static boolean filtersChecked = true;
    private static boolean layeringChecked = true;
    private static boolean nodePropertiesChecked = true;
    private static boolean positionChecked = true;
    private static boolean rotationChecked = true;
    private static boolean scaleChecked = true;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private org.fortheloss.sticknodes.data.StickfigurePropertiesBundle _bundleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _colorCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filtersCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _layeringCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _nodePropertiesCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _positionCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _rotationCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _scaleCheckbox;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureToPasteOntoRef;

    static {
            return
    }

    public PasteStickfigurePropertiesBundleDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._canvasModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            super.dialogResult(r19)
            r1 = r19
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L63
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r0._positionCheckbox
            boolean r1 = r1.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._scaleCheckbox
            boolean r12 = r2.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._colorCheckbox
            boolean r13 = r2.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._rotationCheckbox
            boolean r14 = r2.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._filtersCheckbox
            boolean r15 = r2.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._layeringCheckbox
            boolean r16 = r2.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._nodePropertiesCheckbox
            boolean r17 = r2.isChecked()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r0._canvasModuleRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureToPasteOntoRef
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r4 = r0._bundleRef
            r5 = r1
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r2.actuallyPasteStickfigurePropertiesBundle(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.positionChecked = r1
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.scaleChecked = r12
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.colorChecked = r13
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.rotationChecked = r14
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.filtersChecked = r15
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.layeringChecked = r16
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r0._nodePropertiesCheckbox
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = r1.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r1 == r2) goto L63
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.nodePropertiesChecked = r17
        L63:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._sessionDataRef = r0
            r1._animateToolsModuleRef = r0
            r1._canvasModuleRef = r0
            r1._bundleRef = r0
            r1._stickfigureToPasteOntoRef = r0
            r1._positionCheckbox = r0
            r1._scaleCheckbox = r0
            r1._colorCheckbox = r0
            r1._rotationCheckbox = r0
            r1._filtersCheckbox = r0
            r1._layeringCheckbox = r0
            r1._nodePropertiesCheckbox = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r8, org.fortheloss.sticknodes.stickfigure.Stickfigure r9) {
            r7 = this;
            java.lang.String r0 = "pasteStickfigurePropertiesTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r7._bundleRef = r8
            r7._stickfigureToPasteOntoRef = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r1, r1)
            r0.expand(r1, r1)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r8.getCopiedStickfigureName()
            r4[r1] = r5
            java.lang.String r5 = "pasteStickfigurePropertiesInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r5.<init>(r6)
            r2.<init>(r4, r5)
            r2.setWrap(r3)
            r2.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.addContent(r2)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            r4 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r4)
            r2.padBottom(r0)
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "position"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r2, r4)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r7._positionCheckbox = r0
            boolean r2 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.positionChecked
            r0.setChecked(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._positionCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r2 = 8
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "pastePositionInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "stickfigureScale"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            r0.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r7._scaleCheckbox = r0
            boolean r4 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.scaleChecked
            r0.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._scaleCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "pasteScaleInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "stickfigureColor"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            r0.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r7._colorCheckbox = r0
            boolean r4 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.colorChecked
            r0.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._colorCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "pasteColorInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "stickfigureRotation"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            r0.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r7._rotationCheckbox = r0
            boolean r4 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.rotationChecked
            r0.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._rotationCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "pasteRotationInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "stickfigureFilters2"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            r0.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r7._filtersCheckbox = r0
            boolean r4 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.filtersChecked
            r0.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._filtersCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "pasteFiltersInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "layering"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            r0.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r7._layeringCheckbox = r0
            boolean r4 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.layeringChecked
            r0.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._layeringCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "pasteLayeringInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "nodeProperties"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.addContent(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r5 = (float) r5
            r4.width(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            r7._nodePropertiesCheckbox = r4
            boolean r5 = org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog.nodePropertiesChecked
            r4.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._nodePropertiesCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.addContent(r4)
            r4.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "pasteNodePropertiesInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r4.<init>(r5, r6)
            r4.setWrap(r3)
            r4.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.fillX()
            r7.addContentRow()
            int r9 = r9.getLibraryID()
            int r8 = r8.getCopiedStickfigureLibraryID()
            if (r9 == r8) goto L309
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._nodePropertiesCheckbox
            r8.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._nodePropertiesCheckbox
            r9 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r8.setColor(r9, r9, r9, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._nodePropertiesCheckbox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r8.setTouchable(r2)
            r0.setColor(r9, r9, r9, r1)
            r4.setColor(r9, r9, r9, r1)
        L309:
            java.lang.String r8 = "paste"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r7.addButton(r8, r9)
            java.lang.String r8 = "cancel"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r7.addButton(r8, r9)
            return
    }
}
