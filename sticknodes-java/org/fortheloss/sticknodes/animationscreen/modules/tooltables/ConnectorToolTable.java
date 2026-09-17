package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class ConnectorToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleGradientModeButton1;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleGradientModeButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleGradientModeButton3;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _connectorButtonsCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _deleteConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _deletePolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _editConnectorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editPolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _editPolyfillTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _gradientModeButton1;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _gradientModeButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _gradientModeTableCircles;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _gradientModeTableSegments;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.ImageTextButtonLongPress _pasteSegmentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _pasteUseGlobalAngleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _polyfillButtonsCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mAddConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mAddPolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button mChangeEndButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mCircleEllipseTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mCircleIsHollowButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mCircleIsHollowLabel;
    private org.fortheloss.framework.ColorPicker mCircleOutlineColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mCircleOutlineColorPropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mCircleOutlineColorPropertiesTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mCircleOutlineColorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mCircleOutlineTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mCirculizationButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button mCopySegmentAndChildrenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button mCopySegmentButton;
    private org.fortheloss.framework.LabelInputIncrementField mCurveRadiusField;
    private com.badlogic.gdx.scenes.scene2d.ui.Button mDeleteConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mDoNotSmartStretchButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mFlipSegmentXButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mFlipSegmentYButton;
    private org.fortheloss.framework.ColorPicker mGradientColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mGradientModeTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mGradientPropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mGradientPropertiesTableCellRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable mHorizontalPushTables;
    private boolean mIgnoreNextLimbTypeChangeEvent;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsFlippedTiangleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mIsFlippedTriangleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsHalfArcButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsRightTriangleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIsUpsideDownTriangleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mLabelNoProperties;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> mLimbTypeSelectBox;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mModifyBranchButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.CheckBoxInputIncrementField> mNodeLocationFieldCellRef;
    private org.fortheloss.framework.CheckBoxInputIncrementField mPercentField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mPercentRadio;
    private org.fortheloss.framework.LabelInputIncrementField mPolygonField;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mPolygonTable;
    private org.fortheloss.framework.RepeatingImageButton mPushBackButton;
    private org.fortheloss.framework.RepeatingImageButton mPushBackButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mPushBranchTable;
    private org.fortheloss.framework.RepeatingImageButton mPushForwardButton;
    private org.fortheloss.framework.RepeatingImageButton mPushForwardButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mPushTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mReverseGradientButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mReverseGradientLabel;
    private org.fortheloss.framework.ColorPicker mSegmentColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mSegmentTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mSendToBackButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mSendToBackButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mSendToFrontButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mSendToFrontButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> mShapePropertiesCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mShapePropertiesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mSmartStretchButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu mSmartStretchContextMenu;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mSmartStretchQuestionButton;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable mSmartStretchTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mStaticButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mTestSmartStretchButton;
    private org.fortheloss.framework.LabelInputIncrementField mThicknessField;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mThicknessTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mThicknessTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mTitleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTrapezoidCirculizationButton;
    private org.fortheloss.framework.LabelInputIncrementField mTrapezoidCurveRadiusField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTrapezoidKeepRatioButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTrapezoidTable;
    private org.fortheloss.framework.CheckBoxInputIncrementField mTrapezoidThickness1Field;
    private org.fortheloss.framework.CheckBoxInputIncrementField mTrapezoidThickness2Field;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTriangleTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mUseCircleOutlineButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mUseGradientColorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mUseSegmentColorButton;
    private org.fortheloss.framework.CheckBoxInputIncrementField mValueField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mValueRadio;





































































    /* renamed from: -$$Nest$fget_circleGradientModeButton2, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m880$$Nest$fget_circleGradientModeButton2(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._circleGradientModeButton2
            return r0
    }

    /* renamed from: -$$Nest$fget_circleGradientModeButton3, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m881$$Nest$fget_circleGradientModeButton3(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._circleGradientModeButton3
            return r0
    }

    /* renamed from: -$$Nest$fget_gradientModeButton1, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m882$$Nest$fget_gradientModeButton1(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._gradientModeButton1
            return r0
    }

    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu m883$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_pasteUseGlobalAngleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m884$$Nest$fget_pasteUseGlobalAngleButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._pasteUseGlobalAngleButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmCircleIsHollowButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m885$$Nest$fgetmCircleIsHollowButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mCircleIsHollowButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmCircleOutlineColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m886$$Nest$fgetmCircleOutlineColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mCircleOutlineColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmCirculizationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m887$$Nest$fgetmCirculizationButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mCirculizationButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmDoNotSmartStretchButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m888$$Nest$fgetmDoNotSmartStretchButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mDoNotSmartStretchButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmGradientColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m889$$Nest$fgetmGradientColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mGradientColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmIgnoreNextLimbTypeChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m890$$Nest$fgetmIgnoreNextLimbTypeChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            boolean r0 = r0.mIgnoreNextLimbTypeChangeEvent
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsFlippedTiangleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m891$$Nest$fgetmIsFlippedTiangleButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsFlippedTiangleButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsHalfArcButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m892$$Nest$fgetmIsHalfArcButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsHalfArcButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsRightTriangleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m893$$Nest$fgetmIsRightTriangleButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsRightTriangleButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsUpsideDownTriangleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m894$$Nest$fgetmIsUpsideDownTriangleButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIsUpsideDownTriangleButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmLimbTypeSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m895$$Nest$fgetmLimbTypeSelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0.mLimbTypeSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fgetmReverseGradientButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m896$$Nest$fgetmReverseGradientButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mReverseGradientButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmSegmentColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m897$$Nest$fgetmSegmentColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mSegmentColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmSmartStretchButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m898$$Nest$fgetmSmartStretchButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mSmartStretchButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmSmartStretchContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu m899$$Nest$fgetmSmartStretchContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r0.mSmartStretchContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fgetmSmartStretchQuestionButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m900$$Nest$fgetmSmartStretchQuestionButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0.mSmartStretchQuestionButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmStaticButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m901$$Nest$fgetmStaticButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mStaticButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmTrapezoidCirculizationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m902$$Nest$fgetmTrapezoidCirculizationButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTrapezoidCirculizationButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmTrapezoidKeepRatioButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m903$$Nest$fgetmTrapezoidKeepRatioButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTrapezoidKeepRatioButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmUseCircleOutlineButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m904$$Nest$fgetmUseCircleOutlineButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mUseCircleOutlineButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmUseGradientColorButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m905$$Nest$fgetmUseGradientColorButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mUseGradientColorButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmUseSegmentColorButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m906$$Nest$fgetmUseSegmentColorButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mUseSegmentColorButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmValueRadio, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m907$$Nest$fgetmValueRadio(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mValueRadio
            return r0
    }

    /* renamed from: -$$Nest$fputmIgnoreNextLimbTypeChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m908$$Nest$fputmIgnoreNextLimbTypeChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0, boolean r1) {
            r0.mIgnoreNextLimbTypeChangeEvent = r1
            return
    }

    /* renamed from: -$$Nest$monLimbTypeSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m909$$Nest$monLimbTypeSelection(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0, int r1) {
            r0.onLimbTypeSelection(r1)
            return
    }

    public ConnectorToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mIgnoreNextLimbTypeChangeEvent = r1
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
            r2.setConnectorSegmentType(r0)
            goto L34
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 6
            r2.setConnectorSegmentType(r0)
            goto L34
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 3
            r2.setConnectorSegmentType(r0)
            goto L34
        L19:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 5
            r2.setConnectorSegmentType(r0)
            goto L34
        L20:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 2
            r2.setConnectorSegmentType(r0)
            goto L34
        L27:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 0
            r2.setConnectorSegmentType(r0)
            goto L34
        L2e:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._creationToolsModuleRef
            r0 = 1
            r2.setConnectorSegmentType(r0)
        L34:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mTitleLabel = r0
            r2.mChangeEndButton = r0
            r2.mDeleteConnectorButton = r0
            r2.mModifyBranchButton = r0
            r2.mAddConnectorButton = r0
            r2.mAddPolyfillButton = r0
            r2._editPolyfillButton = r0
            r2._editConnectorButton = r0
            r2._deletePolyfillButton = r0
            r2._deleteConnectorButton = r0
            r2.mPercentRadio = r0
            r2.mValueRadio = r0
            r2.mLimbTypeSelectBox = r0
            r2.mIsHalfArcButton = r0
            r2.mIsRightTriangleButton = r0
            r2.mIsUpsideDownTriangleButton = r0
            r2.mIsFlippedTriangleLabel = r0
            r2.mIsFlippedTiangleButton = r0
            r2.mCirculizationButton = r0
            r2.mTrapezoidCirculizationButton = r0
            r2.mTrapezoidKeepRatioButton = r0
            r2.mCopySegmentButton = r0
            r2.mCopySegmentAndChildrenButton = r0
            r2._pasteSegmentButton = r0
            r2._pasteUseGlobalAngleButton = r0
            r2.mUseSegmentColorButton = r0
            r2.mReverseGradientLabel = r0
            r2.mReverseGradientButton = r0
            r2.mUseGradientColorButton = r0
            r2._gradientModeButton1 = r0
            r2._gradientModeButton2 = r0
            r2._circleGradientModeButton1 = r0
            r2._circleGradientModeButton2 = r0
            r2._circleGradientModeButton3 = r0
            r2.mUseCircleOutlineButton = r0
            r2.mCircleIsHollowLabel = r0
            r2.mCircleIsHollowButton = r0
            r2.mFlipSegmentXButton = r0
            r2.mFlipSegmentYButton = r0
            r2.mStaticButton = r0
            r2.mPushBackButton = r0
            r2.mPushBackButton2 = r0
            r2.mPushForwardButton = r0
            r2.mPushForwardButton2 = r0
            r2.mSendToBackButton = r0
            r2.mSendToBackButton2 = r0
            r2.mSendToFrontButton = r0
            r2.mSendToFrontButton2 = r0
            r2.mLabelNoProperties = r0
            r2.mGradientModeTableCell = r0
            r2.mCircleOutlineTableCellRef = r0
            r2.mThicknessTableCellRef = r0
            r2.mGradientPropertiesTableCellRef = r0
            r2.mCircleOutlineColorPropertiesTableCellRef = r0
            r2.mShapePropertiesCellRef = r0
            r2.mNodeLocationFieldCellRef = r0
            r2._polyfillButtonsCellRef = r0
            r2._connectorButtonsCellRef = r0
            r2.mTestSmartStretchButton = r0
            r2.mSmartStretchButton = r0
            r2.mSmartStretchQuestionButton = r0
            r2.mDoNotSmartStretchButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r2.mSmartStretchTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mSmartStretchTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mShapePropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mShapePropertiesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._editPolyfillTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._editPolyfillTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._editConnectorTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._editConnectorTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mSegmentTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mSegmentTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTriangleTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mTriangleTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTrapezoidTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mTrapezoidTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mPolygonTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mPolygonTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mCircleEllipseTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mCircleEllipseTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._gradientModeTableSegments
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._gradientModeTableSegments = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._gradientModeTableCircles
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._gradientModeTableCircles = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mCircleOutlineColorTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mCircleOutlineColorTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mPushTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mPushTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mPushBranchTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mPushBranchTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mThicknessTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mThicknessTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mGradientPropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mGradientPropertiesTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mCircleOutlineColorPropertiesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2.mCircleOutlineColorPropertiesTable = r0
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mValueField
            if (r1 == 0) goto Lfb
            r1.dispose()
        Lfb:
            r2.mValueField = r0
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mPercentField
            if (r1 == 0) goto L104
            r1.dispose()
        L104:
            r2.mPercentField = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mCurveRadiusField
            if (r1 == 0) goto L10d
            r1.dispose()
        L10d:
            r2.mCurveRadiusField = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mPolygonField
            if (r1 == 0) goto L116
            r1.dispose()
        L116:
            r2.mPolygonField = r0
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mTrapezoidThickness1Field
            if (r1 == 0) goto L11f
            r1.dispose()
        L11f:
            r2.mTrapezoidThickness1Field = r0
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mTrapezoidThickness2Field
            if (r1 == 0) goto L128
            r1.dispose()
        L128:
            r2.mTrapezoidThickness2Field = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mTrapezoidCurveRadiusField
            if (r1 == 0) goto L131
            r1.dispose()
        L131:
            r2.mTrapezoidCurveRadiusField = r0
            org.fortheloss.framework.ColorPicker r1 = r2.mSegmentColorPicker
            if (r1 == 0) goto L13a
            r1.dispose()
        L13a:
            r2.mSegmentColorPicker = r0
            org.fortheloss.framework.ColorPicker r1 = r2.mGradientColorPicker
            if (r1 == 0) goto L143
            r1.dispose()
        L143:
            r2.mGradientColorPicker = r0
            org.fortheloss.framework.ColorPicker r1 = r2.mCircleOutlineColorPicker
            if (r1 == 0) goto L14c
            r1.dispose()
        L14c:
            r2.mCircleOutlineColorPicker = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mThicknessField
            if (r1 == 0) goto L155
            r1.dispose()
        L155:
            r2.mThicknessField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r1 = r2.mHorizontalPushTables
            if (r1 == 0) goto L15e
            r1.dispose()
        L15e:
            r2.mHorizontalPushTables = r0
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r2.mSmartStretchContextMenu
            if (r1 == 0) goto L169
            r1.dispose()
            r2.mSmartStretchContextMenu = r0
        L169:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L172
            r1.dispose()
            r2._pasteContextMenu = r0
        L172:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r34, com.badlogic.gdx.graphics.g2d.TextureAtlas r35, com.badlogic.gdx.scenes.scene2d.utils.Drawable r36) {
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r36
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r10 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r9)
            java.lang.String r0 = "connectorTools"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r11 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11, r1)
            r7.mTitleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r12 = 2
            r0.colspan(r12)
            r33.row()
            java.lang.String r0 = "changeEndpoint"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r13 = "..."
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7.mChangeEndButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$1
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mChangeEndButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r12)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r14 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r33.row()
            java.lang.String r0 = "nodeLocation"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r33.row()
            java.lang.String r0 = "byValue"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            java.lang.String r0 = "byPercent"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mValueRadio = r0
            r1 = 90
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mValueRadio
            r0.setChecked(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mValueRadio
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$2
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mValueRadio
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mPercentRadio = r0
            r1 = 92
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mPercentRadio
            r15 = 0
            r0.setChecked(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mPercentRadio
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$3 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$3
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mPercentRadio
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r11)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r12]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7.mValueRadio
            r1[r15] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7.mPercentRadio
            r1[r11] = r2
            r0.<init>(r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r7._creationToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r1.getContext()
            java.lang.String r1 = "reversedValue"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r19 = "50"
            r20 = 8
            r21 = 0
            r22 = 1232348144(0x497423f0, float:999999.0)
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7.mValueField = r0
            r1 = 91
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mValueField
            r0.setCheckboxControlsTextfield(r15)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mValueField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$4 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$4
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r7._creationToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r1.getContext()
            java.lang.String r1 = "reversedPercent"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r19 = "0.5"
            r20 = 4
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7.mPercentField = r0
            r1 = 93
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mPercentField
            r0.setCheckboxControlsTextfield(r15)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mPercentField
            r0.setHighFidelity(r11)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mPercentField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$5
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mValueField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mNodeLocationFieldCellRef = r0
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r33.row()
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBox()
            r7.mLimbTypeSelectBox = r0
            r1 = 80
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r7.mLimbTypeSelectBox
            r1 = 7
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "segment"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1[r15] = r2
            java.lang.String r2 = "roundedSegment"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1[r11] = r2
            java.lang.String r2 = "circle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1[r12] = r2
            java.lang.String r2 = "ellipse"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "triangle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r3 = 4
            r1[r3] = r2
            java.lang.String r2 = "trapezoid"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r3 = 5
            r1[r3] = r2
            java.lang.String r2 = "polygon"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r3 = 6
            r1[r3] = r2
            r0.setItems(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r7.mLimbTypeSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$6
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r7.mLimbTypeSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.colspan(r12)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mShapePropertiesTable = r0
            r1 = 81
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mShapePropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r33.row()
            java.lang.String r0 = "noProperties"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            r7.mLabelNoProperties = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mShapePropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r7.mShapePropertiesCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7.mSegmentTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r5)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mSegmentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r5)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r1.getContext()
            java.lang.String r1 = "curveRadius"
            java.lang.String r19 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r20 = "0"
            r21 = 6
            r22 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            r23 = 1203982208(0x47c34f80, float:99999.0)
            r24 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mCurveRadiusField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r2.<init>()
            r0.setTextFieldFilter(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mCurveRadiusField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$7 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$7
            r2.<init>(r7)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mSegmentTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mCurveRadiusField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mSegmentTable
            r0.row()
            java.lang.String r0 = "isCirculized"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mSegmentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7.mCirculizationButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$8 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$8
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mSegmentTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7.mCirculizationButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mSegmentTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r7.mCircleEllipseTable = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.pad(r5)
            r2.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r5)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceRight(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.uniformX()
            java.lang.String r2 = "isHalfArc"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            r2.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7.mIsHalfArcButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$9 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$9
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mCircleEllipseTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7.mIsHalfArcButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mCircleEllipseTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r7.mTriangleTable = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.pad(r5)
            r2.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r5)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceRight(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.uniformX()
            java.lang.String r2 = "isRightTriangle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r3 = (float) r3
            float r3 = r3 * r4
            r2.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7.mIsRightTriangleButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$10 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$10
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7.mIsRightTriangleButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTriangleTable
            r2.row()
            java.lang.String r2 = "flipped"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r11)
            r7.mIsFlippedTriangleLabel = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r3 = (float) r3
            float r3 = r3 * r4
            r2.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7.mIsFlippedTiangleButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$11 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$11
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7.mIsFlippedTiangleButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTriangleTable
            r2.row()
            java.lang.String r2 = "upsideDown"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r3 = (float) r3
            float r3 = r3 * r4
            r2.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7.mIsUpsideDownTriangleButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$12 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$12
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTriangleTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7.mIsUpsideDownTriangleButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r7.mTrapezoidTable = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.pad(r5)
            r2.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r5)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceRight(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.uniformX()
            org.fortheloss.framework.LabelInputIncrementField r2 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r3.getContext()
            java.lang.String r19 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r20 = "0"
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mTrapezoidCurveRadiusField = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r1.<init>()
            r2.setTextFieldFilter(r1)
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mTrapezoidCurveRadiusField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$13 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$13
            r2.<init>(r7)
            r1.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mTrapezoidTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r7.mTrapezoidCurveRadiusField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r12)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mTrapezoidTable
            r1.row()
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mTrapezoidCirculizationButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$14 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$14
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mTrapezoidCirculizationButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r14)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r1.getContext()
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
            java.lang.String r19 = r4.toString()
            java.lang.String r20 = "0"
            r21 = 4
            r22 = 0
            r23 = 1176255488(0x461c3c00, float:9999.0)
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mTrapezoidThickness1Field = r0
            r0.setCheckboxControlsTextfield(r15)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mTrapezoidThickness1Field
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$15 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$15
            r3.<init>(r7)
            r0.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            org.fortheloss.framework.CheckBoxInputIncrementField r3 = r7.mTrapezoidThickness1Field
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r3.getContext()
            java.lang.String r3 = "end"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r19 = r4.toString()
            java.lang.String r20 = "0"
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mTrapezoidThickness2Field = r0
            r0.setCheckboxControlsTextfield(r15)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r7.mTrapezoidThickness2Field
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$16 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$16
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mTrapezoidThickness2Field
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            r0.row()
            java.lang.String r0 = "keepRatio"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mTrapezoidKeepRatioButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$17 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$17
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mTrapezoidKeepRatioButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mTrapezoidTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7.mPolygonTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r5)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPolygonTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r5)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r1.getContext()
            java.lang.String r1 = "vertices"
            java.lang.String r19 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r20 = "5"
            r21 = 2
            r22 = 1082130432(0x40800000, float:4.0)
            r23 = 1098907648(0x41800000, float:16.0)
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mPolygonField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$18 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$18
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPolygonTable
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mPolygonField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipSegmentX()
            r0.<init>(r1)
            r7.mFlipSegmentXButton = r0
            r1 = 45
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7.mFlipSegmentXButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$19 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$19
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7.mFlipSegmentXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r4 = 16
            r0.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipSegmentY()
            r0.<init>(r1)
            r7.mFlipSegmentYButton = r0
            r1 = 46
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7.mFlipSegmentYButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$20 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$20
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7.mFlipSegmentYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r3 = 8
            r0.align(r3)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r33.row()
            java.lang.String r0 = "useSegmentColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mUseSegmentColorButton = r0
            r1 = 31
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mUseSegmentColorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$21 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$21
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mUseSegmentColorButton
            r7.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$22 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$22
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r7._creationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r17 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r18 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r19 = r0 * r16
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r20 = r0.getIsLeftHandMode()
            r0 = r2
            r1 = r33
            r15 = r2
            r2 = r17
            r12 = 8
            r3 = r18
            r4 = r35
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mSegmentColorPicker = r15
            r6 = 1065353216(0x3f800000, float:1.0)
            r15.setColor(r6, r6, r6, r6)
            org.fortheloss.framework.ColorPicker r0 = r7.mSegmentColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$23 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$23
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7.mSegmentColorPicker
            r1 = 32
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.ColorPicker r0 = r7.mSegmentColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r12)
            r33.row()
            java.lang.String r0 = "useGradientColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r0.fillX()
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mUseGradientColorButton = r0
            r1 = 33
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mUseGradientColorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$24 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$24
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mUseGradientColorButton
            r7.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$25 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$25
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r7._creationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r0 * r16
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r18 = r0.getIsLeftHandMode()
            r0 = r15
            r1 = r33
            r11 = 1065353216(0x3f800000, float:1.0)
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mGradientColorPicker = r15
            r6 = 1056964608(0x3f000000, float:0.5)
            r15.setColor(r6, r6, r6, r11)
            org.fortheloss.framework.ColorPicker r0 = r7.mGradientColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$26 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$26
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7.mGradientColorPicker
            r1 = 34
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.ColorPicker r0 = r7.mGradientColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r12)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mGradientPropertiesTable = r0
            r1 = 36
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mGradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mGradientPropertiesTableCellRef = r0
            r33.row()
            java.lang.String r0 = "reverseGradient"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            r7.mReverseGradientLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mGradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mReverseGradientButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$27 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$27
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mGradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mReverseGradientButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mGradientPropertiesTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._gradientModeTableSegments = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mGradientPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mGradientModeTableCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mGradientPropertiesTable
            r0.row()
            java.lang.String r0 = "horizontal"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r0)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r1)
            r1.fillX()
            java.lang.String r1 = "vertical"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7._gradientModeButton1 = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$28 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$28
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._gradientModeButton1
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r7._gradientModeButton2 = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$29 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$29
            r3.<init>(r7)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableSegments
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._gradientModeButton2
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r4 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r3]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._gradientModeButton1
            r5 = 0
            r4[r5] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._gradientModeButton2
            r5 = 1
            r4[r5] = r3
            r2.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._gradientModeTableCircles = r2
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            java.lang.String r0 = "radial"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleGradientModeButton1 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$30 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$30
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._circleGradientModeButton1
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleGradientModeButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$31 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$31
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._gradientModeTableCircles
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._circleGradientModeButton2
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._circleGradientModeButton3 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$32 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$32
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
            r3 = 1
            r1[r3] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._circleGradientModeButton3
            r4 = 2
            r1[r4] = r2
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7.mCircleOutlineColorTable = r0
            r1 = 35
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            r15 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r15)
            r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r15)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mCircleOutlineTableCellRef = r0
            r33.row()
            java.lang.String r0 = "useOutlineColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.mCircleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mUseCircleOutlineButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$33 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$33
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mUseCircleOutlineButton
            r0.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$34 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$34
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r7._creationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r18 = r0 * r16
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r20 = r0.getIsLeftHandMode()
            r0 = r5
            r1 = r33
            r4 = r35
            r15 = r5
            r5 = r18
            r12 = 1056964608(0x3f000000, float:0.5)
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mCircleOutlineColorPicker = r15
            r15.setColor(r12, r12, r12, r11)
            org.fortheloss.framework.ColorPicker r0 = r7.mCircleOutlineColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$35 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$35
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            org.fortheloss.framework.ColorPicker r1 = r7.mCircleOutlineColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mCircleOutlineColorPropertiesTable = r0
            r1 = 37
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mCircleOutlineColorPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mCircleOutlineColorPropertiesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorTable
            r0.row()
            java.lang.String r0 = "isHollow"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            r7.mCircleIsHollowLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7.mCircleOutlineColorPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mCircleIsHollowButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$36 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$36
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorPropertiesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mCircleIsHollowButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mCircleOutlineColorPropertiesTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 2
            r0.colspan(r1)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7.mThicknessTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7.mThicknessTableCellRef = r0
            r33.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r26 = r1.getContext()
            java.lang.String r1 = "segmentThickness"
            java.lang.String r27 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r28 = "32"
            r29 = 4
            r30 = 0
            r31 = 1176255488(0x461c3c00, float:9999.0)
            r32 = 0
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r7.mThicknessField = r0
            r1 = 40
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mThicknessField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$37 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$37
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mThicknessTable
            org.fortheloss.framework.LabelInputIncrementField r1 = r7.mThicknessField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mThicknessTable
            r0.row()
            java.lang.String r0 = "staticNew"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mStaticButton = r0
            r1 = 60
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mStaticButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$38 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$38
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7.mStaticButton
            r7.add(r0)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 2
            r0.colspan(r1)
            r33.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r2)
            r7.mSmartStretchContextMenu = r0
            java.lang.String r0 = "connectorSmartStretchInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r2 = r7.mSmartStretchContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            float r1 = r1 * r12
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7.mSmartStretchContextMenu
            r0.pack()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable
            r0.<init>(r9)
            r7.mSmartStretchTable = r0
            r1 = 44
            r7.registerWidget(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7.mSmartStretchTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 2
            r0.colspan(r1)
            r33.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getRiggerModeEnabled()
            if (r0 != 0) goto Lcb6
            java.lang.String r0 = "smartStretchTestButton"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeTestSmartStretchStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7.mTestSmartStretchButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$39 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$39
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7.mSmartStretchTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7.mTestSmartStretchButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 2
            r0.colspan(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7.mSmartStretchTable
            r0.row()
        Lcb6:
            java.lang.String r0 = "smartStretchNode"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r2 = r7.mSmartStretchTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.pad(r2)
            r3.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r2 = 0
            r1.uniform(r2, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r7.mSmartStretchTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r7.mSmartStretchTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7.mSmartStretchButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$40 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$40
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mSmartStretchButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            r2 = 16
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r3 = "?"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r3, r1)
            r7.mSmartStretchQuestionButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$41 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$41
            r3.<init>(r7)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mSmartStretchQuestionButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7.mSmartStretchQuestionButton
            float r1 = r1.getWidth()
            r3 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mSmartStretchButton
            float r1 = r1.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r1 = 8
            r0.align(r1)
            java.lang.String r0 = "stretchImpulseStop"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r7.mSmartStretchTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7.mDoNotSmartStretchButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$42 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$42
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7.mSmartStretchTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7.mDoNotSmartStretchButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 2
            r0.colspan(r1)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7.mPushTable = r0
            r1 = 64
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r4 = r1 * r3
            float r1 = r1 * r3
            r5 = 0
            r0.pad(r4, r5, r1, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r5)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r5)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$43 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$43
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushBackwardStyle()
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r7, r1, r4)
            r7.mPushBackButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$44 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$44
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            org.fortheloss.framework.RepeatingImageButton r1 = r7.mPushBackButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r0.align(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$45 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$45
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushForwardStyle()
            r0.<init>(r7, r1, r4)
            r7.mPushForwardButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$46 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$46
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            org.fortheloss.framework.RepeatingImageButton r1 = r7.mPushForwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToBackStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7.mSendToBackButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$47 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$47
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7.mSendToBackButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToFrontStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7.mSendToFrontButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$48 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$48
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7.mSendToFrontButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushTable
            org.fortheloss.framework.SizeWidget r1 = new org.fortheloss.framework.SizeWidget
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r5 = (float) r5
            r6 = 0
            r1.<init>(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 2
            r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7.mPushBranchTable = r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r1 * r3
            float r1 = r1 * r3
            r0.pad(r5, r6, r1, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r6)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r6)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$49 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$49
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushBackwardStyle()
            r0.<init>(r7, r1, r4)
            r7.mPushBackButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$50 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$50
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            org.fortheloss.framework.RepeatingImageButton r1 = r7.mPushBackButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r0.align(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$51 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$51
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushForwardStyle()
            r0.<init>(r7, r1, r4)
            r7.mPushForwardButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$52 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$52
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            org.fortheloss.framework.RepeatingImageButton r1 = r7.mPushForwardButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToBackStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7.mSendToBackButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$53 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$53
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7.mSendToBackButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToFrontStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7.mSendToFrontButton2 = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$54 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$54
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7.mSendToFrontButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mPushBranchTable
            org.fortheloss.framework.SizeWidget r1 = new org.fortheloss.framework.SizeWidget
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 2
            r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r1.getContext()
            org.fortheloss.framework.Assets r1 = r1.getAssets()
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            r4 = 1
            java.lang.Object r1 = r1.get(r3, r10, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = "g_label_segment"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r3)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r3.getContext()
            org.fortheloss.framework.Assets r3 = r3.getAssets()
            java.lang.String r5 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r3 = r3.get(r5, r10, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r4 = "g_label_branch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r3.findRegion(r4)
            r1.<init>(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable
            r3.<init>(r7)
            r7.mHorizontalPushTables = r3
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r7._creationToolsModuleRef
            float r4 = r4.getWidth()
            r3.initialize(r4, r8, r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r3 = r7.mHorizontalPushTables
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table[r4]
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r7.mPushTable
            r9 = 0
            r5[r9] = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r7.mPushBranchTable
            r10 = 1
            r5[r10] = r6
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r11 = "reorderSegment"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r6[r9] = r11
            java.lang.String r11 = "reorderBranch"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r6[r10] = r11
            com.badlogic.gdx.scenes.scene2d.ui.Widget[] r11 = new com.badlogic.gdx.scenes.scene2d.ui.Widget[r4]
            r11[r9] = r0
            r11[r10] = r1
            r3.setTables(r5, r6, r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r0 = r7.mHorizontalPushTables
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r0 = r7.mHorizontalPushTables
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 2
            r0.colspan(r1)
            r33.row()
            java.lang.String r0 = "deleteConnector"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeDeleteChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7.mDeleteConnectorButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$55 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$55
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mDeleteConnectorButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            r0.colspan(r1)
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 2
            r0.colspan(r1)
            r33.row()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r7._creationToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 68
            if (r0 != 0) goto L10d9
            java.lang.String r0 = "copySegment"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeCopyOneSegmentStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r3)
            r7.mCopySegmentButton = r0
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$56 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$56
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            r0.colspan(r1)
            r33.row()
            java.lang.String r0 = "copyBranch"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeCopyChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7.mCopySegmentAndChildrenButton = r0
            r1 = 69
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentAndChildrenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$57 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$57
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentAndChildrenButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            r0.colspan(r1)
            r33.row()
            goto L1120
        L10d9:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalCopyOneSegmentStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7.mCopySegmentButton = r0
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$58 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$58
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalCopyChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7.mCopySegmentAndChildrenButton = r0
            r1 = 69
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentAndChildrenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$59 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$59
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r7.mCopySegmentAndChildrenButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 8
            r0.align(r1)
            r33.row()
        L1120:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$60 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$60
            java.lang.String r1 = "pasteSegment"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextLongPressButtonLargePasteStyle()
            r0.<init>(r7, r1, r3)
            r7._pasteSegmentButton = r0
            r1 = 70
            r7.registerWidget(r0, r1)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r0 = r7._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r1 = 1
            r0.setWrap(r1)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r0 = r7._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            r4 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r4
            r4 = 0
            r0.pad(r4, r1, r4, r3)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r0 = r7._pasteSegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$61 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$61
            r1.<init>(r7)
            r0.addListener(r1)
            r33.row()
            org.fortheloss.sticknodes.ImageTextButtonLongPress r0 = r7._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            r0.colspan(r1)
            r33.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r1)
            r7._pasteContextMenu = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            r0.uniform(r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r33.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L11c0
            java.lang.String r0 = "pasteAngleInfoNew"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r7._pasteContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            float r1 = r1 * r12
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7._pasteContextMenu
            r0.row()
        L11c0:
            java.lang.String r0 = "pasteAngleLabel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r7._pasteContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r1 = 1128792064(0x43480000, float:200.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.minWidth(r2)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._pasteUseGlobalAngleButton = r0
            r1 = 1
            r0.setChecked(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7._pasteContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._pasteUseGlobalAngleButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            r0.align(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7._pasteContextMenu
            r0.pack()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r33.row()
            java.lang.String r0 = "modifyBranchButton"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModifyBranchButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7.mModifyBranchButton = r0
            r1 = 71
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7.mModifyBranchButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$62 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$62
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7.mModifyBranchButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            r0.colspan(r1)
            r33.row()
            java.lang.String r0 = "addConnector"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeConnectorAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7.mAddConnectorButton = r0
            r1 = 72
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7.mAddConnectorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$63 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$63
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7.mAddConnectorButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r7._connectorButtonsCellRef = r0
            r33.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._editConnectorTable = r0
            r1 = 73
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalConnectorAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r13, r0)
            r7._editConnectorButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$64 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$64
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editConnectorTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._editConnectorButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalDeleteStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7._deleteConnectorButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$65 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$65
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editConnectorTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r7._deleteConnectorButton
            r0.add(r1)
            java.lang.String r0 = "addPolyfill"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargePolyfillAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7.mAddPolyfillButton = r0
            r1 = 74
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7.mAddPolyfillButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$66 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$66
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7.mAddPolyfillButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r7._polyfillButtonsCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._editPolyfillTable = r0
            r1 = 75
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalPolyfillAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r13, r0)
            r7._editPolyfillButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$67 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$67
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editPolyfillTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._editPolyfillButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalDeleteStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7._deletePolyfillButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$68 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable$68
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._editPolyfillTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r7._deletePolyfillButton
            r0.add(r1)
            r33.pack()
            return
    }

    public boolean isPreserveVisualAngleChecked() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._pasteUseGlobalAngleButton
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r12 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r12.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 != 0) goto Lb
            return
        Lb:
            r1 = r0
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r12.mValueRadio
            int r3 = r1.getNodeMethod()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r12.mPercentRadio
            int r3 = r1.getNodeMethod()
            if (r3 != r5) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r12.mValueRadio
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L51
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r12.mValueField
            float r3 = r1.getNodeValue()
            boolean r1 = r1.getNodeReversed()
            r2.setValue(r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.CheckBoxInputIncrementField> r1 = r12.mNodeLocationFieldCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r12.mValueField
            if (r1 == r2) goto L6d
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.CheckBoxInputIncrementField> r1 = r12.mNodeLocationFieldCellRef
            r1.setActor(r2)
            goto L6d
        L51:
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r12.mPercentField
            float r3 = r1.getNodePercent()
            boolean r1 = r1.getNodeReversed()
            r2.setValue(r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.CheckBoxInputIncrementField> r1 = r12.mNodeLocationFieldCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r12.mPercentField
            if (r1 == r2) goto L6d
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.CheckBoxInputIncrementField> r1 = r12.mNodeLocationFieldCellRef
            r1.setActor(r2)
        L6d:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r12.mLimbTypeSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r12.mLimbTypeSelectBox
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r3, r3, r3, r3)
            org.fortheloss.framework.LabelInputIncrementField r1 = r12.mCurveRadiusField
            int r6 = r0.getSegmentCurve()
            float r6 = (float) r6
            r1.setValue(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mCirculizationButton
            boolean r6 = r0.getSegmentCurveCirculization()
            r1.setChecked(r6)
            org.fortheloss.framework.LabelInputIncrementField r1 = r12.mTrapezoidCurveRadiusField
            int r6 = r0.getSegmentCurve()
            float r6 = (float) r6
            r1.setValue(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mTrapezoidCirculizationButton
            boolean r6 = r0.getSegmentCurveCirculization()
            r1.setChecked(r6)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r12.mTrapezoidThickness1Field
            float r6 = r0.getTrapezoidThickness1()
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            boolean r7 = r0.getTrapezoidIsRounded1()
            r1.setValue(r6, r7)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r12.mTrapezoidThickness2Field
            float r6 = r0.getTrapezoidThickness2()
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            boolean r7 = r0.getTrapezoidIsRounded2()
            r1.setValue(r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mTrapezoidKeepRatioButton
            float r6 = r0.getTrapezoidRatio()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto Ld4
            r6 = 1
            goto Ld5
        Ld4:
            r6 = 0
        Ld5:
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mIsHalfArcButton
            boolean r6 = r0.isHalfArc()
            r1.setChecked(r6)
            short r1 = r0.getRightTriangleDirection()
            if (r1 == 0) goto Le9
            r6 = 1
            goto Lea
        Le9:
            r6 = 0
        Lea:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r12.mIsRightTriangleButton
            r7.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r12.mIsFlippedTiangleButton
            r8 = -1
            if (r1 != r8) goto Lf6
            r1 = 1
            goto Lf7
        Lf6:
            r1 = 0
        Lf7:
            r7.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mIsUpsideDownTriangleButton
            boolean r7 = r0.getTriangleUpsideDown()
            r1.setChecked(r7)
            if (r6 == 0) goto L115
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12.mIsFlippedTriangleLabel
            r1.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mIsFlippedTiangleButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mIsFlippedTiangleButton
            r1.setColor(r3, r3, r3, r3)
            goto L128
        L115:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12.mIsFlippedTriangleLabel
            r6 = 1056964608(0x3f000000, float:0.5)
            r1.setColor(r3, r3, r3, r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mIsFlippedTiangleButton
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mIsFlippedTiangleButton
            r1.setColor(r3, r3, r3, r6)
        L128:
            org.fortheloss.framework.LabelInputIncrementField r1 = r12.mPolygonField
            short r3 = r0.getNumPolygonVertices()
            float r3 = (float) r3
            r1.setValue(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r12.mLimbTypeSelectBox
            int r1 = r1.getSelectedIndex()
            int r3 = r0.getLimbType()
            r6 = 7
            r7 = 3
            r9 = 5
            r10 = 6
            r11 = 2
            if (r3 == 0) goto L15c
            if (r3 == r5) goto L15a
            if (r3 == r11) goto L158
            if (r3 == r7) goto L156
            if (r3 == r9) goto L154
            if (r3 == r10) goto L152
            if (r3 == r6) goto L150
            goto L15d
        L150:
            r8 = 6
            goto L15d
        L152:
            r8 = 5
            goto L15d
        L154:
            r8 = 3
            goto L15d
        L156:
            r8 = 4
            goto L15d
        L158:
            r8 = 2
            goto L15d
        L15a:
            r8 = 0
            goto L15d
        L15c:
            r8 = 1
        L15d:
            if (r1 == r8) goto L161
            r12.mIgnoreNextLimbTypeChangeEvent = r5
        L161:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r12.mLimbTypeSelectBox
            r1.setSelectedIndex(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r3 == 0) goto L1e1
            if (r3 != r5) goto L172
            goto L1e1
        L172:
            if (r3 == r11) goto L1cd
            if (r3 != r9) goto L177
            goto L1cd
        L177:
            if (r3 != r7) goto L18d
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mTriangleTable
            if (r1 == r6) goto L1f4
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            r1.clearActor()
            r12.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mTriangleTable
            r1.setActor(r6)
            goto L1f4
        L18d:
            if (r3 != r10) goto L1a3
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mTrapezoidTable
            if (r1 == r6) goto L1f4
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            r1.clearActor()
            r12.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mTrapezoidTable
            r1.setActor(r6)
            goto L1f4
        L1a3:
            if (r3 != r6) goto L1b9
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mPolygonTable
            if (r1 == r6) goto L1f4
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            r1.clearActor()
            r12.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mPolygonTable
            r1.setActor(r6)
            goto L1f4
        L1b9:
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r12.mLabelNoProperties
            if (r1 == r6) goto L1f4
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            r1.clearActor()
            r12.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r12.mLabelNoProperties
            r1.setActor(r6)
            goto L1f4
        L1cd:
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mCircleEllipseTable
            if (r1 == r6) goto L1f4
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            r1.clearActor()
            r12.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mCircleEllipseTable
            r1.setActor(r6)
            goto L1f4
        L1e1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mSegmentTable
            if (r1 == r6) goto L1f4
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            r1.clearActor()
            r12.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.ui.Widget> r1 = r12.mShapePropertiesCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mSegmentTable
            r1.setActor(r6)
        L1f4:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mUseSegmentColorButton
            boolean r6 = r0.isUsingSegmentColor()
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mUseGradientColorButton
            boolean r6 = r0.isUsingGradient()
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mReverseGradientButton
            boolean r6 = r0.isReversedGradient()
            r1.setChecked(r6)
            org.fortheloss.framework.LabelInputIncrementField r1 = r12.mThicknessField
            int r6 = r0.getThickness()
            float r6 = (float) r6
            r1.setValue(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mStaticButton
            boolean r6 = r0.isStatic()
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mSmartStretchButton
            boolean r6 = r0.isSmartStretch()
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mDoNotSmartStretchButton
            boolean r6 = r0.getDoNotApplySmartStretch()
            r1.setChecked(r6)
            org.fortheloss.framework.ColorPicker r1 = r12.mSegmentColorPicker
            com.badlogic.gdx.graphics.Color r6 = r0.getColor()
            r1.setColor(r6, r4)
            org.fortheloss.framework.ColorPicker r1 = r12.mSegmentColorPicker
            r1.disableWithAlpha(r4)
            boolean r1 = r0.isUsingSegmentColor()
            if (r1 == 0) goto L253
            org.fortheloss.framework.ColorPicker r1 = r12.mSegmentColorPicker
            r1.setTouchable(r2)
            org.fortheloss.framework.ColorPicker r1 = r12.mSegmentColorPicker
            r1.disableWithAlpha(r4)
            goto L25f
        L253:
            org.fortheloss.framework.ColorPicker r1 = r12.mSegmentColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r6)
            org.fortheloss.framework.ColorPicker r1 = r12.mSegmentColorPicker
            r1.disableWithAlpha(r5)
        L25f:
            org.fortheloss.framework.ColorPicker r1 = r12.mGradientColorPicker
            com.badlogic.gdx.graphics.Color r6 = r0.getGradientColor()
            r1.setColor(r6, r4)
            org.fortheloss.framework.ColorPicker r1 = r12.mGradientColorPicker
            r1.disableWithAlpha(r4)
            boolean r1 = r0.isUsingGradient()
            if (r1 == 0) goto L28d
            org.fortheloss.framework.ColorPicker r1 = r12.mGradientColorPicker
            r1.setTouchable(r2)
            org.fortheloss.framework.ColorPicker r1 = r12.mGradientColorPicker
            r1.disableWithAlpha(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 != 0) goto L29e
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mGradientPropertiesTable
            r1.setActor(r6)
            goto L29e
        L28d:
            org.fortheloss.framework.ColorPicker r1 = r12.mGradientColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r6)
            org.fortheloss.framework.ColorPicker r1 = r12.mGradientColorPicker
            r1.disableWithAlpha(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientPropertiesTableCellRef
            r1.clearActor()
        L29e:
            if (r3 == r5) goto L2ea
            if (r3 == 0) goto L2ea
            if (r3 != r10) goto L2a5
            goto L2ea
        L2a5:
            if (r3 == r11) goto L2b0
            if (r3 != r9) goto L2aa
            goto L2b0
        L2aa:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientModeTableCell
            r1.clearActor()
            goto L315
        L2b0:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._circleGradientModeButton1
            short r6 = r0.getGradientMode()
            if (r6 != 0) goto L2ba
            r6 = 1
            goto L2bb
        L2ba:
            r6 = 0
        L2bb:
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._circleGradientModeButton2
            short r6 = r0.getGradientMode()
            if (r6 != r5) goto L2c8
            r6 = 1
            goto L2c9
        L2c8:
            r6 = 0
        L2c9:
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._circleGradientModeButton3
            short r6 = r0.getGradientMode()
            if (r6 != r11) goto L2d6
            r6 = 1
            goto L2d7
        L2d6:
            r6 = 0
        L2d7:
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientModeTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12._gradientModeTableCircles
            if (r1 == r6) goto L315
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientModeTableCell
            r1.setActor(r6)
            goto L315
        L2ea:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._gradientModeButton1
            short r6 = r0.getGradientMode()
            if (r6 != 0) goto L2f4
            r6 = 1
            goto L2f5
        L2f4:
            r6 = 0
        L2f5:
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._gradientModeButton2
            short r6 = r0.getGradientMode()
            if (r6 != r5) goto L302
            r6 = 1
            goto L303
        L302:
            r6 = 0
        L303:
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientModeTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12._gradientModeTableSegments
            if (r1 == r6) goto L315
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mGradientModeTableCell
            r1.setActor(r6)
        L315:
            if (r3 != r11) goto L384
            boolean r1 = r0.isHalfArc()
            if (r1 != 0) goto L384
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 != 0) goto L335
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r12.mCircleOutlineColorTable
            r1.setActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.getTable()
            r1.invalidateHierarchy()
        L335:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mUseCircleOutlineButton
            boolean r6 = r0.isUsingCircleOutline()
            r1.setChecked(r6)
            org.fortheloss.framework.ColorPicker r1 = r12.mCircleOutlineColorPicker
            com.badlogic.gdx.graphics.Color r6 = r0.getCircleOutlineColor()
            r1.setColor(r6, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mCircleIsHollowButton
            boolean r6 = r0.getCircleIsHollow()
            r1.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12.mUseCircleOutlineButton
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L372
            org.fortheloss.framework.ColorPicker r1 = r12.mCircleOutlineColorPicker
            r1.setTouchable(r2)
            org.fortheloss.framework.ColorPicker r1 = r12.mCircleOutlineColorPicker
            r1.disableWithAlpha(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineColorPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 != 0) goto L39a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineColorPropertiesTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r12.mCircleOutlineColorPropertiesTable
            r1.setActor(r2)
            goto L39a
        L372:
            org.fortheloss.framework.ColorPicker r1 = r12.mCircleOutlineColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            org.fortheloss.framework.ColorPicker r1 = r12.mCircleOutlineColorPicker
            r1.disableWithAlpha(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineColorPropertiesTableCellRef
            r1.clearActor()
            goto L39a
        L384:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 == 0) goto L39a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineTableCellRef
            r1.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mCircleOutlineTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.getTable()
            r1.invalidateHierarchy()
        L39a:
            if (r3 != r10) goto L3b3
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mThicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 == 0) goto L3cb
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mThicknessTableCellRef
            r1.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mThicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.getTable()
            r1.invalidateHierarchy()
            goto L3cb
        L3b3:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mThicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 != 0) goto L3cb
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mThicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r12.mThicknessTable
            r1.setActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r12.mThicknessTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.getTable()
            r1.invalidateHierarchy()
        L3cb:
            boolean r1 = r0.isConnectorParent()
            if (r1 == 0) goto L3e1
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r12._connectorButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r12._editConnectorTable
            if (r1 == r2) goto L3f0
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r12._connectorButtonsCellRef
            r1.setActor(r2)
            goto L3f0
        L3e1:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r12._connectorButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r12.mAddConnectorButton
            if (r1 == r2) goto L3f0
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r12._connectorButtonsCellRef
            r1.setActor(r2)
        L3f0:
            boolean r0 = r0.isPolyfillAnchor()
            if (r0 == 0) goto L406
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r12._polyfillButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r12._editPolyfillTable
            if (r0 == r1) goto L415
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r12._polyfillButtonsCellRef
            r0.setActor(r1)
            goto L415
        L406:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r12._polyfillButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r12.mAddPolyfillButton
            if (r0 == r1) goto L415
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r12._polyfillButtonsCellRef
            r0.setActor(r1)
        L415:
            return
    }
}
