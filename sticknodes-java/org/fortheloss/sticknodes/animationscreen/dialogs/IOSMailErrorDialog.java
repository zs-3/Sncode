package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class IOSMailErrorDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.graphics.Texture mTexture1;

    public IOSMailErrorDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture r0 = r1.mTexture1
            if (r0 == 0) goto La
            r0.dispose()
            r0 = 0
            r1.mTexture1 = r0
        La:
            super.dispose()
            return
    }

    public void initialize() {
            r4 = this;
            java.lang.String r0 = "errorSubmittingTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.framework.Assets r0 = r0.getAssets()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "errorSubmittingInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2, r3)
            r2 = 1
            r1.setWrap(r2)
            r1.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r4.addContent(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r1.width(r3)
            r4.addContentRow()
            com.badlogic.gdx.graphics.Texture r1 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r3 = org.fortheloss.sticknodes.App.iosMailTexture
            com.badlogic.gdx.files.FileHandle r0 = r0.getPathFromResolutionFolder(r3)
            r1.<init>(r0)
            r4.mTexture1 = r1
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.align(r2)
            java.lang.String r0 = "okay"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4.createTextButton(r0)
            r1 = 0
            r4.addButton(r0, r1)
            return
    }
}
