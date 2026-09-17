package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AddStickfigureToLibraryDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _createdStickfigureRef;
    private java.lang.String _emptyNameString;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _instructionsLabel;
    private java.lang.String _instructionsString;
    private java.lang.String _nameTakenString;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _textfield;


    public AddStickfigureToLibraryDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2) {
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
            if (r4 == 0) goto L73
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._textfield
            java.lang.String r4 = r4.getText()
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L32
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r4.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._instructionsLabel
            java.lang.String r0 = r3._emptyNameString
            r4.setText(r0)
            r3.doNotHideDialog()
            goto L73
        L32:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._createdStickfigureRef
            r0.setName(r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r3._createdStickfigureRef
            r4.setDefaults()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._createdStickfigureRef
            r2 = 1
            r0.<init>(r1, r2)
            boolean r4 = r4.addStickfigureToLibrary(r0)
            if (r4 != 0) goto L68
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r4.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._instructionsLabel
            java.lang.String r0 = r3._nameTakenString
            r4.setText(r0)
            r3.doNotHideDialog()
            goto L73
        L68:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            r4.changeScreenFromCreationMode()
            com.badlogic.gdx.Input r4 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r4.setOnscreenKeyboardVisible(r0)
        L73:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._createToolsModuleRef = r0
            r1._createdStickfigureRef = r0
            r1._instructionsLabel = r0
            r1._textfield = r0
            r1._instructionsString = r0
            r1._nameTakenString = r0
            r1._emptyNameString = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String r6, org.fortheloss.sticknodes.stickfigure.Stickfigure r7) {
            r5 = this;
            java.lang.String r0 = "addToLibraryTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r5._createdStickfigureRef = r7
            java.lang.String r7 = "addToLibraryInstructions"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r5._instructionsString = r7
            java.lang.String r7 = "addToLibraryNameTaken"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r5._nameTakenString = r7
            java.lang.String r7 = "stickfigureEmptyName"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r5._emptyNameString = r7
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r7 = r7.getSessionData()
            boolean r7 = r7.getNerdModeEnabled()
            r0 = 2
            r1 = 1
            if (r7 != 0) goto L59
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "addToLibraryInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r2, r3)
            r7.setWrap(r1)
            r7.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.addContent(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.colspan(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r7.width(r2)
            r5.addContentRow()
        L59:
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = r5._instructionsString
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4)
            r7.<init>(r2, r3)
            r5._instructionsLabel = r7
            r7.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r5._instructionsLabel
            r7.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r5._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.addContent(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.colspan(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r7.width(r0)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "stickfigureName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r0, r1)
            r5.addContent(r7)
            r5.addContentRow()
            r7 = -1
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.createTextField(r6, r7, r0)
            r5._textfield = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog$1 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog$1
            r7.<init>(r5)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5._textfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r7 = (float) r7
            r6.height(r7)
            java.lang.String r6 = "addToLibrary"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.addButton(r6, r7)
            java.lang.String r6 = "cancel"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.addButton(r6, r7)
            return
    }
}
