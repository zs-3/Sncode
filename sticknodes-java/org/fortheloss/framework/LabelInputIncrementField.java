package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class LabelInputIncrementField extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    public static boolean BUTTONS_VISIBLE_INITIALLY;
    protected static final com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter FLOAT_FILTER = null;
    protected static final float[] INCREMENTS = null;
    protected static final com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter INT_FILTER = null;
    private boolean mAllowZeroDefault;
    protected com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mButtonsCell;
    private boolean mButtonsStayPermanent;
    protected com.badlogic.gdx.scenes.scene2d.ui.Table mButtonsTable;
    protected int mButtonsVisibleState;
    protected org.fortheloss.sticknodes.animationscreen.AnimationScreen mContextRef;
    private float mDefaultValue;
    protected org.fortheloss.framework.LabelInputIncrementField.FieldListener mIncrementFieldListenerRef;
    private int mIncrementType;
    private boolean mIsDegreesField;
    private boolean mIsExtremeHighFidelity;
    private boolean mIsFloat;
    private boolean mIsHighFidelity;
    protected com.badlogic.gdx.scenes.scene2d.ui.Label mLabel;
    private boolean mLoopAround;
    private float mMaxValue;
    private float mMinValue;
    protected org.fortheloss.framework.RepeatingTextButton mMinusButton;
    protected org.fortheloss.framework.RepeatingTextButton mPlusButton;
    protected com.badlogic.gdx.scenes.scene2d.ui.TextField mTextField;











    public static class FieldListener {
        public FieldListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onTextFieldChange(float r1, boolean r2) {
                r0 = this;
                return
        }

        public void onTextFieldTouchEvent() {
                r0 = this;
                return
        }
    }

    /* renamed from: -$$Nest$fgetmAllowZeroDefault, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m167$$Nest$fgetmAllowZeroDefault(org.fortheloss.framework.LabelInputIncrementField r0) {
            boolean r0 = r0.mAllowZeroDefault
            return r0
    }

    /* renamed from: -$$Nest$fgetmDefaultValue, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m168$$Nest$fgetmDefaultValue(org.fortheloss.framework.LabelInputIncrementField r0) {
            float r0 = r0.mDefaultValue
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsFloat, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m169$$Nest$fgetmIsFloat(org.fortheloss.framework.LabelInputIncrementField r0) {
            boolean r0 = r0.mIsFloat
            return r0
    }

    /* renamed from: -$$Nest$fgetmMaxValue, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m170$$Nest$fgetmMaxValue(org.fortheloss.framework.LabelInputIncrementField r0) {
            float r0 = r0.mMaxValue
            return r0
    }

    /* renamed from: -$$Nest$fgetmMinValue, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m171$$Nest$fgetmMinValue(org.fortheloss.framework.LabelInputIncrementField r0) {
            float r0 = r0.mMinValue
            return r0
    }

    /* renamed from: -$$Nest$monTextFieldChanged, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m172$$Nest$monTextFieldChanged(org.fortheloss.framework.LabelInputIncrementField r0, boolean r1) {
            r0.onTextFieldChanged(r1)
            return
    }

    /* renamed from: -$$Nest$monTextFieldEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m173$$Nest$monTextFieldEnter(org.fortheloss.framework.LabelInputIncrementField r0) {
            r0.onTextFieldEnter()
            return
    }

    static {
            r0 = 10
            float[] r0 = new float[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [1008981770, 1017370378, 1022739087, 1025758986, 1028443341, 1036831949, 1045220557, 1050253722, 1053609165, 1056964608} // fill-array
            org.fortheloss.framework.LabelInputIncrementField.INCREMENTS = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter
            r0.<init>()
            org.fortheloss.framework.LabelInputIncrementField.FLOAT_FILTER = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            org.fortheloss.framework.LabelInputIncrementField.INT_FILTER = r0
            r0 = 0
            org.fortheloss.framework.LabelInputIncrementField.BUTTONS_VISIBLE_INITIALLY = r0
            return
    }

    public LabelInputIncrementField(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, java.lang.String r5, java.lang.String r6, int r7, float r8, float r9, boolean r10) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mDefaultValue = r0
            r0 = 1
            r3.mIsFloat = r0
            r1 = 0
            r3.mLoopAround = r1
            r3.mButtonsVisibleState = r1
            r3.mIncrementType = r1
            r3.mIsDegreesField = r1
            r3.mIsHighFidelity = r1
            r3.mIsExtremeHighFidelity = r1
            r3.mButtonsStayPermanent = r1
            r3.mAllowZeroDefault = r0
            r3.mContextRef = r4
            r3.mMinValue = r8
            r3.mMaxValue = r9
            float r4 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L27
            r3.mDefaultValue = r4     // Catch: java.lang.NumberFormatException -> L27
            goto L29
        L27:
            r3.mDefaultValue = r8
        L29:
            r3.mIsFloat = r10
            float r4 = java.lang.Math.abs(r9)
            r8 = 1092616192(0x41200000, float:10.0)
            r2 = 2
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L38
            r0 = 0
            goto L44
        L38:
            float r4 = java.lang.Math.abs(r9)
            r8 = 1120403456(0x42c80000, float:100.0)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L43
            goto L44
        L43:
            r0 = 2
        L44:
            r3.mIncrementType = r0
            if (r10 == 0) goto L4b
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter r4 = org.fortheloss.framework.LabelInputIncrementField.FLOAT_FILTER
            goto L4d
        L4b:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter r4 = org.fortheloss.framework.LabelInputIncrementField.INT_FILTER
        L4d:
            r3.init(r5, r6, r7, r4)
            r3.setTransform(r1)
            boolean r4 = org.fortheloss.framework.LabelInputIncrementField.BUTTONS_VISIBLE_INITIALLY
            if (r4 == 0) goto L5a
            r3.setButtonsVisibility(r2)
        L5a:
            return
    }

    private void init(java.lang.String r4, java.lang.String r5, int r6, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter r7) {
            r3 = this;
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r3.pad(r0)
            r2 = 10
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.space(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r1, r2)
            r0.expandX()
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.createLabel(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r3.createTextField(r5, r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r3.createButtonsTable()
            r3.buildField(r4, r5, r6)
            return
    }

    private void onTextFieldChanged(boolean r3) {
            r2 = this;
            org.fortheloss.framework.LabelInputIncrementField$FieldListener r0 = r2.mIncrementFieldListenerRef
            if (r0 == 0) goto Lb
            float r1 = r2.getTextFieldValue()
            r0.onTextFieldChange(r1, r3)
        Lb:
            return
    }

    private void onTextFieldEnter() {
            r7 = this;
            float r0 = r7.getTextFieldValue()
            boolean r1 = r7.mIsFloat
            r2 = 1
            if (r1 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r7.mTextField
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r4[r5] = r6
            java.lang.String r5 = "%.2f"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r1.setText(r3)
            goto L2a
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r7.mTextField
            int r3 = (int) r0
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.setText(r3)
        L2a:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r7.mTextField
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1.setCursorPosition(r3)
            org.fortheloss.framework.LabelInputIncrementField$FieldListener r1 = r7.mIncrementFieldListenerRef
            if (r1 == 0) goto L39
            r1.onTextFieldChange(r0, r2)
        L39:
            return
    }

    public void allowZeroDefault(boolean r1) {
            r0 = this;
            r0.mAllowZeroDefault = r1
            return
    }

    protected void buildField(com.badlogic.gdx.scenes.scene2d.Actor r2, com.badlogic.gdx.scenes.scene2d.ui.TextField r3, com.badlogic.gdx.scenes.scene2d.ui.Table r4) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r2)
            r2.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r3 = (float) r3
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.size(r3, r0)
            r3 = 8
            r2.align(r3)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            r1.mButtonsCell = r2
            r3 = 0
            r2.setActor(r3)
            return
    }

    protected boolean buttonsAreVisible() {
            r1 = this;
            int r0 = r1.mButtonsVisibleState
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Table createButtonsTable() {
            r8 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r8.mButtonsTable = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r2 = 10
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r8.mButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r2)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r2, r3)
            r0.expandX()
            org.fortheloss.framework.LabelInputIncrementField$7 r0 = new org.fortheloss.framework.LabelInputIncrementField$7
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r4 = "-"
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r8, r4, r3, r5)
            r8.mMinusButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r8.mMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            org.fortheloss.framework.RepeatingTextButton r0 = r8.mMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1082130432(0x40800000, float:4.0)
            float r7 = r4 * r6
            float r4 = r4 * r6
            r0.pad(r1, r7, r1, r4)
            org.fortheloss.framework.RepeatingTextButton r0 = r8.mMinusButton
            org.fortheloss.framework.LabelInputIncrementField$8 r4 = new org.fortheloss.framework.LabelInputIncrementField$8
            r4.<init>(r8)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r8.mButtonsTable
            org.fortheloss.framework.RepeatingTextButton r4 = r8.mMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r4)
            r4 = 16
            r0.align(r4)
            org.fortheloss.framework.LabelInputIncrementField$9 r0 = new org.fortheloss.framework.LabelInputIncrementField$9
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r7 = "+"
            r0.<init>(r8, r7, r4, r5)
            r8.mPlusButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r8.mPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setTouchable(r3)
            org.fortheloss.framework.RepeatingTextButton r0 = r8.mPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r2 * r6
            float r2 = r2 * r6
            r0.pad(r1, r3, r1, r2)
            org.fortheloss.framework.RepeatingTextButton r0 = r8.mPlusButton
            org.fortheloss.framework.LabelInputIncrementField$10 r1 = new org.fortheloss.framework.LabelInputIncrementField$10
            r1.<init>(r8)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r8.mButtonsTable
            org.fortheloss.framework.RepeatingTextButton r1 = r8.mPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r8.mButtonsTable
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.Actor createLabel(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r3, r1)
            r2.mLabel = r0
            r3 = 1
            r0.setWrap(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2.mLabel
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.mLabel
            org.fortheloss.framework.LabelInputIncrementField$1 r0 = new org.fortheloss.framework.LabelInputIncrementField$1
            r0.<init>(r2)
            r3.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.mLabel
            return r3
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextField createTextField(java.lang.String r3, int r4, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter r5) {
            r2 = this;
            org.fortheloss.framework.LabelInputIncrementField$2 r0 = new org.fortheloss.framework.LabelInputIncrementField$2
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextFieldStyle()
            r0.<init>(r2, r3, r1)
            r2.mTextField = r0
            r0.setMaxLength(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            r3.setTextFieldFilter(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            org.fortheloss.framework.LabelInputIncrementField$3 r4 = new org.fortheloss.framework.LabelInputIncrementField$3
            r4.<init>(r2)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            org.fortheloss.framework.LabelInputIncrementField$4 r4 = new org.fortheloss.framework.LabelInputIncrementField$4
            r4.<init>(r2)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            org.fortheloss.framework.LabelInputIncrementField$5 r4 = new org.fortheloss.framework.LabelInputIncrementField$5
            r4.<init>(r2)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            org.fortheloss.framework.LabelInputIncrementField$6 r4 = new org.fortheloss.framework.LabelInputIncrementField$6
            r4.<init>(r2)
            r3.setTextFieldListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            r4 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.mTextField
            return r3
    }

    public void disable() {
            r2 = this;
            r0 = 0
            r2.setButtonsVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.setColor(r0, r0, r0, r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r0)
            return
    }

    public void dispose() {
            r1 = this;
            r1.clear()
            r0 = 0
            r1.mContextRef = r0
            r1.mIncrementFieldListenerRef = r0
            r1.mLabel = r0
            r1.mTextField = r0
            r1.mButtonsCell = r0
            r1.mButtonsTable = r0
            r1.mMinusButton = r0
            r1.mPlusButton = r0
            return
    }

    protected void doIncrement(float r8) {
            r7 = this;
            float r0 = r7.getTextFieldValue()
            boolean r1 = r7.mIsFloat
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1008981770(0x3c23d70a, float:0.01)
            if (r1 == 0) goto L4d
            boolean r1 = r7.mIsDegreesField
            if (r1 == 0) goto L14
            goto L51
        L14:
            float r1 = java.lang.Math.abs(r8)
            float[] r2 = org.fortheloss.framework.LabelInputIncrementField.INCREMENTS
            int r3 = r2.length
            r5 = 1
            int r3 = r3 - r5
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            int r3 = r7.mIncrementType
            if (r3 != r5) goto L26
            goto L2b
        L26:
            r6 = 2
            if (r3 != r6) goto L2b
            r5 = 10
        L2b:
            boolean r6 = r7.mIsExtremeHighFidelity
            if (r6 == 0) goto L36
            if (r3 == 0) goto L36
            float r3 = (float) r5
            float r3 = r3 * r4
        L34:
            int r5 = (int) r3
            goto L43
        L36:
            boolean r6 = r7.mIsHighFidelity
            if (r6 == 0) goto L43
            if (r3 == 0) goto L43
            float r3 = (float) r5
            r5 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 * r5
            goto L34
        L43:
            r1 = r2[r1]
            float r2 = (float) r5
            float r1 = r1 * r2
            float r2 = java.lang.Math.max(r1, r4)
            goto L71
        L4d:
            boolean r1 = r7.mIsDegreesField
            if (r1 == 0) goto L56
        L51:
            r2 = 1073741824(0x40000000, float:2.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L71
        L56:
            r1 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L5d
            goto L71
        L5d:
            r1 = 1140457472(0x43fa0000, float:500.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L66
            r2 = 1073741824(0x40000000, float:2.0)
            goto L71
        L66:
            r1 = 1148846080(0x447a0000, float:1000.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L6f
            r2 = 1084227584(0x40a00000, float:5.0)
            goto L71
        L6f:
            r2 = 1092616192(0x41200000, float:10.0)
        L71:
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L7a
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r8
        L7a:
            float r0 = r0 + r2
            r8 = 0
            r7.updateValue(r0, r4, r8)
            return
    }

    protected void doSimpleIncrement(int r10) {
            r9 = this;
            float r0 = r9.getTextFieldValue()
            boolean r1 = r9.mIsFloat
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1008981770(0x3c23d70a, float:0.01)
            if (r1 == 0) goto L5b
            boolean r1 = r9.mIsDegreesField
            if (r1 == 0) goto L1e
            goto L5b
        L1e:
            int r1 = r9.mIncrementType
            if (r1 != 0) goto L36
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 <= 0) goto L32
            boolean r1 = r9.mIsHighFidelity
            if (r1 == 0) goto L2b
            goto L32
        L2b:
            r2 = 1028443341(0x3d4ccccd, float:0.05)
            r8 = 1028443341(0x3d4ccccd, float:0.05)
            goto L5f
        L32:
            r2 = 1008981770(0x3c23d70a, float:0.01)
            goto L5f
        L36:
            if (r1 != r5) goto L46
            boolean r1 = r9.mIsExtremeHighFidelity
            if (r1 == 0) goto L3d
            goto L4a
        L3d:
            boolean r1 = r9.mIsHighFidelity
            if (r1 == 0) goto L42
            goto L4f
        L42:
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            goto L5f
        L46:
            boolean r1 = r9.mIsExtremeHighFidelity
            if (r1 == 0) goto L4b
        L4a:
            goto L32
        L4b:
            boolean r1 = r9.mIsHighFidelity
            if (r1 == 0) goto L56
        L4f:
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r8 = 1036831949(0x3dcccccd, float:0.1)
            goto L5f
        L56:
            r2 = 1065353216(0x3f800000, float:1.0)
            r8 = 1056964608(0x3f000000, float:0.5)
            goto L5f
        L5b:
            r2 = 1065353216(0x3f800000, float:1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
        L5f:
            float r10 = (float) r10
            float r2 = r2 * r10
            float r0 = r0 + r2
            r9.updateValue(r0, r8, r5)
            return
    }

    public void enable() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r1.setTouchable(r0)
            boolean r0 = org.fortheloss.framework.LabelInputIncrementField.BUTTONS_VISIBLE_INITIALLY
            if (r0 == 0) goto L12
            r0 = 2
            r1.setButtonsVisibility(r0)
        L12:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.TextField getTextField() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r1.mTextField
            return r0
    }

    protected float getTextFieldValue() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3.mTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            float r0 = r3.mDefaultValue
            goto L1e
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3.mTextField     // Catch: java.lang.NumberFormatException -> L1c
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L1c
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L1c
            goto L1e
        L1c:
            float r0 = r3.mDefaultValue
        L1e:
            boolean r1 = r3.mIsDegreesField
            if (r1 == 0) goto L2c
        L22:
            r1 = 0
            r2 = 1135869952(0x43b40000, float:360.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2b
            float r0 = r0 + r2
            goto L22
        L2b:
            float r0 = r0 % r2
        L2c:
            float r1 = r3.mMinValue
            float r2 = r3.mMaxValue
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
            return r0
    }

    protected void onLabelTap() {
            r2 = this;
            boolean r0 = r2.buttonsAreVisible()
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 2
        L9:
            r2.setButtonsVisibility(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            if (r0 == 0) goto L1b
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r2.mLabel
            r0.setKeyboardFocus(r1)
        L1b:
            return
    }

    protected void onTextFieldTap() {
            r2 = this;
            boolean r0 = r2.buttonsAreVisible()
            r0 = r0 ^ 1
            r2.setButtonsVisibility(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r2.mTextField
            r0.setKeyboardFocus(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2.mTextField
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.setCursorPosition(r1)
        L20:
            return
    }

    protected void setButtonsVisibility(int r5) {
            r4 = this;
            boolean r0 = org.fortheloss.framework.LabelInputIncrementField.BUTTONS_VISIBLE_INITIALLY
            r1 = 2
            if (r0 == 0) goto L6
            r5 = 2
        L6:
            boolean r0 = r4.mButtonsStayPermanent
            if (r0 != 0) goto L77
            int r0 = r4.mButtonsVisibleState
            if (r0 == r5) goto L77
            r2 = 1
            if (r0 != r1) goto L14
            if (r5 != r2) goto L14
            goto L77
        L14:
            r4.mButtonsVisibleState = r5
            boolean r5 = r4.buttonsAreVisible()
            r0 = 0
            if (r5 == 0) goto L72
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r4.mButtonsCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mButtonsTable
            if (r5 == r1) goto L77
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.Group r1 = r4.getParent()
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r4.getStage()
            if (r3 == 0) goto L4b
        L32:
            if (r1 == 0) goto L4b
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r4.getStage()
            com.badlogic.gdx.scenes.scene2d.Group r3 = r3.getRoot()
            if (r1 == r3) goto L4b
            boolean r3 = r1 instanceof com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            if (r3 == 0) goto L46
            r0 = r1
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = (com.badlogic.gdx.scenes.scene2d.ui.ScrollPane) r0
            goto L4b
        L46:
            com.badlogic.gdx.scenes.scene2d.Group r1 = r1.getParent()
            goto L32
        L4b:
            if (r0 == 0) goto L59
            float r1 = r0.getScrollPercentY()
            r3 = 1065185444(0x3f7d70a4, float:0.99)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L59
            goto L5a
        L59:
            r2 = 0
        L5a:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r4.mButtonsCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mButtonsTable
            r5.setActor(r1)
            if (r2 == 0) goto L77
            r0.invalidate()
            r0.validate()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.setScrollPercentY(r5)
            r0.updateVisualScroll()
            goto L77
        L72:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r4.mButtonsCell
            r5.setActor(r0)
        L77:
            return
    }

    public void setExtremeHighFidelity(boolean r1) {
            r0 = this;
            r0.mIsExtremeHighFidelity = r1
            return
    }

    public void setFieldListener(org.fortheloss.framework.LabelInputIncrementField.FieldListener r1) {
            r0 = this;
            r0.mIncrementFieldListenerRef = r1
            return
    }

    public void setHighFidelity(boolean r1) {
            r0 = this;
            r0.mIsHighFidelity = r1
            return
    }

    public void setIncrementButtonVisibilityPermanent(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 2
            r1.setButtonsVisibility(r0)
        L6:
            r1.mButtonsStayPermanent = r2
            return
    }

    public void setIncrementType(int r1) {
            r0 = this;
            r0.mIncrementType = r1
            return
    }

    public void setIsDegreesField(boolean r1) {
            r0 = this;
            r0.mIsDegreesField = r1
            return
    }

    public void setMaxValue(float r1) {
            r0 = this;
            r0.mMaxValue = r1
            return
    }

    public void setTextFieldFilter(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r1.mTextField
            r0.setTextFieldFilter(r2)
            return
    }

    public void setValue(float r5) {
            r4 = this;
            boolean r0 = r4.mIsDegreesField
            if (r0 == 0) goto L12
            boolean r0 = r4.mLoopAround
            if (r0 != 0) goto L12
        L8:
            r0 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L11
            float r5 = r5 + r1
            goto L8
        L11:
            float r5 = r5 % r1
        L12:
            float r0 = r4.mMinValue
            float r1 = r4.mMaxValue
            float r5 = com.badlogic.gdx.math.MathUtils.clamp(r5, r0, r1)
            boolean r0 = r4.mIsFloat
            if (r0 == 0) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mTextField
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r2[r3] = r5
            java.lang.String r5 = "%.2f"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.setText(r5)
            goto L40
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mTextField
            int r5 = (int) r5
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setText(r5)
        L40:
            return
    }

    protected void updateValue(float r5, float r6, boolean r7) {
            r4 = this;
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            float r5 = r5 * r6
            boolean r6 = r4.mLoopAround
            if (r6 == 0) goto L1d
            float r6 = r4.mMaxValue
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 <= 0) goto L15
            float r5 = r4.mMinValue
            goto L2b
        L15:
            float r0 = r4.mMinValue
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2b
            r5 = r6
            goto L2b
        L1d:
            boolean r6 = r4.mIsDegreesField
            if (r6 == 0) goto L2b
        L21:
            r6 = 0
            r0 = 1135869952(0x43b40000, float:360.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L2a
            float r5 = r5 + r0
            goto L21
        L2a:
            float r5 = r5 % r0
        L2b:
            float r6 = r4.mMinValue
            float r0 = r4.mMaxValue
            float r5 = com.badlogic.gdx.math.MathUtils.clamp(r5, r6, r0)
            boolean r6 = r4.mIsFloat
            if (r6 == 0) goto L4f
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r4.mTextField
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r5)
            r1[r2] = r3
            java.lang.String r2 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r6.setText(r0)
            goto L59
        L4f:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r4.mTextField
            int r0 = (int) r5
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.setText(r0)
        L59:
            org.fortheloss.framework.LabelInputIncrementField$FieldListener r6 = r4.mIncrementFieldListenerRef
            if (r6 == 0) goto L60
            r6.onTextFieldChange(r5, r7)
        L60:
            return
    }
}
