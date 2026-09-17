package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SegmentToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleGradientModeButton1;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleGradientModeButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleGradientModeButton3;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleIsHollowButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _circleIsHollowLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _circleOutlineCellRef;
    private org.fortheloss.framework.ColorPicker _circleOutlineColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _circleOutlineColorPropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _circleOutlineColorPropertiesTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _circleOutlineColorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circulizationButton;
    private org.fortheloss.framework.DegreesLabelInputIncrementField _dragLockAngleField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _dragLockAngleFieldCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _dragLockCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _dragLockLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _everythingElseTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _flipSegmentXButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _flipSegmentYButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _floatyTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _floatyTableCellRef;
    private org.fortheloss.framework.ColorPicker _gradientColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _gradientModeButton1;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _gradientModeButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _gradientModeTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _gradientModeTableCircles;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _gradientModeTableSegments;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _gradientPropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _gradientPropertiesTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _lockNodeButton;
    private org.fortheloss.framework.ColorPicker _polyfillColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _polyfillColorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _polyfillColorTableCellRef;
    private org.fortheloss.framework.LabelInputIncrementField _polyfillCurvePrecisionField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _resetLengthButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _resetThicknessButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _reverseGradientButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _reverseGradientLabel;
    private org.fortheloss.framework.ColorPicker _segmentColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _segmentIsFloatyButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _segmentIsStretchyButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _segmentPropertiesLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _segmentPropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell _shapePropertiesCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _thicknessTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _thicknessTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _trapezoidPropertiesLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _trapezoidPropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _useCircleOutlineButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _useGradientColorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _usePolyfillColorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _useSegmentColorButton;
    private org.fortheloss.framework.DegreesLabelInputIncrementField mAngleField;
    private org.fortheloss.framework.LabelInputIncrementField mCurveRadiusField;
    private org.fortheloss.framework.LabelInputIncrementField mLengthField;
    private org.fortheloss.framework.CheckBoxInputIncrementField mScaleField;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mShapePropertiesTable;
    private org.fortheloss.framework.LabelInputIncrementField mThicknessField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTrapezoidCirculizationButton;
    private org.fortheloss.framework.LabelInputIncrementField mTrapezoidCurveRadiusField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTrapezoidKeepRatioButton;
    private org.fortheloss.framework.CheckBoxInputIncrementField mTrapezoidThickness1Field;
    private org.fortheloss.framework.CheckBoxInputIncrementField mTrapezoidThickness2Field;









































    /* renamed from: -$$Nest$fget_circleGradientModeButton2, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1116$$Nest$fget_circleGradientModeButton2(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._circleGradientModeButton2
            return r0
    }

    /* renamed from: -$$Nest$fget_circleGradientModeButton3, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1117$$Nest$fget_circleGradientModeButton3(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._circleGradientModeButton3
            return r0
    }

    /* renamed from: -$$Nest$fget_circleIsHollowButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1118$$Nest$fget_circleIsHollowButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._circleIsHollowButton
            return r0
    }

    /* renamed from: -$$Nest$fget_circleOutlineColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1119$$Nest$fget_circleOutlineColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._circleOutlineColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_circulizationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1120$$Nest$fget_circulizationButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._circulizationButton
            return r0
    }

    /* renamed from: -$$Nest$fget_dragLockCheckbox, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1121$$Nest$fget_dragLockCheckbox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._dragLockCheckbox
            return r0
    }

    /* renamed from: -$$Nest$fget_gradientColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1122$$Nest$fget_gradientColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._gradientColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_gradientModeButton1, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1123$$Nest$fget_gradientModeButton1(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._gradientModeButton1
            return r0
    }

    /* renamed from: -$$Nest$fget_polyfillColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1124$$Nest$fget_polyfillColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._polyfillColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_segmentColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1125$$Nest$fget_segmentColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._segmentColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmTrapezoidCirculizationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1126$$Nest$fgetmTrapezoidCirculizationButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTrapezoidCirculizationButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmTrapezoidKeepRatioButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1127$$Nest$fgetmTrapezoidKeepRatioButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTrapezoidKeepRatioButton
            return r0
    }

    /* renamed from: -$$Nest$monCircleOutlineColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1128$$Nest$monCircleOutlineColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onCircleOutlineColorSelect()
            return
    }

    /* renamed from: -$$Nest$monFlipSegmentXClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1129$$Nest$monFlipSegmentXClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onFlipSegmentXClick()
            return
    }

    /* renamed from: -$$Nest$monFlipSegmentYClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1130$$Nest$monFlipSegmentYClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onFlipSegmentYClick()
            return
    }

    /* renamed from: -$$Nest$monLockNodeButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1131$$Nest$monLockNodeButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onLockNodeButtonClick()
            return
    }

    /* renamed from: -$$Nest$monPolyfillColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1132$$Nest$monPolyfillColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onPolyfillColorSelect()
            return
    }

    /* renamed from: -$$Nest$monResetLengthClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1133$$Nest$monResetLengthClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onResetLengthClick()
            return
    }

    /* renamed from: -$$Nest$monResetThicknessClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1134$$Nest$monResetThicknessClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onResetThicknessClick()
            return
    }

    /* renamed from: -$$Nest$monReverseGradientClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1135$$Nest$monReverseGradientClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onReverseGradientClick()
            return
    }

    /* renamed from: -$$Nest$monSegmentColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1136$$Nest$monSegmentColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onSegmentColorSelect()
            return
    }

    /* renamed from: -$$Nest$monSegmentGradientSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1137$$Nest$monSegmentGradientSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onSegmentGradientSelect()
            return
    }

    /* renamed from: -$$Nest$monSegmentIsFloatyClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1138$$Nest$monSegmentIsFloatyClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onSegmentIsFloatyClick()
            return
    }

    /* renamed from: -$$Nest$monSegmentIsStretchyClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1139$$Nest$monSegmentIsStretchyClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onSegmentIsStretchyClick()
            return
    }

    /* renamed from: -$$Nest$monUseCircleOutlineClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1140$$Nest$monUseCircleOutlineClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onUseCircleOutlineClick()
            return
    }

    /* renamed from: -$$Nest$monUseGradientClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1141$$Nest$monUseGradientClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onUseGradientClick()
            return
    }

    /* renamed from: -$$Nest$monUsePolyfillColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1142$$Nest$monUsePolyfillColorClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onUsePolyfillColorClick()
            return
    }

    /* renamed from: -$$Nest$monUseSegmentColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1143$$Nest$monUseSegmentColorClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0) {
            r0.onUseSegmentColorClick()
            return
    }

    public SegmentToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onCircleOutlineColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._circleOutlineColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setCircleOutlineColor(r1)
            return
    }

    private void onFlipSegmentXClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            r1 = 0
            r0.flipSegmentX(r1)
            return
    }

    private void onFlipSegmentYClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            r1 = 0
            r0.flipSegmentY(r1)
            return
    }

    private void onLockNodeButtonClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._lockNodeButton
            boolean r1 = r1.isChecked()
            r1 = r1 ^ 1
            r0.lockNode(r1)
            return
    }

    private void onPolyfillColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._polyfillColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setPolyfillColor(r1)
            return
    }

    private void onResetLengthClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.resetSegmentLength()
            return
    }

    private void onResetThicknessClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.resetSegmentThickness()
            return
    }

    private void onReverseGradientClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._reverseGradientButton
            boolean r1 = r1.isChecked()
            r0.reverseSegmentGradient(r1)
            return
    }

    private void onSegmentColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._segmentColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setSegmentColor(r1)
            return
    }

    private void onSegmentGradientSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._gradientColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setSegmentGradient(r1)
            return
    }

    private void onSegmentIsFloatyClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._segmentIsFloatyButton
            boolean r1 = r1.isChecked()
            r0.setSegmentIsFloaty(r1)
            return
    }

    private void onSegmentIsStretchyClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._segmentIsStretchyButton
            boolean r1 = r1.isChecked()
            r0.setSegmentIsStretchy(r1)
            return
    }

    private void onUseCircleOutlineClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._useCircleOutlineButton
            boolean r1 = r1.isChecked()
            r0.useCircleOutline(r1)
            return
    }

    private void onUseGradientClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._useGradientColorButton
            boolean r1 = r1.isChecked()
            r0.useSegmentGradient(r1)
            return
    }

    private void onUsePolyfillColorClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._usePolyfillColorButton
            boolean r1 = r1.isChecked()
            r0.setUsePolyfillColor(r1)
            return
    }

    private void onUseSegmentColorClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._useSegmentColorButton
            boolean r1 = r1.isChecked()
            r0.useSegmentColor(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._everythingElseTable = r0
            r2._useSegmentColorButton = r0
            r2._useGradientColorButton = r0
            r2._reverseGradientLabel = r0
            r2._reverseGradientButton = r0
            r2._useCircleOutlineButton = r0
            r2._circleIsHollowButton = r0
            r2._circleIsHollowLabel = r0
            r2._usePolyfillColorButton = r0
            r2._resetThicknessButton = r0
            r2._segmentIsStretchyButton = r0
            r2._segmentIsFloatyButton = r0
            r2._resetLengthButton = r0
            r2._flipSegmentXButton = r0
            r2._flipSegmentYButton = r0
            r2._lockNodeButton = r0
            r2._shapePropertiesCellRef = r0
            r2._segmentPropertiesLabel = r0
            r2._trapezoidPropertiesLabel = r0
            r2.mTrapezoidCirculizationButton = r0
            r2.mTrapezoidKeepRatioButton = r0
            r2._gradientModeButton1 = r0
            r2._gradientModeButton2 = r0
            r2._circleGradientModeButton1 = r0
            r2._circleGradientModeButton2 = r0
            r2._circleGradientModeButton3 = r0
            r2._circulizationButton = r0
            org.fortheloss.framework.ColorPicker r1 = r2._segmentColorPicker
            if (r1 == 0) goto L42
            r1.dispose()
            r2._segmentColorPicker = r0
        L42:
            org.fortheloss.framework.ColorPicker r1 = r2._gradientColorPicker
            if (r1 == 0) goto L4b
            r1.dispose()
            r2._gradientColorPicker = r0
        L4b:
            org.fortheloss.framework.ColorPicker r1 = r2._polyfillColorPicker
            if (r1 == 0) goto L54
            r1.dispose()
            r2._polyfillColorPicker = r0
        L54:
            org.fortheloss.framework.ColorPicker r1 = r2._circleOutlineColorPicker
            if (r1 == 0) goto L5d
            r1.dispose()
            r2._circleOutlineColorPicker = r0
        L5d:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mScaleField
            if (r1 == 0) goto L66
            r1.dispose()
            r2.mScaleField = r0
        L66:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2.mAngleField
            if (r1 == 0) goto L6f
            r1.dispose()
            r2.mAngleField = r0
        L6f:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mThicknessField
            if (r1 == 0) goto L78
            r1.dispose()
            r2.mThicknessField = r0
        L78:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mLengthField
            if (r1 == 0) goto L81
            r1.dispose()
            r2.mLengthField = r0
        L81:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mCurveRadiusField
            if (r1 == 0) goto L8a
            r1.dispose()
            r2.mCurveRadiusField = r0
        L8a:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2._polyfillCurvePrecisionField
            if (r1 == 0) goto L93
            r1.dispose()
            r2._polyfillCurvePrecisionField = r0
        L93:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mTrapezoidThickness1Field
            if (r1 == 0) goto L9c
            r1.dispose()
            r2.mTrapezoidThickness1Field = r0
        L9c:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mTrapezoidThickness2Field
            if (r1 == 0) goto La5
            r1.dispose()
            r2.mTrapezoidThickness2Field = r0
        La5:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mTrapezoidCurveRadiusField
            if (r1 == 0) goto Lae
            r1.dispose()
            r2.mTrapezoidCurveRadiusField = r0
        Lae:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._circleOutlineColorTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._circleOutlineColorTable = r0
            r2._circleOutlineCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._segmentPropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._segmentPropertiesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._polyfillColorTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._polyfillColorTable = r0
            r2._polyfillColorTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._trapezoidPropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._trapezoidPropertiesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._gradientModeTableSegments
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._gradientModeTableSegments = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._gradientModeTableCircles
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._gradientModeTableCircles = r0
            r2._gradientModeTableCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._gradientPropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._gradientPropertiesTable = r0
            r2._gradientPropertiesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._circleOutlineColorPropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._circleOutlineColorPropertiesTable = r0
            r2._circleOutlineColorPropertiesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._thicknessTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._thicknessTable = r0
            r2._thicknessTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mShapePropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mShapePropertiesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._floatyTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._floatyTable = r0
            r2._floatyTableCellRef = r0
            r2._dragLockLabel = r0
            r2._dragLockCheckbox = r0
            r2._dragLockAngleFieldCellRef = r0
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2._dragLockAngleField
            if (r1 == 0) goto L118
            r1.dispose()
            r2._dragLockAngleField = r0
        L118:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r28, com.badlogic.gdx.graphics.g2d.TextureAtlas r29, com.badlogic.gdx.scenes.scene2d.utils.Drawable r30) {
            r27 = this;
            r7 = r27
            r8 = r28
            r0 = r30
            super.initialize(r0)
            java.lang.String r0 = "segmentTools"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r1)
            r7._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipSegmentX()
            r0.<init>(r1)
            r7._flipSegmentXButton = r0
            r1 = 45
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._flipSegmentXButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$1
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._flipSegmentXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 16
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipSegmentY()
            r0.<init>(r1)
            r7._flipSegmentYButton = r0
            r1 = 46
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._flipSegmentYButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$2
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._flipSegmentYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r11 = 8
            r0.align(r11)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r12 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r12)
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
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7._polyfillColorTable = r0
            r1 = 30
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r13)
            r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r13)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r14 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            r15 = 0
            r0.setRound(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padRight(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7._polyfillColorTableCellRef = r0
            r27.row()
            java.lang.String r0 = "usePolyfillColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._usePolyfillColorButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$3 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$3
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._usePolyfillColorButton
            r0.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$4 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$4
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r0 * r14
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r16 = r0.getIsLeftHandMode()
            r0 = r6
            r1 = r27
            r4 = r29
            r15 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._polyfillColorPicker = r15
            r6 = 1065353216(0x3f800000, float:1.0)
            r15.setColor(r6, r6, r6, r6)
            org.fortheloss.framework.ColorPicker r0 = r7._polyfillColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$5
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            org.fortheloss.framework.ColorPicker r1 = r7._polyfillColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r16 = r1.getContext()
            java.lang.String r1 = "polyfillCurvePrecision"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "\n(0 - 5)"
            r2.append(r1)
            java.lang.String r17 = r2.toString()
            java.lang.String r18 = "1"
            r19 = 1
            r20 = 0
            r21 = 1084227584(0x40a00000, float:5.0)
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r7._polyfillCurvePrecisionField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$6
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            org.fortheloss.framework.LabelInputIncrementField r1 = r7._polyfillCurvePrecisionField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.spaceRight(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7._everythingElseTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r13)
            r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r13)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r1 = 0
            r0.setRound(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r13)
            r0.space(r13)
            java.lang.String r0 = "useSegmentColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._useSegmentColorButton = r0
            r1 = 31
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._useSegmentColorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$7 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$7
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._useSegmentColorButton
            r0.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$8 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$8
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r0 * r14
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r16 = r0.getIsLeftHandMode()
            r0 = r15
            r1 = r27
            r13 = 1065353216(0x3f800000, float:1.0)
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._segmentColorPicker = r15
            r15.setColor(r13, r13, r13, r13)
            org.fortheloss.framework.ColorPicker r0 = r7._segmentColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$9 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$9
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7._segmentColorPicker
            r1 = 32
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            org.fortheloss.framework.ColorPicker r1 = r7._segmentColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "useGradientColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._useGradientColorButton = r0
            r1 = 33
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._useGradientColorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$10 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$10
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._useGradientColorButton
            r0.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$11 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$11
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r0 * r14
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r6 = r0.getIsLeftHandMode()
            r0 = r15
            r1 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._gradientColorPicker = r15
            r0 = 34
            r7.registerWidget(r15, r0)
            org.fortheloss.framework.ColorPicker r0 = r7._gradientColorPicker
            r15 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r15, r15, r15, r13)
            org.fortheloss.framework.ColorPicker r0 = r7._gradientColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$12 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$12
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            org.fortheloss.framework.ColorPicker r1 = r7._gradientColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._gradientPropertiesTable = r0
            r1 = 36
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._gradientPropertiesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "reverse"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._reverseGradientLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._reverseGradientButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$13 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$13
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._reverseGradientButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientPropertiesTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._gradientModeTableSegments = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._gradientModeTableCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientPropertiesTable
            r0.row()
            java.lang.String r0 = "horizontal"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.add(r1)
            r1.fillX()
            java.lang.String r1 = "vertical"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7._gradientModeButton1 = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$14 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$14
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._gradientModeButton1
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7._gradientModeButton2 = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$15 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$15
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._gradientModeButton2
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r3 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r10]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._gradientModeButton1
            r5 = 0
            r3[r5] = r4
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._gradientModeButton2
            r3[r9] = r4
            r2.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._gradientModeTableCircles = r2
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            java.lang.String r0 = "radial"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleGradientModeButton1 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$16 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$16
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._circleGradientModeButton1
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleGradientModeButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$17 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$17
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._circleGradientModeButton2
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleGradientModeButton3 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$18 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$18
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._circleGradientModeButton3
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r1]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._circleGradientModeButton1
            r3 = 0
            r1[r3] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._circleGradientModeButton2
            r1[r9] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._circleGradientModeButton3
            r1[r10] = r2
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7._circleOutlineColorTable = r0
            r1 = 35
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._circleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._circleOutlineCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "useOutlineColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._circleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._useCircleOutlineButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$19 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$19
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._useCircleOutlineButton
            r0.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$20 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$20
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r0 * r14
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r16 = r0.getIsLeftHandMode()
            r0 = r6
            r1 = r27
            r4 = r29
            r14 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._circleOutlineColorPicker = r14
            r14.setColor(r15, r15, r15, r13)
            org.fortheloss.framework.ColorPicker r0 = r7._circleOutlineColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$21 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$21
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            org.fortheloss.framework.ColorPicker r1 = r7._circleOutlineColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._circleOutlineColorPropertiesTable = r0
            r1 = 37
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._circleOutlineColorPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._circleOutlineColorPropertiesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorTable
            r0.row()
            java.lang.String r0 = "isHollow"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._circleIsHollowLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._circleOutlineColorPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleIsHollowButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$22 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$22
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._circleIsHollowButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._circleOutlineColorPropertiesTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
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
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r1.getContext()
            java.lang.String r1 = "useSegmentScale"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r22 = "1.00"
            r23 = 4
            r24 = 953267991(0x38d1b717, float:1.0E-4)
            r25 = 1092616192(0x41200000, float:10.0)
            r26 = 1
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7.mScaleField = r0
            r1 = 38
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mScaleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$23 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$23
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mScaleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r1.getContext()
            java.lang.String r1 = "segmentAngle"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r22 = "0"
            r23 = 3
            r24 = 0
            r25 = 1135837184(0x43b38000, float:359.0)
            r26 = 0
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7.mAngleField = r0
            r1 = 39
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r7.mAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$24 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$24
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r7.mAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._thicknessTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._thicknessTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r1.getContext()
            java.lang.String r1 = "segmentThickness"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r22 = "32"
            r23 = 4
            r25 = 1176255488(0x461c3c00, float:9999.0)
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7.mThicknessField = r0
            r1 = 40
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mThicknessField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$25 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$25
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._thicknessTable
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mThicknessField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._thicknessTable
            r0.row()
            java.lang.String r0 = "resetThickness"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._resetThicknessButton = r0
            r1 = 76
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._resetThicknessButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$26 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$26
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._thicknessTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._resetThicknessButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._resetThicknessButton
            float r1 = r1.getHeight()
            r2 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._thicknessTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r1.getContext()
            java.lang.String r1 = "segmentLength"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r22 = "100"
            r23 = 8
            r25 = 1232348144(0x497423f0, float:999999.0)
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7.mLengthField = r0
            r1 = 41
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mLengthField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$27 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$27
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mLengthField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "resetLength"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._resetLengthButton = r0
            r1 = 77
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._resetLengthButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$28 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$28
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._resetLengthButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._resetLengthButton
            float r1 = r1.getHeight()
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "isStretchy"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._segmentIsStretchyButton = r0
            r1 = 42
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._segmentIsStretchyButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$29 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$29
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._segmentIsStretchyButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._floatyTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7._floatyTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "isFloaty"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "floatyInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._floatyTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._segmentIsFloatyButton = r0
            r1 = 43
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._segmentIsFloatyButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$30 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$30
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._floatyTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._segmentIsFloatyButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
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
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "lockNode"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._lockNodeButton = r0
            r1 = 78
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._lockNodeButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$31 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$31
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._lockNodeButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            java.lang.String r0 = "dragLock"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._dragLockLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._dragLockCheckbox = r0
            r1 = 62
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._dragLockCheckbox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$32 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$32
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._dragLockCheckbox
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r1.getContext()
            java.lang.String r1 = "dragLockAngle"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r22 = "0"
            r23 = 3
            r25 = 1135837184(0x43b38000, float:359.0)
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7._dragLockAngleField = r0
            r1 = 63
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r7._dragLockAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$33 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$33
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r7._dragLockAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._dragLockAngleFieldCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
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
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mShapePropertiesTable = r0
            r1 = 81
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mShapePropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._everythingElseTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Widget r0 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mShapePropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7._shapePropertiesCellRef = r0
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7._segmentPropertiesTable = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._segmentPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            java.lang.String r0 = "segment"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r1)
            r7._segmentPropertiesLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._segmentPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 * r2
            r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._segmentPropertiesTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r1.getContext()
            java.lang.String r1 = "curveRadius"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r22 = "0"
            r23 = 6
            r24 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            r25 = 1203982208(0x47c34f80, float:99999.0)
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7.mCurveRadiusField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r3.<init>()
            r0.setTextFieldFilter(r3)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mCurveRadiusField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$34 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$34
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._segmentPropertiesTable
            org.fortheloss.framework.LabelInputIncrementField r3 = r7.mCurveRadiusField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._segmentPropertiesTable
            r0.row()
            java.lang.String r0 = "isCirculized"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r7._segmentPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r3)
            r7._circulizationButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$35 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$35
            r4.<init>(r7)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._segmentPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r7._circulizationButton
            r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r7._trapezoidPropertiesTable = r3
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.pad(r4)
            r3.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.space(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.spaceRight(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.spaceBottom(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            r3.uniformX()
            java.lang.String r3 = "trapezoid"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r9, r4)
            r7._trapezoidPropertiesLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r10)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r3.padBottom(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._trapezoidPropertiesTable
            r2.row()
            org.fortheloss.framework.LabelInputIncrementField r2 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r3.getContext()
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r16 = "0"
            r17 = 6
            r18 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            r19 = 1203982208(0x47c34f80, float:99999.0)
            r20 = 0
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r7.mTrapezoidCurveRadiusField = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r1.<init>()
            r2.setTextFieldFilter(r1)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mTrapezoidCurveRadiusField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$36 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$36
            r2.<init>(r7)
            r1.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._trapezoidPropertiesTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mTrapezoidCurveRadiusField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r10)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._trapezoidPropertiesTable
            r1.row()
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mTrapezoidCirculizationButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$37 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$37
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mTrapezoidCirculizationButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r1.getContext()
            java.lang.String r1 = "start"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "roundedThickness"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "\n"
            r4.append(r1)
            r4.append(r3)
            java.lang.String r13 = r4.toString()
            java.lang.String r14 = "0"
            r15 = 4
            r16 = 0
            r17 = 1176255488(0x461c3c00, float:9999.0)
            r18 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mTrapezoidThickness1Field = r0
            r3 = 0
            r0.setCheckboxControlsTextfield(r3)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mTrapezoidThickness1Field
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$38 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$38
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            org.fortheloss.framework.CheckBoxInputIncrementField r3 = r7.mTrapezoidThickness1Field
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r3.getContext()
            java.lang.String r3 = "end"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r13 = r4.toString()
            java.lang.String r14 = "0"
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.mTrapezoidThickness2Field = r0
            r1 = 0
            r0.setCheckboxControlsTextfield(r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mTrapezoidThickness2Field
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$39 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$39
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mTrapezoidThickness2Field
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            r0.row()
            java.lang.String r0 = "keepRatio"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mTrapezoidKeepRatioButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$40 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable$40
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mTrapezoidKeepRatioButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._trapezoidPropertiesTable
            r0.row()
            r27.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r13 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r13.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r4 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L394
            boolean r6 = r0.isMainNode()
            if (r6 == 0) goto L18
            goto L394
        L18:
            r6 = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r13._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.Touchable r8 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r7.setTouchable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r13._everythingElseTable
            r7.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = r13._flipSegmentXButton
            com.badlogic.gdx.scenes.scene2d.Touchable r8 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r7.setTouchable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = r13._flipSegmentXButton
            r7.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = r13._flipSegmentYButton
            r7.setTouchable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = r13._flipSegmentYButton
            r7.setColor(r5, r5, r5, r5)
            org.fortheloss.framework.ColorPicker r7 = r13._segmentColorPicker
            r7.disableWithAlpha(r3)
            org.fortheloss.framework.ColorPicker r7 = r13._gradientColorPicker
            r7.disableWithAlpha(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._useSegmentColorButton
            boolean r9 = r6.isUsingSegmentColor()
            r7.setChecked(r9)
            org.fortheloss.framework.ColorPicker r7 = r13._segmentColorPicker
            com.badlogic.gdx.graphics.Color r9 = r6.getColor()
            r7.setColor(r9, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._useGradientColorButton
            boolean r9 = r6.isUsingGradient()
            r7.setChecked(r9)
            org.fortheloss.framework.ColorPicker r7 = r13._gradientColorPicker
            com.badlogic.gdx.graphics.Color r9 = r6.getGradientColor()
            r7.setColor(r9, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._reverseGradientButton
            boolean r9 = r6.isReversedGradient()
            r7.setChecked(r9)
            org.fortheloss.framework.CheckBoxInputIncrementField r7 = r13.mScaleField
            float r9 = r6.getScale()
            boolean r10 = r6.isUsingSegmentScale()
            r7.setValue(r9, r10)
            org.fortheloss.framework.DegreesLabelInputIncrementField r7 = r13.mAngleField
            float r9 = r6.getAngle()
            r7.setValue(r9)
            org.fortheloss.framework.LabelInputIncrementField r7 = r13.mThicknessField
            int r9 = r6.getThickness()
            float r9 = (float) r9
            r7.setValue(r9)
            org.fortheloss.framework.LabelInputIncrementField r7 = r13.mLengthField
            float r9 = r6.getLength()
            r7.setValue(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._segmentIsStretchyButton
            boolean r9 = r6.isStretchy()
            r7.setChecked(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._segmentIsFloatyButton
            boolean r9 = r6.isFloaty()
            r7.setChecked(r9)
            boolean r7 = r6.isStretchy()
            if (r7 == 0) goto Lc5
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._floatyTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            if (r7 != 0) goto Lca
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._floatyTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r13._floatyTable
            r7.setActor(r9)
            goto Lca
        Lc5:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._floatyTableCellRef
            r7.clearActor()
        Lca:
            boolean r7 = r6.isUsingSegmentColor()
            if (r7 == 0) goto Ldb
            org.fortheloss.framework.ColorPicker r7 = r13._segmentColorPicker
            r7.setTouchable(r8)
            org.fortheloss.framework.ColorPicker r7 = r13._segmentColorPicker
            r7.disableWithAlpha(r3)
            goto Le7
        Ldb:
            org.fortheloss.framework.ColorPicker r7 = r13._segmentColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r7.setTouchable(r9)
            org.fortheloss.framework.ColorPicker r7 = r13._segmentColorPicker
            r7.disableWithAlpha(r4)
        Le7:
            boolean r7 = r6.isUsingGradient()
            if (r7 == 0) goto L107
            org.fortheloss.framework.ColorPicker r7 = r13._gradientColorPicker
            r7.setTouchable(r8)
            org.fortheloss.framework.ColorPicker r7 = r13._gradientColorPicker
            r7.disableWithAlpha(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._gradientPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            if (r7 != 0) goto L118
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._gradientPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r13._gradientPropertiesTable
            r7.setActor(r9)
            goto L118
        L107:
            org.fortheloss.framework.ColorPicker r7 = r13._gradientColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r7.setTouchable(r9)
            org.fortheloss.framework.ColorPicker r7 = r13._gradientColorPicker
            r7.disableWithAlpha(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._gradientPropertiesTableCellRef
            r7.clearActor()
        L118:
            int r7 = r6.getLimbType()
            r9 = 2
            r10 = 6
            if (r7 == r4) goto L16b
            if (r7 == 0) goto L16b
            if (r7 != r10) goto L125
            goto L16b
        L125:
            if (r7 == r9) goto L131
            r11 = 5
            if (r7 != r11) goto L12b
            goto L131
        L12b:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r11 = r13._gradientModeTableCell
            r11.clearActor()
            goto L196
        L131:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r13._circleGradientModeButton1
            short r12 = r6.getGradientMode()
            if (r12 != 0) goto L13b
            r12 = 1
            goto L13c
        L13b:
            r12 = 0
        L13c:
            r11.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r13._circleGradientModeButton2
            short r12 = r6.getGradientMode()
            if (r12 != r4) goto L149
            r12 = 1
            goto L14a
        L149:
            r12 = 0
        L14a:
            r11.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r13._circleGradientModeButton3
            short r12 = r6.getGradientMode()
            if (r12 != r9) goto L157
            r12 = 1
            goto L158
        L157:
            r12 = 0
        L158:
            r11.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r11 = r13._gradientModeTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r11.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r13._gradientModeTableCircles
            if (r11 == r12) goto L196
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r11 = r13._gradientModeTableCell
            r11.setActor(r12)
            goto L196
        L16b:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r13._gradientModeButton1
            short r12 = r6.getGradientMode()
            if (r12 != 0) goto L175
            r12 = 1
            goto L176
        L175:
            r12 = 0
        L176:
            r11.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r13._gradientModeButton2
            short r12 = r6.getGradientMode()
            if (r12 != r4) goto L183
            r12 = 1
            goto L184
        L183:
            r12 = 0
        L184:
            r11.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r11 = r13._gradientModeTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r11.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r13._gradientModeTableSegments
            if (r11 == r12) goto L196
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r11 = r13._gradientModeTableCell
            r11.setActor(r12)
        L196:
            if (r7 != r9) goto L205
            boolean r9 = r6.isHalfArc()
            if (r9 != 0) goto L205
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r9 = r9.getActor()
            if (r9 != 0) goto L1b6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r13._circleOutlineColorTable
            r9.setActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r9.getTable()
            r9.invalidateHierarchy()
        L1b6:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r13._useCircleOutlineButton
            boolean r11 = r6.isUsingCircleOutline()
            r9.setChecked(r11)
            org.fortheloss.framework.ColorPicker r9 = r13._circleOutlineColorPicker
            com.badlogic.gdx.graphics.Color r11 = r6.getCircleOutlineColor()
            r9.setColor(r11, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r13._circleIsHollowButton
            boolean r11 = r6.getCircleIsHollow()
            r9.setChecked(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r13._useCircleOutlineButton
            boolean r9 = r9.isChecked()
            if (r9 == 0) goto L1f3
            org.fortheloss.framework.ColorPicker r9 = r13._circleOutlineColorPicker
            r9.setTouchable(r8)
            org.fortheloss.framework.ColorPicker r9 = r13._circleOutlineColorPicker
            r9.disableWithAlpha(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineColorPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r9 = r9.getActor()
            if (r9 != 0) goto L21b
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineColorPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r13._circleOutlineColorPropertiesTable
            r9.setActor(r11)
            goto L21b
        L1f3:
            org.fortheloss.framework.ColorPicker r9 = r13._circleOutlineColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r11 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r9.setTouchable(r11)
            org.fortheloss.framework.ColorPicker r9 = r13._circleOutlineColorPicker
            r9.disableWithAlpha(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineColorPropertiesTableCellRef
            r9.clearActor()
            goto L21b
        L205:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r9 = r9.getActor()
            if (r9 == 0) goto L21b
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineCellRef
            r9.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r9 = r13._circleOutlineCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r9.getTable()
            r9.invalidateHierarchy()
        L21b:
            if (r7 != r10) goto L234
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._thicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            if (r7 == 0) goto L24c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._thicknessTableCellRef
            r7.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._thicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r7.getTable()
            r7.invalidateHierarchy()
            goto L24c
        L234:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._thicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            if (r7 != 0) goto L24c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._thicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r13._thicknessTable
            r7.setActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r13._thicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r7.getTable()
            r7.invalidateHierarchy()
        L24c:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r6.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r7.getLockedStickNode()
            if (r7 != r6) goto L25c
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._lockNodeButton
            r7.setChecked(r4)
            goto L261
        L25c:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._lockNodeButton
            r7.setChecked(r3)
        L261:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._dragLockCheckbox
            boolean r9 = r6.getIsDragLocked()
            r7.setChecked(r9)
            org.fortheloss.framework.DegreesLabelInputIncrementField r7 = r13._dragLockAngleField
            float r9 = r6.getDragLockAngle()
            r7.setValue(r9)
            boolean r7 = r6.getIsAngleLocked()
            if (r7 == 0) goto L290
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r13._dragLockLabel
            r7.setColor(r5, r5, r5, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._dragLockCheckbox
            r7.setColor(r5, r5, r5, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r13._dragLockCheckbox
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r5)
            org.fortheloss.framework.DegreesLabelInputIncrementField r2 = r13._dragLockAngleField
            r2.disable()
            goto L2a4
        L290:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r13._dragLockLabel
            r2.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r13._dragLockCheckbox
            r2.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r13._dragLockCheckbox
            r2.setTouchable(r8)
            org.fortheloss.framework.DegreesLabelInputIncrementField r2 = r13._dragLockAngleField
            r2.enable()
        L2a4:
            boolean r2 = r6.getIsDragLocked()
            if (r2 == 0) goto L2ba
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r2 = r13._dragLockAngleFieldCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            if (r2 != 0) goto L2bf
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r2 = r13._dragLockAngleFieldCellRef
            org.fortheloss.framework.DegreesLabelInputIncrementField r5 = r13._dragLockAngleField
            r2.setActor(r5)
            goto L2bf
        L2ba:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r2 = r13._dragLockAngleFieldCellRef
            r2.clearActor()
        L2bf:
            int r2 = r6.getLimbType()
            if (r2 == r4) goto L34b
            int r2 = r6.getLimbType()
            if (r2 != 0) goto L2cd
            goto L34b
        L2cd:
            int r2 = r6.getLimbType()
            if (r2 != r10) goto L334
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r13._trapezoidPropertiesTable
            if (r2 == r5) goto L2eb
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            r2.setActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.getTable()
            r2.invalidateHierarchy()
        L2eb:
            org.fortheloss.framework.LabelInputIncrementField r2 = r13.mTrapezoidCurveRadiusField
            int r5 = r6.getSegmentCurve()
            float r5 = (float) r5
            r2.setValue(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r13.mTrapezoidCirculizationButton
            boolean r5 = r6.getSegmentCurveCirculization()
            r2.setChecked(r5)
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r13.mTrapezoidThickness1Field
            float r5 = r6.getTrapezoidThickness1()
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            boolean r7 = r6.getTrapezoidIsRounded1()
            r2.setValue(r5, r7)
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r13.mTrapezoidThickness2Field
            float r5 = r6.getTrapezoidThickness2()
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            boolean r7 = r6.getTrapezoidIsRounded2()
            r2.setValue(r5, r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r13.mTrapezoidKeepRatioButton
            float r5 = r6.getTrapezoidRatio()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L32e
            goto L32f
        L32e:
            r4 = 0
        L32f:
            r2.setChecked(r4)
            goto L3be
        L334:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            if (r2 == 0) goto L3be
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            r2.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.getTable()
            r2.invalidateHierarchy()
            goto L3be
        L34b:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r13._segmentPropertiesTable
            if (r2 == r5) goto L363
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            r2.setActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13._shapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.getTable()
            r2.invalidateHierarchy()
        L363:
            int r2 = r6.getLimbType()
            if (r2 != r4) goto L375
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r13._segmentPropertiesLabel
            java.lang.String r4 = "segment"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r2.setText(r4)
            goto L380
        L375:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r13._segmentPropertiesLabel
            java.lang.String r4 = "roundedSegment"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r2.setText(r4)
        L380:
            org.fortheloss.framework.LabelInputIncrementField r2 = r13.mCurveRadiusField
            int r4 = r6.getSegmentCurve()
            float r4 = (float) r4
            r2.setValue(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r13._circulizationButton
            boolean r4 = r6.getSegmentCurveCirculization()
            r2.setChecked(r4)
            goto L3be
        L394:
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._everythingElseTable
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r6.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._everythingElseTable
            r6.setColor(r5, r5, r5, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r13._flipSegmentXButton
            r6.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r13._flipSegmentXButton
            r6.setColor(r5, r5, r5, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r13._flipSegmentYButton
            r6.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r13._flipSegmentYButton
            r6.setColor(r5, r5, r5, r2)
            org.fortheloss.framework.ColorPicker r2 = r13._segmentColorPicker
            r2.disableWithAlpha(r4)
            org.fortheloss.framework.ColorPicker r2 = r13._gradientColorPicker
            r2.disableWithAlpha(r4)
        L3be:
            if (r1 == 0) goto L3f4
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r1 = r0.isPolyfillAnchor()
            if (r1 == 0) goto L3f4
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r13._usePolyfillColorButton
            boolean r2 = r0.isUsingPolyfillColor()
            r1.setChecked(r2)
            org.fortheloss.framework.ColorPicker r1 = r13._polyfillColorPicker
            com.badlogic.gdx.graphics.Color r2 = r0.getPolyfillColor()
            r1.setColor(r2, r3)
            org.fortheloss.framework.LabelInputIncrementField r1 = r13._polyfillCurvePrecisionField
            int r0 = r0.getSegmentCurvePrecision()
            float r0 = (float) r0
            r1.setValue(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r13._polyfillColorTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto L3f9
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r13._polyfillColorTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._polyfillColorTable
            r0.setActor(r1)
            goto L3f9
        L3f4:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r13._polyfillColorTableCellRef
            r0.clearActor()
        L3f9:
            return
    }
}
