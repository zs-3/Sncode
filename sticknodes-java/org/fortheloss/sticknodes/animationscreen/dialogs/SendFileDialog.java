package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SendFileDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY;
    protected static float lastScrollY;
    protected static java.lang.String lastSelectedString;
    protected static int lastSortMethod;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _allFilesList;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _buttonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearSelectionButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filterAndSortTable;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private boolean _flagDeselectAllOnFirstClick;
    private float _previewButtonHeight;
    private float _previewButtonWidth;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _sendButton;
    private java.lang.String _sendString;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _sortSelectBox;








    /* renamed from: -$$Nest$fget_allFilesList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m613$$Nest$fget_allFilesList(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._allFilesList
            return r0
    }

    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m614$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m615$$Nest$fget_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0) {
            boolean r0 = r0._flagDeselectAllOnFirstClick
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m616$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m617$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fput_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m618$$Nest$fput_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0, boolean r1) {
            r0._flagDeselectAllOnFirstClick = r1
            return
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m619$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$msetNumSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m620$$Nest$msetNumSelections(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0, int r1) {
            r0.setNumSelections(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m621$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public SendFileDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r9, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r10) {
            r8 = this;
            r8.<init>(r9)
            r9 = 0
            r8._previewButtonWidth = r9
            r8._previewButtonHeight = r9
            r9 = 1
            r8._flagDeselectAllOnFirstClick = r9
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            r1 = 2
            r2 = 0
            r3 = 3
            java.lang.String r4 = "stk"
            java.lang.String r5 = "nodemc"
            java.lang.String r6 = "nodes"
            java.lang.String r7 = "stknds"
            if (r0 == 0) goto L38
            java.lang.String r0 = "mp3"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r5, r0, r4}
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = org.fortheloss.sticknodes.App.projectsPath
            r4[r2] = r5
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            r4[r9] = r2
            java.lang.String r9 = org.fortheloss.sticknodes.App.movieclipsPath
            r4[r1] = r9
            java.lang.String r9 = org.fortheloss.sticknodes.App.soundsPath
            r4[r3] = r9
            goto L4a
        L38:
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r5, r4}
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r3 = org.fortheloss.sticknodes.App.projectsPath
            r4[r2] = r3
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            r4[r9] = r2
            java.lang.String r9 = org.fortheloss.sticknodes.App.movieclipsPath
            r4[r1] = r9
        L4a:
            r8.setExtensions(r0)
            r8.setDirectories(r4)
            r8._animateToolsModuleRef = r10
            return
    }

    private java.lang.String getExtension(java.lang.String r2) {
            r1 = this;
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 <= 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            goto L11
        Lf:
            java.lang.String r2 = "nodes"
        L11:
            return r2
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
            r0 = 1
            r3.updateFiles(r0, r0)
            return
    }

    private void setNumSelections(int r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L35
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._sendButton
            java.lang.String r1 = r4._sendString
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " (0)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._sendButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._sendButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r5.setColor(r0, r0, r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setColor(r0, r0, r0, r2)
            goto L6b
        L35:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r4._sendButton
            java.lang.String r2 = r4._sendString
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
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._sendButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._sendButton
            r5.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._clearSelectionButton
            r5.setColor(r0, r0, r0, r0)
        L6b:
            return
    }

    private void updateFiles(boolean r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.updateFiles(r2, r3, r0)
            return
    }

    private void updateFiles(boolean r4, boolean r5, boolean r6) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L78
            if (r6 != 0) goto L78
            com.badlogic.gdx.Application r5 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r5 = r5.getType()
            com.badlogic.gdx.Application$ApplicationType r6 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r5 != r6) goto L22
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.projectsPath
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            com.badlogic.gdx.files.FileHandle[] r5 = r5.list()
            java.lang.String r6 = r3._filterSubstring
            r3.addToFiles(r5, r6, r1)
            goto L71
        L22:
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.projectsPath
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            com.badlogic.gdx.files.FileHandle[] r5 = r5.list()
            java.lang.String r6 = r3._filterSubstring
            r3.addToFiles(r5, r6, r1)
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.stickfiguresPath
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            com.badlogic.gdx.files.FileHandle[] r5 = r5.list()
            java.lang.String r6 = r3._filterSubstring
            r3.addToFiles(r5, r6, r0)
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.movieclipsPath
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            com.badlogic.gdx.files.FileHandle[] r5 = r5.list()
            java.lang.String r6 = r3._filterSubstring
            r3.addToFiles(r5, r6, r0)
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            boolean r5 = r5.isPro()
            if (r5 == 0) goto L71
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.soundsPath
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            com.badlogic.gdx.files.FileHandle[] r5 = r5.list()
            java.lang.String r6 = r3._filterSubstring
            r2 = 256000(0x3e800, float:3.58732E-40)
            r3.addToFiles(r5, r6, r2, r0)
        L71:
            if (r4 == 0) goto L78
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r3._allFilesList
            r3.addCurrentSelectionToFiles(r4)
        L78:
            r3.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r3._allFilesList
            r3.setListItems(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r3._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r4 = r4.getChildren()
            int r5 = r4.size
            int r5 = r5 - r1
        L89:
            if (r5 < 0) goto L97
            java.lang.Object r6 = r4.get(r5)
            com.badlogic.gdx.scenes.scene2d.Actor r6 = (com.badlogic.gdx.scenes.scene2d.Actor) r6
            r6.clear()
            int r5 = r5 + (-1)
            goto L89
        L97:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r3._previewButtons
            r4.clearChildren()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r4 = r3._files
            int r4 = r4.size
        La0:
            if (r0 >= r4) goto L156
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r5 = r3._files
            java.lang.Object r5 = r5.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r5
            java.lang.String r5 = r5.name
            java.lang.String r5 = r3.getExtension(r5)
            if (r5 == 0) goto L144
            java.lang.String r6 = "stknds"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto Lbc
            goto L144
        Lbc:
            java.lang.String r6 = "mp3"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallSpeakerImageButtonStyle()
            r5.<init>(r6)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r6 = r3._files
            java.lang.Object r6 = r6.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r6 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r6
            java.io.File r6 = r6.file
            java.lang.String r6 = r6.getAbsolutePath()
            r5.setUserObject(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$5 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$5
            r6.<init>(r3, r5)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r3._previewButtons
            r6.addActor(r5)
            goto L152
        Lec:
            java.lang.String r6 = "nodemc"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L11c
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r5.<init>(r6)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r6 = r3._files
            java.lang.Object r6 = r6.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r6 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r6
            java.io.File r6 = r6.file
            java.lang.String r6 = r6.getAbsolutePath()
            r5.setUserObject(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$6 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$6
            r6.<init>(r3, r5)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r3._previewButtons
            r6.addActor(r5)
            goto L152
        L11c:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r5.<init>(r6)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r6 = r3._files
            java.lang.Object r6 = r6.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r6 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r6
            java.io.File r6 = r6.file
            java.lang.String r6 = r6.getAbsolutePath()
            r5.setUserObject(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$7 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$7
            r6.<init>(r3, r5)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r3._previewButtons
            r6.addActor(r5)
            goto L152
        L144:
            org.fortheloss.framework.SizeWidget r5 = new org.fortheloss.framework.SizeWidget
            float r6 = r3._previewButtonWidth
            float r1 = r3._previewButtonHeight
            r5.<init>(r6, r1)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r3._previewButtons
            r6.addActor(r5)
        L152:
            int r0 = r0 + 1
            goto La0
        L156:
            return
    }

    private void updateSortMethod(int r2) {
            r1 = this;
            int r0 = r1._sortMethod
            if (r0 != r2) goto L5
            return
        L5:
            r1._sortMethod = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastSortMethod = r2
            r2 = 1
            r0 = 0
            r1.updateFiles(r0, r0, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r7) {
            r6 = this;
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = 1
            if (r7 != r0) goto Lca
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._allFilesList
            int r7 = r7.getSelectedIndex()
            if (r7 < 0) goto Ld7
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._allFilesList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r7 = r7.getSelection()
            java.util.Iterator r0 = r7.iterator()
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r1 = 0
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r6.getExtension(r2)
            if (r3 == 0) goto L8f
            java.lang.String r4 = "stknds"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3d
            goto L8f
        L3d:
            java.lang.String r4 = "mp3"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L5b
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7[r1] = r2
            goto La4
        L5b:
            java.lang.String r4 = "nodemc"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L79
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.movieclipsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7[r1] = r2
            goto La4
        L79:
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7[r1] = r2
            goto La4
        L8f:
            int r3 = r1 + 1
            java.lang.String r4 = org.fortheloss.sticknodes.App.projectsPath
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7[r1] = r2
        La4:
            r1 = r3
            goto L22
        La7:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "about_to_send_files"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r7 = r0.sendFiles(r7)
            if (r7 != 0) goto Ld7
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6._animationScreenRef
            java.lang.String r0 = "errorSendingTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "errorSendingInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r7.showErrorDialog(r0, r1)
            goto Ld7
        Lca:
            r0 = 2
            if (r7 != r0) goto Ld7
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r6._allFilesList
            r0 = -1
            r7.setSelectedIndex(r0)
            r6.doNotHideDialog()
            return
        Ld7:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r7 = r6.getDialogScrollPane()
            float r7 = r7.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.dialogLastScrollY = r7
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
            r4._allFilesList = r0
            r4._buttonsScrollPane = r0
            r4._scrollPane = r0
            r4._sendButton = r0
            r4._sendString = r0
            r4._clearSelectionButton = r0
            r4._previewButtons = r0
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
            java.lang.String r0 = "sendFiles"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r11._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L43
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "sendFilesInfo"
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
        L43:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "selectMultiple"
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
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "automaticZipNote"
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
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r11.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r1)
            r11.addContentRow()
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11.createTextField(r0)
            r11._filterTextfield = r0
            java.lang.String r3 = "filterList"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$1
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
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastSortMethod
            r11._sortMethod = r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r11._sortSelectBox
            r3.setSelectedIndex(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r11._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$2
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
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallSpeakerImageButtonStyle()
            r0.<init>(r4)
            float r4 = r0.getWidth()
            r11._previewButtonWidth = r4
            float r4 = r0.getHeight()
            r11._previewButtonHeight = r4
            org.fortheloss.framework.ListCustomItemHeight r4 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r8 = r11._previewButtonHeight
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            float r10 = r11._previewButtonWidth
            float r9 = r9 - r10
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            r4.<init>(r7, r8, r9)
            r11._allFilesList = r4
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setMultiple(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r11._allFilesList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setToggle(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r11._allFilesList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setRangeSelect(r5)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r11._allFilesList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setRequired(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r4.<init>()
            r11._previewButtons = r4
            r7 = 10
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r4.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r4.pad(r3)
            r4.space(r3)
            r11.updateFiles(r5, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r7 = r11._allFilesList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r4.<init>(r7, r8)
            r11._scrollPane = r4
            r4.setFadeScrollBars(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$3 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$3
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
            if (r4 == 0) goto L20f
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L213
        L20f:
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L213:
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r7 = r11._buttonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r11.addContent(r7)
            float r8 = r0.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r6
            float r8 = r8 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r7.width(r8)
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
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._allFilesList
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$4 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog$4
            r4.<init>(r11)
            r0.addListener(r4)
            java.lang.String r0 = "sendButton"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r11._sendString = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._sendButton = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r11.addButton(r0, r4)
            java.lang.String r0 = "clearSelection"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._clearSelectionButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r11.addButton(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r11.getDialog()
            r0.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._allFilesList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r1 = r0.size
            r4 = -1
            if (r1 <= 0) goto L2ea
            java.lang.String r6 = org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastSelectedString
            if (r6 == 0) goto L2c3
            int r1 = r1 - r2
        L2af:
            if (r1 < 0) goto L2c3
            java.lang.Object r6 = r0.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastSelectedString
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L2c0
            goto L2c4
        L2c0:
            int r1 = r1 + (-1)
            goto L2af
        L2c3:
            r1 = -1
        L2c4:
            if (r1 < 0) goto L2e1
            int r0 = r0.size
            if (r1 >= r0) goto L2e1
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r11._scrollPane
            float r4 = r0.getMaxY()
            float r5 = org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastScrollY
            float r4 = r4 - r5
            r0.scrollTo(r3, r4, r3, r3)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._allFilesList
            r0.setSelectedIndex(r1)
            r11.setNumSelections(r2)
            r11._flagDeselectAllOnFirstClick = r2
            goto L2f7
        L2e1:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._allFilesList
            r0.setSelectedIndex(r4)
            r11.setNumSelections(r5)
            goto L2f7
        L2ea:
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastSelectedString = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.lastScrollY = r3
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r11._allFilesList
            r0.setSelectedIndex(r4)
            r11.setNumSelections(r5)
        L2f7:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r11.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11.getDialogScrollPane()
            float r1 = r1.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog.dialogLastScrollY
            float r1 = r1 - r2
            r0.scrollTo(r3, r1, r3, r3)
            return
    }
}
