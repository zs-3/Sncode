package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ConfirmDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    public ConfirmDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.onConfirm(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r0 = this;
            super.dispose()
            return
    }

    public void initialize(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.initialize(r1, r2, r3, r4, r5)
            return
    }

    public void initialize(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            super.initialize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3, r0)
            r3 = 1
            r2.setWrap(r3)
            r2.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r2)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r2.width(r0)
            if (r4 == 0) goto L41
            r1.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r0)
            r2.setWrap(r3)
            r3 = 8
            r2.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r2.width(r3)
        L41:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r5)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.addButton(r2, r3)
            if (r6 == 0) goto L55
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r6)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.addButton(r2, r3)
        L55:
            return
    }

    protected void onConfirm(boolean r1) {
            r0 = this;
            return
    }
}
