package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class StickfigureCreationBackupsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule _animationBasedModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _deleteAllButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _deleteButton;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _fileList;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _importNameTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _instructionsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _previewButtonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _restoreButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;







    /* renamed from: -$$Nest$fget_instructionsLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m629$$Nest$fget_instructionsLabel(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._instructionsLabel
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m630$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$mgetFileExtension, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m631$$Nest$mgetFileExtension(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog r0, java.lang.String r1) {
            java.lang.String r0 = r0.getFileExtension(r1)
            return r0
    }

    /* renamed from: -$$Nest$mlistModified, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m632$$Nest$mlistModified(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog r0) {
            r0.listModified()
            return
    }

    /* renamed from: -$$Nest$mupdateFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m633$$Nest$mupdateFiles(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog r0) {
            r0.updateFiles()
            return
    }

    public StickfigureCreationBackupsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "nodes"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.setExtensions(r1)
            return
    }

    private java.lang.String getFileExtension(java.lang.String r2) {
            r1 = this;
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 <= 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            goto L11
        Lf:
            java.lang.String r2 = ""
        L11:
            return r2
    }

    private void listModified() {
            r4 = this;
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r4._fileList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r0 = r0.size
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L35
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r4._fileList
            r2 = 0
            r0.setSelectedIndex(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._restoreButton
            if (r0 == 0) goto L59
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._restoreButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteAllButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteAllButton
            r0.setTouchable(r2)
            goto L59
        L35:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._restoreButton
            if (r0 == 0) goto L59
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._restoreButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteButton
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteButton
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteAllButton
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteAllButton
            r0.setTouchable(r3)
        L59:
            return
    }

    private void updateFiles() {
            r4 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.stickfigureBackupsPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            com.badlogic.gdx.files.FileHandle[] r0 = r0.list()
            r1 = 0
            r2 = 1
            r4.addToFiles(r0, r1, r2)
            r4.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r4._fileList
            r4.setListItems(r0)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r4._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r0 = r0.getSelection()
            r0.clear()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r4._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            int r1 = r1 - r2
        L2b:
            if (r1 < 0) goto L39
            java.lang.Object r2 = r0.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            r2.clear()
            int r1 = r1 + (-1)
            goto L2b
        L39:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r4._previewButtons
            r0.clearChildren()
            r0 = 0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r1 = r4._files
            int r1 = r1.size
        L43:
            if (r0 >= r1) goto L6f
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r2.<init>(r3)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r3 = r4._files
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r3 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r3
            java.io.File r3 = r3.file
            java.lang.String r3 = r3.getAbsolutePath()
            r2.setUserObject(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$6 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$6
            r3.<init>(r4, r2)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r4._previewButtons
            r3.addActor(r2)
            int r0 = r0 + 1
            goto L43
        L6f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r10) {
            r9 = this;
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 > 0) goto L9
            return
        L9:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r9._fileList
            java.lang.Object r0 = r0.getSelected()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L100
            int r1 = r0.length()
            if (r1 > 0) goto L1b
            goto L100
        L1b:
            r1 = 0
            r2 = 1
            java.lang.String r3 = "cancel"
            java.lang.String r4 = "yes"
            java.lang.String r5 = "areYouSureTitle"
            if (r10 != r2) goto L77
            com.badlogic.gdx.scenes.scene2d.ui.TextField r10 = r9._importNameTextfield
            java.lang.String r10 = r10.getText()
            java.lang.String r2 = ""
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L54
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = r9._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = r10.getStyle()
            com.badlogic.gdx.graphics.Color r10 = r10.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r10.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = r9._instructionsLabel
            java.lang.String r0 = "stickfigureEmptyName"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r10.setText(r0)
            r9.doNotHideDialog()
            goto Lfa
        L54:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r9._animationScreenRef
            r2.<init>(r9, r6, r0, r10)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r0 = "confirmRestoreBackup"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2.initialize(r10, r0, r4, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            r10.addDialogToStage(r2)
            goto Lfa
        L77:
            r6 = 2
            java.lang.String r7 = "\n\n"
            java.lang.String r8 = "permaDeleteStickfigureInfo"
            if (r10 != r6) goto Lbd
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$2 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r9._animationScreenRef
            r10.<init>(r9, r6, r0)
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "deletingFile"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r10.initialize(r5, r0, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            r0.addDialogToStage(r10)
            r9.doNotHideDialog()
            goto Lfa
        Lbd:
            r0 = 3
            if (r10 != r0) goto Lfa
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$3 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            r10.<init>(r9, r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.String r5 = "deletingAllFiles"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r7)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r10.initialize(r0, r2, r4, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            r0.addDialogToStage(r10)
            r9.doNotHideDialog()
        Lfa:
            com.badlogic.gdx.Input r10 = com.badlogic.gdx.Gdx.input
            r10.setOnscreenKeyboardVisible(r1)
            return
        L100:
            r9.doNotHideDialog()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationBasedModuleRef = r0
            r1._previewButtonsScrollPane = r0
            r1._scrollPane = r0
            r1._fileList = r0
            r1._instructionsLabel = r0
            r1._importNameTextfield = r0
            r1._previewButtons = r0
            r1._restoreButton = r0
            r1._deleteButton = r0
            r1._deleteAllButton = r0
            super.dispose()
            return
    }

    public void initialize() {
            r10 = this;
            java.lang.String r0 = "stickfigureBackupsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "viewBackupsInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            r2 = 3
            r0.colspan(r2)
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "stickfigureName"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r0.<init>(r3, r4)
            r10._instructionsLabel = r0
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r10._instructionsLabel
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r10._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r2)
            r10.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            java.lang.String r3 = ""
            r4 = 24
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10.createTextField(r3, r4, r0)
            r10._importNameTextfield = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$4 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$4
            r3.<init>(r10)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._importNameTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r3)
            r0.colspan(r2)
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r0.<init>(r3)
            org.fortheloss.framework.ListCustomItemHeight r3 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r5 = r0.getHeight()
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            float r7 = r0.getWidth()
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r6 = r6 - r7
            r7 = 1063675494(0x3f666666, float:0.9)
            float r6 = r6 * r7
            r3.<init>(r4, r5, r6)
            r10._fileList = r3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r3.<init>()
            r10._previewButtons = r3
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r3.align(r4)
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r3.pad(r5)
            r3.space(r5)
            r10.updateFiles()
            r10.listModified()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r10._fileList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r3.<init>(r5, r6)
            r10._scrollPane = r3
            r5 = 0
            r3.setFadeScrollBars(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$5 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureCreationBackupsDialog$5
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r10._previewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r3.<init>(r10, r6, r7)
            r10._previewButtonsScrollPane = r3
            r3.setFadeScrollBars(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r10._previewButtonsScrollPane
            r3.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r10._previewButtonsScrollPane
            r3.setSmoothScrolling(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r10._previewButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r10.addContent(r3)
            float r6 = r0.getWidth()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7 * r9
            float r6 = r6 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r5, r5)
            r6 = 16
            r3.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r10._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r10.addContent(r3)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            float r0 = r0.getWidth()
            float r0 = r0 * r8
            float r6 = r6 - r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.width(r6)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r5, r5)
            r3 = 8
            r0.align(r3)
            java.lang.String r0 = "restore"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            r10._restoreButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.addButton(r0, r1)
            java.lang.String r0 = "deleteDevice"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            r10._deleteButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r10.addButton(r0, r1)
            java.lang.String r0 = "deleteAll"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            r10._deleteAllButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r10.addButton(r0, r1)
            r10.listModified()
            return
    }

    protected void onSuccessfullImport() {
            r0 = this;
            r0 = 0
            throw r0
    }
}
