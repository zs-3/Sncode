package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SavePromptDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private long _lastSaveMillis;
    private com.badlogic.gdx.graphics.Texture _texture;

    public SavePromptDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, long r3) {
            r0 = this;
            r0.<init>(r1)
            r0._animateToolsModuleRef = r2
            r0._lastSaveMillis = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            r1 = 1
            if (r0 != r1) goto Lf
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModuleRef
            r3.save()
            goto L1b
        Lf:
            int r3 = r3.intValue()
            r0 = 2
            if (r3 != r0) goto L1b
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r2._animateToolsModuleRef
            r3.saveAs()
        L1b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animateToolsModuleRef = r0
            com.badlogic.gdx.graphics.Texture r1 = r2._texture
            if (r1 == 0) goto Lc
            r1.dispose()
            r2._texture = r0
        Lc:
            super.dispose()
            return
    }

    public void initialize() {
            r7 = this;
            java.lang.String r0 = "rememberToSaveTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            r0.uniform(r1, r1)
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7._lastSaveMillis
            long r2 = r2 - r4
            r4 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 / r4
            int r0 = (int) r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r7._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r2 = r2.getProjectData()
            java.lang.String r2 = r2.projectName
            java.lang.String r3 = ": "
            java.lang.String r4 = "projectName"
            if (r2 == 0) goto L51
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L36
            goto L51
        L36:
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r2 = r2.trim()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto L6d
        L51:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r4 = "projectNotSaved"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
        L6d:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r1] = r6
            java.lang.String r1 = "rememberToSaveInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "\n\n"
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r1, r2)
            r3.setWrap(r4)
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.addContent(r3)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            r1.width(r2)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto Lbb
            java.lang.String r1 = "HD/"
            goto Lbd
        Lbb:
            java.lang.String r1 = "SD/"
        Lbd:
            r2 = 10
            if (r0 > r2) goto Lc4
            java.lang.String r0 = "textures/saveReminder1.png"
            goto Ldb
        Lc4:
            r2 = 15
            if (r0 > r2) goto Lcb
            java.lang.String r0 = "textures/saveReminder2.png"
            goto Ldb
        Lcb:
            r2 = 30
            if (r0 > r2) goto Ld2
            java.lang.String r0 = "textures/saveReminder3.png"
            goto Ldb
        Ld2:
            r2 = 60
            if (r0 > r2) goto Ld9
            java.lang.String r0 = "textures/saveReminder4.png"
            goto Ldb
        Ld9:
            java.lang.String r0 = "textures/saveReminder5.png"
        Ldb:
            com.badlogic.gdx.graphics.Texture r2 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.badlogic.gdx.files.FileHandle r0 = r3.internal(r0)
            r2.<init>(r0)
            r7._texture = r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r0.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.addContent(r0)
            r0.align(r4)
            java.lang.String r0 = "save"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r7.addButton(r0, r1)
            java.lang.String r0 = "saveAs"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.createTextButton(r0)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.createTextButton(r0)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.addButton(r0, r1)
            return
    }
}
