package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class FinishedExportingDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _filename;
    private int _type;

    public FinishedExportingDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._type = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4a
            int r4 = r3._type
            if (r4 != 0) goto L2a
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r1 = r3._filename
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ".gif"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.shareGif(r0)
            goto L47
        L2a:
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r1 = r3._filename
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ".mp4"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.shareMP4(r0)
        L47:
            r3.doNotHideDialog()
        L4a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._filename = r0
            super.dispose()
            return
    }

    public void initialize(java.lang.String r6, int r7) {
            r5 = this;
            java.lang.String r0 = "finishedExportingTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r5._type = r7
            r5._filename = r6
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            org.fortheloss.framework.Assets r6 = r6.getAssets()
            java.lang.String r0 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r2 = 1
            java.lang.Object r6 = r6.get(r0, r1, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r6
            r0 = 0
            java.lang.String r1 = "finishedExportingInfo1"
            if (r7 != 0) goto L32
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r3 = "animatedGifFile"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r7[r0] = r3
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r1, r7)
            goto L4d
        L32:
            if (r7 != r2) goto L43
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r3 = "mp4VideoFile"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r7[r0] = r3
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r1, r7)
            goto L4d
        L43:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r3 = "PNG"
            r7[r0] = r3
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r1, r7)
        L4d:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r7, r1)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.addContent(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r7.width(r0)
            int r7 = org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer.errors
            if (r7 == 0) goto L117
            r0 = r7 & 4
            java.lang.String r1 = "\n\n"
            java.lang.String r3 = ""
            if (r0 == 0) goto L8d
            java.lang.String r0 = "exportRenderError1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            goto Lab
        L8d:
            r0 = r7 & 2
            if (r0 == 0) goto Laa
            java.lang.String r0 = "exportRenderError2"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            goto Lab
        Laa:
            r1 = r3
        Lab:
            r7 = r7 & 8
            if (r7 == 0) goto Lc7
            java.lang.String r7 = "exportRenderError3"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r3 = r0.toString()
        Lc7:
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r6.findRegion(r0)
            r7.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.padTop(r7)
            r6.fillX()
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r0)
            r6.<init>(r3, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = r6.getStyle()
            com.badlogic.gdx.graphics.Color r7 = r7.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r7.set(r0)
            r6.setWrap(r2)
            r6.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            r6.width(r7)
        L117:
            java.lang.String r6 = "okay"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.addButton(r6, r7)
            return
    }
}
