package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ChangelogDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _videoURL;



    public ChangelogDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r0 = r2._videoURL
            r1 = 1
            if (r3 != r1) goto L1b
            org.fortheloss.sticknodes.animationscreen.dialogs.ChangelogDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ChangelogDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r3.<init>(r2, r1, r0)
            r3.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            goto L2d
        L1b:
            r0 = 2
            if (r3 != r0) goto L2d
            org.fortheloss.sticknodes.animationscreen.dialogs.ChangelogDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ChangelogDialog$2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r2, r0)
            r3.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
        L2d:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._videoURL = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            super.initialize(r2)
            r1._videoURL = r5
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
            r1.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r0)
            r2.setWrap(r3)
            r4 = 8
            r2.setAlignment(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r2)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r0 = 1061158912(0x3f400000, float:0.75)
            float r4 = r4 * r0
            r2.width(r4)
            java.lang.String r2 = "okay"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.addButton(r2, r4)
            if (r5 == 0) goto L6a
            java.lang.String r2 = "videoOfChanges"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.addButton(r2, r3)
        L6a:
            java.lang.String r2 = "fullChangelog"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.addButton(r2, r3)
            return
    }
}
