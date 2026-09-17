package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PleaseRateDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.graphics.Texture mTexture1;

    public PleaseRateDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r6) {
            r5 = this;
            super.dialogResult(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r1)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "pleaseRateDialogActive"
            if (r6 != r2) goto L27
            r0.putBoolean(r3, r1)
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "please_rate_leave_your_rating"
            r6.analyticsSendSingle(r1)
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            r6.onRateClick()
            goto L3f
        L27:
            r4 = 2
            if (r6 != r4) goto L35
            r0.putBoolean(r3, r1)
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "please_rate_no"
            r6.analyticsSendSingle(r1)
            goto L3f
        L35:
            r0.putBoolean(r3, r2)
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "please_rate_do_it_later"
            r6.analyticsSendSingle(r1)
        L3f:
            r0.flush()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            super.dispose()
            com.badlogic.gdx.graphics.Texture r0 = r1.mTexture1
            if (r0 == 0) goto Ld
            r0.dispose()
            r0 = 0
            r1.mTexture1 = r0
        Ld:
            return
    }

    public void initialize(org.fortheloss.framework.Assets r6) {
            r5 = this;
            java.lang.String r0 = "pleaseRateTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r1 = org.fortheloss.sticknodes.App.pleaseRateTexture
            com.badlogic.gdx.files.FileHandle r6 = r6.getPathFromResolutionFolder(r1)
            r0.<init>(r6)
            r5.mTexture1 = r0
            com.badlogic.gdx.graphics.Texture$TextureFilter r6 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r0.setFilter(r6, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.Texture r0 = r5.mTexture1
            r6.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r6)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r3 = 1067450368(0x3fa00000, float:1.25)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            float r2 = r6.getHeight()
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 * r3
            float r6 = r6.getWidth()
            float r2 = r2 / r6
            r0.height(r2)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "pleaseRateMessage"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r6.<init>(r0, r2)
            r6.setWrap(r1)
            r6.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            float r0 = r0 * r3
            r6.width(r0)
            r5.addContentRow()
            java.lang.String r6 = "remindMeLater"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "..."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.addButton(r6, r0)
            java.lang.String r6 = "rateIt"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " >"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeUrlRateButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r5.createImageTextButton(r6, r0)
            float r0 = r6.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            float r3 = r6.getHeight()
            float r3 = r3 * r2
            r6.setOrigin(r0, r3)
            r6.setTransform(r1)
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.sine
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2, r3, r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r4, r4, r3, r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r0)
            r6.addAction(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.addButton(r6, r0)
            java.lang.String r6 = "no"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.addButton(r6, r0)
            return
    }
}
