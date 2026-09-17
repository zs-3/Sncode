package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class DeleteSoundDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private int _soundID;

    public DeleteSoundDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._soundID = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r1._animationScreenRef
            int r0 = r1._soundID
            r2.deleteSound(r0)
        Lf:
            return
    }

    public void initialize(int r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "areYouSureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r3._soundID = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "deleteSoundInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r1)
            r4.setWrap(r0)
            r4.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r4)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r4.width(r5)
            java.lang.String r4 = "yesDelete"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.addButton(r4, r5)
            java.lang.String r4 = "noCancel"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.addButton(r4, r5)
            return
    }
}
