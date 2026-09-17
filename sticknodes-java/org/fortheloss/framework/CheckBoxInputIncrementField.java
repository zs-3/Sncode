package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class CheckBoxInputIncrementField extends org.fortheloss.framework.LabelInputIncrementField {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mCheckBox;
    private boolean mCheckboxControlsIsNormal;
    private boolean mCheckboxControlsTextfield;



    public static class CheckBoxFieldListener extends org.fortheloss.framework.LabelInputIncrementField.FieldListener {
        public CheckBoxFieldListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCheckBoxClick(boolean r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: -$$Nest$fgetmCheckBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m142$$Nest$fgetmCheckBox(org.fortheloss.framework.CheckBoxInputIncrementField r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mCheckBox
            return r0
    }

    /* renamed from: -$$Nest$fgetmCheckboxControlsIsNormal, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m143$$Nest$fgetmCheckboxControlsIsNormal(org.fortheloss.framework.CheckBoxInputIncrementField r0) {
            boolean r0 = r0.mCheckboxControlsIsNormal
            return r0
    }

    /* renamed from: -$$Nest$fgetmCheckboxControlsTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m144$$Nest$fgetmCheckboxControlsTextfield(org.fortheloss.framework.CheckBoxInputIncrementField r0) {
            boolean r0 = r0.mCheckboxControlsTextfield
            return r0
    }

    /* renamed from: -$$Nest$mupdateTouchable, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m145$$Nest$mupdateTouchable(org.fortheloss.framework.CheckBoxInputIncrementField r0) {
            r0.updateTouchable()
            return
    }

    public CheckBoxInputIncrementField(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, java.lang.String r2, java.lang.String r3, int r4, float r5, float r6, boolean r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            r0.mCheckboxControlsTextfield = r1
            r0.mCheckboxControlsIsNormal = r1
            r0.updateTouchable()
            return
    }

    private boolean getIsFieldActivated() {
            r2 = this;
            boolean r0 = r2.mCheckboxControlsTextfield
            if (r0 == 0) goto L11
            boolean r0 = r2.mCheckboxControlsIsNormal
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2.mCheckBox
            boolean r1 = r1.isChecked()
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    private void updateTouchable() {
            r4 = this;
            boolean r0 = r4.getIsFieldActivated()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L29
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mTextField
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mTextField
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mButtonsTable
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mButtonsTable
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r1)
            boolean r0 = org.fortheloss.framework.LabelInputIncrementField.BUTTONS_VISIBLE_INITIALLY
            if (r0 == 0) goto L45
            r0 = 2
            r4.setButtonsVisibility(r0)
            goto L45
        L29:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mTextField
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mTextField
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mButtonsTable
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mButtonsTable
            r0.setTouchable(r3)
            r0 = 0
            r4.setButtonsVisibility(r0)
        L45:
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    protected void buildField(com.badlogic.gdx.scenes.scene2d.Actor r4, com.badlogic.gdx.scenes.scene2d.ui.TextField r5, com.badlogic.gdx.scenes.scene2d.ui.Table r6) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            java.lang.String r2 = ""
            r0.<init>(r2, r1)
            r3.mCheckBox = r0
            org.fortheloss.framework.CheckBoxInputIncrementField$1 r1 = new org.fortheloss.framework.CheckBoxInputIncrementField$1
            r1.<init>(r3)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3.mCheckBox
            org.fortheloss.framework.CheckBoxInputIncrementField$2 r1 = new org.fortheloss.framework.CheckBoxInputIncrementField$2
            r1.<init>(r3)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3.mCheckBox
            r1 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fill()
            r0 = 2
            r4.colspan(r0)
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r3.mCheckBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r4.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r5 = (float) r5
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.size(r5, r1)
            r5 = 8
            r4.align(r5)
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r0)
            r3.mButtonsCell = r4
            r5 = 0
            r4.setActor(r5)
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mCheckBox = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    protected void onLabelTap() {
            r1 = this;
            boolean r0 = r1.getIsFieldActivated()
            if (r0 == 0) goto L9
            super.onLabelTap()
        L9:
            return
    }

    public void setCheckboxControlsTextfield(boolean r1) {
            r0 = this;
            r0.mCheckboxControlsTextfield = r1
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    public void setFieldListener(org.fortheloss.framework.LabelInputIncrementField.FieldListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.fortheloss.framework.CheckBoxInputIncrementField.CheckBoxFieldListener
            if (r0 == 0) goto L8
            super.setFieldListener(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener must be an instance of CheckBoxFieldListener"
            r2.<init>(r0)
            throw r2
    }

    public void setValue(float r1, boolean r2) {
            r0 = this;
            super.setValue(r1)
            r0.setValue(r2)
            return
    }

    public void setValue(boolean r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1.mCheckBox
            r0.setChecked(r2)
            r1.updateTouchable()
            return
    }
}
