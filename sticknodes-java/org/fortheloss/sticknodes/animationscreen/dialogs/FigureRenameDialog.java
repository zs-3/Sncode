package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class FigureRenameDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private int _figureType;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _infoLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _nameTextField;
    private java.lang.String _originalName;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;





    /* renamed from: -$$Nest$fget_nameTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m479$$Nest$fget_nameTextField(org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._nameTextField
            return r0
    }

    public FigureRenameDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._figureType = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r5) {
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L10f
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._nameTextField
            java.lang.String r5 = r5.getText()
            java.lang.String r5 = r5.trim()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._nameTextField
            r0.setText(r5)
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lf0
            java.lang.String r0 = r4._originalName
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            goto Lf0
        L29:
            int r0 = r4._figureType
            java.lang.String r1 = "addToLibraryNameTaken"
            r2 = 1
            if (r0 != 0) goto L6c
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            int r3 = r0.size()
            int r3 = r3 - r2
        L39:
            if (r3 < 0) goto Le6
            java.lang.Object r2 = r0.get(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L69
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r5.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            r5.setText(r0)
            r4.doNotHideDialog()
            return
        L69:
            int r3 = r3 + (-1)
            goto L39
        L6c:
            if (r0 != r2) goto Laa
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r0.libraryMovieclips
            int r3 = r0.size()
            int r3 = r3 - r2
        L77:
            if (r3 < 0) goto Le6
            java.lang.Object r2 = r0.get(r3)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto La7
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r5.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            r5.setText(r0)
            r4.doNotHideDialog()
            return
        La7:
            int r3 = r3 + (-1)
            goto L77
        Laa:
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r0.librarySprites
            int r3 = r0.size()
            int r3 = r3 - r2
        Lb3:
            if (r3 < 0) goto Le6
            java.lang.Object r2 = r0.get(r3)
            org.fortheloss.sticknodes.sprite.ISpriteSource r2 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto Le3
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r5.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            r5.setText(r0)
            r4.doNotHideDialog()
            return
        Le3:
            int r3 = r3 + (-1)
            goto Lb3
        Le6:
            r4.onNameChanged(r5)
            com.badlogic.gdx.Input r5 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r5.setOnscreenKeyboardVisible(r0)
            goto L10f
        Lf0:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r5.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            java.lang.String r0 = "pleaseName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5.setText(r0)
            r4.doNotHideDialog()
        L10f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._projectDataRef = r0
            r1._infoLabel = r0
            r1._nameTextField = r0
            r1._originalName = r0
            super.dispose()
            return
    }

    public void initialize(int r4, org.fortheloss.sticknodes.data.ProjectData r5, int r6) {
            r3 = this;
            java.lang.String r0 = "renameFigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r3._figureType = r4
            r3._projectDataRef = r5
            r0 = 1
            if (r4 != 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r4 = r5.libraryStickfigures
            java.lang.Object r4 = r4.get(r6)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            java.lang.String r4 = r4.getName()
            goto L38
        L1d:
            if (r4 != r0) goto L2c
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r4 = r5.libraryMovieclips
            java.lang.Object r4 = r4.get(r6)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r4
            java.lang.String r4 = r4.getName()
            goto L38
        L2c:
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r4 = r5.librarySprites
            java.lang.Object r4 = r4.get(r6)
            org.fortheloss.sticknodes.sprite.ISpriteSource r4 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r4
            java.lang.String r4 = r4.getName()
        L38:
            r3._originalName = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r4, r6)
            r5.setWrap(r0)
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r3.addContent(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r5.width(r6)
            r3.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "renameTo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ":"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2)
            r5.<init>(r6, r1)
            r3._infoLabel = r5
            r5.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r3._infoLabel
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r3._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r3.addContent(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r5.width(r6)
            r3.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3.createTextField(r4)
            r3._nameTextField = r4
            r5 = 1056964608(0x3f000000, float:0.5)
            r4.setBlinkTime(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._nameTextField
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r5 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r5.<init>()
            r4.setTextFieldFilter(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._nameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$1 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$1
            r5.<init>(r3)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r3._nameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r4)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            r4.height(r5)
            r3.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.defaults()
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r6, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expand(r6, r6)
            r5.fill(r6, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r3.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            r5.fillX()
            java.lang.String r5 = "copy"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r3.createTextButton(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$2 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$2
            r6.<init>(r3)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r5)
            float r5 = r5.getHeight()
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r5 = r5 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r6.height(r5)
            r6 = 16
            r5.align(r6)
            java.lang.String r5 = "paste"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r3.createTextButton(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$3 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$3
            r6.<init>(r3)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r5)
            float r5 = r5.getHeight()
            float r5 = r5 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r6.height(r5)
            r5.align(r0)
            java.lang.String r5 = "clear"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r3.createTextButton(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$4 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.FigureRenameDialog$4
            r6.<init>(r3)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r5)
            float r5 = r5.getHeight()
            float r5 = r5 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.height(r5)
            r5 = 8
            r4.align(r5)
            java.lang.String r4 = "rename"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.addButton(r4, r5)
            java.lang.String r4 = "cancel"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.createTextButton(r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.addButton(r4, r5)
            return
    }

    protected void onNameChanged(java.lang.String r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
