package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class StoragePermissionRequestDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _button;
    private org.fortheloss.framework.IAndroidStorageRequester _requesterRef;


    /* renamed from: -$$Nest$fget_button, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m641$$Nest$fget_button(org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0._button
            return r0
    }

    public StoragePermissionRequestDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.framework.IAndroidStorageRequester r2) {
            r0 = this;
            r0.<init>(r1)
            r0._requesterRef = r2
            java.lang.Thread r1 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog$1
            r2.<init>(r0)
            r1.<init>(r2)
            r1.start()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._requesterRef = r0
            r1._button = r0
            super.dispose()
            return
    }

    public void initialize() {
            r3 = this;
            java.lang.String r0 = "storageTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "storageInfo"
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
            java.lang.String r0 = "okay"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.createTextButton(r0)
            r3._button = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._button
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._button
            r1 = 0
            r3.addButton(r0, r1)
            return
    }
}
