package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PermaDeleteProjectDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.files.FileHandle _fileHandle;
    private org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog _openDialogRef;

    public PermaDeleteProjectDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1c
            com.badlogic.gdx.files.FileHandle r1 = r0._fileHandle
            boolean r1 = r1.exists()
            if (r1 == 0) goto L15
            com.badlogic.gdx.files.FileHandle r1 = r0._fileHandle
            r1.delete()
        L15:
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r1 = r0._openDialogRef
            if (r1 == 0) goto L1c
            r1.onFilesModified()
        L1c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._fileHandle = r0
            r1._openDialogRef = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.files.FileHandle r4, org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r5) {
            r3 = this;
            java.lang.String r0 = "areYouSureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r3._fileHandle = r4
            r3._openDialogRef = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r4 = r4.name()
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "permaDeleteProjectInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r4, r1)
            r5.setWrap(r0)
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r4.width(r5)
            java.lang.String r4 = "deleteDevice"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.addButton(r4, r5)
            java.lang.String r4 = "cancel"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.addButton(r4, r5)
            return
    }
}
