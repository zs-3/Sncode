package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class ShapeToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private boolean _ignoreNextLimbTypeChangeEvent;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mCircleEllipseTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mCirculizationButton;
    private org.fortheloss.framework.LabelInputIncrementField mCurveRadiusField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsFlippedTriangleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mIsFlippedTriangleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsHalfArcButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsRightTriangleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsUpsideDownCircleEllipseButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mIsUpsideDownCircleEllipseLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsUpsideDownTriangleButton;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> mLimbTypeSelectBox;
    private org.fortheloss.framework.LabelInputIncrementField mPolygonField;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mPolygonTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mSegmentTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> mShapePropertiesCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mShapePropertiesNoneLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mShapePropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTrapezoidCirculizationButton;
    private org.fortheloss.framework.LabelInputIncrementField mTrapezoidCurveRadiusField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTrapezoidKeepRatioButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTrapezoidTable;
    private org.fortheloss.framework.CheckBoxInputIncrementField mTrapezoidThickness1Field;
    private org.fortheloss.framework.CheckBoxInputIncrementField mTrapezoidThickness2Field;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTriangleTable;















    /* renamed from: -$$Nest$fget_ignoreNextLimbTypeChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1144$$Nest$fget_ignoreNextLimbTypeChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            boolean r0 = r0._ignoreNextLimbTypeChangeEvent
            return r0
    }

    /* renamed from: -$$Nest$fgetmCirculizationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1145$$Nest$fgetmCirculizationButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mCirculizationButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsHalfArcButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1146$$Nest$fgetmIsHalfArcButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsHalfArcButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsUpsideDownCircleEllipseButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1147$$Nest$fgetmIsUpsideDownCircleEllipseButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsUpsideDownCircleEllipseButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsUpsideDownTriangleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1148$$Nest$fgetmIsUpsideDownTriangleButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsUpsideDownTriangleButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmLimbTypeSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m1149$$Nest$fgetmLimbTypeSelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0.mLimbTypeSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fgetmTrapezoidCirculizationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1150$$Nest$fgetmTrapezoidCirculizationButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTrapezoidCirculizationButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmTrapezoidKeepRatioButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1151$$Nest$fgetmTrapezoidKeepRatioButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTrapezoidKeepRatioButton
            return r0
    }

    /* renamed from: -$$Nest$fput_ignoreNextLimbTypeChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1152$$Nest$fput_ignoreNextLimbTypeChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0, boolean r1) {
            r0._ignoreNextLimbTypeChangeEvent = r1
            return
    }

    /* renamed from: -$$Nest$monFlippedTriangleClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1153$$Nest$monFlippedTriangleClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            r0.onFlippedTriangleClick()
            return
    }

    /* renamed from: -$$Nest$monHalfArcClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1154$$Nest$monHalfArcClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0, boolean r1) {
            r0.onHalfArcClick(r1)
            return
    }

    /* renamed from: -$$Nest$monLimbTypeSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1155$$Nest$monLimbTypeSelection(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0, int r1) {
            r0.onLimbTypeSelection(r1)
            return
    }

    /* renamed from: -$$Nest$monRightTriangleClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1156$$Nest$monRightTriangleClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0) {
            r0.onRightTriangleClick()
            return
    }

    /* renamed from: -$$Nest$monUpsideDownTriangleClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1157$$Nest$monUpsideDownTriangleClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0, boolean r1) {
            r0.onUpsideDownTriangleClick(r1)
            return
    }

    public ShapeToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0._ignoreNextLimbTypeChangeEvent = r1
            return
    }

    private void onFlippedTriangleClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2.mIsFlippedTriangleButton
            boolean r1 = r1.isChecked()
            r0.setShapeIsFlippedTriangle(r1)
            return
    }

    private void onHalfArcClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.setShapeIsHalfArc(r2)
            return
    }

    private void onLimbTypeSelection(int r2) {
            r1 = this;
            switch(r2) {
                case 0: goto L2e;
                case 1: goto L27;
                case 2: goto L20;
                case 3: goto L19;
                case 4: goto L12;
                case 5: goto Lb;
                case 6: goto L4;
                default: goto L3;
            }
        L3:
            goto L34
        L4:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 7
            r2.setSegmentType(r0)
            goto L34
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 6
            r2.setSegmentType(r0)
            goto L34
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 3
            r2.setSegmentType(r0)
            goto L34
        L19:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 5
            r2.setSegmentType(r0)
            goto L34
        L20:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 2
            r2.setSegmentType(r0)
            goto L34
        L27:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 0
            r2.setSegmentType(r0)
            goto L34
        L2e:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 1
            r2.setSegmentType(r0)
        L34:
            return
    }

    private void onRightTriangleClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2.mIsRightTriangleButton
            boolean r1 = r1.isChecked()
            r0.setShapeIsRightTriangle(r1)
            return
    }

    private void onUpsideDownTriangleClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.setShapeIsUpsideDownTriangle(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2.mLimbTypeSelectBox = r0
            r2.mShapePropertiesNoneLabel = r0
            r2.mIsHalfArcButton = r0
            r2.mIsUpsideDownCircleEllipseButton = r0
            r2.mIsUpsideDownCircleEllipseLabel = r0
            r2.mIsRightTriangleButton = r0
            r2.mIsUpsideDownTriangleButton = r0
            r2.mIsFlippedTriangleButton = r0
            r2.mShapePropertiesCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mShapePropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mShapePropertiesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mCircleEllipseTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mCircleEllipseTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mSegmentTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mSegmentTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mCircleEllipseTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mCircleEllipseTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTrapezoidTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mTrapezoidTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mPolygonTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mPolygonTable = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mCurveRadiusField
            if (r1 == 0) goto L48
            r1.dispose()
            r2.mCurveRadiusField = r0
        L48:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mPolygonField
            if (r1 == 0) goto L51
            r1.dispose()
            r2.mPolygonField = r0
        L51:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mTrapezoidThickness1Field
            if (r1 == 0) goto L5a
            r1.dispose()
            r2.mTrapezoidThickness1Field = r0
        L5a:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mTrapezoidThickness2Field
            if (r1 == 0) goto L63
            r1.dispose()
            r2.mTrapezoidThickness2Field = r0
        L63:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mTrapezoidCurveRadiusField
            if (r1 == 0) goto L6c
            r1.dispose()
            r2.mTrapezoidCurveRadiusField = r0
        L6c:
            r2.mCirculizationButton = r0
            r2.mTrapezoidCirculizationButton = r0
            r2.mTrapezoidKeepRatioButton = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r18, com.badlogic.gdx.graphics.g2d.TextureAtlas r19, com.badlogic.gdx.scenes.scene2d.utils.Drawable r20) {
            r17 = this;
            r0 = r17
            r1 = r20
            super.initialize(r1)
            java.lang.String r1 = "shapeTools"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r3 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r3, r2)
            r0._titleLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r2 = 2
            r1.colspan(r2)
            r17.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r17.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r1.getContext()
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L51
            java.lang.String r1 = "changeShapeProperties"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.colspan(r2)
            r17.row()
        L51:
            org.fortheloss.framework.SelectBoxCustomItemHeight r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBox()
            r0.mLimbTypeSelectBox = r1
            r4 = 80
            r0.registerWidget(r1, r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0.mLimbTypeSelectBox
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = "segment"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "roundedSegment"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r4[r3] = r5
            java.lang.String r5 = "circle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r4[r2] = r5
            r5 = 3
            java.lang.String r7 = "ellipse"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r4[r5] = r7
            r5 = 4
            java.lang.String r7 = "triangle"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r4[r5] = r7
            r5 = 5
            java.lang.String r7 = "trapezoid"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r4[r5] = r7
            r5 = 6
            java.lang.String r7 = "polygon"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r4[r5] = r7
            r1.setItems(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0.mLimbTypeSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$1 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$1
            r4.<init>(r0)
            r1.addListener(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0.mLimbTypeSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r4 = (float) r4
            r1.height(r4)
            r17.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0.mShapePropertiesTable = r1
            r4 = 81
            r0.registerWidget(r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mShapePropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.colspan(r2)
            r17.row()
            java.lang.String r1 = "noProperties"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ")"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r3)
            r0.mShapePropertiesNoneLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0.mShapePropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r4.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r4)
            r0.mShapePropertiesCellRef = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r0.mSegmentTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r4)
            r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mSegmentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.uniformX()
            org.fortheloss.framework.LabelInputIncrementField r1 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r5 = r17.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r5.getContext()
            java.lang.String r5 = "curveRadius"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r5)
            r12 = 6
            r13 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            r14 = 1203982208(0x47c34f80, float:99999.0)
            r15 = 0
            java.lang.String r11 = "0"
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.mCurveRadiusField = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r8.<init>()
            r1.setTextFieldFilter(r8)
            org.fortheloss.framework.LabelInputIncrementField r1 = r0.mCurveRadiusField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$2 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$2
            r8.<init>(r0)
            r1.setFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mSegmentTable
            org.fortheloss.framework.LabelInputIncrementField r8 = r0.mCurveRadiusField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mSegmentTable
            r1.row()
            java.lang.String r1 = "isCirculized"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r8, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mSegmentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r9.add(r8)
            r8.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r0.mCirculizationButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$3 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$3
            r9.<init>(r0)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mSegmentTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r0.mCirculizationButton
            r8.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mSegmentTable
            r8.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r8.<init>()
            r0.mCircleEllipseTable = r8
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r8.pad(r4)
            r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.space(r4)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.spaceRight(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.spaceBottom(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.uniformX()
            java.lang.String r8 = "isHalfArc"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r8, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r9.add(r8)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r9 = (float) r9
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            r8.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r0.mIsHalfArcButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$4 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$4
            r9.<init>(r0)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r0.mIsHalfArcButton
            r8.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mCircleEllipseTable
            r8.row()
            java.lang.String r8 = "upsideDown"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r9, r3)
            r0.mIsUpsideDownCircleEllipseLabel = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r11 = (float) r11
            float r11 = r11 * r10
            r9.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r9)
            r0.mIsUpsideDownCircleEllipseButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$5 r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$5
            r11.<init>(r0)
            r9.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r0.mIsUpsideDownCircleEllipseButton
            r9.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r0.mTriangleTable = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r9.pad(r4)
            r9.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.space(r4)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.spaceRight(r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.spaceBottom(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expandX()
            r9.uniformX()
            java.lang.String r9 = "isRightTriangle"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r9, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r11 = (float) r11
            float r11 = r11 * r10
            r9.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r9)
            r0.mIsRightTriangleButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$6 r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$6
            r11.<init>(r0)
            r9.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r0.mIsRightTriangleButton
            r9.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mTriangleTable
            r9.row()
            java.lang.String r9 = "flipped"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r9, r3)
            r0.mIsFlippedTriangleLabel = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r11 = (float) r11
            float r11 = r11 * r10
            r9.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r9)
            r0.mIsFlippedTriangleButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$7 r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$7
            r11.<init>(r0)
            r9.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = r0.mIsFlippedTriangleButton
            r9.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mTriangleTable
            r9.row()
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r8, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r9.add(r8)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r9 = (float) r9
            float r9 = r9 * r10
            r8.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r0.mIsUpsideDownTriangleButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$8 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$8
            r9.<init>(r0)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r0.mIsUpsideDownTriangleButton
            r8.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r8.<init>()
            r0.mTrapezoidTable = r8
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r8.pad(r4)
            r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.space(r4)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.spaceRight(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.spaceBottom(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.uniformX()
            org.fortheloss.framework.LabelInputIncrementField r8 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r9 = r17.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9.getContext()
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r5)
            r13 = 6
            r14 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            r15 = 1203982208(0x47c34f80, float:99999.0)
            r16 = 0
            java.lang.String r12 = "0"
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.mTrapezoidCurveRadiusField = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r5.<init>()
            r8.setTextFieldFilter(r5)
            org.fortheloss.framework.LabelInputIncrementField r5 = r0.mTrapezoidCurveRadiusField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$9 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$9
            r8.<init>(r0)
            r5.setFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r0.mTrapezoidTable
            org.fortheloss.framework.LabelInputIncrementField r8 = r0.mTrapezoidCurveRadiusField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r2)
            r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r0.mTrapezoidTable
            r5.row()
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r0.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.add(r1)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r0.mTrapezoidCirculizationButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$10 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$10
            r5.<init>(r0)
            r1.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r0.mTrapezoidCirculizationButton
            r1.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r8 = "separator"
            r9 = r18
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r9.findRegion(r8)
            r5.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r5)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            r1.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r5 = r17.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r5.getContext()
            java.lang.String r5 = "start"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r16 = "roundedThickness"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r16)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = "\n"
            r10.append(r5)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            r12 = 4
            r13 = 0
            r14 = 1176255488(0x461c3c00, float:9999.0)
            r15 = 0
            java.lang.String r11 = "0"
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.mTrapezoidThickness1Field = r1
            r1.setCheckboxControlsTextfield(r6)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r0.mTrapezoidThickness1Field
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$11 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$11
            r8.<init>(r0)
            r1.setFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            org.fortheloss.framework.CheckBoxInputIncrementField r8 = r0.mTrapezoidThickness1Field
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            r1.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r8 = r17.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8.getContext()
            java.lang.String r8 = "end"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r16)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r5)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "0"
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.mTrapezoidThickness2Field = r1
            r1.setCheckboxControlsTextfield(r6)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r0.mTrapezoidThickness2Field
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$12 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$12
            r5.<init>(r0)
            r1.setFieldListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            org.fortheloss.framework.CheckBoxInputIncrementField r5 = r0.mTrapezoidThickness2Field
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            r1.row()
            java.lang.String r1 = "keepRatio"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r0.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.add(r1)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r0.mTrapezoidKeepRatioButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$13 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$13
            r5.<init>(r0)
            r1.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r0.mTrapezoidKeepRatioButton
            r1.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mTrapezoidTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r0.mPolygonTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r4)
            r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mPolygonTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.uniformX()
            org.fortheloss.framework.LabelInputIncrementField r1 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r17.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3.getContext()
            java.lang.String r3 = "vertices"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r3)
            r7 = 2
            r8 = 1082130432(0x40800000, float:4.0)
            r9 = 1098907648(0x41800000, float:16.0)
            r10 = 0
            java.lang.String r6 = "5"
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.mPolygonField = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$14 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable$14
            r3.<init>(r0)
            r1.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0.mPolygonTable
            org.fortheloss.framework.LabelInputIncrementField r3 = r0.mPolygonField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            r17.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r10 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r10.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L1d1
            boolean r3 = r0.isMainNode()
            if (r3 != 0) goto L1d1
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r3 != 0) goto L18
            goto L1d1
        L18:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r10.mLimbTypeSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r10.mLimbTypeSelectBox
            r3.setColor(r2, r2, r2, r2)
            org.fortheloss.framework.LabelInputIncrementField r3 = r10.mCurveRadiusField
            int r5 = r0.getSegmentCurve()
            float r5 = (float) r5
            r3.setValue(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mCirculizationButton
            boolean r5 = r0.getSegmentCurveCirculization()
            r3.setChecked(r5)
            org.fortheloss.framework.LabelInputIncrementField r3 = r10.mTrapezoidCurveRadiusField
            int r5 = r0.getSegmentCurve()
            float r5 = (float) r5
            r3.setValue(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mTrapezoidCirculizationButton
            boolean r5 = r0.getSegmentCurveCirculization()
            r3.setChecked(r5)
            org.fortheloss.framework.CheckBoxInputIncrementField r3 = r10.mTrapezoidThickness1Field
            float r5 = r0.getTrapezoidThickness1()
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            boolean r6 = r0.getTrapezoidIsRounded1()
            r3.setValue(r5, r6)
            org.fortheloss.framework.CheckBoxInputIncrementField r3 = r10.mTrapezoidThickness2Field
            float r5 = r0.getTrapezoidThickness2()
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            boolean r6 = r0.getTrapezoidIsRounded2()
            r3.setValue(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mTrapezoidKeepRatioButton
            float r5 = r0.getTrapezoidRatio()
            r6 = 0
            r7 = 0
            r8 = 1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L7f
            r5 = 1
            goto L80
        L7f:
            r5 = 0
        L80:
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsHalfArcButton
            boolean r5 = r0.isHalfArc()
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsUpsideDownCircleEllipseButton
            boolean r5 = r0.getTriangleUpsideDown()
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsHalfArcButton
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto Lad
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsUpsideDownCircleEllipseButton
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsUpsideDownCircleEllipseButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r10.mIsUpsideDownCircleEllipseLabel
            r3.setColor(r2, r2, r2, r2)
            goto Lbe
        Lad:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsUpsideDownCircleEllipseButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsUpsideDownCircleEllipseButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r10.mIsUpsideDownCircleEllipseLabel
            r3.setColor(r2, r2, r2, r1)
        Lbe:
            short r3 = r0.getRightTriangleDirection()
            if (r3 == 0) goto Lc6
            r5 = 1
            goto Lc7
        Lc6:
            r5 = 0
        Lc7:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r10.mIsRightTriangleButton
            r6.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r10.mIsFlippedTriangleButton
            r9 = -1
            if (r3 != r9) goto Ld3
            r3 = 1
            goto Ld4
        Ld3:
            r3 = 0
        Ld4:
            r6.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsUpsideDownTriangleButton
            boolean r6 = r0.getTriangleUpsideDown()
            r3.setChecked(r6)
            if (r5 == 0) goto Lf2
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r10.mIsFlippedTriangleLabel
            r1.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r10.mIsFlippedTriangleButton
            r1.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r10.mIsFlippedTriangleButton
            r1.setColor(r2, r2, r2, r2)
            goto L103
        Lf2:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r10.mIsFlippedTriangleLabel
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsFlippedTriangleButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r10.mIsFlippedTriangleButton
            r3.setColor(r2, r2, r2, r1)
        L103:
            org.fortheloss.framework.LabelInputIncrementField r1 = r10.mPolygonField
            short r2 = r0.getNumPolygonVertices()
            float r2 = (float) r2
            r1.setValue(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r10.mLimbTypeSelectBox
            int r1 = r1.getSelectedIndex()
            int r0 = r0.getLimbType()
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 2
            if (r0 == 0) goto L136
            if (r0 == r8) goto L137
            if (r0 == r6) goto L134
            if (r0 == r5) goto L132
            if (r0 == r4) goto L130
            if (r0 == r3) goto L12e
            if (r0 == r2) goto L12c
            r7 = -1
            goto L137
        L12c:
            r7 = 6
            goto L137
        L12e:
            r7 = 5
            goto L137
        L130:
            r7 = 3
            goto L137
        L132:
            r7 = 4
            goto L137
        L134:
            r7 = 2
            goto L137
        L136:
            r7 = 1
        L137:
            if (r1 == r7) goto L13b
            r10._ignoreNextLimbTypeChangeEvent = r8
        L13b:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r10.mLimbTypeSelectBox
            r1.setSelectedIndex(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r0 == 0) goto L1bd
            if (r0 != r8) goto L14c
            goto L1bd
        L14c:
            if (r0 == r6) goto L1a9
            if (r0 != r4) goto L151
            goto L1a9
        L151:
            if (r0 != r5) goto L168
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r10.mTriangleTable
            if (r1 == r0) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mTriangleTable
            r0.setActor(r1)
            goto L1f6
        L168:
            if (r0 != r3) goto L17f
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r10.mTrapezoidTable
            if (r1 == r0) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mTrapezoidTable
            r0.setActor(r1)
            goto L1f6
        L17f:
            if (r0 != r2) goto L195
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r10.mPolygonTable
            if (r1 == r0) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mPolygonTable
            r0.setActor(r1)
            goto L1f6
        L195:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r10.mShapePropertiesNoneLabel
            if (r1 == r0) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r10.mShapePropertiesNoneLabel
            r0.setActor(r1)
            goto L1f6
        L1a9:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r10.mCircleEllipseTable
            if (r1 == r0) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mCircleEllipseTable
            r0.setActor(r1)
            goto L1f6
        L1bd:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r10.mSegmentTable
            if (r1 == r0) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mSegmentTable
            r0.setActor(r1)
            goto L1f6
        L1d1:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r10.mLimbTypeSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r10.mLimbTypeSelectBox
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r10.mShapePropertiesNoneLabel
            if (r0 == r1) goto L1f6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            r0.clearActor()
            r10.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r10.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r10.mShapePropertiesNoneLabel
            r0.setActor(r1)
        L1f6:
            return
    }
}
