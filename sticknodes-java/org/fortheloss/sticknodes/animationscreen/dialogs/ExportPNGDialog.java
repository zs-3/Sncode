package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ExportPNGDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _aaButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _aaButton2;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _animationStatsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _betterBlurButton;
    private java.lang.String _blankTitleText;
    private java.lang.String _defaultTitleText;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _endFrameTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _exportButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _exportWidthHeightLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _heightTextField;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _qualitySlider;
    private java.lang.String _startEndFramesWrong;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _startFrameTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _titleTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _transparentBGButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _widthTextField;













    /* renamed from: -$$Nest$fget_aaButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m465$$Nest$fget_aaButton(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._aaButton
            return r0
    }

    /* renamed from: -$$Nest$fget_aaButton2, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m466$$Nest$fget_aaButton2(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._aaButton2
            return r0
    }

    /* renamed from: -$$Nest$fget_heightTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m467$$Nest$fget_heightTextField(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._heightTextField
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m468$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_qualitySlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m469$$Nest$fget_qualitySlider(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._qualitySlider
            return r0
    }

    /* renamed from: -$$Nest$fget_widthTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m470$$Nest$fget_widthTextField(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._widthTextField
            return r0
    }

    /* renamed from: -$$Nest$mcheckHeightForWarning, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m471$$Nest$mcheckHeightForWarning(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            r0.checkHeightForWarning()
            return
    }

    /* renamed from: -$$Nest$msliderSetWidthHeight, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m472$$Nest$msliderSetWidthHeight(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0, int r1) {
            r0.sliderSetWidthHeight(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateAnimationStatsLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m473$$Nest$mupdateAnimationStatsLabel(org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0) {
            r0.updateAnimationStatsLabel()
            return
    }

    public ExportPNGDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3) {
            r0 = this;
            r0.<init>(r1)
            r0._animateToolsModuleRef = r2
            r0._projectDataRef = r3
            return
    }

    private void checkHeightForWarning() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3._heightTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3._heightTextField     // Catch: java.lang.NumberFormatException -> L1d
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L1d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1d
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r3._exportWidthHeightLabel
            if (r1 == 0) goto L45
            r2 = 720(0x2d0, float:1.009E-42)
            if (r0 <= r2) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
            goto L45
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
        L45:
            return
    }

    private void sliderSetWidthHeight(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L12
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "640"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "360"
            r2.setText(r0)
            goto L56
        L12:
            r0 = 2
            if (r2 != r0) goto L24
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "960"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "540"
            r2.setText(r0)
            goto L56
        L24:
            r0 = 3
            if (r2 != r0) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "1280"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "720"
            r2.setText(r0)
            goto L56
        L36:
            r0 = 4
            if (r2 != r0) goto L48
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "1920"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "1080"
            r2.setText(r0)
            goto L56
        L48:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "3840"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "2160"
            r2.setText(r0)
        L56:
            return
    }

    private void updateAnimationStatsLabel() {
            r4 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            r0.size()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._startFrameTextField     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L16
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L16
            goto L17
        L16:
            r0 = 1
        L17:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r4._endFrameTextField     // Catch: java.lang.NumberFormatException -> L26
            java.lang.String r1 = r1.getText()     // Catch: java.lang.NumberFormatException -> L26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L26
            int r1 = r1.intValue()     // Catch: java.lang.NumberFormatException -> L26
            goto L2e
        L26:
            org.fortheloss.sticknodes.data.ProjectData r1 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
        L2e:
            java.lang.String r2 = "pngExportImages"
            if (r0 > r1) goto L5b
            org.fortheloss.sticknodes.data.ProjectData r3 = r4._projectDataRef
            int r0 = r3.getTotalFrameCount(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r4._exportButton
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " ("
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.setText(r0)
            goto L64
        L5b:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._exportButton
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2)
            r0.setText(r1)
        L64:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r13) {
            r12 = this;
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lf0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = r12._titleTextField
            java.lang.String r13 = r13.getText()
            java.lang.String r0 = ""
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L35
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = r13.getStyle()
            com.badlogic.gdx.graphics.Color r13 = r13.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r13.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12._titleLabel
            java.lang.String r0 = r12._blankTitleText
            r13.setText(r0)
            r12.doNotHideDialog()
            r12.scrollToTop()
            return
        L35:
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r12._startFrameTextField     // Catch: java.lang.NumberFormatException -> L46
            java.lang.String r1 = r1.getText()     // Catch: java.lang.NumberFormatException -> L46
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L46
            int r1 = r1.intValue()     // Catch: java.lang.NumberFormatException -> L46
            r6 = r1
            goto L47
        L46:
            r6 = 1
        L47:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r12._endFrameTextField     // Catch: java.lang.NumberFormatException -> L56
            java.lang.String r1 = r1.getText()     // Catch: java.lang.NumberFormatException -> L56
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L56
            int r1 = r1.intValue()     // Catch: java.lang.NumberFormatException -> L56
            goto L5e
        L56:
            org.fortheloss.sticknodes.data.ProjectData r1 = r12._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r1 = r1.size()
        L5e:
            r7 = r1
            if (r6 <= r7) goto L80
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = r13.getStyle()
            com.badlogic.gdx.graphics.Color r13 = r13.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r13.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12._titleLabel
            java.lang.String r0 = r12._startEndFramesWrong
            r13.setText(r0)
            r12.doNotHideDialog()
            r12.scrollToTop()
            return
        L80:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r12._titleTextField
            java.lang.String r3 = r1.getText()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._betterBlurButton
            boolean r10 = r1.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._aaButton
            boolean r1 = r1.isChecked()
            r11 = 0
            if (r1 == 0) goto L97
            r9 = 1
            goto La3
        L97:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r12._aaButton2
            boolean r13 = r13.isChecked()
            if (r13 == 0) goto La2
            r13 = 2
            r9 = 2
            goto La3
        La2:
            r9 = 0
        La3:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r12._transparentBGButton
            boolean r8 = r13.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = r12._widthTextField
            java.lang.String r13 = r13.getText()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r12._heightTextField
            java.lang.String r1 = r1.getText()
            boolean r2 = r13.equals(r0)
            r4 = 72
            r5 = 128(0x80, float:1.794E-43)
            if (r2 != 0) goto Lc5
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lcd
        Lc5:
            java.lang.String r13 = java.lang.Integer.toString(r5)
            java.lang.String r1 = java.lang.Integer.toString(r4)
        Lcd:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r12._animationScreenRef
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            int r13 = r13.intValue()
            int r13 = java.lang.Math.max(r13, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            int r5 = java.lang.Math.max(r0, r4)
            r4 = r13
            r2.beginPNGExport(r3, r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.Input r13 = com.badlogic.gdx.Gdx.input
            r13.setOnscreenKeyboardVisible(r11)
        Lf0:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animateToolsModuleRef = r0
            r1._projectDataRef = r0
            r1._titleLabel = r0
            r1._titleTextField = r0
            r1._widthTextField = r0
            r1._heightTextField = r0
            r1._startFrameTextField = r0
            r1._endFrameTextField = r0
            r1._betterBlurButton = r0
            r1._aaButton = r0
            r1._aaButton2 = r0
            r1._transparentBGButton = r0
            r1._animationStatsLabel = r0
            r1._exportButton = r0
            r1._exportWidthHeightLabel = r0
            r1._qualitySlider = r0
            r1._defaultTitleText = r0
            r1._blankTitleText = r0
            r1._startEndFramesWrong = r0
            super.dispose()
            return
    }

    public void initialize() {
            r14 = this;
            java.lang.String r0 = "pngExportTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            java.lang.String r0 = "validName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r14._defaultTitleText = r0
            java.lang.String r0 = "exportEmptyName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r14._blankTitleText = r0
            java.lang.String r0 = "startEndFramesWrong"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r14._startEndFramesWrong = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L57
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "pngExportInfo1"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r4)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r0.width(r3)
            r14.addContentRow()
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = r14._defaultTitleText
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r0.<init>(r3, r4)
            r14._titleLabel = r0
            r0.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r14._titleLabel
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r14._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r0.width(r3)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "imageName"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ":"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            r0.colspan(r1)
            r14.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            java.lang.String r3 = ""
            r4 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14.createTextField(r3, r4, r0)
            r14._titleTextField = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$1
            r3.<init>(r14)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._titleTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r3)
            r0.colspan(r1)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "pngExportInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r5)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r0.width(r3)
            r14.addContentRow()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L14b
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "exportWidthHeight"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r6)
            r0.<init>(r3, r5)
            r14._exportWidthHeightLabel = r0
            r0.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r14._exportWidthHeightLabel
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r14._exportWidthHeightLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r0.width(r3)
            r14.addContentRow()
        L14b:
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            if (r0 == 0) goto L18d
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "verticalVideoNote"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r6)
            r0.<init>(r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            r3.set(r5)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r0.width(r3)
            r14.addContentRow()
        L18d:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r3 = 0
            r0.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.space(r3)
            r5.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r14.addContent(r0)
            r5.colspan(r1)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "sd"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r6, r7)
            r5.setWrap(r2)
            r5.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r7 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r7
            r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1084227584(0x40a00000, float:5.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r14._qualitySlider = r5
            r6 = 1077936128(0x40400000, float:3.0)
            r5.setValue(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r14._qualitySlider
            org.fortheloss.framework.CustomStopListener r6 = new org.fortheloss.framework.CustomStopListener
            r6.<init>()
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r14._qualitySlider
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$2 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$2
            r6.<init>(r14)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r14._qualitySlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r8 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r8
            r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "hd"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r6, r9)
            r5.setWrap(r2)
            r5.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            float r5 = r5 * r7
            r0.width(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "width"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r5, r6)
            r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "height"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r5, r6)
            r14.addContent(r0)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            java.lang.String r5 = "1280"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14.createTextField(r5, r4, r0)
            r14._widthTextField = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$3 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$3
            r5.<init>(r14)
            r0.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._widthTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$4 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$4
            r5.<init>(r14)
            r0.setTextFieldListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._widthTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r5 = r5 / 4
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            r0.height(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            java.lang.String r5 = "720"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14.createTextField(r5, r4, r0)
            r14._heightTextField = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$5 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$5
            r5.<init>(r14)
            r0.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._heightTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$6 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$6
            r5.<init>(r14)
            r0.setTextFieldListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._heightTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r5 = r5 / 4
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            r0.height(r5)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "startFrame"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r5, r6)
            r14.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "endFrame"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r5, r6)
            r14.addContent(r0)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            java.lang.String r5 = "1"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14.createTextField(r5, r4, r0)
            r14._startFrameTextField = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$7 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$7
            r5.<init>(r14)
            r0.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._startFrameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$8 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$8
            r5.<init>(r14)
            r0.setTextFieldListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._startFrameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r5 = r5 / 4
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            r0.height(r5)
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r5 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r5.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14.createTextField(r0, r4, r5)
            r14._endFrameTextField = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$9 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$9
            r4.<init>(r14)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._endFrameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$10 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$10
            r4.<init>(r14)
            r0.setTextFieldListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r14._endFrameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r14.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r4 = r4 / 4
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r0.height(r4)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "checkboxAA1"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r5)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            r14._aaButton = r4
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$11 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$11
            r5.<init>(r14)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "checkboxAA2"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r6)
            r4.setWrap(r2)
            r4.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r5)
            r14._aaButton2 = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$12 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog$12
            r6.<init>(r14)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "checkboxTransparency"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r6, r7)
            r5.setWrap(r2)
            r5.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            r14._transparentBGButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "checkboxBetterBlur"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r7, r9)
            r6.setWrap(r2)
            r6.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            r14._betterBlurButton = r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r7.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r7.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r9.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.align(r2)
            r2.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r14.addContent(r7)
            r2.colspan(r1)
            r14.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r2 = r2 / r1
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            r2 = 16
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r14._aaButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r3 = 8
            r0.align(r3)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r4 = r4 / r1
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r14._aaButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r3)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r5)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r4 = r4 / r1
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r14._transparentBGButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r3)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r6)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r4 = r4 / r1
            float r1 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r14._betterBlurButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r3)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L4b6
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setColor(r0, r0, r0, r8)
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r6.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r14._betterBlurButton
            r2.setColor(r0, r0, r0, r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r14._betterBlurButton
            r0.setTouchable(r1)
        L4b6:
            java.lang.String r0 = "pngExportImages"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r14.createTextButton(r0)
            r14._exportButton = r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r14.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r14.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r14.addButton(r0, r1)
            r14.updateAnimationStatsLabel()
            return
    }
}
