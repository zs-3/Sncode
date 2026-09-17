package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ExportRegionsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.Label mInfoLabel;
    private java.lang.String mTextData;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField mTextField;



    /* renamed from: -$$Nest$msaveToFile, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m478$$Nest$msaveToFile(org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog r0, java.lang.String r1) {
            r0.saveToFile(r1)
            return
    }

    public ExportRegionsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void saveToFile(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "errorSaving"
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L3b
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L3b
            java.lang.String r4 = r3.mTextData     // Catch: java.io.IOException -> L16
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.IOException -> L16
            byte[] r4 = r4.getBytes(r2)     // Catch: java.io.IOException -> L16
            r1.write(r4)     // Catch: java.io.IOException -> L16
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            return
        L16:
            r4 = move-exception
            r4.printStackTrace()
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r4.set(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4.setText(r0)
            r3.doNotHideDialog()
            return
        L3b:
            r4 = move-exception
            r4.printStackTrace()
            r4 = 0
            org.jcodec.common.io.IOUtils.closeQuietly(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r4.set(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4.setText(r0)
            r3.doNotHideDialog()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r7) {
            r6 = this;
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto Lb9
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r6.mTextField
            java.lang.String r7 = r7.getText()
            java.lang.String r7 = r7.trim()
            int r0 = r7.length()
            if (r0 > 0) goto L38
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r6.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = r7.getStyle()
            com.badlogic.gdx.graphics.Color r7 = r7.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r7.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r6.mInfoLabel
            java.lang.String r0 = "exportRegionsInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r7.setText(r0)
            r6.doNotHideDialog()
            return
        L38:
            java.lang.String r0 = org.fortheloss.sticknodes.App.spritesPath
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ".txt"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r1)
            boolean r2 = r2.exists()
            if (r2 == 0) goto Lb6
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r6.mInfoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r2.set(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r6.mInfoLabel
            java.lang.String r3 = "errorNameTaken"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2.setText(r3)
            r6.doNotHideDialog()
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r6._animationScreenRef
            r2.<init>(r6, r3, r1)
            java.lang.String r1 = "nameTakenTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r0)
            java.lang.String r7 = r5.toString()
            r3[r4] = r7
            java.lang.String r7 = "nameTakenInfo"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7, r3)
            java.lang.String r0 = "yes"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r3 = "no"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2.initialize(r1, r7, r0, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6._animationScreenRef
            r7.addDialogToStage(r2)
            return
        Lb6:
            r6.saveToFile(r1)
        Lb9:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mInfoLabel = r0
            r1.mTextField = r0
            r1.mTextData = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    public void initialize(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "exportRegionsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r3.mTextData = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "exportRegionsInfo"
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
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r4 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r4.<init>()
            java.lang.String r1 = ""
            r2 = -1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.createTextField(r1, r2, r4)
            r3.mTextField = r4
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.setBlinkTime(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.mTextField
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r1.<init>()
            r4.setTextFieldFilter(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.mTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog$2 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog$2
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
}
