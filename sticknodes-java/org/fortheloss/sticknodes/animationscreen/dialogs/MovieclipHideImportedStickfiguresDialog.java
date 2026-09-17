package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MovieclipHideImportedStickfiguresDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.files.FileHandle _mcFileHandleRef;
    private com.badlogic.gdx.graphics.Texture mTexture1;

    public MovieclipHideImportedStickfiguresDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._animateToolsModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            com.badlogic.gdx.files.FileHandle r1 = r2._mcFileHandleRef
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r0.actuallyImportMovieclipFile(r1, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animateToolsModuleRef = r0
            r2._mcFileHandleRef = r0
            com.badlogic.gdx.graphics.Texture r1 = r2.mTexture1
            if (r1 == 0) goto Le
            r1.dispose()
            r2.mTexture1 = r0
        Le:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.files.FileHandle r3, org.fortheloss.framework.Assets r4) {
            r2 = this;
            java.lang.String r0 = "hideImportedTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r2._mcFileHandleRef = r3
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "hideImportedInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r0, r1)
            r0 = 1
            r3.setWrap(r0)
            r3.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.addContent(r3)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r3.width(r1)
            r2.addContentRow()
            com.badlogic.gdx.graphics.Texture r3 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r1 = org.fortheloss.sticknodes.App.editButtonHideStickfiguresTexture
            com.badlogic.gdx.files.FileHandle r4 = r4.getPathFromResolutionFolder(r1)
            r3.<init>(r4)
            r2.mTexture1 = r3
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r4.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            r3.align(r0)
            java.lang.String r3 = "importAndHide"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.addButton(r3, r4)
            java.lang.String r3 = "importAndDoNotHide"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.addButton(r3, r4)
            return
    }
}
