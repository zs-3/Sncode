package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class FileRenameDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearButton;
    private com.badlogic.gdx.files.FileHandle _containingFolder;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _infoLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _nameTextField;
    private java.lang.String _originalName;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteButton;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.files.FileHandle _renamingFile;





    /* renamed from: -$$Nest$fget_nameTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m480$$Nest$fget_nameTextField(org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._nameTextField
            return r0
    }

    public FileRenameDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r5) {
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._nameTextField
            java.lang.String r5 = r5.getText()
            java.lang.String r5 = r5.trim()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._nameTextField
            r0.setText(r5)
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto La5
            java.lang.String r0 = r4._originalName
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            goto La5
        L29:
            com.badlogic.gdx.files.FileHandle r0 = r4._containingFolder
            com.badlogic.gdx.files.FileHandle[] r0 = r0.list()
            int r1 = r0.length
            int r1 = r1 + (-1)
        L32:
            if (r1 < 0) goto L63
            r2 = r0[r1]
            java.lang.String r2 = r2.nameWithoutExtension()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L60
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r5.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._infoLabel
            java.lang.String r0 = "addToLibraryNameTaken"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5.setText(r0)
            r4.doNotHideDialog()
            return
        L60:
            int r1 = r1 + (-1)
            goto L32
        L63:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r4._containingFolder
            java.lang.String r1 = r1.path()
            com.badlogic.gdx.files.FileHandle r2 = r4._renamingFile
            java.lang.String r2 = r2.extension()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = "."
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            com.badlogic.gdx.files.FileHandle r1 = r4._renamingFile
            r1.copyTo(r0)
            com.badlogic.gdx.files.FileHandle r0 = r4._renamingFile
            r0.delete()
            r4.onNameChanged(r5)
            com.badlogic.gdx.Input r5 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r5.setOnscreenKeyboardVisible(r0)
            goto Lc4
        La5:
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
        Lc4:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._projectDataRef = r0
            r1._infoLabel = r0
            r1._nameTextField = r0
            r1._copyButton = r0
            r1._pasteButton = r0
            r1._clearButton = r0
            r1._originalName = r0
            r1._containingFolder = r0
            r1._renamingFile = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.files.FileHandle r5, com.badlogic.gdx.files.FileHandle r6) {
            r4 = this;
            java.lang.String r0 = "renameFigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r4._containingFolder = r5
            r4._renamingFile = r6
            java.lang.String r5 = r6.nameWithoutExtension()
            r4._originalName = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r5, r1)
            r5 = 1
            r0.setWrap(r5)
            r0.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "renameTo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ":"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r4._infoLabel = r0
            r0.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._infoLabel
            r0.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r4.addContentRow()
            java.lang.String r6 = r6.nameWithoutExtension()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r4.createTextField(r6)
            r4._nameTextField = r6
            r0 = 1056964608(0x3f000000, float:0.5)
            r6.setBlinkTime(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r4._nameTextField
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            r6.setTextFieldFilter(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r4._nameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$1
            r0.<init>(r4)
            r6.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r4._nameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.addContent(r6)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r0 = (float) r0
            r6.height(r0)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.defaults()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expand(r1, r1)
            r0.fill(r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.addContent(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            java.lang.String r0 = "copy"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4.createTextButton(r0, r1)
            r4._copyButton = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$2 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$2
            r1.<init>(r4)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._copyButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r4._copyButton
            float r1 = r1.getHeight()
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r1 = 16
            r0.align(r1)
            java.lang.String r0 = "paste"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4.createTextButton(r0, r1)
            r4._pasteButton = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$3 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$3
            r1.<init>(r4)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._pasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r4._pasteButton
            float r1 = r1.getHeight()
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r5)
            java.lang.String r5 = "clear"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5, r0)
            r4._clearButton = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$4 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.FileRenameDialog$4
            r0.<init>(r4)
            r5.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r6.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r4._clearButton
            float r6 = r6.getHeight()
            float r6 = r6 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r6)
            r6 = 8
            r5.align(r6)
            java.lang.String r5 = "rename"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.addButton(r5, r6)
            java.lang.String r5 = "cancel"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.addButton(r5, r6)
            return
    }

    protected void onNameChanged(java.lang.String r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
