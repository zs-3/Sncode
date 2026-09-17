package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class TraceFrameDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule _creationBasedModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _frameTextField;
    private java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> _framesRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _incrementButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _minusButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _plusButton;
    private boolean _showAdvanced;





    /* renamed from: -$$Nest$monFrameDirectionClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m659$$Nest$monFrameDirectionClick(org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r0, int r1) {
            r0.onFrameDirectionClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetFrameEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m660$$Nest$monSetFrameEnter(org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r0, boolean r1) {
            r0.onSetFrameEnter(r1)
            return
    }

    public TraceFrameDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0._creationBasedModuleRef = r2
            r0._showAdvanced = r3
            return
    }

    private void onFrameDirectionClick(int r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3._frameTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L11
        Lf:
            r0 = 1
            goto L1f
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3._frameTextField     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> Lf
        L1f:
            int r0 = r0 + r4
            if (r0 >= r1) goto L23
            goto L33
        L23:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r3._framesRef
            int r4 = r4.size()
            if (r0 <= r4) goto L32
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r3._framesRef
            int r1 = r4.size()
            goto L33
        L32:
            r1 = r0
        L33:
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._incrementButton
            if (r0 == 0) goto L3c
            boolean r4 = r0.isChecked()
        L3c:
            org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule r0 = r3._creationBasedModuleRef
            int r2 = r1 + (-1)
            r0.setFrameIndexToTrace(r2, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._frameTextField
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r4.setText(r0)
            return
    }

    private void onSetFrameEnter(boolean r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._frameTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L11
        Lf:
            r0 = 1
            goto L1f
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._frameTextField     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> Lf
        L1f:
            if (r0 >= r1) goto L22
            goto L32
        L22:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r4._framesRef
            int r1 = r1.size()
            if (r0 <= r1) goto L31
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r4._framesRef
            int r1 = r0.size()
            goto L32
        L31:
            r1 = r0
        L32:
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r4._incrementButton
            if (r2 == 0) goto L3b
            boolean r0 = r2.isChecked()
        L3b:
            org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule r2 = r4._creationBasedModuleRef
            int r3 = r1 + (-1)
            r2.setFrameIndexToTrace(r3, r0)
            if (r5 == 0) goto L4d
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._frameTextField
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r5.setText(r0)
        L4d:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto Le
            org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule r4 = r3._creationBasedModuleRef
            r4.clearBackgroundImage()
            goto L4e
        Le:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._frameTextField
            java.lang.String r4 = r4.getText()
            java.lang.String r0 = ""
            boolean r4 = r4.equals(r0)
            r0 = 1
            if (r4 == 0) goto L1f
        L1d:
            r4 = 1
            goto L2d
        L1f:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._frameTextField     // Catch: java.lang.NumberFormatException -> L1d
            java.lang.String r4 = r4.getText()     // Catch: java.lang.NumberFormatException -> L1d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L1d
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L1d
        L2d:
            if (r4 >= r0) goto L31
            r4 = 1
            goto L3f
        L31:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3._framesRef
            int r1 = r1.size()
            if (r4 <= r1) goto L3f
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r3._framesRef
            int r4 = r4.size()
        L3f:
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r3._incrementButton
            if (r2 == 0) goto L48
            boolean r1 = r2.isChecked()
        L48:
            org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule r2 = r3._creationBasedModuleRef
            int r4 = r4 - r0
            r2.setFrameIndexToTrace(r4, r1)
        L4e:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._creationBasedModuleRef = r0
            r1._framesRef = r0
            r1._frameTextField = r0
            r1._minusButton = r0
            r1._plusButton = r0
            r1._incrementButton = r0
            super.dispose()
            return
    }

    public void initialize(java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6, int r7) {
            r5 = this;
            java.lang.String r0 = "traceFrameTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r5._framesRef = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "traceFrameInfo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r6, r2)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r0)
            r0 = 2
            r6.colspan(r0)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r6 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r6.<init>()
            java.lang.String r2 = ""
            r4 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.createTextField(r2, r4, r6)
            r5._frameTextField = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$1
            r2.<init>(r5)
            r6.setTextFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5._frameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$2 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$2
            r2.<init>(r5)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5._frameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r2 = r2 / 4
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.height(r2)
            r6.colspan(r0)
            r5.addContentRow()
            java.lang.String r6 = "<"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            r5._minusButton = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$3 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$3
            r2.<init>(r5)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5._minusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            r2 = 16
            r6.align(r2)
            java.lang.String r6 = ">"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            r5._plusButton = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$4 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog$4
            r2.<init>(r5)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5._plusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            r2 = 8
            r6.align(r2)
            boolean r6 = r5._showAdvanced
            if (r6 == 0) goto L100
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r5.addContent(r6)
            r2.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "incrementTracedFrame"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.add(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r2 = (float) r2
            r4 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r4
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r5._incrementButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r0)
            r6.align(r1)
        L100:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5._frameTextField
            int r7 = r7 + r1
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.setText(r7)
            java.lang.String r6 = "traceThis"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r5.addButton(r6, r7)
            java.lang.String r6 = "cancel"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.addButton(r6, r7)
            return
    }
}
