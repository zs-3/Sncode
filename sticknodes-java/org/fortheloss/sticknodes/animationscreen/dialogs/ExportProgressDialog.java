package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ExportProgressDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _cancelButton;
    private org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget _exportingAnimationWidget;
    private org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper _gifExportLooperRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _messageLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _messageLabelBottom;
    private org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper _mp4ExportLooperRef;
    private org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper _pngExportLooperRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _statusLabel;
    private int _type;


    /* renamed from: -$$Nest$fget_gifExportLooperRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper m474$$Nest$fget_gifExportLooperRef(org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r0) {
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r0 = r0._gifExportLooperRef
            return r0
    }

    /* renamed from: -$$Nest$fget_mp4ExportLooperRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper m475$$Nest$fget_mp4ExportLooperRef(org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r0) {
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r0 = r0._mp4ExportLooperRef
            return r0
    }

    /* renamed from: -$$Nest$fget_pngExportLooperRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper m476$$Nest$fget_pngExportLooperRef(org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r0) {
            org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r0 = r0._pngExportLooperRef
            return r0
    }

    /* renamed from: -$$Nest$fget_statusLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m477$$Nest$fget_statusLabel(org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._statusLabel
            return r0
    }

    public ExportProgressDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._type = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            int r3 = r2._type
            if (r3 != 0) goto La
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.cancelExport()
            goto L18
        La:
            r0 = 1
            if (r3 != r0) goto L13
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.cancelMP4Export()
            goto L18
        L13:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.cancelPNGExport()
        L18:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2._cancelButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2._cancelButton
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r1, r1, r1, r0)
            r2.doNotHideDialog()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._messageLabel = r0
            r2._messageLabelBottom = r0
            org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget r1 = r2._exportingAnimationWidget
            if (r1 == 0) goto Le
            r1.dispose()
            r2._exportingAnimationWidget = r0
        Le:
            r2._statusLabel = r0
            r2._cancelButton = r0
            r2._gifExportLooperRef = r0
            r2._mp4ExportLooperRef = r0
            r2._pngExportLooperRef = r0
            super.dispose()
            return
    }

    public void initialize(int r5, com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r6) {
            r4 = this;
            java.lang.String r0 = "exportProgressTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r4._type = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "exportProgressInfo1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r0, r1)
            r4._messageLabel = r5
            r0 = 1
            r5.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._messageLabel
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._messageLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r5.width(r1)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "exportProgressWarning"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r5.<init>(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r1.set(r2)
            r5.setWrap(r0)
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r5.width(r1)
            r4.addContentRow()
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog$1 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportProgressDialog$1
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r4, r6, r1)
            r4._exportingAnimationWidget = r5
            r4.addContent(r5)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "exportProgressInfo2"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r6, r1)
            r4._messageLabelBottom = r5
            r5.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._messageLabelBottom
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._messageLabelBottom
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r5.width(r6)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r1 = ""
            r5.<init>(r1, r6)
            r4._statusLabel = r5
            r6 = 0
            r5.setWrap(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._statusLabel
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._statusLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r5.width(r6)
            java.lang.String r5 = "cancel"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            r4._cancelButton = r5
            r6 = 0
            r4.addButton(r5, r6)
            return
    }

    public void setGIFExporterToReadFrom(org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper r1) {
            r0 = this;
            r0._gifExportLooperRef = r1
            return
    }

    public void setMP4ExporterToReadFrom(org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper r1) {
            r0 = this;
            r0._mp4ExportLooperRef = r1
            return
    }

    public void setPNGExporterToReadFrom(org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper r1) {
            r0 = this;
            r0._pngExportLooperRef = r1
            return
    }

    public void setPercent(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget r0 = r2._exportingAnimationWidget
            r1 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r1
            int r3 = (int) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "%"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.setText(r3)
            return
    }
}
