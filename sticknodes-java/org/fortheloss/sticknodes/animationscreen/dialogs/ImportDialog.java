package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ImportDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY = 0.0f;
    protected static float lastScrollY = 0.0f;
    protected static java.lang.String lastSelectedString = null;
    protected static int lastSortMethod = 0;
    public static int oneTimeSort = -1;
    public static java.lang.String oneTimeUsePrefix;
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule _animationBasedModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _buttonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearSelectionButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _deleteDeviceButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filterAndSortTable;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private boolean _flagDeselectAllOnFirstClick;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _importButton;
    private java.lang.String _importString;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _sortSelectBox;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _stickfigureList;






    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m481$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m482$$Nest$fget_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0) {
            boolean r0 = r0._flagDeselectAllOnFirstClick
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m483$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m484$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m485$$Nest$fget_stickfigureList(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._stickfigureList
            return r0
    }

    /* renamed from: -$$Nest$fput_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m486$$Nest$fput_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0, boolean r1) {
            r0._flagDeselectAllOnFirstClick = r1
            return
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m487$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$msetNumSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m488$$Nest$msetNumSelections(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0, int r1) {
            r0.setNumSelections(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m489$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public ImportDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1._flagDeselectAllOnFirstClick = r2
            java.lang.String r2 = "nodes"
            java.lang.String r0 = "stk"
            java.lang.String[] r2 = new java.lang.String[]{r2, r0}
            r1.setExtensions(r2)
            r1._animationBasedModuleRef = r3
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

    private void setNumSelections(int r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L3f
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
            r2 = 1056964608(0x3f000000, float:0.5)
            r5.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._deleteDeviceButton
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._deleteDeviceButton
            r5.setColor(r0, r0, r0, r2)
            goto L7f
        L3f:
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
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._deleteDeviceButton
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._deleteDeviceButton
            r5.setColor(r0, r0, r0, r0)
        L7f:
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
            java.lang.String r1 = org.fortheloss.sticknodes.App.stickfiguresPath
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r1)
            com.badlogic.gdx.files.FileHandle[] r4 = r4.list()
            java.lang.String r1 = r3._filterSubstring
            r3.addToFiles(r4, r1, r0)
        L14:
            r3.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r3._stickfigureList
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
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$5 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$5
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
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastSortMethod = r2
            r2 = 1
            r1.updateFiles(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r12) {
            r11 = this;
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = 4
            r1 = 0
            r2 = 1
            if (r12 == r2) goto L63
            if (r12 != r0) goto Le
            goto L63
        Le:
            r0 = 2
            if (r12 != r0) goto L56
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r12 = r11._stickfigureList
            int r12 = r12.getSelectedIndex()
            if (r12 < 0) goto L1d5
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r12 = r11._stickfigureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r12 = r12.getSelection()
            java.util.Iterator r0 = r12.iterator()
            int r12 = r12.size()
            java.lang.String[] r12 = new java.lang.String[r12]
        L29:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r12[r1] = r2
            r1 = r3
            goto L29
        L4c:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            r0.deleteStickfigureFiles(r12, r11)
            r11.doNotHideDialog()
            goto L1d5
        L56:
            r0 = 3
            if (r12 != r0) goto L1d5
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r12 = r11._stickfigureList
            r0 = -1
            r12.setSelectedIndex(r0)
            r11.doNotHideDialog()
            return
        L63:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r11._stickfigureList
            int r3 = r3.getSelectedIndex()
            if (r3 < 0) goto L1d5
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r11._stickfigureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r3 = r3.getSelection()
            int r4 = r3.size()
            java.lang.String r5 = "s"
            if (r4 != r2) goto L11b
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r12 = r11._stickfigureList
            java.lang.Object r12 = r12.getSelected()
            java.lang.String r12 = (java.lang.String) r12
            int r0 = r12.length()
            int r0 = r0 - r2
            java.lang.String r0 = r12.substring(r0)
            boolean r0 = r0.equals(r5)
            java.lang.String r3 = "errorImportingTitle"
            if (r0 == 0) goto Le1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r12)
            java.lang.String r2 = r4.toString()
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r2)
            boolean r0 = r0.importStickfigure(r1)
            if (r0 != 0) goto L1d5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            com.badlogic.gdx.files.FileHandle r12 = r1.absolute(r12)
            boolean r12 = r0.importStickfigureOld(r12)
            if (r12 != 0) goto L1d5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r1 = "errorImportingInfo1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r12.showErrorDialog(r0, r1)
            goto L1d5
        Le1:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            java.lang.String r12 = r6.toString()
            com.badlogic.gdx.files.FileHandle r12 = r4.absolute(r12)
            boolean r12 = r0.importPivotStickfigure(r12)
            if (r12 != 0) goto L1d5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 400(0x190, float:5.6E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "errorImportingInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r2)
            r12.showErrorDialog(r0, r1)
            goto L1d5
        L11b:
            if (r12 == r0) goto L134
            com.badlogic.gdx.Application r12 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r12 = r12.getType()
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r12 != r0) goto L132
            com.badlogic.gdx.Input r12 = com.badlogic.gdx.Gdx.input
            r0 = 129(0x81, float:1.81E-43)
            boolean r12 = r12.isKeyPressed(r0)
            if (r12 == 0) goto L132
            goto L134
        L132:
            r12 = 0
            goto L135
        L134:
            r12 = 1
        L135:
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 5
            r0.<init>(r4)
            int r4 = r3.size()
            java.util.Iterator r3 = r3.iterator()
        L143:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1c3
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.length()
            int r7 = r7 - r2
            java.lang.String r7 = r6.substring(r7)
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L19d
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r11._animationScreenRef
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            java.lang.String r9 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r6)
            java.lang.String r9 = r10.toString()
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r9)
            boolean r7 = r7.importStickfigure(r8)
            if (r7 != 0) goto L19b
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r11._animationScreenRef
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            java.lang.String r9 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r6)
            java.lang.String r9 = r10.toString()
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r9)
            boolean r7 = r7.importStickfigureOld(r8)
            goto L1ba
        L19b:
            r7 = 1
            goto L1ba
        L19d:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r11._animationScreenRef
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            java.lang.String r9 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r6)
            java.lang.String r9 = r10.toString()
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r9)
            boolean r7 = r7.importPivotStickfigure(r8)
        L1ba:
            if (r7 != 0) goto L1c0
            r0.add(r6)
            goto L143
        L1c0:
            int r1 = r1 + 1
            goto L143
        L1c3:
            int r2 = r0.size()
            if (r2 <= 0) goto L1ce
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2 = r11._animationBasedModuleRef
            r2.showMultiStickfigureImportErrorDialog(r0, r4)
        L1ce:
            if (r12 == 0) goto L1d5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            r12.debugAddLastImportedStickfiguresToStage(r1)
        L1d5:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r12 = r11.getDialogScrollPane()
            float r12 = r12.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.dialogLastScrollY = r12
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._animationBasedModuleRef = r0
            r4._filterTextfield = r0
            r4._filterSubstring = r0
            r4._sortSelectBox = r0
            r4._stickfigureList = r0
            r4._buttonsScrollPane = r0
            r4._scrollPane = r0
            r4._previewButtons = r0
            r4._importButton = r0
            r4._importString = r0
            r4._clearSelectionButton = r0
            r4._deleteDeviceButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._filterAndSortTable
            if (r1 == 0) goto L3b
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L25:
            if (r2 < 0) goto L39
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L36
            r3.clear()
        L36:
            int r2 = r2 + (-1)
            goto L25
        L39:
            r4._filterAndSortTable = r0
        L3b:
            super.dispose()
            return
    }

    public void initialize() {
            r12 = this;
            java.lang.String r0 = "importTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L3f
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "importInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r4)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r1)
            r12.addContentRow()
        L3f:
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r12.createTextField(r0)
            r12._filterTextfield = r0
            java.lang.String r3 = "filterList"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r12._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$1
            r3.<init>(r12)
            r0.setTextFieldListener(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = r12.createSelectBox()
            r12._sortSelectBox = r0
            r3 = 3
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "alphabetical"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "newest"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r4[r2] = r5
            java.lang.String r5 = "oldest"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r4[r1] = r5
            r0.setItems(r4)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastSortMethod
            r12._sortMethod = r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r12._sortSelectBox
            r4.setSelectedIndex(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r12._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$2
            r4.<init>(r12)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r12._filterAndSortTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.align(r2)
            r4 = 0
            r0.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 * r7
            r0.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r12._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r8 = 1060320051(0x3f333333, float:0.7)
            float r5 = r5 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            r0.height(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r5 = r12._sortSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r8 = 1050253722(0x3e99999a, float:0.3)
            float r5 = r5 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            r0.height(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            r0.colspan(r1)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r0.<init>(r5)
            org.fortheloss.framework.ListCustomItemHeight r5 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r9 = r0.getHeight()
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            float r11 = r0.getWidth()
            float r10 = r10 - r11
            r11 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r11
            r5.<init>(r8, r9, r10)
            r12._stickfigureList = r5
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setMultiple(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r12._stickfigureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setToggle(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r12._stickfigureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setRangeSelect(r6)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r12._stickfigureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setRequired(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r5.<init>()
            r12._previewButtons = r5
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r5.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r5.pad(r4)
            r5.space(r4)
            r12.updateFiles()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r8 = r12._stickfigureList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r5.<init>(r8, r9)
            r12._scrollPane = r5
            r5.setFadeScrollBars(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$3 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r8 = r12._previewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r5.<init>(r12, r8, r9)
            r12._buttonsScrollPane = r5
            r5.setFadeScrollBars(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r12._buttonsScrollPane
            r5.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r12._buttonsScrollPane
            r5.setSmoothScrolling(r6)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r12._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r5 = r5.getSessionData()
            boolean r5 = r5.getNerdModeEnabled()
            if (r5 == 0) goto L19d
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L1a1
        L19d:
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L1a1:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r8 = r12._buttonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r12.addContent(r8)
            float r9 = r0.getWidth()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r7
            float r9 = r9 + r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r8.width(r9)
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.height(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.uniform(r6, r6)
            r8 = 16
            r7.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r7 = r12._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r12.addContent(r7)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            float r0 = r0.getWidth()
            float r8 = r8 - r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.width(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r6, r6)
            r5 = 8
            r0.align(r5)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._stickfigureList
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$4 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog$4
            r5.<init>(r12)
            r0.addListener(r5)
            java.lang.String r0 = "import"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r12._importString = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            r12._importButton = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r12.addButton(r0, r5)
            java.lang.String r0 = "clearSelection"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            r12._clearSelectionButton = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.addButton(r0, r3)
            java.lang.String r0 = "deleteDevice"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            r12._deleteDeviceButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r12.addButton(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r12.getDialog()
            r0.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._stickfigureList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r1 = r0.size
            r3 = 0
            r5 = -1
            if (r1 <= 0) goto L28c
            java.lang.String r7 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastSelectedString
            if (r7 == 0) goto L265
            int r1 = r1 - r2
        L251:
            if (r1 < 0) goto L265
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastSelectedString
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L262
            goto L266
        L262:
            int r1 = r1 + (-1)
            goto L251
        L265:
            r1 = -1
        L266:
            if (r1 < 0) goto L283
            int r0 = r0.size
            if (r1 >= r0) goto L283
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r12._scrollPane
            float r6 = r0.getMaxY()
            float r7 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastScrollY
            float r6 = r6 - r7
            r0.scrollTo(r4, r6, r4, r4)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._stickfigureList
            r0.setSelectedIndex(r1)
            r12.setNumSelections(r2)
            r12._flagDeselectAllOnFirstClick = r2
            goto L298
        L283:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._stickfigureList
            r0.setSelectedIndex(r5)
            r12.setNumSelections(r6)
            goto L298
        L28c:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastSelectedString = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.lastScrollY = r4
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._stickfigureList
            r0.setSelectedIndex(r5)
            r12.setNumSelections(r6)
        L298:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r12.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r12.getDialogScrollPane()
            float r1 = r1.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.dialogLastScrollY
            float r1 = r1 - r2
            r0.scrollTo(r4, r1, r4, r4)
            java.lang.String r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeUsePrefix
            if (r0 != 0) goto L2b2
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeSort
            if (r1 < 0) goto L2c9
        L2b2:
            if (r0 == 0) goto L2b9
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r12._filterTextfield
            r1.setText(r0)
        L2b9:
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeSort
            if (r0 < 0) goto L2c2
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r12._sortSelectBox
            r1.setSelectedIndex(r0)
        L2c2:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeUsePrefix = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeSort = r5
            r12.onFilterTyped()
        L2c9:
            return
    }

    public void onFilesModified() {
            r0 = this;
            r0.updateFiles()
            return
    }
}
