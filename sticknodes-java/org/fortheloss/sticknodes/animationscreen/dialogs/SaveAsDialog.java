package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SaveAsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private java.lang.String _blankTitleText;
    private java.lang.String _defaultTitleText;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _titleTextField;


    public SaveAsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._animateToolsModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6c
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._titleTextField
            java.lang.String r4 = r4.getText()
            java.lang.String r0 = ""
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L32
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
        L32:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._titleTextField
            java.lang.String r4 = r4.getText()
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.projectsPath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = ".stknds"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L63
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModuleRef
            r0.showProjectOverwriteDialog(r4)
            r3.doNotHideDialog()
            return
        L63:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModuleRef
            r0.saveProject(r4)
            r3.resetFields()
            goto L6f
        L6c:
            r3.resetFields()
        L6f:
            com.badlogic.gdx.Input r4 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r4.setOnscreenKeyboardVisible(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animateToolsModuleRef = r0
            r1._titleLabel = r0
            r1._titleTextField = r0
            r1._defaultTitleText = r0
            r1._blankTitleText = r0
            super.dispose()
            return
    }

    public void initialize() {
            r4 = this;
            java.lang.String r0 = "saveProjectAsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            java.lang.String r0 = "validName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4._defaultTitleText = r0
            java.lang.String r0 = "saveProjectAsBlankName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4._blankTitleText = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = r4._defaultTitleText
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r4._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "saveProjectAsInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r0.width(r3)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._titleLabel
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._titleLabel
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "projectTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r4.addContent(r0)
            r4.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            java.lang.String r1 = ""
            r2 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.createTextField(r1, r2, r0)
            r4._titleTextField = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog$1
            r1.<init>(r4)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._titleTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r1 = (float) r1
            r0.height(r1)
            java.lang.String r0 = "saveProject"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.addButton(r0, r1)
            return
    }

    public void resetFields() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._titleLabel
            java.lang.String r1 = r2._defaultTitleText
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r0.fontColor = r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2._titleTextField
            java.lang.String r1 = ""
            r0.setText(r1)
            return
    }
}
