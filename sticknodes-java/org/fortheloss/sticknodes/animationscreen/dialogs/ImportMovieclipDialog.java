package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ImportMovieclipDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY = 0.0f;
    protected static float lastScrollY = 0.0f;
    protected static java.lang.String lastSelectedString = null;
    protected static int lastSortMethod = 0;
    public static java.lang.String onOpenScrollToName = null;
    public static int oneTimeSort = -1;
    public static java.lang.String oneTimeUsePrefix;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _buttonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _deleteDeviceButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filterAndSortTable;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _importButton;
    private java.lang.String _importString;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _movieclipList;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _sortSelectBox;






    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m490$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_movieclipList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m491$$Nest$fget_movieclipList(org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._movieclipList
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m492$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m493$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m494$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m495$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public ImportMovieclipDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "nodemc"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.setExtensions(r1)
            r0._animateToolsModuleRef = r2
            return
    }

    private void onFilterTyped() {
            r3 = this;
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r3._filterTextfield     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = r1.getText()     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L28
            if (r1 != 0) goto L25
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r3._filterTextfield     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = r1.getText()     // Catch: java.lang.Exception -> L28
            int r1 = r1.length()     // Catch: java.lang.Exception -> L28
            if (r1 > 0) goto L1c
            goto L25
        L1c:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r3._filterTextfield     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = r1.getText()     // Catch: java.lang.Exception -> L28
            r3._filterSubstring = r1     // Catch: java.lang.Exception -> L28
            goto L2a
        L25:
            r3._filterSubstring = r0     // Catch: java.lang.Exception -> L28
            goto L2a
        L28:
            r3._filterSubstring = r0
        L2a:
            r3.updateFiles()
            return
    }

    private void updateFiles() {
            r1 = this;
            r0 = 0
            r1.updateFiles(r0)
            return
    }

    private void updateFiles(boolean r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L14
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.movieclipsPath
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r1)
            com.badlogic.gdx.files.FileHandle[] r4 = r4.list()
            java.lang.String r1 = r3._filterSubstring
            r3.addToFiles(r4, r1, r0)
        L14:
            r3.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r3._movieclipList
            r3.setListItems(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r3._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r4 = r4.getChildren()
            int r1 = r4.size
            int r1 = r1 - r0
        L25:
            if (r1 < 0) goto L33
            java.lang.Object r0 = r4.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = (com.badlogic.gdx.scenes.scene2d.Actor) r0
            r0.clear()
            int r1 = r1 + (-1)
            goto L25
        L33:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r3._previewButtons
            r4.clearChildren()
            r4 = 0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r3._files
            int r0 = r0.size
        L3d:
            if (r4 >= r0) goto L69
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r1.<init>(r2)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r2 = r3._files
            java.lang.Object r2 = r2.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r2
            java.io.File r2 = r2.file
            java.lang.String r2 = r2.getAbsolutePath()
            r1.setUserObject(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$5 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$5
            r2.<init>(r3, r1)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r3._previewButtons
            r2.addActor(r1)
            int r4 = r4 + 1
            goto L3d
        L69:
            return
    }

    private void updateSortMethod(int r2) {
            r1 = this;
            int r0 = r1._sortMethod
            if (r0 != r2) goto L5
            return
        L5:
            r1._sortMethod = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.lastSortMethod = r2
            r2 = 1
            r1.updateFiles(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r7) {
            r6 = this;
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = 3
            if (r7 != r0) goto Ld
            r6.doNotHideDialog()
            return
        Ld:
            r0 = 1
            if (r7 != r0) goto L3d
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._movieclipList
            int r7 = r7.getSelectedIndex()
            if (r7 < 0) goto L84
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._movieclipList
            java.lang.Object r7 = r7.getSelected()
            java.lang.String r7 = (java.lang.String) r7
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r6._animateToolsModuleRef
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.movieclipsPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.badlogic.gdx.files.FileHandle r7 = r1.absolute(r7)
            r0.importMovieclipFile(r7)
            goto L84
        L3d:
            r0 = 2
            if (r7 != r0) goto L84
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._movieclipList
            int r7 = r7.getSelectedIndex()
            if (r7 < 0) goto L84
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._movieclipList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r7 = r7.getSelection()
            java.util.Iterator r0 = r7.iterator()
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r1 = 0
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.movieclipsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7[r1] = r2
            r1 = r3
            goto L59
        L7c:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.deleteMCFiles(r7, r6)
            r6.doNotHideDialog()
        L84:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r7 = r6.getDialogScrollPane()
            float r7 = r7.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.dialogLastScrollY = r7
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._animateToolsModuleRef = r0
            r4._filterTextfield = r0
            r4._filterSubstring = r0
            r4._sortSelectBox = r0
            r4._movieclipList = r0
            r4._buttonsScrollPane = r0
            r4._scrollPane = r0
            r4._previewButtons = r0
            r4._importButton = r0
            r4._importString = r0
            r4._deleteDeviceButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._filterAndSortTable
            if (r1 == 0) goto L39
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L23:
            if (r2 < 0) goto L37
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L34
            r3.clear()
        L34:
            int r2 = r2 + (-1)
            goto L23
        L37:
            r4._filterAndSortTable = r0
        L39:
            super.dispose()
            return
    }

    public void initialize() {
            r11 = this;
            java.lang.String r0 = "importMCTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L3f
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "importMCInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r4)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r11.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r1)
            r11.addContentRow()
        L3f:
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11.createTextField(r0)
            r11._filterTextfield = r0
            java.lang.String r3 = "filterList"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$1
            r3.<init>(r11)
            r0.setTextFieldListener(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = r11.createSelectBox()
            r11._sortSelectBox = r0
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = "alphabetical"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "newest"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3[r2] = r4
            java.lang.String r4 = "oldest"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3[r1] = r4
            r0.setItems(r3)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.lastSortMethod
            r11._sortMethod = r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r11._sortSelectBox
            r3.setSelectedIndex(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r11._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$2
            r3.<init>(r11)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r11._filterAndSortTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.align(r2)
            r3 = 0
            r0.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r11._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r3)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r6
            r0.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r11._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r11._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r7 = 1060320051(0x3f333333, float:0.7)
            float r4 = r4 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r0.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r11._filterAndSortTable
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r11._sortSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r7 = 1050253722(0x3e99999a, float:0.3)
            float r4 = r4 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r0.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r11._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r11.addContent(r0)
            r0.colspan(r1)
            r11.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r0.<init>(r4)
            org.fortheloss.framework.ListCustomItemHeight r4 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r8 = r0.getHeight()
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            float r10 = r0.getWidth()
            float r9 = r9 - r10
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            r4.<init>(r7, r8, r9)
            r11._movieclipList = r4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r4.<init>()
            r11._previewButtons = r4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r4.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r4.pad(r3)
            r4.space(r3)
            r11.updateFiles()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r11._movieclipList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r4.<init>(r7, r8)
            r11._scrollPane = r4
            r4.setFadeScrollBars(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$3 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r11._previewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r4.<init>(r11, r7, r8)
            r11._buttonsScrollPane = r4
            r4.setFadeScrollBars(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r11._buttonsScrollPane
            r4.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r11._buttonsScrollPane
            r4.setSmoothScrolling(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r11._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r4 = r4.getSessionData()
            boolean r4 = r4.getNerdModeEnabled()
            if (r4 == 0) goto L17b
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L17f
        L17b:
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L17f:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r7 = r11._buttonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r11.addContent(r7)
            float r8 = r0.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r6
            float r8 = r8 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r7.width(r8)
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r5, r5)
            r7 = 16
            r6.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r11._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r11.addContent(r6)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            float r0 = r0.getWidth()
            float r7 = r7 - r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r5, r5)
            r4 = 8
            r0.align(r4)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._movieclipList
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$4 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog$4
            r4.<init>(r11)
            r0.addListener(r4)
            java.lang.String r0 = "import"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r11._importString = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._importButton = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r11.addButton(r0, r4)
            java.lang.String r0 = "deleteDevice"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._deleteDeviceButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r11.addButton(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r11.getDialog()
            r0.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._movieclipList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r1 = r0.size
            r4 = -1
            r5 = 0
            if (r1 <= 0) goto L252
            java.lang.String r6 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.onOpenScrollToName
            if (r6 == 0) goto L21c
            goto L222
        L21c:
            java.lang.String r6 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.lastSelectedString
            if (r6 == 0) goto L221
            goto L222
        L221:
            r6 = r5
        L222:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.onOpenScrollToName = r5
            if (r6 == 0) goto L239
            int r1 = r1 - r2
        L227:
            if (r1 < 0) goto L239
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L236
            goto L23a
        L236:
            int r1 = r1 + (-1)
            goto L227
        L239:
            r1 = -1
        L23a:
            if (r1 < 0) goto L258
            int r0 = r0.size
            if (r1 >= r0) goto L258
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r11._scrollPane
            float r2 = r0.getMaxY()
            float r6 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.lastScrollY
            float r2 = r2 - r6
            r0.scrollTo(r3, r2, r3, r3)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._movieclipList
            r0.setSelectedIndex(r1)
            goto L258
        L252:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.lastSelectedString = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.lastScrollY = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.onOpenScrollToName = r5
        L258:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r11.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11.getDialogScrollPane()
            float r1 = r1.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.dialogLastScrollY
            float r1 = r1 - r2
            r0.scrollTo(r3, r1, r3, r3)
            java.lang.String r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeUsePrefix
            if (r0 != 0) goto L272
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeSort
            if (r1 < 0) goto L289
        L272:
            if (r0 == 0) goto L279
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r11._filterTextfield
            r1.setText(r0)
        L279:
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeSort
            if (r0 < 0) goto L282
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r11._sortSelectBox
            r1.setSelectedIndex(r0)
        L282:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeUsePrefix = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeSort = r4
            r11.onFilterTyped()
        L289:
            return
    }

    public void onFilesModified() {
            r0 = this;
            r0.updateFiles()
            return
    }
}
