package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AddMovieclipToLibraryDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _createdMovieclipRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _instructionsLabel;
    private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _textfield;


    public AddMovieclipToLibraryDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._movieclipToolsModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L7c
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2._textfield
            java.lang.String r3 = r3.getText()
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._instructionsLabel
            java.lang.String r0 = "movieclipEmptyName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r3.setText(r0)
            r2.doNotHideDialog()
            goto L7c
        L36:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r2._createdMovieclipRef
            java.lang.String r0 = r0.getName()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._createdMovieclipRef
            r1.setName(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._createdMovieclipRef
            boolean r3 = r3.addMovieclipToLibrary(r1)
            if (r3 != 0) goto L70
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r2._createdMovieclipRef
            r3.setName(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._instructionsLabel
            java.lang.String r0 = "addToLibraryNameTaken"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r3.setText(r0)
            r2.doNotHideDialog()
            goto L7c
        L70:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r2._movieclipToolsModuleRef
            r0 = 1
            r3.setToAnimateScreen(r0)
            com.badlogic.gdx.Input r3 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r3.setOnscreenKeyboardVisible(r0)
        L7c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._movieclipToolsModuleRef = r0
            r1._createdMovieclipRef = r0
            r1._instructionsLabel = r0
            r1._textfield = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String r6, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7) {
            r5 = this;
            java.lang.String r0 = "addMCToLibraryTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r5._createdMovieclipRef = r7
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r7 = r7.getSessionData()
            boolean r7 = r7.getNerdModeEnabled()
            r0 = 2
            r1 = 1
            if (r7 != 0) goto L41
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "addMCToLibraryInfo"
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
        L41:
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "addMCToLibraryInstructions"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
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
            java.lang.String r0 = "movieclipName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r0, r1)
            r5.addContent(r7)
            r5.addContentRow()
            r7 = -1
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.createTextField(r6, r7, r0)
            r5._textfield = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog$1 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog$1
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
