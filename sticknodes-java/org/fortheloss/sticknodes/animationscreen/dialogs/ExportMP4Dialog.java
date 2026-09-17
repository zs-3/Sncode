package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ExportMP4Dialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _aaButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _aaButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _aaLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _aaLabel2;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _animationStatsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _betterBlurButton;
    private java.lang.String _blankTitleText;
    private java.lang.String _defaultTitleText;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _endFrameTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _exportWidthHeightLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _fixButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _heightTextField;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _qualitySlider;
    private java.lang.String _startEndFramesWrong;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _startFrameTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _titleTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _widthTextField;













    /* renamed from: -$$Nest$fget_aaButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m456$$Nest$fget_aaButton(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._aaButton
            return r0
    }

    /* renamed from: -$$Nest$fget_aaButton2, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m457$$Nest$fget_aaButton2(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._aaButton2
            return r0
    }

    /* renamed from: -$$Nest$fget_heightTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m458$$Nest$fget_heightTextField(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._heightTextField
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m459$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_qualitySlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m460$$Nest$fget_qualitySlider(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._qualitySlider
            return r0
    }

    /* renamed from: -$$Nest$fget_widthTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m461$$Nest$fget_widthTextField(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._widthTextField
            return r0
    }

    /* renamed from: -$$Nest$mcheckHeightForWarning, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m462$$Nest$mcheckHeightForWarning(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            r0.checkHeightForWarning()
            return
    }

    /* renamed from: -$$Nest$msliderSetWidthHeight, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m463$$Nest$msliderSetWidthHeight(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0, int r1) {
            r0.sliderSetWidthHeight(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateAnimationStatsLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m464$$Nest$mupdateAnimationStatsLabel(org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0) {
            r0.updateAnimationStatsLabel()
            return
    }

    public ExportMP4Dialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3) {
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
            java.lang.String r0 = "768"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "432"
            r2.setText(r0)
            goto L56
        L24:
            r0 = 3
            if (r2 != r0) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "960"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "540"
            r2.setText(r0)
            goto L56
        L36:
            r0 = 4
            if (r2 != r0) goto L48
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "1280"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "720"
            r2.setText(r0)
            goto L56
        L48:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._widthTextField
            java.lang.String r0 = "1920"
            r2.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._heightTextField
            java.lang.String r0 = "1080"
            r2.setText(r0)
        L56:
            return
    }

    private void updateAnimationStatsLabel() {
            r8 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r8._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            r0.size()
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r8._startFrameTextField     // Catch: java.lang.NumberFormatException -> L17
            java.lang.String r1 = r1.getText()     // Catch: java.lang.NumberFormatException -> L17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L17
            int r1 = r1.intValue()     // Catch: java.lang.NumberFormatException -> L17
            goto L18
        L17:
            r1 = 1
        L18:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r8._endFrameTextField     // Catch: java.lang.NumberFormatException -> L27
            java.lang.String r2 = r2.getText()     // Catch: java.lang.NumberFormatException -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L27
            int r2 = r2.intValue()     // Catch: java.lang.NumberFormatException -> L27
            goto L2f
        L27:
            org.fortheloss.sticknodes.data.ProjectData r2 = r8._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
        L2f:
            if (r1 <= r2) goto L38
            java.lang.String r0 = "startEndFramesWrong"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            goto L96
        L38:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            boolean r4 = r4.tweeningEnabled
            if (r4 == 0) goto L44
            java.lang.String r4 = "on"
            goto L46
        L44:
            java.lang.String r4 = "off"
        L46:
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r5 = 0
            r3[r5] = r4
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            int r4 = r4.getActualFPS()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            r4 = 2
            org.fortheloss.sticknodes.data.ProjectData r6 = r8._projectDataRef
            int r6 = r6.getTotalFrameCount(r1, r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r4] = r6
            r4 = 3
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.fortheloss.sticknodes.data.ProjectData r7 = r8._projectDataRef
            float r1 = r7.getPlayTimeSeconds(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r5] = r1
            java.lang.String r1 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r6, r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "s"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3[r4] = r0
            java.lang.String r0 = "exportAnimationStats"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r3)
        L96:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r8._animationStatsLabel
            r1.setText(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L16a
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._titleTextField
            java.lang.String r2 = r2.getText()
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r1.set(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._titleLabel
            java.lang.String r2 = r0._blankTitleText
            r1.setText(r2)
            r17.doNotHideDialog()
            r17.scrollToTop()
            return
        L39:
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r0._startFrameTextField     // Catch: java.lang.NumberFormatException -> L4a
            java.lang.String r4 = r4.getText()     // Catch: java.lang.NumberFormatException -> L4a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L4a
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L4a
            r9 = r4
            goto L4b
        L4a:
            r9 = 1
        L4b:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r0._endFrameTextField     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r4 = r4.getText()     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L5a
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L5a
            goto L62
        L5a:
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r4 = r4.size()
        L62:
            r10 = r4
            if (r9 <= r10) goto L84
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r1.set(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._titleLabel
            java.lang.String r2 = r0._startEndFramesWrong
            r1.setText(r2)
            r17.doNotHideDialog()
            r17.scrollToTop()
            return
        L84:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r0._titleTextField
            java.lang.String r6 = r4.getText()
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ".mp4"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r0._widthTextField
            java.lang.String r5 = r5.getText()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r0._heightTextField
            java.lang.String r7 = r7.getText()
            boolean r8 = r5.equals(r3)
            r11 = 72
            r12 = 128(0x80, float:1.794E-43)
            if (r8 != 0) goto Lc2
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto Lca
        Lc2:
            java.lang.String r5 = java.lang.Integer.toString(r12)
            java.lang.String r7 = java.lang.Integer.toString(r11)
        Lca:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._betterBlurButton
            boolean r15 = r3.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._aaButton
            boolean r3 = r3.isChecked()
            r8 = 2
            if (r3 == 0) goto Ldb
            r3 = 1
            goto Le6
        Ldb:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._aaButton2
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto Le5
            r3 = 2
            goto Le6
        Le5:
            r3 = 0
        Le6:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r0._fixButton
            if (r13 == 0) goto Lf2
            boolean r13 = r13.isChecked()
            if (r13 == 0) goto Lf2
            r13 = 1
            goto Lf3
        Lf2:
            r13 = 0
        Lf3:
            boolean r4 = r4.exists()
            r14 = 3
            if (r4 == 0) goto L131
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r0._animateToolsModuleRef
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r5 = r5.intValue()
            int r12 = java.lang.Math.max(r5, r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            int r5 = r5.intValue()
            int r11 = java.lang.Math.max(r5, r11)
            if (r1 == r2) goto L11b
            if (r1 == r8) goto L11b
            r16 = 1
            goto L11d
        L11b:
            r16 = 0
        L11d:
            if (r1 == r2) goto L123
            if (r1 != r14) goto L122
            goto L123
        L122:
            r2 = 0
        L123:
            r5 = r4
            r7 = r12
            r8 = r11
            r11 = r16
            r12 = r2
            r14 = r3
            r5.showExportMP4OverwriteDialog(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r17.doNotHideDialog()
            return
        L131:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r0._animationScreenRef
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r5 = r5.intValue()
            int r12 = java.lang.Math.max(r5, r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            int r5 = r5.intValue()
            int r11 = java.lang.Math.max(r5, r11)
            if (r1 == r2) goto L152
            if (r1 == r8) goto L152
            r16 = 1
            goto L154
        L152:
            r16 = 0
        L154:
            if (r1 == r2) goto L15a
            if (r1 != r14) goto L159
            goto L15a
        L159:
            r2 = 0
        L15a:
            r5 = r4
            r7 = r12
            r8 = r11
            r11 = r16
            r12 = r2
            r1 = 0
            r14 = r3
            r5.beginMP4Export(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r2.setOnscreenKeyboardVisible(r1)
        L16a:
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
            r1._betterBlurButton = r0
            r1._aaLabel = r0
            r1._aaLabel2 = r0
            r1._startFrameTextField = r0
            r1._endFrameTextField = r0
            r1._animationStatsLabel = r0
            r1._exportWidthHeightLabel = r0
            r1._qualitySlider = r0
            r1._aaButton = r0
            r1._aaButton2 = r0
            r1._fixButton = r0
            r1._defaultTitleText = r0
            r1._blankTitleText = r0
            r1._startEndFramesWrong = r0
            super.dispose()
            return
    }

    public void initialize() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "exportMp4Title"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            super.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            org.fortheloss.framework.Assets r1 = r1.getAssets()
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            java.lang.Object r1 = r1.get(r2, r3, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "validName"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0._defaultTitleText = r2
            java.lang.String r2 = "exportEmptyName"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0._blankTitleText = r2
            java.lang.String r2 = "startEndFramesWrong"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0._startEndFramesWrong = r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            boolean r2 = r2.getNerdModeEnabled()
            r3 = 2
            if (r2 != 0) goto L69
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "exportMp4Info"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r5, r6)
            r2.setWrap(r4)
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r2.width(r5)
            r17.addContentRow()
        L69:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = r0._defaultTitleText
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r7)
            r2.<init>(r5, r6)
            r0._titleLabel = r2
            r2.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._titleLabel
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r2.width(r5)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "animationTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            r2.colspan(r3)
            r17.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r2 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r2.<init>()
            java.lang.String r5 = ""
            r6 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r5, r6, r2)
            r0._titleTextField = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$1 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$1
            r7.<init>(r0)
            r2.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._titleTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r7)
            r2.colspan(r3)
            r17.addContentRow()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            boolean r2 = r2.getNerdModeEnabled()
            if (r2 != 0) goto L124
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "exportWidthHeight"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r9)
            r2.<init>(r7, r8)
            r0._exportWidthHeightLabel = r2
            r2.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._exportWidthHeightLabel
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._exportWidthHeightLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            r2.width(r7)
            r17.addContentRow()
        L124:
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            boolean r2 = r2.isYoutubeShorts
            if (r2 == 0) goto L166
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "verticalVideoNote"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r9)
            r2.<init>(r7, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r7 = r7.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r8 = r8.fontColor
            r7.set(r8)
            r2.setWrap(r4)
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            r2.width(r7)
            r17.addContentRow()
        L166:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r7 = 0
            r2.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.space(r7)
            r8.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r0.addContent(r2)
            r8.colspan(r3)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "sd"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r9, r10)
            r8.setWrap(r4)
            r8.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r2.add(r8)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r10 = 1048576000(0x3e800000, float:0.25)
            float r9 = r9 * r10
            r8.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r8 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1084227584(0x40a00000, float:5.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r16 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r0._qualitySlider = r8
            r9 = 1073741824(0x40000000, float:2.0)
            r8.setValue(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r8 = r0._qualitySlider
            org.fortheloss.framework.CustomStopListener r9 = new org.fortheloss.framework.CustomStopListener
            r9.<init>()
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r8 = r0._qualitySlider
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$2 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$2
            r9.<init>(r0)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r8 = r0._qualitySlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r2.add(r8)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r11
            r8.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "hd"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r9, r12)
            r8.setWrap(r4)
            r8.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            float r8 = r8 * r10
            r2.width(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "width"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r8, r9)
            r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "height"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r8, r9)
            r0.addContent(r2)
            r17.addContentRow()
            r2 = 768(0x300, float:1.076E-42)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r8 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r8.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r2, r6, r8)
            r0._widthTextField = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$3 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$3
            r8.<init>(r0)
            r2.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._widthTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$4 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$4
            r8.<init>(r0)
            r2.setTextFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._widthTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r8 = r8 / 4
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r8 = (float) r8
            r2.height(r8)
            r2 = 432(0x1b0, float:6.05E-43)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r8 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r8.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r2, r6, r8)
            r0._heightTextField = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$5 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$5
            r8.<init>(r0)
            r2.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._heightTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$6 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$6
            r8.<init>(r0)
            r2.setTextFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._heightTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r8 = r8 / 4
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r8 = (float) r8
            r2.height(r8)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "startFrame"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r8, r9)
            r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "endFrame"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r8, r9)
            r0.addContent(r2)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r2.<init>()
            java.lang.String r8 = "1"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r8, r6, r2)
            r0._startFrameTextField = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$7 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$7
            r8.<init>(r0)
            r2.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._startFrameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$8 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$8
            r8.<init>(r0)
            r2.setTextFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._startFrameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r8 = r8 / 4
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r8 = (float) r8
            r2.height(r8)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r8 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r8.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r2, r6, r8)
            r0._endFrameTextField = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$9 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$9
            r6.<init>(r0)
            r2.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._endFrameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$10 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$10
            r6.<init>(r0)
            r2.setTextFieldListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._endFrameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r6 = r6 / 4
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r6 = (float) r6
            r2.height(r6)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "checkboxAA1"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r6, r8)
            r0._aaLabel = r2
            r2.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._aaLabel
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r2)
            r0._aaButton = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$11 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$11
            r6.<init>(r0)
            r2.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "checkboxAA2"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r6, r8)
            r0._aaLabel2 = r2
            r2.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._aaLabel2
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r2)
            r0._aaButton2 = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$12 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog$12
            r6.<init>(r0)
            r2.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "checkboxBetterBlur"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r6, r8)
            r2.setWrap(r4)
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            r0._betterBlurButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r6.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r4)
            r8.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r0.addContent(r6)
            r8.colspan(r3)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r0._aaLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r8)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r9 = r9 / r3
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r9)
            r9 = 16
            r8.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._aaButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r8)
            r10 = 8
            r8.align(r10)
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r0._aaLabel2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r8)
            int r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r12 = r12 / r3
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r12)
            r8.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._aaButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r8)
            r8.align(r10)
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r2)
            int r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r12 = r12 / r3
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r12)
            r8.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._betterBlurButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r8)
            r6.align(r10)
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            boolean r6 = r6.isPro()
            if (r6 != 0) goto L467
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r6, r6, r6, r11)
            com.badlogic.gdx.scenes.scene2d.Touchable r8 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._betterBlurButton
            r2.setColor(r6, r6, r6, r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._betterBlurButton
            r2.setTouchable(r8)
        L467:
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r6 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r2 == r6) goto L4e0
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r6)
            com.badlogic.gdx.graphics.Color r6 = r2.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r8 = r8.fontColor
            r6.set(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "exportAndroidFix"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r6.<init>(r8, r2)
            r6.setWrap(r4)
            r6.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r2)
            r0._fixButton = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r2.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r8.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.align(r4)
            r7.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.add(r6)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r7 = r7 / r3
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r7)
            r6.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._fixButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.add(r6)
            r6.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            r2.colspan(r3)
            r17.addContentRow()
        L4e0:
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r6 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r6)
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            r1.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "exportTweeningInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2, r6)
            r1.setWrap(r4)
            r1.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r1.width(r2)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r5, r2)
            r0._animationStatsLabel = r1
            r17.updateAnimationStatsLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._animationStatsLabel
            r1.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._animationStatsLabel
            r1.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._animationStatsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r1.width(r2)
            r17.addContentRow()
            java.lang.String r1 = "exportMp4Sounds"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.addButton(r1, r2)
            java.lang.String r1 = "exportMp4NoSounds"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.addButton(r1, r2)
            java.lang.String r1 = "cancel"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.addButton(r1, r2)
            return
    }
}
