package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MovieclipOverwriteDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _filename;
    private org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog _movieclipSaveAsDialogRef;
    private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModuleRef;

    public MovieclipOverwriteDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._movieclipToolsModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L16
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModuleRef
            java.lang.String r0 = r1._filename
            r2.saveMovieclipToFile(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r2 = r1._movieclipSaveAsDialogRef
            if (r2 == 0) goto L16
            r2.hideImmediately()
        L16:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._movieclipToolsModuleRef = r0
            r1._filename = r0
            r1._movieclipSaveAsDialogRef = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String r5, org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r6) {
            r4 = this;
            java.lang.String r0 = "filenameConflictTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r4._filename = r5
            r4._movieclipSaveAsDialogRef = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = org.fortheloss.sticknodes.App.movieclipsPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = ".nodemc"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "overwriteInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r5, r1)
            r6.setWrap(r0)
            r6.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r5.width(r6)
            java.lang.String r5 = "yesOverwrite"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.addButton(r5, r6)
            java.lang.String r5 = "noCancel"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.addButton(r5, r6)
            return
    }
}
