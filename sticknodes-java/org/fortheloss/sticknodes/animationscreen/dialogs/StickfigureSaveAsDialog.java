package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class StickfigureSaveAsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _blankTitleText;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private java.lang.String _defaultTitleText;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _nameTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;


    public StickfigureSaveAsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._createToolsModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._nameTextField
            java.lang.String r4 = r4.getText()
            java.lang.String r4 = r4.trim()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3._nameTextField
            r0.setText(r4)
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3b
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r4.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._titleLabel
            java.lang.String r0 = r3._blankTitleText
            r4.setText(r0)
            r3.doNotHideDialog()
            return
        L3b:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = ".nodes"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L66
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            r0.showStickfigureOverwriteDialog(r4)
            r3.doNotHideDialog()
            return
        L66:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            r0.saveStickfigureToFile(r4)
            com.badlogic.gdx.Input r4 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r4.setOnscreenKeyboardVisible(r0)
        L71:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._createToolsModuleRef = r0
            r1._titleLabel = r0
            r1._nameTextField = r0
            r1._defaultTitleText = r0
            r1._blankTitleText = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    public void initialize(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "stickfigureSaveAsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            java.lang.String r0 = "validName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4._defaultTitleText = r0
            java.lang.String r0 = "stickfigureEmptyName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4._blankTitleText = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = r4._defaultTitleText
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r4._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4.createTextField(r5)
            r4._nameTextField = r5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r5 = r5.getSessionData()
            boolean r5 = r5.getNerdModeEnabled()
            r0 = 2
            r1 = 1
            if (r5 != 0) goto L67
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "stickfigureSaveAsInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r2, r3)
            r5.setWrap(r1)
            r5.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r5.width(r2)
            r4.addContentRow()
        L67:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._titleLabel
            r5.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._titleLabel
            r5.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r5.width(r0)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "stickfigureName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r0, r1)
            r4.addContent(r5)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._nameTextField
            r0 = 1056964608(0x3f000000, float:0.5)
            r5.setBlinkTime(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._nameTextField
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            r5.setTextFieldFilter(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._nameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog$1
            r0.<init>(r4)
            r5.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._nameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r0 = (float) r0
            r5.height(r0)
            java.lang.String r5 = "saveStickfigure"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.addButton(r5, r0)
            java.lang.String r5 = "cancel"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.addButton(r5, r0)
            return
    }
}
