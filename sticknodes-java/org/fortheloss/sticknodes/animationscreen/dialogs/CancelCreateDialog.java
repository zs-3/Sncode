package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class CancelCreateDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;

    public CancelCreateDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._createToolsModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            r1.changeScreenFromCreationMode()
        Ld:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._createToolsModuleRef = r0
            super.dispose()
            return
    }

    public void initialize() {
            r3 = this;
            java.lang.String r0 = "areYouSureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "cancelCreateInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            java.lang.String r0 = "yesSure"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.addButton(r0, r1)
            java.lang.String r0 = "noCancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r3.addButton(r0, r1)
            return
    }
}
