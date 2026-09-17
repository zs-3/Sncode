package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ExportGifPngMp4Dialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _gifButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _mp4Button;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pngButton;




    /* renamed from: -$$Nest$monGIFClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m453$$Nest$monGIFClick(org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog r0) {
            r0.onGIFClick()
            return
    }

    /* renamed from: -$$Nest$monMP4Click, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m454$$Nest$monMP4Click(org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog r0) {
            r0.onMP4Click()
            return
    }

    /* renamed from: -$$Nest$monPNGClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m455$$Nest$monPNGClick(org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog r0) {
            r0.onPNGClick()
            return
    }

    public ExportGifPngMp4Dialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void onGIFClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            r1 = 0
            r0.showExportDialog(r1)
            r2.hideImmediately()
            return
    }

    private void onMP4Click() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            r1 = 1
            r0.showExportDialog(r1)
            r2.hideImmediately()
            return
    }

    private void onPNGClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            r1 = 2
            r0.showExportDialog(r1)
            r2.hideImmediately()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animateToolsModuleRef = r0
            r1._gifButton = r0
            r1._pngButton = r0
            r1._mp4Button = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r7) {
            r6 = this;
            java.lang.String r0 = "exportDialogTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r6.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r1, r1)
            r0.expand(r1, r1)
            r6._animateToolsModuleRef = r7
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "exportDialogInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r1.<init>(r2)
            r7.<init>(r0, r1)
            r0 = 1
            r7.setWrap(r0)
            r7.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.addContent(r7)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.width(r1)
            r1 = 3
            r7.colspan(r1)
            r6.addContentRow()
            java.lang.String r7 = "GIF"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            r6._gifButton = r7
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog$1
            r1.<init>(r6)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._gifButton
            r6.addContent(r7)
            java.lang.String r7 = "PNG"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            r6._pngButton = r7
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog$2 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog$2
            r1.<init>(r6)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._pngButton
            r6.addContent(r7)
            java.lang.String r7 = "MP4"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            r6._mp4Button = r7
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog$3 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog$3
            r1.<init>(r6)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._mp4Button
            r6.addContent(r7)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "exportDialogGIF"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r2.<init>(r3)
            r7.<init>(r1, r2)
            r7.setWrap(r0)
            r7.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.addContent(r7)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r2 = 1050924810(0x3ea3d70a, float:0.32)
            float r1 = r1 * r2
            r7.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "exportDialogPNG"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r3.<init>(r4)
            r7.<init>(r1, r3)
            r7.setWrap(r0)
            r7.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.addContent(r7)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            float r1 = r1 * r2
            r7.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "exportDialogMP4"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 == 0) goto Lf2
            java.lang.String r3 = ""
            goto L10e
        Lf2:
            java.lang.String r3 = "exportDialogMP4Locked"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " ("
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L10e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r3.<init>(r4)
            r7.<init>(r1, r3)
            r7.setWrap(r0)
            r7.setAlignment(r0)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L14a
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r7.setColor(r0, r0, r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r6._mp4Button
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r6._mp4Button
            r3.setColor(r0, r0, r0, r1)
        L14a:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.addContent(r7)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            float r0 = r0 * r2
            r7.width(r0)
            r6.addContentRow()
            java.lang.String r7 = "cancel"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.addButton(r7, r0)
            return
    }
}
