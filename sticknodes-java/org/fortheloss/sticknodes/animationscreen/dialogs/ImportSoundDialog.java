package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ImportSoundDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY;
    protected static float lastScrollY;
    protected static java.lang.String lastSelectedString;
    protected static int lastSortMethod;
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
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _soundList;
    private com.badlogic.gdx.graphics.Texture mTexture1;






    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m502$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m503$$Nest$fget_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0) {
            boolean r0 = r0._flagDeselectAllOnFirstClick
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m504$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m505$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fget_soundList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m506$$Nest$fget_soundList(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._soundList
            return r0
    }

    /* renamed from: -$$Nest$fput_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m507$$Nest$fput_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0, boolean r1) {
            r0._flagDeselectAllOnFirstClick = r1
            return
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m508$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$msetNumSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m509$$Nest$msetNumSelections(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0, int r1) {
            r0.setNumSelections(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m510$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public ImportSoundDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0._flagDeselectAllOnFirstClick = r1
            java.lang.String r1 = "mp3"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.setExtensions(r1)
            r0._animationBasedModuleRef = r2
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
            if (r4 != 0) goto L17
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.soundsPath
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r1)
            com.badlogic.gdx.files.FileHandle[] r4 = r4.list()
            java.lang.String r1 = r3._filterSubstring
            r2 = 256000(0x3e800, float:3.58732E-40)
            r3.addToFiles(r4, r1, r2, r0)
        L17:
            r3.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r3._soundList
            r3.setListItems(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r3._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r4 = r4.getChildren()
            int r1 = r4.size
            int r1 = r1 - r0
        L28:
            if (r1 < 0) goto L36
            java.lang.Object r0 = r4.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = (com.badlogic.gdx.scenes.scene2d.Actor) r0
            r0.clear()
            int r1 = r1 + (-1)
            goto L28
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r3._previewButtons
            r4.clearChildren()
            r4 = 0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r3._files
            int r0 = r0.size
        L40:
            if (r4 >= r0) goto L6c
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallSpeakerImageButtonStyle()
            r1.<init>(r2)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r2 = r3._files
            java.lang.Object r2 = r2.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r2
            java.io.File r2 = r2.file
            java.lang.String r2 = r2.getAbsolutePath()
            r1.setUserObject(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$5 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$5
            r2.<init>(r3, r1)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r3._previewButtons
            r2.addActor(r1)
            int r4 = r4 + 1
            goto L40
        L6c:
            return
    }

    private void updateSortMethod(int r2) {
            r1 = this;
            int r0 = r1._sortMethod
            if (r0 != r2) goto L5
            return
        L5:
            r1._sortMethod = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastSortMethod = r2
            r2 = 1
            r1.updateFiles(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r10) {
            r9 = this;
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = 3
            r1 = 2
            r2 = 1
            if (r10 != r2) goto Lcc
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r10 = r9._soundList
            int r10 = r10.getSelectedIndex()
            if (r10 < 0) goto L11f
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r10 = r9._soundList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r10 = r10.getSelection()
            int r3 = r10.size()
            if (r3 != r2) goto L7f
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r10 = r9._soundList
            java.lang.Object r10 = r10.getSelected()
            java.lang.String r10 = (java.lang.String) r10
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r9._animationScreenRef
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            com.badlogic.gdx.files.FileHandle r10 = r3.absolute(r10)
            int r10 = r2.importSound(r10)
            java.lang.String r2 = "errorImportingSoundTitle"
            if (r10 != 0) goto L59
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r1 = "errorImportSoundInfo1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
            goto L11f
        L59:
            if (r10 != r1) goto L6c
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r1 = "errorImportSoundInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
            goto L11f
        L6c:
            if (r10 != r0) goto L11f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r1 = "errorImportSoundInfo3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r10.showErrorDialog(r0, r1)
            goto L11f
        L7f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 5
            r2.<init>(r3)
            int r3 = r10.size()
            java.util.Iterator r10 = r10.iterator()
        L8d:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r10.next()
            java.lang.String r4 = (java.lang.String) r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r9._animationScreenRef
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files
            java.lang.String r7 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r4)
            java.lang.String r7 = r8.toString()
            com.badlogic.gdx.files.FileHandle r6 = r6.absolute(r7)
            int r5 = r5.importSound(r6)
            if (r5 == 0) goto Lbc
            if (r5 == r1) goto Lbc
            if (r5 != r0) goto L8d
        Lbc:
            r2.add(r4)
            goto L8d
        Lc0:
            int r10 = r2.size()
            if (r10 <= 0) goto L11f
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r10 = r9._animationBasedModuleRef
            r10.showMultiSoundImportErrorDialog(r2, r3)
            goto L11f
        Lcc:
            if (r10 != r1) goto L113
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r10 = r9._soundList
            int r10 = r10.getSelectedIndex()
            if (r10 < 0) goto L11f
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r10 = r9._soundList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r10 = r10.getSelection()
            java.util.Iterator r0 = r10.iterator()
            int r10 = r10.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            r1 = 0
        Le7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r10[r1] = r2
            r1 = r3
            goto Le7
        L10a:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            r0.deleteSoundFiles(r10, r9)
            r9.doNotHideDialog()
            goto L11f
        L113:
            if (r10 != r0) goto L11f
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r10 = r9._soundList
            r0 = -1
            r10.setSelectedIndex(r0)
            r9.doNotHideDialog()
            return
        L11f:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9.getDialogScrollPane()
            float r10 = r10.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.dialogLastScrollY = r10
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
            r4._soundList = r0
            r4._buttonsScrollPane = r0
            r4._scrollPane = r0
            r4._previewButtons = r0
            r4._importButton = r0
            r4._importString = r0
            r4._clearSelectionButton = r0
            r4._deleteDeviceButton = r0
            com.badlogic.gdx.graphics.Texture r1 = r4.mTexture1
            if (r1 == 0) goto L22
            r1.dispose()
            r4.mTexture1 = r0
        L22:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._filterAndSortTable
            if (r1 == 0) goto L44
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L2e:
            if (r2 < 0) goto L42
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L3f
            r3.clear()
        L3f:
            int r2 = r2 + (-1)
            goto L2e
        L42:
            r4._filterAndSortTable = r0
        L44:
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.framework.Assets r13) {
            r12 = this;
            java.lang.String r0 = "importSoundTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto Lc7
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "importSoundInfo1"
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
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "importSoundInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r0.<init>(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            r3.set(r4)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r1)
            r12.addContentRow()
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 != r3) goto L9a
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "importSoundInfo3ios"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r0.<init>(r3, r4)
            goto Lae
        L9a:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "importSoundInfo3"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r0.<init>(r3, r4)
        Lae:
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r1)
            r12.addContentRow()
        Lc7:
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r12.createTextField(r0)
            r12._filterTextfield = r0
            java.lang.String r3 = "filterList"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r12._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$1
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
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastSortMethod
            r12._sortMethod = r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r12._sortSelectBox
            r4.setSelectedIndex(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r12._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$2
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
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallSpeakerImageButtonStyle()
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
            r12._soundList = r5
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setMultiple(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r12._soundList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setToggle(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r12._soundList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setRangeSelect(r6)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5 = r12._soundList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r5 = r5.getSelection()
            r5.setRequired(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r5.<init>()
            r12._previewButtons = r5
            r8 = 10
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r5.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r5.pad(r4)
            r5.space(r4)
            r12.updateFiles()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r8 = r12._soundList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r5.<init>(r8, r9)
            r12._scrollPane = r5
            r5.setFadeScrollBars(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$3 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$3
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
            if (r5 == 0) goto L227
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L22b
        L227:
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L22b:
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
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._soundList
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$4 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog$4
            r5.<init>(r12)
            r0.addListener(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L2f6
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r5 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 != r5) goto L2f6
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "importSoundInstructionsTitleIOS"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0.<init>(r5, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r0.colspan(r1)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "importSoundInstructionsIOS"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r5, r7)
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r5)
            r0.colspan(r1)
            r12.addContentRow()
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r5 = org.fortheloss.sticknodes.App.iosSoundInstructionsTexture
            com.badlogic.gdx.files.FileHandle r13 = r13.getPathFromResolutionFolder(r5)
            r0.<init>(r13)
            r12.mTexture1 = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r13.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.addContent(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.align(r2)
            r13.colspan(r1)
        L2f6:
            java.lang.String r13 = "import"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r12._importString = r13
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r12.createTextButton(r13)
            r12._importButton = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r12.addButton(r13, r0)
            java.lang.String r13 = "clearSelection"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r12.createTextButton(r13)
            r12._clearSelectionButton = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r12.addButton(r13, r0)
            java.lang.String r13 = "deleteDevice"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r12.createTextButton(r13)
            r12._deleteDeviceButton = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r12.addButton(r13, r0)
            java.lang.String r13 = "cancel"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = r12.createTextButton(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12.addButton(r13, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r13 = r12.getDialog()
            r13.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r13 = r12._soundList
            com.badlogic.gdx.utils.Array r13 = r13.getItems()
            int r0 = r13.size
            r1 = -1
            if (r0 <= 0) goto L394
            java.lang.String r3 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastSelectedString
            if (r3 == 0) goto L36d
            int r0 = r0 - r2
        L359:
            if (r0 < 0) goto L36d
            java.lang.Object r3 = r13.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastSelectedString
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L36a
            goto L36e
        L36a:
            int r0 = r0 + (-1)
            goto L359
        L36d:
            r0 = -1
        L36e:
            if (r0 < 0) goto L38b
            int r13 = r13.size
            if (r0 >= r13) goto L38b
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r13 = r12._scrollPane
            float r1 = r13.getMaxY()
            float r3 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastScrollY
            float r1 = r1 - r3
            r13.scrollTo(r4, r1, r4, r4)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r13 = r12._soundList
            r13.setSelectedIndex(r0)
            r12.setNumSelections(r2)
            r12._flagDeselectAllOnFirstClick = r2
            goto L3a1
        L38b:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r13 = r12._soundList
            r13.setSelectedIndex(r1)
            r12.setNumSelections(r6)
            goto L3a1
        L394:
            r13 = 0
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastSelectedString = r13
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.lastScrollY = r4
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r13 = r12._soundList
            r13.setSelectedIndex(r1)
            r12.setNumSelections(r6)
        L3a1:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r13 = r12.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r12.getDialogScrollPane()
            float r0 = r0.getMaxY()
            float r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog.dialogLastScrollY
            float r0 = r0 - r1
            r13.scrollTo(r4, r0, r4, r4)
            return
    }

    public void onFilesModified() {
            r0 = this;
            r0.updateFiles()
            return
    }
}
