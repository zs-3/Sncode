package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class BlankDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    public BlankDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void initialize(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.initialize(r2, r3, r0)
            return
    }

    public void initialize(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            super.initialize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3, r0)
            r3 = 1
            r2.setWrap(r3)
            r2.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r2.width(r3)
            if (r4 == 0) goto L2f
            java.lang.String r2 = "okay"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            r3 = 0
            r1.addButton(r2, r3)
        L2f:
            return
    }
}
