package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MultiSoundImportErrorDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    public MultiSoundImportErrorDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void initialize(java.util.ArrayList<java.lang.String> r7, int r8) {
            r6 = this;
            java.lang.String r0 = "errorImportingSoundTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            int r0 = r7.size()
            r1 = 0
            r2 = 1
            if (r0 != r8) goto L19
            java.lang.String r8 = "errorImportMultipleSoundsInfo2"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r0 = 0
            goto L20
        L19:
            java.lang.String r8 = "errorImportMultipleSoundsInfo1"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r0 = 1
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r8, r4)
            r3.setWrap(r2)
            r3.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.addContent(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r8.width(r3)
            if (r0 == 0) goto L84
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r3 = ""
            r8.<init>(r3, r0)
            r8.setWrap(r2)
            r8.setAlignment(r2)
            int r0 = r7.size()
            r2 = r3
        L56:
            if (r1 >= r0) goto L75
            java.lang.Object r4 = r7.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            int r1 = r1 + 1
            java.lang.String r2 = ", "
            goto L56
        L75:
            r8.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.addContent(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            r7.width(r8)
        L84:
            java.lang.String r7 = "okay"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            r8 = 0
            r6.addButton(r7, r8)
            return
    }
}
