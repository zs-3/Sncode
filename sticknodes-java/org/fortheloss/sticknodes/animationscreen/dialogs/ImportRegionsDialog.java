package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ImportRegionsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY = 0.0f;
    protected static float lastScrollY = 0.0f;
    protected static java.lang.String lastSelectedString = null;
    protected static int lastSortMethod = 0;
    public static java.lang.String onOpenScrollToName = null;
    public static int oneTimeSort = -1;
    public static java.lang.String oneTimeUsePrefix;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _deleteDeviceButton;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _fileList;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filterAndSortTable;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _importButton;
    private java.lang.String _importString;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _sortSelectBox;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog mManageRegionsDialogRef;




    /* renamed from: -$$Nest$fget_fileList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m496$$Nest$fget_fileList(org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._fileList
            return r0
    }

    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m497$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m498$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m499$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m500$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m501$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public ImportRegionsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "txt"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.setExtensions(r1)
            return
    }

    private void checkToDisableButtons() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._importButton
            if (r0 == 0) goto L44
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteDeviceButton
            if (r0 != 0) goto L9
            goto L44
        L9:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r4._fileList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r0 = r0.size
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L2c
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._importButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._importButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteDeviceButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteDeviceButton
            r0.setTouchable(r2)
            goto L44
        L2c:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._importButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._importButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteDeviceButton
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._deleteDeviceButton
            r0.setTouchable(r3)
        L44:
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

    private void updateFiles(boolean r3) {
            r2 = this;
            if (r3 != 0) goto L14
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r0 = org.fortheloss.sticknodes.App.spritesPath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r0)
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            java.lang.String r0 = r2._filterSubstring
            r1 = 1
            r2.addToFiles(r3, r0, r1)
        L14:
            r2.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r2._fileList
            r2.setListItems(r3)
            r2.checkToDisableButtons()
            return
    }

    private void updateSortMethod(int r2) {
            r1 = this;
            int r0 = r1._sortMethod
            if (r0 != r2) goto L5
            return
        L5:
            r1._sortMethod = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.lastSortMethod = r2
            r2 = 1
            r1.updateFiles(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r7) {
            r6 = this;
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = 0
            if (r7 != 0) goto L3a
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._fileList
            int r7 = r7.getSelectedIndex()
            if (r7 < 0) goto L80
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._fileList
            java.lang.Object r7 = r7.getSelected()
            java.lang.String r7 = (java.lang.String) r7
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.spritesPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.badlogic.gdx.files.FileHandle r7 = r1.absolute(r7)
            java.lang.String r7 = r7.readString()
            org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog r1 = r6.mManageRegionsDialogRef
            r1.setRegionsText(r7, r0)
            goto L80
        L3a:
            r1 = 1
            if (r7 != r1) goto L80
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._fileList
            int r7 = r7.getSelectedIndex()
            if (r7 < 0) goto L80
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._fileList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r7 = r7.getSelection()
            java.util.Iterator r1 = r7.iterator()
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
        L55:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.spritesPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7[r0] = r2
            r0 = r3
            goto L55
        L78:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.deleteRegionFiles(r7, r6)
            r6.doNotHideDialog()
        L80:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4.mManageRegionsDialogRef = r0
            r4._filterTextfield = r0
            r4._filterSubstring = r0
            r4._sortSelectBox = r0
            r4._fileList = r0
            r4._scrollPane = r0
            r4._importButton = r0
            r4._importString = r0
            r4._deleteDeviceButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._filterAndSortTable
            if (r1 == 0) goto L35
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L1f:
            if (r2 < 0) goto L33
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L30
            r3.clear()
        L30:
            int r2 = r2 + (-1)
            goto L1f
        L33:
            r4._filterAndSortTable = r0
        L35:
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog r8) {
            r7 = this;
            java.lang.String r0 = "importRegionsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r7.mManageRegionsDialogRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "importRegionsInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r0, r1)
            r0 = 1
            r8.setWrap(r0)
            r8.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r1)
            r1 = 2
            r8.colspan(r1)
            r7.addContentRow()
            java.lang.String r8 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7.createTextField(r8)
            r7._filterTextfield = r8
            java.lang.String r2 = "filterList"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r8.setMessageText(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog$1
            r2.<init>(r7)
            r8.setTextFieldListener(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight r8 = r7.createSelectBox()
            r7._sortSelectBox = r8
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "alphabetical"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "newest"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2[r0] = r3
            java.lang.String r3 = "oldest"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2[r1] = r3
            r8.setItems(r2)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.lastSortMethod
            r7._sortMethod = r8
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r2 = r7._sortSelectBox
            r2.setSelectedIndex(r8)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r8 = r7._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog$2 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog$2
            r2.<init>(r7)
            r8.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r8.<init>()
            r7._filterAndSortTable = r8
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r8.align(r0)
            r2 = 0
            r8.pad(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r7._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r5
            r8.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r7._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r7._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r5 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r3 = (float) r3
            r8.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r7._filterAndSortTable
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r7._sortSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r5 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r3 = (float) r3
            r8.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r7._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            r8.colspan(r1)
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r8.<init>(r3)
            org.fortheloss.framework.ListCustomItemHeight r3 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r8 = r8.getHeight()
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r3.<init>(r5, r8, r6)
            r7._fileList = r3
            r7.updateFiles()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r8 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r7._fileList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r8.<init>(r3, r5)
            r7._scrollPane = r8
            r8.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r8 = r7._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.uniform(r4, r4)
            r8.align(r0)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r8 = r7._fileList
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog$3 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog$3
            r3.<init>(r7)
            r8.addListener(r3)
            java.lang.String r8 = "import"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r7._importString = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            r7._importButton = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r7.addButton(r8, r3)
            java.lang.String r8 = "deleteDevice"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            r7._deleteDeviceButton = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r7.addButton(r8, r3)
            java.lang.String r8 = "cancel"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.addButton(r8, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r8 = r7.getDialog()
            r8.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r8 = r7._fileList
            com.badlogic.gdx.utils.Array r8 = r8.getItems()
            int r1 = r8.size
            r3 = -1
            r4 = 0
            if (r1 <= 0) goto L1da
            java.lang.String r5 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.onOpenScrollToName
            if (r5 == 0) goto L1a4
            goto L1aa
        L1a4:
            java.lang.String r5 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.lastSelectedString
            if (r5 == 0) goto L1a9
            goto L1aa
        L1a9:
            r5 = r4
        L1aa:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.onOpenScrollToName = r4
            if (r5 == 0) goto L1c1
            int r1 = r1 - r0
        L1af:
            if (r1 < 0) goto L1c1
            java.lang.Object r0 = r8.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L1be
            goto L1c2
        L1be:
            int r1 = r1 + (-1)
            goto L1af
        L1c1:
            r1 = -1
        L1c2:
            if (r1 < 0) goto L1e0
            int r8 = r8.size
            if (r1 >= r8) goto L1e0
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r8 = r7._scrollPane
            float r0 = r8.getMaxY()
            float r5 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.lastScrollY
            float r0 = r0 - r5
            r8.scrollTo(r2, r0, r2, r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r8 = r7._fileList
            r8.setSelectedIndex(r1)
            goto L1e0
        L1da:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.lastSelectedString = r4
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.lastScrollY = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.onOpenScrollToName = r4
        L1e0:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r8 = r7.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r7.getDialogScrollPane()
            float r0 = r0.getMaxY()
            float r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.dialogLastScrollY
            float r0 = r0 - r1
            r8.scrollTo(r2, r0, r2, r2)
            java.lang.String r8 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.oneTimeUsePrefix
            if (r8 != 0) goto L1fa
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.oneTimeSort
            if (r0 < 0) goto L211
        L1fa:
            if (r8 == 0) goto L201
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7._filterTextfield
            r0.setText(r8)
        L201:
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.oneTimeSort
            if (r8 < 0) goto L20a
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r7._sortSelectBox
            r0.setSelectedIndex(r8)
        L20a:
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.oneTimeUsePrefix = r4
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog.oneTimeSort = r3
            r7.onFilterTyped()
        L211:
            r7.checkToDisableButtons()
            return
    }

    public void onFilesModified() {
            r0 = this;
            r0.updateFiles()
            return
    }
}
