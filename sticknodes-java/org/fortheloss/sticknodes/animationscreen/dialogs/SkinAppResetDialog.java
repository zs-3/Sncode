package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SkinAppResetDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog _appSettingsDialogRef;

    public SkinAppResetDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r1 = r0._appSettingsDialogRef
            r1.applyChanges()
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r1 = r0._appSettingsDialogRef
            r1.hideImmediately()
        L12:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._appSettingsDialogRef = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r3) {
            r2 = this;
            java.lang.String r0 = "skinAppResetTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r2._appSettingsDialogRef = r3
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "skinAppResetInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r0, r1)
            r0 = 1
            r3.setWrap(r0)
            r3.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.addContent(r3)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r3.width(r0)
            java.lang.String r3 = "yesRestartApp"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.addButton(r3, r0)
            java.lang.String r3 = "noCancel"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.addButton(r3, r0)
            return
    }
}
