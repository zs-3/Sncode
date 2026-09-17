package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AutoCameraDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _autoMoveEndTextField;
    private int _currentFrameIndex;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _easeInButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _easeOutButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _endAutoMoveLabel;
    private org.fortheloss.framework.RepeatingTextButton _frameButtonMinus;
    private org.fortheloss.framework.RepeatingTextButton _frameButtonPlus;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _interpolationSelectBox;
    private int _limitFrame;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _removeAutoCameraButton;






    /* renamed from: -$$Nest$monEndFrameButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m366$$Nest$monEndFrameButtonClick(org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog r0, int r1) {
            r0.onEndFrameButtonClick(r1)
            return
    }

    /* renamed from: -$$Nest$monRemoveAutoCameraClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m367$$Nest$monRemoveAutoCameraClick(org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog r0, org.fortheloss.sticknodes.data.FrameData r1) {
            r0.onRemoveAutoCameraClick(r1)
            return
    }

    public AutoCameraDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._currentFrameIndex = r1
            r0._limitFrame = r1
            return
    }

    private int getIndexFromInterpolationID(short r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 1
            if (r2 != r0) goto L8
            return r0
        L8:
            r0 = 2
            if (r2 != r0) goto Lc
            return r0
        Lc:
            r0 = 3
            if (r2 != r0) goto L10
            return r0
        L10:
            r2 = 4
            return r2
    }

    private short getInterpolationIDFromIndex(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 1
            if (r2 != r0) goto L8
            return r0
        L8:
            r0 = 2
            if (r2 != r0) goto Lc
            return r0
        Lc:
            r0 = 3
            if (r2 != r0) goto L10
            return r0
        L10:
            r2 = 4
            return r2
    }

    private void onEndFrameButtonClick(int r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2._autoMoveEndTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L11
        Lf:
            r0 = 1
            goto L1f
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2._autoMoveEndTextField     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> Lf
        L1f:
            int r0 = r0 + r3
            if (r0 >= r1) goto L23
            goto L29
        L23:
            int r1 = r2._limitFrame
            if (r0 <= r1) goto L28
            goto L29
        L28:
            r1 = r0
        L29:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2._autoMoveEndTextField
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            return
    }

    private void onRemoveAutoCameraClick(org.fortheloss.sticknodes.data.FrameData r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r3 = r3.getAutoCameraBundle()
            r1 = 1
            r0.deleteAutoCameraFromFrame(r3, r1)
            r2.hideImmediately()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r10) {
            r9 = this;
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L103
            com.badlogic.gdx.scenes.scene2d.ui.TextField r10 = r9._autoMoveEndTextField
            java.lang.String r10 = r10.getText()
            java.lang.String r0 = ""
            boolean r10 = r10.equals(r0)
            java.lang.String r0 = "autoCameraError1"
            r1 = 2
            if (r10 == 0) goto L4a
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = r9._endAutoMoveLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r10.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = r9._endAutoMoveLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = r10.getStyle()
            com.badlogic.gdx.graphics.Color r10 = r10.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r10.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r10 = r9._autoMoveEndTextField
            int r0 = r9._currentFrameIndex
            int r0 = r0 + r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r10 = r9.getDialog()
            r10.pack()
            r9.doNotHideDialog()
            return
        L4a:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r10 = r9._autoMoveEndTextField     // Catch: java.lang.NumberFormatException -> Ld3
            java.lang.String r10 = r10.getText()     // Catch: java.lang.NumberFormatException -> Ld3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.NumberFormatException -> Ld3
            int r10 = r10.intValue()     // Catch: java.lang.NumberFormatException -> Ld3
            r0 = -1
            int r10 = r10 + r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r9._easeInButton
            boolean r5 = r2.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r9._easeOutButton
            boolean r6 = r2.isChecked()
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r2 = r9._interpolationSelectBox
            int r2 = r2.getSelectedIndex()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r9._framesModuleRef
            int r4 = r9._currentFrameIndex
            short r7 = r9.getInterpolationIDFromIndex(r2)
            r8 = 1
            r2 = r3
            r3 = r4
            r4 = r10
            int r2 = r2.addAutoCameraToFrame(r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "autoCameraErrorTitle"
            if (r2 != r0) goto L93
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r1 = "autoCameraError2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
            r9.doNotHideDialog()
            goto L103
        L93:
            r0 = -2
            if (r2 != r0) goto La9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r1 = "autoCameraError3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
            r9.doNotHideDialog()
            goto L103
        La9:
            r0 = -3
            if (r2 != r0) goto L103
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            int r4 = r9._currentFrameIndex
            r5 = 1
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            int r10 = r10 + r5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r5] = r10
            java.lang.String r10 = "autoCameraError4"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10, r1)
            r0.showErrorDialog(r2, r10)
            r9.doNotHideDialog()
            goto L103
        Ld3:
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = r9._endAutoMoveLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r10.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = r9._endAutoMoveLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = r10.getStyle()
            com.badlogic.gdx.graphics.Color r10 = r10.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r10.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r10 = r9._autoMoveEndTextField
            int r0 = r9._currentFrameIndex
            int r0 = r0 + r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r10 = r9.getDialog()
            r10.pack()
            r9.doNotHideDialog()
        L103:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._framesModuleRef = r0
            r1._removeAutoCameraButton = r0
            r1._endAutoMoveLabel = r0
            r1._autoMoveEndTextField = r0
            r1._frameButtonMinus = r0
            r1._frameButtonPlus = r0
            r1._easeInButton = r0
            r1._easeOutButton = r0
            r1._interpolationSelectBox = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.FrameData r11, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r12, com.badlogic.gdx.graphics.g2d.TextureAtlas r13) {
            r10 = this;
            java.lang.String r0 = "autoCameraTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            r2 = 0
            r1.uniform(r2)
            r10._framesModuleRef = r12
            int r1 = r12.getFrameIndex(r11)
            r10._currentFrameIndex = r1
            boolean r1 = r11.isAutoCameraOriginFrame()
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L9d
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "deleteAutoCameraInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r7)
            r1.<init>(r5, r6)
            r1.setWrap(r4)
            r1.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r10.addContent(r1)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r5)
            r1.colspan(r3)
            r10.addContentRow()
            java.lang.String r1 = "deleteAutoCamera"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r10.createImageTextButton(r1, r5)
            r10._removeAutoCameraButton = r1
            org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$1 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$1
            r5.<init>(r10, r11)
            r1.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r10._removeAutoCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r10.addContent(r1)
            r1.colspan(r3)
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r5 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r13.findRegion(r5)
            r1.<init>(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padBottom(r0)
            r13.fillX()
            r10.addContentRow()
        L9d:
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "autoCameraEndFrame"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r5)
            r13.<init>(r0, r1)
            r10._endAutoMoveLabel = r13
            r13.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r10._endAutoMoveLabel
            r13.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r10._endAutoMoveLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.addContent(r13)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.width(r0)
            r13.colspan(r3)
            r10.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13 = r10._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r13 = r13.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r13 = r13.frames
            int r13 = r13.size()
            r10._limitFrame = r13
            int r13 = r12.getTotalFrames()
            int r0 = r10._currentFrameIndex
            r1 = r11
        Le5:
            org.fortheloss.sticknodes.data.FrameData r1 = r1.getNextFrame()
            int r0 = r0 + r4
            boolean r5 = r1.isAutoCameraOriginFrame()
            if (r5 == 0) goto Lf5
            int r0 = r0 + r4
            r10._limitFrame = r0
            r13 = 1
            goto Lfa
        Lf5:
            int r5 = r13 + (-1)
            if (r0 < r5) goto Le5
            r13 = 0
        Lfa:
            if (r13 == 0) goto L153
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r10._limitFrame
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "nextAutoCamera"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "("
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r1.<init>(r5)
            r13.<init>(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r13.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
            r13.setWrap(r2)
            r13.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.addContent(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.colspan(r3)
            r10.addContentRow()
        L153:
            int r13 = r10._currentFrameIndex
            int r13 = r13 + r3
            java.lang.String r13 = java.lang.String.valueOf(r13)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            r1 = 4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = r10.createTextField(r13, r1, r0)
            r10._autoMoveEndTextField = r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.addContent(r13)
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r0 = (float) r0
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.size(r0, r5)
            r13.colspan(r3)
            r10.addContentRow()
            org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$2 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$2
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r5 = "-"
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            r13.<init>(r10, r5, r0, r6)
            r10._frameButtonMinus = r13
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r13.getLabel()
            r13.setWrap(r4)
            org.fortheloss.framework.RepeatingTextButton r13 = r10._frameButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r13.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.getCell(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1082130432(0x40800000, float:4.0)
            float r7 = r0 * r5
            float r0 = r0 * r5
            r8 = 0
            r13.pad(r8, r7, r8, r0)
            org.fortheloss.framework.RepeatingTextButton r13 = r10._frameButtonMinus
            org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$3 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$3
            r0.<init>(r10)
            r13.addListener(r0)
            org.fortheloss.framework.RepeatingTextButton r13 = r10._frameButtonMinus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.addContent(r13)
            r0 = 16
            r13.align(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$4 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$4
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r7 = "+"
            r13.<init>(r10, r7, r0, r6)
            r10._frameButtonPlus = r13
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r13.getLabel()
            r13.setWrap(r4)
            org.fortheloss.framework.RepeatingTextButton r13 = r10._frameButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r13.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.getCell(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r0 * r5
            float r0 = r0 * r5
            r13.pad(r8, r6, r8, r0)
            org.fortheloss.framework.RepeatingTextButton r13 = r10._frameButtonPlus
            org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$5 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog$5
            r0.<init>(r10)
            r13.addListener(r0)
            org.fortheloss.framework.RepeatingTextButton r13 = r10._frameButtonPlus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.addContent(r13)
            r0 = 8
            r13.align(r0)
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expand(r2, r2)
            r0.uniform(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.addContent(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r3)
            r0.fillX()
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Widget r0 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            java.lang.String r0 = "easeIn"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.add(r0)
            r0.fillX()
            java.lang.String r0 = "easeOut"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.add(r0)
            r0.fillX()
            r13.row()
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = r10.createSelectBox()
            r10._interpolationSelectBox = r0
            r5 = 5
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = "interpolationEase"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = " v1"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r5[r2] = r7
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = " v2"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5[r4] = r2
            java.lang.String r2 = "interpolationBounce"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r5[r3] = r2
            r2 = 3
            java.lang.String r6 = "interpolationElastic"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r5[r2] = r6
            java.lang.String r2 = "interpolationSwing"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r5[r1] = r2
            r0.setItems(r5)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r10._interpolationSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r1 = (float) r1
            r0.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r10._easeInButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.add(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1106247680(0x41f00000, float:30.0)
            float r5 = r1 * r2
            float r1 = r1 * r2
            r0.pad(r8, r5, r8, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r10._easeOutButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.add(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r0 * r2
            float r0 = r0 * r2
            r13.pad(r8, r1, r8, r0)
            boolean r13 = r11.isAutoCameraOriginFrame()
            if (r13 == 0) goto L327
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r11 = r11.getAutoCameraBundle()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = r10._autoMoveEndTextField
            org.fortheloss.sticknodes.data.FrameData r0 = r11.getFrame2()
            int r12 = r12.getFrameIndex(r0)
            int r12 = r12 + r4
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.setText(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r10._easeInButton
            boolean r13 = r11.isEaseIn()
            r12.setChecked(r13)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r10._easeOutButton
            boolean r13 = r11.isEaseOut()
            r12.setChecked(r13)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r12 = r10._interpolationSelectBox
            short r11 = r11.getInterpolationID()
            int r11 = r10.getIndexFromInterpolationID(r11)
            r12.setSelectedIndex(r11)
        L327:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r11 = r11.getSessionData()
            boolean r11 = r11.getNerdModeEnabled()
            if (r11 != 0) goto L380
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "whatIsAutoCamera"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r11.<init>(r12, r13)
            r11.setWrap(r4)
            r11.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r10.addContent(r11)
            int r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.width(r12)
            r11.colspan(r3)
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "autoCameraDesc"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r12, r13)
            r11.setWrap(r4)
            r11.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r10.addContent(r11)
            int r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.width(r12)
            r11.colspan(r3)
        L380:
            java.lang.String r11 = "okay"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = r10.createTextButton(r11)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.addButton(r11, r12)
            java.lang.String r11 = "cancel"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = r10.createTextButton(r11)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r10.addButton(r11, r12)
            return
    }
}
