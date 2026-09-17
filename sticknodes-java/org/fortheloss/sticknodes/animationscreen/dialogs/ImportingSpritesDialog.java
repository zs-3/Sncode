package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ImportingSpritesDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private float mLoadingRotation;


    /* renamed from: -$$Nest$fgetmLoadingRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m511$$Nest$fgetmLoadingRotation(org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r0) {
            float r0 = r0.mLoadingRotation
            return r0
    }

    /* renamed from: -$$Nest$fputmLoadingRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m512$$Nest$fputmLoadingRotation(org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r0, float r1) {
            r0.mLoadingRotation = r1
            return
    }

    public ImportingSpritesDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mLoadingRotation = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r0 = this;
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureRegion r4) {
            r3 = this;
            java.lang.String r0 = "importingSpritesTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "importingSpritesInfo"
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
            r3.addContentRow()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog$1
            r0.<init>(r3, r4)
            float r4 = r0.getWidth()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r1
            float r2 = r0.getHeight()
            float r2 = r2 * r1
            r0.setOrigin(r4, r2)
            r3.addContent(r0)
            r3.addContentRow()
            return
    }
}
