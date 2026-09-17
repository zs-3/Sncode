package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ConvertToMcDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.Label mNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField mNameTextfield;


    public ConvertToMcDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r6) {
            r5 = this;
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L86
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.mNameTextfield
            java.lang.String r6 = r6.getText()
            int r1 = r6.length()
            if (r1 > 0) goto L35
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5.mNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = r6.getStyle()
            com.badlogic.gdx.graphics.Color r6 = r6.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r6.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5.mNameLabel
            java.lang.String r0 = "movieclipEmptyName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r6.setText(r0)
            r5.doNotHideDialog()
            goto L8a
        L35:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r1.getProjectData()
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r1.libraryMovieclips
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
        L43:
            if (r2 < 0) goto L5a
            java.lang.Object r4 = r1.get(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L57
            r1 = 1
            goto L5b
        L57:
            int r2 = r2 + (-1)
            goto L43
        L5a:
            r1 = 0
        L5b:
            if (r1 == 0) goto L7d
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5.mNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = r6.getStyle()
            com.badlogic.gdx.graphics.Color r6 = r6.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r6.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5.mNameLabel
            java.lang.String r0 = "addToLibraryNameTaken"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r6.setText(r0)
            r5.doNotHideDialog()
            goto L8a
        L7d:
            r5.onConfirm(r3, r6)
            com.badlogic.gdx.Input r6 = com.badlogic.gdx.Gdx.input
            r6.setOnscreenKeyboardVisible(r0)
            goto L8a
        L86:
            r6 = 0
            r5.onConfirm(r0, r6)
        L8a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mNameTextfield = r0
            r1.mNameLabel = r0
            super.dispose()
            return
    }

    public void initialize() {
            r4 = this;
            java.lang.String r0 = "convertToMovieclipTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "convertToMovieclipInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "movieclipName"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ":"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r4.mNameLabel = r0
            r4.addContent(r0)
            r4.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            java.lang.String r1 = ""
            r2 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.createTextField(r1, r2, r0)
            r4.mNameTextfield = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ConvertToMcDialog$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ConvertToMcDialog$1
            r1.<init>(r4)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4.mNameTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r1 = (float) r1
            r0.height(r1)
            java.lang.String r0 = "yes"
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

    protected void onConfirm(boolean r1, java.lang.String r2) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
