package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class FigureFiltersToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _cellJoinParentTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _joinParentTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _useJoinParentFiltersButton;
    private org.fortheloss.framework.LabelInputIncrementField mBlurField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mClearFiltersButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mCopyFiltersButton;
    private org.fortheloss.framework.LabelInputIncrementSmallField mDropShadowAlphaField;
    private org.fortheloss.framework.LabelInputIncrementSmallField mDropShadowAngleField;
    private org.fortheloss.framework.LabelInputIncrementSmallField mDropShadowBlurField;
    private org.fortheloss.framework.ColorPicker mDropShadowColorPicker;
    private org.fortheloss.framework.LabelInputIncrementSmallField mDropShadowDistanceField;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mDropShadowTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mFiltersSubTable;
    private org.fortheloss.framework.LabelColorInputIncrementField mGlowColorField;
    private org.fortheloss.framework.LabelInputIncrementField mGlowIntensityField;
    private org.fortheloss.framework.LabelInputIncrementField mHueShiftField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mInvertColorButton;
    private java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> mLabels;
    private org.fortheloss.framework.CheckBoxInputIncrementField mMotionBlurField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mOmniCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mOmniDirectionalBlurButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mOneDirectionTable;
    private org.fortheloss.framework.LabelColorInputIncrementField mOutlineColorField;
    private org.fortheloss.framework.LabelInputIncrementField mOutlineThickness;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mPasteFiltersButton;
    private org.fortheloss.framework.LabelInputIncrementField mPixelateField;
    private org.fortheloss.framework.LabelInputIncrementField mSaturationField;
    private org.fortheloss.framework.LabelColorInputIncrementField mTintField;
    private org.fortheloss.framework.LabelInputIncrementField mTransparencyField;
    private int mType;
























    /* renamed from: -$$Nest$fgetmDropShadowColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m927$$Nest$fgetmDropShadowColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mDropShadowColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmMotionBlurField, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.CheckBoxInputIncrementField m928$$Nest$fgetmMotionBlurField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r0.mMotionBlurField
            return r0
    }

    /* renamed from: -$$Nest$fgetmOmniDirectionalBlurButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m929$$Nest$fgetmOmniDirectionalBlurButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mOmniDirectionalBlurButton
            return r0
    }

    /* renamed from: -$$Nest$monClearFiltersClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m930$$Nest$monClearFiltersClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            r0.onClearFiltersClick()
            return
    }

    /* renamed from: -$$Nest$monCopyFiltersClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m931$$Nest$monCopyFiltersClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            r0.onCopyFiltersClick()
            return
    }

    /* renamed from: -$$Nest$monDropShadowColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m932$$Nest$monDropShadowColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            r0.onDropShadowColorSelect()
            return
    }

    /* renamed from: -$$Nest$monInvertColorButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m933$$Nest$monInvertColorButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            r0.onInvertColorButtonClick()
            return
    }

    /* renamed from: -$$Nest$monPasteFiltersClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m934$$Nest$monPasteFiltersClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            r0.onPasteFiltersClick()
            return
    }

    /* renamed from: -$$Nest$monUseJoinParentFiltersClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m935$$Nest$monUseJoinParentFiltersClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0) {
            r0.onUseJoinParentFiltersClick()
            return
    }

    public FigureFiltersToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.mType = r4
            return
    }

    private void onClearFiltersClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.clearFigureFilters()
            return
    }

    private void onCopyFiltersClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.copyFigureFilters()
            return
    }

    private void onDropShadowColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2.mDropShadowColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setFigureDropShadowColor(r1)
            return
    }

    private void onInvertColorButtonClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2.mInvertColorButton
            boolean r1 = r1.isChecked()
            r0.invertFigureColor(r1)
            return
    }

    private void onPasteFiltersClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pasteFigureFilters()
            return
    }

    private void onUseJoinParentFiltersClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._useJoinParentFiltersButton
            boolean r1 = r1.isChecked()
            r0.setFigureUseJoinParentFilters(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2.mInvertColorButton = r0
            r2.mOmniDirectionalBlurButton = r0
            r2._useJoinParentFiltersButton = r0
            r2.mLabels = r0
            r2.mClearFiltersButton = r0
            r2.mCopyFiltersButton = r0
            r2.mPasteFiltersButton = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mTransparencyField
            if (r1 == 0) goto L1a
            r1.dispose()
            r2.mTransparencyField = r0
        L1a:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mSaturationField
            if (r1 == 0) goto L23
            r1.dispose()
            r2.mSaturationField = r0
        L23:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mPixelateField
            if (r1 == 0) goto L2c
            r1.dispose()
            r2.mPixelateField = r0
        L2c:
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r2.mTintField
            if (r1 == 0) goto L35
            r1.dispose()
            r2.mTintField = r0
        L35:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mHueShiftField
            if (r1 == 0) goto L3e
            r1.dispose()
            r2.mHueShiftField = r0
        L3e:
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r2.mOutlineColorField
            if (r1 == 0) goto L47
            r1.dispose()
            r2.mOutlineColorField = r0
        L47:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mOutlineThickness
            if (r1 == 0) goto L50
            r1.dispose()
            r2.mOutlineThickness = r0
        L50:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mBlurField
            if (r1 == 0) goto L59
            r1.dispose()
            r2.mBlurField = r0
        L59:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mMotionBlurField
            if (r1 == 0) goto L62
            r1.dispose()
            r2.mMotionBlurField = r0
        L62:
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r2.mGlowColorField
            if (r1 == 0) goto L6b
            r1.dispose()
            r2.mGlowColorField = r0
        L6b:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mGlowIntensityField
            if (r1 == 0) goto L74
            r1.dispose()
            r2.mGlowIntensityField = r0
        L74:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r2.mDropShadowAlphaField
            if (r1 == 0) goto L7d
            r1.dispose()
            r2.mDropShadowAlphaField = r0
        L7d:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r2.mDropShadowDistanceField
            if (r1 == 0) goto L86
            r1.dispose()
            r2.mDropShadowDistanceField = r0
        L86:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r2.mDropShadowAngleField
            if (r1 == 0) goto L8f
            r1.dispose()
            r2.mDropShadowAngleField = r0
        L8f:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r2.mDropShadowBlurField
            if (r1 == 0) goto L98
            r1.dispose()
            r2.mDropShadowBlurField = r0
        L98:
            org.fortheloss.framework.ColorPicker r1 = r2.mDropShadowColorPicker
            if (r1 == 0) goto La1
            r1.dispose()
            r2.mDropShadowColorPicker = r0
        La1:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mTransparencyField
            if (r1 == 0) goto Laa
            r1.dispose()
            r2.mTransparencyField = r0
        Laa:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mDropShadowTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mDropShadowTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mFiltersSubTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mFiltersSubTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._joinParentTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._joinParentTable = r0
            r2._cellJoinParentTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mOneDirectionTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mOneDirectionTable = r0
            r2.mOmniCell = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r22, com.badlogic.gdx.graphics.g2d.TextureAtlas r23, com.badlogic.gdx.scenes.scene2d.utils.Drawable r24) {
            r21 = this;
            r7 = r21
            r0 = r24
            super.initialize(r0)
            java.lang.String r0 = "separator"
            r1 = r22
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.mLabels = r0
            boolean r0 = r7.mShowTitle
            r9 = 1
            r10 = 2
            if (r0 == 0) goto L4d
            java.lang.String r0 = "stickfigureFilters"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            int r1 = r7.mType
            if (r1 != r9) goto L2d
            java.lang.String r0 = "movieclipFilters"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            goto L35
        L2d:
            if (r1 != r10) goto L35
            java.lang.String r0 = "spriteFiltersTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
        L35:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r1)
            r7._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r21.row()
        L4d:
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L77
            java.lang.String r0 = "stickfigureFiltersInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            r21.row()
        L77:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._joinParentTable = r0
            r1 = 101(0x65, float:1.42E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinParentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7._cellJoinParentTable = r0
            r21.row()
            java.lang.String r0 = "figureIsJoined"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._joinParentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinParentTable
            r0.row()
            java.lang.String r0 = "useJoinParentFilters"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._joinParentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._useJoinParentFiltersButton = r0
            r0.setChecked(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._useJoinParentFiltersButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$1
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinParentTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._useJoinParentFiltersButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinParentTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinParentTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r1.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = r8.getRegionHeight()
            float r1 = (float) r1
            r0.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinParentTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mFiltersSubTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            r21.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r1.getContext()
            java.lang.String r19 = "opacity"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r19)
            r15 = 4
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1
            java.lang.String r14 = "1.00"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mTransparencyField = r0
            r1 = 102(0x66, float:1.43E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mTransparencyField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mTransparencyField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$2
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mTransparencyField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r1.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = r8.getRegionHeight()
            float r1 = (float) r1
            r0.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            java.lang.String r1 = "proOnly"
            if (r0 != 0) goto L1cf
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            r2.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            r2.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            r2.add(r0)
        L1cf:
            java.lang.String r0 = "invertColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r0)
            r2.fillX()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mInvertColorButton = r0
            r2 = 103(0x67, float:1.44E-43)
            r7.registerWidget(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mInvertColorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$3
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7.mInvertColorButton
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r2 = r8.getRegionHeight()
            float r2 = (float) r2
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L265
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            r2.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            r2.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            r2.add(r0)
        L265:
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r2 = "hueShift"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r2)
            r15 = 3
            r16 = 0
            r17 = 1135869952(0x43b40000, float:360.0)
            r18 = 0
            java.lang.String r14 = "0"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mHueShiftField = r0
            r2 = 104(0x68, float:1.46E-43)
            r7.registerWidget(r0, r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mHueShiftField
            r0.setIsDegreesField(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mHueShiftField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$4 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$4
            r2.<init>(r7)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mHueShiftField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r2 = r8.getRegionHeight()
            float r2 = (float) r2
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L305
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            r2.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            r2.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            r2.add(r0)
        L305:
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r2 = "saturation"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r2)
            r15 = 4
            r16 = 0
            r17 = 1073741824(0x40000000, float:2.0)
            r18 = 1
            java.lang.String r14 = "1.00"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mSaturationField = r0
            r2 = 105(0x69, float:1.47E-43)
            r7.registerWidget(r0, r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mSaturationField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mSaturationField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$5 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$5
            r2.<init>(r7)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mSaturationField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r2 = r8.getRegionHeight()
            float r2 = (float) r2
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L3a5
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            r2.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            r2.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            r2.add(r0)
        L3a5:
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r2 = "pixelate"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r2)
            r15 = 2
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 1120272384(0x42c60000, float:99.0)
            r18 = 0
            java.lang.String r14 = "1"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mPixelateField = r0
            r2 = 106(0x6a, float:1.49E-43)
            r7.registerWidget(r0, r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mPixelateField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mPixelateField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$6 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$6
            r2.<init>(r7)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mPixelateField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r2 = r8.getRegionHeight()
            float r2 = (float) r2
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L445
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            r2.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mFiltersSubTable
            r2.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            r2.add(r0)
        L445:
            org.fortheloss.framework.LabelColorInputIncrementField r0 = new org.fortheloss.framework.LabelColorInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r2 = "tint"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r2)
            r15 = 4
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1
            java.lang.String r14 = "0.00"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mTintField = r0
            r2 = 107(0x6b, float:1.5E-43)
            r7.registerWidget(r0, r2)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mTintField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mTintField
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.WHITE
            r0.setValue(r2)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mTintField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$7 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$7
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelColorInputIncrementField r3 = r7.mTintField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r3.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r3 = r8.getRegionHeight()
            float r3 = (float) r3
            r0.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L4ec
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mFiltersSubTable
            r3.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r7.mLabels
            r3.add(r0)
        L4ec:
            org.fortheloss.framework.LabelColorInputIncrementField r0 = new org.fortheloss.framework.LabelColorInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r3 = "outline"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r3)
            r15 = 4
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1
            java.lang.String r14 = "1.00"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mOutlineColorField = r0
            r3 = 108(0x6c, float:1.51E-43)
            r7.registerWidget(r0, r3)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mOutlineColorField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mOutlineColorField
            r0.setValue(r2)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mOutlineColorField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$8 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$8
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelColorInputIncrementField r3 = r7.mOutlineColorField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r3 = "thickness"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r3)
            r15 = 2
            r17 = 1106247680(0x41f00000, float:30.0)
            r18 = 0
            java.lang.String r14 = "0.0"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mOutlineThickness = r0
            r3 = 109(0x6d, float:1.53E-43)
            r7.registerWidget(r0, r3)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mOutlineThickness
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$9 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$9
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r3 = r7.mOutlineThickness
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r3.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r3 = r8.getRegionHeight()
            float r3 = (float) r3
            r0.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L5d1
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mFiltersSubTable
            r3.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r7.mLabels
            r3.add(r0)
        L5d1:
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r20 = "blur"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r20)
            r15 = 4
            r16 = 0
            r17 = 1073741824(0x40000000, float:2.0)
            r18 = 1
            java.lang.String r14 = "0.00"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mBlurField = r0
            r3 = 110(0x6e, float:1.54E-43)
            r7.registerWidget(r0, r3)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mBlurField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mBlurField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$10 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$10
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r3 = r7.mBlurField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r3 = "motionBlur"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r3)
            r15 = 3
            r17 = 1135837184(0x43b38000, float:359.0)
            r18 = 0
            java.lang.String r14 = "0"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mMotionBlurField = r0
            r3 = 111(0x6f, float:1.56E-43)
            r7.registerWidget(r0, r3)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mMotionBlurField
            r0.setIsDegreesField(r9)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mMotionBlurField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$11 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$11
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.CheckBoxInputIncrementField r3 = r7.mMotionBlurField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mOneDirectionTable = r0
            r3 = 112(0x70, float:1.57E-43)
            r7.registerWidget(r0, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mOneDirectionTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7.mOmniCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            java.lang.String r0 = "oneDirection"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mOneDirectionTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r0)
            r3.fillX()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r7.mLabels
            r3.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mOmniDirectionalBlurButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$12 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$12
            r3.<init>(r7)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mOneDirectionTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7.mOmniDirectionalBlurButton
            r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r3.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r3 = r8.getRegionHeight()
            float r3 = (float) r3
            r0.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L70a
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mFiltersSubTable
            r3.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r7.mLabels
            r3.add(r0)
        L70a:
            org.fortheloss.framework.LabelColorInputIncrementField r0 = new org.fortheloss.framework.LabelColorInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r3 = "glow"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r3)
            r15 = 4
            r16 = 0
            r17 = 1073741824(0x40000000, float:2.0)
            r18 = 1
            java.lang.String r14 = "0.00"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mGlowColorField = r0
            r3 = 113(0x71, float:1.58E-43)
            r7.registerWidget(r0, r3)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mGlowColorField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mGlowColorField
            r0.setValue(r2)
            org.fortheloss.framework.LabelColorInputIncrementField r0 = r7.mGlowColorField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$13 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$13
            r2.<init>(r7)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelColorInputIncrementField r2 = r7.mGlowColorField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r2 = "intensity"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r2)
            r16 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r14 = "0"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mGlowIntensityField = r0
            r2 = 114(0x72, float:1.6E-43)
            r7.registerWidget(r0, r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mGlowIntensityField
            r0.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mGlowIntensityField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$14 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$14
            r2.<init>(r7)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mGlowIntensityField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r2 = r8.getRegionHeight()
            float r2 = (float) r2
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L7f1
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            r1.row()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r1 = r7.mLabels
            r1.add(r0)
        L7f1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mDropShadowTable = r0
            r1 = 115(0x73, float:1.61E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mFiltersSubTable
            r0.row()
            java.lang.String r0 = "dropShadow"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r0)
            r1.fillX()
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r1 = r7.mLabels
            r1.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$15 r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$15
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r1 * r0
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r6 = r0.getIsLeftHandMode()
            r0 = r11
            r1 = r21
            r4 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mDropShadowColorPicker = r11
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setColor(r0, r0, r0, r0)
            org.fortheloss.framework.ColorPicker r1 = r7.mDropShadowColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$16 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$16
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            org.fortheloss.framework.ColorPicker r2 = r7.mDropShadowColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r2)
            r1.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            r1.row()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r19)
            r15 = 4
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1
            java.lang.String r14 = "0"
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mDropShadowAlphaField = r1
            r1.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowAlphaField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$17 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$17
            r2.<init>(r7)
            r1.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            org.fortheloss.framework.LabelInputIncrementSmallField r2 = r7.mDropShadowAlphaField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r2 = 18
            r1.align(r2)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r3 = "distance"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r3)
            r15 = 6
            r16 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            r17 = 1203982208(0x47c34f80, float:99999.0)
            r18 = 0
            java.lang.String r14 = "0"
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mDropShadowDistanceField = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r3.<init>()
            r1.setTextFieldFilter(r3)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowDistanceField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$18 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$18
            r3.<init>(r7)
            r1.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            org.fortheloss.framework.LabelInputIncrementSmallField r3 = r7.mDropShadowDistanceField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r3 = 10
            r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            r1.row()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r4 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r4.getContext()
            java.lang.String r4 = "angle"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r4)
            r15 = 3
            r16 = 0
            r17 = 1135837184(0x43b38000, float:359.0)
            java.lang.String r14 = "135"
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mDropShadowAngleField = r1
            r1.setIsDegreesField(r9)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$19 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$19
            r4.<init>(r7)
            r1.setFieldListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = r7.mDropShadowAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.align(r2)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r21.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r2.getContext()
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r20)
            r15 = 4
            r17 = 1073741824(0x40000000, float:2.0)
            r18 = 1
            java.lang.String r14 = "0"
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mDropShadowBlurField = r1
            r1.setHighFidelity(r9)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowBlurField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$20 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$20
            r2.<init>(r7)
            r1.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            org.fortheloss.framework.LabelInputIncrementSmallField r2 = r7.mDropShadowBlurField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r10)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            int r2 = r8.getRegionHeight()
            float r2 = (float) r2
            r1.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mDropShadowTable
            r1.row()
            java.lang.String r1 = "clearAllFilters"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r1, r2)
            r7.mClearFiltersButton = r1
            r2 = 116(0x74, float:1.63E-43)
            r7.registerWidget(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mClearFiltersButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$21 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$21
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7.mClearFiltersButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            r1.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            r1.row()
            java.lang.String r1 = "copyFilters"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r1, r2)
            r7.mCopyFiltersButton = r1
            r2 = 117(0x75, float:1.64E-43)
            r7.registerWidget(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mCopyFiltersButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$22 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$22
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7.mCopyFiltersButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            r2 = 16
            r1.align(r2)
            java.lang.String r1 = "pasteFilters"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r1, r2)
            r7.mPasteFiltersButton = r1
            r2 = 118(0x76, float:1.65E-43)
            r7.registerWidget(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mPasteFiltersButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$23 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable$23
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7.mPasteFiltersButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            r2 = 8
            r1.align(r2)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 != 0) goto Lace
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mInvertColorButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mInvertColorButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.setColor(r0, r0, r0, r3)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mHueShiftField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mSaturationField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mPixelateField
            r1.disable()
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r7.mTintField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mBlurField
            r1.disable()
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mMotionBlurField
            r1.disable()
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r7.mGlowColorField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mGlowIntensityField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowAlphaField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowDistanceField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowAngleField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowBlurField
            r1.disable()
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mMotionBlurField
            r1.disable()
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r7.mOutlineColorField
            r1.disable()
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mOutlineThickness
            r1.disable()
            org.fortheloss.framework.ColorPicker r1 = r7.mDropShadowColorPicker
            r1.setTouchable(r2)
            org.fortheloss.framework.ColorPicker r1 = r7.mDropShadowColorPicker
            r1.disableWithAlpha(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mClearFiltersButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mClearFiltersButton
            r1.setColor(r0, r0, r0, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mCopyFiltersButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mCopyFiltersButton
            r1.setColor(r0, r0, r0, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mPasteFiltersButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mPasteFiltersButton
            r1.setColor(r0, r0, r0, r3)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r1 = r7.mLabels
            int r1 = r1.size()
            int r1 = r1 - r9
        Labe:
            if (r1 < 0) goto Lace
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r7.mLabels
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = (com.badlogic.gdx.scenes.scene2d.ui.Label) r2
            r2.setColor(r0, r0, r0, r3)
            int r1 = r1 + (-1)
            goto Labe
        Lace:
            r21.pack()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Actor
    protected void sizeChanged() {
            r1 = this;
            super.sizeChanged()
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r0 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.Event r0 = (com.badlogic.gdx.scenes.scene2d.Event) r0
            r1.fire(r0)
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r7 = this;
            int r0 = r7.mType
            r1 = 1
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            goto L1b
        Lc:
            if (r0 != r1) goto L15
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            goto L1b
        L15:
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
        L1b:
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L2b
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r7.setTouchable(r0)
            r7.setColor(r3, r3, r3, r2)
            goto L1a2
        L2b:
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r7.setTouchable(r4)
            r7.setColor(r3, r3, r3, r3)
            boolean r4 = r0.isJoined()
            r5 = 0
            if (r4 == 0) goto L41
            boolean r4 = r0.getUseJoinParentFilters()
            if (r4 == 0) goto L41
            goto L42
        L41:
            r1 = 0
        L42:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._useJoinParentFiltersButton
            r4.setChecked(r1)
            if (r1 == 0) goto L56
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            r1.setColor(r3, r3, r3, r2)
            goto L62
        L56:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mFiltersSubTable
            r1.setColor(r3, r3, r3, r3)
        L62:
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto L70
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7._cellJoinParentTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r7._joinParentTable
            r1.setActor(r4)
            goto L75
        L70:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7._cellJoinParentTable
            r1.clearActor()
        L75:
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mTransparencyField
            float r4 = r0.getTransparency()
            r1.setValue(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mInvertColorButton
            boolean r4 = r0.getIsInvertedColor()
            r1.setChecked(r4)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mHueShiftField
            float r4 = r0.getHueShift()
            r6 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 * r6
            int r4 = java.lang.Math.round(r4)
            r6 = 360(0x168, float:5.04E-43)
            int r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r5, r6)
            float r4 = (float) r4
            r1.setValue(r4)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mSaturationField
            float r4 = r0.getSaturation()
            r1.setValue(r4)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mPixelateField
            int r4 = r0.getPixelation()
            float r4 = (float) r4
            r1.setValue(r4)
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r7.mTintField
            float r4 = r0.getTintAmount()
            com.badlogic.gdx.graphics.Color r6 = r0.getTintColor()
            r1.setValue(r4, r6)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mBlurField
            float r4 = r0.getBlur()
            r1.setValue(r4)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mMotionBlurField
            int r4 = r0.getMotionBlurAngle()
            float r4 = (float) r4
            boolean r6 = r0.isMotionBlur()
            r1.setValue(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mOmniDirectionalBlurButton
            boolean r4 = r0.getMotionBlurIsOneDirection()
            r1.setChecked(r4)
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r7.mOutlineColorField
            float r4 = r0.getOutlineAlpha()
            com.badlogic.gdx.graphics.Color r6 = r0.getOutlineColor()
            r1.setValue(r4, r6)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mOutlineThickness
            float r4 = r0.getOutlineThickness()
            r1.setValue(r4)
            org.fortheloss.framework.LabelColorInputIncrementField r1 = r7.mGlowColorField
            float r4 = r0.getGlow()
            com.badlogic.gdx.graphics.Color r6 = r0.getGlowColor()
            r1.setValue(r4, r6)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mGlowIntensityField
            float r4 = r0.getGlowIntensity()
            r1.setValue(r4)
            org.fortheloss.framework.ColorPicker r1 = r7.mDropShadowColorPicker
            com.badlogic.gdx.graphics.Color r4 = r0.getDsColor()
            r1.setColor(r4, r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowAlphaField
            float r4 = r0.getDsAlpha()
            r1.setValue(r4)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowDistanceField
            int r4 = r0.getDsDistance()
            float r4 = (float) r4
            r1.setValue(r4)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowAngleField
            int r4 = r0.getDsAngle()
            float r4 = (float) r4
            r1.setValue(r4)
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r7.mDropShadowBlurField
            float r4 = r0.getDsBlur()
            r1.setValue(r4)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L177
            float r1 = r0.getBlur()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L16c
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mMotionBlurField
            r1.enable()
            boolean r0 = r0.isMotionBlur()
            if (r0 == 0) goto L166
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mOmniCell
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto L181
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mOmniCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mOneDirectionTable
            r0.setActor(r1)
            goto L181
        L166:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mOmniCell
            r0.clearActor()
            goto L181
        L16c:
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mMotionBlurField
            r0.disable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mOmniCell
            r0.clearActor()
            goto L181
        L177:
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mMotionBlurField
            r0.disable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mOmniCell
            r0.clearActor()
        L181:
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r0.getCopiedFigureFilterProperties()
            if (r0 != 0) goto L196
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mPasteFiltersButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mPasteFiltersButton
            r0.setColor(r3, r3, r3, r2)
            goto L1a2
        L196:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mPasteFiltersButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mPasteFiltersButton
            r0.setColor(r3, r3, r3, r3)
        L1a2:
            return
    }
}
