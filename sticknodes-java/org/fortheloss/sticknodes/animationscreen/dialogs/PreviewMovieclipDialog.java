package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PreviewMovieclipDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.framework.AnimationWidget _animationWidget;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> _textureArray;

    public PreviewMovieclipDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            super.dialogResult(r1)
            r0.hideImmediately()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            org.fortheloss.framework.AnimationWidget r0 = r3._animationWidget
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r3._animationWidget = r1
        La:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r0 = r3._textureArray
            if (r0 == 0) goto L24
            int r0 = r0.size
            int r0 = r0 + (-1)
        L12:
            if (r0 < 0) goto L22
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r2 = r3._textureArray
            java.lang.Object r2 = r2.get(r0)
            com.badlogic.gdx.graphics.Texture r2 = (com.badlogic.gdx.graphics.Texture) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L12
        L22:
            r3._textureArray = r1
        L24:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.files.FileHandle r14) {
            r13 = this;
            java.lang.String r0 = "movieclipPreviewTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.movieclip.MCPreviewProperties r0 = org.fortheloss.sticknodes.movieclip.MCMovieclipSource.getPreviewProperties(r14)
            r1 = 1
            if (r0 == 0) goto Lf9
            int r2 = r0.numFrames
            int r3 = r0.numStickfigures
            int r4 = r0.numSprites
            int r5 = r0.numSounds
            if (r5 != 0) goto L21
            java.lang.String r5 = "noneLowercase"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            goto L25
        L21:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L25:
            r6 = 0
            com.badlogic.gdx.graphics.Pixmap[] r7 = r0.previewFrames
            r8 = 0
            if (r7 == 0) goto L60
            int r6 = r7.length
            com.badlogic.gdx.utils.Array r7 = new com.badlogic.gdx.utils.Array
            r7.<init>(r6)
            com.badlogic.gdx.utils.Array r9 = new com.badlogic.gdx.utils.Array
            r9.<init>(r6)
            r13._textureArray = r9
            r9 = 0
        L39:
            if (r9 >= r6) goto L5f
            com.badlogic.gdx.graphics.Pixmap[] r10 = r0.previewFrames
            r10 = r10[r9]
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r11 = r13._textureArray
            com.badlogic.gdx.graphics.Texture r12 = new com.badlogic.gdx.graphics.Texture
            r12.<init>(r10, r8)
            r11.add(r12)
            com.badlogic.gdx.graphics.g2d.Sprite r10 = new com.badlogic.gdx.graphics.g2d.Sprite
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r11 = r13._textureArray
            java.lang.Object r11 = r11.get(r9)
            com.badlogic.gdx.graphics.Texture r11 = (com.badlogic.gdx.graphics.Texture) r11
            r10.<init>(r11)
            r10.flip(r8, r1)
            r7.add(r10)
            int r9 = r9 + 1
            goto L39
        L5f:
            r6 = r7
        L60:
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r10 = ""
            r7.<init>(r10, r9)
            r7.setWrap(r1)
            r7.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r13.addContent(r7)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r7.width(r9)
            r13.addContentRow()
            if (r6 == 0) goto La8
            org.fortheloss.framework.AnimationWidget r7 = new org.fortheloss.framework.AnimationWidget
            com.badlogic.gdx.graphics.g2d.Animation r9 = new com.badlogic.gdx.graphics.g2d.Animation
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r11 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r9.<init>(r10, r6, r11)
            r7.<init>(r9, r1)
            r13._animationWidget = r7
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.setScaleY(r6)
            org.fortheloss.framework.AnimationWidget r6 = r13._animationWidget
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r13.addContent(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.align(r1)
            r13.addContentRow()
        La8:
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = r14.nameWithoutExtension()
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7[r1] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r7[r2] = r3
            r2 = 3
            r7[r2] = r5
            java.lang.String r2 = "movieclipPreviewStats2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            r3.append(r2)
            java.lang.String r14 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r14, r2)
            r6.setWrap(r1)
            r6.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r6)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r14.width(r2)
            r0.dispose()
            goto L11a
        Lf9:
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "errorImportingInfo1MC"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r0, r2)
            r14.setWrap(r1)
            r14.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r14.width(r0)
        L11a:
            java.lang.String r14 = "okay"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13.createTextButton(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r13.addButton(r14, r0)
            return
    }
}
