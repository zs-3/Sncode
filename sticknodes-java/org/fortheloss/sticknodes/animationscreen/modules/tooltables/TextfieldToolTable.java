package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class TextfieldToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addTextfieldButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _alignCenterButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _alignLeftButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _alignRightButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _alignTable;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyTextfieldButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _deleteTextfieldButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _drawAboveWidescreenButton;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _fontSelectBox;
    private boolean _ignoreNextFontChangeEvent;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _lockToCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteTextfieldButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _shadowButton;
    private org.fortheloss.framework.ColorPicker _shadowColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.TextArea _textArea;
    private org.fortheloss.framework.ColorPicker _textfieldColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _textfieldLockButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mLoadUnloadFontButton;
    private org.fortheloss.framework.LabelInputIncrementField mTextfieldOpacityField;
    private org.fortheloss.framework.DegreesLabelInputIncrementField mTextfieldRotationField;
    private org.fortheloss.framework.LabelInputIncrementField mTextfieldScaleField;


























    /* renamed from: -$$Nest$fget_fontSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m1236$$Nest$fget_fontSelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._fontSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fget_ignoreNextFontChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1237$$Nest$fget_ignoreNextFontChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            boolean r0 = r0._ignoreNextFontChangeEvent
            return r0
    }

    /* renamed from: -$$Nest$fget_shadowColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1238$$Nest$fget_shadowColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._shadowColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_textfieldColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1239$$Nest$fget_textfieldColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._textfieldColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fput_ignoreNextFontChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1240$$Nest$fput_ignoreNextFontChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0, boolean r1) {
            r0._ignoreNextFontChangeEvent = r1
            return
    }

    /* renamed from: -$$Nest$monAddTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1241$$Nest$monAddTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onAddTextfieldClick()
            return
    }

    /* renamed from: -$$Nest$monAlignCenterClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1242$$Nest$monAlignCenterClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onAlignCenterClick()
            return
    }

    /* renamed from: -$$Nest$monAlignLeftClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1243$$Nest$monAlignLeftClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onAlignLeftClick()
            return
    }

    /* renamed from: -$$Nest$monAlignRightClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1244$$Nest$monAlignRightClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onAlignRightClick()
            return
    }

    /* renamed from: -$$Nest$monCopyTextClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1245$$Nest$monCopyTextClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onCopyTextClick()
            return
    }

    /* renamed from: -$$Nest$monCopyTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1246$$Nest$monCopyTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onCopyTextfieldClick()
            return
    }

    /* renamed from: -$$Nest$monDeleteTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1247$$Nest$monDeleteTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onDeleteTextfieldClick()
            return
    }

    /* renamed from: -$$Nest$monDrawAboveWidescreenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1248$$Nest$monDrawAboveWidescreenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onDrawAboveWidescreenClick()
            return
    }

    /* renamed from: -$$Nest$monFontSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1249$$Nest$monFontSelection(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0, java.lang.String r1) {
            r0.onFontSelection(r1)
            return
    }

    /* renamed from: -$$Nest$monLockTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1250$$Nest$monLockTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onLockTextfieldClick()
            return
    }

    /* renamed from: -$$Nest$monLockTextfieldToCameraClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1251$$Nest$monLockTextfieldToCameraClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onLockTextfieldToCameraClick()
            return
    }

    /* renamed from: -$$Nest$monPasteTextClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1252$$Nest$monPasteTextClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onPasteTextClick()
            return
    }

    /* renamed from: -$$Nest$monPasteTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1253$$Nest$monPasteTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onPasteTextfieldClick()
            return
    }

    /* renamed from: -$$Nest$monShadowClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1254$$Nest$monShadowClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onShadowClick()
            return
    }

    /* renamed from: -$$Nest$monShadowColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1255$$Nest$monShadowColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onShadowColorSelect()
            return
    }

    /* renamed from: -$$Nest$monTextTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1256$$Nest$monTextTyped(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onTextTyped()
            return
    }

    /* renamed from: -$$Nest$monTextfieldColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1257$$Nest$monTextfieldColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0) {
            r0.onTextfieldColorSelect()
            return
    }

    public TextfieldToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0._ignoreNextFontChangeEvent = r1
            return
    }

    private void onAddTextfieldClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.addTextfield()
            return
    }

    private void onAlignCenterClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r1 = 1
            r0.alignText(r1)
            return
    }

    private void onAlignLeftClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r1 = 8
            r0.alignText(r1)
            return
    }

    private void onAlignRightClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r1 = 16
            r0.alignText(r1)
            return
    }

    private void onCopyTextClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.copyText()
            return
    }

    private void onCopyTextfieldClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.copyTextfield()
            return
    }

    private void onDeleteTextfieldClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.deleteTextfield()
            return
    }

    private void onDrawAboveWidescreenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._drawAboveWidescreenButton
            boolean r1 = r1.isChecked()
            r0.setTextfieldDrawAboveWidescreenBars(r1)
            return
    }

    private void onFontSelection(java.lang.String r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.setTextfieldFont(r2)
            return
    }

    private void onLockTextfieldClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._textfieldLockButton
            boolean r1 = r1.isChecked()
            r0.setTextfieldLocked(r1)
            return
    }

    private void onLockTextfieldToCameraClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._lockToCameraButton
            boolean r1 = r1.isChecked()
            r0.setTextfieldLockedToCamera(r1)
            return
    }

    private void onPasteTextClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteText()
            return
    }

    private void onPasteTextfieldClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteTextfield()
            return
    }

    private void onShadowClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._shadowButton
            boolean r1 = r1.isChecked()
            r0.setTextfieldHasShadow(r1)
            return
    }

    private void onShadowColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._shadowColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setTextfieldShadowColor(r1)
            return
    }

    private void onTextTyped() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r1 = r2._textArea
            java.lang.String r1 = r1.getText()
            r0.setTextfieldText(r1)
            return
    }

    private void onTextfieldColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._textfieldColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setTextfieldColor(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._titleLabel = r0
            r4._fontSelectBox = r0
            r4._textArea = r0
            r4._alignLeftButton = r0
            r4._alignCenterButton = r0
            r4._alignRightButton = r0
            r4._copyButton = r0
            r4._pasteButton = r0
            r4._textfieldColorPicker = r0
            r4._shadowButton = r0
            r4._shadowColorPicker = r0
            r4._drawAboveWidescreenButton = r0
            r4._textfieldLockButton = r0
            r4._lockToCameraButton = r0
            r4._addTextfieldButton = r0
            r4._copyTextfieldButton = r0
            r4._pasteTextfieldButton = r0
            r4._deleteTextfieldButton = r0
            r4.mLoadUnloadFontButton = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r4.mTextfieldScaleField
            if (r1 == 0) goto L30
            r1.dispose()
            r4.mTextfieldScaleField = r0
        L30:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r4.mTextfieldRotationField
            if (r1 == 0) goto L39
            r1.dispose()
            r4.mTextfieldRotationField = r0
        L39:
            org.fortheloss.framework.LabelInputIncrementField r1 = r4.mTextfieldOpacityField
            if (r1 == 0) goto L42
            r1.dispose()
            r4.mTextfieldOpacityField = r0
        L42:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._alignTable
            if (r1 == 0) goto L64
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L4e:
            if (r2 < 0) goto L62
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L5f
            r3.clear()
        L5f:
            int r2 = r2 + (-1)
            goto L4e
        L62:
            r4._alignTable = r0
        L64:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r25, com.badlogic.gdx.graphics.g2d.TextureAtlas r26, com.badlogic.gdx.scenes.scene2d.utils.Drawable r27) {
            r24 = this;
            r7 = r24
            r8 = r25
            r0 = r27
            super.initialize(r0)
            java.lang.String r0 = "textfieldTools"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r1)
            r7._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r24.row()
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBox()
            r7._fontSelectBox = r0
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = r1.getFontLoader()
            java.lang.String[] r1 = r1.getFontNames()
            r0.setItems(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r7._fontSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$1
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r7._fontSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            r0.height(r1)
            r24.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.defaults()
            r2 = 0
            r1.uniform(r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.colspan(r10)
            r24.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r11 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r11)
            r1.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r10)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r3)
            r1.fillX()
            r24.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            java.lang.String r3 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r3, r1)
            r7.mLoadUnloadFontButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$2 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$2
            r4.<init>(r7)
            r1.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mLoadUnloadFontButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r7.mLoadUnloadFontButton
            float r4 = r4.getWidth()
            r5 = 1061158912(0x3f400000, float:0.75)
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r4)
            r12 = 16
            r1.align(r12)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r4 = "?"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r4, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$3 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$3
            r4.<init>(r7)
            r1.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            float r1 = r1.getWidth()
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            r13 = 8
            r0.align(r13)
            java.lang.String r0 = "txtTextAlignment"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r24.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextArea
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextAreaAllLocalesStyle()
            r0.<init>(r3, r1)
            r7._textArea = r0
            r0.setOnlyFontChars(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r7._textArea
            r0.setFocusTraversal(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r7._textArea
            org.fortheloss.framework.CustomStopListener r1 = new org.fortheloss.framework.CustomStopListener
            r1.<init>()
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r7._textArea
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$4 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$4
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r7._textArea
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$5
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r7._textArea
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            int r1 = r1 * 2
            float r1 = (float) r1
            r0.height(r1)
            r24.row()
            java.lang.String r0 = "copy"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._copyButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$6
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._copyButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._copyButton
            float r1 = r1.getHeight()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r12)
            java.lang.String r0 = "paste"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._pasteButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$7 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$7
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._pasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._pasteButton
            float r1 = r1.getHeight()
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r13)
            r24.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._alignTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r24.row()
            java.lang.String r0 = "left"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._alignTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            java.lang.String r0 = "center"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._alignTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            java.lang.String r0 = "right"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._alignTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._alignTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._alignLeftButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$8 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$8
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._alignTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._alignLeftButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._alignCenterButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$9 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$9
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._alignTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._alignCenterButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._alignRightButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$10 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$10
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._alignTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._alignRightButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r0.<init>()
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r1]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._alignLeftButton
            r1[r2] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._alignCenterButton
            r1[r9] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._alignRightButton
            r1[r10] = r2
            r0.add(r1)
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
            r24.row()
            java.lang.String r0 = "textfieldColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$11 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$11
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r7._animationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r15
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r6 = r0.getIsLeftHandMode()
            r0 = r14
            r1 = r24
            r4 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._textfieldColorPicker = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            r14.setColor(r6, r6, r6, r6)
            org.fortheloss.framework.ColorPicker r0 = r7._textfieldColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$12 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$12
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7._textfieldColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r13)
            r24.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r24.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r1.getContext()
            java.lang.String r1 = "textfieldScale"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r19 = "1.00"
            r20 = 4
            r21 = 1008981770(0x3c23d70a, float:0.01)
            r22 = 1092616192(0x41200000, float:10.0)
            r23 = 1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7.mTextfieldScaleField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$13 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$13
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mTextfieldScaleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r24.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r24.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r1.getContext()
            java.lang.String r1 = "textfieldRotation"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r19 = "0"
            r20 = 3
            r21 = 0
            r22 = 1135837184(0x43b38000, float:359.0)
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7.mTextfieldRotationField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$14 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$14
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r7.mTextfieldRotationField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r24.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r24.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r1.getContext()
            java.lang.String r1 = "opacity"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r19 = "1.00"
            r20 = 4
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7.mTextfieldOpacityField = r0
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mTextfieldOpacityField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$15 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$15
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mTextfieldOpacityField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r24.row()
            java.lang.String r0 = "textfieldShadow"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
            r0.fillX()
            r24.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._shadowButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$16 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$16
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._shadowButton
            r7.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$17 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$17
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r7._animationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r0 * r15
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r15 = r0.getIsLeftHandMode()
            r0 = r14
            r1 = r24
            r12 = 1065353216(0x3f800000, float:1.0)
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._shadowColorPicker = r14
            r0 = 0
            r14.setColor(r0, r0, r0, r12)
            org.fortheloss.framework.ColorPicker r0 = r7._shadowColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$18 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$18
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7._shadowColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r13)
            r24.row()
            java.lang.String r0 = "drawAboveWidescreenBars"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._drawAboveWidescreenButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$19 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$19
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._drawAboveWidescreenButton
            r7.add(r0)
            r24.row()
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
            r24.row()
            java.lang.String r0 = "lockTextfield"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._textfieldLockButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$20 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$20
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._textfieldLockButton
            r7.add(r0)
            r24.row()
            java.lang.String r0 = "lockTextfieldToCamera"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._lockToCameraButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$21 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$21
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._lockToCameraButton
            r7.add(r0)
            r24.row()
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
            r24.row()
            java.lang.String r0 = "addTextfield"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._addTextfieldButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$22 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$22
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._addTextfieldButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r10)
            r24.row()
            java.lang.String r0 = "copyTextfield"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._copyTextfieldButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$23 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$23
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._copyTextfieldButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 16
            r0.align(r1)
            java.lang.String r0 = "pasteTextfield"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._pasteTextfieldButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$24 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$24
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._pasteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r24.row()
            java.lang.String r0 = "deleteTextfield"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7._deleteTextfieldButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$25 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable$25
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._deleteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r10)
            r24.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r8 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r8.mSessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L16
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r8.setTouchable(r0)
            r8.setColor(r2, r2, r2, r1)
            goto L187
        L16:
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r8.setTouchable(r3)
            r8.setColor(r2, r2, r2, r2)
            org.fortheloss.sticknodes.data.SessionData r3 = r8.mSessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r3 = r3.getCopiedTextfield()
            if (r3 != 0) goto L33
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r8._pasteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r8._pasteTextfieldButton
            r3.setColor(r2, r2, r2, r1)
            goto L3f
        L33:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r8._pasteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r8._pasteTextfieldButton
            r3.setColor(r2, r2, r2, r2)
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r3 = r8._textArea
            java.lang.String r4 = r0.getText()
            r3.setText(r4)
            int r3 = r0.getAlignment()
            r4 = 8
            r5 = 1
            if (r3 != r4) goto L57
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._alignLeftButton
            r3.setChecked(r5)
            goto L6a
        L57:
            int r3 = r0.getAlignment()
            r4 = 16
            if (r3 != r4) goto L65
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._alignRightButton
            r3.setChecked(r5)
            goto L6a
        L65:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._alignCenterButton
            r3.setChecked(r5)
        L6a:
            org.fortheloss.framework.ColorPicker r3 = r8._textfieldColorPicker
            com.badlogic.gdx.graphics.Color r4 = r0.getColor()
            r6 = 0
            r3.setColor(r4, r6)
            float r3 = r0.getScale()
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r4
            org.fortheloss.framework.LabelInputIncrementField r7 = r8.mTextfieldScaleField
            r7.setValue(r3)
            float r3 = r0.getRotation()
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r4
            org.fortheloss.framework.DegreesLabelInputIncrementField r4 = r8.mTextfieldRotationField
            r4.setValue(r3)
            org.fortheloss.framework.LabelInputIncrementField r3 = r8.mTextfieldOpacityField
            float r4 = r0.getAlpha()
            r3.setValue(r4)
            boolean r3 = r0.isLockedToCamera()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r8._textfieldLockButton
            boolean r7 = r0.isLocked()
            if (r7 != 0) goto Lb2
            if (r3 == 0) goto Lb0
            goto Lb2
        Lb0:
            r7 = 0
            goto Lb3
        Lb2:
            r7 = 1
        Lb3:
            r4.setChecked(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r8._lockToCameraButton
            r4.setChecked(r3)
            if (r3 == 0) goto Ld4
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r8.mTextfieldRotationField
            r3.disable()
            org.fortheloss.framework.LabelInputIncrementField r3 = r8.mTextfieldScaleField
            r3.disable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._textfieldLockButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._textfieldLockButton
            r3.setColor(r2, r2, r2, r1)
            goto Lea
        Ld4:
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r8.mTextfieldRotationField
            r3.enable()
            org.fortheloss.framework.LabelInputIncrementField r3 = r8.mTextfieldScaleField
            r3.enable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._textfieldLockButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._textfieldLockButton
            r3.setColor(r2, r2, r2, r2)
        Lea:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._shadowButton
            boolean r4 = r0.hasShadow()
            r3.setChecked(r4)
            org.fortheloss.framework.ColorPicker r3 = r8._shadowColorPicker
            com.badlogic.gdx.graphics.Color r4 = r0.getShadowColor()
            r3.setColor(r4, r6)
            boolean r3 = r0.hasShadow()
            if (r3 == 0) goto L10f
            org.fortheloss.framework.ColorPicker r3 = r8._shadowColorPicker
            r3.disableWithAlpha(r6)
            org.fortheloss.framework.ColorPicker r3 = r8._shadowColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            goto L11b
        L10f:
            org.fortheloss.framework.ColorPicker r3 = r8._shadowColorPicker
            r3.disableWithAlpha(r5)
            org.fortheloss.framework.ColorPicker r3 = r8._shadowColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
        L11b:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r8._drawAboveWidescreenButton
            boolean r4 = r0.getDrawAboveWidescreenBars()
            r3.setChecked(r4)
            org.fortheloss.sticknodes.data.ProjectData r3 = r8._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r3 = r3.getFontLoader()
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r8._fontSelectBox
            java.lang.Object r4 = r4.getSelected()
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r0.getFontID()
            java.lang.String r6 = r3.getFontName(r6)
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 != 0) goto L147
            r8._ignoreNextFontChangeEvent = r5
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r8._fontSelectBox
            r4.setSelected(r6)
        L147:
            int r0 = r0.getFontID()
            boolean r4 = r3.isFontLoaded(r0)
            if (r4 == 0) goto L15d
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r8.mLoadUnloadFontButton
            java.lang.String r5 = "unloadFont"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r4.setText(r5)
            goto L168
        L15d:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r8.mLoadUnloadFontButton
            java.lang.String r5 = "loadFont"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r4.setText(r5)
        L168:
            int r3 = r3.getDefaultFontId()
            if (r0 != r3) goto L17b
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.mLoadUnloadFontButton
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.mLoadUnloadFontButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            goto L187
        L17b:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.mLoadUnloadFontButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.mLoadUnloadFontButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
        L187:
            return
    }
}
