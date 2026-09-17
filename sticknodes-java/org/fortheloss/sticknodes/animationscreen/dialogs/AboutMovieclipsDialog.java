package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AboutMovieclipsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {


    public AboutMovieclipsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L18
            org.fortheloss.sticknodes.animationscreen.dialogs.AboutMovieclipsDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.AboutMovieclipsDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r2.<init>(r1, r0)
            r2.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.addDialogToStage(r2)
        L18:
            return
    }

    public void initialize() {
            r3 = this;
            java.lang.String r0 = "aboutMovieclipsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "aboutMovieclipsInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            java.lang.String r0 = "okay"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.createTextButton(r0)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.addButton(r0, r2)
            java.lang.String r0 = "aboutMovieclipsButton"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.addButton(r0, r1)
            return
    }
}
