package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class IOSMP3DownloadConfirmDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _emptyNameString;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _instructionsLabel;
    private org.fortheloss.framework.IMP3FromURLDownloader _mp3FromURLDownloaderRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _textfield;
    private java.lang.String _urlRef;


    public IOSMP3DownloadConfirmDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.framework.IMP3FromURLDownloader r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0._mp3FromURLDownloaderRef = r2
            r0._urlRef = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L59
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._textfield
            java.lang.String r4 = r4.getText()
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L32
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r4.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._instructionsLabel
            java.lang.String r0 = r3._emptyNameString
            r4.setText(r0)
            r3.doNotHideDialog()
            goto L59
        L32:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "IOSMP3DownloadConfirmDialog_download_mp3_from_url"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.framework.IMP3FromURLDownloader r0 = r3._mp3FromURLDownloaderRef
            java.lang.String r1 = r3._urlRef
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = ".mp3"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.downloadMP3FromURL(r1, r4)
            com.badlogic.gdx.Input r4 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r4.setOnscreenKeyboardVisible(r0)
        L59:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._instructionsLabel = r0
            r1._textfield = r0
            r1._mp3FromURLDownloaderRef = r0
            r1._urlRef = r0
            r1._emptyNameString = r0
            super.dispose()
            return
    }

    public void initialize() {
            r5 = this;
            java.lang.String r0 = r5._urlRef
            if (r0 != 0) goto L7
            java.lang.String r0 = "iosMP3DownloaderProblemTitle"
            goto L9
        L7:
            java.lang.String r0 = "iosMP3DownloaderTitle"
        L9:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            java.lang.String r0 = r5._urlRef
            if (r0 != 0) goto L17
            java.lang.String r0 = "iosMP3DownloaderProblemInfo"
            goto L19
        L17:
            java.lang.String r0 = "iosMP3DownloaderInfo"
        L19:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "emptySoundName"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r5._emptyNameString = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r1.<init>(r0, r2)
            r5._instructionsLabel = r1
            r0 = 1
            r1.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r5._instructionsLabel
            r1.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r5._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.addContent(r1)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r1.width(r3)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = r5._urlRef
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r3, r4)
            r1.setWrap(r0)
            r1.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r1.width(r3)
            r5.addContentRow()
            java.lang.String r1 = r5._urlRef
            if (r1 == 0) goto Le9
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "nameThisSound"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r3, r4)
            r5.addContent(r1)
            r5.addContentRow()
            r1 = -1
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r3 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r3.<init>()
            java.lang.String r4 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r5.createTextField(r4, r1, r3)
            r5._textfield = r1
            org.fortheloss.sticknodes.animationscreen.dialogs.IOSMP3DownloadConfirmDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.IOSMP3DownloadConfirmDialog$1
            r3.<init>(r5)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r5._textfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.addContent(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r3 = (float) r3
            r1.height(r3)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "iosMP3DownloaderInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r3, r4)
            r1.setWrap(r0)
            r1.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r5.addContentRow()
        Le9:
            java.lang.String r0 = r5._urlRef
            if (r0 == 0) goto Lfc
            java.lang.String r0 = "download"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.addButton(r0, r1)
        Lfc:
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.addButton(r0, r1)
            return
    }
}
