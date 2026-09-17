package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AddTweenedFrameInstructionsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.graphics.Texture mTexture1;

    public AddTweenedFrameInstructionsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
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

    public void initialize(org.fortheloss.framework.Assets r4) {
            r3 = this;
            java.lang.String r0 = "addTweenedFrameInstructionsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "addTweenedFrameInstructionsInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            r3.addContentRow()
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r2 = org.fortheloss.sticknodes.App.addTweenedFrameInstructionsTexture
            com.badlogic.gdx.files.FileHandle r4 = r4.getPathFromResolutionFolder(r2)
            r0.<init>(r4)
            r3.mTexture1 = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r4.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.align(r1)
            java.lang.String r4 = "okay"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            r0 = 0
            r3.addButton(r4, r0)
            return
    }
}
