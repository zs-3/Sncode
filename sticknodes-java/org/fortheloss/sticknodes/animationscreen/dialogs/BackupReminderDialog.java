package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class BackupReminderDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.framework.Assets _assetsRef;

    public BackupReminderDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.framework.Assets r2) {
            r0 = this;
            r0.<init>(r1)
            r0._assetsRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._assetsRef = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.framework.Assets r3) {
            r2 = this;
            java.lang.String r3 = "backupTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            super.initialize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "backupInfo"
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
            java.lang.String r3 = "okay"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            r0 = 0
            r2.addButton(r3, r0)
            return
    }
}
