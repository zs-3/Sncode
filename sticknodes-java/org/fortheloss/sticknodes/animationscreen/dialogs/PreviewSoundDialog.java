package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PreviewSoundDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _playStopSoundButton;
    private com.badlogic.gdx.audio.Sound _sound;
    private boolean _soundAssumedPlaying;

    public PreviewSoundDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._soundAssumedPlaying = r1
            return
    }

    private void onPlayStopPress() {
            r2 = this;
            com.badlogic.gdx.audio.Sound r0 = r2._sound
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2._soundAssumedPlaying
            if (r1 == 0) goto L1b
            r1 = 0
            r2._soundAssumedPlaying = r1
            r0.stop()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._playStopSoundButton
            java.lang.String r1 = "playSound"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r0.setText(r1)
            goto L2c
        L1b:
            r1 = 1
            r2._soundAssumedPlaying = r1
            r0.play()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._playStopSoundButton
            java.lang.String r1 = "stopSound"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r0.setText(r1)
        L2c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            super.dialogResult(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L11
            r0.onPlayStopPress()
            r0.doNotHideDialog()
        L11:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._playStopSoundButton = r0
            com.badlogic.gdx.audio.Sound r1 = r2._sound
            if (r1 == 0) goto L11
            r1.stop()
            com.badlogic.gdx.audio.Sound r1 = r2._sound
            r1.dispose()
            r2._sound = r0
        L11:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.files.FileHandle r8) {
            r7 = this;
            java.lang.String r0 = "previewSoundTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            long r0 = r8.length()
            r2 = 0
            r3 = 1
            r4 = 256000(0x3e800, double:1.26481E-318)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L2a
            com.badlogic.gdx.Audio r1 = com.badlogic.gdx.Gdx.audio     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L24
            com.badlogic.gdx.audio.Sound r1 = r1.newSound(r8)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L24
            r7._sound = r1     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L24
            goto L2a
        L24:
            r0 = move-exception
            r1 = 2
            r0.printStackTrace()
            r0 = 2
        L2a:
            if (r0 <= 0) goto L57
            if (r0 != r3) goto L35
            java.lang.String r8 = "errorImportSoundInfo3"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            goto L3b
        L35:
            java.lang.String r8 = "errorImportSoundInfo1"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
        L3b:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r8, r1)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r8.width(r0)
            goto La3
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "previewSoundInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r8 = r8.name()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "\n\n"
            r4.append(r1)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r8, r1)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r8.width(r0)
            java.lang.String r8 = "playSound"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            r7._playStopSoundButton = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.addButton(r8, r0)
        La3:
            java.lang.String r8 = "okay"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r7.addButton(r8, r0)
            return
    }
}
