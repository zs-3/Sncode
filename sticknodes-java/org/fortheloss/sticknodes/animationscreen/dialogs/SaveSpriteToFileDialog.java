package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SaveSpriteToFileDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.Label mInfoLabel;
    private org.fortheloss.sticknodes.sprite.SpriteRef mSpriteRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField mTextField;


    public SaveSpriteToFileDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r14) {
            r13 = this;
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r14 != 0) goto Lf8
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.mTextField
            java.lang.String r14 = r14.getText()
            java.lang.String r4 = r14.trim()
            int r14 = r4.length()
            if (r14 > 0) goto L38
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = r14.getStyle()
            com.badlogic.gdx.graphics.Color r14 = r14.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r14.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13.mInfoLabel
            java.lang.String r0 = "saveSpriteToFileInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r14.setText(r0)
            r13.doNotHideDialog()
            return
        L38:
            java.lang.String r14 = org.fortheloss.sticknodes.App.spritesPath
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r4)
            java.lang.String r14 = ".png"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r14 = r0.absolute(r14)
            boolean r14 = r14.exists()
            if (r14 == 0) goto L7a
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = r14.getStyle()
            com.badlogic.gdx.graphics.Color r14 = r14.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r14.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13.mInfoLabel
            java.lang.String r0 = "errorNameTaken"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r14.setText(r0)
            r13.doNotHideDialog()
            return
        L7a:
            r14 = 0
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r13.mSpriteRef     // Catch: java.lang.IllegalStateException -> L82
            byte[] r14 = r0.getPixels()     // Catch: java.lang.IllegalStateException -> L82
            goto L83
        L82:
        L83:
            if (r14 != 0) goto La5
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13.mInfoLabel
            java.lang.String r0 = "error"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " (no_pixmap)"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.setText(r0)
            r13.doNotHideDialog()
            return
        La5:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r13.mSpriteRef
            com.badlogic.gdx.graphics.Texture r0 = r0.getTexture()
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            com.badlogic.gdx.graphics.TextureData r0 = r0.getTextureData()
            com.badlogic.gdx.graphics.Pixmap$Format r0 = r0.getFormat()
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r5 = 0
            if (r0 != r3) goto Lc3
            r0 = 1
            r6 = 1
            goto Lc4
        Lc3:
            r6 = 0
        Lc4:
            if (r6 == 0) goto Le2
            int r0 = r14.length
        Lc7:
            if (r5 >= r0) goto Le2
            r3 = r14[r5]
            int r7 = r5 + 1
            r8 = r14[r7]
            int r9 = r5 + 2
            r10 = r14[r9]
            int r11 = r5 + 3
            r12 = r14[r11]
            r14[r5] = r12
            r14[r7] = r3
            r14[r9] = r8
            r14[r11] = r10
            int r5 = r5 + 4
            goto Lc7
        Le2:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r7 = r0.getPlatformPNGEncoder()
            java.lang.String r3 = org.fortheloss.sticknodes.App.spritesPath
            r5 = 0
            r0 = r7
            r0.begin(r1, r2, r3, r4, r5)
            r7.passPixels(r14, r6)
            r7.dispose()
            r13.onSaveFinished()
        Lf8:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mInfoLabel = r0
            r1.mTextField = r0
            r1.mSpriteRef = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.sprite.SpriteRef r4) {
            r3 = this;
            java.lang.String r0 = "saveSpriteToFileTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r3.mSpriteRef = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "saveSpriteToFileInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2)
            r4.<init>(r0, r1)
            r3.mInfoLabel = r4
            r0 = 1
            r4.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
            r4.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r4)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r4.width(r1)
            r3.addContentRow()
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r3.mSpriteRef
            java.lang.String r4 = r4.getName()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r1.<init>()
            r2 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.createTextField(r4, r2, r1)
            r3.mTextField = r4
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.setBlinkTime(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.mTextField
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r1.<init>()
            r4.setTextFieldFilter(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.mTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.SaveSpriteToFileDialog$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SaveSpriteToFileDialog$1
            r1.<init>(r3)
            r4.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.mTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r4)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r1 = (float) r1
            r4.height(r1)
            java.lang.String r4 = "save"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.addButton(r4, r1)
            java.lang.String r4 = "cancel"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.addButton(r4, r0)
            return
    }

    protected void onSaveFinished() {
            r0 = this;
            r0 = 0
            throw r0
    }
}
