package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PermaDeleteRegionDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String[] _filepaths;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog _importRegionsDialogRef;

    public PermaDeleteRegionDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.lang.String getLastPathElement(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = java.io.File.separator
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto L12
            int r0 = r0 + 1
            int r1 = r3.length()
            java.lang.String r3 = r3.substring(r0, r1)
        L12:
            return r3
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2b
            r4 = 0
            java.lang.String[] r0 = r3._filepaths
            int r0 = r0.length
        Lc:
            if (r4 >= r0) goto L24
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String[] r2 = r3._filepaths
            r2 = r2[r4]
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L21
            r1.delete()
        L21:
            int r4 = r4 + 1
            goto Lc
        L24:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r4 = r3._importRegionsDialogRef
            if (r4 == 0) goto L2b
            r4.onFilesModified()
        L2b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._filepaths = r0
            r1._importRegionsDialogRef = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String[] r7, org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r8) {
            r6 = this;
            java.lang.String r0 = "areYouSureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r6._filepaths = r7
            r6._importRegionsDialogRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "permaDeleteRegionInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r0, r1)
            r0 = 1
            r8.setWrap(r0)
            r8.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.addContent(r8)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r8.width(r1)
            r6.addContentRow()
            int r8 = r7.length
            java.lang.String r1 = ""
            r2 = 0
            r2 = r1
            r3 = 0
        L38:
            if (r3 >= r8) goto L57
            r4 = r7[r3]
            java.lang.String r4 = r6.getLastPathElement(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            int r3 = r3 + 1
            java.lang.String r2 = "\n"
            goto L38
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r1, r8)
            r7.setWrap(r0)
            r8 = 8
            r7.setAlignment(r0, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.addContent(r7)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            r7.width(r8)
            java.lang.String r7 = "deleteDevice"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.addButton(r7, r8)
            java.lang.String r7 = "cancel"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r6.addButton(r7, r8)
            return
    }
}
