package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ExportMP4OverwriteDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private int _antiAlias;
    private boolean _applyAndroidResFix;
    private boolean _betterBlur;
    private int _endFrame;
    private int _exportHeight;
    private org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper _exportMP4DialogRef;
    private int _exportWidth;
    private java.lang.String _filename;
    private int _startFrame;
    private boolean _willEncodeAudio;
    private boolean _willUseOldMethod;

    public ExportMP4OverwriteDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._exportWidth = r1
            r0._exportHeight = r1
            r0._startFrame = r1
            r0._endFrame = r1
            r0._willUseOldMethod = r1
            r0._willEncodeAudio = r1
            r0._applyAndroidResFix = r1
            r0._betterBlur = r1
            r0._antiAlias = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r12) {
            r11 = this;
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L49
            com.badlogic.gdx.Files r12 = com.badlogic.gdx.Gdx.files
            java.lang.String r0 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r1 = r11._filename
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ".mp4"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.badlogic.gdx.files.FileHandle r12 = r12.absolute(r0)
            r12.delete()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            java.lang.String r1 = r11._filename
            int r2 = r11._exportWidth
            int r3 = r11._exportHeight
            int r4 = r11._startFrame
            int r5 = r11._endFrame
            boolean r6 = r11._willUseOldMethod
            boolean r7 = r11._willEncodeAudio
            boolean r8 = r11._applyAndroidResFix
            int r9 = r11._antiAlias
            boolean r10 = r11._betterBlur
            r0.beginMP4Export(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r12 = r11._exportMP4DialogRef
            if (r12 == 0) goto L49
            r12.hideImmediately()
        L49:
            com.badlogic.gdx.Input r12 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r12.setOnscreenKeyboardVisible(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._filename = r0
            r1._exportMP4DialogRef = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, boolean r9, int r10, boolean r11, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r12) {
            r1 = this;
            java.lang.String r0 = "filenameConflictTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r1._filename = r2
            r1._exportWidth = r3
            r1._exportHeight = r4
            r1._startFrame = r5
            r1._endFrame = r6
            r1._willUseOldMethod = r7
            r1._willEncodeAudio = r8
            r1._applyAndroidResFix = r9
            r1._antiAlias = r10
            r1._betterBlur = r11
            r1._exportMP4DialogRef = r12
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r2 = ".mp4"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r6 = 0
            r5[r6] = r2
            java.lang.String r2 = "overwriteInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r2, r5)
            r3.setWrap(r4)
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r2.width(r3)
            java.lang.String r2 = "yesOverwrite"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.addButton(r2, r3)
            java.lang.String r2 = "noCancel"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.addButton(r2, r3)
            return
    }
}
