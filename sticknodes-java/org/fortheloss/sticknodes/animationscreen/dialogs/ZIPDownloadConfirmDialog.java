package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ZIPDownloadConfirmDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule _animationBasedModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _editButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _editButtonsScrollPane;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _fileList;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _importButton;
    private java.lang.String _importString;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _instructionsLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _prefixTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _previewButtonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private java.lang.String _unzippedFolderPath;







    /* renamed from: -$$Nest$fget_fileList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m663$$Nest$fget_fileList(org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._fileList
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m664$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_unzippedFolderPath, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m665$$Nest$fget_unzippedFolderPath(org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r0) {
            java.lang.String r0 = r0._unzippedFolderPath
            return r0
    }

    /* renamed from: -$$Nest$mgetFileExtension, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m666$$Nest$mgetFileExtension(org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r0, java.lang.String r1) {
            java.lang.String r0 = r0.getFileExtension(r1)
            return r0
    }

    /* renamed from: -$$Nest$msetNumSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m667$$Nest$msetNumSelections(org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog r0, int r1) {
            r0.setNumSelections(r1)
            return
    }

    public ZIPDownloadConfirmDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r5, java.lang.String r6) {
            r3 = this;
            r3.<init>(r4)
            r3._animationBasedModuleRef = r5
            r3._unzippedFolderPath = r6
            r4 = 1
            if (r6 == 0) goto L2c
            int r5 = r6.length()
            int r5 = r5 - r4
            char r5 = r6.charAt(r5)
            r6 = 47
            if (r5 == r6) goto L2c
            java.lang.String r5 = r3._unzippedFolderPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "/"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3._unzippedFolderPath = r5
        L2c:
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            boolean r5 = r5.isPro()
            java.lang.String r6 = "stknds"
            java.lang.String r0 = "nodemc"
            java.lang.String r1 = "stk"
            java.lang.String r2 = "nodes"
            if (r5 == 0) goto L43
            java.lang.String r5 = "mp3"
            java.lang.String[] r5 = new java.lang.String[]{r2, r1, r0, r5, r6}
            goto L47
        L43:
            java.lang.String[] r5 = new java.lang.String[]{r2, r1, r0, r6}
        L47:
            java.lang.String[] r4 = new java.lang.String[r4]
            r6 = 0
            java.lang.String r0 = r3._unzippedFolderPath
            r4[r6] = r0
            r3.setExtensions(r5)
            r3.setDirectories(r4)
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

    private java.lang.String getFileNameNoExtension(java.lang.String r3) {
            r2 = this;
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto Le
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            goto L10
        Le:
            java.lang.String r3 = ""
        L10:
            return r3
    }

    private void setNumSelections(int r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L2b
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._importButton
            java.lang.String r1 = r4._importString
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " (0)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._importButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._importButton
            r1 = 1056964608(0x3f000000, float:0.5)
            r5.setColor(r0, r0, r0, r1)
            goto L57
        L2b:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r4._importButton
            java.lang.String r2 = r4._importString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " ("
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.setText(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._importButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._importButton
            r5.setColor(r0, r0, r0, r0)
        L57:
            return
    }

    private void updateFiles() {
            r7 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = r7._unzippedFolderPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            com.badlogic.gdx.files.FileHandle[] r0 = r0.list()
            r1 = 0
            r2 = 1
            r7.addToFiles(r0, r1, r2)
            r7.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r7._fileList
            r7.setListItems(r0)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r7._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r0 = r0.getSelection()
            r0.clear()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r7._editButtons
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            int r1 = r1 - r2
        L2b:
            if (r1 < 0) goto L39
            java.lang.Object r3 = r0.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r3 = (com.badlogic.gdx.scenes.scene2d.Actor) r3
            r3.clear()
            int r1 = r1 + (-1)
            goto L2b
        L39:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r7._editButtons
            r0.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r7._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            int r1 = r1 - r2
        L47:
            if (r1 < 0) goto L55
            java.lang.Object r2 = r0.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            r2.clear()
            int r1 = r1 + (-1)
            goto L47
        L55:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r7._previewButtons
            r0.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallSpeakerImageButtonStyle()
            r0.<init>(r1)
            float r1 = r0.getWidth()
            float r0 = r0.getHeight()
            r2 = 0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r3 = r7._files
            int r3 = r3.size
        L70:
            if (r2 >= r3) goto Lfb
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallEditButtonStyle()
            r4.<init>(r5)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r5 = r7._files
            java.lang.Object r5 = r5.get(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r5
            java.io.File r5 = r5.file
            java.lang.String r5 = r5.getAbsolutePath()
            r4.setUserObject(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$5 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$5
            r5.<init>(r7, r4)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r7._editButtons
            r5.addActor(r4)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r4 = r7._files
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r4
            java.io.File r4 = r4.file
            java.lang.String r4 = r4.getAbsolutePath()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r5 = r7._files
            java.lang.Object r5 = r5.get(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r5
            java.io.File r5 = r5.file
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r5 = r7.getFileExtension(r5)
            java.lang.String r6 = "stknds"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto Lcc
            org.fortheloss.framework.SizeWidget r4 = new org.fortheloss.framework.SizeWidget
            r4.<init>(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r7._previewButtons
            r5.addActor(r4)
            goto Lf7
        Lcc:
            java.lang.String r6 = "mp3"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto Lde
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallSpeakerImageButtonStyle()
            r5.<init>(r6)
            goto Le7
        Lde:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r5.<init>(r6)
        Le7:
            r5.setUserObject(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$6 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$6
            r4.<init>(r7, r5)
            r5.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r7._previewButtons
            r4.addActor(r5)
        Lf7:
            int r2 = r2 + 1
            goto L70
        Lfb:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 1
            if (r1 != r3) goto L184
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r0._prefixTextfield
            java.lang.String r1 = r1.getText()
            java.lang.String r1 = r1.trim()
            int r3 = r1.length()
            java.lang.String r4 = ""
            if (r3 <= 0) goto L21
            r6 = r1
            goto L22
        L21:
            r6 = r4
        L22:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r1 = r1.getSelection()
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L30:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L17e
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = r0.getFileExtension(r3)
            java.lang.String r11 = r0.getFileNameNoExtension(r3)
            com.badlogic.gdx.Files r12 = com.badlogic.gdx.Gdx.files
            java.lang.String r13 = r0._unzippedFolderPath
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            com.badlogic.gdx.files.FileHandle r3 = r12.absolute(r3)
            java.lang.String r12 = "nodes"
            boolean r13 = r5.equalsIgnoreCase(r12)
            java.lang.String r14 = "mp3"
            java.lang.String r15 = "stknds"
            java.lang.String r2 = "nodemc"
            r16 = r1
            java.lang.String r1 = "stk"
            if (r13 != 0) goto L8f
            boolean r13 = r5.equalsIgnoreCase(r1)
            if (r13 == 0) goto L74
            goto L8f
        L74:
            boolean r13 = r5.equalsIgnoreCase(r2)
            if (r13 == 0) goto L7d
            int r8 = r8 + 1
            goto L91
        L7d:
            boolean r13 = r5.equalsIgnoreCase(r15)
            if (r13 == 0) goto L86
            int r9 = r9 + 1
            goto L91
        L86:
            boolean r13 = r5.equalsIgnoreCase(r14)
            if (r13 == 0) goto L91
            int r10 = r10 + 1
            goto L91
        L8f:
            int r7 = r7 + 1
        L91:
            r13 = 0
        L92:
            r17 = r4
            if (r13 <= 0) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r18 = r7
            java.lang.String r7 = " ("
            r4.append(r7)
            r4.append(r13)
            java.lang.String r7 = ")"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            goto Lb1
        Laf:
            r18 = r7
        Lb1:
            boolean r19 = r5.equalsIgnoreCase(r12)
            java.lang.String r7 = "."
            if (r19 != 0) goto L137
            boolean r19 = r5.equalsIgnoreCase(r1)
            if (r19 == 0) goto Lc1
            goto L137
        Lc1:
            boolean r19 = r5.equalsIgnoreCase(r2)
            if (r19 == 0) goto Le9
            r19 = r1
            java.lang.String r1 = org.fortheloss.sticknodes.App.movieclipsPath
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r11)
            r2.append(r4)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = r2.toString()
            goto L158
        Le9:
            r19 = r1
            r20 = r2
            boolean r1 = r5.equalsIgnoreCase(r15)
            if (r1 == 0) goto L111
            java.lang.String r1 = org.fortheloss.sticknodes.App.projectsPath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r11)
            r2.append(r4)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = r2.toString()
            goto L158
        L111:
            boolean r1 = r5.equalsIgnoreCase(r14)
            if (r1 == 0) goto L135
            java.lang.String r1 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r11)
            r2.append(r4)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = r2.toString()
            goto L158
        L135:
            r7 = 0
            goto L158
        L137:
            r19 = r1
            r20 = r2
            java.lang.String r1 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r11)
            r2.append(r4)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = r2.toString()
        L158:
            if (r7 != 0) goto L164
        L15a:
            r4 = r17
            r7 = r18
            r1 = r19
            r2 = r20
            goto L92
        L164:
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r7)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L17b
            r3.copyTo(r1)
            r1 = r16
            r4 = r17
            r7 = r18
            goto L30
        L17b:
            int r13 = r13 + 1
            goto L15a
        L17e:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r0._animationScreenRef
            r5.onZipImported(r6, r7, r8, r9, r10)
            goto L1a6
        L184:
            r2 = 2
            if (r1 != r2) goto L1a6
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r1 = r1.getSelection()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r0._fileList
            com.badlogic.gdx.utils.Array r2 = r2.getItems()
            r1.setAll(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r1 = r1.getSelection()
            int r1 = r1.size()
            r0.setNumSelections(r1)
            r21.doNotHideDialog()
        L1a6:
            com.badlogic.gdx.Input r1 = com.badlogic.gdx.Gdx.input
            r2 = 0
            r1.setOnscreenKeyboardVisible(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationBasedModuleRef = r0
            r1._instructionsLabel = r0
            r1._prefixTextfield = r0
            r1._unzippedFolderPath = r0
            r1._editButtonsScrollPane = r0
            r1._previewButtonsScrollPane = r0
            r1._scrollPane = r0
            r1._fileList = r0
            r1._editButtons = r0
            r1._previewButtons = r0
            r1._importButton = r0
            r1._importString = r0
            super.dispose()
            return
    }

    public void initialize() {
            r10 = this;
            java.lang.String r0 = "requestSaveZipTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "requestSaveZipInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r10._instructionsLabel = r0
            r1 = 1
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r10._instructionsLabel
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r10._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            r2 = 3
            r0.colspan(r2)
            r10.addContentRow()
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r0.<init>()
            java.lang.String r3 = ""
            r4 = 24
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10.createTextField(r3, r4, r0)
            r10._prefixTextfield = r0
            java.lang.String r3 = "optionalPrefix"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._prefixTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$1
            r3.<init>(r10)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._prefixTextfield
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
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r0.<init>(r2)
            org.fortheloss.framework.ListCustomItemHeight r2 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r4 = r0.getHeight()
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            float r6 = r0.getWidth()
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r7
            float r5 = r5 - r6
            r6 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r6
            r2.<init>(r3, r4, r5)
            r10._fileList = r2
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r2 = r2.getSelection()
            r2.setMultiple(r1)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r10._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r2 = r2.getSelection()
            r2.setToggle(r1)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r10._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r2 = r2.getSelection()
            r3 = 0
            r2.setRangeSelect(r3)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r10._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r2 = r2.getSelection()
            r2.setRequired(r3)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r10._fileList
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$2
            r4.<init>(r10)
            r2.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r2.<init>()
            r10._editButtons = r2
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r2.align(r4)
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r2.pad(r5)
            r2.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r2.<init>()
            r10._previewButtons = r2
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r2.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r2.pad(r5)
            r2.space(r5)
            r10.updateFiles()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r10._fileList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r2.<init>(r5, r6)
            r10._scrollPane = r2
            r2.setFadeScrollBars(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$3 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10._editButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r2.<init>(r10, r5, r6)
            r10._editButtonsScrollPane = r2
            r2.setFadeScrollBars(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._editButtonsScrollPane
            r2.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._editButtonsScrollPane
            r2.setSmoothScrolling(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$4 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ZIPDownloadConfirmDialog$4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10._previewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r2.<init>(r10, r5, r6)
            r10._previewButtonsScrollPane = r2
            r2.setFadeScrollBars(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._previewButtonsScrollPane
            r2.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._previewButtonsScrollPane
            r2.setSmoothScrolling(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._editButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r10.addContent(r2)
            float r5 = r0.getWidth()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1101004800(0x41a00000, float:20.0)
            float r6 = r6 * r8
            float r5 = r5 + r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.uniform(r3, r3)
            r5 = 16
            r2.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._previewButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r10.addContent(r2)
            float r6 = r0.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r6 = r6 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.uniform(r3, r3)
            r2.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r2 = r10._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r10.addContent(r2)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            float r0 = r0.getWidth()
            float r0 = r0 * r7
            float r5 = r5 - r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.width(r5)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r3, r3)
            r2 = 8
            r0.align(r2)
            java.lang.String r0 = "save"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r2 = "import"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = " /\n"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r10._importString = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " (0)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            r10._importButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.addButton(r0, r1)
            java.lang.String r0 = "selectAll"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r10.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r10.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r10.addButton(r0, r1)
            r10.setNumSelections(r3)
            return
    }

    public void onFilesModified() {
            r0 = this;
            r0.updateFiles()
            return
    }
}
