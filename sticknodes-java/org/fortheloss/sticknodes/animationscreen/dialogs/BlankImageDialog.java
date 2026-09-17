package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class BlankImageDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    public BlankImageDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void initialize(java.lang.String r2, java.lang.String r3, com.badlogic.gdx.graphics.Texture r4, java.util.HashMap<java.lang.Integer, java.lang.String> r5) {
            r1 = this;
            super.initialize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3, r0)
            r3 = 1
            r2.setWrap(r3)
            r2.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r2)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r2.width(r0)
            r1.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.align(r3)
            java.lang.String r2 = "okay"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.addButton(r2, r3)
            if (r5 == 0) goto L72
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L72
            java.util.Set r2 = r5.keySet()
            java.util.Iterator r2 = r2.iterator()
        L54:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r4 = r5.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L54
            if (r4 == 0) goto L54
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r1.createTextButton(r4)
            r1.addButton(r4, r3)
            goto L54
        L72:
            return
    }
}
